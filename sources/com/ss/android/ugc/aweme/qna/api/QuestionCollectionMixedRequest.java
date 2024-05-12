package com.ss.android.ugc.aweme.qna.api;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class QuestionCollectionMixedRequest extends F9E {

    @InterfaceC65349Pkn("forum_recommend_scene")
    public final int forumRecommendScene;

    @InterfaceC65349Pkn("next_page_token")
    public final String next_page_token;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.forumRecommendScene), this.next_page_token};
    }

    public QuestionCollectionMixedRequest(int i, String next_page_token) {
        o.LJIIIZ(next_page_token, "next_page_token");
        this.forumRecommendScene = i;
        this.next_page_token = next_page_token;
    }
}
