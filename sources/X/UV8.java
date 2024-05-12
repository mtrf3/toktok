package X;

import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UV8 extends QXX {
    public final UVH LJLIL;
    public final Object LJLILLLLZI;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TaskFail(reason:");
        LIZ.append(this.LJLIL);
        LIZ.append(" ext:");
        return U26.LIZJ(LIZ, this.LJLILLLLZI, ')', LIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UV8(UVH reason, Object obj) {
        super(0);
        o.LJIIIZ(reason, "reason");
        this.LJLIL = reason;
        this.LJLILLLLZI = obj;
    }
}
