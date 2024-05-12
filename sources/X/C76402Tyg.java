package X;

/* renamed from: X.Tyg, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76402Tyg extends F9E {
    public final float LJLIL;
    public final int LJLILLLLZI;
    public final int LJLJI;

    public C76402Tyg() {
        this(0, 7);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Float.valueOf(this.LJLIL), Integer.valueOf(this.LJLILLLLZI), Integer.valueOf(this.LJLJI)};
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ C76402Tyg(int r4, int r5) {
        /*
            r3 = this;
            r0 = r5 & 1
            if (r0 == 0) goto L1a
            r2 = 1065353216(0x3f800000, float:1.0)
        L6:
            r0 = r5 & 2
            r1 = 0
            if (r0 == 0) goto Lc
            r4 = 0
        Lc:
            r0 = r5 & 4
            if (r0 == 0) goto L16
            java.lang.String r0 = "#000000"
            int r1 = com.bytedance.mt.protector.impl.color.ColorProtector.parseColor(r0)
        L16:
            r3.<init>(r2, r4, r1)
            return
        L1a:
            r2 = 0
            goto L6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C76402Tyg.<init>(int, int):void");
    }

    public C76402Tyg(float f, int i, int i2) {
        this.LJLIL = f;
        this.LJLILLLLZI = i;
        this.LJLJI = i2;
    }
}
