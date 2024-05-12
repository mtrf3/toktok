package com.ugc.effectcreator.canvas;

import X.C79863Bm;
import X.V1M;
import X.V8H;
import X.XLM;
import Y.IDObserverS227S0100000_42;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import com.ugc.effectcreator.effectcore.sdk.CKEffectEditorContext;
import kotlin.jvm.internal.IDqS423S0100000_42;

/* loaded from: classes34.dex */
public final class CanvasViewModel extends ViewModel {
    public final XLM LJLIL;
    public final C79863Bm LJLILLLLZI;
    public final Observer<Long> LJLJI;

    public CanvasViewModel() {
        XLM LIZ = V8H.LIZ(null);
        this.LJLIL = LIZ;
        this.LJLILLLLZI = V1M.LIZLLL(LIZ);
        this.LJLJI = new IDObserverS227S0100000_42(this, 4);
        CKEffectEditorContext.LIZLLL(new IDqS423S0100000_42(this, 110));
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        CKEffectEditorContext.LJIIIIZZ.removeObserver(this.LJLJI);
    }
}
