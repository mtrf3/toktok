package X;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.util.Pair;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import android.view.View;
import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes16.dex */
public final class YD6 extends TextureView implements YSF, YDC {
    public TextureView.SurfaceTextureListener LJLIL;
    public YDA LJLILLLLZI;
    public boolean LJLJI;
    public boolean LJLJJI;
    public Surface LJLJJL;
    public SurfaceTexture LJLJJLL;
    public int LJLJL;
    public int LJLJLJ;
    public YD4 LJLJLLL;
    public C79985VaH LJLL;

    public static Object LIZ(Object obj, Method method, Object[] objArr) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", method, new Object[]{obj, objArr}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "-6810031538333703926"));
        return LIZJ.LIZ ? LIZJ.LIZIZ : method.invoke(obj, objArr);
    }

    public View getGestureView() {
        return this;
    }

    @Override // X.YSF
    public SurfaceHolder getSurfaceHolder() {
        return null;
    }

    @Override // X.YSF
    public View getView() {
        return this;
    }

    public final void LIZJ() {
        Surface surface;
        if (this.LJLJI && this.LJLJJLL != null && this.LJLJJI && (surface = this.LJLJJL) != null && surface.isValid() && this.LJLJJLL != getSurfaceTexture()) {
            boolean LIZIZ = LIZIZ(this.LJLJJLL);
            PrintStream printStream = System.err;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("isSurfaceTextureReleased:");
            LIZ.append(LIZIZ);
            printStream.println(X1D.LIZIZ(LIZ));
            if (!LIZIZ) {
                setSurfaceTexture(this.LJLJJLL);
                YDA yda = this.LJLILLLLZI;
                if (yda != null) {
                    ((YS2) yda).LJIJI();
                }
                TextureView.SurfaceTextureListener surfaceTextureListener = this.LJLIL;
                if (surfaceTextureListener != null) {
                    surfaceTextureListener.onSurfaceTextureAvailable(this.LJLJJLL, 0, 0);
                }
            }
        }
    }

    public float getCenterCropScaleFactor() {
        return this.LJLJLLL.LIZ();
    }

    public float getCenterInsideScaleFactor() {
        this.LJLJLLL.getClass();
        return 1.0f;
    }

    public float getLayoutScaleFactor() {
        return this.LJLJLLL.LIZJ();
    }

    public Rect getRealViewRect() {
        return new Rect((int) getRealLeft(), (int) getRealTop(), (int) getRealRight(), (int) getRealBottom());
    }

    public RectF getRealViewRectF() {
        return new RectF(getRealLeft(), getRealTop(), getRealRight(), getRealBottom());
    }

    public int getVideoHeight() {
        return this.LJLJLLL.LIZJ;
    }

    public int getVideoWidth() {
        return this.LJLJLLL.LIZIZ;
    }

    public RectF getViewRect() {
        YD4 yd4 = this.LJLJLLL;
        yd4.getClass();
        return new RectF(yd4.LIZLLL(), yd4.LJ(), (yd4.LIZ.getScaleX() * yd4.LIZ.getWidth()) + yd4.LIZLLL(), (yd4.LIZ.getScaleY() * yd4.LIZ.getHeight()) + yd4.LJ());
    }

    @Override // android.view.TextureView, android.view.View
    public final void onAttachedToWindow() {
        YD4 yd4 = this.LJLJLLL;
        yd4.LIZLLL = 0;
        yd4.LJ = 0;
        super.onAttachedToWindow();
    }

    public float getRealBottom() {
        return getRealHeight() + getRealTop();
    }

    public float getRealHeight() {
        return getScaleY() * getHeight();
    }

    public float getRealLeft() {
        return getTranslationX() + ((getWidth() - getRealWidth()) / 2.0f) + getLeft();
    }

    public float getRealRight() {
        return getRealWidth() + getRealLeft();
    }

    public float getRealTop() {
        return getTranslationY() + ((getHeight() - getRealHeight()) / 2.0f) + getTop();
    }

    public float getRealWidth() {
        return getScaleX() * getWidth();
    }

    public C79985VaH getPlayEntity() {
        return this.LJLL;
    }

    @Override // X.YSF
    public Surface getSurface() {
        return this.LJLJJL;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    public YD6(Context context) {
        super(context, null);
        this.LJLJLLL = new YD4(this, this);
        super.setSurfaceTextureListener(new TextureViewSurfaceTextureListenerC83891WwB(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r1v9 */
    public static boolean LIZIZ(SurfaceTexture surfaceTexture) {
        if (surfaceTexture == null) {
            return true;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return surfaceTexture.isReleased();
        }
        Method method = 0;
        method = 0;
        method = 0;
        if (!C38354F3m.LJ("isReleased")) {
            try {
                try {
                    method = SurfaceTexture.class.getMethod("isReleased", null);
                } catch (Throwable unused) {
                    method = SurfaceTexture.class.getDeclaredMethod("isReleased", method);
                }
            } catch (Throwable unused2) {
            }
        }
        boolean z = false;
        if (method == 0) {
            return false;
        }
        try {
            Object LIZ = LIZ(surfaceTexture, method, new Object[0]);
            if (!(LIZ instanceof Boolean)) {
                return false;
            }
            z = ((Boolean) LIZ).booleanValue();
            return z;
        } catch (IllegalAccessException e) {
            C16880lQ.LLLLIIL(e);
            return z;
        } catch (InvocationTargetException e2) {
            C16880lQ.LLLLIIL(e2);
            return z;
        }
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (getVisibility() == 0 && i == 0) {
            LIZJ();
        }
    }

    public void setCropStrategy(YDD ydd) {
        this.LJLJLLL.getClass();
    }

    @Override // android.view.View
    public void setKeepScreenOn(boolean z) {
        super.setKeepScreenOn(z);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("texture view keep_screen_on:");
        LIZ.append(Boolean.valueOf(z).toString());
        X1D.LIZIZ(LIZ);
    }

    public void setMaxScaleFactor(float f) {
        YD4 yd4 = this.LJLJLLL;
        yd4.getClass();
        if (Float.isNaN(f) || f < 0.0f || f > Float.MAX_VALUE) {
            return;
        }
        yd4.LJII = f;
    }

    public void setMinScaleFactor(float f) {
        YD4 yd4 = this.LJLJLLL;
        yd4.getClass();
        if (Float.isNaN(f) || f < 0.0f || f > Float.MAX_VALUE) {
            return;
        }
        yd4.LJIIIIZZ = f;
    }

    public void setOptimizeBlackSide(boolean z) {
        this.LJLJLLL.getClass();
    }

    public void setOptimizeNormalFillScreen(boolean z) {
        this.LJLJLLL.LJIIJ = z;
    }

    @Override // X.YSF
    public void setPlayEntity(C79985VaH c79985VaH) {
        this.LJLL = c79985VaH;
    }

    public void setResizeListener(YDB ydb) {
        this.LJLJLLL.getClass();
    }

    public void setReuseSurfaceTexture(boolean z) {
        this.LJLJI = z;
    }

    public void setRotatable(boolean z) {
        this.LJLJLLL.getClass();
    }

    public void setScalable(boolean z) {
        this.LJLJLLL.getClass();
    }

    @Override // X.YSF
    public void setSurfaceCallback(YDA yda) {
        this.LJLILLLLZI = yda;
    }

    @Override // android.view.TextureView
    public void setSurfaceTextureListener(TextureView.SurfaceTextureListener surfaceTextureListener) {
        this.LJLIL = surfaceTextureListener;
    }

    public void setTextureLayout(int i) {
        YD4 yd4 = this.LJLJLLL;
        if (yd4.LJIIIZ != i) {
            yd4.LJIIIZ = i;
            yd4.LIZ.requestLayout();
        }
    }

    @Override // android.view.TextureView
    public void setTransform(Matrix matrix) {
        super.setTransform(matrix);
        this.LJLJLLL.getClass();
    }

    public void setTranslatable(boolean z) {
        this.LJLJLLL.getClass();
    }

    public void setZoomingEnabled(boolean z) {
        this.LJLJLLL.LJIIJJI = z;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("widthMeasureSpec:");
        LIZ.append(View.MeasureSpec.toString(i));
        X1D.LIZIZ(LIZ);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("heightMeasureSpec:");
        LIZ2.append(View.MeasureSpec.toString(i2));
        X1D.LIZIZ(LIZ2);
        Pair<Integer, Integer> LJFF = this.LJLJLLL.LJFF(i, i2, getPaddingRight() + getPaddingLeft() + getSuggestedMinimumWidth(), getPaddingBottom() + getPaddingTop() + getSuggestedMinimumHeight());
        setMeasuredDimension(((Integer) LJFF.first).intValue(), ((Integer) LJFF.second).intValue());
    }

    @Override // android.view.TextureView, android.view.View
    public final void onVisibilityChanged(View view, int i) {
        try {
            super.onVisibilityChanged(view, i);
        } catch (Exception unused) {
        }
        if (view == this && i == 0) {
            LIZJ();
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int width = getWidth();
        int height = getHeight();
        if (this.LJLJL != width || this.LJLJLJ != height) {
            this.LJLJL = width;
            this.LJLJLJ = height;
            StringBuilder LIZJ = C06460Ne.LIZJ("tv_size_layout:", width, "*", height, " parent:");
            LIZJ.append(this.LJLJLLL.LJFF);
            LIZJ.append("*");
            LIZJ.append(this.LJLJLLL.LJI);
            String LIZIZ = X1D.LIZIZ(LIZJ);
            EnumC48219IwB enumC48219IwB = EnumC48219IwB.INS;
            C79985VaH c79985VaH = this.LJLL;
            YD4 yd4 = this.LJLJLLL;
            enumC48219IwB.updateTextureSize(c79985VaH, width, height, yd4.LJFF, yd4.LJI, getScaleX(), getContext());
            C48217Iw9 LIZIZ2 = C48217Iw9.LIZIZ("TVOnLayout", YDG.TEXTURE_SIZE, 6);
            if (LIZIZ2 != null) {
                LIZIZ2.LIZ("info", LIZIZ);
                EnumC48216Iw8.INS.addTrace(this.LJLL, LIZIZ2);
            }
        }
    }
}
