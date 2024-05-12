package X;

import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.SDs, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71744SDs extends SE5 implements SEN {
    public static final C023907n LLI;
    public final SEM LLFII;
    public long LLFZ;

    @Override // androidx.databinding.ViewDataBinding
    public final void LIZLLL() {
        long j;
        SE0 se0;
        String str;
        synchronized (this) {
            j = this.LLFZ;
            this.LLFZ = 0L;
        }
        C71739SDn c71739SDn = this.LLFFF;
        SEF sef = this.LLFF;
        long j2 = 10 & j;
        long j3 = 12 & j;
        if (j3 != 0 && sef != null) {
            se0 = sef.LJLILLLLZI;
            str = sef.LJLIL;
        } else {
            se0 = null;
            str = null;
        }
        if (j2 != 0) {
            this.LL.LJIILLIIL(c71739SDn);
        }
        if ((j & 8) != 0) {
            C16880lQ.LJJJ(this.LLD, this.LLFII);
        }
        if (j3 != 0) {
            C71745SDt.LIZIZ(this.LLD, se0);
            C16M.LIZ(this.LLF, str);
        }
        this.LL.LJ();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean LJII() {
        synchronized (this) {
            if (this.LLFZ != 0) {
                return true;
            }
            if (this.LL.LJII()) {
                return true;
            }
            return false;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void LJIIIIZZ() {
        synchronized (this) {
            this.LLFZ = 8L;
        }
        this.LL.LJIIIIZZ();
        LJIILIIL();
    }

    static {
        C023907n c023907n = new C023907n();
        LLI = c023907n;
        int[] iArr = new int[1];
        iArr[0] = 3;
        int[] iArr2 = new int[1];
        iArr2[0] = R.layout.zk;
        c023907n.LIZ[0] = new String[]{"commerce_input_form"};
        c023907n.LIZIZ[0] = iArr;
        c023907n.LIZJ[0] = iArr2;
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void LJIILJJIL(LifecycleOwner lifecycleOwner) {
        super.LJIILJJIL(lifecycleOwner);
        this.LL.LJIILJJIL(lifecycleOwner);
    }

    @Override // X.SE5
    public final void LJIILLIIL(C71739SDn c71739SDn) {
        this.LLFFF = c71739SDn;
        synchronized (this) {
            this.LLFZ |= 2;
        }
        notifyPropertyChanged(1);
        LJIILIIL();
    }

    @Override // X.SE5
    public final void LJIIZILJ(SEF sef) {
        this.LLFF = sef;
        synchronized (this) {
            this.LLFZ |= 4;
        }
        notifyPropertyChanged(3);
        LJIILIIL();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C71744SDs(android.view.View r12, X.InterfaceC024507t r13) {
        /*
            r11 = this;
            X.07n r1 = X.C71744SDs.LLI
            r0 = 4
            r3 = 0
            r7 = r12
            r6 = r13
            java.lang.Object[] r4 = androidx.databinding.ViewDataBinding.LJIIJ(r6, r7, r0, r1, r3)
            r0 = 3
            r8 = r4[r0]
            X.SE1 r8 = (X.SE1) r8
            r0 = 2
            r9 = r4[r0]
            com.bytedance.tux.icon.TuxIconView r9 = (com.bytedance.tux.icon.TuxIconView) r9
            r2 = 1
            r10 = r4[r2]
            com.bytedance.tux.input.TuxTextView r10 = (com.bytedance.tux.input.TuxTextView) r10
            r5 = r11
            r5.<init>(r6, r7, r8, r9, r10)
            r0 = -1
            r5.LLFZ = r0
            X.SE1 r0 = r5.LL
            if (r0 == 0) goto L27
            r0.LJLLI = r5
        L27:
            r0 = 0
            r0 = r4[r0]
            android.view.View r0 = (android.view.View) r0
            r0.setTag(r3)
            com.bytedance.tux.icon.TuxIconView r0 = r5.LLD
            r0.setTag(r3)
            com.bytedance.tux.input.TuxTextView r0 = r5.LLF
            r0.setTag(r3)
            r0 = 2131365270(0x7f0a0d96, float:1.83504E38)
            r7.setTag(r0, r5)
            X.SEM r0 = new X.SEM
            r0.<init>(r5, r2)
            r5.LLFII = r0
            r5.LJIIIIZZ()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71744SDs.<init>(android.view.View, X.07t):void");
    }

    @Override // X.SEN
    public final void LIZ(int i, View v) {
        C71739SDn c71739SDn = this.LLFFF;
        if (c71739SDn != null) {
            c71739SDn.getClass();
            o.LJIIIZ(v, "v");
            c71739SDn.LIZLLL(C71738SDm.LIZ);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean LJIIJJI(int i, int i2, Object obj) {
        if (i != 0 || i2 != 0) {
            return false;
        }
        synchronized (this) {
            this.LLFZ |= 1;
        }
        return true;
    }
}
