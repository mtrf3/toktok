package X;

import android.text.TextWatcher;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GB0<METADATA> {
    public final InterfaceC65784Pro<InterfaceC41097GAz<METADATA>> LIZ;
    public final GQF<METADATA> LIZIZ;
    public GB1<METADATA> LIZJ;

    public final GB1<METADATA> LIZ() {
        if (this.LIZJ == null) {
            GB1<METADATA> gb1 = new GB1<>(this.LIZ.invoke(), this.LIZIZ);
            this.LIZJ = gb1;
            gb1.LIZ.removeTextChangedListener((TextWatcher) gb1.LIZLLL.getValue());
            gb1.LIZ.addTextChangedListener((TextWatcher) gb1.LIZLLL.getValue());
        }
        GB1<METADATA> gb12 = this.LIZJ;
        if (gb12 != null) {
            return gb12;
        }
        o.LJIJI("lexicalEditor");
        throw null;
    }

    public GB0(InterfaceC65784Pro interfaceC65784Pro, C41495GQh c41495GQh) {
        this.LIZ = interfaceC65784Pro;
        this.LIZIZ = c41495GQh;
    }
}
