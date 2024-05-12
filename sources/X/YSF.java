package X;

import android.graphics.Bitmap;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.View;

/* loaded from: classes16.dex */
public interface YSF {
    Bitmap getBitmap();

    Bitmap getBitmap(int i, int i2);

    Bitmap getBitmap(Bitmap bitmap);

    int getHeight();

    Surface getSurface();

    SurfaceHolder getSurfaceHolder();

    View getView();

    int getWidth();

    void setPlayEntity(C79985VaH c79985VaH);

    void setSurfaceCallback(YDA yda);
}
