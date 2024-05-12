package X;

import android.graphics.Bitmap;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class W41 implements InterfaceC72705Sg9 {
    public final /* synthetic */ WOB LJLIL;

    @Override // X.InterfaceC72705Sg9
    public final void onFailure(Exception exc) {
    }

    public W41(WOB wob) {
        this.LJLIL = wob;
    }

    @Override // X.InterfaceC72705Sg9
    public final void LIZ(W4W<C81392Vwy<W5A>> dataSource) {
        Bitmap bitmap;
        o.LJIIIZ(dataSource, "dataSource");
        if (!dataSource.LIZIZ()) {
            return;
        }
        C81392Vwy<W5A> result = dataSource.getResult();
        if (result != null && (result.LJI() instanceof W5B)) {
            W5A LJI = result.LJI();
            o.LJII(LJI, "null cannot be cast to non-null type com.facebook.imagepipeline.image.CloseableBitmap");
            bitmap = ((W5B) LJI).getUnderlyingBitmap();
        } else {
            bitmap = null;
        }
        try {
            WGP wgp = this.LJLIL.LJLILLLLZI;
            if (wgp != null) {
                wgp.setWavForm(bitmap);
            } else {
                o.LJIJI("volumeTapsView");
                throw null;
            }
        } finally {
            C81392Vwy.LJ(result);
        }
    }
}
