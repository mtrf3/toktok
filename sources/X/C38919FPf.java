package X;

import Y.ACallableS83S0200000_6;
import Y.AgS109S0200000_6;
import Y.AgS74S0300000_6;
import android.text.TextUtils;
import com.bytedance.ies.abmock.ConfigItem;
import com.bytedance.keva.Keva;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.favorites.service.FavoriteServiceImpl;
import com.ss.android.ugc.aweme.favorites.service.IFavoriteService;
import com.ss.android.ugc.aweme.feedback.runtime.behavior.RuntimeBehaviorServiceImpl;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.ttuploader.IExternalUploaderService;
import com.ss.android.ugc.aweme.services.upload.ExternalUploadVideoConfig;
import com.ss.bduploader.BDObjectUploader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS169S0200000_6;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import v5.n;

/* renamed from: X.FPf, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38919FPf {
    public static void LIZJ() {
        java.util.Map<String, ConfigItem> map = KUZ.LIZ;
        JSONArray jSONArray = new JSONArray();
        HashMap hashMap = (HashMap) map;
        for (String str : hashMap.keySet()) {
            JSONObject jSONObject = new JSONObject();
            FHD.LIZLLL().getClass();
            Object LJIIJ = FHD.LJIIJ(str, true);
            ConfigItem configItem = (ConfigItem) hashMap.get(str);
            if (configItem != null) {
                jSONObject.put("abKey", str);
                jSONObject.put("filedTypedName", configItem.type.toString());
                if (LJIIJ == null || o.LJ(LJIIJ, "null")) {
                    jSONObject.put("value", "null");
                } else {
                    jSONObject.put("value", LJIIJ.toString());
                }
                jSONArray.put(jSONObject);
            }
        }
        String jSONArray2 = jSONArray.toString();
        o.LJIIIIZZ(jSONArray2, "res.toString()");
        try {
            C268313n c268313n = new C268313n("y+6T0b/qfIqkZDbYHfFiN/8XI5fyqrwX5d2WZ2NN3w==");
            if (!c268313n.exists()) {
                c268313n.mkdir();
            }
            C268413o c268413o = new C268413o(new C268313n("y++T0b/oeIukZDfZHPFiNf8XI5fyqrwX5d2WZ2NN32Fsy5H77EPLLv3Kd2s="));
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(c268413o));
            bufferedWriter.write(jSONArray2);
            bufferedWriter.close();
            c268413o.close();
        } catch (IOException unused) {
        }
    }

    public static C10K LIZLLL() {
        IExternalUploaderService externalUploaderService = AVExternalServiceImpl.LIZ().externalUploaderService();
        n nVar = new n();
        String sdkV4AuthKey = externalUploaderService.getSdkV4AuthKey();
        if (TextUtils.isEmpty(sdkV4AuthKey)) {
            externalUploaderService.cacheUploadAuthKeyConfig();
            nVar.LIZJ("Failed Upload Config: NO sdkV4AuthKey");
            return nVar.LIZ;
        }
        ExternalUploadVideoConfig uploadVideoConfig = externalUploaderService.getUploadVideoConfig(sdkV4AuthKey);
        BDObjectUploader bDObjectUploader = new BDObjectUploader();
        bDObjectUploader.setListener(new C36470ETa(nVar, bDObjectUploader));
        bDObjectUploader.setTopAccessKey(uploadVideoConfig.getTopAccessKey());
        bDObjectUploader.setTopSecretKey(uploadVideoConfig.getTopSecretKey());
        bDObjectUploader.setTopSessionToken(uploadVideoConfig.getTopSessionToken());
        bDObjectUploader.setSpaceName(uploadVideoConfig.getSpaceName());
        bDObjectUploader.setUploadDomain(uploadVideoConfig.getVideoHostName());
        bDObjectUploader.setSliceSize(uploadVideoConfig.getSliceSize());
        bDObjectUploader.setSocketNum(1);
        bDObjectUploader.setSliceRetryCount(1);
        bDObjectUploader.setFileRetryCount(1);
        bDObjectUploader.setFilePath(1, new String[]{new C268313n("y++T0b/oeIukZDfZHPFiNf8XI5fyqrwX5d2WZ2NN32Fsy5H77EPLLv3Kd2s=").getAbsolutePath()});
        bDObjectUploader.setNetworkType(403, externalUploaderService.getUploadMainNetworkType());
        bDObjectUploader.setNetworkType(404, externalUploaderService.getUploadBackupNetworkType());
        bDObjectUploader.start();
        return nVar.LIZ;
    }

    public static JSONObject LIZIZ(String str) {
        String str2;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("is_from_h5", "true");
            JSONObject jSONObject2 = new JSONObject();
            IFavoriteService LJIJJLI = FavoriteServiceImpl.LJIJJLI();
            if (LJIJJLI != null && LJIJJLI.LJIIIZ()) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                z2 = true;
            } else {
                z2 = false;
            }
            jSONObject2.put("favorite_reverse", z2);
            LFH.LIZIZ.LIZLLL().block().LJIIJ();
            jSONObject2.put("is_table", false);
            IFavoriteService LJIJJLI2 = FavoriteServiceImpl.LJIJJLI();
            if (LJIJJLI2 != null && LJIJJLI2.LJFF()) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (!z3) {
                z4 = true;
            } else {
                z4 = false;
            }
            jSONObject2.put("favorite_on_video_player", z4);
            jSONObject2.put("has_player_favorite_button", C203657yz.LIZ);
            jSONObject.put("favorite_info", jSONObject2.toString());
            jSONObject.put("favorite_last_30_api_error", C203657yz.LIZIZ.LJII());
            String[] disableUploadRegion = C2YJ.LIZIZ.LIZ.getFeedbackConf().getDisableUploadRegion();
            if (disableUploadRegion != null) {
                if (disableUploadRegion.length == 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (!z5) {
                    jSONObject.put("disable_upload_region", C75792yF.LIZJ(disableUploadRegion));
                }
            }
        } catch (Exception unused) {
        }
        if (RuntimeBehaviorServiceImpl.LJ().LIZLLL()) {
            for (Map.Entry<String, String> entry : RuntimeBehaviorServiceImpl.LJ().LIZIZ().entrySet()) {
                try {
                    jSONObject.put(entry.getKey(), entry.getValue());
                } catch (JSONException unused2) {
                }
            }
        }
        try {
            java.util.Map<String, ?> all = Keva.getRepo("user_logout_log").getAll();
            if (all.isEmpty()) {
                str2 = null;
            } else {
                StringBuilder sb = new StringBuilder();
                for (Map.Entry<String, ?> entry2 : all.entrySet()) {
                    if (!o.LJ(entry2.getKey(), "last_time")) {
                        sb.append(entry2.getKey());
                        sb.append(":");
                        sb.append(entry2.getValue());
                        sb.append(" ");
                    }
                }
                str2 = sb.toString();
            }
        } catch (Exception unused3) {
            str2 = "error";
        }
        if (C19N.LJ("abclone2_feedback", false) && !TextUtils.isEmpty(str) && !o.LJ("null", str)) {
            try {
                jSONObject.put("abnor_abclone", str);
            } catch (JSONException unused4) {
            }
        }
        if (!TextUtils.isEmpty(str2)) {
            try {
                jSONObject.put("logout_info", str2);
            } catch (JSONException unused5) {
            }
        }
        return jSONObject;
    }

    public final void LIZ(InterfaceC88472Yns<? super JSONObject, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super Integer, ? super String, C76800UCe> interfaceC88471Ynr) {
        C34K c34k = new C34K();
        AqS169S0200000_6 aqS169S0200000_6 = new AqS169S0200000_6(c34k, (C34K) interfaceC88471Ynr, (InterfaceC88471Ynr<? super Integer, ? super String, C76800UCe>) 1);
        String str = null;
        C10K.LIZJ(new ACallableS83S0200000_6(this, aqS169S0200000_6, 19)).LJ(new AgS109S0200000_6(this, aqS169S0200000_6, 5), C10K.LJI, null).LJ(new AgS74S0300000_6(aqS169S0200000_6, c34k, interfaceC88472Yns, 2), C10K.LJIIIIZZ, null);
        long j = 1000;
        long currentTimeMillis = (System.currentTimeMillis() / j) - 10800;
        long currentTimeMillis2 = System.currentTimeMillis() / j;
        C66004PvM c66004PvM = ALog.sConfig;
        if (c66004PvM != null) {
            str = c66004PvM.LJFF;
        }
        C38922FPi c38922FPi = C38922FPi.LIZ;
        C38921FPh c38921FPh = C38921FPh.LIZ;
        if (!new C03880Dg(2).LIZJ(10303, "com/bytedance/apm/ApmAgent", "activeUploadAlog", C09900aA.class, new Object[]{str, Long.valueOf(currentTimeMillis), Long.valueOf(currentTimeMillis2), "feedback", c38922FPi, c38921FPh}, "void", new C65300Pk0(false, "(Ljava/lang/String;JJLjava/lang/String;Lcom/bytedance/apm/alog/IALogActiveUploadObserver;Lcom/bytedance/apm/alog/IALogActiveUploadCallback;)V", "-236030358961058591")).LIZ) {
            C09900aA.LIZ(str, currentTimeMillis, currentTimeMillis2, "feedback", c38922FPi, c38921FPh);
        }
        G2V.LIZIZ.LIZIZ();
    }
}
