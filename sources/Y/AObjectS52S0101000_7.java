package Y;

import X.AEY;
import X.AbstractC42651GoZ;
import X.ActivityC45651qj;
import X.ActivityC86117Xqz;
import X.AnonymousClass842;
import X.C0I0;
import X.C0NY;
import X.C140295ez;
import X.C145995oB;
import X.C16880lQ;
import X.C188727au;
import X.C42318GjC;
import X.C43150Gwc;
import X.C43212Gxc;
import X.C44031HPv;
import X.C44108HSu;
import X.C44172HVg;
import X.C45498HtO;
import X.C55537Lqv;
import X.C56542MHa;
import X.C56891MUl;
import X.C62119OZn;
import X.C72Y;
import X.C73411SrX;
import X.C76800UCe;
import X.C78934UyQ;
import X.C83591WrL;
import X.C83621Wrp;
import X.C8JD;
import X.DialogC25756A8y;
import X.EZQ;
import X.FFL;
import X.FMX;
import X.G5D;
import X.G5K;
import X.G5N;
import X.G6D;
import X.G7J;
import X.G7K;
import X.GBZ;
import X.GGS;
import X.H78;
import X.HR8;
import X.HRG;
import X.InterfaceC173976sD;
import X.InterfaceC65784Pro;
import X.MIV;
import X.RunnableC23230vf;
import X.V1B;
import X.X1D;
import X.XWR;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.previewv1.MultiGuestPreviewFragment;
import com.bytedance.android.livesdk.chatroom.ui.AbsAudienceInteractionFragment;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.comment.commentlist.CommentListFragment;
import com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewCell;
import com.ss.android.ugc.aweme.feed.ui.FeedFollowFragment;
import com.ss.android.ugc.aweme.ftc.FTCVideoRecordNewActivity;
import com.ss.android.ugc.aweme.i18n.musically.cut.AvatarCutActivity;
import com.ss.android.ugc.aweme.locale.LocalServiceImpl;
import com.ss.android.ugc.aweme.main.MainActivity;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.profile.ui.AwemeListFragmentImpl;
import com.ss.android.ugc.aweme.prop.fragment.StickerPropDetailFragment;
import com.ss.android.ugc.aweme.qrcode.view.ScanQRCodeActivityV2;
import com.ss.android.ugc.aweme.services.IPreloadVESo;
import com.ss.android.ugc.aweme.setting.ui.SettingNewVersionFragment;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoEditContainerScene;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.jsbopenrecord.ExteriorVideoRecordScene;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishContainerScene;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewScene;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordPermissionActivity;
import com.ss.android.ugc.aweme.tools.draft.DraftBoxActivity;
import com.ss.android.ugc.aweme.ttep.TTEPEffectPreviewActivity;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import defpackage.b0;
import java.util.concurrent.CountDownLatch;
import kotlin.jvm.internal.o;
import yq4.a;

/* loaded from: classes8.dex */
public class AObjectS52S0101000_7 implements InterfaceC65784Pro {
    public final int $t;
    public int i1;
    public Object l0;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            case 7:
                return invoke$7(this);
            case 8:
                return invoke$8(this);
            case 9:
                return invoke$9(this);
            case 10:
                return invoke$10(this);
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return invoke$11(this);
            case 12:
                return invoke$12(this);
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                return invoke$13(this);
            case 14:
                return invoke$14(this);
            case 15:
                return invoke$15(this);
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                return invoke$16(this);
            case 17:
                return invoke$17(this);
            case 18:
                return invoke$18(this);
            case 19:
                return invoke$19(this);
            case 20:
                return invoke$20(this);
            case 21:
                return invoke$21(this);
            case 22:
                return invoke$22(this);
            case 23:
                return invoke$23(this);
            case 24:
                return invoke$24(this);
            case 25:
                return invoke$25(this);
            case 26:
                return invoke$26(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AObjectS52S0101000_7 aObjectS52S0101000_7) {
        switch (aObjectS52S0101000_7.i1) {
            case 0:
                AvatarCutActivity avatarCutActivity = (AvatarCutActivity) aObjectS52S0101000_7.l0;
                avatarCutActivity.getClass();
                Intent intent = new Intent();
                intent.putExtra("mp4", avatarCutActivity.LLI);
                intent.putExtra("dir", AVExternalServiceImpl.LIZ().configService().cacheConfig().rootDir());
                avatarCutActivity.setResult(-1, intent);
                avatarCutActivity.finish();
                return null;
            case 1:
                Fragment fragment = (Fragment) aObjectS52S0101000_7.l0;
                if (fragment.mo49getActivity() != null) {
                    fragment.mo49getActivity().onBackPressed();
                }
                return null;
            default:
                ((TTEPEffectPreviewActivity) aObjectS52S0101000_7.l0).finish();
                return null;
        }
    }

