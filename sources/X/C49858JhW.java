package X;

import java.util.Iterator;

/* renamed from: X.JhW, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49858JhW implements C8BT {
    public final /* synthetic */ C49857JhV LJLIL;

    @Override // X.C8BT
    public final void onSuccess() {
        Iterator<InterfaceC49869Jhh> it = this.LJLIL.LJLIL.iterator();
        while (it.hasNext()) {
            it.next().LIZIZ();
        }
    }

    public C49858JhW(C49857JhV c49857JhV) {
        this.LJLIL = c49857JhV;
    }

    @Override // X.C8BT
    public final void onFailed(Exception exc) {
        Iterator<InterfaceC49869Jhh> it = this.LJLIL.LJLIL.iterator();
        while (it.hasNext()) {
            it.next().LIZIZ();
        }
    }
}
