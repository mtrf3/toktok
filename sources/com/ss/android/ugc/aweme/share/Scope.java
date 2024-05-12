package com.ss.android.ugc.aweme.share;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class Scope extends F9E {

    @InterfaceC65349Pkn("desc")
    public final String desc;

    @InterfaceC65349Pkn("name")
    public final String name;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.name, this.desc};
    }

    public Scope(String name, String desc) {
        o.LJIIIZ(name, "name");
        o.LJIIIZ(desc, "desc");
        this.name = name;
        this.desc = desc;
    }
}
