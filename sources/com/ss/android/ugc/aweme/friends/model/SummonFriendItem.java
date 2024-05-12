package com.ss.android.ugc.aweme.friends.model;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.challenge.model.Segment;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;

/* loaded from: classes2.dex */
public class SummonFriendItem {
    public boolean isMentionBlocked;
    public String label;
    public LogPbBean logPbBean;

    @InterfaceC65349Pkn("user_info")
    public User mUser;
    public String searchId;

    @InterfaceC65349Pkn("position")
    public List<Segment> segments;
    public int type = 1;
}
