package X;

/* renamed from: X.W8d, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81791W8d extends AbstractC81827W9n {
    public final /* synthetic */ C81789W8b LIZIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C81791W8d(C81789W8b c81789W8b, W92 w92) {
        super(w92);
        this.LIZIZ = c81789W8b;
    }

    @Override // X.InterfaceC81855WAp
    public final void LIZ(W8X w8x, int i) {
        C81828W9o c81828W9o;
        V8V transcode;
        int i2 = i;
        C81789W8b c81789W8b = this.LIZIZ;
        InterfaceC79240V8a interfaceC79240V8a = c81789W8b.LIZLLL;
        if (w8x == null) {
            c81828W9o = C81828W9o.LIZIZ;
        } else {
            w8x.LJIILIIL();
            c81828W9o = w8x.LJLJI;
        }
        W98 LIZ = interfaceC79240V8a.LIZ(c81828W9o, this.LIZIZ.LIZJ);
        LIZ.getClass();
        c81789W8b.LJ.LIZ().LIZ(c81789W8b.LJ.getId(), "ResizeAndRotateProducer");
        W5O LJ = c81789W8b.LJ.LJ();
        C81373Vwf LIZJ = c81789W8b.LJII.LIZIZ.LIZJ();
        try {
            try {
                transcode = LIZ.transcode(w8x, LIZJ, LJ.LJIIIZ, LJ.LJIIIIZZ, null, 85);
            } finally {
                LIZJ.close();
            }
        } catch (Exception e) {
            c81789W8b.LJ.LIZ().LJI(c81789W8b.LJ.getId(), "ResizeAndRotateProducer", e, null);
            if (AbstractC81756W6u.LIZLLL(i2)) {
                c81789W8b.LIZIZ.onFailure(e);
            }
        }
        if (transcode.LIZ != 2) {
            C65618Pp8 LJIIJJI = c81789W8b.LJIIJJI(w8x, LJ.LJIIIIZZ, transcode, LIZ.getIdentifier());
            C81392Vwy LJIIL = C81392Vwy.LJIIL(LIZJ.LIZ());
            try {
                W8X w8x2 = new W8X(LJIIL);
                w8x2.LJLJI = C81796W8i.LIZ;
                try {
                    w8x2.LJIIL();
                    c81789W8b.LJ.LIZ().LIZIZ(c81789W8b.LJ.getId(), "ResizeAndRotateProducer", LJIIJJI);
                    if (transcode.LIZ != 1) {
                        i2 |= 16;
                    }
                    c81789W8b.LIZIZ.LIZIZ(i2, w8x2);
                    C81392Vwy.LJ(LJIIL);
                    return;
                } finally {
                    W8X.LIZIZ(w8x2);
                }
            } catch (Throwable th) {
                C81392Vwy.LJ(LJIIL);
                throw th;
            }
        }
        throw new RuntimeException("Error while transcoding the image");
    }
}
