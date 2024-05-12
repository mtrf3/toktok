package X;

import android.os.Bundle;

/* renamed from: X.FwL, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class BinderC40585FwL<T> extends AbstractBinderC40586FwM {
    public final C40579FwF LJLIL;
    public final /* synthetic */ C40571Fw7 LJLILLLLZI;

    public BinderC40585FwL(C40571Fw7 c40571Fw7, C40579FwF c40579FwF) {
        this.LJLILLLLZI = c40571Fw7;
        this.LJLIL = c40579FwF;
    }

    @Override // X.InterfaceC40589FwP
    public void LJLLLL(int i, Bundle bundle) {
        this.LJLILLLLZI.LIZIZ.LIZIZ();
        C40571Fw7.LIZJ.LIZJ("onCancelInstall(%d)", 4, new Object[]{Integer.valueOf(i)});
    }

    public void LLILLIZIL(int i, Bundle bundle) {
        this.LJLILLLLZI.LIZIZ.LIZIZ();
        C40571Fw7.LIZJ.LIZJ("onStartInstall(%d)", 4, new Object[]{Integer.valueOf(i)});
    }
}
