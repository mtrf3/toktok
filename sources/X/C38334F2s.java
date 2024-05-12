package X;

import com.ss.android.ugc.aweme.net.CommonApi;
import com.ss.android.ugc.aweme.services.RetrofitService;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.F2s, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38334F2s<T> {
    public static final CommonApi LJII;
    public InterfaceC38336F2u<T> LIZ;
    public final String LIZIZ;
    public final EnumC38335F2t LIZJ;
    public final List<C66619QCp> LIZLLL;
    public final Class<T> LJ;
    public boolean LJI = true;
    public final String LJFF = null;

    static {
        C16880lQ.LJLLJ(C38334F2s.class);
        LJII = (CommonApi) RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(com.ss.android.ugc.aweme.app.api.Api.LIZ).create(CommonApi.class);
    }

    public C38334F2s(String str, EnumC38335F2t enumC38335F2t, List<C66619QCp> list, Class<T> cls) {
        this.LIZIZ = str;
        this.LIZJ = enumC38335F2t;
        this.LIZLLL = list;
        this.LJ = cls;
    }

    public static Object LIZ(EnumC38335F2t enumC38335F2t, Class cls, String str, String str2, List list) {
        HashMap hashMap = new HashMap();
        if (!C79004UzY.LJJIFFI(list)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C66619QCp c66619QCp = (C66619QCp) it.next();
                hashMap.put(c66619QCp.LJLIL, c66619QCp.LJLILLLLZI);
            }
        }
        if (enumC38335F2t == EnumC38335F2t.POST) {
            QJY.LJI(hashMap, true);
            String str3 = LJII.doPost(str, hashMap).execute().LIZIZ;
            if (String.class.equals(cls)) {
                return com.ss.android.ugc.aweme.app.api.Api.LJII(str3, C38300F1k.LIZ, str2, str);
            }
            return com.ss.android.ugc.aweme.app.api.Api.LJII(str3, new C38341F2z(cls), str2, str);
        }
        if (enumC38335F2t == EnumC38335F2t.GET) {
            String str4 = LJII.doGet(str, hashMap).execute().LIZIZ;
            if (String.class.equals(cls)) {
                return com.ss.android.ugc.aweme.app.api.Api.LJII(str4, C38300F1k.LIZ, str2, str);
            }
            return com.ss.android.ugc.aweme.app.api.Api.LJII(str4, new C38341F2z(cls), str2, str);
        }
        throw new IllegalStateException("Unsupport http type !");
    }
}
