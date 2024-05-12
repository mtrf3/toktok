package X;

import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class M2N extends AbstractC65781Prl implements InterfaceC88471Ynr<String, String, Boolean> {
    public static final M2N LJLIL = new M2N();

    public M2N() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final Boolean invoke(String schema1, String schema2) {
        o.LJIIIZ(schema1, "schema1");
        o.LJIIIZ(schema2, "schema2");
        return Boolean.valueOf(o.LJ(schema1, schema2));
    }
}
