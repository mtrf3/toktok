package X;

import com.ss.android.ugc.aweme.kids.recommendfeed.model.KFeedItemList;
import com.ss.android.ugc.tiktok.ConvertHelper;

/* renamed from: X.RWk, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69682RWk<T, R> implements InterfaceC48038ItG {
    public static final C69682RWk<T, R> LJLIL = new C69682RWk<>();

    @Override // X.InterfaceC48038ItG
    public final Object apply(Object obj) {
        try {
            KFeedItemList tiktok$kids$proto$tiktok_v1_kids_feed_response$$com$ss$android$ugc$aweme$kids$recommendfeed$model$KFeedItemList = ConvertHelper.tiktok$kids$proto$tiktok_v1_kids_feed_response$$com$ss$android$ugc$aweme$kids$recommendfeed$model$KFeedItemList((C69200RDw) obj, null);
            if (tiktok$kids$proto$tiktok_v1_kids_feed_response$$com$ss$android$ugc$aweme$kids$recommendfeed$model$KFeedItemList != null) {
                return tiktok$kids$proto$tiktok_v1_kids_feed_response$$com$ss$android$ugc$aweme$kids$recommendfeed$model$KFeedItemList;
            }
            throw new C69683RWl("Pb2Model: model is null", null);
        } catch (Throwable th) {
            throw new C69683RWl(null, th);
        }
    }
}
