package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes15.dex */
public class VVN extends FrameLayout implements InterfaceC16600ky, InterfaceC16140kE {
    public final int LJLIL;
    public int LJLILLLLZI;
    public float LJLJI;
    public float LJLJJI;
    public final int[] LJLJJL;
    public final int[] LJLJJLL;
    public boolean LJLJL;
    public final C16610kz LJLJLJ;
    public InterfaceC16670l5 LJLJLLL;
    public final VVO LJLL;
    public boolean LJLLI;
    public boolean LJLLILLLL;

    private RecyclerView getScrollingView() {
        return null;
    }

    public void setGetScrollingView(VVP vvp) {
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.LJLJLJ.LJIIIZ(0);
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.LJLJLJ.LIZLLL;
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        this.LJLJLJ.LJIIL(0);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        if (getScrollingView() != null) {
            getScrollingView().computeHorizontalScrollExtent();
            return 0;
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        if (getScrollingView() != null) {
            getScrollingView().computeHorizontalScrollOffset();
            return 0;
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        if (getScrollingView() != null) {
            getScrollingView().computeHorizontalScrollRange();
            return 0;
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        if (getScrollingView() != null) {
            getScrollingView().computeVerticalScrollExtent();
            return 0;
        }
        return 0;
    }

    @Override // android.view.View, X.InterfaceC16140kE
    public final int computeVerticalScrollOffset() {
        if (getScrollingView() != null) {
            getScrollingView().computeVerticalScrollOffset();
            return 0;
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        if (getScrollingView() != null) {
            getScrollingView().computeVerticalScrollRange();
            return 0;
        }
        return 0;
    }

    public VVQ getiDispatchNestedPreFling() {
        return this.LJLL;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x000e, code lost:
    
        if (r3 != 3) goto L9;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchTouchEvent(android.view.MotionEvent r5) {
        /*
            r4 = this;
            int r3 = r5.getActionMasked()
            r2 = 1
            r1 = 0
            if (r3 == 0) goto L3a
            if (r3 == r2) goto L2a
            r0 = 2
            if (r3 == r0) goto L15
            r0 = 3
            if (r3 == r0) goto L2a
        L10:
            boolean r0 = super.dispatchTouchEvent(r5)
            return r0
        L15:
            int r0 = r4.LJLILLLLZI
            float r1 = LIZ(r5, r0)
            float r0 = r4.LJLJI
            float r0 = r0 - r1
            int r0 = (int) r0
            int r1 = java.lang.Math.abs(r0)
            int r0 = r4.LJLIL
            if (r1 < r0) goto L10
            r4.LJLLI = r2
            goto L10
        L2a:
            boolean r0 = r4.LJLLI
            if (r0 == 0) goto L35
            boolean r0 = r4.LJLLILLLL
            if (r0 == 0) goto L35
            r4.stopNestedScroll()
        L35:
            r4.LJLLI = r1
            r4.LJLLILLLL = r1
            goto L10
        L3a:
            r4.LJLLI = r1
            int r0 = r5.getPointerId(r1)
            r4.LJLILLLLZI = r0
            float r0 = LIZ(r5, r0)
            r4.LJLJI = r0
            r4.LJLLILLLL = r1
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.VVN.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0012, code lost:
    
        if (r5 != 3) goto L9;
     */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r13) {
        /*
            r12 = this;
            int r5 = r13.getActionMasked()
            r4 = 2
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            r7 = 0
            r6 = r12
            if (r5 == 0) goto L19
            r1 = -1
            r3 = 1
            if (r5 == r3) goto Lc1
            if (r5 == r4) goto L33
            r0 = 3
            if (r5 == r0) goto Lc1
        L14:
            boolean r0 = super.onInterceptTouchEvent(r13)
            return r0
        L19:
            int r0 = r13.getPointerId(r7)
            r6.LJLILLLLZI = r0
            float r1 = LIZ(r13, r0)
            int r0 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r0 != 0) goto L28
            return r7
        L28:
            r6.LJLJI = r1
            r6.startNestedScroll(r4)
            super.onInterceptTouchEvent(r13)
            r6.LJLJL = r7
            goto L14
        L33:
            int r0 = r6.LJLILLLLZI
            if (r0 != r1) goto L38
            return r7
        L38:
            float r4 = LIZ(r13, r0)
            int r0 = r6.LJLILLLLZI
            int r0 = r13.findPointerIndex(r0)
            if (r0 >= 0) goto L4b
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
        L46:
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 != 0) goto L50
            return r7
        L4b:
            float r1 = r13.getX(r0)
            goto L46
        L50:
            float r0 = r6.LJLJI
            float r0 = r0 - r4
            int r10 = (int) r0
            float r0 = r6.LJLJJI
            float r0 = r0 - r1
            int r2 = (int) r0
            r6.LJLJI = r4
            r6.LJLJJI = r1
            int r1 = java.lang.Math.abs(r10)
            int r0 = r6.LJLIL
            int r0 = r0 * 5
            if (r1 < r0) goto L70
            int r1 = java.lang.Math.abs(r2)
            int r0 = r6.LJLIL
            if (r1 > r0) goto L70
            r6.LJLJL = r3
        L70:
            boolean r0 = r6.LJLJL
            if (r0 == 0) goto Lbc
            androidx.recyclerview.widget.RecyclerView r0 = r6.getScrollingView()
            if (r0 == 0) goto Lbc
            androidx.recyclerview.widget.RecyclerView r0 = r6.getScrollingView()
            int r1 = r0.computeVerticalScrollOffset()
            int r0 = r6.LJLIL
            if (r1 > r0) goto Lbc
            int[] r1 = r6.LJLJJLL
            int[] r0 = r6.LJLJJL
            boolean r0 = r6.dispatchNestedPreScroll(r7, r10, r1, r0)
            if (r0 == 0) goto Lbc
            float r1 = r6.LJLJI
            int[] r0 = r6.LJLJJL
            r0 = r0[r3]
            float r0 = (float) r0
            float r1 = r1 - r0
            r6.LJLJI = r1
            int[] r0 = r6.LJLJJLL
            r0 = r0[r3]
            int r10 = r10 - r0
            float r0 = (float) r0
            r2 = 0
            r13.offsetLocation(r2, r0)
            int[] r11 = r6.LJLJJL
            r8 = r7
            r9 = r7
            boolean r0 = r6.dispatchNestedScroll(r7, r8, r9, r10, r11)
            if (r0 == 0) goto Lbb
            float r1 = r6.LJLJI
            int[] r0 = r6.LJLJJL
            r0 = r0[r3]
            float r0 = (float) r0
            float r1 = r1 - r0
            r6.LJLJI = r1
            r13.offsetLocation(r2, r0)
        Lbb:
            return r7
        Lbc:
            boolean r0 = super.onInterceptTouchEvent(r13)
            return r0
        Lc1:
            r6.stopNestedScroll()
            r6.LJLILLLLZI = r1
            r6.LJLJL = r7
            boolean r0 = super.onInterceptTouchEvent(r13)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.VVN.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        this.LJLJLJ.LJIIJ(z);
    }

    public void setNestedScrollingParent(InterfaceC16670l5 interfaceC16670l5) {
        this.LJLJLLL = interfaceC16670l5;
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return this.LJLJLJ.LJIIJJI(i, 0);
    }

    public VVN(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LJLILLLLZI = -1;
        this.LJLJJL = new int[2];
        this.LJLJJLL = new int[2];
        this.LJLL = new VVO();
        this.LJLLI = false;
        this.LJLLILLLL = false;
        this.LJLJLJ = new C16610kz(this);
        setNestedScrollingEnabled(true);
        this.LJLIL = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    public static float LIZ(MotionEvent motionEvent, int i) {
        int findPointerIndex = motionEvent.findPointerIndex(i);
        if (findPointerIndex < 0) {
            return -1.0f;
        }
        return motionEvent.getY(findPointerIndex);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        try {
            return C16590kx.LIZIZ((ViewGroup) this.LJLJLLL, this, f, f2);
        } catch (AbstractMethodError unused) {
            return false;
        }
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.LJLJLJ.LIZ(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.LJLJLJ.LIZLLL(i, i2, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.LJLJLJ.LJFF(i, i2, i3, i4, iArr);
    }
}
