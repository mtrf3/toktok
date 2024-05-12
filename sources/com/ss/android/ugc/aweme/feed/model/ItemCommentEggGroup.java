package com.ss.android.ugc.aweme.feed.model;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes2.dex */
public class ItemCommentEggGroup implements Serializable {

    @InterfaceC65349Pkn("item_comment_eggs")
    public List<ItemCommentEggData> commentEggData;

    @InterfaceC65349Pkn("edit_hint_list")
    public List<EditHint> editintist;

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ItemCommentEggGroup{editintist=");
        LIZ.append(this.editintist);
        LIZ.append(", commentEggData=");
        return C1NE.LIZIZ(LIZ, this.commentEggData, '}', LIZ);
    }

    public List<ItemCommentEggData> getCommentEggData() {
        return this.commentEggData;
    }

    public List<EditHint> getEditintist() {
        return this.editintist;
    }

    public void setCommentEggData(List<ItemCommentEggData> list) {
        this.commentEggData = list;
    }

    public void setEditintist(List<EditHint> list) {
        this.editintist = list;
    }
}
