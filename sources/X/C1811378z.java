package X;

import androidx.lifecycle.ViewModelProviders;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.comment.likelist.model.LikeListResponse;
import com.ss.android.ugc.aweme.comment.likelist.viewmodel.LikeListVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import org.json.JSONObject;

/* renamed from: X.78z, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1811378z {
    public static LikeListVM LIZ(ActivityC45651qj activityC45651qj) {
        LikeListVM likeListVM = (LikeListVM) ViewModelProviders.of(activityC45651qj).get(LikeListVM.class);
        if (likeListVM.LJLIL == null) {
            likeListVM.LJLIL = new LikeListVM.BubbleBridge(likeListVM, activityC45651qj);
        }
        return likeListVM;
    }

    public static void LIZIZ(String str, long j, LikeListResponse likeListResponse) {
        long j2;
        String str2;
        IAwemeService LIZ = AwemeService.LIZ();
        Aweme i6 = LIZ.i6(str);
        if (i6 != null) {
            AwemeStatistics statistics = i6.getStatistics();
            int i = 1;
            if (statistics != null && statistics.getDiggCount() == j) {
                return;
            }
            if (likeListResponse != null) {
                JSONObject jSONObject = new JSONObject();
                AwemeStatistics statistics2 = i6.getStatistics();
                if (statistics2 != null) {
                    j2 = statistics2.getDiggCount();
                } else {
                    j2 = 0;
                }
                if (j2 <= j) {
                    i = 2;
                }
                jSONObject.put("flag", i);
                jSONObject.put("like_count", j2);
                jSONObject.put("list_count", j);
                jSONObject.put("video_create_time", i6.getCreateTime());
                jSONObject.put("video_elapsed_time", (System.currentTimeMillis() / 1000) - i6.getCreateTime());
                BaseResponse.ServerTimeExtra serverTimeExtra = likeListResponse.extra;
                if (serverTimeExtra != null) {
                    str2 = serverTimeExtra.logid;
                } else {
                    str2 = null;
                }
                String str3 = "";
                if (str2 == null) {
                    str2 = "";
                }
                jSONObject.put("list_logid", str2);
                String requestId = i6.getRequestId();
                if (requestId != null) {
                    str3 = requestId;
                }
                jSONObject.put("video_logid", str3);
                FMX.LJIILJJIL("like_count_inconformity", jSONObject);
            }
            LIZ.j6(j, str);
            AnonymousClass799 anonymousClass799 = new AnonymousClass799(str, j, i6.getUserDigg(), C79N.LIST);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("notifyLikeCountChange, post event=");
            LIZ2.append(anonymousClass799);
            C221018lt.LJFF("LikeListVM", X1D.LIZIZ(LIZ2));
            C2U8.LIZ(anonymousClass799);
        }
    }
}
