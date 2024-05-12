package X;

import android.view.ViewTreeObserver;
import android.widget.EditText;
import kotlin.jvm.internal.AqS158S0100000_8;

/* loaded from: classes9.dex */
public final class K9M implements ViewTreeObserver.OnWindowFocusChangeListener {
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLIL;
    public final /* synthetic */ EditText LJLILLLLZI;

    @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
    public final void onWindowFocusChanged(boolean z) {
        if (z) {
            this.LJLIL.invoke();
            this.LJLILLLLZI.getViewTreeObserver().removeOnWindowFocusChangeListener(this);
        }
    }

    public K9M(T5T t5t, AqS158S0100000_8 aqS158S0100000_8) {
        this.LJLIL = aqS158S0100000_8;
        this.LJLILLLLZI = t5t;
    }
}
