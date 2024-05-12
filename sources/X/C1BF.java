package X;

import androidx.lifecycle.Observer;

/* renamed from: X.1BF, reason: invalid class name */
/* loaded from: classes.dex */
public class C1BF<D> implements Observer<D> {
    public final C09M<D> LJLIL;
    public boolean LJLILLLLZI;

    public final String toString() {
        return this.LJLIL.toString();
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(D d) {
        this.LJLIL.LIZJ(d);
        this.LJLILLLLZI = true;
    }

    public C1BF(C0ZP<D> c0zp, C09M<D> c09m) {
        this.LJLIL = c09m;
    }
}
