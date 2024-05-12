package X;

import Y.AfS65S0100000_13;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.rank.impl.list.RankLeagueListDialog;
import com.bytedance.android.live.rank.impl.list.RankListDialog;
import com.bytedance.android.livesdk.rank.api.RankTypeV2;
import com.bytedance.android.livesdk.rank.impl.api.RankApi;
import com.bytedance.android.livesdk.rank.model.RankTabInfo;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.UiH, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77933UiH {
    public static RankListDialog LIZ(C77934UiI c77934UiI, LifecycleOwner lifecycleOwner, boolean z, boolean z2) {
        RankListDialog rankListDialog;
        long j;
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        List<RankTabInfo> list = c77934UiI.LIZJ;
        if (list == null || list.size() == 0) {
            return null;
        }
        C31524CYu.LJI();
        RankTypeV2 rankTypeV2 = c77934UiI.LJFF;
        C31524CYu.LJ(rankTypeV2.type, rankTypeV2.rankPhase, true);
        int i = c77934UiI.LJFF.style;
        RankTypeV2 rankTypeV22 = RankTypeV2.LJII;
        if (i == rankTypeV22.style && !z) {
            rankListDialog = new RankLeagueListDialog();
        } else {
            rankListDialog = new RankListDialog();
        }
        rankListDialog.LJLJJI = c77934UiI;
        rankListDialog.LJLIL = z;
        rankListDialog.LJLILLLLZI = z2;
        EnumC31514CYk enumC31514CYk = c77934UiI.LJI;
        RankTypeV2 rankTypeV23 = c77934UiI.LJFF;
        rankListDialog.LJLJLJ = new C31526CYw(enumC31514CYk, rankTypeV23, rankTypeV23, c77934UiI.LJ, z);
        if (c77934UiI.LJFF.style == rankTypeV22.style) {
            C77987Uj9 c77987Uj9 = new C77987Uj9();
            long j2 = c77934UiI.LIZ;
            long j3 = c77934UiI.LIZIZ;
            RankTypeV2 rankType = c77934UiI.LJFF;
            o.LJIIIZ(rankType, "rankType");
            C31524CYu.LIZJ(rankType.type, rankType.rankPhase);
            c77987Uj9.LIZLLL = rankType;
            RankApi rankApi = (RankApi) Q7L.LIZIZ(RankApi.class);
            String valueOf = String.valueOf(rankType.type);
            if (z) {
                j = -1;
            } else {
                j = 0;
            }
            ((InterfaceC29856Bng) C1EW.LIZ(rankApi.getRankListV2(j2, j3, valueOf, 1, j, true, rankType.rankPhase)).LIZJ(C73933Szx.LJ(lifecycleOwner))).LIZJ(new AfS65S0100000_13(c77987Uj9, 123), new AfS65S0100000_13(c77987Uj9, 124));
            rankListDialog.LJLJJLL = c77987Uj9;
        }
        return rankListDialog;
    }
}
