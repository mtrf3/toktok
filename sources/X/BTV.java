package X;

import X.C28826BTa;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public abstract class BTV<T extends C28826BTa> extends BTZ<T> {
    public abstract List<String> LIZLLL();

    @Override // X.BTZ
    public final List<String> LIZIZ() {
        return LIZLLL();
    }

    @Override // X.BTZ
    public final boolean LIZ(android.net.Uri uri) {
        o.LJIIIZ(uri, "uri");
        return ORZ.LJLJJI(uri.getHost(), LIZLLL());
    }
}
