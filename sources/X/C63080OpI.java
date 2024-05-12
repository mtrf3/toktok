package X;

import com.bef.effectsdk.GeneralParam;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.OpI, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63080OpI implements GeneralParam.GetNetWorkInfo {
    @Override // com.bef.effectsdk.GeneralParam.GetNetWorkInfo
    public final int checkUrl(String url) {
        o.LJIIIZ(url, "url");
        int checkUrlValid = AVExternalServiceImpl.LIZ().abilityService().effectService().checkUrlValid(url);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("checkUrl, url=");
        LIZ.append(url);
        LIZ.append(", result=");
        LIZ.append(checkUrlValid);
        H78.LIZIZ("JEFF", X1D.LIZIZ(LIZ));
        return checkUrlValid;
    }

    @Override // com.bef.effectsdk.GeneralParam.GetNetWorkInfo
    public final HashMap<String, String> getHeader(String str) {
        HashMap<String, String> hashMap = new HashMap<>();
        if (C78685UuP.LJJJZ(str)) {
            hashMap.put("X-App-Id", String.valueOf(EF7.LJIIIZ));
            String com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId = DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId();
            o.LJIIIIZZ(com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId, "getDeviceId()");
            hashMap.put("X-Device-Id", com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId);
            String userTTToken = C60903NvH.LJIIJJI().getAccountService().getUserTTToken();
            String str2 = "";
            if (userTTToken == null) {
                userTTToken = "";
            }
            hashMap.put("X-Tt-Token", userTTToken);
            C60903NvH.LJIIJJI().getAccountService().getSDKVersion();
            hashMap.put("Sdk-Version", "2");
            String LJFF = C60903NvH.LJIIJJI().getAccountService().LJFF();
            if (LJFF != null) {
                str2 = LJFF;
            }
            hashMap.put("Passport-Sdk-Version", str2);
        }
        return hashMap;
    }

    @Override // com.bef.effectsdk.GeneralParam.GetNetWorkInfo
    public final HashMap<String, String> getParam(String str) {
        HashMap<String, String> hashMap = new HashMap<>();
        if (C78685UuP.LJJJZ(str)) {
            QJY.LJI(hashMap, true);
        }
        return hashMap;
    }
}
