package X;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.zhiliaoapp.musically.R;

/* renamed from: X.5Yq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C136845Yq extends LinearLayout {
    public static int LJZI;
    public static int LJZL;
    public static int LL;
    public static float LLD;
    public static float LLF;
    public static float LLFF;
    public static int LLFFF;
    public static int LLFII;
    public Paint LJLIL;
    public final Path LJLILLLLZI;
    public final Path LJLJI;
    public RectF LJLJJI;
    public float LJLJJL;
    public float LJLJJLL;
    public final Path LJLJL;
    public RectF LJLJLJ;
    public int LJLJLLL;
    public Matrix LJLL;
    public Bitmap LJLLI;
    public Canvas LJLLILLLL;
    public int LJLLJ;
    public int LJLLL;
    public float LJLLLL;
    public int LJLLLLLL;
    public boolean LJLZ;
    public boolean LJZ;

    public float getBubbleOffset() {
        float max = Math.max(this.LJLLLL, LLFF);
        int i = this.LJLLLLLL;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return 0.0f;
                    }
                    return Math.min(max, this.LJLJJL - LLFF);
                }
                return Math.min(max, this.LJLJJLL - LLFF);
            }
            return Math.min(max, this.LJLJJLL - LLFF);
        }
        return Math.min(max, this.LJLJJL - LLFF);
    }

    public final void LIZ() {
        clearAnimation();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "alpha", getAlpha(), 1.0f);
        ofFloat.setDuration(100L);
        ofFloat.start();
        ofFloat.addUpdateListener(new C136855Yr());
    }

    public C136845Yq(Context context) {
        super(context, null, 0);
        this.LJLILLLLZI = new Path();
        Path path = new Path();
        this.LJLJI = path;
        Path path2 = new Path();
        this.LJLJL = path2;
        this.LJLLLL = 0.75f;
        this.LJLLLLLL = 1;
        this.LJLZ = true;
        int LIZIZ = (int) LIZIZ(context, 0.5f);
        this.LJLJLLL = LIZIZ;
        if (LIZIZ < 2) {
            this.LJLJLLL = 2;
        }
        LJZI = (int) LIZIZ(context, 7.0f);
        LJZL = (int) LIZIZ(context, 10.0f);
        LL = (int) LIZIZ(context, 6.0f);
        LLD = 2.0f;
        LLF = LIZIZ(context, 6.0f);
        LLFF = LJZI + LL;
        LLFFF = (int) LIZIZ(context, 50.0f);
        LLFII = (int) LIZIZ(context, 46.0f);
        Paint paint = new Paint();
        this.LJLIL = paint;
        paint.setStyle(Paint.Style.FILL);
        this.LJLIL.setStrokeCap(Paint.Cap.BUTT);
        this.LJLIL.setAntiAlias(true);
        this.LJLIL.setStrokeWidth(LLD);
        this.LJLIL.setStrokeJoin(Paint.Join.MITER);
        this.LJLLJ = AnonymousClass636.LJIIIIZZ(R.attr.ed, context);
        this.LJLLL = ColorProtector.parseColor("#1DFFFFFF");
        this.LJLIL.setColor(this.LJLLJ);
        setLayerType(1, this.LJLIL);
        path.moveTo(0.0f, 0.0f);
        path.lineTo(LJZI, -r0);
        float f = LJZI;
        path.lineTo(f, f);
        path.close();
        path2.moveTo(0.0f, 0.0f);
        path2.lineTo((float) ((Math.sqrt(2.0d) * this.LJLJLLL) + LJZI), (float) ((-LJZI) - (Math.sqrt(2.0d) * this.LJLJLLL)));
        path2.lineTo((float) ((Math.sqrt(2.0d) * this.LJLJLLL) + LJZI), (float) ((Math.sqrt(2.0d) * this.LJLJLLL) + LJZI));
        path2.close();
        setBackgroundColor(0);
        setClipChildren(false);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.LJLLI == null) {
            this.LJLLI = Bitmap.createBitmap(getMeasuredWidth(), getMeasuredHeight(), Bitmap.Config.ARGB_8888);
            this.LJLLILLLL = new Canvas(this.LJLLI);
        }
        float f = this.LJLJJL;
        float f2 = this.LJLJJLL;
        float max = Math.max(this.LJLLLL, LLFF);
        float min = Math.min(max, f2 - LLFF);
        Matrix matrix = new Matrix();
        this.LJLL = new Matrix();
        int i = this.LJLLLLLL;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        f2 = min;
                    } else {
                        f = Math.min(max, f - LLFF);
                        matrix.postRotate(270.0f);
                        this.LJLL.postRotate(270.0f);
                        Matrix matrix2 = this.LJLL;
                        int i2 = this.LJLJLLL;
                        matrix2.postTranslate(((i2 * 3) / 2) + f, (i2 * 2) + f2);
                        setPadding(0, 0, 0, LJZI);
                        setGravity(17);
                        this.LJLJJI = new RectF(0.0f, 0.0f, this.LJLJJL, this.LJLJJLL - LJZI);
                    }
                } else {
                    f2 = Math.min(max, f2 - LLFF);
                    matrix.postRotate(180.0f);
                    this.LJLL.postRotate(180.0f);
                    Matrix matrix3 = this.LJLL;
                    int i3 = this.LJLJLLL;
                    matrix3.postTranslate((i3 * 2) + f, ((i3 * 3) / 2) + f2);
                    setPadding(0, 0, LJZI, 0);
                    setGravity(17);
                    this.LJLJJI = new RectF(0.0f, 0.0f, this.LJLJJL - LJZI, this.LJLJJLL);
                }
            } else {
                f2 = Math.min(max, f2 - LLFF);
                setPadding(LJZI, 0, 0, 0);
                setGravity(17);
                this.LJLL.postTranslate(this.LJLJLLL + 0.0f, ((r0 * 3) / 2) + f2);
                this.LJLJJI = new RectF(LJZI, 0.0f, this.LJLJJL, this.LJLJJLL);
            }
            f = 0.0f;
        } else {
            f = Math.min(max, f - LLFF);
            matrix.postRotate(90.0f);
            this.LJLL.postRotate(90.0f);
            this.LJLL.postTranslate(((r2 * 3) / 2) + f, this.LJLJLLL + 0.0f);
            setPadding(0, LJZI, 0, 0);
            setGravity(17);
            this.LJLJJI = new RectF(0.0f, LJZI, this.LJLJJL, this.LJLJJLL);
            f2 = 0.0f;
        }
        RectF rectF = this.LJLJJI;
        float f3 = rectF.left;
        float f4 = (this.LJLJLLL * 3) / 2;
        rectF.left = f3 + f4;
        rectF.top += f4;
        rectF.right += f4;
        rectF.bottom += f4;
        RectF rectF2 = new RectF();
        this.LJLJLJ = rectF2;
        RectF rectF3 = this.LJLJJI;
        float f5 = rectF3.left;
        int i4 = this.LJLJLLL;
        float f6 = i4 / 2;
        rectF2.left = f5 - f6;
        rectF2.top = rectF3.top - f6;
        rectF2.right = rectF3.right + f6;
        rectF2.bottom = rectF3.bottom + f6;
        float f7 = (i4 * 3) / 2;
        matrix.postTranslate(f + f7, f2 + f7);
        this.LJLIL.setColor(this.LJLLL);
        this.LJLIL.setStyle(Paint.Style.STROKE);
        this.LJLIL.setStrokeWidth(this.LJLJLLL);
        if (this.LJLZ) {
            this.LJLILLLLZI.reset();
            Path path = this.LJLILLLLZI;
            RectF rectF4 = this.LJLJLJ;
            float f8 = LLF;
            int i5 = this.LJLJLLL;
            path.addRoundRect(rectF4, (i5 / 2) + f8, f8 + (i5 / 2), Path.Direction.CW);
            this.LJLILLLLZI.addPath(this.LJLJL, this.LJLL);
            this.LJLLILLLL.drawPath(this.LJLILLLLZI, this.LJLIL);
        }
        this.LJLIL.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        this.LJLIL.setColor(this.LJLLJ);
        this.LJLIL.setStyle(Paint.Style.FILL);
        this.LJLILLLLZI.reset();
        Path path2 = this.LJLILLLLZI;
        RectF rectF5 = this.LJLJJI;
        float f9 = LLF;
        path2.addRoundRect(rectF5, f9, f9, Path.Direction.CW);
        this.LJLILLLLZI.addPath(this.LJLJI, matrix);
        this.LJLLILLLL.drawPath(this.LJLILLLLZI, this.LJLIL);
        this.LJLIL.setXfermode(null);
        canvas.drawBitmap(this.LJLLI, 0.0f, 0.0f, (Paint) null);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 3 && this.LJZ) {
                    LIZ();
                }
            } else if (this.LJZ) {
                LIZ();
            }
        } else if (this.LJZ) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "alpha", 1.0f, 0.5f);
            ofFloat.setDuration(100L);
            ofFloat.start();
            ofFloat.addUpdateListener(new C136855Yr());
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setBgColor(int i) {
        this.LJLLJ = i;
    }

    public void setBorderColor(int i) {
        this.LJLLL = i;
    }

    public void setBubbleOrientation(int i) {
        this.LJLLLLLL = i;
    }

    public void setNeedPath(boolean z) {
        this.LJLZ = z;
    }

    public void setNeedPressFade(boolean z) {
        this.LJZ = z;
    }

    public static float LIZIZ(Context context, float f) {
        return (f * context.getResources().getDisplayMetrics().density) + 0.5f;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        TextView textView;
        int measuredWidth;
        int i3;
        int i4;
        super.onMeasure(i, i2);
        if (getChildAt(0) instanceof TextView) {
            textView = (TextView) getChildAt(0);
        } else {
            textView = null;
        }
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (textView != null) {
            measuredWidth = textView.getPaddingRight() + textView.getPaddingLeft() + ((int) textView.getPaint().measureText(textView.getText().toString()));
        } else {
            measuredWidth = getMeasuredWidth();
        }
        int i5 = this.LJLLLLLL;
        if (i5 == 2 || i5 == 1) {
            int i6 = LLFFF;
            if (measuredWidth > i6) {
                i6 = (LJZL * 2) + measuredWidth;
            }
            i3 = i6 + LJZI;
            i4 = LLFII;
        } else {
            i3 = LLFFF;
            if (measuredWidth > i3) {
                i3 = (LJZL * 2) + measuredWidth;
            }
            i4 = LLFII;
        }
        int i7 = this.LJLJLLL;
        int i8 = (i7 * 3) + i3;
        int i9 = (i7 * 3) + i4;
        if (mode == Integer.MIN_VALUE) {
            if (mode2 == Integer.MIN_VALUE) {
                setMeasuredDimension(i8, i9);
            }
            setMeasuredDimension(i8, size2);
        } else {
            if (mode != Integer.MIN_VALUE) {
                if (mode2 == Integer.MIN_VALUE) {
                    setMeasuredDimension(size, i9);
                }
            }
            setMeasuredDimension(i8, size2);
        }
        this.LJLJJL = getMeasuredWidth() - (this.LJLJLLL * 3);
        this.LJLJJLL = getMeasuredHeight() - (this.LJLJLLL * 3);
    }
}
