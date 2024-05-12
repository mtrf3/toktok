package X;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.OCe, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61512OCe extends OEL<Void> {
    public final /* synthetic */ java.util.Set LIZJ;

    @Override // X.OEL
    public final int LIZIZ() {
        return 5;
    }

    @Override // X.OEL
    public final void LIZ() {
        for (String accessKey : this.LIZJ) {
            o.LJFF(accessKey, "accessKey");
            ConcurrentHashMap LJI = C61511OCd.LJI(accessKey);
            if (LJI != null) {
                ((ConcurrentHashMap) C61511OCd.LIZ).put(accessKey, LJI);
            }
        }
    }

    public C61512OCe(java.util.Set set) {
        this.LIZJ = set;
    }
}
