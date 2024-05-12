package X;

import Y.ARunnableS4S1300000_6;
import android.text.TextUtils;
import com.bytedance.keva.Keva;
import com.bytedance.lynx.hybrid.ssp.base.SSPResponse;
import com.bytedance.lynx.hybrid.ssp.base.net.DefaultNetAdapter;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.google.gson.Gson;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Fkm, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39868Fkm {
    public static InterfaceC65784Pro<String> LIZ;
    public static InterfaceC39876Fku LIZJ;
    public static final C39868Fkm LJFF = new C39868Fkm();
    public static final C24020ww LIZIZ = new C24020ww();
    public static final DefaultNetAdapter LIZLLL = new DefaultNetAdapter();
    public static final HashMap<String, OSZ<InterfaceC39875Fkt, C39879Fkx>> LJ = new HashMap<>();

    static {
        new HashMap();
    }

    public final void LIZIZ(String str, C39872Fkq c39872Fkq) {
        String message;
        SSPResponse sSPResponse;
        SSPResponse.Data data;
        Object LIZ2;
        java.util.Map<String, SSPResponse.Data> map;
        Collection values;
        if (c39872Fkq.LIZ) {
            try {
                sSPResponse = C39869Fkn.LIZ(c39872Fkq);
                message = null;
            } catch (Throwable th) {
                message = th.getMessage();
                sSPResponse = null;
            }
        } else {
            sSPResponse = null;
            message = null;
        }
        HashMap<String, OSZ<InterfaceC39875Fkt, C39879Fkx>> hashMap = LJ;
        if (!hashMap.containsKey(str)) {
            return;
        }
        if (sSPResponse != null && (map = sSPResponse.LIZIZ) != null && (values = ((LinkedHashMap) map).values()) != null) {
            data = (SSPResponse.Data) ORZ.LJLLL(values);
        } else {
            data = null;
        }
        OSZ<InterfaceC39875Fkt, C39879Fkx> osz = hashMap.get(str);
        if (osz != null) {
            osz.getFirst().LIZ(str, data);
            C39879Fkx second = osz.getSecond();
            second.LJ = Boolean.valueOf(c39872Fkq.LIZ);
            second.LJIIL = c39872Fkq.LIZLLL;
            second.LJI = message;
            second.LJFF = c39872Fkq.LIZJ;
            hashMap.remove(str);
        }
        if (data != null && data.validityPeriod > 0) {
            C24020ww c24020ww = LIZIZ;
            c24020ww.getClass();
            if (data.matchType == 0) {
                android.net.Uri parse = UriProtector.parse(str);
                o.LJFF(parse, "Uri.parse(url)");
                str = C39927Flj.LIZJ(parse);
            }
            Keva keva = (Keva) c24020ww.LIZIZ;
            C39870Fko.LIZJ.getClass();
            keva.storeString(str, GsonProtectorUtils.toJson((Gson) C39870Fko.LIZIZ.getValue(), data));
            if (((Keva) c24020ww.LIZIZ).count() <= c24020ww.LIZ) {
                return;
            }
            for (String str2 : ((Keva) c24020ww.LIZIZ).getAll().keySet()) {
                try {
                    C39870Fko c39870Fko = C39870Fko.LIZJ;
                    String string = ((Keva) c24020ww.LIZIZ).getString(str2, "");
                    c39870Fko.getClass();
                    LIZ2 = (SSPResponse.Data) GsonProtectorUtils.fromJson((Gson) C39870Fko.LIZIZ.getValue(), string, SSPResponse.Data.class);
                    C3C5.m7constructorimpl(LIZ2);
                } catch (Throwable th2) {
                    LIZ2 = C141335gf.LIZ(th2);
                    C3C5.m7constructorimpl(LIZ2);
                }
                if (C3C5.m12isFailureimpl(LIZ2)) {
                    LIZ2 = null;
                }
                SSPResponse.Data data2 = (SSPResponse.Data) LIZ2;
                if (data2 == null || data2.expire <= System.currentTimeMillis()) {
                    ((Keva) c24020ww.LIZIZ).erase(str2);
                }
            }
        }
    }

    public static void LIZ(C39879Fkx metrics, C39873Fkr c39873Fkr, C39877Fkv c39877Fkv, String str) {
        o.LJIIJ(metrics, "metrics");
        if (!(!TextUtils.isEmpty(c39873Fkr.LJLIL))) {
            c39877Fkv.LIZ(str, null);
        } else {
            C37755Ern.LIZ(new ARunnableS4S1300000_6(metrics, c39873Fkr, c39877Fkv, str, 2));
        }
    }
}
