package com.ss.android.ugc.aweme.configcenter;

import X.C16880lQ;
import X.C38663FFj;
import X.C56672Kh;
import X.C58096Mr6;
import X.EF7;
import X.FAJ;
import X.FAK;
import X.FCD;
import X.FF4;
import X.FF5;
import X.FH5;
import X.FHC;
import X.FKB;
import X.FKM;
import X.FP1;
import android.content.Context;
import android.os.Looper;
import android.os.SystemClock;
import com.ss.android.ugc.aweme.launcher.service.configcenter.IAwemeConfigCenterApi;
import com.ss.android.ugc.aweme.legoImp.task.TasksHolder;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class AwemeConfigCenter {
    public static boolean LIZ;
    public static final AtomicBoolean LIZIZ = new AtomicBoolean(false);
    public static final AtomicBoolean LIZJ = new AtomicBoolean(false);

    /* loaded from: classes7.dex */
    public static class AwemeConfigCenterImpl implements IAwemeConfigCenterApi {
        public static IAwemeConfigCenterApi LIZIZ() {
            Object LIZ = C58096Mr6.LIZ(IAwemeConfigCenterApi.class, false);
            if (LIZ != null) {
                return (IAwemeConfigCenterApi) LIZ;
            }
            if (C58096Mr6.j == null) {
                synchronized (IAwemeConfigCenterApi.class) {
                    if (C58096Mr6.j == null) {
                        C58096Mr6.j = new AwemeConfigCenterImpl();
                    }
                }
            }
            return C58096Mr6.j;
        }

        @Override // com.ss.android.ugc.aweme.launcher.service.configcenter.IAwemeConfigCenterApi
        public final boolean isInitialized() {
            return AwemeConfigCenter.LIZIZ();
        }

        @Override // com.ss.android.ugc.aweme.launcher.service.configcenter.IAwemeConfigCenterApi
        public final void LIZ(String str) {
            String str2;
            FF5 ff5 = FF4.LIZ;
            if ((ff5.LIZ && ff5.LIZIZ) || !FCD.LJI(FKM.LIZ())) {
                return;
            }
            StringBuilder sb = new StringBuilder("AB:repo:");
            if (C16880lQ.LLJJJJ() == Looper.myLooper()) {
                str2 = "main";
            } else {
                str2 = "bg";
            }
            String LIZLLL = FP1.LIZLLL(sb, str2, ":", str);
            FAK LIZ = C56672Kh.LIZ();
            String name = LIZLLL + str;
            long uptimeMillis = SystemClock.uptimeMillis() - FKB.LJII;
            LIZ.getClass();
            o.LJIIIZ(name, "name");
            if (LIZ.LJJIFFI || ((ConcurrentHashMap) LIZ.LJIILJJIL).containsKey(name)) {
                return;
            }
            ((ConcurrentHashMap) LIZ.LJIILJJIL).put(name, Long.valueOf(uptimeMillis));
        }
    }

    public static void LIZ() {
        if (LIZ) {
            return;
        }
        FAJ.LIZ("method_configcenterinit_experiment", false);
        FH5.LIZIZ().getClass();
        FHC.LIZIZ().LJ = 2;
        FAJ.LJFF("method_configcenterinit_experiment", false);
        Context LIZIZ2 = EF7.LIZIZ();
        FAJ.LIZ("method_init_abtest_duration", false);
        if (FCD.LJI(LIZIZ2)) {
            TasksHolder.LIZ().run(LIZIZ2);
        }
        FAJ.LJFF("method_init_abtest_duration", false);
        FAJ.LIZ("method_init_config_duration", false);
        if (TasksHolder.LJIJ == null) {
            TasksHolder.LJIJ = C38663FFj.LIZIZ.LIZIZ();
        }
        TasksHolder.LJIJ.run(LIZIZ2);
        FAJ.LJFF("method_init_config_duration", false);
        LIZ = true;
    }

    public static boolean LIZIZ() {
        if (LIZJ.get() && LIZIZ.get()) {
            return true;
        }
        return false;
    }
}
