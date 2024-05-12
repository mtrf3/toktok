package X;

import com.ss.android.ugc.aweme.profile.widgets.awemepager.MineAwemePagerAssem;
import com.ss.android.ugc.aweme.services.external.IAVDraftService;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: X.GyN, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class CallableC43259GyN<V> implements Callable {
    public final /* synthetic */ IAVDraftService LJLIL;
    public final /* synthetic */ MineAwemePagerAssem LJLILLLLZI;

    public CallableC43259GyN(IAVDraftService iAVDraftService, MineAwemePagerAssem mineAwemePagerAssem) {
        this.LJLIL = iAVDraftService;
        this.LJLILLLLZI = mineAwemePagerAssem;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        List<String> queryAllDraftsCreationIdFromDB = this.LJLIL.queryAllDraftsCreationIdFromDB(new GPK(true, false, GP9.ALL));
        List<String> genCreationIdsOfVisibleDraft = this.LJLIL.genCreationIdsOfVisibleDraft();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("-> draftInDBList: ");
        LIZ.append(this.LJLILLLLZI.h6(queryAllDraftsCreationIdFromDB));
        C221018lt.LJFF("monitorDraftLost ", X1D.LIZIZ(LIZ));
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("-> visibleDraftList: ");
        LIZ2.append(this.LJLILLLLZI.h6(genCreationIdsOfVisibleDraft));
        C221018lt.LJFF("monitorDraftLost ", X1D.LIZIZ(LIZ2));
        if (queryAllDraftsCreationIdFromDB.containsAll(genCreationIdsOfVisibleDraft)) {
            C221018lt.LJFF("monitorDraftLost ", "-> no draft lost");
            return null;
        }
        List<String> LLJILJILJ = ORZ.LLJILJILJ(genCreationIdsOfVisibleDraft);
        ArrayList arrayList = (ArrayList) LLJILJILJ;
        arrayList.removeAll(queryAllDraftsCreationIdFromDB);
        FMX.LJIIL("draft_item_show_error", C0RN.LIZJ(arrayList.size(), "lost_count", queryAllDraftsCreationIdFromDB.size(), "draft_cnt").LIZ);
        this.LJLIL.reportDraftLostException(LLJILJILJ);
        return null;
    }
}
