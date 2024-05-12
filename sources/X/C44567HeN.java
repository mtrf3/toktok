package X;

import kotlin.jvm.internal.o;

/* renamed from: X.HeN, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44567HeN extends AbstractC44565HeL {
    public final String LJLILLLLZI;

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SwReEncode:");
        LIZ.append(this.LJLILLLLZI);
        return X1D.LIZIZ(LIZ);
    }

    public final String getSetting() {
        return this.LJLILLLLZI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44567HeN(String setting, String label) {
        super(label, null);
        o.LJIIIZ(setting, "setting");
        o.LJIIIZ(label, "label");
        this.LJLILLLLZI = setting;
    }
}
