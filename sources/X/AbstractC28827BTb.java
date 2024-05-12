package X;

import X.C28826BTa;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.BTb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC28827BTb<T extends C28826BTa> extends BTZ<T> {
    @Override // X.BTZ
    public final List<String> LIZIZ() {
        return C28828BTc.LIZJ;
    }

    @Override // X.BTZ
    public final boolean LIZ(android.net.Uri uri) {
        o.LJIIIZ(uri, "uri");
        return ORZ.LJLJJI(uri.getScheme(), C28828BTc.LIZJ);
    }
}
