package X;

import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.util.concurrent.Callable;

/* renamed from: X.Itq, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class CallableC48074Itq implements Callable<Boolean> {
    public final int LJLIL;

    @Override // java.util.concurrent.Callable
    public final Boolean call() {
        Socket socket;
        try {
            socket = new Socket("127.0.0.1", this.LJLIL);
            try {
                socket.setSoTimeout(LiveNetAdaptiveHurryTimeSetting.DEFAULT);
                OutputStream outputStream = socket.getOutputStream();
                outputStream.write("Ping\n".getBytes(C48100IuG.LIZIZ));
                outputStream.flush();
                if ("OK".equals(new BufferedReader(new InputStreamReader(socket.getInputStream())).readLine())) {
                    Boolean bool = Boolean.TRUE;
                    C48100IuG.LIZIZ(socket);
                    return bool;
                }
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            socket = null;
        }
        C48100IuG.LIZIZ(socket);
        return Boolean.FALSE;
    }

    public CallableC48074Itq(int i) {
        this.LJLIL = i;
    }
}
