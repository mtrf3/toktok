package X;

import com.bytedance.android.livesdkapi.depend.model.live.CommercialContentToggle;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import java.util.List;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* renamed from: X.BHn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28527BHn {
    public static final /* synthetic */ int LJI = 0;
    public final C28531BHr LIZ;
    public CommercialContentToggle LIZIZ;
    public final InterfaceC65784Pro<C76800UCe> LIZJ;
    public final InterfaceC65784Pro<C76800UCe> LIZLLL;
    public final InterfaceC88472Yns<String, C76800UCe> LJ;
    public final InterfaceC88472Yns<EnumC28526BHm, C76800UCe> LJFF;

    public C28527BHn() {
        throw null;
    }

    public final int LIZIZ() {
        C28531BHr c28531BHr = this.LIZ;
        int i = c28531BHr.LIZ;
        int i2 = c28531BHr.LJ;
        if (i == 1 && i2 == 1) {
            return 6;
        }
        if (i == 2 && i2 == 2) {
            return 7;
        }
        if (i == 1 && i2 == 3) {
            return 1;
        }
        if (i2 == 1 && i == 3) {
            return 4;
        }
        if (i == 1) {
            return 8;
        }
        if (i2 == 1) {
            return 9;
        }
        if (i == 2) {
            return 2;
        }
        if (i2 == 2) {
            return 5;
        }
        if (i == 3 || (i != 0 && i2 != 0)) {
            return 3;
        }
        return 0;
    }

    public final int LIZ(LiveMode liveMode) {
        List LJJIJIIJI;
        o.LJIIIZ(liveMode, "liveMode");
        C28531BHr c28531BHr = this.LIZ;
        int i = BHP.LIZ[liveMode.ordinal()];
        int i2 = 3;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    LJJIJIIJI = C61878OQg.INSTANCE;
                } else {
                    LJJIJIIJI = C47261Igj.LJJIJIIJI(Integer.valueOf(c28531BHr.LIZ), Integer.valueOf(c28531BHr.LIZJ));
                }
            } else {
                LJJIJIIJI = C47261Igj.LJJIJ(Integer.valueOf(c28531BHr.LIZJ));
            }
        } else {
            LJJIJIIJI = C47261Igj.LJJIJIIJI(Integer.valueOf(c28531BHr.LIZ), Integer.valueOf(c28531BHr.LJ));
        }
        if (LJJIJIIJI.contains(1)) {
            i2 = 1;
        } else if (LJJIJIIJI.contains(2)) {
            i2 = 2;
        } else if (LJJIJIIJI.contains(0)) {
            i2 = 0;
        }
        C012403c.LJ("MergeStatus=", i2, "BcToggleToggleService");
        return i2;
    }

    public C28527BHn(AqS155S0100000_5 aqS155S0100000_5, AqS155S0100000_5 aqS155S0100000_52, AqS171S0100000_5 aqS171S0100000_5, AqS171S0100000_5 aqS171S0100000_52) {
        this.LIZ = new C28531BHr(0);
        this.LIZIZ = null;
        this.LIZJ = aqS155S0100000_5;
        this.LIZLLL = aqS155S0100000_52;
        this.LJ = aqS171S0100000_5;
        this.LJFF = aqS171S0100000_52;
    }
}
