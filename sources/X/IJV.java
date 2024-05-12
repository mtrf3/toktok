package X;

/* loaded from: classes9.dex */
public final class IJV {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C48538J3e.LJLIL);

    public static AbstractC48597J5l LIZJ() {
        return (AbstractC48597J5l) LIZ.getValue();
    }

    public static int LIZ() {
        return LIZJ().LJ(0, "device_score");
    }

    public static int LIZIZ() {
        return LIZJ().LJ(0, "cl_net_quality_level");
    }

    public final String toString() {
        boolean z;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("Performance: \ngetDeviceScore = ");
        LIZ2.append(LIZ());
        LIZ2.append(" \nisLowEndDevice = ");
        boolean z2 = true;
        if (LIZJ().LJ(0, "cl_is_low_end_device") == 1) {
            z = true;
        } else {
            z = false;
        }
        LIZ2.append(z);
        LIZ2.append(", isInWifi = ");
        if (LIZJ().LJ(0, "cl_is_wifi") != 1) {
            z2 = false;
        }
        LIZ2.append(z2);
        LIZ2.append(" \ngetBatteryPct = ");
        LIZ2.append(LIZJ().LJ(0, "cl_battery_pct"));
        LIZ2.append(", isCharging = ");
        LIZ2.append(LIZJ().LJ(0, "cl_is_charging"));
        LIZ2.append(" \ngetNetQualityLevel = ");
        LIZ2.append(LIZIZ());
        return X1D.LIZIZ(LIZ2);
    }
}
