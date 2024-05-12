package com.bytedance.android.livesdk.gift.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.model.message.common.Text;

/* loaded from: classes14.dex */
public final class HotfixGiftDataForProp extends F9E {

    @InterfaceC65349Pkn("combo_count")
    public Long comboCount;

    @InterfaceC65349Pkn("describe")
    public String describe;

    @InterfaceC65349Pkn("display_text")
    public Text displayText;

    @InterfaceC65349Pkn("gift_id")
    public Long giftId;

    @InterfaceC65349Pkn("group_count")
    public Long groupCount;

    @InterfaceC65349Pkn("msg_id")
    public Long msgId;

    @InterfaceC65349Pkn("repeat_count")
    public Long repeatCount;

    @Override // X.F9E
    public final Object[] getObjects() {
        Text text = this.displayText;
        String str = this.describe;
        Long l = this.giftId;
        Long l2 = this.groupCount;
        Long l3 = this.repeatCount;
        Long l4 = this.comboCount;
        Long l5 = this.msgId;
        return new Object[]{text, text, str, str, l, l, l2, l2, l3, l3, l4, l4, l5, l5};
    }
}
