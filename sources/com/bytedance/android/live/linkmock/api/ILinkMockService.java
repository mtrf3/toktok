package com.bytedance.android.live.linkmock.api;

import X.InterfaceC06390Mx;
import java.util.Map;

/* loaded from: classes.dex */
public interface ILinkMockService extends InterfaceC06390Mx {
    Map<String, String> getAllUserToken();

    String getEntranceString();

    @Override // X.InterfaceC06390Mx
    /* bridge */ /* synthetic */ void onInit();

    void setUserToken(String str, String str2);

    void showMockLoginFragment();

    void showVirtualLinkFragment();
}
