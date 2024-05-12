package X;

import com.ss.android.ugc.aweme.services.NetworkStandardUIServiceImpl;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LYH {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C53554L0c.LJLIL);

    public static boolean LIZ() {
        return C47261Igj.LJJIJIIJI(1, 2).contains(Integer.valueOf(LIZIZ()));
    }

    public static int LIZIZ() {
        return ((Number) LIZ.getValue()).intValue();
    }

    public static final void LIZJ(MG5 sceneName) {
        o.LJIIIZ(sceneName, "sceneName");
        if (C47261Igj.LJJIJIIJI(1, 2).contains(Integer.valueOf(LIZIZ()))) {
            NetworkStandardUIServiceImpl.createINetworkStandardUIServicebyMonsterPlugin(false).removeLazyToast(sceneName);
        }
    }

    public static void LJ(InterfaceC65784Pro interfaceC65784Pro) {
        if (C47261Igj.LJJIJIIJI(1, 2).contains(Integer.valueOf(LIZIZ()))) {
            interfaceC65784Pro.invoke();
        }
    }

    public static final void LIZLLL(MG5 sceneName, ActivityC45651qj activityC45651qj) {
        o.LJIIIZ(sceneName, "sceneName");
        if (C47261Igj.LJJIJIIJI(1, 2).contains(Integer.valueOf(LIZIZ()))) {
            NetworkStandardUIServiceImpl.createINetworkStandardUIServicebyMonsterPlugin(false).startLazyToast(sceneName, activityC45651qj);
        }
    }
}
