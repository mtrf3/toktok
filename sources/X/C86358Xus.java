package X;

import com.bytedance.android.livesdk.live.model.FilterInfoData;
import com.ss.android.ugc.aweme.feed.adapter.FollowLiveVideoViewHolder;

/* renamed from: X.Xus, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86358Xus implements BOM {
    public final /* synthetic */ FollowLiveVideoViewHolder LIZ;

    @Override // X.BOM
    public final void onFailed() {
    }

    public C86358Xus(FollowLiveVideoViewHolder followLiveVideoViewHolder) {
        this.LIZ = followLiveVideoViewHolder;
    }

    @Override // X.BOM
    public final void LIZ(FilterInfoData filterInfoData, boolean z) {
        FollowLiveVideoViewHolder followLiveVideoViewHolder = this.LIZ;
        if (z != followLiveVideoViewHolder.LLZZZZ) {
            followLiveVideoViewHolder.LLZZZZ = z;
            followLiveVideoViewHolder.LLLILZ.jv0(Boolean.valueOf(!z), "live_has_end");
            FollowLiveVideoViewHolder followLiveVideoViewHolder2 = this.LIZ;
            if (followLiveVideoViewHolder2.a) {
                followLiveVideoViewHolder2.LLLLL();
            }
        }
        if (!z) {
            this.LIZ.LLLLLLLLLL(false);
        }
    }
}
