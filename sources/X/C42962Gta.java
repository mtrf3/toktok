package X;

import Y.ARunnableS43S0100000_7;
import android.text.format.DateFormat;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.tools.draft.da.DBEvent;
import java.util.Calendar;
import java.util.TimeZone;
import kotlin.jvm.internal.o;

/* renamed from: X.Gta, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42962Gta {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C42963Gtb.LJLIL);

    public static Keva LIZLLL() {
        return (Keva) LIZ.getValue();
    }

    public static int LIZJ() {
        C60903NvH.LJIIJJI().getApplicationService().getClass();
        return (int) EF7.LJFF();
    }

    public static String LIZIZ(long j) {
        if (j <= 0) {
            return "";
        }
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        calendar.setTimeInMillis(j);
        return DateFormat.format("yyyy-MM-dd hh:mm:ss a", calendar).toString();
    }

    public static void LJFF(DBEvent dBEvent) {
        if (!C19N.LJ("record_draft_db_log", true)) {
            return;
        }
        GUL.LIZ.execute(new ARunnableS43S0100000_7(dBEvent, 53));
    }

    public static final void LIZ(String msg, boolean z) {
        o.LJIIIZ(msg, "msg");
        if (z) {
            return;
        }
        H78.LIZIZ("aweme-draft-monitor", msg);
    }

    public static final void LJ(String source, int i, AwemeDraft awemeDraft) {
        o.LJIIIZ(source, "source");
        if (o.LJ(source, "user_click")) {
            if (i <= 0) {
                C43150Gwc.LIZJ("draft_delete_error", String.valueOf(-400), null, 12);
            } else {
                C43150Gwc.LIZLLL("draft_delete_success");
            }
        }
        StringBuilder LIZIZ = C25620zW.LIZIZ("monitor draft delete: source=", source, ", primaryKey=");
        LIZIZ.append(awemeDraft.LIZJ());
        LIZ(X1D.LIZIZ(LIZIZ), true);
    }
}
