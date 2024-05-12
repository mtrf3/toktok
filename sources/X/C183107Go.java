package X;

import Y.IDhS67S0200000_3;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct;
import com.ss.android.ugc.aweme.upvote.api.UpvoteApi;
import com.ss.android.ugc.aweme.upvote.model.UpvoteBatchPublishResponse;
import com.ss.android.ugc.aweme.upvote.model.UpvotePublishResponse;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.7Go, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C183107Go implements InterfaceC183057Gj {
    public static UpvotePublishResponse LJJJIL(UpvotePublishResponse upvotePublishResponse) {
        UpvoteStruct upvoteStruct = upvotePublishResponse.upvote;
        if (upvoteStruct == null || upvoteStruct.getUser() != null) {
            return upvotePublishResponse;
        }
        return new UpvotePublishResponse(UpvoteStruct.copy$default(upvoteStruct, null, null, null, 0L, 0, 0, ((RBX) HG3.LJIILL()).getCurUser(), false, 0, false, null, 0, false, null, null, false, null, 0L, false, 0, 0, null, false, null, null, false, 67108799, null), upvotePublishResponse.rethinkPopup);
    }

    @Override // X.InterfaceC183057Gj
    public final AbstractC73638SvC<UpvoteBatchPublishResponse> LJLIL(List<String> list) {
        UpvoteApi upvoteApi = UpvoteApi.LIZIZ;
        String LIZJ = C75792yF.LIZJ(list);
        o.LJIIIIZZ(LIZJ, "toJson(itemIds)");
        return upvoteApi.publishUpvoteBatch(LIZJ);
    }

    @Override // X.InterfaceC183057Gj
    public final AbstractC73638SvC<BaseResponse> deleteUpvote(String str) {
        return UpvoteApi.LIZIZ.deleteUpvote(str);
    }

    @Override // X.InterfaceC183057Gj
    public final C73634Sv8 LJJLI(String itemId, String str, List list, List list2) {
        List list3;
        o.LJIIIZ(itemId, "itemId");
        if (list == null) {
            list = C61878OQg.INSTANCE;
        }
        String LIZJ = C75792yF.LIZJ(list);
        if (list2 == null) {
            list3 = C61878OQg.INSTANCE;
        } else {
            list3 = list2;
        }
        return UpvoteApi.LIZIZ.publishUpvote(itemId, str, null, LIZJ, C75792yF.LIZJ(list3)).LJIJI(new IDhS67S0200000_3(list2, this, 2));
    }

    @Override // X.InterfaceC183057Gj
    public final C73634Sv8 LJLJL(String itemId, String str, List list, List list2) {
        List list3;
        o.LJIIIZ(itemId, "itemId");
        if (list == null) {
            list = C61878OQg.INSTANCE;
        }
        String LIZJ = C75792yF.LIZJ(list);
        if (list2 == null) {
            list3 = C61878OQg.INSTANCE;
        } else {
            list3 = list2;
        }
        return UpvoteApi.LIZIZ.publishUpvote(itemId, str, Boolean.TRUE, LIZJ, C75792yF.LIZJ(list3)).LJIJI(new IDhS67S0200000_3(list2, this, 3));
    }
}
