package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.2ub, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C73532ub extends AbstractC65781Prl implements InterfaceC88471Ynr<android.net.Uri, String, String> {
    public static final C73532ub LJLIL = new C73532ub();

    public C73532ub() {
        super(2);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.lang.String] */
    @Override // X.InterfaceC88471Ynr
    public final String invoke(android.net.Uri uri, String str) {
        android.net.Uri uri2 = uri;
        o.LJIIJ(uri2, "uri");
        o.LJIIJ(str, "<anonymous parameter 1>");
        List<String> pathSegments = uri2.getPathSegments();
        if (pathSegments != null) {
            return ORZ.LJLLLL(pathSegments);
        }
        return null;
    }
}
