package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.dsp.common.MusicActionReporterApi;
import kotlin.jvm.internal.o;

/* renamed from: X.E8g, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35930E8g {
    public static AbstractC73672Svk LIZ(String str) {
        MusicActionReporterApi.MusicActionReporterOperatorApi musicActionReporterOperatorApi = MusicActionReporterApi.LIZ;
        if (musicActionReporterOperatorApi == null) {
            IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
            String API_URL_PREFIX_SI = EFJ.LIZJ;
            o.LJIIIIZZ(API_URL_PREFIX_SI, "API_URL_PREFIX_SI");
            InterfaceC789838c create = LIZLLL.create(API_URL_PREFIX_SI);
            if (create != null) {
                musicActionReporterOperatorApi = (MusicActionReporterApi.MusicActionReporterOperatorApi) create.create(MusicActionReporterApi.MusicActionReporterOperatorApi.class);
            } else {
                musicActionReporterOperatorApi = null;
            }
            o.LJI(musicActionReporterOperatorApi);
            MusicActionReporterApi.LIZ = musicActionReporterOperatorApi;
        }
        return musicActionReporterOperatorApi.actionReport(str);
    }
}
