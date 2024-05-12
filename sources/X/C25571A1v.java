package X;

import kotlin.jvm.internal.o;

/* renamed from: X.A1v, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25571A1v extends AbstractC65781Prl implements InterfaceC88471Ynr<String, String, Boolean> {
    public static final C25571A1v LJLIL = new C25571A1v();

    public C25571A1v() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final Boolean invoke(String schema1, String schema2) {
        o.LJIIJ(schema1, "schema1");
        o.LJIIJ(schema2, "schema2");
        return Boolean.valueOf(o.LJ(schema1, schema2));
    }
}
