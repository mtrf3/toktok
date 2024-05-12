package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveChatShowDelayForHotLiveSetting;
import kotlin.jvm.internal.o;

/* renamed from: X.CWx, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31475CWx extends AbstractC31467CWp {
    public int LJI;
    public int LJII;
    public int LJIIIIZZ;
    public String LJIIIZ;
    public int LJIIJ;
    public final RectF LJIIJJI;
    public int LJIIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31475CWx(Context context) {
        super(context);
        o.LJIIIZ(context, "context");
        this.LJI = -16777216;
        this.LJIIIZ = "";
        this.LJIIJ = -16777216;
        this.LJIIJJI = new RectF();
        this.LJIIL = LiveChatShowDelayForHotLiveSetting.DEFAULT;
    }

    @Override // X.AbstractC31467CWp
    public final int LJ(Paint paint) {
        o.LJIIIZ(paint, "paint");
        C23010vJ.LIZIZ(this.LIZ, paint, this.LIZLLL, this.LJIIL);
        return C22510uV.LIZ(this.LJIIIIZZ, 2, (int) paint.measureText(this.LJIIIZ), 0);
    }

    @Override // X.AbstractC31467CWp
    public final void LIZLLL(Canvas canvas, Paint paint) {
        o.LJIIIZ(canvas, "canvas");
        o.LJIIIZ(paint, "paint");
        paint.setAntiAlias(true);
        RectF rectF = this.LJIIJJI;
        rectF.bottom = this.LIZJ;
        rectF.right = this.LIZIZ;
        paint.setColor(this.LJI);
        RectF rectF2 = this.LJIIJJI;
        float f = this.LJII;
        canvas.drawRoundRect(rectF2, f, f, paint);
        C23010vJ.LIZIZ(this.LIZ, paint, this.LIZLLL, this.LJIIL);
        Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
        paint.setColor(this.LJIIJ);
        canvas.drawText(this.LJIIIZ, this.LJIIIIZZ, ((this.LIZJ - fontMetricsInt.descent) - fontMetricsInt.ascent) / 2.0f, paint);
    }
}
