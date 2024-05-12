package Y;

import X.BEF;
import X.C0TV;
import X.C145995oB;
import X.C41037G8r;
import X.C41890GcI;
import X.C42541Gmn;
import X.C42549Gmv;
import X.C45674HwE;
import X.C45675HwF;
import X.C45685HwP;
import X.C45691HwV;
import X.C75154TeY;
import X.C76800UCe;
import X.C78915Uy7;
import X.ExecutorC149205tM;
import X.FMX;
import X.G5D;
import X.InterfaceC29879Bo3;
import X.InterfaceC30237Btp;
import X.InterfaceC88472Yns;
import X.Q8V;
import X.TVY;
import X.XWV;
import android.app.Activity;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.liveinteract.linkroom.widget.LinkControlWidget;
import com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.previewv1.GuestMediaManageFragment;
import com.bytedance.android.live.liveinteract.platform.common.utils.LinkMicAppBundleUtil;
import com.bytedance.android.livesdk.broadcast.video.VideoWidget;
import com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment;
import com.bytedance.android.livesdk.chatroom.viewmodule.CommentWidget;
import com.bytedance.android.livesdk.model.BorderInfo;
import com.bytedance.android.livesdk.userinfowidget.LiveRoomUserInfoWidget;
import com.ss.android.ugc.aweme.port.in.IAVMixFeedService;
import com.ss.android.ugc.aweme.services.IAVMixFeedServiceImpl;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.OpeningChooseMediaPageState;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishContainerScene;
import com.ss.android.ugc.aweme.shortvideo.ui.viewmodel.VideoPublishViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;

