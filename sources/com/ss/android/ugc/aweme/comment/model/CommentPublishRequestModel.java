package com.ss.android.ugc.aweme.comment.model;

import X.InterfaceC65349Pkn;
import java.util.List;

/* loaded from: classes4.dex */
public class CommentPublishRequestModel extends BaseCommentPublishRequestModel {

    @InterfaceC65349Pkn("image_extra")
    public List<CommentImageModel> imageList;

    public List<CommentImageModel> getImageList() {
        return this.imageList;
    }

    public void setImageList(List<CommentImageModel> list) {
        this.imageList = list;
    }
}
