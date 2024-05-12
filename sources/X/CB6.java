package X;

import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CB6 extends AbstractC65781Prl implements InterfaceC88471Ynr<String, String, Boolean> {
    public static final CB6 LJLIL = new CB6();

    public CB6() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final Boolean invoke(String str, String str2) {
        String schema1 = str;
        String schema2 = str2;
        o.LJIIIZ(schema1, "schema1");
        o.LJIIIZ(schema2, "schema2");
        return Boolean.valueOf(o.LJ(C78946Uyc.LJIJJ(schema1), C78946Uyc.LJIJJ(schema2)));
    }
}
