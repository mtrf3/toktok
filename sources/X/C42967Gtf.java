package X;

import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* renamed from: X.Gtf, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42967Gtf extends AbstractC43178Gx4 {
    @Override // X.AbstractC43178Gx4
    public final boolean LIZ(String type) {
        o.LJIIIZ(type, "type");
        return false;
    }

    @Override // X.AbstractC43178Gx4
    public final String LIZJ() {
        return "publisher_event";
    }

    @Override // X.AbstractC43178Gx4
    public final long LIZLLL() {
        return TimeUnit.HOURS.toMillis(2L);
    }

    @Override // X.AbstractC43178Gx4
    public final String LIZIZ() {
        String publisherEventAsJSON = AVExternalServiceImpl.LIZ().publishService().getPublisherEventAsJSON();
        o.LJIIIIZZ(publisherEventAsJSON, "publishService.publisherEventAsJSON");
        return publisherEventAsJSON;
    }
}
