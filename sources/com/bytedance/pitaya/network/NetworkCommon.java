package com.bytedance.pitaya.network;

import X.C16880lQ;
import X.C93306aOk;
import X.C93309aOn;
import X.C93310aOo;
import X.EnumC93298aOc;
import X.InterfaceC93307aOl;
import X.InterfaceC93313aOr;
import X.InterfaceC93314aOs;
import X.X1D;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.IntentFilter;
import com.bytedance.pitaya.api.PTYSettingsCallback;
import com.bytedance.pitaya.log.PitayaLogger;
import com.bytedance.pitaya.thirdcomponent.downloader.PTYFileDownloader;
import com.bytedance.pitaya.thirdcomponent.net.PTYHttpClient;
import com.bytedance.pitaya.thirdcomponent.stddelegate.PitayaInnerServiceProvider;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes30.dex */
public final class NetworkCommon implements PTYFileDownloader, PTYHttpClient {
    public static PTYHttpClient clientInstance;
    public static PTYFileDownloader fileDownloader;
    public static final NetworkCommon INSTANCE = new NetworkCommon();
    public static C93309aOn networkStatus = new C93309aOn();

    @Override // com.bytedance.pitaya.thirdcomponent.net.PTYHttpClient
    public void inject(String aid, PTYSettingsCallback pTYSettingsCallback) {
        o.LJIIJ(aid, "aid");
    }

    public final int getNetWorkType() {
        networkStatus.getClass();
        return C93309aOn.LIZ();
    }

    public final String getNetWorkTypeStr() {
        C93309aOn c93309aOn = networkStatus;
        Map<Integer, String> map = C93309aOn.LIZIZ;
        c93309aOn.getClass();
        String str = map.get(Integer.valueOf(C93309aOn.LIZ()));
        if (str != null) {
            return str;
        }
        return "unknown";
    }

    @Override // com.bytedance.pitaya.thirdcomponent.downloader.PTYFileDownloader
    public void cancelAllDownload(Context context) {
        o.LJIIJ(context, "context");
        PTYFileDownloader pTYFileDownloader = fileDownloader;
        if (pTYFileDownloader != null) {
            pTYFileDownloader.cancelAllDownload(context);
        }
    }

    public final void registerNetworkStatusChangeListener(InterfaceC93307aOl listener) {
        o.LJIIJ(listener, "listener");
        C93309aOn c93309aOn = networkStatus;
        c93309aOn.getClass();
        c93309aOn.LIZ.add(listener);
    }

    public final void removeNetworkStatusChangeListener(InterfaceC93307aOl listener) {
        o.LJIIJ(listener, "listener");
        C93309aOn c93309aOn = networkStatus;
        c93309aOn.getClass();
        c93309aOn.LIZ.remove(listener);
    }

    @Override // com.bytedance.pitaya.thirdcomponent.net.PTYHttpClient
    public void get(String url, InterfaceC93314aOs callback, EnumC93298aOc dataType) {
        o.LJIIJ(url, "url");
        o.LJIIJ(callback, "callback");
        o.LJIIJ(dataType, "dataType");
        PTYHttpClient pTYHttpClient = clientInstance;
        if (pTYHttpClient != null) {
            pTYHttpClient.get(url, callback, dataType);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("get request, url is ");
            LIZ.append(url);
            PitayaLogger.LIZ("NetworkCommon", X1D.LIZIZ(LIZ));
            return;
        }
        PitayaLogger.LIZIZ("NetworkCommon", "get request failed due to no available http client");
        callback.onFailure(-1, "get request failed due to no available http client");
    }

    @Override // com.bytedance.pitaya.thirdcomponent.net.PTYHttpClient
    public void post(String url, byte[] bArr, InterfaceC93314aOs callback, EnumC93298aOc dataType) {
        o.LJIIJ(url, "url");
        o.LJIIJ(callback, "callback");
        o.LJIIJ(dataType, "dataType");
        PTYHttpClient pTYHttpClient = clientInstance;
        if (pTYHttpClient != null) {
            pTYHttpClient.post(url, bArr, callback, dataType);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("post request, url is ");
            LIZ.append(url);
            PitayaLogger.LIZ("NetworkCommon", X1D.LIZIZ(LIZ));
            return;
        }
        PitayaLogger.LIZIZ("NetworkCommon", "post request failed due to no available http client");
        callback.onFailure(-1, "post request failed due to no available http client");
    }

    public final void init(Context context, String aid, PTYSettingsCallback pTYSettingsCallback, PTYHttpClient pTYHttpClient, PTYFileDownloader pTYFileDownloader) {
        WeakReference<Context> weakReference;
        o.LJIIJ(context, "context");
        o.LJIIJ(aid, "aid");
        if (pTYHttpClient != null) {
            clientInstance = pTYHttpClient;
        } else {
            PTYHttpClient pTYHttpClient2 = (PTYHttpClient) PitayaInnerServiceProvider.getService(PTYHttpClient.class);
            if (pTYHttpClient2 == null) {
                pTYHttpClient2 = new DefaultHttpClient();
            }
            clientInstance = pTYHttpClient2;
        }
        PTYHttpClient pTYHttpClient3 = clientInstance;
        if (pTYHttpClient3 != null) {
            pTYHttpClient3.inject(aid, pTYSettingsCallback);
            if (context instanceof Application) {
                weakReference = new WeakReference<>(((ContextWrapper) context).getBaseContext());
            } else {
                weakReference = new WeakReference<>(context);
            }
            C93306aOk.LIZ = weakReference;
            C93309aOn c93309aOn = networkStatus;
            c93309aOn.getClass();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            C16880lQ.LJJLIIIJILLIZJL(new C93310aOo(c93309aOn), context, intentFilter);
            if (pTYFileDownloader != null) {
                fileDownloader = pTYFileDownloader;
                return;
            }
            PTYFileDownloader pTYFileDownloader2 = (PTYFileDownloader) PitayaInnerServiceProvider.getService(PTYFileDownloader.class);
            if (pTYFileDownloader2 == null) {
                pTYFileDownloader2 = new DefaultFileDownloader();
            }
            fileDownloader = pTYFileDownloader2;
            return;
        }
        o.LJIIZILJ();
        throw null;
    }

    @Override // com.bytedance.pitaya.thirdcomponent.downloader.PTYFileDownloader
    public void downloadFile(Context context, String url, String fileName, String str, String savePath, InterfaceC93313aOr listener) {
        o.LJIIJ(context, "context");
        o.LJIIJ(url, "url");
        o.LJIIJ(fileName, "fileName");
        o.LJIIJ(savePath, "savePath");
        o.LJIIJ(listener, "listener");
        PTYFileDownloader pTYFileDownloader = fileDownloader;
        if (pTYFileDownloader != null) {
            pTYFileDownloader.downloadFile(context, url, fileName, str, savePath, listener);
        } else {
            listener.onFail(url, "Download failed due to no available file downloader");
            PitayaLogger.LIZIZ("NetworkCommon", "Download failed due to no available file downloader");
        }
    }
}
