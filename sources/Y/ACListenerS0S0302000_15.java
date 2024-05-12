package Y;

import X.C86904Y8u;
import X.InterfaceC86908Y8y;
import X.VW9;
import android.view.View;
import androidx.viewpager.widget.ViewPager;

/* loaded from: classes16.dex */
public class ACListenerS0S0302000_15 implements View.OnClickListener {
    public final int $t;
    public int i3;
    public int i4;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                return;
            case 1:
                onClick$1(this, view);
                return;
            case 2:
                onClick$2(this, view);
                return;
            default:
                return;
        }
    }

    public static final void onClick$0(ACListenerS0S0302000_15 aCListenerS0S0302000_15, View view) {
        C86904Y8u c86904Y8u = (C86904Y8u) aCListenerS0S0302000_15.l0;
        InterfaceC86908Y8y interfaceC86908Y8y = (InterfaceC86908Y8y) aCListenerS0S0302000_15.l1;
        int i = aCListenerS0S0302000_15.i3;
        ViewPager viewPager = (ViewPager) aCListenerS0S0302000_15.l2;
        int i2 = aCListenerS0S0302000_15.i4;
        if (!c86904Y8u.LJLJL) {
            return;
        }
        if (interfaceC86908Y8y != null) {
            interfaceC86908Y8y.LIZJ(i);
        }
        viewPager.setCurrentItem(i2);
    }

    public static final void onClick$1(ACListenerS0S0302000_15 aCListenerS0S0302000_15, View view) {
        C86904Y8u c86904Y8u = (C86904Y8u) aCListenerS0S0302000_15.l0;
        InterfaceC86908Y8y interfaceC86908Y8y = (InterfaceC86908Y8y) aCListenerS0S0302000_15.l1;
        int i = aCListenerS0S0302000_15.i3;
        ViewPager viewPager = (ViewPager) aCListenerS0S0302000_15.l2;
        int i2 = aCListenerS0S0302000_15.i4;
        if (!c86904Y8u.LJLJL) {
            return;
        }
        if (interfaceC86908Y8y != null) {
            interfaceC86908Y8y.LIZJ(i);
        }
        viewPager.setCurrentItem(i2);
    }

    public static final void onClick$2(ACListenerS0S0302000_15 aCListenerS0S0302000_15, View view) {
        C86904Y8u c86904Y8u = (C86904Y8u) aCListenerS0S0302000_15.l0;
        InterfaceC86908Y8y interfaceC86908Y8y = (InterfaceC86908Y8y) aCListenerS0S0302000_15.l1;
        int i = aCListenerS0S0302000_15.i3;
        ViewPager viewPager = (ViewPager) aCListenerS0S0302000_15.l2;
        int i2 = aCListenerS0S0302000_15.i4;
        if (!c86904Y8u.LJLJL) {
            return;
        }
        if (interfaceC86908Y8y != null) {
            interfaceC86908Y8y.LIZJ(i);
        }
        viewPager.setCurrentItem(i2);
    }

    public ACListenerS0S0302000_15(C86904Y8u c86904Y8u, InterfaceC86908Y8y interfaceC86908Y8y, int i, VW9 vw9, int i2, int i3) {
        this.$t = i3;
        this.l0 = c86904Y8u;
        this.l1 = interfaceC86908Y8y;
        this.i3 = i;
        this.l2 = vw9;
        this.i4 = i2;
    }
}
