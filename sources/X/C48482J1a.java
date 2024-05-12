package X;

import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import kotlin.jvm.internal.o;

/* renamed from: X.J1a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48482J1a {
    public static final C48482J1a LIZ = new C48482J1a();

    /* JADX WARN: Removed duplicated region for block: B:20:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0165  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C48483J1b LIZJ(android.content.Context r8) {
        /*
            Method dump skipped, instructions count: 365
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48482J1a.LIZJ(android.content.Context):X.J1b");
    }

    public static void LIZ(C48483J1b c48483J1b, NetworkCapabilities isVPN) {
        o.LJIIIZ(isVPN, "$this$isVPN");
        if (isVPN.hasTransport(4)) {
            c48483J1b.LJIIJJI = true;
            if (isVPN.hasCapability(12)) {
                c48483J1b.LJIIL = true;
            }
        }
        if (isVPN.hasTransport(1)) {
            c48483J1b.LJ = true;
            if (isVPN.hasCapability(12)) {
                c48483J1b.LJFF = true;
                if (isVPN.hasCapability(16)) {
                    c48483J1b.LJI = true;
                }
                if (isVPN.hasCapability(17)) {
                    c48483J1b.LJII = true;
                }
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("portal is ");
            LIZ2.append(isVPN.hasCapability(17));
            V16.LJJJJJL(X1D.LIZIZ(LIZ2));
        } else if (isVPN.hasTransport(0)) {
            c48483J1b.LJIIIIZZ = true;
            if (isVPN.hasCapability(12)) {
                c48483J1b.LJIIIZ = true;
            }
            if (isVPN.hasCapability(16)) {
                c48483J1b.LJIIJ = true;
            }
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("internet is ");
        LIZ3.append(isVPN.hasCapability(12));
        V16.LJJJJJL(X1D.LIZIZ(LIZ3));
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append("validated is ");
        LIZ4.append(isVPN.hasCapability(16));
        V16.LJJJJJL(X1D.LIZIZ(LIZ4));
    }

    public static void LIZIZ(C48483J1b c48483J1b, NetworkInfo networkInfo) {
        int type = networkInfo.getType();
        if (type != 0) {
            if (type != 1) {
                if (type == 17) {
                    c48483J1b.LJIIJJI = true;
                    if (networkInfo.isConnected()) {
                        c48483J1b.LJIIL = true;
                    }
                }
            } else {
                c48483J1b.LJ = true;
                if (networkInfo.isConnected()) {
                    c48483J1b.LJFF = true;
                    if (networkInfo.isAvailable()) {
                        c48483J1b.LJI = true;
                    }
                }
            }
        } else {
            c48483J1b.LJIIIIZZ = true;
            if (networkInfo.isConnected()) {
                c48483J1b.LJIIIZ = true;
                if (networkInfo.isAvailable()) {
                    c48483J1b.LJIIJ = true;
                }
            }
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("internet is ");
        LIZ2.append(networkInfo.isConnected());
        V16.LJJJJJL(X1D.LIZIZ(LIZ2));
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("validated is ");
        LIZ3.append(networkInfo.isAvailable());
        V16.LJJJJJL(X1D.LIZIZ(LIZ3));
    }
}
