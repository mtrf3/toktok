package com.ss.android.ugc.aweme.ecommerce.base.messagecenter.api;

import X.C67962lc;
import X.E4Q;
import X.InterfaceC64989Pez;
import X.InterfaceC67352kd;

/* loaded from: classes2.dex */
public interface SellerMessageAPI {
    public static final C67962lc LIZ = C67962lc.LIZ;

    @E4Q("/api/v1/im/shop_creator/creator/conversation_inbox_api/list")
    Object fetchUserConversations(@InterfaceC64989Pez("shopCreatorCursor") Integer num, @InterfaceC64989Pez("shopCreatorLimit") int i, @InterfaceC64989Pez("shopBuyerCursor") Integer num2, @InterfaceC64989Pez("shopBuyerLimit") int i2, @InterfaceC64989Pez("PIGEON_BIZ_TYPE") int i3, @InterfaceC64989Pez("Ecommercemsgexpversion") int i4, InterfaceC67352kd<? super ConversationResponse> interfaceC67352kd);
}
