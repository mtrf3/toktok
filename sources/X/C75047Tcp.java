package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.anchor.MultiLiveAsAnchorListDialogV2;

/* renamed from: X.Tcp, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final /* synthetic */ class C75047Tcp extends TBS implements InterfaceC88472Yns<Long, Integer> {
    public C75047Tcp(Object obj) {
        super(1, obj, MultiLiveAsAnchorListDialogV2.class, "getRankByUid", "getRankByUid(J)Ljava/lang/Integer;", 0);
    }

    @Override // X.InterfaceC88472Yns
    public final Integer invoke(Long l) {
        return ((MultiLiveAsAnchorListDialogV2) this.receiver).LJJJJJ().get(Long.valueOf(l.longValue()));
    }
}
