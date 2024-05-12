package com.google.android.play.core.assetpacks;

import X.AbstractRunnableC40619Fwt;
import X.C40579FwF;
import X.InterfaceC40617Fwr;
import android.os.Bundle;
import android.os.RemoteException;

/* loaded from: classes7.dex */
public final class h extends AbstractRunnableC40619Fwt {
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ C40579FwF LJLJI;
    public final /* synthetic */ q LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(q qVar, C40579FwF c40579FwF, int i, C40579FwF c40579FwF2) {
        super(c40579FwF);
        this.LJLJJI = qVar;
        this.LJLILLLLZI = i;
        this.LJLJI = c40579FwF2;
    }

    @Override // X.AbstractRunnableC40619Fwt
    public final void LIZ() {
        try {
            q qVar = this.LJLJJI;
            InterfaceC40617Fwr interfaceC40617Fwr = qVar.LIZJ.LJIIJ;
            String str = qVar.LIZ;
            int i = this.LJLILLLLZI;
            Bundle bundle = new Bundle();
            bundle.putInt("session_id", i);
            interfaceC40617Fwr.i(str, bundle, q.LJII(), new l(this.LJLJJI, this.LJLJI));
        } catch (RemoteException unused) {
            q.LJFF.getClass();
        }
    }
}
