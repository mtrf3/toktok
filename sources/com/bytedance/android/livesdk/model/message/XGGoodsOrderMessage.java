package com.bytedance.android.livesdk.model.message;

import X.CR6;
import X.EnumC31509CYf;
import X.InterfaceC65349Pkn;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdkapi.message.BaseMessage;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import java.util.Objects;

/* loaded from: classes6.dex */
public class XGGoodsOrderMessage extends CR6 {

    @InterfaceC65349Pkn("goods_order")
    public GoodsOrder goodsOrder;

    @InterfaceC65349Pkn("user")
    public User user;

    /* loaded from: classes6.dex */
    public static class GoodsOrder {

        @InterfaceC65349Pkn("goods_room_order")
        public long goodsRoomOrder;

        @InterfaceC65349Pkn("order_id")
        public String orderId;

        @InterfaceC65349Pkn("order_money")
        public long orderMoney;

        @InterfaceC65349Pkn("order_num")
        public long orderNum;
    }

    @Override // com.bytedance.android.livesdkapi.message.BaseMessage
    public final boolean canText() {
        return true;
    }

    public final int hashCode() {
        CommonMessageData commonMessageData = this.baseMessage;
        if (commonMessageData != null) {
            return Objects.hash(Long.valueOf(commonMessageData.messageId));
        }
        return super.hashCode();
    }

    public XGGoodsOrderMessage() {
        this.type = EnumC31509CYf.GOODS_ORDER;
    }

    public final boolean equals(Object obj) {
        CommonMessageData commonMessageData;
        CommonMessageData commonMessageData2;
        if (!(obj instanceof XGGoodsOrderMessage) || (commonMessageData = this.baseMessage) == null || (commonMessageData2 = ((BaseMessage) obj).baseMessage) == null || commonMessageData.messageId != commonMessageData2.messageId) {
            return false;
        }
        return true;
    }
}
