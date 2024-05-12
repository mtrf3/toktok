package X;

import android.text.TextUtils;
import defpackage.i0;
import java.io.File;
import java.io.IOException;

/* renamed from: X.Ixu, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C48326Ixu {
    public final Object LIZ;

    public /* synthetic */ C48326Ixu(C68033Qmz c68033Qmz) {
        this.LIZ = c68033Qmz;
    }

    public final boolean LIZ() {
        if (TextUtils.isEmpty(((C68033Qmz) this.LIZ).LIZIZ) && android.util.Log.isLoggable(((C68033Qmz) this.LIZ).LIZJ().LJIIL(), 3)) {
            return true;
        }
        return false;
    }

    public C48326Ixu(File file) {
        if (file.exists() && file.isDirectory() && file.canRead() && file.canWrite()) {
            this.LIZ = file;
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("exists: ");
        LIZ.append(file.exists());
        LIZ.append(", isDirectory: ");
        LIZ.append(file.isDirectory());
        LIZ.append(", canRead: ");
        LIZ.append(file.canRead());
        LIZ.append(", canWrite: ");
        LIZ.append(file.canWrite());
        throw new IOException(i0.LJFF("dir error! ", X1D.LIZIZ(LIZ)));
    }
}
