package X;

import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class KOP extends AbstractC65781Prl implements InterfaceC88471Ynr<String, String, Boolean> {
    public static final KOP LJLIL = new KOP();

    public KOP() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final Boolean invoke(String str, String str2) {
        String schema1 = str;
        String schema2 = str2;
        o.LJIIIZ(schema1, "schema1");
        o.LJIIIZ(schema2, "schema2");
        KOO.LIZ.getClass();
        return Boolean.valueOf(o.LJ(KOO.LIZ(schema1), KOO.LIZ(schema2)));
    }
}
