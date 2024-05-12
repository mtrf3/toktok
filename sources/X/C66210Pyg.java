package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Pyg, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66210Pyg extends F9E {
    public int LJLIL;
    public String LJLILLLLZI;
    public Object LJLJI;
    public java.util.Map<String, ? extends Object> LJLJJI;
    public java.util.Map<String, ? extends Object> LJLJJL;
    public Q11 LJLJJLL;

    /* JADX WARN: Multi-variable type inference failed */
    public C66210Pyg() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 63);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.LJLIL), this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL};
    }

    public static C66210Pyg L(C66210Pyg c66210Pyg) {
        int i = c66210Pyg.LJLIL;
        String msg = c66210Pyg.LJLILLLLZI;
        Object obj = c66210Pyg.LJLJI;
        java.util.Map<String, ? extends Object> map = c66210Pyg.LJLJJI;
        java.util.Map<String, ? extends Object> map2 = c66210Pyg.LJLJJL;
        Q11 q11 = c66210Pyg.LJLJJLL;
        o.LJIIIZ(msg, "msg");
        return new C66210Pyg(i, msg, obj, map, map2, q11);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ C66210Pyg(java.lang.Object r8, java.util.Map r9, X.Q11 r10, int r11) {
        /*
            r7 = this;
            r3 = r8
            r4 = r9
            r1 = 0
            r0 = r11 & 2
            r6 = 0
            if (r0 == 0) goto L20
            java.lang.String r2 = ""
        La:
            r0 = r11 & 4
            if (r0 == 0) goto Lf
            r3 = r6
        Lf:
            r0 = r11 & 8
            if (r0 == 0) goto L14
            r4 = r6
        L14:
            r5 = 0
            r0 = r11 & 32
            if (r0 == 0) goto L1e
        L19:
            r0 = r7
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        L1e:
            r6 = r10
            goto L19
        L20:
            r2 = r6
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66210Pyg.<init>(java.lang.Object, java.util.Map, X.Q11, int):void");
    }

    public C66210Pyg(int i, String msg, Object obj, java.util.Map<String, ? extends Object> map, java.util.Map<String, ? extends Object> map2, Q11 q11) {
        o.LJIIIZ(msg, "msg");
        this.LJLIL = i;
        this.LJLILLLLZI = msg;
        this.LJLJI = obj;
        this.LJLJJI = map;
        this.LJLJJL = map2;
        this.LJLJJLL = q11;
    }
}
