package X;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.livesdk.livesetting.game.LiveStudioDownloadsLynxUrlSetting;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* loaded from: classes6.dex */
public final class BYZ {
    public static void LIZ(Context context, String str) {
        String str2;
        if (context == null) {
            return;
        }
        Uri.Builder buildUpon = UriProtector.parse(LiveStudioDownloadsLynxUrlSetting.INSTANCE.getLynxUrl()).buildUpon();
        if (C1E4.LJJIFFI(str) > 0) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        android.net.Uri build = buildUpon.appendQueryParameter("from_message", str2).build();
        if (!TextUtils.isEmpty(build.toString())) {
            ((IActionHandlerService) CN1.LIZ(IActionHandlerService.class)).handle(context, build);
        }
    }
}
