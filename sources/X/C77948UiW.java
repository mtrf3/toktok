package X;

import com.bytedance.android.live.rank.impl.list.controller.RankListController;
import com.bytedance.android.live.rank.impl.list.controller.RankPageController;
import com.bytedance.android.live.rank.impl.list.controller.base.IChildController;
import com.bytedance.android.live.rank.impl.list.fragment.page.RankPageFragment;
import com.bytedance.android.livesdk.rank.model.SubRankTabInfo;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.UiW, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77948UiW implements C0C3 {
    public List<? extends SubRankTabInfo> LJLIL;
    public final /* synthetic */ RankPageFragment LJLILLLLZI;

    @Override // X.C0C3
    public final void onPageScrollStateChanged(int i) {
    }

    @Override // X.C0C3
    public final void onPageScrolled(int i, float f, int i2) {
    }

    public C77948UiW(RankPageFragment rankPageFragment) {
        this.LJLILLLLZI = rankPageFragment;
    }

    @Override // X.C0C3
    public final void onPageSelected(int i) {
        String str;
        String str2;
        RankPageController rankPageController = this.LJLILLLLZI.LJLILLLLZI;
        if (rankPageController != null) {
            int i2 = rankPageController.LJIIJ().LJLLJ;
            RankPageController rankPageController2 = this.LJLILLLLZI.LJLILLLLZI;
            if (rankPageController2 != null) {
                rankPageController2.LJIIJ().kv0(i);
                List<? extends SubRankTabInfo> list = this.LJLIL;
                if (list != null) {
                    RankPageFragment rankPageFragment = this.LJLILLLLZI;
                    if (list.size() > i) {
                        RankPageController rankPageController3 = rankPageFragment.LJLILLLLZI;
                        if (rankPageController3 != null) {
                            IChildController iChildController = (IChildController) ((HashMap) rankPageController3.LJLIL).get(new OSZ(Integer.valueOf(((SubRankTabInfo) ListProtector.get(list, i)).rankType), Integer.valueOf(((SubRankTabInfo) ListProtector.get(list, i)).LIZ)));
                            RankPageController rankPageController4 = rankPageFragment.LJLILLLLZI;
                            if (rankPageController4 != null) {
                                IChildController iChildController2 = (IChildController) ((HashMap) rankPageController4.LJLIL).get(new OSZ(Integer.valueOf(((SubRankTabInfo) ListProtector.get(list, i2)).rankType), Integer.valueOf(((SubRankTabInfo) ListProtector.get(list, i2)).LIZ)));
                                if ((iChildController instanceof RankListController) && (iChildController2 instanceof RankListController)) {
                                    RankListController rankListController = (RankListController) iChildController;
                                    C31526CYw rankTypeAll = rankListController.LJII().LJLIL;
                                    C31526CYw lastRankTypeAll = ((RankListController) iChildController2).LJII().LJLIL;
                                    DataChannel LJIILIIL = C51029K0z.LJIILIIL(rankPageFragment);
                                    o.LJIIIZ(rankTypeAll, "rankTypeAll");
                                    o.LJIIIZ(lastRankTypeAll, "lastRankTypeAll");
                                    C31522CYs.LIZIZ.put(new OSZ<>(Integer.valueOf(rankTypeAll.LIZIZ.type), Integer.valueOf(rankTypeAll.LIZIZ.rankPhase)), "subtag_switch");
                                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                                    C31522CYs.LIZJ(linkedHashMap, rankTypeAll, LJIILIIL);
                                    BZI LIZLLL = C31522CYs.LIZLLL("livesdk_switch_tab", linkedHashMap);
                                    C31522CYs.LIZ(LIZLLL, LJIILIIL);
                                    if (LJIILIIL != null && C29306Beo.LJIIJ(LJIILIIL)) {
                                        str = "anchor";
                                    } else {
                                        str = "user";
                                    }
                                    LIZLLL.LJIJJ(str, "user_type");
                                    LIZLLL.LJIJJ(rankTypeAll.LIZIZ.rankName, "from_rank_type");
                                    LIZLLL.LJIJJ(lastRankTypeAll.LIZIZ.rankName, "to_rank_type");
                                    if (rankTypeAll.LJ) {
                                        str2 = "last";
                                    } else {
                                        str2 = "this";
                                    }
                                    C06490Nh.LIZLLL(LIZLLL, str2, "rank_period", "subtag_switch", "enter_from");
                                    C31524CYu.LJ(rankListController.LJII().LJLIL.LIZJ.type, rankListController.LJII().LJLIL.LIZJ.rankPhase, false);
                                    return;
                                }
                                return;
                            }
                            o.LJIJI("controller");
                            throw null;
                        }
                        o.LJIJI("controller");
                        throw null;
                    }
                    return;
                }
                return;
            }
            o.LJIJI("controller");
            throw null;
        }
        o.LJIJI("controller");
        throw null;
    }
}
