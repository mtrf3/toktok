package X;

import android.util.Pair;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.ss.android.ugc.aweme.net.CommonApi;
import defpackage.i0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class EYU extends AbstractC66805QJt {
    @Override // X.AbstractC66805QJt
    public final String LIZIZ(String str, java.util.Map<String, String> map, QKY qky) {
        List<EJ6> arrayList;
        if (map != null) {
            ArrayList arrayList2 = new ArrayList(map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                arrayList2.add(new EJ6(entry.getKey(), entry.getValue()));
            }
            arrayList = ORZ.LLJILJILJ(arrayList2);
        } else {
            arrayList = new ArrayList<>();
        }
        o.LJI(str);
        HashMap hashMap = new HashMap();
        String baseUrl = (String) EZX.LIZJ(str, null).first;
        o.LJIIIIZZ(baseUrl, "baseUrl");
        CommonApi LIZ = EYV.LIZ(baseUrl);
        if (LIZ != null) {
            C64797Pbt<String> execute = LIZ.doGet(str, hashMap, arrayList).execute();
            o.LJI(execute);
            String str2 = execute.LIZIZ;
            o.LJI(str2);
            return str2;
        }
        throw new RuntimeException(i0.LJFF("CommonApi is null,url=", str));
    }

    @Override // X.AbstractC66805QJt
    public final String LIZLLL(String str, List<Pair<String, String>> list, java.util.Map<String, String> map, QKY qky) {
        List arrayList;
        JSONObject jSONObject = new JSONObject();
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            jSONObject.put((String) pair.first, pair.second);
        }
        if (map != null) {
            ArrayList arrayList2 = new ArrayList(map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                arrayList2.add(new EJ6(entry.getKey(), entry.getValue()));
            }
            arrayList = ORZ.LLJILJILJ(arrayList2);
        } else {
            arrayList = new ArrayList();
        }
        o.LJI(str);
        return EYV.LIZIZ(str, jSONObject, null, arrayList);
    }

    @Override // X.AbstractC66805QJt
    public final String LJ(String str, byte[] bArr, java.util.Map<String, String> map, QKY qky) {
        TypedByteArray typedByteArray = new TypedByteArray(null, bArr, new String[0]);
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            arrayList.add(new EJ6(entry.getKey(), entry.getValue()));
        }
        List<EJ6> LLJILJILJ = ORZ.LLJILJILJ(arrayList);
        o.LJI(str);
        String baseUrl = (String) EZX.LIZJ(str, null).first;
        o.LJIIIIZZ(baseUrl, "baseUrl");
        CommonApi LIZ = EYV.LIZ(baseUrl);
        if (LIZ != null) {
            C64797Pbt<String> execute = LIZ.postBody(str, typedByteArray, LLJILJILJ).execute();
            o.LJI(execute);
            String str2 = execute.LIZIZ;
            o.LJI(str2);
            return str2;
        }
        throw new RuntimeException(i0.LJFF("CommonApi is null,url=", str));
    }
}
