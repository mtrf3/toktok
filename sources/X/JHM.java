package X;

import X.JHM;
import Y.ARunnableS15S0101000_11;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.awemeservice.RequestIdService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public abstract class JHM<E extends JHM> {
    public final String LIZ;
    public String LIZLLL;
    public String LJ;
    public boolean LJFF;
    public String LJII;
    public String LJIIIIZZ;
    public String LJIIIZ;
    public String LJIIJ;
    public final java.util.Map<String, String> LIZIZ = new HashMap();
    public final java.util.Map<String, Object> LIZJ = new HashMap();
    public boolean LJI = false;
    public final java.util.Map<String, String> LJIIJJI = new ConcurrentHashMap();
    public final java.util.Map<String, Object> LJIIL = new HashMap();
    public final java.util.Map<String, java.util.Set<Object>> LJIILIIL = new HashMap();

    public void LJI() {
    }

    public abstract void LJII();

    public void LJIIL() {
        LJI();
        LJII();
        ((HashMap) this.LIZIZ).putAll(this.LJIIJJI);
    }

    public final void LJIILIIL() {
        LJIIL();
        C38816FLg.LJ(new ARunnableS15S0101000_11(7, this, 8));
    }

    public JHM(String str) {
        this.LIZ = str;
    }

    public static String LJIIIZ(Aweme aweme) {
        if (aweme.getAuthor() != null) {
            return aweme.getAuthor().getUid();
        }
        return "";
    }

    public final void LIZ(java.util.Map map) {
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getKey() != null && entry.getValue() != null) {
                ((ConcurrentHashMap) this.LJIIJJI).put(entry.getKey(), entry.getValue());
            }
        }
    }

    public final void LIZIZ(String str) {
        LJ("log_pb", C3A5.LIZ.LIZIZ(str), InterfaceC1798974f.LIZ);
    }

    public void LJIIIIZZ(Aweme aweme) {
        if (aweme != null) {
            if (aweme.getRank() != -1) {
                this.LJIIIZ = String.valueOf(aweme.getRank());
            } else {
                this.LJIIIZ = LJIIJ(9, aweme);
            }
            if (aweme.getVideo() != null && aweme.getVideo().getVideoTag() != null) {
                this.LJIIIIZZ = aweme.getVideo().getVideoTag().getTitle();
            }
            if (TextUtils.isEmpty(this.LJIIIIZZ) && aweme.getNewLabel() == 1) {
                this.LJIIIIZZ = "New";
            }
        }
    }

    public final void LJIILJJIL(String str) {
        ((ConcurrentHashMap) this.LJIIJJI).remove(str);
    }

    public static String LJIIJ(int i, Aweme aweme) {
        JSONObject LIZ = RequestIdService.LJ().LIZ(i, aweme);
        if (LIZ != null) {
            return LIZ.optString("order");
        }
        return "";
    }

    public static String LJIIJJI(int i, Aweme aweme) {
        JSONObject LIZ = RequestIdService.LJ().LIZ(i, aweme);
        if (LIZ != null) {
            return LIZ.optString("request_id");
        }
        return "";
    }

    public final void LIZJ(int i, String str) {
        LJ(str, String.valueOf(i), InterfaceC1798974f.LIZ);
    }

    public final void LIZLLL(String str, String str2) {
        LJ(str, str2, InterfaceC1798974f.LIZ);
    }

    public final void LJFF(String str, boolean z) {
        LJ(str, String.valueOf(z), InterfaceC1798974f.LIZ);
    }

    public final void LJ(String str, String str2, InterfaceC1798974f interfaceC1798974f) {
        ((HashMap) this.LIZIZ).put(str, interfaceC1798974f.LIZ(str2));
    }
}
