package X;

import Y.ACallableS7S1101000_1;
import android.os.SystemClock;
import com.ss.android.ugc.aweme.brdatagift.api.BaseBemobiResponse;
import com.ss.android.ugc.aweme.brdatagift.api.ICarrierRequestApi;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.o;

/* renamed from: X.OFw, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61608OFw {
    public static final C61608OFw LIZLLL = new C61608OFw();
    public boolean LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, X.OFs] */
    /* JADX WARN: Type inference failed for: r5v3, types: [T, X.OFs] */
    /* JADX WARN: Type inference failed for: r5v5, types: [T, X.OFs] */
    /* JADX WARN: Type inference failed for: r5v6, types: [T, X.OFs] */
    /* JADX WARN: Type inference failed for: r7v2, types: [T, X.OFs] */
    public static C61604OFs LIZ() {
        String str;
        InterfaceC37276Ek4 checkBemobiConnection;
        SystemClock.elapsedRealtime();
        Callable callable = new Callable() { // from class: X.6uS
            @Override // java.util.concurrent.Callable
            public final Object call() {
                FMX.onEventV3("bemobi_validation_request");
                return C76800UCe.LIZ;
            }
        };
        ExecutorService executorService = C10K.LJI;
        C10K.LIZIZ(callable, executorService, null);
        C68322mC c68322mC = new C68322mC();
        try {
            ICarrierRequestApi.LIZ.getClass();
            ICarrierRequestApi LIZ = C61606OFu.LIZ("http://tiktok-validation.bemobi.com/validate-connection");
            C48153Iv7 c48153Iv7 = new C48153Iv7();
            c48153Iv7.LJIIIZ = true;
            checkBemobiConnection = LIZ.checkBemobiConnection("http://tiktok-validation.bemobi.com/validate-connection", "tik-tok", c48153Iv7, "custom", "1", "tik-tok");
            C64797Pbt execute = checkBemobiConnection.execute();
            int i = execute.LIZ.LIZIZ;
            BaseBemobiResponse baseBemobiResponse = (BaseBemobiResponse) execute.LIZIZ;
            String body = baseBemobiResponse.url_check_status;
            o.LJIIIZ(body, "body");
            C10K.LIZIZ(new ACallableS7S1101000_1(i, body, null, 0), executorService, null);
            if (execute.LIZIZ()) {
                if (i == 200) {
                    if (baseBemobiResponse.url_check_status.equals("nodata")) {
                        str = null;
                        BaseBemobiResponse baseBemobiResponse2 = new BaseBemobiResponse(null, null, null, null, null, 31, null);
                        String str2 = execute.LIZ.LIZ;
                        o.LJIIIIZZ(str2, "response.raw().url");
                        c68322mC.element = new C61604OFs(302, baseBemobiResponse2, null, str2);
                    } else {
                        str = null;
                        BaseBemobiResponse baseBemobiResponse3 = new BaseBemobiResponse(null, null, null, null, null, 31, null);
                        String str3 = execute.LIZ.LIZ;
                        o.LJIIIIZZ(str3, "response.raw().url");
                        c68322mC.element = new C61604OFs(i, baseBemobiResponse3, null, str3);
                    }
                } else {
                    str = null;
                    BaseBemobiResponse baseBemobiResponse4 = new BaseBemobiResponse(null, null, null, null, null, 31, null);
                    String str4 = execute.LIZ.LIZ;
                    o.LJIIIIZZ(str4, "response.raw().url");
                    c68322mC.element = new C61604OFs(i, baseBemobiResponse4, null, str4);
                }
            } else {
                str = null;
                BaseBemobiResponse baseBemobiResponse5 = new BaseBemobiResponse(null, null, null, null, null, 31, null);
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("response is not successful, code is ");
                LIZ2.append(i);
                Exception exc = new Exception(X1D.LIZIZ(LIZ2));
                String str5 = execute.LIZ.LIZ;
                o.LJIIIIZZ(str5, "response.raw().url");
                c68322mC.element = new C61604OFs(i, baseBemobiResponse5, exc, str5);
            }
        } catch (Exception e) {
            C10K.LIZIZ(new ACallableS7S1101000_1(-999, "", e, 0), C10K.LJI, null);
            str = null;
            c68322mC.element = new C61604OFs(-999, new BaseBemobiResponse(null, null, null, null, null, 31, null), e, "something going wrong");
        }
        C61604OFs c61604OFs = (C61604OFs) c68322mC.element;
        if (c61604OFs == null) {
            return new C61604OFs(-1, new BaseBemobiResponse(str, str, str, str, str, 31, str), new Exception("the bemobi connection check url response is null"), "unknown");
        }
        return c61604OFs;
    }
}
