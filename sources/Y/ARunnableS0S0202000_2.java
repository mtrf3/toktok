package Y;

import X.C161416Vd;
import X.C63E;
import X.C66Y;
import X.C67P;
import X.C6CT;
import X.InterfaceC1543363x;
import X.InterfaceC1549166d;
import android.graphics.Rect;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.editSticker.interact.hit.StickerHintTextViewModel;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public class ARunnableS0S0202000_2 implements Runnable {
    public final int $t;
    public int i2;
    public int i3;
    public Object l0;
    public Object l1;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            case 2:
                run$2(this);
                return;
            case 3:
                run$3(this);
                return;
            case 4:
                run$4(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        StickerHintTextViewModel stickerHintTextViewModel = ((C63E) this.l0).LJZL;
        if (stickerHintTextViewModel != null) {
            MutableLiveData<C6CT> hv0 = stickerHintTextViewModel.hv0();
            float width = (((C67P) this.l1).getHelpRect().width() / 2.0f) + ((C67P) this.l1).getHelpRect().left;
            float f = ((C67P) this.l1).getHelpRect().top;
            String string = ((C63E) this.l0).LJLIL.getString(this.i2);
            o.LJIIIIZZ(string, "activity.getString(hintTextResId)");
            hv0.postValue(new C6CT(width, f, this.i3, string));
            InterfaceC1543363x interfaceC1543363x = ((C63E) this.l0).LLII;
            if (interfaceC1543363x != null) {
                interfaceC1543363x.LIZLLL();
                return;
            }
            return;
        }
        o.LJIJI("hintTextViewModel");
        throw null;
    }

    public static final void run$0(ARunnableS0S0202000_2 aRunnableS0S0202000_2) {
        boolean LIZ;
        try {
            aRunnableS0S0202000_2.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS0S0202000_2 aRunnableS0S0202000_2) {
        C66Y c66y = (C66Y) aRunnableS0S0202000_2.l0;
        int i = aRunnableS0S0202000_2.i2;
        int i2 = aRunnableS0S0202000_2.i3;
        int[] iArr = (int[]) aRunnableS0S0202000_2.l1;
        c66y.getClass();
        if (i == 0 || i2 == 0 || iArr == null) {
            return;
        }
        int i3 = iArr[1];
        c66y.LLIIIZ = new Rect(0, i3, i, i2 + i3);
    }

    public static final void run$2(ARunnableS0S0202000_2 aRunnableS0S0202000_2) {
        C66Y c66y = (C66Y) aRunnableS0S0202000_2.l0;
        c66y.LJIJJLI(aRunnableS0S0202000_2.i2, aRunnableS0S0202000_2.i3, (InterfaceC1549166d) aRunnableS0S0202000_2.l1);
        c66y.LJIJJ();
    }

    public static final void run$3(ARunnableS0S0202000_2 aRunnableS0S0202000_2) {
        C161416Vd c161416Vd = (C161416Vd) aRunnableS0S0202000_2.l0;
        c161416Vd.LJIILIIL(aRunnableS0S0202000_2.i2, aRunnableS0S0202000_2.i3, (InterfaceC1549166d) aRunnableS0S0202000_2.l1);
        c161416Vd.LJIIL();
    }

    public static final void run$4(ARunnableS0S0202000_2 aRunnableS0S0202000_2) {
        C161416Vd c161416Vd = (C161416Vd) aRunnableS0S0202000_2.l0;
        int i = aRunnableS0S0202000_2.i2;
        int i2 = aRunnableS0S0202000_2.i3;
        int[] iArr = (int[]) aRunnableS0S0202000_2.l1;
        c161416Vd.getClass();
        if (i == 0 || i2 == 0 || iArr == null) {
            return;
        }
        int i3 = iArr[1];
        new Rect(0, i3, i, i2 + i3);
    }

    public ARunnableS0S0202000_2(Object obj, int i, int i2, Object obj2, int i3) {
        this.$t = i3;
        this.l0 = obj;
        this.i2 = i;
        this.i3 = i2;
        this.l1 = obj2;
    }
}
