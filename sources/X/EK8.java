package X;

import android.os.Handler;
import android.os.Message;
import java.io.PrintStream;

/* loaded from: classes7.dex */
public final class EK8 implements Handler.Callback {
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        PrintStream printStream = System.err;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("handleMessage=");
        LIZ.append(message);
        printStream.println(X1D.LIZIZ(LIZ));
        return false;
    }
}
