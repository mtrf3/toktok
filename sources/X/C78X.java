package X;

import android.util.LruCache;
import com.ss.android.ugc.aweme.comment.viewerlist.model.ViewerListResponse;

/* renamed from: X.78X, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C78X extends AbstractC65781Prl implements InterfaceC65784Pro<LruCache<String, ViewerListResponse>> {
    public static final C78X LJLIL = new C78X();

    public C78X() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final LruCache<String, ViewerListResponse> invoke() {
        return new LruCache<>(20);
    }
}
