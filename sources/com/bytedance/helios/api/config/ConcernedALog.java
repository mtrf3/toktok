package com.bytedance.helios.api.config;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class ConcernedALog extends F9E {

    @InterfaceC65349Pkn("content")
    public final String content;

    @InterfaceC65349Pkn("dataTypes")
    public final List<String> dataTypes;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.content, this.dataTypes};
    }

    public ConcernedALog(String content, List<String> dataTypes) {
        o.LJIIIZ(content, "content");
        o.LJIIIZ(dataTypes, "dataTypes");
        this.content = content;
        this.dataTypes = dataTypes;
    }
}
