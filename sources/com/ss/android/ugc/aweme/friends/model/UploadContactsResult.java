package com.ss.android.ugc.aweme.friends.model;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;

/* loaded from: classes2.dex */
public final class UploadContactsResult extends BaseResponse {

    @InterfaceC65349Pkn("unregistered_contact")
    public final List<ContactModel> contacts;

    @InterfaceC65349Pkn("log_pb")
    public LogPbBean logPbBean;

    @InterfaceC65349Pkn("registered_user")
    public final List<User> users;
}
