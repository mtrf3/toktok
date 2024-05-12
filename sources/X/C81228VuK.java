package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import kotlin.jvm.internal.o;

/* renamed from: X.VuK, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81228VuK extends C81227VuJ {
    @Override // X.C81227VuJ
    public final void LJ() {
        getMPaintBar().setStyle(Paint.Style.FILL_AND_STROKE);
        getMPaintBar().setAntiAlias(true);
        getMPaintBarHint().setStyle(Paint.Style.FILL_AND_STROKE);
        getMPaintBarHint().setAntiAlias(true);
    }

    @Override // X.C81227VuJ
    public final void LJI() {
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        setMBarLocationY((int) C74275TDb.LIZIZ(context, 60.0f));
        setMPercentStepLength((getMViewWidth() - (getMAttrsBarPadding() * 2)) / getMPercentRange());
        setMHasInit(true);
        invalidate();
    }

    @Override // X.C81227VuJ
    public void setBarHeight(float f) {
        super.setBarHeight(f);
        setMAttrsLineWidth(f / 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C81228VuK(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        o.LJIIIZ(context, "context");
    }

    @Override // X.C81227VuJ
    public final void LIZ(float f, Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        float f2 = 2;
        canvas.drawRoundRect(new RectF(f, getMBarLocationY() - (getMAttrsLineWidth() / f2), getMViewWidth() - getMAttrsBarPadding(), (getMAttrsLineWidth() / f2) + getMBarLocationY()), 3.0f, 3.0f, getMPaintBar());
    }

    @Override // X.C81227VuJ
    public final void LIZIZ(float f, Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        float LIZIZ = f - C74275TDb.LIZIZ(context, 10.0f);
        float mBarLocationY = getMBarLocationY();
        Context context2 = getContext();
        o.LJIIIIZZ(context2, "context");
        float LIZIZ2 = mBarLocationY - C74275TDb.LIZIZ(context2, 16.0f);
        Context context3 = getContext();
        o.LJIIIIZZ(context3, "context");
        float LIZIZ3 = C74275TDb.LIZIZ(context3, 10.0f) + f;
        float mBarLocationY2 = getMBarLocationY();
        Context context4 = getContext();
        o.LJIIIIZZ(context4, "context");
        canvas.drawRoundRect(new RectF(LIZIZ, LIZIZ2, LIZIZ3, C74275TDb.LIZIZ(context4, 16.0f) + mBarLocationY2), 22.0f, 22.0f, getMPaintSuggestCircle());
    }

    @Override // X.C81227VuJ
    public final void LIZJ(float f, Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        float f2 = 2;
        canvas.drawRoundRect(new RectF(getMAttrsBarPadding(), getMBarLocationY() - (getMAttrsLineWidth() / f2), f, (getMAttrsLineWidth() / f2) + getMBarLocationY()), 3.0f, 3.0f, getMPaintBarHint());
    }

    @Override // X.C81227VuJ
    public final void LIZLLL(Canvas canvas, float f, float f2, Paint textPaint) {
        o.LJIIIZ(canvas, "canvas");
        o.LJIIIZ(textPaint, "textPaint");
        canvas.drawText(getMText(), f, f2 - 30, textPaint);
    }
}
