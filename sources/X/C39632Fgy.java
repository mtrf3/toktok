package X;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.StrictMode;
import java.io.File;

/* renamed from: X.Fgy, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39632Fgy extends AbstractC39635Fh1 {
    public Context LIZ;
    public int LIZIZ;
    public C39631Fgx LIZJ;

    public final boolean LIZJ() {
        File file = this.LIZJ.LIZ;
        try {
            Context context = this.LIZ;
            Context createPackageContext = context.createPackageContext(context.getPackageName(), 0);
            File file2 = new File(createPackageContext.getApplicationInfo().nativeLibraryDir);
            if (file.equals(file2)) {
                return false;
            }
            int i = this.LIZIZ | 1;
            this.LIZIZ = i;
            this.LIZJ = new C39631Fgx(file2, i);
            this.LIZ = createPackageContext;
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // X.AbstractC39635Fh1
    public final String toString() {
        return this.LIZJ.toString();
    }

    @Override // X.AbstractC39635Fh1
    public final void LIZIZ(int i) {
        this.LIZJ.getClass();
    }

    public C39632Fgy(Context context, int i) {
        Context LLLLL = C16880lQ.LLLLL(context);
        this.LIZ = LLLLL;
        if (LLLLL == null) {
            this.LIZ = context;
        }
        this.LIZIZ = i;
        this.LIZJ = new C39631Fgx(new File(this.LIZ.getApplicationInfo().nativeLibraryDir), i);
    }

    @Override // X.AbstractC39635Fh1
    public final int LIZ(String str, int i, StrictMode.ThreadPolicy threadPolicy) {
        return this.LIZJ.LIZJ(str, i, threadPolicy);
    }
}
