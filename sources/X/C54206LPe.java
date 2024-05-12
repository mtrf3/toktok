package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;
import java.util.ArrayList;

/* renamed from: X.LPe, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C54206LPe extends C80766Vms {
    public int LLJJJIL;
    public int LLJJJJ;
    public int LLJJJJJIL;
    public boolean LLJJJJLIIL;
    public float LLJJL;
    public float LLJJLIIIJLLLLLLLZ;
    public float LLJL;
    public float LLJLIL;
    public float LLJLILLLLZIIL;
    public boolean LLJLL;
    public boolean LLJLLIL;
    public boolean LLJLLL;
    public boolean LLJZ;
    public boolean LLJZIJLIL;
    public InterfaceC54208LPg LLL;
    public boolean LLLF;
    public InterfaceC208778Hh LLLFF;

    private boolean getIsPageEnabled() {
        if (this.LLJLLIL) {
            return true;
        }
        return this.LLJLLL;
    }

    public int getItemCount() {
        PagerAdapter adapter = getAdapter();
        if (adapter == null) {
            return 0;
        }
        return adapter.getCount();
    }

    public C54206LPe(Context context) {
        super(context);
        this.LLJLLL = true;
        this.LLJZIJLIL = true;
        this.LLLFF = new C54207LPf(this);
        LJJIZ(context);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a0, code lost:
    
        if (r3 > 0.0f) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJJIL(android.view.MotionEvent r11) {
        /*
            r10 = this;
            X.8Hh r0 = r10.LLLFF
            r0.LIZIZ(r11)
            int r0 = r11.getAction()
            r5 = r0 & 255(0xff, float:3.57E-43)
            r4 = 1
            if (r5 != 0) goto L1b
            float r0 = r11.getX()
            r10.LLJJL = r0
            float r0 = r11.getY()
            r10.LLJJLIIIJLLLLLLLZ = r0
            return r4
        L1b:
            float r3 = r11.getX()
            float r0 = r10.LLJJL
            float r3 = r3 - r0
            float r2 = r11.getY()
            float r0 = r10.LLJJLIIIJLLLLLLLZ
            float r2 = r2 - r0
            float r9 = java.lang.Math.abs(r3)
            float r8 = java.lang.Math.abs(r2)
            r0 = 897988541(0x358637bd, float:1.0E-6)
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 >= 0) goto L39
            return r4
        L39:
            android.content.Context r0 = r10.getContext()
            boolean r0 = X.C90193gN.LIZIZ(r0)
            if (r0 == 0) goto L44
            float r3 = -r3
        L44:
            r0 = 0
            r7 = 0
            int r6 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r6 <= 0) goto L5b
            int r0 = r10.getCurrentItem()
            if (r0 <= 0) goto L59
            X.8Hh r0 = r10.LLLFF
            boolean r0 = r0.LIZJ(r3, r4)
            if (r0 == 0) goto L59
        L58:
            return r4
        L59:
            r4 = 0
            goto La2
        L5b:
            int r1 = r10.getCurrentItem()
            int r0 = r10.getItemCount()
            int r0 = r0 - r4
            if (r1 >= r0) goto L83
            X.8Hh r1 = r10.LLLFF
            r0 = -1
            boolean r0 = r1.LIZJ(r3, r0)
            if (r0 == 0) goto L83
            r1 = 1
        L70:
            boolean r0 = r10.LLJJJJLIIL
            if (r0 == 0) goto L85
            int r0 = r10.LLJJJJJIL
            float r0 = (float) r0
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 < 0) goto L82
            r0 = 1056964608(0x3f000000, float:0.5)
            float r9 = r9 * r0
            int r0 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r0 < 0) goto L85
        L82:
            return r7
        L83:
            r1 = 0
            goto L70
        L85:
            if (r5 == r4) goto L8a
            r0 = 3
            if (r5 != r0) goto L9d
        L8a:
            if (r1 != 0) goto L9d
            X.LPg r0 = r10.LLL
            if (r0 == 0) goto L9d
            X.8Hh r0 = r10.LLLFF
            boolean r0 = r0.LIZLLL(r3, r2)
            if (r0 == 0) goto L9d
            X.LPg r0 = r10.LLL
            r0.LIZ()
        L9d:
            r4 = r1
            if (r1 != 0) goto L58
            if (r6 <= 0) goto L58
        La2:
            float r0 = r11.getX()
            r10.LLJJL = r0
            goto L58
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54206LPe.LJJIL(android.view.MotionEvent):boolean");
    }

    public final void LJJIZ(Context context) {
        this.LLJJJIL = C17N.LJIILL(8.0d);
        setDefaultGutterSize(0);
        this.LLJJJJ = ViewConfiguration.get(context).getScaledTouchSlop();
        this.LLJJJJJIL = ViewConfiguration.get(context).getScaledPagingTouchSlop();
        this.LLJLL = C90193gN.LIZIZ(context);
    }

    @Override // X.C80769Vmv, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.LLJZIJLIL && getIsPageEnabled() && this.LLJZ) {
            if (motionEvent.getAction() == 0) {
                this.LLJJL = motionEvent.getX();
                this.LLJJLIIIJLLLLLLLZ = motionEvent.getY();
            } else if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && !C52542Kji.LIZ()) {
                LJJIL(motionEvent);
            }
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1 || action == 3) {
                this.LLJLILLLLZIIL = 0.0f;
                this.LLJL = 0.0f;
                this.LLJLIL = 0.0f;
            }
        } else {
            float x = motionEvent.getX();
            this.LLJL = x;
            this.LLJLILLLLZIIL = x;
            this.LLJLIL = motionEvent.getY();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0052, code lost:
    
        if (r0 != 3) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006c, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0078, code lost:
    
        if (2 == r11.getAction()) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0089, code lost:
    
        if (LJJIJLIJ(r10, false, (int) r5, (int) r11.getX(), (int) r11.getY()) != false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0097, code lost:
    
        if (((java.lang.Boolean) X.C52573KkD.LIZ.getValue()).booleanValue() == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a4, code lost:
    
        if (X.C47959Irz.LIZ(r11, r10.LLJLILLLLZIIL) <= r10.LLJJJJ) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a6, code lost:
    
        requestDisallowInterceptTouchEvent(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a9, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00da, code lost:
    
        requestDisallowInterceptTouchEvent(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00dd, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00be, code lost:
    
        if (2 == r11.getAction()) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0028, code lost:
    
        if (0 == 0) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b1  */
    @Override // X.C80766Vms, X.C80769Vmv, android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r11) {
        /*
            Method dump skipped, instructions count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54206LPe.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // X.C80766Vms, X.C80769Vmv, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if ((!this.LLJZIJLIL || !getIsPageEnabled() || !LJJIL(motionEvent)) && motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setBlockCanScroll(boolean z) {
        this.LLLF = z;
    }

    public void setEnableDispatchTouchEventCheck(boolean z) {
        this.LLJZ = z;
    }

    public void setForceSetEnabled(boolean z) {
        this.LLJLLIL = z;
    }

    public void setOnFlingEndListener(InterfaceC54208LPg interfaceC54208LPg) {
        this.LLL = interfaceC54208LPg;
    }

    public void setPagingMainValve(boolean z) {
        this.LLJZIJLIL = z;
    }

    public C54206LPe(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLJLLL = true;
        this.LLJZIJLIL = true;
        this.LLLFF = new C54207LPf(this);
        LJJIZ(context);
    }

    @Override // X.C80769Vmv, android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        try {
            super.addFocusables(arrayList, i, i2);
        } catch (Exception e) {
            C36922EeM.LJFF(e);
            PEH.LIZJ(e);
        }
    }

    public static boolean LJJIJLIJ(View view, boolean z, int i, int i2, int i3) {
        int i4;
        int i5;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (C27740Aue.LJFF(view) && (i4 = i2 + scrollX) >= childAt.getLeft() && i4 < childAt.getRight() && (i5 = i3 + scrollY) >= childAt.getTop() && i5 < childAt.getBottom() && LJJIJLIJ(childAt, true, i, i4 - childAt.getLeft(), i5 - childAt.getTop())) {
                    return true;
                }
            }
        }
        if (z && view.canScrollHorizontally(-i)) {
            return true;
        }
        return false;
    }

    @Override // X.C80769Vmv
    public final boolean LJII(View view, boolean z, int i, int i2, int i3) {
        if (!this.LLLF && C27740Aue.LJFF(view) && super.LJII(view, z, i, i2, i3)) {
            return true;
        }
        return false;
    }
}
