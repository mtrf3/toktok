package X;

/* renamed from: X.2le, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C67982le extends F9E {
    public final int LJLIL;
    public final int LJLILLLLZI;
    public final boolean LJLJI;

    public C67982le() {
        this(7);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.LJLIL), Integer.valueOf(this.LJLILLLLZI), Boolean.valueOf(this.LJLJI)};
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ C67982le(int r5) {
        /*
            r4 = this;
            r0 = r5 & 1
            r3 = -1
            r2 = 0
            if (r0 == 0) goto L11
            r1 = -1
        L7:
            r0 = r5 & 2
            if (r0 == 0) goto Lf
        Lb:
            r4.<init>(r1, r3, r2)
            return
        Lf:
            r3 = 0
            goto Lb
        L11:
            r1 = 0
            goto L7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67982le.<init>(int):void");
    }

    public C67982le(int i, int i2, boolean z) {
        this.LJLIL = i;
        this.LJLILLLLZI = i2;
        this.LJLJI = z;
    }

    public static C67982le L(C67982le c67982le, int i, int i2, boolean z, int i3) {
        if ((i3 & 1) != 0) {
            i = c67982le.LJLIL;
        }
        if ((i3 & 2) != 0) {
            i2 = c67982le.LJLILLLLZI;
        }
        if ((i3 & 4) != 0) {
            z = c67982le.LJLJI;
        }
        return new C67982le(i, i2, z);
    }
}
