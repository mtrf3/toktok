package com.bytedance.android.livesdk.chatroom.interact.model;

import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.chatroom.model.interact.OptPairInfo;
import com.bytedance.android.livesdk.chatroom.model.interact.TagV2;

/* loaded from: classes14.dex */
public class RivalExtraInfo {

    @InterfaceC65349Pkn("anchor_layer")
    public int anchorLayer;

    @InterfaceC65349Pkn("detail_block_reason")
    public int detailBlockReason;

    @InterfaceC65349Pkn("invite_block_reason")
    public int inviteBlockReason;

    @InterfaceC65349Pkn("label")
    public String label;

    @InterfaceC65349Pkn("linker_info")
    public LinkerInfo linkerInfo;

    @InterfaceC65349Pkn("linkmic_user_settings")
    public AnchorLinkmicUserSettings linkmicUserSettings;

    @InterfaceC65349Pkn("opt_pair_info")
    public OptPairInfo optPairInfo;

    @InterfaceC65349Pkn("reserve_info")
    public ReserveInfo reserveInfo;

    @InterfaceC65349Pkn("show_play_type")
    public int showPlayType;

    @InterfaceC65349Pkn("tag")
    public Tag tag;

    @InterfaceC65349Pkn("tag_v2")
    public TagV2 tagV2;

    @InterfaceC65349Pkn("text")
    public String text;

    @InterfaceC65349Pkn("text_type")
    public int text_type;

    /* loaded from: classes14.dex */
    public static final class ReserveInfo {

        @InterfaceC65349Pkn("bubble_tip")
        public String bubbleTip = "";

        @InterfaceC65349Pkn("is_reservation_sender")
        public boolean isReservationSender;

        @InterfaceC65349Pkn("reply_status")
        public int replyStatus;

        @InterfaceC65349Pkn("reservation_id")
        public long reservationId;

        @InterfaceC65349Pkn("response_time")
        public long responseTime;
    }

    /* loaded from: classes14.dex */
    public static class Tag {

        @InterfaceC65349Pkn("tag_text")
        public String tagText;

        @InterfaceC65349Pkn("tag_type")
        public int tagType;

        @InterfaceC65349Pkn("tag_value")
        public String tagValue;
    }
}
