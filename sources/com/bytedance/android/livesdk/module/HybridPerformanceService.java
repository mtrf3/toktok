package com.bytedance.android.livesdk.module;

import X.ALE;
import X.C0K2;
import X.C113554cx;
import X.C25570A1u;
import X.C30906CBa;
import X.C30907CBb;
import X.C30908CBc;
import X.C37724ErI;
import X.C58310MuY;
import X.C60827Nu3;
import X.C60828Nu4;
import X.CBY;
import X.CBZ;
import X.CLS;
import X.ORY;
import com.bytedance.android.live.browser.IHybridPerformanceService;
import com.bytedance.android.livesdk.livesetting.hybrid.LiveHybridReuseConfigAndroidABSetting;
import com.bytedance.android.livesdk.livesetting.hybrid.LiveHybridReuseConfigAndroidSetting;
import com.bytedance.android.livesdk.livesetting.hybrid.SparkReuseConfig;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveQuizContainerOptSetting;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public class HybridPerformanceService implements IHybridPerformanceService {
    @Override // com.bytedance.android.live.browser.IHybridPerformanceService
    public final void LIZJ() {
    }

    @Override // com.bytedance.android.live.browser.IHybridPerformanceService
    public final void Pt() {
    }

    @Override // X.InterfaceC06390Mx
    public final /* synthetic */ void onInit() {
    }

    static {
        new C30908CBc();
    }

    @Override // com.bytedance.android.live.browser.IHybridPerformanceService
    public final void Eu0() {
        LiveQuizContainerOptSetting liveQuizContainerOptSetting = LiveQuizContainerOptSetting.INSTANCE;
        if (liveQuizContainerOptSetting.getValue().downgrade) {
            return;
        }
        C60827Nu3 c60827Nu3 = C58310MuY.LIZIZ;
        ALE ale = new ALE();
        ale.LJIIIZ = true;
        ale.LJIIJ = 1;
        ale.LIZ = "live_act_quiz";
        ale.LJIIL = CLS.LJLIL;
        ale.LJIILIIL = liveQuizContainerOptSetting.getValue().preloadAllowList;
        ale.LIZIZ(C30906CBa.LJLIL);
        ale.LJIILL = liveQuizContainerOptSetting.getValue().ignoreFailedPreload;
        c60827Nu3.getClass();
        Boolean bool = Boolean.FALSE;
        C60827Nu3.LJIIJJI(ale, bool);
        C60828Nu4 c60828Nu4 = C37724ErI.LIZIZ;
        C25570A1u c25570A1u = new C25570A1u();
        c25570A1u.LIZ = true;
        c25570A1u.LIZJ = 1;
        c25570A1u.LIZLLL = "live_act_quiz";
        c25570A1u.LJII = liveQuizContainerOptSetting.getValue().reuseAllowList;
        c25570A1u.LJI = null;
        C30907CBb c30907CBb = C30907CBb.LJLIL;
        o.LJIIJ(c30907CBb, "<set-?>");
        c25570A1u.LJFF = c30907CBb;
        c60828Nu4.getClass();
        C60828Nu4.LJ(c25570A1u, bool);
    }

    @Override // com.bytedance.android.live.browser.IHybridPerformanceService
    public final void FH() {
        LIZ(LiveHybridReuseConfigAndroidSetting.INSTANCE.getValue());
        LIZ(LiveHybridReuseConfigAndroidABSetting.INSTANCE.getValue());
    }

    @Override // com.bytedance.android.live.browser.IHybridPerformanceService
    public final void ZN() {
        LIZLLL(LiveHybridReuseConfigAndroidSetting.INSTANCE.getValue());
        LIZLLL(LiveHybridReuseConfigAndroidABSetting.INSTANCE.getValue());
    }

    @Override // com.bytedance.android.live.browser.IHybridPerformanceService
    public final void xY() {
        if (!LiveQuizContainerOptSetting.INSTANCE.getValue().downgrade) {
            C37724ErI.LIZIZ.getClass();
            C60828Nu4.LJFF("live_act_quiz");
            C58310MuY.LIZIZ.getClass();
            C60827Nu3.LJIIL("live_act_quiz");
        }
    }

    public static void LIZ(SparkReuseConfig[] sparkReuseConfigArr) {
        List<String> list;
        List<String> list2;
        if (sparkReuseConfigArr != null) {
            for (SparkReuseConfig sparkReuseConfig : sparkReuseConfigArr) {
                if (sparkReuseConfig.biz.length() > 0) {
                    int i = sparkReuseConfig.matchRule;
                    C25570A1u c25570A1u = new C25570A1u();
                    c25570A1u.LIZ = sparkReuseConfig.enable;
                    c25570A1u.LIZJ = sparkReuseConfig.volume;
                    String str = sparkReuseConfig.biz;
                    o.LJIIJ(str, "<set-?>");
                    c25570A1u.LIZLLL = str;
                    String[] strArr = sparkReuseConfig.allowSchemaList;
                    if (strArr != null) {
                        list = ORY.LJJZZIII(strArr);
                    } else {
                        list = null;
                    }
                    c25570A1u.LJII = list;
                    String[] strArr2 = sparkReuseConfig.denySchemaList;
                    if (strArr2 != null) {
                        list2 = ORY.LJJZZIII(strArr2);
                    } else {
                        list2 = null;
                    }
                    c25570A1u.LJIIIIZZ = list2;
                    c25570A1u.LJI = null;
                    c25570A1u.LJFF = new CBZ(i);
                    C60828Nu4 c60828Nu4 = C37724ErI.LIZIZ;
                    Boolean bool = Boolean.FALSE;
                    c60828Nu4.getClass();
                    C60828Nu4.LJ(c25570A1u, bool);
                }
            }
        }
    }

    public static void LIZLLL(SparkReuseConfig[] sparkReuseConfigArr) {
        if (sparkReuseConfigArr != null) {
            for (SparkReuseConfig sparkReuseConfig : sparkReuseConfigArr) {
                if (sparkReuseConfig.biz.length() > 0) {
                    C60828Nu4 c60828Nu4 = C37724ErI.LIZIZ;
                    String str = sparkReuseConfig.biz;
                    c60828Nu4.getClass();
                    C60828Nu4.LJFF(str);
                }
            }
        }
    }

    @Override // com.bytedance.android.live.browser.IHybridPerformanceService
    public final void OT(AqS171S0100000_5 aqS171S0100000_5) {
        LiveQuizContainerOptSetting liveQuizContainerOptSetting = LiveQuizContainerOptSetting.INSTANCE;
        if (!liveQuizContainerOptSetting.getValue().downgrade) {
            C0K2.LJII(0, "ttlive_eoy_quiz_opt_monitor", C113554cx.LJJLIIIJLLLLLLLZ(new LinkedHashMap()));
            String str = liveQuizContainerOptSetting.getValue().preloadSchema;
            if (str != null) {
                C58310MuY.LIZIZ.LJII(str, "live_act_quiz", null, new CBY(aqS171S0100000_5));
            }
        }
    }
}
