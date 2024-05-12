package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.59Y, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C59Y extends C54Y {
    public final Paint LJLL;
    public final float LJLLI;
    public final float LJLLILLLL;
    public final float LJLLJ;
    public final float LJLLL;
    public final float LJLLLL;
    public final float LJLLLLLL;
    public final float LJLZ;
    public final float LJZ;
    public final float LJZI;
    public final float LJZL;
    public final RectF LL;
    public final RectF LLD;
    public final RectF LLF;
    public final RectF LLFF;
    public C54B LLFFF;
    public InterfaceC88472Yns<? super MotionEvent, Boolean> LLFII;

    public final C54B getCurOperateHandle() {
        return this.LLFFF;
    }

    @Override // X.C54Y
    public InterfaceC88472Yns<MotionEvent, Boolean> getOnInterceptTouchListener() {
        return this.LLFII;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        getSelectFrameRect().top = this.LJLLI;
        getSelectFrameRect().bottom = getMeasuredHeight() - this.LJLLI;
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        Integer valueOf = Integer.valueOf(R.attr.dj);
        Integer LIZ = LIZ(context, valueOf);
        if (LIZ != null) {
            this.LJLL.setColor(LIZ.intValue());
        }
        this.LJLL.setStyle(Paint.Style.STROKE);
        this.LJLL.setStrokeWidth(this.LJLLI * 2);
        RectF selectFrameRect = getSelectFrameRect();
        float f = this.LJLLILLLL;
        canvas.drawRoundRect(selectFrameRect, f, f, this.LJLL);
        this.LJLL.setStyle(Paint.Style.FILL);
        this.LLD.set(getSelectFrameRect().left - this.LJLLJ, getSelectFrameRect().top + this.LJLLL, getSelectFrameRect().left + this.LJLLJ, getSelectFrameRect().top + this.LJLLL + this.LJLLLL);
        RectF rectF = this.LLFF;
        RectF rectF2 = this.LLD;
        float f2 = rectF2.left;
        float f3 = this.LJLLLLLL;
        rectF.set(f2 + f3, rectF2.top + f3, rectF2.right - f3, rectF2.bottom - f3);
        RectF rectF3 = this.LL;
        RectF rectF4 = this.LLFF;
        float f4 = rectF4.left;
        float f5 = this.LJLZ;
        float f6 = rectF4.top;
        float f7 = this.LJZ;
        rectF3.set(f4 + f5, f6 + f7, rectF4.right - f5, rectF4.bottom - f7);
        RectF rectF5 = this.LLFF;
        float f8 = this.LJZI;
        canvas.drawRoundRect(rectF5, f8, f8, this.LJLL);
        Context context2 = getContext();
        o.LJIIIIZZ(context2, "context");
        Integer LIZ2 = LIZ(context2, Integer.valueOf(R.attr.d5));
        if (LIZ2 != null) {
            this.LJLL.setColor(LIZ2.intValue());
        }
        RectF rectF6 = this.LL;
        float f9 = this.LJZL;
        canvas.drawRoundRect(rectF6, f9, f9, this.LJLL);
        this.LLF.set(getSelectFrameRect().right - this.LJLLJ, getSelectFrameRect().top + this.LJLLL, getSelectFrameRect().right + this.LJLLJ, getSelectFrameRect().top + this.LJLLL + this.LJLLLL);
        RectF rectF7 = this.LLFF;
        RectF rectF8 = this.LLF;
        float f10 = rectF8.left;
        float f11 = this.LJLLLLLL;
        rectF7.set(f10 + f11, rectF8.top + f11, rectF8.right - f11, rectF8.bottom - f11);
        RectF rectF9 = this.LL;
        RectF rectF10 = this.LLFF;
        float f12 = rectF10.left;
        float f13 = this.LJLZ;
        float f14 = rectF10.top;
        float f15 = this.LJZ;
        rectF9.set(f12 + f13, f14 + f15, rectF10.right - f13, rectF10.bottom - f15);
        Context context3 = getContext();
        o.LJIIIIZZ(context3, "context");
        Integer LIZ3 = LIZ(context3, valueOf);
        if (LIZ3 != null) {
            this.LJLL.setColor(LIZ3.intValue());
        }
        RectF rectF11 = this.LLFF;
        float f16 = this.LJZI;
        canvas.drawRoundRect(rectF11, f16, f16, this.LJLL);
        Context context4 = getContext();
        o.LJIIIIZZ(context4, "context");
        Integer LIZ4 = LIZ(context4, Integer.valueOf(R.attr.d5));
        if (LIZ4 != null) {
            this.LJLL.setColor(LIZ4.intValue());
        }
        RectF rectF12 = this.LL;
        float f17 = this.LJZL;
        canvas.drawRoundRect(rectF12, f17, f17, this.LJLL);
    }

    public final void setCurOperateHandle(C54B c54b) {
        this.LLFFF = c54b;
    }

    @Override // X.C54Y
    public void setOnInterceptTouchListener(InterfaceC88472Yns<? super MotionEvent, Boolean> interfaceC88472Yns) {
        this.LLFII = interfaceC88472Yns;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C59Y(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        Paint paint = new Paint();
        this.LJLL = paint;
        this.LJLLI = C134845Qy.LIZ(1.0f);
        this.LJLLILLLL = C134845Qy.LIZ(6.0f);
        this.LJLLJ = C134845Qy.LIZ(19.0f);
        this.LJLLL = C134845Qy.LIZ(0.0f);
        this.LJLLLL = C134845Qy.LIZ(52.0f);
        this.LJLLLLLL = C134845Qy.LIZ(12.0f);
        this.LJLZ = C134845Qy.LIZ(6.0f);
        this.LJZ = C134845Qy.LIZ(8.0f);
        this.LJZI = C134845Qy.LIZ(8.0f);
        this.LJZL = C134845Qy.LIZ(2.0f);
        this.LL = new RectF();
        this.LLD = new RectF();
        this.LLF = new RectF();
        this.LLFF = new RectF();
        paint.setAntiAlias(true);
        this.LLFII = new AqS168S0100000_2(this, 502);
    }

    public final Integer LIZ(Context context, Integer num) {
        if (num == null) {
            return null;
        }
        return C79045V0n.LJI(num.intValue(), context);
    }
}
