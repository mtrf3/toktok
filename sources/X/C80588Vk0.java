package X;

import Y.ARunnableS50S0100000_14;
import androidx.viewpager.widget.ViewPager;
import com.ss.android.ugc.aweme.base.opensourcemodified.android.support.design.widget.ViewPagerBottomSheetBehavior;

/* renamed from: X.Vk0, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80588Vk0 extends C1CZ {
    public final ViewPager LJLIL;
    public final ViewPagerBottomSheetBehavior LJLILLLLZI;

    @Override // X.C1CZ, X.C0C3
    public final void onPageSelected(int i) {
        this.LJLIL.post(new ARunnableS50S0100000_14(this, 55));
    }

    public C80588Vk0(ViewPager viewPager, ViewPagerBottomSheetBehavior viewPagerBottomSheetBehavior) {
        this.LJLIL = viewPager;
        this.LJLILLLLZI = viewPagerBottomSheetBehavior;
    }
}
