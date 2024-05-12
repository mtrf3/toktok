package X;

import java.util.Iterator;
import java.util.Locale;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.PzV, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66261PzV implements InterfaceC66269Pzd {
    @Override // X.InterfaceC66269Pzd
    public final void LIZ(C66240PzA previousStoreRegionInfo, C66240PzA currentStoreRegionInfo) {
        o.LJIIIZ(previousStoreRegionInfo, "previousStoreRegionInfo");
        o.LJIIIZ(currentStoreRegionInfo, "currentStoreRegionInfo");
        if (!o.LJ(previousStoreRegionInfo.LJLJJI.LJLJI, currentStoreRegionInfo.LJLJJI.LJLJI) || o.LJ(U49.LIZLLL, "")) {
            U49 u49 = U49.LIZ;
            String str = previousStoreRegionInfo.LJLILLLLZI;
            Locale locale = Locale.ROOT;
            String lowerCase = str.toLowerCase(locale);
            o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            u49.getClass();
            C1HQ<String, String> c1hq = U49.LJFF;
            String orDefault = c1hq.getOrDefault(lowerCase, null);
            String str2 = "row";
            if (orDefault == null) {
                orDefault = "row";
            }
            U49.LIZJ = orDefault;
            String lowerCase2 = currentStoreRegionInfo.LJLILLLLZI.toLowerCase(locale);
            o.LJIIIIZZ(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            String orDefault2 = c1hq.getOrDefault(lowerCase2, null);
            if (orDefault2 != null) {
                str2 = orDefault2;
            }
            U49.LIZLLL = str2;
            Iterator<InterfaceC64395PPb> it = U49.LIZIZ.iterator();
            while (it.hasNext()) {
                InterfaceC64395PPb next = it.next();
                if (!o.LJ(U49.LIZJ, U49.LIZLLL)) {
                    next.LIZ(U49.LIZJ, U49.LIZLLL);
                }
                JSONObject jSONObject = new JSONObject();
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(U49.LIZJ);
                LIZ.append("_to_");
                LIZ.append(U49.LIZLLL);
                jSONObject.put("update_type", X1D.LIZIZ(LIZ));
                C09900aA.LJI("store_region_update", jSONObject, null, null);
            }
        }
    }
}
