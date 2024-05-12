package X;

import com.ss.android.ugc.aweme.bullet.business.AdLynxStatBusiness;
import kotlin.jvm.internal.AqS52S0400000_6;
import kotlin.jvm.internal.o;

/* renamed from: X.FvP, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40527FvP implements FCR {
    public final NUT LIZ;

    @Override // X.FCR
    public final void LIZLLL(InterfaceC40516FvE instance) {
        o.LJIIJ(instance, "instance");
        throw new FCQ("An operation is not implemented");
    }

    public C40527FvP(F3T providerFactory, NUT bulletBusiness) {
        o.LJIIIZ(providerFactory, "providerFactory");
        o.LJIIIZ(bulletBusiness, "bulletBusiness");
        this.LIZ = bulletBusiness;
    }

    @Override // X.FCR
    public final void LIZ(InterfaceC40516FvE instance, Throwable th) {
        AdLynxStatBusiness adLynxStatBusiness;
        C59297NOz c59297NOz;
        o.LJIIIZ(instance, "instance");
        if (th != null && (adLynxStatBusiness = (AdLynxStatBusiness) this.LIZ.LIZ(AdLynxStatBusiness.class)) != null) {
            String message = th.getMessage();
            NOY LIZ = adLynxStatBusiness.LIZ();
            if (LIZ == null || (c59297NOz = LIZ.LJJLIIJ) == null || !o.LJ(c59297NOz.getValue(), Boolean.TRUE)) {
                return;
            }
            adLynxStatBusiness.LJFF("init_fail", message);
        }
    }

    @Override // X.FCR
    public final void LIZIZ(AbstractC60240Nka abstractC60240Nka, android.net.Uri input) {
        o.LJIIJ(input, "input");
        throw new FCQ("An operation is not implemented");
    }

    @Override // X.FCR
    public final void LIZJ(AbstractC60240Nka instance, android.net.Uri uri, AqS52S0400000_6 aqS52S0400000_6, InterfaceC88472Yns reject) {
        o.LJIIJ(instance, "instance");
        o.LJIIJ(uri, "uri");
        o.LJIIJ(reject, "reject");
        aqS52S0400000_6.invoke(uri);
    }
}
