package X;

import Y.ACallableS32S1200000_1;
import Y.AfS62S0100000_10;
import Y.IDcS135S0200000_1;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.im.core.proto.Request;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.im.sdk.iescore.api.PlatformApi;
import java.io.IOException;
import java.net.BindException;
import java.net.ConnectException;
import java.net.NoRouteToHostException;
import java.net.PortUnreachableException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import kotlin.jvm.internal.AqS176S0100000_10;
import kotlin.jvm.internal.o;
import org.apache.http.conn.ConnectTimeoutException;

/* renamed from: X.Ozc, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63720Ozc implements InterfaceC76502zO {
    public static final /* synthetic */ C63720Ozc LIZ = new C63720Ozc();
    public static PlatformApi LIZIZ = LIZJ();

    public static PlatformApi LIZJ() {
        try {
            return (PlatformApi) RetrofitFactory.LIZLLL().LIZ(C30Y.LIZ).LJFF().LIZ.LIZ(PlatformApi.class);
        } catch (Throwable th) {
            C34B.LJ("PlatformAPI", th);
            return null;
        }
    }

    public static C73475SsZ LIZ(Throwable th) {
        if (th instanceof C63756P0m) {
            C63756P0m c63756P0m = (C63756P0m) th;
            if (c63756P0m.getExceptions().size() == 1) {
                return AbstractC73638SvC.LJIILJJIL((Throwable) ListProtector.get(c63756P0m.getExceptions(), 0));
            }
            return AbstractC73638SvC.LJIILJJIL(th);
        }
        return AbstractC73638SvC.LJIILJJIL(th);
    }

    public static C63623Oy3 LIZIZ(Throwable th) {
        C63375Ou3 c63375Ou3 = new C63375Ou3();
        C63623Oy3 c63623Oy3 = c63375Ou3.LIZ;
        c63623Oy3.LJII = th;
        if (th instanceof C38333F2r) {
            c63623Oy3.LIZIZ = -1032;
            StringBuilder sb = new StringBuilder("ApiServerException: code ");
            C38333F2r c38333F2r = (C38333F2r) th;
            sb.append(c38333F2r.getErrorCode());
            sb.append(" msg ");
            sb.append(c38333F2r.getErrorMsg());
            c63375Ou3.LIZ.LIZJ = sb.toString();
            c63375Ou3.LIZ.LJI = c38333F2r.getResponse();
        } else if (th instanceof C64698PaI) {
            c63623Oy3.LIZIZ = -1014;
        } else if (th instanceof C64802Pby) {
            c63623Oy3.LIZIZ = -1033;
            c63375Ou3.LIZ.LIZJ = "HttpResponseException: code " + ((C64802Pby) th).getStatusCode() + " msg " + th.getMessage();
        } else if (th instanceof C64799Pbv) {
            c63623Oy3.LIZIZ = -1031;
            c63375Ou3.LIZ.LIZJ = "HttpResponseException: code " + ((C64799Pbv) th).getStatusCode() + " msg " + th.getMessage();
        } else if ((th instanceof ConnectTimeoutException) || (th instanceof SocketTimeoutException)) {
            c63623Oy3.LIZIZ = -1021;
            c63375Ou3.LIZ.LIZJ = th.getMessage();
        } else if ((th instanceof BindException) || (th instanceof ConnectException) || (th instanceof SocketException) || (th instanceof NoRouteToHostException)) {
            c63623Oy3.LIZIZ = -1006;
            c63375Ou3.LIZ.LIZJ = th.getMessage();
        } else if (th instanceof PortUnreachableException) {
            c63623Oy3.LIZIZ = -1023;
            c63375Ou3.LIZ.LIZJ = th.getMessage();
        } else if (th instanceof UnknownHostException) {
            c63623Oy3.LIZIZ = -1024;
            c63375Ou3.LIZ.LIZJ = th.getMessage();
        } else if (th instanceof C63723Ozf) {
            c63623Oy3.LIZIZ = -1025;
            c63375Ou3.LIZ.LIZJ = th.getMessage();
        } else if (th instanceof C64801Pbx) {
            c63623Oy3.LIZIZ = -1026;
            c63375Ou3.LIZ.LIZJ = th.getMessage();
        } else if (th instanceof IOException) {
            c63623Oy3.LIZIZ = -1027;
            c63375Ou3.LIZ.LIZJ = th.getMessage();
        } else if (th instanceof C63756P0m) {
            c63623Oy3.LIZIZ = -1030;
            C63756P0m c63756P0m = (C63756P0m) th;
            c63375Ou3.LIZ.LIZJ = c63756P0m.getMessage();
            c63375Ou3.LIZ.LJII = c63756P0m.getCause();
            C78983UzD.LJIJ(th, "IM-PlatformApi composite error");
            if (!o.LJ(EF7.LJIILIIL, "local_test")) {
                if (o.LJ(EF7.LJIILIIL, "lark_inhouse")) {
                    throw th;
                }
            } else {
                throw th;
            }
        } else {
            C78983UzD.LJIJ(th, "IM-PlatformApi unknown http error");
            if (!o.LJ(EF7.LJIILIIL, "local_test")) {
                if (o.LJ(EF7.LJIILIIL, "lark_inhouse")) {
                    throw th;
                }
            } else {
                throw th;
            }
        }
        C63623Oy3 c63623Oy32 = c63375Ou3.LIZ;
        o.LJIIIIZZ(c63623Oy32, "errorBuilder.build()");
        return c63623Oy32;
    }

    public final void LIZLLL(C114724eq request, IDcS135S0200000_1 iDcS135S0200000_1) {
        o.LJIIIZ(request, "request");
        if (LIZIZ == null) {
            synchronized (this) {
                if (LIZIZ == null) {
                    LIZIZ = LIZJ();
                }
            }
        }
        PlatformApi platformApi = LIZIZ;
        if (platformApi == null) {
            C63375Ou3 c63375Ou3 = new C63375Ou3();
            c63375Ou3.LIZ.LIZ = -1022;
            NullPointerException nullPointerException = new NullPointerException("platformApi is null");
            C63623Oy3 c63623Oy3 = c63375Ou3.LIZ;
            c63623Oy3.LJII = nullPointerException;
            iDcS135S0200000_1.LIZIZ(c63623Oy3);
            return;
        }
        String str = request.LIZIZ.get("Content-Type");
        if (str == null) {
            str = "";
        }
        new C73472SsW(new ACallableS32S1200000_1(platformApi, request, str, 0)).LJJIIJ(T16.LIZ()).LJIJJ(C73969T1h.LIZIZ()).LJIJJLI(C63721Ozd.LJLIL).LJJII(new AfS62S0100000_10(iDcS135S0200000_1, 16), new AfS62S0100000_10(iDcS135S0200000_1, 17));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJ(C114724eq request, IDcS135S0200000_1 iDcS135S0200000_1) {
        o.LJIIIZ(request, "request");
        if (LIZIZ == null) {
            synchronized (this) {
                if (LIZIZ == null) {
                    LIZIZ = LIZJ();
                }
            }
        }
        PlatformApi platformApi = LIZIZ;
        if (platformApi == null) {
            C63375Ou3 c63375Ou3 = new C63375Ou3();
            c63375Ou3.LIZ.LIZ = -1022;
            NullPointerException nullPointerException = new NullPointerException("platformApi is null");
            C63623Oy3 c63623Oy3 = c63375Ou3.LIZ;
            c63623Oy3.LJII = nullPointerException;
            iDcS135S0200000_1.LIZIZ(c63623Oy3);
            return;
        }
        String str = request.LIZ;
        String str2 = request.LIZIZ.get("Content-Type");
        if (str2 == null) {
            str2 = "";
        }
        String LIZIZ2 = C85999Xp5.LIZIZ();
        o.LJIIIIZZ(LIZIZ2, "getAppLocale()");
        C73542Ste.LIZLLL(platformApi.postSingle(str, str2, LIZIZ2, (Request) request.LIZLLL, request.LJ).LJIJJLI(C63722Oze.LJLIL), new AqS176S0100000_10(iDcS135S0200000_1, 51), new AqS176S0100000_10(iDcS135S0200000_1, 52));
    }
}
