package X;

import com.ss.android.ugc.aweme.draft.model.DraftRestoreResult;
import com.ss.android.ugc.aweme.draft.model.DraftSaveResult;
import kotlin.jvm.internal.o;

/* renamed from: X.Gdg, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41976Gdg {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZIZ(DraftRestoreResult restoreResult) {
        o.LJIIIZ(restoreResult, "restoreResult");
        int i = !restoreResult.isSuc() ? 1 : 0;
        C6BK c6bk = new C6BK();
        c6bk.LIZ.putAll(C44384HbQ.LJJJJL(restoreResult));
        C43882HKc.LIZLLL(i, "aweme_draft_load_fail_rate", c6bk.LJ(), true);
        GPR.LIZIZ("DraftLoad", C44384HbQ.LLIIII(restoreResult, 2));
        if (!restoreResult.isSuc()) {
            C6BK c6bk2 = new C6BK();
            c6bk2.LIZ.putAll(C44384HbQ.LJJJJL(restoreResult));
            C43882HKc.LIZLLL(i, "aweme_draft_invalid", c6bk2.LJ(), true);
        }
        C60903NvH.LJIIJJI().LJJIIJ();
        int errorCode = restoreResult.getErrorCode();
        if (errorCode == 0) {
            C43150Gwc.LIZLLL("draft_load_success");
        } else {
            C43150Gwc.LIZJ("draft_load_error", String.valueOf(errorCode), null, 12);
        }
    }

    public static void LIZJ(DraftSaveResult saveResult) {
        o.LJIIIZ(saveResult, "saveResult");
        int i = !saveResult.isSuc() ? 1 : 0;
        C6BK c6bk = new C6BK();
        c6bk.LIZ.putAll(C44384HbQ.LJJJJLI(saveResult));
        C43882HKc.LIZLLL(i, "aweme_draft_create_fail_rate", c6bk.LJ(), true);
        GPR.LIZIZ("DraftSave", C44384HbQ.LLIIII(saveResult, 2));
        C60903NvH.LJIIJJI().LJJIIJ();
        int errorCode = saveResult.getErrorCode();
        if (errorCode == 0) {
            C43150Gwc.LIZLLL("draft_save_success");
        } else {
            C43150Gwc.LIZJ("draft_save_error", String.valueOf(errorCode), null, 12);
        }
    }

    public static void LIZ(Exception exc, boolean z) {
        String str = null;
        if (z) {
            C43882HKc.LIZLLL(0, "draft_list_load_fail_rate", null, true);
            return;
        }
        C6BK c6bk = new C6BK();
        if (exc != null) {
            str = exc.getMessage();
        }
        c6bk.LIZ.put("exception", str);
        C43882HKc.LIZLLL(1, "draft_list_load_fail_rate", c6bk.LJ(), true);
    }
}
