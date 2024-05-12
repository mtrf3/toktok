package X;

import Y.IDComparatorS28S0000000;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.0Uu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C08440Uu implements CharSequence {
    public final String LJLIL;
    public final List<C08410Ur<C0VD>> LJLILLLLZI;
    public final List<C08410Ur<C0V2>> LJLJI;
    public final List<C08410Ur<? extends Object>> LJLJJI;

    public C08440Uu() {
        throw null;
    }

    public final int hashCode() {
        return this.LJLJJI.hashCode() + AnonymousClass391.LIZIZ(this.LJLJI, AnonymousClass391.LIZIZ(this.LJLILLLLZI, this.LJLIL.hashCode() * 31, 31), 31);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.LJLIL.length();
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.LJLIL;
    }

    public final C08440Uu LIZ(C08440Uu c08440Uu) {
        C08400Uq c08400Uq = new C08400Uq(this);
        c08400Uq.LIZ(c08440Uu);
        return c08400Uq.LJ();
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.LJLIL.charAt(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C08440Uu)) {
            return false;
        }
        C08440Uu c08440Uu = (C08440Uu) obj;
        if (o.LJ(this.LJLIL, c08440Uu.LJLIL) && o.LJ(this.LJLILLLLZI, c08440Uu.LJLILLLLZI) && o.LJ(this.LJLJI, c08440Uu.LJLJI) && o.LJ(this.LJLJJI, c08440Uu.LJLJJI)) {
            return true;
        }
        return false;
    }

    @Override // java.lang.CharSequence
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C08440Uu subSequence(int i, int i2) {
        if (i <= i2) {
            if (i == 0 && i2 == this.LJLIL.length()) {
                return this;
            }
            String substring = this.LJLIL.substring(i, i2);
            o.LJIIIIZZ(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return new C08440Uu(substring, C08460Uw.LIZ(i, i2, this.LJLILLLLZI), C08460Uw.LIZ(i, i2, this.LJLJI), C08460Uw.LIZ(i, i2, this.LJLJJI));
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("start (");
        LIZ.append(i);
        LIZ.append(") should be less or equal to end (");
        LIZ.append(i2);
        LIZ.append(')');
        String LIZIZ = X1D.LIZIZ(LIZ);
        LIZIZ.toString();
        throw new IllegalArgumentException(LIZIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C08440Uu(java.lang.String r3, java.util.List r4, int r5) {
        /*
            r2 = this;
            r0 = r5 & 2
            if (r0 == 0) goto L6
            X.OQg r4 = X.C61878OQg.INSTANCE
        L6:
            r0 = r5 & 4
            if (r0 == 0) goto L21
            X.OQg r1 = X.C61878OQg.INSTANCE
        Lc:
            java.lang.String r0 = "text"
            kotlin.jvm.internal.o.LJIIIZ(r3, r0)
            java.lang.String r0 = "spanStyles"
            kotlin.jvm.internal.o.LJIIIZ(r4, r0)
            java.lang.String r0 = "paragraphStyles"
            kotlin.jvm.internal.o.LJIIIZ(r1, r0)
            X.OQg r0 = X.C61878OQg.INSTANCE
            r2.<init>(r3, r4, r1, r0)
            return
        L21:
            r1 = 0
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C08440Uu.<init>(java.lang.String, java.util.List, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C08440Uu(String text, List<C08410Ur<C0VD>> list, List<C08410Ur<C0V2>> list2, List<? extends C08410Ur<? extends Object>> annotations) {
        o.LJIIIZ(text, "text");
        o.LJIIIZ(annotations, "annotations");
        this.LJLIL = text;
        this.LJLILLLLZI = list;
        this.LJLJI = list2;
        this.LJLJJI = annotations;
        List LLILII = ORZ.LLILII(new IDComparatorS28S0000000(7), list2);
        int size = LLILII.size();
        int i = -1;
        for (int i2 = 0; i2 < size; i2++) {
            C08410Ur c08410Ur = (C08410Ur) ListProtector.get(LLILII, i2);
            if (c08410Ur.LIZIZ >= i) {
                if (c08410Ur.LIZJ <= this.LJLIL.length()) {
                    i = c08410Ur.LIZJ;
                } else {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("ParagraphStyle range [");
                    LIZ.append(c08410Ur.LIZIZ);
                    LIZ.append(", ");
                    String LIZ2 = C08380Uo.LIZ(LIZ, c08410Ur.LIZJ, ") is out of boundary", LIZ);
                    LIZ2.toString();
                    throw new IllegalArgumentException(LIZ2);
                }
            } else {
                "ParagraphStyle should not overlap".toString();
                throw new IllegalArgumentException("ParagraphStyle should not overlap");
            }
        }
    }
}
