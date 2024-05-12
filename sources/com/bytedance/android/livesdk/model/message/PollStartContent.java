package com.bytedance.android.livesdk.model.message;

import X.InterfaceC65349Pkn;
import com.bytedance.android.live.base.model.user.User;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public final class PollStartContent {

    @InterfaceC65349Pkn("end_time")
    public long endTime;

    @InterfaceC65349Pkn("operator")
    public User operator;

    @InterfaceC65349Pkn("option_list")
    public List<PollOptionInfo> optionList = new ArrayList();

    @InterfaceC65349Pkn("start_time")
    public long startTime;

    @InterfaceC65349Pkn("title")
    public String title;
}
