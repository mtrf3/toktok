package X;

import com.bytedance.android.livesdk.model.FeedItem;

/* renamed from: X.BNz, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C28695BNz extends AbstractC03160Am<FeedItem> {
    public C28695BNz(int i) {
    }

    @Override // X.AbstractC03160Am
    public final boolean LIZ(FeedItem feedItem, FeedItem feedItem2) {
        int i = feedItem.type;
        if (i == feedItem2.type && i == 1003) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC03160Am
    public final boolean LIZIZ(FeedItem feedItem, FeedItem feedItem2) {
        int i = feedItem.type;
        if (i == feedItem2.type && i == 1003) {
            return true;
        }
        return false;
    }
}
