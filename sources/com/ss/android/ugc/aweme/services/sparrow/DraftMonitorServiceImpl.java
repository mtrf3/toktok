package com.ss.android.ugc.aweme.services.sparrow;

import X.C42354Gjm;
import X.H7B;
import X.InterfaceC41977Gdh;
import com.ss.android.ugc.aweme.draft.model.DraftRestoreResult;
import com.ss.android.ugc.aweme.draft.model.DraftSaveResult;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class DraftMonitorServiceImpl implements InterfaceC41977Gdh {
    @Override // X.InterfaceC41977Gdh
    public void reportDraftRestoreFailureToJinx(DraftRestoreResult restoreResult) {
        o.LJIIIZ(restoreResult, "restoreResult");
        C42354Gjm.LIZ();
        H7B.LIZ("jinx save draft failure report disabled.");
    }

    @Override // X.InterfaceC41977Gdh
    public void reportDraftSaveFailureToJinx(DraftSaveResult saveResult) {
        o.LJIIIZ(saveResult, "saveResult");
        C42354Gjm.LIZ();
        H7B.LIZ("jinx save draft failure report disabled.");
    }
}
