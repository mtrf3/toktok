package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class X8X extends F9E {
    public boolean LJLIL;
    public boolean LJLILLLLZI;
    public List<? extends X8D> LJLJI;
    public final List<String> LJLJJI;
    public final List<String> LJLJJL;
    public String LJLJJLL;
    public final String LJLJL;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL};
    }

    public X8X(List<String> preLoads, List<String> uriList, String str, String str2) {
        o.LJIIJ(preLoads, "preLoads");
        o.LJIIJ(uriList, "uriList");
        this.LJLJJI = preLoads;
        this.LJLJJL = uriList;
        this.LJLJJLL = str;
        this.LJLJL = str2;
    }
}
