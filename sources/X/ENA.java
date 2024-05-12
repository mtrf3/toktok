package X;

import com.ss.android.ugc.aweme.ecommerce.core.ab.EcomNetworkInterceptorSwitch;
import ujb.o;
import ujb.s;

/* loaded from: classes7.dex */
public final class ENA extends AbstractC65781Prl implements InterfaceC65784Pro<String[]> {
    public static final ENA LJLIL = new ENA();

    public ENA() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object[], java.lang.String[]] */
    @Override // X.InterfaceC65784Pro
    public final String[] invoke() {
        String imageHost = EcomNetworkInterceptorSwitch.LIZ.getImageHost();
        if (o.LJJJJJL(imageHost)) {
            return new String[0];
        }
        return s.LJLJJL(imageHost, new String[]{","}, 0, 6).toArray(new String[0]);
    }
}
