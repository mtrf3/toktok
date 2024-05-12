package X;

/* renamed from: X.Prs, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65788Prs extends AbstractC65789Prt {
    public static final C65788Prs LJLJL = new C65788Prs(0, null, new Object[0]);
    public final transient Object LJLJJI;
    public final transient Object[] LJLJJL;
    public final transient int LJLJJLL;

    public C65788Prs(int i, Object obj, Object[] objArr) {
        this.LJLJJI = obj;
        this.LJLJJL = objArr;
        this.LJLJJLL = i;
    }

    @Override // java.util.Map
    public final int size() {
        return this.LJLJJLL;
    }

    @Override // X.AbstractC65789Prt
    public final C65799Ps3 LIZ() {
        return new C65799Ps3(1, this.LJLJJLL, this.LJLJJL);
    }

    @Override // X.AbstractC65789Prt
    public final C65791Prv LIZIZ() {
        return new C65791Prv(this, this.LJLJJL, this.LJLJJLL);
    }

    @Override // X.AbstractC65789Prt
    public final C65790Pru LIZJ() {
        return new C65790Pru(this, new C65799Ps3(0, this.LJLJJLL, this.LJLJJL));
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0097, code lost:
    
        if (r0 != null) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:?, code lost:
    
        return r0;
     */
    @Override // X.AbstractC65789Prt, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object get(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r5 = r8.LJLJJI
            java.lang.Object[] r4 = r8.LJLJJL
            int r0 = r8.LJLJJLL
            r7 = 0
            if (r9 != 0) goto La
        L9:
            return r7
        La:
            r1 = 1
            if (r0 != r1) goto L1f
            r0 = 0
            r0 = r4[r0]
            r0.getClass()
            boolean r0 = r0.equals(r9)
            if (r0 == 0) goto L9
            r0 = r4[r1]
            r0.getClass()
        L1e:
            return r0
        L1f:
            if (r5 != 0) goto L22
            goto L9
        L22:
            boolean r0 = r5 instanceof byte[]
            r6 = -1
            if (r0 == 0) goto L4d
            byte[] r5 = (byte[]) r5
            int r0 = r5.length
            int r3 = r0 + (-1)
            int r0 = r9.hashCode()
            int r2 = X.C78857UxB.LJJLI(r0)
        L34:
            r2 = r2 & r3
            r1 = r5[r2]
            r0 = 255(0xff, float:3.57E-43)
            r1 = r1 & r0
            if (r1 != r0) goto L3d
            goto L9
        L3d:
            r0 = r4[r1]
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L4a
            r0 = r1 ^ 1
            r0 = r4[r0]
            goto L97
        L4a:
            int r2 = r2 + 1
            goto L34
        L4d:
            boolean r0 = r5 instanceof short[]
            if (r0 == 0) goto L68
            short[] r5 = (short[]) r5
            int r0 = r5.length
            int r3 = r0 + (-1)
            int r0 = r9.hashCode()
            int r2 = X.C78857UxB.LJJLI(r0)
        L5e:
            r2 = r2 & r3
            short r0 = r5[r2]
            char r1 = (char) r0
            r0 = 65535(0xffff, float:9.1834E-41)
            if (r1 != r0) goto L8b
            goto L9
        L68:
            int[] r5 = (int[]) r5
            int r0 = r5.length
            int r3 = r0 + (-1)
            int r0 = r9.hashCode()
            int r2 = X.C78857UxB.LJJLI(r0)
        L75:
            r2 = r2 & r3
            r1 = r5[r2]
            if (r1 != r6) goto L7b
            goto L9
        L7b:
            r0 = r4[r1]
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L88
            r0 = r1 ^ 1
            r0 = r4[r0]
            goto L97
        L88:
            int r2 = r2 + 1
            goto L75
        L8b:
            r0 = r4[r1]
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L9b
            r0 = r1 ^ 1
            r0 = r4[r0]
        L97:
            if (r0 != 0) goto L1e
            goto L9
        L9b:
            int r2 = r2 + 1
            goto L5e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65788Prs.get(java.lang.Object):java.lang.Object");
    }
}
