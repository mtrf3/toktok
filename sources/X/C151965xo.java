package X;

import com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shoutouts.ShoutOutsData;
import defpackage.e1;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.5xo, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C151965xo {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZIZ() {
        AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false).getStoryService();
        return C43119Gw7.LIZ() && !C1DG.LJIIIIZZ();
    }

    public static boolean LIZ(VideoPublishEditModel videoPublishEditModel) {
        if (H7R.LJJLIIIJJIZ(videoPublishEditModel)) {
            return false;
        }
        if (H7R.LJJIL(videoPublishEditModel)) {
            return true;
        }
        if (!LIZIZ() || videoPublishEditModel.canvasVideoData == null) {
            return false;
        }
        return true;
    }

    public static boolean LIZJ(VideoPublishEditModel model) {
        o.LJIIIZ(model, "model");
        if (H7R.LJJLIIIJJIZ(model) || model.isEnterFromDM()) {
            return true;
        }
        if (LIZIZ() && !o.LJ("effect_qr_scan", model.enterFrom) && !model.isShoutout() && !o.LJ(model.mShootWay, ShoutOutsData.shootWay) && !C44384HbQ.LJLLLLLL(model)) {
            return true;
        }
        return false;
    }

    public static boolean LIZLLL(VideoPublishEditModel model) {
        o.LJIIIZ(model, "model");
        if (LJ(model) || model.isCommentReply() || LJFF(model)) {
            return false;
        }
        Boolean bool = model.hasQaSticker;
        o.LJIIIIZZ(bool, "model.hasQaSticker");
        if (bool.booleanValue() || C6H4.LJFF(model.creativeModel.stickerModel)) {
            return false;
        }
        if (H7R.LJJLIIIJJIZ(model) && !LIZIZ()) {
            return false;
        }
        return true;
    }

    public static boolean LJ(VideoPublishEditModel model) {
        o.LJIIIZ(model, "model");
        if (!e1.LIZ(31744, "enable_non_story_tab_publish_story", true, true) && !C47261Igj.LJJIJIIJI(15, 16, 0).contains(Integer.valueOf(model.mShootMode)) && !H7R.LJJJJL(model) && !model.creativeModel.changeAvatarModel.isFromChangeAvatar && !C79004UzY.LJJIIJ(model.canvasVideoData)) {
            return true;
        }
        return false;
    }

    public static boolean LJFF(VideoPublishEditModel editModel) {
        AVChallenge aVChallenge;
        o.LJIIIZ(editModel, "editModel");
        if (C41660GWq.LIZ) {
            return true;
        }
        AVMusic extractAVMusic = MusicBeanUtilKt.extractAVMusic(editModel.creativeModel.musicBuzModel);
        if (extractAVMusic == null || (aVChallenge = extractAVMusic.challenge) == null || !aVChallenge.isCommerce) {
            List<AVChallenge> list = editModel.challenges;
            if (list != null && !list.isEmpty()) {
                for (AVChallenge aVChallenge2 : list) {
                    if (aVChallenge2 == null || !aVChallenge2.isCommerce) {
                    }
                }
            }
            if (editModel.creativeModel.commerceModel.getMission() != null || o.LJ(editModel.mShootWay, "tcm_upload")) {
                return true;
            }
            return false;
        }
        return true;
    }
}
