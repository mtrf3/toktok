package Y;

import X.C90099ZXr;
import X.C90421ZeD;
import X.C90506Zfa;
import X.C90592Zgy;
import X.C90639Zhj;
import X.C90924ZmK;
import X.QH7;
import X.X1D;
import androidx.mediarouter.media.MediaRouteProviderService;
import com.byted.cast.common.CastLogger;
import java.util.Arrays;
import org.json.JSONObject;

/* loaded from: classes29.dex */
public class IDRunnableS5S1100000_24 implements Runnable {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            case 2:
                run$2(this);
                return;
            default:
                return;
        }
    }

    public static final void run$0(IDRunnableS5S1100000_24 iDRunnableS5S1100000_24) {
        boolean LIZ;
        try {
            ((C90421ZeD) iDRunnableS5S1100000_24.l1).LIZ.startSsdpServer(iDRunnableS5S1100000_24.s0);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(IDRunnableS5S1100000_24 iDRunnableS5S1100000_24) {
        C90506Zfa c90506Zfa = (C90506Zfa) iDRunnableS5S1100000_24.l1;
        String str = iDRunnableS5S1100000_24.s0;
        C90639Zhj LJ = c90506Zfa.LJ(null);
        if (LJ == null) {
            return;
        }
        CastLogger castLogger = c90506Zfa.LJIJJLI;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("dramaId: ");
        LIZ.append(str);
        LIZ.append(", dramaIds: ");
        LIZ.append(Arrays.toString(c90506Zfa.LJJIFFI));
        castLogger.d("ChromeCastSourceImpl", X1D.LIZIZ(LIZ));
        int LIZLLL = c90506Zfa.LIZLLL(str);
        if (LIZLLL < 0 || c90506Zfa.LJJII == null) {
            c90506Zfa.LJIJJLI.w("ChromeCastSourceImpl", "not exist itemId.");
            return;
        }
        int LIZ2 = LJ.LJFF().LIZ(LIZLLL);
        CastLogger castLogger2 = c90506Zfa.LJIJJLI;
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("tempItemId: ");
        LIZ3.append(LIZ2);
        castLogger2.d("ChromeCastSourceImpl", X1D.LIZIZ(LIZ3));
        if (LIZ2 <= 0) {
            c90506Zfa.LJIJJLI.w("ChromeCastSourceImpl", "item id is not satisfied.");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        QH7.LJ("Must be called from the main thread.");
        if (!LJ.LJJIII()) {
            C90639Zhj.LJIJJLI();
        } else {
            C90639Zhj.LJJIIJ(new C90924ZmK(LJ, LIZ2, jSONObject));
        }
    }

    public static final void run$2(IDRunnableS5S1100000_24 iDRunnableS5S1100000_24) {
        C90099ZXr c90099ZXr;
        C90592Zgy c90592Zgy = (C90592Zgy) iDRunnableS5S1100000_24.l1;
        if (c90592Zgy.LJLL.remove(iDRunnableS5S1100000_24.s0) == null || (c90099ZXr = c90592Zgy.LJLLI.LIZ.LJLJJI.LJLJL) == null) {
            return;
        }
        MediaRouteProviderService.LJ(c90592Zgy.LJLIL, 5, 0, 0, c90592Zgy.LIZ(c90099ZXr), null);
    }

    public IDRunnableS5S1100000_24(Object obj, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
    }
}
