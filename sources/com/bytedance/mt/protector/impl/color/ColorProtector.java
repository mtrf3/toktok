package com.bytedance.mt.protector.impl.color;

import X.C65415Plr;
import X.C65857Psz;
import X.EnumC65856Psy;
import android.graphics.Color;

/* loaded from: classes12.dex */
public class ColorProtector extends C65857Psz {
    public static int parseColor(String str) {
        if (C65415Plr.LIZIZ()) {
            try {
                return Color.parseColor(str);
            } catch (Throwable th) {
                Integer num = (Integer) C65857Psz.tryProtect(th, Integer.class);
                if (num != null) {
                    return num.intValue();
                }
                throw th;
            }
        }
        return Color.parseColor(str);
    }

    public static int HSVToColor(int i, float[] fArr) {
        if (C65415Plr.LIZIZ()) {
            try {
                return Color.HSVToColor(i, fArr);
            } catch (Throwable th) {
                Integer num = (Integer) C65857Psz.tryProtect(th, Integer.class);
                if (num != null) {
                    return num.intValue();
                }
                throw th;
            }
        }
        return Color.HSVToColor(i, fArr);
    }

    public static void RGBToHSV(int i, int i2, int i3, float[] fArr) {
        if (C65415Plr.LIZIZ()) {
            try {
                Color.RGBToHSV(i, i2, i3, fArr);
            } catch (Throwable th) {
                if (C65415Plr.LIZ(EnumC65856Psy.CAST_COLOR, th) != null) {
                    return;
                } else {
                    throw th;
                }
            }
        }
        Color.RGBToHSV(i, i2, i3, fArr);
    }
}
