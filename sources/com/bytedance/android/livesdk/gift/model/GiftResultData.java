package com.bytedance.android.livesdk.gift.model;

import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.GiftTrayInfo;
import com.bytedance.android.livesdk.model.GiftsBoxInfo;
import com.bytedance.android.livesdk.model.message.common.Text;

/* loaded from: classes6.dex */
public class GiftResultData {

    @InterfaceC65349Pkn("combo_count")
    public int comboCount;

    @InterfaceC65349Pkn("describe")
    public String describe;

    @InterfaceC65349Pkn("display_text")
    public Text displayText;

    @InterfaceC65349Pkn("display_text_for_anchor")
    public Text displayTextForAnchor;

    @InterfaceC65349Pkn("display_text_for_audience")
    public Text displayTextForAudience;

    @InterfaceC65349Pkn("gift_id")
    public long giftId;

    @InterfaceC65349Pkn("gifts_in_box")
    public GiftsBoxInfo giftsInBox;

    @InterfaceC65349Pkn("group_count")
    public int groupCount;

    @InterfaceC65349Pkn("gift")
    public Gift mGift;

    @InterfaceC65349Pkn("tray_info")
    public GiftTrayInfo mTrayInfo;

    @InterfaceC65349Pkn("msg_id")
    public long msgId;

    @InterfaceC65349Pkn("repeat_count")
    public int repeatCount;

    @InterfaceC65349Pkn("tray_display_text")
    public Text trayDisplayText;
}
