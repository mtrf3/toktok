package X;

import android.graphics.Bitmap;

/* loaded from: classes15.dex */
public final class W9A implements WB5 {
    @Override // X.PML
    public final void LIZLLL(EnumC81745W6j enumC81745W6j) {
    }

    @Override // X.W81, X.VWQ
    public final void LIZ(Object obj) {
        ((Bitmap) obj).recycle();
    }

    @Override // X.W81
    public final Bitmap get(int i) {
        return Bitmap.createBitmap(1, (int) Math.ceil(i / 2.0d), Bitmap.Config.RGB_565);
    }
}
