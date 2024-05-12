package com.ss.android.ugc.aweme.nows.feed.common;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class MarkReadRequestPayload extends F9E {

    @InterfaceC65349Pkn("now_posts")
    public final ArrayList<MarkReadRequest> posts;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MarkReadRequestPayload copy$default(MarkReadRequestPayload markReadRequestPayload, ArrayList arrayList, int i, Object obj) {
        if ((i & 1) != 0) {
            arrayList = markReadRequestPayload.posts;
        }
        return markReadRequestPayload.copy(arrayList);
    }

    public final MarkReadRequestPayload copy(ArrayList<MarkReadRequest> posts) {
        o.LJIIIZ(posts, "posts");
        return new MarkReadRequestPayload(posts);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.posts};
    }

    public final ArrayList<MarkReadRequest> getPosts() {
        return this.posts;
    }

    public MarkReadRequestPayload(ArrayList<MarkReadRequest> posts) {
        o.LJIIIZ(posts, "posts");
        this.posts = posts;
    }
}
