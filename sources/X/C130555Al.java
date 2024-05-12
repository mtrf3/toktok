package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextPaint;
import android.view.View;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLESegmentComposerFilter;
import com.bytedance.ies.nle.editor_jni.NLESegmentEffect;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.ss.ugc.android.editor.track.TrackState;
import com.ss.ugc.android.editor.track.viewmodels.TTrackPanelViewModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.5Al, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C130555Al extends AbstractC130625As implements InterfaceC70422pa {
    public static final int LLFFF;
    public boolean LJLJL;
    public boolean LJLJLJ;
    public float LJLJLLL;
    public RectF LJLL;
    public float LJLLI;
    public int LJLLILLLL;
    public int LJLLJ;
    public final Paint LJLLL;
    public final TextPaint LJLLLL;
    public final C62822Ol8 LJLLLLLL;
    public final C62822Ol8 LJLZ;
    public final C62822Ol8 LJZ;
    public C5AI LJZI;
    public final Rect LJZL;
    public final Path LL;
    public int LLD;
    public final XIA LLF;
    public String LLFF;

    static {
        ColorProtector.parseColor("#5E76EE");
        ColorProtector.parseColor("#ECC66B");
        ColorProtector.parseColor("#AB6D36");
        ColorProtector.parseColor("#C4425B");
        LLFFF = ColorProtector.parseColor("#EBAED8");
        ColorProtector.parseColor("#9f76c6");
        ColorProtector.parseColor("#6b7cca");
    }

    private final TTrackPanelViewModel getTrackViewModel() {
        return (TTrackPanelViewModel) this.LJZ.getValue();
    }

    @Override // X.C5BC
    public final boolean LIZLLL() {
        return this.LJLJLJ;
    }

    public final int getApplyType$editor_trackpanel_release() {
        return this.LLD;
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
        return this.LLF;
    }

    @Override // X.AbstractC130625As, X.C5BC
    public boolean getDrawDivider() {
        return this.LJLJL;
    }

    public final C5AI getLabelPainter$editor_trackpanel_release() {
        return this.LJZI;
    }

    public final String getText() {
        return this.LLFF;
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
    public C130555Al(C29S activity) {
        super(activity, null, 0);
        int i;
        o.LJIIIZ(activity, "activity");
        new LinkedHashMap();
        this.LJLJL = true;
        this.LJLL = new RectF();
        this.LJLLI = C1300758p.LIZIZ();
        Integer num = C1291054w.LJ().LJIIJJI;
        if (num != null) {
            i = num.intValue();
        } else {
            i = LLFFF;
        }
        this.LJLLILLLL = i;
        this.LJLLL = C6D8.LIZIZ(true);
        TextPaint textPaint = new TextPaint();
        textPaint.setColor(-1);
        textPaint.setAntiAlias(true);
        textPaint.setTextSize(C130945By.LIZ);
        textPaint.setStrokeWidth(C134845Qy.LIZ(1.0f));
        textPaint.setStyle(Paint.Style.FILL);
        this.LJLLLL = textPaint;
        this.LJLLLLLL = C221108m2.LIZIZ(C127584za.LJLIL);
        this.LJLZ = C221108m2.LIZIZ(C127554zX.LJLIL);
        this.LJZ = C221108m2.LIZIZ(C130875Br.LJLIL);
        final Context context = getContext();
        o.LJIIIIZZ(context, "context");
        this.LJZI = new C5AI(this, context) { // from class: X.5Ar
            public final C130555Al LIZ;
            public final Context LIZIZ;
            public final C130635At LIZJ;
            public final Rect LIZLLL;
            public final TextPaint LJ;
            public final C62822Ol8 LJFF;

            {
                o.LJIIIZ(this, "view");
                this.LIZ = this;
                this.LIZIZ = context;
                this.LIZJ = new C130635At(this);
                this.LIZLLL = new Rect();
                TextPaint textPaint2 = new TextPaint();
                textPaint2.setColor(-1);
                textPaint2.setAntiAlias(true);
                textPaint2.setTextSize(C134845Qy.LIZ(12.0f));
                textPaint2.setStrokeWidth(C134845Qy.LIZ(1.0f));
                textPaint2.setStyle(Paint.Style.FILL);
                this.LJ = textPaint2;
                this.LJFF = C221108m2.LIZIZ(C5BO.LJLIL);
            }

            @Override // X.C5AI
            public final void LIZ(C5BC trackItemView, NLETrackSlot nLETrackSlot, RectF drawRect, Canvas canvas, int i2, long j) {
                float f;
                int i3;
                o.LJIIIZ(trackItemView, "trackItemView");
                o.LJIIIZ(drawRect, "drawRect");
                o.LJIIIZ(canvas, "canvas");
                int applyType$editor_trackpanel_release = this.LIZ.getApplyType$editor_trackpanel_release();
                if (applyType$editor_trackpanel_release != 0) {
                    if (applyType$editor_trackpanel_release != 1) {
                        if (applyType$editor_trackpanel_release == 2) {
                            C130635At c130635At = this.LIZJ;
                            String string = this.LIZ.getResources().getString(R.string.blh);
                            o.LJIIIIZZ(string, "view.resources.getString(R.string.all_)");
                            c130635At.LIZ(canvas, string, this.LIZ.getBgColor());
                        }
                    } else {
                        C130635At c130635At2 = this.LIZJ;
                        String string2 = this.LIZ.getResources().getString(R.string.jma);
                        o.LJIIIIZZ(string2, "view.resources.getString(R.string.pip_2)");
                        c130635At2.LIZ(canvas, string2, this.LIZ.getBgColor());
                    }
                } else {
                    C130635At c130635At3 = this.LIZJ;
                    String string3 = this.LIZ.getResources().getString(R.string.hze);
                    o.LJIIIIZZ(string3, "view.resources.getString(R.string.main_track)");
                    c130635At3.LIZ(canvas, string3, this.LIZ.getBgColor());
                }
                TextPaint textPaint2 = this.LJ;
                if (((Boolean) this.LJFF.getValue()).booleanValue()) {
                    f = C130675Ax.LJLLJ;
                } else {
                    f = C130675Ax.LJLLILLLL;
                }
                textPaint2.setTextSize(f);
                TextPaint textPaint3 = this.LJ;
                if (((Boolean) this.LJFF.getValue()).booleanValue()) {
                    i3 = C04330Ez.LIZIZ(this.LIZIZ, R.color.kj);
                } else {
                    i3 = -1;
                }
                textPaint3.setColor(i3);
                this.LJ.getTextBounds(this.LIZ.getText(), 0, this.LIZ.getText().length(), this.LIZLLL);
                canvas.drawText(this.LIZ.getText(), this.LIZJ.LJII + C130675Ax.LJLLI + C130675Ax.LJLJLJ, ((Math.abs(this.LJ.ascent()) - this.LJ.descent()) / 2) + (this.LIZ.getMeasuredHeight() / 2) + C134845Qy.LIZ(1.0f), this.LJ);
            }
        };
        new Path();
        C134845Qy.LIZ(2.0f);
        this.LJZL = new Rect();
        this.LL = new Path();
        this.LLD = -1;
        this.LLF = C78613UtF.LIZJ;
        this.LLFF = "";
    }

    @Override // X.AbstractC130625As, X.C5BC
    public final void LIZJ(Canvas canvas) {
        int bgColor;
        int i;
        View view;
        o.LJIIIZ(canvas, "canvas");
        canvas.getClipBounds(this.LJZL);
        Paint paint = this.LJLLL;
        Integer num = C1291054w.LJ().LJIILJJIL;
        if (num != null) {
            bgColor = num.intValue();
        } else {
            bgColor = getBgColor();
        }
        paint.setColor(bgColor);
        canvas.drawRoundRect(new RectF(this.LJZL), getBgRadius(), getBgRadius(), this.LJLLL);
        if (!this.LJLJLJ) {
            Rect rect = this.LJZL;
            int i2 = rect.left;
            int i3 = rect.right - C130675Ax.LJLJL;
            Rect rect2 = this.LJZL;
            RectF rectF = new RectF(i2 + r0, rect2.top, i3, rect2.bottom);
            this.LL.reset();
            this.LL.addRoundRect(rectF, getBgRadius(), getBgRadius(), Path.Direction.CCW);
            canvas.clipPath(this.LL);
        }
        this.LJLLL.setColor(getBgColor());
        if (getBgRadius() > 0) {
            canvas.drawRoundRect(new RectF(this.LJZL), getBgRadius(), getBgRadius(), this.LJLLL);
        } else {
            canvas.drawRect(this.LJZL, this.LJLLL);
        }
        NLETrackSlot nleTrackSlot$editor_trackpanel_release = getNleTrackSlot$editor_trackpanel_release();
        if (nleTrackSlot$editor_trackpanel_release != null) {
            Object parent = getParent();
            if ((parent instanceof C1303859u) && (view = (View) parent) != null) {
                i = view.getScrollX();
            } else {
                i = 0;
            }
            C5AI c5ai = this.LJZI;
            Rect rect3 = this.LJZL;
            o.LJIIIZ(rect3, "<this>");
            c5ai.LIZ(this, nleTrackSlot$editor_trackpanel_release, new RectF(rect3), canvas, i, 0L);
        }
        super.LIZJ(canvas);
    }

    @Override // X.AbstractC130625As, android.view.View
    public final void onDraw(Canvas canvas) {
        int LIZ;
        if (canvas != null && !this.LJLJLJ) {
            if (((Boolean) this.LJLZ.getValue()).booleanValue()) {
                if (((Boolean) this.LJLLLLLL.getValue()).booleanValue()) {
                    if (getTrackViewModel().jv0() == TrackState.NORMAL) {
                        LIZ = C134845Qy.LIZ(4.0f);
                    } else {
                        LIZ = C134845Qy.LIZ(5.0f);
                    }
                } else {
                    LIZ = C134845Qy.LIZ(6.0f);
                }
            } else if (((Boolean) this.LJLLLLLL.getValue()).booleanValue()) {
                C5A5.LJJJJZ.getClass();
                LIZ = (int) C5BD.LIZJ;
            } else {
                LIZ = C134845Qy.LIZ(1.0f);
            }
            setBgRadius(LIZ);
            LIZJ(canvas);
        }
    }

    public final void setApplyType$editor_trackpanel_release(int i) {
        this.LLD = i;
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

    public final void setLabelPainter$editor_trackpanel_release(C5AI c5ai) {
        o.LJIIIZ(c5ai, "<set-?>");
        this.LJZI = c5ai;
    }

    @Override // X.AbstractC130625As, X.C5BC
    public void setSegment(NLETrackSlot slot) {
        int i;
        boolean z;
        o.LJIIIZ(slot, "slot");
        setNleTrackSlot$editor_trackpanel_release(slot);
        Integer num = C1291054w.LJ().LJIIJJI;
        if (num != null) {
            i = num.intValue();
        } else {
            i = LLFFF;
        }
        setBgColor(i);
        NLESegment LJI = slot.LJI();
        boolean z2 = false;
        if (NLESegmentEffect.LIZLLL(LJI) != null) {
            z = true;
        } else {
            z = false;
        }
        if (NLESegmentComposerFilter.LJIIIIZZ(LJI) != null) {
            z2 = true;
        }
        if (z || z2) {
            String LJ = LJI.LIZIZ().LJ();
            o.LJIIIIZZ(LJ, "mainSegment.resource.resourceName");
            setText(LJ);
        }
    }

    public final void setText(String value) {
        o.LJIIIZ(value, "value");
        if (!o.LJ(value, this.LLFF)) {
            this.LLFF = value;
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
        this.LJLLLL.setTextSize(C134845Qy.LIZ(10.0f));
        int LIZ = C134845Qy.LIZ(8.0f);
        V2B.LJIILL(this, LIZ, 0, LIZ, 0);
    }
}
