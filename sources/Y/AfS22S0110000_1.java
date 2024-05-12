package Y;

import X.C75792yF;
import X.C7H1;
import X.C7H2;
import X.FMX;
import X.InterfaceC64592gB;
import X.OSZ;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteList;
import com.ss.android.ugc.aweme.im.sdk.activitystatus.ActivityStatusViewModelImpl;
import com.ss.android.ugc.aweme.upvote.model.UpvoteBatchListResponse;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public class AfS22S0110000_1 implements InterfaceC64592gB {
    public final int $t;
    public Object l0;
    public boolean z1;

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                return;
            case 1:
                accept$1(this, obj);
                return;
            case 2:
                accept$2(this, obj);
                return;
            default:
                return;
        }
    }

    public static final void accept$0(AfS22S0110000_1 afS22S0110000_1, Object obj) {
        String str;
        UpvoteBatchListResponse upvoteBatchListResponse = (UpvoteBatchListResponse) obj;
        Map<String, Long> map = upvoteBatchListResponse.upvoteExtra;
        if (map != null) {
            C7H2.LIZJ.putAll(map);
        }
        List<UpvoteList> list = upvoteBatchListResponse.upvoteLists;
        List list2 = (List) afS22S0110000_1.l0;
        for (UpvoteList upvoteList : list) {
            String itemId = upvoteList.getItemId();
            C7H1.LJIIIIZZ(itemId, upvoteList, true, 20);
            list2.remove(itemId);
        }
        if (afS22S0110000_1.z1 && ((List) afS22S0110000_1.l0).size() > 0) {
            OSZ[] oszArr = new OSZ[2];
            oszArr[0] = new OSZ(C75792yF.LIZJ((List) afS22S0110000_1.l0), "group_ids");
            BaseResponse.ServerTimeExtra serverTimeExtra = upvoteBatchListResponse.extra;
            if (serverTimeExtra != null) {
                str = serverTimeExtra.logid;
            } else {
                str = null;
            }
            oszArr[1] = new OSZ(str, "log_id");
            FMX.LJIILL("repost_tab_batch_list_inconsistency", oszArr);
        }
    }

    public static final void accept$1(AfS22S0110000_1 afS22S0110000_1, Object obj) {
        if (afS22S0110000_1.z1 && ((List) afS22S0110000_1.l0).size() > 0) {
            FMX.LJIILL("repost_tab_batch_list_inconsistency", new OSZ(C75792yF.LIZJ((List) afS22S0110000_1.l0), "group_ids"));
        }
    }

    public static final void accept$2(AfS22S0110000_1 afS22S0110000_1, Object obj) {
        String it = (String) obj;
        ActivityStatusViewModelImpl activityStatusViewModelImpl = (ActivityStatusViewModelImpl) afS22S0110000_1.l0;
        o.LJIIIIZZ(it, "it");
        activityStatusViewModelImpl.LJIJ(it, afS22S0110000_1.z1);
    }

    public AfS22S0110000_1(Object obj, boolean z, int i) {
        this.$t = i;
        this.l0 = obj;
        this.z1 = z;
    }
}
