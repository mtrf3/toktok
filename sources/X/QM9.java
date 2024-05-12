package X;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class QM9 implements QMF {
    public Object LJLIL;

    @Override // X.QME
    public final /* bridge */ /* synthetic */ Object a() {
        return new C67560QfM((C67555QfH) ((QME) this.LJLIL).a());
    }

    public QM9(int i) {
        if (i != 2) {
            if (i != 4) {
                return;
            }
            this.LJLIL = new HashMap();
            return;
        }
        this.LJLIL = new ConcurrentHashMap();
    }

    public /* synthetic */ QM9(String segmentId) {
        o.LJIIIZ(segmentId, "segmentId");
        this.LJLIL = segmentId;
    }

    public /* synthetic */ QM9(Object obj) {
        this.LJLIL = obj;
    }

    public final void LIZ(String str, String str2) {
        ((java.util.Map) this.LJLIL).put(str, str2);
    }
}