    public static final Object invoke$1(AObjectS52S0101000_7 aObjectS52S0101000_7) {
        LiveRecyclableWidget lambda$loadWidgetWithFirstFrameP2$52;
        switch (aObjectS52S0101000_7.i1) {
            case 0:
                lambda$loadWidgetWithFirstFrameP2$52 = ((AbsAudienceInteractionFragment) aObjectS52S0101000_7.l0).lambda$loadWidgetWithFirstFrameP2$52();
                return lambda$loadWidgetWithFirstFrameP2$52;
            case 1:
                C8JD c8jd = (C8JD) aObjectS52S0101000_7.l0;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("onRefreshFeedEvent ");
                LIZ.append(c8jd.LJLIL);
                return X1D.LIZIZ(LIZ);
            case 2:
                ((StickerPropDetailFragment) aObjectS52S0101000_7.l0).Nl(false);
                return null;
            default:
                DraftBoxActivity.LLIIIJ((Context) aObjectS52S0101000_7.l0);
                return null;
        }
    }

    public static final Object invoke$10(AObjectS52S0101000_7 aObjectS52S0101000_7) {
        switch (aObjectS52S0101000_7.i1) {
            case 0:
                ((VideoPublishContainerScene) aObjectS52S0101000_7.l0).LLLLLLJ();
                return null;
            default:
                return b0.LIZIZ("EventBusWrapper.unregister->", aObjectS52S0101000_7.l0);
        }
    }

    public static final Object invoke$11(AObjectS52S0101000_7 aObjectS52S0101000_7) {
        String str = "mModel is null";
        switch (aObjectS52S0101000_7.i1) {
            case 0:
                VideoPublishContainerScene videoPublishContainerScene = (VideoPublishContainerScene) aObjectS52S0101000_7.l0;
                if (videoPublishContainerScene.LLILZLL.creativeModel.transientPostPageModel.LJJIIJ) {
                    videoPublishContainerScene.y(new G5N(videoPublishContainerScene));
                } else {
                    boolean z = !((AEY) videoPublishContainerScene.LLFZ.getAccessory()).LJIIL();
                    videoPublishContainerScene.LLILZLL.creativeModel.privacySettingModel.aigcInfo.AIGCLabelType = z ? 1 : 0;
                    C145995oB c145995oB = new C145995oB();
                    VideoPublishEditModel videoPublishEditModel = videoPublishContainerScene.LLILZLL;
                    if (videoPublishEditModel != null) {
                        str = videoPublishEditModel.getCreationId();
                    }
                    c145995oB.LJI("creation_id", str);
                    c145995oB.LJI("content_type", videoPublishContainerScene.LLLLIILLL());
                    c145995oB.LJI("content_source", videoPublishContainerScene.LLILZLL.getAvetParameter().getContentSource());
                    c145995oB.LIZ(z ? 1 : 0, "action_type");
                    FMX.LJIIL("aigc_toggle", c145995oB.LIZ);
                    ((AEY) videoPublishContainerScene.LLFZ.getAccessory()).LJIILIIL(z);
                }
                return Boolean.TRUE;
            default:
                VideoPublishContainerScene videoPublishContainerScene2 = (VideoPublishContainerScene) aObjectS52S0101000_7.l0;
                videoPublishContainerScene2.getClass();
                C145995oB c145995oB2 = new C145995oB();
                VideoPublishEditModel videoPublishEditModel2 = videoPublishContainerScene2.LLILZLL;
                if (videoPublishEditModel2 != null) {
                    str = videoPublishEditModel2.getCreationId();
                }
                c145995oB2.LJI("creation_id", str);
                c145995oB2.LJI("user_id", C44172HVg.LJIJ.getCurrentUser().getUid());
                FMX.LJIIL("tns_video_push_words_cancel_ck", c145995oB2.LIZ);
                return null;
        }
    }

