package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Neg, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59874Neg extends AbstractC65781Prl implements InterfaceC88473Ynt<android.net.Uri, C59869Neb, java.util.Map<String, ? extends String>, NZN> {
    public static final C59874Neg LJLIL = new C59874Neg();

    public C59874Neg() {
        super(3);
    }

    @Override // X.InterfaceC88473Ynt
    public final NZN invoke(android.net.Uri uri, C59869Neb c59869Neb, java.util.Map<String, ? extends String> map) {
        android.net.Uri uri2 = uri;
        C59869Neb providerFactory = c59869Neb;
        java.util.Map<String, ? extends String> customCategories = map;
        o.LJIIIZ(uri2, "uri");
        o.LJIIIZ(providerFactory, "providerFactory");
        o.LJIIIZ(customCategories, "customCategories");
        if (!o.LJ(uri2.getScheme(), "react-native")) {
            return null;
        }
        return new C61036NxQ(uri2, providerFactory, customCategories);
    }
}
