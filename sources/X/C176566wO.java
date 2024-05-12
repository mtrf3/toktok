package X;

import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.comment.model.BaseCommentResponse;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.6wO, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C176566wO {
    public static int LIZJ;
    public static long LIZLLL;
    public final ConcurrentHashMap<String, String> LIZ = new ConcurrentHashMap<>();
    public long LIZIZ;

    static {
        new C176546wM();
    }

    public final void LIZ(BaseResponse response) {
        LogPbBean logPbBean;
        String imprId;
        o.LJIIIZ(response, "response");
        if ((response instanceof BaseCommentResponse) && (logPbBean = ((BaseCommentResponse) response).logPd) != null && (imprId = logPbBean.getImprId()) != null) {
            this.LIZ.put("LogID", imprId);
        }
        this.LIZ.put("ErrorCode", String.valueOf(response.status_code));
    }
}
