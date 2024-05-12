package com.ss.android.ugc.aweme.lexical.core.textblock;

import X.F9E;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class LexicalTextMetadata extends F9E {
    public final String id;

    /* JADX WARN: Multi-variable type inference failed */
    public LexicalTextMetadata() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ LexicalTextMetadata copy$default(LexicalTextMetadata lexicalTextMetadata, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = lexicalTextMetadata.id;
        }
        return lexicalTextMetadata.copy(str);
    }

    public final LexicalTextMetadata copy(String id) {
        o.LJIIIZ(id, "id");
        return new LexicalTextMetadata(id);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.id};
    }

    public final String getId() {
        return this.id;
    }

    public LexicalTextMetadata(String id) {
        o.LJIIIZ(id, "id");
        this.id = id;
    }

    public /* synthetic */ LexicalTextMetadata(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str);
    }
}
