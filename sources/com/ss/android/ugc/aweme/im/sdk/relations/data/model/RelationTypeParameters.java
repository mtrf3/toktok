package com.ss.android.ugc.aweme.im.sdk.relations.data.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class RelationTypeParameters extends F9E {

    @InterfaceC65349Pkn("event")
    public final String event;

    @InterfaceC65349Pkn("type")
    public final int type;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.type), this.event};
    }

    public RelationTypeParameters(int i, String event) {
        o.LJIIIZ(event, "event");
        this.type = i;
        this.event = event;
    }
}
