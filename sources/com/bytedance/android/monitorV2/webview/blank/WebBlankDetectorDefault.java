package com.bytedance.android.monitorV2.webview.blank;

import X.C16880lQ;
import X.C76800UCe;
import X.C78282Unu;
import X.C78285Unx;
import X.C78287Unz;
import X.InterfaceC78286Uny;
import X.InterfaceC88472Yns;
import X.X1D;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Looper;
import android.view.View;
import java.util.Arrays;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class WebBlankDetectorDefault implements InterfaceC78286Uny {
    public final String TAG = "BlankDetectWebViewUtils";
    public final C78287Unz detector = new C78287Unz();

    private final boolean checkViewValid(View view, C78285Unx c78285Unx) {
        if (view != null) {
            return true;
        }
        c78285Unx.LIZJ = 1;
        c78285Unx.LIZLLL = "view is null.";
        c78285Unx.LIZ = 3;
        return false;
    }

    private final C78285Unx detectInternal(View view, InterfaceC88472Yns<? super C78285Unx, C76800UCe> interfaceC88472Yns) {
        C78285Unx c78285Unx = new C78285Unx();
        if (!checkViewValid(view, c78285Unx)) {
            return c78285Unx;
        }
        Context context = view.getContext();
        o.LJFF(context, "view.context");
        if (context.getResources() == null) {
            c78285Unx.LIZJ = 4;
            c78285Unx.LIZLLL = "context or context.getResources is null";
            c78285Unx.LIZ = 3;
            return c78285Unx;
        }
        if (!checkBoundingValid(view.getWidth(), view.getHeight(), c78285Unx)) {
            return c78285Unx;
        }
        if (Looper.myLooper() != C16880lQ.LLJJJJ()) {
            c78285Unx.LIZJ = 2;
            c78285Unx.LIZLLL = "current thread is not main thread.";
            c78285Unx.LIZ = 3;
            return c78285Unx;
        }
        long currentTimeMillis = System.currentTimeMillis();
        try {
            interfaceC88472Yns.invoke(c78285Unx);
            return c78285Unx;
        } catch (Throwable th) {
            c78285Unx.LIZJ = 4;
            c78285Unx.LIZLLL = th.getMessage();
            c78285Unx.LIZ = 3;
            c78285Unx.LIZIZ = System.currentTimeMillis() - currentTimeMillis;
            return c78285Unx;
        }
    }

    public final void checkBlank(Bitmap bitmap, C78285Unx c78285Unx) {
        int i;
        if (bitmap != null) {
            bitmap.getConfig();
            c78285Unx.getClass();
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            if (width > 0 && height > 0) {
                int pixel = bitmap.getPixel(0, 0);
                C78287Unz c78287Unz = this.detector;
                c78287Unz.LIZ = pixel;
                c78287Unz.getClass();
                int width2 = bitmap.getWidth();
                int height2 = bitmap.getHeight();
                if (width2 > 0 && height2 > 0) {
                    int i2 = c78287Unz.LIZ;
                    if (i2 == 0) {
                        i2 = bitmap.getPixel(0, 0);
                    }
                    int[] iArr = new int[width2];
                    Arrays.fill(iArr, i2);
                    int[] iArr2 = new int[width2];
                    int i3 = 0;
                    do {
                        bitmap.getPixels(iArr2, 0, width2, 0, i3, width2, 1);
                        if (Arrays.equals(iArr, iArr2)) {
                            i3++;
                        }
                    } while (i3 < height2);
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("PixBlankDetector detect white screen , color : ");
                    LIZ.append(Integer.toHexString(i2));
                    X1D.LIZIZ(LIZ);
                    i = 1;
                    c78285Unx.LIZ = i;
                    return;
                }
                i = 2;
                c78285Unx.LIZ = i;
                return;
            }
            return;
        }
        c78285Unx.LIZJ = 3;
        c78285Unx.LIZLLL = "bitmap is null.";
        c78285Unx.LIZ = 3;
    }

    private final boolean checkBoundingValid(int i, int i2, C78285Unx c78285Unx) {
        if (i <= 0 || i2 <= 0) {
            c78285Unx.LIZJ = 4;
            c78285Unx.LIZLLL = "width and height must be > 0";
            c78285Unx.LIZ = 3;
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC78286Uny
    public C78285Unx detect(View view, float f, Bitmap.Config config) {
        o.LJIIJ(view, "view");
        o.LJIIJ(config, "config");
        return detectInternal(view, new C78282Unu(this, view, f, config));
    }
}
