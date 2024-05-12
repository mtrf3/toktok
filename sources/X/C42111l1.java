package X;

import android.os.Handler;
import com.bytedance.android.live.broadcast.speeddetector.core.impl.proto.ClientErrorData;
import com.bytedance.android.live.broadcast.speeddetector.core.impl.proto.SpeedData;
import com.bytedance.android.livesdk.livesetting.game.GameLiveBroadcastSpeedDetectionSwitcherSetting;
import com.bytedance.android.livesdk.livesetting.game.GameLiveBroadcastSpeedDetectionWebSocketUrlSetting;
import com.bytedance.android.livesdk.livesetting.game.GameLiveBroadcastTTPSpeedDetectionSwitcherSetting;
import com.bytedance.android.livesdk.livesetting.game.GameLiveBroadcastTTPSpeedDetectionWebSocketUrlSetting;
import kotlin.jvm.internal.o;

/* renamed from: X.1l1, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C42111l1 extends C1NY {
    public final int LJII;
    public C73411SrX LJIIIIZZ;
    public final Handler LJIIIZ = new Handler(C16880lQ.LLJJJJ());
    public String LJIIJ = "";
    public XKQ LJIIJJI;
    public XKQ LJIIL;
    public XKQ LJIILIIL;
    public XKQ LJIILJJIL;
    public C0W5 LJIILL;
    public final String LJIILLIIL;
    public final C64962gm LJIIZILJ;

    public final void LJII() {
        if (C30922CBq.LIZIZ) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("stopAllTimeCostTasks(). Thread=");
            LIZ.append(C16880lQ.LLLLIIIILLL().getName());
            C0NB.LJIIIZ("NetworkSpeedDetectorManager", X1D.LIZIZ(LIZ));
        }
        C73411SrX c73411SrX = this.LJIIIIZZ;
        if (c73411SrX != null) {
            c73411SrX.dispose();
        }
        XKQ xkq = this.LJIILJJIL;
        if (xkq != null) {
            xkq.LIZIZ(null);
        }
        XKQ xkq2 = this.LJIIJJI;
        if (xkq2 != null) {
            xkq2.LIZIZ(null);
        }
        XKQ xkq3 = this.LJIIL;
        if (xkq3 != null) {
            xkq3.LIZIZ(null);
        }
        XKQ xkq4 = this.LJIILIIL;
        if (xkq4 != null) {
            xkq4.LIZIZ(null);
        }
    }

    @Override // X.C1NY
    public final void LIZIZ() {
        LJII();
        this.LJFF.set(false);
        this.LIZIZ.set(2000000);
        this.LIZJ = "";
    }

    public C42111l1(int i) {
        this.LJII = i;
        String str = "";
        if (GameLiveBroadcastTTPSpeedDetectionSwitcherSetting.INSTANCE.isEnable()) {
            str = GameLiveBroadcastTTPSpeedDetectionWebSocketUrlSetting.INSTANCE.getSpeedDetectionWebSocketUrl();
        } else if (GameLiveBroadcastSpeedDetectionSwitcherSetting.INSTANCE.isEnable()) {
            str = GameLiveBroadcastSpeedDetectionWebSocketUrlSetting.INSTANCE.getSpeedDetectionWebSocketUrl();
        }
        this.LJIILLIIL = str;
        this.LJIIZILJ = C48841JEv.LIZ(C78613UtF.LIZJ);
    }

    public final void LJ(int i, String message) {
        o.LJIIIZ(message, "message");
        LJII();
        if (!this.LJFF.get()) {
            C0W1 c0w1 = C0W1.SocketHadClosedFailure;
            LJFF(c0w1.getCode(), c0w1.getMessage());
            return;
        }
        if (o.LJ(this.LIZ, C0TP.SCENE_TIKTOK_GAME_LIVE_AUTO.getValue())) {
            C1JD.LJJIJIIJI(i, this.LIZJ, String.valueOf(hashCode()), message, "auto");
        } else if (o.LJ(this.LIZ, C0TP.SCENE_TIKTOK_GAME_LIVE_MANUAL.getValue())) {
            C1JD.LJJIJIIJI(i, this.LIZJ, String.valueOf(hashCode()), message, "manual");
        }
        LJFF(i, message);
        SpeedData speedData = new SpeedData(this);
        speedData.methodType = EnumC05580Ju.ClientError.getValue();
        ClientErrorData clientErrorData = new ClientErrorData();
        clientErrorData.code = i;
        clientErrorData.msg = message;
        speedData.clientErrorData = clientErrorData;
        String LJJJJJL = C17J.LJJJJJL(speedData);
        LIZJ(LJJJJJL);
        if (C30922CBq.LIZIZ) {
            StringBuilder LIZIZ = C25620zW.LIZIZ("send client error. ", LJJJJJL, ", Thread=");
            LIZIZ.append(C16880lQ.LLLLIIIILLL().getName());
            C0NB.LJIIIZ("SpeedManager_Base", X1D.LIZIZ(LIZIZ));
        }
        LIZLLL(i, message);
    }

    public final void LJFF(final int i, final String str) {
        C73411SrX c73411SrX = this.LJIIIIZZ;
        if (c73411SrX != null) {
            c73411SrX.dispose();
        }
        this.LJIIIZ.post(new Runnable() { // from class: X.0W3
            @Override // java.lang.Runnable
            public final void run() {
                boolean LIZ;
                try {
                    C0W5 c0w5 = C42111l1.this.LJIILL;
                    if (c0w5 != null) {
                        c0w5.LIZIZ(i, str);
                    }
                    C42111l1.this.LJIILL = null;
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0146 -> B:14:0x004b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x005f -> B:11:0x003d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x007b -> B:11:0x003d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJI(java.lang.StringBuilder r20, com.bytedance.android.live.broadcast.speeddetector.core.impl.proto.ConfigData r21, X.InterfaceC67352kd<? super X.C76800UCe> r22) {
        /*
            Method dump skipped, instructions count: 405
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42111l1.LJI(java.lang.StringBuilder, com.bytedance.android.live.broadcast.speeddetector.core.impl.proto.ConfigData, X.2kd):java.lang.Object");
    }
}
