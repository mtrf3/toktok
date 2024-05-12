package com.ss.android.ugc.aweme.comment.bubble;

import X.AbstractC73672Svk;
import X.E8L;
import X.InterfaceC64986Pew;
import com.ss.android.ugc.aweme.comment.model.CommentItemList;

/* loaded from: classes4.dex */
public interface IBarrageCommentAndLikeApi {
    @E8L("/aweme/v2/comment/list/")
    AbstractC73672Svk<CommentItemList> fetchCommentList(@InterfaceC64986Pew("aweme_id") String str, @InterfaceC64986Pew("cursor") long j, @InterfaceC64986Pew("comment_character_count_limit") int i, @InterfaceC64986Pew("offline_pin_comment") int i2, @InterfaceC64986Pew("count") int i3, @InterfaceC64986Pew("insert_ids") String str2, @InterfaceC64986Pew("channel_id") int i4, @InterfaceC64986Pew("source_type") int i5, @InterfaceC64986Pew("scenario") int i6, @InterfaceC64986Pew("is_non_personalized") boolean z);
}
