package X;

import com.ss.android.ugc.aweme.filter.FilterBean;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WRT extends F9E {
    public final FilterBean LJLIL;
    public final float LJLILLLLZI;
    public final WPD LJLJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, Float.valueOf(this.LJLILLLLZI), this.LJLJI};
    }

    public WRT(FilterBean filterBean, float f, WPD source) {
        o.LJIIIZ(filterBean, "filterBean");
        o.LJIIIZ(source, "source");
        this.LJLIL = filterBean;
        this.LJLILLLLZI = f;
        this.LJLJI = source;
    }
}
