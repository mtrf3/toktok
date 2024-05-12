package X;

import android.app.Activity;
import android.content.Intent;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.services.apm.api.IEnsure;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishContainerScene;
import com.ss.android.ugc.aweme.splash.SplashActivity;
import com.zhiliaoapp.musically.R;

/* loaded from: classes8.dex */
public final class GI5 implements GI1 {
    public final /* synthetic */ VideoPublishContainerScene LIZ;

    @Override // X.GI1
    public final InterfaceC88472Yns<AwemeDraft, C76800UCe> LIZ() {
        return null;
    }

    public GI5(VideoPublishContainerScene videoPublishContainerScene) {
        this.LIZ = videoPublishContainerScene;
    }

    @Override // X.GI1
    public final void LIZIZ(C142535ib c142535ib) {
        VideoPublishEditModel videoPublishEditModel;
        String str;
        H8H.LIZJ(1, this.LIZ.LLILZLL, "video_post_page", false, false);
        VideoPublishContainerScene videoPublishContainerScene = this.LIZ;
        if (videoPublishContainerScene.LLLF()) {
            String LJIJJ = C78996UzQ.LJIJJ(videoPublishContainerScene.LLILZLL.creativeModel, videoPublishContainerScene.LLJLILLLLZIIL(), videoPublishContainerScene.getString(R.string.p6_));
            Activity requireActivity = videoPublishContainerScene.requireActivity();
            CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
            creativeToastBuilder.message(LJIJJ);
            C78915Uy7.LJJIIZI(requireActivity, 2009, creativeToastBuilder);
        }
        VideoPublishContainerScene videoPublishContainerScene2 = this.LIZ;
        ActivityC45651qj LLII = videoPublishContainerScene2.LLII();
        IEnsure iEnsure = C78983UzD.LJLLLL;
        if (iEnsure != null) {
            iEnsure.ensureNotNull(LLII, "VideoPublishContainerScene#getContext is null");
        }
        Activity activity = videoPublishContainerScene2.mActivity;
        IEnsure iEnsure2 = C78983UzD.LJLLLL;
        if (iEnsure2 != null) {
            iEnsure2.ensureNotNull(activity, "VideoPublishContainerScene#getActivity is null");
        }
        C86793Y4n.LJJIJ(videoPublishContainerScene2.LLILZLL, true, true);
        CreativeModel creativeModel = videoPublishContainerScene2.LLILZLL.creativeModel;
        creativeModel.transientPostPageModel.LJIIIIZZ = -1L;
        if (C51029K0z.LJIIIZ(creativeModel.postLandingModel)) {
            AVExternalServiceImpl.LIZ().publishService().finishAllCreativeActivity(videoPublishContainerScene2.LLII());
        } else {
            VideoPublishEditModel videoPublishEditModel2 = videoPublishContainerScene2.LLILZLL;
            G5D g5d = videoPublishEditModel2.creativeModel.transientPostPageModel;
            if (g5d.LJIIL) {
                if (videoPublishContainerScene2.mActivity != null) {
                    videoPublishContainerScene2.mActivity.setResult(9, new Intent());
                    H78.LIZ("SaveDraft to Live");
                    videoPublishContainerScene2.mActivity.finish();
                }
            } else if (!g5d.LJJIZ && !g5d.LJJJ) {
                Intent intent = new Intent();
                intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_DRAFT", true);
                intent.putExtra("shoot_way", videoPublishContainerScene2.LLILZLL.mShootWay);
                intent.putExtra("creation_id", videoPublishContainerScene2.LLILZLL.creativeInfo.getCreationId());
                if (videoPublishContainerScene2.LLJILLL != null && (videoPublishEditModel = videoPublishContainerScene2.LLILZLL) != null && !videoPublishEditModel.mIsFromDraft) {
                    InterfaceC43749HEz bridgeService = C78934UyQ.LJLIL.getBridgeService();
                    String str2 = videoPublishContainerScene2.LLILZLL.mShootWay;
                    C43722HDy c43722HDy = videoPublishContainerScene2.LLJILLL;
                    String str3 = c43722HDy.mClientKey;
                    C45828Hyi c45828Hyi = C45828Hyi.LJIILL;
                    int i = c43722HDy.mShareMediaType;
                    bridgeService.getClass();
                    if (str2 != null && C43723HDz.LJI(str2)) {
                        C45829Hyj.LIZIZ(str2, str3, c45828Hyi, i);
                    }
                    intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_SHOW_OPEN_SHARE_DIALOG", videoPublishContainerScene2.LLJILLL);
                }
                boolean LJ = C45039Hlz.LJ();
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("SaveDraft publishContainerActivityClassAlive:");
                LIZ.append(LJ);
                H78.LIZ(X1D.LIZIZ(LIZ));
                if (!LJ) {
                    intent.putExtra("enable_optimize_main_not_in_stack", true);
                }
                CreativeModel creativeModel2 = videoPublishContainerScene2.LLILZLL.creativeModel;
                if (creativeModel2.draftInfoModel.isDraft) {
                    H78.LIZ("SaveDraft to DraftBox New Way1");
                    VideoPublishEditModel videoPublishEditModel3 = videoPublishContainerScene2.LLILZLL;
                    if (videoPublishEditModel3.mDraftToEditFrom != 3) {
                        if (videoPublishEditModel3.isFromCrash()) {
                            C2U8.LIZ(new C6Z6());
                            videoPublishContainerScene2.LLLL();
                        } else {
                            HZV.LIZ().LIZ(videoPublishContainerScene2.requireActivity(), new Intent(), true, videoPublishContainerScene2.LLILZLL.creativeModel.draftInfoModel.isConvertToNormalDraft);
                        }
                    } else {
                        videoPublishContainerScene2.LLLL();
                    }
                } else if (creativeModel2.searchCreateModel.isFromSearch()) {
                    ActivityC45651qj LLII2 = videoPublishContainerScene2.LLII();
                    if (LLII2 != null) {
                        C60903NvH.LJIIJJI().getPublishService().LJI();
                        GUT.LIZ(LLII2, "handle_save_draft_finish");
                    }
                    Activity activity2 = videoPublishContainerScene2.mActivity;
                    if (activity2 != null) {
                        SmartRoute buildRoute = SmartRouter.buildRoute(activity2, "aweme://search/");
                        buildRoute.withParam("intent_from_publish", true);
                        buildRoute.addFlags(603979776);
                        buildRoute.open();
                    }
                } else {
                    String str4 = videoPublishContainerScene2.LLILZLL.creativeModel.initialModel.highLightVideoParametersModel.fragmentId;
                    if (str4 != null && !str4.isEmpty()) {
                        ActivityC45651qj LLII3 = videoPublishContainerScene2.LLII();
                        if (LLII3 != null) {
                            Activity requireActivity2 = videoPublishContainerScene2.requireActivity();
                            C44172HVg.LIZJ.getClass();
                            intent.setClass(requireActivity2, SplashActivity.class);
                            GTM.LIZ(LLII3, intent, videoPublishContainerScene2.LLILZLL);
                            intent.addFlags(603979776);
                            ActivityC45651qj LLII4 = videoPublishContainerScene2.LLII();
                            if (LLII4 != null) {
                                C16880lQ.LIZLLL(LLII4, intent);
                            }
                        }
                    } else {
                        ActivityC45651qj LLII5 = videoPublishContainerScene2.LLII();
                        if (LLII5 != null) {
                            C60903NvH.LJIIJJI().getPublishService().LJI();
                            GUT.LIZ(LLII5, "handle_save_draft_finish");
                        }
                        if (videoPublishContainerScene2.LLII() != null || !C19N.LJ("enable_publish_activity_nullable_check", false)) {
                            intent.addFlags(335544320);
                            Activity requireActivity3 = videoPublishContainerScene2.requireActivity();
                            C44172HVg.LIZJ.getClass();
                            intent.setClass(requireActivity3, SplashActivity.class);
                            H78.LIZ("SaveDraft to Main");
                            ActivityC45651qj LLII6 = videoPublishContainerScene2.LLII();
                            if (LLII6 != null) {
                                C16880lQ.LIZLLL(LLII6, intent);
                            }
                        }
                    }
                }
                videoPublishContainerScene2.requireActivity().overridePendingTransition(0, R.anim.y);
            } else if (videoPublishEditModel2.mIsFromDraft && !videoPublishEditModel2.isFromRestoreRecover) {
                H78.LIZ("SaveDraft to DraftBox New Way2");
                if (videoPublishContainerScene2.LLILZLL.mDraftToEditFrom != 3 && videoPublishContainerScene2.mActivity != null) {
                    HZV.LIZ().LIZ(videoPublishContainerScene2.requireActivity(), new Intent(), true, videoPublishContainerScene2.LLILZLL.creativeModel.draftInfoModel.isConvertToNormalDraft);
                } else {
                    C2U8.LIZ(new C6Z6());
                    if (videoPublishContainerScene2.LLILZLL.creativeModel.transientPostPageModel.LJJJ) {
                        videoPublishContainerScene2.LLLL();
                    }
                }
            } else {
                if (g5d.LJJJ) {
                    C2U8.LIZ(new C6Z6());
                }
                H78.LIZ("SaveDraft to OtherPlatform");
                C60903NvH.LJIIJJI().LJJJI().LJIIIZ(true);
                videoPublishContainerScene2.LLLL();
            }
        }
        VideoPublishEditModel videoPublishEditModel4 = this.LIZ.LLILZLL;
        if (videoPublishEditModel4 != null) {
            str = videoPublishEditModel4.getMMusicPath();
        } else {
            str = "";
        }
        boolean LIZIZ = C44687HgJ.LIZIZ(str);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("[saveDraft]: creation id = ");
        LIZ2.append(c142535ib.LJLILLLLZI.LIZ());
        LIZ2.append(" Music Path: ");
        LIZ2.append(this.LIZ.LLILZLL.getMMusicPath());
        LIZ2.append(" isMusicExist: ");
        LIZ2.append(LIZIZ);
        C143195jf.LIZ(X1D.LIZIZ(LIZ2));
        this.LIZ.LLILZLL.creativeModel.transientPostPageModel.LJIJI = false;
    }

    @Override // X.GI1
    public final void LIZJ(C142535ib c142535ib) {
        String string;
        C86793Y4n.LJJIJ(this.LIZ.LLILZLL, false, false);
        H8H.LIZJ(0, this.LIZ.LLILZLL, "video_post_page", false, false);
        VideoPublishContainerScene videoPublishContainerScene = this.LIZ;
        if (C30581Hy.LJIJ(c142535ib.LJLIL)) {
            string = videoPublishContainerScene.getString(R.string.ez8);
        } else {
            string = videoPublishContainerScene.getString(R.string.ez9);
        }
        Activity requireActivity = videoPublishContainerScene.requireActivity();
        CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
        creativeToastBuilder.message(string);
        C78915Uy7.LJJIIZI(requireActivity, 2010, creativeToastBuilder);
        videoPublishContainerScene.LLILZLL.creativeModel.transientPostPageModel.LJJI = false;
        this.LIZ.LLILZLL.creativeModel.transientPostPageModel.LJIJI = false;
    }
}
