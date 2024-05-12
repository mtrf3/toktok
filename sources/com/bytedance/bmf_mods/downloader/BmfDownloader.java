package com.bytedance.bmf_mods.downloader;

import X.C16880lQ;
import X.InterfaceC58107MrH;
import X.X1D;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import com.bytedance.bmf_mods.common.Logging;
import com.bytedance.bmf_mods.common.SoLoader;
import com.ss.ugc.android.davinciresource.DavinciResource;
import com.ss.ugc.android.davinciresource.jni.AlgorithmResourceHandler;
import com.ss.ugc.android.davinciresource.jni.AlgorithmResourceProtocol;
import com.ss.ugc.android.davinciresource.jni.DAVCreator;
import com.ss.ugc.android.davinciresource.jni.DAVLogLevel;
import com.ss.ugc.android.davinciresource.jni.DAVLoggerListener;
import com.ss.ugc.android.davinciresource.jni.DAVResource;
import com.ss.ugc.android.davinciresource.jni.DAVResourceFetchCallback;
import com.ss.ugc.android.davinciresource.jni.DAVResourceManager;
import com.ss.ugc.android.davinciresource.jni.MapStringString;
import com.ss.ugc.android.davinciresource.jni.UrlResourceHandler;
import com.ss.ugc.android.davinciresource.jni.ZipResourceHandler;
import java.io.File;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes34.dex */
public class BmfDownloader {
    public final CopyOnWriteArrayList<DAVResourceFetchCallback> fetchCallbackList = new CopyOnWriteArrayList<>();
    public DAVResourceManager resourceManager;

