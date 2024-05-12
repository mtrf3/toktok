package X;

import Y.ACListenerS34S0100000_14;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.Vst, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81139Vst extends ConstraintLayout {
    public C270714l LJLIL;
    public ViewGroup LJLILLLLZI;
    public ViewGroup LJLJI;
    public View LJLJJI;
    public View LJLJJL;
    public int LJLJJLL;
    public String LJLJL;
    public String LJLJLJ;
    public String LJLJLLL;
    public int LJLL;
    public int LJLLI;
    public int LJLLILLLL;
    public int LJLLJ;
    public float LJLLL;
    public float LJLLLL;
    public final float LJLLLLLL;
    public final float LJLZ;
    public InterfaceC81141Vsv LJZ;
    public boolean LJZI;
    public boolean LJZL;
    public float LL;
    public int LLD;
    public final C81140Vsu LLF;
    public boolean LLFF;

    public final void LJJLJLI() {
        C270714l c270714l = this.LJLIL;
        if (c270714l != null) {
            ViewGroup viewGroup = this.LJLILLLLZI;
            if (viewGroup != null) {
                if (c270714l.LJIJJLI(getPaddingLeft(), getHeight() - this.LJLL, viewGroup)) {
                    C16300kU.LJIIJ(this);
                    return;
                }
                return;
            }
            o.LJIJI("dragBarContainer");
            throw null;
        }
        o.LJIJI("dragHelper");
        throw null;
    }

    public final void LJJLL() {
        C270714l c270714l = this.LJLIL;
        if (c270714l != null) {
            ViewGroup viewGroup = this.LJLILLLLZI;
            if (viewGroup != null) {
                if (c270714l.LJIJJLI(getPaddingLeft(), getHeight() - this.LJLLI, viewGroup)) {
                    C16300kU.LJIIJ(this);
                    return;
                }
                return;
            }
            o.LJIJI("dragBarContainer");
            throw null;
        }
        o.LJIJI("dragHelper");
        throw null;
    }

    @Override // android.view.View
    public final void computeScroll() {
        C270714l c270714l = this.LJLIL;
        if (c270714l != null) {
            if (c270714l.LJIIIIZZ()) {
                C16300kU.LJIIJ(this);
            }
            int height = getHeight();
            ViewGroup viewGroup = this.LJLILLLLZI;
            if (viewGroup != null) {
                int top = height - viewGroup.getTop();
                if (top == this.LJLLI) {
                    LJJZ("STATE_TOP");
                    return;
                } else if (top == this.LJLL) {
                    LJJZ("STATE_BOTTOM");
                    return;
                } else {
                    LJJZ("STATE_DRAG");
                    return;
                }
            }
            o.LJIJI("dragBarContainer");
            throw null;
        }
        o.LJIJI("dragHelper");
        throw null;
    }

    public final ViewGroup getDragSheetContentContainer() {
        ViewGroup viewGroup = this.LJLJI;
        if (viewGroup != null) {
            return viewGroup;
        }
        o.LJIJI("dragContentContainer");
        throw null;
    }

    public final int getDragSheetContentContainerBottomLimitHeight$nearby_release() {
        int i = this.LJLL;
        ViewGroup viewGroup = this.LJLILLLLZI;
        if (viewGroup != null) {
            return i - viewGroup.getHeight();
        }
        o.LJIJI("dragBarContainer");
        throw null;
    }

    public final int getDragSheetContentContainerTopLimitHeight$nearby_release() {
        int i = this.LJLLI;
        ViewGroup viewGroup = this.LJLILLLLZI;
        if (viewGroup != null) {
            return i - viewGroup.getHeight();
        }
        o.LJIJI("dragBarContainer");
        throw null;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        InterfaceC59973NgH find$default;
        C61674OIk groups;
        C59258NNm LJII;
        String str;
        String str2;
        super.onFinishInflate();
        Object LLILL = C16880lQ.LLILL(getContext(), "layout_inflater");
        o.LJII(LLILL, "null cannot be cast to non-null type android.view.LayoutInflater");
        View LLLLIILL = C16880lQ.LLLLIILL((LayoutInflater) LLILL, R.layout.bwa, this, false);
        View findViewById = LLLLIILL.findViewById(R.id.g2z);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.ll_drag_sheet_drag_bar)");
        this.LJLILLLLZI = (ViewGroup) findViewById;
        View findViewById2 = LLLLIILL.findViewById(R.id.g2y);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.ll_drag_sheet_content_view)");
        this.LJLJI = (ViewGroup) findViewById2;
        View findViewById3 = LLLLIILL.findViewById(R.id.ch0);
        o.LJIIIIZZ(findViewById3, "view.findViewById(R.id.drag_sheet_black_overlay)");
        this.LJLJJI = findViewById3;
        ViewGroup viewGroup = this.LJLILLLLZI;
        if (viewGroup != null) {
            ViewParent parent = viewGroup.getParent();
            o.LJII(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ((ViewGroup) parent).removeAllViews();
            View view = this.LJLJJI;
            if (view != null) {
                addView(view);
                ViewGroup viewGroup2 = this.LJLILLLLZI;
                if (viewGroup2 != null) {
                    addView(viewGroup2);
                    ViewGroup viewGroup3 = this.LJLJI;
                    if (viewGroup3 != null) {
                        addView(viewGroup3);
                        View childAt = getChildAt(0);
                        o.LJIIIIZZ(childAt, "getChildAt(0)");
                        this.LJLJJL = childAt;
                        View view2 = this.LJLJJI;
                        if (view2 != null) {
                            C16880lQ.LJIIJ(new ACListenerS34S0100000_14(this, 95), view2);
                            C51556KLg.LIZ.getClass();
                            String LJIJJLI = C51556KLg.LIZ().LJIJJLI("poi_discover_map_mode");
                            if (C78685UuP.LJJJZ(LJIJJLI) && LJIJJLI != null) {
                                OJD ojd = new OJD("tabbar_height=([^&]*)");
                                if (ojd.containsMatchIn(LJIJJLI) && (find$default = OJD.find$default(ojd, LJIJJLI, 0, 2, null)) != null && (groups = find$default.getGroups()) != null && (LJII = groups.LJII(0)) != null && (str = LJII.LJLIL) != null && (str2 = (String) ListProtector.get(s.LJLJJL(str, new String[]{"="}, 0, 6), 1)) != null) {
                                    this.LLD = C63081OpJ.LJIJJLI(getContext(), CastFloatProtector.parseFloat(str2));
                                }
                            }
                            ViewGroup viewGroup4 = this.LJLJI;
                            if (viewGroup4 != null) {
                                ViewGroup.LayoutParams layoutParams = viewGroup4.getLayoutParams();
                                o.LJII(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                                ((C018905p) layoutParams).verticalWeight = this.LJLLL;
                                this.LJLIL = C270714l.LJIIIZ(this, this.LLF);
                                return;
                            }
                            o.LJIJI("dragContentContainer");
                            throw null;
                        }
                        o.LJIJI("overlay");
                        throw null;
                    }
                    o.LJIJI("dragContentContainer");
                    throw null;
                }
                o.LJIJI("dragBarContainer");
                throw null;
            }
            o.LJIJI("overlay");
            throw null;
        }
        o.LJIJI("dragBarContainer");
        throw null;
    }

    public final void LJJZ(String str) {
        int hashCode = str.hashCode();
        if (hashCode != 286601282) {
            if (hashCode != 486477241) {
                if (hashCode != 701997159 || !str.equals("STATE_TOP")) {
                    return;
                }
                AqS164S0100000_14 aqS164S0100000_14 = new AqS164S0100000_14(this, 126);
                if (o.LJ(this.LJLJL, "STATE_TOP")) {
                    return;
                }
                this.LJLJL = "STATE_TOP";
                aqS164S0100000_14.invoke();
                return;
            }
            if (!str.equals("STATE_BOTTOM")) {
                return;
            }
            AqS164S0100000_14 aqS164S0100000_142 = new AqS164S0100000_14(this, 127);
            if (o.LJ(this.LJLJL, "STATE_BOTTOM")) {
                return;
            }
            this.LJLJL = "STATE_BOTTOM";
            aqS164S0100000_142.invoke();
            return;
        }
        if (!str.equals("STATE_DRAG")) {
            return;
        }
        if (o.LJ(this.LJLJLJ, "STATE_DRAG")) {
            this.LJLJLJ = this.LJLJL;
        }
        AqS164S0100000_14 aqS164S0100000_143 = new AqS164S0100000_14(this, 128);
        if (o.LJ(this.LJLJL, "STATE_DRAG")) {
            return;
        }
        this.LJLJL = "STATE_DRAG";
        aqS164S0100000_143.invoke();
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b6  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r10) {
        /*
            r9 = this;
            java.lang.String r0 = "ev"
            kotlin.jvm.internal.o.LJIIIZ(r10, r0)
            float r3 = r10.getY()
            float r8 = r10.getX()
            int r4 = r10.getAction()
            java.lang.String r7 = "dragBarContainer"
            java.lang.String r6 = "dragHelper"
            r2 = 1
            r1 = 0
            r5 = 0
            if (r4 == 0) goto L60
            r0 = 2
            if (r4 == r0) goto L2f
        L1d:
            boolean r0 = r9.LJZI
            if (r0 == 0) goto L2a
            X.14l r0 = r9.LJLIL
            if (r0 == 0) goto Laa
            boolean r0 = r0.LJIJJ(r10)
        L29:
            return r0
        L2a:
            boolean r0 = super.onInterceptTouchEvent(r10)
            goto L29
        L2f:
            boolean r0 = r9.LJZL
            if (r0 == 0) goto L5d
            float r0 = r9.LL
            float r3 = r3 - r0
            float r3 = java.lang.Math.abs(r3)
            android.content.Context r0 = r9.getContext()
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r0)
            int r0 = r0.getScaledTouchSlop()
            float r0 = (float) r0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 <= 0) goto L5b
        L4b:
            r9.LJZI = r2
            if (r2 == 0) goto L1d
            X.14l r2 = r9.LJLIL
            if (r2 == 0) goto Lb2
            android.view.ViewGroup r0 = r9.LJLILLLLZI
            if (r0 == 0) goto Lae
            r2.LIZJ(r1, r0)
            goto L1d
        L5b:
            r2 = 0
            goto L4b
        L5d:
            r9.LJZI = r1
            goto L1d
        L60:
            android.view.ViewGroup r0 = r9.LJLILLLLZI
            if (r0 == 0) goto Lc6
            int r0 = r0.getTop()
            float r0 = (float) r0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 < 0) goto La7
            android.view.ViewGroup r0 = r9.LJLILLLLZI
            if (r0 == 0) goto Lc2
            int r4 = r0.getBottom()
            int r0 = r9.LLD
            int r4 = r4 + r0
            float r0 = (float) r4
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 > 0) goto La7
            android.view.ViewGroup r0 = r9.LJLILLLLZI
            if (r0 == 0) goto Lbe
            int r0 = r0.getLeft()
            float r0 = (float) r0
            int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r0 < 0) goto La7
            android.view.ViewGroup r0 = r9.LJLILLLLZI
            if (r0 == 0) goto Lba
            int r0 = r0.getRight()
            float r0 = (float) r0
            int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r0 > 0) goto La7
            r9.LL = r3
            r9.LJZL = r2
        L9b:
            X.14l r0 = r9.LJLIL
            if (r0 == 0) goto Lb6
            boolean r0 = r0.LJIJJ(r10)
            r9.LJZI = r0
            goto L1d
        La7:
            r9.LJZL = r1
            goto L9b
        Laa:
            kotlin.jvm.internal.o.LJIJI(r6)
            throw r5
        Lae:
            kotlin.jvm.internal.o.LJIJI(r7)
            throw r5
        Lb2:
            kotlin.jvm.internal.o.LJIJI(r6)
            throw r5
        Lb6:
            kotlin.jvm.internal.o.LJIJI(r6)
            throw r5
        Lba:
            kotlin.jvm.internal.o.LJIJI(r7)
            throw r5
        Lbe:
            kotlin.jvm.internal.o.LJIJI(r7)
            throw r5
        Lc2:
            kotlin.jvm.internal.o.LJIJI(r7)
            throw r5
        Lc6:
            kotlin.jvm.internal.o.LJIJI(r7)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C81139Vst.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent event) {
        o.LJIIIZ(event, "event");
        C270714l c270714l = this.LJLIL;
        if (c270714l != null) {
            c270714l.LJIILIIL(event);
            return true;
        }
        o.LJIJI("dragHelper");
        throw null;
    }

    public final void setOnDragListener$nearby_release(InterfaceC81141Vsv listener) {
        o.LJIIIZ(listener, "listener");
        this.LJZ = listener;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C81139Vst(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a1.LJFF(context, "context");
        this.LJLJL = "";
        this.LJLJLJ = "";
        this.LJLJLLL = "bottom";
        this.LJLLLLLL = 0.5f;
        this.LJLZ = 0.5f;
        this.LLD = 121;
        this.LLF = new C81140Vsu(this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.a_x, R.attr.a_y, R.attr.a_z}, 0, 0);
        o.LJIIIIZZ(obtainStyledAttributes, "context.obtainStyledAttr…omSheet, defStyleAttr, 0)");
        this.LJLLL = obtainStyledAttributes.getFloat(2, 0.95f);
        this.LJLLLL = obtainStyledAttributes.getFloat(1, 0.5f);
        String valueOf = String.valueOf(C16880lQ.LLLZLZ(obtainStyledAttributes, 0));
        if (C78685UuP.LJJJZ(valueOf)) {
            this.LJLJLLL = valueOf;
        }
        obtainStyledAttributes.recycle();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        C018905p c018905p;
        super.onMeasure(i, i2);
        if (this.LLFF) {
            return;
        }
        float f = this.LJLLLL;
        if (this.LJLILLLLZI != null) {
            float measuredHeight = (r0.getMeasuredHeight() / getMeasuredHeight()) + f;
            float f2 = this.LJLLLL;
            if (this.LJLILLLLZI != null) {
                float measuredHeight2 = f2 - (r0.getMeasuredHeight() / getMeasuredHeight());
                View view = this.LJLJJL;
                if (view != null) {
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    if ((layoutParams instanceof C018905p) && (c018905p = (C018905p) layoutParams) != null) {
                        c018905p.matchConstraintPercentHeight = measuredHeight;
                        View view2 = this.LJLJJL;
                        if (view2 != null) {
                            view2.setLayoutParams(c018905p);
                        } else {
                            o.LJIJI("mapView");
                            throw null;
                        }
                    }
                    this.LJLLLL = measuredHeight2;
                    this.LJLLI = (int) (getMeasuredHeight() * this.LJLLL);
                    if (this.LJLILLLLZI != null) {
                        int measuredHeight3 = (int) ((getMeasuredHeight() * this.LJLLLL) + r0.getMeasuredHeight());
                        this.LJLL = measuredHeight3;
                        int i3 = this.LJLLI - measuredHeight3;
                        this.LJLJJLL = i3;
                        this.LJLLJ = (int) (i3 * this.LJLZ);
                        this.LJLLILLLL = (int) (i3 * this.LJLLLLLL);
                        this.LLFF = true;
                        return;
                    }
                    o.LJIJI("dragBarContainer");
                    throw null;
                }
                o.LJIJI("mapView");
                throw null;
            }
            o.LJIJI("dragBarContainer");
            throw null;
        }
        o.LJIJI("dragBarContainer");
        throw null;
    }
}
