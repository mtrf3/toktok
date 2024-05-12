package X;

import Y.ARunnableS38S0100000_2;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Region;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.5Pj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C134435Pj extends View {
    public static final float LLIIIJ = C134855Qz.LIZ(1.5f);
    public static final float LLIIIL = C134855Qz.LIZ(3.0f);
    public static final float LLIIIZ = C134855Qz.LIZ(20.0f);
    public static final float LLIIJI;
    public static final float LLIIJLIL;
    public static final float LLIIL;
    public static final float LLIILII;
    public static final float LLIILZL;
    public static final float LLIIZ;
    public static final int LLIL;
    public static final int LLILII;
    public final Paint LJLIL;
    public final Paint LJLILLLLZI;
    public final Paint LJLJI;
    public final Paint LJLJJI;
    public final Paint LJLJJL;
    public final Paint LJLJJLL;
    public final Paint LJLJL;
    public final Paint LJLJLJ;
    public int LJLJLLL;
    public final int LJLL;
    public final int LJLLI;
    public final int LJLLILLLL;
    public final RectF LJLLJ;
    public final RectF LJLLL;
    public final Region LJLLLL;
    public final Region LJLLLLLL;
    public EnumC134445Pk LJLZ;
    public EnumC134445Pk LJZ;
    public int LJZI;
    public float LJZL;
    public float LL;
    public boolean LLD;
    public boolean LLF;
    public final int LLFF;
    public final int LLFFF;
    public int LLFII;
    public int LLFZ;
    public boolean LLI;
    public boolean LLIFFJFJJ;
    public C56A LLII;
    public C56A LLIIII;
    public final ARunnableS38S0100000_2 LLIIIILZ;

    public final void setOnIndicatorChangedListener(InterfaceC134475Pn l) {
        o.LJIIIZ(l, "l");
    }

    static {
        float LIZ = C134855Qz.LIZ(20.0f);
        LLIIJI = LIZ;
        float LIZ2 = C134855Qz.LIZ(16.0f);
        LLIIJLIL = LIZ2;
        LLIIL = C134855Qz.LIZ(1.0f);
        LLIILII = C134855Qz.LIZ(1.5f);
        float LIZ3 = C134855Qz.LIZ(6.5f);
        LLIILZL = LIZ3;
        LLIIZ = C134855Qz.LIZ(2.0f);
        LLIL = C134855Qz.LIZ(200.0f);
        LLILII = (int) ((LIZ3 * 2) + C134855Qz.LIZ(30.0f) + LIZ2 + LIZ);
    }

    private final void setUp(Context context) {
        int i;
        Resources resources;
        if (context != null && (resources = context.getResources()) != null) {
            i = resources.getColor(R.color.py);
        } else {
            i = -7829368;
        }
        this.LJLJLLL = i;
        this.LJLIL.setStyle(Paint.Style.FILL_AND_STROKE);
        this.LJLIL.setStrokeWidth(LLIIZ);
        this.LJLILLLLZI.setStyle(Paint.Style.FILL_AND_STROKE);
        this.LJLILLLLZI.setColor(this.LJLL);
        this.LJLILLLLZI.setStrokeCap(Paint.Cap.ROUND);
        this.LJLILLLLZI.setStrokeJoin(Paint.Join.ROUND);
        this.LJLJJI.setStyle(Paint.Style.FILL_AND_STROKE);
        this.LJLJJI.setColor(this.LJLL);
        Paint paint = this.LJLJJI;
        float f = LLIIL;
        paint.setStrokeWidth(f);
        this.LJLJJI.setStrokeCap(Paint.Cap.ROUND);
        this.LJLJJLL.setStyle(Paint.Style.STROKE);
        this.LJLJJLL.setColor(this.LJLLILLLL);
        Paint paint2 = this.LJLJJLL;
        float f2 = LLIILII;
        paint2.setStrokeWidth(f2);
        this.LJLJJLL.setStrokeCap(Paint.Cap.ROUND);
        this.LJLJI.setStyle(Paint.Style.FILL_AND_STROKE);
        this.LJLJI.setColor(this.LJLLI);
        this.LJLJI.setStrokeCap(Paint.Cap.ROUND);
        this.LJLJI.setStrokeJoin(Paint.Join.ROUND);
        this.LJLJJL.setStyle(Paint.Style.FILL_AND_STROKE);
        this.LJLJJL.setColor(this.LJLLI);
        this.LJLJJL.setStrokeWidth(f);
        this.LJLJJL.setStrokeCap(Paint.Cap.ROUND);
        this.LJLJL.setStyle(Paint.Style.STROKE);
        this.LJLJL.setColor(this.LJLLILLLL);
        this.LJLJL.setStrokeWidth(f2);
        this.LJLJL.setStrokeCap(Paint.Cap.ROUND);
        this.LJLJLJ.setTextSize(C134855Qz.LIZ(12.0f));
        this.LJLJLJ.setColor(ColorProtector.parseColor("#CCFFFFFF"));
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x015d  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onDraw(android.graphics.Canvas r28) {
        /*
            Method dump skipped, instructions count: 478
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C134435Pj.onDraw(android.graphics.Canvas):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001d, code lost:
    
        if (r1 != 3) goto L11;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
            Method dump skipped, instructions count: 417
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C134435Pj.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setDesireTouchArea(EnumC134445Pk touchArea) {
        o.LJIIIZ(touchArea, "touchArea");
        EnumC134445Pk enumC134445Pk = EnumC134445Pk.LEFT_INDICATOR;
        if (touchArea == enumC134445Pk && this.LLFZ == this.LLFFF) {
            this.LJLZ = EnumC134445Pk.RIGHT_INDICATOR;
        } else if (touchArea == EnumC134445Pk.RIGHT_INDICATOR && this.LLFII == this.LLFFF) {
            this.LJLZ = enumC134445Pk;
        } else {
            this.LJLZ = touchArea;
        }
        this.LJZ = touchArea;
        postInvalidate();
    }

    public final void setEnableLeftIndicator(boolean z) {
        this.LLI = z;
        if (!z) {
            this.LLFII = 0;
        }
        postInvalidate();
    }

    public final void setEnableRightIndicator(boolean z) {
        this.LLIFFJFJJ = z;
        if (!z) {
            this.LLFZ = 0;
        }
        postInvalidate();
    }

    public final void setProcessLeftTextPosition(C56A position) {
        o.LJIIIZ(position, "position");
        this.LLII = position;
        postInvalidate();
    }

    public final void setProcessRightTextPosition(C56A position) {
        o.LJIIIZ(position, "position");
        this.LLIIII = position;
        postInvalidate();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C134435Pj(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        new LinkedHashMap();
        this.LJLIL = new Paint(1);
        this.LJLILLLLZI = new Paint(1);
        this.LJLJI = new Paint(1);
        this.LJLJJI = new Paint(1);
        this.LJLJJL = new Paint(1);
        this.LJLJJLL = new Paint(1);
        this.LJLJL = new Paint(1);
        this.LJLJLJ = new Paint(1);
        this.LJLJLLL = -7829368;
        this.LJLL = ColorProtector.parseColor("#fe6646");
        this.LJLLI = ColorProtector.parseColor("#5e76ee");
        this.LJLLILLLL = -1;
        this.LJLLJ = new RectF();
        this.LJLLL = new RectF();
        this.LJLLLL = new Region();
        this.LJLLLLLL = new Region();
        EnumC134445Pk enumC134445Pk = EnumC134445Pk.OTHER;
        this.LJLZ = enumC134445Pk;
        this.LJZ = enumC134445Pk;
        this.LLD = true;
        this.LLF = true;
        this.LLFF = 1;
        this.LLFFF = 100;
        this.LLI = true;
        this.LLIFFJFJJ = true;
        this.LLII = C56A.UP;
        this.LLIIII = C56A.DOWN;
        this.LLIIIILZ = new ARunnableS38S0100000_2(this, 0);
        setUp(context);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        if (mode == 1073741824) {
            i3 = View.MeasureSpec.getSize(i);
        } else {
            i3 = LLIL;
        }
        if (mode2 == 1073741824) {
            i4 = View.MeasureSpec.getSize(i2);
        } else {
            i4 = LLILII;
        }
        setMeasuredDimension(i3, i4);
    }

    public final void LIZ(float f, float f2, Canvas canvas, float f3, float f4, float f5) {
        float f6;
        canvas.drawCircle(f, f3, LLIILZL, this.LJLJJLL);
        RectF rectF = this.LJLLJ;
        float f7 = LLIIIZ;
        float f8 = 2;
        float f9 = f2 - 1;
        rectF.set((f - (f7 / f8)) + f5, f9, (f7 / f8) + f + f5, LLIIJI + f9);
        String valueOf = String.valueOf(this.LLFII);
        if (this.LLD) {
            float measureText = this.LJLJLJ.measureText(valueOf);
            if (this.LLII == C56A.UP) {
                f6 = f4 + this.LJLJLJ.getFontMetrics().descent;
            } else {
                f6 = f4 - this.LJLJLJ.getFontMetrics().descent;
            }
            canvas.drawText(valueOf, f - (measureText / 2.0f), f6, this.LJLJLJ);
        }
    }

    public final void LIZIZ(float f, float f2, Canvas canvas, float f3, float f4, float f5) {
        float f6;
        canvas.drawCircle(f, f3, LLIILZL, this.LJLJL);
        RectF rectF = this.LJLLL;
        float f7 = LLIIIZ;
        float f8 = 2;
        float f9 = f2 - 1;
        rectF.set((f - (f7 / f8)) + f5, f9, (f7 / f8) + f + f5, LLIIJI + f9);
        String valueOf = String.valueOf(this.LLFZ);
        if (this.LLF) {
            float measureText = this.LJLJLJ.measureText(valueOf);
            if (this.LLIIII == C56A.UP) {
                f6 = f4 + this.LJLJLJ.getFontMetrics().descent;
            } else {
                f6 = f4 - this.LJLJLJ.getFontMetrics().descent;
            }
            canvas.drawText(valueOf, f - (measureText / 2.0f), f6, this.LJLJLJ);
        }
    }
}
