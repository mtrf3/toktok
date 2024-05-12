package Y;

import X.AbstractC32678Cs6;
import X.AbstractC32698CsQ;
import X.AbstractC66965QPx;
import X.ActivityC45651qj;
import X.AnonymousClass172;
import X.AnonymousClass745;
import X.B3P;
import X.B4J;
import X.B57;
import X.B5G;
import X.B83;
import X.B9U;
import X.BBP;
import X.BCN;
import X.BFA;
import X.BFC;
import X.BFG;
import X.BJA;
import X.BJB;
import X.BLG;
import X.BOX;
import X.BVA;
import X.BZI;
import X.C03880Dg;
import X.C05170If;
import X.C06490Nh;
import X.C08660Vq;
import X.C08680Vs;
import X.C08700Vu;
import X.C0H1;
import X.C0N3;
import X.C10K;
import X.C12830et;
import X.C147105py;
import X.C15380j0;
import X.C1545664u;
import X.C16880lQ;
import X.C188727au;
import X.C26045AKb;
import X.C279117r;
import X.C28238B6k;
import X.C28395BCl;
import X.C28439BEd;
import X.C28451BEp;
import X.C28452BEq;
import X.C28594BKc;
import X.C28648BMe;
import X.C28668BMy;
import X.C28727BPf;
import X.C28731BPj;
import X.C28787BRn;
import X.C28949BXt;
import X.C28965BYj;
import X.C29306Beo;
import X.C29338BfK;
import X.C29374Bfu;
import X.C29494Bhq;
import X.C29666Bkc;
import X.C29929Bor;
import X.C29930Bos;
import X.C2NU;
import X.C30868C9o;
import X.C30869C9p;
import X.C30896CAq;
import X.C31079CHr;
import X.C31137CJx;
import X.C31268COy;
import X.C32044Chs;
import X.C32151Nz;
import X.C32537Cpp;
import X.C32680Cs8;
import X.C36291EMd;
import X.C36922EeM;
import X.C38354F3m;
import X.C39579Fg7;
import X.C40322Fs6;
import X.C62011OVj;
import X.C65300Pk0;
import X.C67P;
import X.C68M;
import X.C68W;
import X.C6IQ;
import X.C6IR;
import X.C73943T0h;
import X.C73969T1h;
import X.C75832TpU;
import X.C77437UaH;
import X.C78127UlP;
import X.C82141WLp;
import X.C85962XoU;
import X.CN1;
import X.CP0;
import X.CQQ;
import X.DialogC77438UaI;
import X.EnumC09680Zo;
import X.EnumC28203B5b;
import X.EnumC75636TmK;
import X.EnumC76319TxL;
import X.FCD;
import X.FMX;
import X.InterfaceC139695e1;
import X.InterfaceC1546465c;
import X.InterfaceC28441BEf;
import X.InterfaceC28728BPg;
import X.InterfaceC28729BPh;
import X.InterfaceC29345BfR;
import X.InterfaceC30027BqR;
import X.InterfaceC32725Csr;
import X.JBR;
import X.KMR;
import X.ORZ;
import X.OSJ;
import X.T16;
import X.T2R;
import X.UPJ;
import X.ViewOnTouchListenerC82139WLn;
import X.X1D;
import X.XWR;
import X.XX7;
import X.XXF;
import X.XXG;
import X.XYM;
import X.Y90;
import android.animation.AnimatorSet;
import android.app.WallpaperManager;
import android.content.ContentResolver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.multihost.biz.quickpairing.RandomLinkMicManager;
import com.bytedance.android.live.livepullstream.api.IPullStreamService;
import com.bytedance.android.live.microom.IMicRoomService;
import com.bytedance.android.live.moderator.IModeratorService;
import com.bytedance.android.live.share.IShareService;
import com.bytedance.android.live.toolbar.HideShareLeadEvent;
import com.bytedance.android.live.usermanage.IUserManageService;
import com.bytedance.android.livesdk.api.revenue.starcomment.IStarCommentService;
import com.bytedance.android.livesdk.browser.fragment.HybridDialogFragment;
import com.bytedance.android.livesdk.browser.fragment.TTLiveBrowserFragment;
import com.bytedance.android.livesdk.chatroom.end.newaudienceend.LiveNewAudienceEndFragment;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.chatroom.ui.LiveEmojiInputDialogFragment;
import com.bytedance.android.livesdk.chatroom.viewmodule.CommentWidget;
import com.bytedance.android.livesdk.dataChannel.BroadcastDialogPageChannel;
import com.bytedance.android.livesdk.dataChannel.LinkBattleGuideEvent;
import com.bytedance.android.livesdk.dataChannel.OpenCoHostEvent;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.event.UserProfileEvent;
import com.bytedance.android.livesdk.feed.drawerfeed.viewholder.DrawerSmallLiveViewHolder;
import com.bytedance.android.livesdk.feed.viewmodel.TabFeedViewModel;
import com.bytedance.android.livesdk.impl.revenue.starcomment.paymentdialog.StarCommentPaymentDialog;
import com.bytedance.android.livesdk.live.model.LiveFeedDraw;
import com.bytedance.android.livesdk.livesetting.decoration.DonationH5UrlSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.android.livesdk.livesetting.model.DrawerLoadOpt;
import com.bytedance.android.livesdk.livesetting.pullstream.EnableEnterRoomOptReuseRoomPlayerSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveDrawerLoadOptSetting;
import com.bytedance.android.livesdk.lynx.ui.AbsHybridFragment;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.android.livesdk.model.ItemTab;
import com.bytedance.android.livesdk.model.OfficialChannelInfo;
import com.bytedance.android.livesdk.model.message.Question;
import com.bytedance.android.livesdk.moderator.ModeratorPermissionEditFragmentSheet;
import com.bytedance.android.livesdk.userinfowidget.LiveRoomUserInfoWidget;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.android.livesdkapi.host.IHostWatch;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.android.livesdkapi.session.EnterRoomLinkSession;
import com.bytedance.android.livesdkapi.session.Event;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.OnActivityResultCallback;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.account.login.ui.MusCountryListActivity;
import com.ss.android.ugc.aweme.account.reactive.ReactiveAccountActivity;
import com.ss.android.ugc.aweme.account.reactive.ReactiveAccountApi;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.choosemusic.activity.ChooseMusicActivity;
import com.ss.android.ugc.aweme.comment.keyboard.ui.KeyboardDialogFragment;
import com.ss.android.ugc.aweme.editSticker.text.font.TextFontStyleData;
import com.ss.android.ugc.aweme.feed.model.GreenScreenMaterial;
import com.ss.android.ugc.aweme.feed.model.trendingtopic.VideoTrendingTopic;
import com.ss.android.ugc.aweme.livewallpaper.AmeLiveWallpaper;
import com.ss.android.ugc.aweme.livewallpaper.model.LiveWallPaperBean;
import com.ss.android.ugc.aweme.livewallpaper.ui.LiveWallPaperPreviewActivity;
import com.ss.android.ugc.aweme.prop.fragment.StickerPropDetailFragment;
import com.ss.android.ugc.aweme.relation.ffp.FindFriendsPageArg;
import com.ss.android.ugc.aweme.setting.serverpush.ui.PushSettingManagerFragmentSecondVersion;
import com.ss.android.ugc.aweme.setting.ui.SettingNewVersionFragment;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishContainerScene;
import com.ss.android.ugc.aweme.sticker.model.NewFaceStickerBean;
import com.ss.android.ugc.cut_ui_impl.process.NLECutCompressActivity;
import com.zhiliaoapp.musically.R;
import defpackage.g0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;
import tikcast.api.anchor.HostInfo;

