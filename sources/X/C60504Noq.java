package X;

import android.app.Application;
import com.bytedance.ies.bullet.service.base.resourceloader.config.GeckoConfig;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.base.xelements.XElements;
import com.ss.android.ugc.aweme.bullet.BulletContainerActivity;
import com.ss.android.ugc.aweme.gecko.GeckoXNetImpl;
import com.ss.android.ugc.aweme.local_test.LocalTestApi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.jvm.internal.o;
import lh3.IDaS86S0000000_10;

/* renamed from: X.Noq, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60504Noq extends AbstractC60391Nn1 {
    public final C60218NkE LIZ;
    public final C60511Nox LIZIZ;
    public final O1E LIZJ;
    public final C39966FmM LIZLLL;
    public final C60384Nmu LJ;
    public final C60510Now LJFF;
    public final C60505Nor LJI;
    public final C60506Nos LJII;

    @Override // X.InterfaceC60377Nmn
    public final C60218NkE LIZIZ() {
        return this.LIZ;
    }

    @Override // X.InterfaceC60377Nmn
    public final C60510Now LJFF() {
        return this.LJFF;
    }

    @Override // X.InterfaceC60377Nmn
    public final O1E LJI() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC60377Nmn
    public final C39966FmM LJII() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC60377Nmn
    public final C60505Nor LJIIIIZZ() {
        return this.LJI;
    }

    @Override // X.InterfaceC60377Nmn
    public final C60511Nox LJIIIZ() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC60377Nmn
    public final C60384Nmu LJIIJ() {
        return this.LJ;
    }

    @Override // X.InterfaceC60377Nmn
    public final C60506Nos LJIIJJI() {
        return this.LJII;
    }

    public C60504Noq(Application application) {
        C60218NkE c60218NkE = new C60218NkE(application);
        C63081OpJ c63081OpJ = new C63081OpJ();
        LocalTestApi localTestApi = C37090Eh4.LIZ.LIZ;
        if (localTestApi != null) {
            localTestApi.shouldBulletShowDebugTagView();
        }
        c60218NkE.LIZIZ = c63081OpJ;
        this.LIZ = c60218NkE;
        C60507Not c60507Not = new C60507Not();
        c60507Not.LIZ = "aweme";
        this.LIZIZ = new C60511Nox("aweme", c60507Not.LIZIZ);
        String geckoHost = C38943FQd.LIZIZ();
        String LIZ = C85990Xow.LIZ();
        List LJJIJIL = C47261Igj.LJJIJIL("ecom_prefix");
        Iterator it = ((ArrayList) C38943FQd.LIZJ()).iterator();
        while (it.hasNext()) {
            Pattern pattern = (Pattern) it.next();
            if (pattern != null) {
                String pattern2 = pattern.toString();
                o.LJIIIIZZ(pattern2, "p.toString()");
                if (pattern2.length() > 0) {
                    String pattern3 = pattern.toString();
                    o.LJIIIIZZ(pattern3, "p.toString()");
                    LJJIJIL.add(pattern3);
                }
            }
        }
        String valueOf = String.valueOf(EF7.LJIIIZ);
        String LIZLLL = EF7.LIZLLL();
        String serverDeviceId = AppLog.getServerDeviceId();
        serverDeviceId = serverDeviceId == null ? "" : serverDeviceId;
        O3G o3g = new O3G();
        EF7.LIZIZ();
        GeckoXNetImpl geckoXNetImpl = new GeckoXNetImpl();
        GeckoConfig geckoConfig = new GeckoConfig(C38943FQd.LIZ(), "offlineX", new C61227O1f(), false, false, 24, null);
        o.LJIIIIZZ(geckoHost, "geckoHost");
        this.LIZJ = new O1E(geckoHost, LIZ, LJJIJIL, valueOf, LIZLLL, serverDeviceId, geckoConfig, o3g, geckoXNetImpl, 128);
        C39960FmG c39960FmG = new C39960FmG(application);
        c39960FmG.LIZ = false;
        ((ArrayList) c39960FmG.LIZIZ).add(new C60517Np3());
        C39961FmH.LIZIZ = false;
        C39961FmH.LIZJ = false;
        ((ArrayList) c39960FmG.LIZJ).addAll(ORZ.LLIIIZ(C47261Igj.LJJIJ(new IDaS86S0000000_10(126)), XElements.LIZ(false)));
        this.LIZLLL = new C39966FmM(c39960FmG.LJFF, c39960FmG);
        this.LJ = new C60384Nmu();
        F0H f0h = new F0H();
        f0h.LIZJ = "bullet";
        this.LJFF = new C60510Now(f0h.LIZ, f0h.LIZIZ, f0h.LIZJ);
        C60508Nou c60508Nou = new C60508Nou();
        c60508Nou.LIZ = BulletContainerActivity.class;
        this.LJI = new C60505Nor(c60508Nou);
        C60509Nov c60509Nov = new C60509Nov();
        C38955FQp creator = C38955FQp.LJLIL;
        o.LJIIJ(creator, "creator");
        c60509Nov.LIZ = creator;
        this.LJII = new C60506Nos(c60509Nov);
    }
}
