package X;

import Y.ARunnableS43S0100000_7;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class L6V {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(L6W.LJLIL);

    static {
        HashMap LIZIZ = LIZIZ();
        L61 l61 = L61.STORY;
        LIZIZ.put(l61, new L6Y(l61));
    }

    public static HashMap LIZIZ() {
        return (HashMap) LIZ.getValue();
    }

    public static void LIZ(InterfaceC65784Pro interfaceC65784Pro) {
        ((ExecutorService) GAN.LIZ.getValue()).execute(new ARunnableS43S0100000_7(interfaceC65784Pro, 130));
    }

    public static C53710L6c LIZJ(L61 bizTag, String str, C53710L6c userSocialStatus, Boolean bool) {
        C53710L6c N;
        o.LJIIIZ(bizTag, "bizTag");
        o.LJIIIZ(userSocialStatus, "userSocialStatus");
        L6Y l6y = (L6Y) LIZIZ().get(bizTag);
        if (l6y == null || (N = l6y.N(str, userSocialStatus, bool)) == null) {
            return new C53710L6c(0, 7);
        }
        return N;
    }
}
