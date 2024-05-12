package X;

import Y.ARunnableS21S0200000_2;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegmentTransition;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS152S0100000_2;
import ujb.o;

/* renamed from: X.57l, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1297757l extends RelativeLayout {
    public final List<C59L> LJLIL;
    public final C1297757l LJLILLLLZI;
    public final List<NLETrackSlot> LJLJI;
    public InterfaceC1298157p LJLJJI;
    public int LJLJJL;
    public final int LJLJJLL;
    public final ImageView LJLJL;
    public boolean LJLJLJ;
    public int LJLJLLL;
    public int LJLL;
    public EnumC127354zD LJLLI;
    public boolean LJLLILLLL;
    public boolean LJLLJ;
    public double LJLLL;
    public int LJLLLL;
    public InterfaceC65784Pro<Boolean> LJLLLLLL;
    public InterfaceC65784Pro<Boolean> LJLZ;
    public final ValueAnimator LJZ;
    public InterfaceC1299057y LJZI;
    public InterfaceC1298857w LJZL;
    public final int LL;
    public final int LLD;
    public C5B1 LLF;
    public ImageView LLFF;
    public final C62822Ol8 LLFFF;
    public final C62822Ol8 LLFII;
    public final C1298957x LLFZ;
    public final C1298657u LLI;
    public final C1297657k LLIFFJFJJ;

    public final void setSelectAgainToRoot(boolean z) {
    }

    public final InterfaceC1283852c getHapticFeedback() {
        return (InterfaceC1283852c) this.LLFII.getValue();
    }

    public final NLETrackSlot getSelectedSegment() {
        if (LIZJ(this.LJLL)) {
            return (NLETrackSlot) ListProtector.get(this.LJLJI, this.LJLL);
        }
        return null;
    }

    public final Bitmap getThumbnailMaskBitmap() {
        return (Bitmap) this.LLFFF.getValue();
    }

    private final int getSelectedIndex() {
        NLETrackSlot selectedSegment = getSelectedSegment();
        if (selectedSegment == null) {
            return -1;
        }
        Iterator it = ((ArrayList) this.LJLJI).iterator();
        int i = 0;
        while (it.hasNext()) {
            if (((NLENode) it.next()).getId() == selectedSegment.getId()) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public final int getMyScrollX() {
        return this.LJLLLL;
    }

    public final double getScale() {
        return this.LJLLL;
    }

    public final int getSelectIndex() {
        return this.LJLL;
    }

    public final EnumC127354zD getSelectedTrackStyle() {
        return this.LJLLI;
    }

    private final void setEpilogueEnable(boolean z) {
        C59L c59l;
        if (LIZJ(((ArrayList) this.LJLIL).size() - 2)) {
            ((C59L) ListProtector.get(this.LJLIL, ((ArrayList) r1).size() - 2)).setDrawMyTransitionOverlap(z);
            if (z) {
                Iterator<C59L> it = this.LJLIL.iterator();
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
                    if (this.LJLLI == EnumC127354zD.LINE) {
                        return;
                    }
                    c59l2.LJI(z);
                }
            }
        }
    }

    public final long LIZ(int i) {
        String str;
        NLESegmentTransition LIZLLL;
        NLEResourceNode LIZLLL2;
        NLETrackSlot nLETrackSlot = (NLETrackSlot) ListProtector.get(this.LJLJI, i - 1);
        NLESegmentTransition LIZLLL3 = nLETrackSlot.LIZLLL();
        if (LIZLLL3 == null || (LIZLLL2 = LIZLLL3.LIZLLL()) == null || (str = LIZLLL2.LIZJ()) == null) {
            str = "";
        }
        long j = 0;
        if (!(!o.LJJJJJL(str)) || (LIZLLL = nLETrackSlot.LIZLLL()) == null || !LIZLLL.LJ()) {
            return 0L;
        }
        NLESegmentTransition LIZLLL4 = nLETrackSlot.LIZLLL();
        if (LIZLLL4 != null) {
            j = LIZLLL4.LJFF();
        }
        return j / 1000;
    }

    public final void LIZIZ(VecNLETrackSlotSPtr vecNLETrackSlotSPtr) {
        int i;
        int i2 = 0;
        if (!this.LJLJLJ) {
            setClipChildren(false);
            this.LJLJLJ = true;
        }
        Context context = getContext();
        kotlin.jvm.internal.o.LJIIIIZZ(context, "context");
        V2B.LJIILL(this, ((C134845Qy.LIZJ(context) / 2) - this.LL) - this.LLD, getPaddingTop(), 0, getPaddingBottom());
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("reload! size = ");
        LIZ.append(vecNLETrackSlotSPtr.size());
        C131935Ft.LJ("MultiCustomTrackLayout", X1D.LIZIZ(LIZ));
        this.LJLILLLLZI.removeAllViews();
        ((ArrayList) this.LJLJI).clear();
        ((ArrayList) this.LJLIL).clear();
        ((ArrayList) this.LJLJI).addAll(vecNLETrackSlotSPtr);
        Iterator it = ((ArrayList) this.LJLJI).iterator();
        int i3 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i4 = i3 + 1;
            if (i3 >= 0) {
                NLETrackSlot nLETrackSlot = (NLETrackSlot) next;
                this.LJLJJL++;
                StringBuilder LJ = C7MY.LJ("reload! index = ", i3, ", segment = ");
                LJ.append(nLETrackSlot.toJsonString());
                C131935Ft.LJ("MultiCustomTrackLayout", X1D.LIZIZ(LJ));
                final C59L c59l = new C59L(getContext());
                c59l.setId(this.LJLJJL);
                c59l.setShowTips(false);
                c59l.setItemTrackCallback(this.LLIFFJFJJ);
                c59l.setScrollHandler(this.LLFZ);
                c59l.setOnDragListener(new C1297857m(this, c59l));
                c59l.setIndex(i3);
                c59l.setDockerTopLevel(this.LJLLLLLL);
                ((ArrayList) this.LJLIL).add(c59l);
                c59l.setFrameViewCallback(new InterfaceC130895Bt() { // from class: X.57r
                    @Override // X.InterfaceC130885Bs
                    public final boolean LIZ() {
                        InterfaceC1298157p interfaceC1298157p = C1297757l.this.LJLJJI;
                        if (interfaceC1298157p != null && interfaceC1298157p.LIZ() && c59l.getStyle() != EnumC127354zD.NONE) {
                            return true;
                        }
                        return false;
                    }

                    @Override // X.InterfaceC130885Bs
                    public final NLETrackSlot LIZIZ() {
                        InterfaceC1298157p interfaceC1298157p = C1297757l.this.LJLJJI;
                        if (interfaceC1298157p != null) {
                            return interfaceC1298157p.LJIIIIZZ();
                        }
                        return null;
                    }

                    @Override // X.InterfaceC130895Bt
                    public final int LJFF() {
                        InterfaceC1298157p interfaceC1298157p = C1297757l.this.LJLJJI;
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
                c59l.setFrameSelectChangeListener(this.LLI);
                if (i3 != 0) {
                    LIZ(i3);
                }
                InterfaceC1298157p interfaceC1298157p = this.LJLJJI;
                if (interfaceC1298157p != null) {
                    i = interfaceC1298157p.LJFF();
                } else {
                    i = 0;
                }
                c59l.LJIIIZ(nLETrackSlot, i, 0L, false);
                if (c59l.getDuration() <= 1000) {
                    c59l.post(new ARunnableS21S0200000_2(c59l, this, 3));
                }
                i3 = i4;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
        C131935Ft.LJ("MultiCustomTrackLayout", "reload! layoutInitItem");
        Iterator it2 = ((ArrayList) this.LJLIL).iterator();
        float f = 0.0f;
        while (it2.hasNext()) {
            Object next2 = it2.next();
            int i5 = i2 + 1;
            if (i2 >= 0) {
                C59L c59l2 = (C59L) next2;
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, getResources().getDimensionPixelSize(R.dimen.a96));
                if (i2 != 0) {
                    layoutParams.addRule(1, ((View) ListProtector.get(this.LJLIL, i2 - 1)).getId());
                    float LIZ2 = ((float) LIZ(i2)) * C1300758p.LIZIZ();
                    int i6 = (int) (LIZ2 + f);
                    layoutParams.setMarginStart(((this.LL * (-2)) - (this.LLD * 2)) - i6);
                    c59l2.LJIIL();
                    f = (LIZ2 - i6) + f;
                }
                this.LJLILLLLZI.addView(c59l2, layoutParams);
                i2 = i5;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
        int i7 = this.LJLL;
        if (LIZJ(i7)) {
            LIZLLL(i7, this.LJLLI);
        }
        setEpilogueEnable(true);
    }

    public final boolean LIZJ(int i) {
        if ((!this.LJLJI.isEmpty()) && (!this.LJLIL.isEmpty()) && i >= 0 && i < ((ArrayList) this.LJLIL).size()) {
            return true;
        }
        return false;
    }

    public final void setDockerTopLevel(InterfaceC65784Pro<Boolean> interfaceC65784Pro) {
        this.LJLLLLLL = interfaceC65784Pro;
    }

    public final void setLineType(int i) {
        if (!LIZJ(i)) {
            return;
        }
        ((C59L) ListProtector.get(this.LJLIL, i)).LJIIJJI();
        Iterator<C59L> it = this.LJLIL.iterator();
        while (it.hasNext()) {
            it.next().LJI(true);
        }
        if (i > 0) {
            ((C59L) ListProtector.get(this.LJLIL, i - 1)).setDrawMyTransitionOverlap(false);
        }
        if (i < ((ArrayList) this.LJLIL).size() - 1) {
            ((C59L) ListProtector.get(this.LJLIL, i + 1)).setDrawPreTransitionOverlap(false);
        }
        this.LJLLI = EnumC127354zD.LINE;
    }

    public final void setLongClickEnable(boolean z) {
        this.LJLLILLLL = z;
    }

    public final void setMultiTrackListener(InterfaceC1298157p listener) {
        kotlin.jvm.internal.o.LJIIIZ(listener, "listener");
        this.LJLJJI = listener;
    }

    public final void setMuteIcon(boolean z) {
        Iterator<C59L> it = this.LJLIL.iterator();
        while (it.hasNext()) {
            it.next().setMuteIcon(z);
        }
    }

    public final void setNormalType(Integer num) {
        int selectedIndex;
        if (num != null) {
            selectedIndex = num.intValue();
        } else {
            selectedIndex = getSelectedIndex();
        }
        if (!LIZJ(selectedIndex)) {
            return;
        }
        ((C59L) ListProtector.get(this.LJLIL, selectedIndex)).LJIIL();
        if (selectedIndex > 0) {
            ((C59L) ListProtector.get(this.LJLIL, selectedIndex - 1)).setDrawMyTransitionOverlap(true);
        }
        if (selectedIndex < ((ArrayList) this.LJLIL).size() - 1) {
            ((C59L) ListProtector.get(this.LJLIL, selectedIndex + 1)).setDrawPreTransitionOverlap(true);
        }
        Iterator<C59L> it = this.LJLIL.iterator();
        while (it.hasNext()) {
            it.next().LJI(true);
        }
        this.LJLLI = EnumC127354zD.NONE;
    }

    public final void setPreviewFullScreen(InterfaceC65784Pro<Boolean> interfaceC65784Pro) {
        kotlin.jvm.internal.o.LJIIIZ(interfaceC65784Pro, "<set-?>");
        this.LJLZ = interfaceC65784Pro;
    }

    public final void setScaleSize(double d) {
        int i;
        this.LJLLL = d;
        Iterator it = ((ArrayList) this.LJLIL).iterator();
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
                    kotlin.jvm.internal.o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    NLESegmentTransition LIZLLL = ((NLETrackSlot) ListProtector.get(this.LJLJI, i2 - 1)).LIZLLL();
                    if (LIZLLL != null && LIZLLL.LJ()) {
                        float LIZIZ = C1300758p.LIZIZ() * ((float) LIZ(i2));
                        i = (int) (LIZIZ + f);
                        f += LIZIZ - i;
                    } else {
                        i = 0;
                    }
                    marginLayoutParams.setMarginStart(((this.LL * (-2)) - i) - (this.LLD * 2));
                }
                i2 = i3;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
    }

    public final void setSelectedTrackStyle(EnumC127354zD value) {
        kotlin.jvm.internal.o.LJIIIZ(value, "value");
        this.LJLLI = value;
    }

    public final void setSlotClickEnable(boolean z) {
        this.LJLLJ = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v22, types: [X.57x] */
    /* JADX WARN: Type inference failed for: r0v23, types: [X.57u] */
    public C1297757l(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        this.LJLIL = new ArrayList();
        this.LJLILLLLZI = this;
        this.LJLJI = new ArrayList();
        this.LJLJJL = 1001;
        this.LJLJJLL = C134845Qy.LIZJ(context);
        this.LJLJL = new ImageView(context);
        this.LJLJLLL = -1;
        this.LJLL = -1;
        this.LJLLI = EnumC127354zD.NONE;
        this.LJLLILLLL = true;
        this.LJLLJ = true;
        this.LJLLL = 1.0d;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(200L);
        this.LJZ = ofFloat;
        this.LL = getResources().getDimensionPixelSize(R.dimen.a95);
        this.LLD = getResources().getDimensionPixelSize(R.dimen.a99);
        this.LLFFF = C221108m2.LIZIZ(new AqS152S0100000_2(this, 50));
        this.LLFII = C221108m2.LIZIZ(C56Z.LJLIL);
        this.LLFZ = new C59H() { // from class: X.57x
            @Override // X.C59H
            public final void LJJIIZI(int i) {
            }

            @Override // X.C59H
            public final void LJJJJJ(int i, boolean z) {
                InterfaceC1298157p interfaceC1298157p = C1297757l.this.LJLJJI;
                if (interfaceC1298157p != null) {
                    interfaceC1298157p.LJJJJJ(i, true);
                }
            }

            @Override // X.C59H
            public final void LIZLLL(boolean z, boolean z2, int i, int i2, boolean z3) {
                InterfaceC1298157p interfaceC1298157p = C1297757l.this.LJLJJI;
                if (interfaceC1298157p != null) {
                    interfaceC1298157p.LIZLLL(z, z2, i, i2, z3);
                }
            }
        };
        this.LLI = new InterfaceC130925Bw() { // from class: X.57u
            @Override // X.InterfaceC130925Bw
            public final void LIZJ() {
                InterfaceC1298157p interfaceC1298157p = C1297757l.this.LJLJJI;
                if (interfaceC1298157p != null) {
                    interfaceC1298157p.LJJJJL();
                }
            }

            @Override // X.InterfaceC130925Bw
            public final void LIZ(NLETrackSlot nLETrackSlot) {
                InterfaceC1298157p interfaceC1298157p = C1297757l.this.LJLJJI;
                if (interfaceC1298157p != null) {
                    interfaceC1298157p.LJJJ(nLETrackSlot);
                }
            }

            @Override // X.InterfaceC130925Bw
            public final void LIZIZ(long j) {
                InterfaceC1298157p interfaceC1298157p = C1297757l.this.LJLJJI;
                if (interfaceC1298157p != null) {
                    interfaceC1298157p.LJJJIL(j);
                }
            }
        };
        this.LLIFFJFJJ = new C1297657k(this);
    }

    public static void LJ(C1297757l c1297757l, int i) {
        if (!c1297757l.LIZJ(i)) {
            return;
        }
        ((C59L) ListProtector.get(c1297757l.LJLIL, i)).setClipType(false);
        Iterator it = ((ArrayList) c1297757l.LJLIL).iterator();
        while (it.hasNext()) {
            ((C59L) it.next()).LJI(true);
        }
        int i2 = i + 1;
        if (c1297757l.LIZJ(i2)) {
            ((C59L) ListProtector.get(c1297757l.LJLIL, i2)).LJI(false);
        }
        ((C59L) ListProtector.get(c1297757l.LJLIL, i)).LJI(false);
        if (i > 0) {
            ((C59L) ListProtector.get(c1297757l.LJLIL, i - 1)).setDrawMyTransitionOverlap(false);
        }
        if (i < ((ArrayList) c1297757l.LJLIL).size() - 1) {
            ((C59L) ListProtector.get(c1297757l.LJLIL, i2)).setDrawPreTransitionOverlap(false);
        }
        c1297757l.LJLLI = EnumC127354zD.CLIP;
    }

    public final void LIZLLL(int i, EnumC127354zD style) {
        kotlin.jvm.internal.o.LJIIIZ(style, "style");
        if (!LIZJ(i)) {
            return;
        }
        int i2 = this.LJLL;
        if (i2 != i) {
            setNormalType(Integer.valueOf(i2));
        }
        int i3 = C127374zF.LIZ[style.ordinal()];
        if (i3 != 1) {
            if (i3 == 2) {
                LJ(this, i);
            }
        } else {
            setLineType(i);
        }
        this.LJLL = i;
    }
}
