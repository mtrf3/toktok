package X;

import android.util.LruCache;
import kotlin.jvm.internal.AqS162S0100000_12;

/* renamed from: X.RyL, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71285RyL {
    public final String LIZ;
    public final int LIZIZ;
    public final boolean LIZJ;
    public final int LIZLLL;
    public final boolean LJ;
    public final C62822Ol8 LJFF = C221108m2.LIZIZ(new AqS162S0100000_12(this, 1250));

    public final LruCache<String, C71287RyN> LIZ() {
        return (LruCache) this.LJFF.getValue();
    }

    public final String LIZIZ(String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ecom_cache_");
        return C0MT.LIZ(LIZ, this.LIZ, '_', str, LIZ);
    }

    public C71285RyL(int i, int i2, String str, boolean z, boolean z2) {
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = z;
        this.LIZLLL = i2;
        this.LJ = z2;
    }
}
