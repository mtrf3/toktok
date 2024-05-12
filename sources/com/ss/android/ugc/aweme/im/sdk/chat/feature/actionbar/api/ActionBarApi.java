package com.ss.android.ugc.aweme.im.sdk.chat.feature.actionbar.api;

import X.E8L;
import X.InterfaceC67352kd;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.actionbar.model.ActionBarResponse;

/* loaded from: classes2.dex */
public interface ActionBarApi {
    @E8L("im/action_bar/get")
    Object getActionBar(InterfaceC67352kd<? super ActionBarResponse> interfaceC67352kd);

    @E8L("im/action_bar_v2/get")
    Object getActionBarNewApi(InterfaceC67352kd<? super ActionBarResponse> interfaceC67352kd);
}
