package com.bytedance.android.livesdk.model.linksetting;

import X.F9E;
import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes14.dex */
public final class MultiLiveUpdateUserSettingContent extends F9E {

    @InterfaceC65349Pkn("update_user_setting_info")
    public MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings;

    /* JADX WARN: Multi-variable type inference failed */
    public MultiLiveUpdateUserSettingContent() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.multiLiveAnchorPanelSettings};
    }

    public MultiLiveUpdateUserSettingContent(MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings) {
        this.multiLiveAnchorPanelSettings = multiLiveAnchorPanelSettings;
    }

    public /* synthetic */ MultiLiveUpdateUserSettingContent(MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : multiLiveAnchorPanelSettings);
    }
}
