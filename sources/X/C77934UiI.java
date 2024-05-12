package X;

import com.bytedance.android.livesdk.rank.api.RankTypeV2;
import com.bytedance.android.livesdk.rank.model.RankTabInfo;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.UiI, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77934UiI {
    public final long LIZ;
    public final long LIZIZ;
    public final List<RankTabInfo> LIZJ;
    public final boolean LIZLLL;
    public final RankTypeV2 LJ;
    public final RankTypeV2 LJFF;
    public final EnumC31514CYk LJI;

    public final String toString() {
        int i;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(super.toString());
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("anchorId=");
        LIZ2.append(this.LIZ);
        LIZ2.append("; ");
        LIZ.append(X1D.LIZIZ(LIZ2));
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("roomId=");
        LIZ3.append(this.LIZIZ);
        LIZ3.append("; ");
        LIZ.append(X1D.LIZIZ(LIZ3));
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append("tabSize=");
        List<RankTabInfo> list = this.LIZJ;
        if (list != null) {
            i = list.size();
        } else {
            i = -1;
        }
        LIZ4.append(i);
        LIZ4.append("; ");
        LIZ.append(X1D.LIZIZ(LIZ4));
        StringBuilder LIZ5 = X1D.LIZ();
        LIZ5.append("first show rank type=");
        LIZ5.append(this.LJFF);
        LIZ5.append("; ");
        LIZ.append(X1D.LIZIZ(LIZ5));
        StringBuilder LIZ6 = X1D.LIZ();
        LIZ6.append("groupType=");
        LIZ6.append(this.LJI);
        LIZ6.append(' ');
        LIZ.append(X1D.LIZIZ(LIZ6));
        String LIZIZ = X1D.LIZIZ(LIZ);
        o.LJIIIIZZ(LIZIZ, "StringBuilder()\n        …              .toString()");
        return LIZIZ;
    }

    public C77934UiI(long j, long j2, List<RankTabInfo> list, boolean z, RankTypeV2 firstShowRankPageType, RankTypeV2 firstShowRankSubType, EnumC31514CYk groupType) {
        o.LJIIIZ(firstShowRankPageType, "firstShowRankPageType");
        o.LJIIIZ(firstShowRankSubType, "firstShowRankSubType");
        o.LJIIIZ(groupType, "groupType");
        this.LIZ = j;
        this.LIZIZ = j2;
        this.LIZJ = list;
        this.LIZLLL = z;
        this.LJ = firstShowRankPageType;
        this.LJFF = firstShowRankSubType;
        this.LJI = groupType;
    }
}
