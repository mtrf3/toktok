package Y;

import X.C09900aA;
import X.C120854oj;
import X.C34246DcI;
import X.C40700FyC;
import X.C46625IRp;
import X.C52524KjQ;
import X.C53021KrR;
import X.C64432PQm;
import X.C64433PQn;
import X.C64728Pam;
import X.C84763XOl;
import X.EF7;
import X.EnumC64748Pb6;
import X.IS2;
import X.LUX;
import X.PR3;
import X.PR4;
import X.PR5;
import X.PR6;
import X.PR9;
import X.Q58;
import X.QIS;
import X.QL4;
import X.QLG;
import X.QO4;
import X.RunnableC66976QQi;
import X.SC5;
import X.WM7;
import X.X1D;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.Locale;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public class IDHandlerS23S0100000_11 extends Handler {
    public final int $t;
    public Object l0;

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        switch (this.$t) {
            case 0:
                handleMessage$0(this, message);
                return;
            case 1:
                handleMessage$1(this, message);
                return;
            case 2:
                handleMessage$2(this, message);
                return;
            case 3:
                handleMessage$3(this, message);
                return;
            case 4:
                handleMessage$4(this, message);
                return;
            case 5:
                handleMessage$5(this, message);
                return;
            default:
                super.handleMessage(message);
                return;
        }
    }

    public IDHandlerS23S0100000_11(Q58 q58, int i) {
        this.$t = i;
        this.l0 = q58;
    }

    public static final void handleMessage$0(IDHandlerS23S0100000_11 iDHandlerS23S0100000_11, Message message) {
        if (C40700FyC.LIZ(iDHandlerS23S0100000_11)) {
            return;
        }
        try {
            if (C40700FyC.LIZ(iDHandlerS23S0100000_11)) {
                return;
            }
            o.LJIIIZ(message, "message");
            Q58 q58 = (Q58) iDHandlerS23S0100000_11.l0;
            q58.getClass();
            if (message.what == q58.LJLJL) {
                Bundle data = message.getData();
                if (data.getString("com.facebook.platform.status.ERROR_TYPE") != null) {
                    q58.LIZ(null);
                } else {
                    q58.LIZ(data);
                }
                q58.LJLIL.unbindService(q58);
            }
        } catch (Throwable unused) {
        }
    }

    public static final void handleMessage$1(IDHandlerS23S0100000_11 iDHandlerS23S0100000_11, Message message) {
        String str;
        super.handleMessage(message);
        RunnableC66976QQi runnableC66976QQi = (RunnableC66976QQi) iDHandlerS23S0100000_11.l0;
        runnableC66976QQi.getClass();
        boolean z = true;
        if (message.what == 1) {
            try {
                int i = message.arg1;
                if (i == 10 || i != 11) {
                    z = false;
                }
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Send token ");
                if (!z) {
                    str = "fail";
                } else {
                    str = "success";
                }
                LIZ.append(str);
                X1D.LIZIZ(LIZ);
                if (!z) {
                    runnableC66976QQi.LIZ((String) message.obj);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static final void handleMessage$2(IDHandlerS23S0100000_11 iDHandlerS23S0100000_11, Message msg) {
        o.LJIIIZ(msg, "msg");
        switch (msg.what) {
            case 80:
                PR9 pr9 = (PR9) iDHandlerS23S0100000_11.l0;
                pr9.getClass();
                String MANUFACTURER = Build.MANUFACTURER;
                o.LJIIIIZZ(MANUFACTURER, "MANUFACTURER");
                Locale locale = Locale.getDefault();
                o.LJIIIIZZ(locale, "getDefault()");
                String lowerCase = MANUFACTURER.toLowerCase(locale);
                o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                if (C120854oj.LIZ.contains(lowerCase)) {
                    return;
                }
                int intValue = ((Number) C34246DcI.LIZ.getValue()).intValue();
                if (intValue != 0) {
                    if (intValue == 1) {
                        return;
                    }
                    if (intValue != 2 && intValue != 3) {
                        return;
                    }
                } else if (!C09900aA.LIZJ("report_battery_i")) {
                    return;
                }
                pr9.LIZIZ = ((Number) C52524KjQ.LIZ.getValue()).longValue() * 1000;
                IS2 is2 = new IS2();
                if (!((Boolean) C53021KrR.LIZ.getValue()).booleanValue()) {
                    is2.LIZ = true;
                }
                C46625IRp c46625IRp = new C46625IRp(EF7.LIZIZ(), is2);
                c46625IRp.LJ();
                pr9.LJ = c46625IRp;
                PR3.LJ = C84763XOl.LJIIJJI;
                PR3.LIZIZ();
                C84763XOl.LJI().LJJJJZI(new AfS63S0100000_11(c46625IRp, 44));
                C64433PQn.LIZ().LIZIZ(PR5.LIZ);
                C64432PQm.LJFF(PR4.LIZ);
                LUX.LIZIZ().LIZJ(pr9);
                if (!((Boolean) C34246DcI.LIZIZ.getValue()).booleanValue()) {
                    C64433PQn.LIZ().LIZIZ(pr9);
                }
                long j = pr9.LIZLLL;
                if (j <= 0) {
                    return;
                }
                IDHandlerS23S0100000_11 iDHandlerS23S0100000_112 = pr9.LJFF;
                if (iDHandlerS23S0100000_112 != null) {
                    iDHandlerS23S0100000_112.postDelayed(pr9.LJIIIZ, j);
                    return;
                } else {
                    o.LJIJI("powerHandler");
                    throw null;
                }
            case 81:
                PR9 pr92 = (PR9) iDHandlerS23S0100000_11.l0;
                if (pr92.LJI) {
                    return;
                }
                PR6 pr6 = pr92.LJIIJ;
                if (pr6 != null) {
                    pr6.LIZ.removeCallbacks(pr6.LJIIJJI);
                    pr6.LIZ.removeCallbacks(pr6.LJIIL);
                }
                PR9 pr93 = (PR9) iDHandlerS23S0100000_11.l0;
                IDHandlerS23S0100000_11 iDHandlerS23S0100000_113 = pr93.LJFF;
                if (iDHandlerS23S0100000_113 != null) {
                    C46625IRp c46625IRp2 = pr93.LJ;
                    if (c46625IRp2 != null) {
                        long j2 = pr93.LIZIZ;
                        long j3 = pr93.LIZJ;
                        PR6 pr62 = new PR6(iDHandlerS23S0100000_113, c46625IRp2, j2, j3);
                        PR9 pr94 = (PR9) iDHandlerS23S0100000_11.l0;
                        String str = pr94.LJIIIIZZ;
                        String str2 = pr94.LJII;
                        if (SC5.LIZIZ(str, WM7.SCENE_SERVICE, str2, "activity", "background", str)) {
                            pr62.LJFF = false;
                            pr62.LJI = j3;
                        } else {
                            pr62.LJFF = true;
                            pr62.LJI = j2;
                        }
                        pr62.LJII = str;
                        pr62.LJIIIIZZ = str2;
                        pr62.LIZJ = C64433PQn.LIZ().LIZJ;
                        if (((Boolean) C53021KrR.LIZ.getValue()).booleanValue()) {
                            pr62.LJIIIZ.LIZ();
                        } else {
                            c46625IRp2.LIZJ.LJI();
                        }
                        if (pr62.LJFF) {
                            iDHandlerS23S0100000_113.post(pr62.LJIIJJI);
                        }
                        long j4 = pr62.LJI;
                        if (j4 > 0) {
                            iDHandlerS23S0100000_113.postDelayed(pr62.LJIIL, j4);
                        }
                        ((PR9) iDHandlerS23S0100000_11.l0).LJIIJ = pr62;
                        return;
                    }
                    o.LJIJI("assistStat");
                    throw null;
                }
                o.LJIJI("powerHandler");
                throw null;
            case 82:
                PR6 pr63 = ((PR9) iDHandlerS23S0100000_11.l0).LJIIJ;
                if (pr63 == null) {
                    return;
                }
                pr63.LIZ.removeCallbacks(pr63.LJIIJJI);
                pr63.LIZ.removeCallbacks(pr63.LJIIL);
                return;
            default:
                return;
        }
    }

    public static final void handleMessage$3(IDHandlerS23S0100000_11 iDHandlerS23S0100000_11, Message message) {
        super.handleMessage(message);
        if (message.what != 1) {
            return;
        }
        QLG qlg = ((QO4) iDHandlerS23S0100000_11.l0).LIZLLL;
        if (qlg != null) {
            Object obj = message.obj;
            if (obj instanceof String) {
                String str = (String) obj;
                String str2 = qlg.LIZIZ;
                if (str != null) {
                    str.equals(str2);
                }
                QO4 qo4 = (QO4) iDHandlerS23S0100000_11.l0;
                if (qo4.LIZIZ) {
                    qo4.getClass();
                }
            }
        }
        ((QO4) iDHandlerS23S0100000_11.l0).LJFF.LIZ();
        ((QO4) iDHandlerS23S0100000_11.l0).getClass();
    }

    public static final void handleMessage$4(IDHandlerS23S0100000_11 iDHandlerS23S0100000_11, Message message) {
        boolean z;
        EnumC64748Pb6 enumC64748Pb6;
        if (message.what != 10000) {
            return;
        }
        if (message.arg1 == 0) {
            z = false;
        } else {
            z = true;
        }
        C64728Pam c64728Pam = (C64728Pam) iDHandlerS23S0100000_11.l0;
        int i = message.arg2;
        c64728Pam.getClass();
        if (i != 7) {
            if (i != 10) {
                if (i != 20) {
                    switch (i) {
                        case -2:
                            enumC64748Pb6 = EnumC64748Pb6.TTRESUME;
                            break;
                        case -1:
                            enumC64748Pb6 = EnumC64748Pb6.TTHardCode;
                            break;
                        case 0:
                            enumC64748Pb6 = EnumC64748Pb6.TTCACHE;
                            break;
                        case 1:
                            enumC64748Pb6 = EnumC64748Pb6.TTSERVER;
                            break;
                        case 2:
                            enumC64748Pb6 = EnumC64748Pb6.TTERROR;
                            break;
                        case 3:
                            enumC64748Pb6 = EnumC64748Pb6.TTPOLL;
                            break;
                        case 4:
                            enumC64748Pb6 = EnumC64748Pb6.TTTNC;
                            break;
                        default:
                            enumC64748Pb6 = EnumC64748Pb6.TTSERVER;
                            break;
                    }
                } else {
                    enumC64748Pb6 = EnumC64748Pb6.TTCRONET;
                }
            } else {
                enumC64748Pb6 = EnumC64748Pb6.TTREGION;
            }
        } else {
            enumC64748Pb6 = EnumC64748Pb6.PORTRETRY;
        }
        c64728Pam.LIZLLL(enumC64748Pb6, z);
    }

    public static final void handleMessage$5(IDHandlerS23S0100000_11 iDHandlerS23S0100000_11, Message message) {
        boolean z;
        super.handleMessage(message);
        boolean z2 = true;
        if (message.what != 1) {
            return;
        }
        QIS qis = ((QL4) iDHandlerS23S0100000_11.l0).LJ;
        if (qis != null) {
            Object obj = message.obj;
            if (obj instanceof String) {
                String str = (String) obj;
                String str2 = qis.LIZIZ;
                if (str == str2 || (str != null && str.equals(str2))) {
                    z = true;
                } else {
                    z = false;
                }
                QL4 ql4 = (QL4) iDHandlerS23S0100000_11.l0;
                if (!ql4.LIZJ || !ql4.LIZIZ) {
                    z2 = false;
                }
                if (z && z2) {
                    ((QL4) iDHandlerS23S0100000_11.l0).LJ.LJI = System.currentTimeMillis();
                    QL4 ql42 = (QL4) iDHandlerS23S0100000_11.l0;
                    ql42.LJI.LIZLLL(ql42.LJ);
                    ((QL4) iDHandlerS23S0100000_11.l0).LIZIZ(str);
                    ((QL4) iDHandlerS23S0100000_11.l0).getClass();
                    return;
                }
            }
        }
        ((QL4) iDHandlerS23S0100000_11.l0).LJI.LIZ();
        ((QL4) iDHandlerS23S0100000_11.l0).getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDHandlerS23S0100000_11(Object obj, Looper looper, int i) {
        super(looper);
        this.$t = i;
        this.l0 = obj;
    }
}
