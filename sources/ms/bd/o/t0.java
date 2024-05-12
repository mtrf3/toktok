package ms.bd.o;

import java.util.List;
import ms.bd.o.b;
import org.json.JSONArray;

/* loaded from: classes7.dex */
public final class t0 extends b.a {
    @Override // ms.bd.o.b.a
    public final Object LIZIZ(long j, int i, String str, Object obj) {
        e2 LIZ = e2.LIZ(a.LIZIZ.LIZ);
        synchronized (LIZ) {
            StringBuilder sb = new StringBuilder();
            int size = LIZ.LJLJJL.size();
            if (size > 0) {
                try {
                    List<JSONArray> list = LIZ.LJLJJL;
                    int i2 = size - 50;
                    if (i2 <= 0) {
                        i2 = 0;
                    }
                    List<JSONArray> subList = list.subList(i2, size);
                    if (subList.size() > 0) {
                        for (JSONArray jSONArray : subList) {
                            if (jSONArray != null) {
                                sb.append(jSONArray.get(0).toString());
                                sb.append((String) k.a(16777217, 0, 0L, "8f1c2d", new byte[]{101}));
                                sb.append(jSONArray.get(1).toString());
                                sb.append((String) k.a(16777217, 0, 0L, "3113ec", new byte[]{110}));
                                sb.append(jSONArray.get(2).toString());
                                sb.append((String) k.a(16777217, 0, 0L, "149046", new byte[]{60}));
                            }
                        }
                    }
                    if (sb.length() > 0) {
                        sb.delete(sb.length() - 1, sb.length());
                    }
                } catch (Throwable unused) {
                }
                return sb.toString();
            }
            return null;
        }
    }
}
