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
public class ISAMS extends AmmoWeapon {
    /**
     *
     */
    private static final long serialVersionUID = 5678281956614161074L;

    /**
     *
     */
    public ISAMS() {
        super();
        name = "Anti-Missile System";
        setInternalName("ISAntiMissileSystem");
        addLookupName("IS Anti-Missile System");
        addLookupName("IS AMS");
        addLookupName("ISAMS");
        heat = 1;
        rackSize = 2;
        damage = 1; // # of d6 of missiles affected
        ammoType = AmmoType.T_AMS;
        tonnage = 0.5f;
        criticals = 1;
        bv = 32;
        flags = flags.or(F_MECH_WEAPON).or(F_TANK_WEAPON).or(F_AERO_WEAPON)
                .or(F_AUTO_TARGET).or(F_AMS).or(F_BALLISTIC);
        setModes(new String[] { "On", "Off" });
        setInstantModeSwitch(false);
        cost = 100000;
        atClass = CLASS_POINT_DEFENSE;
        rulesRefs = "204,TM";
        techAdvancement.setTechBase(TECH_BASE_IS)
            .setTechRating(RATING_E)
            .setAvailability(RATING_E, RATING_F, RATING_D, RATING_C)
            .setISAdvancement(2613, 2617, 3048, 2835, 3045)
            .setISApproximate(true, false, false,false, false)
            .setPrototypeFactions(F_TH)
            .setProductionFactions(F_TH)
            .setReintroductionFactions(F_CC);
    }
}
