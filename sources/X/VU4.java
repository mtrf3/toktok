package X;

import Y.ARunnableS50S0100000_14;
import android.graphics.Bitmap;
import com.lynx.component.svg.UISvg;
import com.lynx.tasm.base.LLog;
import java.lang.ref.WeakReference;

/* loaded from: classes15.dex */
public final class VU4 extends AbstractC32209CkX {
    public final /* synthetic */ W4W LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ InterfaceC79484VHk LIZJ;
    public final /* synthetic */ C79483VHj LIZLLL;

    @Override // X.AbstractC32664Crs
    public final void LJ(W4W<C81392Vwy<W5A>> w4w) {
        this.LIZJ.getClass();
        if (w4w != null) {
            w4w.close();
        }
    }

    @Override // X.AbstractC32209CkX
    public final void LJI(Bitmap bitmap) {
        UISvg uISvg;
        if (this.LIZ.LIZIZ() && bitmap != null) {
            LLog.LIZLLL(1, "UISVG Bitmap", "has come");
            this.LIZLLL.LIZJ.put(this.LIZIZ, Bitmap.createBitmap(bitmap));
            this.LIZ.close();
            WeakReference<UISvg> weakReference = this.LIZLLL.LIZ;
            if (weakReference != null && (uISvg = weakReference.get()) != null) {
                C79411VEp.LIZJ(new ARunnableS50S0100000_14(uISvg, 218));
            }
        }
    }

    public VU4(C79483VHj c79483VHj, W4W w4w, String str, YZP yzp) {
        this.LIZLLL = c79483VHj;
        this.LIZ = w4w;
        this.LIZIZ = str;
        this.LIZJ = yzp;
    }
}
