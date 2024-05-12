package X;

import android.os.Build;
import com.bytedance.ies.cutsame.effectfetcher.TemplateSourceConfig;
import com.bytedance.ies.nle.editor_jni.NLEModelDownloader;
import com.bytedance.ies.nle.editor_jni.NLEModelDownloaderParams;
import com.bytedance.ies.nle.editor_jni.NLEResourcesDAVJNI;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.HpI, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45244HpI {
    public static final C45244HpI LIZ = new C45244HpI();
    public static String LIZIZ = "";
    public static String LIZJ = "";
    public static TemplateSourceConfig LIZLLL = new C45261HpZ().LIZ();
    public static final java.util.Map<EnumC172756qF, NLEModelDownloader> LJ = new LinkedHashMap();

    public static NLEModelDownloaderParams LIZJ(TemplateSourceConfig config) {
        o.LJIIIZ(config, "config");
        NLEModelDownloaderParams nLEModelDownloaderParams = new NLEModelDownloaderParams(NLEResourcesDAVJNI.new_NLEModelDownloaderParams__SWIG_2(config.appID, config.appVersion, config.effectSdkVersion, config.accessKey, "android", config.deviceId, Build.MODEL, config.region, config.appLanguage, config.effectCacheDir, config.effectHost, config.effectModelCacheDir, config.artistHost, config.artistCacheDir, config.imuseCacheDir, config.imuseHost, "720", true, "760.0.2.0", config.isEpRequest));
        NLEResourcesDAVJNI.NLEModelDownloaderParams_addMusicParams(nLEModelDownloaderParams.LIZ, nLEModelDownloaderParams, config.musicHost, config.musicCacheDir, config.appID);
        NLEResourcesDAVJNI.NLEModelDownloaderParams_materialResourceAccessKey_set(nLEModelDownloaderParams.LIZ, nLEModelDownloaderParams, config.materialResourceAccessKey);
        NLEResourcesDAVJNI.NLEModelDownloaderParams_materialResourceAppId_set(nLEModelDownloaderParams.LIZ, nLEModelDownloaderParams, config.materialResourceAppId);
        NLEResourcesDAVJNI.NLEModelDownloaderParams_materialResourceAppVersion_set(nLEModelDownloaderParams.LIZ, nLEModelDownloaderParams, config.materialResourceAppVersion);
        NLEResourcesDAVJNI.NLEModelDownloaderParams_materialResourceAppName_set(nLEModelDownloaderParams.LIZ, nLEModelDownloaderParams, config.materialResourceAppName);
        NLEResourcesDAVJNI.NLEModelDownloaderParams_ac_set(nLEModelDownloaderParams.LIZ, nLEModelDownloaderParams, config.ac);
        NLEResourcesDAVJNI.NLEModelDownloaderParams_uid_set(nLEModelDownloaderParams.LIZ, nLEModelDownloaderParams, config.uid);
        NLEResourcesDAVJNI.NLEModelDownloaderParams_materialResourceStatus_set(nLEModelDownloaderParams.LIZ, nLEModelDownloaderParams, config.materialResourceStatus);
        NLEResourcesDAVJNI.NLEModelDownloaderParams_materialResourceTag_set(nLEModelDownloaderParams.LIZ, nLEModelDownloaderParams, config.materialResourceTag);
        NLEResourcesDAVJNI.NLEModelDownloaderParams_materialResourceHost_set(nLEModelDownloaderParams.LIZ, nLEModelDownloaderParams, config.materialResourceHost);
        NLEResourcesDAVJNI.NLEModelDownloaderParams_materialResourceCache_set(nLEModelDownloaderParams.LIZ, nLEModelDownloaderParams, config.materialResourceCache);
        return nLEModelDownloaderParams;
    }

    public final synchronized NLEModelDownloader LIZ(EnumC172756qF type) {
        NLEModelDownloader nLEModelDownloader;
        o.LJIIIZ(type, "type");
        java.util.Map<EnumC172756qF, NLEModelDownloader> map = LJ;
        nLEModelDownloader = (NLEModelDownloader) ((LinkedHashMap) map).get(type);
        if (nLEModelDownloader == null) {
            nLEModelDownloader = new NLEModelDownloader(LIZJ(LIZLLL));
            map.put(type, nLEModelDownloader);
        }
        return nLEModelDownloader;
    }

    public final synchronized void LIZIZ(InterfaceC65784Pro<TemplateSourceConfig> interfaceC65784Pro) {
        TemplateSourceConfig invoke = interfaceC65784Pro.invoke();
        LIZLLL = invoke;
        LIZIZ = invoke.templateCacheDir;
        LIZJ = invoke.mediaCacheDir;
    }
}
