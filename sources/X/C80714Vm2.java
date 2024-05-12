package X;

import android.database.DataSetObserver;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

/* renamed from: X.Vm2, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80714Vm2 extends DataSetObserver {
    public final PagerAdapter LIZ;
    public final C80713Vm1 LIZIZ;
    public final /* synthetic */ C80713Vm1 LIZJ;

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        ViewPager viewPager = this.LIZJ.LJLILLLLZI;
        if (viewPager != null) {
            viewPager.requestLayout();
        }
        C80766Vms c80766Vms = this.LIZJ.LJLJI;
        if (c80766Vms != null) {
            c80766Vms.requestLayout();
        }
        this.LIZIZ.setUpViews(this.LIZ);
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        ViewPager viewPager = this.LIZJ.LJLILLLLZI;
        if (viewPager != null) {
            viewPager.requestLayout();
        }
        C80766Vms c80766Vms = this.LIZJ.LJLJI;
        if (c80766Vms != null) {
            c80766Vms.requestLayout();
        }
        this.LIZIZ.setUpViews(this.LIZ);
    }

    public C80714Vm2(C80713Vm1 c80713Vm1, C80713Vm1 c80713Vm12, PagerAdapter pagerAdapter) {
        this.LIZJ = c80713Vm1;
        this.LIZ = pagerAdapter;
        this.LIZIZ = c80713Vm12;
    }
}
