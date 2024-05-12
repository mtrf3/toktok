package X;

import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GUN {
    public final boolean LIZ = true;

    public final boolean LIZ(PublishModel last, PublishModel current) {
        o.LJIIIZ(last, "last");
        o.LJIIIZ(current, "current");
        if (o.LJ(last.creationId, current.creationId) || this.LIZ) {
            return true;
        }
        return false;
    }
}
