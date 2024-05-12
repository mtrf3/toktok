package Y;

import X.APK;
import X.APM;
import X.APN;
import X.AV1;
import X.ActivityC45651qj;
import X.AnonymousClass744;
import X.AnonymousClass745;
import X.B57;
import X.BFA;
import X.BLM;
import X.BZI;
import X.C03880Dg;
import X.C0K2;
import X.C0NB;
import X.C161996Xj;
import X.C162006Xk;
import X.C16880lQ;
import X.C174446sy;
import X.C174456sz;
import X.C176996x5;
import X.C178176yz;
import X.C1799074g;
import X.C188727au;
import X.C235399Lr;
import X.C25848ACm;
import X.C26045AKb;
import X.C26316AUm;
import X.C26317AUn;
import X.C28787BRn;
import X.C38337F2v;
import X.C41531GRr;
import X.C43256GyK;
import X.C61099NyR;
import X.C65300Pk0;
import X.C6IQ;
import X.C6XP;
import X.C6XQ;
import X.C6ZT;
import X.C71Y;
import X.C74Z;
import X.C77321UWf;
import X.C78997UzR;
import X.C79004UzY;
import X.C7YC;
import X.C82351WTr;
import X.C83551Wqh;
import X.C85005XXt;
import X.C85028XYq;
import X.C85511XhD;
import X.C85516XhI;
import X.C85825XmH;
import X.C85827XmJ;
import X.C85828XmK;
import X.C86188Xs8;
import X.CIU;
import X.CN1;
import X.DialogC25756A8y;
import X.DialogC81627W1v;
import X.EnumC09680Zo;
import X.EnumC61629OGr;
import X.FMX;
import X.HG3;
import X.InterfaceC177046xA;
import X.InterfaceC1798974f;
import X.InterfaceC29345BfR;
import X.InterfaceC31090CIc;
import X.JTE;
import X.JTF;
import X.LEA;
import X.QXX;
import X.RBV;
import X.RBX;
import X.STD;
import X.V1B;
import X.XU0;
import X.XVF;
import X.XXF;
import X.XXG;
import X.XYV;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.feed.api.ILiveFeedApiService;
import com.bytedance.android.livesdk.chatroom.ui.LiveEmojiInputDialogFragment;
import com.bytedance.android.livesdk.comp.api.game.linkmic.IGameLinkMicService;
import com.bytedance.android.livesdk.dataChannel.PreShowKeyboardEvent;
import com.bytedance.android.livesdk.feed.drawerfeed.DrawerFeedLiveFragmentV2;
import com.bytedance.android.livesdk.livesetting.feed.LiveForuTopLivesEnterOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.account.login.passkey.PasskeyService;
import com.ss.android.ugc.aweme.account.login.passkey.passkeyets.EnterSetPasskeyEvent;
import com.ss.android.ugc.aweme.account.login.twostep.TOTPCodeVerifyFragment;
import com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerifyEmailFor2046Fragment;
import com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerifySmsFor2046Fragment;
import com.ss.android.ugc.aweme.account.reactive.ReactiveAccountActivity;
import com.ss.android.ugc.aweme.account.setpwd.VerifyPasswordFragment;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.choosemusic.activity.ChooseMusicActivity;
import com.ss.android.ugc.aweme.comment.commentlist.CommentListFragment;
import com.ss.android.ugc.aweme.comment.detailpage.ui.CommentInputFragment;
import com.ss.android.ugc.aweme.comment.keyboard.ui.KeyboardDialogFragment;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.ui.LongPressLayout;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.music.model.MusicCollectionItem;
import com.ss.android.ugc.aweme.profile.aigc.ProfileAIGCServiceImpl;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.ui.HeaderDetailActivity;
import com.ss.android.ugc.aweme.prop.fragment.StickerPropDetailFragment;
import com.ss.android.ugc.aweme.search.ecommerce.middle.BaseDiscoverAndSearchFragmentNew;
import com.ss.android.ugc.aweme.setting.serverpush.ui.PushSettingManagerFragment;
import com.ss.android.ugc.aweme.setting.serverpush.ui.PushSettingManagerFragmentSecondVersion;
import com.ss.android.ugc.aweme.setting.services.SettingServiceImpl;
import com.ss.android.ugc.aweme.setting.ui.SettingNewVersionFragment;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.image.ExpandedTitleModule;
import com.ss.android.ugc.aweme.shortvideo.ui.VEVideoPublishPreviewActivity;
import com.ss.android.ugc.aweme.shortvideo.ui.VEVideoPublishPreviewScene;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishContainerScene;
import com.ss.android.ugc.trill.setting.PushSettingActivity;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.jvm.internal.o;
import yq4.a;

/* loaded from: classes16.dex */
public class ACListenerS32S0101000_15 implements View.OnClickListener {
    public final int $t;
    public int i1;
    public Object l0;

    public static final void onClick$4(ACListenerS32S0101000_15 aCListenerS32S0101000_15, View view) {
        switch (aCListenerS32S0101000_15.i1) {
            case 0:
                ((SettingNewVersionFragment) aCListenerS32S0101000_15.l0).lambda$initUnits$110(view);
                return;
            default:
                ((SettingNewVersionFragment) aCListenerS32S0101000_15.l0).lambda$initUnits$98(view);
                return;
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                return;
            case 1:
                onClick$1(this, view);
                return;
            case 2:
                onClick$2(this, view);
                return;
            case 3:
                onClick$3(this, view);
                return;
            case 4:
                onClick$4(this, view);
                return;
            case 5:
                onClick$5(this, view);
                return;
            case 6:
                onClick$6(this, view);
                return;
            case 7:
                onClick$7(this, view);
                return;
            case 8:
                onClick$8(this, view);
                return;
            case 9:
                onClick$9(this, view);
                return;
            case 10:
                onClick$10(this, view);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                onClick$11(this, view);
                return;
            case 12:
                onClick$12(this, view);
                return;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                onClick$13(this, view);
                return;
            case 14:
                onClick$14(this, view);
                return;
            case 15:
                onClick$15(this, view);
                return;
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                onClick$16(this, view);
                return;
            case 17:
                onClick$17(this, view);
                return;
            case 18:
                onClick$18(this, view);
                return;
            default:
                return;
        }
    }

