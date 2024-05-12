package X;

import kotlin.jvm.internal.o;

/* renamed from: X.9Qd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C236559Qd extends F9E implements C33Q {
    public final AbstractC236819Rd LJLIL;
    public final boolean LJLILLLLZI;

    public C236559Qd() {
        this(0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, Boolean.valueOf(this.LJLILLLLZI)};
    }

    public /* synthetic */ C236559Qd(int i) {
        this(C236579Qf.LIZ, false);
    }

    public C236559Qd(AbstractC236819Rd linkCheckStatus, boolean z) {
        o.LJIIIZ(linkCheckStatus, "linkCheckStatus");
        this.LJLIL = linkCheckStatus;
        this.LJLILLLLZI = z;
    }

    public static C236559Qd L(C236559Qd c236559Qd, AbstractC236819Rd linkCheckStatus, boolean z, int i) {
        if ((i & 1) != 0) {
            linkCheckStatus = c236559Qd.LJLIL;
        }
        if ((i & 2) != 0) {
            z = c236559Qd.LJLILLLLZI;
        }
        c236559Qd.getClass();
        o.LJIIIZ(linkCheckStatus, "linkCheckStatus");
        return new C236559Qd(linkCheckStatus, z);
    }
}
