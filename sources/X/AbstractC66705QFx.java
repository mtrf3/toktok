package X;

import com.bytedance.common.utility.Logger;
import java.util.concurrent.Executor;

/* renamed from: X.QFx, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC66705QFx {
    public C64819PcF LIZIZ;
    public QG3 LIZJ;
    public final Executor LIZ = new ExecutorC64806Pc2();
    public final C38290F1a LIZLLL = new C38290F1a();

    public abstract void LIZ(C66706QFy c66706QFy, QG6 qg6);

    public abstract void LIZIZ();

    public abstract void LIZJ(C66706QFy c66706QFy, QG6 qg6);

    public static String LIZLLL(Throwable th) {
        if (th == null) {
            return "";
        }
        try {
            String[] split = th.getMessage().split("\\|");
            if (split != null && split.length >= 2) {
                Logger.debug();
                return split[0];
            }
        } catch (Throwable unused) {
        }
        return "";
    }
}
