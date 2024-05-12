package X;

import android.os.Looper;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.property.AVPreferences;
import com.ss.android.ugc.aweme.publish.model.UploadAuthKeyConfig;
import com.ss.android.ugc.aweme.publish.model.UploadSettingConfig;
import com.ss.android.ugc.aweme.shortvideo.AVApiImpl;
import com.ss.android.ugc.aweme.utils.AuthKeyApi;
import kotlin.jvm.internal.o;

/* renamed from: X.H0t, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43379H0t {
    public static volatile UploadAuthKeyConfig LIZ;
    public static final Keva LIZIZ;

    static {
        Keva repo = Keva.getRepo("cache_authkey_keva");
        o.LJIIIIZZ(repo, "getRepo(REPO_NAME)");
        LIZIZ = repo;
    }

    public static UploadAuthKeyConfig LIZIZ() {
        Object LJI;
        if (LIZ == null) {
            String LIZ2 = LIZ();
            if (LIZ2.length() != 0) {
                try {
                    LJI = C60903NvH.LJIIJJI().LIZ().LJI(LIZ2, UploadAuthKeyConfig.class);
                } catch (Exception unused) {
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("Json AB ConfigError， Config:");
                    LIZ3.append(LIZ2);
                    H78.LIZJ(X1D.LIZIZ(LIZ3));
                }
                LIZ = (UploadAuthKeyConfig) LJI;
            }
            LJI = null;
            LIZ = (UploadAuthKeyConfig) LJI;
        }
        return LIZ;
    }

    public static String LIZ() {
        String str;
        C44423Hc3 LJ = C73098SmU.LJ();
        if (LJ != null) {
            str = LJ.getUid();
        } else {
            str = null;
        }
        if (str == null) {
            return "";
        }
        String authKey = LIZIZ.getString(str, "");
        o.LJIIIIZZ(authKey, "authKey");
        return authKey;
    }

    public static void LIZLLL(long j) {
        if (j == 100026 || j == -39982 || j == -190105 || j == 30406) {
            LIZ = null;
            LJFF("");
        }
    }

    public static void LJFF(String value) {
        String uid;
        o.LJIIIZ(value, "value");
        C44423Hc3 currentUser = C60903NvH.LJIIJJI().getAccountService().getCurrentUser();
        if (currentUser != null && (uid = currentUser.getUid()) != null) {
            LIZIZ.storeString(uid, value);
        }
    }

    public static final void LJI(UploadAuthKeyConfig result, long j) {
        boolean z;
        o.LJIIIZ(result, "result");
        UploadSettingConfig uploadSettingConfig = result.uploadSettingConfig;
        if (uploadSettingConfig == null) {
            return;
        }
        AVPreferences LJJIL = C60903NvH.LJIIJJI().LJJIL();
        boolean z2 = false;
        if (uploadSettingConfig.enablePreUpload == 1) {
            z = true;
        } else {
            z = false;
        }
        LJJIL.setEnablePreUpload(z);
        C60903NvH.LJIIJJI().LJJIL().setPreUploadEncryptionMode(uploadSettingConfig.preUploadEncryptionMode);
        AVPreferences LJJIL2 = C60903NvH.LJIIJJI().LJJIL();
        if (uploadSettingConfig.publishCloseClientWatermark == 0) {
            z2 = true;
        }
        LJJIL2.setWatermarkHardcode(z2);
        C41859Gbn LJJ = C60903NvH.LJIIJJI().getPublishService().LJJ();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("server config: publish_close_client_watermark=");
        V10.LJFF(LIZ2, uploadSettingConfig.publishCloseClientWatermark, ", authkey request time: ", j);
        LJJ.LIZJ("post_save_local", X1D.LIZIZ(LIZ2));
    }

    public static void LIZJ(java.util.Map map, InterfaceC88472Yns interfaceC88472Yns, InterfaceC88472Yns interfaceC88472Yns2) {
        InterfaceC36395EQd networkService = C60903NvH.LJIIJJI().getNetworkService();
        String LIZ2 = AVApiImpl.LIZJ().LIZ();
        o.LJIIIIZZ(LIZ2, "get().getService(AVApi::…s.java).apI_URL_PREFIX_SI");
        AbstractC73672Svk<UploadAuthKeyConfig> uploadAuthKeyConfig = ((AuthKeyApi) networkService.createRetrofit(LIZ2, true, AuthKeyApi.class)).getUploadAuthKeyConfig(map);
        if (o.LJ(Looper.myLooper(), C16880lQ.LLJJJJ()) || (Q3P.LIZ().getEnable() && o.LJ(C16880lQ.LLLLIIIILLL().getName(), ((Thread) C45857HzB.LIZIZ.getValue()).getName()))) {
            uploadAuthKeyConfig = uploadAuthKeyConfig.LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ());
        }
        uploadAuthKeyConfig.LIZ(new C43378H0s(System.currentTimeMillis(), interfaceC88472Yns2, interfaceC88472Yns));
    }

    public static final void LJ(boolean z, java.util.Map<String, String> params, InterfaceC88472Yns<? super UploadAuthKeyConfig, C76800UCe> onSuccess, InterfaceC88472Yns<? super Throwable, C76800UCe> onFailed) {
        Long l;
        o.LJIIIZ(params, "params");
        o.LJIIIZ(onSuccess, "onSuccess");
        o.LJIIIZ(onFailed, "onFailed");
        boolean z2 = false;
        int LIZ2 = C00F.LIZ(31744, 0, "studio_authkey_cache_timeout_s", true);
        if (z || LIZ2 <= 0) {
            LIZJ(params, new C43381H0v(onSuccess), onFailed);
            return;
        }
        LIZIZ();
        long currentTimeMillis = System.currentTimeMillis();
        UploadAuthKeyConfig uploadAuthKeyConfig = LIZ;
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("local cache is null? : ");
        if (uploadAuthKeyConfig == null) {
            z2 = true;
        }
        LIZ3.append(z2);
        X1D.LIZIZ(LIZ3);
        if (uploadAuthKeyConfig != null && currentTimeMillis - uploadAuthKeyConfig.saveTime <= LIZ2 * 1000) {
            C60903NvH.LJIIJJI().getRegionService();
            if (C44296Ha0.LIZ().equals(uploadAuthKeyConfig.currentRegion)) {
                onSuccess.invoke(uploadAuthKeyConfig);
                return;
            }
        }
        StringBuilder LIZJ = V10.LIZJ("currentTime: ", currentTimeMillis, ", localSaveTime: ");
        String str = null;
        if (uploadAuthKeyConfig != null) {
            l = Long.valueOf(uploadAuthKeyConfig.saveTime);
        } else {
            l = null;
        }
        LIZJ.append(l);
        LIZJ.append(", authKeyCacheTime: ");
        LIZJ.append(LIZ2);
        LIZJ.append(", currentRegion: ");
        C60903NvH.LJIIJJI().getRegionService();
        LIZJ.append(C44296Ha0.LIZ());
        LIZJ.append(", localCache region: ");
        if (uploadAuthKeyConfig != null) {
            str = uploadAuthKeyConfig.currentRegion;
        }
        LIZJ.append(str);
        X1D.LIZIZ(LIZJ);
        LIZJ(params, new C43382H0w(onSuccess), onFailed);
    }
}
