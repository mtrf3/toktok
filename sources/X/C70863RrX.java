package X;

import android.util.SparseIntArray;
import android.widget.LinearLayout;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.review.IReviewCellStyle;
import com.zhiliaoapp.musically.R;

/* renamed from: X.RrX, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70863RrX extends AbstractC70860RrU {
    public static final SparseIntArray LLFII;
    public final LinearLayout LLFF;
    public long LLFFF;

    @Override // androidx.databinding.ViewDataBinding
    public final void LIZLLL() {
        long j;
        int i;
        int i2;
        synchronized (this) {
            j = this.LLFFF;
            this.LLFFF = 0L;
        }
        IReviewCellStyle iReviewCellStyle = this.LLD;
        long j2 = j & 3;
        if (j2 != 0) {
            if (iReviewCellStyle != null) {
                i = iReviewCellStyle.getItemViewPaddingTop();
                i2 = iReviewCellStyle.getContentMarginTop();
            } else {
                i = 0;
                i2 = 0;
                if (j2 == 0) {
                    return;
                }
            }
            C70864RrY.LIZ(this.LL, null, Integer.valueOf(i2), null);
            C70864RrY.LIZIZ(this.LLFF, null, Integer.valueOf(i), null);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean LJII() {
        synchronized (this) {
            if (this.LLFFF != 0) {
                return true;
            }
            return false;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void LJIIIIZZ() {
        synchronized (this) {
            this.LLFFF = 2L;
        }
        LJIILIIL();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean LJIIJJI(int i, int i2, Object obj) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        LLFII = sparseIntArray;
        sparseIntArray.put(R.id.btb, 1);
    }

    @Override // X.AbstractC70860RrU
    public final void LJIILLIIL(IReviewCellStyle iReviewCellStyle) {
        this.LLD = iReviewCellStyle;
        synchronized (this) {
            this.LLFFF |= 1;
        }
        notifyPropertyChanged(2);
        LJIILIIL();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C70863RrX(android.view.View r5, X.InterfaceC024507t r6) {
        /*
            r4 = this;
            android.util.SparseIntArray r1 = X.C70863RrX.LLFII
            r0 = 2
            r3 = 0
            java.lang.Object[] r2 = androidx.databinding.ViewDataBinding.LJIIJ(r6, r5, r0, r3, r1)
            r0 = 1
            r0 = r2[r0]
            android.view.View r0 = (android.view.View) r0
            r4.<init>(r6, r5, r0)
            r0 = -1
            r4.LLFFF = r0
            r0 = 0
            r0 = r2[r0]
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r4.LLFF = r0
            r0.setTag(r3)
            r0 = 2131365270(0x7f0a0d96, float:1.83504E38)
            r5.setTag(r0, r4)
            r4.LJIIIIZZ()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70863RrX.<init>(android.view.View, X.07t):void");
    }
}
