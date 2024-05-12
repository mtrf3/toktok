package com.ss.android.ugc.aweme.feed.model.live;

import X.InterfaceC195777mH;
import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.discover.model.Challenge;

/* loaded from: classes13.dex */
public class LiveChallenge {

    @InterfaceC65349Pkn("cha_name")
    public String challengeName;

    @InterfaceC195777mH
    @InterfaceC65349Pkn("cid")
    public String cid;

    @InterfaceC65349Pkn("is_commerce")
    public boolean isCommerce;

    @InterfaceC65349Pkn("schema")
    public String schema;

    @InterfaceC65349Pkn("sub_type")
    public int subType;

    @InterfaceC65349Pkn("type")
    public int type;

    public Challenge toAwemeChallenge() {
        Challenge challenge = new Challenge();
        challenge.setCid(this.cid);
        challenge.setChallengeName(this.challengeName);
        challenge.setSchema(this.schema);
        challenge.setType(this.type);
        challenge.setSubType(this.subType);
        return challenge;
    }
}
