package X;

import java.util.HashMap;

/* renamed from: X.Ihe, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47318Ihe implements InterfaceC47319Ihf {
    public final java.util.Map<EnumC47317Ihd, InterfaceC47342Ii2> LIZ = new HashMap();

    public final InterfaceC47342Ii2 LIZ(EnumC47317Ihd enumC47317Ihd, C47421IjJ c47421IjJ) {
        if (((HashMap) this.LIZ).containsKey(enumC47317Ihd)) {
            return (InterfaceC47342Ii2) ((HashMap) this.LIZ).get(enumC47317Ihd);
        }
        InterfaceC47342Ii2 interfaceC47342Ii2 = (InterfaceC47342Ii2) ESN.LIZ(enumC47317Ihd.LJLIL);
        ((HashMap) this.LIZ).put(enumC47317Ihd, interfaceC47342Ii2);
        return interfaceC47342Ii2;
    }
}
