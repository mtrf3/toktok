package X;

import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.brdatagift.api.ICarrierRequestApi;
import kotlin.jvm.internal.o;

/* renamed from: X.OFu, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61606OFu {
    public static final /* synthetic */ C61606OFu LIZ = new C61606OFu();

    public static ICarrierRequestApi LIZ(String url) {
        o.LJIIIZ(url, "url");
        C65087PgZ LIZ2 = RetrofitFactory.LIZLLL().LIZ(url);
        LIZ2.LIZJ = true;
        return (ICarrierRequestApi) LIZ2.LJFF().LIZ.LIZ(ICarrierRequestApi.class);
    }
}
