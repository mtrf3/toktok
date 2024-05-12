package X;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.8Mm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C210128Mm extends View {
    public static final /* synthetic */ int LJLLJ = 0;
    public final RectF LJLIL;
    public final Path LJLILLLLZI;
    public final float[] LJLJI;
    public int LJLJJI;
    public int LJLJJL;
    public int LJLJJLL;
    public float LJLJL;
    public long LJLJLJ;
    public ValueAnimator LJLJLLL;
    public final float LJLL;
    public final Paint LJLLI;
    public final Paint LJLLILLLL;
    public float drawPercentProgress;

    public final float getDrawPercentProgress() {
        return this.drawPercentProgress;
    }

    public final int getOrientation() {
        return this.LJLJJI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C210128Mm(Context context) {
        super(context, null, 0);
        new LinkedHashMap();
        this.LJLIL = new RectF();
        this.LJLILLLLZI = new Path();
        this.LJLJI = new float[8];
        this.LJLJJL = -1;
        Integer LJI = C79045V0n.LJI(R.attr.dn, context);
        this.LJLJJLL = LJI != null ? LJI.intValue() : 0;
        this.LJLJL = C32151Nz.LJIIZILJ(Double.valueOf(1.5d));
        this.LJLJLJ = 300L;
        this.LJLL = C32151Nz.LJIIZILJ(2);
        Paint LIZIZ = C6D8.LIZIZ(true);
        LIZIZ.setColor(this.LJLJJL);
        LIZIZ.setStyle(Paint.Style.FILL);
        this.LJLLI = LIZIZ;
        Paint LIZIZ2 = C6D8.LIZIZ(true);
        LIZIZ2.setColor(this.LJLJJLL);
        LIZIZ2.setStyle(Paint.Style.FILL);
        this.LJLLILLLL = LIZIZ2;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (canvas != null) {
            if (getOrientation() == 0) {
                this.LJLIL.set(0.0f, 0.0f, getWidth(), this.LJLL + 0.0f);
            } else {
                this.LJLIL.set(0.0f, 0.0f, getWidth(), getHeight());
            }
            this.LJLLILLLL.setColor(this.LJLJJLL);
            RectF rectF = this.LJLIL;
            float f = this.LJLJL;
            canvas.drawRoundRect(rectF, f, f, this.LJLLILLLL);
            this.LJLILLLLZI.reset();
            Arrays.fill(this.LJLJI, 0.0f);
            this.LJLLI.setColor(this.LJLJJL);
            if (getOrientation() == 0) {
                float width = getWidth() * this.drawPercentProgress;
                float width2 = getWidth();
                float f2 = this.LJLJL;
                if (width2 > f2) {
                    if (this.drawPercentProgress == 0.0f) {
                        this.LJLIL.set(0.0f, 0.0f, width, this.LJLL + 0.0f);
                        this.LJLILLLLZI.addRoundRect(this.LJLIL, this.LJLJI, Path.Direction.CW);
                        canvas.drawPath(this.LJLILLLLZI, this.LJLLI);
                        return;
                    }
                    Context context = getContext();
                    o.LJIIIIZZ(context, "context");
                    if (C26338AVi.LIZJ(context)) {
                        this.LJLIL.set(getWidth() - (this.LJLJL * 2), 0.0f, getWidth(), this.LJLL + 0.0f);
                    } else {
                        this.LJLIL.set(0.0f, 0.0f, this.LJLJL * 2, this.LJLL + 0.0f);
                    }
                    RectF rectF2 = this.LJLIL;
                    float f3 = this.LJLJL;
                    canvas.drawRoundRect(rectF2, f3, f3, this.LJLLI);
                    Arrays.fill(this.LJLJI, 0.0f);
                    Context context2 = getContext();
                    o.LJIIIIZZ(context2, "context");
                    if (C26338AVi.LIZJ(context2)) {
                        LIZ(EnumC210138Mn.TOP_LEFT, this.LJLJL);
                        LIZ(EnumC210138Mn.BOTTOM_LEFT, this.LJLJL);
                        LIZ(EnumC210138Mn.TOP_RIGHT, this.LJLJL);
                        LIZ(EnumC210138Mn.BOTTOM_RIGHT, this.LJLJL);
                    } else {
                        LIZ(EnumC210138Mn.TOP_RIGHT, this.LJLJL);
                        LIZ(EnumC210138Mn.BOTTOM_RIGHT, this.LJLJL);
                    }
                    Context context3 = getContext();
                    o.LJIIIIZZ(context3, "context");
                    if (C26338AVi.LIZJ(context3)) {
                        this.LJLIL.set(getWidth() - width, 0.0f, getWidth(), this.LJLL + 0.0f);
                    } else {
                        this.LJLIL.set(this.LJLJL, 0.0f, width, this.LJLL + 0.0f);
                    }
                    this.LJLILLLLZI.addRoundRect(this.LJLIL, this.LJLJI, Path.Direction.CW);
                    canvas.drawPath(this.LJLILLLLZI, this.LJLLI);
                    return;
                }
                LIZ(EnumC210138Mn.TOP_LEFT, f2);
                LIZ(EnumC210138Mn.BOTTOM_LEFT, this.LJLJL);
                LIZ(EnumC210138Mn.TOP_RIGHT, this.LJLJL);
                LIZ(EnumC210138Mn.BOTTOM_RIGHT, this.LJLJL);
                this.LJLIL.set(0.0f, 0.0f, width, this.LJLL + 0.0f);
                this.LJLILLLLZI.addRoundRect(this.LJLIL, this.LJLJI, Path.Direction.CW);
                canvas.drawPath(this.LJLILLLLZI, this.LJLLI);
                return;
            }
            float height = getHeight() * this.drawPercentProgress;
            float height2 = getHeight();
            float f4 = this.LJLJL;
            if (height2 > f4) {
                if (this.drawPercentProgress == 0.0f) {
                    this.LJLIL.set(0.0f, 0.0f, getWidth(), height);
                    this.LJLILLLLZI.addRoundRect(this.LJLIL, this.LJLJI, Path.Direction.CW);
                    canvas.drawPath(this.LJLILLLLZI, this.LJLLI);
                    return;
                }
                this.LJLIL.set(0.0f, 0.0f, getWidth(), this.LJLJL);
                RectF rectF3 = this.LJLIL;
                float f5 = this.LJLJL;
                canvas.drawRoundRect(rectF3, f5, f5, this.LJLLI);
                Arrays.fill(this.LJLJI, 0.0f);
                LIZ(EnumC210138Mn.BOTTOM_LEFT, this.LJLJL);
                LIZ(EnumC210138Mn.BOTTOM_RIGHT, this.LJLJL);
                this.LJLIL.set(0.0f, this.LJLJL / 2, getWidth(), height);
                this.LJLILLLLZI.addRoundRect(this.LJLIL, this.LJLJI, Path.Direction.CW);
                canvas.drawPath(this.LJLILLLLZI, this.LJLLI);
                return;
            }
            LIZ(EnumC210138Mn.TOP_LEFT, f4);
            LIZ(EnumC210138Mn.BOTTOM_LEFT, this.LJLJL);
            LIZ(EnumC210138Mn.TOP_RIGHT, this.LJLJL);
            LIZ(EnumC210138Mn.BOTTOM_RIGHT, this.LJLJL);
            this.LJLIL.set(0.0f, 0.0f, getWidth(), height);
            this.LJLILLLLZI.addRoundRect(this.LJLIL, this.LJLJI, Path.Direction.CW);
            canvas.drawPath(this.LJLILLLLZI, this.LJLLI);
        }
    }

    public final void setAnimationInterval(long j) {
        this.LJLJLJ = j;
    }

    public final void setDrawPercentProgress(float f) {
        this.drawPercentProgress = f;
        invalidate();
    }

    public final void setOrientation(int i) {
        this.LJLJJI = i;
    }

    public final void setProgressBarConfig(C210078Mh c210078Mh) {
        if (c210078Mh != null) {
            int i = c210078Mh.LIZIZ;
            if (i > 0) {
                this.LJLJJLL = i;
            }
            int i2 = c210078Mh.LIZ;
            if (i2 > 0) {
                this.LJLJJL = i2;
            }
        }
    }

    public final void LIZ(EnumC210138Mn enumC210138Mn, float f) {
        int ordinal = enumC210138Mn.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        return;
                    }
                    float[] fArr = this.LJLJI;
                    fArr[6] = f;
                    fArr[7] = f;
                    return;
                }
                float[] fArr2 = this.LJLJI;
                fArr2[4] = f;
                fArr2[5] = f;
                return;
            }
            float[] fArr3 = this.LJLJI;
            fArr3[2] = f;
            fArr3[3] = f;
            return;
        }
        float[] fArr4 = this.LJLJI;
        fArr4[0] = f;
        fArr4[1] = f;
    }

    public final void LIZIZ(float f, boolean z) {
        boolean z2;
        float f2 = this.drawPercentProgress;
        if (f > 0.0f && f <= f2) {
            setDrawPercentProgress(f);
            return;
        }
        if (getWidth() > 0 && getHeight() > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z && z2 && f > f2 && f < 1.0f) {
            clearAnimation();
            ValueAnimator valueAnimator = this.LJLJLLL;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "drawPercentProgress", f2, f);
            C149985uc.LIZ(ofFloat);
            ofFloat.setDuration(this.LJLJLJ);
            ofFloat.setAutoCancel(true);
            this.LJLJLLL = ofFloat;
            ofFloat.start();
            return;
        }
        ValueAnimator valueAnimator2 = this.LJLJLLL;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        setDrawPercentProgress(f);
    }
}
