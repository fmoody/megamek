/*
 * MegaMek - Copyright (C) 2004,2005 Ben Mazur (bmazur@sev.org)
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
/*
 * Created on Sep 25, 2004
 *
 */
package megamek.common.weapons.capitalweapons;

import megamek.common.weapons.NavalPPCWeapon;



/**
 * @author Jay Lawson
 */
public class ISNPPCWeaponHeavy extends NavalPPCWeapon {
    /**
    * 
    */
    private static final long serialVersionUID = 8756042527483383101L;

    /**
    * 
    */
    public ISNPPCWeaponHeavy() {
        super();
        this.name = "Naval PPC (Heavy)";
        this.setInternalName(this.name);
        this.addLookupName("HeavyNPPC");
        this.heat = 225;
        this.damage = 15;
        this.shortRange = 13;
        this.mediumRange = 26;
        this.longRange = 39;
        this.extremeRange = 52;
        this.tonnage = 3000.0f;
        this.bv = 3780;
        this.cost = 9050000;
        this.shortAV = 15;
        this.medAV = 15;
        this.longAV = 15;
        this.extAV = 15;
        this.maxRange = RANGE_EXT;
        rulesRefs = "333,TO";
        techAdvancement.setTechBase(TECH_BASE_ALL)
        	.setIntroLevel(false)
        	.setUnofficial(false)
            .setTechRating(RATING_D)
            .setAvailability(RATING_D, RATING_X, RATING_E, RATING_E)
            .setISAdvancement(2350, 2356, DATE_NONE, 2950, 3052)
            .setISApproximate(true, true, false, true, false)
            .setClanAdvancement(2350, 2356, DATE_NONE, DATE_NONE, DATE_NONE)
            .setClanApproximate(true, true, false,false, false)
            .setProductionFactions(F_TH)
            .setReintroductionFactions(F_DC);
    }
}
