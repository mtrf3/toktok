package com.ss.android.ugc.aweme.plugin.clienttrigger;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class Node extends F9E {

    @InterfaceC65349Pkn("node_id")
    public final int id;

    @InterfaceC65349Pkn("node_type")
    public final NodeType nodeType;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.id), this.nodeType};
    }

    public Node(int i, NodeType nodeType) {
        o.LJIIIZ(nodeType, "nodeType");
        this.id = i;
        this.nodeType = nodeType;
    }
}
