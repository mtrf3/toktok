package X;

import com.ss.android.ugc.aweme.plugin.Wrapper;
import kotlin.jvm.internal.o;

/* renamed from: X.2RH, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2RH {
    public static final OQY LIZ;
    public static final Wrapper LIZIZ;
    public static java.util.Set<String> LIZJ;

    static {
        new C2RH();
        OQY oqy = OQY.INSTANCE;
        LIZ = oqy;
        LIZIZ = new Wrapper(oqy);
    }

    public static final java.util.Set<String> LIZ() {
        java.util.Set<String> set;
        java.util.Set<String> set2 = LIZJ;
        if (set2 != null) {
            return set2;
        }
        try {
            FFL LJIIIZ = FFL.LJIIIZ();
            Wrapper wrapper = LIZIZ;
            LJIIIZ.getClass();
            Wrapper wrapper2 = (Wrapper) FFL.LJIJ(true, "plugin_pre_init_allowlist", 31744, Wrapper.class, wrapper);
            if (wrapper2 == null || (set = wrapper2.allowedEventNames) == null) {
                set = LIZ;
            }
        } catch (Exception unused) {
            set = LIZ;
        }
        LIZJ = set;
        o.LJI(set);
        return set;
    }
}
