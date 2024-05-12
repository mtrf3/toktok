package com.byted.cast.common.api;

import android.content.Context;
import android.content.Intent;
import com.byted.cast.common.api.cloud.ICastIdListener;
import com.byted.cast.common.api.multiple.IMultipleActiveControl;
import com.byted.cast.common.api.multiple.IMultipleLoader;
import com.byted.cast.common.bean.DeviceInfo;
import com.byted.cast.common.config.Config;
import com.byted.cast.common.config.IInitListener;
import com.byted.cast.common.sink.CastInfo;
import com.byted.cast.common.sink.ClientInfo;
import com.byted.cast.common.sink.IMessageListener;
import com.byted.cast.common.sink.IMirrorListener;
import com.byted.cast.common.sink.IPreemptListener;
import com.byted.cast.common.sink.ISourceDeviceInfoListener;
import com.byted.cast.common.sink.ServiceInfo;
import com.byted.cast.common.sink.Statistics;
import java.util.List;

/* loaded from: classes29.dex */
public interface ICastSink {
    void addCastIdListener(ICastIdListener iCastIdListener);

    void deliverIntent(Intent intent);

    void destroy();

    DeviceInfo getDeviceInfo(String str);

    IMultipleActiveControl getMultipleActiveControl();

    IMultipleLoader getMultipleLoader();

    Object getOption(int i, Object... objArr);

    List<ServiceInfo> getRegisterList();

    ServiceInfo getServiceInfo();

    Statistics getStatistics();

    String getVersion();

    void init(Context context, Config config, IInitListener iInitListener);

    void notifyPreempt(boolean z, ClientInfo clientInfo);

    void requestIdrFromSource(CastInfo castInfo);

    boolean reverseConnect(String str, int i);

    boolean reverseDisconnect();

    boolean reverseInvite();

    void send(CastInfo castInfo, String str, ISendResultListener iSendResultListener);

    void send(ServiceInfo serviceInfo, String str, ISendResultListener iSendResultListener);

    String sendSync(ServiceInfo serviceInfo, String str);

    void setActionListener(IActionListener iActionListener);

    void setBrowseDataListener(IBrowseDataListener iBrowseDataListener);

    void setLogEnabled(boolean z);

    void setMediaServiceEnable(boolean z);

    void setMediaServiceListener(IMediaServiceListener iMediaServiceListener);

    void setMessageListener(IMessageListener iMessageListener);

    void setMirrorListener(IMirrorListener iMirrorListener);

    Object setOption(int i, Object... objArr);

    void setPreemptListener(IPreemptListener iPreemptListener);

    void setPrivateChannel(String str);

    void setReverseControl(IReverseControl iReverseControl);

    void setServerListener(IServerListener iServerListener);

    void setServerListener(com.byted.cast.common.sink.IServerListener iServerListener);

    void setSourceDeviceInfoListener(ISourceDeviceInfoListener iSourceDeviceInfoListener);

    void setSsdpPrivateChannel(String str);

    void startServer(String str);

    void startSsdpServer(String str);

    void stopServer();

    void stopSsdpServer();

    void upDateServerName(String str);
}
