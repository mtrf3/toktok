package X;

import android.util.SparseIntArray;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.subpage.userright.IUserRightItemViewStyle;
import com.zhiliaoapp.musically.R;

/* renamed from: X.SDy, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71750SDy extends SE4 {
    public static final SparseIntArray LLIIII;
    public long LLII;

    @Override // androidx.databinding.ViewDataBinding
    public final void LIZLLL() {
        long j;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        synchronized (this) {
            j = this.LLII;
            this.LLII = 0L;
        }
        IUserRightItemViewStyle iUserRightItemViewStyle = this.LLI;
        long j2 = j & 3;
        if (j2 != 0) {
            if (iUserRightItemViewStyle != null) {
                i = iUserRightItemViewStyle.getTitleFont();
                i2 = iUserRightItemViewStyle.getDescTextColor();
                i3 = iUserRightItemViewStyle.getTitleTextColor();
                i4 = iUserRightItemViewStyle.getItemPaddingHorizontal();
                i6 = iUserRightItemViewStyle.getBackgroundVisibility();
                i5 = iUserRightItemViewStyle.getDescFont();
            } else {
                i = 0;
                i2 = 0;
                i3 = 0;
                i4 = 0;
                i5 = 0;
                i6 = 0;
                if (j2 == 0) {
                    return;
                }
            }
            C70864RrY.LIZIZ(this.LL, Integer.valueOf(i4), null, Integer.valueOf(i4));
            this.LLD.setVisibility(i6);
            C70864RrY.LIZ(this.LLF, Integer.valueOf(i4), null, null);
            C70865RrZ.LIZ(i5, i2, this.LLFF);
            C70864RrY.LIZ(this.LLFII, Integer.valueOf(i4), null, Integer.valueOf(i4));
            C70865RrZ.LIZ(i, i3, this.LLFII);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean LJII() {
        synchronized (this) {
            if (this.LLII != 0) {
                return true;
            }
            return false;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void LJIIIIZZ() {
        synchronized (this) {
            this.LLII = 2L;
        }
        LJIILIIL();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean LJIIJJI(int i, int i2, Object obj) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        LLIIII = sparseIntArray;
        sparseIntArray.put(R.id.c7a, 7);
    }

    @Override // X.SE4
    public final void LJIILLIIL(IUserRightItemViewStyle iUserRightItemViewStyle) {
        this.LLI = iUserRightItemViewStyle;
        synchronized (this) {
            this.LLII |= 1;
        }
        notifyPropertyChanged(2);
        LJIILIIL();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C71750SDy(X.InterfaceC024507t r16, android.view.View[] r17) {
        /*
            r15 = this;
            android.util.SparseIntArray r8 = X.C71750SDy.LLIIII
            r7 = 0
            r0 = 8
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r2 = 0
            r3 = 0
        L9:
            r4 = r17
            int r0 = r4.length
            r6 = r16
            if (r3 >= r0) goto L1b
            r5 = r4[r3]
            r9 = 1
            r4 = r6
            r6 = r1
            androidx.databinding.ViewDataBinding.LJIIIZ(r4, r5, r6, r7, r8, r9)
            int r3 = r3 + 1
            goto L9
        L1b:
            r7 = r4[r2]
            r0 = 5
            r8 = r1[r0]
            androidx.constraintlayout.widget.ConstraintLayout r8 = (androidx.constraintlayout.widget.ConstraintLayout) r8
            r0 = 2
            r9 = r1[r0]
            com.bytedance.tux.icon.TuxIconView r9 = (com.bytedance.tux.icon.TuxIconView) r9
            r0 = 3
            r10 = r1[r0]
            com.bytedance.tux.icon.TuxIconView r10 = (com.bytedance.tux.icon.TuxIconView) r10
            r0 = 6
            r11 = r1[r0]
            com.bytedance.tux.input.TuxTextView r11 = (com.bytedance.tux.input.TuxTextView) r11
            r12 = r1[r2]
            com.bytedance.tux.icon.TuxIconView r12 = (com.bytedance.tux.icon.TuxIconView) r12
            r0 = 4
            r13 = r1[r0]
            com.bytedance.tux.input.TuxTextView r13 = (com.bytedance.tux.input.TuxTextView) r13
            r0 = 1
            r14 = r1[r0]
            androidx.constraintlayout.widget.ConstraintLayout r14 = (androidx.constraintlayout.widget.ConstraintLayout) r14
            r5 = r15
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r0 = -1
            r5.LLII = r0
            androidx.constraintlayout.widget.ConstraintLayout r0 = r5.LL
            r1 = 0
            r0.setTag(r1)
            com.bytedance.tux.icon.TuxIconView r0 = r5.LLD
            r0.setTag(r1)
            com.bytedance.tux.icon.TuxIconView r0 = r5.LLF
            r0.setTag(r1)
            com.bytedance.tux.input.TuxTextView r0 = r5.LLFF
            r0.setTag(r1)
            com.bytedance.tux.icon.TuxIconView r0 = r5.LLFFF
            r0.setTag(r1)
            com.bytedance.tux.input.TuxTextView r0 = r5.LLFII
            r0.setTag(r1)
            androidx.constraintlayout.widget.ConstraintLayout r0 = r5.LLFZ
            r0.setTag(r1)
            int r3 = r4.length
        L6c:
            if (r2 >= r3) goto L79
            r1 = r4[r2]
            r0 = 2131365270(0x7f0a0d96, float:1.83504E38)
            r1.setTag(r0, r5)
            int r2 = r2 + 1
            goto L6c
        L79:
            r5.LJIIIIZZ()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71750SDy.<init>(X.07t, android.view.View[]):void");
    }
}