    /* renamed from: com.bytedance.bmf_mods.downloader.BmfDownloader$3, reason: invalid class name */
    /* loaded from: classes34.dex */
    public static /* synthetic */ class AnonymousClass3 {
        public static final /* synthetic */ int[] $SwitchMap$com$ss$ugc$android$davinciresource$jni$DAVLogLevel;

        static {
            int[] iArr = new int[DAVLogLevel.values().length];
            $SwitchMap$com$ss$ugc$android$davinciresource$jni$DAVLogLevel = iArr;
            try {
                iArr[DAVLogLevel.LEVEL_VERBOSE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$ss$ugc$android$davinciresource$jni$DAVLogLevel[DAVLogLevel.LEVEL_INFO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$ss$ugc$android$davinciresource$jni$DAVLogLevel[DAVLogLevel.LEVEL_WARNING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$ss$ugc$android$davinciresource$jni$DAVLogLevel[DAVLogLevel.LEVEL_ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public BmfDownloader(Context context) {
        SoLoader.getInstance().setContext(context);
    }

    private void fetchInternal(final DAVResource dAVResource, final StringBuilder sb, MapStringString mapStringString, final InterfaceC58107MrH interfaceC58107MrH) {
        DAVResourceFetchCallback dAVResourceFetchCallback = new DAVResourceFetchCallback() { // from class: com.bytedance.bmf_mods.downloader.BmfDownloader.2
            @Override // com.ss.ugc.android.davinciresource.jni.DAVResourceFetchCallback
            public void onError(int i) {
                Logging.d("fetch failed");
                BmfDownloader.this.fetchCallbackList.remove(this);
                interfaceC58107MrH.callback(0);
            }

            @Override // com.ss.ugc.android.davinciresource.jni.DAVResourceFetchCallback
            public void onProgress(int i) {
                Logging.d("fetch in progress");
            }

            @Override // com.ss.ugc.android.davinciresource.jni.DAVResourceFetchCallback
            public void onSuccess(DAVResource dAVResource2) {
                Logging.d("fetch successfully");
                BmfDownloader.this.fetchCallbackList.remove(this);
                DAVResource fetchResourceFromCache = BmfDownloader.this.resourceManager.fetchResourceFromCache(dAVResource.getResourceId());
                sb.setLength(0);
                sb.append(fetchResourceFromCache.getResourceFile());
                if (SoLoader.getInstance().getAppContext() == null) {
                    sb.append("_temp");
                }
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("modelPath is : ");
                LIZ.append((Object) sb);
                Logging.d(X1D.LIZIZ(LIZ));
                interfaceC58107MrH.callback(1);
            }
        };
        this.fetchCallbackList.add(dAVResourceFetchCallback);
        this.resourceManager.fetchResource(dAVResource, mapStringString, dAVResourceFetchCallback);
    }

    public void download(String str, String str2, final String str3, String str4, StringBuilder sb, Map<String, String> map, InterfaceC58107MrH interfaceC58107MrH) {
        File file;
        DavinciResource davinciResource = DavinciResource.INSTANCE;
        davinciResource.setHttpClient(new BMFTTNetClientImpl());
        davinciResource.setLogLevel(DAVLogLevel.LEVEL_DEBUG);
        davinciResource.setLogger(new DAVLoggerListener() { // from class: com.bytedance.bmf_mods.downloader.BmfDownloader.1
            @Override // com.ss.ugc.android.davinciresource.jni.DAVLoggerListener
            public void onLog(DAVLogLevel dAVLogLevel, String str5) {
                int i = AnonymousClass3.$SwitchMap$com$ss$ugc$android$davinciresource$jni$DAVLogLevel[dAVLogLevel.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                String str6 = str3;
                                if (str5 == null) {
                                    str5 = "";
                                }
                                Log.println(3, str6, str5);
                                return;
                            }
                            String str7 = str3;
                            if (str5 == null) {
                                str5 = "";
                            }
                            Log.println(6, str7, str5);
                            return;
                        }
                        String str8 = str3;
                        if (str5 == null) {
                            str5 = "";
                        }
                        Log.println(5, str8, str5);
                        return;
                    }
                    String str9 = str3;
                    if (str5 == null) {
                        str5 = "";
                    }
                    Log.println(4, str9, str5);
                    return;
                }
                String str10 = str3;
                if (str5 == null) {
                    str5 = "";
                }
                Log.println(2, str10, str5);
            }
        });
        this.resourceManager = DAVCreator.createDefaultResourceManager();
        this.resourceManager.registerResourceHandler(UrlResourceHandler.create());
        this.resourceManager.registerResourceHandler(ZipResourceHandler.create());
        if (SoLoader.getInstance().getAppContext() != null) {
            file = new File(C16880lQ.LLIIJLIL(SoLoader.getInstance().getAppContext()), str2);
        } else {
            file = new File(new File("/data/local/tmp/output/lib"), str2);
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        for (String str5 : map.keySet()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("param key [");
            LIZ.append(str5);
            LIZ.append("] -----> value [");
            LIZ.append(map.get(str5));
            LIZ.append("]");
            Logging.d(X1D.LIZIZ(LIZ));
        }
        AlgorithmResourceHandler.Builder busiId = new AlgorithmResourceHandler.Builder().accessKey(map.get("accessKey")).sdkVersion(str4).deviceType(Build.MODEL).cacheDir(file.getAbsolutePath()).platform("android").host(map.get("host")).busiId("501090");
        if (map.containsKey("appVersion")) {
            busiId = busiId.appVersion(map.get("appVersion"));
        }
        if (map.containsKey("deviceId")) {
            busiId = busiId.deviceId(map.get("deviceId"));
        }
        if (map.containsKey("appID")) {
            busiId = busiId.appID(map.get("appID"));
        }
        if (map.containsKey("platformSdkVersion")) {
            busiId = busiId.platformSdkVersion(map.get("platformSdkVersion"));
        }
        this.resourceManager.registerResourceHandler(busiId.build());
        fetchInternal(new DAVResource(new AlgorithmResourceProtocol(str).toResourceId()), sb, new MapStringString(), interfaceC58107MrH);
    }
}
