package com.ss.android.ugc.aweme.profile.model;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* loaded from: classes13.dex */
public class RelativeUserInfo implements Serializable {

    @InterfaceC65349Pkn("avatar")
    public UrlModel avatar;

    @InterfaceC65349Pkn("uid")
    public String uid;

    public UrlModel getAvatar() {
        return this.avatar;
    }

    public String getUid() {
        return this.uid;
    }

    public void setAvatar(UrlModel urlModel) {
        this.avatar = urlModel;
    }

    public void setUid(String str) {
        this.uid = str;
    }
}
