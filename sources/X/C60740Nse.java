package X;

import com.lynx.tasm.base.LLog;
import java.lang.reflect.Constructor;

/* renamed from: X.Nse, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60740Nse {
    public static Class LIZJ;
    public PPQ LIZ;
    public Constructor LIZIZ;

    public C60740Nse() {
        Constructor constructor;
        try {
            if (LIZJ == null) {
                LIZJ = Class.forName("com.lynx.canvas.CanvasManager");
            }
            if (this.LIZIZ == null) {
                Class cls = LIZJ;
                if (cls != null) {
                    constructor = cls.getConstructor(new Class[0]);
                } else {
                    constructor = null;
                }
                this.LIZIZ = constructor;
            }
            Constructor constructor2 = this.LIZIZ;
            Object newInstance = constructor2 != null ? constructor2.newInstance(new Object[0]) : null;
            if (newInstance instanceof PPQ) {
                this.LIZ = (PPQ) newInstance;
            } else {
                LLog.LIZLLL(4, "LynxKryptonHelper", "LynxKrypton init canvasManager error");
            }
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("LynxKrypton init canvasManager error");
            LIZ.append(e.toString());
            LLog.LIZLLL(4, "LynxKryptonHelper", X1D.LIZIZ(LIZ));
        }
    }
}