    public static final Object invoke$12(AObjectS52S0101000_7 aObjectS52S0101000_7) {
        String str;
        switch (aObjectS52S0101000_7.i1) {
            case 0:
                ScanQRCodeActivityV2 scanQRCodeActivityV2 = (ScanQRCodeActivityV2) aObjectS52S0101000_7.l0;
                if (!scanQRCodeActivityV2.LLII) {
                    scanQRCodeActivityV2.LJLLILLLL.chooseImage(2);
                    C188727au c188727au = new C188727au();
                    c188727au.LJIIIZ("type", "album");
                    FMX.LJIIL("scan_page_click", c188727au.LIZ);
                }
                return null;
            case 1:
                VideoPublishContainerScene videoPublishContainerScene = (VideoPublishContainerScene) aObjectS52S0101000_7.l0;
                videoPublishContainerScene.getClass();
                EZQ ezq = new EZQ(a1.LJ("https://www.tiktok.com/community-guidelines/", LocalServiceImpl.LIZIZ().LIZ(videoPublishContainerScene.mActivity), "/integrity-authenticity/?cgversion=2023#3"));
                C145995oB c145995oB = new C145995oB();
                VideoPublishEditModel videoPublishEditModel = videoPublishContainerScene.LLILZLL;
                if (videoPublishEditModel != null) {
                    str = videoPublishEditModel.getCreationId();
                } else {
                    str = "mModel is null";
                }
                c145995oB.LJI("creation_id", str);
                c145995oB.LJI("content_type", videoPublishContainerScene.LLLLIILLL());
                c145995oB.LJI("content_source", videoPublishContainerScene.LLILZLL.getAvetParameter().getContentSource());
                FMX.LJIIL("click_links_in_aigc_pop_up", c145995oB.LIZ);
                SmartRoute buildRoute = SmartRouter.buildRoute(videoPublishContainerScene.LLII(), "aweme://webview");
                buildRoute.withParam("url", ezq.LIZLLL());
                C0NY.LIZJ(buildRoute, "title", videoPublishContainerScene.getString(R.string.s08), "show_separate_line", true);
                return null;
            default:
                return ((VideoRecordNewScene) aObjectS52S0101000_7.l0).LLJI;
        }
    }

    public static final Object invoke$13(AObjectS52S0101000_7 aObjectS52S0101000_7) {
        switch (aObjectS52S0101000_7.i1) {
            case 0:
                aObjectS52S0101000_7.l0.getClass();
                return GGS.LIZJ;
            default:
                return b0.LIZIZ("EventBusWrapper.registerInner->", aObjectS52S0101000_7.l0);
        }
    }

    public static final Object invoke$14(AObjectS52S0101000_7 aObjectS52S0101000_7) {
        switch (aObjectS52S0101000_7.i1) {
            case 0:
                return ((MultiGuestPreviewFragment) aObjectS52S0101000_7.l0).Jl();
            case 1:
                G5K g5k = ((VideoPublishContainerScene) aObjectS52S0101000_7.l0).LLIIIILZ;
                if (g5k.LIZLLL != null) {
                    g5k.LIZLLL("video_visibility_popup", false);
                    g5k.LIZJ(g5k.LJ);
                    g5k.LIZLLL.LIZ(g5k.LJFF, g5k.LIZ, null, null);
                }
                return null;
            default:
                return b0.LIZIZ("EventBusWrapper.register->", aObjectS52S0101000_7.l0);
        }
    }

    public static final Object invoke$15(AObjectS52S0101000_7 aObjectS52S0101000_7) {
        switch (aObjectS52S0101000_7.i1) {
            case 0:
                return Boolean.valueOf(((C45498HtO) aObjectS52S0101000_7.l0).LLIFFJFJJ);
            default:
                return ((C83621Wrp) aObjectS52S0101000_7.l0).LLLIZZ;
        }
    }

