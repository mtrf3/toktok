package com.ss.android.ugc.aweme.specact.api;

import X.C43588H8u;
import X.F9E;
import X.InterfaceC65349Pkn;

/* loaded from: classes11.dex */
public final class MesEntraSetting extends F9E {

    @InterfaceC65349Pkn("activity_id")
    public final String activityId;

    @InterfaceC65349Pkn("background_image_url")
    public final String bgImgUrl;

    @InterfaceC65349Pkn("schema_url")
    public final String schemaUrl;

    @InterfaceC65349Pkn("title_image_url")
    public final String titleImgUrl;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.activityId, this.bgImgUrl, this.titleImgUrl, this.schemaUrl};
    }

    public MesEntraSetting(String str, String str2, String str3, String str4) {
        C43588H8u.LIZLLL(str, "activityId", str2, "bgImgUrl", str3, "titleImgUrl", str4, "schemaUrl");
        this.activityId = str;
        this.bgImgUrl = str2;
        this.titleImgUrl = str3;
        this.schemaUrl = str4;
    }
}
