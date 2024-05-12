package com.bytedance.android.live.broadcast.api.blockword.model;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public final class BlockWordGetResponse {

    @InterfaceC65349Pkn("word")
    public final List<BlockWord> words;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BlockWordGetResponse) && o.LJ(this.words, ((BlockWordGetResponse) obj).words);
    }

    public final int hashCode() {
        List<BlockWord> list = this.words;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BlockWordGetResponse(words=");
        return C1NE.LIZIZ(LIZ, this.words, ')', LIZ);
    }

    public BlockWordGetResponse(List<BlockWord> list) {
        this.words = list;
    }
}
