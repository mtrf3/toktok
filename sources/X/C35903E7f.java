package X;

import com.ss.android.ugc.aweme.zerorating.ZeroRatingMainServiceImpl;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: X.E7f, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35903E7f implements InterfaceC35904E7g {
    public final /* synthetic */ ZeroRatingMainServiceImpl LIZ;

    public C35903E7f(ZeroRatingMainServiceImpl zeroRatingMainServiceImpl) {
        this.LIZ = zeroRatingMainServiceImpl;
    }

    @Override // X.InterfaceC35904E7g
    public final void LIZ(String str, java.util.Map map, java.util.Map map2) {
        HashMap hashMap = new HashMap();
        hashMap.putAll(map);
        if (map2 != null) {
            hashMap.putAll(map2);
        }
        this.LIZ.getClass();
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry entry : hashMap.entrySet()) {
                jSONObject.put((String) entry.getKey(), entry.getValue());
            }
        } catch (Exception unused) {
        }
        FMX.LJIILJJIL(str, jSONObject);
    }
}
