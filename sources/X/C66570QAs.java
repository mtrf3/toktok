package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.account.network.ttp.IRegionApi;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.QAs, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66570QAs {
    public static final /* synthetic */ C66570QAs LIZ = new C66570QAs();

    public static IRegionApi LIZ(String domain) {
        o.LJIIIZ(domain, "domain");
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("https://");
        LIZ2.append(domain);
        return (IRegionApi) LIZLLL.LIZ(X1D.LIZIZ(LIZ2)).LJFF().LIZ.LIZ(IRegionApi.class);
    }

    public static List LIZIZ(String domain, String str, boolean z) {
        o.LJIIIZ(domain, "domain");
        ArrayList arrayList = new ArrayList();
        if (z) {
            C77800Ug8.LJFF("x-tt-bypass-dp", "1", arrayList);
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(domain);
        LIZ2.append(str);
        String LIZLLL = AbstractC66965QPx.LIZLLL(X1D.LIZIZ(LIZ2));
        if (C78685UuP.LJJJZ(LIZLLL)) {
            C77800Ug8.LJFF("x-tt-passport-csrf-token", LIZLLL, arrayList);
        }
        return arrayList;
    }
}
