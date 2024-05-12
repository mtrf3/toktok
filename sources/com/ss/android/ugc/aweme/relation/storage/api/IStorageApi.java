package com.ss.android.ugc.aweme.relation.storage.api;

import X.E4Q;
import X.InterfaceC64989Pez;
import X.InterfaceC67352kd;
import com.ss.android.ugc.aweme.relation.storage.model.LocalListResponse;

/* loaded from: classes2.dex */
public interface IStorageApi {
    @E4Q("/tiktok/user/relation/local/list/v1/")
    Object getRelationList(@InterfaceC64989Pez("local_types") String str, @InterfaceC64989Pez("count") int i, @InterfaceC64989Pez("page_token") String str2, InterfaceC67352kd<? super LocalListResponse> interfaceC67352kd);
}
