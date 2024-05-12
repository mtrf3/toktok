package X;

import kotlin.jvm.internal.o;

/* renamed from: X.1PC, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1PC implements C0Z5 {
    public final C51171zd LIZ;
    public final InterfaceC07790Sh LIZIZ;
    public EnumC23500w6 LIZJ;

    public C1PC() {
        C51171zd c51171zd = new C51171zd(C1PB.Inactive);
        this.LIZ = c51171zd;
        C1M1 c1m1 = InterfaceC07790Sh.LJJJI;
        o.LJIIIZ(c1m1, "<this>");
        c1m1.LLLIIIL(c51171zd);
        this.LIZIZ = c51171zd.LLLIIIL(C0ZD.LIZIZ);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0052, code lost:
    
        if (r0 == false) goto L24;
     */
    @Override // X.C0Z5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZ(int r19) {
        /*
            Method dump skipped, instructions count: 411
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1PC.LIZ(int):boolean");
    }

    @Override // X.C0Z5
    public final void LIZIZ(boolean z) {
        C1PB c1pb;
        C51171zd c51171zd = this.LIZ;
        C1PB c1pb2 = c51171zd.LJLJJI;
        if (C09520Yy.LIZJ(c51171zd, z)) {
            C51171zd c51171zd2 = this.LIZ;
            switch (C0Z6.LIZ[c1pb2.ordinal()]) {
                case 1:
                case 2:
                case 3:
                    c1pb = C1PB.Active;
                    break;
                case 4:
                case 5:
                    c1pb = C1PB.Deactivated;
                    break;
                case 6:
                    c1pb = C1PB.Inactive;
                    break;
                default:
                    throw new C162476Zf();
            }
            c51171zd2.LIZ(c1pb);
        }
    }
}
