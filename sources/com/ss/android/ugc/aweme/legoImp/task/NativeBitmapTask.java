package com.ss.android.ugc.aweme.legoImp.task;

import X.C0RN;
import X.EE1;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.FFL;
import android.content.Context;
import com.bytedance.sysoptimizer.NativeBitmap;
import com.ss.android.ugc.aweme.experiment.NativeBitmapParam;
import java.util.List;

/* loaded from: classes10.dex */
public class NativeBitmapTask implements EE1 {
    @Override // X.EEY
    public final String key() {
        return "NativeBitmapTask";
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
        try {
            FFL.LJIIIZ().getClass();
            NativeBitmapParam nativeBitmapParam = (NativeBitmapParam) FFL.LJIJ(true, "tiktok_native_bitmap", 31744, NativeBitmapParam.class, null);
            if (nativeBitmapParam != null && nativeBitmapParam.enable) {
                NativeBitmap.enable(context, nativeBitmapParam.check_interval, nativeBitmapParam.utilization, nativeBitmapParam.max_heap_size);
            } else {
                NativeBitmap.enable(context, 30000L, 0.7d, 402653184L);
            }
        } catch (Throwable unused) {
        }
    }
}
