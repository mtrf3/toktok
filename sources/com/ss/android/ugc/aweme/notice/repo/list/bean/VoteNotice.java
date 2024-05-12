package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.RelationDynamicLabel;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;

/* loaded from: classes10.dex */
public final class VoteNotice {

    @InterfaceC65349Pkn("image_url")
    public UrlModel imageUrl;

    @InterfaceC65349Pkn("merge_count")
    public int mergeCount;

    @InterfaceC65349Pkn("option_text")
    public String optionText;

    @InterfaceC65349Pkn("ref_type")
    public int refType;

    @InterfaceC65349Pkn("relation_label")
    public RelationDynamicLabel relationLabel;

    @InterfaceC65349Pkn("schema_url")
    public String schemaUrl;

    @InterfaceC65349Pkn("from_user")
    public List<? extends User> userList;
}
