package X;

import java.util.HashMap;

/* renamed from: X.W8b, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C81789W8b extends W90<W8X, W8X> {
    public final boolean LIZJ;
    public final InterfaceC79240V8a LIZLLL;
    public final InterfaceC81770W7i LJ;
    public boolean LJFF;
    public final C81795W8h LJI;
    public final /* synthetic */ C81764W7c LJII;

    /* JADX WARN: Code restructure failed: missing block: B:64:0x0086, code lost:
    
        if (r1.contains(java.lang.Integer.valueOf(r9.LJLJJL)) != false) goto L30;
     */
    @Override // X.AbstractC81756W6u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJII(int r8, java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C81789W8b.LJII(int, java.lang.Object):void");
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
        hashMap.put("queueTime", String.valueOf(this.LJI.LIZLLL()));
        hashMap.put("Transcoder id", str);
        hashMap.put("Transcoding result", String.valueOf(v8v));
        return C65618Pp8.copyOf((java.util.Map) hashMap);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C81789W8b(C81764W7c c81764W7c, W7F<W8X> w7f, InterfaceC81770W7i interfaceC81770W7i, boolean z, InterfaceC79240V8a interfaceC79240V8a) {
        super(w7f);
        this.LJII = c81764W7c;
        this.LJ = interfaceC81770W7i;
        this.LIZJ = z;
        this.LIZLLL = interfaceC79240V8a;
        this.LJI = new C81795W8h(c81764W7c.LIZ, new C81791W8d(this, interfaceC81770W7i.getPriority()), 100);
        interfaceC81770W7i.LIZLLL(new C81813W8z(this, w7f));
    }
}
