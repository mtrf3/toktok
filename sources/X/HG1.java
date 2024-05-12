package X;

import android.app.Application;
import android.content.Context;
import java.io.File;

/* loaded from: classes8.dex */
public class HG1 {
    public final Context LIZ;
    public String LIZIZ;

    public String LIZJ() {
        return C16880lQ.LLIIJLIL(this.LIZ).getAbsolutePath();
    }

    public final String LIZ() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LIZIZ);
        LIZ.append(File.separator);
        LIZ.append("extract-frame-");
        LIZ.append(System.currentTimeMillis());
        LIZ.append("_hq.jpg");
        return X1D.LIZIZ(LIZ);
    }

    public final String LIZIZ() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LIZIZ);
        LIZ.append(File.separator);
        LIZ.append("extract-frame-");
        LIZ.append(System.currentTimeMillis());
        LIZ.append(".jpg");
        return X1D.LIZIZ(LIZ);
    }

    public HG1(Application application) {
        Context LLLLL = C16880lQ.LLLLL(C16880lQ.LLLLJI(application));
        this.LIZ = LLLLL;
        this.LIZIZ = C16880lQ.LLIIJLIL(LLLLL).getAbsolutePath();
    }

    public final void LIZLLL(String str, String str2) {
        String LIZJ = LIZJ();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(LIZJ);
        String str3 = File.separator;
        YE1.LIZLLL(LIZ, str3, str, str3, str2);
        this.LIZIZ = X1D.LIZIZ(LIZ);
        File file = new File(this.LIZIZ);
        if (!file.exists()) {
            file.mkdirs();
        }
    }
}
