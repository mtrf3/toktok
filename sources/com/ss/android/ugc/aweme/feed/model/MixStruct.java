package com.ss.android.ugc.aweme.feed.model;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.share.ShareInfo;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.AutoMixAuthorInfo;
import java.io.Serializable;

/* loaded from: classes13.dex */
public class MixStruct implements Serializable {

    @InterfaceC65349Pkn("author")
    public User author;

    @InterfaceC65349Pkn("auto_mix_author_info")
    public AutoMixAuthorInfo autoMixAuthorInfo;

    @InterfaceC65349Pkn("cover_url")
    public UrlModel cover;

    @InterfaceC65349Pkn("create_time")
    public long createTime;

    @InterfaceC65349Pkn("desc")
    public String desc;

    @InterfaceC65349Pkn("extra")
    public String extra;

    @InterfaceC65349Pkn("icon_url")
    public UrlModel icon;

    @InterfaceC65349Pkn("mix_id")
    public String mixId;

    @InterfaceC65349Pkn("mix_name")
    public String mixName;

    @InterfaceC65349Pkn("mix_type")
    public int mixType;

    @InterfaceC65349Pkn("share_info")
    public ShareInfo shareInfo;

    @InterfaceC65349Pkn("statis")
    public MixStatisStruct statis;

    @InterfaceC65349Pkn("status")
    public MixStatusStruct status;

    @InterfaceC65349Pkn("update_time")
    public long updateTime;
}
