package com.ss.android.ugc.aweme.friends.model;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class NewRecommendList extends RecommendList {

    @InterfaceC65349Pkn("next_cursor")
    public int nextCursor;

    @InterfaceC65349Pkn("users")
    public List<User> users;

    @Override // com.ss.android.ugc.aweme.friends.model.RecommendList
    public List<User> getUserList() {
        List<User> list = this.users;
        if (list == null) {
            return new ArrayList();
        }
        o.LJI(list);
        return list;
    }

    @Override // com.ss.android.ugc.aweme.friends.model.RecommendList
    public int getCursor() {
        return this.nextCursor;
    }

    @Override // com.ss.android.ugc.aweme.friends.model.RecommendList
    public void setCursor(int i) {
        this.nextCursor = i;
    }

    @Override // com.ss.android.ugc.aweme.friends.model.RecommendList
    public void setUserList(List<User> list) {
        this.users = list;
    }
}
