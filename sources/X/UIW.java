package X;

/* loaded from: classes14.dex */
public final class UIW extends UIY implements InterfaceC78844Uwy<Long> {
    static {
        new UIW(1L, 0L);
    }

    @Override // X.InterfaceC78844Uwy
    public final Long LJIIIIZZ() {
        return Long.valueOf(this.LJLILLLLZI);
    }

    @Override // X.InterfaceC78844Uwy
    public final Long getStart() {
        return Long.valueOf(this.LJLIL);
    }

    public final int hashCode() {
        long j = this.LJLIL;
        long j2 = this.LJLILLLLZI;
        if (j > j2) {
            return -1;
        }
        return (int) ((31 * (j ^ (j >>> 32))) + ((j2 >>> 32) ^ j2));
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LJLIL);
        LIZ.append("..");
        LIZ.append(this.LJLILLLLZI);
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.InterfaceC78844Uwy
    public final /* bridge */ /* synthetic */ boolean LJII(Long l) {
        return LJIIIZ(l.longValue());
    }

    public final boolean LJIIIZ(long j) {
        if (this.LJLIL <= j && j <= this.LJLILLLLZI) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0016, code lost:
    
        if (r0.LJLIL > r0.LJLILLLLZI) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof X.UIW
            r9 = 0
            if (r0 == 0) goto L19
            long r5 = r10.LJLIL
            long r3 = r10.LJLILLLLZI
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 <= 0) goto L1a
            r0 = r11
            X.UIY r0 = (X.UIY) r0
            long r7 = r0.LJLIL
            long r0 = r0.LJLILLLLZI
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 <= 0) goto L1a
        L18:
            r9 = 1
        L19:
            return r9
        L1a:
            X.UIY r11 = (X.UIY) r11
            long r1 = r11.LJLIL
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 != 0) goto L19
            long r1 = r11.LJLILLLLZI
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L19
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: X.UIW.equals(java.lang.Object):boolean");
    }

    public UIW(long j, long j2) {
        super(j, j2);
    }
}
