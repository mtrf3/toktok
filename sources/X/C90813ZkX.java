package X;

import android.text.TextUtils;
import com.byted.cast.common.CastLogger;
import com.byted.cast.common.CastMonitor;
import com.byted.cast.common.Dispatcher;
import com.byted.cast.common.TeaEventTrack;
import com.byted.cast.common.api.IPlayerListener;
import com.byted.cast.common.api.PlayerInfo;
import com.byted.cast.common.bean.DramaBean;
import com.byted.cast.common.source.ServiceInfo;
import com.byted.cast.common.source.Statistics;
import java.util.Arrays;

/* renamed from: X.ZkX, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90813ZkX implements IPlayerListener {
    public final /* synthetic */ C90442ZeY LIZ;

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
        C90444Zea c90444Zea = this.LIZ.LJIIJJI;
        if (c90444Zea != null && TextUtils.equals(c90444Zea.LIZJ, "BDCloud")) {
            this.LIZ.LJIIL.d("PlayerController", "BDCloud PlayerListener onCompletion");
            this.LIZ.LJFF();
        }
    }

    @Override // com.byted.cast.common.api.IPlayerListener
    public final void onLoading() {
        C90444Zea c90444Zea = this.LIZ.LJIIJJI;
        if (c90444Zea != null && TextUtils.equals(c90444Zea.LIZJ, "BDCloud")) {
            this.LIZ.LJIIL.d("PlayerController", "BDCloud PlayerListener onLoading");
            this.LIZ.LJIIJ();
            TeaEventTrack teaEventTrack = this.LIZ.LJIILJJIL;
            if (teaEventTrack != null) {
                teaEventTrack.trackSourceEvent(TeaEventTrack.BYTECASTSDK_INDICATOR_PLAY_PROTOCOL, new C90440ZeW());
            }
        }
    }

    @Override // com.byted.cast.common.api.IPlayerListener
    public final void onPause() {
        C90444Zea c90444Zea = this.LIZ.LJIIJJI;
        if (c90444Zea != null && TextUtils.equals(c90444Zea.LIZJ, "BDCloud")) {
            this.LIZ.LJIIL.d("PlayerController", "BDCloud PlayerListener onPause");
            this.LIZ.LJIIJJI();
            this.LIZ.LJIIIZ = "PAUSED_PLAYBACK";
        }
    }

    @Override // com.byted.cast.common.api.IPlayerListener
    public final void onStart() {
        String str;
        C90444Zea c90444Zea = this.LIZ.LJIIJJI;
        if (c90444Zea != null && TextUtils.equals(c90444Zea.LIZJ, "BDCloud")) {
            this.LIZ.LJIIL.d("PlayerController", "BDCloud PlayerListener onStart");
            this.LIZ.LJIILJJIL();
            if (TextUtils.equals(this.LIZ.LJIIIZ, "STOPPED")) {
                C90442ZeY c90442ZeY = this.LIZ;
                CastMonitor castMonitor = c90442ZeY.LJIILIIL;
                PlayerInfo playerInfo = c90442ZeY.LJIILLIIL;
                if (playerInfo == null) {
                    str = "";
                } else {
                    str = playerInfo.toString();
                }
                castMonitor.sendSourceEvent("ByteCast_Play_Success", str);
                this.LIZ.LJIILIIL.getSourceMonitor().trackByteCastPlaySuccessProtocol("BDCloud", "");
                this.LIZ.LJIILJJIL.getSourceMonitorUtils().trackByteCastPlaySuccessProtocol("BDCloud", "");
            }
            this.LIZ.LJIIIZ = "PLAYING";
            Dispatcher.getInstance().printThreadPool(this.LIZ.LJIIZILJ, "source", "BDCloud PlayerListener onStart");
        }
    }

    @Override // com.byted.cast.common.api.IPlayerListener
    public final void onStop() {
        C90444Zea c90444Zea = this.LIZ.LJIIJJI;
        if (c90444Zea != null && TextUtils.equals(c90444Zea.LIZJ, "BDCloud")) {
            this.LIZ.LJIIL.d("PlayerController", "BDCloud PlayerListener onStop");
            this.LIZ.LJIILL();
        }
    }

    public C90813ZkX(C90442ZeY c90442ZeY) {
        this.LIZ = c90442ZeY;
    }

    @Override // com.byted.cast.common.api.IPlayerListener
    public final void onSeekComplete(long j) {
        C90444Zea c90444Zea = this.LIZ.LJIIJJI;
        if (c90444Zea != null && TextUtils.equals(c90444Zea.LIZJ, "BDCloud")) {
            CastLogger castLogger = this.LIZ.LJIIL;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("BDCloud PlayerListener onSeekComplete position:");
            LIZ.append(j);
            castLogger.d("PlayerController", X1D.LIZIZ(LIZ));
            this.LIZ.LJIILIIL(j);
        }
    }

    @Override // com.byted.cast.common.api.IPlayerListener
    public final void onVolumeChanged(float f) {
        C90444Zea c90444Zea = this.LIZ.LJIIJJI;
        if (c90444Zea != null && TextUtils.equals(c90444Zea.LIZJ, "BDCloud")) {
            CastLogger castLogger = this.LIZ.LJIIL;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("BDCloud PlayerListener onVolumeChanged percent:");
            LIZ.append(f);
            castLogger.d("PlayerController", X1D.LIZIZ(LIZ));
            this.LIZ.LJIILLIIL(f);
        }
    }

    @Override // com.byted.cast.common.api.IPlayerListener
    public final void onDramaId(ServiceInfo serviceInfo, String str) {
        if (str != null) {
            CastLogger castLogger = this.LIZ.LJIIL;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("BDCloud PlayerListener onDramaId id:");
            LIZ.append(str);
            castLogger.d("PlayerController", X1D.LIZIZ(LIZ));
            this.LIZ.LJI(serviceInfo, str);
        }
    }

    @Override // com.byted.cast.common.api.IPlayerListener
    public final void onDramaList(ServiceInfo serviceInfo, DramaBean[] dramaBeanArr) {
        if (dramaBeanArr != null) {
            CastLogger castLogger = this.LIZ.LJIIL;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("BDCloud PlayerListener onDramaList dramaBeans:");
            LIZ.append(Arrays.toString(dramaBeanArr));
            castLogger.d("PlayerController", X1D.LIZIZ(LIZ));
            this.LIZ.LJII(serviceInfo, dramaBeanArr);
        }
    }

    @Override // com.byted.cast.common.api.IPlayerListener
    public final void onError(int i, int i2) {
        C90444Zea c90444Zea = this.LIZ.LJIIJJI;
        if (c90444Zea != null && TextUtils.equals(c90444Zea.LIZJ, "BDCloud")) {
            CastLogger castLogger = this.LIZ.LJIIL;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("BDCloud PlayerListener onError what:");
            LIZ.append(i);
            LIZ.append(", extra:");
            LIZ.append(i2);
            castLogger.d("PlayerController", X1D.LIZIZ(LIZ));
            this.LIZ.LJIIIIZZ(i, i2);
        }
    }

    @Override // com.byted.cast.common.api.IPlayerListener
    public final void onInfo(int i, int i2) {
        C90444Zea c90444Zea = this.LIZ.LJIIJJI;
        if (c90444Zea != null && TextUtils.equals(c90444Zea.LIZJ, "BDCloud")) {
            CastLogger castLogger = this.LIZ.LJIIL;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("BDCloud PlayerListener onInfo what:");
            LIZ.append(i);
            LIZ.append(", extra:");
            LIZ.append(i2);
            castLogger.d("PlayerController", X1D.LIZIZ(LIZ));
            this.LIZ.LJIIIZ(i, i2);
        }
    }

    @Override // com.byted.cast.common.api.IPlayerListener
    public final void onPositionUpdate(long j, long j2) {
        C90444Zea c90444Zea = this.LIZ.LJIIJJI;
        if (c90444Zea != null && TextUtils.equals(c90444Zea.LIZJ, "BDCloud")) {
            CastLogger castLogger = this.LIZ.LJIIL;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("BDCloud PlayerListener onPositionUpdate duration:");
            LIZ.append(j);
            LIZ.append(", position:");
            LIZ.append(j2);
            castLogger.d("PlayerController", X1D.LIZIZ(LIZ));
            this.LIZ.LJIIL(j, j2);
        }
    }
}
