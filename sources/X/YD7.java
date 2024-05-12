package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;

/* loaded from: classes16.dex */
public final class YD7 extends FrameLayout implements YSD {
    public YD6 LJLIL;
    public ImageView LJLILLLLZI;
    public View LJLJI;
    public int LJLJJI;
    public int LJLJJL;
    public int LJLJJLL;

    @Override // X.YSD
    public ViewGroup getVideoContainer() {
        return this;
    }

    public static float LJI() {
        boolean z;
        int i = Build.VERSION.SDK_INT;
        if (i < 26) {
            return 1.0f;
        }
        String str = Build.MODEL;
        if (str.equals("TAH-AN00") || str.equals("TAH-N29") || str.equals("RLI-AN00") || str.equals("RLI-N29") || str.equals("TAH-AN00m") || str.equals("RHA-AN00m") || str.equals("MRX-AL09") || str.equals("MRX-AL19") || str.equals("MRX-AN19") || str.equals("MRX-W09") || str.equals("IN2010") || str.equals("SM-G9650") || str.equals("MRX-W19")) {
            z = true;
        } else {
            z = false;
        }
        if (i == 29 && z) {
            return 1.0f;
        }
        return 0.99f;
    }

    @Override // X.YSD
    public final boolean LIZ() {
        YD6 yd6 = this.LJLIL;
        if (yd6 != null && yd6.LJLJLLL.LJIIJJI) {
            return true;
        }
        return false;
    }

    @Override // X.YSD
    public final void LIZIZ() {
        if (Build.VERSION.SDK_INT <= 26) {
            return;
        }
        this.LJLIL.setAlpha(LJI());
    }

    @Override // X.YSD
    public final void LJ() {
        this.LJLILLLLZI.setVisibility(8);
        this.LJLILLLLZI.setImageBitmap(null);
    }

    @Override // X.YSD
    public final void LJFF() {
        if (Build.VERSION.SDK_INT <= 26) {
            return;
        }
        this.LJLIL.setAlpha(LJI());
    }

    @Override // X.YSD
    public int getVideoHeight() {
        return this.LJLIL.getVideoHeight();
    }

    @Override // X.YSD
    public int getVideoViewMarginTop() {
        YD6 yd6 = this.LJLIL;
        if (yd6 != null) {
            ViewGroup.LayoutParams layoutParams = yd6.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                return ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
            }
            return -1;
        }
        return -1;
    }

    @Override // X.YSD
    public int getVideoWidth() {
        return this.LJLIL.getVideoWidth();
    }

    @Override // X.YSD
    public View getBlackCoverView() {
        return this.LJLJI;
    }

    public YDC getGestureTargetView() {
        return this.LJLIL;
    }

    @Override // X.YSD
    public int getTextureLayout() {
        return this.LJLJJLL;
    }

    public YD6 getTextureVideoView() {
        return this.LJLIL;
    }

    @Override // X.YSD
    public YSF getVideoView() {
        return this.LJLIL;
    }

    public YD7(Context context) {
        super(context);
        setClipChildren(false);
        YD6 yd6 = new YD6(context);
        this.LJLIL = yd6;
        yd6.setAlpha(LJI());
        setBackgroundColor(-16777216);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        addView(this.LJLIL, layoutParams);
        ImageView imageView = new ImageView(context);
        this.LJLILLLLZI = imageView;
        addView(imageView, new FrameLayout.LayoutParams(-1, -1));
        KL2.LJIILLIIL(8, this.LJLILLLLZI);
        KL2.LJIILLIIL(8, this.LJLIL);
        View view = new View(context);
        this.LJLJI = view;
        view.setBackgroundColor(-16777216);
        addView(this.LJLJI, new FrameLayout.LayoutParams(-1, -1));
    }

    @Override // X.YSD
    public final void LIZJ(Bitmap bitmap) {
        if (bitmap != null) {
            this.LJLILLLLZI.setImageBitmap(bitmap);
            this.LJLILLLLZI.setVisibility(0);
        }
    }

    @Override // X.YSD
    public final void LIZLLL(int i) {
        this.LJLJJLL = i;
        YD6 yd6 = this.LJLIL;
        if (yd6 != null) {
            yd6.LJLJLLL.LJI(i);
        }
    }

    @Override // X.YSD
    public void setCropStrategy(YDD ydd) {
        this.LJLIL.setCropStrategy(ydd);
    }

    @Override // X.YSD
    public void setOptimizeBlackSide(boolean z) {
        YD6 yd6 = this.LJLIL;
        if (yd6 != null) {
            yd6.setOptimizeBlackSide(z);
        }
    }

    @Override // X.YSD
    public void setOptimizeNormalFillScreen(boolean z) {
        YD6 yd6 = this.LJLIL;
        if (yd6 != null) {
            yd6.setOptimizeNormalFillScreen(z);
        }
    }

    public void setTextureLayout(int i) {
        LIZLLL(i);
    }

    @Override // X.YSD
    public void setZoomingEnabled(boolean z) {
        YD6 yd6 = this.LJLIL;
        if (yd6 != null) {
            yd6.setZoomingEnabled(z);
        }
    }

    @Override // X.YSD
    public final void setVideoSize(int i, int i2) {
        if (this.LJLJJI != i || this.LJLJJL != i2) {
            this.LJLJJI = i;
            this.LJLJJL = i2;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("setVideoSize videoWidth:");
            LIZ.append(i);
            LIZ.append(" videoHeight:");
            LIZ.append(i2);
            X1D.LIZIZ(LIZ);
            YD6 yd6 = this.LJLIL;
            if (yd6 != null) {
                yd6.LJLJLLL.LJII(i, i2);
            }
        }
    }
}
