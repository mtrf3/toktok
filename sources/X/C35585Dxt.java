package X;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Dxt, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35585Dxt extends F9E {
    public final java.util.Map<String, java.util.Set<String>> LJLIL;
    public final int LJLILLLLZI;
    public final boolean LJLJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, Integer.valueOf(this.LJLILLLLZI), Boolean.valueOf(this.LJLJI)};
    }

    public /* synthetic */ C35585Dxt() {
        this(new LinkedHashMap(), -1, false);
    }

    public C35585Dxt(java.util.Map<String, java.util.Set<String>> collectionAuthorIdToGidsMap, int i, boolean z) {
        o.LJIIIZ(collectionAuthorIdToGidsMap, "collectionAuthorIdToGidsMap");
        this.LJLIL = collectionAuthorIdToGidsMap;
        this.LJLILLLLZI = i;
        this.LJLJI = z;
    }

    public static C35585Dxt L(C35585Dxt c35585Dxt, int i, boolean z, int i2) {
        java.util.Map<String, java.util.Set<String>> collectionAuthorIdToGidsMap;
        if ((i2 & 1) != 0) {
            collectionAuthorIdToGidsMap = c35585Dxt.LJLIL;
        } else {
            collectionAuthorIdToGidsMap = null;
        }
        if ((i2 & 2) != 0) {
            i = c35585Dxt.LJLILLLLZI;
        }
        if ((i2 & 4) != 0) {
            z = c35585Dxt.LJLJI;
        }
        c35585Dxt.getClass();
        o.LJIIIZ(collectionAuthorIdToGidsMap, "collectionAuthorIdToGidsMap");
        return new C35585Dxt(collectionAuthorIdToGidsMap, i, z);
    }
}
