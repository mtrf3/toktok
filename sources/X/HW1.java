package X;

import android.content.Context;
import android.os.Build;
import com.bef.effectsdk.BEFEffectNative;
import com.ss.android.ugc.aweme.common.NaviEffectNetworkerImpl;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.effectmanager.DownloadableModelConfig;
import com.ss.android.ugc.effectmanager.DownloadableModelSupport;
import com.ss.android.ugc.effectmanager.EffectManager;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.link.model.host.Host;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HW1 {
    public static final String LIZ = BEFEffectNative.nativeGetEffectSDKVersion();
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(HW3.LJLIL);

    public static DownloadableModelSupport LIZIZ(Context context) {
        String str;
        DownloadableModelConfig.ModelFileEnv modelFileEnv;
        o.LJIIIZ(context, "context");
        if (!DownloadableModelSupport.isInitialized()) {
            DownloadableModelConfig.Builder builder = new DownloadableModelConfig.Builder();
            builder.setContext(context);
            builder.setAccessKey("142710f02c3a11e8b42429f14557854a");
            C60903NvH.LJIIJJI().getRegionService();
            Boolean LIZIZ2 = C44296Ha0.LIZIZ();
            o.LJIIIIZZ(LIZIZ2, "getAPI().regionService.isInTikTokRegion");
            if (LIZIZ2.booleanValue()) {
                str = "1180";
            } else {
                str = "1233";
            }
            builder.setAppId(str);
            builder.setHosts(C47261Igj.LJII(new Host("https://api-va.tiktokv.com")));
            builder.setSdkVersion(LIZ);
            builder.setDeviceType(Build.MODEL);
            builder.setJsonConverter(new F2V());
            if (AVExternalServiceImpl.LIZ().configService().avsettingsConfig().enableModelFileOnlyEnv()) {
                modelFileEnv = DownloadableModelConfig.ModelFileEnv.ONLINE;
            } else {
                modelFileEnv = DownloadableModelConfig.ModelFileEnv.TEST;
            }
            builder.setModelFileEnv(modelFileEnv);
            builder.setEffectNetWorker(new NaviEffectNetworkerImpl());
            builder.setAssetManager(context.getAssets());
            builder.setWorkspace(AVExternalServiceImpl.LIZ().configService().cacheConfig().effectModelDir());
            builder.setExecutor(C38995FSd.LIZLLL());
            FFL.LJIIIZ().getClass();
            builder.ignoreBuiltInModel(FFL.LJ(31744, "tools_enable_block_builtin_face_model", true, false));
            DownloadableModelSupport.initialize(builder.build());
        }
        DownloadableModelSupport downloadableModelSupport = DownloadableModelSupport.getInstance();
        o.LJIIIIZZ(downloadableModelSupport, "getInstance()");
        return downloadableModelSupport;
    }

    public static void LIZ(int i, Effect effect, InterfaceC88471Ynr callback) {
        o.LJIIIZ(effect, "effect");
        o.LJIIIZ(callback, "callback");
        EffectManager LJLJJLL = ((InterfaceC84498XEg) LIZIZ.getValue()).LJLJJLL();
        if (LJLJJLL == null) {
            return;
        }
        if (LJLJJLL.isEffectReady(effect) && LJLJJLL.isEffectDownloaded(effect)) {
            callback.invoke(Boolean.FALSE, effect);
        } else {
            LJLJJLL.fetchEffect(effect, new HW2(i, effect, callback));
        }
    }
}
