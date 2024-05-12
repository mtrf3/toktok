package X;

import java.util.LinkedHashMap;

/* renamed from: X.aXG, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C93834aXG<S, T> {
    public final java.util.Map<S, java.util.Map<T, S>> LIZ = new LinkedHashMap();

    public final void LIZ(Object obj, Object obj2, Object obj3) {
        java.util.Map map = (java.util.Map) ((LinkedHashMap) this.LIZ).get(obj2);
        if (map != null) {
            map.put(obj, obj3);
            if (C76800UCe.LIZ != null) {
                return;
            }
        }
        this.LIZ.put(obj2, C113554cx.LJJLIIIIJ(new OSZ(obj, obj3)));
    }
}
