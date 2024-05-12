package X;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;

/* renamed from: X.It1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48023It1 extends TextureView {
    public TextureView.SurfaceTextureListener LJLIL;
    public final boolean LJLILLLLZI;
    public boolean LJLJI;
    public boolean LJLJJI;
    public Surface LJLJJL;
    public SurfaceTexture LJLJJLL;
    public int LJLJL;
    public int LJLJLJ;

    public final void LIZ() {
        this.LJLJI = false;
        this.LJLJJI = false;
        this.LJLJJL = null;
        this.LJLJJLL = null;
    }

    public Surface getSurface() {
        return this.LJLJJL;
    }

    public C48023It1(Context context) {
        super(context, null);
        this.LJLILLLLZI = true;
        this.LJLJL = -1;
        this.LJLJLJ = -1;
        context.getResources().getDisplayMetrics();
        super.setSurfaceTextureListener(new TextureViewSurfaceTextureListenerC48021Isz(this));
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
    }

    @Override // android.view.TextureView, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (Build.VERSION.SDK_INT < 24 && drawable != null) {
            setBackgroundDrawable(drawable);
        }
    }

    @Override // android.view.TextureView
    public void setSurfaceTextureListener(TextureView.SurfaceTextureListener surfaceTextureListener) {
        this.LJLIL = surfaceTextureListener;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.LJLJL == -1 || this.LJLJLJ == -1) {
            super.onMeasure(i, i2);
            return;
        }
        int paddingRight = getPaddingRight() + getPaddingLeft() + Math.max(getSuggestedMinimumWidth(), this.LJLJL);
        int paddingBottom = getPaddingBottom() + getPaddingTop() + Math.max(getSuggestedMinimumHeight(), this.LJLJLJ);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode == 1073741824) {
            paddingRight = size;
        } else if (mode == Integer.MIN_VALUE) {
            paddingRight = Math.min(paddingRight, size);
        }
        if (mode2 == 1073741824) {
            paddingBottom = size2;
        } else if (mode2 == Integer.MIN_VALUE) {
            paddingBottom = Math.min(paddingBottom, size2);
        }
        float f = paddingBottom / paddingRight;
        int i3 = this.LJLJLJ;
        int i4 = this.LJLJL;
        if (((i3 * 1.05f) / i4) + 0.01f > f) {
            paddingBottom = (i3 * paddingRight) / i4;
        } else {
            paddingRight = (i4 * paddingBottom) / i3;
        }
        setMeasuredDimension(paddingRight, paddingBottom);
    }

    @Override // android.view.TextureView, android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
    }
}