    public static final void onClick$0(ACListenerS32S0101000_15 aCListenerS32S0101000_15, View view) {
        User author;
        switch (aCListenerS32S0101000_15.i1) {
            case 0:
                ((XXG) aCListenerS32S0101000_15.l0).onClick(view);
                return;
            case 1:
                C86188Xs8 c86188Xs8 = (C86188Xs8) aCListenerS32S0101000_15.l0;
                Aweme aweme = c86188Xs8.LJLIL;
                if (aweme == null || c86188Xs8.LJLJLLL || (author = aweme.getAuthor()) == null) {
                    return;
                }
                c86188Xs8.LJLJI.jv0(Boolean.TRUE, "live_window_clicked");
                EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
                enterRoomConfig.mLogData.videoId = c86188Xs8.LJLIL.getAid();
                EnterRoomConfig.RoomsData roomsData = enterRoomConfig.mRoomsData;
                roomsData.enterFromMerge = c86188Xs8.LJLILLLLZI;
                roomsData.enterMethod = "live_window";
                LiveOuterService.LJJJLL().LJIILL().LJIIZILJ(c86188Xs8.LJLJJI, author, enterRoomConfig);
                return;
            case 2:
                C26316AUm c26316AUm = (C26316AUm) aCListenerS32S0101000_15.l0;
                if (c26316AUm.LJI()) {
                    return;
                }
                new C43256GyK().LIZ(c26316AUm.LIZJ, new C26317AUn(c26316AUm));
                return;
            default:
                ((SettingNewVersionFragment) aCListenerS32S0101000_15.l0).lambda$initUnits$27(view);
                return;
        }
    }

    public static final void onClick$1(ACListenerS32S0101000_15 aCListenerS32S0101000_15, View view) {
        switch (aCListenerS32S0101000_15.i1) {
            case 0:
                XXG xxg = (XXG) aCListenerS32S0101000_15.l0;
                if (xxg.T()) {
                    C26045AKb c26045AKb = new C26045AKb(view);
                    c26045AKb.LJIIIIZZ(R.string.eis);
                    c26045AKb.LJIIJ();
                    C188727au c188727au = new C188727au();
                    c188727au.LJIIIZ("enter_from", "change_music_page");
                    FMX.LJIIL("add_private_music", c188727au.LIZ);
                    return;
                }
                xxg.onClick(view);
                return;
            default:
                SettingNewVersionFragment.lambda$initUnits$29((Context) aCListenerS32S0101000_15.l0, view);
                return;
        }
    }

    public static final void onClick$10(ACListenerS32S0101000_15 aCListenerS32S0101000_15, View view) {
        switch (aCListenerS32S0101000_15.i1) {
            case 0:
                final ReactiveAccountActivity reactiveAccountActivity = (ReactiveAccountActivity) aCListenerS32S0101000_15.l0;
                if (reactiveAccountActivity.LJLJLJ) {
                    return;
                }
                if (reactiveAccountActivity.LJLJL == null) {
                    DialogC25756A8y dialogC25756A8y = new DialogC25756A8y(reactiveAccountActivity);
                    reactiveAccountActivity.LJLJL = dialogC25756A8y;
                    dialogC25756A8y.LIZIZ(R.string.h30);
                }
                DialogC25756A8y dialogC25756A8y2 = reactiveAccountActivity.LJLJL;
                if (dialogC25756A8y2 != null) {
                    V1B.LJLJJL(dialogC25756A8y2);
                }
                HG3.LJIIL();
                HG3.LJLJL.LJIILJJIL(new LEA() { // from class: X.OU3
                    @Override // X.LEA
                    public final void onAccountResult(int i, boolean z, int i2, User user) {
                        ReactiveAccountActivity reactiveAccountActivity2 = ReactiveAccountActivity.this;
                        reactiveAccountActivity2.LJLJLJ = false;
                        DialogC25756A8y dialogC25756A8y3 = reactiveAccountActivity2.LJLJL;
                        if (dialogC25756A8y3 != null) {
                            V1B.LJLILLLLZI(dialogC25756A8y3);
                        }
                    }
                });
                reactiveAccountActivity.LJLJLJ = true;
                HG3.LJIIIIZZ().logout("recover_account", "user_logout");
                C188727au c188727au = new C188727au();
                c188727au.LJIIIZ("action", "log_out");
                FMX.LJIIL("respond_reactivate_account", c188727au.LIZ);
                return;
            case 1:
                KeyboardDialogFragment keyboardDialogFragment = (KeyboardDialogFragment) aCListenerS32S0101000_15.l0;
                if (!keyboardDialogFragment.LLILZIL) {
                    keyboardDialogFragment.LLILZIL = true;
                    if (keyboardDialogFragment.LLILZ) {
                        keyboardDialogFragment.LLILZ = false;
                        keyboardDialogFragment.Rl(false);
                        keyboardDialogFragment.Sl(keyboardDialogFragment.LLILZIL);
                    } else {
                        keyboardDialogFragment.xl(0);
                    }
                    C176996x5 c176996x5 = keyboardDialogFragment.LLJILJIL;
                    if (c176996x5 != null) {
                        c176996x5.LJJIJIL("click_gift_icon");
                        return;
                    }
                    return;
                }
                keyboardDialogFragment.Ll(0);
                keyboardDialogFragment.LLILZ = false;
                keyboardDialogFragment.LLILZIL = false;
                return;
            case 2:
                ((PushSettingManagerFragmentSecondVersion) aCListenerS32S0101000_15.l0).Hl();
                return;
            default:
                ((SettingNewVersionFragment) aCListenerS32S0101000_15.l0).lambda$initUnits$55(view);
                return;
        }
    }

