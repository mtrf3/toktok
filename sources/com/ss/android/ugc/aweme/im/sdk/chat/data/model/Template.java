package com.ss.android.ugc.aweme.im.sdk.chat.data.model;

import X.F9E;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class Template extends F9E {
    public final Extra extra;
    public final String key;
    public final String name;

    public static /* synthetic */ Template copy$default(Template template, String str, String str2, Extra extra, int i, Object obj) {
        if ((i & 1) != 0) {
            str = template.key;
        }
        if ((i & 2) != 0) {
            str2 = template.name;
        }
        if ((i & 4) != 0) {
            extra = template.extra;
        }
        return template.copy(str, str2, extra);
    }

    public final Template copy(String key, String name, Extra extra) {
        o.LJIIIZ(key, "key");
        o.LJIIIZ(name, "name");
        o.LJIIIZ(extra, "extra");
        return new Template(key, name, extra);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.key, this.name, this.extra};
    }

    public final Extra getExtra() {
        return this.extra;
    }

    public final String getKey() {
        return this.key;
    }

    public final String getName() {
        return this.name;
    }

    public Template(String key, String name, Extra extra) {
        o.LJIIIZ(key, "key");
        o.LJIIIZ(name, "name");
        o.LJIIIZ(extra, "extra");
        this.key = key;
        this.name = name;
        this.extra = extra;
    }
}
