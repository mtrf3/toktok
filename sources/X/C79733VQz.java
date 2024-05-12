package X;

import android.view.ViewGroup;
import android.view.ViewParent;

/* renamed from: X.VQz, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79733VQz implements VRC {
    public final /* synthetic */ InterfaceC60501Non LIZ;
    public final /* synthetic */ C79720VQm LIZIZ;

    @Override // X.VRC
    public final void LIZ(String str) {
        this.LIZIZ.LJIIJJI.remove(str);
        T t = this.LIZIZ.LIZ.mView;
        if (t == 0) {
            return;
        }
        ViewParent parent = t.getParent();
        if (parent != null) {
            C16880lQ.LJLLL(t, (ViewGroup) parent);
        }
        InterfaceC60501Non interfaceC60501Non = this.LIZ;
        if (interfaceC60501Non != null) {
            interfaceC60501Non.LIZ();
        }
        this.LIZIZ.LJIIJ = false;
    }

    public C79733VQz(C79720VQm c79720VQm, InterfaceC60501Non interfaceC60501Non) {
        this.LIZIZ = c79720VQm;
        this.LIZ = interfaceC60501Non;
    }
}
