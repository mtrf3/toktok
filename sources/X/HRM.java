package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.creative.model.DMCameraModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.gamora.recorder.localmedia.LocalMediaArgument;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HRM {
    public static final HRM LIZ = new HRM();

    public static LocalMediaArgument LIZ(ShortVideoContext shortVideoContext) {
        int i;
        int i2;
        int i3;
        o.LJIIIZ(shortVideoContext, "shortVideoContext");
        if (shortVideoContext.mFromOtherPlatform) {
            i = 1002;
        } else {
            i = 3;
        }
        if (shortVideoContext.microAppModel != null) {
            i2 = 4;
        } else {
            i2 = 6;
        }
        DMCameraModel dMCameraModel = shortVideoContext.creativeModel.initialModel.dmCameraModel;
        if (dMCameraModel.enterFromDM) {
            i3 = 21;
        } else {
            i3 = 0;
            if (ujb.o.LJJJJIZL(shortVideoContext.shootWay, "duet", false) && C43710HDm.LIZ()) {
                i3 = 25;
            }
        }
        long LIZIZ = C44529Hdl.LIZIZ();
        C43117Gw5.LIZ.getClass();
        return new LocalMediaArgument(1, i, i2, true, i3, LIZIZ, 1, C43117Gw5.LJII(), 1, C45771Hxn.LJFF(), 0, dMCameraModel.maxSelectableVideoDuration, dMCameraModel.shouldDisplayTnsNoticeAlbum, dMCameraModel.tnsNoticeRes, dMCameraModel.chatType, dMCameraModel.sessionID, null, null, 197632);
    }

    public static Bundle LIZIZ(LocalMediaArgument localMediaArgument, ShortVideoContext shortVideoContext) {
        o.LJIIIZ(shortVideoContext, "shortVideoContext");
        Bundle bundle = new Bundle();
        bundle.putInt("key_support_flag", localMediaArgument.supportFlag);
        bundle.putBoolean("Key_enable_multi_video", localMediaArgument.enableMultiVideo);
        bundle.putLong("Key_min_duration", localMediaArgument.minDuration);
        bundle.putInt("key_photo_select_min_count", localMediaArgument.minPhotoCount);
        bundle.putInt("key_photo_select_max_count", localMediaArgument.maxPhotoCount);
        bundle.putInt("key_video_select_min_count", localMediaArgument.minVideoCount);
        bundle.putInt("key_video_select_max_count", localMediaArgument.maxVideoCount);
        bundle.putInt("key_min_selectable_video_duration", localMediaArgument.minSelectableVideoDuration);
        bundle.putInt("key_max_selectable_video_duration", localMediaArgument.maxSelectableVideoDuration);
        bundle.putInt("key_dm_chat_type", localMediaArgument.dmChatType);
        bundle.putString("key_choose_media_dm_session_id", localMediaArgument.sessionId);
        bundle.putInt("key_choose_scene", localMediaArgument.chooseScene);
        bundle.putParcelable("key_short_video_context", shortVideoContext);
        bundle.putInt("key_choose_request_code", localMediaArgument.chooseRequestCode);
        bundle.putBoolean("key_choose_media_display_tns_notice", localMediaArgument.shouldDisplayTnsNotice);
        bundle.putInt("key_choose_media_notice_text", localMediaArgument.tnsNoticeRes);
        bundle.putString("key_mv_hint_text", localMediaArgument.hintText);
        Bundle bundle2 = localMediaArgument.extraBundle;
        if (bundle2 != null) {
            bundle2.putAll(bundle2);
        }
        bundle.putLong("invoke_uploadpage_time", System.currentTimeMillis());
        return bundle;
    }

    /* JADX WARN: Code restructure failed: missing block: B:113:0x01ca, code lost:
    
        if (r4 != 2) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0067, code lost:
    
        if (r4 != 2) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x01ce, code lost:
    
        r0 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x017c, code lost:
    
        if (r8 != null) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0194  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZJ(X.HRM r35, X.WM7 r36, com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r37, boolean r38, long r39, boolean r41, boolean r42, android.os.Bundle r43, int r44) {
        /*
            Method dump skipped, instructions count: 579
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HRM.LIZJ(X.HRM, X.WM7, com.ss.android.ugc.aweme.shortvideo.ShortVideoContext, boolean, long, boolean, boolean, android.os.Bundle, int):void");
    }
}
