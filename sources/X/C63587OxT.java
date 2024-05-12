package X;

import android.os.SystemClock;

/* renamed from: X.OxT, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63587OxT extends AbstractC63581OxN {
    public C63622Oy2 LJLL;

    @Override // X.AbstractC63581OxN
    public final String LJIIIZ() {
        return "IM-REQUEST-QUEUE-S";
    }

    public final synchronized void LJJ() {
        if (this.LJLJJI.isEmpty()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(LJIIIIZZ());
            LIZ.append("sendNextRequest, mQueue empty");
            C63322OtC.LJFF(X1D.LIZIZ(LIZ));
            return;
        }
        if (this.LJLL != null) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(LJIIIIZZ());
            LIZ2.append("sendNextRequest, has waitingItem");
            C63322OtC.LJFF(X1D.LIZIZ(LIZ2));
            return;
        }
        C63622Oy2 peek = this.LJLJJI.peek();
        if (peek == null) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append(LJIIIIZZ());
            LIZ3.append("sendNextRequest, peeked item null");
            C63322OtC.LJFF(X1D.LIZIZ(LIZ3));
            return;
        }
        if (peek.LJZI <= 0) {
            peek.LJZI = SystemClock.uptimeMillis();
        }
        this.LJLL = peek;
        LJIIZILJ(peek);
    }

    @Override // X.AbstractC63581OxN
    public final void LJI() {
        super.LJI();
        this.LJLL = null;
    }

    @Override // X.AbstractC63581OxN
    public final void LJIIJJI(C63622Oy2 c63622Oy2) {
        if (c63622Oy2 == this.LJLL) {
            this.LJLL = null;
            LJJ();
        }
    }

    @Override // X.AbstractC63581OxN
    public final void LJIIL(C63622Oy2 c63622Oy2) {
        C63622Oy2 peek;
        if (!this.LJLJJI.contains(c63622Oy2)) {
            this.LJLJJI.add(c63622Oy2);
            c63622Oy2.LJZ = SystemClock.uptimeMillis();
        }
        if (this.LJLJJI.isEmpty() || (peek = this.LJLJJI.peek()) == null || peek.LJLIL != c63622Oy2.LJLIL) {
            return;
        }
        LJJ();
    }

    @Override // X.AbstractC63581OxN
    public final void LJIILIIL(C63622Oy2 c63622Oy2) {
        super.LJIILIIL(c63622Oy2);
        if (c63622Oy2 == this.LJLL) {
            LJIL(c63622Oy2);
        }
    }

    @Override // X.AbstractC63581OxN
    public final void LJIILJJIL(C63622Oy2 c63622Oy2) {
        super.LJIILJJIL(c63622Oy2);
        this.LJLL = null;
        LJJ();
    }

    public final void LJIL(C63622Oy2 c63622Oy2) {
        if (this.LJLJJI.contains(c63622Oy2)) {
            LJIJI(103, c63622Oy2);
            LJIJI(105, c63622Oy2);
            this.LJLJJI.remove(c63622Oy2);
        }
        this.LJLL = null;
        LJJ();
    }
}
