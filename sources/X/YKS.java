package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextPaint;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.live.livehostimpl.edit.text.bean.InteractTextStructWrap;
import com.ss.android.ugc.aweme.live.livehostimpl.edit.text.bean.TextStickerString;
import com.ss.android.ugc.aweme.live.livehostimpl.edit.text.bean.TextStickerTextWrap;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes16.dex */
public final class YKS {
    public Context LIZ;
    public Bitmap LJI;
    public Paint LJII;
    public List<TextStickerTextWrap> LJIIIZ;
    public TextStickerString[] LJIIJ;
    public float LJIILJJIL;
    public float LJIILL;
    public int LJIJ;
    public float LJIJI;
    public Path LJJ;
    public YKR LJJI;
    public float LJJIFFI;
    public float LJJII;
    public float LJJIIJ;
    public float LJJIIZI;
    public RectF LIZIZ = new RectF();
    public final RectF LIZJ = new RectF();
    public final Rect LIZLLL = new Rect();
    public final RectF LJ = new RectF();
    public final RectF LJFF = new RectF();
    public int LJIIIIZZ = 0;
    public float LJIIJJI = 60.0f;
    public float LJIIL = 20.0f;
    public float LJIILIIL = 20.0f;
    public int LJIILLIIL = 20;
    public int LJIIZILJ = 10;
    public final TextPaint LJIJJ = new TextPaint();
    public final Paint LJIJJLI = new Paint();
    public final Paint LJIL = new Paint(2);
    public boolean LJJIII = false;
    public final List<PointF> LJJIIJZLJL = new ArrayList();
    public boolean LJJIIZ = false;
    public final Paint.FontMetrics LJJIJ = new Paint.FontMetrics();
    public float LJJIJIIJI = 0.0f;
    public float LJJIJIIJIL = 0.0f;

    public final void LIZIZ(Canvas canvas, List<InteractTextStructWrap> list, String str, float f, float f2) {
        char c;
        float f3 = f;
        if (!V1M.LJJIJ(str.length(), list)) {
            LIZ(canvas, str, 0, str.length(), f3, f2, this.LJIJJ);
            canvas.drawText(str, f3, f2, this.LJIJJ);
            return;
        }
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            InteractTextStructWrap interactTextStructWrap = (InteractTextStructWrap) ListProtector.get(list, i2);
            if (interactTextStructWrap.getRange().isValid(str.length())) {
                if (i < interactTextStructWrap.getRange().getStart()) {
                    LIZ(canvas, str, i, interactTextStructWrap.getRange().getStart(), f3, f2, this.LJIJJ);
                    canvas.drawText(str, i, interactTextStructWrap.getRange().getStart(), f3, f2, (Paint) this.LJIJJ);
                    f3 += V1M.LJJIIJ(this.LJIJJ, str, i, interactTextStructWrap.getRange().getStart());
                }
                int start = interactTextStructWrap.getRange().getStart();
                int end = interactTextStructWrap.getRange().getEnd();
                if (start < str.length() && str.charAt(start) == ' ') {
                    int i3 = start + 1;
                    c = ' ';
                    canvas.drawText(str, start, i3, f3, f2, (Paint) this.LJIJJ);
                    f3 += V1M.LJJIIJ(this.LJIJJ, str, start, i3);
                    start = i3;
                } else {
                    c = ' ';
                }
                if (start < str.length() && str.charAt(start) == '_') {
                    this.LJFF.offsetTo(f3, ((((this.LJIJJ.getFontMetricsInt().descent + f2) + f2) + this.LJIJJ.getFontMetricsInt().ascent) / 2.0f) - (this.LJFF.height() / 2.0f));
                    canvas.drawBitmap(this.LJI, this.LIZLLL, this.LJFF, this.LJIL);
                    f3 += this.LJFF.width() + this.LJIJI;
                    start++;
                }
                int i4 = end - 1;
                if (str.charAt(i4) == c) {
                    end = i4;
                }
                if (start < end) {
                    LIZ(canvas, str, start, end, f3, f2, this.LJIJJ);
                    this.LJIJJ.setUnderlineText(true);
                    canvas.drawText(str, start, end, f3, f2, (Paint) this.LJIJJ);
                    this.LJIJJ.setUnderlineText(false);
                    f3 += V1M.LJJIIJ(this.LJIJJ, str, start, end);
                }
                if (end < interactTextStructWrap.getRange().getEnd()) {
                    canvas.drawText(str, end, end + 1, f3, f2, (Paint) this.LJIJJ);
                    f3 += V1M.LJJIIJ(this.LJIJJ, str, end, r4);
                }
                i = interactTextStructWrap.getRange().getEnd();
            }
        }
        if (i < str.length()) {
            LIZ(canvas, str, i, str.length(), f3, f2, this.LJIJJ);
            canvas.drawText(str, i, str.length(), f3, f2, (Paint) this.LJIJJ);
        }
    }

    public final void LIZ(Canvas canvas, String str, int i, int i2, float f, float f2, Paint paint) {
        if (this.LJJIIZ) {
            for (TextStickerTextWrap textStickerTextWrap : this.LJJI.getTextWrapList()) {
                if (textStickerTextWrap != null && !TextUtils.isEmpty(textStickerTextWrap.getText())) {
                    int color = paint.getColor();
                    paint.setColor(C156826Dm.LIZ(color));
                    Paint.Style style = paint.getStyle();
                    paint.setStyle(Paint.Style.FILL_AND_STROKE);
                    Paint.Cap strokeCap = paint.getStrokeCap();
                    paint.setStrokeCap(Paint.Cap.ROUND);
                    Paint.Join strokeJoin = paint.getStrokeJoin();
                    paint.setStrokeJoin(Paint.Join.ROUND);
                    float strokeWidth = paint.getStrokeWidth();
                    paint.setStrokeWidth(this.LJJIIZI);
                    canvas.drawText(str, i, i2, f, f2, (Paint) this.LJIJJ);
                    paint.setColor(color);
                    paint.setStyle(style);
                    paint.setStrokeCap(strokeCap);
                    paint.setStrokeJoin(strokeJoin);
                    paint.setStrokeWidth(strokeWidth);
                    return;
                }
            }
        }
    }
}
