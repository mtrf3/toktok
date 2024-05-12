package X;

import kotlin.jvm.internal.o;

/* renamed from: X.SDj, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71735SDj extends F9E {
    public final int LJLIL;
    public final int LJLILLLLZI;
    public final int LJLJI;
    public final String LJLJJI;

    public C71735SDj() {
        this(null, 15);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.LJLIL), Integer.valueOf(this.LJLILLLLZI), Integer.valueOf(this.LJLJI), this.LJLJJI};
    }

    public final boolean M() {
        if (this.LJLJJI.length() > 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ C71735SDj(java.lang.String r5, int r6) {
        /*
            r4 = this;
            r0 = r6 & 1
            r3 = 0
            if (r0 == 0) goto L22
            r2 = 2131755809(0x7f100321, float:1.9142508E38)
        L8:
            r0 = r6 & 2
            if (r0 == 0) goto L20
            r1 = 2130968665(0x7f040059, float:1.754599E38)
        Lf:
            r0 = r6 & 4
            if (r0 == 0) goto L16
            r3 = 2130968651(0x7f04004b, float:1.7545962E38)
        L16:
            r0 = r6 & 8
            if (r0 == 0) goto L1c
            java.lang.String r5 = ""
        L1c:
            r4.<init>(r2, r1, r3, r5)
            return
        L20:
            r1 = 0
            goto Lf
        L22:
            r2 = 0
            goto L8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71735SDj.<init>(java.lang.String, int):void");
    }

    public static C71735SDj L(C71735SDj c71735SDj, String msg) {
        int i = c71735SDj.LJLIL;
        int i2 = c71735SDj.LJLILLLLZI;
        int i3 = c71735SDj.LJLJI;
        c71735SDj.getClass();
        o.LJIIIZ(msg, "msg");
        return new C71735SDj(i, i2, i3, msg);
    }

    public C71735SDj(int i, int i2, int i3, String msg) {
        o.LJIIIZ(msg, "msg");
        this.LJLIL = i;
        this.LJLILLLLZI = i2;
        this.LJLJI = i3;
        this.LJLJJI = msg;
    }
}
