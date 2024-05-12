package X;

import com.bytedance.helios.api.config.ApiStatistics;
import com.bytedance.helios.sdk.HeliosEnvImpl;
import com.bytedance.pumbaa.base.settings.FrequencyConfig;
import com.bytedance.pumbaa.base.settings.GuardRange;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Pwa, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66080Pwa implements InterfaceC66039Pvv {
    public static final C66080Pwa LIZ = new C66080Pwa();

    @Override // X.InterfaceC66039Pvv
    public final int LIZ() {
        return 6;
    }

    public static void LIZJ(C66120PxE privacyEvent) {
        o.LJIIIZ(privacyEvent, "privacyEvent");
        HeliosEnvImpl heliosEnvImpl = HeliosEnvImpl.get();
        o.LJIIIIZZ(heliosEnvImpl, "HeliosEnvImpl.get()");
        List<FrequencyConfig> list = heliosEnvImpl.LJIIJ.frequencyConfigs;
        ArrayList arrayList = new ArrayList();
        for (FrequencyConfig frequencyConfig : list) {
            GuardRange guardRange = frequencyConfig.guardRange;
            int i = privacyEvent.LJLJI;
            java.util.Set<String> dataTypes = privacyEvent.LLIIJLIL;
            guardRange.getClass();
            o.LJIIIZ(dataTypes, "dataTypes");
            if (!guardRange.excludeApiIds.contains(Integer.valueOf(i)) && (guardRange.apiIds.contains(Integer.valueOf(i)) || (!ORZ.LJZI(guardRange.dataTypes, dataTypes).isEmpty()))) {
                arrayList.add(frequencyConfig);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            FrequencyConfig frequencyConfig2 = (FrequencyConfig) it.next();
            int i2 = privacyEvent.LJLJI;
            long j = privacyEvent.LJLLJ;
            o.LJIIIZ(frequencyConfig2, "frequencyConfig");
            C60732Zx.LIZJ(i2, j, frequencyConfig2);
        }
        Iterator<ApiStatistics> it2 = C66083Pwd.LIZJ.iterator();
        int i3 = 0;
        while (true) {
            if (it2.hasNext()) {
                ApiStatistics next = it2.next();
                if (!(!o.LJ(next.type, "api"))) {
                    if (!next.isBlockList) {
                        if (next.apis.isEmpty() || next.apis.contains(Integer.valueOf(privacyEvent.LJLJI))) {
                            break;
                        }
                    } else if (!next.apis.contains(Integer.valueOf(privacyEvent.LJLJI))) {
                        break;
                    }
                }
                i3++;
            } else {
                i3 = -1;
                break;
            }
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(privacyEvent.LLIILII);
        LIZ2.append('_');
        LIZ2.append(privacyEvent.LJLJI);
        C66083Pwd.LIZJ(i3, X1D.LIZIZ(LIZ2));
    }

    @Override // X.InterfaceC66039Pvv
    public final void LIZIZ(C66120PxE event) {
        o.LJIIIZ(event, "event");
        LIZJ(event);
    }
}
