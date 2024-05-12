package X;

import android.database.Cursor;
import com.ss.android.ugc.aweme.services.external.IAVDraftFeedbackService;
import defpackage.b1;
import defpackage.i0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GPS implements IAVDraftFeedbackService {
    @Override // com.ss.android.ugc.aweme.services.external.IAVDraftFeedbackService
    public final String getDBCreationTime() {
        return C42962Gta.LIZIZ(C42962Gta.LIZLLL().getLong("short_creation_time", -1L));
    }

    @Override // com.ss.android.ugc.aweme.services.external.IAVDraftFeedbackService
    public final String getDBEventAsJSON() {
        String string = C42962Gta.LIZLLL().getString("db_event", "Unknown");
        o.LJIIIIZZ(string, "mRepo.getString(DB_EVENT, \"Unknown\")");
        return string;
    }

    @Override // com.ss.android.ugc.aweme.services.external.IAVDraftFeedbackService
    public final String getReadableDBPath() {
        String path = C43545H7d.LIZIZ().LIZIZ.getPath();
        o.LJIIIIZZ(path, "getInstance().readableDBPath");
        return path;
    }

    @Override // com.ss.android.ugc.aweme.services.external.IAVDraftFeedbackService
    public final List<Integer> queryUserDraftCounts(boolean z) {
        C43545H7d LIZIZ = C43545H7d.LIZIZ();
        LIZIZ.getClass();
        ArrayList arrayList = new ArrayList();
        String str = "select count(*) as user_draft_count from local_draft";
        if (!z) {
            StringBuilder LIZJ = b1.LIZJ("select count(*) as user_draft_count from local_draft", " where user_id != ");
            LIZJ.append(C60903NvH.LJIIJJI().getAccountService().getCurrentUserID());
            str = X1D.LIZIZ(LIZJ);
        }
        try {
            Cursor rawQuery = LIZIZ.LIZIZ.rawQuery(i0.LJFF(str, " group by user_id"), null);
            if (rawQuery != null) {
                try {
                    if (rawQuery.getCount() > 0) {
                        while (rawQuery.moveToNext()) {
                            arrayList.add(Integer.valueOf(rawQuery.getInt(rawQuery.getColumnIndex("user_draft_count"))));
                        }
                    }
                } finally {
                }
            }
            if (rawQuery != null) {
                rawQuery.close();
            }
        } catch (Exception e) {
            H78.LIZLLL("aweme-draft-monitor", e);
        }
        return arrayList;
    }
}
