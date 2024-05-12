package X;

import com.ss.android.ugc.aweme.bullet.bridge.framework.OpenBrowserMethod;
import kotlin.jvm.internal.o;

/* renamed from: X.Ffi, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39554Ffi extends AbstractC65781Prl implements InterfaceC88472Yns<F3T, InterfaceC38186Eyk> {
    public static final C39554Ffi LJLIL = new C39554Ffi();

    public C39554Ffi() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final InterfaceC38186Eyk invoke(F3T f3t) {
        F3T providerFactory = f3t;
        o.LJIIIZ(providerFactory, "providerFactory");
        return new OpenBrowserMethod(providerFactory);
    }
}
