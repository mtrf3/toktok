package X;

import android.util.Pair;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.IOk, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46542IOk implements IFW {
    @Override // X.IFW
    public final void LIZ(Pair<SimVideoUrlModel, String> pair) {
        String str;
        String str2;
        SimVideoUrlModel simVideoUrlModel;
        Aweme aweme = C46616IRg.LIZ;
        if (aweme != null) {
            String aid = aweme.getAid();
            if (pair != null && (simVideoUrlModel = (SimVideoUrlModel) pair.first) != null) {
                str = simVideoUrlModel.getSourceId();
            } else {
                str = null;
            }
            if (o.LJ(aid, str)) {
                if (pair != null && (str2 = (String) pair.second) != null) {
                    C1JX.LJIIIIZZ("onPreloadDone local path: ", str2);
                    Aweme aweme2 = C46616IRg.LIZ;
                    if (aweme2 != null) {
                        C46728IVo.LJI(C46728IVo.LIZLLL(aweme2), IVT.LIZ(aweme2.getAid()), true, new C78880UxY());
                    }
                }
                C46616IRg.LIZ = null;
                C46616IRg.LIZIZ = 0;
                C10K.LIZJ(CallableC36220EJk.LJLIL);
            }
        }
    }

    @Override // X.IFW
    public final void LIZIZ(SimVideoUrlModel simVideoUrlModel) {
        Aweme aweme = C46616IRg.LIZ;
        if (aweme != null && o.LJ(aweme.getAid(), simVideoUrlModel.getSourceId())) {
            if (C46616IRg.LIZIZ >= 5) {
                C46616IRg.LIZ = null;
                C46616IRg.LIZIZ = 0;
                C10K.LIZJ(CallableC36218EJi.LJLIL);
                return;
            }
            Aweme aweme2 = C46616IRg.LIZ;
            if (aweme2 == null) {
                return;
            }
            C46616IRg.LIZIZ++;
            C46728IVo.LJIIL(Integer.MAX_VALUE, aweme2);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onPreloadError retryCount:");
            LIZ.append(C46616IRg.LIZIZ);
            X1D.LIZIZ(LIZ);
        }
    }

    @Override // X.IFW
    public final void LIZJ(List<SimVideoUrlModel> list) {
        Aweme aweme;
        Aweme aweme2 = C46616IRg.LIZ;
        if (aweme2 != null) {
            ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
            Iterator it = ((ArrayList) list).iterator();
            while (it.hasNext()) {
                if (o.LJ(aweme2.getAid(), ((SimVideoUrlModel) it.next()).getSourceId()) && (aweme = C46616IRg.LIZ) != null) {
                    C46728IVo.LJIIL(Integer.MAX_VALUE, aweme);
                }
                arrayList.add(C76800UCe.LIZ);
            }
        }
    }
}
