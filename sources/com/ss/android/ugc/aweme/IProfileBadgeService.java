package com.ss.android.ugc.aweme;

import X.InterfaceC53724L6q;
import X.InterfaceC72740Sgi;
import X.InterfaceC72741Sgj;

/* loaded from: classes13.dex */
public interface IProfileBadgeService {
    void refresh();

    void removeProfileBadgeIdListener(InterfaceC72740Sgi interfaceC72740Sgi);

    void removeProfileBadgeIsShowListener(InterfaceC72741Sgj interfaceC72741Sgj);

    void subscribe(InterfaceC53724L6q interfaceC53724L6q);

    void unsubscribe(InterfaceC53724L6q interfaceC53724L6q);

    void updateProfileBadgeId(long j, InterfaceC72740Sgi interfaceC72740Sgi);

    void updateProfileBadgeIsShow(boolean z, InterfaceC72741Sgj interfaceC72741Sgj);
}
