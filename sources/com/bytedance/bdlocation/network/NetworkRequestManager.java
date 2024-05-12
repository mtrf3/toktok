package com.bytedance.bdlocation.network;

import X.C36910EeA;
import X.C64797Pbt;
import X.C65083PgV;
import X.EJ6;
import X.X1D;
import android.text.TextUtils;
import com.bytedance.bdlocation.client.BDLocationConfig;
import com.bytedance.bdlocation.entity.UploadLogEntity;
import com.bytedance.bdlocation.log.Logger;
import com.bytedance.bdlocation.network.request.RequestUtil;
import com.bytedance.bdlocation.store.LocationCache;
import com.bytedance.bdlocation.utils.json.JsonUtil;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.retrofit2.mime.TypedString;
import com.bytedance.ttnet.INetworkApi;
import java.util.Map;

/* loaded from: classes24.dex */
public class NetworkRequestManager {
    public static String getBaseUrl() {
        String baseUrl = BDLocationConfig.getBaseUrl();
        if (!TextUtils.isEmpty(baseUrl)) {
            return baseUrl;
        }
        Logger.e("Set the domain name of the business itself when it needs to be initialized: BDLocationConfig.setBaseUrl(\"xxxx\")");
        return "";
    }

    public static void cacheLogId(C64797Pbt<String> c64797Pbt) {
        C36910EeA c36910EeA;
        if (c64797Pbt == null || (c36910EeA = c64797Pbt.LIZ) == null) {
            Logger.i("cacheLogId ssResponse error");
            return;
        }
        EJ6 LIZ = c36910EeA.LIZ("X-Tt-Logid");
        if (LIZ == null) {
            Logger.i("cacheLogId firstHeader error");
            return;
        }
        String str = LIZ.LIZIZ;
        UploadLogEntity uploadLogEntity = new UploadLogEntity();
        uploadLogEntity.logId = str;
        uploadLogEntity.timestamp = System.currentTimeMillis() / 1000;
        BDLocationConfig.setUploadLogEntity(uploadLogEntity);
        LocationCache.getInstance().setStringValue("location_upload_log", GsonProtectorUtils.toJson(JsonUtil.sGson, uploadLogEntity));
        Logger.i("cacheLogId setUploadLogEntity success");
    }

    public static String get(String str, Map<String, String> map, int i) {
        try {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("NetworkRequest get Path:");
            LIZ.append(str);
            Logger.i(X1D.LIZIZ(LIZ));
            String str2 = ((INetworkApiInner) C65083PgV.LJIIIIZZ(INetworkApiInner.class, getBaseUrl())).doGet(true, -1, str, map, RequestUtil.headerList(null, i), null).execute().LIZIZ;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("NetworkRequestManager post networkResponse:");
            LIZ2.append(str2);
            Logger.i(X1D.LIZIZ(LIZ2));
            return str2;
        } catch (Exception e) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("NetworkRequestManager get exception:");
            LIZ3.append(e.getMessage());
            Logger.e(X1D.LIZIZ(LIZ3));
            return "";
        }
    }

    public static String postJson(String str, TypedString typedString, Map<String, String> map) {
        String str2;
        if (!BDLocationConfig.isPrivacyConfirmed()) {
            Logger.i("The upload of data is allowed after user confirmed the privacy!");
            return "";
        }
        try {
            long currentTimeMillis = System.currentTimeMillis();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("NetworkRequest post Path:");
            LIZ.append(str);
            Logger.i(X1D.LIZIZ(LIZ));
            ICustomNetworkApi networkApi = BDLocationConfig.getNetworkApi();
            if (networkApi != null) {
                str2 = networkApi.doPostJson(getBaseUrl(), str, map, typedString, RequestUtil.jsonHeaderList(null), true);
            } else {
                str2 = ((INetworkApi) C65083PgV.LJIIIIZZ(INetworkApi.class, getBaseUrl())).postBody(-1, str, map, typedString, RequestUtil.jsonHeaderList(null)).execute().LIZIZ;
            }
            Logger.i("NetworkRequestManager post intervalTime:" + (System.currentTimeMillis() - currentTimeMillis) + "--networkResponse:" + str2);
            return str2;
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("NetworkRequestManager post exception:");
            LIZ2.append(e.getMessage());
            Logger.e(X1D.LIZIZ(LIZ2));
            return "";
        }
    }

    public static String post(String str, Map<String, String> map, Map<String, String> map2, int i) {
        C64797Pbt<String> execute;
        if (!BDLocationConfig.isPrivacyConfirmed()) {
            Logger.i("The upload of data is allowed after user confirmed the privacy!");
            return "";
        }
        try {
            long currentTimeMillis = System.currentTimeMillis();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("NetworkRequest post Path:");
            LIZ.append(str);
            Logger.i(X1D.LIZIZ(LIZ));
            ICustomNetworkApi networkApi = BDLocationConfig.getNetworkApi();
            if (networkApi != null) {
                execute = networkApi.doPost(getBaseUrl(), str, map2, map, RequestUtil.headerList(null, i), true);
            } else {
                execute = ((INetworkApiInner) C65083PgV.LJIIIIZZ(INetworkApiInner.class, getBaseUrl())).doPost(-1, str, map2, map, RequestUtil.headerList(null, i), null, true).execute();
            }
            if (execute == null) {
                return "";
            }
            if ("/location/submit-v2/".equals(str) && !BDLocationConfig.isOverSeas()) {
                cacheLogId(execute);
            }
            String str2 = execute.LIZIZ;
            Logger.i("NetworkRequestManager post intervalTime:" + (System.currentTimeMillis() - currentTimeMillis) + "--networkResponse:" + str2);
            return str2;
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("NetworkRequestManager post exception:");
            LIZ2.append(e.getMessage());
            Logger.e(X1D.LIZIZ(LIZ2));
            return "";
        }
    }
}
