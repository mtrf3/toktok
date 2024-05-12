package com.byted.cast.common.config;

import X.C16880lQ;
import X.X1D;
import android.content.Context;
import android.text.TextUtils;
import com.byted.cast.common.CastLogger;
import com.byted.cast.common.CastMonitor;
import com.byted.cast.common.Constants;
import com.byted.cast.common.ContextManager;
import com.byted.cast.common.Dispatcher;
import com.byted.cast.common.MD5;
import com.byted.cast.common.PreferenceUtils;
import com.byted.cast.common.TeaEventTrack;
import com.byted.cast.common.UrlUtils;
import com.byted.cast.common.api.IHttpNetWork;
import com.byted.cast.common.api.Response;
import com.byted.cast.common.config.pojo.CollectInfo;
import com.byted.cast.common.network.DefaultHttpNetWork;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ExecutionException;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes29.dex */
public final class GrayConfigManager implements IConfigManager {
    public final ConfigCache mConfigCache;
    public CastLogger mLogger;
    public CastMonitor mMonitor;
    public Runnable mRequestTask;
    public TeaEventTrack mTeaEventTrack;
    public IHttpNetWork network;
    public String token;
    public static final String TAG = C16880lQ.LJLLJ(GrayConfigManager.class);
    public static final String BASE_URL = UrlUtils.getGrayConfigDomain();

    @Override // com.byted.cast.common.config.IConfigManager
    public void destroy() {
        if (this.mRequestTask == null) {
            return;
        }
        Dispatcher.getInstance().remove(this.mRequestTask);
        this.mRequestTask = null;
    }

    public void getAuthToken() {
        String str;
        String str2 = "";
        CastLogger castLogger = this.mLogger;
        String str3 = TAG;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("getAuthToken: ");
        LIZ.append(this.token);
        castLogger.i(str3, X1D.LIZIZ(LIZ));
        if (!TextUtils.isEmpty(this.token)) {
            return;
        }
        try {
            String generateAuthReqBodyStr = generateAuthReqBodyStr();
            CastLogger castLogger2 = this.mLogger;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("authJson: ");
            LIZ2.append(generateAuthReqBodyStr);
            castLogger2.i(str3, X1D.LIZIZ(LIZ2));
            HashMap hashMap = new HashMap();
            hashMap.put("Content-Type", "application/json");
            Response doPost = this.network.doPost(getAuthUrl(Constants.sAppContext), generateAuthReqBodyStr, hashMap);
            if (doPost.code == 200) {
                str = doPost.body;
            } else {
                str = "";
            }
            CastLogger castLogger3 = this.mLogger;
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("authResponse: ");
            LIZ3.append(str);
            castLogger3.d(str3, X1D.LIZIZ(LIZ3));
            str2 = parseAuthToken(str);
            this.token = str2;
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e2) {
            e2.printStackTrace();
        } catch (Exception e3) {
            e3.printStackTrace();
        }
        CastLogger castLogger4 = this.mLogger;
        String str4 = TAG;
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append("getAuthToken: ");
        LIZ4.append(str2);
        castLogger4.i(str4, X1D.LIZIZ(LIZ4));
    }

    @Override // com.byted.cast.common.config.IConfigManager
    public boolean isConfigAvailable() {
        ConfigCache configCache = this.mConfigCache;
        if (configCache != null && configCache.isRemoteGrayConfigAvailable()) {
            return true;
        }
        return false;
    }

    private String generateAuthReqBodyStr() {
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ProductKey=");
        LIZ.append("n8wcb7mkopetveaka4i19qery7bsafbm");
        LIZ.append("&ProductId=");
        LIZ.append("ByteCast");
        LIZ.append("&SecretKey=");
        LIZ.append("z4zkjbx623270gqo51fqm5o6dd9fsnpb");
        LIZ.append("&Nonce=");
        LIZ.append("dnssdauth");
        LIZ.append("&TimeStamp=");
        LIZ.append(currentTimeMillis);
        String hexdigest = MD5.hexdigest(X1D.LIZIZ(LIZ));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("ProductKey", "n8wcb7mkopetveaka4i19qery7bsafbm");
        jSONObject.put("ProductId", "ByteCast");
        jSONObject.put("Nonce", "dnssdauth");
        jSONObject.put("TimeStamp", currentTimeMillis);
        jSONObject.put("Signature", hexdigest);
        return jSONObject.toString();
    }

