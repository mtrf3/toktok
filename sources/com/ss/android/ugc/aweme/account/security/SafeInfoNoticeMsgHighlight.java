package com.ss.android.ugc.aweme.account.security;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class SafeInfoNoticeMsgHighlight extends F9E {

    @InterfaceC65349Pkn("content")
    public final String content;

    @InterfaceC65349Pkn("scheme")
    public final String scheme;

    /* JADX WARN: Multi-variable type inference failed */
    public SafeInfoNoticeMsgHighlight() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.content, this.scheme};
    }

    public SafeInfoNoticeMsgHighlight(String content, String scheme) {
        o.LJIIIZ(content, "content");
        o.LJIIIZ(scheme, "scheme");
        this.content = content;
        this.scheme = scheme;
    }

    public /* synthetic */ SafeInfoNoticeMsgHighlight(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }
}
