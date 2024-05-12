package X;

import Y.IDiS275S0100000_14;
import android.content.Context;
import android.util.AttributeSet;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* renamed from: X.VpR, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80925VpR extends TuxTextView {
    public C80766Vms LJLLLL;
    public int LJLLLLLL;
    public final IDiS275S0100000_14 LJLZ;

    public int getCurrentItem() {
        C80766Vms c80766Vms = this.LJLLLL;
        if (c80766Vms != null) {
            return c80766Vms.getCurrentItem() % this.LJLLLLLL;
        }
        return -1;
    }

    public void setRealSize(int i) {
        if (i > 0) {
            this.LJLLLLLL = i;
        }
    }

    public void setViewPager(C80766Vms c80766Vms) {
        if (c80766Vms != null && c80766Vms.getAdapter() != null) {
            this.LJLLLL = c80766Vms;
            c80766Vms.LJJIIJ(this.LJLZ);
            this.LJLLLL.LJFF(this.LJLZ);
            this.LJLZ.onPageSelected(this.LJLLLL.getCurrentItem());
        }
    }

    public C80925VpR(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LJLZ = new IDiS275S0100000_14(this, 3);
        setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.dk, getContext()));
        setTuxFont(33);
    }
}
