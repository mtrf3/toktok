package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.ugc.android.editor.core.EditorProContext;
import com.ss.ugc.android.editor.track.viewmodels.TrackPanelViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.5B3, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5B3 implements C5AI {
    public final ActivityC45651qj LIZ;
    public final C62822Ol8 LIZIZ;
    public final C62822Ol8 LIZJ;
    public final C62822Ol8 LIZLLL;
    public final Paint LJ;
    public final Rect LJFF;
    public final Rect LJI;
    public final T5S LJII;
    public SY9 LJIIIIZZ;
    public final SY9 LJIIIZ;
    public int LJIIJ;
    public final int LJIIJJI;
    public final SY9 LJIIL;
    public final SY9 LJIILIIL;
    public final int LJIILJJIL;
    public int LJIILL;
    public final int LJIILLIIL;
    public final int LJIIZILJ;
    public int LJIJ;
    public final C62822Ol8 LJIJI;
    public final int LJIJJ;
    public final C62822Ol8 LJIJJLI;
    public final C62822Ol8 LJIL;
    public final C62822Ol8 LJJ;
    public final C62822Ol8 LJJI;
    public final C62822Ol8 LJJIFFI;
    public final C62822Ol8 LJJII;
    public final C62822Ol8 LJJIII;
    public final C62822Ol8 LJJIIJ;

    public final float LIZJ() {
        return ((Number) this.LJIJI.getValue()).floatValue();
    }

    public final boolean LIZLLL() {
        return ((Boolean) this.LJJIIJ.getValue()).booleanValue();
    }

    public final boolean LJ() {
        return ((Boolean) this.LIZJ.getValue()).booleanValue();
    }

    public C5B3(ActivityC45651qj activity) {
        Integer LJI;
        float f;
        o.LJIIIZ(activity, "activity");
        this.LIZ = activity;
        this.LIZIZ = C221108m2.LIZIZ(C5BQ.LJLIL);
        this.LIZJ = C221108m2.LIZIZ(C130775Bh.LJLIL);
        this.LIZLLL = C221108m2.LIZIZ(C130485Ae.LJLIL);
        Paint paint = new Paint();
        this.LJ = paint;
        this.LJFF = new Rect();
        this.LJI = new Rect();
        T5S t5s = new T5S();
        this.LJII = t5s;
        this.LJIIIIZZ = LJFF(R.raw.icon_music_note_s_alt);
        this.LJIIIZ = LJFF(R.raw.icon_speaker_x_mark_fill_ltr);
        this.LJIIJ = C134845Qy.LIZ(2.0f);
        this.LJIIJJI = C134845Qy.LIZ(2.0f);
        this.LJIIL = LJFF(R.raw.icon_speed_meter_fill);
        this.LJIILIIL = LJFF(R.raw.icon_music_note_star_fill);
        this.LJIILJJIL = C134845Qy.LIZ(15.0f);
        this.LJIILL = C134845Qy.LIZ(2.0f);
        C134845Qy.LIZ(1.5f);
        this.LJIILLIIL = C134845Qy.LIZ(2.0f);
        C134845Qy.LIZ(1.5f);
        this.LJIIZILJ = C134845Qy.LIZ(4.0f);
        this.LJIJ = C134845Qy.LIZ(12.0f);
        int LIZ = C134845Qy.LIZ(C5CK.LIZIZ() ? 12.0f : 10.0f);
        this.LJIJI = C221108m2.LIZIZ(C5BI.LJLIL);
        C134845Qy.LIZ(10.0f);
        int LJIIIIZZ = AnonymousClass636.LJIIIIZZ(R.attr.dj, activity);
        this.LJIJJ = LJIIIIZZ;
        this.LJIJJLI = C221108m2.LIZIZ(new AqS152S0100000_2(this, 1022));
        this.LJIL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 1020));
        this.LJJ = C221108m2.LIZIZ(new AqS152S0100000_2(this, 1018));
        this.LJJI = C221108m2.LIZIZ(C5AS.LJLIL);
        this.LJJIFFI = C221108m2.LIZIZ(new AqS152S0100000_2(this, 1021));
        this.LJJII = C221108m2.LIZIZ(C5BX.LJLIL);
        this.LJJIII = C221108m2.LIZIZ(new AqS152S0100000_2(this, 1023));
        this.LJJIIJ = C221108m2.LIZIZ(new AqS152S0100000_2(this, 1019));
        paint.setAntiAlias(true);
        Integer valueOf = Integer.valueOf(R.attr.d9);
        if (valueOf != null && (LJI = C79045V0n.LJI(valueOf.intValue(), activity)) != null) {
            paint.setColor(LJI.intValue());
        }
        t5s.setAntiAlias(true);
        if (LJ()) {
            f = C134845Qy.LIZ(13.0f);
        } else {
            f = LIZ;
        }
        t5s.setTextSize(f);
        if (LJ()) {
            t5s.LIZ(62);
        } else {
            t5s.LIZ(61);
        }
        t5s.setColor(LJIIIIZZ);
        t5s.setStrokeWidth(C134845Qy.LIZ(1.0f));
        t5s.setStyle(Paint.Style.FILL);
    }

    public final SY9 LJFF(int i) {
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = i;
        c2068389v.LJ = Integer.valueOf(R.attr.dj);
        return c2068389v.LIZ(this.LIZ);
    }

    public final float LIZIZ(Canvas canvas, String str, SY9 sy9, View view, float f) {
        int i;
        int i2 = this.LJIILLIIL;
        if (str.length() == 0) {
            this.LJFF.set(0, 0, 0, 0);
            i2 = 0;
        } else {
            this.LJII.getTextBounds(str, 0, str.length(), this.LJFF);
        }
        if (LJ()) {
            if (((TrackPanelViewModel) this.LJJI.getValue()).ov0()) {
                C134845Qy.LIZ(24.0f);
            } else {
                C134845Qy.LIZ(34.0f);
            }
            C134845Qy.LIZ(18.0f);
            C134845Qy.LIZ(18.0f);
            this.LJIJ = C134845Qy.LIZ(14.0f);
            this.LJIIJ = 0;
            this.LJIILL = C134845Qy.LIZ(4.0f);
        }
        if (!LJ()) {
            if (LIZLLL()) {
                i = 2;
                canvas.drawRoundRect(f - ((this.LJFF.width() + (((this.LJIIJ + this.LJIILL) + this.LJIJ) + i2)) + this.LJIIZILJ), this.LJIIJJI, f - this.LJIIJ, r5 + this.LJIILJJIL, LIZJ(), LIZJ(), this.LJ);
            } else {
                i = 2;
                canvas.drawRoundRect(this.LJIIJ + f, this.LJIIJJI, f + this.LJFF.width() + r7 + this.LJIILL + this.LJIJ + i2 + this.LJIIZILJ, this.LJIIJJI + this.LJIILJJIL, LIZJ(), LIZJ(), this.LJ);
            }
        } else {
            i = 2;
        }
        if (LIZLLL()) {
            int i3 = (int) f;
            sy9.setBounds(((i3 - this.LJIIJ) - this.LJIILL) - this.LJIJ, this.LJI.centerY() - (this.LJIJ / i), (i3 - this.LJIIJ) - this.LJIILL, (this.LJIJ / i) + this.LJI.centerY());
        } else {
            int i4 = (int) f;
            int i5 = this.LJIIJ + i4 + this.LJIILL;
            int centerY = this.LJI.centerY();
            int i6 = this.LJIJ;
            sy9.setBounds(i5, centerY - (i6 / 2), i4 + this.LJIIJ + this.LJIILL + i6, (this.LJIJ / i) + this.LJI.centerY());
        }
        float f2 = 255;
        sy9.setAlpha((int) (view.getAlpha() * f2));
        sy9.draw(canvas);
        if (str.length() > 0) {
            float centerY2 = this.LJI.centerY() - ((this.LJII.ascent() + this.LJII.descent()) / i);
            this.LJII.setAlpha((int) (view.getAlpha() * f2));
            if (LIZLLL()) {
                canvas.drawText(str, f - (this.LJFF.width() + (((this.LJIIJ + this.LJIILL) + this.LJIJ) + i2)), centerY2, this.LJII);
            } else {
                canvas.drawText(str, this.LJIIJ + this.LJIILL + this.LJIJ + i2 + f, centerY2, this.LJII);
            }
        }
        float width = this.LJFF.width() + this.LJIIJ + this.LJIILL + this.LJIJ + i2 + this.LJIIZILJ;
        if (LIZLLL()) {
            return f - width;
        }
        return f + width;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C5AI
    public final void LIZ(C5BC trackItemView, NLETrackSlot nLETrackSlot, RectF drawRect, Canvas canvas, int i, long j) {
        EnumC123874tb enumC123874tb;
        SY9 sy9;
        boolean z;
        NLEResourceNode LIZIZ;
        String text;
        String str;
        boolean z2;
        float f;
        boolean z3;
        int measuredWidth;
        int i2;
        int i3;
        o.LJIIIZ(trackItemView, "trackItemView");
        o.LJIIIZ(drawRect, "drawRect");
        Canvas canvas2 = canvas;
        o.LJIIIZ(canvas2, "canvas");
        C5B3 c5b3 = this;
        canvas2.getClipBounds(c5b3.LJI);
        EnumC123874tb enumC123874tb2 = null;
        if (nLETrackSlot.LJI().LIZIZ().LJFF() == EnumC123874tb.SOUND) {
            sy9 = (SY9) c5b3.LJIJJLI.getValue();
            z = true;
        } else {
            NLESegment LJI = nLETrackSlot.LJI();
            if (LJI != null && (LIZIZ = LJI.LIZIZ()) != null) {
                enumC123874tb = LIZIZ.LJFF();
            } else {
                enumC123874tb = null;
            }
            if (enumC123874tb == EnumC123874tb.RECORD) {
                sy9 = (SY9) c5b3.LJIL.getValue();
            } else {
                sy9 = (SY9) c5b3.LJJ.getValue();
            }
            z = false;
        }
        c5b3.LJIIIIZZ = sy9;
        if (c5b3.LJ()) {
            if (z) {
                Integer LJI2 = C79045V0n.LJI(R.attr.aay, c5b3.LIZ);
                if (LJI2 != null) {
                    i3 = LJI2.intValue();
                } else {
                    i3 = c5b3.LJIJJ;
                }
                c5b3.LJII.setColor(i3);
                c5b3.LJIIIIZZ.LJ(i3);
                c5b3.LJIIIZ.LJ(i3);
                ((SY9) c5b3.LJJIII.getValue()).LJ(i3);
                c5b3.LJIIL.LJ(i3);
                c5b3.LJIILIIL.LJ(i3);
            } else {
                Integer LJI3 = C79045V0n.LJI(R.attr.aas, c5b3.LIZ);
                if (LJI3 != null) {
                    i2 = LJI3.intValue();
                } else {
                    i2 = c5b3.LJIJJ;
                }
                c5b3.LJII.setColor(i2);
                c5b3.LJIIIIZZ.LJ(i2);
                c5b3.LJIIIZ.LJ(i2);
                ((SY9) c5b3.LJJIII.getValue()).LJ(i2);
                c5b3.LJIIL.LJ(i2);
                c5b3.LJIILIIL.LJ(i2);
            }
        }
        NLESegmentAudio LIZLLL = NLESegmentAudio.LIZLLL(nLETrackSlot.LJI());
        float LJIILJJIL = LIZLLL.LJIILJJIL();
        NLEResourceNode LIZIZ2 = LIZLLL.LIZIZ();
        if (LIZIZ2 != null) {
            enumC123874tb2 = LIZIZ2.LJFF();
        }
        if (enumC123874tb2 == EnumC123874tb.RECORD) {
            text = (String) c5b3.LJJIFFI.getValue();
        } else {
            text = LIZLLL.LIZIZ().LJ();
        }
        String voiceEffect = nLETrackSlot.getExtra("extra_voice_change_effect_name");
        if (!((Boolean) c5b3.LIZIZ.getValue()).booleanValue() || LIZLLL.getAbsSpeed() == 1.0f) {
            str = "";
        } else {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(Math.floor(LIZLLL.getAbsSpeed() * 100.0d) / 100);
            LIZ.append('X');
            str = X1D.LIZIZ(LIZ);
        }
        if (((Boolean) c5b3.LIZIZ.getValue()).booleanValue() && C122284r2.LIZLLL(C79057V0z.LJJI((EditorProContext) c5b3.LJJII.getValue())) && (nLETrackSlot.LJI().LIZIZ().LJFF() == EnumC123874tb.AUDIO || nLETrackSlot.LJI().LIZIZ().LJFF() == EnumC123874tb.ALGORITHM_AUDIO)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (((Boolean) c5b3.LIZIZ.getValue()).booleanValue() && text.length() > 10 && (str.length() > 0 || z2)) {
            StringBuilder LIZ2 = X1D.LIZ();
            String substring = text.substring(0, 9);
            o.LJIIIIZZ(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            LIZ2.append(substring);
            LIZ2.append("...");
            text = X1D.LIZIZ(LIZ2);
        }
        if (!(trackItemView instanceof View)) {
            return;
        }
        View view = (View) trackItemView;
        float clipStart = trackItemView.getClipStart() + view.getLeft();
        if (c5b3.LIZLLL()) {
            if (C127734zp.LIZJ) {
                measuredWidth = canvas2.getClipBounds().right;
            } else if (trackItemView.getClipRectF().width() == 0.0f) {
                measuredWidth = view.getMeasuredWidth();
            } else {
                f = trackItemView.getClipRectF().width();
            }
            f = measuredWidth;
        } else {
            float f2 = i;
            if (f2 > clipStart && C127734zp.LIZJ) {
                f = f2 - clipStart;
            } else {
                f = 0.0f;
            }
        }
        canvas2.save();
        o.LJIIIIZZ(text, "text");
        if (!ujb.o.LJJJJJL(text)) {
            f = c5b3.LIZIZ(canvas2, text, c5b3.LJIIIIZZ, view, f);
        }
        o.LJIIIIZZ(voiceEffect, "voiceEffect");
        if (voiceEffect.length() > 0) {
            SY9 sy92 = (SY9) c5b3.LJJIII.getValue();
            c5b3 = c5b3;
            canvas2 = canvas2;
            view = view;
            f = c5b3.LIZIZ(canvas2, voiceEffect, sy92, view, f);
        }
        if (LJIILJJIL == 0.0f) {
            z3 = true;
        } else {
            z3 = false;
        }
        if ((!((Boolean) c5b3.LIZLLL.getValue()).booleanValue() || !((TrackPanelViewModel) c5b3.LJJI.getValue()).ov0()) && z3) {
            SY9 sy93 = c5b3.LJIIIZ;
            c5b3 = c5b3;
            canvas2 = canvas2;
            view = view;
            f = c5b3.LIZIZ(canvas2, "", sy93, view, f);
        }
        if (!ujb.o.LJJJJJL(str)) {
            f = c5b3.LIZIZ(canvas2, str, c5b3.LJIIL, view, f);
        }
        if (z2) {
            c5b3.LIZIZ(canvas2, "", c5b3.LJIILIIL, view, f);
        }
        canvas2.restore();
    }
}
