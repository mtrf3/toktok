package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Ole, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62854Ole extends AbstractC65781Prl implements InterfaceC88472Yns<Throwable, C76800UCe> {
    public static final C62854Ole LJLIL = new C62854Ole();

    public C62854Ole() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(Throwable th) {
        Throwable it = th;
        o.LJIIIZ(it, "it");
        C34B.LIZLLL("MessageRefreshLooper", "requestSubject onError", it);
        return C76800UCe.LIZ;
    }
}
