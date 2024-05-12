package Y;

import X.A9D;
import X.A9F;
import X.A9H;
import X.C0C3;
import X.C188727au;
import X.C247419nN;
import X.C26373AWr;
import X.C2U8;
import X.C32I;
import X.C77266UUc;
import X.C86783as;
import X.FMX;
import X.HG3;
import X.OO3;
import X.RBX;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.base.HomePageViewPagerAbility;
import com.ss.android.ugc.aweme.base.mainfragment.HomeViewPagerAbility;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewCell;
import com.ss.android.ugc.aweme.inbox.newfollowerpage.InboxNewFollowerTabFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public class IDiS268S0100000_4 implements C0C3 {
    public final int $t;
    public Object l0;

    public static final void onPageScrollStateChanged$0(IDiS268S0100000_4 iDiS268S0100000_4, int i) {
    }

    public static final void onPageScrollStateChanged$2(IDiS268S0100000_4 iDiS268S0100000_4, int i) {
    }

    public static final void onPageScrolled$0(IDiS268S0100000_4 iDiS268S0100000_4, int i, float f, int i2) {
    }

    public static final void onPageScrolled$2(IDiS268S0100000_4 iDiS268S0100000_4, int i, float f, int i2) {
    }

    public static final void onPageScrolled$3(IDiS268S0100000_4 iDiS268S0100000_4, int i, float f, int i2) {
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
            case 2:
                onPageScrollStateChanged$2(this, i);
                return;
            case 3:
                onPageScrollStateChanged$3(this, i);
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
            case 2:
                onPageScrolled$2(this, i, f, i2);
                return;
            case 3:
                onPageScrolled$3(this, i, f, i2);
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
            case 2:
                onPageSelected$2(this, i);
                return;
            case 3:
                onPageSelected$3(this, i);
                return;
            default:
                return;
        }
    }

    public IDiS268S0100000_4(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onPageScrollStateChanged$1(IDiS268S0100000_4 iDiS268S0100000_4, int i) {
        ((A9D) iDiS268S0100000_4.l0).LIZ.getAweme();
        C2U8.LIZ(new A9H(A9F.PAGE_STATE_CHANGE, -1, null, null, Integer.valueOf(i)));
        if (i != 1) {
            if (i != 2) {
                return;
            }
            VideoViewCell videoViewCell = ((A9D) iDiS268S0100000_4.l0).LIZ;
            videoViewCell.LLLLZIL.handlePlay(videoViewCell.getAweme(), false, false);
            return;
        }
        ((A9D) iDiS268S0100000_4.l0).LIZ.LLLLZIL.handlePause(false);
    }

    public static final void onPageScrollStateChanged$3(IDiS268S0100000_4 iDiS268S0100000_4, int i) {
        if (i != 0) {
            if (i != 1) {
                return;
            }
            ((InboxNewFollowerTabFragment) iDiS268S0100000_4.l0).LJLJJI = "slide";
            return;
        }
        ((InboxNewFollowerTabFragment) iDiS268S0100000_4.l0).LJLJJI = "click";
    }

    public static final void onPageSelected$0(IDiS268S0100000_4 iDiS268S0100000_4, int i) {
        String str;
        HomeViewPagerAbility homeViewPagerAbility = ((OO3) iDiS268S0100000_4.l0).LJJJJJ;
        if (homeViewPagerAbility != null) {
            str = homeViewPagerAbility.n7(i);
        } else {
            str = null;
        }
        if (o.LJ(str, "For You")) {
            OO3 oo3 = (OO3) iDiS268S0100000_4.l0;
            if (oo3.LJIIJJI) {
                HomePageViewPagerAbility homePageViewPagerAbility = oo3.LJJJJIZL;
                if (homePageViewPagerAbility != null) {
                    homePageViewPagerAbility.LJJJJZ(false);
                    return;
                }
                return;
            }
            HomePageViewPagerAbility homePageViewPagerAbility2 = oo3.LJJJJIZL;
            if (homePageViewPagerAbility2 == null) {
                return;
            }
            homePageViewPagerAbility2.LJJJJZ(true);
        }
    }

    public static final void onPageSelected$1(IDiS268S0100000_4 iDiS268S0100000_4, int i) {
        ((A9D) iDiS268S0100000_4.l0).LIZ.getAweme();
        C2U8.LIZ(new A9H(A9F.PAGE_SELECTED, i, null, null, null));
        if (i != 0) {
            A9D a9d = (A9D) iDiS268S0100000_4.l0;
            a9d.LIZ.LLLLIL.postDelayed(new ARunnableS40S0100000_4(a9d, 149), 500L);
        }
    }

    public static final void onPageSelected$2(IDiS268S0100000_4 iDiS268S0100000_4, int i) {
        C86783as c86783as = ((C247419nN) iDiS268S0100000_4.l0).LIZLLL;
        if (c86783as != null) {
            c86783as.LIZ(i);
        }
    }

    public static final void onPageSelected$3(IDiS268S0100000_4 iDiS268S0100000_4, int i) {
        String str;
        List<C26373AWr> list = ((InboxNewFollowerTabFragment) iDiS268S0100000_4.l0).LJLIL;
        ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            arrayList.add(((C26373AWr) it.next()).LIZIZ);
        }
        Object obj = ListProtector.get(arrayList, i);
        if (obj == null) {
            obj = "";
        }
        InboxNewFollowerTabFragment inboxNewFollowerTabFragment = (InboxNewFollowerTabFragment) iDiS268S0100000_4.l0;
        if (!inboxNewFollowerTabFragment.LJLJI && o.LJ(obj, inboxNewFollowerTabFragment.LJLILLLLZI)) {
            InboxNewFollowerTabFragment inboxNewFollowerTabFragment2 = (InboxNewFollowerTabFragment) iDiS268S0100000_4.l0;
            inboxNewFollowerTabFragment2.getClass();
            C77266UUc c77266UUc = C77266UUc.LIZIZ;
            if (!c77266UUc.LJIILLIIL().LIZJ() && !c77266UUc.LJIIJ().LIZJ()) {
                str = "authorize";
            } else {
                str = "normal";
            }
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("tab_name", inboxNewFollowerTabFragment2.LJLILLLLZI);
            c188727au.LJIIIZ("enter_method", inboxNewFollowerTabFragment2.LJLJJI);
            c188727au.LJIIIZ("enter_from", "new_followers_page");
            c188727au.LIZLLL(((RBX) HG3.LJIILL()).getCurUser().getFriendCount(), "muf_cnt");
            c188727au.LJIIIZ("page_type", str);
            FMX.LJIIL("enter_mutual_friends_list", c188727au.LIZ);
            inboxNewFollowerTabFragment2.LJLJI = true;
        }
    }

    public static final void onPageScrolled$1(IDiS268S0100000_4 iDiS268S0100000_4, int i, float f, int i2) {
        ((A9D) iDiS268S0100000_4.l0).LIZ.getAweme();
        C2U8.LIZ(new A9H(A9F.PAGE_SCROLL, i, Float.valueOf(f), Integer.valueOf(i2), null));
    }
}
