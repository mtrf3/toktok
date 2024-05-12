package X;

/* renamed from: X.W8c, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81790W8c extends AbstractC81827W9n {
    public final /* synthetic */ C81788W8a LIZIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C81790W8c(C81788W8a c81788W8a, W92 w92) {
        super(w92);
        this.LIZIZ = c81788W8a;
    }

    @Override // X.InterfaceC81855WAp
    public final void LIZ(W8X w8x, int i) {
        V8V transcode;
        int i2 = i;
        C81788W8a c81788W8a = this.LIZIZ;
        InterfaceC79240V8a interfaceC79240V8a = c81788W8a.LIZLLL;
        w8x.LJIILIIL();
        W98 LIZ = interfaceC79240V8a.LIZ(w8x.LJLJI, this.LIZIZ.LIZJ);
        LIZ.getClass();
        c81788W8a.LJ.LIZ().LIZ(c81788W8a.LJ.getId(), "ResizedImageDiskCacheWriteProducer");
        W5O LJ = c81788W8a.LJ.LJ();
        C81373Vwf LIZJ = c81788W8a.LJIIJJI.LIZIZ.LIZJ();
        try {
            try {
                transcode = LIZ.transcode(w8x, LIZJ, LJ.LJIIIZ, LJ.LJIIIIZZ, null, 85);
            } catch (Exception e) {
                c81788W8a.LJ.LIZ().LJI(c81788W8a.LJ.getId(), "ResizedImageDiskCacheWriteProducer", e, null);
                if (AbstractC81756W6u.LIZLLL(i2)) {
                    c81788W8a.LIZIZ.onFailure(e);
                }
            }
            if (transcode.LIZ != 2) {
                C65618Pp8 LJIIJJI = c81788W8a.LJIIJJI(w8x, LJ.LJIIIIZZ, transcode, LIZ.getIdentifier());
                C81392Vwy LJIIL = C81392Vwy.LJIIL(LIZJ.LIZ());
                try {
                    W8X w8x2 = new W8X(LJIIL);
                    w8x2.LJLJI = C81796W8i.LIZ;
                    try {
                        w8x2.LJIIL();
                        c81788W8a.LJIIL(w8x2, i2);
                        c81788W8a.LJ.LIZ().LIZIZ(c81788W8a.LJ.getId(), "ResizedImageDiskCacheWriteProducer", LJIIJJI);
                        if (transcode.LIZ != 1) {
                            i2 |= 16;
                        }
                        c81788W8a.LIZIZ.LIZIZ(i2, w8x2);
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
        } finally {
            LIZJ.close();
        }
    }
}
