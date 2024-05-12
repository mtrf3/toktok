package com.google.android.play.core.appupdate;

import X.C13T;
import X.C40579FwF;
import android.os.Bundle;

/* loaded from: classes7.dex */
public final class n extends m<Void> {
    public n(p pVar, C40579FwF c40579FwF) {
        super(pVar, new C13T("OnCompleteUpdateCallback"), c40579FwF);
    }

    @Override // com.google.android.play.core.appupdate.m, X.InterfaceC40590FwQ
    public final void LJJJJJL(Bundle bundle) {
        super.LJJJJJL(bundle);
        if (bundle.getInt("error.code", -2) != 0) {
            this.LJLILLLLZI.LIZIZ(new com.google.android.play.core.install.a(bundle.getInt("error.code", -2)));
        } else {
            this.LJLILLLLZI.LIZJ(null);
        }
    }
}
