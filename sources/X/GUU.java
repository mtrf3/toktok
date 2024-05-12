package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GUU {
    public volatile PublishModel LIZ;
    public final String LIZIZ;
    public final List<GUX> LIZJ;
    public volatile AbstractC41437GOb LIZLLL;
    public long LJ;
    public long LJFF;
    public GUQ LJI;

    public final void LIZ(AbstractC41437GOb value) {
        GUQ guq;
        C07950Sx c07950Sx;
        o.LJIIIZ(value, "value");
        this.LIZLLL = value;
        if ((value instanceof C41442GOg) && this.LJ == -1) {
            this.LJ = SystemClock.uptimeMillis();
        }
        if (!(this.LIZLLL instanceof C41442GOg) && (guq = this.LJI) != null && (c07950Sx = guq.LJLJJLL) != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("change state to:");
            LIZ.append(this.LIZLLL);
            c07950Sx.LIZJ(X1D.LIZIZ(LIZ));
        }
    }

    public GUU(GUQ guq, PublishModel publishModel) {
        o.LJIIIZ(publishModel, "publishModel");
        this.LIZ = publishModel;
        String str = this.LIZ.expectPublishTaskId;
        this.LIZIZ = str == null ? AnonymousClass629.LIZ("randomUUID().toString()") : str;
        List<GUX> synchronizedList = Collections.synchronizedList(new ArrayList());
        o.LJIIIIZZ(synchronizedList, "synchronizedList(ArrayList<PublishCallback>())");
        this.LIZJ = synchronizedList;
        this.LIZLLL = GOT.LIZ;
        this.LJ = -1L;
        this.LJFF = -1L;
        this.LJI = guq;
    }
}
