package X;

import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.tux.input.TuxTextView;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class A21 {
    public InterfaceC88472Yns<? super FrameLayout, C76800UCe> LIZ;
    public long LIZIZ;
    public boolean LIZJ;
    public CharSequence LIZLLL;
    public CharSequence LJ;
    public CharSequence LJFF;
    public int LJI;
    public final Integer LJII;
    public int LJIIIIZZ;
    public int LJIIIZ;
    public final View.OnClickListener LJIIJ;
    public View.OnClickListener LJIIJJI;
    public InterfaceC88472Yns<? super Integer, C76800UCe> LJIIL;
    public boolean LJIILIIL;
    public final InterfaceC88471Ynr<? super TuxTextView, ? super TuxTextView, Integer> LJIILJJIL;

    public A21() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A21)) {
            return false;
        }
        A21 a21 = (A21) obj;
        return o.LJ(this.LIZ, a21.LIZ) && this.LIZIZ == a21.LIZIZ && this.LIZJ == a21.LIZJ && o.LJ(this.LIZLLL, a21.LIZLLL) && o.LJ(this.LJ, a21.LJ) && o.LJ(this.LJFF, a21.LJFF) && this.LJI == a21.LJI && o.LJ(this.LJII, a21.LJII) && this.LJIIIIZZ == a21.LJIIIIZZ && this.LJIIIZ == a21.LJIIIZ && o.LJ(this.LJIIJ, a21.LJIIJ) && o.LJ(this.LJIIJJI, a21.LJIIJJI) && o.LJ(this.LJIIL, a21.LJIIL) && this.LJIILIIL == a21.LJIILIIL && o.LJ(this.LJIILJJIL, a21.LJIILJJIL);
    }

    public final String toString() {
        return "TuxFloatingNoticeBundle(startSlot=" + this.LIZ + ", duration=" + this.LIZIZ + ", needAutoDismiss=" + this.LIZJ + ", title=" + ((Object) this.LIZLLL) + ", msg=" + ((Object) this.LJ) + ", btnText=" + ((Object) this.LJFF) + ", btnWidth=" + this.LJI + ", btnVariant=" + this.LJII + ", bottomMargin=" + this.LJIIIIZZ + ", endVariant=" + this.LJIIIZ + ", clickListener=" + this.LJIIJ + ", btnClickListener=" + this.LJIIJJI + ", dismissListener=" + this.LJIIL + ", showWithView=" + this.LJIILIIL + ", endAlignmentRule=" + this.LJIILJJIL + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        InterfaceC88472Yns<? super FrameLayout, C76800UCe> interfaceC88472Yns = this.LIZ;
        int i = 0;
        if (interfaceC88472Yns == null) {
            hashCode = 0;
        } else {
            hashCode = interfaceC88472Yns.hashCode();
        }
        int LIZJ = JBR.LIZJ(this.LIZIZ, hashCode * 31, 31);
        boolean z = this.LIZJ;
        int i2 = 1;
        int i3 = z;
        if (z != 0) {
            i3 = 1;
        }
        int i4 = (LIZJ + i3) * 31;
        CharSequence charSequence = this.LIZLLL;
        if (charSequence == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = charSequence.hashCode();
        }
        int i5 = (i4 + hashCode2) * 31;
        CharSequence charSequence2 = this.LJ;
        if (charSequence2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = charSequence2.hashCode();
        }
        int i6 = (i5 + hashCode3) * 31;
        CharSequence charSequence3 = this.LJFF;
        if (charSequence3 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = charSequence3.hashCode();
        }
        int i7 = (((i6 + hashCode4) * 31) + this.LJI) * 31;
        Integer num = this.LJII;
        if (num == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = num.hashCode();
        }
        int i8 = (((((i7 + hashCode5) * 31) + this.LJIIIIZZ) * 31) + this.LJIIIZ) * 31;
        View.OnClickListener onClickListener = this.LJIIJ;
        if (onClickListener == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = onClickListener.hashCode();
        }
        int i9 = (i8 + hashCode6) * 31;
        View.OnClickListener onClickListener2 = this.LJIIJJI;
        if (onClickListener2 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = onClickListener2.hashCode();
        }
        int i10 = (i9 + hashCode7) * 31;
        InterfaceC88472Yns<? super Integer, C76800UCe> interfaceC88472Yns2 = this.LJIIL;
        if (interfaceC88472Yns2 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = interfaceC88472Yns2.hashCode();
        }
        int i11 = (i10 + hashCode8) * 31;
        if (!this.LJIILIIL) {
            i2 = 0;
        }
        int i12 = (i11 + i2) * 31;
        InterfaceC88471Ynr<? super TuxTextView, ? super TuxTextView, Integer> interfaceC88471Ynr = this.LJIILJJIL;
        if (interfaceC88471Ynr != null) {
            i = interfaceC88471Ynr.hashCode();
        }
        return i12 + i;
    }

    public A21(Object obj) {
        int LIZIZ = C7MY.LIZIZ(80);
        int LIZIZ2 = C7MY.LIZIZ(36);
        this.LIZ = null;
        this.LIZIZ = 3000L;
        this.LIZJ = true;
        this.LIZLLL = null;
        this.LJ = null;
        this.LJFF = null;
        this.LJI = LIZIZ;
        this.LJII = null;
        this.LJIIIIZZ = LIZIZ2;
        this.LJIIIZ = 0;
        this.LJIIJ = null;
        this.LJIIJJI = null;
        this.LJIIL = null;
        this.LJIILIIL = false;
        this.LJIILJJIL = null;
    }
}
