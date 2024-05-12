package X;

import kotlin.jvm.internal.o;

/* renamed from: X.LfO, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54822LfO extends F9E {
    public final String LJLIL;
    public EnumC54821LfN LJLILLLLZI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI};
    }

    public C54822LfO() {
        this("", EnumC54821LfN.UNLOADING);
    }

    public C54822LfO(String aid, EnumC54821LfN status) {
        o.LJIIIZ(aid, "aid");
        o.LJIIIZ(status, "status");
        this.LJLIL = aid;
        this.LJLILLLLZI = status;
    }
}
