package com.ss.android.ugc.aweme.screenshot;

import X.AbstractC62641OiD;
import X.ActivityC45651qj;
import X.C03660Ck;
import X.C221018lt;
import X.C47261Igj;
import X.C48841JEv;
import X.C4LD;
import X.C53293Kvp;
import X.C58096Mr6;
import X.C61878OQg;
import X.C62390OeA;
import X.C62434Oes;
import X.C62635Oi7;
import X.C62639OiB;
import X.C62657OiT;
import X.C62706OjG;
import X.C75502xm;
import X.C78613UtF;
import X.ESM;
import X.EnumC62459OfH;
import X.HG3;
import X.RBY;
import X.XKX;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import com.bytedance.poplayer.core.PopupManager;
import com.ss.android.ugc.aweme.feed.model.ACLCommonShare;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeACLShare;
import com.ss.android.ugc.aweme.feedback.screenshot.ScreenShotFeedbackService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage;
import com.ss.android.ugc.aweme.share.improve.pkg.UserSharePackage;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.AqS41S1300000_10;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class ScreenShotService implements IScreenshotService {
    public static IScreenshotService LJIIIZ() {
        Object LIZ = C58096Mr6.LIZ(IScreenshotService.class, false);
        if (LIZ != null) {
            return (IScreenshotService) LIZ;
        }
        if (C58096Mr6.C4 == null) {
            synchronized (IScreenshotService.class) {
                if (C58096Mr6.C4 == null) {
                    C58096Mr6.C4 = new ScreenShotService();
                }
            }
        }
        return C58096Mr6.C4;
    }

    @Override // com.ss.android.ugc.aweme.screenshot.IScreenshotService
    public final void LIZIZ(boolean z) {
        C62639OiB.LJII = z;
    }

    @Override // com.ss.android.ugc.aweme.screenshot.IScreenshotService
    public final void LIZLLL(Context context) {
        C62635Oi7.LJI.getClass();
        if (C62635Oi7.LJIIIIZZ == null) {
            C62635Oi7.LJIIIIZZ = new C62635Oi7();
        }
        C62635Oi7 c62635Oi7 = C62635Oi7.LJIIIIZZ;
        o.LJII(c62635Oi7, "null cannot be cast to non-null type com.ss.android.ugc.aweme.screenshot.ScreenShotMonitor");
        XKX.LIZLLL(C48841JEv.LIZ(C78613UtF.LIZJ), null, null, new C75502xm(c62635Oi7, context, null), 3);
    }

    @Override // com.ss.android.ugc.aweme.screenshot.IScreenshotService
    public final void LJ(AbstractC62641OiD screenShotListener) {
        o.LJIIIZ(screenShotListener, "screenShotListener");
        C62639OiB.LJFF.add(new WeakReference<>(screenShotListener));
    }

    @Override // com.ss.android.ugc.aweme.screenshot.IScreenshotService
    public final void LJI(String str) {
        String str2;
        if (str == null || ((str2 = C62639OiB.LJI) != null && o.LJ(str2, str))) {
            C62639OiB.LJI = null;
            C62639OiB.LJ = null;
        }
    }

    @Override // com.ss.android.ugc.aweme.screenshot.IScreenshotService
    public final void LJIIIIZZ(C62706OjG c62706OjG) {
        WeakReference<AbstractC62641OiD> weakReference;
        Iterator<WeakReference<AbstractC62641OiD>> it = C62639OiB.LJFF.iterator();
        while (true) {
            if (it.hasNext()) {
                weakReference = it.next();
                AbstractC62641OiD abstractC62641OiD = weakReference.get();
                if (abstractC62641OiD != null && abstractC62641OiD.hashCode() == c62706OjG.hashCode()) {
                    break;
                }
            } else {
                weakReference = null;
                break;
            }
        }
        WeakReference<AbstractC62641OiD> weakReference2 = weakReference;
        if (weakReference2 != null) {
            weakReference2.clear();
            C62639OiB.LJFF.remove(weakReference2);
        }
    }

    @Override // com.ss.android.ugc.aweme.screenshot.IScreenshotService
    public final void LIZ(String enterFrom, AbstractC62641OiD abstractC62641OiD) {
        o.LJIIIZ(enterFrom, "enterFrom");
        String str = C62639OiB.LJI;
        if (str == null || !o.LJ(str, enterFrom)) {
            C62639OiB.LJI = enterFrom;
            C62639OiB.LJ = abstractC62641OiD;
        }
    }

    @Override // com.ss.android.ugc.aweme.screenshot.IScreenshotService
    public final boolean LIZJ(ActivityC45651qj activityC45651qj, Aweme aweme) {
        Resources resources;
        Configuration configuration;
        AwemeACLShare awemeACLShare;
        ACLCommonShare shareThirdPlatform;
        AwemeACLShare awemeACLShare2;
        ACLCommonShare shareThirdPlatform2;
        if (PopupManager.LJFF() || C62639OiB.LJII || C53293Kvp.LIZIZ() || activityC45651qj.isFinishing() || (resources = activityC45651qj.getResources()) == null || (configuration = resources.getConfiguration()) == null || configuration.orientation != 1 || C62657OiT.LIZ(activityC45651qj)) {
            return false;
        }
        AwemeACLShare awemeACLShare3 = aweme.awemeACLShareInfo;
        if ((awemeACLShare3 != null && (shareThirdPlatform = awemeACLShare3.getShareThirdPlatform()) != null && Integer.valueOf(shareThirdPlatform.getCode()) != null && ((awemeACLShare2 = aweme.awemeACLShareInfo) == null || (shareThirdPlatform2 = awemeACLShare2.getShareThirdPlatform()) == null || shareThirdPlatform2.getCode() != 0)) || (awemeACLShare = aweme.awemeACLShareInfo) == null || awemeACLShare.getShareListStatus() != 0 || aweme.isPrivate() || !C47261Igj.LJJIJIIJI(0, 51, 52, 40, 2, 150).contains(Integer.valueOf(aweme.getAwemeType()))) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.screenshot.IScreenshotService
    public final boolean LJFF(User user, ActivityC45651qj activityC45651qj) {
        o.LJIIIZ(user, "user");
        if (!PopupManager.LJFF() && !C53293Kvp.LIZIZ() && !activityC45651qj.isFinishing() && !C62657OiT.LIZ(activityC45651qj) && !C62639OiB.LJII && user.getAgeGatePostAction() != 1 && !((RBY) HG3.LJIILL()).isChildrenMode()) {
            return true;
        }
        return false;
    }

    public static boolean LJIIJJI(ActivityC45651qj context, ScreenShotContent screenShotContent, String enterFrom) {
        User user;
        SharePackage LIZJ;
        Aweme aweme;
        Object content = screenShotContent.getContent();
        if (content instanceof Aweme) {
            o.LJIIIZ(context, "activity");
            o.LJIIIZ(enterFrom, "enterFrom");
            Object content2 = screenShotContent.getContent();
            if ((content2 instanceof Aweme) && (aweme = (Aweme) content2) != null) {
                AwemeSharePackage.Companion.getClass();
                LIZJ = C62434Oes.LIZ(0, context, aweme, enterFrom, "", "screenshot_popup", true);
                LIZJ.extras.putString("screenshot_image_path", screenShotContent.getImagePath());
                C4LD.LIZ.LJJJJJL(context, LIZJ, EnumC62459OfH.SHARE_SCREEN_SHOT.getType());
                return true;
            }
            return false;
        }
        if (content instanceof User) {
            C61878OQg c61878OQg = C61878OQg.INSTANCE;
            o.LJIIIZ(context, "context");
            o.LJIIIZ(enterFrom, "enterFrom");
            Object content3 = screenShotContent.getContent();
            if ((content3 instanceof User) && (user = (User) content3) != null) {
                UserSharePackage.Companion.getClass();
                LIZJ = C62390OeA.LIZJ(user, context, c61878OQg, enterFrom, "screenshot_popup");
                LIZJ.extras.putString("screenshot_image_path", screenShotContent.getImagePath());
                C4LD.LIZ.LJJJJJL(context, LIZJ, EnumC62459OfH.SHARE_SCREEN_SHOT.getType());
                return true;
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.screenshot.IScreenshotService
    public final boolean LJII(ActivityC45651qj activityC45651qj, ScreenShotContent screenShotContent, String enterFrom) {
        o.LJIIIZ(enterFrom, "enterFrom");
        if (C53293Kvp.LIZJ()) {
            C221018lt.LJFF("ScreenShotService", "screenshot, showScreenShotShare - show share panel");
            ScreenShotFeedbackService.createIScreenShotFeedbackServicebyMonsterPlugin(false).isFeedbackEnable(true);
            return LJIIJJI(activityC45651qj, screenShotContent, enterFrom);
        }
        if (C53293Kvp.LIZ() == 3 || C53293Kvp.LIZ() == 4) {
            C221018lt.LJFF("ScreenShotService", "screenshot, showScreenShotShare - show share floating view");
            return LJIIJ(activityC45651qj, screenShotContent.getImagePath(), enterFrom, screenShotContent, new AqS41S1300000_10(this, activityC45651qj, screenShotContent, enterFrom, 1));
        }
        C221018lt.LJFF("ScreenShotService", "screenshot, showScreenShotShare - show feedback floating view");
        return LJIIJ(activityC45651qj, screenShotContent.getImagePath(), enterFrom, null, null);
    }

    public static boolean LJIIJ(ActivityC45651qj activityC45651qj, String str, String str2, ScreenShotContent screenShotContent, AqS41S1300000_10 aqS41S1300000_10) {
        ESM<?> esm;
        C62639OiB.LJII = true;
        if (screenShotContent != null) {
            esm = new ESM<>(C03660Ck.LIZ(activityC45651qj, R.string.r2s, "activity.resources.getString(R.string.share)"), screenShotContent, new AqS160S0100000_10(aqS41S1300000_10, 463));
        } else {
            esm = null;
        }
        return ScreenShotFeedbackService.createIScreenShotFeedbackServicebyMonsterPlugin(false).tryShowScreenShotFloatingView(activityC45651qj, str, str2, esm);
    }
}
