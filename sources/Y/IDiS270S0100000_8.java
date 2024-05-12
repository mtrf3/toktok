package Y;

import X.C0C3;
import X.EnumC223268pW;
import com.ss.android.ugc.aweme.base.HomePageViewPagerAbility;
import com.ss.android.ugc.aweme.ecomsearch.ui.EcSearchContainerFragment;
import com.ss.android.ugc.feed.platform.panel.autoscroll.AutoScrollComponent;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public class IDiS270S0100000_8 implements C0C3 {
    public final int $t;
    public Object l0;

    public static final void onPageScrollStateChanged$0(IDiS270S0100000_8 iDiS270S0100000_8, int i) {
    }

    public static final void onPageScrollStateChanged$1(IDiS270S0100000_8 iDiS270S0100000_8, int i) {
    }

    public static final void onPageScrolled$1(IDiS270S0100000_8 iDiS270S0100000_8, int i, float f, int i2) {
    }

    public static final void onPageSelected$0(IDiS270S0100000_8 iDiS270S0100000_8, int i) {
    }

    @Override // X.C0C3
    public final void onPageScrollStateChanged(int i) {
        switch (this.$t) {
            case 0:
                onPageScrollStateChanged$0(this, i);
                return;
            case 1:
                onPageScrollStateChanged$1(this, i);
                return;
            default:
                return;
        }
    }

    @Override // X.C0C3
    public final void onPageScrolled(int i, float f, int i2) {
        switch (this.$t) {
            case 0:
                onPageScrolled$0(this, i, f, i2);
                return;
            case 1:
                onPageScrolled$1(this, i, f, i2);
                return;
            default:
                return;
        }
    }

    @Override // X.C0C3
    public final void onPageSelected(int i) {
        switch (this.$t) {
            case 0:
                onPageSelected$0(this, i);
                return;
            case 1:
                onPageSelected$1(this, i);
                return;
            default:
                return;
        }
    }

    public IDiS270S0100000_8(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onPageSelected$1(IDiS270S0100000_8 iDiS270S0100000_8, int i) {
        String str;
        EnumC223268pW enumC223268pW;
        AutoScrollComponent autoScrollComponent = (AutoScrollComponent) iDiS270S0100000_8.l0;
        if (autoScrollComponent.LJLLJ == EnumC223268pW.AUTO_SCROLL_STATE_STOP) {
            return;
        }
        HomePageViewPagerAbility homePageViewPagerAbility = (HomePageViewPagerAbility) autoScrollComponent.LLFFF.getValue();
        if (homePageViewPagerAbility != null) {
            str = homePageViewPagerAbility.zb0(i);
        } else {
            str = null;
        }
        if (!o.LJ(str, "page_feed")) {
            enumC223268pW = EnumC223268pW.AUTO_SCROLL_STATE_PAUSE;
        } else {
            enumC223268pW = EnumC223268pW.AUTO_SCROLL_STATE_START;
        }
        autoScrollComponent.LJLLJ = enumC223268pW;
    }

    public static final void onPageScrolled$0(IDiS270S0100000_8 iDiS270S0100000_8, int i, float f, int i2) {
        EcSearchContainerFragment ecSearchContainerFragment = (EcSearchContainerFragment) iDiS270S0100000_8.l0;
        if (ecSearchContainerFragment.LJLILLLLZI && f == 0.0f && i2 == 0) {
            ecSearchContainerFragment.wl();
            ((EcSearchContainerFragment) iDiS270S0100000_8.l0).LJLILLLLZI = false;
        }
    }
}
