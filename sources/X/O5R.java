package X;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class O5R {
    public static final java.util.Map<String, O5S> LIZ = new LinkedHashMap();

    public static O5S LIZ(String str) {
        O5S o5s;
        java.util.Map<String, O5S> map = LIZ;
        synchronized (map) {
            o5s = (O5S) ((LinkedHashMap) map).get(str);
            if (o5s == null) {
                o5s = new O5S();
                map.put(str, o5s);
            }
        }
        return o5s;
    }

    public static boolean LIZIZ(String channelPath) {
        boolean z;
        o.LJIIJ(channelPath, "channelPath");
        O5S LIZ2 = LIZ(channelPath);
        int i = 0;
        while (true) {
            if (i < 50) {
                LIZ2.LIZJ.lock();
                if (LIZ2.LIZIZ) {
                    LIZ2.LIZJ.unlock();
                    i += 10;
                    Thread.sleep(10L);
                } else {
                    LIZ2.LIZ++;
                    LIZ2.LIZJ.unlock();
                    z = false;
                    break;
                }
            } else {
                z = true;
                break;
            }
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("read lock,timeout:");
        LIZ3.append(z);
        LIZ3.append(",channel:");
        LIZ3.append(channelPath);
        LIZ3.append(",thread:");
        LIZ3.append(C16880lQ.LLLLIIIILLL());
        OC6.LIZ("gecko-debug-tag", X1D.LIZIZ(LIZ3));
        return z;
    }

    public static boolean LIZJ(String channelPath) {
        boolean z;
        o.LJIIJ(channelPath, "channelPath");
        O5S LIZ2 = LIZ(channelPath);
        try {
            LIZ2.LIZJ.lock();
            if (!LIZ2.LIZIZ) {
                LIZ2.LIZ++;
                LIZ2.LIZJ.unlock();
                z = true;
            } else {
                LIZ2.LIZJ.unlock();
                z = false;
            }
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("read try lock,result:");
            LIZ3.append(z);
            LIZ3.append(",channel:");
            LIZ3.append(channelPath);
            LIZ3.append(",thread:");
            LIZ3.append(C16880lQ.LLLLIIIILLL());
            OC6.LIZ("gecko-debug-tag", X1D.LIZIZ(LIZ3));
            return z;
        } catch (Throwable th) {
            LIZ2.LIZJ.unlock();
            throw th;
        }
    }

    public static void LIZLLL(String channelPath) {
        o.LJIIJ(channelPath, "channelPath");
        O5S LIZ2 = LIZ(channelPath);
        try {
            LIZ2.LIZJ.lock();
            if (LIZ2.LIZ != 0) {
                LIZ2.LIZ--;
            }
            LIZ2.LIZJ.unlock();
            StringBuilder LIZIZ = C25620zW.LIZIZ("read unlock,channel:", channelPath, ",thread:");
            LIZIZ.append(C16880lQ.LLLLIIIILLL());
            OC6.LIZ("gecko-debug-tag", X1D.LIZIZ(LIZIZ));
        } catch (Throwable th) {
            LIZ2.LIZJ.unlock();
            throw th;
        }
    }

    public static boolean LJ(String channelPath) {
        boolean z;
        o.LJIIJ(channelPath, "channelPath");
        O5S LIZ2 = LIZ(channelPath);
        try {
            LIZ2.LIZJ.lock();
            if (LIZ2.LIZ <= 0 && !LIZ2.LIZIZ) {
                LIZ2.LIZIZ = true;
                LIZ2.LIZJ.unlock();
                z = true;
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("write try lock,result:");
                LIZ3.append(z);
                LIZ3.append(",channel:");
                LIZ3.append(channelPath);
                LIZ3.append(",thread:");
                LIZ3.append(C16880lQ.LLLLIIIILLL());
                OC6.LIZ("gecko-debug-tag", X1D.LIZIZ(LIZ3));
                return z;
            }
            LIZ2.LIZJ.unlock();
            z = false;
            StringBuilder LIZ32 = X1D.LIZ();
            LIZ32.append("write try lock,result:");
            LIZ32.append(z);
            LIZ32.append(",channel:");
            LIZ32.append(channelPath);
            LIZ32.append(",thread:");
            LIZ32.append(C16880lQ.LLLLIIIILLL());
            OC6.LIZ("gecko-debug-tag", X1D.LIZIZ(LIZ32));
            return z;
        } catch (Throwable th) {
            LIZ2.LIZJ.unlock();
            throw th;
        }
    }

    public static void LJFF(String channelPath) {
        o.LJIIJ(channelPath, "channelPath");
        O5S LIZ2 = LIZ(channelPath);
        try {
            LIZ2.LIZJ.lock();
            LIZ2.LIZIZ = false;
            LIZ2.LIZJ.unlock();
            StringBuilder LIZIZ = C25620zW.LIZIZ("write unlock,channel:", channelPath, ",thread:");
            LIZIZ.append(C16880lQ.LLLLIIIILLL());
            OC6.LIZ("gecko-debug-tag", X1D.LIZIZ(LIZIZ));
        } catch (Throwable th) {
            LIZ2.LIZJ.unlock();
            throw th;
        }
    }
}
