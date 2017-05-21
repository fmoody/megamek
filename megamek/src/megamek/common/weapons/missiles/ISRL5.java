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
package megamek.common.weapons.missiles;

import megamek.common.weapons.RLWeapon;

/**
 * @author Sebastian Brocks
 */
public class ISRL5 extends RLWeapon {

    /**
     *
     */
    private static final long serialVersionUID = -6957164916144671184L;

    /**
     *
     */
    public ISRL5() {
        super();
        name = "Rocket Launcher 5";
        setInternalName("RL 5");
        addLookupName("RL5");
        addLookupName("ISRocketLauncher5");
        addLookupName("IS RLauncher-5");
        rackSize = 5;
        shortRange = 3;
        mediumRange = 7;
        longRange = 12;
        extremeRange = 14;
        bv = 6;
        rulesRefs = "229,TM";
        techAdvancement.setTechBase(TECH_BASE_ALL)
        	.setIntroLevel(false)
        	.setUnofficial(true)
            .setTechRating(RATING_B)
            .setAvailability(RATING_B, RATING_B, RATING_B, RATING_B)
            .setISAdvancement(DATE_ES, 3064, 3067, DATE_NONE, DATE_NONE)
            .setISApproximate(false, false, false,false, false)
            .setClanAdvancement(DATE_ES, DATE_NONE, DATE_NONE, 2823, DATE_NONE)
            .setClanApproximate(false, false, false,false, false)
            .setProductionFactions(F_MH);
    }
}
