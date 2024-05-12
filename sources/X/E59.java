package X;

import com.bytedance.keva.Keva;

/* loaded from: classes7.dex */
public final class E59 {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(E5A.LJLIL);
    public static C35845E4z LIZIZ;

    public static boolean LIZ() {
        C62822Ol8 c62822Ol8 = LIZ;
        boolean z = ((Keva) c62822Ol8.getValue()).getBoolean("key_enable_reverse_interest_select", false);
        FMX.LJIIL("hybrid_ab_interest_select_check", C0RN.LIZJ(z ? 1 : 0, "is_interest_select_skip", ((Keva) c62822Ol8.getValue()).contains("key_enable_reverse_interest_select") ? 1 : 0, "is_hybrid_ab_success").LIZ);
        C35845E4z c35845E4z = LIZIZ;
        if (c35845E4z != null) {
            c35845E4z.dispose();
        }
        return z;
    }
}
