package com.ss.android.ugc.aweme.repo;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.comment.model.CommentRethinkPopup;

/* loaded from: classes4.dex */
public final class CreateDanmakuResponse extends BaseResponse {

    @InterfaceC65349Pkn("danmaku_id")
    public final String danmakuId = "";

    @InterfaceC65349Pkn("rethink_toast")
    public final CommentRethinkPopup rethinkToast;

    public final String getDanmakuId() {
        return this.danmakuId;
    }

    public final CommentRethinkPopup getRethinkToast() {
        return this.rethinkToast;
    }
}
