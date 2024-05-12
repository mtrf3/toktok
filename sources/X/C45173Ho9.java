package X;

import android.os.Build;
import com.bytedance.android.livesdk.livesetting.wallet.LiveWalletRechargeExchangeStrengthen;
import com.bytedance.ies.smartmovie.jni.DavinciResourceConfig;
import com.bytedance.ies.smartmovie.jni.SmartMovieJniJNI;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.effectplatform.EffectPlatform;
import com.ss.android.ugc.aweme.effectplatforn.EffectPlatformFactory;
import com.ss.android.ugc.effectmanager.link.model.host.Host;
import java.io.File;
import kotlin.jvm.internal.o;

/* renamed from: X.Ho9, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45173Ho9 extends AbstractC65781Prl implements InterfaceC65784Pro<DavinciResourceConfig> {
    public static final C45173Ho9 LJLIL = new C45173Ho9();

    public C45173Ho9() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final DavinciResourceConfig invoke() {
        DavinciResourceConfig davinciResourceConfig = new DavinciResourceConfig();
        String itemName = ((Host) ListProtector.get(EffectPlatformFactory.LIZ().getHosts(), 0)).getItemName();
        File file = EffectPlatform.LJLJJI;
        String absolutePath = file.getAbsolutePath();
        o.LJIIIIZZ(absolutePath, "LOCAL_CACHEDIR.absolutePath");
        if (!new File(absolutePath).exists()) {
            C1I0.LIZJ(absolutePath);
        }
        File file2 = EffectPlatform.LJLJJL;
        String absolutePath2 = file2.getAbsolutePath();
        o.LJIIIIZZ(absolutePath2, "LOCAL_MODEL_CACHEDIR.absolutePath");
        if (!new File(absolutePath2).exists()) {
            C1I0.LIZJ(absolutePath2);
        }
        SmartMovieJniJNI.DavinciResourceConfig_resourceCacheDir_set(davinciResourceConfig.LIZ, davinciResourceConfig, file.getAbsolutePath());
        SmartMovieJniJNI.DavinciResourceConfig_modelCacheDir_set(davinciResourceConfig.LIZ, davinciResourceConfig, file2.getAbsolutePath());
        C60903NvH.LJIIJJI().getApplicationService().getClass();
        SmartMovieJniJNI.DavinciResourceConfig_appVersion_set(davinciResourceConfig.LIZ, davinciResourceConfig, EF7.LIZLLL());
        C60903NvH.LJIIJJI().getApplicationService().getClass();
        SmartMovieJniJNI.DavinciResourceConfig_appID_set(davinciResourceConfig.LIZ, davinciResourceConfig, String.valueOf(EF7.LJIIIZ));
        C60903NvH.LJIIJJI().getApplicationService().getClass();
        String serverDeviceId = AppLog.getServerDeviceId();
        if (serverDeviceId == null) {
            serverDeviceId = "";
        }
        SmartMovieJniJNI.DavinciResourceConfig_deviceId_set(davinciResourceConfig.LIZ, davinciResourceConfig, serverDeviceId);
        SmartMovieJniJNI.DavinciResourceConfig_accessKey_set(davinciResourceConfig.LIZ, davinciResourceConfig, "ab2d1a104e6311eaa93831049d485a70");
        SmartMovieJniJNI.DavinciResourceConfig_deviceType_set(davinciResourceConfig.LIZ, davinciResourceConfig, Build.MODEL);
        SmartMovieJniJNI.DavinciResourceConfig_effectSdkVersion_set(davinciResourceConfig.LIZ, davinciResourceConfig, C60903NvH.LJIIJJI().LJIJI().getEffectSDKVersion());
        C78934UyQ.LJLIL.getRegionService();
        SmartMovieJniJNI.DavinciResourceConfig_region_set(davinciResourceConfig.LIZ, davinciResourceConfig, C44296Ha0.LIZ());
        SmartMovieJniJNI.DavinciResourceConfig_language_set(davinciResourceConfig.LIZ, davinciResourceConfig, C39391Fd5.LIZ(C5L7.LIZ()));
        SmartMovieJniJNI.DavinciResourceConfig_modelApiHost_set(davinciResourceConfig.LIZ, davinciResourceConfig, itemName);
        SmartMovieJniJNI.DavinciResourceConfig_channel_set(davinciResourceConfig.LIZ, davinciResourceConfig, LiveWalletRechargeExchangeStrengthen.DEFAULT);
        SmartMovieJniJNI.DavinciResourceConfig_platform_set(davinciResourceConfig.LIZ, davinciResourceConfig, "android");
        SmartMovieJniJNI.DavinciResourceConfig_fetchThreadCount_set(davinciResourceConfig.LIZ, davinciResourceConfig, 3L);
        SmartMovieJniJNI.DavinciResourceConfig_models_set(davinciResourceConfig.LIZ, davinciResourceConfig, "tt_face_extra,tt_face,nodehub_image_saliency,tt_c3_cls,nodehub_c3_300");
        return davinciResourceConfig;
    }
}
