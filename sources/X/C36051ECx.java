package X;

import com.ss.android.ugc.aweme.ecommerce.ug.feedeccard.repository.api.FeedEcCardApi;

/* renamed from: X.ECx, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36051ECx extends AbstractC65781Prl implements InterfaceC65784Pro<FeedEcCardApi> {
    public static final C36051ECx LJLIL = new C36051ECx();

    public C36051ECx() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.ecommerce.ug.feedeccard.repository.api.FeedEcCardApi, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final FeedEcCardApi invoke() {
        return C67332kb.LIZ().create(FeedEcCardApi.class);
    }
}
