package X;

import android.text.TextUtils;
import com.byted.cast.common.CastLogger;
import com.byted.cast.common.CastMonitor;
import com.byted.cast.common.Dispatcher;
import com.byted.cast.common.api.IPlayerListener;
import com.byted.cast.common.api.PlayerInfo;
import com.byted.cast.common.bean.DramaBean;
import com.byted.cast.common.source.ServiceInfo;
import com.byted.cast.common.source.Statistics;

/* renamed from: X.ZkV, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90811ZkV implements IPlayerListener {
    public boolean LIZ;
    public final /* synthetic */ C90442ZeY LIZIZ;

    @Override // com.byted.cast.common.api.IPlayerListener
    public final /* synthetic */ void onDramaId(ServiceInfo serviceInfo, String str) {
        ZZY.LIZ(this, serviceInfo, str);
    }

    @Override // com.byted.cast.common.api.IPlayerListener
    public final /* synthetic */ void onDramaList(ServiceInfo serviceInfo, DramaBean[] dramaBeanArr) {
        ZZY.LIZIZ(this, serviceInfo, dramaBeanArr);
    }

    @Override // com.byted.cast.common.api.IPlayerListener
    public final /* synthetic */ void onError(int i, int i2, String str) {
        ZZY.LIZJ(this, i, i2, str);
    }

    @Override // com.byted.cast.common.api.IPlayerListener
    public final /* synthetic */ void onInfo(int i, int i2, String str) {
        ZZY.LIZLLL(this, i, i2, str);
    }

    @Override // com.byted.cast.common.api.IPlayerListener
    public final void onStartMirror() {
    }

    @Override // com.byted.cast.common.api.IPlayerListener
    public final void onStatistics(Statistics statistics) {
    }

    @Override // com.byted.cast.common.api.IPlayerListener
    public final void onStopMirror() {
    }

    @Override // com.byted.cast.common.api.IPlayerListener
    public final /* synthetic */ void onSwitch(int i) {
        ZZY.LJ(this, i);
    }

    @Override // com.byted.cast.common.api.IPlayerListener
    public final void onCompletion() {
        C90444Zea c90444Zea = this.LIZIZ.LJIIJJI;
        if (c90444Zea != null && TextUtils.equals(c90444Zea.LIZJ, "LeLink")) {
            this.LIZIZ.LJIIL.d("PlayerController", "Lelink PlayerListener onCompletion");
            this.LIZIZ.LJFF();
        }
    }

    @Override // com.byted.cast.common.api.IPlayerListener
    public final void onLoading() {
        C90444Zea c90444Zea = this.LIZIZ.LJIIJJI;
        if (c90444Zea != null && TextUtils.equals(c90444Zea.LIZJ, "LeLink")) {
            this.LIZIZ.LJIIL.d("PlayerController", "Lelink PlayerListener onLoading");
            this.LIZIZ.LJIIJ();
        }
    }

    @Override // com.byted.cast.common.api.IPlayerListener
    public final void onPause() {
        C90444Zea c90444Zea = this.LIZIZ.LJIIJJI;
        if (c90444Zea != null && TextUtils.equals(c90444Zea.LIZJ, "LeLink")) {
            this.LIZIZ.LJIIL.d("PlayerController", "Lelink PlayerListener onPause");
            this.LIZIZ.LJIIJJI();
        }
    }

    @Override // com.byted.cast.common.api.IPlayerListener
    public final void onStart() {
        String str;
        C90444Zea c90444Zea = this.LIZIZ.LJIIJJI;
        if (c90444Zea != null && TextUtils.equals(c90444Zea.LIZJ, "LeLink")) {
            this.LIZIZ.LJIIL.d("PlayerController", "Lelink PlayerListener onStart");
            this.LIZIZ.LJIILJJIL();
            if (TextUtils.equals(this.LIZIZ.LJIIIZ, "STOPPED")) {
                PlayerInfo playerInfo = this.LIZIZ.LJIILLIIL;
                String str2 = "";
                if (playerInfo == null || playerInfo.getServiceInfo() == null) {
                    str = "";
                } else {
                    str = this.LIZIZ.LJIILLIIL.getServiceInfo().connectID;
                }
                C90442ZeY c90442ZeY = this.LIZIZ;
                CastMonitor castMonitor = c90442ZeY.LJIILIIL;
                PlayerInfo playerInfo2 = c90442ZeY.LJIILLIIL;
                if (playerInfo2 != null) {
                    str2 = playerInfo2.toString();
                }
                castMonitor.sendSourceEvent("ByteCast_Play_Success", str2, str);
                this.LIZIZ.LJIILIIL.getSourceMonitor().trackByteCastPlaySuccessProtocol("LeLink", str);
                this.LIZIZ.LJIILJJIL.getSourceMonitorUtils().trackByteCastPlaySuccessProtocol("LeLink", str);
                this.LIZ = false;
                Dispatcher.getInstance().printThreadPool(this.LIZIZ.LJIIZILJ, "source", "BDDLNA PlayerListener onStart");
            }
            this.LIZIZ.LJIIIZ = "PLAYING";
        }
    }

    @Override // com.byted.cast.common.api.IPlayerListener
    public final void onStop() {
        C90444Zea c90444Zea = this.LIZIZ.LJIIJJI;
        if (c90444Zea != null && TextUtils.equals(c90444Zea.LIZJ, "LeLink")) {
            this.LIZIZ.LJIIL.d("PlayerController", "Lelink PlayerListener onStop");
            this.LIZIZ.LJIILL();
        }
    }

    public C90811ZkV(C90442ZeY c90442ZeY) {
        this.LIZIZ = c90442ZeY;
    }

    @Override // com.byted.cast.common.api.IPlayerListener
    public final void onSeekComplete(long j) {
        C90444Zea c90444Zea = this.LIZIZ.LJIIJJI;
        if (c90444Zea != null && TextUtils.equals(c90444Zea.LIZJ, "LeLink")) {
            CastLogger castLogger = this.LIZIZ.LJIIL;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Lelink PlayerListener onSeekComplete position:");
            LIZ.append(j);
            castLogger.d("PlayerController", X1D.LIZIZ(LIZ));
            this.LIZIZ.LJIILIIL(j);
        }
    }

    @Override // com.byted.cast.common.api.IPlayerListener
    public final void onVolumeChanged(float f) {
        C90444Zea c90444Zea = this.LIZIZ.LJIIJJI;
        if (c90444Zea != null && TextUtils.equals(c90444Zea.LIZJ, "LeLink")) {
            CastLogger castLogger = this.LIZIZ.LJIIL;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Lelink PlayerListener onVolumeChanged percent:");
            LIZ.append(f);
            castLogger.d("PlayerController", X1D.LIZIZ(LIZ));
            this.LIZIZ.LJIILLIIL(f);
        }
    }

    @Override // com.byted.cast.common.api.IPlayerListener
    public final void onError(int i, int i2) {
        C90444Zea c90444Zea = this.LIZIZ.LJIIJJI;
        if (c90444Zea != null && TextUtils.equals(c90444Zea.LIZJ, "LeLink")) {
            CastLogger castLogger = this.LIZIZ.LJIIL;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Lelink PlayerListener onError what:");
            LIZ.append(i);
            LIZ.append(", extra:");
            LIZ.append(i2);
            castLogger.d("PlayerController", X1D.LIZIZ(LIZ));
            this.LIZIZ.LJIIIIZZ(i, i2);
        }
    }

    @Override // com.byted.cast.common.api.IPlayerListener
    public final void onInfo(int i, int i2) {
        C90444Zea c90444Zea = this.LIZIZ.LJIIJJI;
        if (c90444Zea != null && TextUtils.equals(c90444Zea.LIZJ, "LeLink")) {
            CastLogger castLogger = this.LIZIZ.LJIIL;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Lelink PlayerListener onInfo what:");
            LIZ.append(i);
            LIZ.append(", extra:");
            LIZ.append(i2);
            castLogger.d("PlayerController", X1D.LIZIZ(LIZ));
            this.LIZIZ.LJIIIZ(i, i2);
        }
    }

    @Override // com.byted.cast.common.api.IPlayerListener
    public final void onPositionUpdate(long j, long j2) {
        C90444Zea c90444Zea = this.LIZIZ.LJIIJJI;
        if (c90444Zea != null && TextUtils.equals(c90444Zea.LIZJ, "LeLink")) {
            CastLogger castLogger = this.LIZIZ.LJIIL;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Lelink PlayerListener onPositionUpdate duration:");
            LIZ.append(j);
            LIZ.append(", position:");
            LIZ.append(j2);
            castLogger.d("PlayerController", X1D.LIZIZ(LIZ));
            this.LIZIZ.LJIIL(j, j2);
            if (!this.LIZ && j > 0) {
                this.LIZ = true;
                this.LIZIZ.LJIILIIL.getSourceMonitor().trackVideoDuration("LeLink", j / 1000);
            }
        }
    }
}
