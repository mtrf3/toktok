package X;

import android.content.Context;

/* renamed from: X.Ivz, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48207Ivz {
    public static EnumC48204Ivw LIZ;
    public static EnumC48204Ivw LIZIZ;

    public static boolean LIZ(Context context) {
        EnumC48204Ivw enumC48204Ivw = LIZ;
        if (enumC48204Ivw == null || enumC48204Ivw == EnumC48204Ivw.NONE) {
            LIZ = C48203Ivv.LIZIZ(context);
        }
        if (LIZ == EnumC48204Ivw.WIFI) {
            return true;
        }
        return false;
    }
}
