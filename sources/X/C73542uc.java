package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.2uc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C73542uc extends AbstractC65781Prl implements InterfaceC88471Ynr<android.net.Uri, String, List<String>> {
    public static final C73542uc LJLIL = new C73542uc();

    public C73542uc() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final List<String> invoke(android.net.Uri uri, String str) {
        android.net.Uri uri2 = uri;
        o.LJIIJ(uri2, "uri");
        o.LJIIJ(str, "<anonymous parameter 1>");
        return uri2.getPathSegments();
    }
}
