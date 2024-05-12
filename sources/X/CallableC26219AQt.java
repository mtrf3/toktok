package X;

import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.concurrent.Callable;

/* renamed from: X.AQt, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* synthetic */ class CallableC26219AQt implements Callable {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ FeedItemList LJLJI;

    public /* synthetic */ CallableC26219AQt(int i, String str, FeedItemList feedItemList) {
        this.LJLIL = i;
        this.LJLILLLLZI = str;
        this.LJLJI = feedItemList;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String str;
        LogPbBean logPbBean;
        int i = this.LJLIL;
        String str2 = this.LJLILLLLZI;
        FeedItemList feedItemList = this.LJLJI;
        try {
            C188727au c188727au = new C188727au();
            c188727au.LIZLLL(i, "request_type");
            c188727au.LJIIIZ("to_user_id", str2);
            if (feedItemList == null || feedItemList.getItems() == null) {
                c188727au.LJIIIZ("is_empty", "true");
                if (feedItemList != null) {
                    str = feedItemList.getRequestId();
                } else {
                    str = "";
                }
                c188727au.LJIIIZ("request_id", str);
                if (feedItemList == null) {
                    logPbBean = null;
                } else {
                    logPbBean = feedItemList.logPb;
                }
                c188727au.LJFF(logPbBean, "log_pb");
            } else {
                c188727au.LIZLLL(feedItemList.getItems().size(), "size");
                c188727au.LJFF(feedItemList.logPb, "log_pb");
                c188727au.LJIIIZ("request_id", feedItemList.getRequestId());
            }
            FMX.LJIIL("aweme_profile_list_response_data", c188727au.LIZ);
            if (feedItemList != null) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("response:");
                LIZ.append(C236949Rq.LIZ(i));
                C36922EeM.LIZLLL(4, X1D.LIZIZ(LIZ), c188727au.LIZ.toString());
            }
        } catch (Exception unused) {
        }
        return null;
    }
}
