package com.bytedance.android.livesdk.model.message;

import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.model.VoteUser;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public final class PollOptionInfo {

    @InterfaceC65349Pkn("option_idx")
    public int optionIndex;

    @InterfaceC65349Pkn("votes")
    public long votes;

    @InterfaceC65349Pkn("display_content")
    public String displayContent = "";

    @InterfaceC65349Pkn("vote_user_list")
    public List<VoteUser> voteUserList = new ArrayList();
}
