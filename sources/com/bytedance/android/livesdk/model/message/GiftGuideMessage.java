package com.bytedance.android.livesdk.model.message;

import X.CR6;
import X.EnumC31509CYf;
import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.model.message.common.Text;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public final class GiftGuideMessage extends CR6 {

    @InterfaceC65349Pkn("content")
    public Text content;

    @InterfaceC65349Pkn("display_seconds")
    public long displaySeconds;

    @InterfaceC65349Pkn("gift_id")
    public long giftId;

    @InterfaceC65349Pkn("guide_page_resources")
    public List<GuidePageResource> guidePageResources;

    @InterfaceC65349Pkn("guide_type")
    public String guideType;

    @InterfaceC65349Pkn("has_sent_before")
    public boolean hasSent;

    @InterfaceC65349Pkn("schema_url")
    public String schemaUrl;

    @InterfaceC65349Pkn("should_use_config")
    public boolean shouldUseConfig;

    @InterfaceC65349Pkn("trigger_name")
    public String triggerName;

    public GiftGuideMessage() {
        this.type = EnumC31509CYf.GIFT_GUIDE_MESSAGE;
        this.guideType = "";
        this.triggerName = "";
        this.schemaUrl = "";
        this.guidePageResources = new ArrayList();
    }
}
