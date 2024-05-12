package com.ss.android.ugc.aweme.legoImp.task;

import X.C0RN;
import X.C16880lQ;
import X.C38774FJq;
import X.C88074YhS;
import X.EE1;
import X.EF7;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.FCD;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class InitCovodeTask implements EE1 {
    public final boolean LJLIL;

    @Override // X.EEY
    public final String key() {
        return "InitCovodeTask";
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

    @Override // X.EEY
    public final boolean meetTrigger() {
        if (!((Boolean) C88074YhS.LIZJ.getValue()).booleanValue()) {
            return true;
        }
        if (!this.LJLIL) {
            LIZLLL(EF7.LIZIZ());
        }
        return this.LJLIL;
    }

    @Override // X.EEY
    public final EnumC36092EEm scenesType() {
        return EnumC36092EEm.DEFAULT;
    }

    @Override // X.EE1
    public final EFK type() {
        return EFK.BACKGROUND;
    }

    public InitCovodeTask(boolean z) {
        this.LJLIL = z;
    }

    public final void LIZLLL(Context context) {
        File LLIIJI;
        String path;
        C38774FJq c38774FJq = new C38774FJq(context);
        c38774FJq.LIZ.LIZJ = FCD.LJI(context);
        boolean z = this.LJLIL;
        c38774FJq.LIZIZ = z;
        if (z && o.LJ(EF7.LJIILIIL, "local_test") && context != null && (LLIIJI = C16880lQ.LLIIJI(context, "covode")) != null && (path = LLIIJI.getPath()) != null) {
            c38774FJq.LIZ.LIZ = path;
        }
        Covode.startCollecting(c38774FJq);
    }

    @Override // X.EEY
    public final void run(Context context) {
        LIZLLL(context);
    }
}
