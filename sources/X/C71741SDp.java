package X;

import android.util.SparseIntArray;
import android.view.View;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.SDp, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71741SDp extends SE1 implements SEN {
    public static final SparseIntArray LLIIIL;
    public final C1A9 LLIFFJFJJ;
    public final SEM LLII;
    public final SEM LLIIII;
    public final SEM LLIIIILZ;
    public long LLIIIJ;

    @Override // androidx.databinding.ViewDataBinding
    public final boolean LJII() {
        synchronized (this) {
            if (this.LLIIIJ != 0) {
                return true;
            }
            return false;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void LJIIIIZZ() {
        synchronized (this) {
            this.LLIIIJ = 8L;
        }
        LJIILIIL();
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        LLIIIL = sparseIntArray;
        sparseIntArray.put(R.id.k84, 9);
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x01a3, code lost:
    
        if (kotlin.jvm.internal.o.LJ(r8, r9) != false) goto L56;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a6  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL() {
        /*
            Method dump skipped, instructions count: 611
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71741SDp.LIZLLL():void");
    }

    @Override // X.SE1
    public final void LJIILLIIL(C71739SDn c71739SDn) {
        this.LLI = c71739SDn;
        synchronized (this) {
            this.LLIIIJ |= 4;
        }
        notifyPropertyChanged(1);
        LJIILIIL();
    }

    public final boolean LJIIZILJ(int i) {
        if (i == 0) {
            synchronized (this) {
                this.LLIIIJ |= 2;
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C71741SDp(android.view.View r17, X.InterfaceC024507t r18) {
        /*
            r16 = this;
            android.util.SparseIntArray r1 = X.C71741SDp.LLIIIL
            r0 = 10
            r4 = 0
            r8 = r17
            r7 = r18
            java.lang.Object[] r5 = androidx.databinding.ViewDataBinding.LJIIJ(r7, r8, r0, r4, r1)
            r2 = 2
            r9 = r5[r2]
            X.T5T r9 = (X.T5T) r9
            r3 = 3
            r10 = r5[r3]
            com.bytedance.tux.icon.TuxIconView r10 = (com.bytedance.tux.icon.TuxIconView) r10
            r0 = 4
            r11 = r5[r0]
            com.bytedance.tux.icon.TuxIconView r11 = (com.bytedance.tux.icon.TuxIconView) r11
            r0 = 6
            r12 = r5[r0]
            X.5FY r12 = (X.C5FY) r12
            r0 = 5
            r13 = r5[r0]
            com.bytedance.tux.icon.TuxIconView r13 = (com.bytedance.tux.icon.TuxIconView) r13
            r0 = 7
            r1 = r5[r0]
            com.bytedance.tux.icon.TuxIconView r1 = (com.bytedance.tux.icon.TuxIconView) r1
            r0 = 8
            r0 = r5[r0]
            com.bytedance.tux.input.TuxTextView r0 = (com.bytedance.tux.input.TuxTextView) r0
            r6 = r16
            r14 = r1
            r15 = r0
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r0 = -1
            r6.LLIIIJ = r0
            X.T5T r0 = r6.LL
            r0.setTag(r4)
            com.bytedance.tux.icon.TuxIconView r0 = r6.LLD
            r0.setTag(r4)
            com.bytedance.tux.icon.TuxIconView r0 = r6.LLF
            r0.setTag(r4)
            X.5FY r0 = r6.LLFF
            r0.setTag(r4)
            com.bytedance.tux.icon.TuxIconView r0 = r6.LLFFF
            r0.setTag(r4)
            com.bytedance.tux.icon.TuxIconView r0 = r6.LLFII
            r0.setTag(r4)
            r0 = 0
            r0 = r5[r0]
            android.view.View r0 = (android.view.View) r0
            r0.setTag(r4)
            r1 = 1
            r0 = r5[r1]
            X.1A9 r0 = (X.C1A9) r0
            r6.LLIFFJFJJ = r0
            r0.setTag(r4)
            com.bytedance.tux.input.TuxTextView r0 = r6.LLFZ
            r0.setTag(r4)
            r0 = 2131365270(0x7f0a0d96, float:1.83504E38)
            r8.setTag(r0, r6)
            X.SEM r0 = new X.SEM
            r0.<init>(r6, r3)
            r6.LLII = r0
            X.SEM r0 = new X.SEM
            r0.<init>(r6, r1)
            r6.LLIIII = r0
            X.SEM r0 = new X.SEM
            r0.<init>(r6, r2)
            r6.LLIIIILZ = r0
            r6.LJIIIIZZ()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71741SDp.<init>(android.view.View, X.07t):void");
    }

    @Override // X.SEN
    public final void LIZ(int i, View v) {
        C71742SDq c71742SDq;
        if (i != 1) {
            if (i != 2) {
                if (i != 3 || (c71742SDq = this.LLI) == null) {
                    return;
                }
                C71739SDn c71739SDn = (C71739SDn) c71742SDq;
                c71739SDn.LJ(c71739SDn.LJLJLLL.LJIIL(""));
                return;
            }
            C71742SDq c71742SDq2 = this.LLI;
            if (c71742SDq2 == null) {
                return;
            }
            c71742SDq2.getClass();
            o.LJIIIZ(v, "v");
            C71746SDu<C71740SDo> stateOwner = c71742SDq2.LJLJJI;
            AqS178S0100000_12 aqS178S0100000_12 = new AqS178S0100000_12(v, 368);
            o.LJIIIZ(stateOwner, "stateOwner");
            aqS178S0100000_12.invoke(stateOwner.LIZ);
            return;
        }
        C71742SDq c71742SDq3 = this.LLI;
        if (c71742SDq3 == null) {
            return;
        }
        c71742SDq3.getClass();
        o.LJIIIZ(v, "v");
        c71742SDq3.LIZLLL(C71738SDm.LIZ);
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean LJIIJJI(int i, int i2, Object obj) {
        if (i != 0) {
            if (i != 1) {
                return false;
            }
            return LJIIZILJ(i2);
        }
        if (i2 != 0) {
            return false;
        }
        synchronized (this) {
            this.LLIIIJ |= 1;
        }
        return true;
    }
}
