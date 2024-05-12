package com.bytedance.android.livesdk.model.message;

import X.CR6;
import X.EnumC31509CYf;
import X.InterfaceC65349Pkn;
import java.util.List;

/* loaded from: classes6.dex */
public final class PartnershipGameOfflineMessage extends CR6 {

    @InterfaceC65349Pkn("offline_game_list")
    public List<OfflineGameInfo> offlineGameList;

    /* loaded from: classes6.dex */
    public static final class OfflineGameInfo {

        @InterfaceC65349Pkn("offline_type")
        public int offlineType;

        @InterfaceC65349Pkn("task_list_len")
        public int taskListLen;

        @InterfaceC65349Pkn("task_id")
        public String taskId = "";

        @InterfaceC65349Pkn("toast_text")
        public String toastText = "";
    }

    public PartnershipGameOfflineMessage() {
        this.type = EnumC31509CYf.PARTNERSHIP_GAME_OFFLINE_MESSAGE;
    }
}
