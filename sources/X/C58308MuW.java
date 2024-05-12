package X;

import java.util.LinkedHashMap;

/* renamed from: X.MuW, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58308MuW {
    public final java.util.Map<String, InterfaceC88472Yns<M95, Object>> LIZ;

    public C58308MuW(InterfaceC58295MuJ... interfaceC58295MuJArr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (InterfaceC58295MuJ interfaceC58295MuJ : interfaceC58295MuJArr) {
            linkedHashMap.putAll(interfaceC58295MuJ.LIZ());
        }
        this.LIZ = linkedHashMap;
    }
}
