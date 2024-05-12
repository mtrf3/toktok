package X;

import com.ss.android.ugc.aweme.ml.ab.SmartMusicDetailPreloadExperiment;
import com.ss.android.ugc.aweme.ml.ab.SmartPrerenderExperiment;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class J3O extends C46687ITz {
    public static final J3O LIZJ = new J3O();

    @Override // X.C46687ITz
    public final AbstractC48510J2c LIZ(String serviceName) {
        o.LJIIIZ(serviceName, "serviceName");
        ConcurrentHashMap<String, C48523J2p> concurrentHashMap = J3P.LIZ;
        C48523J2p c48523J2p = concurrentHashMap.get(serviceName);
        if (c48523J2p != null) {
            return c48523J2p;
        }
        C48523J2p c48523J2p2 = new C48523J2p(serviceName);
        concurrentHashMap.put(serviceName, c48523J2p2);
        return c48523J2p2;
    }

    @Override // X.C46687ITz
    public final AbstractC48510J2c LIZIZ(String str) {
        if (o.LJ(str, SmartMusicDetailPreloadExperiment.SCENE)) {
            return J3R.LIZIZ;
        }
        if (o.LJ(str, SmartPrerenderExperiment.SCENE)) {
            return J3Q.LIZIZ;
        }
        return this.LIZ.get(str);
    }
}
