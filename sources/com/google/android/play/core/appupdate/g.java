package com.google.android.play.core.appupdate;

import X.C16880lQ;
import X.C40561Fvx;
import X.C40579FwF;
import X.C40598FwY;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;

/* loaded from: classes7.dex */
public final class g implements b {
    public final p LIZ;
    public final e LIZIZ;
    public final Context LIZJ;

    public g(p pVar, e eVar, Context context) {
        new Handler(C16880lQ.LLJJJJ());
        this.LIZ = pVar;
        this.LIZIZ = eVar;
        this.LIZJ = context;
    }

    @Override // com.google.android.play.core.appupdate.b
    public final synchronized void LIZJ(C40598FwY c40598FwY) {
        this.LIZIZ.LJ(c40598FwY);
    }

    @Override // com.google.android.play.core.appupdate.b
    public final synchronized void LIZ() {
        C40598FwY c40598FwY = C40598FwY.LIZ;
        synchronized (this) {
            this.LIZIZ.LIZLLL(c40598FwY);
        }
    }

    @Override // com.google.android.play.core.appupdate.b
    public final C40561Fvx LIZIZ() {
        p pVar = this.LIZ;
        String packageName = this.LIZJ.getPackageName();
        if (pVar.LIZ == null) {
            return p.LIZIZ();
        }
        p.LJ.LIZJ("requestUpdateInfo(%s)", 4, new Object[]{packageName});
        C40579FwF c40579FwF = new C40579FwF(1);
        pVar.LIZ.LIZ(new k(c40579FwF, c40579FwF, pVar, packageName));
        return (C40561Fvx) c40579FwF.LIZ;
    }

    @Override // com.google.android.play.core.appupdate.b
    public final C40561Fvx LJ() {
        p pVar = this.LIZ;
        String packageName = this.LIZJ.getPackageName();
        if (pVar.LIZ == null) {
            return p.LIZIZ();
        }
        p.LJ.LIZJ("completeUpdate(%s)", 4, new Object[]{packageName});
        C40579FwF c40579FwF = new C40579FwF(1);
        pVar.LIZ.LIZ(new l(c40579FwF, c40579FwF, pVar, packageName));
        return (C40561Fvx) c40579FwF.LIZ;
    }

    @Override // com.google.android.play.core.appupdate.b
    public final boolean LIZLLL(a aVar, Activity activity) {
        t LIZJ = d.LIZJ();
        if (aVar.LJIIIZ(LIZJ) != null) {
            activity.startIntentSenderForResult(aVar.LJIIIZ(LIZJ).getIntentSender(), 19, null, 0, 0, 0, null);
            return true;
        }
        return false;
    }
}
