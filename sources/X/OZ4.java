package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.view.View;
import com.bytedance.common.utility.BitmapUtils;
import com.ss.android.ugc.aweme.share.qrcode.UserQRCodeActivity;
import com.zhiliaoapp.musically.R;
import java.io.FileNotFoundException;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OZ4 {
    public static void LIZ(Context context, View view, C62180Oam c62180Oam, boolean z, boolean z2, OZ5 oz5) {
        o.LJIIIZ(context, "context");
        Activity LJJLIIIJ = C78609UtB.LJJLIIIJ(context);
        if (LJJLIIIJ != null) {
            if (c62180Oam != null && c62180Oam.LJLILLLLZI) {
                if (view != null) {
                    StringBuilder LIZ = X1D.LIZ();
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("");
                    LIZ2.append(System.currentTimeMillis());
                    LIZ.append(C38352F3k.LIZJ(X1D.LIZIZ(LIZ2)));
                    LIZ.append(".png");
                    C62086OYg LIZJ = OZ1.LIZIZ.LIZJ(view, X1D.LIZIZ(LIZ), z2);
                    if (LIZJ != null) {
                        if (z) {
                            AnonymousClass114.LIZ(LJJLIIIJ, R.string.q9n);
                        }
                        view.announceForAccessibility(EF7.LIZIZ().getString(R.string.q9n));
                        boolean z3 = LIZJ.LIZJ;
                        if (z3) {
                            String str = LIZJ.LIZIZ;
                            if (str != null && oz5 != null) {
                                oz5.LIZ(null, str, z3);
                                return;
                            }
                            return;
                        }
                        android.net.Uri uri = LIZJ.LIZ;
                        if (uri == null || oz5 == null) {
                            return;
                        }
                        oz5.LIZ(uri, null, z3);
                        return;
                    }
                    return;
                }
                return;
            }
            C26045AKb c26045AKb = new C26045AKb(LJJLIIIJ);
            c26045AKb.LJIIIZ(LJJLIIIJ.getString(R.string.exs));
            c26045AKb.LJIIJ();
        }
    }

    public static void LIZIZ(UserQRCodeActivity activity, C62180Oam c62180Oam, View view, C79866VWc backgroundLayout, OZD shareOutView, boolean z, boolean z2, OZ7 oz7) {
        Bitmap bitmap;
        Bitmap bitmap2;
        float f;
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(backgroundLayout, "backgroundLayout");
        o.LJIIIZ(shareOutView, "shareOutView");
        if (c62180Oam != null && c62180Oam.LJLILLLLZI) {
            backgroundLayout.setDrawingCacheEnabled(true);
            backgroundLayout.buildDrawingCache();
            Bitmap drawingCache = backgroundLayout.getDrawingCache();
            if (drawingCache != null) {
                bitmap = Bitmap.createBitmap(drawingCache);
            } else {
                bitmap = null;
            }
            backgroundLayout.setDrawingCacheEnabled(false);
            shareOutView.setDrawingCacheEnabled(true);
            shareOutView.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
            shareOutView.layout(0, 0, shareOutView.getMeasuredWidth(), shareOutView.getMeasuredHeight());
            Bitmap drawingCache2 = shareOutView.getDrawingCache();
            if (drawingCache2 != null) {
                bitmap2 = Bitmap.createBitmap(drawingCache2);
            } else {
                bitmap2 = null;
            }
            shareOutView.setDrawingCacheEnabled(false);
            if (bitmap == null || bitmap2 == null) {
                return;
            }
            float LIZJ = KL2.LIZJ(activity, 250.0f);
            float LIZJ2 = KL2.LIZJ(activity, 445.0f);
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            if (width / height < LIZJ / LIZJ2) {
                f = LIZJ / width;
            } else {
                f = LIZJ2 / height;
            }
            Matrix matrix = new Matrix();
            matrix.postScale(f, f);
            Bitmap bitmap3 = Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, false);
            if (!bitmap.isRecycled()) {
                bitmap.recycle();
            }
            o.LJIIIIZZ(bitmap3, "bitmap");
            Bitmap mergeBitmap = Bitmap.createBitmap((int) LIZJ, (int) LIZJ2, bitmap3.getConfig());
            Canvas canvas = new Canvas(mergeBitmap);
            canvas.drawBitmap(bitmap3, new Matrix(), null);
            Matrix matrix2 = new Matrix();
            matrix2.postTranslate((LIZJ - bitmap2.getWidth()) / 2, KL2.LIZJ(activity, 76.0f));
            canvas.drawBitmap(bitmap2, matrix2, null);
            StringBuilder LIZ = X1D.LIZ();
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("");
            LIZ2.append(System.currentTimeMillis());
            LIZ.append(C38352F3k.LIZJ(X1D.LIZIZ(LIZ2)));
            LIZ.append(".png");
            String LIZIZ = X1D.LIZIZ(LIZ);
            if (z2) {
                String LJIILL = C66580QBc.LJIILL(activity);
                if (!BitmapUtils.saveBitmapToSD(mergeBitmap, LJIILL, LIZIZ)) {
                    return;
                }
                String LIZIZ2 = C00F.LIZIZ(LJIILL, '/', LIZIZ);
                if (z) {
                    C26045AKb c26045AKb = new C26045AKb(activity);
                    c26045AKb.LJIIIIZZ(R.string.q9n);
                    c26045AKb.LJIIJ();
                }
                backgroundLayout.announceForAccessibility(EF7.LIZIZ().getString(R.string.q9n));
                OZ1.LIZIZ.LIZ(activity, LIZIZ2);
                if (oz7 == null) {
                    return;
                }
                oz7.LIZ(null, LIZIZ2, z2);
                return;
            }
            o.LJIIIIZZ(mergeBitmap, "mergeBitmap");
            android.net.Uri LIZJ3 = C268613q.LIZJ(activity, LIZIZ);
            try {
                mergeBitmap.compress(Bitmap.CompressFormat.PNG, 100, activity.getContentResolver().openOutputStream(LIZJ3));
                if (LIZJ3 == null) {
                    return;
                }
                String LIZIZ3 = C00S.LIZIZ(activity, LIZJ3);
                if (LIZIZ3 != null) {
                    C268613q.LJIIL(activity, LIZIZ3);
                }
                if (z) {
                    C26045AKb c26045AKb2 = new C26045AKb(activity);
                    c26045AKb2.LJIIIIZZ(R.string.q9n);
                    c26045AKb2.LJIIJ();
                }
                backgroundLayout.announceForAccessibility(EF7.LIZIZ().getString(R.string.q9n));
                if (oz7 == null) {
                    return;
                }
                oz7.LIZ(LIZJ3, null, z2);
                return;
            } catch (FileNotFoundException e) {
                C16880lQ.LLLLIIL(e);
                return;
            }
        }
        Context LIZIZ4 = EF7.LIZIZ();
        C26045AKb c26045AKb3 = new C26045AKb(activity);
        c26045AKb3.LJIIIZ(LIZIZ4.getString(R.string.exs));
        c26045AKb3.LJIIJ();
        if (view == null) {
            return;
        }
        view.announceForAccessibility(LIZIZ4.getString(R.string.exs));
    }
}