    public static final void onClick$11(ACListenerS32S0101000_15 aCListenerS32S0101000_15, View view) {
        InterfaceC29345BfR interfaceC29345BfR;
        switch (aCListenerS32S0101000_15.i1) {
            case 0:
                ((DialogFragment) aCListenerS32S0101000_15.l0).dismissAllowingStateLoss();
                return;
            case 1:
                ((BFA) aCListenerS32S0101000_15.l0).M();
                return;
            case 2:
                ChooseMusicActivity chooseMusicActivity = (ChooseMusicActivity) aCListenerS32S0101000_15.l0;
                KeyboardUtils.LIZIZ(chooseMusicActivity.LJLIL);
                XU0.LIZLLL(chooseMusicActivity.LJLJLJ, chooseMusicActivity);
                XVF.LJIILJJIL(EnumC61629OGr.TAB_TYPE_LOCAL, false);
                return;
            case 3:
                ((XXF) aCListenerS32S0101000_15.l0).onClick(view);
                return;
            case 4:
                C6IQ c6iq = (C6IQ) aCListenerS32S0101000_15.l0;
                if (c6iq.LJZI || (interfaceC29345BfR = c6iq.LLF) == null) {
                    return;
                }
                interfaceC29345BfR.LIZ();
                return;
            default:
                ActivityC45651qj mo49getActivity = ((Fragment) aCListenerS32S0101000_15.l0).mo49getActivity();
                if (mo49getActivity != null) {
                    mo49getActivity.finish();
                    return;
                }
                return;
        }
    }

    public static final void onClick$12(ACListenerS32S0101000_15 aCListenerS32S0101000_15, View view) {
        String str;
        switch (aCListenerS32S0101000_15.i1) {
            case 0:
                ((CommentListFragment) ((AnonymousClass744) aCListenerS32S0101000_15.l0).LLIL).Dn(view);
                return;
            case 1:
                JTF jtf = ((JTE) aCListenerS32S0101000_15.l0).LJLJLLL;
                if (jtf != null) {
                    jtf.LIZJ();
                    return;
                }
                return;
            case 2:
                Context context = (Context) aCListenerS32S0101000_15.l0;
                context.getClass();
                C235399Lr c235399Lr = new C235399Lr("enter_delete_account");
                C1799074g c1799074g = InterfaceC1798974f.LIZ;
                c235399Lr.LJ("previous_page", "account_security_settings", c1799074g);
                c235399Lr.LJ("enter_method", "click_button", c1799074g);
                c235399Lr.LJIILIIL();
                if (AV1.LJIIJJI()) {
                    str = "aweme://hyd_action/ad_confirm_child";
                } else {
                    str = "aweme://hyd_action/ad_delete_confirm";
                }
                SmartRoute buildRoute = SmartRouter.buildRoute(context, str);
                buildRoute.withParam("locale", SettingServiceImpl.LIZ().getAppLanguage());
                buildRoute.withParam("hide_status_bar", true);
                buildRoute.withParam("hide_nav_bar", true);
                buildRoute.open();
                return;
            case 3:
                ((Dialog) aCListenerS32S0101000_15.l0).hide();
                return;
            case 4:
                ((SettingNewVersionFragment) aCListenerS32S0101000_15.l0).lambda$initUnits$64(view);
                return;
            case 5:
                VEVideoPublishPreviewScene vEVideoPublishPreviewScene = (VEVideoPublishPreviewScene) aCListenerS32S0101000_15.l0;
                vEVideoPublishPreviewScene.getClass();
                if (C6XP.LIZIZ() || !C6XP.LIZ()) {
                    if (!vEVideoPublishPreviewScene.LLIL) {
                        if (!vEVideoPublishPreviewScene.LLILII) {
                            C6XQ.LIZJ(vEVideoPublishPreviewScene.LJLLJ, vEVideoPublishPreviewScene.LLFII, true);
                            vEVideoPublishPreviewScene.LJLLL.LIZJ();
                            vEVideoPublishPreviewScene.LLD.setVisibility(0);
                            vEVideoPublishPreviewScene.LLILII = true;
                            return;
                        }
                        C6XQ.LIZJ(vEVideoPublishPreviewScene.LJLLJ, vEVideoPublishPreviewScene.LLFII, true);
                        vEVideoPublishPreviewScene.LJLLL.LIZLLL();
                        vEVideoPublishPreviewScene.LLD.setVisibility(4);
                        vEVideoPublishPreviewScene.LLILII = false;
                        return;
                    }
                    C6XQ.LIZJ(vEVideoPublishPreviewScene.LJLLJ, vEVideoPublishPreviewScene.LLFII, false);
                    vEVideoPublishPreviewScene.LLLILZ();
                    vEVideoPublishPreviewScene.LLIL = false;
                    return;
                }
                if (!vEVideoPublishPreviewScene.LLILII) {
                    C6XQ.LIZJ(vEVideoPublishPreviewScene.LJLLJ, vEVideoPublishPreviewScene.LLFII, true);
                    vEVideoPublishPreviewScene.LJLLL.LIZJ();
                    vEVideoPublishPreviewScene.LLD.setVisibility(0);
                    vEVideoPublishPreviewScene.LLILII = true;
                    return;
                }
                C6XQ.LIZJ(vEVideoPublishPreviewScene.LJLLJ, vEVideoPublishPreviewScene.LLFII, true);
                vEVideoPublishPreviewScene.LJLLL.LIZLLL();
                vEVideoPublishPreviewScene.LLD.setVisibility(4);
                vEVideoPublishPreviewScene.LLILII = false;
                return;
            default:
                ((C83551Wqh) aCListenerS32S0101000_15.l0).LIZ();
                return;
        }
    }

