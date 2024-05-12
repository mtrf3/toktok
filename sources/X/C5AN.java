package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.5AN, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5AN extends C54Y {
    public final C62822Ol8 LJLL;
    public final Paint LJLLI;
    public final T5S LJLLILLLL;
    public final float LJLLJ;
    public final float LJLLL;
    public final float LJLLLL;
    public final float LJLLLLLL;
    public final float LJLZ;
    public final float LJZ;
    public final float LJZI;
    public final float LJZL;
    public final float LL;
    public final Rect LLD;
    public final float LLF;
    public InterfaceC88472Yns<? super MotionEvent, Boolean> LLFF;

    @Override // X.C54Y
    public InterfaceC88472Yns<MotionEvent, Boolean> getOnInterceptTouchListener() {
        return this.LLFF;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Integer LJI;
        float f;
        float f2;
        Integer LJI2;
        o.LJIIIZ(canvas, "canvas");
        getSelectFrameRect().top = this.LJZ;
        getSelectFrameRect().bottom = getMeasuredHeight() - this.LJZ;
        this.LJLLI.setStyle(Paint.Style.FILL);
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        Integer valueOf = Integer.valueOf(R.attr.d9);
        if (valueOf != null && (LJI = C79045V0n.LJI(valueOf.intValue(), context)) != null) {
            this.LJLLI.setColor(LJI.intValue());
        }
        canvas.save();
        canvas.clipRect(getSelectFrameRect());
        String LIZ = C1298557t.LIZ(getSelectFrameRect().width() / getScale());
        this.LJLLILLLL.getTextBounds(LIZ, 0, LIZ.length(), this.LLD);
        float width = (2 * this.LJZI) + this.LLD.width();
        if (((Boolean) this.LJLL.getValue()).booleanValue()) {
            f = getSelectFrameRect().right - this.LJLLLL;
        } else {
            f = getSelectFrameRect().left + this.LJLLLL;
        }
        if (((Boolean) this.LJLL.getValue()).booleanValue()) {
            f2 = f - width;
        } else {
            f2 = f;
        }
        float f3 = getSelectFrameRect().top + this.LJLLLLLL;
        if (!((Boolean) this.LJLL.getValue()).booleanValue()) {
            f += width;
        }
        float f4 = this.LJLZ + f3;
        float f5 = this.LJLLL;
        canvas.drawRoundRect(f2, f3, f, f4, f5, f5, this.LJLLI);
        canvas.drawText(LIZ, f2 + this.LJZI, f4 - this.LJZL, this.LJLLILLLL);
        canvas.restore();
        Context context2 = getContext();
        o.LJIIIIZZ(context2, "context");
        Integer valueOf2 = Integer.valueOf(R.attr.dj);
        if (valueOf2 != null && (LJI2 = C79045V0n.LJI(valueOf2.intValue(), context2)) != null) {
            this.LJLLI.setColor(LJI2.intValue());
        }
        this.LJLLI.setStyle(Paint.Style.STROKE);
        this.LJLLI.setStrokeWidth(C134845Qy.LIZ(2.0f));
        RectF selectFrameRect = getSelectFrameRect();
        float f6 = this.LJLLJ;
        canvas.drawRoundRect(selectFrameRect, f6, f6, this.LJLLI);
    }

    @Override // X.C54Y
    public void setOnInterceptTouchListener(InterfaceC88472Yns<? super MotionEvent, Boolean> interfaceC88472Yns) {
        this.LLFF = interfaceC88472Yns;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5AN(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Integer LJI;
        a1.LJFF(context, "context");
        this.LJLL = C221108m2.LIZIZ(new AqS152S0100000_2(context, 836));
        Paint paint = new Paint();
        this.LJLLI = paint;
        T5S t5s = new T5S();
        this.LJLLILLLL = t5s;
        this.LJLLJ = C134845Qy.LIZ(4.0f);
        this.LJLLL = C134845Qy.LIZ(2.0f);
        this.LJLLLL = C134845Qy.LIZ(2.0f);
        this.LJLLLLLL = C134845Qy.LIZ(3.0f);
        this.LJLZ = C134845Qy.LIZ(16.0f);
        this.LJZ = C134845Qy.LIZ(1.0f);
        this.LJZI = C134845Qy.LIZ(4.0f);
        this.LJZL = C134845Qy.LIZ(4.0f);
        this.LL = C134845Qy.LIZ(3.0f);
        this.LLD = new Rect();
        this.LLF = C134845Qy.LIZ(21.0f);
        paint.setAntiAlias(true);
        t5s.setAntiAlias(true);
        t5s.setTextSize(C134845Qy.LIZ(12.0f));
        t5s.LIZ(71);
        Integer valueOf = Integer.valueOf(R.attr.dj);
        if (valueOf != null && (LJI = C79045V0n.LJI(valueOf.intValue(), context)) != null) {
            t5s.setColor(LJI.intValue());
        }
        this.LLFF = new AqS168S0100000_2(this, 503);
    }
}
