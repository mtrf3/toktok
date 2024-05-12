package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.setting.api.BetaAppApi;
import kotlin.jvm.internal.o;

/* renamed from: X.Fwj, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40609Fwj {
    public static final /* synthetic */ C40609Fwj LIZ = new C40609Fwj();
    public static final BetaAppApi LIZIZ;
    public static final String LIZJ;
    public static final String LIZLLL;
    public static final Keva LJ;

    static {
        Object obj;
        String str = com.ss.android.ugc.aweme.app.api.Api.LIZ;
        InterfaceC789838c LJI = C79061V1d.LJI(str, "API_URL_PREFIX_SI", str);
        if (LJI != null) {
            obj = LJI.create(BetaAppApi.class);
        } else {
            obj = null;
        }
        o.LJI(obj);
        LIZIZ = (BetaAppApi) obj;
        LIZJ = LIZ("become_beta");
        LIZ("welcome_beta");
        LIZLLL = LIZ("invite_beta");
        LJ = Keva.getRepo("beta_testing");
    }

    public static String LIZ(String str) {
        StringBuilder LJFF = C72972SkS.LJFF(str, '-');
        return UPJ.LJ((RBX) HG3.LJIILL(), LJFF, LJFF);
    }
}
