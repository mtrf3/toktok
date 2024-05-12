package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Mqq, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58080Mqq implements C33Q {
    public final C43I<java.util.Set<EnumC58046MqI>> LJLIL;
    public final AbstractC72932td<C76800UCe> LJLILLLLZI;
    public final List<InterfaceC57784Mm4> LJLJI;

    public C58080Mqq() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C58080Mqq)) {
            return false;
        }
        C58080Mqq c58080Mqq = (C58080Mqq) obj;
        return o.LJ(this.LJLIL, c58080Mqq.LJLIL) && o.LJ(this.LJLILLLLZI, c58080Mqq.LJLILLLLZI) && o.LJ(this.LJLJI, c58080Mqq.LJLJI);
    }

    public final int hashCode() {
        int hashCode;
        C43I<java.util.Set<EnumC58046MqI>> c43i = this.LJLIL;
        if (c43i == null) {
            hashCode = 0;
        } else {
            hashCode = c43i.hashCode();
        }
        return this.LJLJI.hashCode() + C03090Af.LIZ(this.LJLILLLLZI, hashCode * 31, 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RecFriendsVMState(triggerUserCardRefresh=");
        LIZ.append(this.LJLIL);
        LIZ.append(", pageStatus=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", topChunkItems=");
        return C1NE.LIZIZ(LIZ, this.LJLJI, ')', LIZ);
    }

    public C58080Mqq(int i) {
        this(null, new C72922tc(), C61878OQg.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C58080Mqq(C43I<? extends java.util.Set<? extends EnumC58046MqI>> c43i, AbstractC72932td<C76800UCe> pageStatus, List<? extends InterfaceC57784Mm4> topChunkItems) {
        o.LJIIIZ(pageStatus, "pageStatus");
        o.LJIIIZ(topChunkItems, "topChunkItems");
        this.LJLIL = c43i;
        this.LJLILLLLZI = pageStatus;
        this.LJLJI = topChunkItems;
    }

    public static C58080Mqq LIZ(C58080Mqq c58080Mqq, C43I c43i, AbstractC72932td pageStatus, List topChunkItems, int i) {
        if ((i & 1) != 0) {
            c43i = c58080Mqq.LJLIL;
        }
        if ((i & 2) != 0) {
            pageStatus = c58080Mqq.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            topChunkItems = c58080Mqq.LJLJI;
        }
        c58080Mqq.getClass();
        o.LJIIIZ(pageStatus, "pageStatus");
        o.LJIIIZ(topChunkItems, "topChunkItems");
        return new C58080Mqq(c43i, pageStatus, topChunkItems);
    }
}
