package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class N4T extends F9E {
    public final List<NFK> LJLIL;
    public final String LJLILLLLZI;
    public final boolean LJLJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, Boolean.valueOf(this.LJLJI)};
    }

    public N4T(String str, List recommendedMusics, boolean z) {
        o.LJIIIZ(recommendedMusics, "recommendedMusics");
        this.LJLIL = recommendedMusics;
        this.LJLILLLLZI = str;
        this.LJLJI = z;
    }
}
