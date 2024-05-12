package X;

import com.bytedance.android.livesdk.feed.feed.FeedDataKey;
import com.bytedance.android.livesdk.feed.viewmodel.BaseFeedDataViewModel;

/* renamed from: X.BNw, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28692BNw implements InterfaceC28693BNx {
    public final /* synthetic */ BO5 LIZ;

    @Override // X.InterfaceC28693BNx
    public final FeedDataKey LIZ() {
        BaseFeedDataViewModel baseFeedDataViewModel = this.LIZ.LIZJ;
        if (baseFeedDataViewModel.LLFII == null) {
            baseFeedDataViewModel.LLFII = baseFeedDataViewModel.iv0();
        }
        return baseFeedDataViewModel.LLFII;
    }

    public C28692BNw(BO5 bo5) {
        this.LIZ = bo5;
    }
}
