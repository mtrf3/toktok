package X;

import com.ss.android.ugc.aweme.qna.api.TiktokV1ForumProfileQuestionsResponse;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.T7a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74118T7a {
    public static final /* synthetic */ int LIZ = 0;

    public static KKR LIZ(TiktokV1ForumProfileQuestionsResponse tiktokV1ForumProfileQuestionsResponse, List currentForumStructs) {
        o.LJIIIZ(currentForumStructs, "currentForumStructs");
        if (tiktokV1ForumProfileQuestionsResponse != null && tiktokV1ForumProfileQuestionsResponse.statusCode != 0) {
            return KKR.FAILURE;
        }
        if (!currentForumStructs.isEmpty()) {
            return KKR.SUCCESS;
        }
        return KKR.SUCCESS_EMPTY;
    }
}
