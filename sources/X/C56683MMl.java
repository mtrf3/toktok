package X;

import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.notice.repo.list.bean.InboxEntranceCell;
import com.ss.android.ugc.aweme.notice.repo.list.bean.InboxEntranceResponse;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.MMl, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56683MMl extends AbstractC56684MMm {
    public static boolean LJII;
    public static boolean LJIIIIZZ;
    public static int LJIIJJI;
    public static final C56683MMl LJI = new C56683MMl();
    public static String LJIIIZ = "";
    public static String LJIIJ = "";

    @Override // X.AbstractC56684MMm
    public final String LJ() {
        return "tt_inbox_entrance_api_monitor";
    }

    @Override // X.AbstractC56684MMm
    public final JSONObject LIZ() {
        C198517qh c198517qh = new C198517qh();
        c198517qh.LIZ.put("status", Integer.valueOf(this.LIZIZ));
        c198517qh.LIZ.put("status_code", Integer.valueOf(this.LIZJ));
        c198517qh.LIZ.put("error_code", Integer.valueOf(this.LIZLLL));
        c198517qh.LIZ.put("position", this.LJ);
        c198517qh.LIZ.put("is_first_refresh", Boolean.valueOf(LJII));
        c198517qh.LIZ.put("is_for_cache", Boolean.valueOf(LJIIIIZZ));
        return c198517qh.LJ();
    }

    @Override // X.AbstractC56684MMm
    public final JSONObject LIZIZ() {
        C198517qh c198517qh = new C198517qh();
        c198517qh.LIZ.put("experiments", LJIIIZ);
        c198517qh.LIZ.put("additional_param", LJIIJ);
        c198517qh.LIZ.put("log_id", this.LJFF);
        return c198517qh.LJ();
    }

    @Override // X.AbstractC56684MMm
    public final JSONObject LIZJ() {
        C198517qh c198517qh = new C198517qh();
        c198517qh.LIZ.put("entrance_cells_count", Integer.valueOf(LJIIJJI));
        return c198517qh.LJ();
    }

    @Override // X.AbstractC56684MMm
    public final void LIZLLL() {
        super.LIZLLL();
        LJIIJJI = 0;
        LJIIIZ = "";
        LJIIJ = "";
        LJII = false;
        LJIIIIZZ = false;
    }

    public final void LJIIIIZZ(InboxEntranceResponse inboxEntranceResponse) {
        boolean z;
        o.LJIIIZ(inboxEntranceResponse, "inboxEntranceResponse");
        if (LJI()) {
            List<InboxEntranceCell> entranceCells = inboxEntranceResponse.getEntranceCells();
            int i = 0;
            if (entranceCells == null || entranceCells.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            String str = null;
            if (z || inboxEntranceResponse.error_code != 0) {
                C56683MMl c56683MMl = LJI;
                c56683MMl.LIZIZ = 0;
                c56683MMl.LIZLLL = inboxEntranceResponse.error_code;
                c56683MMl.LIZJ = inboxEntranceResponse.status_code;
                BaseResponse.ServerTimeExtra serverTimeExtra = inboxEntranceResponse.extra;
                if (serverTimeExtra != null) {
                    str = serverTimeExtra.logid;
                }
                c56683MMl.LJFF = str;
            } else {
                C56683MMl c56683MMl2 = LJI;
                c56683MMl2.LIZIZ = 1;
                c56683MMl2.LIZJ = inboxEntranceResponse.status_code;
                c56683MMl2.LIZLLL = 0;
                BaseResponse.ServerTimeExtra serverTimeExtra2 = inboxEntranceResponse.extra;
                if (serverTimeExtra2 != null) {
                    str = serverTimeExtra2.logid;
                }
                c56683MMl2.LJFF = str;
                List<InboxEntranceCell> entranceCells2 = inboxEntranceResponse.getEntranceCells();
                if (entranceCells2 != null) {
                    i = entranceCells2.size();
                }
                LJIIJJI = i;
            }
            LJII();
            return;
        }
        LIZLLL();
    }
}