    private String getAuthUrl(Context context) {
        String byteGrayDomain = PreferenceUtils.getByteGrayDomain(context, BASE_URL);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(byteGrayDomain);
        LIZ.append("/configure/auth");
        String LIZIZ = X1D.LIZIZ(LIZ);
        CastLogger castLogger = this.mLogger;
        String str = TAG;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("getAuthUrl: ");
        LIZ2.append(LIZIZ);
        castLogger.d(str, X1D.LIZIZ(LIZ2));
        return LIZIZ;
    }

    private String getConfigUrl(Context context) {
        String byteGrayDomain = PreferenceUtils.getByteGrayDomain(context, BASE_URL);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(byteGrayDomain);
        LIZ.append("/configure/match/ByteCast");
        String LIZIZ = X1D.LIZIZ(LIZ);
        CastLogger castLogger = this.mLogger;
        String str = TAG;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("getConfigUrl: ");
        LIZ2.append(LIZIZ);
        castLogger.i(str, X1D.LIZIZ(LIZ2));
        return LIZIZ;
    }

    private String parseAuthToken(String str) {
        return JSONObjectProtectorUtils.getString(JSONObjectProtectorUtils.getJSONObject(new JSONObject(str), "data"), "token");
    }

    private HashMap<String, Object> parseGrayRep(String str) {
        HashMap<String, Object> hashMap = new HashMap<>();
        if (!TextUtils.isEmpty(str)) {
            JSONObject jSONObject = JSONObjectProtectorUtils.getJSONObject(new JSONObject(str), "data");
            JSONArray jSONArray = JSONObjectProtectorUtils.getJSONArray(jSONObject, "row");
            int i = JSONObjectProtectorUtils.getInt(jSONObject, "total");
            CastLogger castLogger = this.mLogger;
            String str2 = TAG;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("response: totalCount: ");
            LIZ.append(i);
            castLogger.i(str2, X1D.LIZIZ(LIZ));
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                JSONObject jSONObject2 = JSONArrayProtectorUtils.getJSONObject(jSONArray, i2);
                String string = JSONObjectProtectorUtils.getString(jSONObject2, "feature_key");
                String string2 = JSONObjectProtectorUtils.getString(jSONObject2, "value");
                hashMap.put(string, string2);
                CastLogger castLogger2 = this.mLogger;
                String str3 = TAG;
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("response featureKey is : ");
                LIZ2.append(string);
                LIZ2.append(" value is : ");
                LIZ2.append(string2);
                castLogger2.i(str3, X1D.LIZIZ(LIZ2));
            }
        } else {
            this.mLogger.i(TAG, "response: body is null");
        }
        return hashMap;
    }

    @Override // com.byted.cast.common.config.IConfigManager
    public Object getConfig(int i) {
        ConfigCache configCache = this.mConfigCache;
        if (configCache != null) {
            return configCache.getRemoteGrayConfig();
        }
        return null;
    }

    public void getGrayConfig(ConfigParam configParam) {
        if (TextUtils.isEmpty(this.token)) {
            this.mLogger.i(TAG, "token is empty");
            return;
        }
        List<String> grayConfigFeatureKeys = configParam.getGrayConfigFeatureKeys();
        if (grayConfigFeatureKeys == null || grayConfigFeatureKeys.size() == 0) {
            this.mLogger.i(TAG, "featureKeys is empty");
            return;
        }
        List<CollectInfo> grayConfigCollectInfos = configParam.getGrayConfigCollectInfos();
        this.mMonitor.sendGrayConfigRequestEvent(grayConfigFeatureKeys.toString());
        this.mTeaEventTrack.trackGrayConfigEvent("start", grayConfigFeatureKeys.toString(), null);
        try {
            String generateGrayReqBodyStr = generateGrayReqBodyStr(grayConfigFeatureKeys, grayConfigCollectInfos);
            CastLogger castLogger = this.mLogger;
            String str = TAG;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("grayRequestBody: ");
            LIZ.append(generateGrayReqBodyStr);
            LIZ.append(", token:");
            LIZ.append(this.token);
            LIZ.append(", featureKey:");
            LIZ.append(grayConfigFeatureKeys);
            castLogger.i(str, X1D.LIZIZ(LIZ));
            HashMap hashMap = new HashMap();
            hashMap.put("Content-Type", "application/json");
            hashMap.put("Token", this.token);
            String str2 = "";
            Response doPost = this.network.doPost(getConfigUrl(Constants.sAppContext), generateGrayReqBodyStr, hashMap);
            if (doPost.code == 200) {
                str2 = doPost.body;
            }
            HashMap<String, Object> parseGrayRep = parseGrayRep(str2);
            if (parseGrayRep == null || parseGrayRep.size() == 0) {
                CastLogger castLogger2 = this.mLogger;
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("response: ");
                LIZ2.append(str2);
                LIZ2.append(", response null");
                castLogger2.i(str, X1D.LIZIZ(LIZ2));
            }
            ConfigCache configCache = this.mConfigCache;
            if (configCache != null) {
                configCache.cacheRemoteGrayConfig(parseGrayRep);
            }
            this.mMonitor.sendGrayConfigResponseEvent(grayConfigFeatureKeys.toString(), true, "true");
            this.mTeaEventTrack.trackGrayConfigEvent("success", grayConfigFeatureKeys.toString(), "true");
            CastLogger castLogger3 = this.mLogger;
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("get grayConfig: ,featureKey:");
            LIZ3.append(grayConfigFeatureKeys);
            castLogger3.d(str, X1D.LIZIZ(LIZ3));
        } catch (InterruptedException e) {
            this.mMonitor.sendGrayConfigResponseEvent(grayConfigFeatureKeys.toString(), false, e.getMessage());
            this.mTeaEventTrack.trackGrayConfigEvent("failure", grayConfigFeatureKeys.toString(), e.getMessage());
            e.printStackTrace();
        } catch (ExecutionException e2) {
            this.mMonitor.sendGrayConfigResponseEvent(grayConfigFeatureKeys.toString(), false, e2.getMessage());
            this.mTeaEventTrack.trackGrayConfigEvent("failure", grayConfigFeatureKeys.toString(), e2.getMessage());
            e2.printStackTrace();
        } catch (Exception e3) {
            this.mMonitor.sendGrayConfigResponseEvent(grayConfigFeatureKeys.toString(), false, e3.getMessage());
            this.mTeaEventTrack.trackGrayConfigEvent("failure", grayConfigFeatureKeys.toString(), e3.getMessage());
            e3.printStackTrace();
        }
    }

    public void init(IHttpNetWork iHttpNetWork) {
        if (iHttpNetWork == null) {
            this.network = new DefaultHttpNetWork();
        } else {
            this.network = iHttpNetWork;
        }
    }

    public Object getConfig(String str) {
        ConfigCache configCache = this.mConfigCache;
        if (configCache != null) {
            return configCache.getRemoteGrayConfig(str);
        }
        return null;
    }

    public GrayConfigManager(ContextManager.CastContext castContext, ConfigCache configCache) {
        this.mLogger = ContextManager.getLogger(castContext);
        this.mMonitor = ContextManager.getMonitor(castContext);
        this.mTeaEventTrack = ContextManager.getTeaEventTrack(castContext);
        this.mConfigCache = configCache;
    }

    private String generateGrayReqBodyStr(List<String> list, List<CollectInfo> list2) {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        for (String str : list) {
            if (!TextUtils.isEmpty(str)) {
                jSONArray.put(str);
            }
        }
        jSONObject.put("feature_key", jSONArray);
        JSONArray jSONArray2 = new JSONArray();
        for (CollectInfo collectInfo : list2) {
            if (collectInfo != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("key", collectInfo.key);
                jSONObject2.put("value", collectInfo.value);
                jSONArray2.put(jSONObject2);
            }
        }
        jSONObject.put("collect_info", jSONArray2);
        return jSONObject.toString();
    }

    @Override // com.byted.cast.common.config.IConfigManager
    public void fetchConfig(final ConfigParam configParam, final IConfigListener iConfigListener) {
        CastLogger castLogger = this.mLogger;
        String str = TAG;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("fetchConfig: ");
        LIZ.append(configParam);
        castLogger.d(str, X1D.LIZIZ(LIZ));
        this.mRequestTask = new Runnable() { // from class: com.byted.cast.common.config.GrayConfigManager.1
            @Override // java.lang.Runnable
            public void run() {
                com_byted_cast_common_config_GrayConfigManager$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_byted_cast_common_config_GrayConfigManager$1__run$___twin___() {
                if (TextUtils.isEmpty(GrayConfigManager.this.token)) {
                    GrayConfigManager.this.getAuthToken();
                }
                GrayConfigManager.this.getGrayConfig(configParam);
                IConfigListener iConfigListener2 = iConfigListener;
                if (iConfigListener2 != null) {
                    iConfigListener2.onFetchResult();
                }
            }

            public static void com_byted_cast_common_config_GrayConfigManager$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                boolean LIZ2;
                try {
                    anonymousClass1.com_byted_cast_common_config_GrayConfigManager$1__run$___twin___();
                } finally {
                    if (LIZ2) {
                    }
                }
            }
        };
        Dispatcher.getInstance().enqueue(this.mRequestTask);
    }
}
