package X;

import android.view.View;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.pages.result.autoplay.core.viewmodel.Taco;
import kotlin.jvm.internal.AqS155S0200000_8;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JSM {
    public static JSL LIZ(JSO jso) {
        Taco LIZ = C49218JTi.LIZ(jso.a(), false);
        if (LIZ == null) {
            return null;
        }
        JSL LJFF = LIZ.LJFF(jso.q());
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(jso.getClass());
        LIZ2.append(' ');
        X1D.LIZIZ(LIZ2);
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("get nest agent ");
        LIZ3.append(LJFF);
        LIZ3.append(',');
        X1D.LIZIZ(LIZ3);
        jso.q();
        return LJFF;
    }

    public static void LIZLLL(JSO jso) {
        if (!C46447IKt.LJLJLJ) {
            C48905JHh.LIZIZ(jso);
            return;
        }
        JSL LIZ = LIZ(jso);
        if (jso.LLLLLLL() && LIZ != null) {
            LIZ.LJI();
        } else {
            C48905JHh.LIZIZ(jso);
        }
        C49133JQb.LIZ("IGroupCard", jso, Boolean.valueOf(jso.LLLLLLL()), LIZ);
    }

    public static void LIZJ(View rootView, JSO jso) {
        o.LJIIIZ(rootView, "rootView");
        if (!C46447IKt.LJLJLJ || !jso.LLLLLLL()) {
            return;
        }
        JVD.LIZ(rootView, new AqS155S0200000_8(rootView, jso, 38));
    }

    public static void LJ(JSO jso, long j) {
        if (!C46447IKt.LJLJLJ) {
            C48905JHh.LIZJ(jso, j);
            return;
        }
        JSL LIZ = LIZ(jso);
        if (jso.LLLLLLL() && LIZ != null) {
            LIZ.LJ();
        } else {
            C48905JHh.LIZJ(jso, j);
        }
        C49133JQb.LIZ("IGroupCard", jso, Boolean.valueOf(jso.LLLLLLL()), LIZ);
    }

    public static void LIZIZ(JSO jso, Aweme aweme, C49196JSm c49196JSm) {
        o.LJIIIZ(aweme, "aweme");
        JSL LIZ = LIZ(jso);
        if (LIZ != null) {
            LIZ.LJIJJLI(aweme, c49196JSm);
        }
    }
}
