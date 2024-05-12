package X;

import kotlin.jvm.internal.o;

/* renamed from: X.1wn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C49411wn extends AbstractC65781Prl implements InterfaceC88471Ynr<String, C1M2, String> {
    public static final C49411wn LJLIL = new C49411wn();

    public C49411wn() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final String invoke(String str, C1M2 element) {
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
