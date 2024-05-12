package X;

import X.C40741Fyr;
import X.C40751Fz1;
import X.EnumC40753Fz3;
import X.X1D;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Fz1, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40751Fz1 {
    public static G15 LIZ;
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C40798Fzm.LJLIL);
    public static int LIZJ = 1;

    public static G0D LIZ() {
        InterfaceC40766FzG interfaceC40766FzG;
        G15 g15 = LIZ;
        if (g15 != null && (interfaceC40766FzG = g15.LIZ) != null) {
            return interfaceC40766FzG.context();
        }
        return null;
    }

    public static void LIZIZ(InterfaceC40755Fz5 sceneHost) {
        EnumC40753Fz3 sceneType;
        final AbstractC40767FzH c40754Fz4;
        o.LJIIIZ(sceneHost, "sceneHost");
        int LIZJ2 = C38986FRu.LIZ().LIZJ();
        if (LIZJ2 != 1) {
            if (LIZJ2 != 3) {
                sceneType = EnumC40753Fz3.NUJ_SCENE_DEFAULT;
            } else {
                sceneType = EnumC40753Fz3.NUJ_SCENE_NEW_VERSION;
            }
        } else {
            sceneType = EnumC40753Fz3.NUJ_SCENE_NEW_USER;
        }
        o.LJIIIZ(sceneType, "sceneType");
        G0D g0d = new G0D(sceneHost);
        ((List) g0d.LJLJJI).add(new C40774FzO());
        ((List) g0d.LJLJJI).add(new C40763FzD());
        if (sceneType == EnumC40753Fz3.NUJ_SCENE_NEW_VERSION) {
            c40754Fz4 = new C40752Fz2(g0d);
        } else {
            c40754Fz4 = new C40754Fz4(g0d);
        }
        for (EnumC40761FzB enumC40761FzB : c40754Fz4.LIZJ()) {
            LIZIZ.getValue().getClass();
            G14 LIZ2 = C40817G0f.LIZ(enumC40761FzB);
            if (LIZ2 == null) {
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("setupComponent but ");
                LIZ3.append(enumC40761FzB);
                LIZ3.append("'s provider is null");
                String msg = X1D.LIZIZ(LIZ3);
                o.LJIIIZ(msg, "msg");
            } else {
                c40754Fz4.LIZLLL(LIZ2);
            }
        }
        G15 g15 = new G15(c40754Fz4);
        LIZ = g15;
        g15.LIZ(new E5D());
        g15.LIZ(new E5E());
        G1H g1h = (G1H) c40754Fz4.LIZ.LIZ(G1X.class);
        if (g1h != null) {
            g15.LIZLLL(g1h);
        }
        g15.LIZLLL(new C40743Fyt(sceneHost, c40754Fz4));
        sceneHost.LIZLLL().getLifecycle().addObserver(new GenericLifecycleObserver() { // from class: com.ss.android.ugc.aweme.refactor.framework.NUJCenter$realStart$3
            @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
            public final void onDestroy() {
                EnumC40753Fz3 type = c40754Fz4.type();
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("removeRunningFlow ");
                LIZ4.append(type);
                C40741Fyr.LIZ(X1D.LIZIZ(LIZ4));
                C40751Fz1.LIZ = null;
            }

            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                if (event == Lifecycle.Event.ON_DESTROY) {
                    onDestroy();
                }
            }
        });
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append("realStart ");
        LIZ4.append(c40754Fz4.type());
        LIZ4.append(" flow");
        C40741Fyr.LIZ(X1D.LIZIZ(LIZ4));
        g15.LIZIZ = -1;
        g15.LIZJ = false;
        g15.LIZIZ();
        LIZJ = 2;
        E6T.LIZIZ = 2;
        C36213EJd.LIZJ = 2;
    }
}
