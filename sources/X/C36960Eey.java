package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Eey, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36960Eey extends C36959Eex implements InterfaceC78844Uwy<Character> {
    static {
        new C36960Eey((char) 1, (char) 0);
    }

    @Override // X.InterfaceC78844Uwy
    public final Character LJIIIIZZ() {
        return Character.valueOf(this.LJLILLLLZI);
    }

    @Override // X.InterfaceC78844Uwy
    public final Character getStart() {
        return Character.valueOf(this.LJLIL);
    }

    public final int hashCode() {
        if (o.LJIIJJI(this.LJLIL, this.LJLILLLLZI) > 0) {
            return -1;
        }
        return (this.LJLIL * 31) + this.LJLILLLLZI;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LJLIL);
        LIZ.append("..");
        LIZ.append(this.LJLILLLLZI);
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.InterfaceC78844Uwy
    public final boolean LJII(Character ch) {
        char charValue = ch.charValue();
        if (o.LJIIJJI(this.LJLIL, charValue) <= 0 && o.LJIIJJI(charValue, this.LJLILLLLZI) <= 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001a, code lost:
    
        if (kotlin.jvm.internal.o.LJIIJJI(r0.LJLIL, r0.LJLILLLLZI) > 0) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof X.C36960Eey
            r2 = 0
            if (r0 == 0) goto L1d
            char r1 = r3.LJLIL
            char r0 = r3.LJLILLLLZI
            int r0 = kotlin.jvm.internal.o.LJIIJJI(r1, r0)
            if (r0 <= 0) goto L1e
            r0 = r4
            X.Eex r0 = (X.C36959Eex) r0
            char r1 = r0.LJLIL
            char r0 = r0.LJLILLLLZI
            int r0 = kotlin.jvm.internal.o.LJIIJJI(r1, r0)
            if (r0 <= 0) goto L1e
        L1c:
            r2 = 1
        L1d:
            return r2
        L1e:
            char r1 = r3.LJLIL
            X.Eex r4 = (X.C36959Eex) r4
            char r0 = r4.LJLIL
            if (r1 != r0) goto L1d
            char r1 = r3.LJLILLLLZI
            char r0 = r4.LJLILLLLZI
            if (r1 != r0) goto L1d
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C36960Eey.equals(java.lang.Object):boolean");
    }

    public C36960Eey(char c, char c2) {
        super(c, c2);
    }
}
