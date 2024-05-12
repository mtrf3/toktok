package com.bytedance.android.live.linkmock.api;

import X.C15970jx;
import X.C30868C9o;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class LinkMockDummyService implements ILinkMockService {
    @Override // com.bytedance.android.live.linkmock.api.ILinkMockService
    public final String getEntranceString() {
        return "";
    }

    @Override // com.bytedance.android.live.linkmock.api.ILinkMockService, X.InterfaceC06390Mx
    public final /* bridge */ /* synthetic */ void onInit() {
        C15970jx.LIZ(this);
    }

    @Override // com.bytedance.android.live.linkmock.api.ILinkMockService
    public final void setUserToken(String str, String str2) {
    }

    @Override // com.bytedance.android.live.linkmock.api.ILinkMockService
    public final Map<String, String> getAllUserToken() {
        return new LinkedHashMap();
    }

    @Override // com.bytedance.android.live.linkmock.api.ILinkMockService
    public final void showMockLoginFragment() {
        C30868C9o.LJI("Please add \"add_virtual_env_only_module=1\" in local.properties so that you can show the fragment.");
    }

    @Override // com.bytedance.android.live.linkmock.api.ILinkMockService
    public final void showVirtualLinkFragment() {
        C30868C9o.LJI("Please add \"add_virtual_env_only_module=1\" in local.properties so that you can show the fragment.");
    }
}
