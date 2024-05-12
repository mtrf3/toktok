package X;

import com.bytedance.android.live.usermanage.model.UserManageExtra;
import com.bytedance.android.livesdk.usermanage.KickOutApi;

/* renamed from: X.BFb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28463BFb implements KickOutApi {
    @Override // com.bytedance.android.livesdk.usermanage.KickOutApi
    public final AbstractC73672Svk<C28467BFf<C76800UCe>> kickOut(long j, long j2) {
        return AbstractC73672Svk.LJJIJIL(new C28467BFf());
    }

    @Override // com.bytedance.android.livesdk.usermanage.KickOutApi
    public final AbstractC73672Svk<C28467BFf<C76800UCe>> unKickOut(long j, long j2) {
        return AbstractC73672Svk.LJJIJIL(new C28467BFf());
    }

    @Override // com.bytedance.android.livesdk.usermanage.KickOutApi
    public final AbstractC73672Svk<C28465BFd> getKickedOutList(long j, int i, int i2, String str) {
        C28465BFd c28465BFd = new C28465BFd();
        c28465BFd.data = C61878OQg.INSTANCE;
        c28465BFd.extra = new UserManageExtra();
        return AbstractC73672Svk.LJJIJIL(c28465BFd);
    }
}
