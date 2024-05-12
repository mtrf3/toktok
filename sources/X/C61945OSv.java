package X;

import com.ss.android.ugc.aweme.ecommerce.core.preloader.ImagePreloadExperiment;
import java.util.LinkedList;
import kotlin.jvm.internal.o;

/* renamed from: X.OSv, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61945OSv {
    public int LIZ = ImagePreloadExperiment.PRIORITY_DEFAULT;
    public final LinkedList<Integer> LIZIZ = new LinkedList<>();

    public final int LIZ() {
        if (this.LIZIZ.size() > 0) {
            Integer removeFirst = this.LIZIZ.removeFirst();
            o.LJIIIIZZ(removeFirst, "{\n            mRecycleList.removeFirst()\n        }");
            return removeFirst.intValue();
        }
        int i = this.LIZ;
        if (i <= 110000) {
            this.LIZ = i + 1;
            return i;
        }
        throw new IllegalStateException("Your viewType is too much,it's impossible in common");
    }
}
