package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import com.bytedance.ies.nle.editor_jni.NLEEditorJniJNI;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLEPointSPtr;
import com.zhiliaoapp.musically.R;
import java.util.Locale;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.5A8, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5A8 implements C5AI {
    public static final int LJIIJ = C134845Qy.LIZ(18.0f);
    public static final int LJIIJJI = C134845Qy.LIZ(2.0f);
    public static final int LJIIL = C134845Qy.LIZ(3.0f);
    public static final int LJIILIIL = C134845Qy.LIZ(4.0f);
    public static final int LJIILJJIL = C134845Qy.LIZ(4.0f);
    public static final int LJIILL = C134845Qy.LIZ(24.0f);
    public static final int LJIILLIIL = C134845Qy.LIZ(4.0f);
    public static final int LJIIZILJ = C134845Qy.LIZ(2.0f);
    public final ActivityC45651qj LIZ;
    public final Path LIZIZ;
    public final SY9 LIZJ;
    public final SY9 LIZLLL;
    public final Paint LJ;
    public final Paint LJFF;
    public final Rect LJI;
    public final C62822Ol8 LJII;
    public NLETrackSlot LJIIIIZZ;
    public C5A6 LJIIIZ;

    public final boolean LIZLLL() {
        return ((Boolean) this.LJII.getValue()).booleanValue();
    }

    public C5A8(ActivityC45651qj context) {
        float f;
        Integer LJI;
        o.LJIIIZ(context, "context");
        this.LIZ = context;
        this.LIZIZ = new Path();
        this.LIZJ = LJ(R.raw.icon_speaker_x_mark_fill_ltr);
        this.LIZLLL = LJ(R.raw.icon_speed_meter_fill);
        Paint LIZIZ = C6D8.LIZIZ(true);
        this.LJ = LIZIZ;
        Paint paint = new Paint();
        paint.setColor(-1);
        paint.setAntiAlias(true);
        if (C5CK.LIZIZ()) {
            f = 12.0f;
        } else {
            f = 10.0f;
        }
        paint.setTextSize(C134845Qy.LIZ(f));
        paint.setStyle(Paint.Style.FILL);
        paint.setTypeface(C8HI.LIZJ().LIZLLL("regular"));
        this.LJFF = paint;
        this.LJI = new Rect();
        this.LJII = C221108m2.LIZIZ(new AqS152S0100000_2(this, 1071));
        Integer valueOf = Integer.valueOf(R.attr.d9);
        if (valueOf == null || (LJI = C79045V0n.LJI(valueOf.intValue(), context)) == null) {
            return;
        }
        LIZIZ.setColor(LJI.intValue());
        if (!C5CK.LIZJ()) {
            return;
        }
        LIZIZ.setColor(1291845632);
    }

    public final SY9 LJ(int i) {
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = i;
        c2068389v.LJ = Integer.valueOf(R.attr.dj);
        c2068389v.LJFF = true;
        c2068389v.LIZIZ = C134845Qy.LIZ(12.0f);
        c2068389v.LIZJ = C134845Qy.LIZ(12.0f);
        return c2068389v.LIZ(this.LIZ);
    }

    public final void LIZIZ(Canvas canvas, float f, float f2, float f3, float f4) {
        C5A5.LJJJJZ.getClass();
        float f5 = C5BD.LIZJ;
        this.LIZIZ.reset();
        float f6 = f + f5;
        this.LIZIZ.moveTo(f6, f2);
        float f7 = f3 - f5;
        this.LIZIZ.lineTo(f7, f2);
        float f8 = f2 + f5;
        this.LIZIZ.quadTo(f3, f2, f3, f8);
        float f9 = f4 - f5;
        this.LIZIZ.lineTo(f3, f9);
        this.LIZIZ.quadTo(f3, f4, f7, f4);
        this.LIZIZ.lineTo(f6, f4);
        this.LIZIZ.quadTo(f, f4, f, f9);
        this.LIZIZ.lineTo(f, f8);
        this.LIZIZ.quadTo(f, f2, f6, f2);
        this.LIZIZ.close();
        canvas.drawPath(this.LIZIZ, this.LJ);
        this.LIZIZ.reset();
    }

    @Override // X.C5AI
    public final void LIZ(C5BC trackItemView, NLETrackSlot nLETrackSlot, RectF drawRect, Canvas canvas, int i, long j) {
        C5A6 c5a6;
        float f;
        int i2;
        float clipLength;
        float f2;
        float width;
        float f3;
        float LIZJ;
        float f4;
        o.LJIIIZ(trackItemView, "trackItemView");
        o.LJIIIZ(drawRect, "drawRect");
        o.LJIIIZ(canvas, "canvas");
        this.LJIIIIZZ = nLETrackSlot;
        if ((trackItemView instanceof C5A6) && (c5a6 = (C5A6) trackItemView) != null) {
            this.LJIIIZ = c5a6;
            if (LIZLLL()) {
                f = canvas.getClipBounds().right;
            } else {
                float clipStart = c5a6.getClipStart() + c5a6.getLeft();
                float f5 = i;
                if (f5 > clipStart) {
                    f = f5 - clipStart;
                } else {
                    f = 0.0f;
                }
            }
            NLESegmentVideo LJJ = NLESegmentVideo.LJJ(nLETrackSlot.LJI());
            if (C59E.LIZ[c5a6.getLabelType().ordinal()] == 1) {
                C59N c59n = new C59N(null);
                LJJ.getClass();
                c59n.LIZJ = !new VecNLEPointSPtr(NLEEditorJniJNI.NLESegmentAudio_getSegCurveSpeedPoints(LJJ.LIZJ, LJJ)).isEmpty() ? 1 : 0;
                c59n.LIZ = LJJ.getAbsSpeed();
                c59n.LJ = (float) LJJ.LJFF();
                String extra = LJJ.getExtra("curve_speed_name");
                o.LJIIIIZZ(extra, "convertToSegmentVideo.getExtra(CURVE_SPEED_NAME)");
                c59n.LIZLLL = extra;
                if (c5a6.LJLJLJ) {
                    if (LIZLLL()) {
                        i2 = -LJIILIIL;
                    } else {
                        i2 = LJIILIIL;
                    }
                    float f6 = f + i2;
                    float clipStart2 = c5a6.getClipStart();
                    if (c5a6.getClipLength() == 0.0f) {
                        clipLength = ((float) (nLETrackSlot.getDuration() / 1000)) * c5a6.getTimelineScale();
                    } else {
                        clipLength = c5a6.getClipLength();
                    }
                    String LIZ = C1298557t.LIZ((clipLength - clipStart2) / c5a6.getTimelineScale());
                    this.LJFF.getTextBounds(LIZ, 0, LIZ.length(), this.LJI);
                    int i3 = LJIIJJI;
                    float f7 = i3;
                    int i4 = LJIIJ;
                    float f8 = i4;
                    float f9 = f7 + f8;
                    if (LIZLLL()) {
                        f2 = (f6 - (LJIILJJIL * 2)) - this.LJI.width();
                    } else {
                        f2 = f6;
                    }
                    if (LIZLLL()) {
                        width = f6;
                    } else {
                        width = (LJIILJJIL * 2) + f2 + this.LJI.width();
                    }
                    LIZIZ(canvas, f2, f7, width, f9);
                    canvas.drawText(LIZ, LJIILJJIL + f2, (((f8 - this.LJFF.descent()) - this.LJFF.ascent()) / 2.0f) + f7, this.LJFF);
                    float f10 = width - f2;
                    if (LIZLLL()) {
                        f3 = (-f10) - LJIILIIL;
                    } else {
                        f3 = f10 + LJIILIIL;
                    }
                    float f11 = f6 + f3;
                    if (!C124574uj.LJJJJ(nLETrackSlot)) {
                        SY9 sy9 = this.LIZLLL;
                        if (c59n.LIZJ == 0) {
                            float f12 = c59n.LIZ;
                            if (f12 == 1.0f) {
                                LIZJ = 0.0f;
                            } else {
                                Locale locale = Locale.ENGLISH;
                                Object[] objArr = {Float.valueOf(f12)};
                                float f13 = i3;
                                LIZJ = LIZJ(c5a6, canvas, f13, f13 + i4, sy9, C63144OqK.LIZIZ(objArr, 1, locale, "%.1fx", "format(locale, format, *args)"), f11);
                            }
                        } else {
                            float f14 = i3;
                            LIZJ = LIZJ(c5a6, canvas, f14, f14 + i4, sy9, c59n.LIZLLL, f11);
                        }
                        if (LIZLLL()) {
                            f4 = LIZJ - LJIILIIL;
                        } else {
                            f4 = LIZJ + LJIILIIL;
                        }
                        f11 += f4;
                    }
                    if (C124574uj.LJJJJI(nLETrackSlot) && !C124574uj.LJJJJ(nLETrackSlot)) {
                        LIZJ(c5a6, canvas, f7, f9, this.LIZJ, "", f11);
                    }
                }
            }
        }
    }

    public final float LIZJ(C5A6 c5a6, Canvas canvas, float f, float f2, SY9 sy9, String str, float f3) {
        float f4;
        float f5;
        float f6;
        float f7 = f3;
        float measureText = this.LJFF.measureText(str);
        C5A6 c5a62 = this.LJIIIZ;
        if (c5a62 == null || !c5a62.LJLJLJ) {
            if (LIZLLL()) {
                f7 = c5a6.getMeasuredWidth();
            } else {
                f7 = 0.0f;
            }
        }
        if (LIZLLL()) {
            f4 = f7 - (LJIILL + measureText);
        } else {
            f4 = LJIILL + f7 + measureText;
        }
        if (LIZLLL()) {
            LIZIZ(canvas, f4, f, f7, f2);
        } else {
            LIZIZ(canvas, f7, f, f4, f2);
        }
        canvas.save();
        if (LIZLLL()) {
            f5 = (f7 - LJIILLIIL) - sy9.LJI;
        } else {
            f5 = LJIILLIIL + f7;
        }
        canvas.translate(f5, LJIIL + f);
        sy9.setBounds(0, 0, sy9.LJI, sy9.LJII);
        sy9.draw(canvas);
        canvas.restore();
        if (LIZLLL()) {
            f6 = (f5 - LJIIZILJ) - measureText;
        } else {
            f6 = f5 + sy9.LJI + LJIIZILJ;
        }
        canvas.drawText(str, f6, (((LJIIJ - this.LJFF.descent()) - this.LJFF.ascent()) / 2.0f) + f, this.LJFF);
        return f4 - f7;
    }
}
