package X;

import android.os.Build;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class G83 {
    public static final void LIZ(ActivityC45651qj activity, int i, VideoPublishEditModel videoPublishEditModel, String str, InterfaceC88471Ynr<? super Boolean, ? super Boolean, C76800UCe> interfaceC88471Ynr) {
        boolean z;
        o.LJIIIZ(activity, "activity");
        if (i != 0) {
            z = true;
        } else {
            z = false;
        }
        if (Build.VERSION.SDK_INT < 29 && z) {
            interfaceC88471Ynr.invoke(Boolean.FALSE, false);
            HVR.LJII(activity, new G82(activity, videoPublishEditModel, str, i, true, interfaceC88471Ynr), null, TokenCert.Companion.with("bpea-tools_request_storage_permission_save_local"), 28);
        } else {
            LIZIZ(activity, videoPublishEditModel, str, i, z, interfaceC88471Ynr);
        }
    }

    public static final void LIZIZ(ActivityC45651qj activityC45651qj, VideoPublishEditModel videoPublishEditModel, String str, int i, boolean z, InterfaceC88471Ynr<? super Boolean, ? super Boolean, C76800UCe> interfaceC88471Ynr) {
        boolean z2;
        String str2;
        String str3;
        if (videoPublishEditModel != null) {
            z2 = H7R.LJJJJLL(videoPublishEditModel);
        } else {
            z2 = false;
        }
        if (z2) {
            Keva.getRepo("TOOLS_PUBLISH_REPO_NAME").storeInt("photo_mode_save_to_local_config", i);
        } else {
            Keva.getRepo("TOOLS_PUBLISH_REPO_NAME").storeInt("save_to_local_config", i);
        }
        if (z) {
            C60903NvH.LJIIJJI().getPublishService().LJI();
            GUT.LIZ(activityC45651qj, str);
        }
        C145995oB c145995oB = new C145995oB();
        String str4 = null;
        if (videoPublishEditModel != null) {
            str2 = videoPublishEditModel.getCreationId();
        } else {
            str2 = null;
        }
        c145995oB.LJI("creation_id", str2);
        c145995oB.LJI("enter_from", "video_post_page");
        if (z) {
            str3 = "on";
        } else {
            str3 = "off";
        }
        c145995oB.LJI("to_status", str3);
        if (videoPublishEditModel != null) {
            str4 = videoPublishEditModel.mShootWay;
        }
        c145995oB.LJI("shoot_way", str4);
        c145995oB.LIZ(-1, "save_with_captions");
        FMX.LJIIL("click_react_download_control", c145995oB.LIZ);
        if (interfaceC88471Ynr != null) {
            interfaceC88471Ynr.invoke(Boolean.TRUE, Boolean.valueOf(z));
        }
    }
}
