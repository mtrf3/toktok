package com.bytedance.android.livesdk.chatroom.model;

import X.InterfaceC65349Pkn;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes13.dex */
public final class AnchorReplayInfoData {

    @InterfaceC65349Pkn("has_more")
    public boolean hasMore;

    @InterfaceC65349Pkn("next_offset")
    public long nextOffset;

    @InterfaceC65349Pkn("replays")
    public List<RoomReplay> replays = new ArrayList();

    @InterfaceC65349Pkn("style")
    public int style;
}
