package com.ss.android.ugc.aweme.legoImp.task;

import X.C0RN;
import X.C141335gf;
import X.C3C5;
import X.EE1;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.FJA;
import X.X1D;
import android.content.Context;
import android.util.Log;
import com.bytedance.pumbaa.bpea.adapter.BPEAServiceImp;
import com.bytedance.pumbaa.bpea.adapter.api.IBPEAService;
import java.util.List;
import kotlin.jvm.internal.o;
import yq4.a;

/* loaded from: classes7.dex */
public final class BPEAPreloadTask implements EE1 {
    @Override // X.EEY
    public final String key() {
        return "BPEAPreloadTask";
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
        return EFK.BACKGROUND;
    }

    @Override // X.EEY
    public final void run(Context context) {
        Object LIZ;
        o.LJIIIZ(context, "context");
        try {
            long nanoTime = System.nanoTime();
            IBPEAService LIZJ = BPEAServiceImp.LIZJ();
            if (LIZJ != null) {
                LIZJ.LIZIZ(FJA.LJLIL);
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("end preload:");
            LIZ2.append(((float) (System.nanoTime() - nanoTime)) / 1000000.0f);
            LIZ2.append("ms");
            LIZ = Integer.valueOf(Log.d("BPEAPreloadTask", X1D.LIZIZ(LIZ2)));
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        C3C5.m10exceptionOrNullimpl(LIZ);
        a.LJFF();
    }
}
