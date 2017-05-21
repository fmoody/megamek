/**
 * MegaMek - Copyright (C) 2005 Ben Mazur (bmazur@sev.org)
 *
 *  This program is free software; you can redistribute it and/or modify it
 *  under the terms of the GNU General Public License as published by the Free
 *  Software Foundation; either version 2 of the License, or (at your option)
 *  any later version.
 *
 *  This program is distributed in the hope that it will be useful, but
 *  WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 *  or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License
 *  for more details.
 */
package megamek.common.weapons;

/**
 * @author Sebastian Brocks
 */
public class CLSRT4 extends SRTWeapon {

    /**
     *
     */
    private static final long serialVersionUID = 7390930190902369569L;

    /**
     *
     */
    public CLSRT4() {
        super();
        name = "SRT 4";
        setInternalName("CLSRT4");
        addLookupName("Clan SRT-4");
        addLookupName("Clan SRT 4");
        addLookupName("CLSRT4");
        heat = 3;
        rackSize = 4;
        waterShortRange = 3;
        waterMediumRange = 6;
        waterLongRange = 9;
        waterExtremeRange = 12;
        tonnage = 1.0f;
        criticals = 1;
        bv = 39;
        flags = flags.or(F_NO_FIRES);
        cost = 60000;
        rulesRefs = "230,TM";
        techAdvancement.setTechBase(TECH_BASE_CLAN)
        	.setIntroLevel(false)
        	.setUnofficial(false)
            .setTechRating(RATING_C)
            .setAvailability(RATING_X, RATING_C, RATING_C, RATING_C)
            .setClanAdvancement(2820, 2824, 2825, DATE_NONE, DATE_NONE)
            .setClanApproximate(true, false, false,false, false)
            .setPrototypeFactions(F_CSF)
            .setProductionFactions(F_CSF);
    }
}
