package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.ss.ugc.android.editor.core.EditorProContext;
import com.ss.ugc.android.editor.track.TrackState;
import com.ss.ugc.android.editor.track.viewmodels.TrackPanelViewModel;
import com.zhiliaoapp.musically.R;
import defpackage.e1;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.5Ag, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C130505Ag implements C5AI {
    public final ActivityC45651qj LIZ;
    public final int LIZIZ;
    public final C62822Ol8 LIZJ;
    public final C62822Ol8 LIZLLL;
    public int LJ;
    public final T5S LJFF;
    public final SY9 LJI;
    public final int LJII;
    public final C62822Ol8 LJIIIIZZ;
    public final C62822Ol8 LJIIIZ;
    public int LJIIJ;
    public final int LJIIJJI;
    public final C62822Ol8 LJIIL;
    public final Rect LJIILIIL;
    public String LJIILJJIL;

    public final boolean LIZIZ() {
        return ((Boolean) this.LIZLLL.getValue()).booleanValue();
    }

    public C130505Ag(ActivityC45651qj context) {
        float f;
        float f2;
        o.LJIIIZ(context, "context");
        this.LIZ = context;
        this.LIZIZ = C134845Qy.LIZ(4.0f);
        C62822Ol8 LIZIZ = C221108m2.LIZIZ(C130495Af.LJLIL);
        this.LIZJ = LIZIZ;
        this.LIZLLL = C221108m2.LIZIZ(C130465Ac.LJLIL);
        float f3 = 9.0f;
        if (C5CK.LIZIZ()) {
            f = 8.0f;
        } else if (C5CK.LIZJ()) {
            f = 9.0f;
        } else {
            f = 7.0f;
        }
        this.LJ = C134845Qy.LIZ(f);
        T5S t5s = new T5S();
        t5s.setColor(context.getResources().getColor(R.color.bc));
        t5s.setAntiAlias(true);
        if (C5CK.LIZIZ()) {
            f2 = 12.0f;
        } else {
            f2 = 10.0f;
        }
        t5s.setTextSize(C134845Qy.LIZ(f2));
        t5s.setStrokeWidth(C134845Qy.LIZ(1.0f));
        t5s.setStyle(Paint.Style.FILL);
        this.LJFF = t5s;
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = R.raw.icon_human_soundwave_fill;
        c2068389v.LJ = Integer.valueOf(R.attr.dj);
        c2068389v.LJFF = false;
        this.LJI = c2068389v.LIZ(context);
        this.LJII = C134845Qy.LIZ(8.0f);
        this.LJIIIIZZ = C221108m2.LIZIZ(C5AQ.LJLIL);
        this.LJIIIZ = C221108m2.LIZIZ(C5BV.LJLIL);
        if (!C5CK.LIZIZ()) {
            if (C5CK.LIZJ()) {
                f3 = 10.0f;
            } else {
                f3 = 8.0f;
            }
        }
        this.LJIIJ = C134845Qy.LIZ(f3);
        this.LJIIJJI = C134845Qy.LIZ((C5CK.LIZIZ() || ((Boolean) LIZIZ.getValue()).booleanValue()) ? 14.0f : 12.0f);
        this.LJIIL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 700));
        this.LJIILIIL = new Rect();
        this.LJIILJJIL = "";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C5AI
    public final void LIZ(C5BC trackItemView, NLETrackSlot nLETrackSlot, RectF rect, Canvas canvas, int i, long j) {
        C130525Ai c130525Ai;
        int i2;
        int i3;
        boolean z;
        int i4;
        boolean z2;
        Integer LJI;
        View view;
        int LIZ;
        int intValue;
        o.LJIIIZ(trackItemView, "trackItemView");
        o.LJIIIZ(rect, "rect");
        o.LJIIIZ(canvas, "canvas");
        if (((Boolean) this.LIZJ.getValue()).booleanValue()) {
            T5S t5s = this.LJFF;
            if (o.LJ(nLETrackSlot.getExtra("text_slot_type"), "SUBTITLE")) {
                if (((TrackPanelViewModel) this.LJIIIIZZ.getValue()).jv0() == TrackState.NORMAL) {
                    if (C124574uj.LJJIII(C79057V0z.LJJI((EditorProContext) this.LJIIIZ.getValue())) - C79057V0z.LJJI((EditorProContext) this.LJIIIZ.getValue()).getTrackBySlot(nLETrackSlot).LJIILL().size() > 0) {
                        Integer LJI2 = C79045V0n.LJI(R.attr.ab2, this.LIZ);
                        if (LJI2 != null) {
                            intValue = LJI2.intValue();
                            t5s.setColor(intValue);
                            this.LJFF.setTextSize(C134845Qy.LIZ(13.0f));
                            this.LJFF.LIZ(62);
                        }
                        intValue = -1;
                        t5s.setColor(intValue);
                        this.LJFF.setTextSize(C134845Qy.LIZ(13.0f));
                        this.LJFF.LIZ(62);
                    } else {
                        Integer LJI3 = C79045V0n.LJI(R.attr.ab1, this.LIZ);
                        if (LJI3 != null) {
                            intValue = LJI3.intValue();
                            t5s.setColor(intValue);
                            this.LJFF.setTextSize(C134845Qy.LIZ(13.0f));
                            this.LJFF.LIZ(62);
                        }
                        intValue = -1;
                        t5s.setColor(intValue);
                        this.LJFF.setTextSize(C134845Qy.LIZ(13.0f));
                        this.LJFF.LIZ(62);
                    }
                } else {
                    Integer LJI4 = C79045V0n.LJI(R.attr.ab1, this.LIZ);
                    if (LJI4 != null) {
                        intValue = LJI4.intValue();
                        t5s.setColor(intValue);
                        this.LJFF.setTextSize(C134845Qy.LIZ(13.0f));
                        this.LJFF.LIZ(62);
                    }
                    intValue = -1;
                    t5s.setColor(intValue);
                    this.LJFF.setTextSize(C134845Qy.LIZ(13.0f));
                    this.LJFF.LIZ(62);
                }
            } else {
                Integer LJI5 = C79045V0n.LJI(R.attr.ab2, this.LIZ);
                if (LJI5 != null) {
                    intValue = LJI5.intValue();
                    t5s.setColor(intValue);
                    this.LJFF.setTextSize(C134845Qy.LIZ(13.0f));
                    this.LJFF.LIZ(62);
                }
                intValue = -1;
                t5s.setColor(intValue);
                this.LJFF.setTextSize(C134845Qy.LIZ(13.0f));
                this.LJFF.LIZ(62);
            }
        } else {
            this.LJFF.LIZ(61);
        }
        if (LIZIZ()) {
            if (((TrackPanelViewModel) this.LJIIIIZZ.getValue()).ov0()) {
                LIZ = C134845Qy.LIZ(24.0f);
            } else {
                LIZ = C134845Qy.LIZ(34.0f);
            }
            this.LJ = (LIZ - C134845Qy.LIZ(18.0f)) / 2;
            this.LJIIJ = (LIZ - C134845Qy.LIZ(15.0f)) / 2;
        }
        boolean z3 = trackItemView instanceof C130525Ai;
        Integer num = null;
        if (z3 && (c130525Ai = (C130525Ai) trackItemView) != null) {
            if (LIZIZ()) {
                i2 = C134845Qy.LIZ(4.0f);
            } else {
                i2 = this.LJII;
            }
            if (e1.LIZ(31744, "ep_text_suspend", true, false)) {
                int[] iArr = new int[2];
                if (z3 && (view = (View) trackItemView) != null) {
                    view.getLocationOnScreen(iArr);
                }
                int i5 = iArr[0];
                if (i5 + i2 < 0) {
                    num = Integer.valueOf(Math.abs(i5));
                }
            }
            if (((Boolean) this.LJIIL.getValue()).booleanValue()) {
                if (e1.LIZ(31744, "ep_text_suspend", true, false)) {
                    i3 = canvas.getClipBounds().right;
                } else if (trackItemView.getClipRectF().width() == 0.0f) {
                    i3 = ((View) trackItemView).getMeasuredWidth();
                } else {
                    i3 = (int) trackItemView.getClipRectF().width();
                }
            } else if (num != null) {
                i3 = num.intValue();
            } else {
                i3 = i2;
            }
            if (!((ArrayList) c130525Ai.LLIIJLIL).isEmpty()) {
                if (((Boolean) this.LJIIL.getValue()).booleanValue()) {
                    i3 = (i3 - i2) - this.LJIIJJI;
                }
                VecNLETrackSPtr tracks = C79057V0z.LJJI((EditorProContext) this.LJIIIZ.getValue()).getTracks();
                ArrayList LIZ2 = C07080Po.LIZ(tracks, "tracks");
                Iterator<NLETrack> it = tracks.iterator();
                while (it.hasNext()) {
                    NLETrack next = it.next();
                    NLETrack nLETrack = next;
                    if (nLETrack.getEnable() && C124574uj.LJJJLIIL(nLETrack)) {
                        LIZ2.add(next);
                    }
                }
                Iterator it2 = LIZ2.iterator();
                int i6 = 0;
                while (it2.hasNext()) {
                    VecNLETrackSlotSPtr LJIILL = ((NLETrack) it2.next()).LJIILL();
                    ArrayList arrayList = new ArrayList();
                    Iterator<NLETrackSlot> it3 = LJIILL.iterator();
                    while (it3.hasNext()) {
                        NLETrackSlot next2 = it3.next();
                        if (next2.hasExtra("text_tts_id")) {
                            arrayList.add(next2);
                        }
                    }
                    i6 += arrayList.size();
                }
                if (i6 > 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (LIZIZ() && ((TrackPanelViewModel) this.LJIIIIZZ.getValue()).ov0() && z2) {
                    z = false;
                } else {
                    z = true;
                    SY9 sy9 = this.LJI;
                    int i7 = this.LJIIJ;
                    int i8 = this.LJIIJJI;
                    sy9.setBounds(i3, i7, i3 + i8, i8 + i7);
                    if (((Boolean) this.LIZJ.getValue()).booleanValue() && (LJI = C79045V0n.LJI(R.attr.ab2, this.LIZ)) != null) {
                        this.LJI.LJ(LJI.intValue());
                    }
                    this.LJI.draw(canvas);
                }
            } else {
                z = false;
            }
            int i9 = this.LJIIJJI;
            if (LIZIZ()) {
                i4 = C134845Qy.LIZ(2.0f);
            } else {
                i4 = this.LIZIZ;
            }
            if (!z) {
                i4 = C134845Qy.LIZ(6.0f);
                i9 = 0;
            }
            if (c130525Ai.getContentText().length() == 0) {
                this.LJIILIIL.set(0, 0, 0, 0);
                this.LJIILJJIL = "";
            } else if (!o.LJ(this.LJIILJJIL, c130525Ai.getContentText())) {
                this.LJFF.getTextBounds(c130525Ai.getContentText(), 0, c130525Ai.getContentText().length(), this.LJIILIIL);
                this.LJIILJJIL = c130525Ai.getContentText();
            }
            if (((Boolean) this.LJIIL.getValue()).booleanValue()) {
                i4 = (i3 - i4) - this.LJIILIIL.width();
            } else if ((!((ArrayList) c130525Ai.LLIIJLIL).isEmpty()) && z) {
                i4 += i3 + i9;
            } else if (num != null) {
                i4 = num.intValue();
            }
            canvas.drawText(c130525Ai.getContentText(), i4, this.LJFF.getTextSize() + this.LJ, this.LJFF);
        }
    }
}
