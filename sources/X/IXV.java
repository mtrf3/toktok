package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class IXV extends F9E {
    public final List<String> LJLIL;
    public final long LJLILLLLZI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, Long.valueOf(this.LJLILLLLZI)};
    }

    public IXV(List<String> urls, long j) {
        o.LJIIIZ(urls, "urls");
        this.LJLIL = urls;
        this.LJLILLLLZI = j;
    }
}
