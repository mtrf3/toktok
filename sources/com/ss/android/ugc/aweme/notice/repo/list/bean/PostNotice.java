package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.F9E;
import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes10.dex */
public final class PostNotice extends F9E {

    @InterfaceC65349Pkn("aweme")
    public final Aweme aweme;

    /* JADX WARN: Multi-variable type inference failed */
    public PostNotice() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ PostNotice copy$default(PostNotice postNotice, Aweme aweme, int i, Object obj) {
        if ((i & 1) != 0) {
            aweme = postNotice.aweme;
        }
        return postNotice.copy(aweme);
    }

    public final PostNotice copy(Aweme aweme) {
        return new PostNotice(aweme);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.aweme};
    }

    public final Aweme getAweme() {
        return this.aweme;
    }

    public PostNotice(Aweme aweme) {
        this.aweme = aweme;
    }

    public /* synthetic */ PostNotice(Aweme aweme, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : aweme);
    }
}
