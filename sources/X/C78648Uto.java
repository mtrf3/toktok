package X;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Uto, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78648Uto {
    public final String LIZ;
    public int LIZIZ;
    public long LIZJ;
    public final java.util.Map<String, Long> LIZLLL;
    public final java.util.Map<String, Integer> LJ;
    public final boolean LJFF;

    public C78648Uto(String targetUid, boolean z, int i) {
        long j;
        LinkedHashMap lastEnterTsLookup;
        targetUid = (i & 1) != 0 ? "" : targetUid;
        if ((i & 4) != 0) {
            j = -1;
        } else {
            j = 0;
        }
        if ((i & 8) != 0) {
            lastEnterTsLookup = new LinkedHashMap();
        } else {
            lastEnterTsLookup = null;
        }
        LinkedHashMap sceneEnterCounter = (i & 16) != 0 ? new LinkedHashMap() : null;
        z = (i & 32) != 0 ? false : z;
        o.LJIIIZ(targetUid, "targetUid");
        o.LJIIIZ(lastEnterTsLookup, "lastEnterTsLookup");
        o.LJIIIZ(sceneEnterCounter, "sceneEnterCounter");
        this.LIZ = targetUid;
        this.LIZIZ = 0;
        this.LIZJ = j;
        this.LIZLLL = lastEnterTsLookup;
        this.LJ = sceneEnterCounter;
        this.LJFF = z;
    }
}
