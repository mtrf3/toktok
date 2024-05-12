package X;

import kotlin.jvm.internal.o;

/* renamed from: X.E7o, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35912E7o extends AbstractC65781Prl implements InterfaceC88471Ynr<String, String, Boolean> {
    public static final C35912E7o LJLIL = new C35912E7o();

    public C35912E7o() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final Boolean invoke(String schema1, String schema2) {
        o.LJIIIZ(schema1, "schema1");
        o.LJIIIZ(schema2, "schema2");
        return Boolean.valueOf(o.LJ(schema1, schema2));
    }
}
