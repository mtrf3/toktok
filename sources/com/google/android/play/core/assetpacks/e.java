package com.google.android.play.core.assetpacks;

import X.AbstractRunnableC40619Fwt;
import X.C40579FwF;
import android.os.RemoteException;
import java.util.Map;

/* loaded from: classes7.dex */
public final class e extends AbstractRunnableC40619Fwt {
    public final /* synthetic */ Map LJLILLLLZI;
    public final /* synthetic */ C40579FwF LJLJI;
    public final /* synthetic */ q LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(q qVar, C40579FwF c40579FwF, Map map, C40579FwF c40579FwF2) {
        super(c40579FwF);
        this.LJLJJI = qVar;
        this.LJLILLLLZI = map;
        this.LJLJI = c40579FwF2;
    }

    @Override // X.AbstractRunnableC40619Fwt
    public final void LIZ() {
        try {
            q qVar = this.LJLJJI;
            qVar.LIZJ.LJIIJ.LLJZIJLIL(qVar.LIZ, q.LJIIIIZZ(this.LJLILLLLZI), new n(this.LJLJJI, this.LJLJI));
        } catch (RemoteException e) {
            q.LJFF.getClass();
            this.LJLJI.LIZIZ(new RuntimeException(e));
        }
    }
}
