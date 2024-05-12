package com.ss.android.ugc.aweme.hybridkit.task;

import X.C0RN;
import X.C10K;
import X.C16880lQ;
import X.C33798DOg;
import X.C36089EEj;
import X.C36093EEn;
import X.C36982EfK;
import X.C37009Efl;
import X.C37131Ehj;
import X.C37132Ehk;
import X.C37738ErW;
import X.C37848EtI;
import X.C38943FQd;
import X.C40013Fn7;
import X.C61878OQg;
import X.EE1;
import X.EF7;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.FCG;
import X.FCH;
import android.content.Context;
import com.bytedance.ies.ugc.aweme.plugin.service.IPluginService;
import com.bytedance.lynx.hybrid.settings.HybridSettings;
import com.ss.android.ugc.aweme.plugin.aab.AabPluginServiceImpl;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class HybridKitInitTask implements EE1 {
    @Override // X.EEY
    public final String key() {
        return "HybridKitInitTask";
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
        return EFK.BOOT_FINISH;
    }

    @Override // X.EEY
    public final void run(Context context) {
        System.currentTimeMillis();
        FCG fcg = FCH.LIZIZ;
        fcg.getClass();
        if (!C40013Fn7.LIZIZ) {
            fcg.LIZJ();
        }
        try {
            IPluginService LIZLLL = AabPluginServiceImpl.LIZLLL();
            if (!LIZLLL.checkPluginInstalled("com.bytedance.tiktok.vmsdk")) {
                C37132Ehk c37132Ehk = new C37132Ehk();
                c37132Ehk.LIZIZ = true;
                c37132Ehk.LIZ = "com.bytedance.tiktok.vmsdk";
                c37132Ehk.LIZLLL = new C37738ErW(LIZLLL, context);
                LIZLLL.LIZ(new C37131Ehj(c37132Ehk));
            } else {
                try {
                    C16880lQ.LLJJJIL("v8_libfull.cr");
                } catch (Throwable unused) {
                }
                try {
                    C16880lQ.LLJJJIL("napi_v8");
                } catch (Throwable unused2) {
                }
                C16880lQ.LLJJJIL("lynx_v8_bridge");
            }
        } catch (Throwable unused3) {
        }
        if (!((Boolean) C33798DOg.LIZIZ.getValue()).booleanValue()) {
            new HybridKitInitWebKitTask().run(context);
        }
        try {
            HybridSettings.INSTANCE.startFetch();
        } catch (Throwable unused4) {
        }
        HashMap hashMap = new HashMap();
        hashMap.put(C38943FQd.LIZ(), C61878OQg.INSTANCE);
        File file = new File(C16880lQ.LLIIJLIL(EF7.LIZIZ()), "offlineX");
        C36982EfK c36982EfK = C36982EfK.LJII;
        Context LIZIZ = EF7.LIZIZ();
        ExecutorService BACKGROUND_EXECUTOR = C10K.LJI;
        o.LJIIIIZZ(BACKGROUND_EXECUTOR, "BACKGROUND_EXECUTOR");
        if (file.exists() && C36982EfK.LIZJ == null) {
            synchronized (c36982EfK) {
                if (C36982EfK.LIZJ == null) {
                    C36982EfK.LIZJ = BACKGROUND_EXECUTOR;
                    C36982EfK.LIZIZ = C36982EfK.LIZ(LIZIZ, file, hashMap);
                    C37848EtI.LIZLLL(C37009Efl.class, null, "Spark", 2);
                }
            }
        }
        C36093EEn.LIZ.getClass();
        C36089EEj LJIIIZ = C36093EEn.LJIIIZ();
        LJIIIZ.LIZIZ(new HybridPerformanceInitTask(), true);
        LJIIIZ.LIZJ();
    }
}
