package com.ss.android.ugc.aweme.views;

import X.AbstractViewOnClickListenerC55470Lpq;
import X.C145995oB;
import X.C19K;
import X.C43598H9e;
import X.C43838HIk;
import X.C45628HvU;
import X.C45736HxE;
import X.C46084I6u;
import X.C46118I8c;
import X.C46119I8d;
import X.C48331Ixz;
import X.C4LD;
import X.C5S1;
import X.C62905OmT;
import X.C62906OmU;
import X.C76800UCe;
import X.C78934UyQ;
import X.C80461Vhx;
import X.C82374WUo;
import X.C82378WUs;
import X.C82379WUt;
import X.C82380WUu;
import X.FMX;
import X.G5D;
import X.G8G;
import X.H8W;
import X.HTP;
import X.I0N;
import X.I3X;
import X.I4Z;
import X.I6E;
import X.I6G;
import X.I6N;
import X.I7B;
import X.I7R;
import X.InterfaceC146755pP;
import X.WM7;
import Y.IDCListenerS160S0100000_7;
import android.app.Activity;
import android.text.Editable;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.commerce.tools.sticker.service.CommerceToolsStickerServiceImpl;
import com.ss.android.ugc.aweme.creative.model.AutoCutModel;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.ftc.pages.FTCVideoPublishActivity;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.service.CommonFeedApiService;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoViewModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishContainerScene;
import com.ss.android.ugc.aweme.tools.sticker.core.QAStickerModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes8.dex */
public class IDlS63S0100000_7 extends AbstractViewOnClickListenerC55470Lpq {
    public final int $t;
    public Object l0;

