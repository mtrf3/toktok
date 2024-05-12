package X;

import kotlin.jvm.internal.o;

/* renamed from: X.2k9, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C67052k9 extends AbstractC65781Prl implements InterfaceC88471Ynr<String, String, Boolean> {
    public static final C67052k9 LJLIL = new C67052k9();

    public C67052k9() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final Boolean invoke(String schema1, String schema2) {
        o.LJIIIZ(schema1, "schema1");
        o.LJIIIZ(schema2, "schema2");
        return Boolean.valueOf(o.LJ(schema1, schema2));
    }
}
