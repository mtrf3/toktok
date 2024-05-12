package X;

import java.util.HashMap;

/* renamed from: X.W8a, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C81788W8a extends W90<W8X, W8X> {
    public final boolean LIZJ;
    public final InterfaceC79240V8a LIZLLL;
    public final InterfaceC81770W7i LJ;
    public final C81808W8u LJFF;
    public final C81808W8u LJI;
    public final HashMap<String, C81808W8u> LJII;
    public final W6O LJIIIIZZ;
    public boolean LJIIIZ;
    public final C81795W8h LJIIJ;
    public final /* synthetic */ W8F LJIIJJI;

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0085, code lost:
    
        if (r1.contains(java.lang.Integer.valueOf(r10.LJLJJL)) != false) goto L30;
     */
    @Override // X.AbstractC81756W6u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJII(int r9, java.lang.Object r10) {
        /*
            r8 = this;
            X.W8X r10 = (X.W8X) r10
            boolean r0 = r8.LJIIIZ
            if (r0 == 0) goto L7
        L6:
            return
        L7:
            boolean r7 = X.AbstractC81756W6u.LIZLLL(r9)
            r3 = 1
            if (r10 != 0) goto L17
            if (r7 == 0) goto L6
            X.W7F<O> r1 = r8.LIZIZ
            r0 = 0
            r1.LIZIZ(r3, r0)
            goto L6
        L17:
            X.W7i r0 = r8.LJ
            X.W5O r5 = r0.LJ()
            X.V8a r2 = r8.LIZLLL
            r10.LJIILIIL()
            X.W9o r1 = r10.LJLJI
            boolean r0 = r8.LIZJ
            X.W98 r4 = r2.LIZ(r1, r0)
            r4.getClass()
            r10.LJIILIIL()
            X.W9o r1 = r10.LJLJI
            X.W9o r0 = X.C81828W9o.LIZIZ
            r2 = 0
            if (r1 != r0) goto L40
            X.VKy r1 = X.EnumC79576VKy.UNSET
        L39:
            if (r7 != 0) goto L88
            X.VKy r0 = X.EnumC79576VKy.UNSET
            if (r1 != r0) goto L88
            goto L6
        L40:
            r10.LJIILIIL()
            X.W9o r0 = r10.LJLJI
            boolean r0 = r4.canTranscode(r0)
            if (r0 != 0) goto L4e
            X.VKy r1 = X.EnumC79576VKy.NO
            goto L39
        L4e:
            X.V85 r6 = r5.LJIIIZ
            boolean r0 = r6.LIZIZ
            if (r0 != 0) goto L65
            int r0 = X.V84.LIZIZ(r6, r10)
            if (r0 != 0) goto L6f
            int r1 = r6.LIZ
            r0 = -2
            if (r1 == r0) goto L63
            boolean r0 = r6.LIZIZ
            if (r0 == 0) goto L76
        L63:
            r10.LJLJJL = r2
        L65:
            X.V85 r1 = r5.LJIIIZ
            X.V7y r0 = r5.LJIIIIZZ
            boolean r0 = r4.canResize(r10, r1, r0)
            if (r0 == 0) goto L74
        L6f:
            X.VKy r1 = X.EnumC79576VKy.valueOf(r3)
            goto L39
        L74:
            r3 = 0
            goto L6f
        L76:
            X.PrX<java.lang.Integer> r1 = X.V84.LIZ
            r10.LJIILIIL()
            int r0 = r10.LJLJJL
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L65
            goto L6f
        L88:
            X.VKy r0 = X.EnumC79576VKy.YES
            if (r1 == r0) goto Lb8
            X.W7i r0 = r8.LJ
            X.W5O r0 = r0.LJ()
            X.V85 r0 = r0.LJIIIZ
            boolean r0 = r0.LIZIZ
            if (r0 != 0) goto Lb1
            r10.LJIILIIL()
            int r0 = r10.LJLJJI
            if (r0 == 0) goto Lb1
            r10.LJIILIIL()
            int r1 = r10.LJLJJI
            r0 = -1
            if (r1 == r0) goto Lb1
            X.W8X r0 = X.W8X.LIZ(r10)
            r10.close()
            r0.LJLJJI = r2
            r10 = r0
        Lb1:
            X.W7F<O> r0 = r8.LIZIZ
            r0.LIZIZ(r9, r10)
            goto L6
        Lb8:
            X.W8h r0 = r8.LJIIJ
            boolean r0 = r0.LJII(r10, r9)
            if (r0 != 0) goto Lc2
            goto L6
        Lc2:
            if (r7 != 0) goto Lcc
            X.W7i r0 = r8.LJ
            boolean r0 = r0.LIZJ()
            if (r0 == 0) goto L6
        Lcc:
            X.W8h r0 = r8.LJIIJ
            r0.LJFF()
            goto L6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C81788W8a.LJII(int, java.lang.Object):void");
    }

    public final void LJIIL(W8X w8x, int i) {
        if (AbstractC81756W6u.LJ(i) || (i & 10) != 0) {
            return;
        }
        w8x.LJIILIIL();
        if (w8x.LJLJI == C81828W9o.LIZIZ) {
            return;
        }
        W5O LJ = this.LJ.LJ();
        if (!LJ.LIZLLL()) {
            return;
        }
        W6O w6o = this.LJIIIIZZ;
        this.LJ.LIZIZ();
        C61834OOo LIZJ = w6o.LIZJ(LJ);
        QGT qgt = LJ.LIZ;
        if (qgt == QGT.SMALL) {
            this.LJI.LIZLLL(LIZJ, w8x);
            return;
        }
        if (qgt == QGT.CUSTOM) {
            C81808W8u c81808W8u = this.LJII.get(LJ.LJIJ);
            if (c81808W8u == null) {
                return;
            }
            c81808W8u.LIZLLL(LIZJ, w8x);
            return;
        }
        this.LJFF.LIZLLL(LIZJ, w8x);
    }

    public final C65618Pp8 LJIIJJI(W8X w8x, C79238V7y c79238V7y, V8V v8v, String str) {
        String str2;
        if (!this.LJ.LIZ().LJIIIZ(this.LJ.getId())) {
            return null;
        }
        StringBuilder LIZ = X1D.LIZ();
        w8x.LJIILIIL();
        LIZ.append(w8x.LJLJJLL);
        LIZ.append("x");
        w8x.LJIILIIL();
        LIZ.append(w8x.LJLJL);
        String LIZIZ = X1D.LIZIZ(LIZ);
        if (c79238V7y != null) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(c79238V7y.LIZ);
            LIZ2.append("x");
            LIZ2.append(c79238V7y.LIZIZ);
            str2 = X1D.LIZIZ(LIZ2);
        } else {
            str2 = "Unspecified";
        }
        HashMap hashMap = new HashMap();
        w8x.LJIILIIL();
        hashMap.put("Image format", String.valueOf(w8x.LJLJI));
        hashMap.put("Original size", LIZIZ);
        hashMap.put("Requested size", str2);
        hashMap.put("queueTime", String.valueOf(this.LJIIJ.LIZLLL()));
        hashMap.put("Transcoder id", str);
        hashMap.put("Transcoding result", String.valueOf(v8v));
        return C65618Pp8.copyOf((java.util.Map) hashMap);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C81788W8a(W8F w8f, W7F<W8X> w7f, InterfaceC81770W7i interfaceC81770W7i, boolean z, InterfaceC79240V8a interfaceC79240V8a, C81808W8u c81808W8u, C81808W8u c81808W8u2, HashMap<String, C81808W8u> hashMap, W6O w6o) {
        super(w7f);
        this.LJIIJJI = w8f;
        this.LJ = interfaceC81770W7i;
        this.LIZJ = z;
        this.LIZLLL = interfaceC79240V8a;
        this.LJFF = c81808W8u;
        this.LJI = c81808W8u2;
        this.LJII = hashMap;
        this.LJIIIIZZ = w6o;
        this.LJIIJ = new C81795W8h(w8f.LIZ, new C81790W8c(this, interfaceC81770W7i.getPriority()), 100);
        interfaceC81770W7i.LIZLLL(new C81811W8x(this, w7f));
    }
}
