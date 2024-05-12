package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.common.BaseShareContext;
import com.ss.android.ugc.aweme.common.PublishSettings;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.RetakeVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.stitch.StitchParams;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.GMa, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41384GMa extends C78253UnR {
    public static final /* synthetic */ int LJLJJLL = 0;

    public static void LJII(AbstractC41354GKw abstractC41354GKw) {
        int i;
        if (abstractC41354GKw instanceof GL2) {
            GL2 gl2 = (GL2) abstractC41354GKw;
            boolean z = gl2.LIZ;
            boolean z2 = gl2.LIZIZ;
            Activity activity = gl2.LIZJ;
            Intent intent = gl2.LIZLLL;
            if (z) {
                HZV.LIZ().LJIJ(activity, 1002, intent);
                return;
            } else if (z2) {
                HZV.LIZ().LJIJ(activity, 8, intent);
                return;
            } else {
                HZV.LIZ().LJIIZILJ(activity, intent);
                return;
            }
        }
        if (abstractC41354GKw instanceof GL1) {
            GL1 gl1 = (GL1) abstractC41354GKw;
            Activity requireActivity = gl1.LIZ.requireActivity();
            o.LJIIIIZZ(requireActivity, "pageAction.scene.requireActivity()");
            VideoPublishEditModel videoPublishEditModel = gl1.LIZJ;
            Intent intent2 = gl1.LIZIZ;
            if (intent2.getIntExtra("restore", 0) == 1) {
                CreativeModel creativeModel = videoPublishEditModel.creativeModel;
                o.LJIIIIZZ(creativeModel, "model.creativeModel");
                Iterator it = ((ArrayList) C41389GMf.LIZ).iterator();
                while (it.hasNext()) {
                    ((InterfaceC41390GMg) it.next()).LIZLLL(creativeModel);
                }
            }
            HZV.LIZ().LJJI(requireActivity, intent2);
            ((ArrayList) C41658GWo.LIZLLL().LIZ).clear();
            if (!C60903NvH.LJIIJJI().getAccountService().isChildrenMode() && videoPublishEditModel.mIsFromDraft) {
                return;
            }
            AbstractC42651GoZ LJIJ = C86793Y4n.LJIJ(gl1.LIZ);
            if (LJIJ == null) {
                Activity activity2 = gl1.LIZ.mActivity;
                if (activity2 == null) {
                    return;
                }
                activity2.finish();
                return;
            }
            LJIJ.LLJJI();
            return;
        }
        if (abstractC41354GKw instanceof C41355GKx) {
            C60903NvH.LJIIJJI().LJIIJ().LJIILIIL();
            C41355GKx c41355GKx = (C41355GKx) abstractC41354GKw;
            AbstractC42651GoZ LJIJ2 = C86793Y4n.LJIJ(c41355GKx.LIZ);
            if (LJIJ2 == null) {
                Activity activity3 = c41355GKx.LIZ.mActivity;
                if (activity3 == null) {
                    return;
                }
                activity3.finish();
                return;
            }
            LJIJ2.LLJJI();
            return;
        }
        if (abstractC41354GKw instanceof GL3) {
            GL3 gl3 = (GL3) abstractC41354GKw;
            Activity activity4 = gl3.LIZ;
            RetakeVideoContext retakeVideoContext = gl3.LIZIZ;
            VideoPublishEditModel videoPublishEditModel2 = gl3.LIZJ;
            boolean z3 = gl3.LIZLLL;
            o.LJII(activity4, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            Intent LIZ = C163616bV.LIZ((ActivityC45651qj) activity4, videoPublishEditModel2);
            if (LIZ == null) {
                LIZ = new Intent();
            }
            LIZ.putExtra("retake_video", retakeVideoContext);
            LIZ.putExtra("retake_shoot_mode", 1);
            if (z3) {
                LIZ.putExtra("extra_retake_from_advanced", true);
            }
            HZV.LIZ().LJIIIIZZ(activity4, LIZ);
            return;
        }
        if (abstractC41354GKw instanceof C41353GKv) {
            GI4 LJJIIZ = C78857UxB.LJJIIZ();
            LJJIIZ.LJII();
            LJJIIZ.LJFF("after_click_publish", true);
            LJJIIZ.LJI(1);
            VideoPublishEditModel videoPublishEditModel3 = ((C41353GKv) abstractC41354GKw).LIZ;
            C78934UyQ.LJLIL.LIZJ();
            C41388GMe.LIZ(videoPublishEditModel3);
            C78934UyQ.LJLIL.LIZJ();
            if (H7R.LJJJJZI(videoPublishEditModel3)) {
                i = 18;
            } else if (C44384HbQ.LJJIJIL(videoPublishEditModel3) && videoPublishEditModel3.creativeModel.quickPostOnEditPageModel.LIZ) {
                i = 17;
            } else {
                i = 16;
            }
            C41388GMe.LIZJ(i, videoPublishEditModel3, new AqS173S0100000_7(abstractC41354GKw, (AbstractC41354GKw<Object>) 369), new AqS173S0100000_7(abstractC41354GKw, (AbstractC41354GKw<Object>) 370));
            return;
        }
        if (abstractC41354GKw instanceof GK4) {
            GK4 gk4 = (GK4) abstractC41354GKw;
            VideoPublishEditModel videoPublishEditModel4 = gk4.LIZIZ;
            C78934UyQ.LJLIL.LIZJ();
            C41388GMe.LIZ(videoPublishEditModel4);
            C78934UyQ.LJLIL.LIZJ().LIZIZ(gk4.LIZ, videoPublishEditModel4, new AqS173S0100000_7(abstractC41354GKw, (AbstractC41354GKw<Object>) 371), new AqS173S0100000_7(abstractC41354GKw, (AbstractC41354GKw<Object>) 372));
            return;
        }
        if (abstractC41354GKw instanceof C41347GKp) {
            C41347GKp c41347GKp = (C41347GKp) abstractC41354GKw;
            C60903NvH.LJIIJJI().getPublishService().LJIIIIZZ().LIZIZ(c41347GKp.LIZ, c41347GKp.LIZIZ, c41347GKp.LIZJ, c41347GKp.LIZLLL);
            return;
        }
        throw new C162476Zf();
    }

    public static C147535qf LJIIIIZZ(Bundle bundle, LifecycleOwner lifecycleOwner) {
        AVMusic aVMusic;
        BaseShareContext baseShareContext;
        PublishSettings publishSettings;
        int i;
        new C43542H7a("VEVideoPublishEditActivity");
        VideoPublishEditModel LJII = C43542H7a.LJII(bundle);
        List<InteractStickerStruct> LJI = C164826dS.LJI(LJII.getMainBusinessContext(), 11, EnumC164816dR.TRACK_PAGE_EDIT);
        if (LJI != null && LJI.size() > 0) {
            LJII.captionStruct = ((InteractStickerStruct) ListProtector.get(LJI, 0)).getCaptionStruct();
            LJII.mSubtitleMusicChangeChecker.getData(LJII);
        }
        LJII.isPrivate = bundle.getInt("is_rivate", C42000Ge4.LJI(LJII));
        C60903NvH.LJIIJJI().LJJJI().LJIIIIZZ();
        LJII.setNewVersion(3);
        LJII.setStickPointType(bundle.getInt("extra_stick_point_type", 0));
        boolean z = bundle.getBoolean("is_from_sys_share", false);
        int i2 = bundle.getInt("draft_to_edit_from", 0);
        LJII.isFromRestoreRecover = bundle.getBoolean("extra_direct_jump_from_crash", false);
        LJII.setDraftMusicIllegal(bundle.getBoolean("draft_music_legal_param", false));
        LJII.shootEnterMethod = bundle.getString("enter_method");
        try {
            aVMusic = MusicBeanUtilKt.extractAVMusic(LJII.creativeModel.musicBuzModel);
            if (aVMusic == null) {
                new I9Q();
                aVMusic = I9Q.LIZ((MusicModel) bundle.getSerializable("music_model"));
                if (aVMusic == null) {
                    aVMusic = (AVMusic) bundle.getSerializable("aweme_music");
                }
            }
        } catch (Exception unused) {
            aVMusic = null;
        }
        if (aVMusic != null) {
            LJII.setMusicId(aVMusic.getMusicId());
            if (aVMusic.getLogPb() != null) {
                LJII.setMusicRequestId(aVMusic.getLogPb().getImprId());
            }
            LJII.setPreviewStartTime(aVMusic.getPreviewStartTime());
            LJII.setCommerceMusic(aVMusic.isCommerceMusic());
            LJII.isOriginalSound = aVMusic.isOriginalSound();
            LJII.setMId3Album(aVMusic.getAlbum());
            LJII.setMId3Title(aVMusic.getName());
            LJII.setMId3Author(aVMusic.getSinger());
            UrlModel urlModel = aVMusic.coverThumb;
            if (urlModel != null && !C79004UzY.LJJIFFI(urlModel.getUrlList())) {
                LJII.setMusicCover((String) ListProtector.get(aVMusic.coverThumb.getUrlList(), 0));
            }
            if (C78934UyQ.LJLIL.getMusicService().isMusicTypeLocal(aVMusic.getMusicType())) {
                i = 1;
            } else {
                i = aVMusic.musicType;
            }
            LJII.setMMusicType(i);
            if (aVMusic.musicType == 2) {
                LJII.setIsReuseOriginalSound(true);
                LJII.setReuseOriginalSoundId(aVMusic.getMusicId());
                LJII.setReuseOriginalSoundLength(aVMusic.getShootDuration());
                LJII.setReuseOriginalSoundUrls(aVMusic.getReuseAudioPlayUrl());
            }
        }
        if (LJII.recordMode == 1 && !LJII.mIsFromDraft) {
            LJII.setMMusicPath(null);
        }
        LJII.pic2VideoSource = bundle.getString("picture_source");
        LJII.setStickPointType(bundle.getInt("extra_stick_point_type", 0));
        String string = bundle.getString("extra_festival_external_challenge_id");
        if (!TextUtils.isEmpty(string)) {
            new C41386GMc(lifecycleOwner, string).LIZ(new C41385GMb(LJII));
        }
        LJII.stitchParams = (StitchParams) bundle.getParcelable("stitch_params");
        LJII.uploadMethod = bundle.getString("upload_method");
        LJII.templateId = bundle.getString("template_id");
        LJII.albumPreviewNextMethod = bundle.getString("upload_next_method");
        AVMusic aVMusic2 = (AVMusic) bundle.getSerializable("extra_music_use_in_record_page_mv");
        if (aVMusic2 != null) {
            aVMusic = aVMusic2;
        }
        Serializable serializable = bundle.getSerializable("extra_share_context");
        if ((serializable instanceof C43722HDy) && (baseShareContext = (BaseShareContext) serializable) != null && (publishSettings = baseShareContext.mPublishSettings) != null) {
            C42000Ge4.LIZ(LJII, publishSettings);
            int LJJIJLIJ = (C60903NvH.LJIIJJI().getPublishService().LJJIJLIJ(bundle.getInt("creation_mode", 1)) - baseShareContext.mAppName.length()) - 2;
            String str = LJII.title;
            if (str != null && str.length() > LJJIJLIJ) {
                String substring = str.substring(0, LJJIJLIJ);
                o.LJIIIIZZ(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                C42000Ge4.LJ(LJII, substring);
            }
            String title = publishSettings.getTitle();
            if (title != null && title.length() != 0) {
                LJII.heading = publishSettings.getTitle();
            }
        }
        LJII.creativeModel.musicBuzModel.needAddRecent = bundle.getBoolean("extra_need_add_recent", false);
        return new C147535qf(LJII, z, i2, aVMusic);
    }

    public static C147535qf LJIIIZ(Intent intent, ActivityC45651qj activityC45651qj) {
        Bundle LLJJIJI = C16880lQ.LLJJIJI(intent);
        if (LLJJIJI != null) {
            return LJIIIIZZ(LLJJIJI, activityC45651qj);
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }
}
