package com.bytedance.android.livesdk.guide.model;

import X.InterfaceC65349Pkn;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.model.message.common.Text;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes14.dex */
public final class GuideInfoResponse {

    @InterfaceC65349Pkn("data")
    public Data data;

    /* loaded from: classes14.dex */
    public static final class Data {

        @InterfaceC65349Pkn("guide_entry")
        public GuideEntry guideEntry;

        @InterfaceC65349Pkn("guide_type")
        public String guideType = "";

        @InterfaceC65349Pkn("schema_url")
        public String schemaUrl = "";

        @InterfaceC65349Pkn("should_use_config")
        public boolean shouldUseConfig;

        @InterfaceC65349Pkn("user_stats")
        public UserStats userStats;
    }

    /* loaded from: classes14.dex */
    public static final class GuideEntry {

        @InterfaceC65349Pkn("guide_page_resources")
        public List<GuidePageResource> guidePageResources = new ArrayList();
    }

    /* loaded from: classes14.dex */
    public static final class GuidePageResource {

        @InterfaceC65349Pkn("texts")
        public List<Text> texts = new ArrayList();

        @InterfaceC65349Pkn("icons")
        public List<ImageModel> icons = new ArrayList();

        @InterfaceC65349Pkn("animations")
        public List<ImageModel> animations = new ArrayList();
    }

    /* loaded from: classes6.dex */
    public static final class UserStats {

        @InterfaceC65349Pkn("gift_guide_popup_show_cnt")
        public long giftGuidePopupShowCnt;

        @InterfaceC65349Pkn("gift_panel_show_cnt")
        public long giftPanelShowCnt;

        @InterfaceC65349Pkn("like_cnt")
        public long likeCnt;

        @InterfaceC65349Pkn("shortcut_gift_click_cnt")
        public long shortcutGiftClickCnt;

        @InterfaceC65349Pkn("watch_duration")
        public long watchDuration;
    }
}
