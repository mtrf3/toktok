package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Size;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ugc.effectcreator.canvas.CanvasImpl;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.aTX, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C93603aTX extends FrameLayout {
    public static int LJZI = -1;
    public static float LJZL = C93727aVX.LIZ(2.0f);
    public static float LL = C93727aVX.LIZ(1.0f);
    public final Paint LJLIL;
    public final Paint LJLILLLLZI;
    public final int LJLJI;
    public boolean LJLJJI;
    public boolean LJLJJL;
    public TextView LJLJJLL;
    public AbstractC94143acF LJLJL;
    public C94211adL LJLJLJ;
    public C94211adL LJLJLLL;
    public List<C94211adL> LJLL;
    public EnumC93697aV3 LJLLI;
    public final float LJLLILLLL;
    public final float LJLLJ;
    public final int LJLLL;
    public final int LJLLLL;
    public final C93782aWQ[] LJLLLLLL;
    public C93703aV9 LJLZ;
    public final C93775aWJ LJZ;

    private final Size getBareBottomLabelSizeWithMargin() {
        ViewGroup.LayoutParams layoutParams;
        View view;
        ViewGroup.LayoutParams layoutParams2 = null;
        if (this.LJLJJLL == null) {
            ViewStub viewStub = (ViewStub) findViewById(R.id.nqe);
            if (viewStub != null) {
                view = viewStub.inflate();
            } else {
                view = null;
            }
            TextView textView = (TextView) view;
            this.LJLJJLL = textView;
            if (textView != null) {
                C93729aVZ.LIZJ(textView);
            }
        }
        TextView textView2 = this.LJLJJLL;
        if (textView2 != null) {
            int visibility = textView2.getVisibility();
            TextView textView3 = this.LJLJJLL;
            if (textView3 != null) {
                C93729aVZ.LJI(textView3);
            }
            TextView textView4 = this.LJLJJLL;
            if (textView4 != null) {
                Context context = getContext();
                o.LJIIIIZZ(context, "context");
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(C116504hi.LIZIZ(context), LiveLayoutPreloadThreadPriority.DEFAULT);
                Context context2 = getContext();
                o.LJIIIIZZ(context2, "context");
                textView4.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(C116504hi.LIZ(context2), LiveLayoutPreloadThreadPriority.DEFAULT));
            }
            TextView textView5 = this.LJLJJLL;
            if (textView5 != null) {
                textView5.setVisibility(visibility);
            }
            TextView textView6 = this.LJLJJLL;
            if (textView6 != null) {
                layoutParams = textView6.getLayoutParams();
            } else {
                layoutParams = null;
            }
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                layoutParams2 = layoutParams;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
            if (marginLayoutParams == null) {
                marginLayoutParams = new ViewGroup.MarginLayoutParams(0, 0);
                marginLayoutParams.setMargins(0, 0, 0, 0);
            }
            TextView textView7 = this.LJLJJLL;
            if (textView7 != null) {
                return new Size(textView7.getMeasuredWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin, textView7.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin);
            }
            return new Size(0, 0);
        }
        return new Size(0, 0);
    }

    public final void LIZIZ() {
        C94211adL c94211adL = this.LJLJLJ;
        if (c94211adL != null) {
            Matrix matrix = new Matrix();
            matrix.setRotate(c94211adL.LJLJJL, c94211adL.LJLJI, c94211adL.LJLJJI);
            LIZ(new float[]{c94211adL.LJLJI - (c94211adL.LJLIL / 2.0f), c94211adL.LJLJJI}, this.LJLLLLLL[0], matrix);
            LIZ(new float[]{c94211adL.LJLJI + (c94211adL.LJLIL / 2.0f), c94211adL.LJLJJI}, this.LJLLLLLL[1], matrix);
            LIZ(new float[]{c94211adL.LJLJI, c94211adL.LJLJJI + (c94211adL.LJLILLLLZI / 2.0f)}, this.LJLLLLLL[2], matrix);
            LIZ(new float[]{c94211adL.LJLJI, c94211adL.LJLJJI - (c94211adL.LJLILLLLZI / 2.0f)}, this.LJLLLLLL[3], matrix);
            View findViewById = findViewById(R.id.np4);
            if (findViewById != null) {
                findViewById.setTranslationX((c94211adL.LJLJI + (c94211adL.LJLIL / 2.0f)) - findViewById.getWidth());
                findViewById.setTranslationY((c94211adL.LJLJJI + (c94211adL.LJLILLLLZI / 2.0f)) - findViewById.getHeight());
                findViewById.setPivotX(findViewById.getWidth() - (c94211adL.LJLIL / 2.0f));
                findViewById.setPivotY(findViewById.getHeight() - (c94211adL.LJLILLLLZI / 2.0f));
                findViewById.setRotation(c94211adL.LJLJJL);
            }
        } else {
            for (C93782aWQ c93782aWQ : this.LJLLLLLL) {
                C93729aVZ.LIZJ(c93782aWQ);
            }
        }
        invalidate();
    }

    public final C94211adL getContentRect() {
        if (this.LJLJLJ == null) {
            return null;
        }
        return this.LJLJLLL;
    }

    public final TextView getFlag() {
        View view;
        if (this.LJLJJLL == null) {
            ViewStub viewStub = (ViewStub) findViewById(R.id.nqe);
            if (viewStub != null) {
                view = viewStub.inflate();
            } else {
                view = null;
            }
            this.LJLJJLL = (TextView) view;
        }
        return this.LJLJJLL;
    }

    public final boolean getTouchMoving() {
        return this.LJLJJL;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Paint paint;
        Paint paint2;
        super.onDraw(canvas);
        if (this.LJLLI == EnumC93697aV3.EMPTY) {
            return;
        }
        int i = 0;
        for (C94211adL c94211adL : this.LJLL) {
            int i2 = i + 1;
            if (i >= 0) {
                C94211adL c94211adL2 = c94211adL;
                if (canvas != null) {
                    canvas.rotate(c94211adL2.LJLJJL, c94211adL2.LJLJI, c94211adL2.LJLJJI);
                }
                int i3 = C93785aWT.LIZ[this.LJLLI.ordinal()];
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (canvas == null) {
                            i = i2;
                        }
                        canvas.rotate(-c94211adL2.LJLJJL, c94211adL2.LJLJI, c94211adL2.LJLJJI);
                        i = i2;
                    } else if (canvas == null) {
                        i = i2;
                    } else {
                        float f = c94211adL2.LJLJI;
                        float f2 = c94211adL2.LJLIL;
                        int i4 = this.LJLJI;
                        float f3 = (f - (f2 / 2.0f)) + i4;
                        float f4 = c94211adL2.LJLJJI;
                        float f5 = c94211adL2.LJLILLLLZI;
                        float f6 = (f4 - (f5 / 2.0f)) + i4;
                        float f7 = (f + (f2 / 2.0f)) - i4;
                        float f8 = (f4 + (f5 / 2.0f)) - i4;
                        if (i == 0) {
                            paint2 = this.LJLIL;
                        } else {
                            paint2 = this.LJLILLLLZI;
                        }
                        canvas.drawOval(f3, f6, f7, f8, paint2);
                        canvas.rotate(-c94211adL2.LJLJJL, c94211adL2.LJLJI, c94211adL2.LJLJJI);
                        i = i2;
                    }
                } else if (canvas == null) {
                    i = i2;
                } else {
                    float f9 = c94211adL2.LJLJI;
                    float f10 = c94211adL2.LJLIL;
                    int i5 = this.LJLJI;
                    float f11 = (f9 - (f10 / 2.0f)) + i5;
                    float f12 = c94211adL2.LJLJJI;
                    float f13 = c94211adL2.LJLILLLLZI;
                    float f14 = (f12 - (f13 / 2.0f)) + i5;
                    float f15 = (f9 + (f10 / 2.0f)) - i5;
                    float f16 = (f12 + (f13 / 2.0f)) - i5;
                    float f17 = LL;
                    if (i == 0) {
                        paint = this.LJLIL;
                    } else {
                        paint = this.LJLILLLLZI;
                    }
                    canvas.drawRoundRect(f11, f14, f15, f16, f17, f17, paint);
                    canvas.rotate(-c94211adL2.LJLJJL, c94211adL2.LJLJI, c94211adL2.LJLJJI);
                    i = i2;
                }
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        CanvasImpl LIZIZ;
        C93703aV9 c93703aV9;
        boolean z;
        int i;
        int i2;
        float f;
        if (motionEvent != null) {
            if (motionEvent.getActionMasked() == 2) {
                this.LJLJJL = true;
            } else if (motionEvent.getActionMasked() == 3 || motionEvent.getActionMasked() == 1) {
                this.LJLJJL = false;
            }
        }
        if (!super.onTouchEvent(motionEvent) && motionEvent != null && (c93703aV9 = this.LJLZ) != null) {
            int actionMasked = motionEvent.getActionMasked();
            int pointerCount = motionEvent.getPointerCount();
            if (actionMasked != 0) {
                if (actionMasked != 1 && actionMasked != 3) {
                    if (actionMasked != 5) {
                        if (actionMasked == 6) {
                            c93703aV9.LJIILIIL.LJJJIL();
                        }
                    } else {
                        c93703aV9.LJIILIIL.LJJJI();
                    }
                } else {
                    c93703aV9.LJIILIIL.LJJIIZI(motionEvent);
                }
            } else {
                c93703aV9.LJIILIIL.onDown(motionEvent);
            }
            c93703aV9.LJIIJ.LIZ(motionEvent);
            if (actionMasked != 1 && actionMasked != 3) {
                if (actionMasked == 0 || actionMasked == 6 || actionMasked == 5) {
                    z = true;
                } else {
                    z = false;
                }
                if (actionMasked == 6) {
                    i = motionEvent.getActionIndex();
                    i2 = pointerCount - 1;
                } else {
                    i = -1;
                    i2 = pointerCount;
                }
                float f2 = 0.0f;
                float f3 = 0.0f;
                float f4 = 0.0f;
                for (int i3 = 0; i3 < pointerCount; i3++) {
                    if (i != i3) {
                        f3 += motionEvent.getX(i3);
                        f4 += motionEvent.getY(i3);
                    }
                }
                float f5 = i2;
                float f6 = f3 / f5;
                float f7 = f4 / f5;
                float f8 = 0.0f;
                float f9 = 0.0f;
                for (int i4 = 0; i4 < pointerCount; i4++) {
                    if (i != i4) {
                        f8 += Math.abs(motionEvent.getX(i4) - f6);
                        f9 += Math.abs(motionEvent.getY(i4) - f7);
                    }
                }
                float f10 = 2;
                float hypot = (float) Math.hypot((f8 / f5) * f10, f10 * (f9 / f5));
                int i5 = 0;
                loop2: while (true) {
                    if (i5 >= pointerCount) {
                        break;
                    }
                    if (i != i5) {
                        for (int i6 = i5 + 1; i6 < pointerCount; i6++) {
                            if (i != i6) {
                                double d = 360;
                                f2 = 0.0f + ((float) ((Math.toDegrees(Math.atan2(motionEvent.getY(i5) - motionEvent.getY(i6), motionEvent.getX(i5) - motionEvent.getX(i6))) + d) % d));
                                break loop2;
                            }
                        }
                    }
                    i5++;
                }
                if (z) {
                    c93703aV9.LJ = hypot;
                    c93703aV9.LJFF = hypot;
                    c93703aV9.LJI = f2;
                    c93703aV9.LJII = f2;
                    c93703aV9.LIZ = f6;
                    c93703aV9.LIZIZ = f7;
                    c93703aV9.LIZJ = f6;
                    c93703aV9.LIZLLL = f7;
                }
                if (actionMasked == 0) {
                    c93703aV9.LIZ = f6;
                    c93703aV9.LIZJ = f6;
                    c93703aV9.LIZIZ = f7;
                    c93703aV9.LIZLLL = f7;
                } else if (actionMasked == 2) {
                    c93703aV9.LIZ = f6;
                    c93703aV9.LIZIZ = f7;
                    c93703aV9.LJ = hypot;
                    c93703aV9.LJI = f2;
                    float f11 = c93703aV9.LJFF;
                    float f12 = 0;
                    if (f11 > f12 && hypot / f11 != 1.0f) {
                        InterfaceC93699aV5 interfaceC93699aV5 = c93703aV9.LJIILIIL;
                        if (f11 > f12) {
                            f = hypot / f11;
                        } else {
                            f = 1.0f;
                        }
                        interfaceC93699aV5.onScale(f);
                        c93703aV9.LJFF = c93703aV9.LJ;
                    }
                    if (Math.abs((int) (c93703aV9.LJI - c93703aV9.LJII)) >= 350.0f) {
                        c93703aV9.LJII = c93703aV9.LJI;
                    } else if (Math.abs((int) (c93703aV9.LJI - c93703aV9.LJII)) >= 1.0f) {
                        c93703aV9.LJIILIIL.LJJIZ((int) (c93703aV9.LJI - c93703aV9.LJII));
                        c93703aV9.LJII = c93703aV9.LJI;
                    }
                    float f13 = 1;
                    if (Math.abs(c93703aV9.LIZ - c93703aV9.LIZJ) >= f13 || Math.abs(c93703aV9.LIZIZ - c93703aV9.LIZLLL) >= f13) {
                        c93703aV9.LJIILIIL.LIZ(c93703aV9.LIZ - c93703aV9.LIZJ, c93703aV9.LIZIZ - c93703aV9.LIZLLL);
                        c93703aV9.LIZJ = c93703aV9.LIZ;
                        c93703aV9.LIZLLL = c93703aV9.LIZIZ;
                    }
                }
            }
        }
        C93775aWJ c93775aWJ = this.LJZ;
        c93775aWJ.getClass();
        if (motionEvent != null) {
            int action = motionEvent.getAction();
            if (action != 0) {
                if ((action != 1 && action != 3) || c93775aWJ.LIZ - motionEvent.getX() <= c93775aWJ.LIZIZ || (LIZIZ = C93991aZn.LIZIZ()) == null) {
                    return true;
                }
                LIZIZ.updateGestureEvent(new C93485aRd(EnumC93486aRe.SLIDE_BACK, motionEvent));
                return true;
            }
            c93775aWJ.LIZ = motionEvent.getX();
            return true;
        }
        return true;
    }

    public final void setActionListener(AbstractC94143acF listener) {
        o.LJIIIZ(listener, "listener");
        this.LJLJL = listener;
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        this.LJLZ = new C93703aV9(context, this, listener);
    }

    public final void setRectColor(int i) {
        LJZI = i;
        this.LJLIL.setColor(i);
    }

    public final void setRectCorner(float f) {
        LL = f;
    }

    public final void setRectStrokeWidth(float f) {
        LJZL = f;
        this.LJLIL.setStrokeWidth(f);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C93603aTX(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        o.LJIIIZ(context, "context");
        Paint paint = new Paint(1);
        paint.setColor(LJZI);
        paint.setDither(true);
        paint.setStyle(Paint.Style.STROKE);
        paint.setAntiAlias(true);
        paint.setStrokeWidth(LJZL);
        this.LJLIL = paint;
        Paint paint2 = new Paint(1);
        paint2.setColor(LJZI);
        paint2.setDither(true);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        paint2.setStrokeWidth(LJZL);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint2.setPathEffect(new DashPathEffect(new float[]{C93727aVX.LIZ(8.0f), C93727aVX.LIZ(8.0f)}, 0.0f));
        this.LJLILLLLZI = paint2;
        Resources system = Resources.getSystem();
        o.LJIIIIZZ(system, "Resources.getSystem()");
        this.LJLJI = (int) ((system.getDisplayMetrics().density * 0.0f) + 0.5f);
        this.LJLL = C61878OQg.INSTANCE;
        this.LJLLI = EnumC93697aV3.RECTANGLE;
        this.LJLLILLLL = C93727aVX.LIZ(0.0f);
        this.LJLLJ = C93727aVX.LIZ(0.0f);
        this.LJLLL = C93727aVX.LIZIZ(8);
        this.LJLLLL = C93727aVX.LIZIZ(40);
        C93782aWQ[] c93782aWQArr = new C93782aWQ[4];
        int i = 0;
        do {
            Context context2 = getContext();
            o.LJIIIIZZ(context2, "context");
            C93782aWQ c93782aWQ = new C93782aWQ(context2);
            int i2 = this.LJLLLL;
            addView(c93782aWQ, new FrameLayout.LayoutParams(i2, i2));
            int i3 = (this.LJLLLL - this.LJLLL) / 2;
            c93782aWQ.setPadding(i3, i3, i3, i3);
            c93782aWQ.setGestureCallback(new C94144acG(this, c93782aWQ));
            c93782aWQArr[i] = c93782aWQ;
            i++;
        } while (i < 4);
        this.LJLLLLLL = c93782aWQArr;
        this.LJZ = new C93775aWJ(context);
        setWillNotDraw(false);
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.dvv, this, true);
    }

    public final void LIZJ(C94211adL c94211adL, boolean z) {
        Float f;
        float f2;
        int i;
        int i2;
        int i3;
        Integer valueOf;
        Integer valueOf2;
        Integer valueOf3;
        View view;
        if (z) {
            TextView textView = this.LJLJJLL;
            Integer num = null;
            if (textView == null) {
                ViewStub viewStub = (ViewStub) findViewById(R.id.nqe);
                if (viewStub != null) {
                    view = viewStub.inflate();
                } else {
                    view = null;
                }
                this.LJLJJLL = (TextView) view;
            } else {
                C93729aVZ.LJI(textView);
            }
            Size bareBottomLabelSizeWithMargin = getBareBottomLabelSizeWithMargin();
            if (c94211adL != null) {
                float f3 = c94211adL.LJLIL;
                float f4 = this.LJLLILLLL;
                if (f3 < f4) {
                    f3 = f4;
                }
                f = Float.valueOf(f3);
            } else {
                f = null;
            }
            float f5 = 0.0f;
            if (f != null) {
                f2 = f.floatValue();
            } else {
                f2 = 0.0f;
            }
            if (c94211adL != null) {
                float f6 = c94211adL.LJLILLLLZI;
                float f7 = this.LJLLJ;
                if (f6 < f7) {
                    f6 = f7;
                }
                Float valueOf4 = Float.valueOf(f6);
                if (valueOf4 != null) {
                    f5 = valueOf4.floatValue();
                }
            }
            int width = bareBottomLabelSizeWithMargin.getWidth();
            TextView textView2 = this.LJLJJLL;
            if (textView2 != null) {
                num = Integer.valueOf(textView2.getPaddingLeft());
            }
            int i4 = 0;
            if (num != null) {
                i = num.intValue();
            } else {
                i = 0;
            }
            int i5 = width + i;
            TextView textView3 = this.LJLJJLL;
            if (textView3 != null && (valueOf3 = Integer.valueOf(textView3.getPaddingRight())) != null) {
                i2 = valueOf3.intValue();
            } else {
                i2 = 0;
            }
            if (f2 >= Math.max(i5 + i2, C93727aVX.LIZIZ(50))) {
                int height = bareBottomLabelSizeWithMargin.getHeight();
                TextView textView4 = this.LJLJJLL;
                if (textView4 != null && (valueOf2 = Integer.valueOf(textView4.getPaddingTop())) != null) {
                    i3 = valueOf2.intValue();
                } else {
                    i3 = 0;
                }
                int i6 = height + i3;
                TextView textView5 = this.LJLJJLL;
                if (textView5 != null && (valueOf = Integer.valueOf(textView5.getPaddingBottom())) != null) {
                    i4 = valueOf.intValue();
                }
                if (f5 >= Math.max(i6 + i4, C93727aVX.LIZIZ(50))) {
                    return;
                }
            }
            TextView textView6 = this.LJLJJLL;
            if (textView6 != null) {
                C93729aVZ.LIZJ(textView6);
                return;
            }
            return;
        }
        TextView textView7 = this.LJLJJLL;
        if (textView7 == null) {
            return;
        }
        C93729aVZ.LIZJ(textView7);
    }

    public static void LIZ(float[] fArr, C93782aWQ c93782aWQ, Matrix matrix) {
        C93729aVZ.LJI(c93782aWQ);
        matrix.mapPoints(fArr);
        c93782aWQ.setTranslationX(fArr[0] - (c93782aWQ.getWidth() / 2));
        c93782aWQ.setTranslationY(fArr[1] - (c93782aWQ.getHeight() / 2));
    }
}
