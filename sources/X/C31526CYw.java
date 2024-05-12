package X;

import com.bytedance.android.livesdk.rank.api.RankTypeV2;
import kotlin.jvm.internal.o;

/* renamed from: X.CYw, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31526CYw {
    public static final C31526CYw LJFF;
    public final EnumC31514CYk LIZ;
    public final RankTypeV2 LIZIZ;
    public final RankTypeV2 LIZJ;
    public final RankTypeV2 LIZLLL;
    public final boolean LJ;

    static {
        EnumC31514CYk enumC31514CYk = EnumC31514CYk.DEFAULT;
        RankTypeV2 rankTypeV2 = RankTypeV2.LJIILL;
        LJFF = new C31526CYw(enumC31514CYk, rankTypeV2, rankTypeV2, rankTypeV2, false);
    }

    public C31526CYw(EnumC31514CYk groupType, RankTypeV2 rankType, RankTypeV2 requestFirstShowType, RankTypeV2 belongRankType, boolean z) {
        o.LJIIIZ(groupType, "groupType");
        o.LJIIIZ(rankType, "rankType");
        o.LJIIIZ(requestFirstShowType, "requestFirstShowType");
        o.LJIIIZ(belongRankType, "belongRankType");
        this.LIZ = groupType;
        this.LIZIZ = rankType;
        this.LIZJ = requestFirstShowType;
        this.LIZLLL = belongRankType;
        this.LJ = z;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C31526CYw(EnumC31514CYk groupType, int i, int i2, int i3, boolean z) {
        this(groupType, BPN.LIZ(i, 0), BPN.LIZ(i3, 0), BPN.LIZ(i2, 0), z);
        o.LJIIIZ(groupType, "groupType");
    }
}
