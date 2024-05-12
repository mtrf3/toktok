package Y;

import X.AbstractC73672Svk;
import X.C183107Go;
import X.C213198Yh;
import X.C215498cz;
import X.C78939UyV;
import X.EnumC215748dO;
import X.InterfaceC48038ItG;
import X.TBW;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct;
import com.ss.android.ugc.aweme.repo.DanmakuApi;
import com.ss.android.ugc.aweme.repo.DanmakuDeleteResponse;
import com.ss.android.ugc.aweme.upvote.model.UpvotePublishResponse;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public class IDhS67S0200000_3 implements InterfaceC48038ItG {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC48038ItG
    public final Object apply(Object obj) {
        switch (this.$t) {
            case 0:
                return apply$0(this, obj);
            case 1:
                return apply$1(this, obj);
            case 2:
                return apply$2(this, obj);
            case 3:
                return apply$3(this, obj);
            default:
                return null;
        }
    }

    public static final Object apply$0(IDhS67S0200000_3 iDhS67S0200000_3, Object obj) {
        String it = (String) obj;
        o.LJIIIZ(it, "it");
        if (!o.LJ(it, CardStruct.IStatusCode.DEFAULT)) {
            DanmakuApi danmakuApi = ((C215498cz) iDhS67S0200000_3.l0).LIZ;
            int value = ((EnumC215748dO) iDhS67S0200000_3.l1).getValue();
            danmakuApi.getClass();
            return DanmakuApi.LIZIZ.deleteDanmaku(it, value);
        }
        DanmakuDeleteResponse danmakuDeleteResponse = new DanmakuDeleteResponse();
        danmakuDeleteResponse.status_code = 1;
        return AbstractC73672Svk.LJJIJIL(danmakuDeleteResponse);
    }

    public static final Object apply$1(IDhS67S0200000_3 iDhS67S0200000_3, Object it) {
        o.LJIIIZ(it, "it");
        return new C213198Yh(((TBW) iDhS67S0200000_3.l0).get(it), ((TBW) iDhS67S0200000_3.l1).get(it));
    }

    public static final Object apply$2(IDhS67S0200000_3 iDhS67S0200000_3, Object obj) {
        UpvotePublishResponse response = (UpvotePublishResponse) obj;
        o.LJIIIZ(response, "response");
        UpvoteStruct upvoteStruct = response.upvote;
        if (upvoteStruct != null) {
            upvoteStruct.setImageList(C78939UyV.LJFF((List) iDhS67S0200000_3.l0));
        }
        ((C183107Go) iDhS67S0200000_3.l1).getClass();
        return C183107Go.LJJJIL(response);
    }

    public static final Object apply$3(IDhS67S0200000_3 iDhS67S0200000_3, Object obj) {
        UpvotePublishResponse response = (UpvotePublishResponse) obj;
        o.LJIIIZ(response, "response");
        UpvoteStruct upvoteStruct = response.upvote;
        if (upvoteStruct != null) {
            upvoteStruct.setImageList(C78939UyV.LJFF((List) iDhS67S0200000_3.l0));
        }
        ((C183107Go) iDhS67S0200000_3.l1).getClass();
        return C183107Go.LJJJIL(response);
    }

    public IDhS67S0200000_3(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
