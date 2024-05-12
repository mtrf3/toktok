package com.bytedance.android.livesdk.model.message;

import X.CR6;
import X.DIX;
import X.EnumC31509CYf;
import X.InterfaceC65349Pkn;

/* loaded from: classes6.dex */
public final class GiftPromptMessage extends CR6 {

    @InterfaceC65349Pkn("block_num_days")
    public Integer blockNumDays;

    @InterfaceC65349Pkn("body")
    public String body;

    @InterfaceC65349Pkn("order_id")
    public String orderId;

    @InterfaceC65349Pkn("order_timestamp")
    public Long orderTimestamp;

    @InterfaceC65349Pkn("title")
    public String title;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.title != null) {
            sb.append(", title=");
            sb.append(this.title);
        }
        if (this.body != null) {
            sb.append(", body=");
            sb.append(this.body);
        }
        if (this.blockNumDays != null) {
            sb.append(", block_num_days=");
            sb.append(this.blockNumDays);
        }
        if (this.orderId != null) {
            sb.append(", order_id=");
            sb.append(this.orderId);
        }
        if (this.orderTimestamp != null) {
            sb.append(", order_timestamp=");
            sb.append(this.orderTimestamp);
        }
        return DIX.LIZLLL(sb, 0, 2, "GiftPromptMessage{", '}');
    }

    public GiftPromptMessage() {
        this.type = EnumC31509CYf.GIFT_PROMPT_MESSAGE;
    }
}
