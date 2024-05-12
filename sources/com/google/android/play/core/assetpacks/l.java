package com.google.android.play.core.assetpacks;

import X.AbstractBinderC40615Fwp;
import X.C40579FwF;
import android.os.Bundle;
import java.util.List;

/* loaded from: classes7.dex */
public class l<T> extends AbstractBinderC40615Fwp {
    public final C40579FwF LJLIL;
    public final /* synthetic */ q LJLILLLLZI;

    public l(q qVar, C40579FwF c40579FwF) {
        this.LJLILLLLZI = qVar;
        this.LJLIL = c40579FwF;
    }

    @Override // X.InterfaceC40618Fws
    public void LLJL(List<Bundle> list) {
        this.LJLILLLLZI.LIZJ.LIZIZ();
        q.LJFF.LIZJ("onGetSessionStates", 4, new Object[0]);
    }

    @Override // X.InterfaceC40618Fws
    public void h(Bundle bundle) {
        this.LJLILLLLZI.LIZJ.LIZIZ();
        int i = bundle.getInt("error_code");
        q.LJFF.LIZJ("onError(%d)", 6, new Object[]{Integer.valueOf(i)});
        this.LJLIL.LIZIZ(new a(i));
    }

    @Override // X.InterfaceC40618Fws
    public void LL(Bundle bundle, Bundle bundle2) {
        this.LJLILLLLZI.LIZLLL.LIZIZ();
        q.LJFF.LIZJ("onKeepAlive(%b)", 4, new Object[]{Boolean.valueOf(bundle.getBoolean("keep_alive"))});
    }

    @Override // X.InterfaceC40618Fws
    public void LLFII(Bundle bundle, Bundle bundle2) {
        this.LJLILLLLZI.LIZJ.LIZIZ();
        q.LJFF.LIZJ("onGetChunkFileDescriptor", 4, new Object[0]);
    }
}
