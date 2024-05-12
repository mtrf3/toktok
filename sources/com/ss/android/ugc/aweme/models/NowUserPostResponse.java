package com.ss.android.ugc.aweme.models;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.now.UserNowPost;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class NowUserPostResponse extends BaseResponse {

    @InterfaceC65349Pkn("user_now_post")
    public final UserNowPost userNowPost;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof NowUserPostResponse) && o.LJ(this.userNowPost, ((NowUserPostResponse) obj).userNowPost);
    }

    public final int hashCode() {
        UserNowPost userNowPost = this.userNowPost;
        if (userNowPost == null) {
            return 0;
        }
        return userNowPost.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("NowUserPostResponse(userNowPost=");
        LIZ.append(this.userNowPost);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public NowUserPostResponse(UserNowPost userNowPost) {
        this.userNowPost = userNowPost;
    }
}
