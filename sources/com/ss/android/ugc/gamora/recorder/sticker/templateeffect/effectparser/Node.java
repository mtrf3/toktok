package com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectparser;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class Node extends F9E {

    @InterfaceC65349Pkn("name")
    public final String name;

    @InterfaceC65349Pkn("type")
    public final String type;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.name, this.type};
    }

    public Node(String name, String type) {
        o.LJIIIZ(name, "name");
        o.LJIIIZ(type, "type");
        this.name = name;
        this.type = type;
    }
}
