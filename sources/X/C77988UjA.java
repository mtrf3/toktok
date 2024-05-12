package X;

import com.bytedance.android.livesdk.rank.list.model.RankListV2Response;
import kotlin.jvm.internal.o;

/* renamed from: X.UjA, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77988UjA extends AbstractC78035Ujv {
    public final C31526CYw LIZ;
    public final RankListV2Response.BriefDescription LIZIZ;
    public final long LIZJ;
    public final int LIZLLL;
    public final int LJ;

    @Override // X.AbstractC78035Ujv
    public final Object LIZ() {
        return this.LIZ;
    }

    public C77988UjA(C31526CYw rankTypeAll, RankListV2Response.BriefDescription briefDescription, long j, int i, int i2) {
        o.LJIIIZ(rankTypeAll, "rankTypeAll");
        this.LIZ = rankTypeAll;
        this.LIZIZ = briefDescription;
        this.LIZJ = j;
        this.LIZLLL = i;
        this.LJ = i2;
    }
}
