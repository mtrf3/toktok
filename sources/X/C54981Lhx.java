package X;

import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.detail.model.BatchDetailList;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.panel.RecommendFeedFragmentPanel;
import com.ss.android.ugc.aweme.feed.ui.FeedRecommendFragment;
import com.ss.android.ugc.feed.platform.panel.refreshpanel.IRefreshAbility;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* renamed from: X.Lhx, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54981Lhx<TTaskResult, TContinuationResult> implements C10I {
    public final /* synthetic */ InterfaceC55023Lid LIZ;
    public final /* synthetic */ int LIZIZ;

    public C54981Lhx(FeedRecommendFragment feedRecommendFragment, int i) {
        this.LIZ = feedRecommendFragment;
        this.LIZIZ = i;
    }

    @Override // X.C10I
    public final Object then(C10K c10k) {
        OSZ osz;
        int i;
        InterfaceC55023Lid interfaceC55023Lid = this.LIZ;
        if (c10k != null) {
            osz = (OSZ) c10k.LJIIJJI();
        } else {
            osz = null;
        }
        int i2 = this.LIZIZ;
        FeedRecommendFragment feedRecommendFragment = (FeedRecommendFragment) interfaceC55023Lid;
        feedRecommendFragment.getClass();
        if (osz != null) {
            int intValue = ((Integer) osz.getFirst()).intValue();
            BatchDetailList batchDetailList = (BatchDetailList) osz.getSecond();
            if (batchDetailList == null) {
                if (intValue == 3020003) {
                    i = R.string.tmo;
                } else if (intValue == 3020005) {
                    i = R.string.tmp;
                } else if (intValue == 3020006) {
                    i = R.string.ru1;
                } else {
                    i = R.string.tmq;
                }
                C26045AKb c26045AKb = new C26045AKb(feedRecommendFragment.requireActivity());
                c26045AKb.LJIIIIZZ(i);
                c26045AKb.LJIIJ();
            } else {
                RecommendFeedFragmentPanel recommendFeedFragmentPanel = feedRecommendFragment.LJLL;
                int curIndex = recommendFeedFragmentPanel.getCurIndex() + 1;
                List<Aweme> list = batchDetailList.items;
                if (list != null) {
                    int size = list.size();
                    List<Aweme> Q8 = recommendFeedFragmentPanel.getAdapter().Q8();
                    for (int i3 = size - 1; i3 >= 0; i3--) {
                        int i4 = 0;
                        while (true) {
                            if (i4 > curIndex + 2) {
                                break;
                            }
                            if (i4 < Q8.size() && ((Aweme) ListProtector.get(list, i3)).getAid().equals(((Aweme) ListProtector.get(Q8, i4)).getAid())) {
                                String aid = ((Aweme) ListProtector.get(list, i3)).getAid();
                                if (i2 == 1) {
                                    if (!TextUtils.isEmpty(aid) && aid.equals(feedRecommendFragment.LJLL.getCurrentAwemeId())) {
                                        IRefreshAbility YE = feedRecommendFragment.YE();
                                        if (YE != null) {
                                            YE.setRefreshing(false);
                                            YE.XX(feedRecommendFragment.LJLLLLLL);
                                        }
                                    } else {
                                        ActivityC45651qj mo49getActivity = feedRecommendFragment.mo49getActivity();
                                        if (mo49getActivity != null) {
                                            IRefreshAbility YE2 = feedRecommendFragment.YE();
                                            if (YE2 != null) {
                                                YE2.setRefreshing(false);
                                                YE2.XX(feedRecommendFragment.LJLLLLLL);
                                            }
                                            Bundle LLJJIJI = C16880lQ.LLJJIJI(mo49getActivity.getIntent());
                                            if (LLJJIJI != null) {
                                                LLJJIJI.putBoolean("share_expose_sharer", true);
                                            }
                                            StringBuilder LIZ = X1D.LIZ();
                                            LIZ.append("aweme://aweme/detail/");
                                            LIZ.append(aid);
                                            SmartRoute buildRoute = SmartRouter.buildRoute(mo49getActivity, X1D.LIZIZ(LIZ));
                                            buildRoute.withParam(LLJJIJI);
                                            buildRoute.open();
                                        }
                                    }
                                }
                                ListProtector.remove(list, i3);
                            } else {
                                i4++;
                            }
                        }
                    }
                    feedRecommendFragment.Il(list, false);
                }
                String str = batchDetailList.requestId;
                RecommendFeedFragmentPanel recommendFeedFragmentPanel2 = feedRecommendFragment.LJLL;
                if (list != null && list.size() > 0) {
                    FW5.LJIIJJI(0, str, list);
                    if (feedRecommendFragment.LJZI) {
                        recommendFeedFragmentPanel2.insertItemList(new C2KB<>(curIndex, "push_video", list));
                        recommendFeedFragmentPanel2.setCurrentItem(curIndex, true);
                        C8RO c8ro = feedRecommendFragment.LJLJLLL;
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("[insertAwemeList] ");
                        LIZ2.append(str);
                        LIZ2.append(", ");
                        LIZ2.append(curIndex);
                        c8ro.LJIIIIZZ(X1D.LIZIZ(LIZ2));
                    } else {
                        feedRecommendFragment.LJLZ = list;
                        feedRecommendFragment.LJZ = curIndex;
                    }
                }
                C221018lt.LJFF("Relation_Shared", "online logic, insert aweme.");
            }
            IRefreshAbility YE3 = feedRecommendFragment.YE();
            if (YE3 != null) {
                YE3.setRefreshing(false);
                YE3.XX(feedRecommendFragment.LJLLLLLL);
            }
        }
        return c10k;
    }
}
