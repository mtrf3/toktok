package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import java.io.InputStream;

/* renamed from: X.W9l, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public interface InterfaceC81825W9l {
    Bitmap decodeStream(InputStream inputStream, Rect rect, BitmapFactory.Options options);

    Bitmap decodeThumb(InputStream inputStream, Rect rect, BitmapFactory.Options options);
}
