package com.ss.android.ugc.aweme.comment.model;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteList;
import java.util.List;

/* loaded from: classes4.dex */
public class CommentItemList extends BaseCommentResponse {

    @InterfaceC65349Pkn("alias_comment_deleted")
    public boolean aliasCommentDeleted;

    @InterfaceC65349Pkn("cursor")
    public long cursor;

    @InterfaceC65349Pkn("fold_comment_cursor")
    public long foldCommentCursor;

    @InterfaceC65349Pkn("has_filtered_comments")
    public int hasFilteredComments;

    @InterfaceC65349Pkn("has_fold_comment")
    public boolean hasFoldComment;

    @InterfaceC65349Pkn("has_more")
    public boolean hasMore;

    @InterfaceC65349Pkn("comments")
    public List<Comment> items;

    @InterfaceC65349Pkn("new_insert_ids")
    public String newInsertIds;

    @InterfaceC65349Pkn("reply_style")
    public int replyStyle;

    @InterfaceC65349Pkn("security_guide")
    public int securityGuide;

    @InterfaceC65349Pkn("top_gifts")
    public List<CommentGiftStruct> topGiftList;

    @InterfaceC65349Pkn("total")
    public long total;

    @InterfaceC65349Pkn("upvote_list")
    public UpvoteList upvoteList;

    public boolean hasFilteredComments() {
        if (this.hasFilteredComments == 1) {
            return true;
        }
        return false;
    }
}
