package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.rank.api.LiveRankTypeConfig;
import com.bytedance.android.livesdk.rank.api.RankTypeV2;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes6.dex */
public final class CEZ extends AbstractC65781Prl implements InterfaceC65784Pro<HashMap<OSZ<? extends Integer, ? extends Integer>, RankTypeV2>> {
    public static final CEZ LJLIL = new CEZ();

    public CEZ() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final HashMap<OSZ<? extends Integer, ? extends Integer>, RankTypeV2> invoke() {
        LiveRankTypeConfig.Config config = (LiveRankTypeConfig.Config) SettingsManager.INSTANCE.getValueSafely(LiveRankTypeConfig.class);
        if (config == null) {
            config = LiveRankTypeConfig.DEFAULT;
        }
        List<RankTypeV2> list = config.rankTypeList;
        if (list.isEmpty()) {
            list = LiveRankTypeConfig.DEFAULT.rankTypeList;
        }
        HashMap<OSZ<? extends Integer, ? extends Integer>, RankTypeV2> hashMap = new HashMap<>();
        for (RankTypeV2 rankTypeV2 : list) {
            hashMap.put(new OSZ<>(Integer.valueOf(rankTypeV2.type), Integer.valueOf(rankTypeV2.rankPhase)), rankTypeV2);
        }
        return hashMap;
    }
}
