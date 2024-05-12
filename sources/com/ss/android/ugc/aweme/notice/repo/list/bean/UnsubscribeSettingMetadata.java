package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.F9E;
import X.InterfaceC65349Pkn;

/* loaded from: classes9.dex */
public final class UnsubscribeSettingMetadata extends F9E {

    @InterfaceC65349Pkn("group")
    public final int group;

    @InterfaceC65349Pkn("has_unsubscribe_setting")
    public final boolean hasUnsubscribeSetting;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.group), Boolean.valueOf(this.hasUnsubscribeSetting)};
    }

    public UnsubscribeSettingMetadata(int i, boolean z) {
        this.group = i;
        this.hasUnsubscribeSetting = z;
    }
}
