package com.bytedance.android.live.broadcast.api.blockword.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public final class BlockWord extends F9E {

    @InterfaceC65349Pkn("content")
    public String content;

    @InterfaceC65349Pkn("id")
    public int id;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.id), this.content};
    }

    public BlockWord(int i, String content) {
        o.LJIIIZ(content, "content");
        this.id = i;
        this.content = content;
    }
}
