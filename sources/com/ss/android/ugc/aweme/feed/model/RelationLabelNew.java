package com.ss.android.ugc.aweme.feed.model;

import X.InterfaceC65349Pkn;
import X.InterfaceC65404Plg;
import com.ss.android.ugc.aweme.utils.StringJsonAdapterFactory;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes13.dex */
public final class RelationLabelNew implements Serializable {

    @InterfaceC65349Pkn("extra")
    @InterfaceC65404Plg(StringJsonAdapterFactory.class)
    public RelationLabelExtra extra;

    @InterfaceC65349Pkn("type")
    public Integer type = 0;

    @InterfaceC65349Pkn("user_list")
    public List<RelationLabelUser> userList;

    public final RelationLabelExtra getExtra() {
        return this.extra;
    }

    public final Integer getType() {
        return this.type;
    }

    public final List<RelationLabelUser> getUserList() {
        return this.userList;
    }

    public final void setExtra(RelationLabelExtra relationLabelExtra) {
        this.extra = relationLabelExtra;
    }

    public final void setType(Integer num) {
        this.type = num;
    }

    public final void setUserList(List<RelationLabelUser> list) {
        this.userList = list;
    }
}
