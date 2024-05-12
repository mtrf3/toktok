package X;

import android.content.SharedPreferences;

/* renamed from: X.DpJ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35053DpJ {
    public static final C5H3 LIZ;
    public static final C5H3 LIZIZ;

    static {
        C5H3 LIZ2 = C221108m2.LIZ(EnumC221088m0.PUBLICATION, C35054DpK.LJLIL);
        LIZ = LIZ2;
        C5H3 LIZ3 = C221108m2.LIZ(EnumC221088m0.NONE, C35055DpL.LJLIL);
        LIZIZ = LIZ3;
        if (!((Boolean) LIZ3.getValue()).booleanValue() && C38732FIa.LIZIZ.get()) {
            ((Boolean) LIZ2.getValue()).booleanValue();
        }
    }

    public static final void LIZ() {
        SharedPreferences.Editor edit = C35820E4a.LIZLLL(FKM.LIZ()).edit();
        FFL.LJIIIZ().getClass();
        edit.putInt("ab_replace_monster_with_aweme", FFL.LJIIJ(31744, 0, "ab_replace_monster_with_aweme", true)).apply();
    }
}
