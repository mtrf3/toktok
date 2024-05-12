package com.google.android.play.core.assetpacks;

import X.AbstractRunnableC40619Fwt;
import X.C40579FwF;
import android.os.RemoteException;

/* loaded from: classes7.dex */
public final class k extends AbstractRunnableC40619Fwt {
    public final /* synthetic */ C40579FwF LJLILLLLZI;
    public final /* synthetic */ q LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(q qVar, C40579FwF c40579FwF, C40579FwF c40579FwF2) {
        super(c40579FwF);
        this.LJLJI = qVar;
        this.LJLILLLLZI = c40579FwF2;
    }

    @Override // X.AbstractRunnableC40619Fwt
    public final void LIZ() {
        try {
            q qVar = this.LJLJI;
            qVar.LIZLLL.LJIIJ.n0(qVar.LIZ, q.LJII(), new o(this.LJLJI, this.LJLILLLLZI));
        } catch (RemoteException unused) {
            q.LJFF.getClass();
        }
    }
}
