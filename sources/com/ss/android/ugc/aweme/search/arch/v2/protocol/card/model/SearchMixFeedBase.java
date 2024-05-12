package com.ss.android.ugc.aweme.search.arch.v2.protocol.card.model;

import X.AbstractC49325JXl;
import X.InterfaceC49871Jhj;
import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.ecommerce.model.EComShopCardStruct;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SingleLive;
import java.util.Arrays;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public abstract class SearchMixFeedBase extends AbstractC49325JXl implements InterfaceC49871Jhj {

    @InterfaceC65349Pkn("type")
    public int feedType;

    @InterfaceC65349Pkn("feedback_type")
    public String feedbackType;

    @InterfaceC65349Pkn("shop_card")
    public EComShopCardStruct shopCard;

    @InterfaceC65349Pkn("single_live")
    public final SingleLive singleLive;

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.feedType), this.feedbackType, this.singleLive, this.shopCard});
    }

    @Override // X.AbstractC49325JXl
    public int getFeedType() {
        return this.feedType;
    }

    public boolean equals(Object obj) {
        Class<?> cls;
        Class<?> cls2 = getClass();
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!o.LJ(cls2, cls)) {
            return false;
        }
        o.LJII(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.search.arch.v2.protocol.card.model.SearchMixFeedBase");
        SearchMixFeedBase searchMixFeedBase = (SearchMixFeedBase) obj;
        if (!o.LJ(this.feedbackType, searchMixFeedBase.feedbackType) || !o.LJ(this.singleLive, searchMixFeedBase.singleLive) || !o.LJ(this.shopCard, searchMixFeedBase.shopCard)) {
            return false;
        }
        return true;
    }

    @Override // X.AbstractC49325JXl
    public void setFeedType(int i) {
        this.feedType = i;
    }
}
