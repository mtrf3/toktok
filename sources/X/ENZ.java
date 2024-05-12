package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.ss.android.ugc.aweme.legoImp.task.api.BDRegionReportApi;

/* loaded from: classes7.dex */
public final class ENZ implements InterfaceC36314ENa {
    public static final ENZ LIZ = new ENZ();

    @Override // X.InterfaceC36314ENa
    public final String LIZ(String str, java.util.Map map, java.util.Map map2, byte[] bArr) {
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        String str2 = EFJ.LIZJ;
        return ((BDRegionReportApi) C770830u.LIZJ(str2, "API_URL_PREFIX_SI", LIZLLL, str2).LIZ.LIZ(BDRegionReportApi.class)).doPost(str, map, map2, new TypedByteArray("application/json; charset=utf-8", bArr, new String[0])).get();
    }
}
