package X;

import com.bytedance.android.live.usermanage.model.UserManageExtra;
import com.bytedance.android.livesdk.usermanage.MuteApi;

/* renamed from: X.BFc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28464BFc implements MuteApi {
    @Override // com.bytedance.android.livesdk.usermanage.MuteApi
    public final AbstractC73672Svk<C28467BFf<Object>> unmute(long j, long j2, String str) {
        return AbstractC73672Svk.LJJIJIL(new C28467BFf());
    }

    @Override // com.bytedance.android.livesdk.usermanage.MuteApi
    public final AbstractC73672Svk<C28465BFd> getMuteList(long j, int i, int i2, String str) {
        C28465BFd c28465BFd = new C28465BFd();
        c28465BFd.data = C61878OQg.INSTANCE;
        c28465BFd.extra = new UserManageExtra();
        return AbstractC73672Svk.LJJIJIL(c28465BFd);
    }

    @Override // com.bytedance.android.livesdk.usermanage.MuteApi
    public final AbstractC73672Svk<C28467BFf<Object>> mute(long j, long j2, long j3, String str, long j4) {
        return AbstractC73672Svk.LJJIJIL(new C28467BFf());
    }
}
