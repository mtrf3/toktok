package com.ss.android.ugc.now.interaction.api;

import X.AbstractC73672Svk;
import X.C791338r;
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
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class InteractionApiService implements IInteractionApi {
    public static final InteractionApiService LIZIZ = new InteractionApiService();
    public final /* synthetic */ IInteractionApi LIZ = (IInteractionApi) C791338r.LIZIZ.create(IInteractionApi.class);

    @Override // com.ss.android.ugc.now.interaction.api.IInteractionApi
    @E4Q("/aweme/v1/comment/delete/")
    public AbstractC73672Svk<BaseCommentResponse> deleteComment(@InterfaceC64989Pez("cid") String str) {
        return this.LIZ.deleteComment(str);
    }

    @Override // com.ss.android.ugc.now.interaction.api.IInteractionApi
    @E4Q("/aweme/v2/comment/list/")
    public AbstractC73672Svk<CommentItemList> fetchCommentList(@InterfaceC64989Pez("aweme_id") String aid, @InterfaceC64989Pez("cursor") long j, @InterfaceC64989Pez("count") int i, @InterfaceC64989Pez("insert_ids") String str, @InterfaceC64989Pez("hybrid_sort_type") int i2, @InterfaceC64989Pez("scenario") int i3) {
        o.LJIIIZ(aid, "aid");
        return this.LIZ.fetchCommentList(aid, j, i, str, i2, i3);
    }

    @Override // com.ss.android.ugc.now.interaction.api.IInteractionApi
    @InterfaceC195787mI
    @E4T("/tiktok/video/like/list/v1")
    public AbstractC73672Svk<LikeListResponse> fetchLikeList(@InterfaceC64987Pex("aweme_id") String aid, @InterfaceC64987Pex("cursor") long j, @InterfaceC64987Pex("offset") long j2, @InterfaceC64987Pex("count") int i, @InterfaceC64987Pex("scenario") int i2, @InterfaceC64987Pex("extra") String str) {
        o.LJIIIZ(aid, "aid");
        return this.LIZ.fetchLikeList(aid, j, j2, i, i2, str);
    }

    @Override // com.ss.android.ugc.now.interaction.api.IInteractionApi
    @E4Q("/aweme/v1/commit/item/digg/")
    public void likeFeed(@InterfaceC64989Pez("aweme_id") String aid, @InterfaceC64989Pez("type") int i) {
        o.LJIIIZ(aid, "aid");
        this.LIZ.likeFeed(aid, i);
    }

    @Override // com.ss.android.ugc.now.interaction.api.IInteractionApi
    @InterfaceC195787mI
    @E4T("/aweme/v1/comment/publish/")
    public AbstractC73672Svk<CommentResponse> publishComment(@InterfaceC64987Pex("aweme_id") String aid, @InterfaceC64987Pex("text") String text, @InterfaceC64987Pex("text_extra") String str, @InterfaceC64987Pex("reply_id") String str2, @InterfaceC64985Pev("reply_to_reply_id") String str3, @InterfaceC64987Pex("skip_rethink") int i) {
        o.LJIIIZ(aid, "aid");
        o.LJIIIZ(text, "text");
        return this.LIZ.publishComment(aid, text, str, str2, str3, i);
    }
}
