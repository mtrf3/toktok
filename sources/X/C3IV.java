package X;

import android.util.LruCache;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteList;

/* renamed from: X.3IV, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3IV extends AbstractC65781Prl implements InterfaceC65784Pro<LruCache<String, UpvoteList>> {
    public static final C3IV LJLIL = new C3IV();

    public C3IV() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final LruCache<String, UpvoteList> invoke() {
        return new LruCache<>(100);
    }
}
