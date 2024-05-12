package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes17.dex */
public final class YXV extends F9E {
    public final List<String> LJLIL;
    public final String LJLILLLLZI;
    public final InterfaceC87755YcJ LJLJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, this.LJLJI};
    }

    public YXV(List<String> urlList, String sourceId, InterfaceC87755YcJ interfaceC87755YcJ) {
        o.LJIIIZ(urlList, "urlList");
        o.LJIIIZ(sourceId, "sourceId");
        this.LJLIL = urlList;
        this.LJLILLLLZI = sourceId;
        this.LJLJI = interfaceC87755YcJ;
    }
}
