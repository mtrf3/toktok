package X;

import com.bytedance.android.live.base.model.roomcomponents.RoomComponentsResponse;
import com.bytedance.android.livesdk.rank.model.RankEntranceV3Response;
import java.util.List;

/* loaded from: classes6.dex */
public final class CYV implements B7J {
    public final /* synthetic */ CYY LIZ;

    public CYV(CYY cyy) {
        this.LIZ = cyy;
    }

    @Override // X.B7J
    public final void LIZ(C32201Oe c32201Oe) {
        RoomComponentsResponse roomComponentsResponse;
        Long l;
        List<RankEntranceV3Response.EntranceGroup> list;
        if (c32201Oe == null || c32201Oe.LJLILLLLZI != null || (roomComponentsResponse = c32201Oe.LJLIL) == null || roomComponentsResponse.rankingData == null || roomComponentsResponse == null || (l = roomComponentsResponse.rankingStatus) == null || l.longValue() != 1) {
            this.LIZ.LIZLLL();
            return;
        }
        RoomComponentsResponse roomComponentsResponse2 = c32201Oe.LJLIL;
        if (roomComponentsResponse2 == null || (list = roomComponentsResponse2.rankingData) == null) {
            return;
        }
        CYY cyy = this.LIZ;
        cyy.LJLJL.clear();
        cyy.LJFF(list);
        cyy.LJLJJI.setFirstScreenDone(true);
        cyy.LIZ();
    }
}
