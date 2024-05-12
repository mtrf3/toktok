package X;

import Y.ARunnableS14S0201000_11;
import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.ss.android.common.applog.AppLog;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.net.mutli.network.SpeedModeServiceImpl;
import com.ss.android.ugc.aweme.service.ILarkMsgReportHostService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.regex.Pattern;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.AqS161S0100000_11;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class FX4 extends AbstractC64719Pad {
    public static final FX4 LIZ = new FX4();
    public static final Keva LIZIZ = Keva.getRepo("network_keva");
    public static final Pattern LIZJ = PatternProtector.compile("(https:.+?)\\?.+?,.*?store-country-code=([a-zA-Z]+);.*? store-country-code-src=([a-zA-Z]+);.*?x-tt-logid=\\[([0-9a-zA-Z]+?)\\]");
    public static final Pattern LIZLLL = PatternProtector.compile("x-tt-tnc-attr=\\[(.*?)\\]");
    public static final Pattern LJ = PatternProtector.compile("x-tt-with-tnc=\\[([0-9A-Za-z]+)\\]");

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final String getAbClient() {
        return null;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final String getAbFeature() {
        return null;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final String getAbFlag() {
        return CardStruct.IStatusCode.DEFAULT;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final String getAppId() {
        return String.valueOf(DeviceRegisterManager.getAppId());
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final String getAppInitialRegionInfo() {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("carrierregion=");
        LIZ2.append(C85990Xow.LJ());
        LIZ2.append(";mccmnc=");
        LIZ2.append(C39380Fcu.LIZIZ());
        LIZ2.append(";sysregion=");
        LIZ2.append(C85990Xow.LJFF());
        LIZ2.append(";appregion=");
        LIZ2.append(C85990Xow.LIZIZ());
        return X1D.LIZIZ(LIZ2);
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final String getGetDomainDefaultJSON() {
        return C38652FEy.LJFF;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final ArrayList<byte[]> getOpaqueData() {
        if (LIZIZ.getBoolean("opaque_data_enabled", true)) {
            ArrayList<byte[]> opaqueDataList = (ArrayList) C35742E1a.LIZIZ.getValue();
            o.LJIIIZ(opaqueDataList, "opaqueDataList");
            AqS161S0100000_11 aqS161S0100000_11 = new AqS161S0100000_11(opaqueDataList, (ArrayList<byte[]>) 50);
            E3F.LIZJ("useIOThreadPool", new AqS151S0100000_1(aqS161S0100000_11, 683), new AqS151S0100000_1(aqS161S0100000_11, 682), ((Boolean) DN4.LIZLLL.getValue()).booleanValue());
            return opaqueDataList;
        }
        return null;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final String getOpenUdid() {
        return "";
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final String getStoreIdcRuleJSON() {
        return "{\"update_store_idc_path_list\": [\"/passport/*\", \"/service/*/device_register/\", \"/service/*/app_alert_check/\", \"/service/*/app_alert/\"],\"add_store_idc_host_list\": [\"*.tiktokv.com\",\"*.tiktok.com\", \"*.tiktokv.com.boe-gateway.byted.org\"]}";
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final String getUUID() {
        return "";
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final String getUserId() {
        String com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_legoImp_task_InitModules_getUserId = AppLog.com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_legoImp_task_InitModules_getUserId();
        if (C38354F3m.LJ(com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_legoImp_task_InitModules_getUserId) || com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_legoImp_task_InitModules_getUserId.equals(CardStruct.IStatusCode.DEFAULT)) {
            return HG3.LJIILL().getCurUserId();
        }
        return com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_legoImp_task_InitModules_getUserId;
    }

    public static JSONArray LIZ() {
        JSONArray jSONArray = new JSONArray();
        if (ServiceManager.get().getService(ILarkMsgReportHostService.class) != null) {
            String LIZ2 = ((ILarkMsgReportHostService) ServiceManager.get().getService(ILarkMsgReportHostService.class)).LIZ();
            if (!TextUtils.isEmpty(LIZ2)) {
                jSONArray.put(LIZ2);
            }
        }
        Iterator<String> it = C37091Eh5.LIZ().getBoeBypassHostList().iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next());
        }
        return jSONArray;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final String getBypassBOEJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("bypass_boe_host_list", LIZ());
            JSONArray jSONArray = new JSONArray();
            Iterator<String> it = C37091Eh5.LIZ().getBoeBypassPathList().iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next());
            }
            jSONObject.put("bypass_boe_path_list", jSONArray);
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final String getAbVersion() {
        return EF7.LIZLLL();
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final String getAppName() {
        return EF7.LIZ();
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final String getCarrierRegion() {
        return C85990Xow.LJ();
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final String getDeviceId() {
        return AppLog.getServerDeviceId();
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final String getManifestVersionCode() {
        return String.valueOf(EF7.LJI());
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final String getRegion() {
        return C85990Xow.LIZIZ();
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final String getStoreIdc() {
        return C86796Y4q.get().getStoreIdc();
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final String getSysRegion() {
        return C85990Xow.LJFF();
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final java.util.Map<String, String> getTNCRequestHeader() {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("https://");
        C66960QPs.LIZ().getClass();
        LIZ2.append("api-va.tiktokv.com");
        return C66952QPk.LIZ(X1D.LIZIZ(LIZ2));
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final String getUpdateVersionCode() {
        return String.valueOf(EF7.LJFF());
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final String getVersionCode() {
        return String.valueOf(EF7.LIZJ());
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final String getVersionName() {
        return EF7.LIZLLL();
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetDepend
    public final boolean loggerDebug() {
        if (V2B.LJFF() || "local_test".equals(EF7.LJIILIIL)) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final String getChannel() {
        return EF7.LJIILIIL;
    }

    @Override // X.AbstractC64719Pad, com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final void onEffectiveConnectionTypeChanged(int i) {
        super.onEffectiveConnectionTypeChanged(i);
        IEN.LIZIZ.notifyNQEChange(i);
    }

    @Override // X.AbstractC64719Pad, com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final void onServerConfigUpdated(String str) {
        HashMap hashMap;
        FX8.LJFF();
        super.onServerConfigUpdated(str);
        try {
            JSONObject jSONObject = JSONObjectProtectorUtils.getJSONObject(new JSONObject(str), "data");
            String string = JSONObjectProtectorUtils.getString(jSONObject, "share_cookie_host_list");
            String[] split = string.split(",");
            ArrayList arrayList = new ArrayList();
            for (String str2 : split) {
                if (str2.startsWith(".")) {
                    str2 = str2.substring(1);
                }
                arrayList.add(str2);
            }
            FX1.LIZIZ.LJII(arrayList);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("tnc shareCookieList ");
            LIZ2.append(string);
            X1D.LIZIZ(LIZ2);
            FX8.LJFF();
            InterfaceC46732IVs LIZ3 = C47242IgQ.LIZ();
            JSONObject jSONObject2 = JSONObjectProtectorUtils.getJSONObject(jSONObject, "ttnet_http_dns_addr");
            if (jSONObject2 == null) {
                hashMap = null;
            } else {
                hashMap = new HashMap();
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    hashMap.put(next, String.valueOf(jSONObject2.get(next)));
                }
            }
            LIZ3.updateDnsBackupIpMap(hashMap);
        } catch (JSONException unused) {
        }
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final void onMultiNetworkStateChanged(int i, int i2) {
        Logger.debug();
        SpeedModeServiceImpl.LJII().LIZ(i, i2);
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final void sendAppMonitorEvent(String str, String str2) {
        try {
            if (V2B.LJFF()) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("Get monitor json = ");
                LIZ2.append(str);
                LIZ2.append(" logType = ");
                LIZ2.append(str2);
                X1D.LIZIZ(LIZ2);
            }
            JSONObject jSONObject = new JSONObject(str);
            FUA.LIZJ(str2, jSONObject);
            if ("ttnet_init".equals(str2)) {
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("Get monitor json = ");
                LIZ3.append(str);
                LIZ3.append(" logType = ");
                LIZ3.append(str2);
                X1D.LIZIZ(LIZ3);
                JSONObject optJSONObject = jSONObject.optJSONObject("ttnet_duration");
                if (optJSONObject != null) {
                    Iterator<String> keys = optJSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        C56662Kg.LIZ().LIZ(optJSONObject.optLong(next), C16880lQ.LLLZ("%s_%s", new Object[]{"ttnet_duration", next}));
                    }
                    return;
                }
                return;
            }
            if ("store_idc".equals(str2)) {
                C38995FSd.LIZJ().execute(new ARunnableS14S0201000_11(2, jSONObject, str, 11));
            }
        } catch (Throwable unused) {
        }
    }
}
