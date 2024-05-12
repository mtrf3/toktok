package X;

import Y.ARunnableS43S0100000_7;
import android.text.format.DateFormat;
import com.ss.android.ugc.aweme.wavepublish.monitor.feedback.PublisherEvent;
import java.util.Calendar;
import java.util.TimeZone;
import kotlin.jvm.internal.o;

/* renamed from: X.Gti, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42970Gti {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C42971Gtj.LJLIL);

    public static int LIZIZ() {
        C60903NvH.LJIIJJI().getApplicationService().getClass();
        return (int) EF7.LJFF();
    }

    public static String LIZ(long j) {
        if (j <= 0) {
            return "";
        }
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        calendar.setTimeInMillis(j);
        return DateFormat.format("yyyy-MM-dd hh:mm:ss a", calendar).toString();
    }

    public static void LIZLLL(PublisherEvent publisherEvent) {
        if (!C19N.LJ("studio_record_publisher_event_log", true)) {
            return;
        }
        C38995FSd.LIZLLL().execute(new ARunnableS43S0100000_7(publisherEvent, 2));
    }

    public static final void LIZJ(String str, String creationId) {
        String str2 = str;
        o.LJIIIZ(creationId, "creationId");
        long currentTimeMillis = System.currentTimeMillis();
        if (str2 == null) {
            str2 = "";
        }
        LIZLLL(new PublisherEvent("click_post", str2, creationId, LIZIZ(), currentTimeMillis, LIZ(currentTimeMillis)));
    }
}
