package X;

import com.bytedance.keva.Keva;

/* renamed from: X.3vW, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C99583vW {
    public static int LIZ;
    public static final Keva LIZIZ = Keva.getRepo("InputLayoutStates");

    public static int LIZ(int i) {
        if (LIZ <= 0) {
            LIZ = LIZIZ.getInt("last_keyboard_height", i);
        }
        int i2 = LIZ;
        if (i2 <= 0) {
            return i;
        }
        return i2;
    }
}
