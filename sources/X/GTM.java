package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import com.ss.android.ugc.aweme.creative.model.HighLightVideoParametersModel;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.recoverpanel.PublishFailureReason;
import com.ss.android.ugc.aweme.splash.SplashActivity;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GTM {
    public static final /* synthetic */ int LIZ = 0;

    public static Bundle LIZLLL(VideoPublishEditModel videoPublishEditModel) {
        int i;
        Bundle bundle = new Bundle();
        if (C43161Gwn.LIZ()) {
            C43157Gwj.LIZ(videoPublishEditModel);
        }
        videoPublishEditModel.mIsFromDraft = true;
        videoPublishEditModel.userClickPublishTime = SystemClock.uptimeMillis();
        if (H7R.LJJJJL(videoPublishEditModel)) {
            i = 11;
        } else {
            i = 0;
        }
        bundle.putInt("video_type", i);
        bundle.putSerializable("extra_video_publish_args", videoPublishEditModel);
        bundle.putString("shoot_way", videoPublishEditModel.mShootWay);
        bundle.putInt("publish_permission", videoPublishEditModel.isPrivate);
        if (H7R.LJJL(videoPublishEditModel)) {
            bundle.putBoolean("shoutouts_video_fast_publish", true);
        }
        String creationId = videoPublishEditModel.getCreationId();
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("creation_id", creationId);
        c145995oB.LJI("content_type", "video");
        c145995oB.LIZ(1, "retry_publish");
        c145995oB.LIZ(i, "video_type");
        c145995oB.LIZ(1, "video_upload_type");
        FMX.LJIIL("performance_publish", c145995oB.LIZ);
        bundle.putBoolean("publish_retry", true);
        return bundle;
    }

    public static Intent LIZIZ(Activity activity, Bundle bundle) {
        boolean z = bundle.getBoolean("publish_high_quality_with_prompt");
        C44172HVg.LIZJ.getClass();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("PublishServiceImpl startPublish containerActivityClass:");
        LIZ2.append(SplashActivity.class.getName());
        H78.LJI(X1D.LIZIZ(LIZ2));
        Intent intent = new Intent(activity, (Class<?>) SplashActivity.class);
        intent.addFlags(603979776);
        intent.putExtra("publish_high_quality_with_prompt", z);
        boolean LJ = C45039Hlz.LJ();
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("PublishServiceImpl startPublish isPublishContainerActivityClassAlive:");
        LIZ3.append(LJ);
        H78.LJI(X1D.LIZIZ(LIZ3));
        if (!LJ) {
            H78.LJI("PublishServiceImpl startPublish EXTRA_ENABLE_OPTIMIZE_MAIN_NOT_IN_STACK:");
            intent.putExtra("enable_optimize_main_not_in_stack", true);
        }
        if (bundle.getBoolean("review_video_fast_publish", false)) {
            intent.putExtra("review_video_fast_publish", true);
        }
        if (bundle.getBoolean("is_nows", false)) {
            intent.putExtra("is_nows", true);
        }
        if (bundle.getString("shoot_way") != null) {
            intent.putExtra("shoot_way", bundle.getString("shoot_way"));
        }
        if (bundle.getString("creation_id") != null) {
            intent.putExtra("creation_id", bundle.getString("creation_id"));
        }
        intent.putExtra("publish_bundle", bundle);
        intent.setExtrasClassLoader(SplashActivity.class.getClassLoader());
        return intent;
    }

    public static Bundle LIZJ(AwemeDraft awemeDraft, PublishFailureReason publishFailureReason) {
        Bundle LIZLLL;
        new C43542H7a("PublishServiceImpl");
        VideoPublishEditModel LIZJ = C43542H7a.LIZJ(awemeDraft);
        if (awemeDraft.LJIIJ()) {
            if (((Boolean) C42543Gmp.LIZ.getValue()).booleanValue()) {
                C43157Gwj.LIZ(LIZJ);
            }
            LIZLLL = C41045G8z.LIZ(LIZJ, true);
        } else {
            LIZLLL = LIZLLL(LIZJ);
        }
        if (publishFailureReason != null) {
            LIZLLL.putParcelable("retry_reason", publishFailureReason);
        }
        return LIZLLL;
    }

    public static void LJ(ActivityC45651qj activityC45651qj, Intent intent) {
        C78605Ut7.LJIJJLI(activityC45651qj, intent, Boolean.FALSE);
    }

    public static void LJFF(Bundle bundle, ActivityC45651qj activityC45651qj) {
        Intent intent = new Intent();
        intent.putExtra("publish_bundle", bundle);
        String LIZJ = GUH.LIZJ(bundle);
        GUH.LJJIFFI();
        if (LIZJ == null) {
            H78.LIZJ("Already In publish, can not start new");
        } else {
            intent.putExtra("multi_publish_id", LIZJ);
            LJ(activityC45651qj, intent);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LJII(X.ActivityC45651qj r17, android.os.Bundle r18) {
        /*
            Method dump skipped, instructions count: 842
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GTM.LJII(X.1qj, android.os.Bundle):java.lang.String");
    }

    public static void LIZ(ActivityC45651qj activityC45651qj, Intent intent, VideoPublishEditModel videoPublishEditModel) {
        String str;
        String str2;
        String str3 = null;
        if (videoPublishEditModel != null) {
            HighLightVideoParametersModel highLightVideoParametersModel = videoPublishEditModel.creativeModel.initialModel.highLightVideoParametersModel;
            String str4 = highLightVideoParametersModel.fragmentId;
            str2 = highLightVideoParametersModel.roomId;
            try {
                String str5 = highLightVideoParametersModel.replayTitle;
                if (str5 != null) {
                    str3 = URLEncoder.encode(str5, PVB.LIZ.name());
                }
            } catch (UnsupportedEncodingException unused) {
            }
            str = str3;
            str3 = str4;
        } else {
            str = null;
            str2 = null;
        }
        C62046OWs LIZIZ = C0F0.LIZIZ();
        Boolean bool = (Boolean) LIZIZ.LIZJ(Boolean.FALSE, "live_highlight_optimize");
        if (str3 != null && !str3.isEmpty() && str2 != null && !str2.isEmpty() && bool.booleanValue() && !videoPublishEditModel.creativeModel.draftInfoModel.isDraft) {
            String concat = ((String) LIZIZ.LIZJ("", "live_highlight_page_url")).concat("&fragment_id=").concat(str3).concat("&replay_room_id=").concat(str2).concat("&enter_from_page=").concat("publish_highlight");
            if (str != null) {
                concat = concat.concat("&replay_title=").concat(str);
            }
            intent.putExtra("extra_schema_to_highlight_page", concat);
            if (videoPublishEditModel.creativeModel.initialModel.highLightVideoParametersModel.landingToRecord) {
                intent.putExtra("is_ecom_publish", true);
                C44018HPi.LJIIJJI(activityC45651qj, intent);
            }
        }
    }

    public static void LJI(ActivityC45651qj activity, C41474GPm c41474GPm, boolean z) {
        AwemeDraft awemeDraft = c41474GPm.LIZ;
        Bundle LIZJ = LIZJ(awemeDraft, c41474GPm.LIZIZ);
        AudioRecorderParam audioRecorderParam = awemeDraft.LJJJJI.audioRecorderParam;
        if (audioRecorderParam != null) {
            audioRecorderParam.setAudioRecordIndex(-1);
        }
        LJFF(LIZJ, activity);
        if (GTO.LIZ() && z) {
            o.LJIIIZ(activity, "activity");
            C41620GVc.LIZ(activity, false, 126);
        }
    }
}
