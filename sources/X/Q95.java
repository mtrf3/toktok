package X;

import android.app.Activity;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.ropa.encrypt.EncryptResult;
import com.bytedance.ropa.encrypt.RopaEncrypt;
import com.ss.android.ugc.aweme.discover.model.NearByAuth;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.tiktok.location.serviceimpl.LocationServiceImpl;
import com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT;
import com.ss.android.ugc.tiktok.location_api.service.PermissionCache;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class Q95 {
    public static final /* synthetic */ int LIZ = 0;

    public static JSONObject LIZ(NearByAuth nearByAuth) {
        int i;
        Object obj;
        Object obj2 = "";
        JSONObject jSONObject = new JSONObject();
        ILocationBaseServiceForMT iLocationBaseServiceForMT = (ILocationBaseServiceForMT) ServiceManager.get().getService(ILocationBaseServiceForMT.class);
        boolean LJIJ = LocationServiceImpl.LJIJJ().LJIJ("android.permission.ACCESS_COARSE_LOCATION");
        boolean isSystemPrecise = iLocationBaseServiceForMT.isSystemPrecise(EF7.LIZIZ());
        boolean isSupportedPreciseGps = ((ILocationBaseServiceForMT) ServiceManager.get().getService(ILocationBaseServiceForMT.class)).isSupportedPreciseGps();
        try {
            try {
                Q0A q0a = C66236Pz6.LIZJ;
                String str = nearByAuth.encryptLatitude;
                if (str == null) {
                    str = "";
                }
                String str2 = nearByAuth.encryptLongitude;
                if (str2 == null) {
                    str2 = "";
                }
                TokenCert tokenCert = KSZ.LIZIZ;
                q0a.getClass();
                Q0B LIZJ = Q0A.LIZJ(str, str2, tokenCert);
                jSONObject.put("latitude", LIZJ.LJLIL);
                jSONObject.put("longitude", LIZJ.LJLILLLLZI);
            } catch (Q0C unused) {
            }
            jSONObject.put("currentLocationStatus", "1");
            if (LJIJ) {
                jSONObject.put("currentLocationStatus", "2");
            }
            if (isSystemPrecise) {
                jSONObject.put("currentLocationStatus", "3");
            }
            jSONObject.put("supportLocationStatus", String.valueOf(nearByAuth.countryAuth));
            if (nearByAuth.countryAuth == 3 && !isSupportedPreciseGps) {
                jSONObject.put("supportLocationStatus", "2");
            }
            if (!LocationServiceImpl.LJIJJ().LJIILIIL("search", "poi_biz")) {
                jSONObject.put("supportLocationStatus", "1");
            }
            try {
                String str3 = nearByAuth.encryptPlaceName;
                if (str3 == null) {
                    str3 = "";
                }
                EncryptResult decryptSeq = RopaEncrypt.getDecryptSeq(str3);
                if (decryptSeq != null) {
                    obj = decryptSeq.getData();
                } else {
                    obj = null;
                }
                if (obj != null) {
                    obj2 = obj;
                }
                jSONObject.put("formattedAddress", obj2);
            } catch (Q0C unused2) {
            }
            JSONObject jSONObject2 = new JSONObject();
            Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
            if (LJIIIIZZ != null) {
                PermissionCache.LJLIL.getClass();
                int i2 = 1;
                if (PermissionCache.LIZIZ("android.permission.ACCESS_COARSE_LOCATION")) {
                    i = 1;
                } else {
                    i = 0;
                }
                jSONObject2.put("enable_location", i);
                if (!iLocationBaseServiceForMT.isInAppPrecise()) {
                    i2 = 0;
                }
                jSONObject2.put("inapp_is_precise", i2);
                jSONObject2.put("system_is_precise", iLocationBaseServiceForMT.isSystemPrecise(LJIIIIZZ) ? 1 : 0);
            }
            jSONObject.put("locationMobParams", jSONObject2);
        } catch (JSONException unused3) {
        }
        return jSONObject;
    }
}
