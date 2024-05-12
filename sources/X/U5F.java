package X;

import Y.ARunnableS41S0100000_5;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class U5F extends AbstractC32209CkX {
    public final /* synthetic */ U5C LIZ;
    public final /* synthetic */ W4W<C81392Vwy<W5A>> LIZIZ;

    @Override // X.AbstractC32664Crs
    public final void LJ(W4W<C81392Vwy<W5A>> w4w) {
        C0NB.LIZIZ("WindowMaskDrawable resize", "resize image fail");
        if (w4w != null) {
            w4w.close();
        }
    }

    @Override // X.AbstractC32209CkX
    public final void LJI(Bitmap bitmap) {
        if (bitmap != null) {
            Bitmap LIZ = this.LIZ.LIZ(bitmap);
            U5C u5c = this.LIZ;
            Resources LJIIJ = C15380j0.LJIIJ();
            o.LJIIIIZZ(LJIIJ, "getResources()");
            u5c.LJIIJ = new BitmapDrawable(LJIIJ, LIZ);
            DataChannel dataChannel = this.LIZ.LIZ;
            if (dataChannel != null) {
                ((C32537Cpp) dataChannel.gv0(C75081TdN.class)).LIZ = null;
            }
            C15610jN.LIZIZ(new ARunnableS41S0100000_5(new AqS163S0100000_13(this.LIZ, 88), 256));
        }
        C0NB.LIZIZ("WindowMaskDrawable resize", "resize image success");
        W4W<C81392Vwy<W5A>> w4w = this.LIZIZ;
        if (w4w != null) {
            w4w.close();
        }
    }

    public U5F(U5C u5c, W4W<C81392Vwy<W5A>> w4w) {
        this.LIZ = u5c;
        this.LIZIZ = w4w;
    }
}
