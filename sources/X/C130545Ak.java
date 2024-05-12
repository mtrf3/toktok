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
import android.util.AttributeSet;
import android.view.View;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.ies.nle.editor_jni.NLEEditorJniJNI;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLESegmentFilter;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.ss.ugc.android.editor.track.TrackState;
import com.ss.ugc.android.editor.track.viewmodels.TTrackPanelViewModel;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.5Ak, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C130545Ak extends AbstractC130625As {
    public static final int LLILL;
    public static final int LLILLIZIL;
    public static final int LLILLJJLI;
    public boolean LJLJL;
    public boolean LJLJLJ;
    public float LJLJLLL;
    public RectF LJLL;
    public float LJLLI;
    public int LJLLILLLL;
    public int LJLLJ;
    public final Rect LJLLL;
    public final Path LJLLLL;
    public final RectF LJLLLLLL;
    public final Paint LJLZ;
    public final TextPaint LJZ;
    public final Path LJZI;
    public final Paint LJZL;
    public final C62822Ol8 LL;
    public C5BH LLD;
    public final java.util.Set<Long> LLF;
    public long LLFF;
    public long LLFFF;
    public float LLFII;
    public C5BJ LLFZ;
    public float LLI;
    public C5AI LLIFFJFJJ;
    public final List<OSZ<Long, Float>> LLII;
    public final C62822Ol8 LLIIII;
    public final C62822Ol8 LLIIIILZ;
    public final C62822Ol8 LLIIIJ;
    public NLETrackSlot LLIIIL;
    public final C62822Ol8 LLIIIZ;
    public String LLIIJI;
    public boolean LLIIJLIL;
    public boolean LLIIL;
    public boolean LLIILII;
    public Integer LLIILZL;
    public boolean LLIIZ;
    public List<Integer> LLIL;
    public boolean LLILII;
    public boolean LLILIL;

    public final C5CI getFadeState() {
        return null;
    }

    @Override // android.view.View
    public final boolean onSetAlpha(int i) {
        return true;
    }

    public final void setFadeState(C5CI c5ci) {
    }

    public final void setNeedDrawStickPoint(boolean z) {
    }

    static {
        C134845Qy.LIZ(1.5f);
        LLILL = ColorProtector.parseColor("#202020");
        ColorProtector.parseColor("#7F3D7A7F");
        LLILLIZIL = C134845Qy.LIZ(1.0f);
        LLILLJJLI = ColorProtector.parseColor("#57000000");
    }

    private final Paint getLinearBgPaint() {
        return (Paint) this.LL.getValue();
    }

    private final TTrackPanelViewModel getTrackViewModel() {
        return (TTrackPanelViewModel) this.LLIIIJ.getValue();
    }

    private final float getWaveBaseLine() {
        return (this.LJLLL.height() - ((Math.abs(this.LJZ.ascent()) - this.LJZ.descent()) / 2)) - C130675Ax.LJLJLLL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void LJIIJ() {
        int LIZ;
        EnumC127354zD enumC127354zD;
        MutableLiveData mutableLiveData;
        C1279550l c1279550l;
        TrackState trackState = null;
        if (this.LJLJLJ) {
            TTrackPanelViewModel trackViewModel = getTrackViewModel();
            if (trackViewModel != null && (mutableLiveData = trackViewModel.LLIILZL) != null && (c1279550l = (C1279550l) mutableLiveData.getValue()) != null) {
                enumC127354zD = c1279550l.LJ;
            } else {
                enumC127354zD = null;
            }
            if (enumC127354zD != EnumC127354zD.LINE) {
                setBgRadius(0);
                return;
            }
        }
        if (((Boolean) this.LLIIIILZ.getValue()).booleanValue()) {
            if (((Boolean) this.LLIIII.getValue()).booleanValue()) {
                TTrackPanelViewModel trackViewModel2 = getTrackViewModel();
                if (trackViewModel2 != null) {
                    trackState = trackViewModel2.jv0();
                }
                if (trackState == TrackState.NORMAL) {
                    LIZ = C134845Qy.LIZ(4.0f);
                } else {
                    LIZ = C134845Qy.LIZ(5.0f);
                }
            } else {
                LIZ = C134845Qy.LIZ(6.0f);
            }
        } else if (((Boolean) this.LLIIII.getValue()).booleanValue()) {
            C5A5.LJJJJZ.getClass();
            LIZ = (int) C5BD.LIZJ;
        } else if (this.LLILII) {
            LIZ = C134845Qy.LIZ(2.0f);
        } else {
            LIZ = C134845Qy.LIZ(1.0f);
        }
        setBgRadius(LIZ);
    }

    public final ArrayList<OSZ<Long, Float>> getWavePointsDataFromCache() {
        long duration;
        ArrayList<OSZ<Long, Float>> arrayList = new ArrayList<>();
        if (!((ArrayList) this.LLII).isEmpty()) {
            arrayList.addAll(this.LLII);
        } else {
            NLETrackSlot nLETrackSlot = this.LLIIIL;
            if (nLETrackSlot != null) {
                int i = 0;
                NLESegmentAudio nLESegmentAudio = (NLESegmentAudio) NLESegmentAudio.class.getMethod("LIZLLL", NLENode.class).invoke(null, nLETrackSlot.LJI());
                if (nLESegmentAudio != null && NLEEditorJniJNI.NLESegmentAudio_getRepeatCount(nLESegmentAudio.LIZJ, nLESegmentAudio) == NLEEditorJniJNI.NLESegmentAudio_REPEAT_INFINITE_get()) {
                    duration = nLETrackSlot.getMeasuredEndTime() - nLETrackSlot.getMeasuredStartTime();
                } else if (nLETrackSlot.LJI().LIZIZ().getDuration() == 0) {
                    NLESegmentAudio LIZLLL = NLESegmentAudio.LIZLLL(nLETrackSlot.LJI());
                    if (LIZLLL != null) {
                        duration = LIZLLL.LJIIL() - LIZLLL.LJIILIIL();
                    } else {
                        duration = 0;
                    }
                } else {
                    duration = nLETrackSlot.LJI().LIZIZ().getDuration();
                }
                String LJ = KMP.LJ(nLETrackSlot.LJI().LIZIZ().LIZJ(), (int) ((duration / 1000) / 33));
                HashMap<String, float[]> hashMap = C72682tE.LIZIZ;
                if (hashMap.get(LJ) != null) {
                    float[] fArr = hashMap.get(LJ);
                    o.LJI(fArr);
                    float[] fArr2 = fArr;
                    int length = fArr2.length;
                    int i2 = 0;
                    while (i < length) {
                        arrayList.add(new OSZ<>(Long.valueOf(i2 * 33), Float.valueOf(fArr2[i])));
                        i++;
                        i2++;
                    }
                }
            }
        }
        return arrayList;
    }

    private final float getBaseLine() {
        return ((Math.abs(this.LJZ.ascent()) - this.LJZ.descent()) / 2) + (getMeasuredHeight() / 2) + C134845Qy.LIZ(1.0f);
    }

    @Override // X.C5BC
    public final boolean LIZLLL() {
        return this.LJLJLJ;
    }

    public final List<Integer> getAllStickPoints() {
        return this.LLIL;
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

    public final boolean getDrawLabel() {
        return this.LLIIZ;
    }

    public final C5AI getLabelPainter$editor_trackpanel_release() {
        return this.LLIFFJFJJ;
    }

    public final float getMinDrawRegionWidth() {
        return this.LLI;
    }

    public final Integer getOutScrollX() {
        return this.LLIILZL;
    }

    public final C5BJ getPainter() {
        return this.LLFZ;
    }

    public final String getText() {
        return this.LLIIJI;
    }

    @Override // X.AbstractC130625As
    public float getTimelineScale() {
        return this.LJLLI;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    public /* synthetic */ C130545Ak(Context context) {
        this(context, null, 0);
    }

    @Override // X.AbstractC130625As, X.C5BC
    public final void LIZJ(Canvas canvas) {
        int bgColor;
        float clipLength;
        float clipStart;
        int i;
        View view;
        float f;
        Number valueOf;
        NLETrackSlot nLETrackSlot;
        int LIZIZ;
        int LIZIZ2;
        float width;
        C5BH c5bh;
        int i2;
        View view2;
        int i3;
        int i4;
        o.LJIIIZ(canvas, "canvas");
        if (getParent() == null) {
            return;
        }
        LJIIJ();
        canvas.getClipBounds(this.LJLLL);
        Paint paint = this.LJLZ;
        Integer num = C1291054w.LJ().LJIILJJIL;
        if (num != null) {
            bgColor = num.intValue();
        } else {
            bgColor = getBgColor();
        }
        paint.setColor(bgColor);
        canvas.drawRoundRect(new RectF(this.LJLLL), getBgRadius(), getBgRadius(), this.LJLZ);
        if (!this.LJLJLJ) {
            if (this.LLIIJLIL) {
                i3 = this.LJLLL.left + LLILLIZIL;
            } else {
                i3 = this.LJLLL.left;
            }
            if (this.LLIIL) {
                i4 = this.LJLLL.right - LLILLIZIL;
            } else {
                i4 = this.LJLLL.right;
            }
            Rect rect = this.LJLLL;
            RectF rectF = new RectF(i3, rect.top, i4, rect.bottom);
            this.LJLLLL.reset();
            this.LJLLLL.addRoundRect(rectF, getBgRadius(), getBgRadius(), Path.Direction.CCW);
            canvas.clipPath(this.LJLLLL);
        }
        this.LJLZ.setColor(C134645Qe.LIZ(getAlpha(), getBgColor()));
        if (getBgRadius() > 0) {
            canvas.drawRoundRect(new RectF(this.LJLLL), getBgRadius(), getBgRadius(), this.LJLZ);
        } else {
            canvas.drawRect(this.LJLLL, this.LJLZ);
        }
        C5BH c5bh2 = this.LLD;
        int i5 = 0;
        if (c5bh2 == C5BH.MUSIC || c5bh2 == C5BH.RECORD || c5bh2 == (c5bh = C5BH.SOUND_EFFECT)) {
            if (getClipStart() == 0.0f && getClipLength() == 0.0f) {
                clipLength = getMeasuredWidth();
                clipStart = 0.0f;
            } else {
                clipLength = getClipLength() - getClipStart();
                clipStart = getClipStart();
            }
            float timelineScale = getTimelineScale() * ((float) this.LLFF);
            float f2 = (this.LLFII * clipStart) + timelineScale;
            float timelineScale2 = getTimelineScale() * ((float) this.LLFFF);
            float f3 = this.LLFII;
            this.LLFZ.LIZ(f2, timelineScale, f3);
            this.LLFZ.LIZLLL((clipStart * f3) + timelineScale2, (int) this.LLFFF, (int) this.LLFF);
            Integer num2 = this.LLIILZL;
            if (num2 != null) {
                i = num2.intValue();
            } else {
                Object parent = getParent();
                if ((parent instanceof C1303859u) && (view = (View) parent) != null) {
                    i = view.getScrollX();
                } else {
                    i = 0;
                }
            }
            float f4 = i;
            float f5 = (this.LLI + f4) - clipStart;
            float translationX = getTranslationX() + getLeft() + clipStart;
            if (f4 > translationX) {
                f = f4 - translationX;
            } else {
                f = 0.0f;
            }
            if (f5 < clipLength) {
                clipLength = f5;
            }
            if (((Boolean) this.LLIIIZ.getValue()).booleanValue()) {
                if (getClipLength() == 0.0f) {
                    width = this.LJLLL.right;
                } else {
                    width = getClipRectF().width();
                }
                this.LJLLLLLL.set(this.LJLLL.left, 0.0f, width, getMeasuredHeight());
            } else {
                this.LJLLLLLL.set(f, 0.0f, clipLength, getMeasuredHeight());
            }
            if (getClipStart() != 0.0f || getClipRectF().width() == 0.0f) {
                valueOf = Integer.valueOf(getMeasuredWidth());
            } else {
                valueOf = Float.valueOf(getClipRectF().width());
            }
            boolean z = !((ArrayList) this.LLII).isEmpty();
            if (z) {
                this.LLFZ.LIZIZ(canvas, this.LJLLLLLL, this.LLII, getTimelineScale(), this.LJLLL, this.LLD, valueOf.floatValue());
            }
            if (this.LLILIL && (nLETrackSlot = this.LLIIIL) != null && z && ((Boolean) this.LLIIII.getValue()).booleanValue() && !this.LLIILII) {
                C5BH c5bh3 = this.LLD;
                int[] iArr = C5BG.LIZIZ;
                int i6 = iArr[c5bh3.ordinal()];
                if (i6 != 1 && i6 != 2) {
                    if (i6 != 3) {
                        if (i6 == 4) {
                            LIZIZ = C04330Ez.LIZIZ(getContext(), R.color.kh);
                        } else {
                            throw new C162476Zf();
                        }
                    } else {
                        LIZIZ = C04330Ez.LIZIZ(getContext(), R.color.ke);
                    }
                } else {
                    LIZIZ = C04330Ez.LIZIZ(getContext(), R.color.kb);
                }
                int i7 = iArr[this.LLD.ordinal()];
                if (i7 != 1 && i7 != 2) {
                    if (i7 != 3) {
                        if (i7 == 4) {
                            LIZIZ2 = C04330Ez.LIZIZ(getContext(), R.color.kg);
                        } else {
                            throw new C162476Zf();
                        }
                    } else {
                        LIZIZ2 = C04330Ez.LIZIZ(getContext(), R.color.kd);
                    }
                } else {
                    LIZIZ2 = C04330Ez.LIZIZ(getContext(), R.color.ka);
                }
                Rect rect2 = new Rect();
                String text = NLESegmentAudio.LIZLLL(nLETrackSlot.LJI()).LIZIZ().LJ();
                o.LJIIIIZZ(text, "text");
                if (!ujb.o.LJJJJJL(text)) {
                    this.LJZ.getTextBounds(text, 0, text.length(), rect2);
                    i5 = rect2.width();
                }
                int LIZ = C134845Qy.LIZ(44.0f) + rect2.left + i5;
                Rect rect3 = this.LJLLL;
                rect2.left = rect3.left;
                rect2.top = rect3.top;
                int i8 = rect3.right;
                if (LIZ > i8) {
                    LIZ = i8;
                }
                rect2.right = LIZ;
                rect2.bottom = rect3.bottom;
                getLinearBgPaint().setShader(new LinearGradient(rect2.left, 0.0f, rect2.right, 0.0f, LIZIZ, LIZIZ2, Shader.TileMode.CLAMP));
                if (getBgRadius() > 0) {
                    canvas.drawRoundRect(new RectF(rect2), getBgRadius(), getBgRadius(), getLinearBgPaint());
                } else {
                    canvas.drawRect(rect2, getLinearBgPaint());
                }
            }
            LJIIIZ(canvas);
            NLETrackSlot nLETrackSlot2 = this.LLIIIL;
            if (nLETrackSlot2 != null && this.LLIIZ) {
                this.LLIFFJFJJ.LIZ(this, nLETrackSlot2, this.LJLLLLLL, canvas, i, 0L);
            }
            if (!this.LLIL.isEmpty()) {
                this.LLFZ.LIZJ(canvas, this.LJLLLLLL, this.LLIL, getTimelineScale(), valueOf.floatValue());
            }
        } else if (c5bh2 == c5bh) {
            LJIIIZ(canvas);
            NLETrackSlot nLETrackSlot3 = this.LLIIIL;
            if (nLETrackSlot3 != null) {
                Object parent2 = getParent();
                if ((parent2 instanceof View) && (view2 = (View) parent2) != null) {
                    i2 = view2.getScrollX();
                } else {
                    i2 = 0;
                }
                this.LLIFFJFJJ.LIZ(this, nLETrackSlot3, this.LJLLLLLL, canvas, i2, 0L);
            }
        }
        super.LIZJ(canvas);
    }

    public final void LJIIIZ(Canvas canvas) {
        float duration;
        long LJII;
        long LJIIIIZZ;
        NLETrackSlot nLETrackSlot = this.LLIIIL;
        if (nLETrackSlot == null) {
            return;
        }
        if (this.LJLJJI) {
            NLESegmentAudio LIZLLL = NLESegmentAudio.LIZLLL(nLETrackSlot.LJI());
            if (LIZLLL == null) {
                return;
            }
            if (getClipLength() == 0.0f) {
                duration = ((float) (nLETrackSlot.getDuration() / 1000)) * getTimelineScale();
            } else {
                duration = getClipLength();
            }
            LJII = LIZLLL.LJII();
            LJIIIIZZ = LIZLLL.LJIIIIZZ();
        } else {
            NLESegmentAudio LIZLLL2 = NLESegmentAudio.LIZLLL(nLETrackSlot.LJI());
            if (LIZLLL2 == null) {
                return;
            }
            long j = 1000;
            duration = ((float) (nLETrackSlot.getDuration() / j)) * getTimelineScale();
            LJII = LIZLLL2.LJII() / j;
            LJIIIIZZ = LIZLLL2.LJIIIIZZ() / j;
        }
        float timelineScale = getTimelineScale() * ((float) LJII);
        this.LJZL.setColor(C134645Qe.LIZ(getAlpha(), LLILLJJLI));
        if (timelineScale > 0.0f) {
            canvas.save();
            canvas.clipRect(0.0f, 0.0f, timelineScale, getMeasuredHeight());
            this.LJZI.reset();
            float f = 2;
            this.LJZI.addOval(0.0f, 0.0f, timelineScale * f, getMeasuredHeight() * f, Path.Direction.CW);
            canvas.drawPath(this.LJZI, this.LJZL);
            canvas.restore();
        }
        float timelineScale2 = getTimelineScale() * ((float) LJIIIIZZ);
        float f2 = duration - timelineScale2;
        if (timelineScale2 > 0.0f) {
            canvas.save();
            canvas.clipRect(f2, 0.0f, duration, getMeasuredHeight());
            this.LJZI.reset();
            this.LJZI.addOval(f2 - timelineScale2, 0.0f, duration, getMeasuredHeight() * 2, Path.Direction.CW);
            canvas.drawPath(this.LJZI, this.LJZL);
            canvas.restore();
        }
    }

    @Override // X.AbstractC130625As, android.view.View
    public final void onDraw(Canvas canvas) {
        if (canvas != null) {
            LIZJ(canvas);
        }
    }

    public final void setAllStickPoints(List<Integer> list) {
        o.LJIIIZ(list, "<set-?>");
        this.LLIL = list;
    }

    public final void setAudioBeatsUse(boolean z) {
        this.LLILII = z;
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

    public final void setCurrentInRootState(boolean z) {
        this.LLIILII = z;
    }

    @Override // X.AbstractC130625As, X.C5BC
    public void setDrawDivider(boolean z) {
        if (this.LJLJL != z) {
            this.LJLJL = z;
            invalidate();
        }
    }

    public final void setDrawEndDivider(boolean z) {
        this.LLIIL = z;
    }

    public final void setDrawLabel(boolean z) {
        this.LLIIZ = z;
    }

    public final void setDrawStartDivider(boolean z) {
        this.LLIIJLIL = z;
    }

    @Override // X.AbstractC130625As, X.C5BC
    public void setItemSelected(boolean z) {
        if (this.LJLJLJ == z) {
            return;
        }
        this.LJLJLJ = z;
    }

    public final void setLabelPainter$editor_trackpanel_release(C5AI c5ai) {
        o.LJIIIZ(c5ai, "<set-?>");
        this.LLIFFJFJJ = c5ai;
    }

    public final void setMinDrawRegionWidth(float f) {
        this.LLI = f;
    }

    public final void setNeedDrawGradientLayer(boolean z) {
        this.LLILIL = z;
    }

    public final void setOutScrollX(Integer num) {
        this.LLIILZL = num;
    }

    public final void setPainter(C5BJ c5bj) {
        o.LJIIIZ(c5bj, "<set-?>");
        this.LLFZ = c5bj;
    }

    @Override // X.AbstractC130625As, X.C5BC
    public void setSegment(NLETrackSlot slot) {
        boolean z;
        int parseColor;
        NLESegmentFilter LIZIZ;
        o.LJIIIZ(slot, "slot");
        NLESegmentAudio LIZLLL = NLESegmentAudio.LIZLLL(slot.LJI());
        if (slot.LIZIZ() != null && (LIZIZ = slot.LIZIZ().LIZIZ()) != null) {
            o.LJIIIIZZ(NLESegmentFilter.LIZLLL(LIZIZ).LJFF(), "audioFilter.filterName");
        }
        if (LIZLLL == null) {
            return;
        }
        NLETrackSlot nLETrackSlot = this.LLIIIL;
        if (nLETrackSlot != null && nLETrackSlot.getId() == slot.getId()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            long j = 1000;
            this.LLFF = LIZLLL.LJIILIIL() / j;
            this.LLFFF = slot.getStartTime() / j;
            this.LLFII = LIZLLL.getAbsSpeed();
            LIZLLL.LJIILJJIL();
            String LJ = LIZLLL.LIZIZ().LJ();
            o.LJIIIIZZ(LJ, "nleSegmentAudio.resource.resourceName");
            setText(LJ);
            invalidate();
            return;
        }
        this.LLIIIL = slot;
        setNleTrackSlot$editor_trackpanel_release(slot);
        ((ArrayList) this.LLII).clear();
        XKX.LIZLLL(C780334l.LJLIL, C36636EZk.LIZ, null, new C131105Co(slot, System.currentTimeMillis(), this, null), 2);
        this.LLF.clear();
        long j2 = 1000;
        this.LLFF = LIZLLL.LJIILIIL() / j2;
        this.LLFFF = slot.getStartTime() / j2;
        this.LLFII = LIZLLL.getAbsSpeed();
        LIZLLL.LJIILJJIL();
        String LJ2 = LIZLLL.LIZIZ().LJ();
        o.LJIIIIZZ(LJ2, "nleSegmentAudio.resource.resourceName");
        setText(LJ2);
        EnumC123874tb LJFF = slot.LJI().LIZIZ().LJFF();
        if (LJFF != null) {
            int i = C5BG.LIZ[LJFF.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    Integer num = C1291054w.LJ().LJIILIIL;
                    if (num != null) {
                        parseColor = num.intValue();
                    } else {
                        parseColor = ColorProtector.parseColor("#343434");
                    }
                    setBgColor(parseColor);
                    this.LLD = C5BH.SOUND_EFFECT;
                }
            } else {
                setBgColor(C5BY.LIZ);
                this.LLD = C5BH.RECORD;
            }
            invalidate();
        }
        setBgColor(C5BY.LIZ);
        this.LLD = C5BH.MUSIC;
        invalidate();
    }

    public final void setText(String value) {
        o.LJIIIZ(value, "value");
        if (!o.LJ(value, this.LLIIJI)) {
            this.LLIIJI = value;
            invalidate();
        }
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C130545Ak(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a1.LJFF(context, "context");
        this.LJLJL = true;
        this.LJLL = new RectF();
        this.LJLLI = C1300758p.LIZIZ();
        this.LJLLILLLL = LLILL;
        this.LJLLL = new Rect();
        this.LJLLLL = new Path();
        this.LJLLLLLL = new RectF();
        Paint paint = new Paint();
        this.LJLZ = paint;
        TextPaint textPaint = new TextPaint();
        this.LJZ = textPaint;
        Path path = new Path();
        this.LJZI = path;
        Paint paint2 = new Paint();
        Paint paint3 = new Paint();
        this.LJZL = paint3;
        this.LL = C221108m2.LIZIZ(C130815Bl.LJLIL);
        this.LLD = C5BH.MUSIC;
        this.LLF = new LinkedHashSet();
        this.LLFII = 1.0f;
        this.LLFZ = new C130715Bb();
        this.LLI = C1303859u.LLJJI;
        this.LLIFFJFJJ = new C5AI(this) { // from class: X.5An
            public final C130545Ak LIZ;
            public final Context LIZIZ;
            public boolean LIZJ;
            public boolean LIZLLL;
            public final float LJ;
            public final int LJFF;
            public final Paint LJI;
            public final Paint LJII;
            public final Paint LJIIIIZZ;
            public final Rect LJIIIZ;
            public final Rect LJIIJ;
            public final TextPaint LJIIJJI;
            public final C62822Ol8 LJIIL;

            public final float LIZLLL() {
                return ((Number) this.LJIIL.getValue()).floatValue();
            }

            {
                o.LJIIIZ(this, "view");
                this.LIZ = this;
                this.LIZIZ = this.getContext();
                this.LJ = 42.0f;
                this.LJFF = ColorProtector.parseColor("#33FFFFFF");
                Paint paint4 = new Paint();
                this.LJI = paint4;
                Paint paint5 = new Paint();
                this.LJII = paint5;
                Paint paint6 = new Paint();
                this.LJIIIIZZ = paint6;
                this.LJIIIZ = new Rect();
                this.LJIIJ = new Rect();
                TextPaint textPaint2 = new TextPaint();
                this.LJIIJJI = textPaint2;
                this.LJIIL = C221108m2.LIZIZ(C1293555v.LJLIL);
                paint4.setAntiAlias(true);
                paint5.setColor(-1);
                paint5.setAntiAlias(true);
                paint5.setTextSize(C134845Qy.LIZ(9.0f));
                Rect rect = new Rect();
                paint5.getTextBounds("0.0", 0, 3, rect);
                rect.height();
                C134845Qy.LIZ(16.0f);
                paint6.setColor(-1);
                paint6.setAntiAlias(true);
                paint6.setTextSize(C134845Qy.LIZ(8.0f));
                Rect rect2 = new Rect();
                paint6.getTextBounds("0.0", 0, 3, rect2);
                rect2.height();
                C134845Qy.LIZ(16.0f);
                textPaint2.setAntiAlias(true);
                textPaint2.setTextSize(C130675Ax.LJLLILLLL);
                textPaint2.setStrokeWidth(C134845Qy.LIZ(1.0f));
                textPaint2.setStyle(Paint.Style.FILL);
            }

            public final void LIZIZ(Canvas canvas, String str) {
                float width;
                int LIZ;
                if (this.LIZJ) {
                    width = this.LJIIIZ.width();
                    LIZ = C134845Qy.LIZ(50.0f);
                } else {
                    width = this.LJIIIZ.width();
                    LIZ = C134845Qy.LIZ(28.0f);
                }
                float f = width + LIZ;
                this.LJII.getTextBounds(str, 0, str.length(), this.LJIIJ);
                canvas.drawRoundRect(f, C134845Qy.LIZ(4.0f), this.LJIIJ.width() + f + C134845Qy.LIZ(8.0f), C134845Qy.LIZ(20.0f), LIZLLL(), LIZLLL(), this.LJI);
                canvas.drawText(str, f + C134845Qy.LIZ(4.0f), C134845Qy.LIZ(15.0f), this.LJII);
            }

            public final void LIZJ(Canvas canvas, boolean z, String str, C130545Ak c130545Ak) {
                this.LJI.setColor(C134645Qe.LIZ(c130545Ak.getAlpha(), this.LJFF));
                Drawable LIZIZ = C04270Et.LIZIZ(this.LIZIZ, R.drawable.b1o);
                if (LIZIZ != null) {
                    if (z) {
                        canvas.drawRoundRect(C134845Qy.LIZ(4.0f), C134845Qy.LIZ(4.0f), C134845Qy.LIZ(22.0f) + this.LJIIIZ.width(), C134845Qy.LIZ(20.0f), LIZLLL(), LIZLLL(), this.LJI);
                    }
                    LIZIZ.setBounds(C134845Qy.LIZ(6.0f), C134845Qy.LIZ(6.0f), C134845Qy.LIZ(18.0f), C134845Qy.LIZ(18.0f));
                    LIZIZ.draw(canvas);
                    this.LJIIJJI.setTextSize(C130675Ax.LJLL);
                    this.LJIIJJI.getTextBounds(str, 0, str.length(), this.LJIIIZ);
                    this.LJIIJJI.setColor(C134645Qe.LIZ(c130545Ak.getAlpha(), -1));
                    canvas.drawText(str, C134845Qy.LIZ(18.0f), C134845Qy.LIZ(15.0f), this.LJIIJJI);
                }
            }

            @Override // X.C5AI
            public final void LIZ(C5BC trackItemView, NLETrackSlot nLETrackSlot, RectF drawRect, Canvas canvas, int i2, long j) {
                String str;
                int i3;
                C5BH c5bh;
                boolean z;
                boolean z2;
                float width;
                int LIZ;
                C5BH c5bh2;
                NLESegmentFilter LIZIZ;
                o.LJIIIZ(trackItemView, "trackItemView");
                o.LJIIIZ(drawRect, "drawRect");
                o.LJIIIZ(canvas, "canvas");
                NLESegmentAudio LIZLLL = NLESegmentAudio.LIZLLL(nLETrackSlot.LJI());
                if (nLETrackSlot.LIZIZ() == null || (LIZIZ = nLETrackSlot.LIZIZ().LIZIZ()) == null || (str = NLESegmentFilter.LIZLLL(LIZIZ).LJFF()) == null) {
                    str = "";
                }
                float absSpeed = LIZLLL.getAbsSpeed();
                float LJIILJJIL = LIZLLL.LJIILJJIL();
                String text = LIZLLL.LIZIZ().LJ();
                EnumC123874tb LJFF = nLETrackSlot.LJI().LIZIZ().LJFF();
                if (LJFF == null) {
                    i3 = -1;
                } else {
                    i3 = C124034tr.LIZ[LJFF.ordinal()];
                }
                if (i3 != 1) {
                    if (i3 != 2) {
                        c5bh = C5BH.MUSIC;
                    } else {
                        c5bh = C5BH.SOUND_EFFECT;
                    }
                } else {
                    c5bh = C5BH.RECORD;
                }
                if (c5bh == C5BH.MUSIC || c5bh == C5BH.RECORD || c5bh == (c5bh2 = C5BH.SOUND_EFFECT)) {
                    o.LJIIIIZZ(text, "text");
                    if (!ujb.o.LJJJJJL(text)) {
                        LIZJ(canvas, true, text, this.LIZ);
                    }
                    if (str.length() > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        Drawable LIZIZ2 = C04270Et.LIZIZ(this.LIZIZ, R.drawable.ayp);
                        if (LIZIZ2 != null) {
                            if (this.LIZJ) {
                                width = this.LJIIIZ.width();
                                LIZ = C134845Qy.LIZ(50.0f);
                            } else {
                                width = this.LJIIIZ.width();
                                LIZ = C134845Qy.LIZ(28.0f);
                            }
                            float f = width + LIZ;
                            canvas.drawRect(f, C134845Qy.LIZ(4.0f), f + C134845Qy.LIZ(this.LJ), C134845Qy.LIZ(20.0f), this.LJI);
                            int LIZ2 = (int) (f + C134845Qy.LIZ(3.0f));
                            int LIZ3 = C134845Qy.LIZ(7.0f);
                            LIZIZ2.setBounds(LIZ2, LIZ3, ((LIZIZ2.getIntrinsicWidth() * 2) / 3) + LIZ2, ((LIZIZ2.getIntrinsicHeight() * 2) / 3) + LIZ3);
                            LIZIZ2.draw(canvas);
                            canvas.drawText(str, ((LIZIZ2.getIntrinsicWidth() * 2) / 3) + C134845Qy.LIZ(3.0f) + LIZ2, LIZ3 + C134845Qy.LIZ(8.0f), this.LJIIIIZZ);
                        }
                        this.LIZLLL = true;
                    } else {
                        this.LIZLLL = false;
                    }
                    if (LJIILJJIL == 0.0f) {
                        Drawable LIZIZ3 = C04270Et.LIZIZ(this.LIZIZ, R.drawable.b4q);
                        if (LIZIZ3 != null) {
                            float width2 = this.LJIIIZ.width() + C134845Qy.LIZ(28.0f);
                            canvas.drawRoundRect(width2, C134845Qy.LIZ(4.0f), width2 + C134845Qy.LIZ(18.0f), C134845Qy.LIZ(20.0f), LIZLLL(), LIZLLL(), this.LJI);
                            int i4 = (int) width2;
                            LIZIZ3.setBounds(C134845Qy.LIZ(3.0f) + i4, C134845Qy.LIZ(7.0f), C134845Qy.LIZ(15.0f) + i4, C134845Qy.LIZ(19.0f));
                            LIZIZ3.draw(canvas);
                        }
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    this.LIZJ = z2;
                    String LIZIZ4 = Q8U.LIZIZ(new Object[]{Float.valueOf(absSpeed)}, 1, "%3.1fx", "format(format, *args)");
                    if (!o.LJ(LIZIZ4, "1.0x") && !this.LIZLLL) {
                        LIZIZ(canvas, LIZIZ4);
                        return;
                    }
                    return;
                }
                if (c5bh != c5bh2) {
                    return;
                }
                o.LJIIIIZZ(text, "text");
                LIZJ(canvas, false, text, this.LIZ);
                String LIZIZ5 = Q8U.LIZIZ(new Object[]{Float.valueOf(absSpeed)}, 1, "%3.1fx", "format(format, *args)");
                if (o.LJ(LIZIZ5, "1.0x") || this.LIZLLL) {
                    return;
                }
                LIZIZ(canvas, LIZIZ5);
            }
        };
        this.LLII = new ArrayList();
        this.LLIIII = C221108m2.LIZIZ(C5BN.LJLIL);
        this.LLIIIILZ = C221108m2.LIZIZ(C5BM.LJLIL);
        this.LLIIIJ = C221108m2.LIZIZ(C5BU.LJLIL);
        this.LLIIIZ = C221108m2.LIZIZ(new AqS152S0100000_2(context, 889));
        this.LLIIJI = "";
        this.LLIIJLIL = true;
        this.LLIIL = true;
        this.LLIIZ = true;
        this.LLIL = C61878OQg.INSTANCE;
        this.LLILIL = true;
        paint.setAntiAlias(true);
        float f = C130675Ax.LJLLILLLL;
        paint.setTextSize(f);
        textPaint.setAntiAlias(true);
        textPaint.setTextSize(f);
        textPaint.setStrokeWidth(C134845Qy.LIZ(1.0f));
        textPaint.setStyle(Paint.Style.FILL);
        path.setFillType(Path.FillType.INVERSE_EVEN_ODD);
        paint3.setAntiAlias(true);
        paint2.setAntiAlias(true);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(C134845Qy.LIZ(0.5f));
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        V2B.LJIILL(this, C134845Qy.LIZ(8.0f), C134845Qy.LIZ(6.0f), 0, C134845Qy.LIZ(6.0f));
    }
}
