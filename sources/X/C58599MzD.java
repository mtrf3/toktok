package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.MzD, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58599MzD extends AbstractC65781Prl implements InterfaceC65784Pro<java.util.Map<String, InterfaceC88472Yns<? super M95, ? extends Object>>> {
    public final /* synthetic */ C58620MzY LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C58599MzD(C58620MzY c58620MzY) {
        super(0);
        this.LJLIL = c58620MzY;
    }

    @Override // X.InterfaceC65784Pro
    public final java.util.Map<String, InterfaceC88472Yns<? super M95, ? extends Object>> invoke() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C58601MzF<?>[] LJIILL = this.LJLIL.LJIILL();
        int LJJIIZ = C51029K0z.LJJIIZ(LJIILL.length);
        if (LJJIIZ < 16) {
            LJJIIZ = 16;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(LJJIIZ);
        for (C58601MzF<?> c58601MzF : LJIILL) {
            linkedHashMap2.put(c58601MzF.LIZ.getName(), c58601MzF);
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(C51029K0z.LJJIIZ(linkedHashMap2.size()));
        for (Map.Entry entry : linkedHashMap2.entrySet()) {
            linkedHashMap3.put(entry.getKey(), ((C58601MzF) entry.getValue()).LIZIZ);
        }
        linkedHashMap.putAll(linkedHashMap3);
        return linkedHashMap;
    }
}
