package Y;

import X.C10I;
import X.C10K;
import X.C3C5;
import X.C44384HbQ;
import X.C44428Hc8;
import X.C6YX;
import X.C76800UCe;
import X.C84654XKg;
import X.C84939XVf;
import X.InterfaceC133905Ni;
import X.InterfaceC153045zY;
import X.InterfaceC171226nm;
import X.InterfaceC67352kd;
import X.XRT;
import X.XTV;
import com.ss.android.ugc.aweme.music.model.CollectedMusicList;
import com.ss.android.ugc.aweme.music.model.FavoriteRecommendedMusicResponse;
import com.ss.android.ugc.aweme.music.model.Music;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public class AgS50S0201000_15 implements C10I {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

    @Override // X.C10I
    public final Object then(C10K c10k) {
        switch (this.$t) {
            case 0:
                return then$0(this, c10k);
            case 1:
                return then$1(this, c10k);
            case 2:
                return then$2(this, c10k);
            default:
                return null;
        }
    }

    public static final Object then$0(AgS50S0201000_15 agS50S0201000_15, C10K c10k) {
        if (!c10k.LJIILJJIL() && c10k.LJIILIIL()) {
            if (c10k.LJIIJJI() != null) {
                InterfaceC67352kd interfaceC67352kd = (InterfaceC67352kd) agS50S0201000_15.l0;
                Object LJIIJJI = c10k.LJIIJJI();
                C3C5.m7constructorimpl(LJIIJJI);
                interfaceC67352kd.resumeWith(LJIIJJI);
                if (agS50S0201000_15.i2 == 0) {
                    XTV xtv = (XTV) agS50S0201000_15.l1;
                    Object LJIIJJI2 = c10k.LJIIJJI();
                    o.LJIIIIZZ(LJIIJJI2, "it.result");
                    xtv.getClass();
                    XTV.LIZ((CollectedMusicList) LJIIJJI2);
                }
            } else {
                InterfaceC67352kd interfaceC67352kd2 = (InterfaceC67352kd) agS50S0201000_15.l0;
                C3C5.m7constructorimpl(null);
                interfaceC67352kd2.resumeWith(null);
            }
        } else if (((XTV) agS50S0201000_15.l1).LJ) {
            CollectedMusicList LIZIZ = XTV.LIZIZ();
            if (LIZIZ != null) {
                LIZIZ.setHasMore(false);
            }
            InterfaceC67352kd interfaceC67352kd3 = (InterfaceC67352kd) agS50S0201000_15.l0;
            C3C5.m7constructorimpl(LIZIZ);
            interfaceC67352kd3.resumeWith(LIZIZ);
        } else {
            InterfaceC67352kd interfaceC67352kd4 = (InterfaceC67352kd) agS50S0201000_15.l0;
            C3C5.m7constructorimpl(null);
            interfaceC67352kd4.resumeWith(null);
        }
        return C76800UCe.LIZ;
    }

    public static final Object then$1(AgS50S0201000_15 agS50S0201000_15, C10K c10k) {
        List<? extends Music> list;
        if (!c10k.LJIILJJIL() && c10k.LJIILIIL()) {
            if (c10k.LJIIJJI() != null) {
                InterfaceC67352kd interfaceC67352kd = (InterfaceC67352kd) agS50S0201000_15.l0;
                Object LJIIJJI = c10k.LJIIJJI();
                C3C5.m7constructorimpl(LJIIJJI);
                interfaceC67352kd.resumeWith(LJIIJJI);
                if (agS50S0201000_15.i2 == 0 && (list = ((FavoriteRecommendedMusicResponse) c10k.LJIIJJI()).items) != null && !list.isEmpty()) {
                    ((XTV) agS50S0201000_15.l1).LIZLLL = (FavoriteRecommendedMusicResponse) c10k.LJIIJJI();
                }
            } else {
                InterfaceC67352kd interfaceC67352kd2 = (InterfaceC67352kd) agS50S0201000_15.l0;
                C3C5.m7constructorimpl(null);
                interfaceC67352kd2.resumeWith(null);
            }
        } else {
            InterfaceC67352kd interfaceC67352kd3 = (InterfaceC67352kd) agS50S0201000_15.l0;
            C3C5.m7constructorimpl(null);
            interfaceC67352kd3.resumeWith(null);
        }
        return C76800UCe.LIZ;
    }

    public static final Object then$2(AgS50S0201000_15 agS50S0201000_15, C10K c10k) {
        InterfaceC133905Ni interfaceC133905Ni;
        switch (agS50S0201000_15.i2) {
            case 0:
                C84939XVf c84939XVf = (C84939XVf) agS50S0201000_15.l0;
                C44428Hc8 c44428Hc8 = (C44428Hc8) agS50S0201000_15.l1;
                c84939XVf.LJFF = false;
                c44428Hc8.LIZIZ(TimeUnit.MILLISECONDS);
                if (c10k.LJIILJJIL()) {
                    c84939XVf.LIZIZ.jv0(1, "refresh_status_user_collected_music");
                } else if (c10k.LJIILIIL()) {
                    CollectedMusicList collectedMusicList = (CollectedMusicList) c10k.LJIIJJI();
                    XRT xrt = new XRT();
                    xrt.LIZ.put("refresh_status_user_collected_music", 0);
                    xrt.LIZ.put("list_cursor", Integer.valueOf(collectedMusicList.cursor));
                    xrt.LIZ.put("list_hasmore", Integer.valueOf(collectedMusicList.hasMore));
                    xrt.LIZ.put("action_type", 1);
                    xrt.LIZIZ("list_data", C44384HbQ.LJIJJLI(collectedMusicList.items));
                    c84939XVf.LIZIZ.jv0(xrt, "user_collected_music_list");
                }
                return null;
            default:
                C6YX c6yx = (C6YX) agS50S0201000_15.l0;
                InterfaceC171226nm interfaceC171226nm = (InterfaceC171226nm) agS50S0201000_15.l1;
                InterfaceC153045zY interfaceC153045zY = c6yx.LJ;
                if (interfaceC153045zY != null && (interfaceC133905Ni = c6yx.LJI) != null) {
                    interfaceC153045zY.LLFF(interfaceC133905Ni);
                }
                if (interfaceC171226nm != null) {
                    interfaceC171226nm.LIZ();
                }
                return null;
        }
    }

    public AgS50S0201000_15(XTV xtv, C84654XKg c84654XKg, int i) {
        this.$t = i;
        this.l0 = c84654XKg;
        this.i2 = 0;
        this.l1 = xtv;
    }

    public AgS50S0201000_15(int i, Object obj, Object obj2, int i2) {
        this.$t = i2;
        this.i2 = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
