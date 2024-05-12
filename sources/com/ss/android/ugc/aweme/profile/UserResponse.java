package com.ss.android.ugc.aweme.profile;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.profile.model.User;

/* loaded from: classes5.dex */
public class UserResponse extends BaseResponse {

    @InterfaceC65349Pkn("toast_back")
    public int action;

    @InterfaceC65349Pkn("log_pb")
    public LogPbBean logPb;
    public User user;

    public int getAction() {
        return this.action;
    }

    public User getUser() {
        return this.user;
    }

    public void setAction(int i) {
        this.action = i;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
