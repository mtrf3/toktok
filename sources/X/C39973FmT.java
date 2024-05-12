package X;

import kotlin.jvm.internal.o;

/* renamed from: X.FmT, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39973FmT {
    public static void LIZJ(InterfaceC39974FmU interfaceC39974FmU, Throwable e, String extraMsg) {
        Object obj;
        o.LJIIJ(e, "e");
        o.LJIIJ(extraMsg, "extraMsg");
        try {
            InterfaceC39975FmV interfaceC39975FmV = interfaceC39974FmU.getLoggerWrapper().LIZ;
            if (interfaceC39975FmV == null) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("onReject: ");
                LIZ.append(e.getMessage());
                obj = Integer.valueOf(android.util.Log.e("bullet", X1D.LIZIZ(LIZ)));
            } else {
                interfaceC39975FmV.LJJIFFI(extraMsg, e);
                obj = C76800UCe.LIZ;
            }
            C3C5.m7constructorimpl(obj);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
    }

    public static void LIZ(InterfaceC39974FmU interfaceC39974FmU, String msg, EnumC39958FmE logLevel, String subModule) {
        boolean z;
        Object obj;
        int d;
        o.LJIIJ(msg, "msg");
        o.LJIIJ(logLevel, "logLevel");
        o.LJIIJ(subModule, "subModule");
        try {
            InterfaceC39975FmV interfaceC39975FmV = interfaceC39974FmU.getLoggerWrapper().LIZ;
            String str = interfaceC39974FmU.getLoggerWrapper().LIZIZ;
            if (subModule.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append('[');
                LIZ.append(subModule);
                LIZ.append("] ");
                LIZ.append(msg);
                msg = X1D.LIZIZ(LIZ);
            } else if (str.length() > 0) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append('[');
                LIZ2.append(str);
                LIZ2.append("] ");
                LIZ2.append(msg);
                msg = X1D.LIZIZ(LIZ2);
            }
            if (interfaceC39975FmV == null) {
                int i = C39965FmL.LIZ[logLevel.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            StringBuilder LIZ3 = X1D.LIZ();
                            LIZ3.append("onLog: ");
                            LIZ3.append(msg);
                            d = android.util.Log.w("bullet", X1D.LIZIZ(LIZ3));
                        } else {
                            StringBuilder LIZ4 = X1D.LIZ();
                            LIZ4.append("onLog: ");
                            LIZ4.append(msg);
                            d = android.util.Log.i("bullet", X1D.LIZIZ(LIZ4));
                        }
                    } else {
                        StringBuilder LIZ5 = X1D.LIZ();
                        LIZ5.append("onLog: ");
                        LIZ5.append(msg);
                        d = android.util.Log.e("bullet", X1D.LIZIZ(LIZ5));
                    }
                } else {
                    StringBuilder LIZ6 = X1D.LIZ();
                    LIZ6.append("onLog: ");
                    LIZ6.append(msg);
                    d = android.util.Log.d("bullet", X1D.LIZIZ(LIZ6));
                }
                obj = Integer.valueOf(d);
            } else {
                interfaceC39975FmV.LJIILJJIL(msg, logLevel);
                obj = C76800UCe.LIZ;
            }
            C3C5.m7constructorimpl(obj);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
    }

    public static /* synthetic */ void LIZIZ(InterfaceC39974FmU interfaceC39974FmU, String str, EnumC39958FmE enumC39958FmE, String str2, int i) {
        if ((i & 2) != 0) {
            enumC39958FmE = EnumC39958FmE.I;
        }
        if ((i & 4) != 0) {
            str2 = "";
        }
        interfaceC39974FmU.printLog(str, enumC39958FmE, str2);
    }
}
