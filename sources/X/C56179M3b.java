package X;

import android.content.Context;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.bpea.cert.token.TokenCert;
import com.ss.android.ugc.tiktok.location.serviceimpl.LocationServiceImpl;
import kotlin.jvm.internal.o;

/* renamed from: X.M3b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56179M3b implements InterfaceC56180M3c {
    public static final C56179M3b LIZ = new C56179M3b();

    @Override // X.InterfaceC56180M3c
    public final boolean LJIILIIL(String str, String str2) {
        return LocationServiceImpl.LJIJJ().LJIILIIL("ttshop", "ship_address");
    }

    @Override // X.InterfaceC56180M3c
    public final boolean LJIILLIIL(int i, Context context) {
        o.LJIIIZ(context, "context");
        return LocationServiceImpl.LJIJJ().LJIILLIIL(i, context);
    }

    @Override // X.InterfaceC56180M3c
    public final void LJIIIIZZ(String business, String scene, Cert bpeaCert, Cert decryptCert, InterfaceC56182M3e interfaceC56182M3e) {
        o.LJIIIZ(business, "business");
        o.LJIIIZ(scene, "scene");
        o.LJIIIZ(bpeaCert, "bpeaCert");
        o.LJIIIZ(decryptCert, "decryptCert");
        LocationServiceImpl.LJIJJ().LJIIIIZZ(business, scene, bpeaCert, decryptCert, interfaceC56182M3e);
    }

    @Override // X.InterfaceC56180M3c
    public final void LJIILJJIL(String business, String scene, TokenCert bpeaCert, TokenCert tokenCert, InterfaceC56182M3e interfaceC56182M3e, Long l) {
        o.LJIIIZ(business, "business");
        o.LJIIIZ(scene, "scene");
        o.LJIIIZ(bpeaCert, "bpeaCert");
        LocationServiceImpl.LJIJJ().LJIILJJIL(business, scene, bpeaCert, tokenCert, interfaceC56182M3e, l);
    }

    @Override // X.InterfaceC56180M3c
    public final void LJIJI(String str, String scene, Cert cert, ActivityC45651qj activity, C85258Xd8 c85258Xd8, InterfaceC54674Ld0 interfaceC54674Ld0, InterfaceC85311Xdz interfaceC85311Xdz) {
        o.LJIIIZ(scene, "scene");
        o.LJIIIZ(cert, "cert");
        o.LJIIIZ(activity, "activity");
        LocationServiceImpl.LJIJJ().LJIJI(str, scene, cert, activity, c85258Xd8, interfaceC54674Ld0, interfaceC85311Xdz);
    }
}
