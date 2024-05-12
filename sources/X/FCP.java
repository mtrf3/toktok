package X;

import com.ss.android.ugc.aweme.bullet.module.p002default.DefaultLynxKitDelegatesProvider;
import kotlin.jvm.internal.AqS52S0400000_6;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class FCP implements FCR {
    public final /* synthetic */ DefaultLynxKitDelegatesProvider LIZ;

    @Override // X.FCR
    public final void LIZLLL(InterfaceC40516FvE instance) {
        o.LJIIJ(instance, "instance");
        throw new FCQ("An operation is not implemented");
    }

    public FCP(DefaultLynxKitDelegatesProvider defaultLynxKitDelegatesProvider, F3T f3t) {
        this.LIZ = defaultLynxKitDelegatesProvider;
    }

    @Override // X.FCR
    public final void LIZ(InterfaceC40516FvE instance, Throwable th) {
        o.LJIIIZ(instance, "instance");
        throw new FCQ("An operation is not implemented");
    }

    @Override // X.FCR
    public final void LIZIZ(AbstractC60240Nka abstractC60240Nka, android.net.Uri input) {
        o.LJIIIZ(input, "input");
        this.LIZ.getClass();
    }

    @Override // X.FCR
    public final void LIZJ(AbstractC60240Nka instance, android.net.Uri uri, AqS52S0400000_6 aqS52S0400000_6, InterfaceC88472Yns reject) {
        o.LJIIIZ(instance, "instance");
        o.LJIIIZ(uri, "uri");
        o.LJIIIZ(reject, "reject");
        aqS52S0400000_6.invoke(uri);
    }
}
