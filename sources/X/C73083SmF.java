package X;

import android.app.Activity;
import android.text.TextUtils;
import com.bytedance.android.livesdkapi.host.IHostAction;
import kotlin.jvm.internal.o;

/* renamed from: X.SmF, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73083SmF {
    public static volatile boolean LIZ;

    public static void LIZIZ() {
        C0NB.LIZIZ("LiveReplyVideoPlayer", "try registerNetworkListener");
        if (LIZ) {
            return;
        }
        C0NB.LIZIZ("LiveReplyVideoPlayer", "registed NetworkListener");
        LIZ = true;
        try {
            java.util.Map<String, String> LIZJ = InterfaceC30442Bx8.f64J.LIZJ();
            o.LJIIIIZZ(LIZJ, "LIVE_REPLAY_SCHEDULED_DOWNLOAD_VIDEO_LIST.value");
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("taskMap init: ");
            LIZ2.append(LIZJ);
            C0NB.LIZIZ("LiveReplyVideoPlayer", X1D.LIZIZ(LIZ2));
        } catch (ClassCastException unused) {
            C48459J0d<java.util.Map<String, String>> c48459J0d = InterfaceC30442Bx8.f64J;
            c48459J0d.LIZJ().clear();
            c48459J0d.LIZ(c48459J0d.LIZJ());
        }
        C30863C9j.LIZ("LiveReplayVideoNetworkKey", C73084SmG.LIZ);
    }

    public static void LIZ(String str, String str2) {
        C0EN c0en;
        C48459J0d<java.util.Map<String, String>> c48459J0d = InterfaceC30442Bx8.f64J;
        c48459J0d.LIZJ().remove(str2);
        c48459J0d.LIZ(c48459J0d.LIZJ());
        C0ER.LIZJ().getClass();
        if (!TextUtils.isEmpty(str2)) {
            c0en = C0EP.LJFF().LIZIZ.get(str2);
        } else {
            c0en = C0EP.LJFF().LIZIZ.get(str);
        }
        C0ER LIZJ = C0ER.LIZJ();
        Activity topActivity = ((IHostAction) CN1.LIZ(IHostAction.class)).getTopActivity();
        if (c0en == null) {
            c0en = new C29541Dy(str, str2);
        }
        LIZJ.getClass();
        C0ER.LJI(topActivity, 0, str, str2, c0en);
    }
}
