package com.ss.android.ugc.aweme.share.dislike;

import X.InterfaceC62887OmB;
import androidx.lifecycle.ViewModel;

/* loaded from: classes11.dex */
public final class ChooseItemViewModel extends ViewModel {
    public int LJLIL;
    public int LJLILLLLZI;
    public int LJLJI;
    public boolean LJLJJI = true;
    public InterfaceC62887OmB LJLJJL;

    public final void reset() {
        this.LJLIL = 0;
        this.LJLILLLLZI = 0;
        gv0(0);
        this.LJLJJI = true;
        this.LJLJJL = null;
    }

    public final void gv0(int i) {
        InterfaceC62887OmB interfaceC62887OmB;
        InterfaceC62887OmB interfaceC62887OmB2;
        if (this.LJLJI <= 0) {
            if (i > 0 && (interfaceC62887OmB2 = this.LJLJJL) != null) {
                interfaceC62887OmB2.LIZIZ();
            }
        } else if (i <= 0 && (interfaceC62887OmB = this.LJLJJL) != null) {
            interfaceC62887OmB.LIZ();
        }
        this.LJLJI = i;
    }
}
