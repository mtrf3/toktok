package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.59h, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1302559h extends View {
    public final C1302859k LJLIL;
    public EnumC127354zD LJLILLLLZI;
    public final Drawable LJLJI;
    public final Drawable LJLJJI;
    public final Rect LJLJJL;
    public final Rect LJLJJLL;
    public final RectF LJLJL;
    public final RectF LJLJLJ;
    public final Paint LJLJLLL;
    public final C1303059m LJLL;
    public final C1303059m LJLLI;
    public float LJLLILLLL;
    public float LJLLJ;
    public final int LJLLL;
    public final int LJLLLL;
    public boolean LJLLLLLL;
    public Animation LJLZ;
    public C1303059m LJZ;

    public final C1303059m getLeftHandler() {
        return this.LJLL;
    }

    public final C1303059m getRightHandler() {
        return this.LJLLI;
    }

    public final C1303059m getTargetHandler() {
        return this.LJZ;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        EnumC127354zD enumC127354zD;
        super.onDraw(canvas);
        if (canvas == null || (enumC127354zD = this.LJLILLLLZI) == EnumC127354zD.NONE) {
            return;
        }
        if (enumC127354zD == EnumC127354zD.LINE) {
            this.LJLJLLL.setColor(this.LJLLL);
            RectF rectF = this.LJLJL;
            float f = this.LJLLILLLL;
            canvas.drawRoundRect(rectF, f, f, this.LJLJLLL);
            this.LJLJLLL.setColor(this.LJLLLL);
            RectF rectF2 = this.LJLJLJ;
            float f2 = this.LJLLJ;
            canvas.drawRoundRect(rectF2, f2, f2, this.LJLJLLL);
            return;
        }
        if (enumC127354zD == EnumC127354zD.CLIP) {
            Drawable drawable = this.LJLJI;
            if (drawable != null) {
                drawable.setBounds(this.LJLJJL);
                drawable.draw(canvas);
            }
            Drawable drawable2 = this.LJLJJI;
            if (drawable2 != null) {
                drawable2.setBounds(this.LJLJJLL);
                drawable2.draw(canvas);
            }
            this.LJLJLLL.setColor(this.LJLLL);
            canvas.drawRect(this.LJLIL.LJFF, 0.0f, getWidth() - this.LJLIL.LJFF, getHeight(), this.LJLJLLL);
            this.LJLJLLL.setColor(this.LJLLLL);
            C1302859k c1302859k = this.LJLIL;
            canvas.drawRect(c1302859k.LJFF, c1302859k.LJI, getWidth() - this.LJLIL.LJFF, getHeight() - this.LJLIL.LJI, this.LJLJLLL);
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [X.Yns, X.Prl] */
    /* JADX WARN: Type inference failed for: r1v6, types: [X.Yns, X.Prl] */
    /* JADX WARN: Type inference failed for: r2v3, types: [X.Ynr, X.Prl] */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent == null || this.LJLILLLLZI != EnumC127354zD.CLIP) {
            return false;
        }
        if (motionEvent.getAction() == 0) {
            this.LJZ = null;
            if (this.LJLJJL.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                this.LJZ = this.LJLL;
            }
            if (this.LJLJJLL.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                this.LJZ = this.LJLLI;
            }
        }
        C1303059m c1303059m = this.LJZ;
        if (c1303059m == null || !c1303059m.LJ) {
            return false;
        }
        Integer valueOf = Integer.valueOf(motionEvent.getAction());
        if (valueOf != null) {
            if (valueOf.intValue() == 0) {
                c1303059m.LJFF = motionEvent.getRawX();
                c1303059m.LIZ = motionEvent.getX();
                c1303059m.LJI = motionEvent.getRawX();
                ?? r1 = c1303059m.LIZLLL;
                if (r1 != 0) {
                    r1.invoke(Float.valueOf(c1303059m.LIZ));
                }
            } else if (valueOf.intValue() == 2) {
                ?? r2 = c1303059m.LIZIZ;
                if (r2 != 0) {
                    r2.invoke(Float.valueOf(motionEvent.getRawX() - c1303059m.LJI), Float.valueOf(motionEvent.getRawX()));
                }
                c1303059m.LJI = motionEvent.getRawX();
            } else if (valueOf.intValue() == 1) {
                float rawX = motionEvent.getRawX();
                ?? r12 = c1303059m.LIZJ;
                if (r12 != 0) {
                    r12.invoke(Float.valueOf(rawX - c1303059m.LJFF));
                }
            }
        }
        return true;
    }

    public final void setHandlerGone(boolean z) {
        this.LJLLLLLL = z;
    }

    public final void setTargetHandler(C1303059m c1303059m) {
        this.LJZ = c1303059m;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1302559h(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        int i;
        int i2;
        new LinkedHashMap();
        C1302859k c1302859k = C1291054w.LJ().LIZ;
        this.LJLIL = c1302859k;
        this.LJLILLLLZI = EnumC127354zD.NONE;
        this.LJLJI = c1302859k.LIZ;
        this.LJLJJI = c1302859k.LIZIZ;
        this.LJLJJL = new Rect();
        this.LJLJJLL = new Rect();
        this.LJLJL = new RectF();
        this.LJLJLJ = new RectF();
        C221108m2.LIZIZ(new AqS152S0100000_2(this, 47));
        Paint paint = new Paint();
        this.LJLJLLL = paint;
        this.LJLL = new C1303059m();
        this.LJLLI = new C1303059m();
        float f = c1302859k.LJ;
        this.LJLLILLLL = f;
        this.LJLLJ = f / 2.0f;
        Integer num = c1302859k.LIZJ;
        if (num != null) {
            i = num.intValue();
        } else {
            i = -1;
        }
        this.LJLLL = i;
        Integer num2 = c1302859k.LIZLLL;
        if (num2 != null) {
            i2 = num2.intValue();
        } else {
            i2 = -16777216;
        }
        this.LJLLLL = i2;
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(i);
        paint.setAntiAlias(true);
    }

    public final void LIZ(EnumC127354zD style, boolean z) {
        o.LJIIIZ(style, "style");
        this.LJLILLLLZI = style;
        setHandlerGone(false);
        C1302859k c1302859k = this.LJLIL;
        this.LJLLJ = c1302859k.LJIIIIZZ;
        this.LJLLILLLL = c1302859k.LJ;
        if (z) {
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(500L);
            setAnimation(alphaAnimation);
            this.LJLZ = alphaAnimation;
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int i5 = i3 - i;
        int i6 = i4 - i2;
        if (this.LJLLLLLL) {
            this.LJLJJL.set(0, 0, 0, 0);
            this.LJLJJLL.set(0, 0, 0, 0);
            C77275UUl.LJI(this.LJLJL, 0, 0, i5, i6);
            RectF rectF = this.LJLJLJ;
            int i7 = this.LJLIL.LJI;
            C77275UUl.LJI(rectF, i7, i7, i5 - i7, i6 - i7);
            return;
        }
        this.LJLJJL.set(0, 0, this.LJLIL.LJFF, i6);
        this.LJLJJLL.set(i5 - this.LJLIL.LJFF, 0, i5, i6);
        RectF rectF2 = this.LJLJL;
        C1302859k c1302859k = this.LJLIL;
        int i8 = c1302859k.LJFF;
        int i9 = c1302859k.LJI;
        C77275UUl.LJI(rectF2, i8 - i9, 0, (i5 - i8) + i9, i6);
        RectF rectF3 = this.LJLJLJ;
        C1302859k c1302859k2 = this.LJLIL;
        int i10 = c1302859k2.LJFF;
        int i11 = c1302859k2.LJI;
        C77275UUl.LJI(rectF3, i10, i11, i5 - i10, i6 - i11);
    }
}
