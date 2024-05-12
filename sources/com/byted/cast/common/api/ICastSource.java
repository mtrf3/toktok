package com.byted.cast.common.api;

import android.content.Context;
import android.media.projection.MediaProjection;
import android.net.Uri;
import android.view.Surface;
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
public interface ICastSource {
    void addDramaList(DramaBean[] dramaBeanArr, String str, IResultListener iResultListener);

    void addOutputSurface(Surface surface);

    void addVolume();

    void changeCameraID(int i);

    void changeDanmakuSetting(DanmakuSetting danmakuSetting);

    void changeResolution(Resolution resolution);

    void changeSpeed(Speed speed);

    void clearDramaList();

    void connect(ServiceInfo serviceInfo);

    void destroy();

    boolean detect(ServiceInfo serviceInfo, int i, int i2);

    boolean disConnect(ServiceInfo serviceInfo);

    void disableQueryPlayState();

    void enableAudio(boolean z);

    void enableFlash(boolean z);

    void enableQueryPlayState();

    ServiceInfo getCurrentPlayServiceInfo();

    void getDeviceInfo(ServiceInfo serviceInfo, IGetDeviceInfoListener iGetDeviceInfoListener);

    String getFlvUrl();

    String getHttpPlayUrl();

    String getHttpUrl();

    String getLocalUrl(String str, String str2);

    void getMediaInfo(ServiceInfo serviceInfo);

    void getMsg(ServiceInfo serviceInfo, String str, ISendResultListener iSendResultListener);

    Object getOption(int i, Object... objArr);

    String getRtmpUrl();

    ServiceInfo getServiceInfo();

    DeviceInfo getSinkDeviceInfo(String str, int i);

    void getSinkDeviceInfo(ServiceInfo serviceInfo, ISinkDeviceInfoListener iSinkDeviceInfoListener);

    List<ServiceInfo> getSsdpServiceInfoList();

    Statistics getStatistics();

    String getVersion();

    void init(Context context, Config config, IInitListener iInitListener);

    void onDiskCacheFoundService(ServiceInfo serviceInfo);

    void onNetworkChangeReady();

    void onSsdpDeviceOffline(ServiceInfo serviceInfo);

    void pause();

    boolean ping(String str, int i);

    void play(PlayerInfo playerInfo);

    void play(ServiceInfo serviceInfo, Uri uri, int i);

    void playDramaId(String str);

    void playNextDrama();

    void playPreDrama();

    void register(ServiceInfo serviceInfo, IRegisterResultListener iRegisterResultListener);

    void removeOutputSurface(Surface surface);

    void resume();

    void seekTo(long j, int i);

    void send(ServiceInfo serviceInfo, String str, ISendResultListener iSendResultListener);

    void sendData(int i, byte[] bArr, long j, long j2, long j3, long j4);

    String sendSync(ServiceInfo serviceInfo, String str);

    void setAudioMixScale(int i);

    void setAuthorizationResult(int i);

    void setBrowseResultListener(IBrowseListener iBrowseListener);

    void setConnectListener(IConnectListener iConnectListener);

    void setInputSurfaceCallback(ISurfaceListener iSurfaceListener);

    void setLibraryLoader(ILibraryLoader iLibraryLoader);

    void setLogger(ILogger iLogger);

    void setMediaInfoListener(IMediaInfoListener iMediaInfoListener);

    void setMediaProjection(MediaProjection mediaProjection);

    void setMessageListener(IMessageListener iMessageListener);

    void setMirrorInfo(MirrorInfo mirrorInfo);

    void setMirrorListener(IMirrorListener iMirrorListener);

    void setOption(int i, Object... objArr);

    void setPlayerListener(IPlayerListener iPlayerListener);

    void setPlayerListener(com.byted.cast.common.source.IPlayerListener iPlayerListener);

    void setPrivateChannel(String str);

    void setRepeatMode(int i, IResultListener iResultListener);

    void setServerInfo(PlayerInfo playerInfo);

    void setServerListener(IServerListener iServerListener);

    void setSsdpBrowseResultListener(IBrowseListener iBrowseListener);

    void setSsdpPrivateChannel(String str);

    void setSsdpWriteCacheListener(IWriteCacheListener iWriteCacheListener);

    void setSurfaceFillType(int i);

    void setVolume(int i);

    void startBrowse();

    void startMirror(MirrorInfo mirrorInfo);

    void startRecorder();

    void startServer(String str);

    void startSsdpBrowse();

    void stop();

    void stopBrowse();

    void stopMirror();

    void stopRecorder();

    void stopServer();

    void stopSsdpBrowse();

    void subVolume();

    void unregister(ServiceInfo serviceInfo, IRegisterResultListener iRegisterResultListener);
}
