package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AqS152S0100000_2;
import ujb.o;

/* renamed from: X.5Aj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C130535Aj extends View {
    public final Rect LJLIL;
    public final Path LJLILLLLZI;
    public final int LJLJI;
    public final Paint LJLJJI;
    public final Paint LJLJJL;
    public final int LJLJJLL;
    public final RectF LJLJL;
    public final RectF LJLJLJ;
    public C5BJ LJLJLLL;
    public InterfaceC1293655w LJLL;
    public final List<OSZ<Long, Float>> LJLLI;
    public final List<NLETrackSlot> LJLLILLLL;
    public Rect LJLLJ;
    public final C62822Ol8 LJLLL;
    public final C62822Ol8 LJLLLL;
    public InterfaceC88472Yns<? super ArrayList<Float>, Float> LJLLLLLL;

    private final TextPaint getDefaultTextPaint() {
        return (TextPaint) this.LJLLLL.getValue();
    }

    private final Rect getLinerBoundsRect() {
        Rect rect = new Rect();
        int i = 0;
        if (!o.LJJJJJL("Sound thread")) {
            getDefaultTextPaint().getTextBounds("Sound thread", 0, 12, rect);
            i = rect.width();
        }
        int LIZ = C134845Qy.LIZ(44.0f) + rect.left + i;
        Rect rect2 = this.LJLIL;
        rect.left = rect2.left;
        rect.top = rect2.top;
        int i2 = rect2.right;
        if (LIZ > i2) {
            LIZ = i2;
        }
        rect.right = LIZ;
        rect.bottom = rect2.bottom;
        return rect;
    }

    public final long getEndTime() {
        if (((ArrayList) this.LJLLILLLL).isEmpty()) {
            return 0L;
        }
        Iterator<NLETrackSlot> it = this.LJLLILLLL.iterator();
        if (it.hasNext()) {
            long j = 1000;
            long measuredEndTime = it.next().getMeasuredEndTime() / j;
            while (it.hasNext()) {
                long measuredEndTime2 = it.next().getMeasuredEndTime() / j;
                if (measuredEndTime < measuredEndTime2) {
                    measuredEndTime = measuredEndTime2;
                }
            }
            return measuredEndTime;
        }
        throw new NoSuchElementException();
    }

    public final long getStartTime() {
        if (((ArrayList) this.LJLLILLLL).isEmpty()) {
            return 0L;
        }
        Iterator<NLETrackSlot> it = this.LJLLILLLL.iterator();
        if (it.hasNext()) {
            long j = 1000;
            long measuredStartTime = it.next().getMeasuredStartTime() / j;
            while (it.hasNext()) {
                long measuredStartTime2 = it.next().getMeasuredStartTime() / j;
                if (measuredStartTime > measuredStartTime2) {
                    measuredStartTime = measuredStartTime2;
                }
            }
            return measuredStartTime;
        }
        throw new NoSuchElementException();
    }

    public final InterfaceC1293655w getAudioCollectionLabelPainter$editor_trackpanel_release() {
        return this.LJLL;
    }

    public final C5BJ getAudioWavePainter$editor_trackpanel_release() {
        return this.LJLJLLL;
    }

    public final InterfaceC88472Yns<ArrayList<Float>, Float> getOnCalcCollectionSingleHeight$editor_trackpanel_release() {
        return this.LJLLLLLL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C130535Aj(Context context) {
        super(context, null, 0);
        a1.LJFF(context, "context");
        this.LJLIL = new Rect();
        this.LJLILLLLZI = new Path();
        C5A5.LJJJJZ.getClass();
        this.LJLJI = (int) C5BD.LIZJ;
        Paint paint = new Paint();
        this.LJLJJI = paint;
        this.LJLJJL = new Paint();
        this.LJLJJLL = C5BY.LIZ;
        this.LJLJL = new RectF();
        this.LJLJLJ = new RectF();
        this.LJLJLLL = new C130715Bb();
        this.LJLL = new InterfaceC1293655w(this) { // from class: X.5Au
            public final C130535Aj LIZ;
            public final Context LIZIZ;
            public final int LIZJ;
            public final Paint LIZLLL;
            public final Rect LJ;
            public final TextPaint LJFF;

            {
                kotlin.jvm.internal.o.LJIIIZ(this, "audioCollectionItemView");
                this.LIZ = this;
                this.LIZIZ = this.getContext();
                this.LIZJ = ColorProtector.parseColor("#33FFFFFF");
                Paint paint2 = new Paint();
                this.LIZLLL = paint2;
                this.LJ = new Rect();
                TextPaint textPaint = new TextPaint();
                this.LJFF = textPaint;
                paint2.setAntiAlias(true);
                textPaint.setAntiAlias(true);
                textPaint.setTextSize(C130675Ax.LJLLILLLL);
                textPaint.setStrokeWidth(C134845Qy.LIZ(1.0f));
                textPaint.setStyle(Paint.Style.FILL);
            }

            @Override // X.InterfaceC1293655w
            public final void LIZ(Canvas canvas, C130535Aj view, int i) {
                kotlin.jvm.internal.o.LJIIIZ(canvas, "canvas");
                kotlin.jvm.internal.o.LJIIIZ(view, "view");
                String string = this.LIZIZ.getString(R.string.fnw);
                kotlin.jvm.internal.o.LJIIIIZZ(string, "context.getString(R.stri….editor_pro_sound_thread)");
                this.LIZLLL.setColor(C134645Qe.LIZ(this.LIZ.getAlpha(), this.LIZJ));
                Drawable drawable = this.LIZIZ.getDrawable(R.drawable.b1o);
                if (drawable != null) {
                    canvas.drawRoundRect(C134845Qy.LIZ(4.0f), C134845Qy.LIZ(4.0f), this.LJ.width() + C134845Qy.LIZ(22.0f), C134845Qy.LIZ(20.0f), C134845Qy.LIZ(2.0f), C134845Qy.LIZ(2.0f), this.LIZLLL);
                    drawable.setBounds(C134845Qy.LIZ(6.0f), C134845Qy.LIZ(6.0f), C134845Qy.LIZ(18.0f), C134845Qy.LIZ(18.0f));
                    drawable.draw(canvas);
                    this.LJFF.setTextSize(C130675Ax.LJLL);
                    this.LJFF.getTextBounds(string, 0, string.length(), this.LJ);
                    this.LJFF.setColor(C134645Qe.LIZ(this.LIZ.getAlpha(), -1));
                    canvas.drawText(string, C134845Qy.LIZ(18.0f), C134845Qy.LIZ(15.0f), this.LJFF);
                }
            }
        };
        this.LJLLI = new ArrayList();
        this.LJLLILLLL = new ArrayList();
        this.LJLLL = C221108m2.LIZIZ(new AqS152S0100000_2(context, 887));
        this.LJLLLL = C221108m2.LIZIZ(C5BE.LJLIL);
        this.LJLLLLLL = C124514ud.LJLIL;
        paint.setAntiAlias(true);
        paint.setTextSize(C130675Ax.LJLLILLLL);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        View view;
        int i;
        float f;
        View view2;
        if (canvas == null || getParent() == null) {
            return;
        }
        canvas.getClipBounds(this.LJLIL);
        this.LJLJL.set(this.LJLIL);
        this.LJLILLLLZI.reset();
        Path path = this.LJLILLLLZI;
        RectF rectF = this.LJLJL;
        float f2 = this.LJLJI;
        path.addRoundRect(rectF, f2, f2, Path.Direction.CCW);
        canvas.clipPath(this.LJLILLLLZI);
        this.LJLJJI.setColor(C134645Qe.LIZ(getAlpha(), this.LJLJJLL));
        RectF rectF2 = this.LJLJL;
        float f3 = this.LJLJI;
        canvas.drawRoundRect(rectF2, f3, f3, this.LJLJJI);
        this.LJLJLLL.LIZ(0.0f, 0.0f, 1.0f);
        float measuredWidth = getMeasuredWidth();
        Object parent = getParent();
        if (parent instanceof C1303859u) {
            view = (View) parent;
        } else {
            view = null;
        }
        int i2 = 0;
        if (view != null) {
            i = view.getScrollX();
        } else {
            i = 0;
        }
        float f4 = i;
        float f5 = C1303859u.LLJJI + f4;
        float translationX = getTranslationX() + getLeft();
        if (f4 > translationX) {
            f = f4 - translationX;
        } else {
            f = 0.0f;
        }
        if (f5 < measuredWidth) {
            measuredWidth = f5;
        }
        if (((Boolean) this.LJLLL.getValue()).booleanValue()) {
            Rect rect = this.LJLIL;
            this.LJLJLJ.set(rect.left, 0.0f, rect.right, getMeasuredHeight());
        } else {
            this.LJLJLJ.set(f, 0.0f, measuredWidth, getMeasuredHeight());
        }
        this.LJLJLLL.LIZIZ(canvas, this.LJLJLJ, this.LJLLI, C1300758p.LIZIZ(), this.LJLIL, C5BH.MUSIC, getMeasuredWidth());
        if (((Boolean) C5BA.LIZ(EnumC127484zQ.ENABLE_SUBTRACK_UX_OPTIMIZATION, Boolean.FALSE)).booleanValue()) {
            int LIZIZ = C04330Ez.LIZIZ(getContext(), R.color.kb);
            int LIZIZ2 = C04330Ez.LIZIZ(getContext(), R.color.ka);
            if (this.LJLLJ == null) {
                this.LJLLJ = getLinerBoundsRect();
            }
            Rect rect2 = this.LJLLJ;
            if (rect2 != null) {
                this.LJLJJL.setShader(new LinearGradient(rect2.left, 0.0f, rect2.right, 0.0f, LIZIZ, LIZIZ2, Shader.TileMode.CLAMP));
                RectF rectF3 = new RectF(rect2);
                float f6 = this.LJLJI;
                canvas.drawRoundRect(rectF3, f6, f6, this.LJLJJL);
            }
        }
        InterfaceC1293655w interfaceC1293655w = this.LJLL;
        Object parent2 = getParent();
        if ((parent2 instanceof View) && (view2 = (View) parent2) != null) {
            i2 = view2.getScrollX();
        }
        interfaceC1293655w.LIZ(canvas, this, i2);
    }

    public final void setAudioCollectionLabelPainter$editor_trackpanel_release(InterfaceC1293655w interfaceC1293655w) {
        kotlin.jvm.internal.o.LJIIIZ(interfaceC1293655w, "<set-?>");
        this.LJLL = interfaceC1293655w;
    }

    public final void setAudioWavePainter$editor_trackpanel_release(C5BJ c5bj) {
        kotlin.jvm.internal.o.LJIIIZ(c5bj, "<set-?>");
        this.LJLJLLL = c5bj;
    }

    public final void setOnCalcCollectionSingleHeight$editor_trackpanel_release(InterfaceC88472Yns<? super ArrayList<Float>, Float> interfaceC88472Yns) {
        kotlin.jvm.internal.o.LJIIIZ(interfaceC88472Yns, "<set-?>");
        this.LJLLLLLL = interfaceC88472Yns;
    }

    public final void LIZ(java.util.Map<NLETrackSlot, C1301058s> map, java.util.Map<String, ArrayList<OSZ<Long, Float>>> map2) {
        NLESegmentAudio nLESegmentAudio;
        ((ArrayList) this.LJLLILLLL).clear();
        ((ArrayList) this.LJLLILLLL).addAll(ORZ.LLJI(map.keySet()));
        ((ArrayList) this.LJLLI).clear();
        long startTime = getStartTime();
        long j = 33;
        int endTime = (int) ((getEndTime() - startTime) / j);
        for (int i = 0; i < endTime; i++) {
            long j2 = i * 33;
            long j3 = startTime + j2;
            ArrayList arrayList = new ArrayList();
            for (NLETrackSlot nLETrackSlot : this.LJLLILLLL) {
                ArrayList<OSZ<Long, Float>> arrayList2 = map2.get(nLETrackSlot.getUUID());
                float f = 0.0f;
                if (arrayList2 != null && (nLESegmentAudio = (NLESegmentAudio) NLESegmentAudio.class.getMethod("LIZLLL", NLENode.class).invoke(null, nLETrackSlot.LJI())) != null) {
                    long j4 = 1000;
                    if (j3 >= nLETrackSlot.getStartTime() / j4 && j3 <= nLETrackSlot.getEndTime() / j4) {
                        long LJIILIIL = (nLESegmentAudio.LJIILIIL() / j4) + (j3 - (nLETrackSlot.getStartTime() / j4));
                        int i2 = (int) (LJIILIIL / j);
                        int i3 = i2 + 1;
                        if (i2 > 0 && arrayList2.size() > i2 && arrayList2.size() > i3) {
                            Object obj = ListProtector.get(arrayList2, i2);
                            kotlin.jvm.internal.o.LJIIIIZZ(obj, "slotWavePoints[startPointIndex]");
                            OSZ osz = (OSZ) obj;
                            Object obj2 = ListProtector.get(arrayList2, i3);
                            kotlin.jvm.internal.o.LJIIIIZZ(obj2, "slotWavePoints[endPointIndex]");
                            OSZ osz2 = (OSZ) obj2;
                            float floatValue = (((Number) osz2.getSecond()).floatValue() - ((Number) osz.getSecond()).floatValue()) / ((float) (((Number) osz2.getFirst()).longValue() - ((Number) osz.getFirst()).longValue()));
                            f = (floatValue * ((float) LJIILIIL)) + (((Number) osz.getSecond()).floatValue() - (((Number) osz.getFirst()).floatValue() * floatValue));
                        } else if (arrayList2.size() - 1 == i2) {
                            f = ((Number) ((OSZ) ListProtector.get(arrayList2, i2)).getSecond()).floatValue();
                        }
                    }
                }
                arrayList.add(Float.valueOf(f));
            }
            ((ArrayList) this.LJLLI).add(new OSZ(Long.valueOf(j2), Float.valueOf(this.LJLLLLLL.invoke(arrayList).floatValue())));
        }
    }
}
