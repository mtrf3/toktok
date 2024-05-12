package X;

import com.bytedance.android.livesdk.model.message.RankAnimationInfo;
import com.bytedance.android.livesdk.model.message.RankUpdate;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.rank.model.RankEntrance;
import kotlin.jvm.internal.o;

/* renamed from: X.CYm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31516CYm {
    public final C31526CYw LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final long LIZLLL;
    public final Text LJ;
    public final long LJFF;
    public final RankAnimationInfo LJI;

    public C31516CYm(RankUpdate rankUpdate, EnumC31514CYk groupType, boolean z, boolean z2) {
        o.LJIIIZ(groupType, "groupType");
        this.LIZ = new C31526CYw(groupType, rankUpdate.rankType, rankUpdate.belongType, rankUpdate.requestFirstShowType, false);
        this.LIZIZ = z;
        this.LIZJ = z2;
        this.LIZLLL = rankUpdate.countdown;
        this.LJ = rankUpdate.defaultContent;
        this.LJFF = rankUpdate.ownRank;
        this.LJI = rankUpdate.animationInfo;
    }

    public C31516CYm(RankEntrance rankEntrance, EnumC31514CYk groupType, boolean z, boolean z2) {
        o.LJIIIZ(groupType, "groupType");
        this.LIZ = new C31526CYw(groupType, rankEntrance.rankType, rankEntrance.belongRankType, rankEntrance.requestFirstShowType, false);
        this.LIZIZ = z;
        this.LIZJ = z2;
        this.LIZLLL = rankEntrance.countdown;
        this.LJ = rankEntrance.defaultContent;
        this.LJFF = rankEntrance.ownerRankIdx;
    }
}
