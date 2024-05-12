package X;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;

/* renamed from: X.Q9z, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66551Q9z {
    public final C66544Q9s LIZ;
    public String LIZIZ;
    public String LIZJ;
    public String LIZLLL;
    public String LJ;
    public Long LJFF;
    public String LJI;
    public String LJII;
    public java.util.Map<String, String> LJIIIIZZ;

    public final C66545Q9t LIZ() {
        return new C66545Q9t(this.LIZ, this.LIZIZ, this.LIZJ, this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, Collections.unmodifiableMap(this.LJIIIIZZ));
    }

    public C66551Q9z(C66544Q9s c66544Q9s) {
        T2R.LJIILLIIL(c66544Q9s, "authorization request cannot be null");
        this.LIZ = c66544Q9s;
        this.LJIIIIZZ = new LinkedHashMap();
    }

    public final void LIZIZ(String str) {
        if (TextUtils.isEmpty(str)) {
            this.LJII = null;
            return;
        }
        String[] split = str.split(" +");
        if (split == null) {
            this.LJII = null;
        } else {
            this.LJII = C78999UzT.LJIILJJIL(Arrays.asList(split));
        }
    }
}
