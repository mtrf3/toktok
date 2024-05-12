package com.ss.android.ugc.aweme.favorites.business.collection;

import X.AbstractC73672Svk;
import X.C192497gz;
import X.E4Q;
import X.E4T;
import X.InterfaceC195787mI;
import X.InterfaceC37276Ek4;
import X.InterfaceC64987Pex;
import X.InterfaceC64989Pez;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* loaded from: classes4.dex */
public interface VideoCollectionApi {
    public static final C192497gz LIZ = C192497gz.LIZ;

    @E4Q("/aweme/v1/aweme/listcollection/")
    AbstractC73672Svk<AllFavoriteContentResponse> allFavoritesContent(@InterfaceC64989Pez("cursor") long j, @InterfaceC64989Pez("count") int i);

    @E4Q("/tiktok/collection/item_archive/overall/detail/v1")
    AbstractC73672Svk<CollectionAllFavoritesResponse> allFavoritesDetail(@InterfaceC64989Pez("scene") int i);

    @E4Q("/tiktok/collection/item_archive/item/candidate/list/v1")
    AbstractC73672Svk<CollectionContentResponse> candidateContent(@InterfaceC64989Pez("cursor") long j, @InterfaceC64989Pez("count") int i, @InterfaceC64989Pez("pull_type") int i2);

    @E4Q("/tiktok/collection/item_archive/item/list/v1")
    AbstractC73672Svk<CollectionContentResponse> collectionContent(@InterfaceC64989Pez("item_archive_id") String str, @InterfaceC64989Pez("cursor") long j, @InterfaceC64989Pez("count") int i, @InterfaceC64989Pez("pull_type") int i2);

    @E4Q("/tiktok/collection/item_archive/detail/v1")
    AbstractC73672Svk<CollectionDetailResponse> collectionDetail(@InterfaceC64989Pez("item_archive_id") String str);

    @E4Q("/tiktok/collection/item_archive/list/v1")
    AbstractC73672Svk<CollectionListResponse> collectionDetailList(@InterfaceC64989Pez("cursor") long j, @InterfaceC64989Pez("count") int i, @InterfaceC64989Pez("uid") String str, @InterfaceC64989Pez("sec_uid") String str2, @InterfaceC64989Pez("exclude_id") String str3);

    @InterfaceC195787mI
    @E4T("/tiktok/collection/item_archive/manage/v1")
    AbstractC73672Svk<CollectionManageResponse> collectionManage(@InterfaceC64987Pex("operation") int i, @InterfaceC64987Pex("item_archive_id") String str, @InterfaceC64987Pex("item_archive_name") String str2, @InterfaceC64987Pex("item_archive_id_from") String str3, @InterfaceC64987Pex("item_archive_id_to") String str4, @InterfaceC64987Pex("add_ids") String str5, @InterfaceC64987Pex("remove_ids") String str6, @InterfaceC64987Pex("move_ids") String str7, @InterfaceC64987Pex("status") Integer num);

    @E4Q("/tiktok/collection/item_archive/check/v1")
    AbstractC73672Svk<CollectionNameCheckResponse> collectionNameCheck(@InterfaceC64989Pez("check_type") int i, @InterfaceC64989Pez("name") String str);

    @E4Q("/tiktok/collection/item_archive/item/list/v1")
    InterfaceC37276Ek4<CollectionContentResponse> syncCollectionContent(@InterfaceC64989Pez("item_archive_id") String str, @InterfaceC64989Pez("cursor") long j, @InterfaceC64989Pez("count") int i, @InterfaceC64989Pez("pull_type") int i2);

    @E4Q("/aweme/v1/aweme/collect/")
    AbstractC73672Svk<BaseResponse> unFavorites(@InterfaceC64989Pez("aweme_id") String str, @InterfaceC64989Pez("action") int i);
}
