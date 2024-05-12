package X;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.util.ArrayList;

/* renamed from: X.6au, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C163246au {
    public static UrlModel LIZ(android.net.Uri uri) {
        if (uri == null) {
            return null;
        }
        UrlModel urlModel = new UrlModel();
        ArrayList arrayList = new ArrayList();
        arrayList.add(uri.toString());
        urlModel.setUrlList(arrayList);
        return urlModel;
    }

    public static boolean LIZIZ(Bitmap bitmap) {
        if (bitmap == null || bitmap.isRecycled() || bitmap.getWidth() <= 0 || bitmap.getHeight() <= 0) {
            return false;
        }
        return true;
    }

    public static Bitmap LIZJ(Bitmap bitmap, int i, int i2) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Matrix matrix = new Matrix();
        matrix.postScale(i / width, i2 / height);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
        bitmap.recycle();
        return createBitmap;
    }
}
