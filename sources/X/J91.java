package X;

import Y.ARunnableS44S0100000_8;
import android.os.Handler;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.services.NetworkLevelService;
import com.ss.android.ugc.aweme.services.NetworkStateServiceImpl;
import java.util.LinkedList;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class J91 implements InterfaceC48686J8w {
    public long LIZIZ;
    public long LIZJ;
    public InterfaceC48689J8z LJ;
    public final LinkedList<Long> LIZ = new LinkedList<>();
    public int LIZLLL = -1;
    public final C62822Ol8 LJFF = C221108m2.LIZIZ(J93.INSTANCE);
    public final ARunnableS44S0100000_8 LJI = new ARunnableS44S0100000_8(this, 121);
    public final ARunnableS44S0100000_8 LJII = new ARunnableS44S0100000_8(this, LiveTryModeCountDownThresholdSetting.DEFAULT);

    @Override // X.InterfaceC48686J8w
    public final void LIZIZ() {
        InterfaceC48689J8z interfaceC48689J8z;
        InterfaceC48689J8z interfaceC48689J8z2;
        if (C2NU.LIZ.LIZJ()) {
            boolean isFakeNetwork = NetworkStateServiceImpl.createINetworkStateServicebyMonsterPlugin(false).isFakeNetwork();
            boolean isWeakNetwork = NetworkStateServiceImpl.createINetworkStateServicebyMonsterPlugin(false).isWeakNetwork();
            if (isFakeNetwork) {
                if (((Boolean) C35351Du7.LIZJ.getValue()).booleanValue() && this.LIZLLL != 6 && (interfaceC48689J8z2 = this.LJ) != null) {
                    interfaceC48689J8z2.LIZ();
                    return;
                }
                return;
            }
            if (!isWeakNetwork || !((Boolean) C35351Du7.LIZLLL.getValue()).booleanValue() || this.LIZLLL == 6 || (interfaceC48689J8z = this.LJ) == null) {
                return;
            }
            interfaceC48689J8z.LIZ();
        }
    }

    public final Handler LJ() {
        return (Handler) this.LJFF.getValue();
    }

    @Override // X.InterfaceC48686J8w
    public final void LIZ(int i) {
        this.LIZLLL = i;
    }

    @Override // X.InterfaceC48686J8w
    public final void LIZJ(AnonymousClass998 status) {
        o.LJIIIZ(status, "status");
        if (NetworkStateServiceImpl.createINetworkStateServicebyMonsterPlugin(false).isFakeNetwork()) {
            return;
        }
        int i = C99A.LIZ[status.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return;
                    }
                    LJ().removeCallbacks(this.LJII);
                    return;
                } else {
                    LJ().removeCallbacks(this.LJII);
                    LJ().postDelayed(this.LJII, 1000L);
                    return;
                }
            }
            LJ().removeCallbacks(this.LJI);
            return;
        }
        LJ().removeCallbacks(this.LJI);
        Handler LJ = LJ();
        ARunnableS44S0100000_8 aRunnableS44S0100000_8 = this.LJI;
        SettingsManager.LIZLLL().getClass();
        LJ.postDelayed(aRunnableS44S0100000_8, SettingsManager.LJFF("speed_mode_video_prepare_time_out", 5000L));
    }

    @Override // X.InterfaceC48686J8w
    public final void LIZLLL(J92 freezeType) {
        o.LJIIIZ(freezeType, "freezeType");
        if (NetworkStateServiceImpl.createINetworkStateServicebyMonsterPlugin(false).isFakeNetwork()) {
            return;
        }
        if (freezeType == J92.API) {
            this.LIZIZ = System.currentTimeMillis();
        } else if (freezeType == J92.VIDEO) {
            synchronized (this.LIZ) {
                this.LIZ.add(Long.valueOf(System.currentTimeMillis()));
                while (this.LIZ.size() > 3) {
                    ORS.LJJLJLI(this.LIZ);
                }
            }
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.LIZIZ < 60000 && this.LIZ.size() == 3) {
            Long first = this.LIZ.getFirst();
            o.LJIIIIZZ(first, "videoFreezeTimeList.first");
            if (currentTimeMillis - first.longValue() < 60000 && currentTimeMillis - this.LIZJ > 10000) {
                this.LIZJ = currentTimeMillis;
                LIZIZ();
                NetworkLevelService.createINetworkLevelServicebyMonsterPlugin(false).reportNetworkLevel("slow_api");
            }
        }
    }
}
