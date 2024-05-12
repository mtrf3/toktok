package com.ss.android.ugc.aweme.upvote.api;

import X.AbstractC73638SvC;
import X.AbstractC73672Svk;
import X.E8L;
import X.E8M;
import X.InterfaceC195757mF;
import X.InterfaceC64985Pev;
import X.InterfaceC64986Pew;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.translation.model.MultiTranslationResult;
import com.ss.android.ugc.aweme.upvote.model.RepostListResponse;
import com.ss.android.ugc.aweme.upvote.model.UpvoteBatchListResponse;
import com.ss.android.ugc.aweme.upvote.model.UpvoteBatchPublishResponse;
import com.ss.android.ugc.aweme.upvote.model.UpvoteListResponse;
import com.ss.android.ugc.aweme.upvote.model.UpvotePublishResponse;

/* loaded from: classes4.dex */
public interface IUpvoteApi {
    @E8M("tiktok/v1/upvote/delete")
    @InterfaceC195757mF
    AbstractC73638SvC<BaseResponse> deleteUpvote(@InterfaceC64985Pev("item_id") String str);

    @E8L("aweme/v1/comment/digg/")
    AbstractC73672Svk<BaseResponse> digg(@InterfaceC64986Pew("cid") String str, @InterfaceC64986Pew("aweme_id") String str2, @InterfaceC64986Pew("digg_type") int i);

    @E8L("tiktok/v1/upvote/item/list")
    AbstractC73672Svk<RepostListResponse> getRepostVideoList(@InterfaceC64986Pew("user_id") String str, @InterfaceC64986Pew("offset") long j, @InterfaceC64986Pew("count") int i, @InterfaceC64986Pew("scene") Integer num);

    @E8L("tiktok/v1/upvote/batch_list")
    AbstractC73672Svk<UpvoteBatchListResponse> getUpvoteBatchList(@InterfaceC64986Pew("item_ids") String str, @InterfaceC64986Pew("upvote_reasons") String str2, @InterfaceC64986Pew("upvote_scene") Integer num, @InterfaceC64986Pew("insert_map") String str3, @InterfaceC64986Pew("insert_map_uid") String str4, @InterfaceC64986Pew("is_non_personalized") boolean z);

    @E8L("tiktok/v1/upvote/list")
    AbstractC73672Svk<UpvoteListResponse> getUpvoteList(@InterfaceC64986Pew("item_id") String str, @InterfaceC64986Pew("cursor") long j, @InterfaceC64986Pew("count") int i, @InterfaceC64986Pew("insert_ids") String str2, @InterfaceC64986Pew("upvote_reason") String str3, @InterfaceC64986Pew("scene") Integer num);

    @E8M("tiktok/v1/upvote/publish")
    @InterfaceC195757mF
    AbstractC73638SvC<UpvotePublishResponse> publishUpvote(@InterfaceC64985Pev("item_id") String str, @InterfaceC64985Pev("text") String str2, @InterfaceC64985Pev("skip_rethink") Boolean bool, @InterfaceC64985Pev("text_extra") String str3, @InterfaceC64985Pev("image_extra") String str4);

    @E8M("tiktok/v1/upvote/batch_publish")
    @InterfaceC195757mF
    AbstractC73638SvC<UpvoteBatchPublishResponse> publishUpvoteBatch(@InterfaceC64985Pev("item_ids") String str);

    @E8M("/aweme/v1/contents/translation/")
    @InterfaceC195757mF
    AbstractC73672Svk<MultiTranslationResult> translate(@InterfaceC64985Pev("trg_lang") String str, @InterfaceC64985Pev("translation_info") String str2, @InterfaceC64986Pew("scene") int i);
}
