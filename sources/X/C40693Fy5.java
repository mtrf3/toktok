package X;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.o;

/* renamed from: X.Fy5, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40693Fy5 implements Iterator<C40517FvF>, InterfaceC90533gv {
    public int LJLIL = -1;
    public int LJLILLLLZI;
    public int LJLJI;
    public C40517FvF LJLJJI;
    public int LJLJJL;
    public final /* synthetic */ C40692Fy4 LJLJJLL;

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0019, code lost:
    
        if (r0 < r1) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ() {
        /*
            r7 = this;
            int r6 = r7.LJLJI
            r5 = 0
            if (r6 >= 0) goto Lb
            r7.LJLIL = r5
            r0 = 0
            r7.LJLJJI = r0
        La:
            return
        Lb:
            X.Fy4 r2 = r7.LJLJJLL
            int r1 = r2.LIZJ
            r4 = -1
            r3 = 1
            if (r1 <= 0) goto L1b
            int r0 = r7.LJLJJL
            int r0 = r0 + 1
            r7.LJLJJL = r0
            if (r0 >= r1) goto L23
        L1b:
            java.lang.CharSequence r0 = r2.LIZ
            int r0 = r0.length()
            if (r6 <= r0) goto L39
        L23:
            X.FvF r2 = new X.FvF
            int r1 = r7.LJLILLLLZI
            X.Fy4 r0 = r7.LJLJJLL
            java.lang.CharSequence r0 = r0.LIZ
            int r0 = ujb.s.LJJLIIIJ(r0)
            r2.<init>(r1, r0)
            r7.LJLJJI = r2
            r7.LJLJI = r4
        L36:
            r7.LJLIL = r3
            goto La
        L39:
            X.Fy4 r0 = r7.LJLJJLL
            X.Ynr<java.lang.CharSequence, java.lang.Integer, X.OSZ<java.lang.Integer, java.lang.Integer>> r2 = r0.LIZLLL
            java.lang.CharSequence r1 = r0.LIZ
            int r0 = r7.LJLJI
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r1 = r2.invoke(r1, r0)
            X.OSZ r1 = (X.OSZ) r1
            if (r1 != 0) goto L61
            X.FvF r2 = new X.FvF
            int r1 = r7.LJLILLLLZI
            X.Fy4 r0 = r7.LJLJJLL
            java.lang.CharSequence r0 = r0.LIZ
            int r0 = ujb.s.LJJLIIIJ(r0)
            r2.<init>(r1, r0)
            r7.LJLJJI = r2
            r7.LJLJI = r4
            goto L36
        L61:
            java.lang.Object r0 = r1.getFirst()
            java.lang.Number r0 = (java.lang.Number) r0
            int r2 = r0.intValue()
            java.lang.Object r0 = r1.getSecond()
            java.lang.Number r0 = (java.lang.Number) r0
            int r1 = r0.intValue()
            int r0 = r7.LJLILLLLZI
            X.FvF r0 = X.C78842Uww.LJJ(r0, r2)
            r7.LJLJJI = r0
            int r2 = r2 + r1
            r7.LJLILLLLZI = r2
            if (r1 != 0) goto L83
            r5 = 1
        L83:
            int r2 = r2 + r5
            r7.LJLJI = r2
            goto L36
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C40693Fy5.LIZ():void");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.LJLIL == -1) {
            LIZ();
        }
        if (this.LJLIL == 1) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final C40517FvF next() {
        if (this.LJLIL == -1) {
            LIZ();
        }
        if (this.LJLIL != 0) {
            C40517FvF c40517FvF = this.LJLJJI;
            o.LJII(c40517FvF, "null cannot be cast to non-null type kotlin.ranges.IntRange");
            this.LJLJJI = null;
            this.LJLIL = -1;
            return c40517FvF;
        }
        throw new NoSuchElementException();
    }

    public C40693Fy5(C40692Fy4 c40692Fy4) {
        this.LJLJJLL = c40692Fy4;
        int LJIIL = C78842Uww.LJIIL(c40692Fy4.LIZIZ, 0, c40692Fy4.LIZ.length());
        this.LJLILLLLZI = LJIIL;
        this.LJLJI = LJIIL;
    }
}
