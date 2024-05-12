package X;

import com.ss.android.ugc.aweme.ecommerce.core.ab.EcomNetworkInterceptorSwitch;
import ujb.o;
import ujb.s;

/* loaded from: classes7.dex */
public final class EN8 extends AbstractC65781Prl implements InterfaceC65784Pro<java.util.Set<? extends String>> {
    public static final EN8 LJLIL = new EN8();

    public EN8() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final java.util.Set<? extends String> invoke() {
        String hosts = EcomNetworkInterceptorSwitch.LIZ.getHosts();
        if (o.LJJJJJL(hosts)) {
            return OQY.INSTANCE;
        }
        return ORZ.LLJJ(s.LJLJJL(hosts, new String[]{","}, 0, 6));
    }
}
