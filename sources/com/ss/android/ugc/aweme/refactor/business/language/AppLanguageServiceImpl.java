package com.ss.android.ugc.aweme.refactor.business.language;

import X.G36;
import X.InterfaceC40740Fyq;
import androidx.lifecycle.ViewModel;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class AppLanguageServiceImpl extends ViewModel implements InterfaceC40740Fyq {
    public G36 LJLIL;
    public G36 LJLILLLLZI;

    @Override // X.InterfaceC40740Fyq
    public final G36 LLLLLIL() {
        return this.LJLIL;
    }

    @Override // X.InterfaceC40740Fyq
    public final G36 LLLLZIL() {
        return this.LJLILLLLZI;
    }

    @Override // X.InterfaceC40740Fyq
    public final void gi(G36 item) {
        o.LJIIIZ(item, "item");
        this.LJLIL = item;
    }

    @Override // X.InterfaceC40740Fyq
    public final void hg0(G36 g36) {
        this.LJLILLLLZI = g36;
    }
}
