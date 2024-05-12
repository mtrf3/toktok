package X;

import android.content.Context;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commerce.model.CommerceActivityStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import kotlin.jvm.internal.AqS192S0100000_10;

/* renamed from: X.NIo, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59130NIo implements InterfaceC58848N7s {
    @Override // X.InterfaceC58848N7s
    public final void LJIIIZ(AwemeRawAd awemeRawAd) {
        UrlModel playTrackUrlList = awemeRawAd.getPlayTrackUrlList();
        Long creativeId = awemeRawAd.getCreativeId();
        String logExtra = awemeRawAd.getLogExtra();
        new AqS192S0100000_10(awemeRawAd, 35);
        O8Z.LIZ("play", playTrackUrlList, creativeId, logExtra);
    }

    @Override // X.InterfaceC58848N7s
    public final void LJIL(Context context, Aweme aweme) {
        if (context == null || aweme.getActivityPendant() == null) {
            return;
        }
        CommerceActivityStruct activityPendant = aweme.getActivityPendant();
        if ((!TextUtils.isEmpty(activityPendant.getJumpOpenUrl()) && NO5.LJI(context, activityPendant.getJumpOpenUrl(), false)) || TextUtils.isEmpty(activityPendant.getJumpWebUrl())) {
            return;
        }
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        if (awemeRawAd != null) {
            NOP.LIZJ(context, activityPendant.getJumpWebUrl(), activityPendant.getTitle(), false, null, C78939UyV.LJJIZ(awemeRawAd), new C59272NOa(awemeRawAd.getCreativeId(), awemeRawAd.getLogExtra(), awemeRawAd.getDownloadUrl(), awemeRawAd.getPackageName(), awemeRawAd.getAppName(), awemeRawAd.getType(), 192), 0);
        } else {
            NOP.LIZJ(context, activityPendant.getJumpWebUrl(), activityPendant.getTitle(), false, null, false, null, 0);
        }
    }

    @Override // X.InterfaceC58848N7s
    public final boolean LJJII(Context context, Aweme aweme) {
        boolean z;
        if (context == null || aweme.getSpecialSticker() == null) {
            return false;
        }
        String openUrl = aweme.getSpecialSticker().getOpenUrl();
        if (!TextUtils.isEmpty(openUrl)) {
            return NO5.LJI(context, openUrl, false);
        }
        String linkUrl = aweme.getSpecialSticker().getLinkUrl();
        if (C63081OpJ.LJJLIIIJJI(aweme)) {
            z = C78939UyV.LJJIZ(aweme.getAwemeRawAd());
        } else {
            z = true;
        }
        return NOP.LIZJ(context, linkUrl, aweme.getSpecialSticker().getTitle(), false, null, z, null, 0);
    }

    @Override // X.InterfaceC58848N7s
    public final boolean LIZ(Context context, Aweme aweme, int i, C74R c74r) {
        return NOE.LJJIIJ(context, aweme, 9, C58775N4x.LIZ);
    }
}
