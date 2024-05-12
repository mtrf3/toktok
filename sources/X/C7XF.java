package X;

import com.ss.android.ugc.aweme.nows.api.INowApi;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.7XF, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7XF {
    public static InterfaceC37276Ek4 LIZ(INowApi iNowApi, long j, int i, int i2, Object obj, String str, String str2, int i3) {
        String str3;
        Object obj2 = obj;
        String str4 = str;
        String str5 = null;
        if ((i3 & 8) != 0) {
            obj2 = null;
        }
        if ((i3 & 16) != 0) {
            ArrayList arrayList = new ArrayList();
            Iterator it = ((ArrayList) C7XK.LIZ).iterator();
            while (it.hasNext()) {
                Long LJJIZ = C38350F3i.LJJIZ((String) it.next());
                if (LJJIZ != null) {
                    arrayList.add(Long.valueOf(LJJIZ.longValue()));
                }
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("getLastReturnAid ");
            LIZ.append(arrayList);
            C7XD.LIZ("NowsAwemeFromReturnModel", X1D.LIZIZ(LIZ));
            str3 = arrayList.toString();
        } else {
            str3 = null;
        }
        if ((i3 & 32) != 0) {
            str4 = null;
        }
        if ((i3 & 64) == 0) {
            str5 = str2;
        }
        return iNowApi.fetchNowFeed(j, i, i2, obj2, str3, str4, str5);
    }
}
