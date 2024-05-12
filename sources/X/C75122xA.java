package X;

import android.net.Uri;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.2xA, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C75122xA extends AbstractC65781Prl implements InterfaceC88473Ynt<Uri.Builder, String, String, Uri.Builder> {
    public static final C75122xA LJLIL = new C75122xA();

    public C75122xA() {
        super(3);
    }

    @Override // X.InterfaceC88473Ynt
    public final Uri.Builder invoke(Uri.Builder builder, String str, String str2) {
        String path;
        Uri.Builder builder2 = builder;
        String value = str2;
        o.LJIIJ(builder2, "builder");
        o.LJIIJ(str, "<anonymous parameter 1>");
        o.LJIIJ(value, "value");
        android.net.Uri build = builder2.build();
        String str3 = null;
        if (build != null && (path = build.getPath()) != null && path.length() != 0 && ujb.o.LJJJLIIL(path, "/", false)) {
            str3 = s.LJLL(path, C78842Uww.LJJ(1, path.length()));
        }
        builder2.path(value);
        if (str3 != null && str3.length() != 0) {
            builder2.appendPath(str3);
        }
        return builder2;
    }
}
