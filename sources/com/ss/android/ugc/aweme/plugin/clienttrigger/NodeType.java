package com.ss.android.ugc.aweme.plugin.clienttrigger;

import X.InterfaceC65349Pkn;
import X.V0N;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class NodeType {

    @InterfaceC65349Pkn("state_node")
    public final StateNodeProperties stateNodeProperties;

    @InterfaceC65349Pkn("type")
    public final EnumC0027NodeType type;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NodeType)) {
            return false;
        }
        NodeType nodeType = (NodeType) obj;
        return this.type == nodeType.type && o.LJ(this.stateNodeProperties, nodeType.stateNodeProperties);
    }

    public final int hashCode() {
        int hashCode = this.type.hashCode() * 31;
        StateNodeProperties stateNodeProperties = this.stateNodeProperties;
        return hashCode + (stateNodeProperties == null ? 0 : stateNodeProperties.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("NodeType(type=");
        LIZ.append(this.type);
        LIZ.append(", stateNodeProperties=");
        LIZ.append(this.stateNodeProperties);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    /* renamed from: com.ss.android.ugc.aweme.plugin.clienttrigger.NodeType$NodeType, reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public enum EnumC0027NodeType {
        StateNode(1),
        EndNode(2),
        DisableNode(3);

        public final int LJLIL;

        public static EnumC0027NodeType valueOf(String str) {
            return (EnumC0027NodeType) V0N.LJJJ(EnumC0027NodeType.class, str);
        }

        public final int getValue() {
            return this.LJLIL;
        }

        EnumC0027NodeType(int i) {
            this.LJLIL = i;
        }
    }

    public NodeType(EnumC0027NodeType type, StateNodeProperties stateNodeProperties) {
        o.LJIIIZ(type, "type");
        this.type = type;
        this.stateNodeProperties = stateNodeProperties;
    }

    public /* synthetic */ NodeType(EnumC0027NodeType enumC0027NodeType, StateNodeProperties stateNodeProperties, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(enumC0027NodeType, (i & 2) != 0 ? null : stateNodeProperties);
    }
}
