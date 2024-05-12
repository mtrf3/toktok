package X;

import kotlin.jvm.internal.o;

/* renamed from: X.CBb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30907CBb extends AbstractC65781Prl implements InterfaceC88471Ynr<String, String, Boolean> {
    public static final C30907CBb LJLIL = new C30907CBb();

    public C30907CBb() {
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
