package com.ss.android.vesdk.runtime;

import X.FWO;
import X.P4H;
import com.ss.android.vesdk.VEConfigCenter;

/* loaded from: classes12.dex */
public class TEConfigCenter {
    public static final /* synthetic */ int LIZ = 0;

    public static native void nativeClear();

    public static native void nativeSetABSetType(int i);

    public static native void nativeSetBoolConfig(String str, boolean z, boolean z2, int i);

    public static native void nativeSetFloatConfig(String str, float f, boolean z, int i);

    public static native void nativeSetIntConfig(String str, int i, boolean z, int i2);

    public static native void nativeSetStringConfig(String str, String str2, boolean z, int i);

    static {
        FWO.LIZJ();
    }

    public static void LIZ(String str, VEConfigCenter.ValuePkt valuePkt) {
        boolean z;
        if (valuePkt.getABType() == P4H.FOREFFECT) {
            z = true;
        } else {
            z = false;
        }
        int ordinal = valuePkt.getDataType().ordinal();
        if (ordinal != 0) {
            if (ordinal != 1 && ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        return;
                    }
                    nativeSetStringConfig(str, (String) valuePkt.getValue(), z, valuePkt.getConfigType().ordinal());
                    return;
                }
                nativeSetFloatConfig(str, ((Float) valuePkt.getValue()).floatValue(), z, valuePkt.getConfigType().ordinal());
                return;
            }
            nativeSetIntConfig(str, ((Integer) valuePkt.getValue()).intValue(), z, valuePkt.getConfigType().ordinal());
            return;
        }
        nativeSetBoolConfig(str, ((Boolean) valuePkt.getValue()).booleanValue(), z, valuePkt.getConfigType().ordinal());
    }
}
