package X;

import android.util.SparseIntArray;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.review.IReviewInnerPageCellStyle;
import com.zhiliaoapp.musically.R;

/* renamed from: X.RrW, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70862RrW extends AbstractC70861RrV {
    public static final SparseIntArray LLFZ;
    public long LLFII;

    @Override // androidx.databinding.ViewDataBinding
    public final void LIZLLL() {
        long j;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        synchronized (this) {
            j = this.LLFII;
            this.LLFII = 0L;
        }
        IReviewInnerPageCellStyle iReviewInnerPageCellStyle = this.LLFF;
        long j2 = j & 3;
        if (j2 != 0) {
            if (iReviewInnerPageCellStyle != null) {
                i = iReviewInnerPageCellStyle.getProductNameFont();
                i2 = iReviewInnerPageCellStyle.getProductOriginalPriceColor();
                i3 = iReviewInnerPageCellStyle.getProductOriginalPriceFont();
                i4 = iReviewInnerPageCellStyle.getProductRealPriceFont();
                i6 = iReviewInnerPageCellStyle.getProductNameColor();
                i7 = iReviewInnerPageCellStyle.getProductRealPriceColor();
                i5 = iReviewInnerPageCellStyle.getProductContentMarginStart();
            } else {
                i = 0;
                i2 = 0;
                i3 = 0;
                i4 = 0;
                i5 = 0;
                i6 = 0;
                i7 = 0;
                if (j2 == 0) {
                    return;
                }
            }
            C70865RrZ.LIZ(i3, i2, this.LL);
            C70865RrZ.LIZ(i, i6, this.LLD);
            C70864RrY.LIZ(this.LLD, Integer.valueOf(i5), null, null);
            C70865RrZ.LIZ(i4, i7, this.LLF);
            C70864RrY.LIZ(this.LLF, Integer.valueOf(i5), null, null);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean LJII() {
        synchronized (this) {
            if (this.LLFII != 0) {
                return true;
            }
            return false;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void LJIIIIZZ() {
        synchronized (this) {
            this.LLFII = 2L;
        }
        LJIILIIL();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean LJIIJJI(int i, int i2, Object obj) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        LLFZ = sparseIntArray;
        sparseIntArray.put(R.id.i5x, 4);
        sparseIntArray.put(R.id.l5m, 5);
    }

    @Override // X.AbstractC70861RrV
    public final void LJIILLIIL(IReviewInnerPageCellStyle iReviewInnerPageCellStyle) {
        this.LLFF = iReviewInnerPageCellStyle;
        synchronized (this) {
            this.LLFII |= 1;
        }
        notifyPropertyChanged(2);
        LJIILIIL();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C70862RrW(android.view.View r11, X.InterfaceC024507t r12) {
        /*
            r10 = this;
            android.util.SparseIntArray r1 = X.C70862RrW.LLFZ
            r0 = 6
            r2 = 0
            r6 = r11
            r5 = r12
            java.lang.Object[] r3 = androidx.databinding.ViewDataBinding.LJIIJ(r5, r6, r0, r2, r1)
            r0 = 3
            r7 = r3[r0]
            com.bytedance.tux.input.TuxTextView r7 = (com.bytedance.tux.input.TuxTextView) r7
            r0 = 1
            r8 = r3[r0]
            com.bytedance.tux.input.TuxTextView r8 = (com.bytedance.tux.input.TuxTextView) r8
            r0 = 2
            r9 = r3[r0]
            com.bytedance.tux.input.TuxTextView r9 = (com.bytedance.tux.input.TuxTextView) r9
            r4 = r10
            r4.<init>(r5, r6, r7, r8, r9)
            r0 = -1
            r4.LLFII = r0
            r0 = 0
            r0 = r3[r0]
            android.view.View r0 = (android.view.View) r0
            r0.setTag(r2)
            com.bytedance.tux.input.TuxTextView r0 = r4.LL
            r0.setTag(r2)
            com.bytedance.tux.input.TuxTextView r0 = r4.LLD
            r0.setTag(r2)
            com.bytedance.tux.input.TuxTextView r0 = r4.LLF
            r0.setTag(r2)
            r0 = 2131365270(0x7f0a0d96, float:1.83504E38)
            r6.setTag(r0, r4)
            r4.LJIIIIZZ()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70862RrW.<init>(android.view.View, X.07t):void");
    }
}
