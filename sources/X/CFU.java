package X;

import com.bytedance.android.livesdk.rank.api.LiveRankLynxConfig;
import java.util.HashMap;

/* loaded from: classes6.dex */
public final class CFU {
    public static String LIZ(int i, long j) {
        String str;
        LiveRankLynxConfig liveRankLynxConfig = LiveRankLynxConfig.INSTANCE;
        HashMap<Long, String> hashMap = liveRankLynxConfig.getValue().rankSchemaConfigList.get(Integer.valueOf(i));
        if (hashMap == null || (str = hashMap.get(Long.valueOf(j))) == null) {
            HashMap<Long, String> hashMap2 = liveRankLynxConfig.getValue().rankSchemaConfigList.get(-1);
            if (hashMap2 != null) {
                return hashMap2.get(Long.valueOf(j));
            }
            return null;
        }
        return str;
    }
}
