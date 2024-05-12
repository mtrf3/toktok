package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* renamed from: X.FAa, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38524FAa implements InterfaceC38526FAc {
    @Override // X.InterfaceC38526FAc
    public final void LIZ(List<FAY> list) {
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            FAY fay = (FAY) it.next();
            try {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                for (C38528FAe c38528FAe : fay.LIZIZ) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("cputime_");
                    c38528FAe.getClass();
                    LIZ.append((String) null);
                    jSONObject2.put(X1D.LIZIZ(LIZ), 0L);
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("runnablenum_");
                    LIZ2.append((String) null);
                    jSONObject2.put(X1D.LIZIZ(LIZ2), 0);
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("bigrunnablenum_");
                    LIZ3.append((String) null);
                    jSONObject2.put(X1D.LIZIZ(LIZ3), 0);
                    jSONObject2.put("is_new_user", C36152EGu.LJ);
                }
                jSONObject.put("metric", jSONObject2);
                C09900aA.LJFF(fay.LIZ, null, jSONObject);
            } catch (Throwable unused) {
            }
        }
    }
}
