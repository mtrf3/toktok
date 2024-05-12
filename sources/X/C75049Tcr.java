package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.anchor.MultiLiveAsAnchorListDialogV2;

/* renamed from: X.Tcr, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final /* synthetic */ class C75049Tcr extends TBS implements InterfaceC88472Yns<Long, Long> {
    public C75049Tcr(Object obj) {
        super(1, obj, MultiLiveAsAnchorListDialogV2.class, "getCoinsByUid", "getCoinsByUid(J)Ljava/lang/Long;", 0);
    }

    @Override // X.InterfaceC88472Yns
    public final Long invoke(Long l) {
        return ((MultiLiveAsAnchorListDialogV2) this.receiver).LJJJJIZL().get(Long.valueOf(l.longValue()));
    }
}
