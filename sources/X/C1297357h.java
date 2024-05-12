package X;

import Y.ACListenerS22S0100000_2;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegmentTransition;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.57h, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1297357h extends RelativeLayout {
    public long LJLIL;
    public final List<C59L> LJLILLLLZI;
    public final C1297357h LJLJI;
    public final List<NLETrackSlot> LJLJJI;
    public InterfaceC1298157p LJLJJL;
    public int LJLJJLL;
    public final int LJLJL;
    public final ImageView LJLJLJ;
    public boolean LJLJLLL;
    public boolean LJLL;
    public int LJLLI;
    public int LJLLILLLL;
    public EnumC127354zD LJLLJ;
    public boolean LJLLL;
    public boolean LJLLLL;
    public boolean LJLLLLLL;
    public boolean LJLZ;
    public double LJZ;
    public int LJZI;
    public InterfaceC65784Pro<Boolean> LJZL;
    public InterfaceC65784Pro<Boolean> LL;
    public final C58K LLD;
    public final C62822Ol8 LLF;
    public final C62822Ol8 LLFF;
    public InterfaceC1299057y LLFFF;
    public InterfaceC1298857w LLFII;
    public final int LLFZ;
    public final int LLI;
    public final int LLIFFJFJJ;
    public final C62822Ol8 LLII;
    public boolean LLIIII;
    public boolean LLIIIILZ;
    public final C62822Ol8 LLIIIJ;
    public ImageView LLIIIL;
    public boolean LLIIIZ;
    public final C1298757v LLIIJI;
    public final C1298457s LLIIJLIL;
    public final C1297557j LLIIL;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1297357h(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        o.LJIIIZ(context, "context");
    }

    public final void setSelectAgainToRoot(boolean z) {
    }

    private final NLETrackSlot getSelectedSegment() {
        if (LJ(this.LJLLILLLL)) {
            return (NLETrackSlot) ListProtector.get(this.LJLJJI, this.LJLLILLLL);
        }
        return null;
    }

    public final boolean LIZLLL() {
        return ((Boolean) this.LLF.getValue()).booleanValue();
    }

    public final void LJII() {
        if (!LJ(this.LJLLILLLL)) {
            this.LJLLILLLL = -1;
        } else {
            setNormalType(Integer.valueOf(this.LJLLILLLL));
            this.LJLLILLLL = -1;
        }
    }

    public final InterfaceC1289354f getBlackSlotContainer() {
        return (InterfaceC1289354f) this.LLIIIJ.getValue();
    }

    public final InterfaceC1283852c getHapticFeedback() {
        return (InterfaceC1283852c) this.LLFF.getValue();
    }

    public final Bitmap getThumbnailMaskBitmap() {
        return (Bitmap) this.LLII.getValue();
    }

    private final int getSelectedIndex() {
        NLETrackSlot selectedSegment = getSelectedSegment();
        if (selectedSegment == null) {
            return -1;
        }
        Iterator it = ((ArrayList) this.LJLJJI).iterator();
        int i = 0;
        while (it.hasNext()) {
            if (((NLENode) it.next()).getId() == selectedSegment.getId()) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public final boolean getEnableShowTips() {
        return this.LJLLLLLL;
    }

    public final boolean getEnableTransition$editor_trackpanel_release() {
        return this.LLIIIZ;
    }

    public final ImageView getFirstTransitionView$editor_trackpanel_release() {
        return this.LLIIIL;
    }

    public final int getMyScrollX() {
        return this.LJZI;
    }

    public final double getScale() {
        return this.LJZ;
    }

    public final int getSelectIndex() {
        return this.LJLLILLLL;
    }

    public final EnumC127354zD getSelectedTrackStyle() {
        return this.LJLLJ;
    }

    private final void setEpilogueEnable(boolean z) {
        C59L c59l;
        if (LJ(((ArrayList) this.LJLILLLLZI).size() - 2)) {
            ((C59L) ListProtector.get(this.LJLILLLLZI, ((ArrayList) r1).size() - 2)).setDrawMyTransitionOverlap(z);
            if (z) {
                Iterator<C59L> it = this.LJLILLLLZI.iterator();
                while (true) {
                    if (it.hasNext()) {
                        c59l = it.next();
                        if (c59l.LLIFFJFJJ) {
                            break;
                        }
                    } else {
                        c59l = null;
                        break;
                    }
                }
                C59L c59l2 = c59l;
                if (c59l2 != null) {
                    c59l2.setEpilogueEnable(z);
                    if (this.LJLLJ == EnumC127354zD.LINE) {
                        return;
                    }
                    c59l2.LJI(z);
                }
            }
        }
    }

    private final void setLineType(int i) {
        if (!LJ(i)) {
            return;
        }
        ((C59L) ListProtector.get(this.LJLILLLLZI, i)).LJIIJJI();
        Iterator<C59L> it = this.LJLILLLLZI.iterator();
        while (it.hasNext()) {
            it.next().LJI(true);
        }
        NLESegmentTransition LIZLLL = ((NLETrackSlot) ListProtector.get(this.LJLJJI, i)).LIZLLL();
        if (LIZLLL != null && LIZLLL.LJ()) {
            int i2 = i + 1;
            if (LJ(i2)) {
                ((C59L) ListProtector.get(this.LJLILLLLZI, i2)).LJI(false);
            }
        }
        if (i > 0) {
            ((C59L) ListProtector.get(this.LJLILLLLZI, i - 1)).setDrawMyTransitionOverlap(false);
        }
        if (i < ((ArrayList) this.LJLILLLLZI).size() - 1) {
            ((C59L) ListProtector.get(this.LJLILLLLZI, i + 1)).setDrawPreTransitionOverlap(false);
        }
        this.LJLLJ = EnumC127354zD.LINE;
    }

    private final void setNormalType(Integer num) {
        int selectedIndex;
        if (num != null) {
            selectedIndex = num.intValue();
        } else {
            selectedIndex = getSelectedIndex();
        }
        if (!LJ(selectedIndex)) {
            return;
        }
        ((C59L) ListProtector.get(this.LJLILLLLZI, selectedIndex)).LJIIL();
        if (selectedIndex > 0) {
            ((C59L) ListProtector.get(this.LJLILLLLZI, selectedIndex - 1)).setDrawMyTransitionOverlap(true);
        }
        if (selectedIndex < ((ArrayList) this.LJLILLLLZI).size() - 1) {
            ((C59L) ListProtector.get(this.LJLILLLLZI, selectedIndex + 1)).setDrawPreTransitionOverlap(true);
        }
        Iterator<C59L> it = this.LJLILLLLZI.iterator();
        while (it.hasNext()) {
            it.next().LJI(true);
        }
        this.LJLLJ = EnumC127354zD.NONE;
    }

    public final void LIZ(boolean z) {
        Iterator<C59L> it = this.LJLILLLLZI.iterator();
        while (it.hasNext()) {
            ImageView transition = it.next().getTransition();
            if (transition != null) {
                transition.setClickable(z);
            }
        }
        this.LLIIII = z;
        this.LLIIIILZ = z;
    }

    public final long LIZIZ(int i) {
        String str;
        NLESegmentTransition LIZLLL;
        NLEResourceNode LIZLLL2;
        NLETrackSlot nLETrackSlot = (NLETrackSlot) ListProtector.get(this.LJLJJI, i - 1);
        NLESegmentTransition LIZLLL3 = nLETrackSlot.LIZLLL();
        if (LIZLLL3 == null || (LIZLLL2 = LIZLLL3.LIZLLL()) == null || (str = LIZLLL2.LIZJ()) == null) {
            str = "";
        }
        long j = 0;
        if (!(!ujb.o.LJJJJJL(str)) || (LIZLLL = nLETrackSlot.LIZLLL()) == null || !LIZLLL.LJ()) {
            return 0L;
        }
        NLESegmentTransition LIZLLL4 = nLETrackSlot.LIZLLL();
        if (LIZLLL4 != null) {
            j = LIZLLL4.LJFF();
        }
        return j / 1000;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r2v5 */
    public final void LIZJ(List<? extends NLETrackSlot> segments) {
        float f;
        boolean z;
        int dimension;
        long j;
        boolean z2;
        int i;
        o.LJIIIZ(segments, "segments");
        ?? r2 = 1;
        if (!this.LJLJLLL) {
            setClipChildren(false);
            this.LJLJLLL = true;
        }
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        V2B.LJIILL(this, ((C134845Qy.LIZJ(context) / 2) - this.LLI) - this.LLIFFJFJJ, getPaddingTop(), 0, getPaddingBottom());
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("reload! size = ");
        LIZ.append(segments.size());
        C131935Ft.LIZIZ("MultiTrackLayout", X1D.LIZIZ(LIZ));
        this.LJLJI.removeAllViews();
        ((ArrayList) this.LJLJJI).clear();
        ((ArrayList) this.LJLILLLLZI).clear();
        ((ArrayList) this.LJLJJI).addAll(segments);
        Iterator it = ((ArrayList) this.LJLJJI).iterator();
        int i2 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i3 = i2 + 1;
            if (i2 >= 0) {
                NLETrackSlot nLETrackSlot = (NLETrackSlot) next;
                this.LJLJJLL++;
                final C59L c59l = new C59L(getContext());
                c59l.setId(this.LJLJJLL);
                c59l.setShowTips(this.LJLLLLLL);
                c59l.setItemTrackCallback(this.LLIIL);
                c59l.setScrollHandler(this.LLIIJI);
                c59l.setOnDragListener(new C1297457i(this, c59l));
                c59l.setIndex(i2);
                c59l.setDockerTopLevel(this.LJZL);
                ((ArrayList) this.LJLILLLLZI).add(c59l);
                c59l.setFrameViewCallback(new InterfaceC130895Bt() { // from class: X.57q
                    @Override // X.InterfaceC130885Bs
                    public final boolean LIZ() {
                        InterfaceC1298157p interfaceC1298157p = C1297357h.this.LJLJJL;
                        if (interfaceC1298157p != null && interfaceC1298157p.LIZ() && c59l.getStyle() != EnumC127354zD.NONE) {
                            return true;
                        }
                        return false;
                    }

                    @Override // X.InterfaceC130885Bs
                    public final NLETrackSlot LIZIZ() {
                        InterfaceC1298157p interfaceC1298157p = C1297357h.this.LJLJJL;
                        if (interfaceC1298157p != null) {
                            return interfaceC1298157p.LJIIIIZZ();
                        }
                        return null;
                    }

                    @Override // X.InterfaceC130895Bt
                    public final int LJFF() {
                        InterfaceC1298157p interfaceC1298157p = C1297357h.this.LJLJJL;
                        if (interfaceC1298157p != null) {
                            return interfaceC1298157p.LJFF();
                        }
                        return 0;
                    }

                    @Override // X.InterfaceC130895Bt
                    public final boolean LJI() {
                        if (c59l.getStyle() == EnumC127354zD.CLIP || c59l.getStyle() == EnumC127354zD.LINE) {
                            return true;
                        }
                        return false;
                    }
                });
                c59l.setFrameSelectChangeListener(this.LLIIJLIL);
                if (i2 != 0) {
                    j = LIZIZ(i2);
                    NLESegmentTransition LIZLLL = ((NLETrackSlot) ListProtector.get(this.LJLJJI, i2 - 1)).LIZLLL();
                    if (LIZLLL != null && LIZLLL.LJ()) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                } else {
                    j = 0;
                    z2 = false;
                }
                InterfaceC1298157p interfaceC1298157p = this.LJLJJL;
                if (interfaceC1298157p != null) {
                    i = interfaceC1298157p.LJFF();
                } else {
                    i = 0;
                }
                c59l.LJIIIZ(nLETrackSlot, i, j, z2);
                c59l.LJIJ(this.LJZI);
                i2 = i3;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
        C131935Ft.LJ("MultiTrackLayout", "reload! layoutInitItem");
        Iterator it2 = ((ArrayList) this.LJLILLLLZI).iterator();
        int i4 = 0;
        float f2 = 0.0f;
        while (it2.hasNext()) {
            Object next2 = it2.next();
            int i5 = i4 + 1;
            if (i4 >= 0) {
                C59L c59l2 = (C59L) next2;
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, C0EH.LIZ(this.LLFZ, this.LLIFFJFJJ, 2, C1300758p.LIZLLL));
                if (i4 != 0) {
                    c59l2.setStartDivider(r2);
                    if (i4 < ((ArrayList) this.LJLILLLLZI).size() - r2) {
                        c59l2.setEndDivider(r2);
                    }
                    layoutParams.addRule(17, ((View) ListProtector.get(this.LJLILLLLZI, i4 - 1)).getId());
                    f = ((float) LIZIZ(i4)) * C1300758p.LIZIZ();
                    int i6 = (int) (f + f2);
                    float f3 = (f - i6) + f2;
                    if (this.LJLZ) {
                        layoutParams.setMarginStart(((this.LLI * (-2)) - i6) - 8);
                    } else {
                        layoutParams.setMarginStart(((this.LLI * (-2)) - (this.LLIFFJFJJ * 2)) - i6);
                    }
                    c59l2.LJIIL();
                    f2 = f3;
                } else {
                    if (((ArrayList) this.LJLILLLLZI).size() > r2) {
                        c59l2.setEndDivider(r2);
                    }
                    f = 0.0f;
                }
                this.LJLJI.addView(c59l2, layoutParams);
                if (i4 > 0 && this.LLIIIZ) {
                    int i7 = this.LLI + this.LLIFFJFJJ;
                    int i8 = (int) (f / 2);
                    View view = new View(getContext());
                    int LIZ2 = C134845Qy.LIZ(3.0f);
                    RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(LIZ2, C134845Qy.LIZ(50.0f));
                    layoutParams2.addRule(18, c59l2.getId());
                    layoutParams2.setMarginStart((i7 + i8) - (LIZ2 / 2));
                    layoutParams2.addRule(15);
                    view.setLayoutParams(layoutParams2);
                    Integer num = C1291054w.LJ().LIZIZ.LJ;
                    if (num != null) {
                        view.setBackgroundColor(num.intValue());
                    }
                    int i9 = this.LLI + this.LLIFFJFJJ + i8;
                    if (((NLETrackSlot) ListProtector.get(this.LJLJJI, i4 - 1)).LIZLLL() != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    ImageView imageView = new ImageView(getContext());
                    Integer num2 = C1291054w.LJ().LIZIZ.LIZ;
                    if (num2 != null) {
                        dimension = num2.intValue();
                    } else {
                        dimension = (int) imageView.getResources().getDimension(R.dimen.a98);
                    }
                    RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(dimension, dimension);
                    layoutParams3.addRule(18, c59l2.getId());
                    layoutParams3.setMarginStart(i9 - (dimension / 2));
                    layoutParams3.addRule(15);
                    imageView.setLayoutParams(layoutParams3);
                    imageView.setScaleType(ImageView.ScaleType.CENTER);
                    Drawable drawable = C1291054w.LJ().LIZIZ.LIZJ;
                    if (drawable == null) {
                        drawable = imageView.getContext().getDrawable(R.drawable.awh);
                    }
                    if (z && (drawable = C1291054w.LJ().LIZIZ.LIZLLL) == null) {
                        drawable = imageView.getContext().getDrawable(R.drawable.b5k);
                    }
                    Drawable drawable2 = C1291054w.LJ().LIZIZ.LIZIZ;
                    if (drawable2 != null) {
                        imageView.setBackground(drawable2);
                    }
                    imageView.setImageDrawable(drawable);
                    this.LJLJI.addView(view);
                    this.LJLJI.addView(imageView);
                    boolean z3 = this.LLIIIILZ;
                    C16880lQ.LJIILLIIL(imageView, new ACListenerS22S0100000_2(c59l2, 21));
                    c59l2.LLIIJLIL = imageView;
                    imageView.setClickable(z3);
                    c59l2.setTransitionHighlightView(view);
                    c59l2.LJIILJJIL(false);
                    if (i4 == 1) {
                        this.LLIIIL = imageView;
                    }
                }
                r2 = 1;
                i4 = i5;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
        setSelectSlotStyle(this.LJLLJ);
        int i10 = this.LJLLI;
        if (i10 != -1 && LJ(i10)) {
            ((C59L) ListProtector.get(this.LJLILLLLZI, this.LJLLI)).LJIILJJIL(r2);
            Iterator it3 = ((ArrayList) this.LJLILLLLZI).iterator();
            while (it3.hasNext()) {
                ((View) it3.next()).setAlpha(0.34f);
            }
        }
        setEpilogueEnable(true);
    }

    public final boolean LJ(int i) {
        if ((!this.LJLJJI.isEmpty()) && (!this.LJLILLLLZI.isEmpty()) && i >= 0 && i < ((ArrayList) this.LJLILLLLZI).size()) {
            return true;
        }
        return false;
    }

    public final void setDockerTopLevel(InterfaceC65784Pro<Boolean> interfaceC65784Pro) {
        this.LJZL = interfaceC65784Pro;
    }

    public final void setEnableTransition$editor_trackpanel_release(boolean z) {
        this.LLIIIZ = z;
    }

    public final void setFirstTransitionView$editor_trackpanel_release(ImageView imageView) {
        this.LLIIIL = imageView;
    }

    public final void setIsCoverMode(boolean z) {
        this.LJLZ = z;
    }

    public final void setItemFrameAlpha(float f) {
        Iterator<C59L> it = this.LJLILLLLZI.iterator();
        while (it.hasNext()) {
            it.next().setAlpha(f);
        }
    }

    public final void setLongClickEnable(boolean z) {
        this.LJLLL = z;
    }

    public final void setMultiTrackListener(InterfaceC1298157p listener) {
        o.LJIIIZ(listener, "listener");
        this.LJLJJL = listener;
    }

    public final void setMuteIcon(boolean z) {
        Iterator<C59L> it = this.LJLILLLLZI.iterator();
        while (it.hasNext()) {
            it.next().setMuteIcon(z);
        }
    }

    public final void setPreviewFullScreen(InterfaceC65784Pro<Boolean> interfaceC65784Pro) {
        o.LJIIIZ(interfaceC65784Pro, "<set-?>");
        this.LL = interfaceC65784Pro;
    }

    public final void setScaleSize(double d) {
        int i;
        int dimension;
        this.LJZ = d;
        Iterator it = ((ArrayList) this.LJLILLLLZI).iterator();
        int i2 = 0;
        float f = 0.0f;
        while (it.hasNext()) {
            Object next = it.next();
            int i3 = i2 + 1;
            if (i2 >= 0) {
                C59L c59l = (C59L) next;
                c59l.LJIILIIL();
                if (i2 != 0) {
                    ViewGroup.LayoutParams layoutParams = c59l.getLayoutParams();
                    o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    NLESegmentTransition LIZLLL = ((NLETrackSlot) ListProtector.get(this.LJLJJI, i2 - 1)).LIZLLL();
                    if (LIZLLL != null && LIZLLL.LJ() && 1 != 0) {
                        float LIZIZ = C1300758p.LIZIZ() * ((float) LIZIZ(i2));
                        i = (int) (LIZIZ + f);
                        float f2 = (LIZIZ - i) + f;
                        ImageView transition = c59l.getTransition();
                        if (transition != null) {
                            ViewGroup.LayoutParams layoutParams2 = transition.getLayoutParams();
                            o.LJII(layoutParams2, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                            Integer num = C1291054w.LJ().LIZIZ.LIZ;
                            if (num != null) {
                                dimension = num.intValue();
                            } else {
                                dimension = (int) getResources().getDimension(R.dimen.a98);
                            }
                            marginLayoutParams2.setMarginStart((int) (((LIZIZ / 2) + (this.LLI + this.LLIFFJFJJ)) - (dimension / 2)));
                        }
                        View transitionHighlight = c59l.getTransitionHighlight();
                        if (transitionHighlight != null) {
                            ViewGroup.LayoutParams layoutParams3 = transitionHighlight.getLayoutParams();
                            o.LJII(layoutParams3, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                            int LIZ = C134845Qy.LIZ(3.0f);
                            ((ViewGroup.MarginLayoutParams) layoutParams3).setMarginStart((int) (((LIZIZ / 2) + (this.LLI + this.LLIFFJFJJ)) - (LIZ / 2)));
                        }
                        f = f2;
                    } else {
                        i = 0;
                    }
                    marginLayoutParams.setMarginStart(((this.LLI * (-2)) - i) - (this.LLIFFJFJJ * 2));
                }
                i2 = i3;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
    }

    public final void setSelectSlotStyle(EnumC127354zD style) {
        o.LJIIIZ(style, "style");
        int i = this.LJLLILLLL;
        if (!LJ(i)) {
            return;
        }
        int i2 = C127364zE.LIZ[style.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    return;
                }
                setNormalType(Integer.valueOf(i));
                return;
            }
            LJI(i, false);
            return;
        }
        setLineType(i);
    }

    public final void setSelectedTrackStyle(EnumC127354zD value) {
        o.LJIIIZ(value, "value");
        this.LJLLJ = value;
    }

    public final void setSlotClickEnable(boolean z) {
        this.LJLLLL = z;
    }

    public final void LJI(int i, boolean z) {
        if (!LJ(i)) {
            return;
        }
        ((C59L) ListProtector.get(this.LJLILLLLZI, i)).setClipType(z);
        Iterator<C59L> it = this.LJLILLLLZI.iterator();
        while (it.hasNext()) {
            it.next().LJI(true);
        }
        int i2 = i + 1;
        if (LJ(i2)) {
            ((C59L) ListProtector.get(this.LJLILLLLZI, i2)).LJI(false);
        }
        ((C59L) ListProtector.get(this.LJLILLLLZI, i)).LJI(false);
        if (i > 0) {
            ((C59L) ListProtector.get(this.LJLILLLLZI, i - 1)).setDrawMyTransitionOverlap(false);
        }
        if (i < ((ArrayList) this.LJLILLLLZI).size() - 1) {
            ((C59L) ListProtector.get(this.LJLILLLLZI, i2)).setDrawPreTransitionOverlap(false);
        }
        this.LJLLJ = EnumC127354zD.CLIP;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r0v25, types: [X.57v] */
    /* JADX WARN: Type inference failed for: r0v26, types: [X.57s] */
    /* JADX WARN: Type inference failed for: r0v27, types: [X.57j] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1297357h(android.content.Context r6, android.util.AttributeSet r7, int r8) {
        /*
            r5 = this;
            r4 = 2
            r0 = r8 & 2
            if (r0 == 0) goto L6
            r7 = 0
        L6:
            java.lang.String r0 = "context"
            defpackage.a1.LJFF(r6, r0)
            r0 = 0
            r5.<init>(r6, r7, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r5.LJLILLLLZI = r0
            r5.LJLJI = r5
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r5.LJLJJI = r0
            r0 = 1001(0x3e9, float:1.403E-42)
            r5.LJLJJLL = r0
            int r0 = X.C134845Qy.LIZJ(r6)
            r5.LJLJL = r0
            android.widget.ImageView r0 = new android.widget.ImageView
            r0.<init>(r6)
            r5.LJLJLJ = r0
            r0 = -1
            r5.LJLLI = r0
            r5.LJLLILLLL = r0
            X.4zD r0 = X.EnumC127354zD.NONE
            r5.LJLLJ = r0
            r2 = 1
            r5.LJLLL = r2
            r5.LJLLLL = r2
            r5.LJLLLLLL = r2
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r5.LJZ = r0
            X.58K r3 = new X.58K
            r3.<init>()
            r0 = 200(0xc8, double:9.9E-322)
            r3.setDuration(r0)
            float[] r0 = new float[r4]
            r0 = {x00b4: FILL_ARRAY_DATA , data: [0, 1065353216} // fill-array
            r3.setFloatValues(r0)
            r5.LLD = r3
            kotlin.jvm.internal.AqS152S0100000_2 r1 = new kotlin.jvm.internal.AqS152S0100000_2
            r0 = 631(0x277, float:8.84E-43)
            r1.<init>(r6, r0)
            X.Ol8 r0 = X.C221108m2.LIZIZ(r1)
            r5.LLF = r0
            X.55L r0 = X.C55L.LJLIL
            X.Ol8 r0 = X.C221108m2.LIZIZ(r0)
            r5.LLFF = r0
            X.58G r0 = X.C1291054w.LJ()
            X.59k r1 = r0.LIZ
            int r0 = r1.LJI
            r5.LLFZ = r0
            int r0 = r1.LJFF
            r5.LLI = r0
            int r0 = r1.LJII
            r5.LLIFFJFJJ = r0
            kotlin.jvm.internal.AqS152S0100000_2 r1 = new kotlin.jvm.internal.AqS152S0100000_2
            r0 = 632(0x278, float:8.86E-43)
            r1.<init>(r5, r0)
            X.Ol8 r0 = X.C221108m2.LIZIZ(r1)
            r5.LLII = r0
            r5.LLIIII = r2
            r5.LLIIIILZ = r2
            kotlin.jvm.internal.AqS149S0200000_2 r1 = new kotlin.jvm.internal.AqS149S0200000_2
            r0 = 66
            r1.<init>(r5, r6, r0)
            X.Ol8 r0 = X.C221108m2.LIZIZ(r1)
            r5.LLIIIJ = r0
            X.57v r0 = new X.57v
            r0.<init>()
            r5.LLIIJI = r0
            X.57s r0 = new X.57s
            r0.<init>()
            r5.LLIIJLIL = r0
            X.57j r0 = new X.57j
            r0.<init>()
            r5.LLIIL = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1297357h.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public final void LJFF(int i, EnumC127354zD style, boolean z) {
        o.LJIIIZ(style, "style");
        if (!LJ(i)) {
            return;
        }
        int i2 = this.LJLLILLLL;
        if (i2 != i) {
            setNormalType(Integer.valueOf(i2));
        }
        int i3 = C127364zE.LIZ[style.ordinal()];
        if (i3 != 1) {
            if (i3 == 2) {
                LJI(i, z);
            }
        } else {
            setLineType(i);
        }
        this.LJLLILLLL = i;
    }
}
