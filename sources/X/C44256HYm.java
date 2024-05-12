package X;

import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.services.BaseUserService;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import defpackage.e1;
import kotlin.jvm.internal.o;

/* renamed from: X.HYm, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44256HYm {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZIZ(ShortVideoContext shortVideoContext) {
        o.LJIIIZ(shortVideoContext, "shortVideoContext");
        if (LJIIJJI(shortVideoContext)) {
            return true;
        }
        if (LJ(shortVideoContext)) {
            return false;
        }
        if (ORY.LJJIJIIJIL(shortVideoContext.recordParam, new String[]{"customizedSticker", "mobileStickTemplate"}) || LJIIIZ(shortVideoContext)) {
            return false;
        }
        if (o.LJ(shortVideoContext.shootWay, "direct_shoot") && !shortVideoContext.mIsFromDraft && shortVideoContext.LJIIIIZZ() > 0) {
            return false;
        }
        if (C00F.LIZ(31744, 0, "land_to_camera_tab_on_single_song", true) == 1 && HYY.LIZIZ(shortVideoContext)) {
            return false;
        }
        if (HYX.LIZIZ(shortVideoContext) && !e1.LIZ(31744, "studio_creation_record_photo_shootways_plus", true, false)) {
            return false;
        }
        if (!C44356Hay.LIZIZ(shortVideoContext.shootMode, shortVideoContext.shootWay) && !C44258HYo.LIZ()) {
            return true;
        }
        return false;
    }

    public static boolean LIZJ(ShortVideoContext shortVideoContext) {
        o.LJIIIZ(shortVideoContext, "shortVideoContext");
        if (LJ(shortVideoContext)) {
            if (!V18.LIZLLL(shortVideoContext) || shortVideoContext.creativeModel.toUploadAlbum || V19.LIZ() || new HZX().LIZ(C60903NvH.LJIIJJI().getAccountService().getCurrentUserID()) || C46140I8y.LIZ(shortVideoContext.enterFrom)) {
                return false;
            }
            return true;
        }
        if (LJIIIZ(shortVideoContext)) {
            return true;
        }
        if (o.LJ(shortVideoContext.shootWay, "direct_shoot") && !shortVideoContext.mIsFromDraft && shortVideoContext.LJIIIIZZ() > 0) {
            return true;
        }
        if (HYX.LIZIZ(shortVideoContext) && !e1.LIZ(31744, "studio_creation_record_photo_shootways_plus", true, false)) {
            return true;
        }
        if (LJIIIIZZ(shortVideoContext)) {
            return false;
        }
        AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false).getStoryService();
        if (C43119Gw7.LIZ() && !shortVideoContext.LJJIJIIJI() && !shortVideoContext.LJJIIZ() && ((!GX0.LIZ() || !C41669GWz.LIZ()) && LIZIZ(shortVideoContext))) {
            return false;
        }
        if (!LIZ(shortVideoContext, I38.RECORD_COMBINE_15.getTag()) && !LIZ(shortVideoContext, I38.RECORD_COMBINE_60.getTag()) && !LIZ(shortVideoContext, I38.RECORD_COMBINE_180.getTag()) && !LIZ(shortVideoContext, I38.RECORD_COMBINE_600.getTag()) && !LIZ(shortVideoContext, "RecordCombinePhoto") && !LIZ(shortVideoContext, I38.RECORD_NOW.getTag())) {
            return false;
        }
        return true;
    }

    public static boolean LIZLLL(ShortVideoContext shortVideoContext) {
        o.LJIIIZ(shortVideoContext, "shortVideoContext");
        if (o.LJ("push", shortVideoContext.shootWay) && shortVideoContext.mToLive) {
            return true;
        }
        return false;
    }

    public static boolean LJ(ShortVideoContext shortVideoContext) {
        if (LJIILJJIL(shortVideoContext) && shortVideoContext.mToLive) {
            return true;
        }
        if ((LJIILL(shortVideoContext) && LJIILLIIL(shortVideoContext)) || V18.LIZLLL(shortVideoContext)) {
            return true;
        }
        if (HVI.LIZ() && V16.LJIIIZ(shortVideoContext)) {
            return true;
        }
        if ((C44252HYi.LIZ() && ORZ.LJLJJI(shortVideoContext.shootWay, C44356Hay.LIZIZ)) || LJIIJJI(shortVideoContext)) {
            return true;
        }
        return false;
    }

    public static boolean LJFF(ShortVideoContext shortVideoContext) {
        o.LJIIIZ(shortVideoContext, "shortVideoContext");
        if (o.LJ("comment_reply", shortVideoContext.shootWay) || o.LJ(shortVideoContext.shootWay, "question_and_answer")) {
            return true;
        }
        return false;
    }

    public static boolean LJI(ShortVideoContext shortVideoContext) {
        o.LJIIIZ(shortVideoContext, "shortVideoContext");
        if (LJII(shortVideoContext)) {
            return true;
        }
        if ((shortVideoContext.mIsFromDraft && shortVideoContext.shootMode == 15 && !shortVideoContext.isPhotoMvMode) || LJIIIIZZ(shortVideoContext)) {
            return true;
        }
        return false;
    }

    public static boolean LJII(ShortVideoContext shortVideoContext) {
        int i;
        o.LJIIIZ(shortVideoContext, "shortVideoContext");
        if (shortVideoContext.mIsFromDraft && shortVideoContext.isPhotoMvMode && (i = shortVideoContext.shootMode) != 17 && i != 10 && i != 16 && i != 20) {
            return true;
        }
        return false;
    }

    public static boolean LJIIIIZZ(ShortVideoContext shortVideoContext) {
        o.LJIIIZ(shortVideoContext, "shortVideoContext");
        if (shortVideoContext.mIsFromDraft && shortVideoContext.shootMode == 20) {
            return true;
        }
        return false;
    }

    public static boolean LJIIIZ(ShortVideoContext shortVideoContext) {
        int i;
        if (!shortVideoContext.mIsFromDraft) {
            if (shortVideoContext.cameraComponentModel.mRestoreType != 2) {
                return false;
            }
            i = HB4.LIZIZ().shootMode;
        } else {
            i = shortVideoContext.shootMode;
        }
        if (i != 10 && i != 11 && i != 14) {
            return false;
        }
        return true;
    }

    public static boolean LJIIJ(ShortVideoContext shortVideoContext) {
        int i;
        o.LJIIIZ(shortVideoContext, "shortVideoContext");
        if (shortVideoContext.mIsFromDraft && ((i = shortVideoContext.shootMode) == 17 || ((shortVideoContext.isPhotoMvMode && i == 10) || i == 16))) {
            return true;
        }
        return false;
    }

    public static boolean LJIIJJI(ShortVideoContext shortVideoContext) {
        o.LJIIIZ(shortVideoContext, "shortVideoContext");
        if (!o.LJ(shortVideoContext.shootWay, "story") || !C142355iJ.LIZ()) {
            return false;
        }
        AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false).getStoryService();
        if (!C43119Gw7.LIZ()) {
            return false;
        }
        if (!C44252HYi.LIZ() && !C44258HYo.LIZ()) {
            return false;
        }
        return true;
    }

    public static boolean LJIIL(ShortVideoContext shortVideoContext) {
        if (shortVideoContext.LJJJI() || shortVideoContext.LJJIJIIJI() || shortVideoContext.LJJIIZ() || LJI(shortVideoContext) || C78685UuP.LJJJZ(shortVideoContext.creativeModel.paidContentModel.getCollectionId())) {
            return false;
        }
        return true;
    }

    public static boolean LJIILIIL(ShortVideoContext shortVideoContext) {
        if (shortVideoContext.LJJJI() || shortVideoContext.LJJIJIIJI() || shortVideoContext.LJJIIZ() || LJI(shortVideoContext) || C78685UuP.LJJJZ(shortVideoContext.creativeModel.paidContentModel.getCollectionId())) {
            return false;
        }
        return true;
    }

    public static boolean LJIILJJIL(ShortVideoContext shortVideoContext) {
        o.LJIIIZ(shortVideoContext, "shortVideoContext");
        if (shortVideoContext.LJJIJIIJI() || LJI(shortVideoContext) || LJIIJJI(shortVideoContext) || LJIIJ(shortVideoContext)) {
            return false;
        }
        int i = shortVideoContext.tabs;
        if (i != 0 && (i & 8) != 8) {
            return false;
        }
        C60903NvH.LJIIJJI().getRegionService();
        Boolean LIZIZ = C44296Ha0.LIZIZ();
        o.LJIIIIZZ(LIZIZ, "getAPI().regionService.isInTikTokRegion");
        if (LIZIZ.booleanValue()) {
            if (!o.LJ("direct_shoot", shortVideoContext.shootWay) && !o.LJ("urge_update", shortVideoContext.shootWay) && !o.LJ("story", shortVideoContext.shootWay) && !LIZLLL(shortVideoContext)) {
                return false;
            }
            C44172HVg.LJIILLIIL.getClass();
            if (!IAX.LIZIZ() || LJFF(shortVideoContext)) {
                return false;
            }
        } else {
            C44172HVg.LJIIZILJ.getClass();
            if (!IAX.LIZIZ()) {
                return false;
            }
            C44172HVg.LJIILLIIL.getClass();
            LiveOuterService.LJJJLL().LJJI().getClass();
            IUserService createIUserServicebyMonsterPlugin = BaseUserService.createIUserServicebyMonsterPlugin(false);
            if (createIUserServicebyMonsterPlugin == null || !createIUserServicebyMonsterPlugin.isLogin() || !C31130CJq.LIZJ || LiveOuterService.LJJJLL().LJJIJIL() == null || shortVideoContext.LJJJI()) {
                return false;
            }
            if ((!o.LJ("direct_shoot", shortVideoContext.shootWay) && !o.LJ("story", shortVideoContext.shootWay) && !LIZLLL(shortVideoContext)) || LJFF(shortVideoContext)) {
                return false;
            }
        }
        return true;
    }

    public static boolean LJIILL(ShortVideoContext shortVideoContext) {
        o.LJIIIZ(shortVideoContext, "shortVideoContext");
        if (shortVideoContext.LJJIJIIJI()) {
            return false;
        }
        int i = shortVideoContext.tabs;
        if ((i != 0 && (i & 4) != 4) || !C60903NvH.LJIIJJI().LJI().LJI() || shortVideoContext.LJJJI() || shortVideoContext.mShoutOutsData != null) {
            return false;
        }
        return true;
    }

    public static boolean LJIILLIIL(ShortVideoContext shortVideoContext) {
        o.LJIIIZ(shortVideoContext, "shortVideoContext");
        if ((C60903NvH.LJIIJJI().LJI().LIZIZ(shortVideoContext) && shortVideoContext.enterMvThemeEffect != null) || C78857UxB.LJJJIL(shortVideoContext.enterCutsameId)) {
            return true;
        }
        return false;
    }

    public static boolean LIZ(ShortVideoContext shortVideoContext, String tag) {
        o.LJIIIZ(tag, "tag");
        o.LJIIIZ(shortVideoContext, "shortVideoContext");
        if (LJ(shortVideoContext)) {
            return false;
        }
        return o.LJ(tag, C60903NvH.LJIIJJI().LJJIII().getDefaultShootTabTag(shortVideoContext));
    }
}
