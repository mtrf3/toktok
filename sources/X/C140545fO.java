package X;

import Y.ACListenerS37S0200000_2;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.5fO, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C140545fO {
    public static final <T extends View> void LIZ(T t, long j, InterfaceC88472Yns<? super T, C76800UCe> interfaceC88472Yns) {
        o.LJIIIZ(t, "<this>");
        t.setTag(1123461123, Long.valueOf(j));
        C16880lQ.LJIIJ(new ACListenerS37S0200000_2(t, interfaceC88472Yns, 18), t);
    }

    public static final Bitmap LIZIZ(View view, Integer num, Integer num2) {
        int width;
        int height;
        if (num != null) {
            width = num.intValue();
        } else {
            width = view.getWidth();
        }
        if (num2 != null) {
            height = num2.intValue();
        } else {
            height = view.getHeight();
        }
        if (width <= 0 || height <= 0) {
            width = view.getWidth();
            height = view.getHeight();
        }
        try {
            Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            C37203Eit.LIZJ.getClass();
            C39214FaE.LIZ(view, canvas);
            try {
                int width2 = createBitmap.getWidth();
                int height2 = createBitmap.getHeight();
                if (width2 != width || height2 != height) {
                    Matrix matrix = new Matrix();
                    matrix.postScale(width / width2, height / height2);
                    return Bitmap.createBitmap(createBitmap, 0, 0, width2, height2, matrix, true);
                }
                return createBitmap;
            } catch (Exception e) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("generateBitmap error: ");
                LIZ.append(e.getMessage());
                C131935Ft.LIZLLL("ViewUtils", X1D.LIZIZ(LIZ));
                return null;
            }
        } catch (Exception e2) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("generateBitmap error: ");
            LIZ2.append(e2.getMessage());
            C131935Ft.LIZLLL("ViewUtils", X1D.LIZIZ(LIZ2));
            return null;
        }
    }
}
