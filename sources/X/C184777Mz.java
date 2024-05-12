package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.now.NowPostInfo;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.7Mz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C184777Mz extends AbstractC65781Prl implements InterfaceC88472Yns<C7N8, Boolean> {
    public static final C184777Mz LJLIL = new C184777Mz();

    public C184777Mz() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(C7N8 c7n8) {
        C8RL c8rl;
        Aweme aweme;
        String aid;
        Integer num;
        NowPostInfo nowPostInfo;
        C7N8 nowDetailListState = c7n8;
        o.LJIIIZ(nowDetailListState, "nowDetailListState");
        List<InterfaceC57784Mm4> list = nowDetailListState.getListState().LJLJJI;
        boolean z = false;
        C7ML c7ml = null;
        if (list != null) {
            c8rl = (InterfaceC57784Mm4) ORZ.LJLLLLLL(0, list);
        } else {
            c8rl = null;
        }
        if (c8rl instanceof InterfaceC194547kI) {
            c7ml = (C7ML) c8rl;
        }
        boolean z2 = true;
        if (c7ml != null && (aweme = c7ml.getAweme()) != null) {
            C196367nE c196367nE = C196367nE.LIZ;
            String authorUid = aweme.getAuthorUid();
            o.LJIIIIZZ(authorUid, "aweme.authorUid");
            c196367nE.getClass();
            if (!C196367nE.LJI(authorUid) && (aweme.shouldShowReviewStatus() || (!C80S.LIZLLL(aweme) && (((aid = aweme.getAid()) == null || (num = (Integer) ((ConcurrentHashMap) C195827mM.LIZ).get(aid)) == null || (num.intValue() | 1) <= 0) && ((!C196367nE.LJ(aweme) || aweme.getAuthor().getMatchedFriendStruct() == null) && ((nowPostInfo = aweme.nowPostInfo) == null || nowPostInfo.getPrivateStatus() != 0)))))) {
                z = true;
            }
            z2 = z;
        }
        return Boolean.valueOf(z2);
    }
}
