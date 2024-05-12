package X;

import java.util.Collections;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class M0L extends F9E {
    public EnumC56062LzO LJLIL;
    public final ILQ LJLILLLLZI;
    public volatile boolean LJLJI;
    public volatile boolean LJLJJI;
    public long LJLJJL;
    public boolean LJLJJLL;
    public int LJLJL;
    public int LJLJLJ;
    public final java.util.Set<EnumC56110M0k> LJLJLLL;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, Boolean.valueOf(this.LJLJI), Boolean.valueOf(this.LJLJJI), Long.valueOf(this.LJLJJL), Boolean.valueOf(this.LJLJJLL), Integer.valueOf(this.LJLJL), Integer.valueOf(this.LJLJLJ), this.LJLJLLL};
    }

    public M0L(int i) {
        EnumC56062LzO dataFrom = EnumC56062LzO.PREFETCH;
        ILQ loadDataStatus = ILQ.UNFAILED;
        java.util.Set<EnumC56110M0k> synchronizedSet = Collections.synchronizedSet(new LinkedHashSet());
        o.LJIIIIZZ(synchronizedSet, "synchronizedSet(mutableSetOf())");
        o.LJIIIZ(dataFrom, "dataFrom");
        o.LJIIIZ(loadDataStatus, "loadDataStatus");
        this.LJLIL = dataFrom;
        this.LJLILLLLZI = loadDataStatus;
        this.LJLJI = false;
        this.LJLJJI = false;
        this.LJLJJL = 0L;
        this.LJLJJLL = false;
        this.LJLJL = 0;
        this.LJLJLJ = 0;
        this.LJLJLLL = synchronizedSet;
    }
}
