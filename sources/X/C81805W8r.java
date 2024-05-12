package X;

import Y.ARunnableS33S0200000_14;
import android.util.Pair;

/* JADX INFO: Add missing generic type declarations: [T] */
/* renamed from: X.W8r, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C81805W8r<T> extends W90<T, T> {
    public final /* synthetic */ C81799W8l LIZJ;

    @Override // X.W90, X.AbstractC81756W6u
    public final void LJFF() {
        this.LIZIZ.LIZJ();
        LJIIJJI();
    }

    public final void LJIIJJI() {
        Pair<W7F<T>, InterfaceC81770W7i> poll;
        synchronized (this.LIZJ) {
            poll = this.LIZJ.LIZJ.poll();
            if (poll == null) {
                C81799W8l c81799W8l = this.LIZJ;
                c81799W8l.LIZIZ--;
            }
        }
        if (poll != null) {
            this.LIZJ.LIZLLL.execute(new ARunnableS33S0200000_14(this, poll, 98));
        }
    }

    @Override // X.W90, X.AbstractC81756W6u
    public final void LJI(Throwable th) {
        this.LIZIZ.onFailure(th);
        LJIIJJI();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C81805W8r(C81799W8l c81799W8l, W7F w7f) {
        super(w7f);
        this.LIZJ = c81799W8l;
    }

    @Override // X.AbstractC81756W6u
    public final void LJII(int i, Object obj) {
        this.LIZIZ.LIZIZ(i, obj);
        if (AbstractC81756W6u.LIZLLL(i)) {
            LJIIJJI();
        }
    }
}
