package X;

import Y.ACListenerS22S0100000_2;
import Y.ALAdapterS1S0100000_2;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.ss.ugc.android.editor.track.TrackState;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AqS121S0300000_2;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.59u, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1303859u extends AbstractC1304059w {
    public static final int LLJJ = C134845Qy.LIZ(2.0f);
    public static final int LLJJI;
    public final Paint LJLL;
    public C59B LJLLI;
    public final C5B9 LJLLILLLL;
    public final C5B8 LJLLJ;
    public final C62822Ol8 LJLLL;
    public final View LJLLLL;
    public final View LJLLLLLL;
    public final View LJLZ;
    public final View LJZ;
    public final int LJZI;
    public int LJZL;
    public long LL;
    public int LLD;
    public int LLF;
    public int LLFF;
    public int LLFFF;
    public boolean LLFII;
    public boolean LLFZ;
    public boolean LLI;
    public boolean LLIFFJFJJ;
    public int LLII;
    public boolean LLIIII;
    public boolean LLIIIILZ;
    public final java.util.Map<NLETrackSlot, C1301058s> LLIIIJ;
    public long LLIIIL;
    public long LLIIIZ;
    public long LLIIJI;
    public long LLIIJLIL;
    public boolean LLIIL;
    public TrackState LLIILII;
    public final C62822Ol8 LLIILZL;
    public final C62822Ol8 LLIIZ;
    public final C62822Ol8 LLIL;
    public boolean LLILII;
    public boolean LLILIL;
    public Animator LLILL;
    public InterfaceC1304259y LLILLIZIL;
    public C59G LLILLJJLI;
    public InterfaceC88472Yns<? super View, C76800UCe> LLILLL;
    public InterfaceC88472Yns<? super View, C76800UCe> LLILZ;
    public InterfaceC88472Yns<? super View, C76800UCe> LLILZIL;
    public InterfaceC88473Ynt<? super NLETrackSlot, ? super View, ? super MotionEvent, Boolean> LLILZLL;
    public C5AH LLIZ;
    public View.OnClickListener LLIZLLLIL;
    public boolean LLJ;
    public boolean LLJI;
    public final C62822Ol8 LLJIJIL;
    public final C62822Ol8 LLJILJIL;
    public final C62822Ol8 LLJILJILJ;
    public final java.util.Map<Integer, View> LLJILLL;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1303859u(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        o.LJIIIZ(context, "context");
    }

    @Override // X.AbstractC1304059w
    public final void LIZ(View child) {
        o.LJIIIZ(child, "child");
    }

    public final View LJ() {
        java.util.Map<Integer, View> map = this.LLJILLL;
        Integer valueOf = Integer.valueOf(R.id.kn7);
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        View view = (View) linkedHashMap.get(valueOf);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(R.id.kn7);
        if (findViewById == null) {
            return null;
        }
        linkedHashMap.put(valueOf, findViewById);
        return findViewById;
    }

    static {
        Point LIZIZ = C134845Qy.LIZIZ(C58S.LIZ());
        if (C131425Du.LIZIZ == 2) {
            LLJJI = LIZIZ.y / 2;
        } else {
            LLJJI = LIZIZ.x / 2;
        }
    }

    private final boolean LJIIJJI() {
        return ((Boolean) this.LLJILJILJ.getValue()).booleanValue();
    }

    private final int getDesireHeight() {
        boolean z;
        boolean z2;
        boolean z3;
        int size;
        if (getVisibility() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (this.LJLLJ.getVisibility() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (getAudioCollectionTrack().getVisibility() == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            size = 1;
        } else if (z || z2) {
            ArrayList LJII = C47261Igj.LJII(Boolean.valueOf(z), Boolean.valueOf(z2));
            ArrayList arrayList = new ArrayList();
            Iterator it = LJII.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (((Boolean) next).booleanValue()) {
                    arrayList.add(next);
                }
            }
            size = arrayList.size() + this.LJZL;
        } else {
            size = this.LJZL;
        }
        if (this.LLIIII && size >= 1) {
            size += this.LLII;
        } else if (this.LLIFFJFJJ && size >= 2) {
            size += 2;
        }
        InterfaceC1304259y interfaceC1304259y = this.LLILLIZIL;
        if (interfaceC1304259y != null) {
            return interfaceC1304259y.LJIIIIZZ(size);
        }
        return LJIIIIZZ(size);
    }

    private final InterfaceC1283852c getHapticFeedback() {
        return (InterfaceC1283852c) this.LLJILJIL.getValue();
    }

    private final int getNullAudioTrackCanvasWidth() {
        return ((int) Math.rint(C1300758p.LIZIZ() * ((float) this.LLIIIZ))) + getNullAudioTrackMinWidth();
    }

    private final int getNullAudioTrackMinWidth() {
        return ((Number) this.LLIL.getValue()).intValue();
    }

    private final int getNullAudioTrackWidth() {
        int rint = (int) Math.rint(C1300758p.LIZIZ() * ((float) (this.LLIIIZ - this.LLIIJI)));
        if (rint > getNullAudioTrackMinWidth()) {
            return rint;
        }
        return getNullAudioTrackMinWidth();
    }

    private final OSZ<Integer, Integer> getNullTrackTopBottom() {
        int intValue;
        java.util.Map<NLETrackSlot, C1301058s> map = this.LLIIIJ;
        ArrayList arrayList = new ArrayList(map.size());
        Iterator it = ((LinkedHashMap) map).entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(((Map.Entry) it.next()).getValue());
        }
        ArrayList arrayList2 = new ArrayList(C32I.LJJL(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Integer.valueOf(((C1301058s) it2.next()).LJLIL));
        }
        Integer num = (Integer) ORZ.LLFZ(arrayList2);
        if (num == null) {
            intValue = 0;
        } else {
            intValue = num.intValue() + 1;
        }
        int paddingTop = getPaddingTop() + ((this.LLD + this.LLFF) * intValue);
        return new OSZ<>(Integer.valueOf(paddingTop), Integer.valueOf(this.LLD + paddingTop));
    }

    private final C1304359z getScrollHelper() {
        return (C1304359z) this.LLIIZ.getValue();
    }

    public final void LJIIIZ() {
        this.LJLLLL.setTranslationX(0.0f);
        this.LJLLLL.setTranslationY(0.0f);
        this.LJLLLL.setVisibility(8);
    }

    public final void LJIIJ() {
        this.LJLLLLLL.setTranslationX(0.0f);
        this.LJLLLLLL.setTranslationY(0.0f);
        this.LJLLLLLL.setVisibility(8);
    }

    public final C130535Aj getAudioCollectionTrack() {
        return (C130535Aj) this.LJLLL.getValue();
    }

    public final C1303759t getClipHelper() {
        return (C1303759t) this.LLIILZL.getValue();
    }

    public final float getMainVideoLength$editor_trackpanel_release() {
        return getTimelineScale() * ((float) this.LLIIIL);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0018 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
    @Override // X.AbstractC1304059w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int getMaxScrollY() {
        /*
            r4 = this;
            boolean r0 = r4.LLIIIILZ
            r3 = 0
            if (r0 == 0) goto L1b
            int r2 = r4.getDesireHeight()
            int r0 = r4.getPaddingBottom()
            int r2 = r2 - r0
            int r0 = r4.getMeasuredHeight()
            int r2 = r2 - r0
            int r1 = r4.LLF
        L15:
            int r2 = r2 + r1
        L16:
            if (r2 >= 0) goto L19
        L18:
            return r3
        L19:
            r3 = r2
            goto L18
        L1b:
            X.5B9 r0 = r4.LJLLILLLL
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L47
            r1 = 1
        L24:
            X.5B8 r0 = r4.LJLLJ
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L40
        L2c:
            int r2 = r4.getDesireHeight()
            int r0 = r4.getPaddingTop()
            int r2 = r2 - r0
            int r0 = r4.getPaddingBottom()
            int r2 = r2 - r0
            int r0 = r4.getMeasuredHeight()
            int r2 = r2 - r0
            goto L16
        L40:
            if (r1 != 0) goto L2c
            boolean r0 = r4.LLILIL
            if (r0 != 0) goto L49
            goto L2c
        L47:
            r1 = 0
            goto L24
        L49:
            int r0 = r4.LLF
            float r1 = (float) r0
            r0 = 1051372203(0x3eaaaaab, float:0.33333334)
            float r1 = r1 * r0
            int r2 = (int) r1
            r0 = 1065353216(0x3f800000, float:1.0)
            int r1 = X.C134845Qy.LIZ(r0)
            int r1 = r1 + r2
            int r2 = r4.getDesireHeight()
            int r0 = r4.getPaddingTop()
            int r2 = r2 - r0
            int r0 = r4.getPaddingBottom()
            int r2 = r2 - r0
            int r0 = r4.getMeasuredHeight()
            int r2 = r2 - r0
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1303859u.getMaxScrollY():int");
    }

    public final float getVideosLength$editor_trackpanel_release() {
        return getTimelineScale() * ((float) this.LLIIJLIL);
    }

    @Override // android.view.View
    public final void computeScroll() {
        C1304359z scrollHelper = getScrollHelper();
        if (scrollHelper.LJIIIIZZ.computeScrollOffset()) {
            C1303859u c1303859u = scrollHelper.LIZ;
            c1303859u.LIZJ(false, false, c1303859u.getScrollX(), scrollHelper.LJIIIIZZ.getCurrY(), false);
            scrollHelper.LIZ.postInvalidateOnAnimation();
        }
    }

    public final EnumC127354zD getSelectSegmentStyle() {
        return getClipHelper().LJJI;
    }

    public final View.OnClickListener getBlankClickListener$editor_trackpanel_release() {
        return this.LLIZLLLIL;
    }

    public final C59G getCallback() {
        return this.LLILLJJLI;
    }

    public final boolean getCanMoveOutOfMainVideo$editor_trackpanel_release() {
        return this.LLFII;
    }

    public final boolean getCanMoveOutOfVideos$editor_trackpanel_release() {
        return this.LLFZ;
    }

    public final long getClipMinDuration$editor_trackpanel_release() {
        return this.LL;
    }

    public final boolean getEnableClip$editor_trackpanel_release() {
        return this.LLJ;
    }

    public final boolean getEnableDrag$editor_trackpanel_release() {
        return this.LLJI;
    }

    public final int getItemHeight$editor_trackpanel_release() {
        return this.LLF;
    }

    public final int getItemMargin$editor_trackpanel_release() {
        return this.LLFF;
    }

    public final long getMainVideoDuration() {
        return this.LLIIIL;
    }

    public final int getMaxTrackNum$editor_trackpanel_release() {
        return this.LLFFF;
    }

    public final C5B9 getNullAudioTrack$editor_trackpanel_release() {
        return this.LJLLILLLL;
    }

    public final C5B8 getNullEffectTrack$editor_trackpanel_release() {
        return this.LJLLJ;
    }

    public final InterfaceC88472Yns<View, C76800UCe> getOnClickAudioCollectionTrack$editor_trackpanel_release() {
        return this.LLILZIL;
    }

    public final InterfaceC88472Yns<View, C76800UCe> getOnClickNullAudioTrack() {
        return this.LLILLL;
    }

    public final InterfaceC88472Yns<View, C76800UCe> getOnClickNullEffectTrack() {
        return this.LLILZ;
    }

    public final InterfaceC88473Ynt<NLETrackSlot, View, MotionEvent, Boolean> getOnShouldInterceptSlotClickEvent() {
        return this.LLILZLL;
    }

    public final boolean getOnlyDragOnX$editor_trackpanel_release() {
        return this.LLI;
    }

    public final View getPlaceHolderView$editor_trackpanel_release() {
        return this.LJLLLL;
    }

    public final View getPlugInLine$editor_trackpanel_release() {
        return this.LJLLLLLL;
    }

    public final int getScreenWidth$editor_trackpanel_release() {
        return this.LJZI;
    }

    public final View getSegmentDragDecorateView$editor_trackpanel_release() {
        return this.LJZ;
    }

    public final java.util.Map<NLETrackSlot, C1301058s> getSegmentParams() {
        return this.LLIIIJ;
    }

    public final int getShowTrackNum$editor_trackpanel_release() {
        return this.LLII;
    }

    public final int getTrackCount() {
        return this.LJZL;
    }

    public final C5AH getTrackDragEventListener$editor_trackpanel_release() {
        return this.LLIZ;
    }

    public final C59B getTrackGroupActionListener() {
        return this.LJLLI;
    }

    public final View getTrackGroupDragMask$editor_trackpanel_release() {
        return this.LJLZ;
    }

    public static int LJII(int i) {
        return View.MeasureSpec.makeMeasureSpec(i, 1073741824);
    }

    public final void LJFF(boolean z) {
        getScrollHelper().LJIIJ = z;
    }

    public final int LJI(NLETrackSlot nLETrackSlot) {
        int i = -1;
        for (Map.Entry entry : ((LinkedHashMap) this.LLIIIJ).entrySet()) {
            NLENode nLENode = (NLENode) entry.getKey();
            C1301058s c1301058s = (C1301058s) entry.getValue();
            if (nLETrackSlot.getId() == nLENode.getId()) {
                i = c1301058s.LJLIL;
            }
        }
        return i;
    }

    public final int LJIIIIZZ(int i) {
        if (i <= 0) {
            return C0EH.LIZ(this.LLF, this.LLFF, i, getPaddingTop());
        }
        int paddingTop = getPaddingTop();
        int i2 = this.LLF;
        return paddingTop + C0EH.LIZ(this.LLFF, i2, i - 1, i2) + C134845Qy.LIZ(1.0f) + ((int) (i2 * 0.33333334f));
    }

    public final void LJIIL(int i) {
        int measuredHeight;
        if (i >= 0) {
            int LIZ = C0EH.LIZ(this.LLF, this.LLFF, i, getPaddingTop());
            C1302859k c1302859k = C1291054w.LJ().LIZ;
            int i2 = c1302859k.LJI + c1302859k.LJII;
            int scrollY = LIZ - getScrollY();
            if (scrollY >= 0 ? (measuredHeight = (((LIZ + this.LLF) + this.LLFF) - getMeasuredHeight()) - getScrollY()) > 0 : (measuredHeight = scrollY - i2) != 0) {
                LJIILLIIL(measuredHeight);
                return;
            }
        }
        if (getScrollY() > getMaxScrollY()) {
            LJIILLIIL(getScrollY() - getMaxScrollY());
        }
    }

    public final void LJIILIIL(boolean z) {
        C1303759t clipHelper = getClipHelper();
        if (z) {
            clipHelper.getClass();
            clipHelper.LJJI = EnumC127354zD.LINE;
        } else {
            OSZ<? extends NLETrackSlot, C1301058s> osz = clipHelper.LJJIJL;
            if (osz != null) {
                C1303759t.LJIIIZ(null, osz.getSecond().LJLILLLLZI);
                clipHelper.LJIIL(null);
                clipHelper.LJJI = EnumC127354zD.NONE;
            }
        }
        clipHelper.LIZ.invalidate();
    }

    public final void LJIILL(boolean z) {
        if (z) {
            getAudioCollectionTrack().setVisibility(0);
            if (((Boolean) this.LLJIJIL.getValue()).booleanValue()) {
                java.util.Map<NLETrackSlot, C1301058s> map = this.LLIIIJ;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
                    if (!C124574uj.LJJIJL((NLETrackSlot) entry.getKey())) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                Iterator it = linkedHashMap.entrySet().iterator();
                while (it.hasNext()) {
                    ((C1301058s) ((Map.Entry) it.next()).getValue()).LJLILLLLZI.getView().setVisibility(0);
                }
                java.util.Map<NLETrackSlot, C1301058s> map2 = this.LLIIIJ;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry entry2 : ((LinkedHashMap) map2).entrySet()) {
                    if (C124574uj.LJJIJL((NLETrackSlot) entry2.getKey())) {
                        linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                    }
                }
                Iterator it2 = linkedHashMap2.entrySet().iterator();
                while (it2.hasNext()) {
                    ((C1301058s) ((Map.Entry) it2.next()).getValue()).LJLILLLLZI.getView().setVisibility(8);
                }
            } else {
                Iterator it3 = ((LinkedHashMap) this.LLIIIJ).entrySet().iterator();
                while (it3.hasNext()) {
                    ((C1301058s) ((Map.Entry) it3.next()).getValue()).LJLILLLLZI.getView().setVisibility(8);
                }
            }
        } else {
            getAudioCollectionTrack().setVisibility(8);
            Iterator it4 = ((LinkedHashMap) this.LLIIIJ).entrySet().iterator();
            while (it4.hasNext()) {
                ((C1301058s) ((Map.Entry) it4.next()).getValue()).LJLILLLLZI.getView().setVisibility(0);
            }
        }
        requestLayout();
        invalidate();
    }

    public final void LJIILLIIL(int i) {
        C1304359z scrollHelper = getScrollHelper();
        if (i == 0) {
            scrollHelper.getClass();
        } else {
            scrollHelper.LJIIIIZZ.startScroll(scrollHelper.LIZ.getScrollX(), scrollHelper.LIZ.getScrollY(), 0, i);
            scrollHelper.LIZ.postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float rint;
        float f;
        C1301058s second;
        C5A5 c5a5;
        OSZ<? extends NLETrackSlot, C1301058s> osz;
        NLETrackSlot first;
        float timelineScale;
        Canvas canvas2 = canvas;
        if (canvas2 == null) {
            return;
        }
        super.dispatchDraw(canvas2);
        C1303759t clipHelper = getClipHelper();
        clipHelper.getClass();
        OSZ<? extends NLETrackSlot, C1301058s> osz2 = clipHelper.LJJIJL;
        if (osz2 != null && (second = osz2.getSecond()) != null && (c5a5 = second.LJLILLLLZI) != null && (osz = clipHelper.LJJIJL) != null && (first = osz.getFirst()) != null) {
            clipHelper.LJIIZILJ.setColor(ColorProtector.parseColor("#FF0F0F0F"));
            View view = c5a5.getView();
            canvas2.drawRect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), clipHelper.LJIIZILJ);
            if (clipHelper.LIZLLL) {
                timelineScale = LLJJI - (clipHelper.LIZ.getTimelineScale() * ((float) (first.getStartTime() / 1000)));
            } else {
                timelineScale = LLJJI + (clipHelper.LIZ.getTimelineScale() * ((float) (first.getStartTime() / 1000)));
            }
            EnumC127354zD enumC127354zD = clipHelper.LJJI;
            EnumC127354zD enumC127354zD2 = EnumC127354zD.CLIP;
            if (enumC127354zD == enumC127354zD2) {
                c5a5.LIZJ(0);
            } else if (enumC127354zD == EnumC127354zD.LINE) {
                c5a5.LIZJ(C134845Qy.LIZ(1.0f));
            }
            if (clipHelper.LIZLLL) {
                float f2 = clipHelper.LJJIII.right;
                float f3 = C1303759t.LJJIZ;
                float f4 = f2 + f3;
                RectF rectF = clipHelper.LJJII;
                float f5 = rectF.top + f3;
                float f6 = C1303759t.LJJIL;
                float f7 = rectF.left - f3;
                c5a5.LJFF(canvas2, f4, f5 + f6, f7, (rectF.bottom - f3) - f6, timelineScale - f7, timelineScale - f4);
            } else {
                RectF rectF2 = clipHelper.LJJII;
                float f8 = rectF2.right;
                float f9 = C1303759t.LJJIZ;
                float f10 = f8 + f9;
                float f11 = rectF2.top + f9;
                float f12 = C1303759t.LJJIL;
                float f13 = clipHelper.LJJIII.left - f9;
                c5a5.LJFF(canvas2, f10, f11 + f12, f13, (rectF2.bottom - f9) - f12, f10 - timelineScale, f13 - timelineScale);
            }
            EnumC127354zD enumC127354zD3 = clipHelper.LJJI;
            if (enumC127354zD3 == enumC127354zD2) {
                clipHelper.LJIIZILJ.setColor(clipHelper.LJIJ);
                RectF rectF3 = clipHelper.LJJII;
                float f14 = rectF3.top;
                float f15 = C1303759t.LJJIL / 2.0f;
                float f16 = f15 + f14;
                float f17 = rectF3.bottom - f15;
                if (clipHelper.LIZLLL) {
                    canvas2.drawLine(clipHelper.LJJIII.right, f16, rectF3.left, f16, clipHelper.LJIIZILJ);
                    canvas2 = canvas2;
                    canvas2.drawLine(clipHelper.LJJIII.right, f17, clipHelper.LJJII.left, f17, clipHelper.LJIIZILJ);
                } else {
                    canvas2.drawLine(rectF3.right, f16, clipHelper.LJJIII.left, f16, clipHelper.LJIIZILJ);
                    canvas2 = canvas2;
                    canvas2.drawLine(clipHelper.LJJII.right, f17, clipHelper.LJJIII.left, f17, clipHelper.LJIIZILJ);
                }
                clipHelper.LJJII.round(clipHelper.LJI);
                Drawable drawable = clipHelper.LJ;
                if (drawable != null) {
                    drawable.setBounds(clipHelper.LJI);
                }
                Drawable drawable2 = clipHelper.LJ;
                if (drawable2 != null) {
                    drawable2.draw(canvas2);
                }
                clipHelper.LJJIII.round(clipHelper.LJI);
                Drawable drawable3 = clipHelper.LJFF;
                if (drawable3 != null) {
                    drawable3.setBounds(clipHelper.LJI);
                }
                Drawable drawable4 = clipHelper.LJFF;
                if (drawable4 != null) {
                    drawable4.draw(canvas2);
                }
            } else if (enumC127354zD3 == EnumC127354zD.LINE) {
                clipHelper.LJIIZILJ.setColor(clipHelper.LJIJ);
                clipHelper.LJIJI.reset();
                if (clipHelper.LIZLLL) {
                    Path path = clipHelper.LJIJI;
                    float f18 = clipHelper.LJJIII.right;
                    float f19 = C1303759t.LJJIL / 2;
                    float f20 = f19 + f18;
                    RectF rectF4 = clipHelper.LJJII;
                    float f21 = f19 + rectF4.top;
                    float f22 = rectF4.left - f19;
                    float f23 = rectF4.bottom - f19;
                    float f24 = clipHelper.LIZJ.LJ;
                    path.addRoundRect(f20, f21, f22, f23, f24, f24, Path.Direction.CCW);
                } else {
                    Path path2 = clipHelper.LJIJI;
                    RectF rectF5 = clipHelper.LJJII;
                    float f25 = rectF5.right;
                    float f26 = C1303759t.LJJIL / 2;
                    float f27 = f26 + rectF5.top;
                    float f28 = f26 + clipHelper.LJJIII.left;
                    float f29 = rectF5.bottom - f26;
                    float f30 = clipHelper.LIZJ.LJ;
                    path2.addRoundRect(f25 - f26, f27, f28, f29, f30, f30, Path.Direction.CCW);
                }
                canvas2.drawPath(clipHelper.LJIJI, clipHelper.LJIJJ);
            }
        }
        InterfaceC1304259y interfaceC1304259y = this.LLILLIZIL;
        if (interfaceC1304259y != null) {
            interfaceC1304259y.LJII(canvas2);
        }
        if (getVisibility() == 0 || this.LJLLJ.getVisibility() == 0) {
            int i = LLJJI;
            float f31 = i;
            if (LJIIJJI()) {
                rint = -((float) Math.rint(C1300758p.LIZIZ() * ((float) this.LLIIJI)));
            } else {
                rint = (float) Math.rint(C1300758p.LIZIZ() * ((float) this.LLIIJI));
            }
            float f32 = f31 + rint;
            if (LJIIJJI()) {
                f = Math.max(f32 - getNullAudioTrackWidth(), f32 - (this.LJZI / 2));
            } else {
                f = f32;
            }
            if (!LJIIJJI()) {
                f32 = Math.min(getNullAudioTrackWidth() + f32, f32 + (this.LJZI / 2));
            }
            if (getVisibility() == 0) {
                LIZ(canvas2, f, getNullTrackTopBottom().getFirst().intValue(), f32, getNullTrackTopBottom().getSecond().intValue(), i);
            }
            if (this.LJLLJ.getVisibility() == 0) {
                this.LJLLJ.LIZ(canvas2, f, getNullTrackTopBottom().getFirst().intValue(), f32, getNullTrackTopBottom().getSecond().intValue(), i);
            }
        }
        if (this.LLIIL) {
            float desireHeight = getDesireHeight() - (LLJJ / 2.0f);
            canvas2.drawLine(0.0f, desireHeight, (LLJJI * 2) + getDesireMaxScrollX(), desireHeight, this.LJLL);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0037 A[ORIG_RETURN, RETURN] */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            boolean r0 = r6.LLJ
            r3 = 1
            if (r0 == 0) goto L16
            X.59t r5 = r6.getClipHelper()
            int r1 = r6.getScrollX()
            int r4 = r6.getScrollY()
            r5.getClass()
            if (r7 != 0) goto L64
        L16:
            r0 = 0
        L17:
            r6.LLILII = r0
            if (r0 != 0) goto L37
            if (r7 == 0) goto L62
            boolean r0 = r6.LLILIL
            if (r0 != 0) goto L62
            X.59z r4 = r6.getScrollHelper()
            r4.getClass()
            int r1 = r7.getAction()
            if (r1 == 0) goto L54
            r0 = 2
            if (r1 == r0) goto L38
        L31:
            X.5AF r1 = r4.LIZLLL
            X.5AF r0 = X.C5AF.DRAGGING
            if (r1 != r0) goto L62
        L37:
            return r3
        L38:
            float r2 = r7.getY()
            float r0 = r4.LIZIZ
            float r2 = r2 - r0
            int r0 = r4.LJ
            float r1 = (float) r0
            float r0 = java.lang.Math.abs(r2)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L31
            X.5AF r0 = X.C5AF.DRAGGING
            r4.LIZLLL = r0
            X.59u r0 = r4.LIZ
            r0.requestDisallowInterceptTouchEvent(r3)
            goto L31
        L54:
            float r0 = r7.getY()
            r4.LIZIZ = r0
            r4.LIZJ = r0
            android.widget.OverScroller r0 = r4.LJIIIIZZ
            r0.abortAnimation()
            goto L31
        L62:
            r3 = 0
            goto L37
        L64:
            int r0 = r7.getAction()
            if (r0 == 0) goto L6b
            goto L16
        L6b:
            float r2 = r7.getX()
            float r0 = (float) r1
            float r2 = r2 + r0
            float r1 = r7.getY()
            float r0 = (float) r4
            float r1 = r1 + r0
            android.graphics.RectF r0 = r5.LJJII
            boolean r0 = r0.contains(r2, r1)
            if (r0 != 0) goto L87
            android.graphics.RectF r0 = r5.LJJIII
            boolean r0 = r0.contains(r2, r1)
            if (r0 == 0) goto L16
        L87:
            r0 = 1
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1303859u.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005b, code lost:
    
        if (r11 != 3) goto L20;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r30) {
        /*
            Method dump skipped, instructions count: 1314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1303859u.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setAdapter(InterfaceC1304259y interfaceC1304259y) {
        boolean z;
        boolean z2;
        int i;
        int i2;
        long j;
        if (o.LJ(this.LLILLIZIL, interfaceC1304259y)) {
            return;
        }
        this.LLILLIZIL = interfaceC1304259y;
        ((LinkedHashMap) this.LLIIIJ).clear();
        removeAllViews();
        setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS22S0100000_2(this, 78)));
        this.LJLLJ.setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS22S0100000_2(this, 79)));
        getAudioCollectionTrack().setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS22S0100000_2(this, 80)));
        this.LJLZ.setOnTouchListener(new View.OnTouchListener() { // from class: X.5AJ
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        });
        addView(this.LJLLILLLL);
        addView(this.LJLLJ);
        addView(this.LJLLLL);
        addView(this.LJLLLLLL);
        addView(this.LJLZ);
        addView(this.LJZ);
        addView(getAudioCollectionTrack());
        int i3 = 0;
        setScrollY(0);
        if (interfaceC1304259y != null) {
            z = interfaceC1304259y.LJIIIZ();
        } else {
            z = false;
        }
        this.LLFII = z;
        if (interfaceC1304259y != null) {
            z2 = interfaceC1304259y.LJ();
        } else {
            z2 = false;
        }
        this.LLFZ = z2;
        if (interfaceC1304259y != null) {
            i = interfaceC1304259y.getItemHeight();
        } else {
            i = 0;
        }
        this.LLF = i;
        this.LLD = i;
        if (interfaceC1304259y != null) {
            i2 = interfaceC1304259y.LIZIZ();
        } else {
            i2 = 0;
        }
        this.LLFF = i2;
        if (interfaceC1304259y != null) {
            i3 = interfaceC1304259y.LJIIJ();
        }
        this.LLFFF = i3;
        if (interfaceC1304259y != null) {
            j = interfaceC1304259y.LJI();
        } else {
            j = 100;
        }
        this.LL = j;
    }

    public final void setAudioCollectionCalStrategy$editor_trackpanel_release(InterfaceC88472Yns<? super ArrayList<Float>, Float> calStrategy) {
        o.LJIIIZ(calStrategy, "calStrategy");
        getAudioCollectionTrack().setOnCalcCollectionSingleHeight$editor_trackpanel_release(calStrategy);
    }

    public final void setAudioCollectionLabelPainter$editor_trackpanel_release(InterfaceC1293655w labelPainter) {
        o.LJIIIZ(labelPainter, "labelPainter");
        getAudioCollectionTrack().setAudioCollectionLabelPainter$editor_trackpanel_release(labelPainter);
    }

    public final void setAudioCollectionWavePainter$editor_trackpanel_release(C5BJ audioWavePainter) {
        o.LJIIIZ(audioWavePainter, "audioWavePainter");
        getAudioCollectionTrack().setAudioWavePainter$editor_trackpanel_release(audioWavePainter);
    }

    public final void setCallback(C59G c59g) {
        this.LLILLJJLI = c59g;
    }

    public final void setCanMoveOutOfMainVideo(boolean z) {
        this.LLFII = z;
    }

    public final void setClipMinDuration$editor_trackpanel_release(long j) {
        this.LL = j;
    }

    public final void setDragOnVerticalAbility(boolean z) {
        this.LLI = !z;
    }

    public final void setEnableClip$editor_trackpanel_release(boolean z) {
        this.LLJ = z;
    }

    public final void setEnableDrag$editor_trackpanel_release(boolean z) {
        this.LLJI = z;
    }

    public final void setItemHeight$editor_trackpanel_release(int i) {
        this.LLF = i;
    }

    public final void setMainVideoDuration(long j) {
        this.LLIIIL = j;
    }

    public final void setMoveTouchEdge(boolean z) {
        if (this.LLIIL != z) {
            if (z) {
                getHapticFeedback().LIZ(this, EnumC1284052e.VIBRATE_IMPACT_LIGHT);
            }
            this.LLIIL = z;
            invalidate();
        }
    }

    public final void setNullAudioTrackPainter(InterfaceC130955Bz nullAudioTrackPainter) {
        o.LJIIIZ(nullAudioTrackPainter, "nullAudioTrackPainter");
        setNullTrackPainter$editor_trackpanel_release(nullAudioTrackPainter);
    }

    public final void setNullEffectTrackPainter(InterfaceC130955Bz nullEffectTrackPainter) {
        o.LJIIIZ(nullEffectTrackPainter, "nullEffectTrackPainter");
        this.LJLLJ.setNullTrackPainter$editor_trackpanel_release(nullEffectTrackPainter);
    }

    @Override // X.AbstractC1304059w
    public void setOnBlankClickListener$editor_trackpanel_release(View.OnClickListener onClickListener) {
        this.LLIZLLLIL = onClickListener;
    }

    public final void setOnClickAudioCollectionTrack$editor_trackpanel_release(InterfaceC88472Yns<? super View, C76800UCe> interfaceC88472Yns) {
        this.LLILZIL = interfaceC88472Yns;
    }

    public final void setOnClickNullAudioTrack(InterfaceC88472Yns<? super View, C76800UCe> interfaceC88472Yns) {
        this.LLILLL = interfaceC88472Yns;
    }

    public final void setOnClickNullEffectTrack(InterfaceC88472Yns<? super View, C76800UCe> interfaceC88472Yns) {
        this.LLILZ = interfaceC88472Yns;
    }

    public final void setOnShouldInterceptSlotClickEvent(InterfaceC88473Ynt<? super NLETrackSlot, ? super View, ? super MotionEvent, Boolean> interfaceC88473Ynt) {
        this.LLILZLL = interfaceC88473Ynt;
    }

    public final void setOnlyOne$editor_trackpanel_release(boolean z) {
        this.LLIIII = z;
    }

    public final void setRecordingAudio$editor_trackpanel_release(boolean z) {
        this.LLIFFJFJJ = z;
    }

    public final void setSelectSegmentStyle(EnumC127354zD style) {
        o.LJIIIZ(style, "style");
        C1303759t clipHelper = getClipHelper();
        clipHelper.getClass();
        clipHelper.LJJI = style;
        clipHelper.LIZ.invalidate();
    }

    public final void setShowTrackNum$editor_trackpanel_release(int i) {
        this.LLII = i;
    }

    @Override // X.AbstractC1304059w
    public void setTimelineScale(float f) {
        if (getTimelineScale() == f) {
            return;
        }
        super.setTimelineScale(f);
        Iterator it = ((LinkedHashMap) this.LLIIIJ).values().iterator();
        while (it.hasNext()) {
            ((C1301058s) it.next()).LJLILLLLZI.setTimelineScale(f);
        }
        requestLayout();
        C1303759t clipHelper = getClipHelper();
        java.util.Map<NLETrackSlot, C1301058s> trackParamsMap = this.LLIIIJ;
        clipHelper.getClass();
        o.LJIIIZ(trackParamsMap, "trackParamsMap");
        OSZ<? extends NLETrackSlot, C1301058s> osz = clipHelper.LJJIJL;
        if (osz == null) {
            return;
        }
        clipHelper.LJIILIIL(trackParamsMap, osz);
    }

    public final void setTotalVideoDuration(long j) {
        this.LLIIIZ = j;
    }

    public final void setTrackDragEventListener$editor_trackpanel_release(C5AH dragEventListener) {
        o.LJIIIZ(dragEventListener, "dragEventListener");
        this.LLIZ = dragEventListener;
    }

    public final void setTrackGroupActionListener(C59B c59b) {
        this.LJLLI = c59b;
    }

    public final void setVideosDuration(long j) {
        this.LLIIJLIL = j;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [X.5A1] */
    public final void setupHolderTouchHandler(final C5A5 holder) {
        o.LJIIIZ(holder, "holder");
        ?? r4 = new C5CY(holder) { // from class: X.5A1
            public final C5A2 LIZ;
            public final /* synthetic */ C5A5 LIZJ;

            /* JADX WARN: Type inference failed for: r14v0, types: [X.5AA] */
            @Override // X.C5CY
            public final void LIZ() {
                Animator animator;
                float f;
                float LIZIZ;
                float f2;
                float LIZIZ2;
                int trackCount;
                float f3;
                float LIZIZ3;
                float f4;
                float LIZIZ4;
                int i;
                ViewGroup viewGroup;
                C5AH trackDragEventListener$editor_trackpanel_release = C1303859u.this.getTrackDragEventListener$editor_trackpanel_release();
                if (trackDragEventListener$editor_trackpanel_release != null) {
                    trackDragEventListener$editor_trackpanel_release.LIZLLL();
                }
                Animator animator2 = C1303859u.this.LLILL;
                if (animator2 != null) {
                    animator2.cancel();
                }
                final C1303859u c1303859u = C1303859u.this;
                ?? r14 = new Object() { // from class: X.5AA
                    public final void LIZ(NLETrackSlot nLETrackSlot) {
                        InterfaceC1304259y interfaceC1304259y = C1303859u.this.LLILLIZIL;
                        if (interfaceC1304259y != null) {
                            interfaceC1304259y.onMoveFail(nLETrackSlot);
                        }
                    }

                    public final void LIZIZ(int i2, int i3, NLETrackSlot nLETrackSlot, long j, long j2, boolean z) {
                        long abs = Math.abs(C1303859u.this.getScrollX()) / C1303859u.this.getTimelineScale();
                        InterfaceC1304259y interfaceC1304259y = C1303859u.this.LLILLIZIL;
                        if (interfaceC1304259y != null) {
                            interfaceC1304259y.onMove(i2, i3, nLETrackSlot, j, abs, j2, z);
                        }
                    }
                };
                C5A2 c5a2 = this.LIZ;
                c5a2.getClass();
                c5a2.LJI(C5AE.NULL);
                c5a2.LIZIZ.setDrawDivider(true);
                c5a2.LIZ.setMoveTouchEdge(false);
                ViewParent parent = c5a2.LIZLLL.getParent();
                Integer num = null;
                if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                    num = Integer.valueOf(viewGroup.indexOfChild(c5a2.LIZLLL));
                }
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("endDrag::indexOfItemView = ");
                LIZ.append(num);
                C131935Ft.LIZIZ("JFKKKKK", X1D.LIZIZ(LIZ));
                C5AH trackDragEventListener$editor_trackpanel_release2 = c5a2.LIZ.getTrackDragEventListener$editor_trackpanel_release();
                if (trackDragEventListener$editor_trackpanel_release2 != null) {
                    if (c5a2.LJIJJ) {
                        if (c5a2.LJIJ < c5a2.LIZ.getTrackCount()) {
                            if (c5a2.LJIIJJI > 0.0f) {
                                i = c5a2.LJIJ + 1;
                            } else {
                                i = c5a2.LJIJ;
                            }
                        } else {
                            i = c5a2.LIZ.getTrackCount();
                        }
                    } else {
                        i = c5a2.LJIJ;
                    }
                    if (trackDragEventListener$editor_trackpanel_release2.LIZ(c5a2.LJIJJLI, i, c5a2.LJIJJ).LJLIL) {
                        c5a2.LJIJI = !r1.LJLILLLLZI;
                    }
                }
                NLETrackSlot nLETrackSlot = c5a2.LJIJJLI;
                if (c5a2.LJIJI || nLETrackSlot == null) {
                    c5a2.LIZIZ.LJI(c5a2.LJIIZILJ);
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(ObjectAnimator.ofFloat(c5a2.LIZLLL, (Property<View, Float>) View.ALPHA, c5a2.LJIILL, 1.0f), ObjectAnimator.ofFloat(c5a2.LIZLLL, (Property<View, Float>) View.TRANSLATION_X, c5a2.LJIIIZ, 0.0f), ObjectAnimator.ofFloat(c5a2.LIZLLL, (Property<View, Float>) View.TRANSLATION_Y, c5a2.LJIIJJI, 0.0f));
                    c5a2.LIZ.LJIIL(c5a2.LJIILLIIL);
                    r14.LIZ(nLETrackSlot);
                    animator = animatorSet;
                } else {
                    long j = 0;
                    if (!c5a2.LJIJJ) {
                        c5a2.LIZLLL.layout(c5a2.LJ.getLeft(), c5a2.LJ.getTop(), c5a2.LJ.getRight(), c5a2.LJ.getBottom());
                        c5a2.LIZLLL.setTranslationY(0.0f);
                        c5a2.LIZLLL.setTranslationX(0.0f);
                        int left = c5a2.LJ.getLeft();
                        int right = c5a2.LJ.getRight();
                        if (c5a2.LJ()) {
                            f3 = C1303859u.LLJJI - right;
                            LIZIZ3 = C1300758p.LIZIZ();
                        } else {
                            f3 = left - C1303859u.LLJJI;
                            LIZIZ3 = C1300758p.LIZIZ();
                        }
                        long j2 = f3 / LIZIZ3;
                        if (j2 >= 0) {
                            j = j2;
                        }
                        if (c5a2.LJ()) {
                            f4 = C1303859u.LLJJI - left;
                            LIZIZ4 = C1300758p.LIZIZ();
                        } else {
                            f4 = right - C1303859u.LLJJI;
                            LIZIZ4 = C1300758p.LIZIZ();
                        }
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("fromTrackIndex: ");
                        LIZ2.append(c5a2.LJIILLIIL);
                        LIZ2.append(", toTrackIndex: ");
                        V10.LJFF(LIZ2, c5a2.LJIJ, ", start: ", j);
                        C131935Ft.LJ("TrackDragHelper", X1D.LIZIZ(LIZ2));
                        r14.LIZIZ(c5a2.LJIILLIIL, c5a2.LJIJ, nLETrackSlot, j, (f4 / LIZIZ4) - j, false);
                    } else {
                        int left2 = (int) (c5a2.LIZLLL.getLeft() + c5a2.LJIIIZ);
                        int right2 = (int) (c5a2.LIZLLL.getRight() + c5a2.LJIIIZ);
                        if (c5a2.LJ()) {
                            f = C1303859u.LLJJI - right2;
                            LIZIZ = C1300758p.LIZIZ();
                        } else {
                            f = left2 - C1303859u.LLJJI;
                            LIZIZ = C1300758p.LIZIZ();
                        }
                        long j3 = f / LIZIZ;
                        if (j3 >= 0) {
                            j = j3;
                        }
                        if (c5a2.LJ()) {
                            f2 = C1303859u.LLJJI - left2;
                            LIZIZ2 = C1300758p.LIZIZ();
                        } else {
                            f2 = right2 - C1303859u.LLJJI;
                            LIZIZ2 = C1300758p.LIZIZ();
                        }
                        long j4 = f2 / LIZIZ2;
                        if (!c5a2.LIZ.getCanMoveOutOfMainVideo$editor_trackpanel_release() && j4 > c5a2.LIZ.getMainVideoDuration()) {
                            j4 = c5a2.LIZ.getMainVideoDuration();
                        } else if (!c5a2.LIZ.getCanMoveOutOfVideos$editor_trackpanel_release() && ((float) j4) > c5a2.LIZ.getVideosLength$editor_trackpanel_release() / c5a2.LIZ.getTimelineScale()) {
                            j4 = c5a2.LIZ.getVideosLength$editor_trackpanel_release() / c5a2.LIZ.getTimelineScale();
                        }
                        if (c5a2.LJIJ < c5a2.LIZ.getTrackCount()) {
                            if (c5a2.LJIIJJI > 0.0f) {
                                trackCount = c5a2.LJIJ + 1;
                            } else {
                                trackCount = c5a2.LJIJ;
                            }
                        } else {
                            trackCount = c5a2.LIZ.getTrackCount();
                        }
                        r14.LIZIZ(c5a2.LJIILLIIL, trackCount, nLETrackSlot, j, j4 - j, true);
                    }
                    Animator ofFloat = ObjectAnimator.ofFloat(c5a2.LIZLLL, (Property<View, Float>) View.ALPHA, c5a2.LJIILL, 1.0f);
                    o.LJIIIIZZ(ofFloat, "ofFloat(itemView, ALPHA, slotDraggingAlpha, 1F)");
                    animator = ofFloat;
                }
                animator.setDuration(100L);
                animator.addListener(new ALAdapterS1S0100000_2(c5a2, 31));
                animator.start();
                c5a2.LJIIIZ = 0.0f;
                c5a2.LJIIJ = 0.0f;
                c5a2.LJIIJJI = 0.0f;
                c5a2.LJIIL = 0.0f;
                c5a2.LJIILLIIL = 0;
                c5a2.LIZ.requestDisallowInterceptTouchEvent(false);
                c1303859u.LLILL = animator;
                C1303859u.this.LLILIL = false;
                this.LIZJ.LIZLLL(false);
                C1303859u.this.getTrackGroupDragMask$editor_trackpanel_release().setVisibility(8);
                C1303859u c1303859u2 = C1303859u.this;
                c1303859u2.LJZ.setTranslationX(0.0f);
                c1303859u2.LJZ.setTranslationY(0.0f);
                c1303859u2.LJZ.setVisibility(8);
                C1303859u.this.LJIIIZ();
                C1303859u.this.LJIIJ();
                C59B trackGroupActionListener = C1303859u.this.getTrackGroupActionListener();
                if (trackGroupActionListener != null) {
                    C59C.LIZ(trackGroupActionListener, null, null, false, true, 6);
                }
            }

            @Override // X.C5CY
            public final boolean LIZJ() {
                return C1303859u.this.getEnableDrag$editor_trackpanel_release();
            }

            @Override // X.C5CY
            public final void LIZLLL() {
                C59G LIZLLL;
                ViewGroup viewGroup;
                C1303859u.this.LJIILIIL(false);
                Animator animator = C1303859u.this.LLILL;
                if (animator != null) {
                    animator.cancel();
                }
                C1303859u c1303859u = C1303859u.this;
                C5A2 c5a2 = this.LIZ;
                java.util.Map<NLETrackSlot, C1301058s> paramsMap = c1303859u.getSegmentParams();
                c5a2.getClass();
                o.LJIIIZ(paramsMap, "paramsMap");
                c5a2.LIZ.requestDisallowInterceptTouchEvent(true);
                c5a2.LIZ.getLocationOnScreen(c5a2.LJIILJJIL);
                ((InterfaceC1283852c) c5a2.LJJIII.getValue()).LIZ(c5a2.LIZLLL, EnumC1284052e.VIBRATE_IMPACT_LIGHT);
                if (C1291054w.LJ().LJJJLIIL) {
                    c5a2.LJI.setVisibility(0);
                    c5a2.LJI.bringToFront();
                }
                ViewParent parent = c5a2.LIZLLL.getParent();
                Integer num = null;
                if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                    num = Integer.valueOf(viewGroup.indexOfChild(c5a2.LIZLLL));
                }
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("beginDrag::indexOfItemView = ");
                LIZ.append(num);
                C131935Ft.LIZIZ("JFKKKKK", X1D.LIZIZ(LIZ));
                c5a2.LJ.bringToFront();
                c5a2.LJFF.bringToFront();
                c5a2.LIZLLL.bringToFront();
                c5a2.LJII.bringToFront();
                c5a2.LIZIZ.setDrawDivider(false);
                for (Map.Entry<NLETrackSlot, C1301058s> entry : paramsMap.entrySet()) {
                    NLETrackSlot key = entry.getKey();
                    if (entry.getValue().LJLILLLLZI == c5a2.LIZIZ) {
                        c5a2.LJIJJLI = key;
                    }
                }
                for (int paddingTop = c5a2.LIZ.getPaddingTop(); paddingTop < c5a2.LIZLLL.getTop(); paddingTop += c5a2.LIZ.getItemMargin$editor_trackpanel_release() + c5a2.LIZ.getItemHeight$editor_trackpanel_release()) {
                    c5a2.LJIILLIIL++;
                }
                c5a2.LJIJ = c5a2.LJIILLIIL;
                c5a2.LJIIZILJ = c5a2.LIZIZ.LJII();
                c5a2.LJIILIIL = C5AE.NULL;
                NLETrackSlot nLETrackSlot = c5a2.LJIJJLI;
                if (nLETrackSlot != null && (LIZLLL = c5a2.LIZLLL()) != null) {
                    LIZLLL.LJIIJJI(nLETrackSlot);
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(c5a2.LIZLLL, (Property<View, Float>) View.ALPHA, 1.0f, c5a2.LJIILL);
                ofFloat.setDuration(50L);
                ofFloat.start();
                c1303859u.LLILL = ofFloat;
                InterfaceC1304259y interfaceC1304259y = C1303859u.this.LLILLIZIL;
                if (interfaceC1304259y != null) {
                    interfaceC1304259y.LIZLLL();
                }
                C1303859u.this.LLILIL = true;
                this.LIZJ.LIZLLL(true);
                C1303859u c1303859u2 = C1303859u.this;
                C5A5 c5a5 = this.LIZJ;
                c1303859u2.getClass();
                View view = c5a5.getView();
                View view2 = c1303859u2.LJLLLL;
                view2.setVisibility(0);
                view2.setZ(0.0f);
                view2.layout(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                C5AH trackDragEventListener$editor_trackpanel_release = C1303859u.this.getTrackDragEventListener$editor_trackpanel_release();
                if (trackDragEventListener$editor_trackpanel_release != null) {
                    trackDragEventListener$editor_trackpanel_release.LIZJ(this.LIZ.LJIJJLI);
                }
                if (!C1300758p.LJI) {
                    C1303859u c1303859u3 = C1303859u.this;
                    C5A5 c5a52 = this.LIZJ;
                    c1303859u3.getClass();
                    View view3 = c5a52.getView();
                    int i = (int) ((C1303759t.LJJIL / 2) + C1303759t.LJJIZ);
                    View view4 = c1303859u3.LJZ;
                    view4.setVisibility(0);
                    view4.layout(view3.getLeft() - i, view3.getTop() - i, view3.getRight() + i, view3.getBottom() + i);
                }
            }

            {
                this.LIZJ = holder;
                this.LIZ = new C5A2(C1303859u.this, holder, new AqS152S0100000_2(C1303859u.this, 624));
            }

            @Override // X.C5CY
            public final void LIZIZ(float f, float f2, float f3) {
                C5AE c5ae;
                float left;
                float LIZIZ;
                long j;
                long left2;
                long j2;
                C5AE c5ae2;
                C59G LIZLLL;
                int LIZ;
                boolean z;
                boolean z2;
                int LJIIIIZZ;
                C5A2 c5a2 = this.LIZ;
                java.util.Map<NLETrackSlot, C1301058s> paramsMap = C1303859u.this.getSegmentParams();
                c5a2.getClass();
                o.LJIIIZ(paramsMap, "paramsMap");
                c5a2.LJIIL += f2;
                if (c5a2.LJ()) {
                    if (c5a2.LJIIL - c5a2.LJIIJ < 0.0f) {
                        c5ae = C5AE.END;
                    } else {
                        c5ae = C5AE.START;
                    }
                } else if (c5a2.LJIIL - c5a2.LJIIJ > 0.0f) {
                    c5ae = C5AE.START;
                } else {
                    c5ae = C5AE.END;
                }
                c5a2.LJIILIIL = c5ae;
                int measuredWidth = c5a2.LIZ.getMeasuredWidth();
                int i = c5a2.LJIILJJIL[0];
                int i2 = C5AW.LIZ;
                if (f > (measuredWidth + i) - i2) {
                    if (c5a2.LJ()) {
                        c5ae2 = C5AE.START;
                    } else {
                        c5ae2 = C5AE.END;
                    }
                } else if (f < i + i2) {
                    if (c5a2.LJ()) {
                        c5ae2 = C5AE.END;
                    } else {
                        c5ae2 = C5AE.START;
                    }
                } else {
                    float f4 = c5a2.LJIIL - c5a2.LJIIJ;
                    int i3 = C1303859u.LLJJI;
                    if (c5a2.LJ()) {
                        left = ((c5a2.LIZ.getWidth() - i3) - c5a2.LIZLLL.getRight()) - c5a2.LJIIL;
                        LIZIZ = C1300758p.LIZIZ();
                    } else {
                        left = (c5a2.LIZLLL.getLeft() + c5a2.LJIIL) - i3;
                        LIZIZ = C1300758p.LIZIZ();
                    }
                    long j3 = left / LIZIZ;
                    NLETrackSlot nLETrackSlot = c5a2.LJIJJLI;
                    if (nLETrackSlot != null) {
                        j = nLETrackSlot.getDuration();
                    } else {
                        j = 0;
                    }
                    long j4 = 1000;
                    long j5 = (j / j4) + j3;
                    if (c5a2.LJ()) {
                        left2 = (((c5a2.LIZ.getWidth() - i3) - c5a2.LIZLLL.getRight()) - c5a2.LJIIJ) / C1300758p.LIZIZ();
                    } else {
                        left2 = ((c5a2.LIZLLL.getLeft() + c5a2.LJIIJ) - i3) / C1300758p.LIZIZ();
                    }
                    NLETrackSlot nLETrackSlot2 = c5a2.LJIJJLI;
                    if (nLETrackSlot2 != null) {
                        j2 = nLETrackSlot2.getDuration();
                    } else {
                        j2 = 0;
                    }
                    long j6 = (j2 / j4) + left2;
                    NLETrackSlot nLETrackSlot3 = c5a2.LJIJJLI;
                    if (nLETrackSlot3 != null && (LIZLLL = c5a2.LIZLLL()) != null) {
                        long longValue = Long.valueOf(LIZLLL.LJ(nLETrackSlot3, c5a2.LJIILIIL, j3, j5, left2, j6)).longValue();
                        if (longValue != Long.MIN_VALUE) {
                            if (c5a2.LJ()) {
                                longValue = -longValue;
                            }
                            f4 = ((float) longValue) * C1300758p.LIZIZ();
                            if (f4 != 0.0f) {
                                ((InterfaceC1283852c) c5a2.LJJIII.getValue()).LIZ(c5a2.LIZ, EnumC1284052e.VIBRATE_IMPACT_LIGHT);
                            }
                        }
                    }
                    c5a2.LJIIJ += f4;
                    c5a2.LJII();
                    c5ae2 = C5AE.NULL;
                }
                c5a2.LJI(c5ae2);
                int i4 = -1;
                if (!c5a2.LIZ.getOnlyDragOnX$editor_trackpanel_release()) {
                    c5a2.LJIIJJI += f3;
                    int scrollY = c5a2.LIZ.getScrollY();
                    int i5 = c5a2.LJIILLIIL;
                    float f5 = c5a2.LJIIJJI;
                    if (f5 < 0.0f) {
                        while (f5 < 0.0f) {
                            if (f5 <= (-(((c5a2.LIZ.getItemHeight$editor_trackpanel_release() * 2.0f) / 3.0f) + c5a2.LIZ.getItemMargin$editor_trackpanel_release()))) {
                                i5--;
                            }
                            f5 += c5a2.LIZ.getItemMargin$editor_trackpanel_release() + c5a2.LIZ.getItemHeight$editor_trackpanel_release();
                        }
                    } else if (f5 > 0.0f) {
                        while (f5 > 0.0f) {
                            if (f5 >= ((c5a2.LIZ.getItemHeight$editor_trackpanel_release() * 2.0f) / 3.0f) + c5a2.LIZ.getItemMargin$editor_trackpanel_release()) {
                                i5++;
                            }
                            f5 -= c5a2.LIZ.getItemMargin$editor_trackpanel_release() + c5a2.LIZ.getItemHeight$editor_trackpanel_release();
                        }
                    }
                    if (i5 >= c5a2.LIZ.getMaxTrackNum$editor_trackpanel_release()) {
                        i5 = c5a2.LIZ.getMaxTrackNum$editor_trackpanel_release() - 1;
                    }
                    int trackCount = c5a2.LIZ.getTrackCount();
                    long uptimeMillis = SystemClock.uptimeMillis();
                    if (trackCount <= i5) {
                        if (c5a2.LJIJ != trackCount && uptimeMillis - c5a2.LJIL >= 500) {
                            c5a2.LJIL = uptimeMillis;
                            c5a2.LJIJ = trackCount;
                            LIZ = c5a2.LIZ(trackCount, scrollY);
                        } else {
                            LIZ = 0;
                        }
                    } else {
                        if (i5 < 0) {
                            i5 = 0;
                        }
                        LIZ = c5a2.LIZ(i5, scrollY);
                        if (LIZ != 0) {
                            if (uptimeMillis - c5a2.LJIL < 500) {
                                LIZ = 0;
                            } else {
                                c5a2.LJIL = uptimeMillis;
                            }
                        }
                        c5a2.LJIJ = i5;
                    }
                    c5a2.LJIIJJI += LIZ;
                    C59G LIZLLL2 = c5a2.LIZLLL();
                    if (LIZLLL2 != null) {
                        LIZLLL2.LJIILIIL(c5a2.LIZ, 0, LIZ, true, c5a2.LJ());
                    }
                    float f6 = c5a2.LJIIJJI;
                    if (c5a2.LIZ.getNullAudioTrack$editor_trackpanel_release().getVisibility() == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (c5a2.LIZ.getNullEffectTrack$editor_trackpanel_release().getVisibility() == 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z) {
                        LJIIIIZZ = c5a2.LIZ.getNullAudioTrack$editor_trackpanel_release().getBottom();
                    } else if (z2) {
                        LJIIIIZZ = c5a2.LIZ.getNullEffectTrack$editor_trackpanel_release().getBottom();
                    } else {
                        ArrayList arrayList = new ArrayList(paramsMap.size());
                        Iterator<Map.Entry<NLETrackSlot, C1301058s>> it = paramsMap.entrySet().iterator();
                        while (it.hasNext()) {
                            arrayList.add(it.next().getValue());
                        }
                        Iterator it2 = arrayList.iterator();
                        if (it2.hasNext()) {
                            int i6 = ((C1301058s) it2.next()).LJLIL;
                            while (it2.hasNext()) {
                                int i7 = ((C1301058s) it2.next()).LJLIL;
                                if (i6 < i7) {
                                    i6 = i7;
                                }
                            }
                            LJIIIIZZ = c5a2.LIZ.LJIIIIZZ(i6 + 1);
                        } else {
                            throw new NoSuchElementException();
                        }
                    }
                    int i8 = (int) f6;
                    if (c5a2.LIZLLL.getTop() + i8 <= 0) {
                        f6 = -c5a2.LIZLLL.getTop();
                    } else if (c5a2.LIZLLL.getBottom() + i8 >= LJIIIIZZ) {
                        f6 = LJIIIIZZ - c5a2.LIZLLL.getBottom();
                    }
                    c5a2.LJIIJJI = f6;
                }
                c5a2.LIZLLL.setTranslationY(c5a2.LJIIJJI);
                c5a2.LJII.setTranslationY(c5a2.LJIIJJI);
                if (c5a2.LJIJ < c5a2.LIZ.getTrackCount()) {
                    float f7 = f - c5a2.LJIILJJIL[0];
                    int i9 = c5a2.LJIJ - c5a2.LJIILLIIL;
                    float f8 = c5a2.LJIIJJI;
                    int itemHeight$editor_trackpanel_release = c5a2.LIZ.getItemHeight$editor_trackpanel_release();
                    int itemMargin$editor_trackpanel_release = c5a2.LIZ.getItemMargin$editor_trackpanel_release();
                    int i10 = itemHeight$editor_trackpanel_release + itemMargin$editor_trackpanel_release;
                    if (f8 >= 0.0f) {
                        i4 = 1;
                    }
                    float f9 = i4;
                    float f10 = itemHeight$editor_trackpanel_release;
                    float f11 = 0.33333334f * f10 * f9;
                    float f12 = ((f10 * 0.6666667f) + itemMargin$editor_trackpanel_release) * f9;
                    if (f8 >= 0.0f) {
                        float f13 = i9 * i10;
                        float f14 = f11 + f13;
                        if (f8 <= f12 + f13 && f14 <= f8) {
                            c5a2.LIZ.LJIIIZ();
                            c5a2.LIZJ(paramsMap);
                            return;
                        } else {
                            c5a2.LIZ.LJIIJ();
                            c5a2.LIZIZ(f7, paramsMap);
                            return;
                        }
                    }
                    float f15 = i9 * i10;
                    float f16 = f12 + f15;
                    if (f8 <= f11 + f15 && f16 <= f8) {
                        c5a2.LIZ.LJIIIZ();
                        c5a2.LIZJ(paramsMap);
                    } else if (c5a2.LJIJ == 0 && (c5a2.LIZLLL.getTop() + ((int) c5a2.LJIIJJI) <= 0 || f8 < f16)) {
                        c5a2.LIZ.LJIIIZ();
                        c5a2.LIZJ(paramsMap);
                    } else {
                        c5a2.LIZ.LJIIJ();
                        c5a2.LIZIZ(f7, paramsMap);
                    }
                }
            }
        };
        View view = holder.getView();
        view.setOnTouchListener(new C5CX(r4, new AqS121S0300000_2(view, holder, this, 0)));
    }

    public final void LJIILJJIL(NLETrackSlot slot, EnumC127354zD style) {
        C5A5 c5a5;
        C1301058s second;
        o.LJIIIZ(slot, "slot");
        o.LJIIIZ(style, "style");
        int LJI = LJI(slot);
        if (LJI != -1) {
            C1303759t clipHelper = getClipHelper();
            java.util.Map<NLETrackSlot, C1301058s> trackParamsMap = this.LLIIIJ;
            clipHelper.getClass();
            o.LJIIIZ(trackParamsMap, "trackParamsMap");
            for (Map.Entry entry : ((LinkedHashMap) trackParamsMap).entrySet()) {
                NLENode nLENode = (NLENode) entry.getKey();
                C1301058s c1301058s = (C1301058s) entry.getValue();
                if (o.LJ(nLENode, slot) || nLENode.getId() == slot.getId()) {
                    OSZ<? extends NLETrackSlot, C1301058s> osz = clipHelper.LJJIJL;
                    if (osz != null && (second = osz.getSecond()) != null) {
                        c5a5 = second.LJLILLLLZI;
                    } else {
                        c5a5 = null;
                    }
                    C1303759t.LJIIIZ(c1301058s.LJLILLLLZI, c5a5);
                    clipHelper.LJIIL(new OSZ<>(nLENode, c1301058s));
                    clipHelper.LJJI = style;
                }
            }
            OSZ<? extends NLETrackSlot, C1301058s> osz2 = clipHelper.LJJIJL;
            if (osz2 != null) {
                clipHelper.LJIILIIL(trackParamsMap, osz2);
            }
            clipHelper.LIZ.invalidate();
            LJIIL(LJI);
        }
    }

    @Override // X.AbstractC1304059w, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(FrameLayout.getDefaultSize(getSuggestedMinimumWidth(), i), FrameLayout.getDefaultSize(getSuggestedMinimumHeight(), i2));
        if (getAudioCollectionTrack().getVisibility() == 0) {
            java.util.Set keySet = ((LinkedHashMap) this.LLIIIJ).keySet();
            if (!(keySet instanceof Collection) || !keySet.isEmpty()) {
                Iterator it = keySet.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (C124574uj.LJJIJL((NLETrackSlot) it.next())) {
                        getAudioCollectionTrack().measure(LJII((int) Math.rint(C1300758p.LIZIZ() * ((float) (getAudioCollectionTrack().getEndTime() - getAudioCollectionTrack().getStartTime())))), LJII(this.LLF));
                        break;
                    }
                }
            }
            if (((Boolean) this.LLJIJIL.getValue()).booleanValue()) {
                java.util.Map<NLETrackSlot, C1301058s> map = this.LLIIIJ;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
                    if (!C124574uj.LJJIJL((NLETrackSlot) entry.getKey())) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                    NLETimeSpaceNode nLETimeSpaceNode = (NLETimeSpaceNode) entry2.getKey();
                    ((C1301058s) entry2.getValue()).LJLILLLLZI.getView().measure(LJII((int) Math.rint(C1300758p.LIZIZ() * ((float) ((nLETimeSpaceNode.getMeasuredEndTime() - nLETimeSpaceNode.getMeasuredStartTime()) / 1000)))), LJII(this.LLF));
                }
            }
        } else {
            for (Map.Entry entry3 : ((LinkedHashMap) this.LLIIIJ).entrySet()) {
                NLETimeSpaceNode nLETimeSpaceNode2 = (NLETimeSpaceNode) entry3.getKey();
                ((C1301058s) entry3.getValue()).LJLILLLLZI.getView().measure(LJII((int) Math.rint(C1300758p.LIZIZ() * ((float) ((nLETimeSpaceNode2.getMeasuredEndTime() - nLETimeSpaceNode2.getMeasuredStartTime()) / 1000)))), LJII(this.LLF));
            }
        }
        if (getVisibility() == 0) {
            measure(LJII(getNullAudioTrackCanvasWidth()), LJII(this.LLD));
        }
        if (this.LJLLJ.getVisibility() == 0) {
            this.LJLLJ.measure(LJII(getNullAudioTrackCanvasWidth()), LJII(this.LLD));
        }
        if (C1291054w.LJ().LJJJLIIL) {
            this.LJLZ.measure(LJII(getWidth()), LJII(getHeight()));
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.5B9] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1303859u(final android.content.Context r9, android.util.AttributeSet r10, int r11) {
        /*
            Method dump skipped, instructions count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1303859u.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    @Override // X.AbstractC1304059w, android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        InterfaceC1304259y interfaceC1304259y = this.LLILLIZIL;
        if (interfaceC1304259y != null) {
            interfaceC1304259y.onScrollChanged();
        }
        this.LLIIJI = Math.abs((long) Math.ceil(getScrollX() / C1300758p.LIZIZ()));
        Iterator it = ((LinkedHashMap) this.LLIIIJ).values().iterator();
        while (it.hasNext()) {
            ((C1301058s) it.next()).LJLILLLLZI.LIZIZ(getScrollX());
        }
        if (getAudioCollectionTrack().getVisibility() == 0) {
            getAudioCollectionTrack().postInvalidateOnAnimation();
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = LLJJI;
        if (getAudioCollectionTrack().getVisibility() == 0) {
            long startTime = getAudioCollectionTrack().getStartTime();
            if (LJIIJJI()) {
                int rint = i5 - ((int) Math.rint(C1300758p.LIZIZ() * ((float) startTime)));
                getAudioCollectionTrack().layout(rint - getAudioCollectionTrack().getMeasuredWidth(), getPaddingTop(), rint, getPaddingTop() + this.LLF);
            } else {
                int rint2 = ((int) Math.rint(C1300758p.LIZIZ() * ((float) startTime))) + i5;
                getAudioCollectionTrack().layout(rint2, getPaddingTop(), getAudioCollectionTrack().getMeasuredWidth() + rint2, getPaddingTop() + this.LLF);
            }
            if (((Boolean) this.LLJIJIL.getValue()).booleanValue()) {
                java.util.Map<NLETrackSlot, C1301058s> map = this.LLIIIJ;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
                    if (!C124574uj.LJJIJL((NLETrackSlot) entry.getKey())) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                    NLETimeSpaceNode nLETimeSpaceNode = (NLETimeSpaceNode) entry2.getKey();
                    C1301058s c1301058s = (C1301058s) entry2.getValue();
                    int paddingTop = getPaddingTop();
                    int i6 = c1301058s.LJLIL;
                    int i7 = this.LLF;
                    int LIZ = C0EH.LIZ(this.LLFF, i7, i6, paddingTop);
                    int i8 = i7 + LIZ;
                    View view = c1301058s.LJLILLLLZI.getView();
                    long measuredStartTime = nLETimeSpaceNode.getMeasuredStartTime() / 1000;
                    if (LJIIJJI()) {
                        int rint3 = i5 - ((int) Math.rint(C1300758p.LIZIZ() * ((float) measuredStartTime)));
                        view.layout(rint3 - view.getMeasuredWidth(), LIZ, rint3, i8);
                    } else {
                        int rint4 = ((int) Math.rint(C1300758p.LIZIZ() * ((float) measuredStartTime))) + i5;
                        view.layout(rint4, LIZ, view.getMeasuredWidth() + rint4, i8);
                    }
                }
            }
        } else {
            for (Map.Entry entry3 : ((LinkedHashMap) this.LLIIIJ).entrySet()) {
                NLETimeSpaceNode nLETimeSpaceNode2 = (NLETimeSpaceNode) entry3.getKey();
                C1301058s c1301058s2 = (C1301058s) entry3.getValue();
                int paddingTop2 = getPaddingTop();
                int i9 = c1301058s2.LJLIL;
                int i10 = this.LLF;
                int LIZ2 = C0EH.LIZ(this.LLFF, i10, i9, paddingTop2);
                int i11 = i10 + LIZ2;
                View view2 = c1301058s2.LJLILLLLZI.getView();
                long measuredStartTime2 = nLETimeSpaceNode2.getMeasuredStartTime() / 1000;
                if (LJIIJJI()) {
                    int rint5 = i5 - ((int) Math.rint(C1300758p.LIZIZ() * ((float) measuredStartTime2)));
                    view2.layout(rint5 - view2.getMeasuredWidth(), LIZ2, rint5, i11);
                } else {
                    int rint6 = ((int) Math.rint(C1300758p.LIZIZ() * ((float) measuredStartTime2))) + i5;
                    view2.layout(rint6, LIZ2, view2.getMeasuredWidth() + rint6, i11);
                }
            }
        }
        if (getVisibility() == 0) {
            C5B9 c5b9 = this.LJLLILLLL;
            if (LJIIJJI()) {
                c5b9.layout(i5 - c5b9.getMeasuredWidth(), getNullTrackTopBottom().getFirst().intValue(), i5, getNullTrackTopBottom().getSecond().intValue());
            } else {
                c5b9.layout(i5, getNullTrackTopBottom().getFirst().intValue(), c5b9.getMeasuredWidth() + i5, getNullTrackTopBottom().getSecond().intValue());
            }
        }
        if (this.LJLLJ.getVisibility() == 0) {
            C5B8 c5b8 = this.LJLLJ;
            if (LJIIJJI()) {
                c5b8.layout(i5 - c5b8.getMeasuredWidth(), getNullTrackTopBottom().getFirst().intValue(), i5, getNullTrackTopBottom().getSecond().intValue());
            } else {
                c5b8.layout(i5, getNullTrackTopBottom().getFirst().intValue(), c5b8.getMeasuredWidth() + i5, getNullTrackTopBottom().getSecond().intValue());
            }
        }
        if (C1291054w.LJ().LJJJLIIL) {
            if (LJIIJJI()) {
                this.LJLZ.layout((i5 * 2) - ((int) Math.rint(C1300758p.LIZIZ() * ((float) this.LLIIIL))), 0, 0, Math.max(getDesireHeight(), getMeasuredHeight()));
            } else {
                this.LJLZ.layout(0, 0, (i5 * 2) + ((int) Math.rint(C1300758p.LIZIZ() * ((float) this.LLIIIL))), Math.max(getDesireHeight(), getMeasuredHeight()));
            }
        }
    }
}
