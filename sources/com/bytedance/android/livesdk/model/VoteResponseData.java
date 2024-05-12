package com.bytedance.android.livesdk.model;

import X.C61878OQg;
import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.model.message.PollOptionInfo;
import java.util.List;

/* loaded from: classes6.dex */
public final class VoteResponseData {

    @InterfaceC65349Pkn("comment_banned")
    public boolean commentBanned;

    @InterfaceC65349Pkn("option_list")
    public List<PollOptionInfo> optionList = C61878OQg.INSTANCE;
}
