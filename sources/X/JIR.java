package X;

import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JIR extends F9E implements KK7 {
    public final boolean LJLIL;
    public final String LJLILLLLZI;

    public JIR() {
        this(false, "");
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.LJLIL), this.LJLILLLLZI};
    }

    @Override // X.KK7
    public final boolean isLog() {
        return true;
    }

    static {
        C17N.LJJJJLI().Im0().LIZIZ(C65352Pkq.LIZ(JIR.class), C49646Je6.INSTANCE);
    }

    public JIR(boolean z, String groupId) {
        o.LJIIIZ(groupId, "groupId");
        this.LJLIL = z;
        this.LJLILLLLZI = groupId;
    }
}
