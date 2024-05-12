package X;

import Y.ARunnableS21S0110000_15;
import Y.ARunnableS51S0100000_15;
import Y.IDCallbackS369S0100000_15;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes16.dex */
public class Y61 extends ViewGroup {
    public Y60 LJLIL;
    public WindowManager LJLILLLLZI;
    public Handler LJLJI;
    public boolean LJLJJI;
    public SurfaceView LJLJJL;
    public TextureView LJLJJLL;
    public boolean LJLJL;
    public Y6H LJLJLJ;
    public int LJLJLLL;
    public final List<Y6E> LJLL;
    public Y6A LJLLI;
    public VK2 LJLLILLLL;
    public Y64 LJLLJ;
    public Y64 LJLLL;
    public Rect LJLLLL;
    public Y64 LJLLLLLL;
    public Rect LJLZ;
    public Rect LJZ;
    public Y64 LJZI;
    public double LJZL;
    public Y6D LL;
    public boolean LLD;
    public final Y67 LLF;
    public final Y6I LLFF;
    public final Y63 LLFFF;

    public void LIZIZ() {
    }

    private int getDisplayRotation() {
        return this.LJLILLLLZI.getDefaultDisplay().getRotation();
    }

    public final void LIZLLL() {
        if (this.LJLIL != null && getDisplayRotation() != this.LJLJLLL) {
            LIZ();
            LIZJ();
        }
    }

    public final void LJFF() {
        Rect rect;
        float f;
        Y64 y64 = this.LJLLLLLL;
        if (y64 != null && this.LJLLL != null && (rect = this.LJLLLL) != null) {
            if (this.LJLJJL != null && y64.equals(new Y64(rect.width(), this.LJLLLL.height()))) {
                LJ(new Y6G(this.LJLJJL.getHolder()));
                return;
            }
            TextureView textureView = this.LJLJJLL;
            if (textureView == null || textureView.getSurfaceTexture() == null) {
                return;
            }
            if (this.LJLLL != null) {
                int width = this.LJLJJLL.getWidth();
                int height = this.LJLJJLL.getHeight();
                Y64 y642 = this.LJLLL;
                float f2 = width / height;
                float f3 = y642.LJLIL / y642.LJLILLLLZI;
                float f4 = 1.0f;
                if (f2 < f3) {
                    f4 = f3 / f2;
                    f = 1.0f;
                } else {
                    f = f2 / f3;
                }
                Matrix matrix = new Matrix();
                matrix.setScale(f4, f);
                float f5 = width;
                float f6 = height;
                matrix.postTranslate((f5 - (f4 * f5)) / 2.0f, (f6 - (f * f6)) / 2.0f);
                this.LJLJJLL.setTransform(matrix);
            }
            LJ(new Y6G(this.LJLJJLL.getSurfaceTexture()));
        }
    }

    public Y6D getPreviewScalingStrategy() {
        Y6D y6d = this.LL;
        if (y6d != null) {
            return y6d;
        }
        if (this.LJLJJLL != null) {
            return new Y65();
        }
        return new Y66();
    }

    public final void LIZ() {
        TextureView textureView;
        SurfaceView surfaceView;
        C79043V0l.LJJIIJZLJL();
        this.LJLJLLL = -1;
        Y60 y60 = this.LJLIL;
        if (y60 != null) {
            C79043V0l.LJJIIJZLJL();
            if (y60.LJFF) {
                y60.LIZ.LIZIZ(y60.LJIILJJIL);
            } else {
                y60.LJI = true;
            }
            y60.LJFF = false;
            this.LJLIL = null;
            this.LJLJL = false;
        } else {
            this.LJLJI.sendEmptyMessage(R.id.nkz);
        }
        if (this.LJLLLLLL == null && (surfaceView = this.LJLJJL) != null) {
            surfaceView.getHolder().removeCallback(this.LLF);
        }
        if (this.LJLLLLLL == null && (textureView = this.LJLJJLL) != null) {
            textureView.setSurfaceTextureListener(null);
        }
        this.LJLLJ = null;
        this.LJLLL = null;
        this.LJZ = null;
        Y6H y6h = this.LJLJLJ;
        Y62 y62 = y6h.LIZJ;
        if (y62 != null) {
            y62.disable();
        }
        y6h.LIZJ = null;
        y6h.LIZIZ = null;
        y6h.LIZLLL = null;
        this.LLFFF.LIZIZ();
    }

