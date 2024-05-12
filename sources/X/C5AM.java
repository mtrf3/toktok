package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import com.ss.ugc.android.editor.track.viewmodels.TrackPanelViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.5AM, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5AM implements InterfaceC1293655w {
    public final ActivityC45651qj LIZ;
    public final C62822Ol8 LIZIZ;
    public final C62822Ol8 LIZJ;
    public final Paint LIZLLL;
    public final Rect LJ;
    public final Rect LJFF;
    public final T5S LJI;
    public final SY9 LJII;
    public final int LJIIIIZZ;
    public final int LJIIIZ;
    public final int LJIIJ;
    public final int LJIIJJI;
    public final int LJIIL;
    public final int LJIILIIL;
    public final int LJIILJJIL;
    public final int LJIILL;
    public final String LJIILLIIL;
    public final int LJIIZILJ;
    public final C62822Ol8 LJIJ;

    public final boolean LIZIZ() {
        return ((Boolean) this.LJIJ.getValue()).booleanValue();
    }

    public final boolean LIZJ() {
        return ((Boolean) this.LIZIZ.getValue()).booleanValue();
    }

    public C5AM(ActivityC45651qj context) {
        Integer LJI;
        float f;
        Integer LJI2;
        o.LJIIIZ(context, "context");
        this.LIZ = context;
        this.LIZIZ = C221108m2.LIZIZ(C5AO.LJLIL);
        C62822Ol8 LIZIZ = C221108m2.LIZIZ(C1281451e.LJLIL);
        this.LIZJ = LIZIZ;
        Paint paint = new Paint();
        this.LIZLLL = paint;
        this.LJ = new Rect();
        this.LJFF = new Rect();
        T5S t5s = new T5S();
        this.LJI = t5s;
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = R.raw.icon_music_note_s_alt;
        c2068389v.LJ = Integer.valueOf(R.attr.dj);
        c2068389v.LJFF = false;
        this.LJII = c2068389v.LIZ(context);
        this.LJIIIIZZ = C134845Qy.LIZ(2.0f);
        this.LJIIIZ = C134845Qy.LIZ(2.0f);
        this.LJIIJ = C134845Qy.LIZ(15.0f);
        this.LJIIJJI = C134845Qy.LIZ(2.0f);
        C134845Qy.LIZ(1.5f);
        this.LJIIL = C134845Qy.LIZ(2.0f);
        C134845Qy.LIZ(1.0f);
        this.LJIILIIL = C134845Qy.LIZ(4.0f);
        this.LJIILJJIL = C134845Qy.LIZ(12.0f);
        int LIZ = C134845Qy.LIZ(C5CK.LIZIZ() ? 12.0f : 10.0f);
        this.LJIILL = C134845Qy.LIZ(1.0f);
        C134845Qy.LIZ(10.0f);
        String string = context.getString(R.string.fnw);
        o.LJIIIIZZ(string, "context.getString(R.stri….editor_pro_sound_thread)");
        this.LJIILLIIL = string;
        int LJIIIIZZ = AnonymousClass636.LJIIIIZZ(R.attr.dj, context);
        this.LJIIZILJ = LJIIIIZZ;
        this.LJIJ = C221108m2.LIZIZ(new AqS152S0100000_2(this, 1016));
        C62822Ol8 LIZIZ2 = C221108m2.LIZIZ(C5AL.LJLIL);
        paint.setAntiAlias(true);
        Integer valueOf = Integer.valueOf(R.attr.d9);
        if (valueOf != null && (LJI = C79045V0n.LJI(valueOf.intValue(), context)) != null) {
            paint.setColor(LJI.intValue());
        }
        t5s.setAntiAlias(true);
        if (LIZJ()) {
            f = C134845Qy.LIZ(13.0f);
        } else {
            f = LIZ;
        }
        t5s.setTextSize(f);
        if (LIZJ()) {
            t5s.LIZ(62);
        } else {
            t5s.LIZ(61);
        }
        if (LIZJ() && (LJI2 = C79045V0n.LJI(R.attr.aas, context)) != null) {
            LJIIIIZZ = LJI2.intValue();
        }
        t5s.setColor(LJIIIIZZ);
        t5s.setStrokeWidth(C134845Qy.LIZ(1.0f));
        t5s.setStyle(Paint.Style.FILL);
        if (((Boolean) LIZIZ.getValue()).booleanValue()) {
            if (((TrackPanelViewModel) LIZIZ2.getValue()).ov0()) {
                C134845Qy.LIZ(24.0f);
            } else {
                C134845Qy.LIZ(34.0f);
            }
            C134845Qy.LIZ(18.0f);
            C134845Qy.LIZ(17.0f);
            this.LJIILJJIL = C134845Qy.LIZ(14.0f);
            this.LJIIIIZZ = 0;
            this.LJIIJJI = C134845Qy.LIZ(4.0f);
        }
    }

    @Override // X.InterfaceC1293655w
    public final void LIZ(Canvas canvas, C130535Aj view, int i) {
        int i2;
        int i3;
        o.LJIIIZ(canvas, "canvas");
        o.LJIIIZ(view, "view");
        canvas.getClipBounds(this.LJFF);
        if (LIZIZ()) {
            if (C127734zp.LIZJ) {
                i2 = canvas.getClipBounds().right;
            } else {
                i2 = view.getMeasuredWidth();
            }
        } else {
            int left = view.getLeft();
            if (i > left && C127734zp.LIZJ) {
                i2 = i - left;
            } else {
                i2 = 0;
            }
        }
        T5S t5s = this.LJI;
        String str = this.LJIILLIIL;
        t5s.getTextBounds(str, 0, str.length(), this.LJ);
        if (!((Boolean) this.LIZJ.getValue()).booleanValue()) {
            if (LIZIZ()) {
                float width = (((((i2 - this.LJIIIIZZ) - this.LJIIJJI) - this.LJIILJJIL) - this.LJIIL) - this.LJ.width()) - this.LJIILIIL;
                int i4 = this.LJIIIZ;
                float f = i4 + this.LJIIJ;
                float f2 = this.LJIILL;
                canvas.drawRoundRect(width, i4, i2 - this.LJIIIIZZ, f, f2, f2, this.LIZLLL);
            } else {
                float f3 = this.LJIIIIZZ + i2;
                float f4 = this.LJIIIZ + this.LJIIJ;
                float f5 = this.LJIILL;
                canvas.drawRoundRect(f3, this.LJIIIZ, this.LJIIJJI + f3 + this.LJIILJJIL + this.LJIIL + this.LJ.width() + this.LJIILIIL, f4, f5, f5, this.LIZLLL);
            }
        }
        if (LIZIZ()) {
            this.LJII.setBounds(((i2 - this.LJIIIIZZ) - this.LJIIJJI) - this.LJIILJJIL, this.LJFF.centerY() - (this.LJIILJJIL / 2), (i2 - this.LJIIIIZZ) - this.LJIIJJI, (this.LJIILJJIL / 2) + this.LJFF.centerY());
        } else {
            SY9 sy9 = this.LJII;
            int i5 = this.LJIIIIZZ + i2 + this.LJIIJJI;
            int centerY = this.LJFF.centerY();
            int i6 = this.LJIILJJIL;
            sy9.setBounds(i5, centerY - (i6 / 2), this.LJIIIIZZ + i2 + this.LJIIJJI + i6, (this.LJIILJJIL / 2) + this.LJFF.centerY());
        }
        if (LIZJ()) {
            SY9 sy92 = this.LJII;
            Integer LJI = C79045V0n.LJI(R.attr.aas, this.LIZ);
            if (LJI != null) {
                i3 = LJI.intValue();
            } else {
                i3 = this.LJIIZILJ;
            }
            sy92.LJ(i3);
        }
        this.LJII.draw(canvas);
        float centerY2 = this.LJFF.centerY() - ((this.LJI.ascent() + this.LJI.descent()) / 2);
        if (LIZIZ()) {
            canvas.drawText(this.LJIILLIIL, ((((i2 - this.LJIIIIZZ) - this.LJIIJJI) - this.LJIILJJIL) - this.LJIIL) - this.LJ.width(), centerY2, this.LJI);
        } else {
            canvas.drawText(this.LJIILLIIL, this.LJIIIIZZ + i2 + this.LJIIJJI + this.LJIILJJIL + this.LJIIL, centerY2, this.LJI);
        }
    }
}
