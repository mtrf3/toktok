package com.byted.cast.sink.b;

import X.X1D;
import android.content.Context;
import com.byted.cast.common.CastLogger;
import com.byted.cast.common.ContextManager;
import com.byted.cast.common.PreferenceUtils;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import java.io.IOException;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.util.Random;

/* loaded from: classes29.dex */
public class a {
    public static final Random a = new Random(System.currentTimeMillis());
    public static int b = -1;

    public static int a(int i, int i2) {
        return a.nextInt(i2 - i) + i;
    }

    public static int a(Context context, CastLogger castLogger) {
        try {
            int i = b;
            if (i == -1) {
                i = CastIntegerProtector.parseInt(PreferenceUtils.getValue(context, "bytelink_avail_port", "-1"));
            }
            if (a(i)) {
                b = i;
            } else {
                b = -1;
            }
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("getDiskAvailablePort:");
            LIZ.append(e);
            castLogger.w("SocketUtils", X1D.LIZIZ(LIZ));
            b = -1;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("getDiskAvailablePort:");
        LIZ2.append(b);
        castLogger.i("SocketUtils", X1D.LIZIZ(LIZ2));
        return b;
    }

    public static int a(ContextManager.CastContext castContext, Context context) {
        return a(castContext, context, 49152, 65535);
    }

    public static int a(ContextManager.CastContext castContext, Context context, int i, int i2) {
        int a2;
        CastLogger logger = ContextManager.getLogger(castContext);
        if (i < 49152 || i2 < i || i2 > 65535) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("findAvailablePort, wrong socket range, min:");
            LIZ.append(i);
            LIZ.append(", max:");
            LIZ.append(i2);
            logger.w("SocketUtils", X1D.LIZIZ(LIZ));
            return -1;
        }
        int a3 = a(context, logger);
        if (a3 > 0) {
            return a3;
        }
        do {
            a2 = a(i, i2);
        } while (!a(a2));
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("findAvailablePort:");
        LIZ2.append(a2);
        logger.i("SocketUtils", X1D.LIZIZ(LIZ2));
        a(context, a2);
        return a2;
    }

    public static void a(Context context, int i) {
        b = i;
        PreferenceUtils.setValue(context, "bytelink_avail_port", Integer.toString(i));
    }

    public static boolean a(int i) {
        return a(i, (InetAddress) null);
    }

    public static boolean a(int i, InetAddress inetAddress) {
        if (i < 49152 || i > 65535) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Invalid start minPort: ");
            LIZ.append(i);
            throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
        }
        DatagramSocket datagramSocket = null;
        try {
            try {
                ServerSocket serverSocket = inetAddress != null ? new ServerSocket(i, 50, inetAddress) : new ServerSocket(i);
                try {
                    serverSocket.setReuseAddress(true);
                    datagramSocket = inetAddress != null ? new DatagramSocket(i, inetAddress) : new DatagramSocket(i);
                    datagramSocket.setReuseAddress(true);
                    datagramSocket.close();
                    try {
                        serverSocket.close();
                    } catch (IOException unused) {
                    }
                    return true;
                } catch (IOException unused2) {
                    if (datagramSocket != null) {
                        datagramSocket.close();
                    }
                    if (serverSocket == null) {
                        return false;
                    }
                    serverSocket.close();
                    return false;
                } catch (Throwable th) {
                    if (datagramSocket != null) {
                        datagramSocket.close();
                    }
                    if (serverSocket == null) {
                        throw th;
                    }
                    try {
                        serverSocket.close();
                        throw th;
                    } catch (IOException unused3) {
                        throw th;
                    }
                }
            } catch (IOException unused4) {
                return false;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
