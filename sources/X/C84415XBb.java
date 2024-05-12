package X;

import com.ss.ugc.effectplatform.model.Effect;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.XBb, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84415XBb extends F9E {
    public final Effect LJLIL;
    public final List<String> LJLILLLLZI;
    public final String LJLJI;
    public XAT LJLJJI;
    public Boolean LJLJJL;
    public InterfaceExecutorC06770Oj LJLJJLL;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL};
    }

    public C84415XBb(Effect effect, List list, String str) {
        Boolean bool = Boolean.FALSE;
        o.LJIIJ(effect, "effect");
        this.LJLIL = effect;
        this.LJLILLLLZI = list;
        this.LJLJI = str;
        this.LJLJJI = null;
        this.LJLJJL = bool;
        this.LJLJJLL = null;
    }
}
