package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import com.bytedance.ies.nle.editor_jni.NLEEditorJniJNI;
import com.bytedance.ies.nle.editor_jni.NLEFilter;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegmentFilter;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLEPointSPtr;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.ss.ugc.android.editor.track.TrackState;
import com.ss.ugc.android.editor.track.viewmodels.TTrackPanelViewModel;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Locale;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.5A6, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5A6 extends AbstractC130625As {
    public boolean LJLJL;
    public boolean LJLJLJ;
    public float LJLJLLL;
    public RectF LJLL;
    public float LJLLI;
    public int LJLLILLLL;
    public int LJLLJ;
    public final Paint LJLLL;
    public final Rect LJLLLL;
    public final RectF LJLLLLLL;
    public final Rect LJLZ;
    public C5AI LJZ;
    public AnonymousClass590 LJZI;
    public InterfaceC88471Ynr<? super String, ? super Integer, Bitmap> LJZL;
    public Bitmap LL;
    public boolean LLD;
    public String LLF;
    public final C62822Ol8 LLFF;
    public final Path LLFFF;
    public final C62822Ol8 LLFII;
    public final C62822Ol8 LLFZ;
    public final C62822Ol8 LLI;

    @Override // android.view.View
    public final boolean onSetAlpha(int i) {
        return true;
    }

    private final TTrackPanelViewModel getTrackViewModel() {
        return (TTrackPanelViewModel) this.LLI.getValue();
    }

    public final boolean LJIIIZ() {
        return ((Boolean) this.LLFF.getValue()).booleanValue();
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

    @Override // X.AbstractC130625As, X.C5BC
    public boolean getDrawDivider() {
        return this.LJLJL;
    }

    public final AnonymousClass590 getLabelType() {
        return this.LJZI;
    }

    @Override // X.AbstractC130625As
    public float getTimelineScale() {
        return this.LJLLI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5A6(C29S context) {
        super(context, null, 0);
        o.LJIIIZ(context, "context");
        new LinkedHashMap();
        this.LJLJL = true;
        this.LJLL = new RectF();
        this.LJLLI = C1300758p.LIZIZ();
        this.LJLLL = new Paint();
        this.LJLLLL = new Rect();
        this.LJLLLLLL = new RectF();
        this.LJLZ = new Rect();
        this.LJZ = new C5AI(this) { // from class: X.5A7
            public static final int LJII = C134845Qy.LIZ(30.0f);
            public static final int LJIIIIZZ = C134845Qy.LIZ(12.0f);
            public static final int LJIIIZ = C134845Qy.LIZ(24.0f);
            public static final int LJIIJ = C134845Qy.LIZ(16.0f);
            public static final int LJIIJJI = C134845Qy.LIZ(2.0f);
            public static final int LJIIL = C134845Qy.LIZ(4.0f);
            public static final int LJIILIIL = C134845Qy.LIZ(2.0f);
            public static final int LJIILJJIL = C134845Qy.LIZ(1.0f);
            public static final int LJIILL = C134845Qy.LIZ(3.0f);
            public static final int LJIILLIIL = ColorProtector.parseColor("#66101010");
            public final C5A6 LIZ;
            public final Context LIZIZ;
            public final Path LIZJ;
            public final Paint LIZLLL;
            public final Paint LJ;
            public final Rect LJFF;
            public NLETrackSlot LJI;

            {
                o.LJIIIZ(this, "view");
                this.LIZ = this;
                this.LIZIZ = this.getContext();
                this.LIZJ = new Path();
                this.LIZLLL = C6D8.LIZIZ(true);
                Paint paint = new Paint();
                paint.setColor(-1);
                paint.setAntiAlias(true);
                paint.setTextSize(C134845Qy.LIZ(8.0f));
                paint.setStyle(Paint.Style.FILL);
                this.LJ = paint;
                C6D8.LIZIZ(true).setColor(ColorProtector.parseColor("#6603bac8"));
                this.LJFF = new Rect();
            }

            public final float LIZJ(Canvas canvas, Drawable drawable, String str, float f) {
                float f2 = LJIIJJI;
                float f3 = LJIIJ;
                this.LJ.setTypeface(Typeface.DEFAULT);
                float measureText = LJIIIZ + f + this.LJ.measureText(str);
                LIZIZ(canvas, f, f2, measureText, f2 + f3, C5AC.LEFT);
                canvas.save();
                float f4 = LJIIL + f;
                canvas.translate(f4, LJIILIIL + f2);
                drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
                drawable.draw(canvas);
                canvas.restore();
                canvas.drawText(str, f4 + drawable.getIntrinsicWidth() + LJIILJJIL, (((f3 - this.LJ.descent()) - this.LJ.ascent()) / 2.0f) + f2, this.LJ);
                return measureText - f;
            }

            @Override // X.C5AI
            public final void LIZ(C5BC trackItemView, NLETrackSlot nLETrackSlot, RectF drawRect, Canvas canvas, int i, long j) {
                float f;
                float clipLength;
                float f2;
                int i2;
                NLEFilter LIZIZ;
                NLESegmentFilter LIZIZ2;
                String LJFF;
                Drawable LIZIZ3;
                Float valueOf;
                Drawable LIZIZ4;
                float LIZJ;
                o.LJIIIZ(trackItemView, "trackItemView");
                o.LJIIIZ(drawRect, "drawRect");
                o.LJIIIZ(canvas, "canvas");
                this.LJI = nLETrackSlot;
                float clipStart = this.LIZ.getClipStart() + this.LIZ.getLeft();
                float f3 = i;
                if (f3 > clipStart) {
                    f = f3 - clipStart;
                } else {
                    f = 0.0f;
                }
                if (this.LIZ.getClipLength() == 0.0f) {
                    this.LIZ.getMeasuredWidth();
                } else {
                    this.LIZ.getClipLength();
                    this.LIZ.getClipStart();
                }
                this.LIZ.getClipStart();
                NLESegmentVideo LJJ = NLESegmentVideo.LJJ(nLETrackSlot.LJI());
                if (C59F.LIZ[this.LIZ.getLabelType().ordinal()] == 1) {
                    float f4 = LJIILL;
                    float f5 = f + f4;
                    C5A6 c5a6 = this.LIZ;
                    float clipStart2 = c5a6.getClipStart();
                    if (c5a6.getClipLength() == 0.0f) {
                        clipLength = ((float) (nLETrackSlot.getDuration() / 1000)) * c5a6.getTimelineScale();
                    } else {
                        clipLength = c5a6.getClipLength();
                    }
                    long timelineScale = (clipLength - clipStart2) / c5a6.getTimelineScale();
                    float f6 = LJIIJJI;
                    float f7 = f6 + LJIIJ;
                    float f8 = LJII;
                    float f9 = 0.0f - f8;
                    if (f9 < 0.0f) {
                        f2 = f8 + f5;
                        f9 = f5;
                    } else {
                        f2 = 0.0f;
                    }
                    LIZIZ(canvas, f9, f6, f2, f7, C5AC.RIGHT);
                    String LIZ = C1298557t.LIZ(timelineScale);
                    this.LJ.getTextBounds(LIZ, 0, LIZ.length(), this.LJFF);
                    this.LJ.setTypeface(Typeface.DEFAULT_BOLD);
                    canvas.drawText(LIZ, ((r10 - this.LJFF.width()) / 2.0f) + f9, (((LJIIIIZZ - this.LJ.descent()) - this.LJ.ascent()) / 2.0f) + f6, this.LJ);
                    float f10 = (f2 - f5) + f4 + f5;
                    C59N c59n = new C59N(null);
                    LJJ.getClass();
                    if (new VecNLEPointSPtr(NLEEditorJniJNI.NLESegmentAudio_getSegCurveSpeedPoints(LJJ.LIZJ, LJJ)).isEmpty() && LJJ.LJI().isEmpty()) {
                        i2 = 0;
                    } else {
                        i2 = 1;
                    }
                    c59n.LIZJ = i2;
                    c59n.LIZ = LJJ.getAbsSpeed();
                    c59n.LJ = (float) LJJ.LJFF();
                    String extra = LJJ.getExtra("curve_speed_name");
                    o.LJIIIIZZ(extra, "convertToSegmentVideo.getExtra(CURVE_SPEED_NAME)");
                    c59n.LIZLLL = extra;
                    if (!C124574uj.LJJJJ(nLETrackSlot) && (LIZIZ4 = C04270Et.LIZIZ(this.LIZIZ, R.drawable.b44)) != null) {
                        if (c59n.LIZJ == 0) {
                            float f11 = c59n.LIZ;
                            if (f11 != 1.0f) {
                                String LLLZI = C16880lQ.LLLZI(Locale.ENGLISH, "%.1fx", Arrays.copyOf(new Object[]{Float.valueOf(f11)}, 1));
                                o.LJIIIIZZ(LLLZI, "format(locale, format, *args)");
                                LIZJ = LIZJ(canvas, LIZIZ4, LLLZI, f10);
                            }
                        } else {
                            LIZJ = LIZJ(canvas, LIZIZ4, c59n.LIZLLL, f10);
                        }
                        if (LIZJ > 0.0f) {
                            f10 += LIZJ + f4;
                        }
                    }
                    if (nLETrackSlot.LIZIZ() == null || (LIZIZ = nLETrackSlot.LIZIZ()) == null || (LIZIZ2 = LIZIZ.LIZIZ()) == null || (LJFF = LIZIZ2.LJFF()) == null || LJFF.length() == 0 || (LIZIZ3 = C04270Et.LIZIZ(this.LIZIZ, R.drawable.b5j)) == null || (valueOf = Float.valueOf(LIZJ(canvas, LIZIZ3, LJFF, f10))) == null) {
                        return;
                    }
                    valueOf.floatValue();
                }
            }

            public final void LIZIZ(Canvas canvas, float f, float f2, float f3, float f4, C5AC c5ac) {
                float f5;
                if (c5ac == C5AC.LEFT) {
                    C5A5.LJJJJZ.getClass();
                    f5 = C5BD.LIZJ;
                } else {
                    C5A5.LJJJJZ.getClass();
                    f5 = -C5BD.LIZJ;
                    f3 = f;
                    f = f3;
                }
                this.LIZJ.reset();
                this.LIZJ.moveTo(f, f2);
                float f6 = f3 - f5;
                this.LIZJ.lineTo(f6, f2);
                Path path = this.LIZJ;
                C5A5.LJJJJZ.getClass();
                float f7 = C5BD.LIZJ;
                path.quadTo(f3, f2, f3, f2 + f7);
                this.LIZJ.lineTo(f3, f4 - f7);
                this.LIZJ.quadTo(f3, f4, f6, f4);
                this.LIZJ.lineTo(f, f4);
                this.LIZJ.close();
                this.LIZLLL.setColor(LJIILLIIL);
                canvas.drawPath(this.LIZJ, this.LIZLLL);
                this.LIZJ.reset();
            }
        };
        this.LJZI = AnonymousClass590.NONE;
        this.LLF = "";
        this.LLFF = C221108m2.LIZIZ(new AqS152S0100000_2(context, 1003));
        this.LLFFF = new Path();
        this.LLFII = C221108m2.LIZIZ(C127574zZ.LJLIL);
        this.LLFZ = C221108m2.LIZIZ(C127544zW.LJLIL);
        this.LLI = C221108m2.LIZIZ(C5AK.LJLIL);
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x017f, code lost:
    
        if (r1 != null) goto L64;
     */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01d0  */
    @Override // X.AbstractC130625As, X.C5BC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(android.graphics.Canvas r24) {
        /*
            Method dump skipped, instructions count: 583
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5A6.LIZJ(android.graphics.Canvas):void");
    }

    public final void LJIIJ(AnonymousClass590 type) {
        o.LJIIIZ(type, "type");
        this.LJZI = type;
        if (this.LJLJLJ) {
            ViewGroup parentView = getParentView();
            if (parentView != null) {
                parentView.invalidate();
                return;
            }
            return;
        }
        invalidate();
    }

    @Override // X.AbstractC130625As, android.view.View
    public final void onDraw(Canvas canvas) {
        int LIZ;
        if (canvas != null && !this.LJLJLJ) {
            if (((Boolean) this.LLFZ.getValue()).booleanValue()) {
                if (((Boolean) this.LLFII.getValue()).booleanValue()) {
                    if (getTrackViewModel().jv0() == TrackState.NORMAL) {
                        LIZ = C134845Qy.LIZ(4.0f);
                    } else {
                        LIZ = C134845Qy.LIZ(5.0f);
                    }
                } else {
                    LIZ = C134845Qy.LIZ(6.0f);
                }
            } else if (((Boolean) this.LLFII.getValue()).booleanValue()) {
                C5A5.LJJJJZ.getClass();
                LIZ = (int) C5BD.LIZJ;
            } else {
                LIZ = C134845Qy.LIZ(1.0f);
            }
            setBgRadius(LIZ);
            LIZJ(canvas);
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

    public final void setFrameFetcher$editor_trackpanel_release(InterfaceC88471Ynr<? super String, ? super Integer, Bitmap> fetcher) {
        o.LJIIIZ(fetcher, "fetcher");
        this.LJZL = fetcher;
    }

    @Override // X.AbstractC130625As, X.C5BC
    public void setItemSelected(boolean z) {
        this.LJLJLJ = z;
    }

    public final void setLabelPainter$editor_trackpanel_release(C5AI labelPainter) {
        o.LJIIIZ(labelPainter, "labelPainter");
        this.LJZ = labelPainter;
    }

    @Override // X.AbstractC130625As, X.C5BC
    public void setSegment(NLETrackSlot slot) {
        boolean z;
        NLEResourceNode LIZIZ;
        o.LJIIIZ(slot, "slot");
        setNleTrackSlot$editor_trackpanel_release(slot);
        EnumC123874tb enumC123874tb = null;
        this.LL = null;
        if (this.LJLJLJ) {
            ViewGroup parentView = getParentView();
            if (parentView != null) {
                parentView.invalidate();
            }
        } else {
            invalidate();
        }
        NLESegmentVideo LJJ = NLESegmentVideo.LJJ(slot.LJI());
        if (LJJ != null && (LIZIZ = LJJ.LIZIZ()) != null) {
            enumC123874tb = LIZIZ.LJFF();
        }
        if (enumC123874tb == EnumC123874tb.IMAGE) {
            z = true;
        } else {
            z = false;
        }
        this.LLD = z;
        this.LLF = C5DZ.LIZJ(slot);
    }

    @Override // X.AbstractC130625As, X.C5BC
    public void setTimelineScale(float f) {
        this.LJLLI = f;
    }

    @Override // android.view.View
    public void setTranslationX(float f) {
        super.setTranslationX(f);
        invalidate();
    }
}
