package com.google.android.play.core.assetpacks;

import X.C40579FwF;
import android.os.Bundle;

/* loaded from: classes7.dex */
public final class o extends l<Void> {
    public final /* synthetic */ q LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(q qVar, C40579FwF c40579FwF) {
        super(qVar, c40579FwF);
        this.LJLJI = qVar;
    }

    @Override // com.google.android.play.core.assetpacks.l, X.InterfaceC40618Fws
    public final void LL(Bundle bundle, Bundle bundle2) {
        super.LL(bundle, bundle2);
        if (!this.LJLJI.LJ.compareAndSet(true, false)) {
            q.LJFF.LIZJ("Expected keepingAlive to be true, but was false.", 5, new Object[0]);
        }
        if (bundle.getBoolean("keep_alive")) {
            this.LJLJI.LIZ();
        }
    }
}
