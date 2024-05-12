package X;

import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.android.live.rank.impl.list.controller.RankPageController;
import com.bytedance.android.live.rank.impl.list.fragment.list.ECListFragment;
import com.bytedance.android.live.rank.impl.list.fragment.list.GiftListFragment;
import com.bytedance.android.live.rank.impl.list.fragment.list.RankLeagueFragment;
import com.bytedance.android.live.rank.impl.list.fragment.list.RankListFragment;
import com.bytedance.android.live.rank.impl.list.fragment.list.RookieListFragment;
import com.bytedance.android.live.rank.impl.list.fragment.page.RankPageFragment;
import com.bytedance.android.livesdk.rank.api.RankTypeV2;
import com.bytedance.android.livesdk.rank.list.model.RankListV2Response;
import com.bytedance.android.livesdk.rank.model.SubRankTabInfo;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.UiX, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77949UiX implements InterfaceC78033Ujt {
    public final /* synthetic */ RankPageFragment LIZ;

    @Override // X.InterfaceC78033Ujt
    public final void onError() {
    }

    public C77949UiX(RankPageFragment rankPageFragment) {
        this.LIZ = rankPageFragment;
    }

    @Override // X.InterfaceC78033Ujt
    public final void LIZ(RankListV2Response.RankView rankView, long j) {
        RankListFragment giftListFragment;
        RankListV2Response.RankView rankView2;
        long j2;
        RankPageFragment rankPageFragment = this.LIZ;
        rankPageFragment.LJLLL = j;
        ViewPager viewPager = (ViewPager) rankPageFragment._$_findCachedViewById(R.id.nb6);
        FragmentManager childFragmentManager = rankPageFragment.getChildFragmentManager();
        o.LJIIIIZZ(childFragmentManager, "childFragmentManager");
        C77872UhI c77872UhI = new C77872UhI(childFragmentManager);
        rankPageFragment.LJLJJL = c77872UhI;
        viewPager.setAdapter(c77872UhI);
        ((C80655Vl5) rankPageFragment._$_findCachedViewById(R.id.kyt)).LIZIZ(rankPageFragment.LJZI);
        C80655Vl5 c80655Vl5 = (C80655Vl5) rankPageFragment._$_findCachedViewById(R.id.kyt);
        c80655Vl5.setCustomTabViewResId(R.layout.diy);
        c80655Vl5.LJLJI.setPadding(0, 0, 0, 0);
        int i = 1;
        c80655Vl5.setAutoFillWhenScrollable(true);
        c80655Vl5.setTabMinWidth(0);
        ((C80655Vl5) rankPageFragment._$_findCachedViewById(R.id.kyt)).setupWithViewPager((ViewPager) rankPageFragment._$_findCachedViewById(R.id.nb6));
        List<SubRankTabInfo> list = rankView.subTabs;
        if (list != null) {
            if (list.size() > 1) {
                rankPageFragment._$_findCachedViewById(R.id.kyt).setVisibility(0);
                C29306Beo.LJJLIIIJILLIZJL(C15380j0.LIZ(5.0f), rankPageFragment._$_findCachedViewById(R.id.nb6));
            } else {
                rankPageFragment._$_findCachedViewById(R.id.kyt).setVisibility(8);
                C29306Beo.LJJLIIIJILLIZJL(C15380j0.LIZ(0.0f), rankPageFragment._$_findCachedViewById(R.id.nb6));
            }
            C77872UhI c77872UhI2 = rankPageFragment.LJLJJL;
            if (c77872UhI2 != null) {
                ArrayList arrayList = new ArrayList();
                int i2 = 0;
                for (SubRankTabInfo subRankTabInfo : list) {
                    int i3 = i2 + 1;
                    if (i2 >= 0) {
                        SubRankTabInfo subRankTabInfo2 = subRankTabInfo;
                        RankTypeV2 LIZ = BPN.LIZ(subRankTabInfo2.rankType, subRankTabInfo2.LIZ);
                        RankPageController rankPageController = rankPageFragment.LJLILLLLZI;
                        if (rankPageController != null) {
                            EnumC31514CYk groupType = rankPageController.LJIIJ().LJLIL;
                            o.LJIIIZ(groupType, "groupType");
                            if (CZ4.LIZ[groupType.ordinal()] == i) {
                                giftListFragment = new ECListFragment();
                            } else if (o.LJ(LIZ, RankTypeV2.LIZJ)) {
                                giftListFragment = new RookieListFragment();
                            } else if (o.LJ(LIZ, RankTypeV2.LJII) || o.LJ(LIZ, RankTypeV2.LJIIIIZZ) || o.LJ(LIZ, RankTypeV2.LJIIIZ) || o.LJ(LIZ, RankTypeV2.LJIIJ)) {
                                giftListFragment = new RankLeagueFragment();
                            } else {
                                giftListFragment = new GiftListFragment();
                            }
                            RankTypeV2 LIZ2 = BPN.LIZ(subRankTabInfo2.rankType, subRankTabInfo2.LIZ);
                            RankPageController rankPageController2 = rankPageFragment.LJLILLLLZI;
                            if (rankPageController2 != null) {
                                if (i2 == rankPageController2.LJIIJ().LJLLJ) {
                                    rankView2 = rankView;
                                } else {
                                    rankView2 = null;
                                }
                                InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = rankPageFragment.LJLJJI;
                                if (interfaceC65784Pro != null) {
                                    RankPageController rankPageController3 = rankPageFragment.LJLILLLLZI;
                                    if (rankPageController3 != null) {
                                        if (i2 == rankPageController3.LJIIJ().LJLLJ) {
                                            j2 = rankPageFragment.LJLLL;
                                        } else {
                                            j2 = 0;
                                        }
                                        giftListFragment.LJLJJI = new C31526CYw(rankPageController2.LIZ().LJLJJI, LIZ2, LIZ2, rankPageController2.LJIIJ().LJLILLLLZI, rankPageController2.LJIIJ().LJLJI);
                                        giftListFragment.LJLJJL = rankView2;
                                        giftListFragment.LJLJL = rankPageController2;
                                        giftListFragment.LJLJLJ = interfaceC65784Pro;
                                        giftListFragment.LJLJLLL = j2;
                                        arrayList.add(giftListFragment);
                                        i2 = i3;
                                        i = 1;
                                    } else {
                                        o.LJIJI("controller");
                                        throw null;
                                    }
                                } else {
                                    o.LJIJI("dismissInvoke");
                                    throw null;
                                }
                            } else {
                                o.LJIJI("controller");
                                throw null;
                            }
                        } else {
                            o.LJIJI("controller");
                            throw null;
                        }
                    } else {
                        C47261Igj.LJJJJJ();
                        throw null;
                    }
                }
                if (arrayList.size() == list.size()) {
                    ((ArrayList) c77872UhI2.LJLJLJ).clear();
                    ((ArrayList) c77872UhI2.LJLJLLL).clear();
                    Iterator it = arrayList.iterator();
                    int i4 = 0;
                    while (it.hasNext()) {
                        Object next = it.next();
                        int i5 = i4 + 1;
                        if (i4 >= 0) {
                            ((ArrayList) c77872UhI2.LJLJLJ).add(next);
                            ((ArrayList) c77872UhI2.LJLJLLL).add(ListProtector.get(list, i4));
                            i4 = i5;
                        } else {
                            C47261Igj.LJJJJJ();
                            throw null;
                        }
                    }
                    c77872UhI2.notifyDataSetChanged();
                }
            }
            ViewPager viewPager2 = (ViewPager) rankPageFragment._$_findCachedViewById(R.id.nb6);
            RankPageController rankPageController4 = rankPageFragment.LJLILLLLZI;
            if (rankPageController4 != null) {
                viewPager2.setCurrentItem(rankPageController4.LJIIJ().LJLLJ);
                rankPageFragment.LJZL.LJLIL = list;
                ((ViewPager) rankPageFragment._$_findCachedViewById(R.id.nb6)).addOnPageChangeListener(rankPageFragment.LJZL);
                return;
            }
            o.LJIJI("controller");
            throw null;
        }
    }
}
