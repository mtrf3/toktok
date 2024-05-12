package X;

import android.net.Uri;
import kotlin.jvm.internal.o;

/* renamed from: X.2qx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C71272qx extends AbstractC65781Prl implements InterfaceC88473Ynt<Uri.Builder, String, String, Uri.Builder> {
    public static final C71272qx LJLIL = new C71272qx();

    public C71272qx() {
        super(3);
    }

    @Override // X.InterfaceC88473Ynt
    public final Uri.Builder invoke(Uri.Builder builder, String str, String str2) {
        Uri.Builder builder2 = builder;
        String value = str2;
        o.LJIIJ(builder2, "builder");
        o.LJIIJ(str, "<anonymous parameter 1>");
        o.LJIIJ(value, "value");
        builder2.appendPath(value);
        return builder2;
    }
}