    @Override // X.AbstractViewOnClickListenerC55470Lpq
    public final void LIZ(View view) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view);
                return;
            case 1:
                LIZ$1(this, view);
                return;
            case 2:
                LIZ$2(this, view);
                return;
            case 3:
                LIZ$3(this, view);
                return;
            case 4:
                LIZ$4(this, view);
                return;
            case 5:
                LIZ$5(this, view);
                return;
            case 6:
                LIZ$6(this, view);
                return;
            case 7:
                LIZ$7(this, view);
                return;
            case 8:
                LIZ$8(this, view);
                return;
            case 9:
                LIZ$9(this, view);
                return;
            case 10:
                LIZ$10(this, view);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                LIZ$11(this, view);
                return;
            case 12:
                LIZ$12(this, view);
                return;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                LIZ$13(this, view);
                return;
            case 14:
                LIZ$14(this, view);
                return;
            case 15:
                LIZ$15(this, view);
                return;
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                LIZ$16(this, view);
                return;
            case 17:
                LIZ$17(this, view);
                return;
            case 18:
                LIZ$18(this, view);
                return;
            case 19:
                LIZ$19(this, view);
                return;
            case 20:
                LIZ$20(this, view);
                return;
            case 21:
                LIZ$21(this, view);
                return;
            case 22:
                LIZ$22(this, view);
                return;
            case 23:
                LIZ$23(this, view);
                return;
            case 24:
                LIZ$24(this, view);
                return;
            case 25:
                LIZ$25(this, view);
                return;
            default:
                super.LIZ(view);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDlS63S0100000_7(VideoPublishContainerScene videoPublishContainerScene, int i) {
        super(1000L);
        this.$t = i;
        this.l0 = videoPublishContainerScene;
    }

    public static final void LIZ$0(IDlS63S0100000_7 iDlS63S0100000_7, View v) {
        o.LJIIIZ(v, "v");
        C82378WUs c82378WUs = (C82378WUs) iDlS63S0100000_7.l0;
        if (c82378WUs.LJLIL.LIZIZ().cameraComponentModel.isRetakeMode && c82378WUs.LJLIL.LIZIZ().LJIIIIZZ() < c82378WUs.LJLIL.LIZIZ().LJIILIIL()) {
            C5S1 c5s1 = new C5S1(c82378WUs.mActivity);
            c5s1.LIZJ(R.string.fjr);
            c5s1.LJ();
            return;
        }
        if (c82378WUs.LJLIL.LIZIZ().cameraComponentModel.isRetakeMode) {
            C43838HIk.LIZIZ(c82378WUs.LJLIL.LIZIZ().LJII().size());
        }
        c82378WUs.LJLIL.LIZ().J0().LIZ();
        c82378WUs.LJLIL.LIZ().nZ("ftc click go next");
        if (C48331Ixz.LJ()) {
            C145995oB c145995oB = new C145995oB();
            c145995oB.LJI(WM7.SCENE_SERVICE, "go_edit");
            c145995oB.LJI("shoot_way", c82378WUs.LJLIL.LIZIZ().shootWay);
            c145995oB.LJI("creation_id", c82378WUs.LJLIL.LIZIZ().LJI());
            c145995oB.LJI("enter_from", c82378WUs.LJLIL.LIZIZ().enterFrom);
            HTP.LJLJL.getClass();
            c145995oB.LIZIZ(0L, "dalvikPss");
            c145995oB.LIZIZ(0L, "nativePss");
            c145995oB.LIZIZ(0L, "otherPss");
            c145995oB.LIZIZ(0L, "totalPss");
            FMX.LJIIL("av_memory_log", c145995oB.LIZ);
        }
        CommerceToolsStickerServiceImpl.LJIIL().LJ(c82378WUs.LJLIL.LIZIZ());
    }

    public static final void LIZ$1(IDlS63S0100000_7 iDlS63S0100000_7, View view) {
        C46084I6u c46084I6u = (C46084I6u) iDlS63S0100000_7.l0;
        ((InterfaceC146755pP) c46084I6u.LJLJJI.LIZ(c46084I6u, C46084I6u.LJLLLLLL[1])).LJJLIIIJL(false);
    }

    public static final void LIZ$10(IDlS63S0100000_7 iDlS63S0100000_7, View view) {
        C4LD.LIZIZ.LJJJZ();
        CreativeModel creativeModel = ((VideoPublishContainerScene) iDlS63S0100000_7.l0).LLILZLL.creativeModel;
        creativeModel.shortcutPublishStatusModel.LIZ = true;
        G5D g5d = creativeModel.transientPostPageModel;
        g5d.getClass();
        g5d.LJIL = "top_publish";
        ((VideoPublishContainerScene) iDlS63S0100000_7.l0).c();
        G5D g5d2 = ((VideoPublishContainerScene) iDlS63S0100000_7.l0).LLILZLL.creativeModel.transientPostPageModel;
        g5d2.getClass();
        g5d2.LJIL = "root";
    }

    public static final void LIZ$11(IDlS63S0100000_7 iDlS63S0100000_7, View view) {
        CreativeModel creativeModel = ((VideoPublishContainerScene) iDlS63S0100000_7.l0).LLILZLL.creativeModel;
        creativeModel.shortcutPublishStatusModel.LIZ = true;
        G5D g5d = creativeModel.transientPostPageModel;
        g5d.getClass();
        g5d.LJIL = "top_submit";
        ((VideoPublishContainerScene) iDlS63S0100000_7.l0).c();
        G5D g5d2 = ((VideoPublishContainerScene) iDlS63S0100000_7.l0).LLILZLL.creativeModel.transientPostPageModel;
        g5d2.getClass();
        g5d2.LJIL = "root";
    }

    public static final void LIZ$12(IDlS63S0100000_7 iDlS63S0100000_7, View view) {
        AVMusic extractAVMusic = MusicBeanUtilKt.extractAVMusic(((C46119I8d) iDlS63S0100000_7.l0).LJLJJL.creativeModel.musicBuzModel);
        if (extractAVMusic != null) {
            C46119I8d c46119I8d = (C46119I8d) iDlS63S0100000_7.l0;
            C145995oB c145995oB = new C145995oB();
            c145995oB.LJI("creation_id", c46119I8d.LJLJJL.LJI());
            c145995oB.LJI("enter_from", "video_shoot_page");
            c145995oB.LJI("music_id", extractAVMusic.getMusicId());
            c145995oB.LJI("music_edited_from", extractAVMusic.getEditFrom());
            c145995oB.LJI("enter_method", "entrance_icon");
            c145995oB.LIZ(0, "is_editor_pro");
            FMX.LJIIL("edit_music", c145995oB.LIZ);
        }
        ((C46119I8d) iDlS63S0100000_7.l0).LJLILLLLZI.LJLL.LJII(C76800UCe.LIZ);
    }

    public static final void LIZ$13(IDlS63S0100000_7 iDlS63S0100000_7, View view) {
        AVMusic extractAVMusic = MusicBeanUtilKt.extractAVMusic(((C46118I8c) iDlS63S0100000_7.l0).LJLJL.creativeModel.musicBuzModel);
        if (extractAVMusic != null) {
            C46118I8c c46118I8c = (C46118I8c) iDlS63S0100000_7.l0;
            C145995oB c145995oB = new C145995oB();
            c145995oB.LJI("creation_id", c46118I8c.LJLJL.LJI());
            c145995oB.LJI("enter_from", "video_shoot_page");
            c145995oB.LJI("music_id", extractAVMusic.getMusicId());
            c145995oB.LJI("music_edited_from", extractAVMusic.getEditFrom());
            c145995oB.LJI("enter_method", "entrance_icon");
            c145995oB.LIZ(0, "is_editor_pro");
            FMX.LJIIL("edit_music", c145995oB.LIZ);
        }
        ((C46118I8c) iDlS63S0100000_7.l0).LJLJJI.LJLL.LJII(C76800UCe.LIZ);
    }

    public static final void LIZ$14(IDlS63S0100000_7 iDlS63S0100000_7, View v) {
        o.LJIIIZ(v, "v");
        C82379WUt c82379WUt = (C82379WUt) iDlS63S0100000_7.l0;
        c82379WUt.LJLJJI.creativeModel.commerceModel.setShowedCommerceTransformButton(false);
        c82379WUt.LJLJJI.creativeModel.commerceModel.setShowedCommerceTransformBottomButton(true);
        ShortVideoContext shortVideoContext = c82379WUt.LJLJJI;
        if (shortVideoContext.cameraComponentModel.isRetakeMode && shortVideoContext.LJIIIIZZ() < c82379WUt.LJLJJI.LJIILIIL()) {
            C5S1 c5s1 = new C5S1(c82379WUt.mActivity);
            c5s1.LIZJ(R.string.fjr);
            c5s1.LJ();
            return;
        }
        ShortVideoContext shortVideoContext2 = c82379WUt.LJLJJI;
        if (shortVideoContext2.cameraComponentModel.isRetakeMode) {
            C43838HIk.LIZIZ(shortVideoContext2.LJII().size());
        }
        c82379WUt.LJZ.LJII(C76800UCe.LIZ);
        if (c82379WUt.LJLJJI.LJJIIJZLJL()) {
            ((I0N) c82379WUt.LJLILLLLZI.LJ(I0N.class, null)).Y60().LIZJ();
        }
        c82379WUt.LJLJI.J0().LIZ();
        c82379WUt.LJLJI.nZ("click go next");
        if (C48331Ixz.LJ()) {
            C145995oB c145995oB = new C145995oB();
            c145995oB.LJI(WM7.SCENE_SERVICE, "go_edit");
            c145995oB.LJI("shoot_way", c82379WUt.LJLJJI.shootWay);
            c145995oB.LJI("creation_id", c82379WUt.LJLJJI.LJI());
            c145995oB.LJI("enter_from", c82379WUt.LJLJJI.enterFrom);
            HTP.LJLJL.getClass();
            c145995oB.LIZIZ(0L, "dalvikPss");
            c145995oB.LIZIZ(0L, "nativePss");
            c145995oB.LIZIZ(0L, "otherPss");
            c145995oB.LIZIZ(0L, "totalPss");
            FMX.LJIIL("av_memory_log", c145995oB.LIZ);
        }
        if (c82379WUt.LJLJJI.qaStickerModel != null) {
            C145995oB c145995oB2 = new C145995oB();
            QAStickerModel qAStickerModel = c82379WUt.LJLJJI.qaStickerModel;
            o.LJIIIIZZ(qAStickerModel, "shortVideoContext.qaStickerModel");
            c145995oB2.LJ("is_qa_sticker", o.LJ(qAStickerModel.getBaseStickerModel().getType().toString(), "question_and_answer"));
            c145995oB2.LIZJ(Float.valueOf(c82379WUt.LJLJJI.qaStickerModel.getBaseStickerModel().getTranslateY() + c82379WUt.LJLJJI.qaStickerModel.getBaseStickerModel().getTop()), "sticker_Y");
            c145995oB2.LIZJ(Float.valueOf(c82379WUt.LJLJJI.qaStickerModel.getBaseStickerModel().getTranslateX() + c82379WUt.LJLJJI.qaStickerModel.getBaseStickerModel().getLeft()), "sticker_X");
            c145995oB2.LIZJ(Float.valueOf(c82379WUt.LJLJJI.qaStickerModel.getBaseStickerModel().getRotation()), "sticker_angle");
            c145995oB2.LIZIZ((System.currentTimeMillis() - H8W.LIZIZ) / 1000, "qa_adjust_duration");
            QAStickerModel qAStickerModel2 = c82379WUt.LJLJJI.qaStickerModel;
            o.LJIIIIZZ(qAStickerModel2, "shortVideoContext.qaStickerModel");
            c145995oB2.LIZJ(Float.valueOf(qAStickerModel2.getBaseStickerModel().getScale()), "sticker_size");
            FMX.LJIIL("exit_shoot_page", c145995oB2.LIZ);
        }
        CommerceToolsStickerServiceImpl.LJIIL().LJ(c82379WUt.LJLJJI);
    }

    public static final void LIZ$15(IDlS63S0100000_7 iDlS63S0100000_7, View v) {
        o.LJIIIZ(v, "v");
        C82374WUo c82374WUo = (C82374WUo) iDlS63S0100000_7.l0;
        ShortVideoContext shortVideoContext = c82374WUo.LJLJI;
        if (shortVideoContext.cameraComponentModel.isRetakeMode && shortVideoContext.LJIIIIZZ() < c82374WUo.LJLJI.LJIILIIL()) {
            C5S1 c5s1 = new C5S1(c82374WUo.mActivity);
            c5s1.LIZJ(R.string.fjr);
            c5s1.LJ();
            return;
        }
        ShortVideoContext shortVideoContext2 = c82374WUo.LJLJI;
        if (shortVideoContext2.cameraComponentModel.isRetakeMode) {
            C43838HIk.LIZIZ(shortVideoContext2.LJII().size());
        }
        c82374WUo.LLF.LJII(C76800UCe.LIZ);
        c82374WUo.LJLILLLLZI.J0().LIZ();
        c82374WUo.LJLILLLLZI.nZ("click go next");
        if (C48331Ixz.LJ()) {
            C145995oB c145995oB = new C145995oB();
            c145995oB.LJI(WM7.SCENE_SERVICE, "go_edit");
            c145995oB.LJI("shoot_way", c82374WUo.LJLJI.shootWay);
            c145995oB.LJI("creation_id", c82374WUo.LJLJI.LJI());
            c145995oB.LJI("enter_from", c82374WUo.LJLJI.enterFrom);
            HTP.LJLJL.getClass();
            c145995oB.LIZIZ(0L, "dalvikPss");
            c145995oB.LIZIZ(0L, "nativePss");
            c145995oB.LIZIZ(0L, "otherPss");
            c145995oB.LIZIZ(0L, "totalPss");
            FMX.LJIIL("av_memory_log", c145995oB.LIZ);
        }
        CommerceToolsStickerServiceImpl.LJIIL().LJ(c82374WUo.LJLJI);
    }

    public static final void LIZ$16(IDlS63S0100000_7 iDlS63S0100000_7, View view) {
        String str;
        String str2;
        String obj;
        ((FTCVideoPublishActivity) iDlS63S0100000_7.l0).onBackPressed();
        C145995oB c145995oB = new C145995oB();
        VideoPublishEditModel videoPublishEditModel = ((FTCVideoPublishActivity) iDlS63S0100000_7.l0).LJLJI;
        Integer num = null;
        if (videoPublishEditModel != null) {
            str = videoPublishEditModel.getCreationId();
        } else {
            str = null;
        }
        c145995oB.LJI("creation_id", str);
        c145995oB.LJI("enter_from", "video_post_page");
        Editable text = ((C19K) ((FTCVideoPublishActivity) iDlS63S0100000_7.l0)._$_findCachedViewById(R.id.czk)).getText();
        if (text != null && (obj = text.toString()) != null) {
            str2 = s.LJZI(obj).toString();
        } else {
            str2 = null;
        }
        c145995oB.LJI("desc_detail", str2);
        VideoPublishEditModel videoPublishEditModel2 = ((FTCVideoPublishActivity) iDlS63S0100000_7.l0).LJLJI;
        if (videoPublishEditModel2 != null) {
            if (videoPublishEditModel2.draftId != 0) {
                num = Integer.valueOf(videoPublishEditModel2.draftId);
            }
            FMX.LJIIL("click_back", c145995oB.LIZ);
        }
        c145995oB.LIZJ(num, "draft_id");
        FMX.LJIIL("click_back", c145995oB.LIZ);
    }

    public static final void LIZ$17(IDlS63S0100000_7 iDlS63S0100000_7, View view) {
        G8G.LIZ.start("av_video_edit", "click onNext btn");
        CutVideoViewModel cutVideoViewModel = ((I4Z) iDlS63S0100000_7.l0).LJLJI;
        if (cutVideoViewModel != null) {
            cutVideoViewModel.setState(C45736HxE.LJLIL);
        } else {
            o.LJIJI("cutVideoViewModel");
            throw null;
        }
    }

    public static final void LIZ$18(IDlS63S0100000_7 iDlS63S0100000_7, View v) {
        C43598H9e J0;
        o.LJIIIZ(v, "v");
        C82380WUu c82380WUu = (C82380WUu) iDlS63S0100000_7.l0;
        ShortVideoContext shortVideoContext = c82380WUu.LJLJJI;
        if (shortVideoContext.cameraComponentModel.isRetakeMode && shortVideoContext.LJIIIIZZ() < c82380WUu.LJLJJI.LJIILIIL()) {
            C5S1 c5s1 = new C5S1(c82380WUu.mActivity);
            c5s1.LIZJ(R.string.fjr);
            c5s1.LJ();
            return;
        }
        ShortVideoContext shortVideoContext2 = c82380WUu.LJLJJI;
        if (shortVideoContext2.cameraComponentModel.isRetakeMode) {
            C43838HIk.LIZIZ(shortVideoContext2.LJII().size());
        }
        I3X i3x = c82380WUu.LJLJI;
        if (i3x != null && (J0 = i3x.J0()) != null) {
            J0.LIZ();
        }
        I3X i3x2 = c82380WUu.LJLJI;
        if (i3x2 != null) {
            i3x2.nZ("click go next");
        }
        if (C48331Ixz.LJ()) {
            C145995oB c145995oB = new C145995oB();
            c145995oB.LJI(WM7.SCENE_SERVICE, "go_edit");
            c145995oB.LJI("shoot_way", c82380WUu.LJLJJI.shootWay);
            c145995oB.LJI("creation_id", c82380WUu.LJLJJI.LJI());
            c145995oB.LJI("enter_from", c82380WUu.LJLJJI.enterFrom);
            HTP.LJLJL.getClass();
            c145995oB.LIZIZ(0L, "dalvikPss");
            c145995oB.LIZIZ(0L, "nativePss");
            c145995oB.LIZIZ(0L, "otherPss");
            c145995oB.LIZIZ(0L, "totalPss");
            FMX.LJIIL("av_memory_log", c145995oB.LIZ);
        }
        CommerceToolsStickerServiceImpl.LJIIL().LJ(c82380WUu.LJLJJI);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ$19(com.ss.android.ugc.aweme.views.IDlS63S0100000_7 r9, android.view.View r10) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.views.IDlS63S0100000_7.LIZ$19(com.ss.android.ugc.aweme.views.IDlS63S0100000_7, android.view.View):void");
    }

    public static final void LIZ$2(IDlS63S0100000_7 iDlS63S0100000_7, View view) {
        C46084I6u c46084I6u = (C46084I6u) iDlS63S0100000_7.l0;
        ((InterfaceC146755pP) c46084I6u.LJLJJI.LIZ(c46084I6u, C46084I6u.LJLLLLLL[1])).LJJLIIIJL(true);
    }

    public static final void LIZ$20(IDlS63S0100000_7 iDlS63S0100000_7, View view) {
        I6N i6n = (I6N) iDlS63S0100000_7.l0;
        ((I6G) i6n.LJLLI.LIZ(i6n, I6N.LJLLLLLL[5])).ux(((I6N) iDlS63S0100000_7.l0).LLJILJIL().Ov0().getCurrentEditOriginIndex(), ((I6N) iDlS63S0100000_7.l0).LLJJIII().getCurrentRotate());
    }

    public static final void LIZ$21(IDlS63S0100000_7 iDlS63S0100000_7, View view) {
        I6E i6e = (I6E) iDlS63S0100000_7.l0;
        ((CutMultiVideoViewModel) i6e.LJLJLJ.LIZ(i6e, I6E.LJLLI[0])).LJLJLLL.setValue(null);
    }

    public static final void LIZ$22(IDlS63S0100000_7 iDlS63S0100000_7, View view) {
        I6E i6e = (I6E) iDlS63S0100000_7.l0;
        ((CutMultiVideoViewModel) i6e.LJLJLJ.LIZ(i6e, I6E.LJLLI[0])).LJLL.setValue(null);
    }

    public static final void LIZ$23(IDlS63S0100000_7 iDlS63S0100000_7, View view) {
        C80461Vhx c80461Vhx = ((I7B) iDlS63S0100000_7.l0).LJLJJLL;
        if (c80461Vhx != null) {
            c80461Vhx.toggle();
            I6G LLJJ = ((I7B) iDlS63S0100000_7.l0).LLJJ();
            C80461Vhx c80461Vhx2 = ((I7B) iDlS63S0100000_7.l0).LJLJJLL;
            if (c80461Vhx2 != null) {
                LLJJ.ds(c80461Vhx2.LJLJJI);
                return;
            } else {
                o.LJIJI("ivSpeed");
                throw null;
            }
        }
        o.LJIJI("ivSpeed");
        throw null;
    }

    public static final void LIZ$24(IDlS63S0100000_7 iDlS63S0100000_7, View view) {
        int i;
        I7B i7b = (I7B) iDlS63S0100000_7.l0;
        AqS157S0100000_7 aqS157S0100000_7 = new AqS157S0100000_7(i7b, 765);
        Activity activity = i7b.mActivity;
        if (activity != null) {
            C62905OmT c62905OmT = new C62905OmT(activity);
            C78934UyQ.LJLIL.LIZLLL().getClass();
            if (CommonFeedApiService.LIZ().LJJ()) {
                i = R.string.hr5;
            } else {
                i = R.string.egh;
            }
            c62905OmT.LIZ(i);
            c62905OmT.LJII(R.string.i_w, null);
            c62905OmT.LJIIJ(R.string.efd, new IDCListenerS160S0100000_7(aqS157S0100000_7, 16));
            new C62906OmU(c62905OmT).LIZLLL();
        }
    }

    public static final void LIZ$25(IDlS63S0100000_7 iDlS63S0100000_7, View view) {
        ((I7B) iDlS63S0100000_7.l0).LLJJ().su0();
    }

    public static final void LIZ$3(IDlS63S0100000_7 iDlS63S0100000_7, View view) {
        C46084I6u c46084I6u = (C46084I6u) iDlS63S0100000_7.l0;
        ((InterfaceC146755pP) c46084I6u.LJLJJI.LIZ(c46084I6u, C46084I6u.LJLLLLLL[1])).LJJLIIIJL(true);
    }

    public static final void LIZ$4(IDlS63S0100000_7 iDlS63S0100000_7, View view) {
        int i;
        C46084I6u c46084I6u = (C46084I6u) iDlS63S0100000_7.l0;
        boolean LIZIZ = ((I7R) c46084I6u.LJLJLJ.LIZ(c46084I6u, C46084I6u.LJLLLLLL[5])).LIZIZ();
        View view2 = ((C46084I6u) iDlS63S0100000_7.l0).LJLL;
        if (view2 != null) {
            if (LIZIZ) {
                i = 8;
            } else {
                i = 0;
            }
            view2.setVisibility(i);
            return;
        }
        o.LJIJI("ivPlay");
        throw null;
    }

    public static final void LIZ$5(IDlS63S0100000_7 iDlS63S0100000_7, View view) {
        ((C45628HvU) iDlS63S0100000_7.l0).LLJJIJIIJIL();
    }

    public static final void LIZ$6(IDlS63S0100000_7 iDlS63S0100000_7, View view) {
        ((C45628HvU) iDlS63S0100000_7.l0).LLJJIJIIJIL();
    }

    public static final void LIZ$7(IDlS63S0100000_7 iDlS63S0100000_7, View view) {
        C45628HvU c45628HvU = (C45628HvU) iDlS63S0100000_7.l0;
        c45628HvU.getClass();
        long currentTimeMillis = System.currentTimeMillis() - c45628HvU.LLIIIJ;
        if (1 <= currentTimeMillis && currentTimeMillis < 500) {
            return;
        }
        ((C45628HvU) iDlS63S0100000_7.l0).LLIIIJ = System.currentTimeMillis();
        ((C45628HvU) iDlS63S0100000_7.l0).LLJJIJIIJIL();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LIZ$8(IDlS63S0100000_7 iDlS63S0100000_7, View view) {
        CreativeModel creativeModel;
        ShortVideoContext shortVideoContext = ((C45628HvU) iDlS63S0100000_7.l0).LLIIII;
        if (shortVideoContext != null && (creativeModel = shortVideoContext.creativeModel) != null) {
            creativeModel.autoCutModel = new AutoCutModel(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 131071, 0 == true ? 1 : 0);
        }
        ((C45628HvU) iDlS63S0100000_7.l0).LLJJIJI(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LIZ$9(IDlS63S0100000_7 iDlS63S0100000_7, View view) {
        CreativeModel creativeModel;
        ShortVideoContext shortVideoContext = ((C45628HvU) iDlS63S0100000_7.l0).LLIIII;
        if (shortVideoContext != null && (creativeModel = shortVideoContext.creativeModel) != null) {
            creativeModel.autoCutModel = new AutoCutModel(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 131071, 0 == true ? 1 : 0);
        }
        ((C45628HvU) iDlS63S0100000_7.l0).LLJJIJI(false);
    }

    public IDlS63S0100000_7(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDlS63S0100000_7(Object obj, int i, int i2) {
        super(600L);
        this.$t = i;
        this.l0 = obj;
    }
}
