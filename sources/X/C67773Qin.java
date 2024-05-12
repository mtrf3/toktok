package X;

import java.lang.ref.WeakReference;

/* renamed from: X.Qin, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67773Qin extends AbstractC61220O0y {
    public final WeakReference<C67756QiW> LIZ;

    @Override // X.AbstractC61220O0y
    public final void LIZ() {
        C67756QiW c67756QiW = this.LIZ.get();
        if (c67756QiW == null) {
            return;
        }
        c67756QiW.LJLILLLLZI.lock();
        try {
            if (c67756QiW.LJLJLLL) {
                c67756QiW.LJIJ();
            }
        } finally {
            c67756QiW.LJLILLLLZI.unlock();
        }
    }

    public C67773Qin(C67756QiW c67756QiW) {
        this.LIZ = new WeakReference<>(c67756QiW);
    }
}
