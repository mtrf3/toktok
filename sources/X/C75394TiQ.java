package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.show.audience.LiveShowAudienceWidget;
import com.bytedance.android.live.liveinteract.multiguestv3.main.show.common.LiveShowEndEvent;

/* renamed from: X.TiQ, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75394TiQ implements InterfaceC76578U3q {
    public final /* synthetic */ LiveShowAudienceWidget LIZ;

    @Override // X.InterfaceC76578U3q
    public final void LIZ() {
        this.LIZ.dataChannel.qv0(LiveShowEndEvent.class, C76800UCe.LIZ);
        this.LIZ.LJLZ();
    }

    public C75394TiQ(LiveShowAudienceWidget liveShowAudienceWidget) {
        this.LIZ = liveShowAudienceWidget;
    }
}
