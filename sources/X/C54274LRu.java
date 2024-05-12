package X;

import Y.ARunnableS45S0100000_9;

/* renamed from: X.LRu, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54274LRu extends AbstractC54276LRw {
    public final long LJFF;

    @Override // X.AbstractC54278LRy
    public final void LIZLLL() {
        this.LJ.LIZ(new C54275LRv(this));
        this.LIZ.postDelayed(new ARunnableS45S0100000_9(this, 4), this.LJFF);
    }

    @Override // X.AbstractC54276LRw, X.AbstractC54278LRy
    public final void LIZJ() {
        super.LIZJ();
        this.LIZ.removeCallbacksAndMessages(null);
    }

    public C54274LRu(long j, C54277LRx c54277LRx) {
        super(c54277LRx);
        this.LJFF = j;
    }
}
