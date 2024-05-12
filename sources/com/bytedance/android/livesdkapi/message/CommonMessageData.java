package com.bytedance.android.livesdkapi.message;

import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.model.message.common.Text;
import java.util.List;

/* loaded from: classes6.dex */
public class CommonMessageData {

    @InterfaceC65349Pkn("anchor_fold_type")
    public Long anchorFoldType;

    @InterfaceC65349Pkn("anchor_fold_type_for_web")
    public long anchorFoldTypeForWeb;

    @InterfaceC65349Pkn("anchor_priority_score")
    public long anchorPriorityScore;

    @InterfaceC65349Pkn("client_send_time")
    public long clientSendTime;

    @InterfaceC65349Pkn("create_time")
    public long createTime;

    @InterfaceC65349Pkn("depend_id")
    public LiveMessageID dependID;

    @InterfaceC65349Pkn("depend_root_id")
    public LiveMessageID dependRootID;

    @InterfaceC65349Pkn("describe")
    public String describe;

    @InterfaceC65349Pkn("dispatch_strategy")
    public int dispatchStrategy;

    @InterfaceC65349Pkn("display_text")
    public Text displayText;

    @InterfaceC65349Pkn("filter_msg_tags")
    public List<String> filterTags;

    @InterfaceC65349Pkn("fold_type")
    public long foldType;

    @InterfaceC65349Pkn("fold_type_for_web")
    public long foldTypeForWeb;

    @InterfaceC65349Pkn("from_idc")
    public String fromIdc;

    @InterfaceC65349Pkn("log_id")
    public String logId;

    @InterfaceC65349Pkn("msg_id")
    public long messageId;

    @InterfaceC65349Pkn("sei")
    public LiveMessageSEI messageSEI;

    @InterfaceC65349Pkn("method")
    public String method;

    @InterfaceC65349Pkn("monitor")
    public int monitor;

    @InterfaceC65349Pkn("msg_process_filter_k")
    public String msgProcessFilterK;

    @InterfaceC65349Pkn("msg_process_filter_v")
    public String msgProcessFilterV;

    @InterfaceC65349Pkn("play_time")
    public long playTime;

    @InterfaceC65349Pkn("priority_score")
    public long priorityScore;

    @InterfaceC65349Pkn("room_id")
    public long roomId;

    @InterfaceC65349Pkn("room_message_heat_level")
    public long roomMessageHeatLevel;

    @InterfaceC65349Pkn("is_show_msg")
    public boolean showMsg;

    @InterfaceC65349Pkn("to_dids")
    public List<String> toDids;

    @InterfaceC65349Pkn("to_idc")
    public String toIdc;
}
