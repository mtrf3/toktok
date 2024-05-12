package X;

import com.bytedance.helios.sdk.HeliosEnvImpl;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.pumbaa.base.settings.FrequencyConfig;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Pte, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65898Pte extends PQ5 {
    public C65898Pte() {
        super("frequency");
    }

    @Override // X.PQ5
    public final Object LIZ(List<? extends Object> list) {
        boolean z = false;
        if (list != null && !list.isEmpty()) {
            String valueOf = String.valueOf(ListProtector.get(list, 0));
            HeliosEnvImpl heliosEnvImpl = HeliosEnvImpl.get();
            o.LJIIIIZZ(heliosEnvImpl, "HeliosEnvImpl.get()");
            Iterator<FrequencyConfig> it = heliosEnvImpl.LJIIJ.frequencyConfigs.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                FrequencyConfig next = it.next();
                if (o.LJ(next.name, valueOf)) {
                    if (next != null) {
                        Iterator it2 = C47261Igj.LJJIJ(next).iterator();
                        loop1: while (true) {
                            z = false;
                            while (it2.hasNext()) {
                                boolean LIZ = C60732Zx.LIZ((FrequencyConfig) it2.next());
                                if (z || LIZ) {
                                    z = true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return Boolean.valueOf(z);
    }
}
