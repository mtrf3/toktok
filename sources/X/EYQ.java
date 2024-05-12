package X;

import android.util.Pair;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.retrofit2.mime.TypedInput;
import com.ss.android.ugc.aweme.effectplatform.EffectNetworkAPI;
import com.ss.android.ugc.effectmanager.common.EffectRequest;
import com.ss.android.ugc.effectmanager.common.listener.IEffectNetWorker;
import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedHashMap;

/* loaded from: classes7.dex */
public final class EYQ implements IEffectNetWorker {
    public static String LIZ(C64797Pbt c64797Pbt) {
        String str = "";
        if (C32151Nz.LJJIIZI(c64797Pbt.LIZ.LIZLLL)) {
            for (EJ6 ej6 : c64797Pbt.LIZ.LIZLLL) {
                if ("x-tt-logid".equalsIgnoreCase(ej6.LIZ)) {
                    str = ej6.LIZIZ;
                }
            }
        }
        return str;
    }

    @Override // com.ss.android.ugc.effectmanager.common.listener.IEffectNetWorker
    public final InputStream execute(EffectRequest effectRequest) {
        C64797Pbt<TypedInput> execute;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        InputStream inputStream = null;
        try {
            Pair<String, String> LIZJ = EZX.LIZJ(effectRequest.getUrl(), linkedHashMap);
            String str = (String) LIZJ.first;
            String str2 = (String) LIZJ.second;
            boolean isUseCommonParams = effectRequest.isUseCommonParams();
            C60903NvH.LJIIJJI().getApplicationService().getClass();
            EffectNetworkAPI effectNetworkAPI = (EffectNetworkAPI) C60903NvH.LJIIJJI().getNetworkService().createRetrofit(str, isUseCommonParams, EffectNetworkAPI.class);
            if ("POST".equals(effectRequest.getHttpMethod())) {
                execute = effectNetworkAPI.doPost(isUseCommonParams, Integer.MAX_VALUE, str2, effectRequest.getParams()).execute();
            } else {
                execute = effectNetworkAPI.doGet(isUseCommonParams, Integer.MAX_VALUE, str2, linkedHashMap).execute();
            }
            if (execute.LIZIZ()) {
                inputStream = execute.LIZIZ.in();
                effectRequest.setContentLength(execute.LIZIZ.length());
            }
            SettingsManager.LIZLLL().getClass();
            if (SettingsManager.LIZ("set_log_id_to_effect_platform_sdk", true)) {
                effectRequest.setLogId(LIZ(execute));
            }
        } catch (IOException e) {
            effectRequest.setErrorMsg(e.getMessage());
        } catch (Exception e2) {
            effectRequest.setErrorMsg(e2.getMessage());
        }
        return inputStream;
    }
}
