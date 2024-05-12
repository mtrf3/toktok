package X;

import android.text.TextUtils;
import defpackage.b1;
import java.io.File;

/* renamed from: X.6e9, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C165256e9 {
    public final boolean LIZ;
    public final String LIZIZ;
    public final long LIZJ;

    public final String toString() {
        StringBuilder LIZJ = b1.LIZJ("file", ": ");
        LIZJ.append(this.LIZIZ);
        LIZJ.append("  exists?");
        LIZJ.append(this.LIZ);
        LIZJ.append(" size: ");
        LIZJ.append(this.LIZJ);
        return X1D.LIZIZ(LIZJ);
    }

    public C165256e9(String str) {
        this.LIZIZ = str;
        if (!TextUtils.isEmpty(str)) {
            File file = new File(str);
            if (file.exists() && file.isFile()) {
                this.LIZ = true;
                this.LIZJ = file.length();
                return;
            }
        }
        this.LIZ = false;
        this.LIZJ = 0L;
    }
}
