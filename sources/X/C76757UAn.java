package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.UAn, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76757UAn {
    public final C76786UBq LIZ;
    public final List<C76758UAo> LIZIZ;

    public C76757UAn(C76786UBq linkLayerSeqEventReporter) {
        o.LJIIIZ(linkLayerSeqEventReporter, "linkLayerSeqEventReporter");
        this.LIZ = linkLayerSeqEventReporter;
        this.LIZIZ = new ArrayList();
    }

    public final C76758UAo LIZ(U66 linker) {
        C76758UAo c76758UAo;
        o.LJIIIZ(linker, "linker");
        Iterator<C76758UAo> it = this.LIZIZ.iterator();
        while (true) {
            if (it.hasNext()) {
                c76758UAo = it.next();
                if (o.LJ(c76758UAo.LJLILLLLZI.get(), linker)) {
                    break;
                }
            } else {
                c76758UAo = null;
                break;
            }
        }
        return c76758UAo;
    }
}
