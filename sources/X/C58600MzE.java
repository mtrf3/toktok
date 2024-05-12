package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.MzE, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58600MzE implements InterfaceC58295MuJ {
    public final java.util.Map<String, InterfaceC88472Yns<M95, Object>> LIZ;

    @Override // X.InterfaceC58295MuJ
    public final java.util.Map<String, InterfaceC88472Yns<M95, Object>> LIZ() {
        return this.LIZ;
    }

    public C58600MzE(C58601MzF<?>... c58601MzFArr) {
        int LJJIIZ = C51029K0z.LJJIIZ(c58601MzFArr.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(LJJIIZ < 16 ? 16 : LJJIIZ);
        for (C58601MzF<?> c58601MzF : c58601MzFArr) {
            linkedHashMap.put(c58601MzF.LIZ.getName(), c58601MzF);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(C51029K0z.LJJIIZ(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry.getKey(), ((C58601MzF) entry.getValue()).LIZIZ);
        }
        this.LIZ = C113554cx.LJJLIL(linkedHashMap2);
    }
}
