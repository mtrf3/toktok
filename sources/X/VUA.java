package X;

import com.lynx.canvas.loader.CanvasResourceResolver;
import java.io.InputStream;

/* loaded from: classes15.dex */
public final class VUA extends O3R {
    public final /* synthetic */ CanvasResourceResolver LIZ;
    public final /* synthetic */ boolean LIZIZ;
    public final /* synthetic */ String LIZJ;
    public final /* synthetic */ VU8 LIZLLL;

    @Override // X.O3R
    public final void LIZ(InterfaceC79289V9x interfaceC79289V9x) {
        InputStream LIZ = interfaceC79289V9x.LIZ();
        if (LIZ != null) {
            try {
                VU8 vu8 = this.LIZLLL;
                CanvasResourceResolver canvasResourceResolver = this.LIZ;
                boolean z = this.LIZIZ;
                int available = LIZ.available();
                vu8.getClass();
                VU8.LIZJ(LIZ, canvasResourceResolver, z, available);
                return;
            } catch (Exception e) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("load from remote exception: ");
                LIZ2.append(e.toString());
                O5Y.LJIILIIL("AssetsLoader", X1D.LIZIZ(LIZ2));
                return;
            } catch (OutOfMemoryError unused) {
                O5Y.LJIILIIL("AssetsLoader", "load from remote out of memory");
                return;
            }
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("request by LynxResourceService failed. ");
        LIZ3.append(interfaceC79289V9x.LIZJ());
        O5Y.LJIILIIL("AssetsLoader", X1D.LIZIZ(LIZ3));
        VU8 vu82 = this.LIZLLL;
        String str = this.LIZJ;
        CanvasResourceResolver canvasResourceResolver2 = this.LIZ;
        boolean z2 = this.LIZIZ;
        vu82.getClass();
        C39984Fme c39984Fme = new C39984Fme(str);
        if (C39981Fmb.LIZIZ == null) {
            synchronized (C39981Fmb.class) {
                if (C39981Fmb.LIZIZ == null) {
                    C39981Fmb.LIZIZ = new C39981Fmb();
                }
            }
        }
        C39981Fmb.LIZIZ.LIZ(c39984Fme, new VUB(vu82, canvasResourceResolver2, z2));
    }

    public VUA(VU8 vu8, CanvasResourceResolver canvasResourceResolver, boolean z, String str) {
        this.LIZLLL = vu8;
        this.LIZ = canvasResourceResolver;
        this.LIZIZ = z;
        this.LIZJ = str;
    }
}
