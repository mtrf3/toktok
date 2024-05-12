package X;

import android.content.Context;
import android.os.SystemClock;
import android.util.Pair;
import android.view.View;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* renamed from: X.1Zr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C35191Zr extends AbstractC22770uv {
    public static volatile C35191Zr LJIIIZ;
    public boolean LIZ;
    public Context LIZIZ;
    public C39281gS LIZJ;
    public C36231bX LJFF;
    public InterfaceC23970wr LJI;
    public AbstractC38911fr LJII;
    public final List<Pair<View, AbstractC269213w>> LJIIIIZZ = FII.LIZ();
    public final C22750ut LIZLLL = new C22750ut();
    public final C57964Moy LJ = new C57964Moy();

    public static C35191Zr LIZIZ() {
        if (LJIIIZ == null) {
            synchronized (C35191Zr.class) {
                if (LJIIIZ == null) {
                    LJIIIZ = new C35191Zr();
                }
            }
        }
        return LJIIIZ;
    }

    @Override // X.AbstractC22770uv
    public final void LIZ(C39281gS c39281gS) {
        if (!this.LIZ) {
            return;
        }
        this.LIZJ = c39281gS;
        this.LJ.getClass();
        C35191Zr LIZIZ = LIZIZ();
        if (LIZIZ.LIZ && LIZIZ.LIZJ.LIZ) {
            C10P.LIZ(new AbstractC36651cD() { // from class: X.1np
                @Override // X.C10Q
                public final void LIZ() {
                    try {
                        for (AbstractC004800e abstractC004800e : ((ConcurrentHashMap) C35191Zr.LIZIZ().LIZLLL.LIZ).values()) {
                            if (abstractC004800e != null) {
                                ((C30371Hd) abstractC004800e).LJI();
                            }
                        }
                    } catch (Exception e) {
                        C16880lQ.LLLLIIL(e);
                    }
                }
            });
        }
    }

    public final void LIZJ(C38531fF c38531fF) {
        String str;
        int i;
        int i2;
        C43861nq LJJJI = C43861nq.LJJJI();
        String str2 = c38531fF.LJIIJ;
        str2.getClass();
        switch (str2.hashCode()) {
            case -1877652737:
                str = "play_over";
                break;
            case -1353638573:
                str = "cpv_6s";
                break;
            case -493575378:
                str = "play_25";
                break;
            case -493575290:
                str = "play_50";
                break;
            case -493575223:
                str = "play_75";
                break;
            case 3443508:
                str = "play";
                break;
            case 3529469:
                str = "show";
                break;
            case 94750088:
                str = "click";
                break;
            case 986870585:
                str = "cpv_15s";
                break;
            case 1928152881:
                str = "play_valid";
                break;
        }
        str2.equals(str);
        List<String> list = c38531fF.LJFF;
        LJJJI.getClass();
        if (list != null) {
            i = list.size();
        } else {
            i = 0;
        }
        try {
            new JSONObject().putOpt("url_count", Integer.valueOf(i));
        } catch (Throwable unused) {
        }
        AbstractC38911fr.LJIJI();
        List<String> list2 = c38531fF.LJFF;
        if (list2 == null || list2.isEmpty()) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        List<String> list3 = c38531fF.LJFF;
        if (list3 != null) {
            i2 = list3.size();
        } else {
            i2 = 0;
        }
        C04070Dz.LIZIZ(jSONObject, "track_url_size", Integer.valueOf(i2));
        C04070Dz.LIZ("start_track", c38531fF, jSONObject);
        if (this.LIZ) {
            this.LJ.getClass();
            C35191Zr LIZIZ = LIZIZ();
            if (!LIZIZ.LIZ || !LIZIZ.LIZJ.LIZ) {
                return;
            }
            C10P.LIZ(new C43831nn(SystemClock.uptimeMillis(), null, c38531fF));
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("pending event:");
        LIZ.append(c38531fF.LIZIZ);
        LIZ.append("-");
        LIZ.append(c38531fF.LJIIJ);
        X1D.LIZIZ(LIZ);
        this.LJIIIIZZ.add(Pair.create(null, c38531fF));
    }
}
