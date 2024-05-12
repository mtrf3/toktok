package com.ss.android.ugc.aweme.feed;

import X.C2U8;
import X.C58096Mr6;
import X.FW5;
import com.ss.android.ugc.governance.eventbus.IEvent;

/* loaded from: classes7.dex */
public class CommonFeedLaunchServiceImpl implements ICommonFeedLaunchService {
    @Override // com.ss.android.ugc.aweme.feed.ICommonFeedLaunchService
    public final void LIZJ() {
    }

    @Override // com.ss.android.ugc.aweme.feed.ICommonFeedLaunchService
    public final void LIZLLL() {
    }

    public static ICommonFeedLaunchService LJ() {
        Object LIZ = C58096Mr6.LIZ(ICommonFeedLaunchService.class, false);
        if (LIZ != null) {
            return (ICommonFeedLaunchService) LIZ;
        }
        return new CommonFeedLaunchServiceImpl();
    }

    @Override // com.ss.android.ugc.aweme.feed.ICommonFeedLaunchService
    public final void LIZ() {
        C2U8.LIZIZ(new IEvent() { // from class: X.2JD
            @Override // com.ss.android.ugc.governance.eventbus.IEvent
            public final /* synthetic */ IEvent post() {
                C2U8.LIZ(this);
                return this;
            }

            @Override // com.ss.android.ugc.governance.eventbus.IEvent
            public final /* synthetic */ IEvent postSticky() {
                C2U8.LIZIZ(this);
                return this;
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.feed.ICommonFeedLaunchService
    public final void LIZIZ(boolean z) {
        if (FW5.LIZJ == null) {
            FW5.LIZJ = Boolean.valueOf(z);
        }
    }
}
