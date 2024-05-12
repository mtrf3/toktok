package com.ss.android.ugc.aweme.im.sdk.chat.data.model;

import X.F9E;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class NamedValue extends F9E {
    public final String name;
    public final Content value;

    public static /* synthetic */ NamedValue copy$default(NamedValue namedValue, String str, Content content, int i, Object obj) {
        if ((i & 1) != 0) {
            str = namedValue.name;
        }
        if ((i & 2) != 0) {
            content = namedValue.value;
        }
        return namedValue.copy(str, content);
    }

    public final NamedValue copy(String name, Content value) {
        o.LJIIIZ(name, "name");
        o.LJIIIZ(value, "value");
        return new NamedValue(name, value);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.name, this.value};
    }

    public final String getName() {
        return this.name;
    }

    public final Content getValue() {
        return this.value;
    }

    public NamedValue(String name, Content value) {
        o.LJIIIZ(name, "name");
        o.LJIIIZ(value, "value");
        this.name = name;
        this.value = value;
    }
}
