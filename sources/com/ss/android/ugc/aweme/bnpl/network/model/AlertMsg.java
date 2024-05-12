package com.ss.android.ugc.aweme.bnpl.network.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.o;

/* loaded from: classes20.dex */
public final class AlertMsg extends F9E {

    @InterfaceC65349Pkn("content")
    public final String content;

    @InterfaceC65349Pkn("title")
    public final String title;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.title, this.content};
    }

    public AlertMsg(String title, String content) {
        o.LJIIIZ(title, "title");
        o.LJIIIZ(content, "content");
        this.title = title;
        this.content = content;
    }
}
