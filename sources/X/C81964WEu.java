package X;

import Y.ARunnableS50S0100000_14;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveMaxRetainAlogMessageSizeSetting;

/* renamed from: X.WEu, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C81964WEu extends AppCompatImageView {
    public int LJLIL;
    public float LJLILLLLZI;
    public int LJLJI;
    public int LJLJJI;
    public int LJLJJL;
    public final Matrix LJLJJLL;
    public final Matrix LJLJL;
    public final Matrix LJLJLJ;
    public final Matrix LJLJLLL;
    public GestureDetector LJLL;
    public ScaleGestureDetector LJLLI;
    public View.OnClickListener LJLLILLLL;
    public ImageView.ScaleType LJLLJ;
    public boolean LJLLL;
    public boolean LJLLLL;
    public boolean LJLLLLLL;
    public boolean LJLZ;
    public boolean LJZ;
    public boolean LJZI;
    public boolean LJZL;
    public boolean LL;
    public boolean LLD;
    public boolean LLF;
    public float LLFF;
    public float LLFFF;
    public int LLFII;
    public int LLFZ;
    public float LLI;
    public float LLIFFJFJJ;
    public final RectF LLII;
    public final RectF LLIIII;
    public final RectF LLIIIILZ;
    public final RectF LLIIIJ;
    public final RectF LLIIIL;
    public final PointF LLIIIZ;
    public final PointF LLIIJI;
    public final PointF LLIIJLIL;
    public final RunnableC81966WEw LLIIL;
    public RectF LLIILII;
    public C81967WEx LLIILZL;
    public long LLIIZ;
    public View.OnLongClickListener LLIL;
    public InterfaceC81962WEs LLILII;
    public final ARunnableS50S0100000_14 LLILIL;

    public int getDefaultAnimaDuring() {
        return 340;
    }

    public final void LIZJ() {
        if (!this.LJLZ) {
            RectF rectF = this.LLII;
            RectF rectF2 = this.LLIIIILZ;
            RectF rectF3 = this.LLIIIL;
            float f = rectF.left;
            float f2 = rectF2.left;
            if (f <= f2) {
                f = f2;
            }
            float f3 = rectF.right;
            float f4 = rectF2.right;
            if (f3 >= f4) {
                f3 = f4;
            }
            if (f > f3) {
                rectF3.set(0.0f, 0.0f, 0.0f, 0.0f);
                return;
            }
            float f5 = rectF.top;
            float f6 = rectF2.top;
            if (f5 <= f6) {
                f5 = f6;
            }
            float f7 = rectF.bottom;
            float f8 = rectF2.bottom;
            if (f7 >= f8) {
                f7 = f8;
            }
            if (f5 > f7) {
                rectF3.set(0.0f, 0.0f, 0.0f, 0.0f);
            } else {
                rectF3.set(f, f5, f3, f7);
            }
        }
    }

    public final void LJFF() {
        boolean z;
        this.LJLJLJ.set(this.LJLJJLL);
        this.LJLJLJ.postConcat(this.LJLJL);
        setImageMatrix(this.LJLJLJ);
        this.LJLJL.mapRect(this.LLIIIILZ, this.LLIIII);
        boolean z2 = true;
        if (this.LLIIIILZ.width() > this.LLII.width()) {
            z = true;
        } else {
            z = false;
        }
        this.LLD = z;
        if (this.LLIIIILZ.height() <= this.LLII.height()) {
            z2 = false;
        }
        this.LLF = z2;
    }

    public final void LJIIIIZZ() {
        float f;
        float f2;
        WF2 c81969WEz;
        if (!this.LJLLLL || !this.LJLLLLLL) {
            return;
        }
        this.LJLJJLL.reset();
        this.LJLJL.reset();
        this.LL = false;
        Drawable drawable = getDrawable();
        int width = getWidth();
        int height = getHeight();
        int LJII = LJII(drawable);
        int LJI = LJI(drawable);
        float f3 = LJII;
        float f4 = LJI;
        this.LLIIII.set(0.0f, 0.0f, f3, f4);
        int i = (width - LJII) / 2;
        int i2 = (height - LJI) / 2;
        if (LJII > width) {
            f = width / f3;
        } else {
            f = 1.0f;
        }
        if (LJI > height) {
            f2 = height / f4;
        } else {
            f2 = 1.0f;
        }
        if (f >= f2) {
            f = f2;
        }
        this.LJLJJLL.reset();
        this.LJLJJLL.postTranslate(i, i2);
        Matrix matrix = this.LJLJJLL;
        PointF pointF = this.LLIIIZ;
        matrix.postScale(f, f, pointF.x, pointF.y);
        this.LJLJJLL.mapRect(this.LLIIII);
        this.LLI = this.LLIIII.width() / 2.0f;
        this.LLIFFJFJJ = this.LLIIII.height() / 2.0f;
        this.LLIIJI.set(this.LLIIIZ);
        this.LLIIJLIL.set(this.LLIIJI);
        LJFF();
        switch (C2050182v.LIZ[this.LJLLJ.ordinal()]) {
            case 1:
                if (this.LJLLLL && this.LJLLLLLL) {
                    Drawable drawable2 = getDrawable();
                    int LJII2 = LJII(drawable2);
                    int LJI2 = LJI(drawable2);
                    float f5 = LJII2;
                    if (f5 > this.LLII.width() || LJI2 > this.LLII.height()) {
                        float width2 = f5 / this.LLIIIILZ.width();
                        float height2 = LJI2 / this.LLIIIILZ.height();
                        if (width2 <= height2) {
                            width2 = height2;
                        }
                        this.LLFFF = width2;
                        Matrix matrix2 = this.LJLJL;
                        PointF pointF2 = this.LLIIIZ;
                        matrix2.postScale(width2, width2, pointF2.x, pointF2.y);
                        LJFF();
                        LJIIJ();
                        break;
                    }
                }
                break;
            case 2:
                if (this.LLIIIILZ.width() < this.LLII.width() || this.LLIIIILZ.height() < this.LLII.height()) {
                    float width3 = this.LLII.width() / this.LLIIIILZ.width();
                    float height3 = this.LLII.height() / this.LLIIIILZ.height();
                    if (width3 <= height3) {
                        width3 = height3;
                    }
                    this.LLFFF = width3;
                    Matrix matrix3 = this.LJLJL;
                    PointF pointF3 = this.LLIIIZ;
                    matrix3.postScale(width3, width3, pointF3.x, pointF3.y);
                    LJFF();
                    LJIIJ();
                    break;
                }
                break;
            case 3:
                if (this.LLIIIILZ.width() > this.LLII.width() || this.LLIIIILZ.height() > this.LLII.height()) {
                    float width4 = this.LLII.width() / this.LLIIIILZ.width();
                    float height4 = this.LLII.height() / this.LLIIIILZ.height();
                    if (width4 >= height4) {
                        width4 = height4;
                    }
                    this.LLFFF = width4;
                    Matrix matrix4 = this.LJLJL;
                    PointF pointF4 = this.LLIIIZ;
                    matrix4.postScale(width4, width4, pointF4.x, pointF4.y);
                    LJFF();
                    LJIIJ();
                    break;
                }
                break;
            case 4:
                LJIIIZ();
                break;
            case 5:
                LJIIIZ();
                float f6 = -this.LLIIIILZ.top;
                this.LLFZ = (int) (this.LLFZ + f6);
                this.LJLJL.postTranslate(0.0f, f6);
                LJFF();
                LJIIJ();
                break;
            case 6:
                LJIIIZ();
                float f7 = this.LLII.bottom - this.LLIIIILZ.bottom;
                this.LLFZ = (int) (this.LLFZ + f7);
                this.LJLJL.postTranslate(0.0f, f7);
                LJFF();
                LJIIJ();
                break;
            case 7:
                float width5 = this.LLII.width() / this.LLIIIILZ.width();
                float height5 = this.LLII.height() / this.LLIIIILZ.height();
                Matrix matrix5 = this.LJLJL;
                PointF pointF5 = this.LLIIIZ;
                matrix5.postScale(width5, height5, pointF5.x, pointF5.y);
                LJFF();
                LJIIJ();
                break;
        }
        this.LJZI = true;
        if (this.LLIILZL != null && System.currentTimeMillis() - this.LLIIZ < this.LJLJJL) {
            C81967WEx c81967WEx = this.LLIILZL;
            if (this.LJZI) {
                this.LJLJL.reset();
                LJFF();
                this.LLFFF = 1.0f;
                this.LLFII = 0;
                this.LLFZ = 0;
                C81967WEx info = getInfo();
                float width6 = c81967WEx.LIZIZ.width() / info.LIZIZ.width();
                float height6 = c81967WEx.LIZIZ.height() / info.LIZIZ.height();
                if (width6 >= height6) {
                    width6 = height6;
                }
                RectF rectF = c81967WEx.LIZ;
                float width7 = (rectF.width() / 2.0f) + rectF.left;
                RectF rectF2 = c81967WEx.LIZ;
                float height7 = (rectF2.height() / 2.0f) + rectF2.top;
                this.LJLJL.reset();
                Matrix matrix6 = this.LJLJL;
                RectF rectF3 = this.LLIIII;
                matrix6.postTranslate(-rectF3.left, -rectF3.top);
                this.LJLJL.postTranslate(width7 - (this.LLIIII.width() / 2.0f), height7 - (this.LLIIII.height() / 2.0f));
                this.LJLJL.postScale(width6, width6, width7, height7);
                this.LJLJL.postRotate(c81967WEx.LIZLLL, width7, height7);
                LJFF();
                this.LLIIJI.set(width7, height7);
                this.LLIIJLIL.set(width7, height7);
                RunnableC81966WEw runnableC81966WEw = this.LLIIL;
                PointF pointF6 = this.LLIIIZ;
                int i3 = (int) (pointF6.x - width7);
                int i4 = (int) (pointF6.y - height7);
                runnableC81966WEw.LJLL = 0;
                runnableC81966WEw.LJLLI = 0;
                runnableC81966WEw.LJLILLLLZI.startScroll(0, 0, i3, i4, runnableC81966WEw.LJLLL.LJLIL);
                this.LLIIL.LIZLLL(width6, 1.0f);
                RunnableC81966WEw runnableC81966WEw2 = this.LLIIL;
                int i5 = (int) c81967WEx.LIZLLL;
                runnableC81966WEw2.LJLJJLL.startScroll(i5, 0, -i5, 0, runnableC81966WEw2.LJLLL.LJLIL);
                if (c81967WEx.LIZJ.width() < c81967WEx.LIZIZ.width() || c81967WEx.LIZJ.height() < c81967WEx.LIZIZ.height()) {
                    float width8 = c81967WEx.LIZJ.width() / c81967WEx.LIZIZ.width();
                    float height8 = c81967WEx.LIZJ.height() / c81967WEx.LIZIZ.height();
                    if (width8 > 1.0f) {
                        width8 = 1.0f;
                    }
                    if (height8 > 1.0f) {
                        height8 = 1.0f;
                    }
                    ImageView.ScaleType scaleType = c81967WEx.LJ;
                    if (scaleType == ImageView.ScaleType.FIT_START) {
                        c81969WEz = new WF1(this);
                    } else if (scaleType == ImageView.ScaleType.FIT_END) {
                        c81969WEz = new WF0(this);
                    } else {
                        c81969WEz = new C81969WEz(this);
                    }
                    RunnableC81966WEw runnableC81966WEw3 = this.LLIIL;
                    runnableC81966WEw3.LJLJJL.startScroll((int) (width8 * 10000.0f), (int) (height8 * 10000.0f), (int) ((1.0f - width8) * 10000.0f), (int) ((1.0f - height8) * 10000.0f), this.LJLIL / 3);
                    runnableC81966WEw3.LJLJL = c81969WEz;
                    Matrix matrix7 = this.LJLJLLL;
                    RectF rectF4 = this.LLIIIILZ;
                    matrix7.setScale(width8, height8, (rectF4.left + rectF4.right) / 2.0f, c81969WEz.LIZ());
                    this.LJLJLLL.mapRect(this.LLIIL.LJLLILLLL, this.LLIIIILZ);
                    this.LLIILII = this.LLIIL.LJLLILLLL;
                }
                RunnableC81966WEw runnableC81966WEw4 = this.LLIIL;
                runnableC81966WEw4.LJLIL = true;
                runnableC81966WEw4.LJLLL.post(runnableC81966WEw4);
            } else {
                this.LLIILZL = c81967WEx;
                this.LLIIZ = System.currentTimeMillis();
            }
        }
        this.LLIILZL = null;
        if (LJI > LJII * 3) {
            this.LJLJL.postTranslate(0.0f, -this.LLIIIILZ.top);
            this.LLFZ = (int) (this.LLFZ - this.LLIIIILZ.top);
            LJFF();
        }
    }

    public final void LJIIIZ() {
        if (this.LLIIIILZ.width() < this.LLII.width()) {
            float width = this.LLII.width() / this.LLIIIILZ.width();
            this.LLFFF = width;
            Matrix matrix = this.LJLJL;
            PointF pointF = this.LLIIIZ;
            matrix.postScale(width, width, pointF.x, pointF.y);
            LJFF();
            LJIIJ();
        }
    }

    public C81967WEx getInfo() {
        RectF rectF = new RectF();
        int[] iArr = {getLeft() + iArr[0], getTop() + iArr[1]};
        Object parent = getParent();
        while (true) {
            if (parent instanceof View) {
                View view = (View) parent;
                if (view.getId() == 16908290) {
                    break;
                }
                iArr[0] = iArr[0] - view.getScrollX();
                iArr[1] = iArr[1] - view.getScrollY();
                iArr[0] = view.getLeft() + iArr[0];
                iArr[1] = view.getTop() + iArr[1];
                parent = view.getParent();
            } else {
                iArr[0] = (int) (iArr[0] + 0.5f);
                iArr[1] = (int) (iArr[1] + 0.5f);
                break;
            }
        }
        float f = iArr[0];
        RectF rectF2 = this.LLIIIILZ;
        float f2 = rectF2.left + f;
        float f3 = iArr[1];
        rectF.set(f2, rectF2.top + f3, f + rectF2.right, f3 + rectF2.bottom);
        return new C81967WEx(rectF, this.LLIIIILZ, this.LLII, this.LLIIII, this.LLIIIZ, this.LLFF, this.LJLLJ);
    }

    public final void LJIIJ() {
        Drawable drawable = getDrawable();
        this.LLIIII.set(0.0f, 0.0f, LJII(drawable), LJI(drawable));
        this.LJLJJLL.set(this.LJLJLJ);
        this.LJLJJLL.mapRect(this.LLIIII);
        this.LLI = this.LLIIII.width() / 2.0f;
        this.LLIFFJFJJ = this.LLIIII.height() / 2.0f;
        this.LLFFF = 1.0f;
        this.LLFII = 0;
        this.LLFZ = 0;
        this.LJLJL.reset();
    }

    public int getAnimaDuring() {
        return this.LJLIL;
    }

    public float getMaxScale() {
        return this.LJLILLLLZI;
    }

    public C81964WEu(Context context) {
        super(context, null, 0);
        this.LJLJJL = LiveMaxRetainAlogMessageSizeSetting.DEFAULT;
        this.LJLJJLL = new Matrix();
        this.LJLJL = new Matrix();
        this.LJLJLJ = new Matrix();
        this.LJLJLLL = new Matrix();
        this.LJZ = false;
        this.LLFFF = 1.0f;
        this.LLII = new RectF();
        this.LLIIII = new RectF();
        this.LLIIIILZ = new RectF();
        this.LLIIIJ = new RectF();
        this.LLIIIL = new RectF();
        this.LLIIIZ = new PointF();
        this.LLIIJI = new PointF();
        this.LLIIJLIL = new PointF();
        this.LLIIL = new RunnableC81966WEw(this);
        ScaleGestureDetectorOnScaleGestureListenerC81957WEn scaleGestureDetectorOnScaleGestureListenerC81957WEn = new ScaleGestureDetectorOnScaleGestureListenerC81957WEn(this);
        this.LLILIL = new ARunnableS50S0100000_14(this, 251);
        C81965WEv c81965WEv = new C81965WEv(this);
        super.setScaleType(ImageView.ScaleType.MATRIX);
        if (this.LJLLJ == null) {
            this.LJLLJ = ImageView.ScaleType.CENTER_INSIDE;
        }
        this.LJLL = new GestureDetector(getContext(), c81965WEv);
        this.LJLLI = new ScaleGestureDetector(getContext(), scaleGestureDetectorOnScaleGestureListenerC81957WEn);
        float f = getResources().getDisplayMetrics().density;
        this.LJLJI = (int) (30.0f * f);
        this.LJLJJI = (int) (f * 140.0f);
        this.LJLIL = 340;
        this.LJLILLLLZI = 2.0f;
    }

    public static int LJI(Drawable drawable) {
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicHeight <= 0) {
            int minimumHeight = drawable.getMinimumHeight();
            if (minimumHeight <= 0) {
                return drawable.getBounds().height();
            }
            return minimumHeight;
        }
        return intrinsicHeight;
    }

    public static int LJII(Drawable drawable) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        if (intrinsicWidth <= 0) {
            int minimumWidth = drawable.getMinimumWidth();
            if (minimumWidth <= 0) {
                return drawable.getBounds().width();
            }
            return minimumWidth;
        }
        return intrinsicWidth;
    }

    public final boolean LIZ(float f) {
        if (this.LLIIIILZ.width() <= this.LLII.width()) {
            return false;
        }
        if (f < 0.0f && Math.round(this.LLIIIILZ.left) - f >= this.LLII.left) {
            return false;
        }
        if (f > 0.0f && Math.round(this.LLIIIILZ.right) - f <= this.LLII.right) {
            return false;
        }
        return true;
    }

    public final boolean LIZIZ(float f) {
        if (this.LLIIIILZ.height() <= this.LLII.height()) {
            return false;
        }
        if (f < 0.0f && Math.round(this.LLIIIILZ.top) - f >= this.LLII.top) {
            return false;
        }
        if (f > 0.0f && Math.round(this.LLIIIILZ.bottom) - f <= this.LLII.bottom) {
            return false;
        }
        return true;
    }

    public final void LJ(RectF rectF) {
        float f;
        int i;
        int i2;
        if (rectF.width() <= this.LLII.width()) {
            if (Math.abs(Math.round(rectF.left) - ((this.LLII.width() - rectF.width()) / 2.0f)) >= 1.0f) {
                i = -((int) (((this.LLII.width() - rectF.width()) / 2.0f) - rectF.left));
            }
            i = 0;
        } else {
            float f2 = rectF.left;
            RectF rectF2 = this.LLII;
            float f3 = rectF2.left;
            if (f2 > f3) {
                f = f2 - f3;
            } else {
                float f4 = rectF.right;
                float f5 = rectF2.right;
                if (f4 < f5) {
                    f = f4 - f5;
                }
                i = 0;
            }
            i = (int) f;
        }
        if (rectF.height() <= this.LLII.height()) {
            if (Math.abs(Math.round(rectF.top) - ((this.LLII.height() - rectF.height()) / 2.0f)) >= 1.0f) {
                i2 = -((int) (((this.LLII.height() - rectF.height()) / 2.0f) - rectF.top));
            }
            i2 = 0;
        } else {
            float f6 = rectF.top;
            RectF rectF3 = this.LLII;
            float f7 = rectF3.top;
            if (f6 > f7) {
                i2 = (int) (f6 - f7);
            } else {
                float f8 = rectF.bottom;
                float f9 = rectF3.bottom;
                if (f8 < f9) {
                    i2 = (int) (f8 - f9);
                }
                i2 = 0;
            }
        }
        if (i != 0 || i2 != 0) {
            if (!this.LLIIL.LJLJI.isFinished()) {
                this.LLIIL.LJLJI.abortAnimation();
            }
            RunnableC81966WEw runnableC81966WEw = this.LLIIL;
            runnableC81966WEw.LJLL = 0;
            runnableC81966WEw.LJLLI = 0;
            runnableC81966WEw.LJLILLLLZI.startScroll(0, 0, -i, -i2, runnableC81966WEw.LJLLL.LJLIL);
        }
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        if (this.LJLLL) {
            return true;
        }
        return LIZ(i);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        if (this.LJLLL) {
            return true;
        }
        return LIZIZ(i);
    }

    @Override // android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (Math.round(this.LLIIIILZ.left) <= this.LLII.left) {
            Math.round(this.LLIIIILZ.right);
        }
        if (motionEvent.getPointerCount() >= 2) {
            this.LJLLL = true;
        }
        GestureDetector gestureDetector = this.LJLL;
        if (gestureDetector != null) {
            gestureDetector.onTouchEvent(motionEvent);
        }
        if (this.LJZ) {
            this.LJLLI.onTouchEvent(motionEvent);
        }
        if (action == 1 || action == 3) {
            RunnableC81966WEw runnableC81966WEw = this.LLIIL;
            if (!runnableC81966WEw.LJLIL) {
                float f = this.LLFF;
                float f2 = f % 90.0f;
                if (f2 != 0.0f) {
                    float f3 = ((int) (f / 90.0f)) * 90;
                    if (f2 > 45.0f) {
                        f3 += 90.0f;
                    } else if (f2 < -45.0f) {
                        f3 -= 90.0f;
                    }
                    int i = (int) f;
                    runnableC81966WEw.LJLJJLL.startScroll(i, 0, ((int) f3) - i, 0, runnableC81966WEw.LJLLL.LJLIL);
                    this.LLFF = f3;
                }
                float f4 = this.LLFFF;
                if (f4 < 1.0f) {
                    this.LLIIL.LIZLLL(f4, 1.0f);
                    f4 = 1.0f;
                } else {
                    float f5 = this.LJLILLLLZI;
                    if (f4 > f5) {
                        this.LLIIL.LIZLLL(f4, f5);
                        f4 = f5;
                    }
                }
                RectF rectF = this.LLIIIILZ;
                float width = (rectF.width() / 2.0f) + rectF.left;
                RectF rectF2 = this.LLIIIILZ;
                float height = (rectF2.height() / 2.0f) + rectF2.top;
                this.LLIIJI.set(width, height);
                this.LLIIJLIL.set(width, height);
                this.LLFII = 0;
                this.LLFZ = 0;
                this.LJLJLLL.reset();
                Matrix matrix = this.LJLJLLL;
                RectF rectF3 = this.LLIIII;
                matrix.postTranslate(-rectF3.left, -rectF3.top);
                this.LJLJLLL.postTranslate(width - this.LLI, height - this.LLIFFJFJJ);
                this.LJLJLLL.postScale(f4, f4, width, height);
                this.LJLJLLL.postRotate(this.LLFF, width, height);
                this.LJLJLLL.mapRect(this.LLIIIJ, this.LLIIII);
                LJ(this.LLIIIJ);
                RunnableC81966WEw runnableC81966WEw2 = this.LLIIL;
                runnableC81966WEw2.LJLIL = true;
                runnableC81966WEw2.LJLLL.post(runnableC81966WEw2);
            }
        }
        return true;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        RectF rectF = this.LLIILII;
        if (rectF != null) {
            canvas.clipRect(rectF);
            this.LLIILII = null;
        }
        super.draw(canvas);
    }

    @Override // android.widget.ImageView
    public void setAdjustViewBounds(boolean z) {
        super.setAdjustViewBounds(z);
        this.LJZL = z;
    }

    public void setAnimaDuring(int i) {
        this.LJLIL = i;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        if (drawable == null) {
            this.LJLLLL = false;
            return;
        }
        if ((drawable.getIntrinsicHeight() > 0 && drawable.getIntrinsicWidth() > 0) || ((drawable.getMinimumWidth() > 0 && drawable.getMinimumHeight() > 0) || (drawable.getBounds().width() > 0 && drawable.getBounds().height() > 0))) {
            if (!this.LJLLLL) {
                this.LJLLLL = true;
            }
            LJIIIIZZ();
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i) {
        Drawable drawable;
        try {
            drawable = getResources().getDrawable(i);
        } catch (Exception unused) {
            drawable = null;
        }
        setImageDrawable(drawable);
    }

    public void setInterpolator(Interpolator interpolator) {
        this.LLIIL.LJLLJ.LIZ = interpolator;
    }

    public void setMaxAnimFromWaiteTime(int i) {
        this.LJLJJL = i;
    }

    public void setMaxScale(float f) {
        this.LJLILLLLZI = f;
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
        this.LJLLILLLL = onClickListener;
    }

    @Override // android.view.View
    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.LLIL = onLongClickListener;
    }

    public void setOnScaleListener(InterfaceC81962WEs interfaceC81962WEs) {
        this.LLILII = interfaceC81962WEs;
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        ImageView.ScaleType scaleType2 = this.LJLLJ;
        this.LJLLJ = scaleType;
        if (scaleType2 != scaleType) {
            LJIIIIZZ();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        if (!this.LJLLLL) {
            super.onMeasure(i, i2);
            return;
        }
        Drawable drawable = getDrawable();
        int LJII = LJII(drawable);
        int LJI = LJI(drawable);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-2, -2);
        }
        int i3 = layoutParams.width;
        if (i3 != -1 ? mode != 1073741824 && (mode != Integer.MIN_VALUE || LJII <= size) : mode == 0) {
            size = LJII;
        }
        int i4 = layoutParams.height;
        if (i4 != -1 ? mode2 != 1073741824 && (mode2 != Integer.MIN_VALUE || LJI <= size2) : mode2 == 0) {
            size2 = LJI;
        }
        if (this.LJZL) {
            float f = LJII;
            float f2 = LJI;
            float f3 = size;
            float f4 = size2;
            if (f / f2 != f3 / f4) {
                float f5 = f4 / f2;
                float f6 = f3 / f;
                if (f5 >= f6) {
                    f5 = f6;
                }
                if (i3 != -1) {
                    size = (int) (f * f5);
                }
                if (i4 != -1) {
                    size2 = (int) (f2 * f5);
                }
            }
        }
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.LLII.set(0.0f, 0.0f, i, i2);
        this.LLIIIZ.set(i / 2, i2 / 2);
        if (!this.LJLLLLLL) {
            this.LJLLLLLL = true;
            LJIIIIZZ();
        }
    }
}
