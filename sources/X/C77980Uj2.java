package X;

import com.bytedance.android.livesdk.rank.list.model.RankListV2Response;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Uj2, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77980Uj2 extends AbstractC78035Ujv {
    public final List<RankListV2Response.RankInfo> LIZ;
    public final C31526CYw LIZIZ;

    @Override // X.AbstractC78035Ujv
    public final Object LIZ() {
        return this.LIZ;
    }

    public C77980Uj2(List<RankListV2Response.RankInfo> ranks, C31526CYw rankTypeAll) {
        o.LJIIIZ(ranks, "ranks");
        o.LJIIIZ(rankTypeAll, "rankTypeAll");
        this.LIZ = ranks;
        this.LIZIZ = rankTypeAll;
    }
}
