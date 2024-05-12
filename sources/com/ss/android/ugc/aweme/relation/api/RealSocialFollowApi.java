package com.ss.android.ugc.aweme.relation.api;

import X.AbstractC73672Svk;
import X.E4Q;
import X.InterfaceC64997Pf7;
import X.InterfaceC67352kd;
import com.ss.android.ugc.aweme.relation.follow.model.RelationStatus;
import java.util.Map;

/* loaded from: classes10.dex */
public interface RealSocialFollowApi {
    @E4Q("/aweme/v1/commit/follow/user/")
    AbstractC73672Svk<RelationStatus> follow(@InterfaceC64997Pf7 Map<String, String> map);

    @E4Q("/aweme/v1/commit/follow/user/")
    Object followOffline(@InterfaceC64997Pf7 Map<String, String> map, InterfaceC67352kd<? super RelationStatus> interfaceC67352kd);
}
