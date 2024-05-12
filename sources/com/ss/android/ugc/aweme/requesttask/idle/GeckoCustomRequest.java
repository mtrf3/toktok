package com.ss.android.ugc.aweme.requesttask.idle;

import X.C0RN;
import X.C16880lQ;
import X.C37179EiV;
import X.C76522zQ;
import X.C86801Y4v;
import X.EBB;
import X.EBC;
import X.EE1;
import X.EF7;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.QD3;
import Y.ARunnableS42S0100000_6;
import android.content.Context;
import com.bytedance.geckox.model.CheckRequestBodyModel;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public class GeckoCustomRequest implements EE1 {
    public Map<String, List<CheckRequestBodyModel.TargetChannel>> LJLILLLLZI;
    public Map<String, List<CheckRequestBodyModel.TargetChannel>> LJLJJI;
    public C76522zQ LJZ;
    public final List<String> LJLIL = Collections.singletonList("high_priority");
    public final List<String> LJLJI = Collections.singletonList("normal");
    public long LJLJJL = 0;
    public final long LJLJJLL = 1;
    public final long LJLJL = 14;
    public boolean LJLJLJ = false;
    public boolean LJLJLLL = false;
    public boolean LJLL = true;
    public boolean LJLLI = true;
    public boolean LJLLILLLL = false;
    public boolean LJLLJ = false;
    public final ARunnableS42S0100000_6 LJLLL = new ARunnableS42S0100000_6(this, 52);
    public final ARunnableS42S0100000_6 LJLLLL = new ARunnableS42S0100000_6(this, 53);
    public final ARunnableS42S0100000_6 LJLLLLLL = new ARunnableS42S0100000_6(this, 54);
    public final ARunnableS42S0100000_6 LJLZ = new ARunnableS42S0100000_6(this, 55);

    @Override // X.EEY
    public final String key() {
        return "GeckoCustomRequest";
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
    public final /* synthetic */ int targetProcess() {
        return C0RN.LIZ();
    }

    @Override // X.EEY
    public final /* synthetic */ List triggerOtherLegoComponents() {
        return null;
    }

    @Override // X.EEY
    public final /* synthetic */ EnumC36103EEx triggerType() {
        return C0RN.LIZIZ(this);
    }

    public static void LJII() {
        if (!((Boolean) C86801Y4v.LIZLLL.getValue()).booleanValue() || !EBB.LIZJ.compareAndSet(false, true)) {
            return;
        }
        C37179EiV.LJFF.postDelayed(EBB.LJ, 2000L);
    }

    public final long LIZLLL() {
        long j = this.LJLJJL;
        if (j != 0) {
            return j;
        }
        Context LIZIZ = EF7.LIZIZ();
        try {
            long j2 = C16880lQ.LLLLLLZ(LIZIZ.getPackageManager(), LIZIZ.getPackageName(), 0).firstInstallTime;
            this.LJLJJL = j2;
            return j2;
        } catch (Exception unused) {
            return this.LJLJJL;
        }
    }

    @Override // X.EEY
    public final EnumC36092EEm scenesType() {
        return EnumC36092EEm.DEFAULT;
    }

    @Override // X.EE1
    public final EFK type() {
        return EFK.BOOT_FINISH;
    }

    public final void LJ(C76522zQ c76522zQ) {
        int i = c76522zQ.LJLIL;
        if (i == 0) {
            return;
        }
        C76522zQ c76522zQ2 = this.LJZ;
        if (c76522zQ2 != null && c76522zQ2.LJLIL == i) {
            return;
        }
        this.LJZ = c76522zQ;
        if (this.LJLLILLLL) {
            if (i == 2) {
                C37179EiV.LIZ().postDelayed(this.LJLLL, 3000L);
                this.LJLJLJ = false;
            } else if (i == 1) {
                if (!this.LJLJLJ) {
                    C37179EiV.LIZ().removeCallbacks(this.LJLLL);
                }
                EBC.LIZ.LIZ("occasion_high_priority");
            }
        }
        if (this.LJLLJ) {
            int i2 = c76522zQ.LJLIL;
            if (i2 == 2) {
                C37179EiV.LIZ().postDelayed(this.LJLLLLLL, 60000L);
                this.LJLJLLL = false;
            } else {
                if (i2 != 1) {
                    return;
                }
                if (!this.LJLJLLL) {
                    C37179EiV.LIZ().removeCallbacks(this.LJLLLLLL);
                }
                EBC.LIZ.LIZ("occasion_normal");
            }
        }
    }

    @QD3
    public void onEvent(C76522zQ c76522zQ) {
        LJ(c76522zQ);
    }

    /* JADX WARN: Code restructure failed: missing block: B:91:0x0209, code lost:
    
        if (r3 != null) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f5  */
    @Override // X.EEY
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run(android.content.Context r14) {
        /*
            Method dump skipped, instructions count: 719
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.requesttask.idle.GeckoCustomRequest.run(android.content.Context):void");
    }
}
