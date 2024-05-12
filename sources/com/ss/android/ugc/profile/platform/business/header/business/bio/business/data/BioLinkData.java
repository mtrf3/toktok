package com.ss.android.ugc.profile.platform.business.header.business.bio.business.data;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.profile.platform.base.data.BizBaseData;

/* loaded from: classes5.dex */
public final class BioLinkData extends BizBaseData {

    @InterfaceC65349Pkn("bio_secure_url")
    public String bioSecureUrl;

    @InterfaceC65349Pkn("bio_url")
    public String bioUrl;

    @InterfaceC65349Pkn("block_bio_link_jump")
    public Integer blockLinkJump;

    public final String getBioSecureUrl() {
        return this.bioSecureUrl;
    }

    public final String getBioUrl() {
        return this.bioUrl;
    }

    public final Integer getBlockLinkJump() {
        return this.blockLinkJump;
    }

    public final void setBioSecureUrl(String str) {
        this.bioSecureUrl = str;
    }

    public final void setBioUrl(String str) {
        this.bioUrl = str;
    }

    public final void setBlockLinkJump(Integer num) {
        this.blockLinkJump = num;
    }
}
