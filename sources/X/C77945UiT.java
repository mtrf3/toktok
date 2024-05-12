package X;

import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.rank.impl.list.RankListDialog;
import com.bytedance.android.live.rank.impl.list.controller.RankPageController;
import com.bytedance.android.live.rank.impl.list.fragment.page.RankPageFragment;
import com.bytedance.android.live.rank.impl.list.viewmodel.RankListViewModel;
import com.bytedance.android.livesdk.rank.api.RankTypeV2;
import com.bytedance.android.livesdk.rank.model.RankTabInfo;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import webcast.api.ranklist.LynxRankView;

/* renamed from: X.UiT, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77945UiT extends AbstractViewOnClickListenerC28292B8m {
    public final /* synthetic */ RankPageFragment LJLJJL;

    @Override // X.AbstractViewOnClickListenerC28292B8m
    public final void LIZ() {
        String LJIILJJIL;
        long j;
        FragmentManager fragmentManager;
        RankTabInfo rankTabInfo = new RankTabInfo();
        RankPageFragment rankPageFragment = this.LJLJJL;
        rankTabInfo.rankType = rankPageFragment.LJLIL.type;
        RankPageController rankPageController = rankPageFragment.LJLILLLLZI;
        if (rankPageController != null) {
            int i = C31559Ca3.LIZ[rankPageController.LJIIJ().LJLIL.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    LJIILJJIL = C15380j0.LJIILJJIL(R.string.m7s);
                } else {
                    LJIILJJIL = C15380j0.LJIILJJIL(R.string.m7w);
                }
            } else if (o.LJ(rankPageFragment.LJLIL, RankTypeV2.LIZLLL)) {
                LJIILJJIL = C15380j0.LJIILJJIL(R.string.m7w);
            } else {
                LJIILJJIL = C15380j0.LJIILJJIL(R.string.m7s);
            }
            rankTabInfo.LJLIL = LJIILJJIL;
            RankPageController rankPageController2 = rankPageFragment.LJLILLLLZI;
            if (rankPageController2 != null) {
                LynxRankView value = rankPageController2.LJIIJ().LJLL.getValue();
                if (value != null) {
                    j = value.hisListLynxType;
                } else {
                    j = 0;
                }
                rankTabInfo.listLynxType = j;
                List LJJIJ = C47261Igj.LJJIJ(rankTabInfo);
                RankPageFragment rankPageFragment2 = this.LJLJJL;
                Iterator it = LJJIJ.iterator();
                while (it.hasNext()) {
                    if ((EnumC31059CGx.RANK_DIALOG.getScene() & ((RankTabInfo) it.next()).listLynxType) != 0) {
                        C73340SqO.LJJIJIIJI(rankPageFragment2.getContext(), C51029K0z.LJIILIIL(rankPageFragment2), LJJIJ);
                        return;
                    }
                }
                RankPageController rankPageController3 = this.LJLJJL.LJLILLLLZI;
                if (rankPageController3 != null) {
                    long j2 = rankPageController3.LJIIIZ().LIZ;
                    RankPageController rankPageController4 = this.LJLJJL.LJLILLLLZI;
                    if (rankPageController4 != null) {
                        long j3 = rankPageController4.LJIIIZ().LIZIZ;
                        RankPageController rankPageController5 = this.LJLJJL.LJLILLLLZI;
                        if (rankPageController5 != null) {
                            boolean z = rankPageController5.LJIIIZ().LIZLLL;
                            RankPageFragment rankPageFragment3 = this.LJLJJL;
                            RankTypeV2 rankTypeV2 = rankPageFragment3.LJLIL;
                            RankPageController rankPageController6 = rankPageFragment3.LJLILLLLZI;
                            if (rankPageController6 != null) {
                                RankTypeV2 rankTypeV22 = rankPageController6.LJIIJ().LJLLL;
                                RankPageController rankPageController7 = this.LJLJJL.LJLILLLLZI;
                                if (rankPageController7 != null) {
                                    C77934UiI c77934UiI = new C77934UiI(j2, j3, LJJIJ, z, rankTypeV2, rankTypeV22, rankPageController7.LJIIIZ().LJI);
                                    DataChannel LJIILIIL = C51029K0z.LJIILIIL(this.LJLJJL);
                                    if (LJIILIIL != null && (fragmentManager = (FragmentManager) LJIILIIL.kv0(C29494Bhq.class)) != null) {
                                        RankPageFragment rankPageFragment4 = this.LJLJJL;
                                        RankListDialog LIZ = C77933UiH.LIZ(c77934UiI, rankPageFragment4, true, false);
                                        if (LIZ != null) {
                                            LIZ.show(fragmentManager, "RankHistoryDialog");
                                        }
                                        RankPageController rankPageController8 = rankPageFragment4.LJLILLLLZI;
                                        if (rankPageController8 != null) {
                                            RankListViewModel LJII = rankPageController8.LJII();
                                            if (LJII != null) {
                                                RankPageController rankPageController9 = rankPageFragment4.LJLILLLLZI;
                                                if (rankPageController9 != null) {
                                                    C31522CYs.LJI(rankPageController9.LJIIIIZZ(), LJII.LJLIL, C51029K0z.LJIILIIL(rankPageFragment4));
                                                    return;
                                                } else {
                                                    o.LJIJI("controller");
                                                    throw null;
                                                }
                                            }
                                            return;
                                        }
                                        o.LJIJI("controller");
                                        throw null;
                                    }
                                    return;
                                }
                                o.LJIJI("controller");
                                throw null;
                            }
                            o.LJIJI("controller");
                            throw null;
                        }
                        o.LJIJI("controller");
                        throw null;
                    }
                    o.LJIJI("controller");
                    throw null;
                }
                o.LJIJI("controller");
                throw null;
            }
            o.LJIJI("controller");
            throw null;
        }
        o.LJIJI("controller");
        throw null;
    }

    public C77945UiT(RankPageFragment rankPageFragment) {
        this.LJLJJL = rankPageFragment;
    }
}
