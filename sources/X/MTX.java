package X;

import com.ss.android.ugc.aweme.notification.creator.model.TabSortCacheModel;
import com.ss.android.ugc.aweme.utils.JsonParseUtils;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes10.dex */
public final class MTX extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public static final MTX LJLIL = new MTX();

    public MTX() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("storeSortTypeList: ");
        CopyOnWriteArrayList<TabSortCacheModel> copyOnWriteArrayList = C2WH.LIZ;
        LIZ.append(copyOnWriteArrayList);
        C221018lt.LJFF("Creators_Inbox", X1D.LIZIZ(LIZ));
        C2WH.LIZ().storeString("sort_ids", JsonParseUtils.LIZLLL(copyOnWriteArrayList));
        return C76800UCe.LIZ;
    }
}
