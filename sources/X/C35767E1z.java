package X;

import java.io.Serializable;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.E1z, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35767E1z implements Serializable {
    public final java.util.Map<String, String> LJLIL = new LinkedHashMap();

    public final java.util.Map<String, String> getMap() {
        return this.LJLIL;
    }

    public final void setMap(java.util.Map<String, String> mutableMap) {
        o.LJIIIZ(mutableMap, "mutableMap");
        ((LinkedHashMap) this.LJLIL).clear();
        this.LJLIL.putAll(mutableMap);
    }
}
