package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.ttnet.INetworkApi;
import defpackage.i0;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: X.ENc, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36316ENc {
    public static String LIZ(String str, java.util.Map map, byte[] bArr) {
        InterfaceC36314ENa interfaceC36314ENa;
        C38759FJb c38759FJb = C78609UtB.LJLJI;
        String str2 = null;
        if (c38759FJb == null) {
            interfaceC36314ENa = null;
        } else {
            interfaceC36314ENa = c38759FJb.LIZIZ;
        }
        String LJFF = i0.LJFF(str, "/location/region/");
        try {
            Uri.Builder buildUpon = UriProtector.parse(LJFF).buildUpon();
            if (buildUpon != null) {
                buildUpon.appendQueryParameter("sdk_version", "1.2.0-rc.5-ttp");
                LJFF = buildUpon.toString();
            }
        } catch (Throwable unused) {
        }
        if (interfaceC36314ENa == null) {
            ArrayList arrayList = new ArrayList();
            HashMap hashMap = (HashMap) map;
            for (String str3 : hashMap.keySet()) {
                arrayList.add(new EJ6(str3, (String) hashMap.get(str3)));
            }
            try {
                C64797Pbt<String> execute = ((INetworkApi) C65083PgV.LJIIIIZZ(INetworkApi.class, LJFF)).postBody(-1, "", null, new TypedByteArray("application/json", bArr, new String[0]), arrayList).execute();
                if (execute.LIZ.LIZIZ != 200) {
                    return null;
                }
                str2 = execute.LIZIZ;
                return str2;
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
                return str2;
            }
        }
        return interfaceC36314ENa.LIZ(LJFF, new HashMap(), map, bArr);
    }
}
