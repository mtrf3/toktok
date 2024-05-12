package X;

import java.io.PrintStream;
import java.util.logging.Level;

/* loaded from: classes12.dex */
public class P9E implements P9G {
    @Override // X.P9G
    public final void LIZIZ(Level level, String str) {
        PrintStream printStream = System.out;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[");
        LIZ.append(level);
        LIZ.append("] ");
        LIZ.append(str);
        printStream.println(X1D.LIZIZ(LIZ));
    }

    @Override // X.P9G
    public final void LIZ(Level level, String str, Throwable th) {
        PrintStream printStream = System.out;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[");
        LIZ.append(level);
        LIZ.append("] ");
        LIZ.append(str);
        printStream.println(X1D.LIZIZ(LIZ));
        th.printStackTrace(System.out);
    }
}