/* loaded from: classes6.dex */
public class ACListenerS24S0101000_5 implements View.OnClickListener {
    public final int $t;
    public int i1;
    public Object l0;

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
            case 19:
                onClick$19(this, view);
                return;
            default:
                return;
        }
    }

    public static final void onClick$0(ACListenerS24S0101000_5 aCListenerS24S0101000_5, View view) {
        FragmentManager fragmentManager;
        String str;
        switch (aCListenerS24S0101000_5.i1) {
            case 0:
                LiveEmojiInputDialogFragment liveEmojiInputDialogFragment = (LiveEmojiInputDialogFragment) aCListenerS24S0101000_5.l0;
                liveEmojiInputDialogFragment.getClass();
                StarCommentPaymentDialog sb = ((IStarCommentService) CN1.LIZ(IStarCommentService.class)).sb();
                DataChannel dataChannel = liveEmojiInputDialogFragment.LJLJJI;
                if (dataChannel == null) {
                    fragmentManager = null;
                } else {
                    fragmentManager = (FragmentManager) dataChannel.kv0(C29494Bhq.class);
                }
                if (sb != null && fragmentManager != null) {
                    sb.showNow(fragmentManager, null);
                }
                liveEmojiInputDialogFragment.vl();
                C31079CHr.LIZLLL(liveEmojiInputDialogFragment.LJLJJI, "keyboard");
                return;
            case 1:
                LiveWidget liveWidget = (LiveWidget) aCListenerS24S0101000_5.l0;
                C0H1.LIZ("pull_type", "button").putLong("room_id", ((Long) liveWidget.dataChannel.kv0(BCN.class)).longValue());
                C08680Vs c08680Vs = C08680Vs.LJIILJJIL;
                c08680Vs.LIZLLL = "button";
                B4J.LJ(g0.LJIILJJIL(liveWidget.getContext()), true);
                BZI LIZ = C28787BRn.LIZ("livesdk_explore_click");
                LIZ.LJIILLIIL(liveWidget.dataChannel);
                LIZ.LJIIIIZZ();
                LIZ.LJIJJ("click", "ops_type");
                LIZ.LJIJJ(Integer.valueOf(c08680Vs.LJFF()), C08680Vs.LJIIZILJ);
                LIZ.LJIJJ(C08660Vq.LIZ(), C08680Vs.LJIJ);
                LIZ.LJIJJ(c08680Vs.LIZIZ(), "entrance_type");
                LIZ.LJJIIJZLJL();
                c08680Vs.LJ = C08680Vs.LJIILL;
                if (!BJB.LJ) {
                    BJB.LIZIZ().put("action_type", "click");
                }
                BJB.LJFF((Room) liveWidget.dataChannel.kv0(RoomChannel.class));
                DrawerLoadOpt value = LiveDrawerLoadOptSetting.INSTANCE.getValue();
                if (value != null) {
                    if (value.isPreLoadingGameUI || value.isPreLoadingForuUI) {
                        C73943T0h.LIZ().LIZIZ(new C28731BPj());
                        return;
                    }
                    return;
                }
                return;
            case 2:
                ((C28648BMe) aCListenerS24S0101000_5.l0).LJLIL.gv0();
                return;
            case 3:
                ((XX7) aCListenerS24S0101000_5.l0).LJLJI.onInternalEvent(new XYM("allow_access_button_click"));
                return;
            case 4:
                AnonymousClass745.Y((AnonymousClass745) aCListenerS24S0101000_5.l0, view);
                return;
            case 5:
                Fragment fragment = (Fragment) aCListenerS24S0101000_5.l0;
                fragment.getClass();
                try {
                    C40322Fs6.LJ(fragment.getContext());
                } catch (Exception unused) {
                    C16880lQ.LIZJ(fragment.getContext(), new Intent("android.settings.SETTINGS"));
                }
                C188727au c188727au = new C188727au();
                if (C40322Fs6.LIZJ(fragment.getContext())) {
                    str = "on";
                } else {
                    str = "off";
                }
                c188727au.LJIIIZ("status", str);
                FMX.LJIIL("notifications_click", c188727au.LIZ);
                return;
            default:
                ((SettingNewVersionFragment) aCListenerS24S0101000_5.l0).lambda$initUnits$7(view);
                return;
        }
    }

    public static final void onClick$1(ACListenerS24S0101000_5 aCListenerS24S0101000_5, View view) {
        switch (aCListenerS24S0101000_5.i1) {
            case 0:
                LiveEmojiInputDialogFragment liveEmojiInputDialogFragment = (LiveEmojiInputDialogFragment) ((Fragment) aCListenerS24S0101000_5.l0);
                liveEmojiInputDialogFragment.getClass();
                int id = view.getId();
                if (id == R.id.ags) {
                    if (liveEmojiInputDialogFragment.LJLLLL) {
                        return;
                    }
                    if (liveEmojiInputDialogFragment.LJLLJ) {
                        liveEmojiInputDialogFragment.LJLLJ = false;
                        Y90 y90 = liveEmojiInputDialogFragment.LLIIL;
                        if (y90 != null) {
                            y90.LIZ();
                        }
                    } else {
                        liveEmojiInputDialogFragment.LJLLJ = true;
                        Y90 y902 = liveEmojiInputDialogFragment.LLIIL;
                        if (y902 != null) {
                            y902.LIZIZ(true);
                        }
                    }
                    liveEmojiInputDialogFragment.Ol();
                    return;
                }
                if (id == R.id.hbm) {
                    EnumC09680Zo enumC09680Zo = liveEmojiInputDialogFragment.LJLL;
                    if (enumC09680Zo == EnumC09680Zo.Keyboard) {
                        LinearLayout linearLayout = liveEmojiInputDialogFragment.LLIIIL;
                        if (linearLayout != null) {
                            linearLayout.setVisibility(8);
                        }
                        liveEmojiInputDialogFragment.Ql();
                        liveEmojiInputDialogFragment.LLFFF.setIconAttr(R.attr.arm);
                        return;
                    }
                    if (enumC09680Zo != EnumC09680Zo.Panel) {
                        return;
                    }
                    LinearLayout linearLayout2 = liveEmojiInputDialogFragment.LLIIIL;
                    if (linearLayout2 != null) {
                        linearLayout2.setVisibility(0);
                    }
                    if (liveEmojiInputDialogFragment.LLIIZ.getCurrentItem() == 0) {
                        liveEmojiInputDialogFragment.wl();
                        liveEmojiInputDialogFragment.Sl();
                        liveEmojiInputDialogFragment.LLFFF.setIconAttr(R.attr.arl);
                        return;
                    }
                    liveEmojiInputDialogFragment.Ql();
                    return;
                }
                if (id != R.id.hbn) {
                    return;
                }
                EnumC09680Zo enumC09680Zo2 = liveEmojiInputDialogFragment.LJLL;
                if (enumC09680Zo2 == EnumC09680Zo.Keyboard) {
                    liveEmojiInputDialogFragment.Rl();
                    liveEmojiInputDialogFragment.LLFII.setIconAttr(R.attr.arm);
                    return;
                } else {
                    if (enumC09680Zo2 != EnumC09680Zo.Panel) {
                        return;
                    }
                    if (liveEmojiInputDialogFragment.LLIIZ.getCurrentItem() == 0) {
                        liveEmojiInputDialogFragment.Rl();
                        return;
                    } else {
                        if (liveEmojiInputDialogFragment.LLIIZ.getCurrentItem() != 1) {
                            return;
                        }
                        liveEmojiInputDialogFragment.wl();
                        liveEmojiInputDialogFragment.Sl();
                        liveEmojiInputDialogFragment.LLFII.setIcon(R.drawable.cvn);
                        return;
                    }
                }
            case 1:
                KeyboardDialogFragment keyboardDialogFragment = (KeyboardDialogFragment) ((Fragment) aCListenerS24S0101000_5.l0);
                if (keyboardDialogFragment.LLIIZ != null) {
                    keyboardDialogFragment.LLJI = true;
                    if (!keyboardDialogFragment.Il()) {
                        int selectionStart = keyboardDialogFragment.LJLJL.getSelectionStart();
                        Editable text = keyboardDialogFragment.LJLJL.getText();
                        if (keyboardDialogFragment.Ml()) {
                            C26045AKb c26045AKb = new C26045AKb(keyboardDialogFragment);
                            c26045AKb.LJIIIIZZ(R.string.i1y);
                            c26045AKb.LJIIJ();
                            return;
                        } else {
                            if (text == null) {
                                return;
                            }
                            text.insert(selectionStart, "@");
                            return;
                        }
                    }
                    keyboardDialogFragment.LLJIJIL = true;
                    keyboardDialogFragment.Ll(0);
                    keyboardDialogFragment.LLILZ = false;
                    keyboardDialogFragment.LLILZIL = false;
                    return;
                }
                return;
            case 2:
                Fragment fragment = (Fragment) aCListenerS24S0101000_5.l0;
                Context context = fragment.getContext();
                if (C40322Fs6.LIZJ(context)) {
                    SmartRoute buildRoute = SmartRouter.buildRoute(fragment.getContext(), "aweme://push_setting_notification_choice");
                    buildRoute.withParam("enter_from", "settings_page");
                    buildRoute.open();
                    C188727au c188727au = new C188727au();
                    c188727au.LJIIIZ("label", "live_push");
                    FMX.LJIIL("enter_push_setting_detail", c188727au.LIZ);
                    return;
                }
                C85962XoU.LJII(context, true, null, true);
                return;
            default:
                ((SettingNewVersionFragment) ((Fragment) aCListenerS24S0101000_5.l0)).lambda$initUnits$45(view);
                return;
        }
    }

    public static final void onClick$10(ACListenerS24S0101000_5 aCListenerS24S0101000_5, View view) {
        String str;
        switch (aCListenerS24S0101000_5.i1) {
            case 0:
                C29666Bkc c29666Bkc = (C29666Bkc) aCListenerS24S0101000_5.l0;
                c29666Bkc.getClass();
                String value = DonationH5UrlSetting.INSTANCE.getValue();
                DataChannel dataChannel = c29666Bkc.LLIIIJ;
                if (dataChannel == null) {
                    return;
                }
                Room room = (Room) dataChannel.kv0(RoomChannel.class);
                if (value.length() <= 0 || room == null) {
                    return;
                }
                if (c29666Bkc.LLIIIL == null) {
                    str = "";
                } else {
                    StringBuilder LIZ = X1D.LIZ();
                    str = C0H1.LIZJ(LIZ, c29666Bkc.LLIIIL.id, "", LIZ);
                }
                Uri.Builder buildUpon = UriProtector.parse(value).buildUpon();
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(room.getOwnerUserId());
                LIZ2.append("");
                Uri.Builder appendQueryParameter = buildUpon.appendQueryParameter("anchor_id", X1D.LIZIZ(LIZ2));
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append(room.getId());
                LIZ3.append("");
                String uri = appendQueryParameter.appendQueryParameter("room_id", X1D.LIZIZ(LIZ3)).appendQueryParameter("campaignId", str).build().toString();
                Context context = c29666Bkc.getContext();
                if (!(context instanceof ActivityC45651qj)) {
                    return;
                }
                C28949BXt.LIZJ((ActivityC45651qj) context, uri, null, null, false, false);
                return;
            case 1:
                ReactiveAccountActivity reactiveAccountActivity = (ReactiveAccountActivity) aCListenerS24S0101000_5.l0;
                if (reactiveAccountActivity.LJLJLLL.getCurUser().isUserInactive()) {
                    StringBuilder LIZ4 = X1D.LIZ();
                    String LJFF = JBR.LJFF(LIZ4, Api.LIZ, "/passport/deactivation/do/", LIZ4);
                    ReactiveAccountApi.LIZ.getClass();
                    C36291EMd.LIZIZ.reactiveDeactivationAccount(AbstractC66965QPx.LIZLLL(LJFF)).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS39S0101000_13(2, reactiveAccountActivity, 2), new AfS36S0101000_5(2, reactiveAccountActivity, 46));
                } else {
                    ReactiveAccountApi.LIZ.getClass();
                    C36291EMd.LIZIZ.reactiveDeletedAccount(0).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS36S0101000_5(4, reactiveAccountActivity, 47), new AfS36S0101000_5(2, reactiveAccountActivity, 20));
                }
                C188727au c188727au = new C188727au();
                c188727au.LJIIIZ("action", "reactivate");
                FMX.LJIIL("respond_reactivate_account", c188727au.LIZ);
                return;
            case 2:
                ((LiveWallPaperPreviewActivity) aCListenerS24S0101000_5.l0).exit(view);
                return;
            default:
                SmartRouter.buildRoute(((Fragment) aCListenerS24S0101000_5.l0).getContext(), "aweme://inner_push_setting_manager").open();
                C188727au c188727au2 = new C188727au();
                c188727au2.LJIIIZ("enter_from", "notification_settings_page");
                FMX.LJIIL("enter_inner_notification_setting", c188727au2.LIZ);
                return;
        }
    }

    public static final void onClick$11(ACListenerS24S0101000_5 aCListenerS24S0101000_5, View view) {
        boolean z;
        long j;
        String str;
        switch (aCListenerS24S0101000_5.i1) {
            case 0:
                BFA bfa = (BFA) aCListenerS24S0101000_5.l0;
                bfa.getClass();
                try {
                    z = C2NU.LIZ.LIZIZ();
                } catch (Exception unused) {
                    z = false;
                }
                if (!z) {
                    C30868C9o.LIZLLL(R.string.n0o, bfa.LJLJLJ);
                } else {
                    BFC bfc = bfa.LJLJLLL;
                    bfa.LJLJJL.setVisibility(0);
                    bfa.LJLILLLLZI.setVisibility(8);
                    ((IUserManageService) CN1.LIZ(IUserManageService.class)).HR(bfa, !bfc.LJI, bfc, bfa.LJLL, bfa.LJLLI, bfa.LJLLJ);
                    BZI LIZ = C28787BRn.LIZ("livesdk_anchor_admin_cancel_toast_click");
                    LIZ.LJIIZILJ();
                    LIZ.LJIJJ(Long.valueOf(bfa.LJLJLLL.LIZ), "user_id");
                    LIZ.LJIJJ("yes", "action_type");
                    LIZ.LJJIIJZLJL();
                    BZI LIZ2 = C28787BRn.LIZ("livesdk_anchor_admin_cancel_toast_show");
                    LIZ2.LJIIZILJ();
                    C30869C9p.LIZ(bfa.LJLJLLL.LIZ, LIZ2, "user_id");
                }
                BZI LIZ3 = C28787BRn.LIZ("livesdk_anchor_admin_cancel_click");
                LIZ3.LJIIZILJ();
                BFC bfc2 = bfa.LJLJLLL;
                long j2 = 0;
                if (bfc2 == null) {
                    j = 0;
                } else {
                    j = bfc2.LIZ;
                }
                LIZ3.LJIJJ(Long.valueOf(j), "user_id");
                BFC bfc3 = bfa.LJLJLLL;
                if (bfc3 != null) {
                    j2 = bfc3.LIZ;
                }
                LIZ3.LJIJJ(Long.valueOf(j2), "to_user_id");
                LIZ3.LJIJJ("remove_button", "click_position");
                LIZ3.LJIJJ(Integer.valueOf(bfa.L()), "moderator_number");
                if (C29306Beo.LJJI()) {
                    str = "live_take_page";
                } else {
                    str = "live_take_detail";
                }
                LIZ3.LJIJJ(str, "event_page");
                LIZ3.LJJIIJZLJL();
                return;
            case 1:
                ChooseMusicActivity chooseMusicActivity = (ChooseMusicActivity) aCListenerS24S0101000_5.l0;
                chooseMusicActivity.LLIIIILZ();
                chooseMusicActivity.finish();
                return;
            case 2:
                ((XXG) aCListenerS24S0101000_5.l0).onClick(view);
                return;
            default:
                StickerPropDetailFragment stickerPropDetailFragment = (StickerPropDetailFragment) aCListenerS24S0101000_5.l0;
                stickerPropDetailFragment.getClass();
                if (view.getAlpha() < 1.0E-6d) {
                    return;
                }
                stickerPropDetailFragment.Gl("click_bar");
                return;
        }
    }

    public static final void onClick$12(ACListenerS24S0101000_5 aCListenerS24S0101000_5, View view) {
        User user;
        switch (aCListenerS24S0101000_5.i1) {
            case 0:
                BVA bva = (BVA) aCListenerS24S0101000_5.l0;
                Question question = bva.LJLIL;
                if (question != null && (user = question.user) != null) {
                    bva.T(user, "name");
                    return;
                }
                return;
            case 1:
                ((XWR) aCListenerS24S0101000_5.l0).LIZLLL();
                return;
            default:
                ((SettingNewVersionFragment) aCListenerS24S0101000_5.l0).lambda$initUnits$21(view);
                return;
        }
    }

    public static final void onClick$13(ACListenerS24S0101000_5 aCListenerS24S0101000_5, View view) {
        if (((LinkPlayerInfo) aCListenerS24S0101000_5.l0).mUser == null) {
            return;
        }
        C73943T0h LIZ = C73943T0h.LIZ();
        UserProfileEvent userProfileEvent = new UserProfileEvent(((LinkPlayerInfo) aCListenerS24S0101000_5.l0).mUser);
        int i = aCListenerS24S0101000_5.i1;
        boolean z = false;
        userProfileEvent.coHostEnable = false;
        if (i >= 1) {
            z = true;
        }
        userProfileEvent.linkInRoomEnable = z;
        userProfileEvent.mSource = "guest_connection";
        userProfileEvent.mClickUserPosition = "connection_list";
        userProfileEvent.clickModule = "multi_guest";
        LIZ.LIZIZ(userProfileEvent);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [X.OSJ, O] */
    public static final void onClick$14(ACListenerS24S0101000_5 aCListenerS24S0101000_5, View view) {
        int i;
        String str;
        switch (aCListenerS24S0101000_5.i1) {
            case 0:
                AbsHybridFragment absHybridFragment = ((HybridDialogFragment) aCListenerS24S0101000_5.l0).LLIIJI;
                if (absHybridFragment != null && (absHybridFragment instanceof TTLiveBrowserFragment)) {
                    ((TTLiveBrowserFragment) absHybridFragment).wl();
                    return;
                }
                return;
            case 1:
                BFA bfa = (BFA) aCListenerS24S0101000_5.l0;
                Integer num = (Integer) bfa.LJLLL.kv0(C28395BCl.class);
                if (num != null) {
                    i = num.intValue();
                } else {
                    i = 30;
                }
                int i2 = 1;
                if (bfa.LJLLLLLL == BBP.MANAGE_MODERATOR && bfa.L() >= i) {
                    C30868C9o.LJI(C15380j0.LJIILL(R.string.kgg, bfa.LJLJL.getText()));
                    int L = bfa.L();
                    if (bfa.L() <= i) {
                        i2 = 0;
                    }
                    BZI LIZIZ = C0N3.LIZIZ("livesdk_moderator_limit_popup", "add_button", "click_position");
                    if (C29306Beo.LJJI()) {
                        str = "live_take_page";
                    } else {
                        str = "live_take_detail";
                    }
                    LIZIZ.LJIJJ(str, "event_page");
                    LIZIZ.LJIJJ(Integer.valueOf(L), "moderator_number");
                    LIZIZ.LJIJJ(Integer.valueOf(i2), "is_above_limit");
                    C06490Nh.LIZLLL(LIZIZ, "moderator_add", "toast_situation", "show", "action_type");
                    return;
                }
                ((C32537Cpp) bfa.LJLLL.gv0(C28451BEp.class)).LIZ = new OSJ(bfa.LJLLLLLL, bfa.LJLJLLL, new C28452BEq(true, bfa.LJLZ));
                C12830et LJI = C32044Chs.LJI(bfa.itemView);
                if (LJI != null) {
                    ModeratorPermissionEditFragmentSheet tn = ((IModeratorService) CN1.LIZ(IModeratorService.class)).tn();
                    if (tn == null) {
                        return;
                    }
                    LJI.LJIIIZ(tn, "moderator_permission_edit");
                    return;
                }
                bfa.LJLLL.rv0(BroadcastDialogPageChannel.class, BBP.EDIT_MODERATOR_PERMISSION);
                return;
            case 2:
                ((XXG) aCListenerS24S0101000_5.l0).onClick(view);
                return;
            case 3:
                StickerPropDetailFragment stickerPropDetailFragment = (StickerPropDetailFragment) aCListenerS24S0101000_5.l0;
                stickerPropDetailFragment.getClass();
                if (view.getAlpha() < 1.0E-6d) {
                    return;
                }
                stickerPropDetailFragment.Gl("click_bar");
                return;
            default:
                ((SettingNewVersionFragment) aCListenerS24S0101000_5.l0).lambda$initUnits$31(view);
                return;
        }
    }

    public static final void onClick$15(ACListenerS24S0101000_5 aCListenerS24S0101000_5, View view) {
        switch (aCListenerS24S0101000_5.i1) {
            case 0:
                ((DialogFragment) aCListenerS24S0101000_5.l0).dismissAllowingStateLoss();
                return;
            case 1:
                ((BFA) aCListenerS24S0101000_5.l0).M();
                return;
            case 2:
                ChooseMusicActivity chooseMusicActivity = (ChooseMusicActivity) aCListenerS24S0101000_5.l0;
                chooseMusicActivity.LLIIIILZ();
                chooseMusicActivity.finish();
                return;
            case 3:
                ((XXG) aCListenerS24S0101000_5.l0).onClick(view);
                return;
            default:
                SettingNewVersionFragment.lambda$initUnits$33((Context) aCListenerS24S0101000_5.l0, view);
                return;
        }
    }

    public static final void onClick$16(ACListenerS24S0101000_5 aCListenerS24S0101000_5, View view) {
        switch (aCListenerS24S0101000_5.i1) {
            case 0:
                HybridDialogFragment hybridDialogFragment = (HybridDialogFragment) aCListenerS24S0101000_5.l0;
                hybridDialogFragment.getClass();
                C29929Bor c29929Bor = new C29929Bor();
                c29929Bor.LJIIJ = hybridDialogFragment.LLFII;
                c29929Bor.LJJIJIL = ((IUserManageService) CN1.LIZ(IUserManageService.class)).Ab0();
                if (hybridDialogFragment.LJZI) {
                    c29929Bor.LJJ = "live_links";
                    c29929Bor.LJJIJIIJIL = hybridDialogFragment.LJZL;
                }
                ((C29338BfK) ((IShareService) CN1.LIZ(IShareService.class)).un0()).LIZ(hybridDialogFragment.mo49getActivity(), new C29930Bos(c29929Bor), new T2R());
                return;
            case 1:
                ((BFA) aCListenerS24S0101000_5.l0).M();
                return;
            default:
                InterfaceC29345BfR interfaceC29345BfR = ((C6IQ) aCListenerS24S0101000_5.l0).LLF;
                if (interfaceC29345BfR != null) {
                    interfaceC29345BfR.LIZ();
                    return;
                }
                return;
        }
    }

    public static final void onClick$17(ACListenerS24S0101000_5 aCListenerS24S0101000_5, View view) {
        InterfaceC28441BEf interfaceC28441BEf;
        switch (aCListenerS24S0101000_5.i1) {
            case 0:
                TTLiveBrowserFragment tTLiveBrowserFragment = (TTLiveBrowserFragment) aCListenerS24S0101000_5.l0;
                tTLiveBrowserFragment.getClass();
                int id = view.getId();
                if (id == R.id.aeg) {
                    tTLiveBrowserFragment.onBackPressed("nav_bar_back_press");
                    return;
                } else {
                    if (id != R.id.ni_) {
                        return;
                    }
                    tTLiveBrowserFragment.wl();
                    return;
                }
            case 1:
                BFG bfg = (BFG) aCListenerS24S0101000_5.l0;
                HostInfo hostInfo = bfg.LJLJLJ;
                if (hostInfo != null && (interfaceC28441BEf = bfg.LJLJLLL) != null) {
                    interfaceC28441BEf.ri(hostInfo.userInfo);
                    return;
                }
                return;
            case 2:
                ((XXF) aCListenerS24S0101000_5.l0).onClick(view);
                return;
            case 3:
                C6IQ c6iq = (C6IQ) aCListenerS24S0101000_5.l0;
                c6iq.getClass();
                C6IR LIZIZ = C6IR.LIZIZ();
                int i = LIZIZ.LIZIZ + 1;
                LIZIZ.LIZIZ = i;
                if (i == ((ArrayList) LIZIZ.LIZ).size()) {
                    LIZIZ.LIZIZ = 0;
                }
                c6iq.LJLLLL.setBackground(C78127UlP.LIZIZ(C6IR.LIZIZ().LIZ().LIZ));
                return;
            default:
                StickerPropDetailFragment.Al((StickerPropDetailFragment) aCListenerS24S0101000_5.l0, view);
                return;
        }
    }

    public static final void onClick$18(ACListenerS24S0101000_5 aCListenerS24S0101000_5, View view) {
        EnterRoomConfig enterRoomConfig;
        boolean z;
        List<Room> list = ((B9U) aCListenerS24S0101000_5.l0).LJLIL;
        Room room = null;
        if (list != null) {
            room = (Room) ListProtector.get(list, aCListenerS24S0101000_5.i1);
        }
        if (room != null) {
            EnterRoomConfig enterRoomConfig2 = new EnterRoomConfig();
            enterRoomConfig2.mLogData.logPb = room.getLog_pb();
            enterRoomConfig2.mLogData.requestId = room.getRequestId();
            EnterRoomConfig.RoomsData roomsData = enterRoomConfig2.mRoomsData;
            roomsData.enterFromMerge = "live_end";
            roomsData.enterMethod = "live_cover";
            enterRoomConfig2.mLogData.liveEndExit = "auto_swipe";
            EnterRoomLinkSession LIZ = B57.LIZ.LIZ();
            if (LIZ != null && (enterRoomConfig = LIZ.mEnterRoomConfig) != null && (z = enterRoomConfig.mRoomsData.fromNewStyle)) {
                if (room.isOfficial()) {
                    z = false;
                }
                EnterRoomConfig.RoomsData roomsData2 = enterRoomConfig2.mRoomsData;
                roomsData2.fromNewStyle = z;
                EnterRoomConfig.RoomsData roomsData3 = enterRoomConfig.mRoomsData;
                roomsData2.fromDrawerStyle = roomsData3.fromDrawerStyle;
                roomsData2.enterLiveSource = roomsData3.enterFromLiveSource;
                roomsData2.windowMode = "full_screen";
                roomsData2.feedUrl = roomsData3.feedUrl;
            }
            enterRoomConfig2.mRoomsData.roomId = room.getId();
            EnterRoomConfig.RoomsData roomsData4 = enterRoomConfig2.mRoomsData;
            LiveMode streamType = room.getStreamType();
            o.LJIIIIZZ(streamType, "room.streamType");
            roomsData4.streamType = streamType;
            enterRoomConfig2.mLogData.userFrom = room.getUserFrom();
            enterRoomConfig2.mRoomsData.orientation = 1;
            C28238B6k.LIZLLL(room, enterRoomConfig2);
            C73943T0h.LIZ().LIZIZ(new B3P(room.getId(), enterRoomConfig2));
        }
        C28668BMy.LJFF(4);
    }

    public static final void onClick$19(ACListenerS24S0101000_5 aCListenerS24S0101000_5, View view) {
        String value;
        if (view == null || view.getContext() == null || ((CQQ) aCListenerS24S0101000_5.l0).LJIIIIZZ == null) {
            return;
        }
        EnumC75636TmK LIZJ = B5G.LIZIZ().LIZJ();
        B5G.LIZIZ().LJJLJ = "pk_guide";
        if (LIZJ == EnumC75636TmK.CONNECTION_SUCCEED) {
            DataChannel dataChannel = ((CQQ) aCListenerS24S0101000_5.l0).LJIIIIZZ;
            if (dataChannel == null) {
                return;
            }
            dataChannel.qv0(LinkBattleGuideEvent.class, Integer.valueOf(aCListenerS24S0101000_5.i1));
            return;
        }
        if (RandomLinkMicManager.LJIIIIZZ() || RandomLinkMicManager.LJII()) {
            C30868C9o.LIZJ(R.string.kh8);
            return;
        }
        if (aCListenerS24S0101000_5.i1 == 5) {
            value = EnumC76319TxL.MULTI_PK_GUIDE.getValue();
        } else {
            value = EnumC76319TxL.PK_GUIDE.getValue();
        }
        DataChannel dataChannel2 = ((CQQ) aCListenerS24S0101000_5.l0).LJIIIIZZ;
        if (dataChannel2 != null) {
            dataChannel2.qv0(OpenCoHostEvent.class, value);
        }
        C30868C9o.LIZJ(R.string.mhh);
        C75832TpU.LIZ.LJJIIZ(value, false, true);
    }

    public static final void onClick$2(ACListenerS24S0101000_5 aCListenerS24S0101000_5, View view) {
        float f;
        String str;
        String str2;
        String str3;
        C28727BPf c28727BPf;
        switch (aCListenerS24S0101000_5.i1) {
            case 0:
                DrawerSmallLiveViewHolder drawerSmallLiveViewHolder = (DrawerSmallLiveViewHolder) aCListenerS24S0101000_5.l0;
                FeedItem feedItem = drawerSmallLiveViewHolder.LLD;
                EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
                String str4 = drawerSmallLiveViewHolder.LJLJI.label;
                EnterRoomConfig.LogData logData = enterRoomConfig.mLogData;
                logData.enterLiveModule = str4;
                EnterRoomConfig.RoomsData roomsData = enterRoomConfig.mRoomsData;
                roomsData.enterLiveSource = "live_small_picture";
                logData.logPb = feedItem.logPb;
                logData.requestId = feedItem.resId;
                if (C28594BKc.LIZJ() != null) {
                    str = C28594BKc.LIZJ().LIZ();
                } else {
                    str = null;
                }
                roomsData.enterFromMerge = str;
                EnterRoomConfig.RoomsData roomsData2 = enterRoomConfig.mRoomsData;
                if (C28594BKc.LIZJ() != null) {
                    str2 = C28594BKc.LIZJ().LIZIZ();
                } else {
                    str2 = "drawer_cover";
                }
                roomsData2.enterMethod = str2;
                if (feedItem.isRecommendCard) {
                    enterRoomConfig.mRoomsData.enterFromMerge = "pop_card";
                }
                BLG blg = feedItem.item;
                if (blg instanceof Room) {
                    enterRoomConfig.mRoomsData.commerceStruct = ((Room) blg).getCommerceStruct();
                }
                if (((IHostAppContext) CN1.LIZ(IHostAppContext.class)).isOffline()) {
                    HashMap<Long, String> hashMap = new HashMap<>();
                    hashMap.put(Long.valueOf(feedItem.getRoom().getId()), feedItem.debugInfo);
                    enterRoomConfig.mRoomsData.debugInfos = hashMap;
                }
                BLG blg2 = feedItem.item;
                if (blg2 instanceof Room) {
                    Room room = (Room) blg2;
                    if (room.getId() != C08680Vs.LJIILJJIL.LJI) {
                        if (room.isPullUrlValid() || !C38354F3m.LJ(room.getMultiStreamData())) {
                            room.setLog_pb(feedItem.logPb);
                            room.setRequestId(feedItem.resId);
                            Context context = drawerSmallLiveViewHolder.itemView.getContext();
                            if (C2NU.LIZ.LIZIZ()) {
                                if (!TextUtils.isEmpty(feedItem.liveReason)) {
                                    enterRoomConfig.mLogData.liveReason = feedItem.liveReason;
                                }
                                if (((IPullStreamService) CN1.LIZ(IPullStreamService.class)).h0() == null) {
                                    C28787BRn.LIZ("livesdk_rd_plugin_init_failed").LJJIIJZLJL();
                                    C30868C9o.LIZLLL(R.string.sqj, context);
                                    EnterRoomLinkSession LIZ = B57.LIZ.LIZ();
                                    Event event = new Event("base_live_viewholder_click_small_picture", 34304, EnumC28203B5b.SdkCallback);
                                    event.LIZIZ(C15380j0.LJIILJJIL(R.string.sqj));
                                    LIZ.LIZIZ(event);
                                } else {
                                    EnterRoomLinkSession enterRoomLinkSession = new EnterRoomLinkSession(enterRoomConfig);
                                    enterRoomLinkSession.LIZIZ(new Event("base_live_view_holder_click_small_picture", 1536, EnumC28203B5b.SdkInterfaceCall));
                                    B57.LIZ.LIZJ(enterRoomLinkSession);
                                    enterRoomConfig.mRoomsData.enterLiveSource = drawerSmallLiveViewHolder.LJLJI.label;
                                    C28238B6k.LIZLLL(drawerSmallLiveViewHolder.LL, enterRoomConfig);
                                    if (CN1.LIZ(IHostWatch.class) != null) {
                                        enterRoomConfig.mRoomsData.userId = String.valueOf(drawerSmallLiveViewHolder.LL.getOwnerUserId());
                                        EnterRoomConfig.RoomsData roomsData3 = enterRoomConfig.mRoomsData;
                                        roomsData3.fromNewStyle = true;
                                        roomsData3.fromDrawerStyle = C28594BKc.LIZJ().LIZLLL();
                                        C08680Vs c08680Vs = C08680Vs.LJIILJJIL;
                                        if (o.LJ(c08680Vs.LJIIIIZZ, "game_drawer")) {
                                            EnterRoomConfig.RoomsData roomsData4 = enterRoomConfig.mRoomsData;
                                            roomsData4.windowMode = "small_picture";
                                            enterRoomConfig.drawParams.openLiveFromGameDrawer = true;
                                            roomsData4.needLandInteractFragment = true;
                                        } else {
                                            enterRoomConfig.mRoomsData.windowMode = "small_picture";
                                        }
                                        EnterRoomConfig.RoomsData roomsData5 = enterRoomConfig.mRoomsData;
                                        roomsData5.backRoomSource = "jump_source_square_drawer";
                                        enterRoomConfig.mLogData.positionOutsideLiveRoom = drawerSmallLiveViewHolder.LLF;
                                        roomsData5.isFresh = feedItem.isFresh;
                                        if (drawerSmallLiveViewHolder.getAdapterPosition() != -1) {
                                            enterRoomConfig.mRoomsData.smallPictureOrder = drawerSmallLiveViewHolder.getAdapterPosition() + 1;
                                        }
                                        C28594BKc.LIZJ();
                                        String str5 = "";
                                        if (TextUtils.isEmpty(null)) {
                                            List<ItemTab> LIZJ = BOX.LJFF().LIZJ();
                                            if (!C32151Nz.LJJIIJZLJL(LIZJ) && ListProtector.get(LIZJ, 0) != null) {
                                                String url = ((ItemTab) ListProtector.get(LIZJ, 0)).getUrl();
                                                if (C28594BKc.LIZJ() != null) {
                                                    if (C38354F3m.LIZJ("referral_task", C28594BKc.LIZJ().LIZ())) {
                                                        url = TabFeedViewModel.ov0(url, LiveFeedDraw.getChannelId("referral_task", "H5"));
                                                    }
                                                    if (!C38354F3m.LJ(url)) {
                                                        StringBuilder LIZ2 = X1D.LIZ();
                                                        LIZ2.append("&");
                                                        LIZ2.append("channel_id");
                                                        LIZ2.append("=[^&]*");
                                                        url = url.replaceAll(X1D.LIZIZ(LIZ2), "");
                                                    }
                                                }
                                                enterRoomConfig.mRoomsData.feedUrl = url;
                                            }
                                        } else {
                                            enterRoomConfig.mRoomsData.feedUrl = null;
                                        }
                                        Room room2 = drawerSmallLiveViewHolder.LL;
                                        Boolean valueOf = Boolean.valueOf(EnableEnterRoomOptReuseRoomPlayerSetting.INSTANCE.getValue());
                                        if ((valueOf == null || valueOf.booleanValue()) && room2 != null) {
                                            enterRoomConfig.mRoomsData.roomId = room2.getId();
                                            enterRoomConfig.mRoomsData.streamType = room2.getStreamType();
                                            C28238B6k.LJ(room2, enterRoomConfig);
                                            C28238B6k.LIZ(room2, enterRoomConfig);
                                            enterRoomConfig.mLogData.anchorId = String.valueOf(room2.getOwnerUserId());
                                        }
                                        enterRoomConfig.updateGdLabel(context);
                                        enterRoomConfig.mRoomsData.roomId = drawerSmallLiveViewHolder.LL.getId();
                                        enterRoomConfig.mRoomsData.streamType = drawerSmallLiveViewHolder.LL.getStreamType();
                                        enterRoomConfig.mRoomsData.preIsMicRoom = ((IMicRoomService) CN1.LIZ(IMicRoomService.class)).rk();
                                        enterRoomConfig.drawParams.openLiveFromDrawer = true;
                                        if (C08680Vs.LJIJI.contains(c08680Vs.LJIIIIZZ)) {
                                            enterRoomConfig.mRoomsData.openLiveFromDrawerTab = "";
                                        } else {
                                            enterRoomConfig.mRoomsData.openLiveFromDrawerTab = drawerSmallLiveViewHolder.LJLJL;
                                        }
                                        enterRoomConfig.mLogData.topLeftRoomLabel = drawerSmallLiveViewHolder.M();
                                        EnterRoomConfig.LogData logData2 = enterRoomConfig.mLogData;
                                        String str6 = "";
                                        if (drawerSmallLiveViewHolder.LLFFF != null) {
                                            StringBuilder LIZ3 = X1D.LIZ();
                                            str6 = JBR.LJFF(LIZ3, drawerSmallLiveViewHolder.LLFFF.labelType, "", LIZ3);
                                        }
                                        logData2.bottomLeftRoomLabel = str6;
                                        c08680Vs.LJI().push(Long.valueOf(drawerSmallLiveViewHolder.LL.getId()));
                                        int LJ = c08680Vs.LJ();
                                        int i = c08680Vs.LIZ;
                                        if (LJ > i) {
                                            i = c08680Vs.LJ();
                                        }
                                        c08680Vs.LIZ = i;
                                        BJA bja = BJB.LJFF;
                                        if (bja.LJLILLLLZI.length() != 0) {
                                            BJA bja2 = (BJA) ORZ.LLFII(BJB.LIZJ());
                                            if (bja2 != null && (str3 = bja2.LJLILLLLZI) != null) {
                                                str5 = str3;
                                            }
                                            if (!o.LJ(bja.LJLILLLLZI, str5)) {
                                                BJB.LIZJ().add(new BJA(bja.LJLIL, bja.LJLILLLLZI));
                                            }
                                        }
                                        ((IHostWatch) CN1.LIZ(IHostWatch.class)).watchLive(context, enterRoomConfig);
                                    }
                                    drawerSmallLiveViewHolder.LJLJJI.onNext(feedItem);
                                }
                            } else {
                                C30868C9o.LIZLLL(R.string.sqr, context);
                            }
                        }
                    }
                    C73943T0h.LIZ().LIZIZ(new C08700Vu(0));
                    C08680Vs.LJIILJJIL.LIZJ = "transfer";
                }
                synchronized (C28727BPf.class) {
                    if (C28727BPf.LIZ == null) {
                        C28727BPf.LIZ = new C28727BPf();
                    }
                    c28727BPf = C28727BPf.LIZ;
                }
                Room room3 = drawerSmallLiveViewHolder.LL;
                c28727BPf.getClass();
                if (room3 != null && view != null) {
                    JSONObject jSONObject = new JSONObject();
                    User owner = room3.getOwner();
                    if (owner != null) {
                        String title = room3.title();
                        String LIZLLL = C05170If.LIZLLL(owner);
                        try {
                            jSONObject.put("title", title);
                            jSONObject.put("nickName", LIZLLL);
                            jSONObject.put("action", "View#onClick()");
                            jSONObject.put("className", view.getClass().getName());
                        } catch (JSONException e) {
                            C16880lQ.LLLLIIL(e);
                        }
                        c28727BPf.LJIIIZ("ttlive_page", jSONObject);
                    }
                }
                C08680Vs.LJIILJJIL.LJIIJ = drawerSmallLiveViewHolder.LJLJL;
                return;
            case 1:
                UserProfileEvent userProfileEvent = new UserProfileEvent(((Room) aCListenerS24S0101000_5.l0).getOwner().getId());
                userProfileEvent.mSource = "video_head";
                C73943T0h.LIZ().LIZIZ(userProfileEvent);
                return;
            case 2:
                LiveWallPaperPreviewActivity liveWallPaperPreviewActivity = (LiveWallPaperPreviewActivity) aCListenerS24S0101000_5.l0;
                LiveWallPaperBean liveWallPaperBean = liveWallPaperPreviewActivity.LJLJI;
                if (liveWallPaperBean == null || C62011OVj.LJIILIIL(liveWallPaperPreviewActivity, null, liveWallPaperBean.getId())) {
                    return;
                }
                C31268COy c31268COy = C31268COy.LJI;
                CP0 cp0 = new CP0(liveWallPaperPreviewActivity);
                c31268COy.getClass();
                if (!TextUtils.isEmpty("paper_set")) {
                    ((HashMap) c31268COy.LJ).put("paper_set", cp0);
                }
                liveWallPaperPreviewActivity.LJLJI.setSource("paper_set");
                LiveWallPaperBean liveWallPaperBean2 = liveWallPaperPreviewActivity.LJLJI;
                if (liveWallPaperBean2 != null) {
                    if (liveWallPaperBean2.isShouldMute()) {
                        f = 0.0f;
                    } else {
                        f = liveWallPaperPreviewActivity.LJLJJL;
                    }
                    liveWallPaperBean2.setVolume(f);
                }
                LiveWallPaperBean liveWallPaperBean3 = liveWallPaperPreviewActivity.LJLJI;
                c31268COy.LIZLLL.setId(liveWallPaperBean3.getId());
                c31268COy.LIZLLL.setThumbnailPath(liveWallPaperBean3.getThumbnailPath());
                c31268COy.LIZLLL.setVideoPath(liveWallPaperBean3.getVideoPath());
                c31268COy.LIZLLL.setWidth(liveWallPaperBean3.getWidth());
                c31268COy.LIZLLL.setHeight(liveWallPaperBean3.getHeight());
                c31268COy.LIZLLL.setSource(liveWallPaperBean3.getSource());
                c31268COy.LIZLLL.setVolume(liveWallPaperBean3.getVolume());
                c31268COy.LIZLLL.setShouldMute(liveWallPaperBean3.isShouldMute());
                if (liveWallPaperPreviewActivity.isFinishing()) {
                    C62011OVj.LJIIIIZZ(1, "context is finish");
                } else if (!C39579Fg7.LIZIZ(c31268COy.LIZLLL.getVideoPath())) {
                    C62011OVj.LJIIIIZZ(1, "video path is not exist");
                } else {
                    InterfaceC28728BPg interfaceC28728BPg = c31268COy.LIZJ;
                    if (interfaceC28728BPg != null) {
                        interfaceC28728BPg.LIZLLL(c31268COy.LIZLLL.getVideoPath());
                        c31268COy.LIZJ.LJIIIZ(c31268COy.LIZLLL.getWidth());
                        c31268COy.LIZJ.LIZIZ(c31268COy.LIZLLL.getHeight());
                        c31268COy.LIZJ.LIZ(c31268COy.LIZLLL.getSource());
                        c31268COy.LIZJ.setVolume(c31268COy.LIZLLL.getVolume());
                        c31268COy.LIZJ.LJ(c31268COy.LIZLLL.isShouldMute());
                    }
                    C10K.LIZJ(new ACallableS108S0100000_5(c31268COy, 3));
                    try {
                        WallpaperManager.getInstance(liveWallPaperPreviewActivity).clear();
                        C31268COy.LIZLLL(liveWallPaperPreviewActivity);
                    } catch (Throwable th) {
                        C188727au c188727au = new C188727au();
                        c188727au.LJIIIZ("error_type", "clear_wallpaper_error");
                        c188727au.LJIIIZ("error_detail", th.getMessage());
                        FMX.LJIIL("set_wallpaper_some_error", c188727au.LIZ);
                        if (C62011OVj.LJFF(liveWallPaperPreviewActivity, liveWallPaperPreviewActivity.getPackageName())) {
                            if (C62011OVj.LJI()) {
                                if (c31268COy.LJFF == null) {
                                    c31268COy.LJFF = liveWallPaperPreviewActivity.getContentResolver();
                                }
                                Bundle bundle = new Bundle();
                                bundle.putString("wallpaper_json", C31137CJx.LIZ(c31268COy.LIZLLL));
                                bundle.putInt("video_width", c31268COy.LIZLLL.getWidth());
                                bundle.putInt("video_height", c31268COy.LIZLLL.getHeight());
                                bundle.putString("source", c31268COy.LIZLLL.getSource());
                                bundle.putFloat("volume", c31268COy.LIZLLL.getVolume());
                                try {
                                    ContentResolver contentResolver = c31268COy.LJFF;
                                    if (contentResolver != null) {
                                        contentResolver.call(InterfaceC28729BPh.LIZIZ, "call_plugin", "", bundle);
                                    }
                                } catch (Exception e2) {
                                    StringBuilder LIZ4 = X1D.LIZ();
                                    LIZ4.append("notifyWallpaperService ");
                                    LIZ4.append(e2.getMessage());
                                    C36922EeM.LJ(X1D.LIZIZ(LIZ4));
                                    C62011OVj.LJIIIIZZ(1, "notifyWallpaperService Unknow content uri");
                                }
                                C31137CJx.LIZJ();
                            } else {
                                Intent intent = new Intent();
                                intent.setClass(liveWallPaperPreviewActivity, AmeLiveWallpaper.class);
                                intent.putExtra("wallpaper_json", C31137CJx.LIZ(c31268COy.LIZLLL));
                                if (C16880lQ.LLLL(liveWallPaperPreviewActivity, intent) == null) {
                                    C62011OVj.LJIIIIZZ(1, "start livewallpaper service fail");
                                }
                            }
                        } else {
                            C31268COy.LIZLLL(liveWallPaperPreviewActivity);
                        }
                    }
                }
                String id = liveWallPaperPreviewActivity.LJLJI.getId();
                String str7 = liveWallPaperPreviewActivity.LJLJL;
                C188727au c188727au2 = new C188727au();
                c188727au2.LJIIIZ("group_id", id);
                c188727au2.LJIIIZ("enter_from", str7);
                boolean LJI = C62011OVj.LJI();
                c188727au2.LIZLLL(LJI ? 1 : 0, "need_plugin");
                if (LJI) {
                    boolean LJFF = FCD.LJFF(liveWallPaperPreviewActivity, InterfaceC28729BPh.LIZ);
                    c188727au2.LIZLLL(LJFF ? 1 : 0, "plugin_install");
                    if (LJFF) {
                        c188727au2.LIZLLL(C62011OVj.LJIIL(liveWallPaperPreviewActivity) ? 1 : 0, "install_type");
                    }
                }
                FMX.LJIIL("wall_paper_click", c188727au2.LIZ);
                return;
            case 3:
                ((PushSettingManagerFragmentSecondVersion) aCListenerS24S0101000_5.l0).Hl();
                return;
            case 4:
                ((SettingNewVersionFragment) aCListenerS24S0101000_5.l0).lambda$initUnits$57(view);
                return;
            default:
                final VideoPublishContainerScene videoPublishContainerScene = (VideoPublishContainerScene) aCListenerS24S0101000_5.l0;
                videoPublishContainerScene.LLLLL().LIZ(videoPublishContainerScene.LLII(), videoPublishContainerScene.LLLLIILLL(), videoPublishContainerScene.LLILZLL.creativeInfo.getCreationId(), videoPublishContainerScene.LLILZLL.creativeModel.trendingUploadModel.trendingTopic, new OnActivityResultCallback() { // from class: X.G5m
                    @Override // com.bytedance.router.OnActivityResultCallback
                    public final void onActivityResult(int i2, int i3, Intent intent2) {
                        VideoPublishContainerScene videoPublishContainerScene2 = VideoPublishContainerScene.this;
                        videoPublishContainerScene2.getClass();
                        if (i3 == -1 && intent2 != null) {
                            videoPublishContainerScene2.LLILZLL.creativeModel.trendingUploadModel.trendingTopic = (VideoTrendingTopic) intent2.getSerializableExtra("video_trending_topic");
                            videoPublishContainerScene2.LLZLLIL();
                        } else {
                            videoPublishContainerScene2.LLILZLL.creativeModel.trendingUploadModel.trendingTopic = null;
                        }
                        videoPublishContainerScene2.M(videoPublishContainerScene2.LLIFFJFJJ, videoPublishContainerScene2.LLILZLL.creativeModel.trendingUploadModel.trendingTopic, null);
                    }
                });
                return;
        }
    }

    public static final void onClick$3(ACListenerS24S0101000_5 aCListenerS24S0101000_5, View view) {
        InterfaceC32725Csr interfaceC32725Csr;
        ((C32680Cs8) aCListenerS24S0101000_5.l0).P();
        C32680Cs8 c32680Cs8 = (C32680Cs8) aCListenerS24S0101000_5.l0;
        AbstractC32698CsQ<? extends C30896CAq> abstractC32698CsQ = c32680Cs8.LJZ;
        if (abstractC32698CsQ != null && (interfaceC32725Csr = c32680Cs8.LJZI) != null) {
            interfaceC32725Csr.LJI(aCListenerS24S0101000_5.i1, abstractC32698CsQ.LIZJ(), abstractC32698CsQ);
        }
    }

    public static final void onClick$4(ACListenerS24S0101000_5 aCListenerS24S0101000_5, View view) {
        AbstractC32698CsQ<? extends C30896CAq> abstractC32698CsQ;
        InterfaceC32725Csr interfaceC32725Csr;
        AbstractC32678Cs6 abstractC32678Cs6 = (AbstractC32678Cs6) aCListenerS24S0101000_5.l0;
        SystemClock.uptimeMillis();
        abstractC32678Cs6.getClass();
        AbstractC32698CsQ<? extends C30896CAq> abstractC32698CsQ2 = ((AbstractC32678Cs6) aCListenerS24S0101000_5.l0).LJZ;
        if ((abstractC32698CsQ2 != null && !abstractC32698CsQ2.LJIIIIZZ()) || ((abstractC32698CsQ = ((AbstractC32678Cs6) aCListenerS24S0101000_5.l0).LJZ) != null && !abstractC32698CsQ.LIZJ)) {
            ((AbstractC32678Cs6) aCListenerS24S0101000_5.l0).P();
        }
        AbstractC32678Cs6 abstractC32678Cs62 = (AbstractC32678Cs6) aCListenerS24S0101000_5.l0;
        AbstractC32698CsQ<? extends C30896CAq> abstractC32698CsQ3 = abstractC32678Cs62.LJZ;
        if (abstractC32698CsQ3 != null && (interfaceC32725Csr = abstractC32678Cs62.LJZI) != null) {
            interfaceC32725Csr.LJI(aCListenerS24S0101000_5.i1, abstractC32698CsQ3.LIZJ(), abstractC32698CsQ3);
        }
    }

    public static final void onClick$5(ACListenerS24S0101000_5 aCListenerS24S0101000_5, View view) {
        User user;
        String str;
        switch (aCListenerS24S0101000_5.i1) {
            case 0:
                CommentWidget commentWidget = (CommentWidget) aCListenerS24S0101000_5.l0;
                DataChannel dataChannel = commentWidget.dataChannel;
                if (dataChannel != null) {
                    dataChannel.qv0(HideShareLeadEvent.class, Boolean.TRUE);
                }
                commentWidget.LLILLL.requestPage = "live";
                AnimatorSet animatorSet = commentWidget.LLJILJILJ;
                if (animatorSet != null && animatorSet.isRunning()) {
                    C31079CHr.LIZLLL(commentWidget.dataChannel, "live_room");
                }
                commentWidget.LLIIJI(null);
                return;
            case 1:
                BVA bva = (BVA) aCListenerS24S0101000_5.l0;
                Question question = bva.LJLIL;
                if (question != null && (user = question.user) != null) {
                    bva.T(user, "head");
                    return;
                }
                return;
            case 2:
                StickerPropDetailFragment stickerPropDetailFragment = (StickerPropDetailFragment) aCListenerS24S0101000_5.l0;
                stickerPropDetailFragment.getClass();
                C188727au c188727au = new C188727au();
                NewFaceStickerBean newFaceStickerBean = stickerPropDetailFragment.LLJLIL;
                if (newFaceStickerBean == null) {
                    str = "";
                } else {
                    str = newFaceStickerBean.id;
                }
                c188727au.LJIIIZ("prop_id", str);
                c188727au.LJIIIZ("media_type", GreenScreenMaterial.Companion.getMEDIA_TYPE_STRING()[stickerPropDetailFragment.LLJJJIL]);
                FMX.LJIIL("click_media_type_dropdown", c188727au.LIZ);
                stickerPropDetailFragment.LJLJJLL.show(stickerPropDetailFragment.getChildFragmentManager(), "MediaFilterFragment");
                return;
            default:
                NLECutCompressActivity this$0 = (NLECutCompressActivity) aCListenerS24S0101000_5.l0;
                o.LJIIIZ(this$0, "this$0");
                this$0.cancel();
                return;
        }
    }

    public static final void onClick$6(ACListenerS24S0101000_5 aCListenerS24S0101000_5, View view) {
        boolean z;
        switch (aCListenerS24S0101000_5.i1) {
            case 0:
                CommentWidget commentWidget = (CommentWidget) ((LifecycleOwner) aCListenerS24S0101000_5.l0);
                AnimatorSet animatorSet = commentWidget.LLJILJILJ;
                if (animatorSet != null && animatorSet.isRunning()) {
                    C31079CHr.LIZLLL(commentWidget.dataChannel, "live_room");
                }
                commentWidget.LLIIJI(null);
                return;
            case 1:
                LiveRoomUserInfoWidget liveRoomUserInfoWidget = (LiveRoomUserInfoWidget) ((LifecycleOwner) aCListenerS24S0101000_5.l0);
                liveRoomUserInfoWidget.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - liveRoomUserInfoWidget.LLJJIJIIJIL >= 800) {
                    z = false;
                } else {
                    z = true;
                }
                liveRoomUserInfoWidget.LLJJIJIIJIL = currentTimeMillis;
                if (z) {
                    return;
                }
                C28965BYj.LIZ(false);
                liveRoomUserInfoWidget.LLIIJLIL();
                return;
            case 2:
                ((MusCountryListActivity) ((LifecycleOwner) aCListenerS24S0101000_5.l0)).onBackPressed();
                return;
            case 3:
                Fragment fragment = (Fragment) ((LifecycleOwner) aCListenerS24S0101000_5.l0);
                fragment.getClass();
                FindFriendsPageArg findFriendsPageArg = new FindFriendsPageArg(false, 0, "homepage_follow", KMR.DEFAULT, "", 0, false);
                SmartRoute buildRoute = SmartRouter.buildRoute(fragment.getContext(), "//friends/ffp");
                buildRoute.withNavArg(findFriendsPageArg);
                buildRoute.open();
                C188727au c188727au = new C188727au();
                c188727au.LJIIIZ("enter_from", "homepage_follow");
                FMX.LJIIL("click_add_friends", c188727au.LIZ);
                return;
            default:
                ((SettingNewVersionFragment) ((LifecycleOwner) aCListenerS24S0101000_5.l0)).lambda$initUnits$23(view);
                return;
        }
    }

    public static final void onClick$7(ACListenerS24S0101000_5 aCListenerS24S0101000_5, View view) {
        if (aCListenerS24S0101000_5.i1 == 4 || ((LinkPlayerInfo) aCListenerS24S0101000_5.l0).mUser == null) {
            return;
        }
        C73943T0h LIZ = C73943T0h.LIZ();
        UserProfileEvent userProfileEvent = new UserProfileEvent(((LinkPlayerInfo) aCListenerS24S0101000_5.l0).mUser);
        int i = aCListenerS24S0101000_5.i1;
        boolean z = false;
        userProfileEvent.coHostEnable = false;
        if (i >= 1) {
            z = true;
        }
        userProfileEvent.linkInRoomEnable = z;
        userProfileEvent.mSource = "guest_connection";
        userProfileEvent.mReportType = "report_user";
        userProfileEvent.mClickUserPosition = "connection_list";
        userProfileEvent.clickModule = "multi_guest";
        LIZ.LIZIZ(userProfileEvent);
    }

    public static final void onClick$8(ACListenerS24S0101000_5 aCListenerS24S0101000_5, View view) {
        boolean z;
        String LIZ;
        String LIZIZ;
        int i;
        String str;
        String str2;
        String str3;
        final C28439BEd c28439BEd = (C28439BEd) aCListenerS24S0101000_5.l0;
        int i2 = aCListenerS24S0101000_5.i1;
        c28439BEd.getClass();
        try {
            z = C2NU.LIZ.LIZIZ();
        } catch (Exception unused) {
            z = false;
        }
        if (!z) {
            C30868C9o.LIZLLL(R.string.n0o, c28439BEd.LJLJLJ);
        } else {
            final User user = (User) ListProtector.get(c28439BEd.LJLJLLL, i2);
            final String str4 = c28439BEd.LJLL;
            if (user != null) {
                c28439BEd.LJLLI = user;
                if (TextUtils.isEmpty(C05170If.LIZ(user))) {
                    LIZ = "";
                } else {
                    LIZ = C05170If.LIZ(user);
                }
                if (str4.equals("activity_banned_talk")) {
                    LIZIZ = c28439BEd.LJLJLJ.getString(R.string.lw_, LIZ);
                    i = R.string.knh;
                } else {
                    LIZIZ = UPJ.LIZIZ(c28439BEd.LJLJLJ.getString(R.string.so0), " ", LIZ, " ", c28439BEd.LJLJLJ.getString(R.string.so2));
                    i = R.string.mlx;
                }
                final HashMap hashMap = new HashMap();
                hashMap.put("anchor_id", String.valueOf(c28439BEd.LJLLJ));
                hashMap.put("room_id", String.valueOf(c28439BEd.LJLLILLLL));
                hashMap.put("user_id", user.getIdStr());
                C77437UaH c77437UaH = new C77437UaH(c28439BEd.LJLJLJ);
                c77437UaH.LJI = LIZIZ;
                c77437UaH.LIZJ(R.string.mlw, new IDCListenerS49S0200000_5(c28439BEd, hashMap, 7), false);
                c77437UaH.LJ(i, new DialogInterface.OnClickListener() { // from class: X.BEe
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i3) {
                        String str5;
                        C28439BEd c28439BEd2 = C28439BEd.this;
                        java.util.Map map = hashMap;
                        String str6 = str4;
                        User user2 = user;
                        if ("activity_banned_talk".equals(c28439BEd2.LJLL)) {
                            str5 = "livesdk_anchor_mute_cancel_toast_click";
                        } else {
                            str5 = "livesdk_anchor_blocklist_cancel_toast_click";
                        }
                        map.put("action_type", "yes");
                        BZI LIZ2 = C28787BRn.LIZ(str5);
                        LIZ2.LJJIFFI(map);
                        LIZ2.LJJIIJZLJL();
                        c28439BEd2.LJLJJI.setVisibility(0);
                        c28439BEd2.LJLILLLLZI.setVisibility(8);
                        if (str6.equals("activity_kick_out")) {
                            ((IUserManageService) CN1.LIZ(IUserManageService.class)).cW(c28439BEd2, false, c28439BEd2.LJLLILLLL, user2.getId(), "UnKickOutViewHolder");
                        } else {
                            ((IUserManageService) CN1.LIZ(IUserManageService.class)).Qu(c28439BEd2.LJLLILLLL, user2, c28439BEd2);
                        }
                        dialogInterface.dismiss();
                    }
                }, false);
                DialogC77438UaI LIZ2 = c77437UaH.LIZ();
                if (!new C03880Dg(2).LIZJ(300000, "com/bytedance/android/livesdk/dialog/LiveModalDialog", "show", LIZ2, new Object[0], "void", new C65300Pk0(false, "()V", "9116677867903005982")).LIZ) {
                    LIZ2.show();
                }
                if ("activity_banned_talk".equals(c28439BEd.LJLL)) {
                    str = "livesdk_anchor_mute_cancel_toast_show";
                } else {
                    str = "livesdk_anchor_blocklist_cancel_toast_show";
                }
                BZI LIZ3 = C28787BRn.LIZ(str);
                LIZ3.LJJIFFI(hashMap);
                LIZ3.LJJIIJZLJL();
                if (((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId() == c28439BEd.LJLLJ) {
                    str2 = "anchor";
                } else {
                    str2 = "admin";
                }
                ((IUserManageService) CN1.LIZ(IUserManageService.class)).af0().LJJIFFI(new AfS16S1200000_5(c28439BEd, user, str2, 1));
            }
        }
        User user2 = (User) ListProtector.get(c28439BEd.LJLJLLL, i2);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("anchor_id", String.valueOf(c28439BEd.LJLLJ));
        hashMap2.put("room_id", String.valueOf(c28439BEd.LJLLILLLL));
        hashMap2.put("user_id", user2.getIdStr());
        if ("activity_banned_talk".equals(c28439BEd.LJLL)) {
            str3 = "livesdk_anchor_mute_cancel_click";
        } else {
            str3 = "livesdk_anchor_blocklist_cancel_click";
        }
        AnonymousClass172.LIZ(str3, hashMap2);
    }

    public static final void onClick$9(ACListenerS24S0101000_5 aCListenerS24S0101000_5, View view) {
        Room room;
        OfficialChannelInfo officialChannelInfo;
        boolean z;
        String str;
        String str2;
        switch (aCListenerS24S0101000_5.i1) {
            case 0:
                LiveNewAudienceEndFragment liveNewAudienceEndFragment = (LiveNewAudienceEndFragment) aCListenerS24S0101000_5.l0;
                liveNewAudienceEndFragment.Gl();
                liveNewAudienceEndFragment.LJLJJL.removeCallbacksAndMessages(null);
                BZI LIZ = C28787BRn.LIZ("livesdk_finish_anchor_click");
                LIZ.LJIJJ(Long.valueOf(((C29374Bfu) C279117r.LIZJ(LIZ, liveNewAudienceEndFragment.LJLJJI)).getCurrentUserId()), "user_id");
                LIZ.LJJIIJZLJL();
                Room room2 = liveNewAudienceEndFragment.LJLJJLL;
                liveNewAudienceEndFragment.LJLIL = room2;
                if (room2 == null || room2.getOwner() == null) {
                    return;
                }
                User owner = liveNewAudienceEndFragment.LJLIL.getOwner();
                IMicRoomService iMicRoomService = (IMicRoomService) CN1.LIZ(IMicRoomService.class);
                if (iMicRoomService != null && iMicRoomService.jT(liveNewAudienceEndFragment.LJLIL) && iMicRoomService.Qo(liveNewAudienceEndFragment.LJLIL) && ((room = liveNewAudienceEndFragment.LJLIL) == null || (officialChannelInfo = room.officialChannelInfo) == null || (owner = officialChannelInfo.channelUser) == null)) {
                    owner = room.getOwner();
                }
                HashMap hashMap = new HashMap(1);
                hashMap.put("log_enter_live_source", null);
                hashMap.put("sec_user_id", owner.getSecUid());
                ((IActionHandlerService) CN1.LIZ(IActionHandlerService.class)).showUserProfile(owner.getId(), null, hashMap);
                return;
            case 1:
                C1545664u c1545664u = (C1545664u) aCListenerS24S0101000_5.l0;
                InterfaceC1546465c interfaceC1546465c = c1545664u.LLJJIII;
                if (interfaceC1546465c != null) {
                    interfaceC1546465c.LIZ();
                }
                if (c1545664u.LLIIIL != null) {
                    TextFontStyleData LJFF = C68M.LJIIJ().LJFF(c1545664u.getScene());
                    C67P c67p = c1545664u.LLFFF;
                    if (c67p != null && c67p.getData() != null) {
                        z = c1545664u.LLFFF.getData().getHasReadTextAudio();
                    } else {
                        z = false;
                    }
                    C67P c67p2 = c1545664u.LLFFF;
                    String str3 = "";
                    if (c67p2 == null || c67p2.getData() == null) {
                        str = "";
                    } else {
                        str = c1545664u.LLFFF.getData().getSpeakerID();
                    }
                    InterfaceC139695e1 interfaceC139695e1 = c1545664u.LLIIIL;
                    boolean LJIIJJI = C68W.LJIIJJI(c1545664u.getTextWrapList());
                    boolean LJIIJ = C68W.LJIIJ(c1545664u.getTextWrapList());
                    String str4 = c1545664u.LLIIIILZ;
                    if (c1545664u.LLILZLL) {
                        str2 = "caption";
                    } else {
                        str2 = "text";
                    }
                    if (LJFF != null) {
                        str3 = LJFF.title;
                    }
                    interfaceC139695e1.LJII(new C147105py(LJIIJJI, LJIIJ, str4, 0, str2, null, str3, z, str, false));
                    return;
                }
                return;
            case 2:
                ((SettingNewVersionFragment) aCListenerS24S0101000_5.l0).lambda$initUnits$86(view);
                return;
            default:
                ViewOnTouchListenerC82139WLn viewOnTouchListenerC82139WLn = (ViewOnTouchListenerC82139WLn) aCListenerS24S0101000_5.l0;
                InterfaceC30027BqR interfaceC30027BqR = viewOnTouchListenerC82139WLn.LJLLLL;
                if (interfaceC30027BqR != null) {
                    int i = viewOnTouchListenerC82139WLn.LJLL;
                    C82141WLp c82141WLp = (C82141WLp) interfaceC30027BqR;
                    View view2 = c82141WLp.LIZ;
                    if (view2 != null) {
                        C16880lQ.LJLLLL(view2, c82141WLp.LIZIZ);
                        c82141WLp.LIZ = null;
                    }
                    c82141WLp.LIZLLL.LJJIIZ(i);
                    return;
                }
                return;
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public ACListenerS24S0101000_5(int r2, com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo r3, int r4) {
        /*
            r1 = this;
            r1.$t = r4
            switch(r4) {
                case 7: goto Le;
                default: goto L5;
            }
        L5:
            r0 = r1
            r0.l0 = r3
            r0.i1 = r2
        La:
            r0.<init>()
            return
        Le:
            r0 = r1
            r0.i1 = r2
            r0.l0 = r3
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ACListenerS24S0101000_5.<init>(int, com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo, int):void");
    }

    public ACListenerS24S0101000_5(int i, Object obj, int i2) {
        this.$t = i2;
        this.i1 = i;
        this.l0 = obj;
    }
}
