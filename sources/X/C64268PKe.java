package X;

import android.content.Context;
import android.os.SystemClock;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.entity.Header;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: X.PKe, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64268PKe {
    public static volatile C64268PKe LJ;
    public final Context LIZ;
    public final java.util.Map<CrashType, PKT> LIZIZ = new HashMap();
    public final C64269PKf LIZJ;
    public final C47949Irp LIZLLL;

    public static C64268PKe LIZLLL() {
        if (LJ == null) {
            Context context = PK0.LIZ;
            if (context != null) {
                LJ = new C64268PKe(context);
            } else {
                throw new IllegalArgumentException("NpthBus not init");
            }
        }
        return LJ;
    }

    public C64268PKe(Context context) {
        this.LIZ = context;
        try {
            this.LIZJ = C64269PKf.LIZLLL();
            this.LIZLLL = new C47949Irp(context);
        } catch (Throwable th) {
            PJZ.LIZ.getClass();
            PJY.LIZ("NPTH_CATCH", th);
        }
    }

    public static final PKN LIZJ(List<PKN> list) {
        if (list.isEmpty()) {
            return null;
        }
        PKN pkn = new PKN();
        JSONArray jSONArray = new JSONArray();
        Iterator<PKN> it = list.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next().LIZ);
        }
        pkn.LJIIJJI("data", jSONArray);
        Header LIZJ = Header.LIZJ();
        Header.addRuntimeHeader(LIZJ.LIZ);
        LIZJ.LJ();
        LIZJ.LJIIJ();
        try {
            C64257PJt LIZIZ = PK0.LIZIZ();
            LIZIZ.getClass();
            try {
                long userId = LIZIZ.LIZIZ.getUserId();
                if (userId > 0) {
                    LIZJ.LIZ.put("user_id", userId);
                }
            } catch (Throwable unused) {
            }
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        Header.LIZ(LIZJ);
        pkn.LJIIZILJ(LIZJ);
        return pkn;
    }

    public final PKN LIZ(CrashType crashType, PKN pkn) {
        return LIZIZ(crashType, pkn, null, false);
    }

    public final PKN LIZIZ(CrashType crashType, PKN pkn, PLX plx, boolean z) {
        if (crashType == null) {
            return pkn;
        }
        PKT pkt = (PKT) ((HashMap) this.LIZIZ).get(crashType);
        int i = 0;
        if (pkt == null) {
            switch (C39166FYs.LIZ[crashType.ordinal()]) {
                case 1:
                    pkt = new C64282PKs(this.LIZ, this.LIZJ, this.LIZLLL, false);
                    break;
                case 2:
                    pkt = new C64282PKs(this.LIZ, this.LIZJ, this.LIZLLL, true);
                    break;
                case 3:
                    pkt = new C64285PKv(this.LIZ, this.LIZJ, this.LIZLLL);
                    break;
                case 4:
                    pkt = new C64281PKr(CrashType.ANR, this.LIZ, this.LIZJ, this.LIZLLL);
                    break;
                case 5:
                    pkt = new C64281PKr(CrashType.DART, this.LIZ, this.LIZJ, this.LIZLLL);
                    break;
                case 6:
                    pkt = new C64281PKr(CrashType.GAME, this.LIZ, this.LIZJ, this.LIZLLL);
                    break;
                case 7:
                    pkt = new C64281PKr(CrashType.CUSTOM_JAVA, this.LIZ, this.LIZJ, this.LIZLLL);
                    break;
                case 8:
                    pkt = new PLU(CrashType.ENSURE, this.LIZ, this.LIZJ, this.LIZLLL);
                    break;
                default:
                    return pkn;
            }
            ((HashMap) this.LIZIZ).put(crashType, pkt);
        }
        if (pkn == null) {
            pkn = new PKN();
        }
        PKN pkn2 = pkn;
        while (true) {
            pkt.LIZJ();
            if (i < 6) {
                long uptimeMillis = SystemClock.uptimeMillis();
                if (plx != null) {
                    try {
                        plx.LIZLLL(i, pkn2);
                    } catch (Throwable unused) {
                        plx.LIZIZ();
                    }
                }
                try {
                    pkn2 = pkt.LIZIZ(i, pkn2);
                } catch (Throwable unused2) {
                    if (plx != null) {
                        plx.LIZIZ();
                    }
                }
                if (plx != null) {
                    try {
                        pkt.LIZJ();
                        plx.LIZJ(i, pkn2);
                    } catch (Throwable unused3) {
                        plx.LIZIZ();
                    }
                    if (z) {
                        if (i != 0) {
                            PKN.LJI(pkn.LIZ, pkn2.LIZ);
                        } else {
                            pkn = pkn2;
                        }
                        pkn2 = new PKN();
                    }
                    pkn.LIZIZ(C64.LIZIZ("step_cost_", i), String.valueOf(SystemClock.uptimeMillis() - uptimeMillis));
                    i++;
                } else {
                    pkn.LIZIZ(C64.LIZIZ("step_cost_", i), String.valueOf(SystemClock.uptimeMillis() - uptimeMillis));
                    i++;
                }
            } else {
                pkt.LIZ(pkn);
                return pkn;
            }
        }
    }
}
