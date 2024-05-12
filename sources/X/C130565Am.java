package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextPaint;
import com.bytedance.ies.nle.editor_jni.NLESegmentFilter;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.IDqS192S0200000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.5Am, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C130565Am extends AbstractC130625As implements InterfaceC70422pa {
    public static final int LLD;
    public static final int LLF;
    public boolean LJLJL;
    public boolean LJLJLJ;
    public float LJLJLLL;
    public RectF LJLL;
    public float LJLLI;
    public int LJLLILLLL;
    public int LJLLJ;
    public final Paint LJLLL;
    public final C5BF LJLLLL;
    public final C130635At LJLLLLLL;
    public final TextPaint LJLZ;
    public final Rect LJZ;
    public final Rect LJZI;
    public final XIA LJZL;
    public String LL;

    static {
        ColorProtector.parseColor("#5E76EE");
        ColorProtector.parseColor("#ECC66B");
        ColorProtector.parseColor("#AB6D36");
        ColorProtector.parseColor("#C4425B");
        ColorProtector.parseColor("#EBAED8");
        LLD = ColorProtector.parseColor("#11862F");
        LLF = ColorProtector.parseColor("#9f76c6");
        ColorProtector.parseColor("#6b7cca");
    }

    private final float getBaseLine() {
        return ((Math.abs(this.LJLZ.ascent()) - this.LJLZ.descent()) / 2) + (getMeasuredHeight() / 2) + C134845Qy.LIZ(1.0f);
    }

    @Override // X.C5BC
    public final boolean LIZLLL() {
        return this.LJLJLJ;
    }

    @Override // X.AbstractC130625As, X.C5BC
    public int getBgColor() {
        return this.LJLLILLLL;
    }

    @Override // X.AbstractC130625As
    public int getBgRadius() {
        return this.LJLLJ;
    }

    @Override // X.AbstractC130625As
    public float getClipLength() {
        return this.LJLJLLL;
    }

    @Override // X.AbstractC130625As, X.C5BC
    public RectF getClipRectF() {
        return this.LJLL;
    }

    @Override // X.InterfaceC70422pa
    public MBA getCoroutineContext() {
        return this.LJZL;
    }

    @Override // X.AbstractC130625As, X.C5BC
    public boolean getDrawDivider() {
        return this.LJLJL;
    }

    public final String getText() {
        return this.LL;
    }

    @Override // X.AbstractC130625As
    public float getTimelineScale() {
        return this.LJLLI;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C130565Am(Context context) {
        super(context, null, 0);
        new LinkedHashMap();
        this.LJLJL = true;
        this.LJLL = new RectF();
        this.LJLLI = C1300758p.LIZIZ();
        this.LJLLILLLL = ColorProtector.parseColor("#51c7b1");
        this.LJLLL = C6D8.LIZIZ(true);
        this.LJLLLL = new C5BF(this);
        this.LJLLLLLL = new C130635At(this);
        TextPaint textPaint = new TextPaint();
        textPaint.setColor(-1);
        textPaint.setAntiAlias(true);
        textPaint.setTextSize(C130935Bx.LIZ);
        textPaint.setStrokeWidth(C134845Qy.LIZ(1.0f));
        textPaint.setStyle(Paint.Style.FILL);
        this.LJLZ = textPaint;
        new Path();
        C134845Qy.LIZ(2.0f);
        this.LJZ = new Rect();
        this.LJZI = new Rect();
        this.LJZL = C78613UtF.LIZJ;
        this.LL = "";
    }

    @Override // X.AbstractC130625As, X.C5BC
    public final void LIZJ(Canvas canvas) {
        boolean z;
        float f;
        int i;
        float f2;
        float f3;
        float f4;
        float f5;
        o.LJIIIZ(canvas, "canvas");
        canvas.getClipBounds(this.LJZ);
        this.LJLLL.setColor(getBgColor());
        canvas.drawRect(this.LJZ, this.LJLLL);
        this.LJLZ.setTextSize(C130675Ax.LJLLILLLL);
        this.LJLZ.setColor(-1);
        TextPaint textPaint = this.LJLZ;
        String str = this.LL;
        textPaint.getTextBounds(str, 0, str.length(), this.LJZI);
        canvas.drawText(this.LL, this.LJLLLLLL.LJII + C130675Ax.LJLLI + C130675Ax.LJLJLJ, getBaseLine(), this.LJLZ);
        C5BF c5bf = this.LJLLLL;
        Rect rect = this.LJZ;
        c5bf.getClass();
        o.LJIIIZ(rect, "rect");
        int width = rect.width();
        int i2 = C5BF.LJ;
        if (width - (i2 * 2) > 0) {
            z = true;
        } else {
            z = false;
        }
        if (c5bf.LIZ.getDrawDivider() && z) {
            Paint paint = c5bf.LIZIZ;
            C5A5.LJJJJZ.getClass();
            paint.setColor(C5BD.LIZIZ);
            if (!((Boolean) c5bf.LIZLLL.getValue()).booleanValue()) {
                int i3 = rect.right;
                C77275UUl.LIZJ(canvas, i3 - i2, rect.top, i3, rect.bottom, c5bf.LIZIZ);
                int i4 = rect.left;
                C77275UUl.LIZJ(canvas, i4, rect.top, i4 + i2, rect.bottom, c5bf.LIZIZ);
            }
        }
        if (!c5bf.LIZ.LIZLLL()) {
            Paint paint2 = c5bf.LIZIZ;
            C5A5.LJJJJZ.getClass();
            int i5 = C5BD.LIZIZ;
            paint2.setColor(i5);
            if (((Boolean) c5bf.LIZLLL.getValue()).booleanValue()) {
                if (c5bf.LIZ.getDrawDivider() && z) {
                    int i6 = i2 / 2;
                    f2 = rect.left + i6;
                    float f6 = i6;
                    f3 = rect.top - f6;
                    f4 = rect.right - i6;
                    f5 = rect.bottom + f6;
                } else {
                    f2 = rect.left;
                    f3 = rect.top;
                    f4 = rect.right;
                    f5 = rect.bottom;
                }
                Paint paint3 = new Paint();
                paint3.setAntiAlias(true);
                paint3.setColor(i5);
                paint3.setStyle(Paint.Style.STROKE);
                paint3.setStrokeWidth(i2);
                RectF rectF = new RectF(f2, f3, f4, f5);
                float f7 = C5BD.LIZLLL;
                canvas.drawRoundRect(rectF, f7, f7, paint3);
            } else {
                float f8 = rect.top;
                float f9 = rect.bottom;
                if (c5bf.LIZ.getDrawDivider() && z) {
                    f = rect.left + i2;
                    i = rect.right - i2;
                } else {
                    f = rect.left;
                    i = rect.right;
                }
                float f10 = i;
                IDqS192S0200000_2 iDqS192S0200000_2 = new IDqS192S0200000_2(c5bf, canvas, 3);
                Float valueOf = Float.valueOf(f);
                Float valueOf2 = Float.valueOf(f8);
                float f11 = C5BD.LIZJ;
                iDqS192S0200000_2.invoke(valueOf, valueOf2, Float.valueOf(f11), Float.valueOf(f11));
                float f12 = -f11;
                iDqS192S0200000_2.invoke(Float.valueOf(f), Float.valueOf(f9), Float.valueOf(f11), Float.valueOf(f12));
                iDqS192S0200000_2.invoke(Float.valueOf(f10), Float.valueOf(f8), Float.valueOf(f12), Float.valueOf(f11));
                iDqS192S0200000_2.invoke(Float.valueOf(f10), Float.valueOf(f9), Float.valueOf(f12), Float.valueOf(f12));
                c5bf.LIZJ.reset();
            }
        }
        super.LIZJ(canvas);
    }

    @Override // X.AbstractC130625As, android.view.View
    public final void onDraw(Canvas canvas) {
        if (canvas != null) {
            if (!this.LJLJLJ) {
                LIZJ(canvas);
            }
            getNleTrackSlot$editor_trackpanel_release();
        }
    }

    @Override // X.AbstractC130625As, X.C5BC
    public void setBgColor(int i) {
        this.LJLLILLLL = i;
    }

    @Override // X.AbstractC130625As, X.C5BC
    public void setBgRadius(int i) {
        this.LJLLJ = i;
    }

    @Override // X.AbstractC130625As, X.C5BC
    public void setClipLength(float f) {
        this.LJLJLLL = f;
    }

    @Override // X.AbstractC130625As, X.C5BC
    public void setClipRectF(RectF rectF) {
        o.LJIIIZ(rectF, "<set-?>");
        this.LJLL = rectF;
    }

    @Override // X.AbstractC130625As, X.C5BC
    public void setDrawDivider(boolean z) {
        if (this.LJLJL != z) {
            this.LJLJL = z;
            invalidate();
        }
    }

    @Override // X.AbstractC130625As, X.C5BC
    public void setItemSelected(boolean z) {
        this.LJLJLJ = z;
    }

    @Override // X.AbstractC130625As, X.C5BC
    public void setSegment(NLETrackSlot slot) {
        o.LJIIIZ(slot, "slot");
        setNleTrackSlot$editor_trackpanel_release(slot);
        setBgColor(LLF);
        NLESegmentFilter LIZLLL = NLESegmentFilter.LIZLLL(slot.LJI());
        if (LIZLLL != null) {
            String LJFF = LIZLLL.LJFF();
            o.LJIIIIZZ(LJFF, "it.filterName");
            setText(LJFF);
            setBgColor(LLD);
        }
    }

    public final void setText(String value) {
        o.LJIIIZ(value, "value");
        if (!o.LJ(value, this.LL)) {
            this.LL = value;
            invalidate();
        }
    }

    @Override // X.AbstractC130625As, X.C5BC
    public void setTimelineScale(float f) {
        this.LJLLI = f;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.LJLZ.setTextSize(C134845Qy.LIZ(10.0f));
        int LIZ = C134845Qy.LIZ(8.0f);
        V2B.LJIILL(this, LIZ, 0, LIZ, 0);
    }
}
