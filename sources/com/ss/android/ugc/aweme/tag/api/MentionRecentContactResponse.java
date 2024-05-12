package com.ss.android.ugc.aweme.tag.api;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class MentionRecentContactResponse extends BaseResponse {

    @InterfaceC65349Pkn("block_results")
    public ArrayList<MentionCheckResult> blockResults;

    @InterfaceC65349Pkn("user_list")
    public ArrayList<User> userList;
}
