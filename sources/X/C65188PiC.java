package X;

import android.content.Context;
import java.io.File;
import java.util.List;

/* renamed from: X.PiC, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65188PiC implements InterfaceC65195PiJ {
    public final Context LIZ;
    public final File LIZIZ;
    public C65182Pi6 LIZJ;
    public File LIZLLL;

    public final void LIZ(List<File> list) {
        for (File file : list) {
            Context context = this.LIZ;
            C16880lQ.LLLZ("deleting sent analytics file %s", new Object[]{file.getName()});
            C78841Uwv.LJJ(context);
            C16880lQ.LLLZZIL(file);
        }
    }

    public C65188PiC(Context context, String str, File file, String str2) {
        this.LIZ = context;
        File file2 = new File(file, str);
        this.LIZIZ = file2;
        this.LIZJ = new C65182Pi6(file2);
        File file3 = new File(file, str2);
        this.LIZLLL = file3;
        if (!file3.exists()) {
            this.LIZLLL.mkdirs();
        }
    }
}
