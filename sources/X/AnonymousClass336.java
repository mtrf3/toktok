package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.336, reason: invalid class name */
/* loaded from: classes2.dex */
public final class AnonymousClass336 extends F9E {
    public final boolean LJLIL;
    public final List<InterfaceC57784Mm4> LJLILLLLZI;
    public final long LJLJI;
    public final long LJLJJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.LJLIL), this.LJLILLLLZI, Long.valueOf(this.LJLJI), Long.valueOf(this.LJLJJI)};
    }

    public AnonymousClass336(long j, boolean z, long j2, List recentContactList) {
        o.LJIIIZ(recentContactList, "recentContactList");
        this.LJLIL = z;
        this.LJLILLLLZI = recentContactList;
        this.LJLJI = j;
        this.LJLJJI = j2;
    }
}
