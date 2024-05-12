package X;

import Y.IDHandlerS26S0100000_24;
import Y.IDRunnableS86S0100000_24;
import android.os.Handler;
import android.text.TextUtils;
import com.byted.cast.common.CastLogger;
import com.byted.cast.common.CastMonitor;
import com.byted.cast.common.ContextManager;
import com.byted.cast.common.Dispatcher;
import com.byted.cast.common.SourceMonitorUtils;
import com.byted.cast.common.TeaEventTrack;
import com.byted.cast.common.api.ICastSource;
import com.byted.cast.common.api.IResultListener;
import com.byted.cast.common.api.PlayerInfo;
import com.byted.cast.common.bean.DramaBean;
import com.byted.cast.common.config.IMediaInfoListener;
import com.byted.cast.common.source.IPlayerListener;
import com.byted.cast.common.source.ServiceInfo;
import com.byted.cast.common.utils.PlayerInfoUtils;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.ZeY, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90442ZeY {
    public ICastSource LIZ;
    public ICastSource LIZIZ;
    public ICastSource LIZJ;
    public ICastSource LIZLLL;
    public ICastSource LJ;
    public C90445Zeb LJFF;
    public final java.util.Map<String, ICastSource> LJI;
    public final List<String> LJII;
    public IMediaInfoListener LJIIIIZZ;
    public C90444Zea LJIIJJI;
    public CastLogger LJIIL;
    public CastMonitor LJIILIIL;
    public final TeaEventTrack LJIILJJIL;
    public final ContextManager.CastContext LJIIZILJ;
    public RunnableC90441ZeX LJIJ;
    public String LJIIIZ = "STOPPED";
    public boolean LJIIJ = true;
    public final java.util.Set<IPlayerListener> LJIILL = new CopyOnWriteArraySet();
    public PlayerInfo LJIILLIIL = null;
    public final Object LJIJI = new Object();
    public final Handler LJIJJ = new IDHandlerS26S0100000_24(this, Dispatcher.getInstance().getByteCastThreadLooper(), 3);

    public final void LIZJ() {
        ICastSource iCastSource;
        this.LJIIL.d("PlayerController", "addVolume");
        if (this.LJIIJJI == null) {
            return;
        }
        this.LJIILIIL.sendSourceEvent("bytecast_volume", "addVolume");
        synchronized (this.LJI) {
            for (String str : this.LJI.keySet()) {
                if (TextUtils.equals(this.LJIIJJI.LIZJ, str) && (iCastSource = this.LJI.get(str)) != null) {
                    CastLogger castLogger = this.LJIIL;
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append(str);
                    LIZ.append(" addVolume");
                    castLogger.d("PlayerController", X1D.LIZIZ(LIZ));
                    iCastSource.addVolume();
                    return;
                }
            }
        }
    }

    public final String LIZLLL() {
        String str = this.LJIILIIL.sourceConnectID;
        C90444Zea c90444Zea = this.LJIIJJI;
        if (c90444Zea == null) {
            return str;
        }
        ServiceInfo serviceInfo = c90444Zea.LJ;
        if (serviceInfo == null) {
            return str;
        }
        String str2 = serviceInfo.connectID;
        if (str2 == null) {
            return str;
        }
        return str2;
    }

    public final boolean LJ() {
        ServiceInfo serviceInfo;
        C90444Zea c90444Zea = this.LJIIJJI;
        if (c90444Zea == null || (serviceInfo = c90444Zea.LJ) == null) {
            this.LJIIL.w("PlayerController", "isAllowDramaCmd, currentServiceInfoWrapper or serviceInfo is null.");
            LJIIIIZZ(210120, 210129);
            return false;
        }
        if (!serviceInfo.isSupportPlayList) {
            this.LJIIL.w("PlayerController", "isAllowDramaCmd, connected device doesn't support drama list.");
            LJIIIIZZ(210120, 210121);
        }
        return !serviceInfo.isSupportPlayList;
    }

    public final void LJFF() {
        Iterator it = ((CopyOnWriteArraySet) this.LJIILL).iterator();
        while (it.hasNext()) {
            IPlayerListener iPlayerListener = (IPlayerListener) it.next();
            if (iPlayerListener != null) {
                iPlayerListener.onCompletion();
            }
        }
    }

    public final void LJIIJ() {
        Iterator it = ((CopyOnWriteArraySet) this.LJIILL).iterator();
        while (it.hasNext()) {
            IPlayerListener iPlayerListener = (IPlayerListener) it.next();
            if (iPlayerListener != null) {
                iPlayerListener.onLoading();
            }
        }
    }

    public final void LJIIJJI() {
        Iterator it = ((CopyOnWriteArraySet) this.LJIILL).iterator();
        while (it.hasNext()) {
            IPlayerListener iPlayerListener = (IPlayerListener) it.next();
            if (iPlayerListener != null) {
                iPlayerListener.onPause();
            }
        }
    }

    public final void LJIILJJIL() {
        Iterator it = ((CopyOnWriteArraySet) this.LJIILL).iterator();
        while (it.hasNext()) {
            IPlayerListener iPlayerListener = (IPlayerListener) it.next();
            if (iPlayerListener != null) {
                iPlayerListener.onStart();
            }
        }
    }

    public final void LJIILL() {
        Iterator it = ((CopyOnWriteArraySet) this.LJIILL).iterator();
        while (it.hasNext()) {
            IPlayerListener iPlayerListener = (IPlayerListener) it.next();
            if (iPlayerListener != null) {
                iPlayerListener.onStop();
            }
        }
    }

    public final void LJIIZILJ() {
        ICastSource iCastSource;
        this.LJIIL.i("PlayerController", "pause");
        if (this.LJIIJJI == null) {
            return;
        }
        this.LJIILIIL.sendSourceEvent("ByteCast_Pause", "");
        synchronized (this.LJI) {
            for (String str : this.LJI.keySet()) {
                if (TextUtils.equals(this.LJIIJJI.LIZJ, str) && (iCastSource = this.LJI.get(str)) != null) {
                    CastLogger castLogger = this.LJIIL;
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("pause use ");
                    LIZ.append(str);
                    castLogger.i("PlayerController", X1D.LIZIZ(LIZ));
                    iCastSource.pause();
                    return;
                }
            }
        }
    }

    public final void LJIJJ() {
        ICastSource iCastSource;
        this.LJIIL.i("PlayerController", "resume");
        this.LJIIIZ = "PLAYING";
        if (this.LJIIJJI == null) {
            return;
        }
        this.LJIILIIL.sendSourceEvent("ByteCast_Resume", "");
        synchronized (this.LJI) {
            for (String str : this.LJI.keySet()) {
                if (TextUtils.equals(this.LJIIJJI.LIZJ, str) && (iCastSource = this.LJI.get(str)) != null) {
                    CastLogger castLogger = this.LJIIL;
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("resume use ");
                    LIZ.append(str);
                    castLogger.i("PlayerController", X1D.LIZIZ(LIZ));
                    iCastSource.resume();
                    return;
                }
            }
        }
    }

    public final void LJJ() {
        ICastSource iCastSource;
        this.LJIIL.d("PlayerController", "subVolume");
        if (this.LJIIJJI == null) {
            return;
        }
        this.LJIILIIL.sendSourceEvent("bytecast_volume", "subVolume");
        synchronized (this.LJI) {
            for (String str : this.LJI.keySet()) {
                if (TextUtils.equals(this.LJIIJJI.LIZJ, str) && (iCastSource = this.LJI.get(str)) != null) {
                    CastLogger castLogger = this.LJIIL;
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append(str);
                    LIZ.append(" subVolume");
                    castLogger.d("PlayerController", X1D.LIZIZ(LIZ));
                    iCastSource.subVolume();
                    return;
                }
            }
        }
    }

    public final void LIZIZ(IPlayerListener iPlayerListener) {
        if (((CopyOnWriteArraySet) this.LJIILL).isEmpty()) {
            ICastSource iCastSource = this.LIZ;
            if (iCastSource != null) {
                iCastSource.setPlayerListener(new C90809ZkT(this));
            }
            ICastSource iCastSource2 = this.LIZIZ;
            if (iCastSource2 != null) {
                iCastSource2.setPlayerListener(new C90810ZkU(this));
            }
            ICastSource iCastSource3 = this.LIZJ;
            if (iCastSource3 != null) {
                iCastSource3.setPlayerListener(new C90811ZkV(this));
            }
            ICastSource iCastSource4 = this.LIZLLL;
            if (iCastSource4 != null) {
                iCastSource4.setPlayerListener(new C90812ZkW(this));
            }
            ICastSource iCastSource5 = this.LJ;
            if (iCastSource5 != null) {
                iCastSource5.setPlayerListener(new C90813ZkX(this));
            }
        }
        ((CopyOnWriteArraySet) this.LJIILL).add(iPlayerListener);
    }

    public final void LJIILIIL(long j) {
        Iterator it = ((CopyOnWriteArraySet) this.LJIILL).iterator();
        while (it.hasNext()) {
            IPlayerListener iPlayerListener = (IPlayerListener) it.next();
            if (iPlayerListener != null) {
                iPlayerListener.onSeekComplete(j);
            }
        }
    }

    public final void LJIILLIIL(float f) {
        Iterator it = ((CopyOnWriteArraySet) this.LJIILL).iterator();
        while (it.hasNext()) {
            IPlayerListener iPlayerListener = (IPlayerListener) it.next();
            if (iPlayerListener != null) {
                iPlayerListener.onVolumeChanged(f);
            }
        }
    }

    public final void LJIJ(PlayerInfo playerInfo) {
        String str;
        ServiceInfo serviceInfo;
        this.LJIIIZ = "STOPPED";
        this.LJIIL.i("PlayerController", "_START_PLAY play playerInfo");
        ServiceInfo serviceInfo2 = playerInfo.getServiceInfo();
        if (serviceInfo2 != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("byteCast_");
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("");
            LIZ2.append(serviceInfo2.ip);
            LIZ2.append(System.currentTimeMillis());
            LIZ.append(com.byted.cast.common.MD5.hexdigest(X1D.LIZIZ(LIZ2)));
            String LIZIZ = X1D.LIZIZ(LIZ);
            this.LJIILIIL.sourceConnectID = LIZIZ;
            this.LJIILJJIL.connectId = LIZIZ;
            serviceInfo2.connectID = LIZIZ;
        }
        CastLogger castLogger = this.LJIIL;
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("initConnectID: ");
        LIZ3.append(this.LJIILIIL.sourceConnectID);
        castLogger.d("PlayerController", X1D.LIZIZ(LIZ3));
        if (playerInfo.getServiceInfo() != null) {
            str = playerInfo.getServiceInfo().connectID;
        } else {
            str = "";
        }
        CastMonitor castMonitor = this.LJIILIIL;
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append("playInfo:");
        LIZ4.append(playerInfo);
        castMonitor.sendByteCastSourceEvent("ByteCast_Play", X1D.LIZIZ(LIZ4), playerInfo.toString(), str);
        C90445Zeb c90445Zeb = this.LJFF;
        if (c90445Zeb != null) {
            this.LJIIJJI = c90445Zeb.LIZJ(playerInfo.getServiceInfo());
        }
        if (this.LJIIJJI == null) {
            Dispatcher.getInstance().runOnMainThread(new RunnableC90195ZaZ(1, this));
            CastLogger castLogger2 = this.LJIIL;
            StringBuilder LIZ5 = X1D.LIZ();
            LIZ5.append("_START_PLAY play we cannot find device:");
            LIZ5.append(playerInfo.getServiceInfo());
            castLogger2.w("PlayerController", X1D.LIZIZ(LIZ5));
            CastMonitor castMonitor2 = this.LJIILIIL;
            StringBuilder LIZ6 = X1D.LIZ();
            LIZ6.append("play we cannot find device playerInfo:");
            LIZ6.append(playerInfo);
            castMonitor2.sendSourceEvent("ByteCast_Play_Failure", X1D.LIZIZ(LIZ6), str);
            return;
        }
        CastLogger castLogger3 = this.LJIIL;
        StringBuilder LIZ7 = X1D.LIZ();
        LIZ7.append("currentServiceInfoWrapper: ");
        LIZ7.append(this.LJIIJJI);
        castLogger3.d("PlayerController", X1D.LIZIZ(LIZ7));
        ServiceInfo serviceInfo3 = this.LJIIJJI.LJ;
        if (serviceInfo3 != null) {
            serviceInfo = serviceInfo3.deepCopy();
            if (serviceInfo != null) {
                serviceInfo.connectID = str;
            }
        } else {
            serviceInfo = null;
        }
        playerInfo.setServiceInfo(serviceInfo);
        this.LJIILLIIL = playerInfo;
        synchronized (this.LJI) {
            for (String str2 : this.LJI.keySet()) {
                if (TextUtils.equals(this.LJIIJJI.LIZJ, str2)) {
                    String urlByProtocolType = PlayerInfoUtils.getUrlByProtocolType(playerInfo, str2);
                    this.LJIILIIL.getSourceMonitor().trackByteCastPlayProtocol(str2, urlByProtocolType, str);
                    this.LJIILJJIL.getSourceMonitorUtils().trackByteCastPlayProtocol(str2, urlByProtocolType, str);
                    ICastSource iCastSource = this.LJI.get(str2);
                    if (iCastSource != null) {
                        CastLogger castLogger4 = this.LJIIL;
                        StringBuilder LIZ8 = X1D.LIZ();
                        LIZ8.append("_START_PLAY play playerInfo use ");
                        LIZ8.append(str2);
                        castLogger4.i("PlayerController", X1D.LIZIZ(LIZ8));
                        if ("BDDLNA".equals(str2)) {
                            this.LJIIJ = true;
                        }
                        iCastSource.play(playerInfo);
                        return;
                    }
                }
            }
            Dispatcher.getInstance().runOnMainThread(new IDRunnableS86S0100000_24(this, 21));
        }
    }

    public final void LJIJI(String str) {
        ICastSource iCastSource;
        CastLogger castLogger = this.LJIIL;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("start playDramaId, dramaId: ");
        LIZ.append(str);
        castLogger.i("PlayerController", X1D.LIZIZ(LIZ));
        if (TextUtils.isEmpty(str) || LJ() || this.LJIIJJI == null) {
            return;
        }
        synchronized (this.LJI) {
            for (String str2 : this.LJI.keySet()) {
                if (TextUtils.equals(this.LJIIJJI.LIZJ, str2) && (iCastSource = this.LJI.get(str2)) != null) {
                    CastLogger castLogger2 = this.LJIIL;
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("playDramaId use ");
                    LIZ2.append(str2);
                    castLogger2.i("PlayerController", X1D.LIZIZ(LIZ2));
                    iCastSource.playDramaId(str);
                    CastMonitor castMonitor = this.LJIILIIL;
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append(str2);
                    LIZ3.append(" play DramaId:");
                    LIZ3.append(str);
                    castMonitor.sendSourceEvent("bytecast_drama_play", X1D.LIZIZ(LIZ3), LIZLLL());
                    SourceMonitorUtils sourceMonitor = this.LJIILIIL.getSourceMonitor();
                    StringBuilder LIZ4 = X1D.LIZ();
                    LIZ4.append(" play DramaId:");
                    LIZ4.append(str);
                    sourceMonitor.trackByteCastStartDramaProtocol(str2, "play", X1D.LIZIZ(LIZ4));
                    SourceMonitorUtils sourceMonitorUtils = this.LJIILJJIL.getSourceMonitorUtils();
                    StringBuilder LIZ5 = X1D.LIZ();
                    LIZ5.append(" play DramaId:");
                    LIZ5.append(str);
                    sourceMonitorUtils.trackByteCastStartDramaProtocol(str2, "play", X1D.LIZIZ(LIZ5));
                    return;
                }
            }
        }
    }

    public final void LJIJJLI(long j) {
        CastLogger castLogger = this.LJIIL;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("seekTo:");
        LIZ.append(j);
        LIZ.append(", tag:");
        LIZ.append(0);
        castLogger.d("PlayerController", X1D.LIZIZ(LIZ));
        if (this.LJIIJJI == null) {
            return;
        }
        this.LJIILIIL.sendSourceEvent("bytecast_seek", "");
        synchronized (this.LJIJI) {
            RunnableC90441ZeX runnableC90441ZeX = this.LJIJ;
            if (runnableC90441ZeX == null) {
                RunnableC90441ZeX runnableC90441ZeX2 = new RunnableC90441ZeX(this, j);
                this.LJIJ = runnableC90441ZeX2;
                this.LJIJJ.postDelayed(runnableC90441ZeX2, 200L);
            } else {
                runnableC90441ZeX.LJLIL = j;
                runnableC90441ZeX.LJLILLLLZI = 0;
            }
        }
    }

    public final void LJI(ServiceInfo serviceInfo, String str) {
        Iterator it = ((CopyOnWriteArraySet) this.LJIILL).iterator();
        while (it.hasNext()) {
            IPlayerListener iPlayerListener = (IPlayerListener) it.next();
            if (iPlayerListener != null) {
                iPlayerListener.onDramaId(serviceInfo, str);
            }
        }
    }

    public final void LJII(ServiceInfo serviceInfo, DramaBean[] dramaBeanArr) {
        Iterator it = ((CopyOnWriteArraySet) this.LJIILL).iterator();
        while (it.hasNext()) {
            IPlayerListener iPlayerListener = (IPlayerListener) it.next();
            if (iPlayerListener != null) {
                iPlayerListener.onDramaList(serviceInfo, dramaBeanArr);
            }
        }
    }

    public final void LJIIIIZZ(int i, int i2) {
        Iterator it = ((CopyOnWriteArraySet) this.LJIILL).iterator();
        while (it.hasNext()) {
            IPlayerListener iPlayerListener = (IPlayerListener) it.next();
            if (iPlayerListener != null) {
                iPlayerListener.onError(i, i2);
            }
        }
    }

    public final void LJIIIZ(int i, int i2) {
        Iterator it = ((CopyOnWriteArraySet) this.LJIILL).iterator();
        while (it.hasNext()) {
            IPlayerListener iPlayerListener = (IPlayerListener) it.next();
            if (iPlayerListener != null) {
                iPlayerListener.onInfo(i, i2);
            }
        }
    }

    public final void LJIIL(long j, long j2) {
        Iterator it = ((CopyOnWriteArraySet) this.LJIILL).iterator();
        while (it.hasNext()) {
            IPlayerListener iPlayerListener = (IPlayerListener) it.next();
            if (iPlayerListener != null) {
                iPlayerListener.onPositionUpdate(j, j2);
            }
        }
    }

    public final void LJIL(int i, IResultListener iResultListener) {
        ICastSource iCastSource;
        this.LJIIL.i("PlayerController", "start setRepeatMode");
        if (LJ() || this.LJIIJJI == null) {
            return;
        }
        synchronized (this.LJI) {
            for (String str : this.LJI.keySet()) {
                if (TextUtils.equals(this.LJIIJJI.LIZJ, str) && (iCastSource = this.LJI.get(str)) != null) {
                    CastLogger castLogger = this.LJIIL;
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("setRepeatMode use ");
                    LIZ.append(str);
                    castLogger.i("PlayerController", X1D.LIZIZ(LIZ));
                    iCastSource.setRepeatMode(i, iResultListener);
                    return;
                }
            }
        }
    }

    public C90442ZeY(ContextManager.CastContext castContext, java.util.Map<String, ICastSource> map, List<String> list) {
        this.LJIIZILJ = castContext;
        this.LJI = map;
        this.LJIILJJIL = ContextManager.getTeaEventTrack(castContext);
        this.LJII = list;
    }

    public final void LIZ(DramaBean[] dramaBeanArr, String str, IResultListener iResultListener) {
        ICastSource iCastSource;
        this.LJIIL.i("PlayerController", "start addDramaList");
        if (LJ() || this.LJIIJJI == null) {
            return;
        }
        synchronized (this.LJI) {
            for (String str2 : this.LJI.keySet()) {
                if (TextUtils.equals(this.LJIIJJI.LIZJ, str2) && (iCastSource = this.LJI.get(str2)) != null) {
                    CastLogger castLogger = this.LJIIL;
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("addDramaList use ");
                    LIZ.append(str2);
                    castLogger.i("PlayerController", X1D.LIZIZ(LIZ));
                    iCastSource.addDramaList(dramaBeanArr, str, iResultListener);
                    return;
                }
            }
        }
    }
}
