package X;

import com.bytedance.keva.Keva;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class E5B {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(E5C.LJLIL);
    public static Boolean LIZIZ;
    public static InterfaceC79713Ax LIZJ;
    public static final List<Integer> LIZLLL;

    static {
        EnumC40761FzB enumC40761FzB = EnumC40761FzB.JOURNEY_LOGIN_ID;
        EnumC40761FzB enumC40761FzB2 = EnumC40761FzB.JOURNEY_SMART_LOCK_ID;
        EnumC40761FzB enumC40761FzB3 = EnumC40761FzB.JOURNEY_AGE_GATE_ID;
        LIZLLL = C47261Igj.LJJIJIIJI(Integer.valueOf(EnumC40761FzB.JOURNEY_SLOGAN_ID.getId()), Integer.valueOf(EnumC40761FzB.JOURNEY_SERVER_DELAY.getId()), Integer.valueOf(enumC40761FzB.getId()), Integer.valueOf(enumC40761FzB2.getId()), Integer.valueOf(enumC40761FzB3.getId()), Integer.valueOf(EnumC40761FzB.JOURNEY_DEEPLINK_ID.getId()), Integer.valueOf(EnumC40761FzB.JOURNEY_PRIVACY_HIGHLIGHTS_FOR_TEENS.getId()), Integer.valueOf(enumC40761FzB2.getId()), Integer.valueOf(enumC40761FzB3.getId()), Integer.valueOf(enumC40761FzB.getId()));
    }

    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [int, boolean] */
    public static boolean LIZ(int i) {
        int i2;
        boolean contains = LIZLLL.contains(Integer.valueOf(i));
        if (contains) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("Should not remove componentType:");
            LIZ2.append(i);
            C40741Fyr.LIZ(X1D.LIZIZ(LIZ2));
        }
        ?? r3 = 1;
        if (!contains && LIZIZ == null) {
            C62822Ol8 c62822Ol8 = LIZ;
            LIZIZ = Boolean.valueOf(((Keva) c62822Ol8.getValue()).getBoolean("key_enable_reverse_nuj", false));
            boolean contains2 = ((Keva) c62822Ol8.getValue()).contains("key_enable_reverse_nuj");
            C188727au c188727au = new C188727au();
            if (o.LJ(LIZIZ, Boolean.TRUE)) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            c188727au.LIZLLL(i2, "is_nuj_skip");
            c188727au.LIZLLL(i, "current_step");
            c188727au.LIZLLL(contains2 ? 1 : 0, "is_hybrid_ab_success");
            FMX.LJIIL("hybrid_ab_nuj_skip_check", c188727au.LIZ);
            InterfaceC79713Ax interfaceC79713Ax = LIZJ;
            if (interfaceC79713Ax != null) {
                interfaceC79713Ax.onComplete();
            }
        }
        boolean z = !contains;
        if (!o.LJ(LIZIZ, Boolean.TRUE) || !z) {
            r3 = 0;
        }
        FMX.LJIIL("check_reverse_nuj", C0RN.LIZJ(r3, "is_nuj_skip", i, "current_step").LIZ);
        return r3;
    }
}
