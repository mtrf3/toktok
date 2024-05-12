package X;

import com.ss.android.ugc.aweme.filter.FilterBean;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WRS extends F9E {
    public final OSZ<FilterBean, WPD> LJLIL;
    public final OSZ<FilterBean, WPD> LJLILLLLZI;
    public final EnumC46484IMe LJLJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, this.LJLJI};
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WRS(OSZ<? extends FilterBean, WPD> osz, OSZ<? extends FilterBean, WPD> osz2, EnumC46484IMe direction) {
        o.LJIIIZ(direction, "direction");
        this.LJLIL = osz;
        this.LJLILLLLZI = osz2;
        this.LJLJI = direction;
    }
}
