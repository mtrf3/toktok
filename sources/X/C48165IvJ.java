package X;

import kotlin.jvm.internal.o;

/* renamed from: X.IvJ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48165IvJ implements IJW {
    @Override // X.IJW
    public final void report(String str, java.util.Map<String, String> map) {
        o.LJIIIZ(map, "map");
        if (!map.containsKey("event_tag")) {
            map.put("event_tag", str);
        }
        FMX.LJIIL("infra_product_arch_lib_track", map);
    }
}
