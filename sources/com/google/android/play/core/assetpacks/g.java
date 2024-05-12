package com.google.android.play.core.assetpacks;

import X.AbstractRunnableC40619Fwt;
import X.C40579FwF;
import X.InterfaceC40617Fwr;
import android.os.Bundle;
import android.os.RemoteException;

/* loaded from: classes7.dex */
public final class g extends AbstractRunnableC40619Fwt {
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ C40579FwF LJLJJI;
    public final /* synthetic */ int LJLJJL;
    public final /* synthetic */ q LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(q qVar, C40579FwF c40579FwF, int i, String str, C40579FwF c40579FwF2, int i2) {
        super(c40579FwF);
        this.LJLJJLL = qVar;
        this.LJLILLLLZI = i;
        this.LJLJI = str;
        this.LJLJJI = c40579FwF2;
        this.LJLJJL = i2;
    }

    @Override // X.AbstractRunnableC40619Fwt
    public final void LIZ() {
        try {
            q qVar = this.LJLJJLL;
            InterfaceC40617Fwr interfaceC40617Fwr = qVar.LIZJ.LJIIJ;
            String str = qVar.LIZ;
            int i = this.LJLILLLLZI;
            String str2 = this.LJLJI;
            Bundle bundle = new Bundle();
            bundle.putInt("session_id", i);
            bundle.putString("module_name", str2);
            interfaceC40617Fwr.a(str, bundle, q.LJII(), new p(this.LJLJJLL, this.LJLJJI, this.LJLILLLLZI, this.LJLJI, this.LJLJJL));
        } catch (RemoteException unused) {
            q.LJFF.getClass();
        }
    }
}
