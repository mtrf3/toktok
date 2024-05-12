package X;

import com.ss.android.ugc.aweme.feed.model.FeedItemList;

/* renamed from: X.IwT, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48237IwT extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C48237IwT LJLIL = new C48237IwT();

    public C48237IwT() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        FeedItemList feedItemList = C48236IwS.LIZ;
        if (feedItemList != null) {
            z = feedItemList.isNonPersonalized;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
