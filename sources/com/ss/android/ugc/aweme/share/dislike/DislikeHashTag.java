package com.ss.android.ugc.aweme.share.dislike;

import X.F9E;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class DislikeHashTag extends F9E {
    public final String id;
    public final String name;

    /* JADX WARN: Multi-variable type inference failed */
    public DislikeHashTag() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ DislikeHashTag copy$default(DislikeHashTag dislikeHashTag, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dislikeHashTag.id;
        }
        if ((i & 2) != 0) {
            str2 = dislikeHashTag.name;
        }
        return dislikeHashTag.copy(str, str2);
    }

    public final DislikeHashTag copy(String id, String name) {
        o.LJIIIZ(id, "id");
        o.LJIIIZ(name, "name");
        return new DislikeHashTag(id, name);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.id, this.name};
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public DislikeHashTag(String id, String name) {
        o.LJIIIZ(id, "id");
        o.LJIIIZ(name, "name");
        this.id = id;
        this.name = name;
    }

    public /* synthetic */ DislikeHashTag(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }
}
