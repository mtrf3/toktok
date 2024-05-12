package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Vibrator;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.tools.sticker_core.newframework.stickerModel.BaseStickerModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.64b, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1543764b extends FrameLayout implements C64U {
    public RectF LJLIL;
    public final int LJLILLLLZI;
    public final int LJLJI;
    public final int LJLJJI;
    public final int LJLJJL;
    public Paint LJLJJLL;
    public final DashPathEffect LJLJL;
    public int LJLJLJ;
    public PointF LJLJLLL;
    public final Vibrator LJLL;
    public RectF LJLLI;
    public int LJLLILLLL;

    @Override // X.C64U
    public final boolean LIZLLL() {
        return false;
    }

    @Override // X.C64U
    public final void LJFF() {
    }

    @Override // X.C64U
    public final void LJI(C64N c64n) {
    }

    private final float getLeftViewXMargin() {
        if (C90193gN.LIZIZ(getContext())) {
            return this.LJLJJI;
        }
        return KL2.LIZJ(getContext(), 8.0f);
    }

    private final float getRightViewXMargin() {
        float LJIIIIZZ;
        float f;
        if (C90193gN.LIZIZ(getContext())) {
            LJIIIIZZ = C60996Nwm.LJIIIIZZ(getContext());
            f = KL2.LIZJ(getContext(), 8.0f);
        } else {
            LJIIIIZZ = C60996Nwm.LJIIIIZZ(getContext());
            f = this.LJLJJI;
        }
        return LJIIIIZZ - f;
    }

    public final int getDELTA_VALUE() {
        return this.LJLILLLLZI;
    }

    public final int getMDeltaX() {
        return this.LJLJLJ;
    }

    public final Paint getMPaint() {
        return this.LJLJJLL;
    }

    public final PointF getPointAry() {
        return this.LJLJLLL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1543764b(Context context) {
        super(context, null, 0);
        new LinkedHashMap();
        int color = context.getResources().getColor(R.color.cb);
        this.LJLIL = new RectF();
        this.LJLILLLLZI = 1;
        this.LJLJI = 1;
        this.LJLJJLL = new Paint();
        this.LJLJLLL = new PointF();
        int LIZJ = (int) KL2.LIZJ(context, 1.5f);
        this.LJLJJI = (int) KL2.LIZJ(context, 56.0f);
        this.LJLJJLL.setColor(color);
        this.LJLJJLL.setAntiAlias(true);
        this.LJLJJLL.setStyle(Paint.Style.STROKE);
        this.LJLJJLL.setStrokeWidth(LIZJ);
        setWillNotDraw(false);
        this.LJLJJL = (int) KL2.LIZJ(context, 201.0f);
        this.LJLJL = new DashPathEffect(new float[]{KL2.LIZJ(context, 2.0f), KL2.LIZJ(context, 1.0f)}, 0.0f);
        Object LLILL = C16880lQ.LLILL(context, "vibrator");
        o.LJII(LLILL, "null cannot be cast to non-null type android.os.Vibrator");
        this.LJLL = (Vibrator) LLILL;
        Context context2 = getContext();
        o.LJIIIIZZ(context2, "context");
        LJIIIZ(context2);
    }

    public final boolean LJIIIIZZ(EnumC1543964d enumC1543964d) {
        if ((this.LJLLILLLL & enumC1543964d.getMark()) == enumC1543964d.getMark()) {
            return true;
        }
        return false;
    }

    public final void LJIIIZ(Context context) {
        this.LJLIL = new RectF(getLeftViewXMargin(), -C60996Nwm.LJ(context), getRightViewXMargin(), getMeasuredHeight() - this.LJLJJL);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        super.onDraw(canvas);
        this.LJLJJLL.setPathEffect(null);
        if (LJIIIIZZ(EnumC1543964d.Top)) {
            canvas.drawLine(0.0f, this.LJLIL.top, getWidth(), this.LJLIL.top, this.LJLJJLL);
        }
        if (LJIIIIZZ(EnumC1543964d.Left)) {
            float f = this.LJLIL.left;
            canvas.drawLine(f, 0.0f, f, getHeight(), this.LJLJJLL);
        }
        if (LJIIIIZZ(EnumC1543964d.Right)) {
            float f2 = this.LJLIL.right;
            canvas.drawLine(f2, 0.0f, f2, getHeight(), this.LJLJJLL);
        }
        if (LJIIIIZZ(EnumC1543964d.Bottom)) {
            canvas.drawLine(0.0f, this.LJLIL.bottom, getWidth(), this.LJLIL.bottom, this.LJLJJLL);
        }
        if (LJIIIIZZ(EnumC1543964d.HorizontalSolid)) {
            canvas.drawLine(0.0f, getHeight() / 2.0f, getWidth(), getHeight() / 2.0f, this.LJLJJLL);
        }
        if (LJIIIIZZ(EnumC1543964d.VerticalSolid)) {
            canvas.drawLine(getWidth() / 2.0f, 0.0f, getWidth() / 2.0f, getHeight(), this.LJLJJLL);
        }
        this.LJLJJLL.setPathEffect(this.LJLJL);
        RectF rectF = this.LJLLI;
        if (rectF != null) {
            if (LJIIIIZZ(EnumC1543964d.HorizontalDot)) {
                canvas.drawLine(0.0f, rectF.centerY(), getWidth(), rectF.centerY(), this.LJLJJLL);
            }
            if (LJIIIIZZ(EnumC1543964d.VerticalDot)) {
                canvas.drawLine(rectF.centerX(), 0.0f, rectF.centerX(), getHeight(), this.LJLJJLL);
            }
            if (LJIIIIZZ(EnumC1543964d.LeftSlash)) {
                canvas.drawLine(0.0f, getHeight() - (rectF.centerX() + (getHeight() - rectF.centerY())), (getHeight() - rectF.centerY()) + rectF.centerX(), getHeight(), this.LJLJJLL);
            }
            if (LJIIIIZZ(EnumC1543964d.RightSlash)) {
                canvas.drawLine(getWidth(), getHeight() - ((getHeight() - rectF.centerY()) + (getWidth() - rectF.centerX())), getWidth() - ((getHeight() - rectF.centerY()) + (getWidth() - rectF.centerX())), getHeight(), this.LJLJJLL);
            }
        }
    }

    public final void setMDeltaX(int i) {
        this.LJLJLJ = i;
    }

    public final void setMPaint(Paint paint) {
        o.LJIIIZ(paint, "<set-?>");
        this.LJLJJLL = paint;
    }

    public final void setPointAry(PointF pointF) {
        o.LJIIIZ(pointF, "<set-?>");
        this.LJLJLLL = pointF;
    }

    @Override // X.C64U
    public final boolean LIZIZ(C64N c64n, float f) {
        this.LJLLI = c64n.LIZIZ().getViewRectF().LIZ();
        RectF LIZ = c64n.LIZIZ().getViewRectF().LIZ();
        float radians = (float) Math.toRadians(f);
        float radians2 = (float) Math.toRadians(c64n.LIZ().getRotation());
        PointF[] fourPointsWithRotationAndScale$default = BaseStickerModel.getFourPointsWithRotationAndScale$default(c64n.LIZIZ(), 0.0f, 1, null);
        for (PointF pointF : fourPointsWithRotationAndScale$default) {
            C77119UOl.LJJIII(pointF, LIZ.centerX(), LIZ.centerY(), radians2 - radians);
        }
        if (!this.LJLIL.contains(C1542763r.LIZ(fourPointsWithRotationAndScale$default))) {
            return true;
        }
        if (Math.abs(c64n.LIZJ().LIZIZ() - radians) < this.LJLJI) {
            LJIIJ(EnumC1543964d.HorizontalDot, true);
        } else {
            LJIIJ(EnumC1543964d.HorizontalDot, false);
        }
        if (Math.abs(c64n.LIZJ().LIZIZ() - radians) < this.LJLJI) {
            LJIIJ(EnumC1543964d.VerticalDot, true);
        } else {
            LJIIJ(EnumC1543964d.VerticalDot, false);
        }
        if (Math.abs((c64n.LIZJ().LIZIZ() - radians) - 45.0f) < this.LJLJI) {
            LJIIJ(EnumC1543964d.LeftSlash, true);
        } else {
            LJIIJ(EnumC1543964d.LeftSlash, false);
        }
        if (Math.abs((c64n.LIZJ().LIZIZ() - radians) + 45) < this.LJLJI) {
            LJIIJ(EnumC1543964d.RightSlash, true);
        } else {
            LJIIJ(EnumC1543964d.RightSlash, false);
        }
        return false;
    }

    @Override // X.C64U
    public final boolean LJ(C64N c64n, float f) {
        this.LJLLI = c64n.LIZIZ().getViewRectF().LIZ();
        RectF LIZ = C1542763r.LIZ(BaseStickerModel.getFourPointsWithRotationAndScale$default(c64n.LIZIZ(), 0.0f, 1, null));
        C77119UOl.LJJIIZ(LIZ, f);
        if (!this.LJLIL.contains(LIZ)) {
            return true;
        }
        return false;
    }

    public final void LJIIJ(EnumC1543964d enumC1543964d, boolean z) {
        int i;
        int i2;
        Vibrator vibrator;
        switch (C1544064e.LIZ[enumC1543964d.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                if (z) {
                    if (!LJIIIIZZ(enumC1543964d) && (vibrator = this.LJLL) != null) {
                        try {
                            vibrator.vibrate(30L);
                        } catch (Throwable unused) {
                        }
                    }
                    i2 = enumC1543964d.getMark() | this.LJLLILLLL;
                } else {
                    i2 = (~enumC1543964d.getMark()) & this.LJLLILLLL;
                }
                this.LJLLILLLL = i2;
                break;
            case 9:
            case 10:
                if (z) {
                    i = enumC1543964d.getMark() | this.LJLLILLLL;
                } else {
                    i = (~enumC1543964d.getMark()) & this.LJLLILLLL;
                }
                this.LJLLILLLL = i;
                break;
        }
        postInvalidate();
    }

    @Override // X.C64U
    public final void LIZ(C64N c64n, float f, float f2) {
        for (EnumC1543964d enumC1543964d : EnumC1543964d.values()) {
            LJIIJ(enumC1543964d, false);
        }
    }

    @Override // X.C64U
    public final boolean LIZJ(C64N c64n, float f, float f2) {
        boolean z;
        this.LJLLI = c64n.LIZIZ().getViewRectF().LIZ();
        RectF LIZ = C1542763r.LIZ(BaseStickerModel.getFourPointsWithRotationAndScale$default(c64n.LIZIZ(), 0.0f, 1, null));
        LIZ.left += f;
        LIZ.right += f;
        LIZ.top += f2;
        LIZ.bottom += f2;
        if (c64n.LIZIZ().getSupportTopBlock() && LIZ.top - this.LJLIL.top < 2.0f) {
            LJIIJ(EnumC1543964d.Top, true);
            z = true;
        } else {
            LJIIJ(EnumC1543964d.Top, false);
            z = false;
        }
        if (c64n.LIZIZ().getSupportBottomBlock() && this.LJLIL.bottom - LIZ.bottom < 2.0f) {
            LJIIJ(EnumC1543964d.Bottom, true);
            z = true;
        } else {
            LJIIJ(EnumC1543964d.Bottom, false);
        }
        if (c64n.LIZIZ().getSupportRightBlock() && this.LJLIL.right - LIZ.right < 2.0f) {
            LJIIJ(EnumC1543964d.Right, true);
            z = true;
        } else {
            LJIIJ(EnumC1543964d.Right, false);
        }
        if (c64n.LIZIZ().getSupportLeftBlock() && LIZ.left - this.LJLIL.left < 2.0f) {
            LJIIJ(EnumC1543964d.Left, true);
            z = true;
        } else {
            LJIIJ(EnumC1543964d.Left, false);
        }
        float f3 = 2;
        if (Math.abs(((Math.abs(LIZ.bottom - LIZ.top) / f3) + LIZ.top) - (getHeight() / 2.0f)) < this.LJLILLLLZI * 2) {
            LJIIJ(EnumC1543964d.HorizontalSolid, true);
        } else {
            LJIIJ(EnumC1543964d.HorizontalSolid, false);
        }
        if (Math.abs(((Math.abs(LIZ.right - LIZ.left) / f3) + LIZ.left) - (getWidth() / 2.0f)) < this.LJLILLLLZI * 2) {
            LJIIJ(EnumC1543964d.VerticalSolid, true);
        } else {
            LJIIJ(EnumC1543964d.VerticalSolid, false);
        }
        return z;
    }

    @Override // X.C64U
    public final void LJII(C64N c64n, float f, float f2) {
        LJIIIZ(getContext());
    }
}
