package X;

import java.io.File;

/* renamed from: X.Uvq, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78774Uvq {
    public final InterfaceC81714W5e LIZ = W8E.LJII().LJIIIZ();

    public final String LIZIZ(W5O w5o) {
        File file;
        InterfaceC81714W5e interfaceC81714W5e = this.LIZ;
        W5N LJI = W5N.LJI();
        LJI.getClass();
        WEK LJ = interfaceC81714W5e.LJ(LJI.LJ(w5o.LIZIZ));
        if (!(LJ instanceof WEK) || LJ == null || (file = LJ.LIZ) == null) {
            return null;
        }
        return file.getAbsolutePath();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(java.util.List<java.lang.String> r8, X.InterfaceC67352kd<? super java.util.List<java.lang.String>> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof X.C66222io
            if (r0 == 0) goto L91
            r5 = r9
            X.2io r5 = (X.C66222io) r5
            int r2 = r5.LJLJJL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L91
            int r2 = r2 - r1
            r5.LJLJJL = r2
        L12:
            java.lang.Object r1 = r5.LJLJI
            X.NAu r4 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r5.LJLJJL
            r6 = 1
            if (r0 == 0) goto L4a
            if (r0 != r6) goto L99
            java.lang.Object r3 = r5.LJLILLLLZI
            java.util.List r3 = (java.util.List) r3
            X.Uvq r5 = r5.LJLIL
            X.C141335gf.LIZJ(r1)
        L26:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r2 = r3.iterator()
        L2f:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L98
            java.lang.Object r1 = r2.next()
            X.W5O r1 = (X.W5O) r1
            java.lang.String r0 = "it"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            java.lang.String r0 = r5.LIZIZ(r1)
            if (r0 == 0) goto L2f
            r4.add(r0)
            goto L2f
        L4a:
            X.C141335gf.LIZJ(r1)
            java.util.ArrayList r3 = new java.util.ArrayList
            r0 = 10
            int r0 = X.C32I.LJJL(r8, r0)
            r3.<init>(r0)
            java.util.Iterator r2 = r8.iterator()
        L5c:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L7c
            java.lang.Object r0 = r2.next()
            java.lang.String r0 = (java.lang.String) r0
            android.net.Uri r0 = com.bytedance.mt.protector.impl.UriProtector.parse(r0)
            X.W5P r1 = X.W5P.LIZLLL(r0)
            X.W92 r0 = X.W92.HIGH
            r1.LJIIIZ = r0
            X.W5O r0 = r1.LIZ()
            r3.add(r0)
            goto L5c
        L7c:
            X.2iZ r1 = new X.2iZ
            r0 = 0
            r1.<init>(r7, r3, r0)
            r5.LJLIL = r7
            r5.LJLILLLLZI = r3
            r5.LJLJJL = r6
            java.lang.Object r0 = X.C74172T9c.LIZ(r1, r5)
            if (r0 != r4) goto L8f
            return r4
        L8f:
            r5 = r7
            goto L26
        L91:
            X.2io r5 = new X.2io
            r5.<init>(r7, r9)
            goto L12
        L98:
            return r4
        L99:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C78774Uvq.LIZ(java.util.List, X.2kd):java.lang.Object");
    }
}
