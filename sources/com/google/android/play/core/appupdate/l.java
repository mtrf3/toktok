package com.google.android.play.core.appupdate;

import X.AbstractRunnableC40619Fwt;
import X.C40579FwF;
import android.os.RemoteException;

/* loaded from: classes7.dex */
public final class l extends AbstractRunnableC40619Fwt {
    public final /* synthetic */ C40579FwF LJLILLLLZI;
    public final /* synthetic */ p LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(C40579FwF c40579FwF, C40579FwF c40579FwF2, p pVar, String str) {
        super(c40579FwF);
        this.LJLJI = pVar;
        this.LJLILLLLZI = c40579FwF2;
    }

    @Override // X.AbstractRunnableC40619Fwt
    public final void LIZ() {
        try {
            p pVar = this.LJLJI;
            pVar.LIZ.LJIIJ.LLLLII(pVar.LIZIZ, p.LIZJ(), new n(this.LJLJI, this.LJLILLLLZI));
        } catch (RemoteException e) {
            p.LJ.getClass();
            this.LJLILLLLZI.LIZIZ(new RuntimeException(e));
        }
    }
}
