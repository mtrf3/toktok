package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.end.newaudienceend.LiveNewAudienceEndFragment;

/* renamed from: X.BFz, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28487BFz implements InterfaceC29613Bjl {
    public final /* synthetic */ User LIZ;
    public final /* synthetic */ LiveNewAudienceEndFragment LIZIZ;

    @Override // X.InterfaceC29613Bjl
    public final void LIZIZ() {
        this.LIZIZ.LLIIIILZ = false;
    }

    @Override // X.InterfaceC29613Bjl
    public final void LIZ(int i) {
        this.LIZIZ.wl(i);
        this.LIZ.getFollowInfo().setPushStatus(i);
    }

    public C28487BFz(LiveNewAudienceEndFragment liveNewAudienceEndFragment, User user) {
        this.LIZIZ = liveNewAudienceEndFragment;
        this.LIZ = user;
    }
}
