package X;

import java.io.IOException;
import java.util.concurrent.CancellationException;

/* loaded from: classes15.dex */
public final class W7S implements C10I<W8X, Void> {
    public final /* synthetic */ InterfaceC81754W6s LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ W7F LIZJ;
    public final /* synthetic */ InterfaceC81770W7i LIZLLL;
    public final /* synthetic */ W7Q LJ;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C10I
    public final Void then(C10K<W8X> c10k) {
        boolean z;
        W8X w8x;
        C81392Vwy c81392Vwy;
        if (c10k.LJIIL() || (c10k.LJIILJJIL() && (c10k.LJIIJ() instanceof CancellationException))) {
            z = true;
        } else {
            z = false;
        }
        C81392Vwy c81392Vwy2 = null;
        if (z) {
            this.LIZ.LIZJ(this.LIZIZ, "DiskCacheProducer", null);
            this.LIZJ.LIZJ();
        } else if (c10k.LJIILJJIL()) {
            this.LIZ.LJI(this.LIZIZ, "DiskCacheProducer", c10k.LJIIJ(), null);
            this.LJ.LJ.LIZIZ(this.LIZJ, this.LIZLLL);
        } else {
            W8X LJIIJJI = c10k.LJIIJJI();
            if (LJIIJJI != null) {
                byte[] LJIIL = ((C81753W6r) this.LIZLLL.LIZ()).LJIIL(LJIIJJI.LJFF());
                if (LJIIL != 0 && LJIIL.length > 0) {
                    C81373Vwf LJ = this.LJ.LJFF.LJ(LJIIL.length);
                    try {
                        try {
                            LJ.write(LJIIL, 0, LJIIL.length);
                            c81392Vwy = C81392Vwy.LJIIL(LJ.LIZ());
                            try {
                                w8x = new W8X(c81392Vwy);
                                w8x.LIZJ(LJIIJJI);
                                w8x.LJIIL();
                                C81392Vwy.LJ(c81392Vwy);
                            } catch (IOException e) {
                                e = e;
                                W58.LJII("DiskCacheProducer", "Construct decrypted data error", e);
                                C81392Vwy.LJ(c81392Vwy);
                                w8x = LJIIJJI;
                                w8x.LJLZ = false;
                                w8x.LJLLLLLL = true;
                                w8x.LJLLLL = false;
                                InterfaceC81754W6s interfaceC81754W6s = this.LIZ;
                                String str = this.LIZIZ;
                                interfaceC81754W6s.LIZIZ(str, "DiskCacheProducer", W7Q.LIZJ(interfaceC81754W6s, str, true, w8x.LJI()));
                                this.LIZ.LIZLLL(this.LIZIZ, "DiskCacheProducer", true);
                                this.LIZJ.LIZ(1.0f);
                                this.LIZJ.LIZIZ(1, w8x);
                                LJIIJJI.close();
                                w8x.close();
                                return null;
                            }
                        } catch (Throwable th) {
                            th = th;
                            c81392Vwy2 = LJIIL;
                            C81392Vwy.LJ(c81392Vwy2);
                            throw th;
                        }
                    } catch (IOException e2) {
                        e = e2;
                        c81392Vwy = null;
                    } catch (Throwable th2) {
                        th = th2;
                        C81392Vwy.LJ(c81392Vwy2);
                        throw th;
                    }
                    w8x.LJLZ = false;
                    w8x.LJLLLLLL = true;
                    w8x.LJLLLL = false;
                    InterfaceC81754W6s interfaceC81754W6s2 = this.LIZ;
                    String str2 = this.LIZIZ;
                    interfaceC81754W6s2.LIZIZ(str2, "DiskCacheProducer", W7Q.LIZJ(interfaceC81754W6s2, str2, true, w8x.LJI()));
                    this.LIZ.LIZLLL(this.LIZIZ, "DiskCacheProducer", true);
                    this.LIZJ.LIZ(1.0f);
                    this.LIZJ.LIZIZ(1, w8x);
                    LJIIJJI.close();
                    w8x.close();
                }
                w8x = LJIIJJI;
                w8x.LJLZ = false;
                w8x.LJLLLLLL = true;
                w8x.LJLLLL = false;
                InterfaceC81754W6s interfaceC81754W6s22 = this.LIZ;
                String str22 = this.LIZIZ;
                interfaceC81754W6s22.LIZIZ(str22, "DiskCacheProducer", W7Q.LIZJ(interfaceC81754W6s22, str22, true, w8x.LJI()));
                this.LIZ.LIZLLL(this.LIZIZ, "DiskCacheProducer", true);
                this.LIZJ.LIZ(1.0f);
                this.LIZJ.LIZIZ(1, w8x);
                LJIIJJI.close();
                w8x.close();
            } else {
                InterfaceC81754W6s interfaceC81754W6s3 = this.LIZ;
                String str3 = this.LIZIZ;
                interfaceC81754W6s3.LIZIZ(str3, "DiskCacheProducer", W7Q.LIZJ(interfaceC81754W6s3, str3, false, 0));
                this.LJ.LJ.LIZIZ(this.LIZJ, this.LIZLLL);
            }
        }
        return null;
    }

    public W7S(W7Q w7q, InterfaceC81754W6s interfaceC81754W6s, String str, W7F w7f, InterfaceC81770W7i interfaceC81770W7i) {
        this.LJ = w7q;
        this.LIZ = interfaceC81754W6s;
        this.LIZIZ = str;
        this.LIZJ = w7f;
        this.LIZLLL = interfaceC81770W7i;
    }
}
