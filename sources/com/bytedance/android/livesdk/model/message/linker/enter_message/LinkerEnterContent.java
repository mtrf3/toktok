package com.bytedance.android.livesdk.model.message.linker.enter_message;

import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import com.bytedance.android.livesdk.model.message.linker.linked_list_change_message.ListUser;
import java.util.List;

/* loaded from: classes14.dex */
public class LinkerEnterContent {

    @InterfaceC65349Pkn("anchor_multi_live_enum")
    public long MultiLiveType;

    @InterfaceC65349Pkn("anchor_setting_info")
    public MultiLiveAnchorPanelSettings anchorSettingInfo;

    @InterfaceC65349Pkn("linked_users")
    public List<ListUser> listUsers;
}
