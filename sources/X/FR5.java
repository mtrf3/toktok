package X;

import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class FR5 extends AbstractC43178Gx4 {
    @Override // X.AbstractC43178Gx4
    public final boolean LIZ(String type) {
        o.LJIIIZ(type, "type");
        return false;
    }

    @Override // X.AbstractC43178Gx4
    public final String LIZJ() {
        return "published_vids";
    }

    @Override // X.AbstractC43178Gx4
    public final long LIZLLL() {
        return TimeUnit.HOURS.toMillis(2L);
    }

    @Override // X.AbstractC43178Gx4
    public final String LIZIZ() {
        List<String> lastPublishedVids = AVExternalServiceImpl.LIZ().publishService().getLastPublishedVids();
        o.LJIIIIZZ(lastPublishedVids, "get().getService(IExtern…rvice().lastPublishedVids");
        return ORZ.LLD(lastPublishedVids, ",", "[", "]", null, 56);
    }
}