/* loaded from: classes8.dex */
public class AObjectS43S0101000_7 implements InterfaceC88472Yns {
    public final int $t;
    public int i1;
    public Object l0;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AObjectS43S0101000_7 aObjectS43S0101000_7, Object obj) {
        switch (aObjectS43S0101000_7.i1) {
            case 0:
                InterfaceC30237Btp interfaceC30237Btp = (InterfaceC30237Btp) aObjectS43S0101000_7.l0;
                BEF bef = (BEF) obj;
                if (bef.LJLJI && TextUtils.equals(bef.LJLJJLL, "STICKERS")) {
                    interfaceC30237Btp.setAlpha(0.34f);
                }
                return C76800UCe.LIZ;
            case 1:
                ((CommentWidget) aObjectS43S0101000_7.l0).LLFII();
                return C76800UCe.LIZ;
            default:
                C41890GcI c41890GcI = (C41890GcI) aObjectS43S0101000_7.l0;
                c41890GcI.getClass();
                if (C42549Gmv.LIZLLL) {
                    VideoPublishContainerScene videoPublishContainerScene = c41890GcI.LIZIZ;
                    videoPublishContainerScene.getClass();
                    ExecutorC149205tM executorC149205tM = ExecutorC149205tM.LJLILLLLZI;
                    Q8V q8v = new Q8V(8, videoPublishContainerScene);
                    Handler handler = executorC149205tM.LJLIL;
                    handler.sendMessageAtFrontOfQueue(Message.obtain(handler, q8v));
                }
                if (((Boolean) C42541Gmn.LIZ.getValue()).booleanValue()) {
                    c41890GcI.LIZIZ.I();
                    return null;
                }
                return null;
        }
    }

    public static final Object invoke$1(AObjectS43S0101000_7 aObjectS43S0101000_7, Object obj) {
        int i;
        switch (aObjectS43S0101000_7.i1) {
            case 0:
                ((GuestMediaManageFragment) aObjectS43S0101000_7.l0).LLJJIJIIJIL = (C0TV) obj;
                return C76800UCe.LIZ;
            case 1:
                ((InterfaceC29879Bo3) aObjectS43S0101000_7.l0).invoke(null);
                return C76800UCe.LIZ;
            default:
                C45674HwE c45674HwE = (C45674HwE) aObjectS43S0101000_7.l0;
                c45674HwE.getClass();
                if (obj == OpeningChooseMediaPageState.OnSceneAnimationEnded.INSTANCE) {
                    int i2 = c45674HwE.LJLLI;
                    if (i2 == 0) {
                        C45685HwP c45685HwP = c45674HwE.LJLJJL;
                        int i3 = C45674HwE.LJLZ;
                        C45675HwF c45675HwF = c45674HwE.LJLLLL;
                        C45691HwV c45691HwV = C45691HwV.LIZ;
                        c45685HwP.getClass();
                        C45685HwP.LIZLLL(4, i3, i2, c45675HwF, c45691HwV);
                    }
                    int i4 = c45674HwE.LJLL;
                    if (i4 == 0) {
                        if (c45674HwE.LJLLJ) {
                            i = 1;
                        } else {
                            i = 3;
                        }
                        C45685HwP c45685HwP2 = c45674HwE.LJLJJL;
                        int i5 = C45674HwE.LJZ;
                        C45675HwF c45675HwF2 = c45674HwE.LJLLLL;
                        C45691HwV c45691HwV2 = C45691HwV.LIZ;
                        c45685HwP2.getClass();
                        C45685HwP.LIZLLL(i, i5, i4, c45675HwF2, c45691HwV2);
                    }
                }
                return C76800UCe.LIZ;
        }
    }

    public static final Object invoke$2(AObjectS43S0101000_7 aObjectS43S0101000_7, Object obj) {
        C76800UCe lambda$onCreate$10;
        String str;
        int i;
        switch (aObjectS43S0101000_7.i1) {
            case 0:
                LifecycleOwner lifecycleOwner = (LifecycleOwner) aObjectS43S0101000_7.l0;
                lifecycleOwner.getClass();
                LinkMicAppBundleUtil linkMicAppBundleUtil = (LinkMicAppBundleUtil) TVY.LIZ();
                if (linkMicAppBundleUtil != null) {
                    linkMicAppBundleUtil.LIZIZ("co_host_icon", new AObjectS56S0101000_13(0, lifecycleOwner, 2));
                }
                return C76800UCe.LIZ;
            case 1:
                lambda$onCreate$10 = ((VideoWidget) ((LifecycleOwner) aObjectS43S0101000_7.l0)).lambda$onCreate$10((C76800UCe) obj);
                return lambda$onCreate$10;
            case 2:
                CommentWidget commentWidget = (CommentWidget) ((LifecycleOwner) aObjectS43S0101000_7.l0);
                commentWidget.LLF = true;
                commentWidget.LLILZLL();
                return C76800UCe.LIZ;
            case 3:
                ((LiveRoomUserInfoWidget) ((LifecycleOwner) aObjectS43S0101000_7.l0)).LLILIL((BorderInfo) obj);
                return C76800UCe.LIZ;
            default:
                VideoPublishContainerScene videoPublishContainerScene = (VideoPublishContainerScene) ((LifecycleOwner) aObjectS43S0101000_7.l0);
                if (!videoPublishContainerScene.LLILZLL.creativeModel.transientPostPageModel.LJJJJ) {
                    Activity requireActivity = videoPublishContainerScene.requireActivity();
                    CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                    if (videoPublishContainerScene.LLILZLL.creativeModel.privacySettingModel.isSubscribeOnly) {
                        i = R.string.rui;
                    } else {
                        i = R.string.sen;
                    }
                    creativeToastBuilder.messageRes(i);
                    C78915Uy7.LJJIIZI(requireActivity, 2004, creativeToastBuilder);
                    return null;
                }
                C145995oB c145995oB = new C145995oB();
                VideoPublishEditModel videoPublishEditModel = videoPublishContainerScene.LLILZLL;
                String str2 = "mModel is null";
                if (videoPublishEditModel == null) {
                    str = "mModel is null";
                } else {
                    str = videoPublishEditModel.getCreationId();
                }
                c145995oB.LJI("creation_id", str);
                VideoPublishEditModel videoPublishEditModel2 = videoPublishContainerScene.LLILZLL;
                if (videoPublishEditModel2 != null) {
                    str2 = videoPublishEditModel2.mShootWay;
                }
                c145995oB.LJI("shoot_way", str2);
                c145995oB.LJI("enter_from", "video_post_page");
                FMX.LJIIL("click_add_playlist_entrance", c145995oB.LIZ);
                IAVMixFeedService createIAVMixFeedServicebyMonsterPlugin = IAVMixFeedServiceImpl.createIAVMixFeedServicebyMonsterPlugin(false);
                Activity activity = videoPublishContainerScene.mActivity;
                XWV xwv = new XWV(videoPublishContainerScene);
                G5D g5d = videoPublishContainerScene.LLILZLL.creativeModel.transientPostPageModel;
                createIAVMixFeedServicebyMonsterPlugin.showAddToMixInPublishPage(activity, xwv, "video_post_page", "publish_page", g5d.LJJJIL, g5d.LJJJJI);
                return null;
        }
    }

    public static final Object invoke$3(AObjectS43S0101000_7 aObjectS43S0101000_7, Object obj) {
        switch (aObjectS43S0101000_7.i1) {
            case 0:
                C75154TeY c75154TeY = ((LinkControlWidget) ((LifecycleOwner) aObjectS43S0101000_7.l0)).LJLLLL;
                c75154TeY.LIZLLL = 0;
                ((ArrayList) c75154TeY.LIZJ).clear();
                c75154TeY.LIZIZ.LJI(0);
                return C76800UCe.LIZ;
            case 1:
                LivePlayFragment livePlayFragment = (LivePlayFragment) ((LifecycleOwner) aObjectS43S0101000_7.l0);
                livePlayFragment.getClass();
                obj.getClass();
                livePlayFragment.vl();
                return C76800UCe.LIZ;
            default:
                VideoPublishContainerScene videoPublishContainerScene = (VideoPublishContainerScene) ((LifecycleOwner) aObjectS43S0101000_7.l0);
                videoPublishContainerScene.getClass();
                int intValue = ((Integer) obj).intValue();
                if (intValue != 1) {
                    if (intValue != 3) {
                        if (intValue != 4) {
                            if (intValue != 5) {
                                return null;
                            }
                            VideoPublishViewModel n2 = videoPublishContainerScene.n();
                            boolean z = videoPublishContainerScene.LLILZLL.mIsFromDraft;
                            n2.getClass();
                            n2.setStateImmediate(new C41037G8r(false, z, false, true));
                            return null;
                        }
                    } else {
                        videoPublishContainerScene.LLILZLL.creativeModel.audioCopyrightDetectModel.setContinueSelected(true);
                        videoPublishContainerScene.c();
                        return null;
                    }
                }
                videoPublishContainerScene.LLILZLL.creativeModel.audioCopyrightDetectModel.setChangeMusicFrom("video_post_page");
                VideoPublishViewModel n3 = videoPublishContainerScene.n();
                boolean z2 = videoPublishContainerScene.LLILZLL.mIsFromDraft;
                n3.getClass();
                n3.setStateImmediate(new C41037G8r(false, z2, true, false));
                return null;
        }
    }

    public AObjectS43S0101000_7(int i, Object obj, int i2) {
        this.$t = i2;
        this.i1 = i;
        this.l0 = obj;
    }
}
