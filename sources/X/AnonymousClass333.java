package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.333, reason: invalid class name */
/* loaded from: classes2.dex */
public final class AnonymousClass333 extends F9E {
    public final List<InterfaceC57784Mm4> LJLIL;
    public final long LJLILLLLZI;
    public final long LJLJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, Long.valueOf(this.LJLILLLLZI), Long.valueOf(this.LJLJI)};
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AnonymousClass333(List<? extends InterfaceC57784Mm4> suggestedContactList, long j, long j2) {
        o.LJIIIZ(suggestedContactList, "suggestedContactList");
        this.LJLIL = suggestedContactList;
        this.LJLILLLLZI = j;
        this.LJLJI = j2;
    }
}
