package com.bytedance.android.livesdk.chatroom.model.multiguestv3;

import X.F9E;
import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.chatroom.model.interact.LastLayoutSetting;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class BizCreateChannelResponseData extends F9E {

    @InterfaceC65349Pkn("background_sticker_id")
    public String backgroundStickerId;

    @InterfaceC65349Pkn("last_layout_settings")
    public List<LastLayoutSetting> lastLayoutSettings;

    @InterfaceC65349Pkn("user_setting_info")
    public MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings;

    /* JADX WARN: Multi-variable type inference failed */
    public BizCreateChannelResponseData() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.multiLiveAnchorPanelSettings, this.lastLayoutSettings, this.backgroundStickerId};
    }

    public BizCreateChannelResponseData(MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings, List<LastLayoutSetting> lastLayoutSettings, String backgroundStickerId) {
        o.LJIIIZ(lastLayoutSettings, "lastLayoutSettings");
        o.LJIIIZ(backgroundStickerId, "backgroundStickerId");
        this.multiLiveAnchorPanelSettings = multiLiveAnchorPanelSettings;
        this.lastLayoutSettings = lastLayoutSettings;
        this.backgroundStickerId = backgroundStickerId;
    }

    public /* synthetic */ BizCreateChannelResponseData(MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings, List list, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : multiLiveAnchorPanelSettings, (i & 2) != 0 ? new ArrayList() : list, (i & 4) != 0 ? "" : str);
    }
}
