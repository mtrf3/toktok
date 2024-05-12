package X;

import java.util.ArrayList;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.PaU, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64710PaU implements InterfaceC65054Pg2 {
    @Override // X.InterfaceC65054Pg2
    public final String LIZ(String url, String str, C64606PXe c64606PXe) {
        JSONObject jSONObject;
        java.util.Set<String> LJFF;
        o.LJIIIZ(url, "url");
        try {
            jSONObject = new JSONObject(str);
        } catch (Throwable th) {
            C78983UzD.LJIIZILJ(th);
            jSONObject = null;
        }
        if (jSONObject == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (c64606PXe != null && (LJFF = c64606PXe.LJFF()) != null) {
            for (String str2 : LJFF) {
                arrayList.add(new EJ6(str2, c64606PXe.LIZLLL(str2)));
            }
        }
        return EYV.LIZIZ(url, jSONObject, null, arrayList);
    }
}
