package X;

import android.os.Bundle;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRiskModel;
import com.ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.ss.android.ugc.aweme.feed.model.VideoControl;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.Iterator;
import kotlin.jvm.internal.o;
import org.json.JSONObject;
import yq4.a;

/* renamed from: X.OjI, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62708OjI {
    public static void LIZ(Aweme aweme, String str, Bundle bundle) {
        JSONObject jSONObject;
        String str2;
        Integer num;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        Integer num2;
        Integer num3;
        int i6;
        if (!C19N.LJ("enable_compliance_biz_monitor", true)) {
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("ftc_child_mode", AV1.LJIIJJI() ? 1 : 0);
        jSONObject2.put("teen_mode_status", a.LJIILL().LJIJ() ? 1 : 0);
        if (((RBX) HG3.LJIILL()).isLogin()) {
            User curUser = ((RBX) HG3.LJIILL()).getCurUser();
            if (curUser != null && curUser.isSecret()) {
                i6 = 1;
            } else {
                i6 = 0;
            }
            jSONObject2.put("current_user_secret", i6);
        }
        jSONObject2.put("region", C85990Xow.LIZIZ());
        if (aweme != null) {
            jSONObject2.put("aweme_is_ads", aweme.isAd() ? 1 : 0);
            AwemeStatus status = aweme.getStatus();
            if (status != null) {
                num = Integer.valueOf(status.getPrivateStatus());
            } else {
                num = null;
            }
            jSONObject2.put("aweme_private_status", num);
            AwemeStatus status2 = aweme.getStatus();
            if (status2 != null && status2.isInReviewing()) {
                i = 1;
            } else {
                i = 0;
            }
            jSONObject2.put("aweme_in_reviewing", i);
            AwemeStatus status3 = aweme.getStatus();
            if (status3 != null && status3.isReviewed()) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            jSONObject2.put("aweme_reviewed", i2);
            AwemeStatus status4 = aweme.getStatus();
            if (status4 != null && status4.isSelfSee()) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            jSONObject2.put("aweme_self_see", i3);
            AwemeStatus status5 = aweme.getStatus();
            if (status5 != null && status5.isProhibited()) {
                i4 = 1;
            } else {
                i4 = 0;
            }
            jSONObject2.put("aweme_is_prohibited", i4);
            AwemeRiskModel awemeRiskModel = aweme.getAwemeRiskModel();
            if (awemeRiskModel != null && awemeRiskModel.isWarn()) {
                i5 = 1;
            } else {
                i5 = 0;
            }
            jSONObject2.put("aweme_warning", i5);
            AwemeStatus status6 = aweme.getStatus();
            if (status6 != null) {
                num2 = Integer.valueOf(status6.getDownloadStatus());
            } else {
                num2 = null;
            }
            jSONObject2.put("aweme_download_status", num2);
            jSONObject2.put("aweme_prevent_download", aweme.isPreventDownload() ? 1 : 0);
            VideoControl videoControl = aweme.getVideoControl();
            if (videoControl != null) {
                num3 = Integer.valueOf(videoControl.preventDownloadType);
            } else {
                num3 = null;
            }
            jSONObject2.put("aweme_prevent_download_type", num3);
            Music music = aweme.getMusic();
            if (music != null) {
                jSONObject2.put("music_prevent_download", music.isPreventDownload() ? 1 : 0);
                jSONObject2.put("music_mute_share", music.isMuteShare() ? 1 : 0);
            }
            User author = aweme.getAuthor();
            if (author != null) {
                User curUser2 = ((RBX) HG3.LJIILL()).getCurUser();
                if (curUser2 == null || !TextUtils.equals(curUser2.getUid(), author.getUid())) {
                    curUser2 = author;
                }
                jSONObject2.put("author_secret", curUser2.isSecret() ? 1 : 0);
                jSONObject2.put("author_is_current", TextUtils.equals(author.getUid(), ((RBX) HG3.LJIILL()).getCurUser().getUid()) ? 1 : 0);
                jSONObject2.put("author_follow_status", curUser2.getFollowStatus());
                jSONObject2.put("author_download_setting", curUser2.getDownloadSetting());
            }
            jSONObject = new JSONObject();
            jSONObject.put("aweme_id", aweme.getAid());
        } else {
            jSONObject = null;
        }
        if (bundle != null) {
            for (String str3 : bundle.keySet()) {
                Object LLJJIII = C16880lQ.LLJJIII(bundle, str3);
                if (LLJJIII != null) {
                    str2 = LLJJIII.toString();
                } else {
                    str2 = null;
                }
                jSONObject2.put(str3, str2);
            }
        }
        Iterator<String> keys = C62709OjJ.LIZ.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            if (jSONObject2.has(next)) {
                Object opt = jSONObject2.opt(next);
                Object opt2 = C62709OjJ.LIZ.opt(next);
                if (opt != null && !o.LJ(opt, opt2)) {
                    C09900aA.LJI(str, jSONObject2, null, jSONObject);
                    return;
                }
            }
        }
    }
}
