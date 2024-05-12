package X;

import kotlin.jvm.internal.o;

/* renamed from: X.2qo, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C71182qo extends AbstractC65781Prl implements InterfaceC88471Ynr<android.net.Uri, String, String> {
    public static final C71182qo LJLIL = new C71182qo();

    public C71182qo() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final String invoke(android.net.Uri uri, String str) {
        android.net.Uri uri2 = uri;
        o.LJIIJ(uri2, "uri");
        o.LJIIJ(str, "<anonymous parameter 1>");
        return uri2.getAuthority();
    }
}