    public static final Object invoke$16(AObjectS52S0101000_7 aObjectS52S0101000_7) {
        switch (aObjectS52S0101000_7.i1) {
            case 0:
                Fragment fragment = (Fragment) aObjectS52S0101000_7.l0;
                if (fragment.mo49getActivity() != null) {
                    fragment.mo49getActivity().onBackPressed();
                }
                return null;
            case 1:
                VideoPublishContainerScene videoPublishContainerScene = (VideoPublishContainerScene) aObjectS52S0101000_7.l0;
                G5D g5d = videoPublishContainerScene.LLILZLL.creativeModel.transientPostPageModel;
                g5d.getClass();
                g5d.LJIL = "image_preview";
                View view = videoPublishContainerScene.LLIILZL;
                if (view != null) {
                    view.performClick();
                }
                G5D g5d2 = videoPublishContainerScene.LLILZLL.creativeModel.transientPostPageModel;
                g5d2.getClass();
                g5d2.LJIL = "root";
                return null;
            default:
                C44108HSu.LJIIIIZZ(((ActivityC86117Xqz) aObjectS52S0101000_7.l0).getIntent(), HRG.CANCELLED, null);
                C43150Gwc.LIZ("1");
                return C76800UCe.LIZ;
        }
    }

    public static final Object invoke$17(AObjectS52S0101000_7 aObjectS52S0101000_7) {
        switch (aObjectS52S0101000_7.i1) {
            case 0:
                ((FTCVideoRecordNewActivity) aObjectS52S0101000_7.l0).finish();
                return null;
            case 1:
                aObjectS52S0101000_7.l0.getClass();
                return GGS.LJFF;
            default:
                ((VideoPublishContainerScene) aObjectS52S0101000_7.l0).t();
                return null;
        }
    }

    public static final Object invoke$18(AObjectS52S0101000_7 aObjectS52S0101000_7) {
        C43212Gxc immersiveConfig;
        switch (aObjectS52S0101000_7.i1) {
            case 0:
                FMX.LJIIL("tool_performance_record_first_frame", ((C145995oB) aObjectS52S0101000_7.l0).LIZ);
                return C76800UCe.LIZ;
            case 1:
                C56891MUl.M((C56891MUl) aObjectS52S0101000_7.l0);
                return null;
            case 2:
                immersiveConfig = ((SettingNewVersionFragment) aObjectS52S0101000_7.l0).getImmersiveConfig();
                return immersiveConfig;
            default:
                return Boolean.valueOf(((VideoPublishContainerScene) aObjectS52S0101000_7.l0).LLLLLILLIL());
        }
    }

    public static final Object invoke$19(AObjectS52S0101000_7 aObjectS52S0101000_7) {
        switch (aObjectS52S0101000_7.i1) {
            case 0:
                VideoViewCell videoViewCell = (VideoViewCell) aObjectS52S0101000_7.l0;
                videoViewCell.LLLLLLLLLL.postDelayed(videoViewCell.LLLZLZ, 5000L);
                return null;
            case 1:
                ((View) aObjectS52S0101000_7.l0).setTransitionName("");
                return null;
            default:
                VideoRecordPermissionActivity videoRecordPermissionActivity = (VideoRecordPermissionActivity) aObjectS52S0101000_7.l0;
                if (videoRecordPermissionActivity.getIntent().hasExtra("exterior_record_model")) {
                    if (HR8.LIZ(C16880lQ.LLJJIJI(videoRecordPermissionActivity.getIntent()), "ecommerce_photo_search") == null) {
                        HR8.LIZ(C16880lQ.LLJJIJI(videoRecordPermissionActivity.getIntent()), "aigc_take_selfie");
                    }
                    C44108HSu.LJIIIIZZ(videoRecordPermissionActivity.getIntent(), HRG.FAILED, null);
                }
                videoRecordPermissionActivity.finish();
                return C76800UCe.LIZ;
        }
    }

    public static final Object invoke$2(AObjectS52S0101000_7 aObjectS52S0101000_7) {
        switch (aObjectS52S0101000_7.i1) {
            case 0:
                return ((IGiftService) aObjectS52S0101000_7.l0).getRedEnvelopeWidget();
            case 1:
                ActivityC45651qj activityC45651qj = (ActivityC45651qj) aObjectS52S0101000_7.l0;
                activityC45651qj.getClass();
                return C0I0.LIZ(activityC45651qj);
            default:
                ((AbstractC42651GoZ) aObjectS52S0101000_7.l0).LLJJI();
                return null;
        }
    }

