package com.byted.cast.common.auth.license;

import X.X1D;
import android.text.TextUtils;
import com.byted.cast.common.Constants;
import com.byted.cast.common.ContextManager;
import com.byted.cast.common.Dispatcher;
import com.byted.cast.common.Logger;
import com.byted.cast.common.PreferenceUtils;
import com.byted.cast.common.UrlUtils;
import com.byted.cast.common.api.IHttpNetWork;
import com.byted.cast.common.api.Response;
import com.byted.cast.common.auth.license.NetManager;
import com.byted.cast.common.config.ConfigManager;
import com.byted.cast.common.network.DefaultHttpNetWork;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes29.dex */
public class NetManager {
    public static volatile NetManager sInstance;
    public String mCastDid;
    public String mDeviceId;
    public IHttpNetWork mNetWork;
    public String mRole;

    /* loaded from: classes29.dex */
    public interface INetListener {
        void onFailed(int i, String str, Exception exc);

        void onSuccess(String str);
    }

    public static NetManager getInstance() {
        if (sInstance == null) {
            synchronized (NetManager.class) {
                if (sInstance == null) {
                    sInstance = new NetManager(null);
                }
            }
        }
        return sInstance;
    }

    private String getAppServerUrl() {
        String licenseTokenDomain = UrlUtils.getLicenseTokenDomain();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(licenseTokenDomain);
        LIZ.append("/bytecast/app_auth");
        String LIZIZ = X1D.LIZIZ(LIZ);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("getAppServerUrl: ");
        LIZ2.append(LIZIZ);
        Logger.d("NetManager", X1D.LIZIZ(LIZ2));
        return LIZIZ;
    }

    public NetManager(ContextManager.CastContext castContext) {
        ConfigManager configManager;
        this.mRole = "";
        this.mCastDid = "";
        this.mDeviceId = "";
        if (castContext == null) {
            configManager = ConfigManager.getInstance();
        } else {
            configManager = ContextManager.getConfigManager(castContext);
        }
        IHttpNetWork netAdapter = configManager.getInitConfig().getNetAdapter();
        this.mNetWork = netAdapter == null ? new DefaultHttpNetWork() : netAdapter;
        this.mRole = ContextManager.getMonitor(castContext).role;
        this.mCastDid = ContextManager.getConfigManager(castContext).getInitConfig().getDeviceId();
        this.mDeviceId = ContextManager.getConfigManager(castContext).getInitConfig().getDeviceId();
    }

    public static NetManager createInstance(ContextManager.CastContext castContext) {
        return new NetManager(castContext);
    }

    private String fetchNonEmptyLicenseDataHost(String str) {
        String licenseDataDomain = UrlUtils.getLicenseDataDomain();
        if (TextUtils.isEmpty(str)) {
            return licenseDataDomain;
        }
        return str;
    }

