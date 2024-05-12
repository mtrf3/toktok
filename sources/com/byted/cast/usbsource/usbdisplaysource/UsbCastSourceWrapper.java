package com.byted.cast.usbsource.usbdisplaysource;

import X.X1D;
import X.ZZT;
import android.content.Context;
import android.media.projection.MediaProjection;
import android.net.Uri;
import android.view.Surface;
import com.byted.cast.common.CastLogger;
import com.byted.cast.common.CastMonitor;
import com.byted.cast.common.ContextManager;
import com.byted.cast.common.Logger;
import com.byted.cast.common.api.IBrowseListener;
import com.byted.cast.common.api.ICastSource;
import com.byted.cast.common.api.IConnectListener;
import com.byted.cast.common.api.IGetDeviceInfoListener;
import com.byted.cast.common.api.ILibraryLoader;
import com.byted.cast.common.api.ILogger;
import com.byted.cast.common.api.IPlayerListener;
import com.byted.cast.common.api.IRegisterResultListener;
import com.byted.cast.common.api.IResultListener;
import com.byted.cast.common.api.ISendResultListener;
import com.byted.cast.common.api.IServerListener;
import com.byted.cast.common.api.ISurfaceListener;
import com.byted.cast.common.api.IWriteCacheListener;
import com.byted.cast.common.api.MirrorInfo;
import com.byted.cast.common.api.PlayerInfo;
import com.byted.cast.common.bean.DanmakuSetting;
import com.byted.cast.common.bean.DeviceInfo;
import com.byted.cast.common.bean.DramaBean;
import com.byted.cast.common.bean.Resolution;
import com.byted.cast.common.bean.Speed;
import com.byted.cast.common.config.Config;
import com.byted.cast.common.config.IInitListener;
import com.byted.cast.common.config.IMediaInfoListener;
import com.byted.cast.common.source.IMessageListener;
import com.byted.cast.common.source.IMirrorListener;
import com.byted.cast.common.source.ISinkDeviceInfoListener;
import com.byted.cast.common.source.ServiceInfo;
import com.byted.cast.common.source.Statistics;
import java.util.List;

/* loaded from: classes29.dex */
public class UsbCastSourceWrapper implements ICastSource {
    public static int num;
    public Context mContext;
    public CastLogger mLogger;
    public IMessageListener mMessageListener;
    public IMirrorListener mMirrorListener;
    public CastMonitor mMonitor;

    @Override // com.byted.cast.common.api.ICastSource
    public final /* synthetic */ void addDramaList(DramaBean[] dramaBeanArr, String str, IResultListener iResultListener) {
        ZZT.LIZ(this, dramaBeanArr, str, iResultListener);
    }

    @Override // com.byted.cast.common.api.ICastSource
    public void addOutputSurface(Surface surface) {
    }

    @Override // com.byted.cast.common.api.ICastSource
    public void addVolume() {
    }

