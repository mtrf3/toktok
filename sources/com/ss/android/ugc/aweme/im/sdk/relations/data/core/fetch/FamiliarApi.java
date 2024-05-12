package com.ss.android.ugc.aweme.im.sdk.relations.data.core.fetch;

import X.C76L;
import X.E4T;
import X.InterfaceC195787mI;
import X.InterfaceC64987Pex;
import com.ss.android.ugc.aweme.im.sdk.relations.data.core.fetch.model.FamiliarsRelationFetchResponse;

/* loaded from: classes2.dex */
public interface FamiliarApi {
    @InterfaceC195787mI
    @E4T("im/spotlight/friend_relation/")
    C76L<FamiliarsRelationFetchResponse> getSpotlightRelationOfFriends(@InterfaceC64987Pex("params") String str);
}
