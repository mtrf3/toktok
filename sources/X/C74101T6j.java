package X;

import androidx.lifecycle.Observer;

/* renamed from: X.T6j, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74101T6j<T> implements Observer<C74100T6i<? extends T>> {
    public final InterfaceC88472Yns<T, C76800UCe> LJLIL;

    /* JADX WARN: Multi-variable type inference failed */
    public C74101T6j(InterfaceC88472Yns<? super T, C76800UCe> interfaceC88472Yns) {
        this.LJLIL = interfaceC88472Yns;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        C74100T6i c74100T6i = (C74100T6i) obj;
        if (c74100T6i == null || c74100T6i.LIZIZ) {
            return;
        }
        c74100T6i.LIZIZ = true;
        T t = c74100T6i.LIZ;
        if (t == null) {
            return;
        }
        this.LJLIL.invoke(t);
    }
}
