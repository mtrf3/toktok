package com.bytedance.android.livesdkapi.depend.model.live.match;

import X.C61878OQg;
import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.model.message.common.Text;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes14.dex */
public final class MultiMatchPrepareResponse {

    @InterfaceC65349Pkn("abtest_setting")
    public Map<Long, BattleABTestList> abTestSettings;

    @InterfaceC65349Pkn("anchors_permission")
    public Map<Long, Integer> anchorsPermission;

    @InterfaceC65349Pkn("best_teammate_id")
    public long bestTeammateId;

    @InterfaceC65349Pkn("gift_event_desc")
    public Text giftEventDesc;

    @InterfaceC65349Pkn("gift_mode")
    public List<GiftMode> giftMode;

    @InterfaceC65349Pkn("recommend_teammate")
    public Long recommendTeamMate;

    @InterfaceC65349Pkn("rule_guide_url")
    public String ruleGuideUrl;

    /* JADX WARN: Multi-variable type inference failed */
    public MultiMatchPrepareResponse() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    public MultiMatchPrepareResponse(Long l, Map<Long, Integer> map, Map<Long, BattleABTestList> map2) {
        this.recommendTeamMate = l;
        this.anchorsPermission = map;
        this.abTestSettings = map2;
        this.giftMode = C61878OQg.INSTANCE;
        this.ruleGuideUrl = "";
    }

    public /* synthetic */ MultiMatchPrepareResponse(Long l, Map map, Map map2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : map, (i & 4) != 0 ? null : map2);
    }
}
