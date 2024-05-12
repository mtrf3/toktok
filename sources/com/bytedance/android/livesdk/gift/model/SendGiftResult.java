package com.bytedance.android.livesdk.gift.model;

import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.model.message.common.Text;
import java.util.List;
import tikcast.api.privilege.PayGradeInfo;
import webcast.data.FansLevelInfo;

/* loaded from: classes6.dex */
public class SendGiftResult {
    public long LIZIZ;

    @InterfaceC65349Pkn("anchor_fans_count")
    public long anchorFansCount;

    @InterfaceC65349Pkn("DiamondSources")
    public List<ExchangeGiftResultData> balanceResult;

    @InterfaceC65349Pkn("combo_count")
    public int comboCount;

    @InterfaceC65349Pkn("describe")
    public String describe;

    @InterfaceC65349Pkn("display_text")
    public Text displayText;

    @InterfaceC65349Pkn("fan_ticket_count")
    public int fanTicketCount;

    @InterfaceC65349Pkn("fans_level_info")
    public FansLevelInfo fansLevelInfo;

    @InterfaceC65349Pkn("flying_mic_resources")
    public FlyingMicResources flyingMicResources;

    @InterfaceC65349Pkn("remain_times")
    public int freqLimitRemaintimes;

    @InterfaceC65349Pkn("gifts")
    public List<GiftResultData> gifts;

    @InterfaceC65349Pkn("group_count")
    public int groupCount;

    @InterfaceC65349Pkn("group_id")
    public long groupId;

    @InterfaceC65349Pkn("is_first_sent")
    public boolean isFirstSend;

    @InterfaceC65349Pkn("linkmic_gift_expression_strategy")
    public int linkmicGiftExpressionStrategy;

    @InterfaceC65349Pkn("lynx_extra")
    public List<LynxGiftExtra> lynxExtra;

    @InterfaceC65349Pkn("calm_down_remind")
    public CalmDownInfo mCalmDownInfo;

    @InterfaceC65349Pkn("gift_id")
    public long mGiftId;

    @InterfaceC65349Pkn("left_diamond")
    public long mLeftDiamonds;

    @InterfaceC65349Pkn("match_info")
    public MatchInfo matchInfo;

    @InterfaceC65349Pkn("monitor_extra")
    public String monitorExtra;

    @InterfaceC65349Pkn("msg_id")
    public long msgId;

    @InterfaceC65349Pkn("pay_grade_info")
    public PayGradeInfo payGradeInfo;

    @InterfaceC65349Pkn("prop_type")
    public int propType;

    @InterfaceC65349Pkn("props")
    public List<Prop> props;

    @InterfaceC65349Pkn("repeat_count")
    public int repeatCount;

    @InterfaceC65349Pkn("room_fan_ticket_count")
    public Long roomFanTicketCount;
    public long LIZ = -1;

    @InterfaceC65349Pkn("prop_def_id")
    public long propId = -1;

    @InterfaceC65349Pkn("order_id")
    public String orderId = "";
}
