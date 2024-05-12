package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import java.io.IOException;

/* renamed from: X.Gnl, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42601Gnl {
    public static android.net.Uri LIZ(Context context, View view, String str) {
        Bitmap bitmap;
        view.setDrawingCacheEnabled(true);
        view.buildDrawingCache();
        if (view.getDrawingCache() != null) {
            bitmap = Bitmap.createBitmap(view.getDrawingCache());
        } else {
            bitmap = null;
        }
        if (bitmap == null) {
            return null;
        }
        view.setDrawingCacheEnabled(false);
        if (context == null) {
            context = EF7.LIZIZ();
        }
        try {
            android.net.Uri LIZLLL = C268613q.LIZLLL(context, str, "image/png");
            if (LIZLLL != null) {
                bitmap.compress(Bitmap.CompressFormat.PNG, 100, context.getContentResolver().openOutputStream(LIZLLL));
                return LIZLLL;
            }
            throw new IOException();
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            return null;
        }
    }
}
