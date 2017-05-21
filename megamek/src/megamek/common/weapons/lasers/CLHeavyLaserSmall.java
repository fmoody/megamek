/**
 * MegaMek - Copyright (C) 2004 Ben Mazur (bmazur@sev.org)
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
 * Created on Sep 12, 2004
 *
 */
package megamek.common.weapons.lasers;

import megamek.common.weapons.LaserWeapon;

/**
 * @author Andrew Hunter
 */
public class CLHeavyLaserSmall extends LaserWeapon {
    /**
     * 
     */
    private static final long serialVersionUID = -1717918421173868008L;

    /**
     * 
     */
    public CLHeavyLaserSmall() {
        super();
        this.name = "Heavy Small Laser";
        this.setInternalName("CLHeavySmallLaser");
        this.addLookupName("Clan Small Heavy Laser");
        this.heat = 3;
        this.damage = 6;
        this.toHitModifier = 1;
        this.shortRange = 1;
        this.mediumRange = 2;
        this.longRange = 3;
        this.extremeRange = 4;
        this.waterShortRange = 1;
        this.waterMediumRange = 2;
        this.waterLongRange = 2;
        this.waterExtremeRange = 4;
        this.tonnage = 0.5f;
        this.criticals = 1;
        this.bv = 15;
        this.cost = 20000;
        this.shortAV = 6;
        this.maxRange = RANGE_SHORT;
        rulesRefs = "226,TM";
        techAdvancement.setTechBase(TECH_BASE_CLAN)
        	.setIntroLevel(false)
        	.setUnofficial(false)
            .setTechRating(RATING_F)
            .setAvailability(RATING_X, RATING_X, RATING_D, RATING_D)
            .setClanAdvancement(3057, 3059, 3064, DATE_NONE, DATE_NONE)
            .setClanApproximate(true, false, false,false, false)
            .setPrototypeFactions(F_CBR,F_CSA)
            .setProductionFactions(F_CSA);
    }
}
