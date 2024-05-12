package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class V2I extends F9E {
    public final String LJLIL;
    public final List<String> LJLILLLLZI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI};
    }

    public V2I(String str) {
        this(str, C61878OQg.INSTANCE);
    }

    public V2I(String str, List<String> urls) {
        o.LJIIIZ(urls, "urls");
        this.LJLIL = str;
        this.LJLILLLLZI = urls;
    }
}
