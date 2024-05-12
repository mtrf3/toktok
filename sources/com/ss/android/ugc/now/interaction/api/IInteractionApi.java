package com.ss.android.ugc.now.interaction.api;

import X.AbstractC73672Svk;
import X.E4Q;
import X.E4T;
import X.InterfaceC195787mI;
import X.InterfaceC64985Pev;
import X.InterfaceC64987Pex;
import X.InterfaceC64989Pez;
import com.ss.android.ugc.aweme.comment.model.BaseCommentResponse;
import com.ss.android.ugc.aweme.comment.model.CommentResponse;
import com.ss.android.ugc.now.interaction.model.CommentItemList;
import com.ss.android.ugc.now.interaction.model.LikeListResponse;

/* loaded from: classes4.dex */
public interface IInteractionApi {
    @E4Q("/aweme/v1/comment/delete/")
    AbstractC73672Svk<BaseCommentResponse> deleteComment(@InterfaceC64989Pez("cid") String str);

    @E4Q("/aweme/v2/comment/list/")
    AbstractC73672Svk<CommentItemList> fetchCommentList(@InterfaceC64989Pez("aweme_id") String str, @InterfaceC64989Pez("cursor") long j, @InterfaceC64989Pez("count") int i, @InterfaceC64989Pez("insert_ids") String str2, @InterfaceC64989Pez("hybrid_sort_type") int i2, @InterfaceC64989Pez("scenario") int i3);

    @InterfaceC195787mI
    @E4T("/tiktok/video/like/list/v1")
    AbstractC73672Svk<LikeListResponse> fetchLikeList(@InterfaceC64987Pex("aweme_id") String str, @InterfaceC64987Pex("cursor") long j, @InterfaceC64987Pex("offset") long j2, @InterfaceC64987Pex("count") int i, @InterfaceC64987Pex("scenario") int i2, @InterfaceC64987Pex("extra") String str2);

    @E4Q("/aweme/v1/commit/item/digg/")
    void likeFeed(@InterfaceC64989Pez("aweme_id") String str, @InterfaceC64989Pez("type") int i);

    @InterfaceC195787mI
    @E4T("/aweme/v1/comment/publish/")
    AbstractC73672Svk<CommentResponse> publishComment(@InterfaceC64987Pex("aweme_id") String str, @InterfaceC64987Pex("text") String str2, @InterfaceC64987Pex("text_extra") String str3, @InterfaceC64987Pex("reply_id") String str4, @InterfaceC64985Pev("reply_to_reply_id") String str5, @InterfaceC64987Pex("skip_rethink") int i);
}
