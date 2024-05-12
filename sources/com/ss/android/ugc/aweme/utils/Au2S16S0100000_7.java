package com.ss.android.ugc.aweme.utils;

import X.A90;
import X.ARI;
import X.ASQ;
import X.ActivityC45651qj;
import X.C03880Dg;
import X.C10K;
import X.C164236cV;
import X.C188727au;
import X.C26045AKb;
import X.C26227ARb;
import X.C36703Eap;
import X.C40328FsC;
import X.C41015G7v;
import X.C41425GNp;
import X.C41658GWo;
import X.C42562Gn8;
import X.C42604Gno;
import X.C44172HVg;
import X.C48203Ivv;
import X.C5S1;
import X.C60903NvH;
import X.C65300Pk0;
import X.C68322mC;
import X.C70414RkI;
import X.C71897SJp;
import X.C78920UyC;
import X.FMX;
import X.G8A;
import X.GHM;
import X.GLA;
import X.GOK;
import X.GQ5;
import X.GS5;
import X.GUH;
import X.GVM;
import X.GVX;
import X.H78;
import X.H7R;
import X.HQ7;
import X.InterfaceC42037Gef;
import X.RV8;
import X.TAT;
import X.UC0;
import X.X1D;
import X.XXB;
import Y.ACallableS6S1000000_7;
import Y.AObjectS136S0100000_7;
import Y.AObjectS30S0000000_7;
import Y.AObjectS40S0201000_7;
import Y.AObjectS42S0101000_5;
import Y.AgS49S1100000_7;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.draft.DraftInfoModel;
import com.ss.android.ugc.aweme.detail.panel.DuetDiscoverPanel;
import com.ss.android.ugc.aweme.detail.panel.DuetModeCameraServiceImpl;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.promotion.PdpFlashSaleReminderViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.ug.popup.view.ShopTabOverlayActivity;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.DuetInfo;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.search.ISearchService;
import com.ss.android.ugc.aweme.search.common.communicate.SearchServiceImpl;
import com.ss.android.ugc.aweme.services.external.ability.IAVTransformService;
import com.ss.android.ugc.aweme.services.video.IAVPublishService;
import com.ss.android.ugc.aweme.share.gif.VideoShare2GifEditContext;
import com.ss.android.ugc.aweme.share.gif.ui.VideoShare2GifEditActivity;
import com.ss.android.ugc.aweme.share.gif.ui.VideoShare2GifPreviewActivity;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.image.ExpandedTitleModule;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import com.ss.android.ugc.aweme.shortvideo.publish.surveyafterpost.AuthorSurveyFragment;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishContainerScene;
import com.ss.android.ugc.aweme.shortvideo.ui.publishprogress.ParallelPublishDialogFragment;
import com.ss.android.ugc.aweme.shortvideo.ui.publishprogress.PublishDialogFragment;
import com.ss.android.ugc.aweme.tools.draft.adapter.viewholder.NewDraftViewHolder;
import com.zhiliaoapp.musically.R;
import defpackage.i0;
import java.io.File;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import kotlin.jvm.internal.AqS138S0200000_7;
import kotlin.jvm.internal.AqS154S0200000_7;
import kotlin.jvm.internal.AqS30S1300000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public class Au2S16S0100000_7 extends TAT {
    public final int $t;
    public Object l0;

    @Override // X.TAT
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
            default:
                super.LIZ(view);
                return;
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public Au2S16S0100000_7(com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishContainerScene r4, int r5) {
        /*
            r3 = this;
            r3.$t = r5
            switch(r5) {
                case 4: goto Le;
                default: goto L5;
            }
        L5:
            r2 = r3
            r2.l0 = r4
            r0 = 1000(0x3e8, double:4.94E-321)
        La:
            r2.<init>(r0)
            return
        Le:
            r2 = r3
            r2.l0 = r4
            r0 = 600(0x258, double:2.964E-321)
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.utils.Au2S16S0100000_7.<init>(com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishContainerScene, int):void");
    }

    public static final void LIZ$0(Au2S16S0100000_7 au2S16S0100000_7, View view) {
        String str;
        String originalItemId;
        ActivityC45651qj mo49getActivity;
        DuetDiscoverPanel duetDiscoverPanel = (DuetDiscoverPanel) au2S16S0100000_7.l0;
        duetDiscoverPanel.getClass();
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("creation_id", duetDiscoverPanel.param.getCreationId());
        Aweme currentAweme = duetDiscoverPanel.getCurrentAweme();
        if (currentAweme == null || (str = currentAweme.getGroupId()) == null) {
            str = "";
        }
        c188727au.LJIIIZ("group_id", str);
        c188727au.LJIIIZ("duet_mode_type", duetDiscoverPanel.LLIIJLIL());
        FMX.LJIIL("duet_mode_shoot_button_click", c188727au.LIZ);
        Fragment fragment = duetDiscoverPanel.getFragment();
        if (fragment != null && (mo49getActivity = fragment.mo49getActivity()) != null && !C48203Ivv.LJ(mo49getActivity)) {
            C40328FsC.LIZLLL(mo49getActivity, R.string.img);
            return;
        }
        Aweme currentAweme2 = duetDiscoverPanel.getCurrentAweme();
        if (currentAweme2 == null) {
            return;
        }
        if (currentAweme2.getDuettedInfo() != null && duetDiscoverPanel.param.getFrom().equals("from_duet_mode")) {
            DuetInfo duettedInfo = currentAweme2.getDuettedInfo();
            if (duettedInfo == null || (originalItemId = duettedInfo.getOriginalItemId()) == null) {
                return;
            }
            C10K.LIZJ(new ACallableS6S1000000_7(originalItemId, 0)).LJ(new AgS49S1100000_7(duetDiscoverPanel, originalItemId, 0), C10K.LJIIIIZZ, null);
            return;
        }
        Activity activity = duetDiscoverPanel.activity;
        if (activity == null) {
            return;
        }
        DuetModeCameraServiceImpl.LJ().LIZLLL().LIZ(activity, currentAweme2, duetDiscoverPanel.LLIIJLIL());
    }

    public static final void LIZ$1(Au2S16S0100000_7 au2S16S0100000_7, View view) {
        if (view != null && !((ShopTabOverlayActivity) au2S16S0100000_7.l0).isFinishing()) {
            ((ShopTabOverlayActivity) au2S16S0100000_7.l0).finish();
        }
    }

    public static final void LIZ$10(Au2S16S0100000_7 au2S16S0100000_7, View view) {
        VideoShare2GifEditContext videoShare2GifEditContext;
        final VideoShare2GifEditActivity videoShare2GifEditActivity = (VideoShare2GifEditActivity) au2S16S0100000_7.l0;
        if (!videoShare2GifEditActivity.LJLIL || (videoShare2GifEditContext = videoShare2GifEditActivity.LJLILLLLZI) == null || TextUtils.isEmpty(videoShare2GifEditContext.videoPath)) {
            return;
        }
        videoShare2GifEditActivity.LJLIL = false;
        videoShare2GifEditActivity.LJLILLLLZI.gifImageDir = C36703Eap.LIZ();
        VideoShare2GifEditContext videoShare2GifEditContext2 = videoShare2GifEditActivity.LJLILLLLZI;
        String fileName = videoShare2GifEditContext2.awemeId;
        o.LJIIIZ(fileName, "fileName");
        String path = new File(C36703Eap.LIZ(), i0.LJFF(fileName, ".gif")).getPath();
        o.LJIIIIZZ(path, "File(path, \"$fileName.gif\").path");
        videoShare2GifEditContext2.gifImagePath = path;
        final A90 a90 = new A90(videoShare2GifEditActivity);
        a90.LIZJ(videoShare2GifEditActivity.getResources().getString(R.string.gqm));
        if (!new C03880Dg(2).LIZJ(300000, "com/bytedance/tux/status/loading/TuxLoadingProgressHUD", "show", a90, new Object[0], "void", new C65300Pk0(false, "()V", "-383089834570578840")).LIZ) {
            a90.show();
        }
        a90.LJ(false);
        AVExternalServiceImpl.LIZ().abilityService().transformService().video2gif(videoShare2GifEditActivity.LJLILLLLZI, new IAVTransformService.ITransformProgress() { // from class: X.GyD
            @Override // com.ss.android.ugc.aweme.services.external.ability.IAVTransformService.ITransformProgress
            public final void update(int i) {
                A90.this.LIZLLL(i);
            }
        }, new IAVTransformService.ITransformCallback() { // from class: X.GyC
            @Override // com.ss.android.ugc.aweme.services.external.ability.IAVTransformService.ITransformCallback
            public final void finish(Object obj) {
                VideoShare2GifEditActivity videoShare2GifEditActivity2 = VideoShare2GifEditActivity.this;
                A90 a902 = a90;
                videoShare2GifEditActivity2.LJLIL = true;
                a902.dismiss();
                if (((Boolean) obj).booleanValue()) {
                    if (videoShare2GifEditActivity2.LJLILLLLZI != null) {
                        File file = new File(videoShare2GifEditActivity2.LJLILLLLZI.gifImagePath);
                        try {
                            ParcelFileDescriptor openFileDescriptor = EF7.LIZIZ().getContentResolver().openFileDescriptor(C268613q.LJ(videoShare2GifEditActivity2, file.getName(), "image/gif", AnonymousClass073.LIZIZ(new StringBuilder(), Environment.DIRECTORY_PICTURES, "/tiktok/")), "w");
                            if (openFileDescriptor != null) {
                                C268513p.LIZ(file, new FileOutputStream(openFileDescriptor.getFileDescriptor()));
                            }
                        } catch (Throwable unused) {
                        }
                        VideoShare2GifEditContext videoShare2GifEditContext3 = videoShare2GifEditActivity2.LJLILLLLZI;
                        Intent intent = new Intent(videoShare2GifEditActivity2, (Class<?>) VideoShare2GifPreviewActivity.class);
                        intent.putExtra("extra_data", videoShare2GifEditContext3);
                        C16880lQ.LJFF(videoShare2GifEditActivity2, 1, intent);
                        return;
                    }
                    return;
                }
                VideoShare2GifEditContext videoShare2GifEditContext4 = videoShare2GifEditActivity2.LJLILLLLZI;
                if (videoShare2GifEditContext4 != null) {
                    videoShare2GifEditContext4.gifImagePath = null;
                }
                String string = videoShare2GifEditActivity2.getString(R.string.gqn);
                C5S1 c5s1 = new C5S1(videoShare2GifEditActivity2);
                c5s1.LIZLLL(string);
                c5s1.LJ();
            }
        });
    }

    public static final void LIZ$11(Au2S16S0100000_7 au2S16S0100000_7, View view) {
        if (view != null) {
            ActivityC45651qj requireActivity = ((AuthorSurveyFragment) au2S16S0100000_7.l0).requireActivity();
            o.LJIIIIZZ(requireActivity, "this@AuthorSurveyFragment.requireActivity()");
            C26045AKb c26045AKb = new C26045AKb(requireActivity);
            c26045AKb.LJIIIZ(((AuthorSurveyFragment) au2S16S0100000_7.l0).vl().toast);
            c26045AKb.LJIIJ();
            AuthorSurveyFragment authorSurveyFragment = (AuthorSurveyFragment) au2S16S0100000_7.l0;
            ASQ.LJ(authorSurveyFragment, new GHM("submit", authorSurveyFragment.LJLJI));
        }
    }

    public static final void LIZ$12(Au2S16S0100000_7 au2S16S0100000_7, View v) {
        o.LJIIIZ(v, "v");
        NewDraftViewHolder newDraftViewHolder = (NewDraftViewHolder) au2S16S0100000_7.l0;
        C41425GNp c41425GNp = newDraftViewHolder.LJLLLL;
        if (c41425GNp != null) {
            if (c41425GNp.LIZIZ) {
                C71897SJp c71897SJp = newDraftViewHolder.LJLLJ;
                if (c71897SJp != null) {
                    if (c71897SJp.isEnabled()) {
                        C71897SJp c71897SJp2 = newDraftViewHolder.LJLLJ;
                        if (c71897SJp2 != null) {
                            if (newDraftViewHolder.LJLLLL != null) {
                                c71897SJp2.setChecked(!r0.LJIIIZ);
                                GOK gok = newDraftViewHolder.LJLIL;
                                C71897SJp c71897SJp3 = newDraftViewHolder.LJLLJ;
                                if (c71897SJp3 != null) {
                                    C41425GNp c41425GNp2 = newDraftViewHolder.LJLLLL;
                                    if (c41425GNp2 != null) {
                                        gok.M0(c71897SJp3, c41425GNp2, c71897SJp3.isChecked());
                                        return;
                                    } else {
                                        o.LJIJI("mData");
                                        throw null;
                                    }
                                }
                                o.LJIJI("mCheckBox");
                                throw null;
                            }
                            o.LJIJI("mData");
                            throw null;
                        }
                        o.LJIJI("mCheckBox");
                        throw null;
                    }
                    return;
                }
                o.LJIJI("mCheckBox");
                throw null;
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - newDraftViewHolder.LJLZ < 500) {
                return;
            }
            newDraftViewHolder.LJLZ = currentTimeMillis;
            GOK gok2 = newDraftViewHolder.LJLIL;
            int adapterPosition = newDraftViewHolder.getAdapterPosition();
            C41425GNp c41425GNp3 = newDraftViewHolder.LJLLLL;
            if (c41425GNp3 != null) {
                gok2.Ma(adapterPosition, c41425GNp3);
                return;
            } else {
                o.LJIJI("mData");
                throw null;
            }
        }
        o.LJIJI("mData");
        throw null;
    }

    public static final void LIZ$2(Au2S16S0100000_7 au2S16S0100000_7, View view) {
        String str;
        String str2;
        ExpandedTitleModule expandedTitleModule;
        GS5 gs5 = ((GQ5) au2S16S0100000_7.l0).LJIIZILJ;
        if (gs5 != null && (expandedTitleModule = gs5.LJIIIZ) != null && expandedTitleModule.LJLLL.getAlpha() < 1.0f) {
            C5S1 c5s1 = new C5S1(C60903NvH.LJ);
            c5s1.LIZJ(R.string.p6f);
            c5s1.LJ();
            return;
        }
        if (((GQ5) au2S16S0100000_7.l0).LIZIZ.getSelectionEnd() > ((GQ5) au2S16S0100000_7.l0).LIZIZ.getSelectionStart()) {
            return;
        }
        if (!C44172HVg.LJIJ.isLogin()) {
            HQ7 hq7 = C44172HVg.LJIJ;
            ActivityC45651qj LLII = ((GQ5) au2S16S0100000_7.l0).LIZ.LLII();
            Objects.requireNonNull(LLII);
            hq7.LIZ(LLII, "", "click_add_video", null, null);
            return;
        }
        GQ5 gq5 = (GQ5) au2S16S0100000_7.l0;
        if (gq5.LIZIZ.LJLLI) {
            return;
        }
        if (!gq5.LJIILLIIL.LIZ() && ((GQ5) au2S16S0100000_7.l0).LIZIZ(true)) {
            return;
        }
        GQ5 gq52 = (GQ5) au2S16S0100000_7.l0;
        if (gq52.LIZ != null) {
            int size = gq52.LIZIZ.getMentionVideoIdList().size();
            if (size > 3) {
                ActivityC45651qj LLII2 = ((GQ5) au2S16S0100000_7.l0).LIZ.LLII();
                if (LLII2 != null) {
                    C78920UyC.LIZLLL(R.string.e5z, LLII2, 2018);
                    return;
                }
                return;
            }
            if (size == 3) {
                ActivityC45651qj LLII3 = ((GQ5) au2S16S0100000_7.l0).LIZ.LLII();
                if (LLII3 != null) {
                    C78920UyC.LIZLLL(R.string.e5y, LLII3, 2018);
                    return;
                }
                return;
            }
            FMX.LJIIL("click_credits_videos_button", C164236cV.LIZ(((GQ5) au2S16S0100000_7.l0).LJIIL).LIZ);
            Fragment fragment = ((GQ5) au2S16S0100000_7.l0).LIZ.getFragment();
            Objects.requireNonNull(fragment);
            VideoPublishEditModel model = ((GQ5) au2S16S0100000_7.l0).LJIIL;
            o.LJIIIZ(model, "model");
            if (fragment.mo49getActivity() != null) {
                AVMusic extractAVMusic = MusicBeanUtilKt.extractAVMusic(model.creativeModel.musicBuzModel);
                SmartRoute buildRoute = SmartRouter.buildRoute(fragment.mo49getActivity(), "//tools/mentionvideo");
                buildRoute.withParam("creation_id", model.getCreationId());
                String str3 = null;
                if (extractAVMusic == null || extractAVMusic.isLocalMusic()) {
                    str = null;
                } else {
                    str = extractAVMusic.getMusicId();
                }
                buildRoute.withParam("music_id", str);
                if (extractAVMusic != null) {
                    str2 = extractAVMusic.musicName;
                } else {
                    str2 = null;
                }
                buildRoute.withParam("music_title", str2);
                if (extractAVMusic != null) {
                    str3 = extractAVMusic.authorName;
                }
                buildRoute.withParam("music_author", str3);
                buildRoute.open(10);
            }
        }
    }

    public static final void LIZ$3(Au2S16S0100000_7 au2S16S0100000_7, View v) {
        o.LJIIIZ(v, "v");
        C42604Gno c42604Gno = (C42604Gno) au2S16S0100000_7.l0;
        MediaModel mediaModel = c42604Gno.LJLJJI;
        if (mediaModel != null) {
            c42604Gno.LJLILLLLZI.invoke(mediaModel);
        }
    }

    public static final void LIZ$4(Au2S16S0100000_7 au2S16S0100000_7, View view) {
        VideoPublishContainerScene videoPublishContainerScene = (VideoPublishContainerScene) au2S16S0100000_7.l0;
        videoPublishContainerScene.LLZZZZ(0, videoPublishContainerScene.LLIIL);
    }

    public static final void LIZ$5(Au2S16S0100000_7 au2S16S0100000_7, View view) {
        String str;
        VideoPublishContainerScene videoPublishContainerScene = (VideoPublishContainerScene) au2S16S0100000_7.l0;
        CreativeModel creativeModel = videoPublishContainerScene.LLILZLL.creativeModel;
        if (creativeModel.changeAvatarModel.isFromChangeAvatar && !creativeModel.draftInfoModel.isDraft) {
            GLA gla = new GLA(videoPublishContainerScene.requireActivity(), videoPublishContainerScene.LLILZLL);
            AObjectS136S0100000_7 aObjectS136S0100000_7 = new AObjectS136S0100000_7(videoPublishContainerScene, 9);
            AObjectS30S0000000_7 aObjectS30S0000000_7 = new AObjectS30S0000000_7(1);
            gla.LIZ(true);
            CreativeModel creativeModel2 = gla.LIZIZ.creativeModel;
            o.LJIIIIZZ(creativeModel2, "editModel.creativeModel");
            if (creativeModel2.changeAvatarModel.isFromAiVatar) {
                str = "2";
            } else {
                str = "1";
            }
            AVExternalServiceImpl.LIZ().avatarService().requestUpdateAvatar(gla.LIZIZ.creativeModel.changeAvatarModel.originPath, new AqS30S1300000_7(gla, str, aObjectS136S0100000_7, aObjectS30S0000000_7, 3));
            return;
        }
        videoPublishContainerScene.LLLILZ();
    }

    public static final void LIZ$6(Au2S16S0100000_7 au2S16S0100000_7, View view) {
        String creationId;
        H78.LIZ("PublishDurationMonitor click save draft");
        ((VideoPublishContainerScene) au2S16S0100000_7.l0).LLILZLL.creativeModel.transientPostPageModel.LJIIIIZZ = System.currentTimeMillis();
        C41658GWo.LIZLLL().LJFF();
        if (((VideoPublishContainerScene) au2S16S0100000_7.l0).LLILZLL.creativeModel.transientPostPageModel.LJIJI) {
            return;
        }
        G8A g8a = G8A.LIZIZ;
        if (g8a.LIZIZ() >= 3) {
            g8a.LIZ();
        }
        VideoPublishEditModel videoPublishEditModel = ((VideoPublishContainerScene) au2S16S0100000_7.l0).LLILZLL;
        ISearchService LLLZI = SearchServiceImpl.LLLZI();
        if (LLLZI.LJFF() != null) {
            Map<String, String> LJIJJ = LLLZI.LJFF().LJIJJ(videoPublishEditModel.getCreationId(), videoPublishEditModel.getStickers());
            if (videoPublishEditModel.creativeFlowData.getExtraLogParams() == null) {
                videoPublishEditModel.creativeFlowData.setExtraLogParams(new HashMap<>(LJIJJ));
            } else {
                videoPublishEditModel.creativeFlowData.getExtraLogParams().putAll(LJIJJ);
            }
        }
        VideoPublishContainerScene videoPublishContainerScene = (VideoPublishContainerScene) au2S16S0100000_7.l0;
        videoPublishContainerScene.getClass();
        C42562Gn8 c42562Gn8 = C42562Gn8.LIZIZ;
        VideoPublishEditModel videoPublishEditModel2 = videoPublishContainerScene.LLILZLL;
        if (videoPublishEditModel2 == null) {
            creationId = null;
        } else {
            creationId = videoPublishEditModel2.getCreationId();
        }
        c42562Gn8.LIZ(creationId);
        if (!TextUtils.isEmpty("click save draft button")) {
            String str = VideoPublishContainerScene.LLLFZ;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("save draft scene=");
            LIZ.append("click save draft button");
            H78.LIZIZ(str, X1D.LIZIZ(LIZ));
            DraftInfoModel draftInfoModel = videoPublishContainerScene.LLILZLL.creativeModel.draftInfoModel;
            draftInfoModel.getClass();
            draftInfoModel.saveDraftScene = "clickSaveFromPublish";
            if (!C44172HVg.LJIJ.isLogin()) {
                videoPublishContainerScene.LLZIL(new XXB(videoPublishContainerScene));
            } else {
                videoPublishContainerScene.j();
            }
            C41015G7v.LIZ(System.currentTimeMillis(), "duet_mode_creation", "save_draft");
            return;
        }
        throw new IllegalArgumentException("save draft scene can't be empty");
    }

    public static final void LIZ$7(Au2S16S0100000_7 au2S16S0100000_7, View view) {
        Parcelable parcelable;
        ActivityC45651qj mo49getActivity;
        InterfaceC42037Gef interfaceC42037Gef = ((PublishDialogFragment) au2S16S0100000_7.l0).LJLJLJ;
        if (interfaceC42037Gef != null && !interfaceC42037Gef.LIZ()) {
            PublishModel LJIILLIIL = GUH.LJIILLIIL(((PublishDialogFragment) au2S16S0100000_7.l0).LJLJI);
            VideoPublishEditModel videoPublishEditModel = null;
            if (LJIILLIIL != null) {
                parcelable = LJIILLIIL.editModel;
            } else {
                parcelable = null;
            }
            if (parcelable instanceof VideoPublishEditModel) {
                videoPublishEditModel = (VideoPublishEditModel) parcelable;
            }
            if ((videoPublishEditModel == null || !H7R.LJJJJL(videoPublishEditModel)) && GVX.LIZIZ() && (mo49getActivity = ((PublishDialogFragment) au2S16S0100000_7.l0).mo49getActivity()) != null) {
                GVM.LIZIZ(((PublishDialogFragment) au2S16S0100000_7.l0).LJLJLJ.getArgs());
                C26227ARb c26227ARb = new C26227ARb(mo49getActivity);
                c26227ARb.LJ(R.string.q68);
                c26227ARb.LIZ(R.string.q67);
                ARI ari = new ARI(mo49getActivity);
                ari.LJ(R.string.q66, new AObjectS40S0201000_7(au2S16S0100000_7, mo49getActivity, 4));
                ari.LJI(R.string.q65, new AObjectS42S0101000_5(4, au2S16S0100000_7, 53));
                c26227ARb.LJIIL = ari;
                c26227ARb.LJII = false;
                c26227ARb.LJI().LIZLLL();
            }
        }
    }

    public static final void LIZ$8(Au2S16S0100000_7 au2S16S0100000_7, View view) {
        ActivityC45651qj mo49getActivity;
        ParallelPublishDialogFragment parallelPublishDialogFragment = (ParallelPublishDialogFragment) au2S16S0100000_7.l0;
        if (!parallelPublishDialogFragment.LJLLJ.isImageMode(parallelPublishDialogFragment.LJLJL) && GVX.LIZIZ() && (mo49getActivity = ((ParallelPublishDialogFragment) au2S16S0100000_7.l0).mo49getActivity()) != null) {
            ParallelPublishDialogFragment parallelPublishDialogFragment2 = (ParallelPublishDialogFragment) au2S16S0100000_7.l0;
            IAVPublishService iAVPublishService = parallelPublishDialogFragment2.LJLLJ;
            BaseShortVideoContext baseShortVideoContext = parallelPublishDialogFragment2.LJLL;
            if (baseShortVideoContext != null) {
                iAVPublishService.reportQuitAutoUploadingShowEvent(baseShortVideoContext);
                C26227ARb c26227ARb = new C26227ARb(mo49getActivity);
                c26227ARb.LJ(R.string.q68);
                c26227ARb.LIZ(R.string.q67);
                UC0.LIZJ(c26227ARb, new AqS138S0200000_7((ParallelPublishDialogFragment) au2S16S0100000_7.l0, mo49getActivity, 33));
                c26227ARb.LJII = false;
                c26227ARb.LJI().LIZLLL();
                return;
            }
            o.LJIJI("editModel");
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.content.Context, T] */
    public static final void LIZ$9(Au2S16S0100000_7 au2S16S0100000_7, View view) {
        if (view != null) {
            PdpFlashSaleReminderViewHolder pdpFlashSaleReminderViewHolder = (PdpFlashSaleReminderViewHolder) au2S16S0100000_7.l0;
            pdpFlashSaleReminderViewHolder.getClass();
            C68322mC c68322mC = new C68322mC();
            c68322mC.element = pdpFlashSaleReminderViewHolder.itemView.getContext();
            PdpViewModel viewModel = pdpFlashSaleReminderViewHolder.getViewModel();
            T context = c68322mC.element;
            o.LJIIIIZZ(context, "context");
            RV8 rv8 = (RV8) pdpFlashSaleReminderViewHolder.getItem();
            View itemView = pdpFlashSaleReminderViewHolder.itemView;
            o.LJIIIIZZ(itemView, "itemView");
            viewModel.fx0((Context) context, rv8, itemView, new AqS154S0200000_7(pdpFlashSaleReminderViewHolder, c68322mC, 64));
            C70414RkI c70414RkI = ((PdpFlashSaleReminderViewHolder) au2S16S0100000_7.l0).getViewModel().LLFII;
            if (c70414RkI != null) {
                c70414RkI.LJJIJIL(null);
            }
        }
    }

    public Au2S16S0100000_7(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Au2S16S0100000_7(Object obj, int i, int i2) {
        super(1000L);
        this.$t = i;
        this.l0 = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Au2S16S0100000_7(DuetDiscoverPanel duetDiscoverPanel, long j, int i) {
        super(j);
        this.$t = i;
        this.l0 = duetDiscoverPanel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Au2S16S0100000_7(Object obj, int i, int i2, int i3) {
        super(700L);
        this.$t = i;
        this.l0 = obj;
    }
}
