package X;

import com.bytedance.retrofit2.client.Request;
import com.ss.android.ugc.aweme.preload.PreloadExtraInfo;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Pgv, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65109Pgv implements InterfaceC64900PdY, InterfaceC64917Pdp, InterfaceC64924Pdw {
    public final Object LIZ;

    @Override // X.InterfaceC64917Pdp
    public final void LIZLLL(C64907Pdf c64907Pdf, C37826Esw c37826Esw) {
    }

    @Override // X.InterfaceC65105Pgr
    public final String LJ() {
        return C64904Pdc.LIZIZ(this);
    }

    public C65109Pgv(Object obj) {
        this.LIZ = obj;
    }

    @Override // X.InterfaceC64900PdY
    public final void LIZ(C64901PdZ<?> c64901PdZ, C37826Esw c37826Esw) {
        Request request;
        C37233EjN c37233EjN;
        C37225EjF c37225EjF;
        String str;
        if (!((Boolean) C778133p.LIZ.getValue()).booleanValue()) {
            return;
        }
        InterfaceC37276Ek4<?> interfaceC37276Ek4 = c37826Esw.LIZ;
        C38826FLq c38826FLq = null;
        if (interfaceC37276Ek4 == null || (request = interfaceC37276Ek4.request()) == null) {
            return;
        }
        Object LIZ = C64904Pdc.LIZ(this, c37826Esw);
        if (LIZ instanceof C37233EjN) {
            c37233EjN = (C37233EjN) LIZ;
        } else {
            c37233EjN = null;
        }
        C64797Pbt<?> LIZ2 = c64901PdZ.LIZ();
        if (c37233EjN != null) {
            c37225EjF = c37233EjN.LIZ;
            c38826FLq = c37233EjN.LIZJ;
        } else {
            c37225EjF = null;
        }
        if (!C77357UXp.LJJIJLIJ(request) || C65110Pgw.LIZJ == null || c38826FLq == null || c37225EjF == null || (str = c37225EjF.LIZIZ) == null || str.length() == 0) {
            return;
        }
        C65118Ph4 c65118Ph4 = C65110Pgw.LIZJ;
        if (c65118Ph4 != null && LIZ2.LIZIZ()) {
            synchronized (c65118Ph4.LIZ) {
                c65118Ph4.LIZ.LIZJ(str, new C65111Pgx(c38826FLq, LIZ2));
            }
        }
        C65110Pgw.LIZ(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:108:0x020e, code lost:
    
        if (r1 != null) goto L40;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v36, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v37, types: [T, X.Ph2, java.lang.Object] */
    @Override // X.InterfaceC64917Pdp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C64797Pbt<?> LIZIZ(X.C64907Pdf r11, X.C37826Esw r12) {
        /*
            Method dump skipped, instructions count: 580
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65109Pgv.LIZIZ(X.Pdf, X.Esw):X.Pbt");
    }

    @Override // X.InterfaceC64924Pdw
    public final boolean LJI(C64907Pdf c64907Pdf, C37826Esw c37826Esw, Throwable th, int i, boolean z) {
        C37233EjN c37233EjN;
        String str;
        PreloadExtraInfo preloadExtraInfo;
        Object LIZ = C64904Pdc.LIZ(this, c37826Esw);
        C37225EjF c37225EjF = null;
        if (LIZ instanceof C37233EjN) {
            c37233EjN = (C37233EjN) LIZ;
            if (c37233EjN != null && (preloadExtraInfo = c37233EjN.LIZIZ) != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                String str2 = preloadExtraInfo.enterFrom;
                o.LJIIIIZZ(str2, "it.enterFrom");
                linkedHashMap.put("enter_from", str2);
                String str3 = preloadExtraInfo.url;
                o.LJIIIIZZ(str3, "it.url");
                linkedHashMap.put("url", str3);
                linkedHashMap.put("strategy_id", String.valueOf(preloadExtraInfo.strategyId));
                FMX.LJIIL("preload_fail", linkedHashMap);
            }
        } else {
            c37233EjN = null;
        }
        if (c37233EjN != null) {
            c37225EjF = c37233EjN.LIZ;
        }
        if (c37225EjF == null || (str = c37225EjF.LIZIZ) == null) {
            return false;
        }
        C65110Pgw.LIZ(str);
        return false;
    }
}
