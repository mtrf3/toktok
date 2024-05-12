package com.google.android.play.core.assetpacks;

import X.AbstractRunnableC40619Fwt;
import X.C40579FwF;
import X.InterfaceC40617Fwr;
import android.os.Bundle;
import android.os.RemoteException;

/* loaded from: classes7.dex */
public final class f extends AbstractRunnableC40619Fwt {
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ int LJLJJL;
    public final /* synthetic */ C40579FwF LJLJJLL;
    public final /* synthetic */ q LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(q qVar, C40579FwF c40579FwF, int i, String str, String str2, int i2, C40579FwF c40579FwF2) {
        super(c40579FwF);
        this.LJLJL = qVar;
        this.LJLILLLLZI = i;
        this.LJLJI = str;
        this.LJLJJI = str2;
        this.LJLJJL = i2;
        this.LJLJJLL = c40579FwF2;
    }

    @Override // X.AbstractRunnableC40619Fwt
    public final void LIZ() {
        try {
            q qVar = this.LJLJL;
            InterfaceC40617Fwr interfaceC40617Fwr = qVar.LIZJ.LJIIJ;
            String str = qVar.LIZ;
            int i = this.LJLILLLLZI;
            String str2 = this.LJLJI;
            String str3 = this.LJLJJI;
            int i2 = this.LJLJJL;
            Bundle bundle = new Bundle();
            bundle.putInt("session_id", i);
            bundle.putString("module_name", str2);
            bundle.putString("slice_id", str3);
            bundle.putInt("chunk_number", i2);
            interfaceC40617Fwr.s(str, bundle, q.LJII(), new l(this.LJLJL, this.LJLJJLL));
        } catch (RemoteException unused) {
            q.LJFF.getClass();
        }
    }
}
