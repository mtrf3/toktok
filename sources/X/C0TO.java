package X;

import Y.IDaS211S0100000;
import com.bytedance.android.livesdk.livesetting.barrage.TtliveGameSpeedTestAutoEndTimeSetting;
import java.util.LinkedHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* renamed from: X.0TO, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0TO {
    public final C42111l1 LIZ = new C42111l1(TtliveGameSpeedTestAutoEndTimeSetting.INSTANCE.getValue());

    public final String LIZJ() {
        return String.valueOf(this.LIZ.hashCode());
    }

    public final void LIZIZ() {
        if (!C77357UXp.LJJIII()) {
            return;
        }
        C42111l1 c42111l1 = this.LIZ;
        c42111l1.getClass();
        C0NB.LJIIIZ("NetworkSpeedDetectorManager", "exit");
        c42111l1.LJII();
        c42111l1.LJIILL = null;
    }

    public final boolean LIZLLL() {
        if (!C77357UXp.LJJIII()) {
            return true;
        }
        return !this.LIZ.LJFF.get();
    }

    public final void LIZ(int i, String message) {
        o.LJIIIZ(message, "message");
        if (!C77357UXp.LJJIII()) {
            return;
        }
        this.LIZ.LJ(i, message);
    }

    public final void LJ(C0TP scene, C0W5 c0w5) {
        o.LJIIIZ(scene, "scene");
        if (C77357UXp.LJJIII() && !this.LIZ.LJFF.get()) {
            C42111l1 c42111l1 = this.LIZ;
            String scene2 = scene.getValue();
            c42111l1.getClass();
            o.LJIIIZ(scene2, "scene");
            C73411SrX c73411SrX = c42111l1.LJIIIIZZ;
            if (c73411SrX != null) {
                c73411SrX.dispose();
            }
            c42111l1.LJIIIIZZ = (C73411SrX) C1EW.LIZ(TMC.LJJIFFI(c42111l1.LJII + 1, 0L, 1L, TimeUnit.SECONDS)).LJIIZILJ(new IDaS211S0100000(c42111l1, 2)).LJJJJZI(new InterfaceC64592gB() { // from class: X.1NZ
                @Override // X.InterfaceC64592gB
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                }
            });
            c42111l1.LJIILL = c0w5;
            if (o.LJ(scene2, C0TP.SCENE_TIKTOK_GAME_LIVE_AUTO.getValue())) {
                String sessionId = c42111l1.LIZJ;
                String managerId = String.valueOf(c42111l1.hashCode());
                o.LJIIIZ(sessionId, "sessionId");
                o.LJIIIZ(managerId, "managerId");
                C1JD.LJJIIZI(sessionId, managerId, "auto", -2, new LinkedHashMap());
            } else if (o.LJ(scene2, C0TP.SCENE_TIKTOK_GAME_LIVE_MANUAL.getValue())) {
                String sessionId2 = c42111l1.LIZJ;
                String managerId2 = String.valueOf(c42111l1.hashCode());
                o.LJIIIZ(sessionId2, "sessionId");
                o.LJIIIZ(managerId2, "managerId");
                C1JD.LJJIIZI(sessionId2, managerId2, "manual", -2, new LinkedHashMap());
            }
            if (c42111l1.LJIILLIIL.length() == 0 || ujb.o.LJJJJJL(c42111l1.LJIILLIIL)) {
                C0W1 c0w1 = C0W1.UrlEmptyFailure;
                c42111l1.LJFF(c0w1.getCode(), c0w1.getMessage());
                return;
            }
            String webSocketUrl = c42111l1.LJIILLIIL;
            o.LJIIIZ(webSocketUrl, "webSocketUrl");
            c42111l1.LJFF.set(true);
            c42111l1.LIZ = scene2;
            new LinkedHashMap();
            new LinkedHashMap();
            C0W7 c0w7 = c42111l1.LJI;
            c0w7.getClass();
            C64618PXq c64618PXq = new C64618PXq();
            c64618PXq.LJ("GET", null);
            c64618PXq.LJII(webSocketUrl);
            c0w7.LIZJ = c0w7.LIZIZ.LIZIZ(c64618PXq.LIZIZ(), c0w7.LIZ);
            if (!C30922CBq.LIZIZ) {
                return;
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("openConnection. ");
            LIZ.append(c42111l1);
            C0NB.LJIIIZ("SpeedManager_Base", X1D.LIZIZ(LIZ));
        }
    }
}
