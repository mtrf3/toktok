package Y;

import X.AnonymousClass671;
import X.C158986Lu;
import X.C66Y;
import X.C6PB;
import X.C76800UCe;
import X.InterfaceC150675vj;
import X.InterfaceC153045zY;
import X.InterfaceC65784Pro;
import X.InterpolatorC61446O9q;
import X.V3N;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.widget.FrameLayout;
import com.ss.android.vesdk.VESize;

/* loaded from: classes3.dex */
public class ARunnableS4S0210000_2 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public boolean z2;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        int i;
        int i2;
        int i3;
        int i4;
        float f;
        C158986Lu c158986Lu = (C158986Lu) this.l0;
        boolean z = this.z2;
        c158986Lu.getClass();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        if (z) {
            i = c158986Lu.LJLJLLL;
            i2 = c158986Lu.LJLL;
            i3 = c158986Lu.LJLLI;
            i4 = c158986Lu.LJLLILLLL;
            f = c158986Lu.LJLLLL;
        } else {
            i = c158986Lu.LJLL;
            i2 = c158986Lu.LJLJLLL;
            i3 = c158986Lu.LJLLILLLL;
            i4 = c158986Lu.LJLLI;
            f = 1.0f / c158986Lu.LJLLLL;
        }
        ofFloat.addUpdateListener(new AUListenerS0S0114001_2(c158986Lu, z, i, i2, f, i3, i4, 0));
        ofFloat.setDuration(300L);
        ofFloat.setInterpolator(new InterpolatorC61446O9q(0.25d, 0.1d, 0.1d));
        ofFloat.start();
        ((InterfaceC65784Pro) this.l1).invoke();
    }

    public static final void run$0(ARunnableS4S0210000_2 aRunnableS4S0210000_2) {
        boolean LIZ;
        try {
            aRunnableS4S0210000_2.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS4S0210000_2 aRunnableS4S0210000_2) {
        VESize LLILZ;
        int i;
        int i2;
        C66Y c66y = (C66Y) aRunnableS4S0210000_2.l0;
        FrameLayout frameLayout = (FrameLayout) aRunnableS4S0210000_2.l1;
        boolean z = aRunnableS4S0210000_2.z2;
        InterfaceC153045zY interfaceC153045zY = c66y.LJZI;
        if (interfaceC153045zY == null || (i = (LLILZ = interfaceC153045zY.LLILZ()).width) == 0 || (i2 = LLILZ.height) == 0) {
            return;
        }
        c66y.LLIIIJ = V3N.LJJIJLIJ(i, i2, frameLayout)[0];
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
        int i3 = layoutParams.topMargin;
        c66y.LLIIIZ = new Rect(0, i3, layoutParams.width, layoutParams.height + i3);
        InterfaceC150675vj interfaceC150675vj = C6PB.LIZLLL().LIZLLL;
        if (interfaceC150675vj == null) {
            return;
        }
        AnonymousClass671 LIZLLL = interfaceC150675vj.LIZLLL(c66y.LLIIIJ, c66y.LJLIL);
        c66y.LLIIJLIL = LIZLLL;
        LIZLLL.setEnableFakeFeedView(z);
        frameLayout.addView(c66y.LLIIJLIL.getContentView());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ARunnableS4S0210000_2(Object obj, C158986Lu c158986Lu, boolean z, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        this.$t = interfaceC65784Pro;
        this.l0 = obj;
        this.z2 = c158986Lu;
        this.l1 = z;
    }
}
