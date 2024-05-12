package com.ss.android.ugc.aweme.relation.api;

import X.AbstractC73672Svk;
import X.C46104I7o;
import X.E4Q;
import X.EFJ;
import X.InterfaceC64997Pf7;
import X.InterfaceC67352kd;
import com.ss.android.ugc.aweme.relation.follow.model.RelationStatus;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class SocialFollowApi implements RealSocialFollowApi {
    public final /* synthetic */ RealSocialFollowApi LIZ;

    static {
        new SocialFollowApi();
    }

    @Override // com.ss.android.ugc.aweme.relation.api.RealSocialFollowApi
    @E4Q("/aweme/v1/commit/follow/user/")
    public AbstractC73672Svk<RelationStatus> follow(@InterfaceC64997Pf7 Map<String, String> map) {
        o.LJIIIZ(map, "map");
        return this.LIZ.follow(map);
    }

    @Override // com.ss.android.ugc.aweme.relation.api.RealSocialFollowApi
    @E4Q("/aweme/v1/commit/follow/user/")
    public Object followOffline(@InterfaceC64997Pf7 Map<String, String> map, InterfaceC67352kd<? super RelationStatus> interfaceC67352kd) {
        return this.LIZ.followOffline(map, interfaceC67352kd);
    }

    public SocialFollowApi() {
        String API_URL_PREFIX_SI = EFJ.LIZJ;
        o.LJIIIIZZ(API_URL_PREFIX_SI, "API_URL_PREFIX_SI");
        this.LIZ = (RealSocialFollowApi) C46104I7o.LJIIZILJ(API_URL_PREFIX_SI, RealSocialFollowApi.class);
    }
}
