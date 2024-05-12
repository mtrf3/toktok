package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;

/* renamed from: X.FVi, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39078FVi {
    public static void LIZ() {
        if (FET.LIZ && ((Boolean) C34786Dl0.LIZ.getValue()).booleanValue() && ((Boolean) C34786Dl0.LJFF.getValue()).booleanValue()) {
            InterfaceC39076FVg LIZ = C39079FVj.LIZIZ.LIZ();
            if (LIZ instanceof C39080FVk) {
                C39080FVk c39080FVk = (C39080FVk) LIZ;
                FeedItemList feedItemList = c39080FVk.LIZ;
                if (c39080FVk.LIZLLL && feedItemList != null) {
                    FW5.LJIIJ(feedItemList, 0);
                    if (feedItemList.isFromUnusedFeed && !C78886Uxe.LJJIJ(feedItemList.getItems())) {
                        IWF.LJJLIIIIJ().LJJJJJ((Aweme) ListProtector.get(feedItemList.getItems(), 0), true, false);
                    }
                }
            }
        }
    }
}
