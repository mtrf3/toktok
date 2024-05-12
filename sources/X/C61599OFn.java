package X;

import Y.ACallableS0S1000000_1;
import Y.ACallableS8S1000000_10;
import android.app.Activity;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.brdatagift.api.BaseBemobiResponse;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.o;

/* renamed from: X.OFn, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61599OFn implements InterfaceC61605OFt {
    @Override // X.InterfaceC61605OFt
    public final void LIZJ(BaseBemobiResponse baseBemobiResponse) {
        o.LJIIIZ(baseBemobiResponse, "baseBemobiResponse");
    }

    @Override // X.InterfaceC61605OFt
    public final void onFailed(Exception exc) {
    }

    @Override // X.InterfaceC61605OFt
    public final void LIZ(BaseBemobiResponse baseBemobiResponse) {
        o.LJIIIZ(baseBemobiResponse, "baseBemobiResponse");
        if (o.LJ(baseBemobiResponse.status, "available") && C52212KeO.LIZ()) {
            String url = baseBemobiResponse.subscriptionEndpoint;
            o.LJIIIZ(url, "url");
            ACallableS0S1000000_1 aCallableS0S1000000_1 = new ACallableS0S1000000_1(url, 5);
            ExecutorService executorService = C10K.LJI;
            C10K.LIZIZ(aCallableS0S1000000_1, executorService, null);
            C61608OFw c61608OFw = C61608OFw.LIZLLL;
            if (c61608OFw.LIZIZ) {
                return;
            }
            c61608OFw.LIZIZ = true;
            C10K.LIZIZ(new ACallableS8S1000000_10(url, 4), executorService, null).LJ(new C61603OFr(url, SystemClock.elapsedRealtime()), C10K.LJIIIIZZ, null);
        }
    }

    @Override // X.InterfaceC61605OFt
    public final void LIZIZ(BaseBemobiResponse baseBemobiResponse) {
        String str;
        o.LJIIIZ(baseBemobiResponse, "baseBemobiResponse");
        if (o.LJ(baseBemobiResponse.status, "unavailable") && C52212KeO.LIZ()) {
            C61601OFp.LIZ = baseBemobiResponse.iframeUrl;
            if (!C58512Rj.LIZ().getEnable() || AV1.LJIILLIIL() || TextUtils.isEmpty(C61601OFp.LIZ) || !C52212KeO.LIZ() || C61601OFp.LIZIZ) {
                return;
            }
            String url = C61601OFp.LIZ;
            o.LJIIIZ(url, "url");
            C10K.LIZIZ(new ACallableS0S1000000_1(url, 6), C10K.LJI, null);
            Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
            if (LJIIIIZZ == null) {
                return;
            }
            Uri.Builder buildUpon = UriProtector.parse("aweme://webview_popup").buildUpon();
            android.net.Uri parse = UriProtector.parse(C61601OFp.LIZ);
            String queryParameter = UriProtector.getQueryParameter(parse, "height");
            if (queryParameter == null) {
                queryParameter = "330";
            }
            boolean LJIILJJIL = AnonymousClass636.LJIILJJIL(LJIIIIZZ);
            Uri.Builder buildUpon2 = parse.buildUpon();
            if (LJIILJJIL) {
                str = "dark";
            } else {
                str = "light";
            }
            String builder = buildUpon2.appendQueryParameter("mode", str).toString();
            o.LJIIIIZZ(builder, "rawUri.buildUpon().appen…            }).toString()");
            String builder2 = buildUpon.appendQueryParameter("url", builder).appendQueryParameter("height", queryParameter).toString();
            o.LJIIIIZZ(builder2, "schema.appendQueryParame…ight\", height).toString()");
            C60593NqH c60593NqH = new C60593NqH(LJIILJJIL);
            C40342FsQ c40342FsQ = C40343FsR.LJIILJJIL;
            SparkContext sparkContext = new SparkContext();
            sparkContext.LJJIJLIJ(builder2);
            sparkContext.LJJIIJ("mask_bg_color", "00000080");
            sparkContext.LJJIFFI(12, "radius");
            sparkContext.LJIL(new CNB(builder2));
            sparkContext.LJII(InterfaceC60819Ntv.class, new C60594NqI(c60593NqH));
            sparkContext.LJJIJIIJIL(new CNA());
            c40342FsQ.getClass();
            C40342FsQ.LIZ(LJIIIIZZ, sparkContext).LIZIZ();
        }
    }
}
