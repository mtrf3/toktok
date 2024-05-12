package X;

import android.content.Context;
import com.bytedance.ies.safemode.SmartProtected.state.ExceptionManager;
import java.io.File;

/* renamed from: X.Q6o, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66462Q6o {
    public static volatile C66462Q6o LIZIZ;
    public final File LIZ;

    public C66462Q6o(Context context) {
        this.LIZ = new File(new File(C16880lQ.LLIIJLIL(context).getAbsolutePath(), "BootProtectedData"), "bootP.json");
    }

    public static C66462Q6o LIZ(Context context) {
        if (LIZIZ == null) {
            synchronized (ExceptionManager.class) {
                if (LIZIZ == null) {
                    LIZIZ = new C66462Q6o(context);
                }
            }
        }
        return LIZIZ;
    }
}
