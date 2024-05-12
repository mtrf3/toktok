package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.33C, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C33C extends F9E {
    public final int LJLIL;
    public final boolean LJLILLLLZI;
    public final List<InterfaceC57784Mm4> LJLJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.LJLIL), Boolean.valueOf(this.LJLILLLLZI), this.LJLJI};
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C33C(int i, boolean z, List<? extends InterfaceC57784Mm4> recentContactList) {
        o.LJIIIZ(recentContactList, "recentContactList");
        this.LJLIL = i;
        this.LJLILLLLZI = z;
        this.LJLJI = recentContactList;
    }
}
