package com.ss.android.ugc.aweme.profile.api;

import X.C76L;
import X.E4Q;
import X.InterfaceC64989Pez;
import com.ss.android.ugc.aweme.profile.model.ActivityLinkResponse;
import java.util.HashMap;

/* loaded from: classes7.dex */
public final class ActivityLinkManager {
    public static final /* synthetic */ int LIZ = 0;

    /* loaded from: classes7.dex */
    public interface ActivityLinkApi {
        @E4Q("/aweme/v1/activity/profile_link/")
        C76L<ActivityLinkResponse> getLinkInfo();

        @E4Q("/aweme/v1/activity/profile_link/")
        C76L<ActivityLinkResponse> getLinkInfo(@InterfaceC64989Pez("sec_uid") String str, @InterfaceC64989Pez("show_other_banner") boolean z);
    }

    static {
        new HashMap();
    }
}
