package X;

import java.util.Collections;
import java.util.HashSet;

/* renamed from: X.0BQ, reason: invalid class name */
/* loaded from: classes.dex */
public class C0BQ {
    public final int[] LIZ;
    public final String[] LIZIZ;
    public final C0BP LIZJ;
    public final java.util.Set<String> LIZLLL;

    public C0BQ(C0BP c0bp, int[] iArr, String[] strArr) {
        this.LIZJ = c0bp;
        this.LIZ = iArr;
        this.LIZIZ = strArr;
        if (iArr.length == 1) {
            HashSet hashSet = new HashSet();
            hashSet.add(strArr[0]);
            this.LIZLLL = Collections.unmodifiableSet(hashSet);
            return;
        }
        this.LIZLLL = null;
    }
}
