package X;

import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeMap;
import o3.h0;

/* renamed from: X.Vgz, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80401Vgz extends LinearLayout {
    public static final int LJLLI;
    public final List<C80406Vh4> LJLIL;
    public final C80404Vh2 LJLILLLLZI;
    public final C80408Vh6 LJLJI;
    public final LinkedHashSet<InterfaceC80410Vh8> LJLJJI;
    public final C80405Vh3 LJLJJL;
    public Integer[] LJLJJLL;
    public boolean LJLJL;
    public boolean LJLJLJ;
    public boolean LJLJLLL;
    public int LJLL;

    private int getVisibleButtonCount() {
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if ((getChildAt(i2) instanceof C80400Vgy) && LJ(i2)) {
                i++;
            }
        }
        return i;
    }

    static {
        C16880lQ.LJLLJ(C80401Vgz.class);
        LJLLI = R.style.a0r;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return C80401Vgz.class.getName();
    }

    public int getCheckedButtonId() {
        if (this.LJLJLJ) {
            return this.LJLL;
        }
        return -1;
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            C80400Vgy LIZLLL = LIZLLL(i);
            if (LIZLLL.isChecked()) {
                arrayList.add(Integer.valueOf(LIZLLL.getId()));
            }
        }
        return arrayList;
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (LJ(i)) {
                return i;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (LJ(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    public final void LIZ() {
        LinearLayout.LayoutParams layoutParams;
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i = firstVisibleChildIndex + 1; i < getChildCount(); i++) {
            C80400Vgy LIZLLL = LIZLLL(i);
            int min = Math.min(LIZLLL.getStrokeWidth(), LIZLLL(i - 1).getStrokeWidth());
            ViewGroup.LayoutParams layoutParams2 = LIZLLL.getLayoutParams();
            if (layoutParams2 instanceof LinearLayout.LayoutParams) {
                layoutParams = (LinearLayout.LayoutParams) layoutParams2;
            } else {
                layoutParams = new LinearLayout.LayoutParams(layoutParams2.width, layoutParams2.height);
            }
            if (getOrientation() == 0) {
                C16530kr.LJI(layoutParams, 0);
                C16530kr.LJII(layoutParams, -min);
                layoutParams.topMargin = 0;
            } else {
                layoutParams.bottomMargin = 0;
                layoutParams.topMargin = -min;
                C16530kr.LJII(layoutParams, 0);
            }
            LIZLLL.setLayoutParams(layoutParams);
        }
        if (getChildCount() == 0 || firstVisibleChildIndex == -1) {
            return;
        }
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) LIZLLL(firstVisibleChildIndex).getLayoutParams();
        if (getOrientation() == 1) {
            layoutParams3.topMargin = 0;
            layoutParams3.bottomMargin = 0;
        } else {
            C16530kr.LJI(layoutParams3, 0);
            C16530kr.LJII(layoutParams3, 0);
            layoutParams3.leftMargin = 0;
            layoutParams3.rightMargin = 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0034, code lost:
    
        if (r10 == null) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJII() {
        /*
            r11 = this;
            int r9 = r11.getChildCount()
            int r8 = r11.getFirstVisibleChildIndex()
            int r7 = r11.getLastVisibleChildIndex()
            r6 = 0
        Ld:
            if (r6 >= r9) goto Ld2
            X.Vgy r5 = r11.LIZLLL(r6)
            int r1 = r5.getVisibility()
            r0 = 8
            if (r1 != r0) goto L1e
        L1b:
            int r6 = r6 + 1
            goto Ld
        L1e:
            X.VhE r0 = r5.getShapeAppearanceModel()
            r0.getClass()
            X.VhF r4 = new X.VhF
            r4.<init>(r0)
            java.util.List<X.Vh4> r0 = r11.LJLIL
            java.lang.Object r10 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r6)
            X.Vh4 r10 = (X.C80406Vh4) r10
            if (r8 != r7) goto L5c
            if (r10 != 0) goto L79
        L36:
            X.Vfj r0 = new X.Vfj
            r1 = 0
            r0.<init>(r1)
            r4.LJ = r0
            X.Vfj r0 = new X.Vfj
            r0.<init>(r1)
            r4.LJFF = r0
            X.Vfj r0 = new X.Vfj
            r0.<init>(r1)
            r4.LJI = r0
            X.Vfj r0 = new X.Vfj
            r0.<init>(r1)
            r4.LJII = r0
        L53:
            X.VhE r0 = new X.VhE
            r0.<init>(r4)
            r5.setShapeAppearanceModel(r0)
            goto L1b
        L5c:
            int r0 = r11.getOrientation()
            if (r0 != 0) goto Ld0
            r0 = 1
        L63:
            if (r6 != r8) goto La2
            if (r0 == 0) goto L96
            boolean r0 = X.C80250VeY.LIZJ(r11)
            if (r0 == 0) goto L8a
            X.Vh4 r3 = new X.Vh4
            X.Vfj r2 = X.C80406Vh4.LJ
            X.Vfw r1 = r10.LIZIZ
            X.Vfw r0 = r10.LIZJ
            r3.<init>(r2, r2, r1, r0)
        L78:
            r10 = r3
        L79:
            X.Vfw r0 = r10.LIZ
            r4.LJ = r0
            X.Vfw r0 = r10.LIZLLL
            r4.LJII = r0
            X.Vfw r0 = r10.LIZIZ
            r4.LJFF = r0
            X.Vfw r0 = r10.LIZJ
            r4.LJI = r0
            goto L53
        L8a:
            X.Vh4 r3 = new X.Vh4
            X.Vfw r2 = r10.LIZ
            X.Vfw r1 = r10.LIZLLL
            X.Vfj r0 = X.C80406Vh4.LJ
            r3.<init>(r2, r1, r0, r0)
            goto L78
        L96:
            X.Vh4 r3 = new X.Vh4
            X.Vfw r2 = r10.LIZ
            X.Vfj r1 = X.C80406Vh4.LJ
            X.Vfw r0 = r10.LIZIZ
            r3.<init>(r2, r1, r0, r1)
            goto L78
        La2:
            if (r6 != r7) goto L36
            if (r0 == 0) goto Lc4
            boolean r0 = X.C80250VeY.LIZJ(r11)
            if (r0 == 0) goto Lb8
            X.Vh4 r3 = new X.Vh4
            X.Vfw r2 = r10.LIZ
            X.Vfw r1 = r10.LIZLLL
            X.Vfj r0 = X.C80406Vh4.LJ
            r3.<init>(r2, r1, r0, r0)
            goto L78
        Lb8:
            X.Vh4 r3 = new X.Vh4
            X.Vfj r2 = X.C80406Vh4.LJ
            X.Vfw r1 = r10.LIZIZ
            X.Vfw r0 = r10.LIZJ
            r3.<init>(r2, r2, r1, r0)
            goto L78
        Lc4:
            X.Vh4 r3 = new X.Vh4
            X.Vfj r2 = X.C80406Vh4.LJ
            X.Vfw r1 = r10.LIZLLL
            X.Vfw r0 = r10.LIZJ
            r3.<init>(r2, r1, r2, r0)
            goto L78
        Ld0:
            r0 = 0
            goto L63
        Ld2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C80401Vgz.LJII():void");
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i = this.LJLL;
        if (i != -1) {
            LJFF(i, true);
            LJI(i, true);
            setCheckedId(i);
        }
    }

    private void setCheckedId(int i) {
        this.LJLL = i;
        LIZJ(i, true);
    }

    private void setGeneratedIdIfNeeded(C80400Vgy c80400Vgy) {
        if (c80400Vgy.getId() == -1) {
            c80400Vgy.setId(View.generateViewId());
        }
    }

    private void setupButtonChild(C80400Vgy c80400Vgy) {
        c80400Vgy.setMaxLines(1);
        c80400Vgy.setEllipsize(TextUtils.TruncateAt.END);
        c80400Vgy.setCheckable(true);
        c80400Vgy.LJLJJL.add(this.LJLILLLLZI);
        c80400Vgy.setOnPressedChangeListenerInternal(this.LJLJI);
        c80400Vgy.setShouldDrawSurfaceColorStroke(true);
    }

    public final void LIZIZ(int i) {
        if (i == this.LJLL) {
            return;
        }
        LJFF(i, true);
        LJI(i, true);
        setCheckedId(i);
    }

    public final C80400Vgy LIZLLL(int i) {
        return (C80400Vgy) getChildAt(i);
    }

    public final boolean LJ(int i) {
        if (getChildAt(i).getVisibility() != 8) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        TreeMap treeMap = new TreeMap(this.LJLJJL);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            treeMap.put(LIZLLL(i), Integer.valueOf(i));
        }
        this.LJLJJLL = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C17760mq c17760mq = new C17760mq(accessibilityNodeInfo);
        int visibleButtonCount = getVisibleButtonCount();
        if (this.LJLJLJ) {
            i = 1;
        } else {
            i = 2;
        }
        c17760mq.LJIILLIIL(C17730mn.LIZ(1, visibleButtonCount, i));
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof C80400Vgy) {
            C80400Vgy c80400Vgy = (C80400Vgy) view;
            c80400Vgy.LJLJJL.remove(this.LJLILLLLZI);
            c80400Vgy.setOnPressedChangeListenerInternal(null);
        }
        int indexOfChild = indexOfChild(view);
        if (indexOfChild >= 0) {
            ListProtector.remove(this.LJLIL, indexOfChild);
        }
        LJII();
        LIZ();
    }

    public void setSelectionRequired(boolean z) {
        this.LJLJLLL = z;
    }

    public void setSingleSelection(boolean z) {
        if (this.LJLJLJ != z) {
            this.LJLJLJ = z;
            this.LJLJL = true;
            for (int i = 0; i < getChildCount(); i++) {
                C80400Vgy LIZLLL = LIZLLL(i);
                LIZLLL.setChecked(false);
                LIZJ(LIZLLL.getId(), false);
            }
            this.LJLJL = false;
            setCheckedId(-1);
        }
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C80401Vgz(android.content.Context r11, android.util.AttributeSet r12) {
        /*
            r10 = this;
            int r8 = X.C80401Vgz.LJLLI
            r1 = 2130970826(0x7f0408ca, float:1.7550373E38)
            r5 = r12
            android.content.Context r0 = X.C78865UxJ.LIZ(r11, r5, r1, r8)
            r10.<init>(r0, r5, r1)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r10.LJLIL = r0
            X.Vh2 r0 = new X.Vh2
            r0.<init>(r10)
            r10.LJLILLLLZI = r0
            X.Vh6 r0 = new X.Vh6
            r0.<init>(r10)
            r10.LJLJI = r0
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            r10.LJLJJI = r0
            X.Vh3 r0 = new X.Vh3
            r0.<init>(r10)
            r10.LJLJJL = r0
            r3 = 0
            r10.LJLJL = r3
            android.content.Context r4 = r10.getContext()
            r0 = 3
            int[] r6 = new int[r0]
            r6 = {x0066: FILL_ARRAY_DATA , data: [2130969542, 2130971244, 2130971303} // fill-array
            int[] r9 = new int[r3]
            r7 = 2130970826(0x7f0408ca, float:1.7550373E38)
            android.content.res.TypedArray r2 = X.C80244VeS.LIZLLL(r4, r5, r6, r7, r8, r9)
            r0 = 2
            boolean r0 = r2.getBoolean(r0, r3)
            r10.setSingleSelection(r0)
            r0 = -1
            int r0 = r2.getResourceId(r3, r0)
            r10.LJLL = r0
            r1 = 1
            boolean r0 = r2.getBoolean(r1, r3)
            r10.LJLJLLL = r0
            r10.setChildrenDrawingOrderEnabled(r1)
            r2.recycle()
            X.C16300kU.LJIJ(r10, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C80401Vgz.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public final void LIZJ(int i, boolean z) {
        Iterator<InterfaceC80410Vh8> it = this.LJLJJI.iterator();
        while (it.hasNext()) {
            it.next().LIZ(i, z);
        }
    }

    public final void LJFF(int i, boolean z) {
        View findViewById = findViewById(i);
        if (findViewById instanceof C80400Vgy) {
            this.LJLJL = true;
            ((C80400Vgy) findViewById).setChecked(z);
            this.LJLJL = false;
        }
    }

    public final boolean LJI(int i, boolean z) {
        List<Integer> checkedButtonIds = getCheckedButtonIds();
        if (this.LJLJLLL && checkedButtonIds.isEmpty()) {
            LJFF(i, true);
            this.LJLL = i;
            return false;
        }
        if (z && this.LJLJLJ) {
            checkedButtonIds.remove(Integer.valueOf(i));
            Iterator<Integer> it = checkedButtonIds.iterator();
            while (it.hasNext()) {
                int intValue = it.next().intValue();
                LJFF(intValue, false);
                LIZJ(intValue, false);
            }
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        Integer[] numArr = this.LJLJJLL;
        if (numArr == null || i2 >= numArr.length) {
            return i2;
        }
        return numArr[i2].intValue();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        LJII();
        LIZ();
        super.onMeasure(i, i2);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof C80400Vgy)) {
            return;
        }
        super.addView(view, i, layoutParams);
        C80400Vgy c80400Vgy = (C80400Vgy) view;
        setGeneratedIdIfNeeded(c80400Vgy);
        setupButtonChild(c80400Vgy);
        if (c80400Vgy.isChecked()) {
            LJI(c80400Vgy.getId(), true);
            setCheckedId(c80400Vgy.getId());
        }
        C80416VhE shapeAppearanceModel = c80400Vgy.getShapeAppearanceModel();
        ((ArrayList) this.LJLIL).add(new C80406Vh4(shapeAppearanceModel.LJ, shapeAppearanceModel.LJII, shapeAppearanceModel.LJFF, shapeAppearanceModel.LJI));
        h0.LJIJI(c80400Vgy, new C80403Vh1(this));
    }
}
