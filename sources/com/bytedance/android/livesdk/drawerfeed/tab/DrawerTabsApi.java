package com.bytedance.android.livesdk.drawerfeed.tab;

import X.AbstractC73672Svk;
import X.BOH;
import X.E8L;
import X.InterfaceC64986Pew;

/* loaded from: classes6.dex */
public interface DrawerTabsApi {
    @E8L("/webcast/feed/drawer_tabs/")
    AbstractC73672Svk<BOH<DrawerTabsItem>> queryDrawerTabs(@InterfaceC64986Pew("user_id") long j);
}
