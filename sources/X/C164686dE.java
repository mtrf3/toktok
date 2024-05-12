package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.6dE, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C164686dE extends FrameLayout {
    public final int LJLIL;
    public float LJLILLLLZI;
    public float LJLJI;

    private final View getChild() {
        if (getChildCount() > 0) {
            return getChildAt(0);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final X.C0CM getParentViewPager() {
        /*
            r3 = this;
            android.view.ViewParent r2 = r3.getParent()
            boolean r0 = r2 instanceof android.view.View
            r1 = 0
            if (r0 == 0) goto L1c
            android.view.View r2 = (android.view.View) r2
        Lb:
            if (r2 == 0) goto L1d
            boolean r0 = r2 instanceof X.C0CM
            if (r0 != 0) goto L1d
            android.view.ViewParent r2 = r2.getParent()
            boolean r0 = r2 instanceof android.view.View
            if (r0 == 0) goto L1c
            android.view.View r2 = (android.view.View) r2
            goto Lb
        L1c:
            r2 = r1
        L1d:
            boolean r0 = r2 instanceof X.C0CM
            if (r0 == 0) goto L24
            r1 = r2
            X.0CM r1 = (X.C0CM) r1
        L24:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C164686dE.getParentViewPager():X.0CM");
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent e) {
        boolean z;
        float f;
        boolean z2;
        o.LJIIIZ(e, "e");
        C0CM parentViewPager = getParentViewPager();
        if (parentViewPager != null) {
            int orientation = parentViewPager.getOrientation();
            float f2 = 1.0f;
            if (LIZ(-1.0f, orientation) || LIZ(1.0f, orientation)) {
                if (e.getAction() == 0) {
                    this.LJLILLLLZI = e.getX();
                    this.LJLJI = e.getY();
                    getParent().requestDisallowInterceptTouchEvent(true);
                } else if (e.getAction() == 2) {
                    float x = e.getX() - this.LJLILLLLZI;
                    float y = e.getY() - this.LJLJI;
                    if (orientation == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    float abs = Math.abs(x);
                    if (z) {
                        f = 0.5f;
                    } else {
                        f = 1.0f;
                    }
                    float f3 = abs * f;
                    float abs2 = Math.abs(y);
                    if (!z) {
                        f2 = 0.5f;
                    }
                    float f4 = abs2 * f2;
                    float f5 = this.LJLIL;
                    if (f3 > f5 || f4 > f5) {
                        if (f4 > f3) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z == z2) {
                            getParent().requestDisallowInterceptTouchEvent(false);
                        } else {
                            if (!z) {
                                x = y;
                            }
                            if (LIZ(x, orientation)) {
                                getParent().requestDisallowInterceptTouchEvent(true);
                            } else {
                                getParent().requestDisallowInterceptTouchEvent(false);
                            }
                        }
                    }
                }
            }
        }
        return super.onInterceptTouchEvent(e);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C164686dE(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a1.LJFF(context, "context");
        this.LJLIL = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    }

    public final boolean LIZ(float f, int i) {
        int i2 = -((int) Math.signum(f));
        if (i != 0) {
            if (i == 1) {
                View child = getChild();
                if (child == null) {
                    return false;
                }
                return child.canScrollVertically(i2);
            }
            throw new IllegalArgumentException();
        }
        View child2 = getChild();
        if (child2 == null) {
            return false;
        }
        return child2.canScrollHorizontally(i2);
    }
}
