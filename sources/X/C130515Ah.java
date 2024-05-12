package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.ugc.android.editor.core.EditorProContext;
import com.ss.ugc.android.editor.track.viewmodels.TrackPanelViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.5Ah, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C130515Ah implements C5AI {
    public final ActivityC45651qj LIZ;
    public final T5S LIZIZ;
    public final SY9 LIZJ;
    public final int LIZLLL;
    public final Rect LJ;
    public String LJFF;
    public final C62822Ol8 LJI;
    public final C62822Ol8 LJII;
    public int LJIIIIZZ;
    public final int LJIIIZ;
    public int LJIIJ;
    public final C62822Ol8 LJIIJJI;
    public final C62822Ol8 LJIIL;
    public final int LJIILIIL;
    public final C62822Ol8 LJIILJJIL;

    public final boolean LIZIZ() {
        return ((Boolean) this.LJIIL.getValue()).booleanValue();
    }

    public final boolean LIZJ() {
        return ((Boolean) this.LJIIJJI.getValue()).booleanValue();
    }

    public C130515Ah(ActivityC45651qj activity) {
        float f;
        float f2;
        int LIZ;
        Integer LJI;
        o.LJIIIZ(activity, "activity");
        this.LIZ = activity;
        T5S t5s = new T5S();
        this.LIZIZ = t5s;
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = R.raw.icon_effect_rectangle_alt_fill;
        c2068389v.LJ = Integer.valueOf(R.attr.dj);
        c2068389v.LJFF = false;
        this.LIZJ = c2068389v.LIZ(activity);
        float f3 = 8.0f;
        this.LIZLLL = C134845Qy.LIZ(8.0f);
        this.LJ = new Rect();
        this.LJFF = "";
        this.LJI = C221108m2.LIZIZ(C5AR.LJLIL);
        this.LJII = C221108m2.LIZIZ(C5BW.LJLIL);
        if (C5CK.LIZIZ()) {
            f = 9.0f;
        } else if (C5CK.LIZJ()) {
            f = 10.0f;
        } else {
            f = 8.0f;
        }
        this.LJIIIIZZ = C134845Qy.LIZ(f);
        this.LJIIIZ = C134845Qy.LIZ(4.0f);
        if (!C5CK.LIZIZ()) {
            if (C5CK.LIZJ()) {
                f3 = 9.0f;
            } else {
                f3 = 7.0f;
            }
        }
        this.LJIIJ = C134845Qy.LIZ(f3);
        this.LJIIJJI = C221108m2.LIZIZ(C130755Bf.LJLIL);
        this.LJIIL = C221108m2.LIZIZ(C130475Ad.LJLIL);
        if (C5CK.LIZIZ() || LIZJ()) {
            f2 = 14.0f;
        } else {
            f2 = 12.0f;
        }
        this.LJIILIIL = C134845Qy.LIZ(f2);
        this.LJIILJJIL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 796));
        t5s.setAntiAlias(true);
        if (LIZJ()) {
            LIZ = C134845Qy.LIZ(13.0f);
        } else {
            LIZ = C134845Qy.LIZ(C5CK.LIZIZ() ? 12.0f : 10.0f);
        }
        t5s.setTextSize(LIZ);
        if (LIZJ()) {
            LJI = C79045V0n.LJI(R.attr.aau, activity);
        } else {
            LJI = C79045V0n.LJI(R.attr.dj, activity);
        }
        if (LJI != null) {
            t5s.setColor(LJI.intValue());
        }
        t5s.setStrokeWidth(C134845Qy.LIZ(1.0f));
        t5s.setStyle(Paint.Style.FILL);
        if (LIZJ()) {
            t5s.LIZ(62);
        } else {
            t5s.LIZ(61);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C5AI
    public final void LIZ(C5BC trackItemView, NLETrackSlot nLETrackSlot, RectF drawRect, Canvas canvas, int i, long j) {
        boolean z;
        boolean z2;
        C130555Al c130555Al;
        int i2;
        int i3;
        int i4;
        Integer LJI;
        int measuredWidth;
        int LIZ;
        o.LJIIIZ(trackItemView, "trackItemView");
        o.LJIIIZ(drawRect, "drawRect");
        o.LJIIIZ(canvas, "canvas");
        if (LIZIZ()) {
            if (((TrackPanelViewModel) this.LJI.getValue()).ov0()) {
                LIZ = C134845Qy.LIZ(24.0f);
            } else {
                LIZ = C134845Qy.LIZ(34.0f);
            }
            this.LJIIJ = (LIZ - C134845Qy.LIZ(18.0f)) / 2;
            this.LJIIIIZZ = (LIZ - C134845Qy.LIZ(16.0f)) / 2;
        }
        if (C124574uj.LJIIL(C79057V0z.LJJI((EditorProContext) this.LJII.getValue())) > 1) {
            z = true;
        } else {
            z = false;
        }
        if (LIZIZ() && ((TrackPanelViewModel) this.LJI.getValue()).ov0() && z) {
            z2 = false;
        } else {
            z2 = true;
        }
        View view = (View) trackItemView;
        float clipStart = trackItemView.getClipStart() + view.getLeft();
        float f = 0.0f;
        if (((Boolean) this.LJIILJJIL.getValue()).booleanValue()) {
            if (C127734zp.LIZJ) {
                measuredWidth = canvas.getClipBounds().right;
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
            }
        }
        if (z2) {
            if (LIZIZ()) {
                i4 = C134845Qy.LIZ(4.0f);
            } else {
                i4 = this.LIZLLL;
            }
            SY9 sy9 = this.LIZJ;
            if (((Boolean) this.LJIILJJIL.getValue()).booleanValue()) {
                int i5 = ((int) f) - i4;
                int i6 = this.LJIILIIL;
                int i7 = this.LJIIIIZZ;
                sy9.setBounds(i5 - i6, i7, i5, i6 + i7);
            } else {
                int i8 = i4 + ((int) f);
                int i9 = this.LJIIIIZZ;
                int i10 = this.LJIILIIL;
                sy9.setBounds(i8, i9, i8 + i10, i10 + i9);
            }
            if (LIZJ() && (LJI = C79045V0n.LJI(R.attr.aau, this.LIZ)) != null) {
                sy9.LJ(LJI.intValue());
            }
            sy9.draw(canvas);
        }
        if (trackItemView instanceof C130555Al) {
            c130555Al = (C130555Al) trackItemView;
        } else {
            c130555Al = null;
        }
        int i11 = this.LJIILIIL;
        if (LIZIZ()) {
            i2 = C134845Qy.LIZ(4.0f);
        } else {
            i2 = this.LIZLLL;
        }
        if (LIZIZ()) {
            i3 = C134845Qy.LIZ(2.0f);
        } else {
            i3 = this.LJIIIZ;
        }
        if (!z2) {
            i3 = C134845Qy.LIZ(6.0f);
            i2 = 0;
            i11 = 0;
        }
        if (c130555Al != null) {
            if (((Boolean) this.LJIILJJIL.getValue()).booleanValue()) {
                if (c130555Al.getText().length() == 0) {
                    this.LJ.set(0, 0, 0, 0);
                    this.LJFF = "";
                } else if (!o.LJ(this.LJFF, c130555Al.getText())) {
                    this.LIZIZ.getTextBounds(c130555Al.getText(), 0, c130555Al.getText().length(), this.LJ);
                    this.LJFF = c130555Al.getText();
                }
                canvas.drawText(c130555Al.getText(), f - (this.LJ.width() + ((i2 + i11) + i3)), this.LIZIZ.getTextSize() + this.LJIIJ, this.LIZIZ);
                return;
            }
            canvas.drawText(c130555Al.getText(), AnonymousClass036.LIZIZ((int) f, i2, i11, i3), this.LIZIZ.getTextSize() + this.LJIIJ, this.LIZIZ);
        }
    }
}
