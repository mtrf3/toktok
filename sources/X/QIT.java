package X;

import android.content.Context;
import java.io.Closeable;
import java.util.Collections;
import java.util.List;

/* loaded from: classes12.dex */
public final class QIT {
    public static final List<String> LIZJ = Collections.singletonList("Store");
    public static final String LIZLLL = System.getProperty("line.separator", "\n");
    public final String LIZ;
    public final InterfaceC66740QHg LIZIZ;

    public final void LIZ(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable th) {
                this.LIZIZ.LJIIJ(8, LIZJ, "[close] error ", th, new Object[0]);
            }
        }
    }

    public QIT(Context context, String str, InterfaceC66740QHg interfaceC66740QHg) {
        this.LIZIZ = interfaceC66740QHg;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(C16880lQ.LLIIJLIL(context));
        LIZ.append("/");
        LIZ.append(str);
        LIZ.append("monitor_file");
        this.LIZ = X1D.LIZIZ(LIZ);
    }
}
