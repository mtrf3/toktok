package com.bytedance.android.live.liveinteract.match.model;

import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleABTestList;
import com.bytedance.android.livesdkapi.depend.model.live.match.GiftMode;
import java.util.List;
import java.util.Map;

/* loaded from: classes14.dex */
public final class PrepareBattleResponse {

    @InterfaceC65349Pkn("data")
    public ResponseData data;

    /* loaded from: classes14.dex */
    public static final class ResponseData {

        @InterfaceC65349Pkn("abtest_setting")
        public Map<Long, BattleABTestList> abtestSetting;

        @InterfaceC65349Pkn("gift_event_desc")
        public Text giftEventDesc;

        @InterfaceC65349Pkn("gift_mode")
        public List<GiftMode> giftMode;

        @InterfaceC65349Pkn("rule_guide_url")
        public String ruleGuideUrl = "";
    }
}
