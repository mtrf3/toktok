package X;

import android.util.SparseIntArray;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.subpage.returnpolicies.IReturnPoliciesItemViewStyle;
import com.zhiliaoapp.musically.R;

/* renamed from: X.SDz, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71751SDz extends SE8 {
    public static final SparseIntArray LLI;
    public long LLFZ;

    @Override // androidx.databinding.ViewDataBinding
    public final void LIZLLL() {
        long j;
        int i;
        int i2;
        int i3;
        int i4;
        synchronized (this) {
            j = this.LLFZ;
            this.LLFZ = 0L;
        }
        IReturnPoliciesItemViewStyle iReturnPoliciesItemViewStyle = this.LLFFF;
        long j2 = j & 3;
        if (j2 != 0) {
            if (iReturnPoliciesItemViewStyle != null) {
                i = iReturnPoliciesItemViewStyle.getTitleFont();
                i2 = iReturnPoliciesItemViewStyle.getDescTextColor();
                i3 = iReturnPoliciesItemViewStyle.getStartIconMarginStart();
                i4 = iReturnPoliciesItemViewStyle.getDescFont();
            } else {
                i = 0;
                i2 = 0;
                i3 = 0;
                i4 = 0;
                if (j2 == 0) {
                    return;
                }
            }
            C70865RrZ.LIZ(i4, i2, this.LL);
            C70864RrY.LIZ(this.LLFF, Integer.valueOf(i3), null, null);
            C70865RrZ.LIZ(i, 0, this.LLFF);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean LJII() {
        synchronized (this) {
            if (this.LLFZ != 0) {
                return true;
            }
            return false;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void LJIIIIZZ() {
        synchronized (this) {
            this.LLFZ = 2L;
        }
        LJIILIIL();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean LJIIJJI(int i, int i2, Object obj) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        LLI = sparseIntArray;
        sparseIntArray.put(R.id.c7a, 4);
    }

    @Override // X.SE8
    public final void LJIILLIIL(IReturnPoliciesItemViewStyle iReturnPoliciesItemViewStyle) {
        this.LLFFF = iReturnPoliciesItemViewStyle;
        synchronized (this) {
            this.LLFZ |= 1;
        }
        notifyPropertyChanged(2);
        LJIILIIL();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C71751SDz(X.InterfaceC024507t r16, android.view.View[] r17) {
        /*
            r15 = this;
            android.util.SparseIntArray r13 = X.C71751SDz.LLI
            r12 = 0
            r0 = 5
            java.lang.Object[] r11 = new java.lang.Object[r0]
            r3 = 0
            r1 = 0
        L8:
            r4 = r17
            int r0 = r4.length
            r6 = r16
            if (r1 >= r0) goto L19
            r10 = r4[r1]
            r14 = 1
            r9 = r6
            androidx.databinding.ViewDataBinding.LJIIIZ(r9, r10, r11, r12, r13, r14)
            int r1 = r1 + 1
            goto L8
        L19:
            r7 = r4[r3]
            r0 = 3
            r8 = r11[r0]
            com.bytedance.tux.input.TuxTextView r8 = (com.bytedance.tux.input.TuxTextView) r8
            r0 = 2
            r9 = r11[r0]
            androidx.constraintlayout.widget.ConstraintLayout r9 = (androidx.constraintlayout.widget.ConstraintLayout) r9
            r10 = r11[r3]
            com.bytedance.tux.icon.TuxIconView r10 = (com.bytedance.tux.icon.TuxIconView) r10
            r0 = 1
            r11 = r11[r0]
            com.bytedance.tux.input.TuxTextView r11 = (com.bytedance.tux.input.TuxTextView) r11
            r5 = r15
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r0 = -1
            r5.LLFZ = r0
            com.bytedance.tux.input.TuxTextView r0 = r5.LL
            r0.setTag(r12)
            androidx.constraintlayout.widget.ConstraintLayout r0 = r5.LLD
            r0.setTag(r12)
            com.bytedance.tux.icon.TuxIconView r0 = r5.LLF
            r0.setTag(r12)
            com.bytedance.tux.input.TuxTextView r0 = r5.LLFF
            r0.setTag(r12)
            int r2 = r4.length
        L4b:
            if (r3 >= r2) goto L58
            r1 = r4[r3]
            r0 = 2131365270(0x7f0a0d96, float:1.83504E38)
            r1.setTag(r0, r5)
            int r3 = r3 + 1
            goto L4b
        L58:
            r5.LJIIIIZZ()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71751SDz.<init>(X.07t, android.view.View[]):void");
    }
}
