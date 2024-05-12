package X;

import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MBH extends AbstractC65781Prl implements InterfaceC88471Ynr<String, MBD, String> {
    public static final MBH LJLIL = new MBH();

    public MBH() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final String invoke(String str, MBD element) {
        String acc = str;
        o.LJIIIZ(acc, "acc");
        o.LJIIIZ(element, "element");
        if (acc.length() == 0) {
            return element.toString();
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(acc);
        LIZ.append(", ");
        LIZ.append(element);
        return X1D.LIZIZ(LIZ);
    }
}
