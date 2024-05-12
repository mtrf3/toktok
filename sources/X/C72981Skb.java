package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.AqS143S0200000_12;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.IDqS436S0100000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.Skb, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72981Skb extends View {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLIZ;
    public final Paint LJLIL;
    public final Paint LJLILLLLZI;
    public final TextPaint LJLJI;
    public final Paint LJLJJI;
    public final C72977SkX<Float> LJLJJL;
    public final C72977SkX<Float> LJLJJLL;
    public final float LJLJL;
    public final int LJLJLJ;
    public final float LJLJLLL;
    public final float LJLL;
    public final float LJLLI;
    public final C72977SkX<Integer> LJLLILLLL;
    public C72977SkX<C72877Siv> LJLLJ;
    public RectF LJLLL;
    public RectF LJLLLL;
    public RectF LJLLLLLL;
    public RectF LJLZ;
    public final RectF LJZ;
    public RectF LJZI;
    public RectF LJZL;
    public InterfaceC88472Yns<? super Float, C76800UCe> LL;
    public InterfaceC88472Yns<? super Float, C76800UCe> LLD;
    public InterfaceC88471Ynr<? super Float, ? super Float, Integer> LLF;
    public final C72977SkX<Float> LLFF;
    public final C72977SkX<RectF> LLFFF;
    public final AqS162S0100000_12 LLFII;
    public final AqS162S0100000_12 LLFZ;
    public final AqS162S0100000_12 LLI;
    public final AqS178S0100000_12 LLIFFJFJJ;
    public final float[] LLII;
    public final float[] LLIIII;
    public final float[] LLIIIILZ;
    public final float[] LLIIIJ;
    public final Path LLIIIL;
    public final Path LLIIIZ;
    public final Path LLIIJI;
    public final Path LLIIJLIL;
    public final int LLIIL;
    public final int LLIILII;
    public final int LLIILZL;
    public final int LLIIZ;
    public final SY9 LLIL;
    public final SY9 LLILII;
    public boolean LLILIL;
    public final C72977SkX LLILL;
    public boolean LLILLIZIL;
    public boolean LLILLJJLI;
    public boolean LLILLL;
    public boolean LLILZ;
    public float LLILZIL;
    public float LLILZLL;

    static {
        TBV tbv = new TBV(C72981Skb.class, "handleCount", "getHandleCount()I", 0);
        C65352Pkq.LIZ.getClass();
        LLIZ = new InterfaceC74236TBo[]{tbv};
    }

    public final InterfaceC88471Ynr<Float, Float, Integer> getCalculateSelectedTimeSpan() {
        InterfaceC88471Ynr interfaceC88471Ynr = this.LLF;
        if (interfaceC88471Ynr != null) {
            return interfaceC88471Ynr;
        }
        o.LJIJI("calculateSelectedTimeSpan");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int getHandleCount() {
        C72977SkX c72977SkX = this.LLILL;
        InterfaceC74236TBo<Object> property = LLIZ[0];
        c72977SkX.getClass();
        o.LJIIIZ(property, "property");
        return ((Number) c72977SkX.LIZIZ).intValue();
    }

    public final InterfaceC88472Yns<Float, C76800UCe> getPlayOffset() {
        InterfaceC88472Yns interfaceC88472Yns = this.LL;
        if (interfaceC88472Yns != null) {
            return interfaceC88472Yns;
        }
        o.LJIJI("playOffset");
        throw null;
    }

    public final InterfaceC88472Yns<Float, C76800UCe> getPlayerPause() {
        InterfaceC88472Yns interfaceC88472Yns = this.LLD;
        if (interfaceC88472Yns != null) {
            return interfaceC88472Yns;
        }
        o.LJIJI("playerPause");
        throw null;
    }

    public final boolean getDragLeft() {
        return this.LLILLJJLI;
    }

    public final boolean getDragPlayHead() {
        return this.LLILZ;
    }

    public final boolean getDragRight() {
        return this.LLILLL;
    }

    public final float getHandleExtraLength() {
        return this.LJLL;
    }

    public final int getIconWidth() {
        return this.LJLJLJ;
    }

    public final C72977SkX<Float> getLeftPosition() {
        return this.LJLJJL;
    }

    public final float getLeftX() {
        return this.LLILZIL;
    }

    public final C72977SkX<Float> getPlayHeadCenterX() {
        return this.LLFF;
    }

    public final float getPlayHeadExtraLength() {
        return this.LJLLI;
    }

    public final InterfaceC65784Pro<C76800UCe> getPlayHeadToLeft() {
        return this.LLFII;
    }

    public final InterfaceC65784Pro<C76800UCe> getPlayHeadToRight() {
        return this.LLFZ;
    }

    public final InterfaceC65784Pro<C76800UCe> getPlayHeadToStart() {
        return this.LLI;
    }

    public final float getRectWidth() {
        return this.LJLJL;
    }

    public final C72977SkX<Float> getRightPosition() {
        return this.LJLJJLL;
    }

    public final float getRightX() {
        return this.LLILZLL;
    }

    public final boolean getStart() {
        return this.LLILIL;
    }

    public final InterfaceC88472Yns<Float, Boolean> getWithinRange() {
        return this.LLIFFJFJJ;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        super.onDraw(canvas);
        Path path = this.LLIIJLIL;
        path.reset();
        path.addRoundRect(this.LJZ, this.LLIIIILZ, Path.Direction.CW);
        canvas.drawPath(path, this.LJLJJI);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LJLLILLLL.LIZIZ.intValue());
        LIZ.append('s');
        canvas.drawText(X1D.LIZIZ(LIZ), this.LJZ.centerX(), this.LJZ.centerY() + C7MY.LIZIZ(2), this.LJLJI);
        this.LLIIIL.reset();
        this.LLIIIL.addRoundRect(this.LJLLL, this.LLIIII, Path.Direction.CW);
        canvas.drawPath(this.LLIIIL, this.LJLIL);
        this.LLIIIZ.reset();
        this.LLIIIZ.addRoundRect(this.LJLLLL, this.LLIIIJ, Path.Direction.CW);
        canvas.drawPath(this.LLIIIZ, this.LJLIL);
        canvas.drawRect(this.LJLLLLLL, this.LJLIL);
        canvas.drawRect(this.LJLZ, this.LJLIL);
        this.LLIIJI.reset();
        this.LLIIJI.addRoundRect(this.LLFFF.LIZIZ, this.LLII, Path.Direction.CW);
        canvas.drawPath(this.LLIIJI, this.LJLILLLLZI);
        RectF rectF = this.LJLLL;
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        LIZ(rectF, (Drawable) C72985Skf.LIZ(context, this.LLIL, this.LLILII), true);
        RectF rectF2 = this.LJLLLL;
        Context context2 = getContext();
        o.LJIIIIZZ(context2, "context");
        LIZ(rectF2, (Drawable) C72985Skf.LIZ(context2, this.LLILII, this.LLIL), false);
        this.LLIL.draw(canvas);
        this.LLILII.draw(canvas);
        canvas.drawRect(this.LJZI, this.LJLJJI);
        canvas.drawRect(this.LJZL, this.LJLJJI);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0019, code lost:
    
        if (r1 != 3) goto L12;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            Method dump skipped, instructions count: 433
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C72981Skb.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setCalculateSelectedTimeSpan(InterfaceC88471Ynr<? super Float, ? super Float, Integer> interfaceC88471Ynr) {
        o.LJIIIZ(interfaceC88471Ynr, "<set-?>");
        this.LLF = interfaceC88471Ynr;
    }

    public final void setDragLeft(boolean z) {
        this.LLILLJJLI = z;
    }

    public final void setDragPlayHead(boolean z) {
        this.LLILZ = z;
    }

    public final void setDragRight(boolean z) {
        this.LLILLL = z;
    }

    public final void setHandleCount(int i) {
        C72977SkX c72977SkX = this.LLILL;
        InterfaceC74236TBo<Object> property = LLIZ[0];
        Integer valueOf = Integer.valueOf(i);
        c72977SkX.getClass();
        o.LJIIIZ(property, "property");
        c72977SkX.LIZIZ(valueOf);
    }

    public final void setLeftX(float f) {
        this.LLILZIL = f;
    }

    public final void setPlayOffset(InterfaceC88472Yns<? super Float, C76800UCe> interfaceC88472Yns) {
        o.LJIIIZ(interfaceC88472Yns, "<set-?>");
        this.LL = interfaceC88472Yns;
    }

    public final void setPlayerPause(InterfaceC88472Yns<? super Float, C76800UCe> interfaceC88472Yns) {
        o.LJIIIZ(interfaceC88472Yns, "<set-?>");
        this.LLD = interfaceC88472Yns;
    }

    public final void setRightX(float f) {
        this.LLILZLL = f;
    }

    public final void setScrolling(boolean z) {
        this.LLILLIZIL = z;
    }

    public final void setStart(boolean z) {
        this.LLILIL = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C72981Skb(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        a1.LJFF(context, "context");
        Paint paint = new Paint();
        Integer LJI = C79045V0n.LJI(R.attr.dj, context);
        if (LJI != null) {
            i = LJI.intValue();
        } else {
            i = 0;
        }
        paint.setColor(i);
        paint.setAntiAlias(true);
        this.LJLIL = paint;
        Paint paint2 = new Paint();
        Integer LJI2 = C79045V0n.LJI(R.attr.dj, context);
        if (LJI2 != null) {
            i2 = LJI2.intValue();
        } else {
            i2 = 0;
        }
        paint2.setColor(i2);
        paint2.setAntiAlias(true);
        float LJJIIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(4));
        Integer LJI3 = C79045V0n.LJI(R.attr.d9, context);
        if (LJI3 != null) {
            i3 = LJI3.intValue();
        } else {
            i3 = 0;
        }
        paint2.setShadowLayer(LJJIIZ, 0.0f, 0.0f, i3);
        this.LJLILLLLZI = paint2;
        TextPaint textPaint = new TextPaint();
        Integer LJI4 = C79045V0n.LJI(R.attr.dk, context);
        if (LJI4 != null) {
            i4 = LJI4.intValue();
        } else {
            i4 = 0;
        }
        textPaint.setColor(i4);
        textPaint.setTextSize(O6R.LJJIIZ(C32151Nz.LJIIZILJ(8)));
        textPaint.setTypeface(Typeface.DEFAULT_BOLD);
        textPaint.setTextAlign(Paint.Align.CENTER);
        this.LJLJI = textPaint;
        Paint paint3 = new Paint();
        Integer LJI5 = C79045V0n.LJI(R.attr.ed, context);
        if (LJI5 != null) {
            i5 = LJI5.intValue();
        } else {
            i5 = 0;
        }
        paint3.setColor(i5);
        paint3.setAlpha(50);
        this.LJLJJI = paint3;
        AqS178S0100000_12 aqS178S0100000_12 = new AqS178S0100000_12(context, 580);
        C72977SkX<Float> c72977SkX = new C72977SkX<>(Float.valueOf(0.0f));
        this.LJLJJL = c72977SkX;
        C72977SkX<Float> c72977SkX2 = new C72977SkX<>(Float.valueOf(100.0f));
        this.LJLJJLL = c72977SkX2;
        this.LJLJL = C7MY.LIZIZ(14);
        int LIZIZ = C7MY.LIZIZ(12);
        this.LJLJLJ = LIZIZ;
        this.LJLJLLL = C7MY.LIZIZ(4);
        this.LJLL = C7MY.LIZIZ(2);
        this.LJLLI = C7MY.LIZIZ(6);
        C72977SkX<Integer> LIZIZ2 = C72984Ske.LIZIZ(0, c72977SkX, c72977SkX2, new IDqS436S0100000_12(this, 29));
        this.LJLLILLLL = LIZIZ2;
        this.LJLLJ = new C72977SkX<>(C72878Siw.LIZ);
        this.LJLLL = new RectF();
        this.LJLLLL = new RectF();
        this.LJLLLLLL = new RectF();
        this.LJLZ = new RectF();
        this.LJZ = new RectF();
        this.LJZI = new RectF();
        this.LJZL = new RectF();
        C72977SkX<Float> c72977SkX3 = new C72977SkX<>(Float.valueOf(0.0f));
        this.LLFF = c72977SkX3;
        this.LLFFF = new C72977SkX<>(new RectF(0.0f, 0.0f, 0.0f, 0.0f));
        this.LLFII = new AqS162S0100000_12(this, 1150);
        this.LLFZ = new AqS162S0100000_12(this, 1151);
        this.LLI = new AqS162S0100000_12(this, 1152);
        this.LLIFFJFJJ = new AqS178S0100000_12(this, 581);
        float floatValue = ((Number) aqS178S0100000_12.invoke(Float.valueOf(6.0f))).floatValue();
        float floatValue2 = ((Number) aqS178S0100000_12.invoke(Float.valueOf(4.0f))).floatValue();
        float floatValue3 = ((Number) aqS178S0100000_12.invoke(Float.valueOf(2.0f))).floatValue();
        this.LLII = new float[]{floatValue2, floatValue2, floatValue2, floatValue2, floatValue2, floatValue2, floatValue2, floatValue2};
        this.LLIIII = new float[]{floatValue, floatValue, 0.0f, 0.0f, 0.0f, 0.0f, floatValue, floatValue};
        this.LLIIIILZ = new float[]{floatValue3, floatValue3, floatValue3, floatValue3, floatValue3, floatValue3, floatValue3, floatValue3};
        this.LLIIIJ = new float[]{0.0f, 0.0f, floatValue, floatValue, floatValue, floatValue, 0.0f, 0.0f};
        this.LLIIIL = new Path();
        this.LLIIIZ = new Path();
        this.LLIIJI = new Path();
        this.LLIIJLIL = new Path();
        this.LLIIL = 20;
        this.LLIILII = 5;
        this.LLIILZL = 22;
        this.LLIIZ = 13;
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZJ = LIZIZ;
        c2068389v.LIZIZ = LIZIZ;
        c2068389v.LIZ = R.raw.icon_chevron_left_obtuse_fill_ltr;
        c2068389v.LJ = Integer.valueOf(R.attr.gp);
        this.LLIL = c2068389v.LIZ(context);
        C2068389v c2068389v2 = new C2068389v();
        c2068389v2.LIZJ = LIZIZ;
        c2068389v2.LIZIZ = LIZIZ;
        c2068389v2.LIZ = R.raw.icon_chevron_right_obtuse_fill_ltr;
        c2068389v2.LJ = Integer.valueOf(R.attr.gp);
        this.LLILII = c2068389v2.LIZ(context);
        this.LLILL = new C72977SkX(0);
        AqS162S0100000_12 aqS162S0100000_12 = new AqS162S0100000_12(this, 1153);
        C72984Ske.LIZJ(c72977SkX, new AqS143S0200000_12(this, aqS162S0100000_12, 128));
        C72984Ske.LIZJ(c72977SkX2, new AqS143S0200000_12(this, aqS162S0100000_12, 129));
        C72984Ske.LIZJ(c72977SkX3, new AqS178S0100000_12(this, 578));
        C72984Ske.LIZJ(LIZIZ2, new AqS178S0100000_12(this, 579));
    }

    public final boolean LIZIZ(RectF rectF, float f) {
        if (Math.abs(rectF.left - f) <= this.LLIIL || Math.abs(rectF.right - f) <= this.LLIIL) {
            return true;
        }
        return false;
    }

    public final void LIZ(RectF rectF, Drawable drawable, boolean z) {
        float f;
        int i;
        float f2 = rectF.top;
        float f3 = 2;
        float f4 = ((rectF.bottom - f2) / f3) + f2;
        if (drawable != null) {
            if (z) {
                f = rectF.left + f3;
            } else {
                f = (rectF.right - f3) - this.LJLJLJ;
            }
            int i2 = (int) f;
            int i3 = this.LJLJLJ;
            float f5 = i3 / 2;
            int i4 = (int) (f4 - f5);
            if (z) {
                i = (int) (rectF.left + f3 + i3);
            } else {
                i = ((int) rectF.right) - 2;
            }
            drawable.setBounds(i2, i4, i, (int) (f4 + f5));
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (Build.VERSION.SDK_INT < 29) {
            return;
        }
        setSystemGestureExclusionRects(C47261Igj.LJJIJ(new Rect(0, 0, i, i2)));
    }
}
