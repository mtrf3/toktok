package X;

import android.text.TextUtils;
import com.byted.cast.common.CastLogger;
import com.byted.cast.common.CastMonitor;
import com.byted.cast.common.Dispatcher;
import com.byted.cast.common.TeaEventTrack;
import com.byted.cast.common.api.PlayerInfo;
import com.byted.cast.common.bean.DramaBean;
import com.byted.cast.common.source.IPlayerListener;
import com.byted.cast.common.source.ServiceInfo;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.ZkU, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90810ZkU implements IPlayerListener {
    public boolean LIZ;
    public final /* synthetic */ C90442ZeY LIZIZ;

    @Override // com.byted.cast.common.source.IPlayerListener
    public final void onCompletion() {
        C90444Zea c90444Zea = this.LIZIZ.LJIIJJI;
        if (c90444Zea != null && TextUtils.equals(c90444Zea.LIZJ, "BDDLNA")) {
            this.LIZIZ.LJIIL.d("PlayerController", "BDDLNA PlayerListener onCompletion");
            this.LIZIZ.LJFF();
        }
    }

    @Override // com.byted.cast.common.source.IPlayerListener
    public final void onLoading() {
        C90444Zea c90444Zea = this.LIZIZ.LJIIJJI;
        if (c90444Zea != null && TextUtils.equals(c90444Zea.LIZJ, "BDDLNA")) {
            this.LIZIZ.LJIIL.d("PlayerController", "BDDLNA PlayerListener onLoading");
            this.LIZIZ.LJIIJ();
            TeaEventTrack teaEventTrack = this.LIZIZ.LJIILJJIL;
            if (teaEventTrack != null) {
                teaEventTrack.trackSourceEvent(TeaEventTrack.BYTECASTSDK_INDICATOR_PLAY_PROTOCOL, new C90438ZeU());
            }
        }
    }

    @Override // com.byted.cast.common.source.IPlayerListener
    public final void onPause() {
        C90444Zea c90444Zea = this.LIZIZ.LJIIJJI;
        if (c90444Zea != null && TextUtils.equals(c90444Zea.LIZJ, "BDDLNA")) {
            this.LIZIZ.LJIIL.d("PlayerController", "BDDLNA PlayerListener onPause");
            this.LIZIZ.LJIIJJI();
            this.LIZIZ.LJIIIZ = "PAUSED_PLAYBACK";
        }
    }

    @Override // com.byted.cast.common.source.IPlayerListener
    public final void onStart() {
        String str;
        C90444Zea c90444Zea = this.LIZIZ.LJIIJJI;
        if (c90444Zea != null && TextUtils.equals(c90444Zea.LIZJ, "BDDLNA")) {
            this.LIZIZ.LJIIL.d("PlayerController", "BDDLNA PlayerListener onStart");
            this.LIZIZ.LJIILJJIL();
            C90442ZeY c90442ZeY = this.LIZIZ;
            if (c90442ZeY.LJIIJ) {
                c90442ZeY.LJIIJ = false;
                PlayerInfo playerInfo = c90442ZeY.LJIILLIIL;
                String str2 = "";
                if (playerInfo == null || playerInfo.getServiceInfo() == null) {
                    str = "";
                } else {
                    str = this.LIZIZ.LJIILLIIL.getServiceInfo().connectID;
                }
                C90442ZeY c90442ZeY2 = this.LIZIZ;
                CastMonitor castMonitor = c90442ZeY2.LJIILIIL;
                PlayerInfo playerInfo2 = c90442ZeY2.LJIILLIIL;
                if (playerInfo2 != null) {
                    str2 = playerInfo2.toString();
                }
                castMonitor.sendSourceEvent("ByteCast_Play_Success", str2, str);
                this.LIZIZ.LJIILIIL.getSourceMonitor().trackByteCastPlaySuccessProtocol("BDDLNA", str);
                this.LIZIZ.LJIILJJIL.getSourceMonitorUtils().trackByteCastPlaySuccessProtocol("BDDLNA", str);
                this.LIZ = false;
                Dispatcher.getInstance().printThreadPool(this.LIZIZ.LJIIZILJ, "source", "BDDLNA PlayerListener onStart");
            }
            this.LIZIZ.LJIIIZ = "PLAYING";
        }
    }

    @Override // com.byted.cast.common.source.IPlayerListener
    public final void onStop() {
        C90444Zea c90444Zea = this.LIZIZ.LJIIJJI;
        if (c90444Zea != null && TextUtils.equals(c90444Zea.LIZJ, "BDDLNA")) {
            this.LIZIZ.LJIIL.d("PlayerController", "BDDLNA PlayerListener onStop");
            this.LIZIZ.LJIILL();
        }
    }

    public C90810ZkU(C90442ZeY c90442ZeY) {
        this.LIZIZ = c90442ZeY;
    }

    @Override // com.byted.cast.common.source.IPlayerListener
    public final void onSeekComplete(long j) {
        C90444Zea c90444Zea = this.LIZIZ.LJIIJJI;
        if (c90444Zea != null && TextUtils.equals(c90444Zea.LIZJ, "BDDLNA")) {
            CastLogger castLogger = this.LIZIZ.LJIIL;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("BDDLNA PlayerListener onSeekComplete position:");
            LIZ.append(j);
            castLogger.d("PlayerController", X1D.LIZIZ(LIZ));
            this.LIZIZ.LJIILIIL(j);
        }
    }

    @Override // com.byted.cast.common.source.IPlayerListener
    public final void onVolumeChanged(float f) {
        C90444Zea c90444Zea = this.LIZIZ.LJIIJJI;
        if (c90444Zea != null && TextUtils.equals(c90444Zea.LIZJ, "BDDLNA")) {
            CastLogger castLogger = this.LIZIZ.LJIIL;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("BDDLNA PlayerListener onVolumeChanged percent:");
            LIZ.append(f);
            castLogger.d("PlayerController", X1D.LIZIZ(LIZ));
            this.LIZIZ.LJIILLIIL(f);
        }
    }

    @Override // com.byted.cast.common.source.IPlayerListener
    public final void onDramaId(ServiceInfo serviceInfo, String str) {
        if (str != null) {
            CastLogger castLogger = this.LIZIZ.LJIIL;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("BDDLNA PlayerListener onDramaId id:");
            LIZ.append(str);
            castLogger.d("PlayerController", X1D.LIZIZ(LIZ));
            this.LIZIZ.LJI(serviceInfo, str);
        }
    }

    @Override // com.byted.cast.common.source.IPlayerListener
    public final void onDramaList(ServiceInfo serviceInfo, DramaBean[] dramaBeanArr) {
        if (dramaBeanArr != null) {
            CastLogger castLogger = this.LIZIZ.LJIIL;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("BDDLNA PlayerListener onDramaList dramaBeans:");
            LIZ.append(Arrays.toString(dramaBeanArr));
            castLogger.d("PlayerController", X1D.LIZIZ(LIZ));
            this.LIZIZ.LJII(serviceInfo, dramaBeanArr);
        }
    }

    @Override // com.byted.cast.common.source.IPlayerListener
    public final void onError(int i, String str) {
        C90444Zea c90444Zea = this.LIZIZ.LJIIJJI;
        if (c90444Zea != null && TextUtils.equals(c90444Zea.LIZJ, "BDDLNA")) {
            CastLogger castLogger = this.LIZIZ.LJIIL;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("BDDLNA PlayerListener onError err:");
            LIZ.append(i);
            LIZ.append(", errDesc:");
            LIZ.append(str);
            castLogger.d("PlayerController", X1D.LIZIZ(LIZ));
            Iterator it = ((CopyOnWriteArraySet) this.LIZIZ.LJIILL).iterator();
            while (it.hasNext()) {
                IPlayerListener iPlayerListener = (IPlayerListener) it.next();
                if (iPlayerListener != null) {
                    iPlayerListener.onError(i, str);
                }
            }
        }
    }

    @Override // com.byted.cast.common.source.IPlayerListener
    public final void onInfo(int i, int i2) {
        C90444Zea c90444Zea = this.LIZIZ.LJIIJJI;
        if (c90444Zea != null && TextUtils.equals(c90444Zea.LIZJ, "BDDLNA")) {
            CastLogger castLogger = this.LIZIZ.LJIIL;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("BDDLNA PlayerListener onInfo what:");
            LIZ.append(i);
            LIZ.append(", extra:");
            LIZ.append(i2);
            castLogger.d("PlayerController", X1D.LIZIZ(LIZ));
            this.LIZIZ.LJIIIZ(i, i2);
        }
    }

    @Override // com.byted.cast.common.source.IPlayerListener
    public final void onPositionUpdate(long j, long j2) {
        C90444Zea c90444Zea = this.LIZIZ.LJIIJJI;
        if (c90444Zea != null && TextUtils.equals(c90444Zea.LIZJ, "BDDLNA")) {
            CastLogger castLogger = this.LIZIZ.LJIIL;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("BDDLNA PlayerListener onPositionUpdate duration:");
            LIZ.append(j);
            LIZ.append(", position:");
            LIZ.append(j2);
            castLogger.d("PlayerController", X1D.LIZIZ(LIZ));
            this.LIZIZ.LJIIL(j, j2);
            if (!this.LIZ && j > 0) {
                this.LIZ = true;
                this.LIZIZ.LJIILIIL.getSourceMonitor().trackVideoDuration("BDDLNA", j / 1000);
            }
        }
    }

    @Override // com.byted.cast.common.source.IPlayerListener
    public final void onError(int i, int i2) {
        C90444Zea c90444Zea = this.LIZIZ.LJIIJJI;
        if (c90444Zea != null && TextUtils.equals(c90444Zea.LIZJ, "BDDLNA")) {
            CastLogger castLogger = this.LIZIZ.LJIIL;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("BDDLNA PlayerListener onError what:");
            LIZ.append(i);
            LIZ.append(", extra:");
            LIZ.append(i2);
            castLogger.d("PlayerController", X1D.LIZIZ(LIZ));
            this.LIZIZ.LJIIIIZZ(i, i2);
        }
    }
}
