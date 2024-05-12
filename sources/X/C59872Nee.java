package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Nee, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59872Nee extends AbstractC65781Prl implements InterfaceC88473Ynt<android.net.Uri, C59869Neb, java.util.Map<String, ? extends String>, InterfaceC59585Na1> {
    public static final C59872Nee LJLIL = new C59872Nee();

    public C59872Nee() {
        super(3);
    }

    @Override // X.InterfaceC88473Ynt
    public final InterfaceC59585Na1 invoke(android.net.Uri uri, C59869Neb c59869Neb, java.util.Map<String, ? extends String> map) {
        android.net.Uri uri2 = uri;
        C59869Neb providerFactory = c59869Neb;
        java.util.Map<String, ? extends String> customCategories = map;
        o.LJIIIZ(uri2, "uri");
        o.LJIIIZ(providerFactory, "providerFactory");
        o.LJIIIZ(customCategories, "customCategories");
        if (o.LJ(uri2.getScheme(), "http") || o.LJ(uri2.getScheme(), "https") || 0 != 0) {
            return new C61037NxR(uri2, providerFactory, customCategories);
        }
        return null;
    }
}
