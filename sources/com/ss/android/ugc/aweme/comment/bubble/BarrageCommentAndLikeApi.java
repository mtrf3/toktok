package com.ss.android.ugc.aweme.comment.bubble;

import X.AbstractC73672Svk;
import X.C77800Ug8;
import X.E8L;
import X.EFJ;
import X.InterfaceC64986Pew;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.comment.model.CommentItemList;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class BarrageCommentAndLikeApi implements IBarrageCommentAndLikeApi {
    public static final BarrageCommentAndLikeApi LIZIZ = new BarrageCommentAndLikeApi();
    public final /* synthetic */ IBarrageCommentAndLikeApi LIZ;

    @Override // com.ss.android.ugc.aweme.comment.bubble.IBarrageCommentAndLikeApi
    @E8L("/aweme/v2/comment/list/")
    public AbstractC73672Svk<CommentItemList> fetchCommentList(@InterfaceC64986Pew("aweme_id") String aid, @InterfaceC64986Pew("cursor") long j, @InterfaceC64986Pew("comment_character_count_limit") int i, @InterfaceC64986Pew("offline_pin_comment") int i2, @InterfaceC64986Pew("count") int i3, @InterfaceC64986Pew("insert_ids") String str, @InterfaceC64986Pew("channel_id") int i4, @InterfaceC64986Pew("source_type") int i5, @InterfaceC64986Pew("scenario") int i6, @InterfaceC64986Pew("is_non_personalized") boolean z) {
        o.LJIIIZ(aid, "aid");
        return this.LIZ.fetchCommentList(aid, j, i, i2, i3, str, i4, i5, i6, z);
    }

    public BarrageCommentAndLikeApi() {
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        String str = EFJ.LIZJ;
        this.LIZ = (IBarrageCommentAndLikeApi) C77800Ug8.LIZIZ(str, "API_URL_PREFIX_SI", LIZLLL, str, IBarrageCommentAndLikeApi.class);
    }
}
