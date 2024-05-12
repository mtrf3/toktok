package X;

import Y.AfS4S1100100_7;
import android.app.Activity;
import android.content.Intent;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.api.VideoInfoFromURLResponse;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.impl.MentionVideoInfoApi;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.video.IAVPublishService;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: X.Gi3, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42247Gi3 {
    public static String LIZ = "";
    public static String LIZIZ = "";
    public static final IAVPublishService LIZJ = AVExternalServiceImpl.LIZ().publishService();

    public static void LIZIZ(String str) {
        String str2;
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "video_post_page");
        c188727au.LJIIIZ("creation_id", LIZ);
        c188727au.LJIIIZ("credit_item_category", str);
        IAVPublishService iAVPublishService = LIZJ;
        if (iAVPublishService.isAfterPost()) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        c188727au.LJIIIZ("after_post", str2);
        if (iAVPublishService.getAwemeType() != null) {
            c188727au.LJI("aweme_type", iAVPublishService.getAwemeType());
        }
        FMX.LJIIL("click_credits_item", c188727au.LIZ);
    }

    public static void LIZ(Activity activity, String str, String str2) {
        long currentTimeMillis = System.currentTimeMillis();
        AbstractC73638SvC<VideoInfoFromURLResponse> videoInfoByURLV2 = MentionVideoInfoApi.LIZIZ.getVideoInfoByURLV2("", CastLongProtector.parseLong(str));
        long LIZIZ2 = Q7K.LIZIZ("check_credit_video_permission_threshold", 5);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        InterfaceC73471SsV interfaceC73471SsV = C42246Gi2.LJLIL;
        videoInfoByURLV2.getClass();
        AbstractC73946T0k abstractC73946T0k = T16.LIZIZ;
        C73320Sq4.LIZ(timeUnit, "unit is null");
        C73320Sq4.LIZ(abstractC73946T0k, "scheduler is null");
        new C73500Ssy(videoInfoByURLV2, LIZIZ2, timeUnit, abstractC73946T0k, interfaceC73471SsV).LJJIIJ(T16.LIZ()).LJIJJ(C73969T1h.LIZIZ()).LJJII(new AfS4S1100100_7(currentTimeMillis, activity, str2, 0), new AfS4S1100100_7(currentTimeMillis, activity, str2, 1));
    }

    public static void LIZJ(Activity activity, VideoInfoFromURLResponse videoInfoFromURLResponse, long j, String str) {
        int statusCode;
        float currentTimeMillis = ((float) (System.currentTimeMillis() - j)) / 1000.0f;
        if (videoInfoFromURLResponse.getStatusCode() != 0) {
            statusCode = 1;
        } else {
            statusCode = videoInfoFromURLResponse.getStatusCode();
        }
        if (!LIZJ.returnMentionVideoRespose(activity, videoInfoFromURLResponse, str)) {
            Intent intent = new Intent();
            intent.putExtra("mention_video_Info_respose", videoInfoFromURLResponse);
            intent.putExtra("mention_video_enter_method", str);
            if (activity != null) {
                activity.setResult(-1, intent);
                activity.finish();
            }
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("duration", Float.valueOf(currentTimeMillis));
        C09900aA.LJIIJJI("tools_performance_check_credit_video_permission", statusCode, jSONObject);
    }
}
