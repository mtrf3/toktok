package X;

import kotlin.jvm.internal.o;

/* renamed from: X.E7p, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35913E7p extends AbstractC65781Prl implements InterfaceC88471Ynr<String, String, Boolean> {
    public static final C35913E7p LJLIL = new C35913E7p();

    public C35913E7p() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final Boolean invoke(String str, String str2) {
        String schema1 = str;
        String schema2 = str2;
        o.LJIIIZ(schema1, "schema1");
        o.LJIIIZ(schema2, "schema2");
        return Boolean.valueOf(o.LJ(C37240EjU.LIZIZ(schema1), C37240EjU.LIZIZ(schema2)));
    }
}
