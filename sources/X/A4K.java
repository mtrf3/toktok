package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.paidcontent.api.SeriesVideoUploadAPI;
import java.util.concurrent.ExecutionException;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class A4K {
    public static AbstractC73672Svk LIZ() {
        try {
            if (SeriesVideoUploadAPI.LIZ == null) {
                IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
                String API_URL_PREFIX_SI = EFJ.LIZJ;
                o.LJIIIIZZ(API_URL_PREFIX_SI, "API_URL_PREFIX_SI");
                SeriesVideoUploadAPI.LIZ = (SeriesVideoUploadAPI.SeriesListingAPI) LIZLLL.LIZ(API_URL_PREFIX_SI).LJFF().LIZ.LIZ(SeriesVideoUploadAPI.SeriesListingAPI.class);
            }
            SeriesVideoUploadAPI.SeriesListingAPI seriesListingAPI = SeriesVideoUploadAPI.LIZ;
            if (seriesListingAPI != null) {
                return seriesListingAPI.getSeriesList(3);
            }
        } catch (ExecutionException e) {
            AbstractC36908Ee8.getCompatibleException(e);
        }
        C73536StY c73536StY = C73536StY.LJLIL;
        o.LJIIIIZZ(c73536StY, "empty()");
        return c73536StY;
    }
}
