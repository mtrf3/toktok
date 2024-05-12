package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ARL {
    public final int LIZ;
    public final InterfaceC88472Yns<ARN, C76800UCe> LIZIZ;
    public final List<SY4> LIZJ;
    public InterfaceC88472Yns<? super SY4, C76800UCe> LIZLLL;
    public boolean LJ;
    public CharSequence LJFF;

    public final void LIZ(InterfaceC88472Yns<? super SY4, C76800UCe> action) {
        o.LJIIIZ(action, "action");
        this.LIZLLL = action;
        Iterator it = ((ArrayList) this.LIZJ).iterator();
        while (it.hasNext()) {
            action.invoke(it.next());
        }
    }

    public final void LIZIZ(boolean z) {
        Iterator<SY4> it = this.LIZJ.iterator();
        while (it.hasNext()) {
            it.next().setEnabled(z);
        }
        this.LJ = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ARL(ARJ themeConfig, int i, CharSequence text, InterfaceC88472Yns<? super ARN, C76800UCe> interfaceC88472Yns) {
        o.LJIIIZ(themeConfig, "themeConfig");
        o.LJIIIZ(text, "text");
        this.LIZ = i;
        this.LIZIZ = interfaceC88472Yns;
        this.LIZJ = new ArrayList();
        this.LJ = true;
        this.LJFF = text;
    }
}
