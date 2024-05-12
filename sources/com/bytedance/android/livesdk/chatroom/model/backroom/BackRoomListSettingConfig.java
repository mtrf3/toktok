package com.bytedance.android.livesdk.chatroom.model.backroom;

import X.InterfaceC65349Pkn;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class BackRoomListSettingConfig {

    @InterfaceC65349Pkn("block_list")
    public List<String> blockList;

    @InterfaceC65349Pkn("multi_list")
    public List<String> multiList;

    @InterfaceC65349Pkn("single_list")
    public List<String> singleList;

    /* JADX WARN: Multi-variable type inference failed */
    public BackRoomListSettingConfig() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    public BackRoomListSettingConfig(List<String> list, List<String> list2, List<String> list3) {
        this.blockList = list;
        this.multiList = list2;
        this.singleList = list3;
    }

    public /* synthetic */ BackRoomListSettingConfig(List list, List list2, List list3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2, (i & 4) != 0 ? null : list3);
    }
}
