package com.ss.android.ugc.aweme.hybridkit.task;

import X.C0RN;
import X.C30931Jh;
import X.C39823Fk3;
import X.C60664NrQ;
import X.C60668NrU;
import X.C60674Nra;
import X.C60677Nrd;
import X.C60680Nrg;
import X.C60694Nru;
import X.C60695Nrv;
import X.EE1;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.EnumC60689Nrp;
import X.FD5;
import X.OJY;
import android.content.Context;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.settings.SparkPreCreateWebviewBean;
import com.ss.android.ugc.aweme.specact.SpecActServiceImpl;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class HybridPerformanceInitTask implements EE1 {
    @Override // X.EEY
    public final String key() {
        return "HybridPerformanceInitTask";
    }

    @Override // X.EEY
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.EEY
    public final /* synthetic */ String prefix() {
        return "task_";
    }

    @Override // X.EE1
    public final /* synthetic */ boolean serialExecute() {
        return false;
    }

    @Override // X.EEY
    public final int targetProcess() {
        return 1;
    }

    @Override // X.EEY
    public final /* synthetic */ List triggerOtherLegoComponents() {
        return null;
    }

    @Override // X.EEY
    public final /* synthetic */ EnumC36103EEx triggerType() {
        return C0RN.LIZIZ(this);
    }

    @Override // X.EEY
    public final EnumC36092EEm scenesType() {
        return EnumC36092EEm.DEFAULT;
    }

    @Override // X.EE1
    public final EFK type() {
        return EFK.MAIN;
    }

    @Override // X.EEY
    public final void run(Context context) {
        boolean z;
        long j;
        boolean z2;
        boolean z3;
        if (context == null) {
            return;
        }
        System.currentTimeMillis();
        C39823Fk3.LIZ.getClass();
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        SparkPreCreateWebviewBean sparkPreCreateWebviewBean = C39823Fk3.LIZIZ;
        SparkPreCreateWebviewBean sparkPreCreateWebviewBean2 = (SparkPreCreateWebviewBean) LIZLLL.LJIIIIZZ("spark_pre_create_webview", SparkPreCreateWebviewBean.class, sparkPreCreateWebviewBean);
        boolean z4 = false;
        if (sparkPreCreateWebviewBean2 != null) {
            z = sparkPreCreateWebviewBean2.enable;
        } else {
            z = false;
        }
        SparkPreCreateWebviewBean sparkPreCreateWebviewBean3 = (SparkPreCreateWebviewBean) SettingsManager.LIZLLL().LJIIIIZZ("spark_pre_create_webview", SparkPreCreateWebviewBean.class, sparkPreCreateWebviewBean);
        if (sparkPreCreateWebviewBean3 != null) {
            j = sparkPreCreateWebviewBean3.poolsize;
        } else {
            j = 0;
        }
        int i = (int) j;
        if (SpecActServiceImpl.LJJJIL().LJIIL()) {
            if (i <= 0) {
                i = 1;
            }
            z = true;
        }
        C30931Jh c30931Jh = new C30931Jh();
        C60680Nrg c60680Nrg = new C60680Nrg();
        c60680Nrg.LIZ = i;
        c60680Nrg.LIZIZ = z;
        EnumC60689Nrp enumC60689Nrp = EnumC60689Nrp.WEB;
        o.LJIIJ(enumC60689Nrp, "<set-?>");
        c60680Nrg.LJ = enumC60689Nrp;
        SparkPreCreateWebviewBean sparkPreCreateWebviewBean4 = (SparkPreCreateWebviewBean) SettingsManager.LIZLLL().LJIIIIZZ("spark_pre_create_webview", SparkPreCreateWebviewBean.class, sparkPreCreateWebviewBean);
        if (sparkPreCreateWebviewBean4 != null) {
            z2 = sparkPreCreateWebviewBean4.autoResizeCache;
        } else {
            z2 = false;
        }
        c60680Nrg.LJFF = z2;
        SparkPreCreateWebviewBean sparkPreCreateWebviewBean5 = (SparkPreCreateWebviewBean) SettingsManager.LIZLLL().LJIIIIZZ("spark_pre_create_webview", SparkPreCreateWebviewBean.class, sparkPreCreateWebviewBean);
        if (sparkPreCreateWebviewBean5 != null) {
            z3 = sparkPreCreateWebviewBean5.preCallSetJSBridgeEnable;
        } else {
            z3 = false;
        }
        c60680Nrg.LIZJ = z3;
        SparkPreCreateWebviewBean sparkPreCreateWebviewBean6 = (SparkPreCreateWebviewBean) SettingsManager.LIZLLL().LJIIIIZZ("spark_pre_create_webview", SparkPreCreateWebviewBean.class, sparkPreCreateWebviewBean);
        if (sparkPreCreateWebviewBean6 != null) {
            z4 = sparkPreCreateWebviewBean6.preCallWebXCreateContainerEnable;
        }
        c60680Nrg.LIZLLL = z4;
        c30931Jh.LJLIL = c60680Nrg;
        C60694Nru.LIZ = c30931Jh;
        if (c60680Nrg.LIZIZ) {
            if (C60695Nrv.LIZ == null) {
                C60695Nrv.LIZ = new C60668NrU(context);
            }
            OJY ojy = OJY.LJLILLLLZI;
            C60668NrU c60668NrU = C60695Nrv.LIZ;
            if (c60668NrU != null) {
                c60668NrU.LJ = ojy;
            }
            C60677Nrd c60677Nrd = new C60677Nrd();
            c60677Nrd.LIZ = new C60664NrQ(c60680Nrg);
            c60677Nrd.LIZIZ = c60680Nrg.LIZ;
            c60677Nrd.LIZJ = true;
            c60677Nrd.LIZLLL = c60680Nrg.LJ;
            c60677Nrd.LJ = c60680Nrg.LJFF;
            C60674Nra c60674Nra = new C60674Nra(c60677Nrd);
            C60668NrU c60668NrU2 = C60695Nrv.LIZ;
            if (c60668NrU2 != null && !((HashMap) c60668NrU2.LIZLLL).containsKey("pre_create_webview")) {
                ((HashMap) c60668NrU2.LIZLLL).put("pre_create_webview", c60674Nra);
                if (c60674Nra.LIZLLL) {
                    c60668NrU2.LIZ(c60674Nra.LIZJ);
                }
            }
        }
        FD5.LJIIIZ(null, "container_precreate", "config", "native", null, null, null, null, 241);
        SpecActServiceImpl.LJJJIL().LJJI();
    }
}
