package X;

import com.ss.android.ugc.aweme.services.external.IAVDraftService;
import com.ss.android.ugc.profile.platform.business.tabs.container.MineAwemePagerAssemV2;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: X.GyO, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class CallableC43260GyO<V> implements Callable {
    public final /* synthetic */ IAVDraftService LJLIL;
    public final /* synthetic */ MineAwemePagerAssemV2 LJLILLLLZI;

    public CallableC43260GyO(IAVDraftService iAVDraftService, MineAwemePagerAssemV2 mineAwemePagerAssemV2) {
        this.LJLIL = iAVDraftService;
        this.LJLILLLLZI = mineAwemePagerAssemV2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        List<String> queryAllDraftsCreationIdFromDB = this.LJLIL.queryAllDraftsCreationIdFromDB(new GPK(true, false, GP9.ALL));
        List<String> genCreationIdsOfVisibleDraft = this.LJLIL.genCreationIdsOfVisibleDraft();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("-> MineAwemePagerAssemV2 -> draftInDBList: ");
        LIZ.append(this.LJLILLLLZI.h6(queryAllDraftsCreationIdFromDB));
        C221018lt.LJFF("monitorDraftLost ", X1D.LIZIZ(LIZ));
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("-> MineAwemePagerAssemV2 -> visibleDraftList: ");
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