    public static final Object invoke$20(AObjectS52S0101000_7 aObjectS52S0101000_7) {
        boolean z;
        switch (aObjectS52S0101000_7.i1) {
            case 0:
                aObjectS52S0101000_7.l0.getClass();
                return GGS.LIZJ;
            default:
                VideoPublishContainerScene videoPublishContainerScene = (VideoPublishContainerScene) aObjectS52S0101000_7.l0;
                G6D value = videoPublishContainerScene.LLIIII.getValue();
                if (value != null && (value.getPermission() == 1 || value.getPermission() == 4)) {
                    z = true;
                } else {
                    z = false;
                }
                G6D value2 = videoPublishContainerScene.LLIIII.getValue();
                if (value2 != null) {
                    G7K LJFF = videoPublishContainerScene.LLIIIJ.LJFF(value2.getPermission(), videoPublishContainerScene.LLJJIJIL.LIZ(), C44172HVg.LJIJ.getCurrentUser().LJIILIIL());
                    G7J.LIZ = null;
                    if (LJFF != null) {
                        String LIZ = videoPublishContainerScene.LLJJIJIL.LIZ();
                        String obj = videoPublishContainerScene.LLIIIJ.LIZIZ.getText().toString();
                        if (LIZ != null && !LIZ.isEmpty()) {
                            obj = a1.LJ(LIZ, " ", obj);
                        }
                        C78934UyQ.LJLIL.LIZLLL().getClass();
                        if (AnonymousClass842.LIZ()) {
                            obj = obj.replaceAll("\n+", " ");
                        }
                        String trim = obj.trim();
                        LJFF.LIZJ = null;
                        LJFF.LIZIZ = null;
                        LJFF.LJ = false;
                        LJFF.LJFF = null;
                        C73411SrX c73411SrX = LJFF.LJII;
                        if (c73411SrX != null) {
                            c73411SrX.dispose();
                        }
                        C73411SrX c73411SrX2 = LJFF.LJIIIIZZ;
                        if (c73411SrX2 != null) {
                            c73411SrX2.dispose();
                        }
                        LJFF.LIZLLL = trim;
                        LJFF.LIZIZ();
                    } else {
                        H78.LIZ("TitleSensitivity checkPrivacyConfirmation() checker is null");
                    }
                    if (!z && a.LJFF().LJJII(videoPublishContainerScene.requireActivity())) {
                        G7J.LIZ = GBZ.PRIVACY_DIALOG;
                        a.LJFF().LJJIFFI(videoPublishContainerScene.requireActivity(), null, "video_post_page", new AObjectS52S0101000_7(2, videoPublishContainerScene, 17), new AObjectS21S0001000_5(1, 7));
                    } else {
                        videoPublishContainerScene.t();
                    }
                }
                return null;
        }
    }

    public static final Object invoke$21(AObjectS52S0101000_7 aObjectS52S0101000_7) {
        switch (aObjectS52S0101000_7.i1) {
            case 1:
                ((StickerPropDetailFragment) aObjectS52S0101000_7.l0).Nl(false);
                return null;
            default:
                return ((ExteriorVideoRecordScene) aObjectS52S0101000_7.l0).LJLZ;
        }
    }

    public static final Object invoke$22(AObjectS52S0101000_7 aObjectS52S0101000_7) {
        switch (aObjectS52S0101000_7.i1) {
            case 0:
                InterfaceC173976sD interfaceC173976sD = ((CommentListFragment) aObjectS52S0101000_7.l0).LLLILZJ;
                if (interfaceC173976sD != null) {
                    interfaceC173976sD.Hj("");
                }
                return null;
            case 1:
                return ((VideoEditContainerScene) aObjectS52S0101000_7.l0).LLIILII.LLJJI();
            default:
                ((VideoPublishContainerScene) aObjectS52S0101000_7.l0).LLLJIL();
                return null;
        }
    }

