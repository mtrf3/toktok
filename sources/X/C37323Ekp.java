package X;

import java.util.List;

/* renamed from: X.Ekp, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37323Ekp extends AbstractC65781Prl implements InterfaceC65784Pro<List<? extends EMX>> {
    public final /* synthetic */ java.util.Map<String, C37324Ekq> LJLIL;
    public final /* synthetic */ C37327Ekt LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37323Ekp(java.util.Map<String, C37324Ekq> map, C37327Ekt c37327Ekt) {
        super(0);
        this.LJLIL = map;
        this.LJLILLLLZI = c37327Ekt;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00af, code lost:
    
        if (r12 == null) goto L14;
     */
    @Override // X.InterfaceC65784Pro
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<? extends X.EMX> invoke() {
        /*
            r20 = this;
            r2 = r20
            java.util.Map<java.lang.String, X.Ekq> r0 = r2.LJLIL
            java.util.Collection r1 = r0.values()
            X.Ekt r0 = r2.LJLILLLLZI
            X.Egf r3 = r0.LIZIZ
            java.lang.String r0 = "internalItemList"
            kotlin.jvm.internal.o.LJIIIZ(r1, r0)
            java.lang.String r0 = "monitor"
            kotlin.jvm.internal.o.LJIIIZ(r3, r0)
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            java.util.Iterator r8 = r1.iterator()
        L1f:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto Lb2
            java.lang.Object r4 = r8.next()
            X.Ekq r4 = (X.C37324Ekq) r4
            java.util.List<java.lang.String> r0 = r4.LIZIZ
            boolean r0 = r0.isEmpty()
            r6 = 62
            r15 = 0
            if (r0 == 0) goto L42
            int r0 = r3.LJJIIJZLJL
            int r0 = r0 + 1
            r3.LJJIIJZLJL = r0
            r0 = 206(0xce, float:2.89E-43)
            X.C73802v2.LIZIZ(r0, r15, r6)
            goto L1f
        L42:
            java.util.List<java.lang.String> r0 = r4.LIZIZ
            int r1 = r0.size()
            int r0 = r3.LJJ
            int r0 = r0 + r1
            r3.LJJ = r0
            java.util.List<java.lang.String> r0 = r4.LIZIZ
            java.util.Iterator r7 = r0.iterator()
        L53:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L1f
            java.lang.Object r11 = r7.next()
            java.lang.String r11 = (java.lang.String) r11
            X.Fcv r0 = X.C39381Fcv.LIZ
            r0.getClass()
            X.Q8q r5 = X.C39381Fcv.LIZ(r11)
            if (r5 != 0) goto La3
            int r0 = r3.LJJIIZI
            int r0 = r0 + 1
            r3.LJJIIZI = r0
            r0 = 208(0xd0, float:2.91E-43)
            X.C73802v2.LIZIZ(r0, r15, r6)
        L75:
            r12 = r11
        L76:
            boolean r0 = r2.containsKey(r12)
            if (r0 != 0) goto L53
            java.lang.String r10 = r4.LIZ
            if (r5 == 0) goto L8c
            int r0 = r5.getCountryCode()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r15 = r0.toString()
        L8c:
            java.lang.String r14 = r4.LIZLLL
            X.EMX r9 = new X.EMX
            r16 = 0
            r17 = 0
            r18 = 192(0xc0, float:2.69E-43)
            r13 = r12
            r19 = r17
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r2.put(r12, r9)
            r6 = 62
            r15 = 0
            goto L53
        La3:
            long r0 = r5.getNationalNumber()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.String r12 = r0.toString()
            if (r12 != 0) goto L76
            goto L75
        Lb2:
            int r1 = r2.size()
            int r0 = r3.LJJIIZ
            int r0 = r0 + r1
            r3.LJJIIZ = r0
            java.util.Collection r0 = r2.values()
            java.util.List r0 = X.ORZ.LLJI(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37323Ekp.invoke():java.lang.Object");
    }
}
