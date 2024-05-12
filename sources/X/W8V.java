package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;

/* loaded from: classes15.dex */
public class W8V extends W8W {
    public W8V(WB5 wb5, int i, C43051mX c43051mX) {
        super(wb5, i, c43051mX);
    }

    @Override // X.W8W
    public int LIZJ(int i, int i2, BitmapFactory.Options options) {
        ColorSpace colorSpace = options.outColorSpace;
        if (colorSpace != null && colorSpace.isWideGamut() && options.inPreferredConfig != Bitmap.Config.RGBA_F16) {
            return i * i2 * 8;
        }
        return i * i2 * W6I.LIZIZ(options.inPreferredConfig);
    }
}
