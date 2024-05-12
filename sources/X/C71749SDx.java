package X;

import android.util.SparseIntArray;
import com.ss.android.ugc.aweme.ecommerce.base.osp.dynamicstyle.payment.IPaymentViewStyle;
import com.zhiliaoapp.musically.R;

/* renamed from: X.SDx, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71749SDx extends SE6 {
    public static final SparseIntArray LLIFFJFJJ;
    public long LLI;

    /* JADX WARN: Removed duplicated region for block: B:13:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0050  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL() {
        /*
            r14 = this;
            monitor-enter(r14)
            long r6 = r14.LLI     // Catch: java.lang.Throwable -> L5f
            r4 = 0
            r14.LLI = r4     // Catch: java.lang.Throwable -> L5f
            monitor-exit(r14)     // Catch: java.lang.Throwable -> L5f
            com.ss.android.ugc.aweme.ecommerce.base.osp.dynamicstyle.payment.IPaymentViewStyle r13 = r14.LLFII
            r11 = 3
            long r1 = r6 & r11
            r8 = 0
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 == 0) goto L5a
            if (r13 == 0) goto L53
            int r3 = r13.getPaymentMethodNameFont()
            boolean r10 = r13.getIconAddVisible()
            int r9 = r13.getPaymentMethodNameMarginStart()
            int r2 = r13.getPaymentMethodIconMarginStart()
            if (r10 == 0) goto L57
            r0 = 8
        L29:
            long r6 = r6 | r0
            if (r10 == 0) goto L50
            r1 = 0
        L2d:
            long r6 = r6 & r11
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 == 0) goto L4f
            com.bytedance.tux.icon.TuxIconView r0 = r14.LLD
            r0.setVisibility(r1)
            com.bytedance.lighten.loader.SmartImageView r1 = r14.LLF
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r2 = 0
            X.C70864RrY.LIZ(r1, r0, r2, r2)
            com.bytedance.tux.input.TuxTextView r1 = r14.LLFF
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)
            X.C70864RrY.LIZ(r1, r0, r2, r2)
            com.bytedance.tux.input.TuxTextView r0 = r14.LLFF
            X.C70865RrZ.LIZ(r3, r8, r0)
        L4f:
            return
        L50:
            r1 = 8
            goto L2d
        L53:
            r2 = 0
            r3 = 0
            r10 = 0
            r9 = 0
        L57:
            r0 = 4
            goto L29
        L5a:
            r2 = 0
            r3 = 0
            r1 = 0
            r9 = 0
            goto L2d
        L5f:
            r0 = move-exception
            monitor-exit(r14)     // Catch: java.lang.Throwable -> L5f
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71749SDx.LIZLLL():void");
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean LJII() {
        synchronized (this) {
            if (this.LLI != 0) {
                return true;
            }
            return false;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void LJIIIIZZ() {
        synchronized (this) {
            this.LLI = 2L;
        }
        LJIILIIL();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean LJIIJJI(int i, int i2, Object obj) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        LLIFFJFJJ = sparseIntArray;
        sparseIntArray.put(R.id.dbs, 4);
        sparseIntArray.put(R.id.b_8, 5);
        sparseIntArray.put(R.id.kp1, 6);
        sparseIntArray.put(R.id.hja, 7);
        sparseIntArray.put(R.id.e8x, 8);
        sparseIntArray.put(R.id.as9, 9);
        sparseIntArray.put(R.id.kzy, 10);
        sparseIntArray.put(R.id.kzn, 11);
        sparseIntArray.put(R.id.lwu, 12);
        sparseIntArray.put(R.id.d2k, 13);
        sparseIntArray.put(R.id.lx6, 14);
        sparseIntArray.put(R.id.lvm, 15);
        sparseIntArray.put(R.id.ea4, 16);
        sparseIntArray.put(R.id.ea6, 17);
        sparseIntArray.put(R.id.j1x, 18);
        sparseIntArray.put(R.id.iln, 19);
        sparseIntArray.put(R.id.evr, 20);
        sparseIntArray.put(R.id.lvl, 21);
        sparseIntArray.put(R.id.lvq, 22);
        sparseIntArray.put(R.id.b5k, 23);
    }

    @Override // X.SE6
    public final void LJIILLIIL(IPaymentViewStyle iPaymentViewStyle) {
        this.LLFII = iPaymentViewStyle;
        synchronized (this) {
            this.LLI |= 1;
        }
        notifyPropertyChanged(2);
        LJIILIIL();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C71749SDx(android.view.View r12, X.InterfaceC024507t r13) {
        /*
            r11 = this;
            android.util.SparseIntArray r1 = X.C71749SDx.LLIFFJFJJ
            r0 = 24
            r2 = 0
            r5 = r12
            r4 = r13
            java.lang.Object[] r1 = androidx.databinding.ViewDataBinding.LJIIJ(r4, r5, r0, r2, r1)
            r0 = 4
            r6 = r1[r0]
            android.widget.FrameLayout r6 = (android.widget.FrameLayout) r6
            r0 = 1
            r7 = r1[r0]
            com.bytedance.tux.icon.TuxIconView r7 = (com.bytedance.tux.icon.TuxIconView) r7
            r0 = 2
            r8 = r1[r0]
            com.bytedance.lighten.loader.SmartImageView r8 = (com.bytedance.lighten.loader.SmartImageView) r8
            r0 = 3
            r9 = r1[r0]
            com.bytedance.tux.input.TuxTextView r9 = (com.bytedance.tux.input.TuxTextView) r9
            r0 = 0
            r10 = r1[r0]
            androidx.constraintlayout.widget.ConstraintLayout r10 = (androidx.constraintlayout.widget.ConstraintLayout) r10
            r3 = r11
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            r0 = -1
            r3.LLI = r0
            com.bytedance.tux.icon.TuxIconView r0 = r3.LLD
            r0.setTag(r2)
            com.bytedance.lighten.loader.SmartImageView r0 = r3.LLF
            r0.setTag(r2)
            com.bytedance.tux.input.TuxTextView r0 = r3.LLFF
            r0.setTag(r2)
            androidx.constraintlayout.widget.ConstraintLayout r0 = r3.LLFFF
            r0.setTag(r2)
            r0 = 2131365270(0x7f0a0d96, float:1.83504E38)
            r5.setTag(r0, r3)
            r3.LJIIIIZZ()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71749SDx.<init>(android.view.View, X.07t):void");
    }
}
