package com.bytedance.android.livesdk.chatroom.interact.model;

import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.chatroom.interact.model.RivalExtraInfo;
import com.bytedance.android.livesdk.chatroom.model.interact.OptPairInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.Map;

/* loaded from: classes14.dex */
public final class MGetUserLinkmicStatusResponse {

    @InterfaceC65349Pkn("data")
    public ResponseData data;

    @InterfaceC65349Pkn("extra")
    public Extra extra;

    /* loaded from: classes14.dex */
    public static final class Extra {

        @InterfaceC65349Pkn("log_id")
        public String logId = "";
    }

    /* loaded from: classes14.dex */
    public static final class LinkmicStatus {

        @InterfaceC65349Pkn("block_reason")
        public int blockReason;

        @InterfaceC65349Pkn("detail_block_reason")
        public int detailBlockReason;

        @InterfaceC65349Pkn("linker_info")
        public LinkerInfo linkerInfo;

        @InterfaceC65349Pkn("opt_pair_info")
        public OptPairInfo optPairInfo;

        @InterfaceC65349Pkn("play_type")
        public int playType;

        @InterfaceC65349Pkn("reserve_info")
        public RivalExtraInfo.ReserveInfo reserveInfo;
    }

    /* loaded from: classes14.dex */
    public static final class ResponseData {

        @InterfaceC65349Pkn("linkmic_status_map")
        public Map<Long, LinkmicStatus> linkmicStatusMap;

        @InterfaceC65349Pkn("room_info")
        public Map<Long, Room> roomInfo;
    }
}
