package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import java.io.InputStream;

/* loaded from: classes15.dex */
public final class W8O extends W8V {
    public final PO3 LJ;

    public W8O(WB5 wb5, int i, C43051mX c43051mX) {
        super(wb5, i, c43051mX);
        PO3 po3 = null;
        if (!R22.LIZ) {
            try {
                po3 = (PO3) Class.forName("com.facebook.webpsupport.WebpBitmapFactoryImpl").newInstance();
            } catch (Throwable unused) {
            }
            R22.LIZ = true;
        }
        this.LJ = po3;
    }

    @Override // X.W8V, X.W8W
    public final int LIZJ(int i, int i2, BitmapFactory.Options options) {
        return super.LIZJ(i, i2, options);
    }

    @Override // X.W8W
    public final Bitmap LIZ(InputStream inputStream, BitmapFactory.Options options, int i, int i2, Bitmap bitmap) {
        boolean z;
        if (Build.VERSION.SDK_INT == 28 && this.LJ != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            bitmap.reconfigure(i, i2, options.inPreferredConfig);
            Bitmap decodeStream = this.LJ.decodeStream(inputStream, null, options);
            if (decodeStream != null) {
                return decodeStream;
            }
        }
        return BitmapFactory.decodeStream(inputStream, null, options);
    }
}
