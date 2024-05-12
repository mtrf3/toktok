package X;

import android.view.View;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LSA<T> implements InterfaceC73592SuS {
    public final /* synthetic */ LS9 LJLIL;

    public LSA(LS9 ls9) {
        this.LJLIL = ls9;
    }

    @Override // X.InterfaceC73592SuS
    public final boolean test(Object it) {
        o.LJIIIZ(it, "it");
        View view = this.LJLIL.LJIILIIL;
        if (view != null && view.getVisibility() == 0) {
            return true;
        }
        return false;
    }
}
