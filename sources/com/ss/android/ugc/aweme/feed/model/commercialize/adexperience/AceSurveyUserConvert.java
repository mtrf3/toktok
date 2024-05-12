package com.ss.android.ugc.aweme.feed.model.commercialize.adexperience;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.io.Serializable;

/* loaded from: classes11.dex */
public final class AceSurveyUserConvert implements Serializable {

    @InterfaceC65349Pkn("item_id")
    public final String itemId = CardStruct.IStatusCode.DEFAULT;

    @InterfaceC65349Pkn("adv_id")
    public final String advId = CardStruct.IStatusCode.DEFAULT;

    @InterfaceC65349Pkn("ad_id")
    public final String adId = CardStruct.IStatusCode.DEFAULT;

    @InterfaceC65349Pkn("creative_id")
    public final String cid = CardStruct.IStatusCode.DEFAULT;

    public final String getAdId() {
        return this.adId;
    }

    public final String getAdvId() {
        return this.advId;
    }

    public final String getCid() {
        return this.cid;
    }

    public final String getItemId() {
        return this.itemId;
    }
}
