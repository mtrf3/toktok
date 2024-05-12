package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.AqS154S0100000_4;

/* renamed from: X.ASd, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26255ASd extends RelativeLayout {
    public int LJLIL;
    public boolean LJLILLLLZI;
    public int LJLJI;
    public int LJLJJI;
    public int LJLJJL;
    public InterfaceC65784Pro<C76800UCe> LJLJJLL;
    public AbstractC26257ASf LJLJL;
    public final C62822Ol8 LJLJLJ;
    public C53860LBw LJLJLLL;
    public BottomSheetBehavior<?> LJLL;

    private final int getMinHeightPx() {
        return ((Number) this.LJLJLJ.getValue()).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [android.view.View] */
    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        boolean z;
        BottomSheetBehavior<?> bottomSheetBehavior;
        C06F c06f;
        ?? r1;
        super.onAttachedToWindow();
        int i = this.LJLIL;
        int i2 = 0;
        if (i == 2 || i == 3) {
            z = true;
        } else {
            z = false;
        }
        C53860LBw c53860LBw = this.LJLJLLL;
        if (c53860LBw != null) {
            if (!z) {
                i2 = 8;
            }
            c53860LBw.setVisibility(i2);
        }
        C26255ASd c26255ASd = this;
        do {
            Object parent = c26255ASd.getParent();
            if (parent instanceof C45621qg) {
                if (this.LJLL == null) {
                    bottomSheetBehavior = BottomSheetBehavior.from(c26255ASd);
                } else {
                    ViewGroup.LayoutParams layoutParams = c26255ASd.getLayoutParams();
                    if ((layoutParams instanceof C06F) && (c06f = (C06F) layoutParams) != null) {
                        c06f.LIZIZ(this.LJLL);
                    }
                    bottomSheetBehavior = this.LJLL;
                }
                this.LJLL = bottomSheetBehavior;
                if (bottomSheetBehavior != null) {
                    bottomSheetBehavior.setBottomSheetCallback(new C26256ASe(z, this));
                }
                BottomSheetBehavior<?> bottomSheetBehavior2 = this.LJLL;
                if (bottomSheetBehavior2 == null) {
                    return;
                }
                bottomSheetBehavior2.setHideable(this.LJLILLLLZI);
                return;
            }
            if (parent instanceof View) {
                r1 = (View) parent;
                c26255ASd = r1;
            } else {
                return;
            }
        } while (r1 != 0);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.LJLJLLL = (C53860LBw) findViewById(R.id.jw1);
    }

    public final BottomSheetBehavior<?> getBehavior() {
        return this.LJLL;
    }

    public final AbstractC26257ASf getBottomSheetCallback() {
        return this.LJLJL;
    }

    public final InterfaceC65784Pro<C76800UCe> getDismissFunc() {
        return this.LJLJJLL;
    }

    public final int getDynamicMaxHeightPx() {
        return this.LJLJJL;
    }

    public final int getDynamicPeekHeightPx() {
        return this.LJLJJI;
    }

    public final int getFixedHeightPx() {
        return this.LJLJI;
    }

    public final C53860LBw getHandleView() {
        return this.LJLJLLL;
    }

    public final int getVariant() {
        return this.LJLIL;
    }

    public final void setBehavior(BottomSheetBehavior<?> bottomSheetBehavior) {
        this.LJLL = bottomSheetBehavior;
    }

    public final void setBottomSheetCallback(AbstractC26257ASf abstractC26257ASf) {
        this.LJLJL = abstractC26257ASf;
    }

    public final void setDismissFunc(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        this.LJLJJLL = interfaceC65784Pro;
    }

    public final void setDynamicMaxHeightPx(int i) {
        this.LJLJJL = i;
    }

    public final void setDynamicPeekHeightPx(int i) {
        this.LJLJJI = i;
    }

    public final void setDynamicPeekHeightPx$tux_theme_release(int i) {
        this.LJLJJI = i;
        BottomSheetBehavior<?> bottomSheetBehavior = this.LJLL;
        if (bottomSheetBehavior == null) {
            return;
        }
        bottomSheetBehavior.setPeekHeight(i);
    }

    public final void setFixedHeightPx(int i) {
        this.LJLJI = i;
    }

    public final void setFixedHeightPx$tux_theme_release(int i) {
        this.LJLJI = i;
        BottomSheetBehavior<?> bottomSheetBehavior = this.LJLL;
        if (bottomSheetBehavior == null) {
            return;
        }
        bottomSheetBehavior.setPeekHeight(i);
    }

    public final void setHandleView(C53860LBw c53860LBw) {
        this.LJLJLLL = c53860LBw;
    }

    public final void setHideable(boolean z) {
        this.LJLILLLLZI = z;
    }

    public final void setHideable$tux_theme_release(boolean z) {
        this.LJLILLLLZI = z;
        BottomSheetBehavior<?> bottomSheetBehavior = this.LJLL;
        if (bottomSheetBehavior == null) {
            return;
        }
        bottomSheetBehavior.setHideable(z);
    }

    public final void setVariant(int i) {
        this.LJLIL = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26255ASd(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        this.LJLILLLLZI = true;
        this.LJLJI = -1;
        this.LJLJJI = -1;
        this.LJLJJL = -1;
        this.LJLJLJ = C221108m2.LIZIZ(new AqS154S0100000_4(this, 1039));
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0065, code lost:
    
        if (r6 > 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0082, code lost:
    
        if (r6 > r0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0084, code lost:
    
        r6 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0071, code lost:
    
        if (r6 > r0) goto L41;
     */
    @Override // android.widget.RelativeLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r10, int r11) {
        /*
            r9 = this;
            super.onMeasure(r10, r11)
            android.content.Context r0 = r9.getContext()
            if (r0 == 0) goto L3d
            int r2 = X.C63081OpJ.LJJJJJL(r0)
            int r5 = r9.getMeasuredHeight()
            int r1 = r9.LJLIL
            r7 = 4604750475001237340(0x3fe75c28f5c28f5c, double:0.73)
            r4 = 0
            if (r1 == 0) goto L68
            r0 = 1
            if (r1 == r0) goto L76
            r0 = 2
            if (r1 == r0) goto L5b
            r0 = 3
            if (r1 == r0) goto L4f
        L24:
            r6 = r5
        L25:
            if (r6 == r5) goto L37
            r0 = 1073741824(0x40000000, float:2.0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r0)
            super.onMeasure(r10, r0)
            int r0 = r9.getMeasuredWidth()
            r9.setMeasuredDimension(r0, r6)
        L37:
            if (r4 == 0) goto L46
            com.google.android.material.bottomsheet.BottomSheetBehavior<?> r1 = r9.LJLL
            if (r1 != 0) goto L3e
        L3d:
            return
        L3e:
            int r0 = r4.intValue()
            r1.setPeekHeight(r0)
            goto L3d
        L46:
            com.google.android.material.bottomsheet.BottomSheetBehavior<?> r0 = r9.LJLL
            if (r0 != 0) goto L4b
            goto L3d
        L4b:
            r0.setPeekHeight(r6)
            goto L3d
        L4f:
            int r6 = android.view.View.MeasureSpec.getSize(r11)
            double r1 = (double) r6
            double r1 = r1 * r7
            int r0 = (int) r1
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            goto L25
        L5b:
            int r0 = r9.LJLJJI
            if (r0 <= 0) goto L63
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
        L63:
            int r6 = r9.LJLJJL
            if (r6 <= 0) goto L24
            goto L25
        L68:
            int r6 = r9.getMinHeightPx()
            if (r5 >= r6) goto L74
        L6e:
            double r1 = (double) r2
            double r1 = r1 * r7
            int r0 = (int) r1
            if (r6 <= r0) goto L25
            goto L84
        L74:
            r6 = r5
            goto L6e
        L76:
            int r6 = r9.LJLJI
            if (r6 <= 0) goto L86
        L7a:
            double r2 = (double) r2
            r0 = 4606732058837280358(0x3fee666666666666, double:0.95)
            double r2 = r2 * r0
            int r0 = (int) r2
            if (r6 <= r0) goto L25
        L84:
            r6 = r0
            goto L25
        L86:
            r6 = r5
            goto L7a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26255ASd.onMeasure(int, int):void");
    }
}
