package X;

import com.ss.android.ugc.aweme.bullet.bridge.framework.SendLogMethod;
import kotlin.jvm.internal.o;

/* renamed from: X.Fqi, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40236Fqi extends AbstractC65781Prl implements InterfaceC88472Yns<F3T, InterfaceC38186Eyk> {
    public static final C40236Fqi LJLIL = new C40236Fqi();

    public C40236Fqi() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final InterfaceC38186Eyk invoke(F3T f3t) {
        F3T providerFactory = f3t;
        o.LJIIIZ(providerFactory, "providerFactory");
        return new SendLogMethod(providerFactory);
    }
}
