package X;

import android.app.Activity;
import android.content.Context;
import android.os.BaseBundle;
import android.text.TextUtils;
import android.view.View;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.ACLCommonShare;
import com.ss.android.ugc.aweme.feed.model.AclType;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeACLShare;
import com.ss.android.ugc.aweme.now.NowPostInfo;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.AqS141S0200000_10;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.AqS15S1400000_10;
import kotlin.jvm.internal.o;

/* renamed from: X.Obd, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62233Obd {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C62351OdX.LJLIL);

    public static void LIZ(Activity activity, AlertDialogC45396Hrk alertDialogC45396Hrk) {
        if (activity.isFinishing() || activity.isDestroyed() || !alertDialogC45396Hrk.isShowing()) {
            return;
        }
        alertDialogC45396Hrk.dismiss();
    }

    public static UrlModel LIZIZ(Aweme aweme, boolean z) {
        o.LJIIIZ(aweme, "aweme");
        if (C78996UzQ.LJJIIZI(aweme)) {
            if (C4PR.LIZ() || z) {
                if (C90193gN.LIZ()) {
                    NowPostInfo nowPostInfo = aweme.nowPostInfo;
                    if (nowPostInfo != null) {
                        return nowPostInfo.getWatermarkImageRTL();
                    }
                } else {
                    NowPostInfo nowPostInfo2 = aweme.nowPostInfo;
                    if (nowPostInfo2 != null) {
                        return nowPostInfo2.getWatermarkImageLTR();
                    }
                }
            } else if (C90193gN.LIZ()) {
                NowPostInfo nowPostInfo3 = aweme.nowPostInfo;
                if (nowPostInfo3 != null) {
                    return nowPostInfo3.getFuzzyImageRtlWithWatermark();
                }
            } else {
                NowPostInfo nowPostInfo4 = aweme.nowPostInfo;
                if (nowPostInfo4 != null) {
                    return nowPostInfo4.getFuzzyImageWithWatermark();
                }
            }
        } else if (C90193gN.LIZ()) {
            NowPostInfo nowPostInfo5 = aweme.nowPostInfo;
            if (nowPostInfo5 != null) {
                return nowPostInfo5.getFuzzyImageRtlWithWatermark();
            }
        } else {
            NowPostInfo nowPostInfo6 = aweme.nowPostInfo;
            if (nowPostInfo6 != null) {
                return nowPostInfo6.getFuzzyImageWithWatermark();
            }
        }
        return null;
    }

    public static ACLCommonShare LIZJ(Aweme aweme, String str) {
        AwemeACLShare awemeACLShare = aweme.awemeACLShareInfo;
        if (awemeACLShare != null) {
            ACLCommonShare shareThirdPlatform = awemeACLShare.getShareThirdPlatform();
            if (shareThirdPlatform != null) {
                shareThirdPlatform.setAwemeAclType(AclType.SHARE_THIRD_PLATFORM);
                return shareThirdPlatform;
            }
            List<ACLCommonShare> platformList = awemeACLShare.getPlatformList();
            if (platformList != null) {
                for (ACLCommonShare aCLCommonShare : platformList) {
                    if (TextUtils.equals(str, aCLCommonShare.getPlatformId())) {
                        aCLCommonShare.setAwemeAclType(AclType.PLATFORM_LIST);
                        return aCLCommonShare;
                    }
                }
            }
            ACLCommonShare shareGeneral = awemeACLShare.getShareGeneral();
            if (shareGeneral != null) {
                shareGeneral.setAwemeAclType(AclType.SHARE_GENERAL);
            }
            return awemeACLShare.getShareGeneral();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.Ocv, T, X.PMI] */
    public static void LIZLLL(InterfaceC62225ObV channel, String str, Context context, SharePackage sharePackage, int i) {
        boolean z;
        o.LJIIIZ(channel, "channel");
        o.LJIIIZ(context, "context");
        o.LJIIIZ(sharePackage, "sharePackage");
        if (i == 4) {
            z = true;
        } else {
            z = false;
        }
        C68322mC c68322mC = new C68322mC();
        if (z) {
            if (str != null) {
                android.net.Uri LIZ2 = O18.LIZ(context, new File(str));
                o.LJIIIIZZ(LIZ2, "getFileProviderUri(context, File(outPath))");
                ?? c62313Ocv = new C62313Ocv(LIZ2, str, "", sharePackage.title, null, null, false, 232);
                c68322mC.element = c62313Ocv;
                String str2 = c62313Ocv.LJFF;
                if (str2 == null) {
                    str2 = "";
                }
                ((BaseBundle) c62313Ocv.LIZ).putString("content_url", str2);
                ((BaseBundle) ((PMI) c68322mC.element).LIZ).putString("media_type", "image/png");
                sharePackage.extras.putString("share_form", "photo_form");
                channel.LJIIJ((AbstractC62625Ohx) c68322mC.element, context, new C62270OcE(channel, sharePackage));
                return;
            }
            return;
        }
        if (str == null) {
            return;
        }
        sharePackage.LJIILIIL(channel, new AqS15S1400000_10(channel, sharePackage, c68322mC, context, str, 0));
    }

    public static void LJ(Aweme aweme, InterfaceC62225ObV channel, Context context, View view, SharePackage sharePackage, InterfaceC88472Yns actionCallback, boolean z, int i) {
        o.LJIIIZ(channel, "channel");
        o.LJIIIZ(context, "context");
        o.LJIIIZ(sharePackage, "sharePackage");
        o.LJIIIZ(actionCallback, "actionCallback");
        String str = "";
        if (z) {
            AqS141S0200000_10 aqS141S0200000_10 = new AqS141S0200000_10(context, channel, 38);
            String string = sharePackage.extras.getString("download_share_path");
            if (string != null) {
                str = string;
            }
            C62340OdM.LIZIZ(aweme, channel, aqS141S0200000_10, sharePackage, str, i);
            return;
        }
        if (aweme != null) {
            String channelKey = channel.key();
            C62219ObP c62219ObP = new C62219ObP(aweme, channel, sharePackage, i, actionCallback, context);
            AqS151S0100000_1 aqS151S0100000_1 = new AqS151S0100000_1(actionCallback, (InterfaceC88472Yns<? super Boolean, C76800UCe>) 928);
            o.LJIIIZ(channelKey, "channelKey");
            Activity LJJLIIIJ = C78609UtB.LJJLIIIJ(context);
            if (LJJLIIIJ != null) {
                boolean LJ = o.LJ(channelKey, "instagram");
                int i2 = sharePackage.extras.getInt("page_type");
                C62222ObS c62222ObS = new C62222ObS(c62219ObP, aqS151S0100000_1);
                String string2 = sharePackage.extras.getString("enter_from");
                if (string2 != null) {
                    str = string2;
                }
                C62340OdM.LIZJ(LJJLIIIJ, view, aweme, LJ, i2, channelKey, c62222ObS, str, sharePackage);
            }
        }
    }
}
