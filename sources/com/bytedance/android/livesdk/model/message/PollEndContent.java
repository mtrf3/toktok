package com.bytedance.android.livesdk.model.message;

import X.InterfaceC65349Pkn;
import com.bytedance.android.live.base.model.user.User;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public final class PollEndContent {

    @InterfaceC65349Pkn("end_type")
    public int endType;

    @InterfaceC65349Pkn("operator")
    public User operator;

    @InterfaceC65349Pkn("option_list")
    public List<PollOptionInfo> optionList = new ArrayList();
}
