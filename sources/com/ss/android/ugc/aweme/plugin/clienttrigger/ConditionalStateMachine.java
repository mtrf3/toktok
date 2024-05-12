package com.ss.android.ugc.aweme.plugin.clienttrigger;

import X.AnonymousClass391;
import X.C78920UyC;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class ConditionalStateMachine {

    @InterfaceC65349Pkn("initial_node_id")
    public int currentNodeId;

    @InterfaceC65349Pkn("id")
    public final int id;

    @InterfaceC65349Pkn("is_complete")
    public Boolean isComplete;

    @InterfaceC65349Pkn("nodes")
    public List<Node> nodes;

    @InterfaceC65349Pkn("should_disable")
    public Boolean shouldDisable;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConditionalStateMachine)) {
            return false;
        }
        ConditionalStateMachine conditionalStateMachine = (ConditionalStateMachine) obj;
        return this.id == conditionalStateMachine.id && o.LJ(this.nodes, conditionalStateMachine.nodes) && this.currentNodeId == conditionalStateMachine.currentNodeId && o.LJ(this.isComplete, conditionalStateMachine.isComplete) && o.LJ(this.shouldDisable, conditionalStateMachine.shouldDisable);
    }

    public final int hashCode() {
        int hashCode;
        int LIZIZ = (AnonymousClass391.LIZIZ(this.nodes, this.id * 31, 31) + this.currentNodeId) * 31;
        Boolean bool = this.isComplete;
        int i = 0;
        if (bool == null) {
            hashCode = 0;
        } else {
            hashCode = bool.hashCode();
        }
        int i2 = (LIZIZ + hashCode) * 31;
        Boolean bool2 = this.shouldDisable;
        if (bool2 != null) {
            i = bool2.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ConditionalStateMachine(id=");
        LIZ.append(this.id);
        LIZ.append(", nodes=");
        LIZ.append(this.nodes);
        LIZ.append(", currentNodeId=");
        LIZ.append(this.currentNodeId);
        LIZ.append(", isComplete=");
        LIZ.append(this.isComplete);
        LIZ.append(", shouldDisable=");
        return C78920UyC.LIZIZ(LIZ, this.shouldDisable, ')', LIZ);
    }

    public ConditionalStateMachine(int i, List<Node> nodes, int i2, Boolean bool, Boolean bool2) {
        o.LJIIIZ(nodes, "nodes");
        this.id = i;
        this.nodes = nodes;
        this.currentNodeId = i2;
        this.isComplete = bool;
        this.shouldDisable = bool2;
    }

    public /* synthetic */ ConditionalStateMachine(int i, List list, int i2, Boolean bool, Boolean bool2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, list, i2, (i3 & 8) != 0 ? Boolean.FALSE : bool, bool2);
    }
}
