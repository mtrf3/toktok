package X;

import com.ss.android.ugc.aweme.ecommerce.core.ab.EcomNetworkInterceptorSwitch;
import ujb.o;
import ujb.s;

/* loaded from: classes7.dex */
public final class EN9 extends AbstractC65781Prl implements InterfaceC65784Pro<java.util.Set<? extends String>> {
    public static final EN9 LJLIL = new EN9();

    public EN9() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final java.util.Set<? extends String> invoke() {
        String paths = EcomNetworkInterceptorSwitch.LIZ.getPaths();
        if (o.LJJJJJL(paths)) {
            return OQY.INSTANCE;
        }
        return ORZ.LLJJ(s.LJLJJL(paths, new String[]{","}, 0, 6));
    }
}
