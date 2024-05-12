package X;

import java.util.HashMap;

/* renamed from: X.Ihg, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47320Ihg implements InterfaceC47319Ihf {
    public final HashMap<EnumC47317Ihd, InterfaceC47342Ii2> LIZ = new HashMap<>();

    public final synchronized InterfaceC47342Ii2 LIZ(EnumC47317Ihd enumC47317Ihd, C47421IjJ c47421IjJ) {
        EnumC47317Ihd enumC47317Ihd2;
        if (enumC47317Ihd == null) {
            enumC47317Ihd2 = EnumC47317Ihd.MediaLoader;
        } else {
            enumC47317Ihd2 = enumC47317Ihd;
        }
        HashMap<EnumC47317Ihd, InterfaceC47342Ii2> hashMap = this.LIZ;
        if (hashMap != null) {
            if (hashMap.containsKey(enumC47317Ihd)) {
                return this.LIZ.get(enumC47317Ihd);
            }
            InterfaceC47342Ii2 interfaceC47342Ii2 = (InterfaceC47342Ii2) ESN.LIZ(enumC47317Ihd2.LJLIL);
            if (interfaceC47342Ii2 != null) {
                interfaceC47342Ii2.initAppInfo();
            }
            this.LIZ.put(enumC47317Ihd2, interfaceC47342Ii2);
            return interfaceC47342Ii2;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.Map<K, *>");
    }
}
