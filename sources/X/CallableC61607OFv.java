package X;

import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.brdatagift.api.BaseBemobiResponse;
import com.ss.android.ugc.aweme.brdatagift.api.ICarrierRequestApi;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.o;

/* renamed from: X.OFv, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class CallableC61607OFv<V> implements Callable {
    public static final CallableC61607OFv<V> LJLIL = new CallableC61607OFv<>();

    @Override // java.util.concurrent.Callable
    public final Object call() {
        try {
            ICarrierRequestApi.LIZ.getClass();
            C65087PgZ LIZ = RetrofitFactory.LIZLLL().LIZ("http://tiktok.bemobi.com/");
            LIZ.LIZJ = true;
            ICarrierRequestApi iCarrierRequestApi = (ICarrierRequestApi) LIZ.LJFF().LIZ.LIZ(ICarrierRequestApi.class);
            C48153Iv7 c48153Iv7 = new C48153Iv7();
            c48153Iv7.LJIIIZ = true;
            C64797Pbt<BaseBemobiResponse> execute = iCarrierRequestApi.getBemobiDataGift("tik-tok", c48153Iv7, "custom").execute();
            if (execute.LIZIZ()) {
                int i = execute.LIZ.LIZIZ;
                BaseBemobiResponse baseBemobiResponse = execute.LIZIZ;
                if (baseBemobiResponse == null) {
                    baseBemobiResponse = new BaseBemobiResponse(null, null, null, null, null, 31, null);
                }
                if (i != 200) {
                    if (i != 203) {
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("response success ,but not 200 and not 203, code is ");
                        LIZ2.append(i);
                        Exception exc = new Exception(X1D.LIZIZ(LIZ2));
                        String str = execute.LIZ.LIZ;
                        o.LJIIIIZZ(str, "response.raw().url");
                        return new C61604OFs(203, baseBemobiResponse, exc, str);
                    }
                    String str2 = execute.LIZ.LIZ;
                    o.LJIIIIZZ(str2, "response.raw().url");
                    return new C61604OFs(203, baseBemobiResponse, null, str2);
                }
                String str3 = execute.LIZ.LIZ;
                o.LJIIIIZZ(str3, "response.raw().url");
                return new C61604OFs(200, baseBemobiResponse, null, str3);
            }
            int i2 = execute.LIZ.LIZIZ;
            BaseBemobiResponse baseBemobiResponse2 = new BaseBemobiResponse(null, null, null, null, null, 31, null);
            Exception exc2 = new Exception("response is not successful");
            String str4 = execute.LIZ.LIZ;
            o.LJIIIIZZ(str4, "response.raw().url");
            return new C61604OFs(i2, baseBemobiResponse2, exc2, str4);
        } catch (Exception e) {
            return new C61604OFs(-999, new BaseBemobiResponse(null, null, null, null, null, 31, null), e, "something going wrong");
        }
    }
}