    public static final void onClick$13(ACListenerS32S0101000_15 aCListenerS32S0101000_15, View view) {
        boolean z = false;
        switch (aCListenerS32S0101000_15.i1) {
            case 0:
                ((AnonymousClass745) ((LifecycleOwner) aCListenerS32S0101000_15.l0)).N(view, "click_comment_head");
                return;
            case 1:
                KeyboardDialogFragment keyboardDialogFragment = (KeyboardDialogFragment) ((LifecycleOwner) aCListenerS32S0101000_15.l0);
                if (keyboardDialogFragment.LLJILJILJ != CommentVideoModel.Type.NONE) {
                    keyboardDialogFragment.xl(0);
                }
                ((C176996x5) keyboardDialogFragment.LLIIZ).LJJIZ(keyboardDialogFragment.LLJILJILJ);
                return;
            case 2:
                DetailFragmentPanel detailFragmentPanel = (DetailFragmentPanel) ((LifecycleOwner) aCListenerS32S0101000_15.l0);
                detailFragmentPanel.getClass();
                Intent intent = new Intent();
                intent.putExtra("send_video", detailFragmentPanel.getCurrentAweme());
                detailFragmentPanel.LJJLIIIJLLLLLLLZ(intent);
                return;
            case 3:
                Fragment fragment = (Fragment) ((LifecycleOwner) aCListenerS32S0101000_15.l0);
                fragment.getClass();
                a.LJIILL().LJIJI(fragment.mo49getActivity());
                return;
            case 4:
                ((SettingNewVersionFragment) ((LifecycleOwner) aCListenerS32S0101000_15.l0)).lambda$initUnits$47(view);
                return;
            default:
                VEVideoPublishPreviewActivity vEVideoPublishPreviewActivity = (VEVideoPublishPreviewActivity) ((LifecycleOwner) aCListenerS32S0101000_15.l0);
                VideoPublishEditModel videoPublishEditModel = vEVideoPublishPreviewActivity.LJLL;
                if (vEVideoPublishPreviewActivity.LJLLLL != C162006Xk.LJLIL) {
                    z = true;
                }
                C6XQ.LIZIZ(videoPublishEditModel, vEVideoPublishPreviewActivity.LLF, vEVideoPublishPreviewActivity.LLFF, z);
                vEVideoPublishPreviewActivity.LLILLIZIL();
                vEVideoPublishPreviewActivity.LLILLJJLI();
                return;
        }
    }

    public static final void onClick$14(ACListenerS32S0101000_15 aCListenerS32S0101000_15, View view) {
        TwoStepVerifyEmailFor2046Fragment twoStepVerifyEmailFor2046Fragment = (TwoStepVerifyEmailFor2046Fragment) aCListenerS32S0101000_15.l0;
        Bundle arguments = twoStepVerifyEmailFor2046Fragment.getArguments();
        if (arguments != null) {
            int i = aCListenerS32S0101000_15.i1;
            TwoStepVerifyEmailFor2046Fragment twoStepVerifyEmailFor2046Fragment2 = (TwoStepVerifyEmailFor2046Fragment) aCListenerS32S0101000_15.l0;
            arguments.putInt("next_page", i);
            RBV.LJIIJ(arguments, twoStepVerifyEmailFor2046Fragment2.getEmail());
        } else {
            arguments = new Bundle();
        }
        twoStepVerifyEmailFor2046Fragment.rh(arguments);
    }

    public static final void onClick$15(ACListenerS32S0101000_15 aCListenerS32S0101000_15, View view) {
        TwoStepVerifySmsFor2046Fragment twoStepVerifySmsFor2046Fragment = (TwoStepVerifySmsFor2046Fragment) aCListenerS32S0101000_15.l0;
        Bundle arguments = twoStepVerifySmsFor2046Fragment.getArguments();
        if (arguments != null) {
            arguments.putInt("next_page", aCListenerS32S0101000_15.i1);
        } else {
            arguments = new Bundle();
        }
        twoStepVerifySmsFor2046Fragment.rh(arguments);
    }

    public static final void onClick$16(ACListenerS32S0101000_15 aCListenerS32S0101000_15, View view) {
        TOTPCodeVerifyFragment tOTPCodeVerifyFragment = (TOTPCodeVerifyFragment) aCListenerS32S0101000_15.l0;
        Bundle arguments = tOTPCodeVerifyFragment.getArguments();
        if (arguments != null) {
            arguments.putInt("next_page", aCListenerS32S0101000_15.i1);
        } else {
            arguments = new Bundle();
        }
        tOTPCodeVerifyFragment.rh(arguments);
    }

    public static final void onClick$17(ACListenerS32S0101000_15 aCListenerS32S0101000_15, View view) {
        VerifyPasswordFragment verifyPasswordFragment = (VerifyPasswordFragment) aCListenerS32S0101000_15.l0;
        Bundle arguments = verifyPasswordFragment.getArguments();
        if (arguments != null) {
            arguments.putInt("next_page", aCListenerS32S0101000_15.i1);
        } else {
            arguments = new Bundle();
        }
        verifyPasswordFragment.rh(arguments);
    }

