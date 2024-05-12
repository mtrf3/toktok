package com.bytedance.ies.ugc.statisticlogger.config;

import X.C0RN;
import X.C16880lQ;
import X.C35389Duj;
import X.C37179EiV;
import X.C84763XOl;
import X.EE1;
import X.EF7;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.FCD;
import X.FJ4;
import X.FMK;
import X.FML;
import X.FMQ;
import X.FMR;
import X.FMS;
import X.FMU;
import Y.ARunnableS17S0201000_14;
import Y.ARunnableS1S0001000_6;
import Y.ARunnableS42S0100000_6;
import Y.AfS38S0000000_6;
import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.service.IEtDebugService;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class LazyLoadLegoTask implements EE1 {
    public final Application LJLIL;
    public final Runnable LJLILLLLZI;

    @Override // X.EEY
    public final String key() {
        return "LazyLoadLegoTask";
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
        return 16777215;
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
        return EFK.BACKGROUND;
    }

    @Override // X.EEY
    public final void run(Context context) {
        FML fml;
        LinkedList linkedList;
        o.LJIIIZ(context, "context");
        Runnable runnable = this.LJLILLLLZI;
        if (runnable != null) {
            runnable.run();
        }
        FMK fmk = new FMK();
        String str = EF7.LJIIJ;
        String str2 = EF7.LJIIJJI;
        fmk.LIZ = str;
        fmk.LIZIZ = str2;
        fmk.LIZJ = EF7.LJIILIIL;
        fmk.LIZLLL = AppLog.getServerDeviceId();
        fmk.LJ = EF7.LIZLLL();
        EF7.LIZJ();
        fmk.LJFF = EF7.LJIIIZ;
        FML fml2 = new FML();
        TextUtils.isEmpty(fmk.LIZ);
        TextUtils.isEmpty(fmk.LIZIZ);
        if (!TextUtils.isEmpty(fmk.LIZJ)) {
            fml2.LIZ = fmk.LIZJ;
        }
        TextUtils.isEmpty(fmk.LIZLLL);
        TextUtils.isEmpty(null);
        TextUtils.isEmpty(fmk.LJ);
        fml2.LIZIZ = fmk.LJFF;
        Application application = this.LJLIL;
        boolean LJI = FCD.LJI(context);
        FMS fms = FMR.LIZ;
        fms.LJFF = application;
        fms.LJI = fml2;
        FMQ fmq = new FMQ();
        if (!TextUtils.isEmpty("applog") && LJI) {
            Application application2 = fms.LJFF;
            if (application2 != null && (fml = fms.LJI) != null) {
                FMQ.LIZJ(application2, fml);
            }
            ((ConcurrentHashMap) fms.LIZ).put("applog", fmq);
        }
        if (((Boolean) C35389Duj.LIZIZ.getValue()).booleanValue()) {
            fms.LIZJ.set(true);
            if (fms.LIZIZ.get() && !fms.LJ.isEmpty()) {
                synchronized (fms.LJ) {
                    linkedList = new LinkedList(fms.LJ);
                    ((LinkedList) fms.LJ).clear();
                    FMS.LJII.clear();
                }
                long j = 0;
                while (!linkedList.isEmpty()) {
                    j += 100;
                    FMU fmu = (FMU) linkedList.poll();
                    if (((Boolean) C35389Duj.LIZJ.getValue()).booleanValue()) {
                        C37179EiV.LJFF.postDelayed(new ARunnableS17S0201000_14(2, fms, fmu, 10), j);
                    } else {
                        fms.LIZJ(fmu);
                    }
                }
            }
            C37179EiV.LJFF.postDelayed(new ARunnableS42S0100000_6(fms, 130), 5000L);
        } else {
            fms.LIZIZ.set(true);
            fms.LIZLLL();
        }
        FJ4.LIZ = true;
        new Handler(C16880lQ.LLJJJJ()).postAtFrontOfQueue(new ARunnableS1S0001000_6(0, 16));
        C84763XOl.LJI().LJJJJZI(new AfS38S0000000_6(2));
        if (AppLog.getSwitchToBdtracker()) {
            com.bytedance.applog.AppLog.LIZ.LJJIFFI = false;
        }
        ((IEtDebugService) ServiceManager.get().getService(IEtDebugService.class)).LIZLLL(EF7.LIZIZ());
    }

    public LazyLoadLegoTask(Application application, Runnable runnable) {
        o.LJIIIZ(application, "application");
        this.LJLIL = application;
        this.LJLILLLLZI = runnable;
    }
}
