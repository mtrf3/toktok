package X;

import com.bytedance.lynx.hybrid.resource.config.GeckoConfig;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.FlZ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39917FlZ implements FD3 {
    public static final C61248O2a LIZIZ = new C61248O2a();
    public final C61156NzM LIZ;

    public C39917FlZ(O2J rlConfig) {
        o.LJIIJ(rlConfig, "rlConfig");
        LIZIZ.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, GeckoConfig> entry : rlConfig.LIZLLL.entrySet()) {
            linkedHashMap.put(entry.getKey(), C61248O2a.LIZ(rlConfig, entry.getValue()));
        }
        List<String> list = rlConfig.LIZIZ;
        ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
        for (String str : list) {
            C39918Fla.LIZIZ.getClass();
            arrayList.add(C39918Fla.LIZ(str));
        }
        rlConfig.LIZIZ = arrayList;
        C61156NzM c61156NzM = new C61156NzM(rlConfig.LIZ, C61248O2a.LIZ(rlConfig, rlConfig.LIZJ), linkedHashMap, ORZ.LLJILLL(rlConfig.LIZIZ));
        c61156NzM.LIZIZ = true;
        this.LIZ = c61156NzM;
    }

    public C39917FlZ(C61156NzM c61156NzM) {
        this.LIZ = c61156NzM;
    }
}
