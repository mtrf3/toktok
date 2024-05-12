package X;

import kotlin.jvm.internal.o;

/* renamed from: X.HeM, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44566HeM extends AbstractC44565HeL {
    public final String LJLILLLLZI;

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("HwReEncode:");
        LIZ.append(this.LJLILLLLZI);
        return X1D.LIZIZ(LIZ);
    }

    public final String getSetting() {
        return this.LJLILLLLZI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44566HeM(String setting, String label) {
        super(label, null);
        o.LJIIIZ(setting, "setting");
        o.LJIIIZ(label, "label");
        this.LJLILLLLZI = setting;
    }
}
