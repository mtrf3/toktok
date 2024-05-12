package X;

import android.text.TextUtils;
import java.io.File;

/* renamed from: X.WyS, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C84032WyS extends AbstractC84033WyT {
    @Override // X.AbstractC84033WyT
    public final String LIZJ() {
        if (TextUtils.isEmpty(this.LIZIZ)) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(this.LIZ);
            this.LIZIZ = JBR.LJFF(LIZ, File.separator, "segments", LIZ);
        }
        return this.LIZIZ;
    }

    public C84032WyS(String str) {
        super(str);
    }
}
