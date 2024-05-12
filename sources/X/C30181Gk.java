package X;

import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

/* renamed from: X.1Gk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C30181Gk implements C0C2 {
    public boolean LJLIL;
    public final /* synthetic */ C0KV LJLILLLLZI;

    public C30181Gk(C0KV c0kv) {
        this.LJLILLLLZI = c0kv;
    }

    @Override // X.C0C2
    public final void LIZIZ(ViewPager viewPager, PagerAdapter pagerAdapter, PagerAdapter pagerAdapter2) {
        C0KV c0kv = this.LJLILLLLZI;
        if (c0kv.LLIIJLIL == viewPager) {
            c0kv.LJIILL(pagerAdapter2, this.LJLIL);
        }
    }
}
