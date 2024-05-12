package X;

import java.util.TreeMap;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class H5I {
    public final long LIZ;
    public final long LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;

    public H5I() {
        this(0);
    }

    public final TreeMap<String, Object> LIZ() {
        TreeMap<String, Object> treeMap = new TreeMap<>();
        treeMap.put("durationMs", Integer.valueOf((int) this.LIZ));
        treeMap.put("bitrateKb", Integer.valueOf((int) this.LIZIZ));
        treeMap.put("isHwEncode", Boolean.valueOf(this.LIZJ));
        treeMap.put("isReEncode", Boolean.valueOf(this.LIZLLL));
        return treeMap;
    }

    public final String toString() {
        String abstractMap = LIZ().toString();
        o.LJIIIIZZ(abstractMap, "toMap().toString()");
        return abstractMap;
    }

    public /* synthetic */ H5I(int i) {
        this(-1L, -1L, false, false);
    }

    public H5I(long j, long j2, boolean z, boolean z2) {
        this.LIZ = j;
        this.LIZIZ = j2;
        this.LIZJ = z;
        this.LIZLLL = z2;
    }
}
