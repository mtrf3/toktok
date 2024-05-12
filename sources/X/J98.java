package X;

import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.reflect.Reflect;
import java.io.IOException;
import java.net.InetSocketAddress;
import okhttp3.Request;

/* loaded from: classes9.dex */
public final class J98 implements InterfaceC48121Iub {
    @Override // X.InterfaceC48121Iub
    public final C64598PWw intercept(PXZ pxz) {
        C64562PVm c64562PVm;
        Request request = ((PW8) pxz).LJFF;
        InetSocketAddress inetSocketAddress = null;
        try {
            C64561PVl c64561PVl = ((PW8) pxz).LIZLLL;
            if (c64561PVl != null && (c64562PVm = c64561PVl.LIZJ) != null) {
                inetSocketAddress = c64562PVm.LIZJ;
            }
            Logger.debug();
        } catch (Throwable unused) {
        }
        try {
            C64598PWw LIZ = ((PW8) pxz).LIZ(request);
            if (inetSocketAddress != null) {
                try {
                    LIZ.getClass();
                    C64597PWv c64597PWv = new C64597PWv(LIZ);
                    c64597PWv.LJFF.LIZ("x-net-info.remoteaddr", inetSocketAddress.getAddress().getHostAddress());
                    return c64597PWv.LIZ();
                } catch (Throwable unused2) {
                    return LIZ;
                }
            }
            return LIZ;
        } catch (IOException e) {
            if (inetSocketAddress != null) {
                try {
                    String message = e.getMessage();
                    StringBuilder sb = new StringBuilder();
                    sb.append(inetSocketAddress.getAddress().getHostAddress());
                    sb.append("|");
                    if (message == null) {
                        message = "null";
                    }
                    sb.append(message);
                    Reflect.on(e).set("detailMessage", sb.toString());
                } catch (Throwable unused3) {
                }
            }
            throw e;
        }
    }
}
