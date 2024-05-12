package com.ss.android.ugc.aweme.push.bind;

import X.C0RN;
import X.C16880lQ;
import X.C34243DcF;
import X.C36419ERb;
import X.C62822Ol8;
import X.E3N;
import X.EE1;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.ORZ;
import Y.ARunnableS42S0100000_6;
import android.content.Context;
import android.os.Handler;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class ProcessBindCpuSetTask implements EE1 {
    public boolean LJLIL;

    @Override // X.EEY
    public final String key() {
        return "ProcessBindCpuSetTask";
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
        return 34;
    }

    @Override // X.EEY
    public final /* synthetic */ List triggerOtherLegoComponents() {
        return null;
    }

    @Override // X.EEY
    public final /* synthetic */ EnumC36103EEx triggerType() {
        return C0RN.LIZIZ(this);
    }

    public final void LIZLLL() {
        long j;
        Handler handler = new Handler(C16880lQ.LLJJJJ());
        ARunnableS42S0100000_6 aRunnableS42S0100000_6 = new ARunnableS42S0100000_6(this, 76);
        if (((Boolean) C34243DcF.LIZIZ.getValue()).booleanValue()) {
            j = 5000;
        } else {
            j = 0;
        }
        handler.postDelayed(aRunnableS42S0100000_6, j);
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
        o.LJIIIZ(context, "context");
        C62822Ol8 c62822Ol8 = C34243DcF.LIZ;
        if (((Number) c62822Ol8.getValue()).intValue() == 0) {
            return;
        }
        try {
            int intValue = ((Number) c62822Ol8.getValue()).intValue();
            if (intValue == 1) {
                if (!C36419ERb.LIZ()) {
                    LIZLLL();
                    return;
                }
                return;
            }
            if (intValue != 2 && intValue != 3) {
                return;
            }
            int i = E3N.LIZ.getInt("allowed", -1);
            if (i == -1) {
                C36419ERb.LIZIZ();
                return;
            }
            if (i == 0 || i <= 0 || C36419ERb.LIZ()) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            do {
                if ((i & 1) == 1) {
                    arrayList.add(Integer.valueOf(i2));
                }
                i >>= 1;
                i2++;
            } while (i > 0);
            int size = arrayList.size();
            if (2 > size || size >= 8 || ORZ.LLJ(arrayList) == null) {
                return;
            }
            LIZLLL();
        } catch (Throwable unused) {
        }
    }
}
