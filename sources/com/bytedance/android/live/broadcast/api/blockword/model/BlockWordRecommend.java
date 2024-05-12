package com.bytedance.android.live.broadcast.api.blockword.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public final class BlockWordRecommend extends F9E {

    @InterfaceC65349Pkn("content")
    public String content;

    @InterfaceC65349Pkn("isSelect")
    public boolean selected;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.selected), this.content};
    }

    public BlockWordRecommend(boolean z, String content) {
        o.LJIIIZ(content, "content");
        this.selected = z;
        this.content = content;
    }
}
