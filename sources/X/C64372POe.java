package X;

import com.ss.android.common.lib.AppLogNewUtils;
import java.util.Iterator;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.POe, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64372POe extends AbstractC65781Prl implements InterfaceC88472Yns<Long, C76800UCe> {
    public static final C64372POe LJLIL = new C64372POe();

    public C64372POe() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(Long l) {
        l.longValue();
        Iterator LIZLLL = C47135Ieh.LIZLLL(C64375POh.LIZIZ, "traceMapInfo.values");
        while (LIZLLL.hasNext()) {
            POJ poj = (POJ) LIZLLL.next();
            Iterator LIZLLL2 = C47135Ieh.LIZLLL(C64375POh.LIZJ, "spanMapInfo.values");
            int i = 0;
            while (LIZLLL2.hasNext()) {
                if (o.LJ(((POK) LIZLLL2.next()).LIZIZ, poj)) {
                    i++;
                }
            }
            JSONObject LJ = C47135Ieh.LJ("t_biz", "trace_log", "t_m_cgy", "span");
            LJ.put("t_s_cgy", poj.LIZJ);
            LJ.put("t_sc", i);
            AppLogNewUtils.onEventV3("tt_network_metric", LJ);
        }
        JSONObject LJ2 = C47135Ieh.LJ("t_biz", "trace_log", "t_m_cgy", "trace");
        LJ2.put("t_s_cgy", String.valueOf(C64375POh.LIZIZ.size()));
        LJ2.put("t_sc", C64375POh.LIZJ.size());
        AppLogNewUtils.onEventV3("tt_network_metric", LJ2);
        return C76800UCe.LIZ;
    }
}
