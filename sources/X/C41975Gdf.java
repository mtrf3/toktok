package X;

import Y.ACallableS110S0100000_7;
import com.ss.android.ugc.aweme.draft.model.DraftDeleteResult;
import com.ss.android.ugc.aweme.draft.model.DraftRestoreResult;
import com.ss.android.ugc.aweme.draft.model.DraftSaveResult;
import kotlin.jvm.internal.o;

/* renamed from: X.Gdf, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41975Gdf implements GPT {
    @Override // X.GPT
    public final void LIZ(DraftDeleteResult draftDeleteResult) {
        C145995oB LIZIZ = GFJ.LIZIZ(!draftDeleteResult.isSuc() ? 1 : 0, "status");
        LIZIZ.LJFF(C44384HbQ.LJJJJJL(draftDeleteResult));
        FMX.LJIIL("draft_delete", LIZIZ.LIZ);
    }

    @Override // X.GPT
    public final void LIZIZ(DraftSaveResult saveResult) {
        o.LJIIIZ(saveResult, "saveResult");
        C41976Gdg.LIZJ(saveResult);
    }

    @Override // X.GPT
    public final void LIZJ(DraftDeleteResult draftDeleteResult) {
        C145995oB LIZIZ = GFJ.LIZIZ(!draftDeleteResult.isSuc() ? 1 : 0, "status");
        LIZIZ.LJFF(C44384HbQ.LJJJJJL(draftDeleteResult));
        FMX.LJIIL("aweme_draft_delete_fail_rate", LIZIZ.LIZ);
    }

    @Override // X.GPT
    public final void LIZLLL(DraftRestoreResult restoreResult) {
        o.LJIIIZ(restoreResult, "restoreResult");
        C145995oB LIZIZ = GFJ.LIZIZ(!restoreResult.isSuc() ? 1 : 0, "status");
        LIZIZ.LJFF(C44384HbQ.LJJJJL(restoreResult));
        FMX.LJIIL("draft_load", LIZIZ.LIZ);
        if (restoreResult.isSuc()) {
            return;
        }
        C10K.LIZJ(new ACallableS110S0100000_7(restoreResult, 40));
    }

    @Override // X.GPT
    public final void LJ(DraftSaveResult saveResult) {
        o.LJIIIZ(saveResult, "saveResult");
        C145995oB LIZIZ = GFJ.LIZIZ(!saveResult.isSuc() ? 1 : 0, "status");
        LIZIZ.LJFF(C44384HbQ.LJJJJLI(saveResult));
        FMX.LJIIL("draft_save", LIZIZ.LIZ);
        if (saveResult.isSuc()) {
            return;
        }
        C10K.LIZJ(new ACallableS110S0100000_7(saveResult, 41));
    }

    @Override // X.GPT
    public final void LJFF(DraftRestoreResult restoreResult) {
        o.LJIIIZ(restoreResult, "restoreResult");
        C41976Gdg.LIZIZ(restoreResult);
    }
}
