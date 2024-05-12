package X;

import com.bytedance.android.live.base.model.feed.FeedExtra;
import com.bytedance.android.live.network.response.BaseListResponse;
import kotlin.jvm.internal.o;

/* renamed from: X.BLd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28621BLd<T, R> implements InterfaceC48038ItG {
    @Override // X.InterfaceC48038ItG
    public final Object apply(Object obj) {
        BaseListResponse response = (BaseListResponse) obj;
        o.LJIIIZ(response, "response");
        return new BLU(new C28619BLb(response.data, (FeedExtra) response.extra), response.LIZ, response.LIZIZ, response.LIZJ, "click", "enter_hashtag_loadmore");
    }
}
