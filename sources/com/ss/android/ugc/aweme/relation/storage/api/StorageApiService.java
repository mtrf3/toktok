package com.ss.android.ugc.aweme.relation.storage.api;

import X.C38U;
import X.E4Q;
import X.InterfaceC64989Pez;
import X.InterfaceC67352kd;
import com.ss.android.ugc.aweme.relation.storage.model.LocalListResponse;

/* loaded from: classes2.dex */
public final class StorageApiService implements IStorageApi {
    public static final StorageApiService LIZIZ = new StorageApiService();
    public final /* synthetic */ IStorageApi LIZ = (IStorageApi) C38U.LIZIZ.create(IStorageApi.class);

    @Override // com.ss.android.ugc.aweme.relation.storage.api.IStorageApi
    @E4Q("/tiktok/user/relation/local/list/v1/")
    public Object getRelationList(@InterfaceC64989Pez("local_types") String str, @InterfaceC64989Pez("count") int i, @InterfaceC64989Pez("page_token") String str2, InterfaceC67352kd<? super LocalListResponse> interfaceC67352kd) {
        return this.LIZ.getRelationList(str, i, str2, interfaceC67352kd);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(6:5|6|(1:(1:(1:(2:11|12)(2:14|15))(3:16|17|(1:19)(1:20)))(3:21|22|23))(8:38|39|40|41|42|44|45|(2:47|48)(1:49))|24|25|27))|56|6|(0)(0)|24|25|27|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008c, code lost:
    
        r10 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00d5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(X.C38K r18, int r19, int r20, X.InterfaceC67352kd<? super com.ss.android.ugc.aweme.relation.storage.model.LocalListResponse> r21) {
        /*
            Method dump skipped, instructions count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.relation.storage.api.StorageApiService.LIZ(X.38K, int, int, X.2kd):java.lang.Object");
    }
}