    public static final void onClick$18(ACListenerS32S0101000_15 aCListenerS32S0101000_15, View view) {
        long j;
        switch (aCListenerS32S0101000_15.i1) {
            case 0:
                DrawerFeedLiveFragmentV2 drawerFeedLiveFragmentV2 = (DrawerFeedLiveFragmentV2) aCListenerS32S0101000_15.l0;
                drawerFeedLiveFragmentV2.getClass();
                if (System.currentTimeMillis() - drawerFeedLiveFragmentV2.LJLLJ <= 3000) {
                    return;
                }
                drawerFeedLiveFragmentV2.LJLLJ = System.currentTimeMillis();
                IGameLinkMicService iGameLinkMicService = (IGameLinkMicService) CN1.LIZ(IGameLinkMicService.class);
                drawerFeedLiveFragmentV2.getContext();
                if (iGameLinkMicService.ws(new IDRunnableS6S0101000(1, drawerFeedLiveFragmentV2, 36), "drawer_go_live")) {
                    return;
                }
                drawerFeedLiveFragmentV2.Dl();
                return;
            case 1:
                ((AnonymousClass745) aCListenerS32S0101000_15.l0).N(view, "click_name");
                return;
            case 2:
                KeyboardDialogFragment keyboardDialogFragment = (KeyboardDialogFragment) aCListenerS32S0101000_15.l0;
                C7YC c7yc = keyboardDialogFragment.LLIIZ;
                if (c7yc != null) {
                    if (keyboardDialogFragment.LLILZ) {
                        InterfaceC177046xA interfaceC177046xA = ((C176996x5) c7yc).LJLJJI;
                        if (interfaceC177046xA != null) {
                            interfaceC177046xA.onEmojiToKeyboard("icon");
                        }
                    } else {
                        ((C176996x5) c7yc).LJJIJIIJIL();
                    }
                }
                if (!keyboardDialogFragment.LLILZ) {
                    keyboardDialogFragment.LLILZ = true;
                    if (keyboardDialogFragment.LLILZIL) {
                        keyboardDialogFragment.LLILZIL = false;
                        keyboardDialogFragment.Sl(false);
                        keyboardDialogFragment.Rl(keyboardDialogFragment.LLILZ);
                        return;
                    }
                    keyboardDialogFragment.xl(0);
                    return;
                }
                keyboardDialogFragment.Ll(0);
                keyboardDialogFragment.LLILZ = false;
                keyboardDialogFragment.LLILZIL = false;
                return;
            case 3:
                C85827XmJ c85827XmJ = (C85827XmJ) aCListenerS32S0101000_15.l0;
                if (c85827XmJ.LIZ != null) {
                    EnterRoomConfig.TimeStamp timeStamp = B57.LIZ.LIZ().mEnterRoomConfig.mRoomsData.timeStamps;
                    if (timeStamp != null && timeStamp.enterRoomStarTimeReal > 0) {
                        j = System.currentTimeMillis() - timeStamp.enterRoomStarTimeReal;
                    } else {
                        j = -1;
                    }
                    BZI LIZ = C28787BRn.LIZ("livesdk_toplives_loading_quit");
                    LIZ.LJIJJ(Long.valueOf(j), "duration");
                    LIZ.LJIJJ("click_btn", "quit_type");
                    LIZ.LJJIIJZLJL();
                    ((ILiveFeedApiService) CN1.LIZ(ILiveFeedApiService.class)).nu0().getClass();
                    if (LiveForuTopLivesEnterOptSetting.INSTANCE.cancelFeed()) {
                        BLM.LIZIZ();
                    }
                    BLM.LIZ = false;
                    c85827XmJ.LIZ.finish();
                    return;
                }
                return;
            case 4:
                SmartRouter.buildRoute(((Fragment) aCListenerS32S0101000_15.l0).getContext(), "aweme://inner_push_setting_manager").open();
                C188727au c188727au = new C188727au();
                c188727au.LJIIIZ("enter_from", "notification_settings_page");
                FMX.LJIIL("enter_inner_notification_setting", c188727au.LIZ);
                return;
            default:
                VEVideoPublishPreviewActivity vEVideoPublishPreviewActivity = (VEVideoPublishPreviewActivity) aCListenerS32S0101000_15.l0;
                if (vEVideoPublishPreviewActivity.LJLLI == null) {
                    return;
                }
                QXX qxx = vEVideoPublishPreviewActivity.LJLLLL;
                C161996Xj c161996Xj = C161996Xj.LJLIL;
                if (qxx == c161996Xj) {
                    C6XQ.LIZJ(vEVideoPublishPreviewActivity.LJLL, vEVideoPublishPreviewActivity.LLF, true);
                    vEVideoPublishPreviewActivity.LJLLI.LIZJ();
                    vEVideoPublishPreviewActivity.LJZI.setVisibility(0);
                    vEVideoPublishPreviewActivity.LJLLLL = C85828XmK.LJLIL;
                    return;
                }
                C85828XmK c85828XmK = C85828XmK.LJLIL;
                if (qxx == c85828XmK) {
                    C6XQ.LIZJ(vEVideoPublishPreviewActivity.LJLL, vEVideoPublishPreviewActivity.LLF, true);
                    vEVideoPublishPreviewActivity.LJLLI.LIZLLL();
                    vEVideoPublishPreviewActivity.LJZI.setVisibility(4);
                    vEVideoPublishPreviewActivity.LJLLLL = c161996Xj;
                    return;
                }
                if (qxx != C162006Xk.LJLIL) {
                    return;
                }
                C6XQ.LIZJ(vEVideoPublishPreviewActivity.LJLL, vEVideoPublishPreviewActivity.LLF, false);
                C41531GRr c41531GRr = vEVideoPublishPreviewActivity.LJLLL;
                if (c41531GRr != null) {
                    c41531GRr.setVisibility(0);
                }
                vEVideoPublishPreviewActivity.LJZ.setVisibility(0);
                vEVideoPublishPreviewActivity.LJLZ.setVisibility(0);
                vEVideoPublishPreviewActivity.LLI.setVisibility(0);
                vEVideoPublishPreviewActivity.LLIFFJFJJ.setVisibility(0);
                if (vEVideoPublishPreviewActivity.LJLLLLLL == c85828XmK) {
                    vEVideoPublishPreviewActivity.LJZI.setVisibility(0);
                }
                C41531GRr c41531GRr2 = vEVideoPublishPreviewActivity.LJLLL;
                if (c41531GRr2 != null) {
                    c41531GRr2.LIZIZ();
                }
                vEVideoPublishPreviewActivity.LJLLLL = vEVideoPublishPreviewActivity.LJLLLLLL;
                return;
        }
    }

