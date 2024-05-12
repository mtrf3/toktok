package com.ss.android.ugc.aweme.nows.interaction.viewmodel;

import X.ActivityC45651qj;
import X.C198667qw;
import X.C33Q;
import X.C63081OpJ;
import X.C78Y;
import X.C7AA;
import X.C7ML;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.comment.service.CommentServiceImpl;
import com.ss.android.ugc.aweme.comment.services.CommentService;
import com.ss.android.ugc.aweme.commercialize.model.CommentStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.utils.JsonParseUtils;
import com.ss.android.ugc.now.interaction.NowFeedMobHierarchyData;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class NowCommentViewModel extends NowInteractionBaseViewModel<C7AA> {
    public final boolean LJLILLLLZI = true;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C33Q defaultState() {
        return new C7AA(0);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final boolean isHolderVM() {
        return this.LJLILLLLZI;
    }

    public static long iv0(Aweme aweme) {
        long j;
        CommentStruct adCommentStruct;
        if (aweme == null) {
            return 0L;
        }
        CommentService.LIZ.getClass();
        if (CommentServiceImpl.LJJL().LJIILLIIL(aweme) || C63081OpJ.LJLJLLL(aweme)) {
            return 0L;
        }
        AwemeStatistics statistics = aweme.getStatistics();
        if (statistics != null) {
            j = statistics.getCommentCount();
        } else {
            j = 0;
        }
        CommentStruct LJJJLIIL = CommentServiceImpl.LJJL().LJJJLIIL(aweme);
        AwemeStatistics statistics2 = aweme.getStatistics();
        if (statistics2 == null || Long.valueOf(statistics2.getCommentCount()) == null) {
            return 0L;
        }
        if (LJJJLIIL != null || (aweme.getAdCommentStruct() != null && (j > 0 || ((adCommentStruct = aweme.getAdCommentStruct()) != null && adCommentStruct.showAsDefault())))) {
            return 1 + j;
        }
        return j;
    }

    @Override // com.ss.android.ugc.aweme.nows.interaction.viewmodel.NowInteractionBaseViewModel
    public final C7AA hv0(C7AA c7aa, C7ML item) {
        AwemeStatistics statistics;
        C7AA state = c7aa;
        o.LJIIIZ(state, "state");
        o.LJIIIZ(item, "item");
        long iv0 = iv0(item.getAweme());
        String aid = item.getAweme().getAid();
        o.LJIIIIZZ(aid, "item.aweme.aid");
        Keva repo = Keva.getRepo("interaction_comment_count");
        o.LJIIIIZZ(repo, "getRepo(KEVA_REPO_COMMENT_COUNT)");
        try {
            C78Y c78y = (C78Y) JsonParseUtils.LIZJ(C78Y.class, repo.getString(aid, ""));
            if (c78y != null) {
                if (System.currentTimeMillis() - c78y.getTimeStamp() < 600000) {
                    Long valueOf = Long.valueOf(c78y.getCount());
                    if (valueOf != null) {
                        long longValue = valueOf.longValue();
                        if (longValue > iv0 && (statistics = item.getAweme().getStatistics()) != null) {
                            statistics.setCommentCount(longValue);
                        }
                    }
                } else {
                    repo.erase(aid);
                }
            }
        } catch (Exception unused) {
        }
        return C7AA.LIZ(state, iv0(item.getAweme()), null, 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void jv0(NowCommentViewModel nowCommentViewModel, Aweme aweme, ActivityC45651qj activityC45651qj, Integer num, String str, String str2, int i) {
        Integer num2 = num;
        String str3 = str2;
        if ((i & 8) != 0) {
            num2 = null;
        }
        if ((i & 32) != 0) {
            str3 = null;
        }
        nowCommentViewModel.getClass();
        if (aweme == null || activityC45651qj == null || activityC45651qj.isFinishing()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (aweme.getOriginCommentIds() != null) {
            List<String> originCommentIds = aweme.getOriginCommentIds();
            o.LJIIIIZZ(originCommentIds, "aweme.originCommentIds");
            arrayList.addAll(originCommentIds);
        }
        NowFeedMobHierarchyData nowFeedMobHierarchyData = ((C7AA) nowCommentViewModel.getState()).LJLILLLLZI;
        if (str3 == null) {
            str3 = "click_comment_icon";
        }
        C198667qw.LIZ(aweme, activityC45651qj, nowFeedMobHierarchyData, false, null, num2, str3, 288);
    }
}
