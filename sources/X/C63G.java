package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.tools.sticker_core.newframework.stickerModel.BaseStickerModel;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.63G, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C63G extends FrameLayout implements C64U {
    public PointF[] LJLIL;
    public boolean LJLILLLLZI;
    public final Paint LJLJI;
    public final C64962gm LJLJJI;
    public InterfaceC79150V4o LJLJJL;

    @Override // X.C64U
    public final boolean LIZLLL() {
        return true;
    }

    @Override // X.C64U
    public final void LJFF() {
        InterfaceC79150V4o interfaceC79150V4o = this.LJLJJL;
        if (interfaceC79150V4o != null) {
            interfaceC79150V4o.LIZIZ(null);
        }
        this.LJLILLLLZI = false;
        invalidate();
    }

    public int getVisibleHeight() {
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        int LJ = C60996Nwm.LJ(C45804HyK.LJIJJ(context));
        Context context2 = getContext();
        o.LJIIIIZZ(context2, "context");
        int LJJJJLI = LJ - C63081OpJ.LJJJJLI(context2);
        Context context3 = getContext();
        o.LJIIIIZZ(context3, "context");
        return LJJJJLI - C61410O8g.LIZIZ(context3);
    }

    public final InterfaceC79150V4o getHelpBoxJob() {
        return this.LJLJJL;
    }

    public final InterfaceC70422pa getScope() {
        return this.LJLJJI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C63G(Context context) {
        super(context, null, 0);
        new LinkedHashMap();
        this.LJLIL = new PointF[0];
        this.LJLILLLLZI = true;
        Paint paint = new Paint();
        this.LJLJI = paint;
        this.LJLJJI = C48841JEv.LIZIZ();
        setWillNotDraw(false);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(C60996Nwm.LJIIIIZZ(getContext()), getVisibleHeight());
        layoutParams.gravity = 1;
        setLayoutParams(layoutParams);
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setAntiAlias(true);
        paint.setStrokeWidth(2.0f);
    }

    @Override // X.C64U
    public final void LJI(C64N c64n) {
        this.LJLILLLLZI = true;
        if (c64n.LIZJ) {
            this.LJLILLLLZI = false;
            postInvalidate();
        } else {
            this.LJLJJL = XKX.LIZLLL(this.LJLJJI, null, null, new C65062gw(this, null), 3);
            postInvalidate();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (!this.LJLILLLLZI) {
            return;
        }
        PointF[] pointFArr = this.LJLIL;
        if (pointFArr.length >= 3 && canvas != null) {
            PointF pointF = pointFArr[0];
            float f = pointF.x;
            float f2 = pointF.y;
            PointF pointF2 = pointFArr[1];
            canvas.drawLine(f, f2, pointF2.x, pointF2.y, this.LJLJI);
            PointF[] pointFArr2 = this.LJLIL;
            PointF pointF3 = pointFArr2[1];
            float f3 = pointF3.x;
            float f4 = pointF3.y;
            PointF pointF4 = pointFArr2[3];
            canvas.drawLine(f3, f4, pointF4.x, pointF4.y, this.LJLJI);
            if (canvas != null) {
                PointF[] pointFArr3 = this.LJLIL;
                PointF pointF5 = pointFArr3[3];
                float f5 = pointF5.x;
                float f6 = pointF5.y;
                PointF pointF6 = pointFArr3[2];
                canvas.drawLine(f5, f6, pointF6.x, pointF6.y, this.LJLJI);
                PointF[] pointFArr4 = this.LJLIL;
                PointF pointF7 = pointFArr4[2];
                float f7 = pointF7.x;
                float f8 = pointF7.y;
                PointF pointF8 = pointFArr4[0];
                canvas.drawLine(f7, f8, pointF8.x, pointF8.y, this.LJLJI);
            }
        }
        super.onDraw(canvas);
    }

    public final void setHelpBoxJob(InterfaceC79150V4o interfaceC79150V4o) {
        this.LJLJJL = interfaceC79150V4o;
    }

    @Override // X.C64U
    public final boolean LIZIZ(C64N c64n, float f) {
        this.LJLILLLLZI = false;
        postInvalidate();
        InterfaceC79150V4o interfaceC79150V4o = this.LJLJJL;
        if (interfaceC79150V4o != null) {
            interfaceC79150V4o.LIZIZ(null);
        }
        RectF LIZ = c64n.LIZIZ().getViewRectF().LIZ();
        float radians = (float) Math.toRadians(f);
        float radians2 = (float) Math.toRadians(c64n.LIZ().getRotation());
        PointF[] fourPointsWithRotationAndScale$default = BaseStickerModel.getFourPointsWithRotationAndScale$default(c64n.LIZIZ(), 0.0f, 1, null);
        for (PointF pointF : fourPointsWithRotationAndScale$default) {
            C77119UOl.LJJIII(pointF, LIZ.centerX(), LIZ.centerY(), radians2 - radians);
        }
        this.LJLIL = fourPointsWithRotationAndScale$default;
        return false;
    }

    @Override // X.C64U
    public final boolean LJ(C64N c64n, float f) {
        this.LJLILLLLZI = false;
        InterfaceC79150V4o interfaceC79150V4o = this.LJLJJL;
        if (interfaceC79150V4o != null) {
            interfaceC79150V4o.LIZIZ(null);
        }
        postInvalidate();
        this.LJLIL = c64n.LIZIZ().getFourPointsWithRotationAndScale(f);
        return false;
    }

    @Override // X.C64U
    public final void LIZ(C64N c64n, float f, float f2) {
        this.LJLILLLLZI = false;
    }

    @Override // X.C64U
    public final boolean LIZJ(C64N c64n, float f, float f2) {
        this.LJLILLLLZI = false;
        postInvalidate();
        InterfaceC79150V4o interfaceC79150V4o = this.LJLJJL;
        if (interfaceC79150V4o != null) {
            interfaceC79150V4o.LIZIZ(null);
        }
        PointF[] fourPointsWithRotationAndScale$default = BaseStickerModel.getFourPointsWithRotationAndScale$default(c64n.LIZIZ(), 0.0f, 1, null);
        for (PointF pointF : fourPointsWithRotationAndScale$default) {
            pointF.x += f;
            pointF.y += f2;
        }
        this.LJLIL = fourPointsWithRotationAndScale$default;
        return false;
    }

    @Override // X.C64U
    public final void LJII(C64N c64n, float f, float f2) {
        InterfaceC79150V4o interfaceC79150V4o = this.LJLJJL;
        if (interfaceC79150V4o != null) {
            interfaceC79150V4o.LIZIZ(null);
        }
        this.LJLIL = BaseStickerModel.getFourPointsWithRotationAndScale$default(c64n.LIZIZ(), 0.0f, 1, null);
    }
}