    public void LIZJ() {
        C79043V0l.LJJIIJZLJL();
        if (this.LJLIL == null) {
            getContext();
            Y60 y60 = new Y60();
            VK2 vk2 = this.LJLLILLLL;
            if (!y60.LJFF) {
                y60.LJIIIIZZ = vk2;
                y60.LIZJ.LJFF = vk2;
            }
            this.LJLIL = y60;
            y60.LIZJ.getClass();
            Y60 y602 = this.LJLIL;
            y602.LIZLLL = this.LJLJI;
            C79043V0l.LJJIIJZLJL();
            y602.LJFF = true;
            y602.LJI = false;
            C79566VKo c79566VKo = y602.LIZ;
            ARunnableS51S0100000_15 aRunnableS51S0100000_15 = y602.LJIIIZ;
            synchronized (c79566VKo.LIZLLL) {
                c79566VKo.LIZJ++;
                c79566VKo.LIZIZ(aRunnableS51S0100000_15);
            }
            this.LJLJLLL = getDisplayRotation();
        }
        if (this.LJLLLLLL != null) {
            LJFF();
        } else {
            SurfaceView surfaceView = this.LJLJJL;
            if (surfaceView != null) {
                surfaceView.getHolder().addCallback(this.LLF);
            } else {
                TextureView textureView = this.LJLJJLL;
                if (textureView != null) {
                    if (textureView.isAvailable()) {
                        new Y6B(this).onSurfaceTextureSizeChanged(this.LJLJJLL.getSurfaceTexture(), this.LJLJJLL.getWidth(), this.LJLJJLL.getHeight());
                    } else {
                        this.LJLJJLL.setSurfaceTextureListener(new Y6B(this));
                    }
                }
            }
        }
        requestLayout();
        Y6H y6h = this.LJLJLJ;
        Context context = getContext();
        Y6I y6i = this.LLFF;
        Y62 y62 = y6h.LIZJ;
        if (y62 != null) {
            y62.disable();
        }
        y6h.LIZJ = null;
        y6h.LIZIZ = null;
        y6h.LIZLLL = null;
        Context LLLLL = C16880lQ.LLLLL(context);
        y6h.LIZLLL = y6i;
        y6h.LIZIZ = (WindowManager) C16880lQ.LLILL(LLLLL, "window");
        Y62 y622 = new Y62(y6h, LLLLL);
        y6h.LIZJ = y622;
        y622.enable();
        y6h.LIZ = y6h.LIZIZ.getDefaultDisplay().getRotation();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.LJLJJI) {
            TextureView textureView = new TextureView(getContext());
            this.LJLJJLL = textureView;
            textureView.setSurfaceTextureListener(new Y6B(this));
            addView(this.LJLJJLL);
            return;
        }
        SurfaceView surfaceView = new SurfaceView(getContext());
        this.LJLJJL = surfaceView;
        surfaceView.getHolder().addCallback(this.LLF);
        addView(this.LJLJJL);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        Bundle bundle = new Bundle();
        bundle.putParcelable("super", onSaveInstanceState);
        bundle.putBoolean("torch", this.LLD);
        return bundle;
    }

    public Y60 getCameraInstance() {
        return this.LJLIL;
    }

    public VK2 getCameraSettings() {
        return this.LJLLILLLL;
    }

    public Rect getFramingRect() {
        return this.LJLZ;
    }

    public Y64 getFramingRectSize() {
        return this.LJZI;
    }

    public double getMarginFraction() {
        return this.LJZL;
    }

    public Rect getPreviewFramingRect() {
        return this.LJZ;
    }

    public final void LJ(Y6G y6g) {
        Y60 y60;
        if (!this.LJLJL && (y60 = this.LJLIL) != null) {
            y60.LIZIZ = y6g;
            C79043V0l.LJJIIJZLJL();
            if (y60.LJFF) {
                y60.LIZ.LIZIZ(y60.LJIIJJI);
            }
            this.LJLJL = true;
            LIZIZ();
            this.LLFFF.LIZJ();
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        super.onRestoreInstanceState(bundle.getParcelable("super"));
        setTorch(bundle.getBoolean("torch"));
    }

    public void setCameraSettings(VK2 vk2) {
        this.LJLLILLLL = vk2;
    }

    public void setFramingRectSize(Y64 y64) {
        this.LJZI = y64;
    }

    public void setLightListener(Y6S y6s) {
        Y60 y60 = this.LJLIL;
        if (y60 != null) {
            y60.LIZJ.getClass();
        }
    }

    public void setMarginFraction(double d) {
        if (d < 0.5d) {
            this.LJZL = d;
            return;
        }
        throw new IllegalArgumentException("The margin fraction must be less than 0.5");
    }

    public void setPreviewScalingStrategy(Y6D y6d) {
        this.LL = y6d;
    }

    public void setTorch(boolean z) {
        this.LLD = z;
        Y60 y60 = this.LJLIL;
        if (y60 != null) {
            C79043V0l.LJJIIJZLJL();
            if (y60.LJFF) {
                y60.LIZ.LIZIZ(new ARunnableS21S0110000_15(y60, z, 0));
            }
        }
    }

    public void setUseTextureView(boolean z) {
        this.LJLJJI = z;
    }

    public void setZoom(float f) {
        Y60 y60 = this.LJLIL;
        if (y60 == null || y60.LJI) {
            return;
        }
        y60.getClass();
        C79043V0l.LJJIIJZLJL();
        if (!y60.LJFF) {
            return;
        }
        y60.LIZ.LIZIZ(new RunnableC86813Y5h(y60, f));
    }

    public Y61(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LJLJLLL = -1;
        this.LJLL = new ArrayList();
        this.LJLLILLLL = new VK2();
        this.LJLZ = null;
        this.LJZ = null;
        this.LJZI = null;
        this.LJZL = 0.1d;
        this.LL = null;
        this.LLD = false;
        this.LLF = new Y67(this);
        IDCallbackS369S0100000_15 iDCallbackS369S0100000_15 = new IDCallbackS369S0100000_15(this, 1);
        this.LLFF = new Y6I(this);
        this.LLFFF = new Y63(this);
        if (getBackground() == null) {
            setBackgroundColor(-16777216);
        }
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.by9, R.attr.by_, R.attr.byb, R.attr.bye});
        int dimension = (int) obtainStyledAttributes.getDimension(1, -1.0f);
        int dimension2 = (int) obtainStyledAttributes.getDimension(0, -1.0f);
        if (dimension > 0 && dimension2 > 0) {
            this.LJZI = new Y64(dimension, dimension2);
        }
        this.LJLJJI = obtainStyledAttributes.getBoolean(3, true);
        int integer = obtainStyledAttributes.getInteger(2, -1);
        if (integer == 1) {
            this.LL = new Y65();
        } else if (integer == 2) {
            this.LL = new Y66();
        } else if (integer == 3) {
            this.LL = new Y68();
        }
        obtainStyledAttributes.recycle();
        this.LJLILLLLZI = (WindowManager) C16880lQ.LLILL(context, "window");
        this.LJLJI = new Handler(iDCallbackS369S0100000_15);
        this.LJLJLJ = new Y6H();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Y64 y64 = new Y64(i3 - i, i4 - i2);
        this.LJLLJ = y64;
        Y60 y60 = this.LJLIL;
        if (y60 != null && y60.LJ == null) {
            Y6A y6a = new Y6A(getDisplayRotation(), y64);
            this.LJLLI = y6a;
            y6a.LIZJ = getPreviewScalingStrategy();
            Y60 y602 = this.LJLIL;
            Y6A y6a2 = this.LJLLI;
            y602.LJ = y6a2;
            y602.LIZJ.LJI = y6a2;
            C79043V0l.LJJIIJZLJL();
            if (y602.LJFF) {
                y602.LIZ.LIZIZ(y602.LJIIJ);
            }
            boolean z2 = this.LLD;
            if (z2) {
                Y60 y603 = this.LJLIL;
                y603.getClass();
                C79043V0l.LJJIIJZLJL();
                if (y603.LJFF) {
                    y603.LIZ.LIZIZ(new ARunnableS21S0110000_15(y603, z2, 0));
                }
            }
        }
        SurfaceView surfaceView = this.LJLJJL;
        if (surfaceView != null) {
            Rect rect = this.LJLLLL;
            if (rect == null) {
                surfaceView.layout(0, 0, getWidth(), getHeight());
                return;
            } else {
                surfaceView.layout(rect.left, rect.top, rect.right, rect.bottom);
                return;
            }
        }
        TextureView textureView = this.LJLJJLL;
        if (textureView == null) {
            return;
        }
        textureView.layout(0, 0, getWidth(), getHeight());
    }
}
