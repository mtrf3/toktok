package com.google.android.play.core.assetpacks;

import X.AbstractRunnableC40619Fwt;
import X.C40579FwF;
import android.os.Bundle;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes7.dex */
public final class d extends AbstractRunnableC40619Fwt {
    public final /* synthetic */ List LJLILLLLZI;
    public final /* synthetic */ C40579FwF LJLJI;
    public final /* synthetic */ q LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(q qVar, C40579FwF c40579FwF, List list, C40579FwF c40579FwF2) {
        super(c40579FwF);
        this.LJLJJI = qVar;
        this.LJLILLLLZI = list;
        this.LJLJI = c40579FwF2;
    }

    @Override // X.AbstractRunnableC40619Fwt
    public final void LIZ() {
        List<String> list = this.LJLILLLLZI;
        ArrayList arrayList = new ArrayList(list.size());
        for (String str : list) {
            Bundle bundle = new Bundle();
            bundle.putString("module_name", str);
            arrayList.add(bundle);
        }
        try {
            q qVar = this.LJLJJI;
            qVar.LIZJ.LJIIJ.LJLJL(qVar.LIZ, arrayList, q.LJII(), new l(this.LJLJJI, this.LJLJI));
        } catch (RemoteException unused) {
            q.LJFF.getClass();
        }
    }
}
