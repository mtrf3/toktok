package com.bytedance.pitaya.cep_package;

import X.C16880lQ;
import android.content.Context;
import com.bytedance.pitaya.cep_engine.CepEngineManager;
import com.bytedance.pitaya.cep_engine.error.CepErrorCode;
import com.bytedance.pitaya.cep_engine.helper.DictProxyHelper;
import com.bytedance.pitaya.cep_package.port.CepPackageCallback;
import com.bytedance.pitaya.cep_package.util.AndroidUtility;
import com.bytedance.pitaya.cep_package.util.Utility;
import com.ss.android.ugc.aweme.live.strategy.LiveCepManager$downloadAllPkgs$1;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class CepPackageManager {
    public static final CepPackageManager LIZ = new CepPackageManager();

    private final native void nativeDownload(String str, String str2, CepPackageCallback cepPackageCallback);

    private final native int nativeHostSetup(String str, CepSetupInfo cepSetupInfo);

    private final native void nativeOnEvent(String str, DictProxyHelper dictProxyHelper, long j);

    private final native void nativeOnEventInCurrentThread(String str, DictProxyHelper dictProxyHelper, long j);

    private final native void nativeQuery(String str, String str2, CepPackageCallback cepPackageCallback);

    private final native void nativeSetAdapter(Utility utility);

    private final native int nativeSetup(String str, CepSetupInfo cepSetupInfo);

    static {
        try {
            C16880lQ.LLJJJIL("CepPackage");
        } catch (Throwable unused) {
        }
    }

    public static void LIZ(LiveCepManager$downloadAllPkgs$1 liveCepManager$downloadAllPkgs$1) {
        try {
            LIZ.nativeDownload("1728", "", liveCepManager$downloadAllPkgs$1);
        } catch (Throwable unused) {
        }
    }

    public static CepErrorCode LIZJ(Context context, CepSetupInfo cepSetupInfo) {
        int code = CepErrorCode.SUCCESS.getCode();
        try {
            CepEngineManager.INSTANCE.init();
            CepPackageManager cepPackageManager = LIZ;
            cepPackageManager.nativeSetAdapter(AndroidUtility.INSTANCE);
            String absolutePath = C16880lQ.LLIIJLIL(context).getAbsolutePath();
            if (absolutePath == null) {
                absolutePath = "";
            }
            code = cepPackageManager.nativeSetup(absolutePath, cepSetupInfo);
        } catch (Throwable unused) {
        }
        CepErrorCode cepErrorCode = CepErrorCode.SUCCESS;
        if (code == cepErrorCode.getCode()) {
            return cepErrorCode;
        }
        CepErrorCode cepErrorCode2 = CepErrorCode.NOT_SETUP;
        if (code == cepErrorCode2.getCode()) {
            return cepErrorCode2;
        }
        CepErrorCode cepErrorCode3 = CepErrorCode.DUPLICATE_SETUP;
        if (code == cepErrorCode3.getCode()) {
            return cepErrorCode3;
        }
        CepErrorCode cepErrorCode4 = CepErrorCode.UNZIP_FAILED;
        if (code == cepErrorCode4.getCode()) {
            return cepErrorCode4;
        }
        CepErrorCode cepErrorCode5 = CepErrorCode.DOWNLOAD_FAILED;
        if (code == cepErrorCode5.getCode()) {
            return cepErrorCode5;
        }
        CepErrorCode cepErrorCode6 = CepErrorCode.INVALID_BUSINESS_NAME;
        if (code == cepErrorCode6.getCode()) {
            return cepErrorCode6;
        }
        CepErrorCode cepErrorCode7 = CepErrorCode.REGISTER_FAILED;
        if (code == cepErrorCode7.getCode()) {
            return cepErrorCode7;
        }
        CepErrorCode cepErrorCode8 = CepErrorCode.CANT_FIND_CEP_INFO;
        if (code == cepErrorCode8.getCode()) {
            return cepErrorCode8;
        }
        CepErrorCode cepErrorCode9 = CepErrorCode.INVALID_CEP_INFO;
        if (code == cepErrorCode9.getCode()) {
            return cepErrorCode9;
        }
        CepErrorCode cepErrorCode10 = CepErrorCode.CEP_RESOURCE_ERR;
        if (code == cepErrorCode10.getCode()) {
            return cepErrorCode10;
        }
        CepErrorCode cepErrorCode11 = CepErrorCode.INVALID_CEP_JSON;
        if (code == cepErrorCode11.getCode()) {
            return cepErrorCode11;
        }
        CepErrorCode cepErrorCode12 = CepErrorCode.REQUEST_FAILED;
        if (code == cepErrorCode12.getCode()) {
            return cepErrorCode12;
        }
        return null;
    }

    public static void LIZIZ(String eventName, long j, JSONObject params) {
        o.LJIIIZ(eventName, "eventName");
        o.LJIIIZ(params, "params");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("name", eventName);
        jSONObject.put("timestamp", j);
        jSONObject.put("params", params);
        try {
            LIZ.nativeOnEvent(eventName, new DictProxyHelper(jSONObject), j);
        } catch (Throwable unused) {
        }
    }
}
