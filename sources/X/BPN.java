package X;

import com.bytedance.android.livesdk.rank.api.LiveRankTypeConfig;
import com.bytedance.android.livesdk.rank.api.RankTypeV2;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BPN {
    public static RankTypeV2 LIZIZ(String str) {
        if (str == null) {
            return RankTypeV2.LJIILL;
        }
        for (Map.Entry<OSZ<Integer, Integer>, RankTypeV2> entry : LiveRankTypeConfig.INSTANCE.getValue().entrySet()) {
            if (!o.LJ(entry.getValue().rankName, str)) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(entry.getValue().rankName);
                LIZ.append("_notice");
                if (o.LJ(X1D.LIZIZ(LIZ), str)) {
                }
            }
            return entry.getValue();
        }
        return RankTypeV2.LJIILL;
    }

    public static RankTypeV2 LIZ(int i, int i2) {
        RankTypeV2 rankTypeV2 = LiveRankTypeConfig.INSTANCE.getValue().get(new OSZ(Integer.valueOf(i), Integer.valueOf(i2)));
        if (rankTypeV2 == null) {
            return new RankTypeV2(i, "unknown", 0, 0, -1, 0, 0);
        }
        return rankTypeV2;
    }
}
