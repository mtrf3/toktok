package com.ss.ugc.effectplatform.model;

import X.F9E;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class TagInfo extends F9E {
    public final String tag;

    public static /* synthetic */ TagInfo copy$default(TagInfo tagInfo, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tagInfo.tag;
        }
        return tagInfo.copy(str);
    }

    public final TagInfo copy(String tag) {
        o.LJIIJ(tag, "tag");
        return new TagInfo(tag);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.tag};
    }

    public final String getTag() {
        return this.tag;
    }

    public TagInfo(String tag) {
        o.LJIIJ(tag, "tag");
        this.tag = tag;
    }
}
