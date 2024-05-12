package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;

/* loaded from: classes16.dex */
public final class YD8 extends SurfaceView implements YSF {
    public YDA LJLIL;

    @Override // X.YSF
    public Bitmap getBitmap() {
        return null;
    }

    @Override // X.YSF
    public final Bitmap getBitmap(int i, int i2) {
        return null;
    }

    @Override // X.YSF
    public final Bitmap getBitmap(Bitmap bitmap) {
        return null;
    }

    @Override // X.YSF
    public View getView() {
        return this;
    }

    @Override // X.YSF
    public void setPlayEntity(C79985VaH c79985VaH) {
    }

    @Override // X.YSF
    public Surface getSurface() {
        return getHolder().getSurface();
    }

    @Override // X.YSF
    public SurfaceHolder getSurfaceHolder() {
        return getHolder();
    }

    public YD8(Context context) {
        super(context);
        getHolder().addCallback(new YD9(this));
    }

    @Override // android.view.SurfaceView, android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
    }

    @Override // android.view.View
    public void setKeepScreenOn(boolean z) {
        super.setKeepScreenOn(z);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("surface view keep_screen_on:");
        LIZ.append(Boolean.valueOf(z).toString());
        X1D.LIZIZ(LIZ);
    }

    @Override // X.YSF
    public void setSurfaceCallback(YDA yda) {
        this.LJLIL = yda;
    }
}
