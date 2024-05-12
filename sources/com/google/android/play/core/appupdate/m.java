package com.google.android.play.core.appupdate;

import X.AbstractBinderC40588FwO;
import X.C13T;
import X.C40579FwF;
import android.os.Bundle;

/* loaded from: classes7.dex */
public class m<T> extends AbstractBinderC40588FwO {
    public final C13T LJLIL;
    public final C40579FwF LJLILLLLZI;
    public final /* synthetic */ p LJLJI;

    public m(p pVar, C13T c13t, C40579FwF c40579FwF) {
        this.LJLJI = pVar;
        this.LJLIL = c13t;
        this.LJLILLLLZI = c40579FwF;
    }

    @Override // X.InterfaceC40590FwQ
    public void LJJJJJL(Bundle bundle) {
        this.LJLJI.LIZ.LIZIZ();
        this.LJLIL.LIZJ("onCompleteUpdate", 4, new Object[0]);
    }

    @Override // X.InterfaceC40590FwQ
    public void LJJJJLL(Bundle bundle) {
        this.LJLJI.LIZ.LIZIZ();
        this.LJLIL.LIZJ("onRequestInfo", 4, new Object[0]);
    }
}
