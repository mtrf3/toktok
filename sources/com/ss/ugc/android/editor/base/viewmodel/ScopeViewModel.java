package com.ss.ugc.android.editor.base.viewmodel;

import X.C36636EZk;
import X.InterfaceC70422pa;
import X.InterfaceC79150V4o;
import X.MBA;
import X.T2R;
import androidx.lifecycle.ViewModel;

/* loaded from: classes2.dex */
public class ScopeViewModel extends ViewModel implements InterfaceC70422pa {
    public final MBA LJLIL = C36636EZk.LIZ.plus(T2R.LJIIJJI());

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        InterfaceC79150V4o interfaceC79150V4o = (InterfaceC79150V4o) this.LJLIL.get(InterfaceC79150V4o.LJJJJJ);
        if (interfaceC79150V4o != null) {
            interfaceC79150V4o.LIZIZ(null);
        }
        super.onCleared();
    }

    @Override // X.InterfaceC70422pa
    public final MBA getCoroutineContext() {
        return this.LJLIL;
    }
}