    public static final Object invoke$23(AObjectS52S0101000_7 aObjectS52S0101000_7) {
        switch (aObjectS52S0101000_7.i1) {
            case 0:
                ((CommentListFragment) aObjectS52S0101000_7.l0).LLIZ.LL = false;
                return C76800UCe.LIZ;
            case 1:
                return MainActivity.LLIIIILZ((MainActivity) aObjectS52S0101000_7.l0);
            case 2:
                ((AbstractC42651GoZ) aObjectS52S0101000_7.l0).LLJJI();
                return null;
            default:
                G5K g5k = ((VideoPublishContainerScene) aObjectS52S0101000_7.l0).LLIIIILZ;
                if (g5k.LIZLLL != null) {
                    g5k.LIZLLL("video_visibility_popup", false);
                    g5k.LIZJ(g5k.LJ);
                    g5k.LIZLLL.LIZ(g5k.LJFF, g5k.LIZ, null, null);
                }
                return null;
        }
    }

    public static final Object invoke$24(AObjectS52S0101000_7 aObjectS52S0101000_7) {
        switch (aObjectS52S0101000_7.i1) {
            case 0:
                StickerPropDetailFragment stickerPropDetailFragment = (StickerPropDetailFragment) aObjectS52S0101000_7.l0;
                MIV miv = stickerPropDetailFragment.LJLJI;
                if (miv != null) {
                    miv.LJIILL(stickerPropDetailFragment.LJLJJI, 0);
                    return null;
                }
                return null;
            default:
                return ((ExteriorVideoRecordScene) aObjectS52S0101000_7.l0).LJLLLLLL;
        }
    }

    public static final Object invoke$25(AObjectS52S0101000_7 aObjectS52S0101000_7) {
        switch (aObjectS52S0101000_7.i1) {
            case 0:
                C44031HPv c44031HPv = (C44031HPv) aObjectS52S0101000_7.l0;
                DialogC25756A8y dialogC25756A8y = c44031HPv.LJ.LIZ;
                if (dialogC25756A8y != null) {
                    V1B.LJLILLLLZI(dialogC25756A8y);
                }
                C62119OZn c62119OZn = c44031HPv.LJ.LJII;
                if (c62119OZn != null) {
                    c62119OZn.LIZ(0, null);
                }
                return null;
            case 1:
                ((VideoPublishContainerScene) aObjectS52S0101000_7.l0).LLLJIL();
                return null;
            default:
                return b0.LIZIZ("EventBusWrapper.unregisterInner->", aObjectS52S0101000_7.l0);
        }
    }

    public static final Object invoke$26(AObjectS52S0101000_7 aObjectS52S0101000_7) {
        switch (aObjectS52S0101000_7.i1) {
            case 0:
                return ((XWR) aObjectS52S0101000_7.l0).LIZLLL();
            case 1:
            default:
                ((CountDownLatch) aObjectS52S0101000_7.l0).countDown();
                return C76800UCe.LIZ;
            case 2:
                FeedFollowFragment feedFollowFragment = (FeedFollowFragment) aObjectS52S0101000_7.l0;
                feedFollowFragment.Tl("", false, true);
                feedFollowFragment.Sl(true, feedFollowFragment.LJLZ, true);
                return null;
            case 3:
                IPreloadVESo iPreloadVESo = (IPreloadVESo) aObjectS52S0101000_7.l0;
                C145995oB c145995oB = new C145995oB();
                FFL.LJIIIZ().getClass();
                c145995oB.LJ("ab_load_ve_sdk", FFL.LJ(31744, "open_camera_frame_optimize_pre_load_so", true, false));
                c145995oB.LIZ(iPreloadVESo.getPreLoadVESoStatus().toStatusCode(), "status_load_ve_sdk");
                return c145995oB.LIZ;
        }
    }

    public static final Object invoke$3(AObjectS52S0101000_7 aObjectS52S0101000_7) {
        switch (aObjectS52S0101000_7.i1) {
            case 0:
                DetailFragmentPanel detailFragmentPanel = (DetailFragmentPanel) ((LifecycleOwner) aObjectS52S0101000_7.l0);
                detailFragmentPanel.getClass();
                if (C72Y.LIZ()) {
                    C55537Lqv c55537Lqv = detailFragmentPanel.LLILL;
                    if (c55537Lqv != null) {
                        c55537Lqv.LJ(new RunnableC23230vf(7, detailFragmentPanel));
                        return null;
                    }
                    return null;
                }
                detailFragmentPanel.LJLIL(detailFragmentPanel.getCurrentAweme());
                return null;
            default:
                VideoPublishContainerScene videoPublishContainerScene = (VideoPublishContainerScene) ((LifecycleOwner) aObjectS52S0101000_7.l0);
                videoPublishContainerScene.getClass();
                C140295ez c140295ez = new C140295ez();
                String creationId = videoPublishContainerScene.LLILZLL.getCreationId();
                o.LJIIIZ(creationId, "creationId");
                c140295ez.LIZ.put("creation_id", creationId);
                c140295ez.LIZ.put("enter_from", "video_post_page");
                String shootWay = videoPublishContainerScene.LLILZLL.mShootWay;
                o.LJIIIZ(shootWay, "shootWay");
                c140295ez.LIZ.put("shoot_way", shootWay);
                return c140295ez;
        }
    }

