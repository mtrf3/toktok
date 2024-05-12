package X;

import com.ss.android.ugc.aweme.filter.FilterBean;
import kotlin.jvm.internal.o;

/* renamed from: X.HYs, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44262HYs extends F9E {
    public final FilterBean LJLIL;
    public final WPD LJLILLLLZI;
    public final boolean LJLJI;
    public final String LJLJJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, Boolean.valueOf(this.LJLJI), this.LJLJJI};
    }

    public C44262HYs(FilterBean filter, WPD wpd, boolean z, String str) {
        o.LJIIIZ(filter, "filter");
        this.LJLIL = filter;
        this.LJLILLLLZI = wpd;
        this.LJLJI = z;
        this.LJLJJI = str;
    }
}
