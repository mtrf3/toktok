package X;

import android.app.Activity;
import android.net.Uri;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.setting.services.SettingServiceImpl;
import kotlin.jvm.internal.o;
import yq4.a;

/* renamed from: X.7TY, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7TY {
    public static void LIZ(ActivityC45651qj activity, Aweme aweme, String objectIds, String ownerIds, int i) {
        String str;
        boolean z;
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(objectIds, "objectIds");
        o.LJIIIZ(ownerIds, "ownerIds");
        Uri.Builder appendQueryParameter = new Uri.Builder().appendQueryParameter("object_ids", objectIds).appendQueryParameter("owner_ids", ownerIds).appendQueryParameter("report_type", "comment").appendQueryParameter("is_batch", "1").appendQueryParameter("locale", SettingServiceImpl.LIZ().getAppLanguage());
        if (aweme != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        Uri.Builder appendQueryParameter2 = appendQueryParameter.appendQueryParameter("related_object_ids", str);
        if (aweme != null && aweme.getAwemeType() == 41) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            appendQueryParameter2.appendQueryParameter("enter_from", "ttn_image");
        } else if (aweme != null && aweme.getAwemeType() == 43) {
            appendQueryParameter2.appendQueryParameter("enter_from", "ttn_video");
        } else {
            appendQueryParameter2.appendQueryParameter("enter_from", "video_comment");
        }
        a.LJIILLIIL().LJFF(activity, appendQueryParameter2, C141415gn.LIZ("half_screen_height", i));
    }

    public static void LIZIZ(Activity activity, Aweme aweme, Comment comment, String str, int i) {
        String str2;
        boolean z;
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(comment, "comment");
        String cid = comment.getCid();
        Uri.Builder appendQueryParameter = new Uri.Builder().appendQueryParameter("object_id", cid).appendQueryParameter("comment_with_emoji", CardStruct.IStatusCode.DEFAULT).appendQueryParameter("owner_id", Comment.getAuthorUid(comment)).appendQueryParameter("report_type", "comment");
        if (aweme != null) {
            str2 = aweme.getAid();
        } else {
            str2 = null;
        }
        Uri.Builder appendQueryParameter2 = appendQueryParameter.appendQueryParameter("related_object_ids", str2);
        if (aweme != null && aweme.getAwemeType() == 41) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            appendQueryParameter2.appendQueryParameter("enter_from", "ttn_image");
        } else if (aweme != null && aweme.getAwemeType() == 43) {
            appendQueryParameter2.appendQueryParameter("enter_from", "ttn_video");
        } else {
            appendQueryParameter2.appendQueryParameter("enter_from", "video_comment");
        }
        appendQueryParameter2.appendQueryParameter("locale", SettingServiceImpl.LIZ().getAppLanguage());
        if (!TextUtils.isEmpty(str)) {
            appendQueryParameter2.appendQueryParameter("video_owner_id", str);
        }
        a.LJIILLIIL().LJFF(activity, appendQueryParameter2, C141415gn.LIZ("half_screen_height", i));
    }
}
