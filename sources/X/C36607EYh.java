package X;

import Y.IDdS378S0100000_6;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.ss.android.ugc.aweme.hybridkit.task.IFetchJSBNetApi;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.EYh, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36607EYh implements InterfaceC36604EYe {
    public static final C36607EYh LJLIL = new C36607EYh();

    public static final C48153Iv7 LIZLLL(java.util.Map<String, String> map) {
        String str;
        if (map != null && (str = map.get("timeout")) != null) {
            long parseLong = CastLongProtector.parseLong(str);
            if (parseLong > 0) {
                C48153Iv7 c48153Iv7 = new C48153Iv7();
                c48153Iv7.LIZJ = parseLong;
                c48153Iv7.LIZLLL = parseLong;
                c48153Iv7.LJ = parseLong;
                return c48153Iv7;
            }
            return null;
        }
        return null;
    }

    public static final List<EJ6> LJFF(java.util.Map<String, String> map) {
        if (map.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            arrayList.add(new EJ6(entry.getKey(), entry.getValue()));
        }
        return arrayList;
    }

    @Override // X.InterfaceC36604EYe
    public final void LJ(String url, java.util.Map<String, String> map, InterfaceC36606EYg callback) {
        o.LJIIJ(url, "url");
        o.LJIIJ(callback, "callback");
    }

    @Override // X.InterfaceC36604EYe
    public final void LIZ(String str, java.util.Map<String, String> map, boolean z, java.util.Map<String, String> map2, InterfaceC36606EYg callback) {
        String url = str;
        o.LJIIIZ(url, "url");
        o.LJIIIZ(callback, "callback");
        IDdS378S0100000_6 iDdS378S0100000_6 = new IDdS378S0100000_6(callback, 10);
        IFetchJSBNetApi iFetchJSBNetApi = (IFetchJSBNetApi) C46104I7o.LJIJ(url, C65352Pkq.LIZ(IFetchJSBNetApi.class));
        if (z) {
            url = QJY.LIZIZ(url, true);
            o.LJIIIIZZ(url, "addCommonParams(url, true)");
        }
        iFetchJSBNetApi.fetchGet(url, false, LJFF(map), null, LIZLLL(map2)).enqueue(iDdS378S0100000_6);
    }

    @Override // X.InterfaceC36604EYe
    public final void LIZIZ(String url, java.util.Map<String, String> map, String str, JSONObject jSONObject, InterfaceC36606EYg callback) {
        o.LJIIJ(url, "url");
        o.LJIIJ(callback, "callback");
    }

    @Override // X.InterfaceC36604EYe
    public final void LIZJ(String str, java.util.Map<String, String> map, String str2, JSONObject jSONObject, boolean z, java.util.Map<String, String> map2, InterfaceC36606EYg callback) {
        String url = str;
        o.LJIIIZ(url, "url");
        o.LJIIIZ(callback, "callback");
        IDdS378S0100000_6 iDdS378S0100000_6 = new IDdS378S0100000_6(callback, 10);
        IFetchJSBNetApi iFetchJSBNetApi = (IFetchJSBNetApi) C46104I7o.LJIJ(url, C65352Pkq.LIZ(IFetchJSBNetApi.class));
        if (z) {
            url = QJY.LIZIZ(url, true);
            o.LJIIIIZZ(url, "addCommonParams(url, true)");
        }
        List<EJ6> LJFF = LJFF(map);
        String jSONObject2 = jSONObject.toString();
        o.LJIIIIZZ(jSONObject2, "body.toString()");
        byte[] bytes = jSONObject2.getBytes(PVC.LIZ);
        o.LJIIIIZZ(bytes, "this as java.lang.String).getBytes(charset)");
        iFetchJSBNetApi.fetchPost(url, false, LJFF, new TypedByteArray(str2, bytes, new String[0]), LIZLLL(map2)).enqueue(iDdS378S0100000_6);
    }
}
