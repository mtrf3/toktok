package X;

import kotlinx.coroutines.JobSupport;

/* renamed from: X.XKz, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public class C84673XKz extends JobSupport implements C3CL {
    public final boolean LJLILLLLZI;

    @Override // kotlinx.coroutines.JobSupport
    public final boolean LJJJJZ() {
        return true;
    }

    @Override // kotlinx.coroutines.JobSupport
    public final boolean LJJJJLL() {
        return this.LJLILLLLZI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C84673XKz(InterfaceC79150V4o interfaceC79150V4o) {
        super(true);
        AbstractC84652XKe abstractC84652XKe;
        AbstractC84652XKe abstractC84652XKe2;
        boolean z = true;
        LJJJZ(interfaceC79150V4o);
        T2N t2n = (InterfaceC77431UaB) this._parentHandle;
        if ((t2n instanceof C84666XKs) && (abstractC84652XKe = (AbstractC84652XKe) t2n) != null) {
            JobSupport LJJIII = abstractC84652XKe.LJJIII();
            while (!LJJIII.LJJJJLL()) {
                T2N t2n2 = (InterfaceC77431UaB) LJJIII._parentHandle;
                if ((t2n2 instanceof C84666XKs) && (abstractC84652XKe2 = (AbstractC84652XKe) t2n2) != null) {
                    LJJIII = abstractC84652XKe2.LJJIII();
                }
            }
            this.LJLILLLLZI = z;
        }
        z = false;
        this.LJLILLLLZI = z;
    }
}
