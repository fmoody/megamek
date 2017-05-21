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
package megamek.common.weapons.srms;

import megamek.common.weapons.SRMWeapon;

/**
 * @author Sebastian Brocks
 */
public class ISSRM2 extends SRMWeapon {

    /**
     *
     */
    private static final long serialVersionUID = -8486208221700793591L;

    /**
     *
     */
    public ISSRM2() {
        super();
        name = "SRM 2";
        setInternalName(name);
        addLookupName("IS SRM-2");
        addLookupName("ISSRM2");
        addLookupName("IS SRM 2");
        heat = 2;
        rackSize = 2;
        shortRange = 3;
        mediumRange = 6;
        longRange = 9;
        extremeRange = 12;
        tonnage = 1.0f;
        criticals = 1;
        bv = 21;
        flags = flags.or(F_NO_FIRES);
        cost = 10000;
        shortAV = 2;
        maxRange = RANGE_SHORT;
        rulesRefs = "229,TM";
        techAdvancement.setTechBase(TECH_BASE_ALL)
        	.setIntroLevel(true)
        	.setUnofficial(false)
            .setTechRating(RATING_C)
            .setAvailability(RATING_C, RATING_C, RATING_C, RATING_C)
            .setISAdvancement(2365, 2370, 2400, DATE_NONE, DATE_NONE)
            .setISApproximate(false, false, false,false, false)
            .setClanAdvancement(2365, 2370, 2400, 2836, DATE_NONE)
            .setClanApproximate(false, false, false, false, false)
            .setPrototypeFactions(F_TH)
            .setProductionFactions(F_TH);
    }
}
