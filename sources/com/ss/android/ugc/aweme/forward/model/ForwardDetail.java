package com.ss.android.ugc.aweme.forward.model;

import X.InterfaceC65316PkG;
import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* loaded from: classes2.dex */
public class ForwardDetail extends BaseResponse implements InterfaceC65316PkG {

    @InterfaceC65349Pkn("aweme_info")
    public Aweme aweme;

    @InterfaceC65349Pkn("comment_info")
    public Comment comment;

    @InterfaceC65349Pkn("label_info")
    public String labelInfo;
    public String requestId;

    public Aweme getAweme() {
        return this.aweme;
    }

    public Comment getComment() {
        return this.comment;
    }

    public String getLabelInfo() {
        return this.labelInfo;
    }

    @Override // X.InterfaceC65316PkG
    public String getRequestId() {
        return this.requestId;
    }

    public void setAweme(Aweme aweme) {
        this.aweme = aweme;
    }

    public void setComment(Comment comment) {
        this.comment = comment;
    }

    public void setLabelInfo(String str) {
        this.labelInfo = str;
    }

    @Override // X.InterfaceC65316PkG
    public void setRequestId(String str) {
        Aweme aweme = this.aweme;
        if (aweme != null) {
            aweme.setRequestId(str);
        }
        this.requestId = str;
    }
}
