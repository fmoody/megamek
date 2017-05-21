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
/*
 * Created on Sep 25, 2004
 *
 */
package megamek.common.weapons;

import megamek.common.AmmoType;

/**
 * @author Sebastian Brocks
 */
public class ISAPDS extends AmmoWeapon {
    /**
     *
     */
    private static final long serialVersionUID = 5678281956614161074L;

    /**
     *
     */
    public ISAPDS() {
        super();
        name = "RISC Advanced Point Defense System";
        setInternalName("ISAPDS");
        heat = 2;
        rackSize = 2;
        damage = 1; // # of d6 of missiles affected
        ammoType = AmmoType.T_APDS;
        tonnage = 3;
        criticals = 2;
        longRange = 3;
        bv = 64;
        flags = flags.or(F_MECH_WEAPON).or(F_TANK_WEAPON)
                .or(F_AUTO_TARGET).or(F_AMS).or(F_BALLISTIC);
        setModes(new String[] { "On", "Off" });
        setInstantModeSwitch(false);
        cost = 200000;
        rulesRefs = "91, IO";
        techAdvancement.setTechBase(TECH_BASE_IS)
    	.setIntroLevel(false)
    	.setUnofficial(false)
        .setTechRating(RATING_E)
        .setAvailability(RATING_X, RATING_X, RATING_X, RATING_E)
        .setISAdvancement(3134, 3137, DATE_NONE, DATE_NONE, DATE_NONE)
        .setISApproximate(false, false, false,false, false)
        .setPrototypeFactions(F_RS)
        .setProductionFactions(F_RS);

    }
}
