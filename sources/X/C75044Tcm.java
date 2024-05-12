package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.anchor.MultiLiveAsAnchorListDialogV2;
import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* renamed from: X.Tcm, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final /* synthetic */ class C75044Tcm extends TBS implements InterfaceC65784Pro<C75060Td2> {
    public C75044Tcm(Object obj) {
        super(0, obj, MultiLiveAsAnchorListDialogV2.class, "onReminderInfoGet", "onReminderInfoGet()Lcom/bytedance/android/live/liveinteract/multiguestv3/main/userinfo/anchor/model/RevenueInfo;", 0);
    }

    @Override // X.InterfaceC65784Pro
    public final C75060Td2 invoke() {
        AbstractC74727TUl LIZ;
        String str;
        long j;
        String str2;
        AbstractC74727TUl LIZ2;
        AbstractC74727TUl LIZ3;
        Long LJIILIIL;
        AbstractC74727TUl LIZ4;
        MultiLiveAsAnchorListDialogV2 multiLiveAsAnchorListDialogV2 = (MultiLiveAsAnchorListDialogV2) this.receiver;
        C75060Td2 c75060Td2 = multiLiveAsAnchorListDialogV2.LLJIJIL;
        if (c75060Td2 == null) {
            InterfaceC31805Ce1 LJJJJJL = multiLiveAsAnchorListDialogV2.LJJJJJL();
            if (LJJJJJL != null && (LIZ = LJJJJJL.LIZ()) != null && LIZ.LJIILL() != null) {
                InterfaceC31805Ce1 LJJJJJL2 = multiLiveAsAnchorListDialogV2.LJJJJJL();
                if (LJJJJJL2 == null || (LIZ4 = LJJJJJL2.LIZ()) == null || (str = LIZ4.LJIILL()) == null) {
                    str = CardStruct.IStatusCode.DEFAULT;
                }
                InterfaceC31805Ce1 LJJJJJL3 = multiLiveAsAnchorListDialogV2.LJJJJJL();
                if (LJJJJJL3 != null && (LIZ3 = LJJJJJL3.LIZ()) != null && (LJIILIIL = LIZ3.LJIILIIL()) != null) {
                    j = LJIILIIL.longValue();
                } else {
                    j = 0;
                }
                InterfaceC31805Ce1 LJJJJJL4 = multiLiveAsAnchorListDialogV2.LJJJJJL();
                if (LJJJJJL4 == null || (LIZ2 = LJJJJJL4.LIZ()) == null || (str2 = LIZ2.LJIILLIIL()) == null) {
                    str2 = "";
                }
                C75060Td2 c75060Td22 = new C75060Td2(str, j, str2);
                multiLiveAsAnchorListDialogV2.LLJIJIL = c75060Td22;
                return c75060Td22;
            }
            return null;
        }
        return c75060Td2;
    }
}
