package com.ss.android.ugc.profile.platform.base.data;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;

/* loaded from: classes5.dex */
public final class ProfileUser extends BaseResponse {

    @InterfaceC65349Pkn("common")
    public ProfileCommonInfo common;

    @InterfaceC65349Pkn("header")
    public ProfileComponents headerComponents;

    @InterfaceC65349Pkn("legacy")
    public Legacy legacy;

    @InterfaceC65349Pkn("log_pb")
    public LogPbBean logPb;

    @InterfaceC65349Pkn("nav_bar")
    public ProfileComponents navBarComponents;

    @InterfaceC65349Pkn("pop_up")
    public ProfileComponents popUpComponents;

    @InterfaceC65349Pkn("profile_tab")
    public ProfileComponents tabsComponents;
}
