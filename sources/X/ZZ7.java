package X;

import android.graphics.Bitmap;
import com.google.android.gms.common.images.WebImage;

/* loaded from: classes29.dex */
public final class ZZ7 {
    public final android.net.Uri LIZ;
    public Bitmap LIZIZ;

    public ZZ7(WebImage webImage) {
        android.net.Uri uri;
        if (webImage == null) {
            uri = null;
        } else {
            uri = webImage.zab;
        }
        this.LIZ = uri;
    }
}
