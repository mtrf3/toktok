package X;

import com.bytedance.keva.Keva;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.o;

/* renamed from: X.EZz, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36651EZz {
    public static final java.util.Set<String> LIZ = new LinkedHashSet();
    public static final java.util.Set<String> LIZIZ = new LinkedHashSet();
    public static final C62822Ol8 LIZJ = C221108m2.LIZIZ(C36652Ea0.LJLIL);

    public static Keva LIZIZ() {
        return (Keva) LIZJ.getValue();
    }

    public static void LIZ(String uid, boolean z) {
        o.LJIIIZ(uid, "uid");
        java.util.Set<String> stringSet = LIZIZ().getStringSet("action_ai_disclaimer_show_times", OQY.INSTANCE);
        stringSet.add(uid);
        LIZ.addAll(stringSet);
        LIZIZ().storeStringSet("action_ai_disclaimer_show_times", stringSet);
        if (z) {
            C2VQ.LIZ(C36649EZx.LJLIL);
        }
    }

    public static void LIZJ(String uid, boolean z) {
        o.LJIIIZ(uid, "uid");
        java.util.Set<String> stringSet = LIZIZ().getStringSet("action_ai_guidance_hints_show_times", OQY.INSTANCE);
        stringSet.add(uid);
        LIZIZ.addAll(stringSet);
        LIZIZ().storeStringSet("action_ai_guidance_hints_show_times", stringSet);
        if (z) {
            C2VQ.LIZ(C36650EZy.LJLIL);
        }
    }
}
