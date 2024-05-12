package X;

import Y.AfS1S0100100_2;
import Y.AfS56S0200000_7;
import Y.AfS59S0100000_7;
import Y.AfS5S0100100_7;
import android.os.Build;
import android.os.SystemClock;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.shortvideo.AVApiImpl;
import com.ss.android.ugc.aweme.shortvideo.model.Error;
import com.ss.android.ugc.aweme.shortvideo.model.Initial;
import com.ss.android.ugc.aweme.shortvideo.model.Loading;
import com.ss.android.ugc.aweme.shortvideo.model.State;
import com.ss.android.ugc.aweme.tools.mvtemplate.cutsame.net.TemplateApi;
import defpackage.e1;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HEU {
    public static C73318Sq2 LIZ;
    public static final C73849Syb<State<?>> LIZIZ;
    public static final TemplateApi LIZJ;
    public static final C62822Ol8 LIZLLL;
    public static final C62822Ol8 LJ;

    static {
        com.bytedance.ies.nleeditor.NLE.INSTANCE.loadNLELibrary(true);
        LIZIZ = new C73849Syb<>();
        C60903NvH.LJIIJJI().getApplicationService().getClass();
        String HOST = AVApiImpl.LIZJ().LIZ();
        InterfaceC36395EQd networkService = C60903NvH.LJIIJJI().getNetworkService();
        o.LJIIIIZZ(HOST, "HOST");
        LIZJ = (TemplateApi) networkService.createRetrofit(HOST, true, TemplateApi.class);
        LIZLLL = C221108m2.LIZIZ(C173336rB.LJLIL);
        LJ = C221108m2.LIZIZ(HEW.LJLIL);
    }

    public static final void LIZJ(C173166qu initMvMobParams, InterfaceC88472Yns<? super List<? extends InterfaceC82548WaW>, C76800UCe> interfaceC88472Yns, InterfaceC88472Yns<? super String, C76800UCe> interfaceC88472Yns2) {
        o.LJIIIZ(initMvMobParams, "initMvMobParams");
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("TemplateFetcherNet: requestTemplateList, nleSdkVersion: ");
        LIZ2.append(C78934UyQ.LJLIL.LIZIZ().LIZ());
        H7B.LIZ(X1D.LIZIZ(LIZ2));
        long elapsedRealtime = SystemClock.elapsedRealtime();
        C173166qu LIZ3 = initMvMobParams.LIZ();
        C73318Sq2 c73318Sq2 = LIZ;
        if (c73318Sq2 == null) {
            c73318Sq2 = new C73318Sq2();
            LIZ = c73318Sq2;
        }
        C73849Syb<State<?>> c73849Syb = LIZIZ;
        State<?> LJJZZIII = c73849Syb.LJJZZIII();
        if (LJJZZIII == null || (LJJZZIII instanceof Initial) || (LJJZZIII instanceof Error)) {
            c73849Syb.onNext(new Loading(0.0f));
            TemplateApi templateApi = LIZJ;
            String effectSDKVersion = C60903NvH.LJIIJJI().LJIJI().getEffectSDKVersion();
            String LIZ4 = C78934UyQ.LJLIL.LIZIZ().LIZ();
            C60903NvH.LJIIJJI().getApplicationService().getClass();
            String LIZLLL2 = EF7.LIZLLL();
            o.LJIIIIZZ(LIZLLL2, "getAPI().applicationService.appVersion");
            C78999UzT.LJFF(templateApi.requestMergedTemplateList(effectSDKVersion, LIZ4, Q7K.LIZIZ("creative_cloud_template_list_num", 1000), "android", LIZLLL2, XCB.LIZJ(), !e1.LIZ(31744, "enable_creative_cloud_cutsame", true, false) ? 1 : 0, new HashMap<>()).LJJIJL(new C43727HEd(elapsedRealtime, LIZ3)).LJJL(T16.LIZ()).LJJJLIIL(C42223Ghf.LJLIL, new AfS5S0100100_7(elapsedRealtime, LIZ3, 1)), c73318Sq2);
        }
        C78999UzT.LJFF(new C73426Srm(c73849Syb).LJJIFFI(HEV.LJLIL).LJJLIIIJ(1L).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS56S0200000_7(interfaceC88472Yns, interfaceC88472Yns2, 19), new AfS59S0100000_7(interfaceC88472Yns2, 91)), c73318Sq2);
    }

    public static final void LIZ(String templateId, int i, InterfaceC88472Yns<? super InterfaceC82548WaW, C76800UCe> interfaceC88472Yns, InterfaceC88472Yns<? super String, C76800UCe> interfaceC88472Yns2) {
        o.LJIIIZ(templateId, "templateId");
        TemplateApi templateApi = LIZJ;
        String effectSDKVersion = C60903NvH.LJIIJJI().LJIJI().getEffectSDKVersion();
        String LIZ2 = C78934UyQ.LJLIL.LIZIZ().LIZ();
        C60903NvH.LJIIJJI().getApplicationService().getClass();
        String LIZLLL2 = EF7.LIZLLL();
        o.LJIIIIZZ(LIZLLL2, "getAPI().applicationService.appVersion");
        templateApi.requestMergedTemplateDetail(templateId, i, effectSDKVersion, LIZ2, "android", LIZLLL2, XCB.LIZJ(), new HashMap<>()).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS56S0200000_7(interfaceC88472Yns, interfaceC88472Yns2, 18), new AfS59S0100000_7(interfaceC88472Yns2, 90));
    }

    public static final void LIZIZ(String templateId, int i, InterfaceC88476Ynw<? super String, ? super String, ? super Long, ? super String, ? super String, ? super String, C76800UCe> interfaceC88476Ynw, InterfaceC88471Ynr<? super String, ? super String, C76800UCe> interfaceC88471Ynr) {
        o.LJIIIZ(templateId, "templateId");
        long elapsedRealtime = SystemClock.elapsedRealtime();
        TemplateApi templateApi = LIZJ;
        String json = GsonProtectorUtils.toJson(C60903NvH.LJIIJJI().LIZ(), C47261Igj.LJJIJ(templateId));
        o.LJIIIIZZ(json, "getAPI().getGson().toJson(listOf(templateId))");
        String featureBits = (String) LIZLLL.getValue();
        o.LJIIIIZZ(featureBits, "featureBits");
        C60903NvH.LJIIJJI().getApplicationService().getClass();
        String valueOf = String.valueOf(EF7.LJIIIZ);
        C60903NvH.LJIIJJI().getApplicationService().getClass();
        String LIZLLL2 = EF7.LIZLLL();
        o.LJIIIIZZ(LIZLLL2, "getAPI().applicationService.appVersion");
        String effectSDKVersion = C60903NvH.LJIIJJI().LJIJI().getEffectSDKVersion();
        C60903NvH.LJIIJJI().getRegionService();
        String LIZ2 = C44296Ha0.LIZ();
        o.LJIIIIZZ(LIZ2, "getAPI().regionService.region");
        C60903NvH.LJIIJJI().getApplicationService().getClass();
        String serverDeviceId = AppLog.getServerDeviceId();
        o.LJIIIIZZ(serverDeviceId, "getAPI().applicationService.deviceId");
        HashMap<String, String> hashMap = new HashMap<>();
        String RELEASE = Build.VERSION.RELEASE;
        o.LJIIIIZZ(RELEASE, "RELEASE");
        String MODEL = Build.MODEL;
        o.LJIIIIZZ(MODEL, "MODEL");
        templateApi.requestTemplateDetail(json, featureBits, i, "fae2a2a24fb82f388aec1c50610d522e", valueOf, LIZLLL2, effectSDKVersion, RELEASE, LIZ2, serverDeviceId, "android", MODEL, hashMap).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new HUS(elapsedRealtime, templateId, interfaceC88476Ynw, interfaceC88471Ynr), new AfS1S0100100_2(elapsedRealtime, interfaceC88471Ynr, 1));
    }
}
