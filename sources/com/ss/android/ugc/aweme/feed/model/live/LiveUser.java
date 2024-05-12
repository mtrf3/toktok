package com.ss.android.ugc.aweme.feed.model.live;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* loaded from: classes16.dex */
public class LiveUser implements Serializable, Cloneable {

    @InterfaceC65349Pkn("authentication_info")
    public LiveAuthenticationInfo authenticationInfo;

    @InterfaceC65349Pkn("avatar_large")
    public UrlModel avatarLarger;

    @InterfaceC65349Pkn("avatar_medium")
    public UrlModel avatarMedium;

    @InterfaceC65349Pkn("avatar_thumb")
    public UrlModel avatarThumb;

    @InterfaceC65349Pkn("follow_info")
    public FollowInfo followInfo;

    @InterfaceC65349Pkn("id")
    public long id;

    @InterfaceC65349Pkn("nickname")
    public String nickname;

    @InterfaceC65349Pkn("scm_label")
    public String scmLabel;

    @InterfaceC65349Pkn("sec_uid")
    public String secUid;

    @InterfaceC65349Pkn("secret")
    public int secret;

    @InterfaceC65349Pkn("short_id")
    public long shortId;

    @InterfaceC65349Pkn("display_id")
    public String uniqueId;

    public String getSecUid() {
        return this.secUid;
    }

    public void setSecUid(String str) {
        this.secUid = str;
    }
}
