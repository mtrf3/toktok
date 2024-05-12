package X;

import com.bytedance.android.livesdk.adminsetting.LiveManageListFragment;

/* loaded from: classes6.dex */
public final class BER implements BEW {
    public final /* synthetic */ LiveManageListFragment LIZ;

    public BER(LiveManageListFragment liveManageListFragment) {
        this.LIZ = liveManageListFragment;
    }

    @Override // X.BEW
    public final void LIZ(BEU beu) {
        this.LIZ.onEvent(beu);
    }

    @Override // X.BEW
    public final void LIZIZ(BEV bev) {
        this.LIZ.onEvent(bev);
    }
}
