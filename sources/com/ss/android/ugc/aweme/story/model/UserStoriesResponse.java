package com.ss.android.ugc.aweme.story.model;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class UserStoriesResponse extends BaseResponse implements Serializable {

    @InterfaceC65349Pkn("awemes")
    public final List<Aweme> awemes;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UserStoriesResponse copy$default(UserStoriesResponse userStoriesResponse, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = userStoriesResponse.awemes;
        }
        return userStoriesResponse.copy(list);
    }

    public final UserStoriesResponse copy(List<? extends Aweme> list) {
        return new UserStoriesResponse(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UserStoriesResponse) && o.LJ(this.awemes, ((UserStoriesResponse) obj).awemes);
    }

    public int hashCode() {
        List<Aweme> list = this.awemes;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("UserStoriesResponse(awemes=");
        return C1NE.LIZIZ(LIZ, this.awemes, ')', LIZ);
    }

    public final List<Aweme> getAwemes() {
        return this.awemes;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UserStoriesResponse(List<? extends Aweme> list) {
        this.awemes = list;
    }
}
