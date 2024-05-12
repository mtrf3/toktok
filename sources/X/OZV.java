package X;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.widget.ImageView;

/* loaded from: classes11.dex */
public final class OZV implements InterfaceC82810Wek<Bitmap> {
    public final /* synthetic */ OZS LIZ;
    public final /* synthetic */ ImageView LIZIZ;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC82810Wek
    public final void LIZ(Bitmap bitmap) {
        BitmapDrawable bitmapDrawable;
        int i;
        Bitmap bitmap2 = bitmap;
        if (bitmap2 != 0) {
            OZS ozs = this.LIZ;
            ImageView imageView = this.LIZIZ;
            BitmapDrawable bitmapDrawable2 = new BitmapDrawable(ozs.getContext().getResources(), bitmap2);
            boolean LIZ = C90193gN.LIZ();
            if (LIZ) {
                C07840Sm.LIZJ(bitmapDrawable2, 1);
                C07810Sj.LJ(bitmapDrawable2, true);
            }
            if ((bitmap2 instanceof BitmapDrawable) && (bitmapDrawable = (BitmapDrawable) bitmap2) != null) {
                if (LIZ) {
                    i = 8388611;
                } else {
                    i = 8388613;
                }
                bitmapDrawable.setGravity(i);
            }
            imageView.setImageDrawable(bitmapDrawable2);
        }
    }

    public OZV(OZS ozs, ImageView imageView) {
        this.LIZ = ozs;
        this.LIZIZ = imageView;
    }
}
