package X;

import java.util.HashMap;

/* renamed from: X.BNj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28679BNj implements InterfaceC28682BNm {
    public static volatile C28679BNj LIZIZ;
    public final java.util.Map<String, InterfaceC28681BNl> LIZ;

    public C28679BNj() {
        HashMap hashMap = new HashMap();
        this.LIZ = hashMap;
        hashMap.put("new_style", new BLS());
    }

    public final boolean LIZ(java.util.Map<String, String> map) {
        java.util.Set keySet = ((HashMap) this.LIZ).keySet();
        if (C79004UzY.LJJIFFI(keySet)) {
            return false;
        }
        String remove = map.remove("intercept");
        if (C38354F3m.LJ(remove) || !keySet.contains(remove) || ((HashMap) this.LIZ).get(remove) == null) {
            return false;
        }
        return ((InterfaceC28681BNl) ((HashMap) this.LIZ).get(remove)).LIZ(map);
    }
}
