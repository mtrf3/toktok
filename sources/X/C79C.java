package X;

import android.util.LruCache;
import com.ss.android.ugc.aweme.comment.likelist.model.LikeListResponse;

/* renamed from: X.79C, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C79C extends AbstractC65781Prl implements InterfaceC65784Pro<LruCache<String, LikeListResponse>> {
    public static final C79C LJLIL = new C79C();

    public C79C() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final LruCache<String, LikeListResponse> invoke() {
        return new LruCache<>(3);
    }
}