    @Override // com.byted.cast.common.api.ICastSource
    public void changeCameraID(int i) {
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final /* synthetic */ void changeDanmakuSetting(DanmakuSetting danmakuSetting) {
        ZZT.LJ(this, danmakuSetting);
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final /* synthetic */ void changeResolution(Resolution resolution) {
        ZZT.LJFF(this, resolution);
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final /* synthetic */ void changeSpeed(Speed speed) {
        ZZT.LJI(this, speed);
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final /* synthetic */ void clearDramaList() {
        ZZT.LJII(this);
    }

    @Override // com.byted.cast.common.api.ICastSource
    public void connect(ServiceInfo serviceInfo) {
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final /* synthetic */ boolean detect(ServiceInfo serviceInfo, int i, int i2) {
        return ZZT.LJIIJ(this, serviceInfo, i, i2);
    }

    @Override // com.byted.cast.common.api.ICastSource
    public boolean disConnect(ServiceInfo serviceInfo) {
        return false;
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final /* synthetic */ void disableQueryPlayState() {
        ZZT.LJIIL(this);
    }

    @Override // com.byted.cast.common.api.ICastSource
    public void enableAudio(boolean z) {
    }

    @Override // com.byted.cast.common.api.ICastSource
    public void enableFlash(boolean z) {
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final /* synthetic */ void enableQueryPlayState() {
        ZZT.LJIILL(this);
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final /* synthetic */ ServiceInfo getCurrentPlayServiceInfo() {
        return ZZT.LJIILLIIL(this);
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final /* synthetic */ void getDeviceInfo(ServiceInfo serviceInfo, IGetDeviceInfoListener iGetDeviceInfoListener) {
        ZZT.LJIIZILJ(this, serviceInfo, iGetDeviceInfoListener);
    }

    @Override // com.byted.cast.common.api.ICastSource
    public String getFlvUrl() {
        return null;
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final /* synthetic */ String getHttpPlayUrl() {
        return ZZT.LJIJI(this);
    }

    @Override // com.byted.cast.common.api.ICastSource
    public String getHttpUrl() {
        return null;
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final /* synthetic */ String getLocalUrl(String str, String str2) {
        return ZZT.LJIJJLI(this, str, str2);
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final /* synthetic */ void getMediaInfo(ServiceInfo serviceInfo) {
        ZZT.LJIL(this, serviceInfo);
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final /* synthetic */ void getMsg(ServiceInfo serviceInfo, String str, ISendResultListener iSendResultListener) {
        ZZT.LJJ(this, serviceInfo, str, iSendResultListener);
    }

    @Override // com.byted.cast.common.api.ICastSource
    public Object getOption(int i, Object... objArr) {
        return null;
    }

    @Override // com.byted.cast.common.api.ICastSource
    public String getRtmpUrl() {
        return null;
    }

    @Override // com.byted.cast.common.api.ICastSource
    public ServiceInfo getServiceInfo() {
        return null;
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final /* synthetic */ void getSinkDeviceInfo(ServiceInfo serviceInfo, ISinkDeviceInfoListener iSinkDeviceInfoListener) {
        ZZT.LJJIIJ(this, serviceInfo, iSinkDeviceInfoListener);
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final /* synthetic */ List getSsdpServiceInfoList() {
        return ZZT.LJJIIJZLJL(this);
    }

    @Override // com.byted.cast.common.api.ICastSource
    public String getVersion() {
        return "3.10.2.1.overseas-tt";
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final /* synthetic */ void onDiskCacheFoundService(ServiceInfo serviceInfo) {
        ZZT.LJJIJ(this, serviceInfo);
    }

    @Override // com.byted.cast.common.api.ICastSource
    public void onNetworkChangeReady() {
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final /* synthetic */ void onSsdpDeviceOffline(ServiceInfo serviceInfo) {
        ZZT.LJJIJIIJIL(this, serviceInfo);
    }

    @Override // com.byted.cast.common.api.ICastSource
    public void pause() {
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final /* synthetic */ boolean ping(String str, int i) {
        return ZZT.LJJIJL(this, str, i);
    }

    @Override // com.byted.cast.common.api.ICastSource
    public void play(PlayerInfo playerInfo) {
    }

    @Override // com.byted.cast.common.api.ICastSource
    public void play(ServiceInfo serviceInfo, Uri uri, int i) {
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final /* synthetic */ void playDramaId(String str) {
        ZZT.LJJIZ(this, str);
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final /* synthetic */ void playNextDrama() {
        ZZT.LJJJ(this);
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final /* synthetic */ void playPreDrama() {
        ZZT.LJJJI(this);
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final /* synthetic */ void register(ServiceInfo serviceInfo, IRegisterResultListener iRegisterResultListener) {
        ZZT.LJJJIL(this, serviceInfo, iRegisterResultListener);
    }

    @Override // com.byted.cast.common.api.ICastSource
    public void removeOutputSurface(Surface surface) {
    }

    @Override // com.byted.cast.common.api.ICastSource
    public void resume() {
    }

    @Override // com.byted.cast.common.api.ICastSource
    public void seekTo(long j, int i) {
    }

    @Override // com.byted.cast.common.api.ICastSource
    public void send(ServiceInfo serviceInfo, String str, ISendResultListener iSendResultListener) {
    }

    @Override // com.byted.cast.common.api.ICastSource
    public void sendData(int i, byte[] bArr, long j, long j2, long j3, long j4) {
    }

    @Override // com.byted.cast.common.api.ICastSource
    public String sendSync(ServiceInfo serviceInfo, String str) {
        return "";
    }

    @Override // com.byted.cast.common.api.ICastSource
    public void setAudioMixScale(int i) {
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final /* synthetic */ void setAuthorizationResult(int i) {
        ZZT.LJJJJLL(this, i);
    }

    @Override // com.byted.cast.common.api.ICastSource
    public void setBrowseResultListener(IBrowseListener iBrowseListener) {
    }

    @Override // com.byted.cast.common.api.ICastSource
    public void setConnectListener(IConnectListener iConnectListener) {
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final /* synthetic */ void setLibraryLoader(ILibraryLoader iLibraryLoader) {
        ZZT.LJJJLIIL(this, iLibraryLoader);
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final /* synthetic */ void setLogger(ILogger iLogger) {
        ZZT.LJJJLL(this, iLogger);
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final /* synthetic */ void setMediaInfoListener(IMediaInfoListener iMediaInfoListener) {
        ZZT.LJJJLZIJ(this, iMediaInfoListener);
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final /* synthetic */ void setPlayerListener(IPlayerListener iPlayerListener) {
        ZZT.LJJLIIIJILLIZJL(this, iPlayerListener);
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final /* synthetic */ void setPlayerListener(com.byted.cast.common.source.IPlayerListener iPlayerListener) {
        ZZT.LJJLIIIJJI(this, iPlayerListener);
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final /* synthetic */ void setPrivateChannel(String str) {
        ZZT.LJJLIIIJJIZ(this, str);
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final /* synthetic */ void setRepeatMode(int i, IResultListener iResultListener) {
        ZZT.LJJLIIIJL(this, i, iResultListener);
    }

    @Override // com.byted.cast.common.api.ICastSource
    public void setServerInfo(PlayerInfo playerInfo) {
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final /* synthetic */ void setServerListener(IServerListener iServerListener) {
        ZZT.LJJLIIIJLLLLLLLZ(this, iServerListener);
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final /* synthetic */ void setSsdpBrowseResultListener(IBrowseListener iBrowseListener) {
        ZZT.LJJLIIJ(this, iBrowseListener);
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final /* synthetic */ void setSsdpPrivateChannel(String str) {
        ZZT.LJJLIL(this, str);
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final /* synthetic */ void setSsdpWriteCacheListener(IWriteCacheListener iWriteCacheListener) {
        ZZT.LJJLJ(this, iWriteCacheListener);
    }

    @Override // com.byted.cast.common.api.ICastSource
    public void setSurfaceFillType(int i) {
    }

    @Override // com.byted.cast.common.api.ICastSource
    public void setVolume(int i) {
    }

    @Override // com.byted.cast.common.api.ICastSource
    public void startBrowse() {
    }

    @Override // com.byted.cast.common.api.ICastSource
    public void startRecorder() {
        if (UsbSourceServer.getInstance(null, null) != null) {
            UsbSourceServer.getInstance(null, null).startRecorder();
        }
    }

    @Override // com.byted.cast.common.api.ICastSource
    public void startServer(String str) {
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final /* synthetic */ void startSsdpBrowse() {
        ZZT.LJL(this);
    }

    @Override // com.byted.cast.common.api.ICastSource
    public void stop() {
    }

    @Override // com.byted.cast.common.api.ICastSource
    public void stopBrowse() {
    }

    @Override // com.byted.cast.common.api.ICastSource
    public void stopRecorder() {
        if (UsbSourceServer.getInstance(null, null) != null) {
            UsbSourceServer.getInstance(null, null).stopRecorder();
        }
    }

    @Override // com.byted.cast.common.api.ICastSource
    public void stopServer() {
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final /* synthetic */ void stopSsdpBrowse() {
        ZZT.LJLILLLLZI(this);
    }

    @Override // com.byted.cast.common.api.ICastSource
    public void subVolume() {
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final /* synthetic */ void unregister(ServiceInfo serviceInfo, IRegisterResultListener iRegisterResultListener) {
        ZZT.LJLJJI(this, serviceInfo, iRegisterResultListener);
    }

    @Override // com.byted.cast.common.api.ICastSource
    public void destroy() {
        num--;
        Utils.removeLogger(this.mLogger);
        Utils.removeMonitor(this.mMonitor);
        this.mLogger.i("UsbCastSourceWrapper", "unBindSdk");
    }

    @Override // com.byted.cast.common.api.ICastSource
    public Statistics getStatistics() {
        return new Statistics();
    }

    @Override // com.byted.cast.common.api.ICastSource
    public void stopMirror() {
        this.mLogger.i("UsbCastSourceWrapper", "stopMirror");
        if (UsbSourceServer.getInstance(null, null) != null) {
            UsbSourceServer.getInstance(null, null).stopRecorder();
        }
    }

    public UsbCastSourceWrapper(ContextManager.CastContext castContext) {
        this.mLogger = ContextManager.getLogger(castContext);
        this.mMonitor = ContextManager.getMonitor(castContext);
        Utils.enable = true;
    }

    @Override // com.byted.cast.common.api.ICastSource
    public void setInputSurfaceCallback(ISurfaceListener iSurfaceListener) {
        CastLogger castLogger = this.mLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setInputSurfaceCallback");
        LIZ.append(iSurfaceListener);
        castLogger.i("UsbCastSourceWrapper", X1D.LIZIZ(LIZ));
        Utils.mSurfaceListener = iSurfaceListener;
    }

    @Override // com.byted.cast.common.api.ICastSource
    public void setMediaProjection(MediaProjection mediaProjection) {
        this.mLogger.i("UsbCastSourceWrapper", "setMediaProjection");
        if (UsbSourceServer.getInstance(null, null) != null) {
            UsbSourceServer.getInstance(null, null).setMediaProjection(mediaProjection);
        }
    }

    @Override // com.byted.cast.common.api.ICastSource
    public void setMessageListener(IMessageListener iMessageListener) {
        CastLogger castLogger = this.mLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setMessageListener");
        LIZ.append(iMessageListener);
        castLogger.i("UsbCastSourceWrapper", X1D.LIZIZ(LIZ));
        this.mMessageListener = iMessageListener;
        Utils.addMessageListener(iMessageListener);
    }

    @Override // com.byted.cast.common.api.ICastSource
    public void setMirrorInfo(MirrorInfo mirrorInfo) {
        CastLogger castLogger = this.mLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setMirrorInfo:");
        LIZ.append(mirrorInfo);
        castLogger.i("UsbCastSourceWrapper", X1D.LIZIZ(LIZ));
        if (mirrorInfo != null) {
            Utils.mMirrorInfo = mirrorInfo;
        }
    }

    @Override // com.byted.cast.common.api.ICastSource
    public void setMirrorListener(IMirrorListener iMirrorListener) {
        CastLogger castLogger = this.mLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setMirrorListener");
        LIZ.append(iMirrorListener);
        castLogger.i("UsbCastSourceWrapper", X1D.LIZIZ(LIZ));
        this.mMirrorListener = iMirrorListener;
        Utils.addMirrorListener(iMirrorListener);
    }

    @Override // com.byted.cast.common.api.ICastSource
    public void startMirror(MirrorInfo mirrorInfo) {
        CastLogger castLogger = this.mLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("startMirror:");
        LIZ.append(mirrorInfo);
        castLogger.i("UsbCastSourceWrapper", X1D.LIZIZ(LIZ));
        if (mirrorInfo != null) {
            Utils.mMirrorInfo = mirrorInfo;
        }
        if (UsbSourceServer.getInstance(null, null) != null) {
            UsbSourceServer.getInstance(null, null).startRecorder();
        }
    }

    @Override // com.byted.cast.common.api.ICastSource
    public DeviceInfo getSinkDeviceInfo(String str, int i) {
        return new DeviceInfo();
    }

    @Override // com.byted.cast.common.api.ICastSource
    public void setOption(int i, Object... objArr) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setOption:");
        LIZ.append(i);
        Logger.i("UsbCastSourceWrapper", X1D.LIZIZ(LIZ));
        if (i != 10015) {
            return;
        }
        Object obj = objArr[0];
        if (!(obj instanceof MediaProjection)) {
            return;
        }
        MediaProjection mediaProjection = (MediaProjection) obj;
        CastLogger castLogger = this.mLogger;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("setMediaProjection");
        LIZ2.append(mediaProjection);
        castLogger.i("UsbCastSourceWrapper", X1D.LIZIZ(LIZ2));
        if (UsbSourceServer.getInstance(null, null) == null) {
            return;
        }
        UsbSourceServer.getInstance(null, null).setMediaProjection(mediaProjection);
    }

    @Override // com.byted.cast.common.api.ICastSource
    public void init(Context context, Config config, IInitListener iInitListener) {
        this.mContext = context;
        Utils.addLogger(this.mLogger);
        Utils.addMonitor(this.mMonitor);
        Utils.config = config;
        num++;
        this.mLogger.i("UsbCastSourceWrapper", "bindSdk");
    }
}
