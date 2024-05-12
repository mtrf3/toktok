package X;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.o;

/* renamed from: X.Muf, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58317Muf {
    public C58317Muf LIZ;
    public final boolean LIZIZ;
    public final java.util.Map<String, C58317Muf> LIZJ;
    public final java.util.Set<UXM> LIZLLL;

    public C58317Muf() {
        this(false, null, 31);
    }

    public final C58317Muf LIZ(String character, boolean z) {
        o.LJIIIZ(character, "character");
        C58317Muf c58317Muf = this.LIZJ.get(character);
        if (c58317Muf == null && this.LIZIZ && !z) {
            return this;
        }
        return c58317Muf;
    }

    public C58317Muf(boolean z, String associatedChar, int i) {
        LinkedHashMap paths;
        LinkedHashSet keywordInfoList;
        z = (i & 2) != 0 ? false : z;
        if ((i & 4) != 0) {
            paths = new LinkedHashMap();
        } else {
            paths = null;
        }
        associatedChar = (i & 8) != 0 ? "" : associatedChar;
        if ((i & 16) != 0) {
            keywordInfoList = new LinkedHashSet();
        } else {
            keywordInfoList = null;
        }
        o.LJIIIZ(paths, "paths");
        o.LJIIIZ(associatedChar, "associatedChar");
        o.LJIIIZ(keywordInfoList, "keywordInfoList");
        this.LIZ = null;
        this.LIZIZ = z;
        this.LIZJ = paths;
        this.LIZLLL = keywordInfoList;
    }
}
