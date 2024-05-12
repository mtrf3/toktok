package X;

import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CBZ extends AbstractC65781Prl implements InterfaceC88471Ynr<String, String, Boolean> {
    public final /* synthetic */ int LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CBZ(int i) {
        super(2);
        this.LJLIL = i;
    }

    @Override // X.InterfaceC88471Ynr
    public final Boolean invoke(String str, String str2) {
        boolean LJ;
        String schema1 = str;
        String schema2 = str2;
        o.LJIIIZ(schema1, "schema1");
        o.LJIIIZ(schema2, "schema2");
        int i = this.LJLIL;
        if (i != 0) {
            if (i != 1) {
                LJ = false;
            } else {
                LJ = o.LJ(C78946Uyc.LJIJJ(schema1), C78946Uyc.LJIJJ(schema2));
            }
        } else {
            LJ = o.LJ(schema1, schema2);
        }
        return Boolean.valueOf(LJ);
    }
}
