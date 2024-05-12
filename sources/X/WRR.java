package X;

import com.ss.android.ugc.aweme.filter.FilterBean;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WRR extends F9E {
    public final FilterBean LJLIL;
    public final WPD LJLILLLLZI;
    public final String LJLJI;
    public final Float LJLJJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI};
    }

    public WRR(FilterBean filter, WPD source, String str, Float f) {
        o.LJIIIZ(filter, "filter");
        o.LJIIIZ(source, "source");
        this.LJLIL = filter;
        this.LJLILLLLZI = source;
        this.LJLJI = str;
        this.LJLJJI = f;
    }
}
