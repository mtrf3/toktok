package X;

import Y.ALAdapterS12S0100000_15;
import Y.AUListenerS102S0100000_15;
import Y.IDCListenerS117S0200000_15;
import android.animation.ValueAnimator;
import android.view.View;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class Y45 implements Y42 {
    public boolean LJLILLLLZI;
    public InterfaceC218588hy LJLJI;
    public C75O LJLJJI;
    public int LJLJJLL;
    public int LJLIL = 1;
    public WeakReference<TuxSheet> LJLJJL = new WeakReference<>(null);

    @Override // X.InterfaceC25830ABu
    public final boolean LJIIJ() {
        return false;
    }

    @Override // X.Y42
    public final void P9(TuxSheet tuxSheet) {
        this.LJLJJL = new WeakReference<>(tuxSheet);
    }

    @Override // X.Y42
    public final void e3(View view) {
        o.LJIIIZ(view, "view");
        Y46 y46 = new Y46(this, view);
        view.getViewTreeObserver().addOnGlobalLayoutListener(y46);
        view.addOnAttachStateChangeListener(new IDCListenerS117S0200000_15(view, y46, 1));
    }

    @Override // X.Y42
    public final void hd(int i) {
        if (i == 4 && this.LJLIL == 0 && !this.LJLILLLLZI) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            ofFloat.setDuration(300L);
            ofFloat.setInterpolator(C55953Lxd.LIZLLL());
            ofFloat.addUpdateListener(new AUListenerS102S0100000_15(this, 19));
            ofFloat.addListener(new ALAdapterS12S0100000_15(this, 19));
            ofFloat.start();
        }
        InterfaceC218588hy interfaceC218588hy = this.LJLJI;
        if (interfaceC218588hy != null) {
            interfaceC218588hy.LIZ(this.LJLIL, i);
        }
        this.LJLIL = i;
    }

    @Override // X.InterfaceC25830ABu
    public final void I7(TuxSheet sheet, float f) {
        o.LJIIIZ(sheet, "sheet");
        if (this.LJLJJLL == 0) {
            View view = sheet.getView();
            if (view != null) {
                this.LJLJJLL = view.getMeasuredHeight();
            } else {
                return;
            }
        }
        float f2 = this.LJLJJLL * f;
        if (!Float.isInfinite(f2) && !Float.isNaN(f2)) {
            int LJJIIZ = O6R.LJJIIZ(f2) + this.LJLJJLL;
            C75O c75o = this.LJLJJI;
            if (c75o != null) {
                c75o.O4(LJJIIZ, this.LJLJJLL);
            }
        }
    }

    @Override // X.InterfaceC25830ABu
    public final void Pg(TuxSheet sheet, int i) {
        o.LJIIIZ(sheet, "sheet");
        boolean z = false;
        Integer num = 0;
        if (i == 2) {
            z = true;
        }
        this.LJLILLLLZI = z;
        if (i != 1) {
            if (i != 3 && i != 4) {
                if (i != 5) {
                    return;
                } else {
                    num = 1;
                }
            }
        } else {
            num = 2;
        }
        if (num == null) {
            return;
        }
        int intValue = num.intValue();
        InterfaceC218588hy interfaceC218588hy = this.LJLJI;
        if (interfaceC218588hy != null) {
            interfaceC218588hy.LIZ(this.LJLIL, intValue);
        }
        this.LJLIL = intValue;
    }

    @Override // X.Y42
    public final void kl(Y43 y43, Y41 y41) {
        this.LJLJI = y43;
        this.LJLJJI = y41;
    }
}