    public static final Object invoke$4(AObjectS52S0101000_7 aObjectS52S0101000_7) {
        switch (aObjectS52S0101000_7.i1) {
            case 0:
                return MainActivity.LLII((MainActivity) aObjectS52S0101000_7.l0);
            default:
                ((VideoPublishContainerScene) aObjectS52S0101000_7.l0).g();
                return null;
        }
    }

    public static final Object invoke$5(AObjectS52S0101000_7 aObjectS52S0101000_7) {
        switch (aObjectS52S0101000_7.i1) {
            case 0:
                ((C56542MHa) aObjectS52S0101000_7.l0).LJLLILLLL = false;
                return C76800UCe.LIZ;
            default:
                VideoPublishContainerScene videoPublishContainerScene = (VideoPublishContainerScene) aObjectS52S0101000_7.l0;
                View view = videoPublishContainerScene.LJLJLLL;
                if (view != null) {
                    view.setVisibility(0);
                }
                AnimatorSet animatorSet = (AnimatorSet) AnimatorInflater.loadAnimator(videoPublishContainerScene.LLII(), R.anim.cf);
                animatorSet.setTarget(videoPublishContainerScene.LJLJLLL);
                animatorSet.start();
                return null;
        }
    }

    public static final Object invoke$6(AObjectS52S0101000_7 aObjectS52S0101000_7) {
        switch (aObjectS52S0101000_7.i1) {
            case 0:
                ((AwemeListFragmentImpl) aObjectS52S0101000_7.l0).LLLZI();
                return null;
            case 1:
                return C83591WrL.R2((C83591WrL) aObjectS52S0101000_7.l0);
            default:
                C42318GjC.LIZIZ("tool_performance_record_first_frame", ((C145995oB) aObjectS52S0101000_7.l0).LIZ);
                return C76800UCe.LIZ;
        }
    }

    public static final Object invoke$7(AObjectS52S0101000_7 aObjectS52S0101000_7) {
        switch (aObjectS52S0101000_7.i1) {
            case 0:
                return C83621Wrp.LLZLLIL((C83621Wrp) ((LifecycleOwner) aObjectS52S0101000_7.l0));
            default:
                VideoPublishContainerScene videoPublishContainerScene = (VideoPublishContainerScene) ((LifecycleOwner) aObjectS52S0101000_7.l0);
                videoPublishContainerScene.LLILZLL.creativeModel.transientPostPageModel.LJJIFFI = false;
                videoPublishContainerScene.b();
                return null;
        }
    }

    public static final Object invoke$8(AObjectS52S0101000_7 aObjectS52S0101000_7) {
        switch (aObjectS52S0101000_7.i1) {
            case 0:
                return ((VideoPublishContainerScene) aObjectS52S0101000_7.l0).LLIIJI;
            default:
                ((VideoPublishContainerScene) aObjectS52S0101000_7.l0).g();
                return null;
        }
    }

    public static final Object invoke$9(AObjectS52S0101000_7 aObjectS52S0101000_7) {
        switch (aObjectS52S0101000_7.i1) {
            case 0:
                return ((VideoPublishContainerScene) aObjectS52S0101000_7.l0).LLILIL;
            case 1:
                ((VideoPublishContainerScene) aObjectS52S0101000_7.l0).e();
                return null;
            default:
                aObjectS52S0101000_7.l0.getClass();
                return GGS.LIZJ;
        }
    }

    public AObjectS52S0101000_7(int i, Object obj, int i2) {
        this.$t = i2;
        this.i1 = i;
        this.l0 = obj;
    }
}
