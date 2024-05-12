package X;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.3JN, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3JN extends AbstractC65781Prl implements InterfaceC65784Pro<C3JO> {
    public static final C3JN LJLIL = new C3JN();

    public C3JN() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.3JO] */
    @Override // X.InterfaceC65784Pro
    public final C3JO invoke() {
        return new C3JD() { // from class: X.3JO
            public final String LJLIL = "SessionRefactor-Timestamp";
            public final C39N LJLILLLLZI = C39N.INBOX;

            @Override // X.C3JD
            public final void LIZ(C3L4 baseSession) {
                o.LJIIIZ(baseSession, "baseSession");
            }

            @Override // X.C3JD
            public final C39N LJII() {
                return this.LJLILLLLZI;
            }

            @Override // X.C3JD
            public final String getTag() {
                return this.LJLIL;
            }

            @Override // X.C3JD
            public final void LJ(List<? extends C3L4> list) {
                Iterator<? extends C3L4> it = list.iterator();
                while (it.hasNext()) {
                    LIZ(it.next());
                }
            }
        };
    }
}
