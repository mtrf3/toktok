package com.google.android.play.core.appupdate;

import X.AbstractRunnableC40619Fwt;
import X.C40579FwF;
import android.os.RemoteException;

/* loaded from: classes7.dex */
public final class k extends AbstractRunnableC40619Fwt {
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ C40579FwF LJLJI;
    public final /* synthetic */ p LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(C40579FwF c40579FwF, C40579FwF c40579FwF2, p pVar, String str) {
        super(c40579FwF);
        this.LJLJJI = pVar;
        this.LJLILLLLZI = str;
        this.LJLJI = c40579FwF2;
    }

    @Override // X.AbstractRunnableC40619Fwt
    public final void LIZ() {
        try {
            p pVar = this.LJLJJI;
            pVar.LIZ.LJIIJ.LLLLIIIILLL(pVar.LIZIZ, p.LIZ(pVar, this.LJLILLLLZI), new o(this.LJLJJI, this.LJLJI, this.LJLILLLLZI));
        } catch (RemoteException e) {
            p.LJ.getClass();
            this.LJLJI.LIZIZ(new RuntimeException(e));
        }
    }
}
