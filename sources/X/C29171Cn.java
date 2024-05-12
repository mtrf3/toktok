package X;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1Cn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C29171Cn extends C0CJ {
    public final List<C0CJ> LJLIL = new ArrayList(3);

    @Override // X.C0CJ
    public final void LIZ(int i) {
        try {
            Iterator it = ((ArrayList) this.LJLIL).iterator();
            while (it.hasNext()) {
                ((C0CJ) it.next()).LIZ(i);
            }
        } catch (ConcurrentModificationException e) {
            throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e);
        }
    }

    @Override // X.C0CJ
    public final void LIZJ(int i) {
        try {
            Iterator it = ((ArrayList) this.LJLIL).iterator();
            while (it.hasNext()) {
                ((C0CJ) it.next()).LIZJ(i);
            }
        } catch (ConcurrentModificationException e) {
            throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e);
        }
    }

    @Override // X.C0CJ
    public final void LIZIZ(int i, float f, int i2) {
        try {
            Iterator it = ((ArrayList) this.LJLIL).iterator();
            while (it.hasNext()) {
                ((C0CJ) it.next()).LIZIZ(i, f, i2);
            }
        } catch (ConcurrentModificationException e) {
            throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e);
        }
    }
}
