package X;

import android.graphics.Bitmap;

/* loaded from: classes15.dex */
public interface WAP {
    void dispose();

    int getHeight();

    int getWidth();

    int getXOffset();

    int getYOffset();

    void renderFrame(int i, int i2, Bitmap bitmap);
}
