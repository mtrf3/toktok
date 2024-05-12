package X;

import com.ss.android.ugc.playerkit.radar.IRadarTransmitter;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* renamed from: X.IfX, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47187IfX {
    public static final double LIZ = TimeUnit.SECONDS.toNanos(1);
    public static final /* synthetic */ int LIZIZ = 0;

    public static void LIZIZ(String groupName, String sectionName, boolean z) {
        o.LJIIIZ(groupName, "groupName");
        o.LJIIIZ(sectionName, "sectionName");
        LIZ(System.nanoTime(), groupName, sectionName, z);
        if (z) {
            IRadarTransmitter LJII = C46982IcE.LJII();
            if (LJII == null) {
                return;
            }
            LJII.tracer();
            return;
        }
        IRadarTransmitter LJII2 = C46982IcE.LJII();
        if (LJII2 == null) {
            return;
        }
        LJII2.tracer();
    }

    public static void LIZ(long j, String str, String str2, boolean z) {
        String str3;
        IRadarTransmitter LJII = C46982IcE.LJII();
        if (LJII == null || !LJII.localTraceEnabled()) {
            return;
        }
        if (z) {
            str3 = "B";
        } else {
            str3 = "E";
        }
        StringBuilder LJFF = C72972SkS.LJFF(str, '-');
        LJFF.append(str.hashCode());
        LJFF.append(" [001] ...1 ");
        LJFF.append(j / LIZ);
        LJFF.append(": tracing_mark_write: ");
        LJFF.append(str3);
        LJFF.append("|1212|");
        LJFF.append(str2);
        X1D.LIZIZ(LJFF);
    }
}
