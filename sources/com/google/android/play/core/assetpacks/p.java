package com.google.android.play.core.assetpacks;

import X.C40579FwF;
import android.os.Bundle;

/* loaded from: classes7.dex */
public final class p extends l<Void> {
    public final int LJLJI;
    public final String LJLJJI;
    public final int LJLJJL;
    public final /* synthetic */ q LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(q qVar, C40579FwF c40579FwF, int i, String str, int i2) {
        super(qVar, c40579FwF);
        this.LJLJJLL = qVar;
        this.LJLJI = i;
        this.LJLJJI = str;
        this.LJLJJL = i2;
    }

    @Override // com.google.android.play.core.assetpacks.l, X.InterfaceC40618Fws
    public final void h(Bundle bundle) {
        this.LJLJJLL.LIZJ.LIZIZ();
        q.LJFF.LIZJ("onError(%d), retrying notifyModuleCompleted...", 6, new Object[]{Integer.valueOf(bundle.getInt("error_code"))});
        int i = this.LJLJJL;
        if (i > 0) {
            this.LJLJJLL.LJIIIZ(this.LJLJI, i - 1, this.LJLJJI);
        }
    }
}
