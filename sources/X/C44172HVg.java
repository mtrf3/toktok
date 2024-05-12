package X;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.os.Build;
import com.bef.effectsdk.EffectSDKBuildConfig;
import com.bef.effectsdk.EffectSensorCallback;
import com.bytedance.bpea.entry.auth.CertAuthEntry;
import com.google.gson.Gson;
import com.ss.android.ttve.nativePort.TEEffectUtils;
import com.ss.android.ugc.aweme.effectplatform.EffectPlatform;
import com.ss.android.ugc.aweme.effectplatforn.EffectPlatformFactory;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.out.AVServiceImpl;
import com.ss.android.ugc.aweme.port.in.IAnotherMusicService;
import com.ss.android.ugc.aweme.port.in.IHashTagService;
import com.ss.android.ugc.aweme.services.effectplatform.EffectPlatformBuilder;
import com.ss.android.ugc.aweme.services.effectplatform.IEffectPlatformFactory;
import com.ss.android.ugc.effectmanager.DownloadableModelConfig;
import com.ss.android.ugc.effectmanager.DownloadableModelSupport;
import com.ss.android.ugc.effectmanager.DownloadableModelSupportLibraryLoader;
import com.ss.android.ugc.effectmanager.EffectConfiguration;
import com.ss.android.ugc.effectmanager.FetchModelType;
import com.ss.android.ugc.effectmanager.common.logger.EPLog;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: X.HVg, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44172HVg {
    public static Application LIZ;
    public static Gson LIZIZ;
    public static C5UD LIZJ;
    public static InterfaceC42801Gqz LIZLLL;
    public static G9S LJ;
    public static InterfaceC43725HEb LJFF;
    public static IAnotherMusicService LJI;
    public static HF1 LJII;
    public static IHashTagService LJIIIIZZ;
    public static HF0 LJIIIZ;
    public static InterfaceC147965rM LJIIJ;
    public static HF9 LJIIJJI;
    public static C44735Hh5 LJIIL;
    public static C43746HEw LJIILIIL;
    public static C44735Hh5 LJIILJJIL;
    public static GVF LJIILL;
    public static WUF LJIILLIIL;
    public static InterfaceC43749HEz LJIIZILJ;
    public static HQ7 LJIJ;
    public static InterfaceC36395EQd LJIJI;
    public static InterfaceC41618GVa LJIJJ;
    public static InterfaceC41322GJq LJIJJLI;
    public static G8N LJIL;
    public static InterfaceC43728HEe LJJ;
    public static InterfaceC43724HEa LJJI;
    public static HF7 LJJIFFI;
    public static C44839Hil LJJII;
    public static final Object LJJIII = new Object();

    static {
        Application application = C60903NvH.LJ;
        InterfaceC43728HEe LJIIJJI2 = C60903NvH.LJIIJJI();
        InterfaceC43724HEa interfaceC43724HEa = C78934UyQ.LJLIL;
        LIZ = application;
        LJJ = LJIIJJI2;
        LJJI = interfaceC43724HEa;
        LIZIZ = LJIIJJI2.LIZ();
        LIZJ = LJJI.getApplicationService();
        LIZLLL = LJJI.getChallengeService();
        LJ = LJJI.getCaptionMentionService();
        LJFF = LJJI.getRegionService();
        LJI = LJJI.getMusicService();
        LJIILL = LJJI.getPublishService();
        LJII = LJJI.LIZLLL();
        LJIIIIZZ = LJJI.getHashTagService();
        LJJI.getSyncShareService();
        LJIIIZ = LJJI.getCommerceService();
        LJIIJ = LJJI.getSpService();
        LJIILLIIL = LJJI.getLiveService();
        LJIIZILJ = LJJI.getBridgeService();
        LJIJ = LJJ.getAccountService();
        LJJI.getStickerShareService();
        LJIJI = LJJ.getNetworkService();
        LJIJJ = LJJI.LJII();
        LJIJJLI = LJJI.getBusinessGoodsService();
        LJIL = LJJI.getShareService();
        LJJ.getIStickerPropService();
        LJJIFFI = LJJ.unlockStickerService();
        LJJ.getLocalHashTagService();
        LJIIJJI = new HF9();
        LJJII = LJJ.LJJ();
        LJIIL = new C44735Hh5(false);
        LJIILIIL = new C43746HEw();
        LJIILJJIL = new C44735Hh5(true);
        XFY.LIZ(application, LIZIZ, LJJII);
    }

    public static String LIZ() {
        StringBuilder sb = new StringBuilder();
        C42383GkF c42383GkF = C42130GgA.LIZ;
        c42383GkF.LIZ();
        for (Activity activity : c42383GkF.LIZ) {
            if (activity instanceof InterfaceC42677Goz) {
                sb.append(activity);
                sb.append(" isRecording: ");
                sb.append(((InterfaceC42677Goz) activity).isRecording());
                sb.append("\n");
            } else {
                sb.append(activity);
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    public static void LIZJ() {
        boolean z;
        boolean z2;
        ExecutorService executorService;
        synchronized (LJJIII) {
            if (!DownloadableModelSupport.isInitialized()) {
                C84398XAk c84398XAk = C84397XAj.LJIIJJI;
                boolean booleanValue = ((Boolean) C44184HVs.LIZ.getValue()).booleanValue();
                c84398XAk.getClass();
                if (C84397XAj.LJIIJ || booleanValue) {
                    z = true;
                } else {
                    z = false;
                }
                C84397XAj.LJIIJ = z;
                FFL.LJIIIZ().getClass();
                boolean LJ2 = FFL.LJ(31744, "enable_effectplatform_decrypt_optimization", true, false);
                if (XCB.LIZ || LJ2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                XCB.LIZ = z2;
                C44180HVo.LIZ = C44181HVp.LIZ();
                C5H3 c5h3 = C44182HVq.LIZ;
                if (((Number) c5h3.getValue()).intValue() > 0) {
                    C38027EwB c38027EwB = new C38027EwB(FSY.FIXED);
                    c38027EwB.LIZJ = ((Number) c5h3.getValue()).intValue();
                    c38027EwB.LIZIZ = "ep-task";
                    c38027EwB.LJ = new RejectedExecutionHandler() { // from class: X.HVh
                        @Override // java.util.concurrent.RejectedExecutionHandler
                        public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
                            C38995FSd.LIZLLL().execute(runnable);
                        }
                    };
                    executorService = C38995FSd.LIZ(new C38028EwC(c38027EwB));
                } else {
                    executorService = null;
                }
                IEffectPlatformFactory LIZ2 = EffectPlatformFactory.LIZ();
                EffectPlatformBuilder effectPlatformBuilder = new EffectPlatformBuilder();
                effectPlatformBuilder.setExecutorService(executorService);
                effectPlatformBuilder.setContext(LIZ);
                EffectConfiguration build = LIZ2.createEffectConfigurationBuilder(effectPlatformBuilder).build();
                C79156V4u c79156V4u = new C79156V4u();
                DownloadableModelConfig.Builder builder = new DownloadableModelConfig.Builder();
                builder.setAssetManager(LIZ.getAssets());
                builder.setJsonConverter(new F2W(C60903NvH.LJIIJJI().LIZ()));
                builder.setMonitorService(new C146165oS());
                builder.setAppId(EffectPlatform.LJJJJZI());
                builder.setAccessKey("142710f02c3a11e8b42429f14557854a");
                builder.setDeviceType(Build.MODEL);
                builder.setHosts(EffectPlatformFactory.LIZ().getDownloadableModelHosts());
                builder.setSdkVersion(LIZIZ());
                builder.setWorkspace(C60903NvH.LJIIJJI().LJJIJL().getPathAdapter().LJJL(""));
                builder.setEffectNetWorker(new EYQ());
                builder.setEffectConfiguration(build);
                builder.setExecutor(C38995FSd.LIZLLL());
                builder.setEventListener(new C44190HVy(c79156V4u));
                C5L7.LIZIZ();
                builder.setModelFileEnv(DownloadableModelConfig.ModelFileEnv.ONLINE);
                builder.setModelType(FetchModelType.fromValue(0));
                FFL.LJIIIZ().getClass();
                builder.ignoreBuiltInModel(FFL.LJ(31744, "tools_enable_block_builtin_face_model", true, false));
                FFL.LJIIIZ().getClass();
                builder.ignoreModelLruVersion(FFL.LJ(31744, "enable_ep_ignore_model_lru_version", true, false));
                FFL.LJIIIZ().getClass();
                builder.abDiffEffect(FFL.LJ(31744, "enable_ep_diff_effect", true, false));
                DownloadableModelConfig build2 = builder.build();
                EPLog.setLogger(new HMG());
                DownloadableModelSupport.initialize(build2);
                DownloadableModelSupport.setLibraryLoader(new DownloadableModelSupportLibraryLoader() { // from class: X.HLb
                    @Override // com.ss.android.ugc.effectmanager.DownloadableModelSupportLibraryLoader
                    public final void loadLibrary(String str) {
                        AVServiceImpl.LIZ().loadLibrary(str, C44172HVg.LIZ);
                    }
                });
            }
        }
    }

    public static boolean LJ() {
        C42383GkF c42383GkF = C42130GgA.LIZ;
        c42383GkF.LIZ();
        for (ComponentCallbacks2 componentCallbacks2 : c42383GkF.LIZ) {
            if ((componentCallbacks2 instanceof InterfaceC42677Goz) && ((InterfaceC42677Goz) componentCallbacks2).isRecording()) {
                return true;
            }
        }
        return false;
    }

    public static String LIZIZ() {
        if (C41659GWp.LIZ()) {
            try {
                return TEEffectUtils.getEffectVersion();
            } catch (Throwable unused) {
                return EffectSDKBuildConfig.getSdkVersion();
            }
        }
        return EffectSDKBuildConfig.getSdkVersion();
    }

    public static void LJI() {
        LIZJ();
        XFY LIZ2 = XFY.LIZ(LIZ, LIZIZ, LJJII);
        if (!XFY.LJI) {
            if (LIZ2.LIZIZ != null) {
                LIZ2.LIZIZ(C65315PkF.LIZ());
                return;
            }
            return;
        }
        LIZ2.getClass();
    }

    public static void LIZLLL(C63946P7u c63946P7u) {
        LIZJ();
        XFY.LIZ(LIZ, LIZIZ, LJJII).LIZIZ(c63946P7u);
        AVExternalServiceImpl.LIZ().getEffectSDKGeneralParamService().generalParam().setNetWorkInfoCallback();
        EffectSensorCallback.setSensorInfoCallback(new C44174HVi());
    }

    public static boolean LJFF(String str) {
        try {
            CertAuthEntry.checkCert(C78857UxB.LJJIIJ(1476415493, "bpea-effect_sdk_sensor"), new String[]{"sensor"}, "effectSDK", str, "Collect");
            return true;
        } catch (Q0C unused) {
            return false;
        }
    }
}
