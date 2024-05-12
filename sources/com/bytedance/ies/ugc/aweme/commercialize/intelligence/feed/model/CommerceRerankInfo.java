package com.bytedance.ies.ugc.aweme.commercialize.intelligence.feed.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class CommerceRerankInfo extends F9E implements Serializable {

    @InterfaceC65349Pkn("item_param_for_pitaya")
    public final String itemParams;

    public static /* synthetic */ CommerceRerankInfo copy$default(CommerceRerankInfo commerceRerankInfo, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = commerceRerankInfo.itemParams;
        }
        return commerceRerankInfo.copy(str);
    }

    public final CommerceRerankInfo copy(String itemParams) {
        o.LJIIIZ(itemParams, "itemParams");
        return new CommerceRerankInfo(itemParams);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.itemParams};
    }

    public final String getItemParams() {
        return this.itemParams;
    }

    public CommerceRerankInfo(String itemParams) {
        o.LJIIIZ(itemParams, "itemParams");
        this.itemParams = itemParams;
    }
}
