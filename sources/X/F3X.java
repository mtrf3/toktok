package X;

import com.ss.android.ugc.aweme.bullet.bridge.framework.DarkModeMethod;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class F3X extends AbstractC65781Prl implements InterfaceC88472Yns<F3T, InterfaceC38186Eyk> {
    public static final F3X LJLIL = new F3X();

    public F3X() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final InterfaceC38186Eyk invoke(F3T f3t) {
        F3T providerFactory = f3t;
        o.LJIIIZ(providerFactory, "providerFactory");
        return new DarkModeMethod(providerFactory);
    }
}
