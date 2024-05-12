package com.ss.android.ugc.aweme.comment.model;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct;

/* loaded from: classes4.dex */
public class CommentResponse extends BaseCommentResponse {

    @InterfaceC65349Pkn("comment")
    public Comment comment;

    @InterfaceC65349Pkn("rethink_popup")
    public CommentRethinkPopup commentRethinkPopup;

    @InterfaceC65349Pkn("label_info")
    public String starFakeLabel;

    @InterfaceC65349Pkn("upvote")
    public UpvoteStruct upvote;

    public void setStarFakeLabel(String str) {
        this.starFakeLabel = str;
        this.comment.setLabelInfo(str);
    }
}