    public static final void onClick$2(ACListenerS32S0101000_15 aCListenerS32S0101000_15, View view) {
        String str;
        Comment comment;
        int i;
        switch (aCListenerS32S0101000_15.i1) {
            case 0:
                LiveEmojiInputDialogFragment liveEmojiInputDialogFragment = (LiveEmojiInputDialogFragment) aCListenerS32S0101000_15.l0;
                liveEmojiInputDialogFragment.getClass();
                liveEmojiInputDialogFragment.LJLL = EnumC09680Zo.Close;
                liveEmojiInputDialogFragment.Hl();
                InterfaceC31090CIc interfaceC31090CIc = liveEmojiInputDialogFragment.LJLJJLL;
                if (interfaceC31090CIc != null) {
                    DataChannel dataChannel = ((CIU) interfaceC31090CIc).LIZ.dataChannel;
                    if (dataChannel != null) {
                        dataChannel.qv0(PreShowKeyboardEvent.class, Boolean.FALSE);
                    }
                    try {
                        if (liveEmojiInputDialogFragment.LJLJL) {
                            liveEmojiInputDialogFragment.LJLJL = false;
                            try {
                                liveEmojiInputDialogFragment.dismissAllowingStateLoss();
                                return;
                            } catch (Exception e) {
                                C0K2.LIZ("LiveEmojiInputDialogFragment", e);
                                return;
                            }
                        }
                        return;
                    } catch (Exception e2) {
                        C16880lQ.LLLLIIL(e2);
                        C0NB.LIZIZ("error", e2.toString());
                        return;
                    }
                }
                return;
            case 1:
                C85005XXt c85005XXt = (C85005XXt) aCListenerS32S0101000_15.l0;
                C85028XYq c85028XYq = c85005XXt.LJLJJI.LJLIL;
                if (c85028XYq != null) {
                    MusicCollectionItem musicCollectionItem = c85005XXt.LJLJI;
                    c85005XXt.getLayoutPosition();
                    XYV xyv = c85028XYq.LIZ.LJI;
                    if (xyv != null) {
                        xyv.LLLF(musicCollectionItem);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                AnonymousClass745 anonymousClass745 = (AnonymousClass745) aCListenerS32S0101000_15.l0;
                if (anonymousClass745.LLFF == null || anonymousClass745.LLF == null) {
                    return;
                }
                String str2 = "";
                if (view.getId() == R.id.mgy) {
                    if (anonymousClass745.LLFF.getRelationLabel() != null) {
                        str2 = anonymousClass745.LLFF.getRelationLabel().getUserId();
                    }
                    str = anonymousClass745.LLFF.getUser().getSecUid();
                } else if (C79004UzY.LJJIFFI(anonymousClass745.LLFF.getReplyComments()) || (comment = (Comment) ListProtector.get(anonymousClass745.LLFF.getReplyComments(), 0)) == null) {
                    str = "";
                } else {
                    if (comment.getRelationLabel() != null) {
                        str2 = comment.getRelationLabel().getUserId();
                    }
                    str = comment.getUser().getSecUid();
                }
                if (TextUtils.isEmpty(str2)) {
                    return;
                }
                ((CommentListFragment) anonymousClass745.LLF).Gn(str2, str);
                return;
            case 3:
                KeyboardDialogFragment keyboardDialogFragment = (KeyboardDialogFragment) aCListenerS32S0101000_15.l0;
                keyboardDialogFragment.getClass();
                if (C6ZT.LIZ(view)) {
                    return;
                }
                C176996x5 c176996x5 = keyboardDialogFragment.LLJILJIL;
                if (c176996x5.LJZL == null) {
                    return;
                }
                c176996x5.LL = true;
                keyboardDialogFragment.xl(0);
                HashMap hashMap = new HashMap();
                hashMap.put("enter_from", keyboardDialogFragment.LLIZLLLIL);
                hashMap.put("source", "editing_photo");
                if (keyboardDialogFragment.LLILZ) {
                    i = 10003;
                } else if (keyboardDialogFragment.LLILZIL) {
                    i = 10005;
                } else {
                    i = 10002;
                }
                C178176yz.LIZ(keyboardDialogFragment, i, new ArrayList(keyboardDialogFragment.LLJILJIL.LJZL), hashMap);
                C74Z.LJJIIZI(keyboardDialogFragment.LLIZLLLIL, "editing_photo");
                return;
            default:
                LongPressLayout longPressLayout = (LongPressLayout) aCListenerS32S0101000_15.l0;
                if (!longPressLayout.LJLLLLLL || longPressLayout.LJLJLJ == null || longPressLayout.LIZ()) {
                    return;
                }
                float x = view.getX() + (view.getWidth() / 2.0f);
                float y = view.getY() + (view.getHeight() / 2.0f);
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, x, y, 0);
                longPressLayout.LJLJLJ.onTouch(view, obtain);
                obtain.recycle();
                MotionEvent obtain2 = MotionEvent.obtain(uptimeMillis, SystemClock.uptimeMillis(), 1, x, y, 0);
                longPressLayout.LJLJLJ.onTouch(view, obtain2);
                obtain2.recycle();
                return;
        }
    }

    public static final void onClick$3(ACListenerS32S0101000_15 aCListenerS32S0101000_15, View view) {
        Comment comment;
        switch (aCListenerS32S0101000_15.i1) {
            case 0:
                ((LiveEmojiInputDialogFragment) aCListenerS32S0101000_15.l0).Nl(2);
                return;
            case 1:
                AnonymousClass745 anonymousClass745 = (AnonymousClass745) aCListenerS32S0101000_15.l0;
                if (anonymousClass745.LLF != null && (comment = anonymousClass745.LLFF) != null) {
                    C174456sz c174456sz = (C174456sz) ((HashMap) C174446sy.LIZ).get(comment.getFakeId());
                    if (c174456sz != null && c174456sz.LIZ == 2) {
                        ((CommentListFragment) anonymousClass745.LLF).Jn(anonymousClass745.LLFF);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                KeyboardDialogFragment keyboardDialogFragment = (KeyboardDialogFragment) aCListenerS32S0101000_15.l0;
                if (keyboardDialogFragment.LLJILJILJ != CommentVideoModel.Type.NONE) {
                    keyboardDialogFragment.xl(0);
                }
                ((C176996x5) keyboardDialogFragment.LLIIZ).LJJIZ(keyboardDialogFragment.LLJILJILJ);
                return;
            case 3:
                Context context = (Context) aCListenerS32S0101000_15.l0;
                STD.LJI("click");
                ProfileAIGCServiceImpl.LJFF().LIZJ(context, APM.MY_PROFILE_ADD_AVATAR_SHEET, APN.PERSONAL_HOMEPAGE, APK.CLICK_EMPTY_AVATAR, null, null);
                return;
            case 4:
                PushSettingManagerFragment pushSettingManagerFragment = (PushSettingManagerFragment) aCListenerS32S0101000_15.l0;
                if (pushSettingManagerFragment.getContext() == null) {
                    return;
                }
                if (pushSettingManagerFragment.LLIIJI == null) {
                    DialogC81627W1v dialogC81627W1v = new DialogC81627W1v(pushSettingManagerFragment.getContext());
                    pushSettingManagerFragment.LLIIJI = dialogC81627W1v;
                    dialogC81627W1v.LJLIL = new C85825XmH(pushSettingManagerFragment);
                }
                if (!(true ^ TextUtils.isEmpty(((RBX) HG3.LJIILL()).getCurUser().getEmail()))) {
                    DialogC81627W1v dialogC81627W1v2 = pushSettingManagerFragment.LLIIJI;
                    if (!new C03880Dg(2).LIZJ(300000, "com/ss/android/ugc/aweme/setting/ui/dialog/EmailBindDialog", "show", dialogC81627W1v2, new Object[0], "void", new C65300Pk0(false, "()V", "6291168451893687222")).LIZ) {
                        dialogC81627W1v2.show();
                    }
                    C188727au c188727au = new C188727au();
                    c188727au.LJIIIZ("page_name", "notification_setting_page");
                    c188727au.LJIIIZ("exp_name", "email_notification_phase2");
                    FMX.LJIIL("show_email_bind_popup_page", c188727au.LIZ);
                    return;
                }
                if (pushSettingManagerFragment.getContext() != null) {
                    SmartRoute buildRoute = SmartRouter.buildRoute(pushSettingManagerFragment.getContext(), "aweme://webview");
                    buildRoute.withParam(UriProtector.parse(C78997UzR.LIZ()));
                    buildRoute.open();
                }
                C188727au c188727au2 = new C188727au();
                c188727au2.LJIIIZ("page_name", "notification_setting_page");
                c188727au2.LJIIIZ("previous_page", "notification_setting_page");
                c188727au2.LJIIIZ("exp_name", "email_notification_phase2");
                FMX.LJIIL("enter_email_notification_setting", c188727au2.LIZ);
                return;
            case 5:
                VEVideoPublishPreviewActivity vEVideoPublishPreviewActivity = (VEVideoPublishPreviewActivity) aCListenerS32S0101000_15.l0;
                C41531GRr c41531GRr = vEVideoPublishPreviewActivity.LJLLL;
                if (c41531GRr != null) {
                    c41531GRr.setVisibility(4);
                }
                vEVideoPublishPreviewActivity.LJZ.setVisibility(4);
                vEVideoPublishPreviewActivity.LJLZ.setVisibility(4);
                vEVideoPublishPreviewActivity.LJZI.setVisibility(4);
                vEVideoPublishPreviewActivity.LLI.setVisibility(4);
                vEVideoPublishPreviewActivity.LLIFFJFJJ.setVisibility(4);
                VideoPublishEditModel mModel = vEVideoPublishPreviewActivity.LJLL;
                String str = vEVideoPublishPreviewActivity.LLF;
                o.LJIIIZ(mModel, "mModel");
                FMX.LJIIL("click_delete_virtual_feed_button", C6XQ.LIZ(mModel, str, true).LIZ);
                vEVideoPublishPreviewActivity.LJLLLLLL = vEVideoPublishPreviewActivity.LJLLLL;
                vEVideoPublishPreviewActivity.LJLLLL = C162006Xk.LJLIL;
                return;
            default:
                VideoPublishContainerScene videoPublishContainerScene = (VideoPublishContainerScene) aCListenerS32S0101000_15.l0;
                ExpandedTitleModule expandedTitleModule = videoPublishContainerScene.LLJJIJIL.LJIIIZ;
                if (expandedTitleModule != null) {
                    expandedTitleModule.LIZLLL();
                }
                ExpandedTitleModule expandedTitleModule2 = videoPublishContainerScene.LLJJIJIL.LJIIIZ;
                if (expandedTitleModule2 != null) {
                    expandedTitleModule2.LJLJJLL.clearFocus();
                    expandedTitleModule2.LJLJJLL.setScrollY(0);
                }
                ExpandedTitleModule expandedTitleModule3 = videoPublishContainerScene.LLJJIJIL.LJIIIZ;
                if (expandedTitleModule3 == null) {
                    return;
                }
                expandedTitleModule3.LLIZ = 0;
                return;
        }
    }

    public static final void onClick$5(ACListenerS32S0101000_15 aCListenerS32S0101000_15, View view) {
        switch (aCListenerS32S0101000_15.i1) {
            case 0:
                ChooseMusicActivity chooseMusicActivity = (ChooseMusicActivity) aCListenerS32S0101000_15.l0;
                KeyboardUtils.LIZIZ(chooseMusicActivity.LJLJJI);
                XU0.LIZLLL(chooseMusicActivity.LJLJLJ, chooseMusicActivity);
                XVF.LJIILJJIL(EnumC61629OGr.TAB_TYPE_LOCAL, false);
                return;
            case 1:
                ((XXF) aCListenerS32S0101000_15.l0).onClick(view);
                return;
            case 2:
                StickerPropDetailFragment stickerPropDetailFragment = (StickerPropDetailFragment) aCListenerS32S0101000_15.l0;
                stickerPropDetailFragment.getClass();
                stickerPropDetailFragment.Jl();
                stickerPropDetailFragment.LLIIJLIL.LIZIZ();
                return;
            default:
                ((SettingNewVersionFragment) aCListenerS32S0101000_15.l0).lambda$initUnits$35(view);
                return;
        }
    }

    public static final void onClick$6(ACListenerS32S0101000_15 aCListenerS32S0101000_15, View view) {
        ((C85516XhI) aCListenerS32S0101000_15.l0).LJLIL.onItemClick(aCListenerS32S0101000_15.i1);
    }

    public static final void onClick$7(ACListenerS32S0101000_15 aCListenerS32S0101000_15, View view) {
        ((C85511XhD) aCListenerS32S0101000_15.l0).LJLILLLLZI.LJJIJIL(aCListenerS32S0101000_15.i1);
    }

    public static final void onClick$8(ACListenerS32S0101000_15 aCListenerS32S0101000_15, View view) {
        String str;
        String[] strArr;
        String str2;
        switch (aCListenerS32S0101000_15.i1) {
            case 0:
                CommentInputFragment commentInputFragment = (CommentInputFragment) aCListenerS32S0101000_15.l0;
                commentInputFragment.getClass();
                if (C6ZT.LIZIZ(view, 500L)) {
                    return;
                }
                C176996x5 c176996x5 = commentInputFragment.LLD;
                Aweme aweme = commentInputFragment.getAweme();
                if (aweme != null) {
                    str = aweme.getAid();
                } else {
                    str = "";
                }
                if (c176996x5.LJJLIIIJJI(str, commentInputFragment.LLFII, "click_comment_photo")) {
                    return;
                }
                C71Y.LIZ("PhotoComment", "photo select clicked, fragment = ${this}");
                C176996x5 c176996x52 = commentInputFragment.LLD;
                boolean z = true;
                c176996x52.LL = true;
                if (c176996x52.LJZL == null) {
                    z = false;
                }
                C77321UWf.LJIIL(commentInputFragment, z, 10002, new AObjectS53S0101000_8(0, commentInputFragment, 1));
                C74Z.LJIIZILJ(commentInputFragment.LLFII);
                return;
            case 1:
                HeaderDetailActivity headerDetailActivity = (HeaderDetailActivity) aCListenerS32S0101000_15.l0;
                headerDetailActivity.LJLJL.setVisibility(0);
                headerDetailActivity.LJLJLJ.setVisibility(0);
                headerDetailActivity.LJLJJLL.setVisibility(8);
                headerDetailActivity.showLoadAnim(headerDetailActivity.LJLJL);
                if (Build.VERSION.SDK_INT < 33) {
                    strArr = new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"};
                    str2 = "bpea-profile_header_image_download";
                } else {
                    strArr = new String[]{"android.permission.READ_MEDIA_IMAGES"};
                    str2 = "bpea-profile_header_image_download_target_33";
                }
                C61099NyR.LIZIZ.LIZIZ(headerDetailActivity, TokenCert.with(str2)).LIZ(strArr).LIZJ(new C82351WTr(headerDetailActivity, str2));
                return;
            case 2:
                BaseDiscoverAndSearchFragmentNew.wl((BaseDiscoverAndSearchFragmentNew) aCListenerS32S0101000_15.l0);
                return;
            case 3:
                SettingNewVersionFragment.lambda$initUnits$106((Context) aCListenerS32S0101000_15.l0, view);
                return;
            default:
                ((SettingNewVersionFragment) aCListenerS32S0101000_15.l0).lambda$initUnits$94(view);
                return;
        }
    }

    public static final void onClick$9(ACListenerS32S0101000_15 aCListenerS32S0101000_15, View view) {
        switch (aCListenerS32S0101000_15.i1) {
            case 0:
                CommentListFragment commentListFragment = (CommentListFragment) aCListenerS32S0101000_15.l0;
                commentListFragment.getClass();
                if (C6ZT.LIZIZ(view, 500L) || commentListFragment.LLIZ.LJJLIIIJJI(commentListFragment.Am(), commentListFragment.LJLILLLLZI.getEnterFrom(), "click_comment_photo")) {
                    return;
                }
                C71Y.LIZ("PhotoComment", "photo select clicked, fragment = ${this}");
                commentListFragment.LLIZ.LL = true;
                C77321UWf.LJIIL(commentListFragment, commentListFragment.LLLLLLLLL, 10002, new AObjectS52S0101000_7(0, commentListFragment, 23));
                C74Z.LJIIZILJ(commentListFragment.LJLILLLLZI.getEnterFrom());
                return;
            case 1:
                Activity activity = (Activity) aCListenerS32S0101000_15.l0;
                activity.getClass();
                PasskeyService.LJFF().LIZIZ(activity);
                EnterSetPasskeyEvent enterSetPasskeyEvent = new EnterSetPasskeyEvent();
                enterSetPasskeyEvent.LIZLLL("account_page", "enter_from");
                enterSetPasskeyEvent.LIZLLL("click", "enter_method");
                enterSetPasskeyEvent.LJFF();
                return;
            default:
                PushSettingActivity pushSettingActivity = (PushSettingActivity) aCListenerS32S0101000_15.l0;
                ((C38337F2v) pushSettingActivity.LJLIL.LIZ()).LIZ(3, ((C25848ACm) pushSettingActivity.LJLJJLL.LJLIL).LJZI);
                return;
        }
    }

    public ACListenerS32S0101000_15(int i, Object obj, int i2) {
        this.$t = i2;
        this.i1 = i;
        this.l0 = obj;
    }
}