    public JSONObject doRequestToken(Map<String, String> map) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("doRequestToken: ");
        LIZ.append(map);
        Logger.d("NetManager", X1D.LIZIZ(LIZ));
        if (map != null && map.size() != 0) {
            try {
                String appServerUrl = getAppServerUrl();
                JSONObject jSONObject = new JSONObject();
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    if (entry != null && !TextUtils.isEmpty(entry.getKey())) {
                        jSONObject.put(entry.getKey(), entry.getValue());
                    }
                }
                String jSONObject2 = jSONObject.toString();
                String generateAppServerReqContent = VerifyUtil.generateAppServerReqContent(jSONObject2);
                String generateAppServerReqSignature = VerifyUtil.generateAppServerReqSignature(jSONObject2);
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("content", generateAppServerReqContent);
                jSONObject3.put("signature", generateAppServerReqSignature);
                String jSONObject4 = jSONObject3.toString();
                HashMap hashMap = new HashMap();
                hashMap.put("Content-Type", "application/json");
                Response doPost = this.mNetWork.doPost(appServerUrl, jSONObject4, hashMap);
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("response : ");
                LIZ2.append(doPost);
                Logger.d("NetManager", X1D.LIZIZ(LIZ2));
                if (doPost.code == 200) {
                    JSONObject jSONObject5 = new JSONObject(doPost.body);
                    if (jSONObject5.optInt("status_code") == 0) {
                        return jSONObject5.optJSONObject("data");
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    public void downloadLicense(final String str, final String str2, final String str3, final String str4, final INetListener iNetListener) {
        Logger.d("NetManager", "downloadLicense");
        Dispatcher.getInstance().enqueue(new Runnable() { // from class: X.ZZh
            @Override // java.lang.Runnable
            public final void run() {
                NetManager.this.lambda$downloadLicense$1("DownloadLicenseIosAndAndroid", str, str2, str3, str4, iNetListener);
            }
        });
    }

    private JSONObject doDownloadLicense(String str, String str2, String str3, String str4, String str5, String str6) {
        Logger.d("NetManager", "doDownloadLicense");
        try {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(str);
            LIZ.append("?");
            LIZ.append(str2);
            String LIZIZ = X1D.LIZIZ(LIZ);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("appId", str3);
            jSONObject.put("businessId", str4);
            jSONObject.put("cast_did", this.mCastDid);
            jSONObject.put("device_id", this.mDeviceId);
            jSONObject.put("cacheLicenseId", str5);
            jSONObject.put("id", str6);
            jSONObject.put("os", "android");
            jSONObject.put("ver", 2);
            jSONObject.put("sdk_version", "3.10.2.7.overseas-tt");
            jSONObject.put("appName", Constants.sAppContext.getPackageName());
            String jSONObject2 = jSONObject.toString();
            HashMap hashMap = new HashMap();
            hashMap.put("Content-Type", "application/json");
            if (PreferenceUtils.getByteLicenseDomainType(Constants.sAppContext) == 1) {
                hashMap.put("x-use-ppe", "1");
                hashMap.put("x-tt-env", "ppe_bytecast");
            }
            Response doPost = this.mNetWork.doPost(LIZIZ, jSONObject2, hashMap);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("response : ");
            LIZ2.append(doPost);
            Logger.d("NetManager", X1D.LIZIZ(LIZ2));
            if (doPost.code == 200) {
                return new JSONObject(doPost.body).optJSONObject("Result");
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$downloadLicense$1(String str, String str2, String str3, String str4, String str5, INetListener iNetListener) {
        String optString;
        int i = 0;
        while (i < 3) {
            i++;
            JSONObject doRequestToken = doRequestToken(new HashMap<String, String>(str, str2, str3) { // from class: com.byted.cast.common.auth.license.NetManager.2
                public final /* synthetic */ String val$action;
                public final /* synthetic */ String val$appId;
                public final /* synthetic */ String val$businessId;

                {
                    this.val$action = str;
                    this.val$businessId = str2;
                    this.val$appId = str3;
                    put("action", str);
                    put("businessId", str2);
                    put("appId", str3);
                    put("did", NetManager.this.mCastDid);
                }
            });
            String str6 = "";
            if (doRequestToken == null) {
                optString = "";
            } else {
                optString = doRequestToken.optString("token");
            }
            if (!TextUtils.isEmpty(optString)) {
                if (doRequestToken != null) {
                    str6 = doRequestToken.optString("url");
                }
                JSONObject doDownloadLicense = doDownloadLicense(fetchNonEmptyLicenseDataHost(str6), optString, str3, str2, str4, str5);
                if (doDownloadLicense != null) {
                    if (iNetListener != null) {
                        iNetListener.onSuccess(doDownloadLicense.toString());
                        return;
                    }
                    return;
                } else if (i == 3) {
                    if (iNetListener == null) {
                        return;
                    }
                    iNetListener.onFailed(10015, "ERROR_DOWNLOAD_LICENSE_FAILED", null);
                    return;
                }
            }
        }
    }

    public void checkLicense(final String str, final String str2, final String str3, final String str4, final long j, final INetListener iNetListener) {
        Logger.d("NetManager", "checkLicense");
        Dispatcher.getInstance().enqueue(new Runnable() { // from class: X.ZZi
            @Override // java.lang.Runnable
            public final void run() {
                NetManager.this.lambda$checkLicense$0("CheckLicenseIosAndAndroid", str, str2, str3, str4, j, iNetListener);
            }
        });
    }

    public void reportVerifyResult(final String str, final String str2, final String str3, final String str4, final String str5, final INetListener iNetListener) {
        Logger.d("NetManager", "reportVerifyResult");
        Dispatcher.getInstance().enqueue(new Runnable() { // from class: X.ZZg
            @Override // java.lang.Runnable
            public final void run() {
                NetManager.this.lambda$reportVerifyResult$2("AddDidIosAndAndroid", str, str2, str3, str4, str5, iNetListener);
            }
        });
    }

    private JSONObject doCheckLicense(String str, String str2, String str3, String str4, String str5, String str6, long j) {
        Logger.d("NetManager", "doCheckLicense");
        try {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(str);
            LIZ.append("?");
            LIZ.append(str2);
            String LIZIZ = X1D.LIZIZ(LIZ);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("appId", str3);
            jSONObject.put("businessId", str4);
            jSONObject.put("projectId", str5);
            jSONObject.put("cast_did", this.mCastDid);
            jSONObject.put("device_id", this.mDeviceId);
            jSONObject.put("updateTime", j);
            jSONObject.put("cacheLicenseId", str6);
            jSONObject.put("os", "android");
            jSONObject.put("ver", 2);
            jSONObject.put("sdk_version", "3.10.2.7.overseas-tt");
            jSONObject.put("appName", Constants.sAppContext.getPackageName());
            String jSONObject2 = jSONObject.toString();
            HashMap hashMap = new HashMap();
            hashMap.put("Content-Type", "application/json");
            if (PreferenceUtils.getByteLicenseDomainType(Constants.sAppContext) == 1) {
                hashMap.put("x-use-ppe", "1");
                hashMap.put("x-tt-env", "ppe_bytecast");
            }
            Response doPost = this.mNetWork.doPost(LIZIZ, jSONObject2, hashMap);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("response : ");
            LIZ2.append(doPost);
            Logger.d("NetManager", X1D.LIZIZ(LIZ2));
            if (doPost.code == 200) {
                return new JSONObject(doPost.body).optJSONObject("Result");
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    private boolean doReportVerifyResult(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        Logger.d("NetManager", "doReportVerifyResult");
        try {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(str);
            LIZ.append("?");
            LIZ.append(str2);
            String LIZIZ = X1D.LIZIZ(LIZ);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("appId", str3);
            jSONObject.put("projectId", str4);
            jSONObject.put("cast_did", this.mCastDid);
            jSONObject.put("device_id", this.mDeviceId);
            jSONObject.put("businessId", str6);
            jSONObject.put("cacheLicenseId", str5);
            jSONObject.put("code", str7);
            jSONObject.put("role", this.mRole);
            jSONObject.put("os", "android");
            jSONObject.put("ver", 2);
            jSONObject.put("sdk_version", "3.10.2.7.overseas-tt");
            jSONObject.put("appName", Constants.sAppContext.getPackageName());
            String jSONObject2 = jSONObject.toString();
            HashMap hashMap = new HashMap();
            hashMap.put("Content-Type", "application/json");
            if (PreferenceUtils.getByteLicenseDomainType(Constants.sAppContext) == 1) {
                hashMap.put("x-use-ppe", "1");
                hashMap.put("x-tt-env", "ppe_bytecast");
            }
            Response doPost = this.mNetWork.doPost(LIZIZ, jSONObject2, hashMap);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("response : ");
            LIZ2.append(doPost);
            Logger.d("NetManager", X1D.LIZIZ(LIZ2));
            if (doPost.code == 200) {
                return true;
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$checkLicense$0(String str, String str2, String str3, String str4, String str5, long j, INetListener iNetListener) {
        String optString;
        int i = 0;
        do {
            i++;
            JSONObject doRequestToken = doRequestToken(new HashMap<String, String>(str, str2, str3) { // from class: com.byted.cast.common.auth.license.NetManager.1
                public final /* synthetic */ String val$action;
                public final /* synthetic */ String val$appId;
                public final /* synthetic */ String val$businessId;

                {
                    this.val$action = str;
                    this.val$businessId = str2;
                    this.val$appId = str3;
                    put("action", str);
                    put("businessId", str2);
                    put("appId", str3);
                    put("did", NetManager.this.mCastDid);
                }
            });
            String str6 = "";
            if (doRequestToken == null) {
                optString = "";
            } else {
                optString = doRequestToken.optString("token");
            }
            if (!TextUtils.isEmpty(optString)) {
                if (doRequestToken != null) {
                    str6 = doRequestToken.optString("url");
                }
                JSONObject doCheckLicense = doCheckLicense(fetchNonEmptyLicenseDataHost(str6), optString, str3, str2, str4, str5, j);
                if (doCheckLicense != null) {
                    try {
                        int parseInt = CastIntegerProtector.parseInt(doCheckLicense.optString("code"));
                        if (parseInt != -1) {
                            if (800000 != parseInt) {
                                if (iNetListener != null) {
                                    iNetListener.onFailed(parseInt, "user invalid", null);
                                    return;
                                }
                                return;
                            } else {
                                if (doCheckLicense.optBoolean("hasChanged")) {
                                    String optString2 = doCheckLicense.optString("id");
                                    if (TextUtils.isEmpty(optString2) || iNetListener == null) {
                                        return;
                                    }
                                    iNetListener.onSuccess(optString2);
                                    return;
                                }
                                if (iNetListener == null) {
                                    return;
                                }
                                iNetListener.onSuccess(null);
                                return;
                            }
                        }
                    } catch (Throwable unused) {
                    }
                }
            }
        } while (i < 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$reportVerifyResult$2(String str, String str2, String str3, String str4, String str5, String str6, INetListener iNetListener) {
        String optString;
        int i = 0;
        do {
            i++;
            JSONObject doRequestToken = doRequestToken(new HashMap<String, String>(str, str2, str3) { // from class: com.byted.cast.common.auth.license.NetManager.3
                public final /* synthetic */ String val$action;
                public final /* synthetic */ String val$appId;
                public final /* synthetic */ String val$businessId;

                {
                    this.val$action = str;
                    this.val$businessId = str2;
                    this.val$appId = str3;
                    put("action", str);
                    put("businessId", str2);
                    put("appId", str3);
                    put("did", NetManager.this.mCastDid);
                }
            });
            String str7 = "";
            if (doRequestToken == null) {
                optString = "";
            } else {
                optString = doRequestToken.optString("token");
            }
            if (!TextUtils.isEmpty(optString)) {
                if (doRequestToken != null) {
                    str7 = doRequestToken.optString("url");
                }
                if (doReportVerifyResult(fetchNonEmptyLicenseDataHost(str7), optString, str3, str4, str5, str2, str6)) {
                    if (iNetListener != null) {
                        iNetListener.onSuccess(null);
                        return;
                    }
                    return;
                }
            }
        } while (i < 3);
    }
}
