package X;

import android.net.Uri;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.2qv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C71252qv extends AbstractC65781Prl implements InterfaceC88473Ynt<Uri.Builder, String, List<? extends String>, Uri.Builder> {
    public static final C71252qv LJLIL = new C71252qv();

    public C71252qv() {
        super(3);
    }

    @Override // X.InterfaceC88473Ynt
    public final Uri.Builder invoke(Uri.Builder builder, String str, List<? extends String> list) {
        Uri.Builder builder2 = builder;
        List<? extends String> value = list;
        o.LJIIJ(builder2, "builder");
        o.LJIIJ(str, "<anonymous parameter 1>");
        o.LJIIJ(value, "value");
        Iterator<? extends String> it = value.iterator();
        while (it.hasNext()) {
            builder2.appendPath(it.next());
        }
        return builder2;
    }
}
