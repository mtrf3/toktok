package X;

import com.lynx.canvas.loader.CanvasResourceResolver;
import java.io.InputStream;

/* loaded from: classes15.dex */
public final class VUB implements InterfaceC39983Fmd {
    public final /* synthetic */ CanvasResourceResolver LIZ;
    public final /* synthetic */ boolean LIZIZ;
    public final /* synthetic */ VU8 LIZJ;

    @Override // X.InterfaceC39983Fmd
    public final void LIZ(C39982Fmc c39982Fmc) {
        InputStream inputStream = c39982Fmc.LIZJ;
        try {
            VU8 vu8 = this.LIZJ;
            CanvasResourceResolver canvasResourceResolver = this.LIZ;
            boolean z = this.LIZIZ;
            vu8.getClass();
            VU8.LIZJ(inputStream, canvasResourceResolver, z, 0);
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("load from remote exception: ");
            LIZ.append(e.toString());
            O5Y.LJIILIIL("AssetsLoader", X1D.LIZIZ(LIZ));
            c39982Fmc.LIZIZ = e.toString();
        } catch (OutOfMemoryError e2) {
            O5Y.LJIILIIL("AssetsLoader", "load from remote out of memory");
            c39982Fmc.LIZIZ = e2.toString();
        }
    }

    @Override // X.InterfaceC39983Fmd
    public final void LIZIZ(C39982Fmc c39982Fmc) {
        String str = c39982Fmc.LIZIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("requestResource error ");
        LIZ.append(str);
        O5Y.LJIILIIL("AssetsLoader", X1D.LIZIZ(LIZ));
        VU8 vu8 = this.LIZJ;
        CanvasResourceResolver canvasResourceResolver = this.LIZ;
        boolean z = this.LIZIZ;
        vu8.getClass();
        VU8.LJ(canvasResourceResolver, str, z);
    }

    public VUB(VU8 vu8, CanvasResourceResolver canvasResourceResolver, boolean z) {
        this.LIZJ = vu8;
        this.LIZ = canvasResourceResolver;
        this.LIZIZ = z;
    }
}
