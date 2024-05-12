package Y;

import X.ARN;
import X.AbstractC73638SvC;
import X.AbstractC75469Tjd;
import X.AnonymousClass634;
import X.B3D;
import X.B4U;
import X.B5G;
import X.B83;
import X.BJ5;
import X.BJN;
import X.BY9;
import X.BYO;
import X.C0NB;
import X.C122004qa;
import X.C122034qd;
import X.C15380j0;
import X.C176996x5;
import X.C177336xd;
import X.C188727au;
import X.C23;
import X.C2308394d;
import X.C28954BXy;
import X.C29374Bfu;
import X.C29689Bkz;
import X.C29727Blb;
import X.C29742Blq;
import X.C2A4;
import X.C30770C5u;
import X.C30898CAs;
import X.C31089CIb;
import X.C31611Cat;
import X.C31665Cbl;
import X.C43I;
import X.C44031HPv;
import X.C45243HpH;
import X.C47061t0;
import X.C59273NOb;
import X.C5S1;
import X.C62119OZn;
import X.C73969T1h;
import X.C74631TQt;
import X.C74726TUk;
import X.C74947TbD;
import X.C74967TbX;
import X.C75150TeU;
import X.C75154TeY;
import X.C75156Tea;
import X.C75157Teb;
import X.C75192TfA;
import X.C75466Tja;
import X.C75467Tjb;
import X.C75492Tk0;
import X.C75504TkC;
import X.C75513TkL;
import X.C75515TkN;
import X.C75550Tkw;
import X.C75632TmG;
import X.C75647TmV;
import X.C75650TmY;
import X.C75842Tpe;
import X.C75850Tpm;
import X.C76091Ttf;
import X.C76265TwT;
import X.C76800UCe;
import X.C79004UzY;
import X.C79057V0z;
import X.C82552Waa;
import X.C83591WrL;
import X.C8E;
import X.CN1;
import X.DialogC25756A8y;
import X.EnumC2321799h;
import X.EnumC29732Blg;
import X.EnumC30204BtI;
import X.EnumC74990Tbu;
import X.EnumC75465TjZ;
import X.EnumC75468Tjc;
import X.EnumC75620Tm4;
import X.EnumC75636TmK;
import X.EnumC75769ToT;
import X.EnumC76178Tv4;
import X.EnumC76391TyV;
import X.FMX;
import X.IRX;
import X.InterfaceC29205BdB;
import X.InterfaceC29879Bo3;
import X.InterfaceC30237Btp;
import X.InterfaceC30442Bx8;
import X.InterfaceC31336CRo;
import X.InterfaceC75476Tjk;
import X.InterfaceC88472Yns;
import X.KNV;
import X.KR8;
import X.LYU;
import X.OSZ;
import X.T16;
import X.TS2;
import X.TYQ;
import X.TZJ;
import X.V1B;
import X.X1D;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.SubscribeBadge;
import com.bytedance.android.live.base.model.user.SubscribeInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.interaction.drawguess.DrawGuessRoundIdChannel;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.api.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.live.liveinteract.api.event.LinkStateForH5Event;
import com.bytedance.android.live.liveinteract.linkroom.widget.LinkControlWidget;
import com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.previewv1.GuestMediaManageFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.previewv1.MultiGuestPreviewFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.model.MultiLiveGuestMuteAudioEvent;
import com.bytedance.android.live.liveinteract.multihost.biz.dialog.LinkDialog;
import com.bytedance.android.live.liveinteract.multihost.biz.event.CoHostInviteCountDownUpdateChannel;
import com.bytedance.android.live.liveinteract.multihost.core.service.IMultiHostService;
import com.bytedance.android.live.liveinteract.platform.core.LinkerManager;
import com.bytedance.android.live.microom.IMicRoomService;
import com.bytedance.android.livesdk.LiveRoomFragment;
import com.bytedance.android.livesdk.api.revenue.subscription.ISubscribeService;
import com.bytedance.android.livesdk.chatroom.model.LatestBanRecordInfo;
import com.bytedance.android.livesdk.chatroom.model.interact.CohostTopic;
import com.bytedance.android.livesdk.chatroom.ui.AbsAudienceInteractionFragment;
import com.bytedance.android.livesdk.chatroom.ui.LandscapeAudienceInteractionFragment;
import com.bytedance.android.livesdk.chatroom.ui.LiveEmojiInputDialogFragment;
import com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment;
import com.bytedance.android.livesdk.chatroom.viewmodule.CommentWidget;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.model.OfficialChannelInfo;
import com.bytedance.android.livesdk.userinfowidget.LiveRoomUserInfoWidget;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.comment.commentlist.CommentListFragment;
import com.ss.android.ugc.aweme.crossplatform.business.BusinessService;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.ui.FeedFollowFragment;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.profile.ui.AwemeListFragmentImpl;
import com.ss.android.ugc.aweme.setting.ui.I18nSettingNewVersionFragment;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoEditContainerScene;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.vesdk.VECameraSettings;
import com.ss.avframework.livestreamv2.core.interact.model.Config;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public class AObjectS45S0101000_13 implements InterfaceC88472Yns {
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
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            case 7:
                return invoke$7(this, obj);
            case 8:
                return invoke$8(this, obj);
            case 9:
                return invoke$9(this, obj);
            case 10:
                return invoke$10(this, obj);
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return invoke$11(this, obj);
            case 12:
                return invoke$12(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AObjectS45S0101000_13 aObjectS45S0101000_13, Object obj) {
        IMicRoomService iMicRoomService;
        Room room;
        OfficialChannelInfo officialChannelInfo;
        User user;
        C122004qa c122004qa;
        switch (aObjectS45S0101000_13.i1) {
            case 0:
                EnumC30204BtI.MUSIC.setRedDotVisible((DataChannel) aObjectS45S0101000_13.l0, ((Boolean) obj).booleanValue());
                return C76800UCe.LIZ;
            case 1:
                CommentWidget commentWidget = (CommentWidget) aObjectS45S0101000_13.l0;
                commentWidget.getClass();
                if (((Boolean) obj).booleanValue()) {
                    if (commentWidget.LLIIII()) {
                        LiveEmojiInputDialogFragment liveEmojiInputDialogFragment = commentWidget.LLILLIZIL;
                        liveEmojiInputDialogFragment.LJLLI = C15380j0.LJIILJJIL(R.string.ms3);
                        liveEmojiInputDialogFragment.Ol();
                    }
                    commentWidget.LLIILZL = true;
                    commentWidget.LLILZLL();
                } else {
                    if (commentWidget.LLIIII()) {
                        LiveEmojiInputDialogFragment liveEmojiInputDialogFragment2 = commentWidget.LLILLIZIL;
                        liveEmojiInputDialogFragment2.LJLLI = null;
                        liveEmojiInputDialogFragment2.Ol();
                    }
                    commentWidget.LLIILZL = false;
                    commentWidget.LLILZLL();
                }
                return C76800UCe.LIZ;
            case 2:
                LiveRoomUserInfoWidget liveRoomUserInfoWidget = (LiveRoomUserInfoWidget) aObjectS45S0101000_13.l0;
                liveRoomUserInfoWidget.getClass();
                if (((BJ5) obj).LIZ) {
                    long id = liveRoomUserInfoWidget.LLILIL.getOwner().getId();
                    if (!liveRoomUserInfoWidget.LLILL && (iMicRoomService = liveRoomUserInfoWidget.LLJ) != null && iMicRoomService.rk() && (room = liveRoomUserInfoWidget.LLILIL) != null && (officialChannelInfo = room.officialChannelInfo) != null && (user = officialChannelInfo.channelUser) != null) {
                        id = user.getId();
                    }
                    ((C29374Bfu) B83.LIZ().LIZIZ()).LJIILLIIL(id, "LiveRoomUserInfoWidget_onLoginEvent", "roomUserInfo_onLoginEvent").LJIJJ(C73969T1h.LIZIZ()).LJFF(liveRoomUserInfoWidget.getAutoUnbindTransformer()).LJJII(new AfS57S0100000_5(liveRoomUserInfoWidget, 22), new AfS18S0001000_6(0, 0));
                }
                return C76800UCe.LIZ;
            case 3:
                String enterFrom = ((CommentListFragment) aObjectS45S0101000_13.l0).LJLILLLLZI.getEnterFrom();
                C188727au LIZLLL = KNV.LIZLLL(enterFrom, "enterFrom");
                LIZLLL.LJIIIZ("enter_from", enterFrom);
                FMX.LJIIL("comment_batch_management_delete_cancel_ck", LIZLLL.LIZ);
                return C76800UCe.LIZ;
            case 4:
                C176996x5 c176996x5 = (C176996x5) aObjectS45S0101000_13.l0;
                C177336xd c177336xd = (C177336xd) obj;
                c177336xd.LJLLI = c176996x5.LJIIZILJ();
                c177336xd.LJLIL = c176996x5.LJLLJ;
                c177336xd.LJLJJL = c176996x5.LJLJJI.getEnterMethod();
                c177336xd.LJLILLLLZI = c176996x5.LJIL();
                c177336xd.LJLJJLL = c176996x5.LJIJJLI();
                c177336xd.LJLL = c176996x5.LJLJJI.getCommentInputViewType();
                c176996x5.LJLJJI.hasUpvoteOption();
                c176996x5.LJJIII();
                c177336xd.LIZ(c176996x5.LJIJ());
                return null;
            case 5:
                FeedFollowFragment feedFollowFragment = (FeedFollowFragment) aObjectS45S0101000_13.l0;
                feedFollowFragment.getClass();
                if (!((Boolean) obj).booleanValue()) {
                    return C76800UCe.LIZ;
                }
                LYU.LJI = "publish_landing";
                feedFollowFragment.Ol();
                return C76800UCe.LIZ;
            default:
                TextStickerData textStickerData = (TextStickerData) aObjectS45S0101000_13.l0;
                C122034qd c122034qd = (C122034qd) obj;
                if (!TextUtils.isEmpty(textStickerData.getNleUuid()) && (c122004qa = c122034qd.LJFF().get(textStickerData.getNleUuid())) != null) {
                    c122004qa.LIZJ = 0L;
                    c122004qa.LIZLLL = textStickerData.getAudioTrackDuration();
                    c122004qa.LJ = textStickerData.getStartTime();
                    c122004qa.LJFF = textStickerData.getAudioTrackDuration() + textStickerData.getStartTime();
                    c122034qd.LJFF().LJJJI(c122004qa);
                }
                return null;
        }
    }

    public static final Object invoke$1(AObjectS45S0101000_13 aObjectS45S0101000_13, Object obj) {
        switch (aObjectS45S0101000_13.i1) {
            case 0:
                GuestMediaManageFragment guestMediaManageFragment = (GuestMediaManageFragment) aObjectS45S0101000_13.l0;
                TS2 ts2 = (TS2) obj;
                if (guestMediaManageFragment.LLFZ != null) {
                    if (C74947TbD.LJIJJLI(ts2.LJLILLLLZI)) {
                        if (ts2.LJLIL) {
                            C74631TQt c74631TQt = (C74631TQt) guestMediaManageFragment.LLJ.kv0(MultiLiveGuestMuteAudioEvent.class);
                            if (c74631TQt != null) {
                                guestMediaManageFragment.LLFZ.setAudioEnabled(c74631TQt.LJLIL);
                            }
                        } else {
                            guestMediaManageFragment.LLFZ.setAudioEnabled(false);
                        }
                    }
                    guestMediaManageFragment.LLFZ.setAudioClickable(ts2.LJLIL);
                }
                return C76800UCe.LIZ;
            default:
                Room it = (Room) aObjectS45S0101000_13.l0;
                obj.getClass();
                o.LJIIIZ(it, "it");
                String value = String.valueOf(it.getId());
                o.LJIIIZ(value, "value");
                C29689Bkz.LJFF.put("room_id", value);
                return C76800UCe.LIZ;
        }
    }

    public static final Object invoke$10(AObjectS45S0101000_13 aObjectS45S0101000_13, Object obj) {
        C76800UCe lambda$onViewCreated$3;
        switch (aObjectS45S0101000_13.i1) {
            case 0:
                LinkControlWidget linkControlWidget = (LinkControlWidget) aObjectS45S0101000_13.l0;
                Runnable runnable = (Runnable) obj;
                if (linkControlWidget.LLF() && C74726TUk.LIZJ(true)) {
                    runnable.run();
                    return C76800UCe.LIZ;
                }
                C75515TkN.LIZIZ(linkControlWidget.LJLLLL.LIZIZ.LJLJLLL, new ARunnableS17S0101000_13(0, linkControlWidget, 12), EnumC75468Tjc.MULTIGUEST);
                runnable.run();
                return C76800UCe.LIZ;
            case 1:
                lambda$onViewCreated$3 = ((AbsAudienceInteractionFragment) aObjectS45S0101000_13.l0).lambda$onViewCreated$3((Boolean) obj);
                return lambda$onViewCreated$3;
            default:
                DialogInterface.OnClickListener onClickListener = (DialogInterface.OnClickListener) aObjectS45S0101000_13.l0;
                ARN arn = (ARN) obj;
                if (onClickListener != null) {
                    onClickListener.onClick(arn.LIZ(), arn.LIZ);
                }
                return C76800UCe.LIZ;
        }
    }

    public static final Object invoke$11(AObjectS45S0101000_13 aObjectS45S0101000_13, Object obj) {
        C47061t0 c47061t0;
        C47061t0 c47061t02;
        C76800UCe lambda$onViewCreated$6;
        switch (aObjectS45S0101000_13.i1) {
            case 0:
                User user = (User) obj;
                C75154TeY c75154TeY = ((LinkControlWidget) aObjectS45S0101000_13.l0).LJLLLL;
                c75154TeY.getClass();
                o.LJIIIZ(user, "user");
                C75150TeU c75150TeU = c75154TeY.LIZIZ;
                c75150TeU.getClass();
                C2A4 c2a4 = c75150TeU.LJLLJ;
                if (c2a4 != null && (c47061t0 = c75150TeU.LJLLL) != null && (c47061t02 = c75150TeU.LJLLLL) != null) {
                    C75157Teb c75157Teb = new C75157Teb(c47061t0, c47061t02, c75150TeU, c2a4, new C75156Tea(c75150TeU, user, c47061t02, c2a4, c47061t0));
                    ImageModel avatarThumb = user.getAvatarThumb();
                    o.LJIIIIZZ(avatarThumb, "user.avatarThumb");
                    C31665Cbl.LIZJ(avatarThumb).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS24S0400000_13(c75150TeU, c75157Teb, avatarThumb, c47061t0, 3), new AfS62S0200000_13(c75157Teb, avatarThumb, 17));
                }
                return C76800UCe.LIZ;
            default:
                lambda$onViewCreated$6 = ((AbsAudienceInteractionFragment) aObjectS45S0101000_13.l0).lambda$onViewCreated$6((Boolean) obj);
                return lambda$onViewCreated$6;
        }
    }

    public static final Object invoke$12(AObjectS45S0101000_13 aObjectS45S0101000_13, Object obj) {
        C76800UCe lambda$onActivityCreated$15;
        switch (aObjectS45S0101000_13.i1) {
            case 0:
                LinkControlWidget linkControlWidget = (LinkControlWidget) aObjectS45S0101000_13.l0;
                C23 c23 = (C23) obj;
                linkControlWidget.getClass();
                if (c23.LJLIL.id != 0) {
                    C75647TmV c75647TmV = new C75647TmV(c23.LJLILLLLZI, c23.LJLJI);
                    CohostTopic cohostTopic = c23.LJLIL;
                    IMultiHostService LIZLLL = C8E.LIZLLL();
                    EnumC75620Tm4 LLII = LIZLLL.LLII();
                    if (LLII == EnumC75620Tm4.Invited) {
                        C75850Tpm.LIZ(linkControlWidget.context, EnumC75769ToT.INVITE_TOPIC_PAIR, new AObjectS45S0400000_13(linkControlWidget, LIZLLL, cohostTopic, c75647TmV, 0), new AObjectS21S0001000_5(0, 5));
                    } else if (LLII == EnumC75620Tm4.Applied) {
                        C75850Tpm.LIZ(linkControlWidget.context, EnumC75769ToT.INVITE_TOPIC_PAIR, new AObjectS45S0400000_13(linkControlWidget, LIZLLL, cohostTopic, c75647TmV, 1), new AObjectS26S0000000_13(2));
                    } else {
                        C75650TmY.LJI(linkControlWidget.dataChannel, cohostTopic, c75647TmV);
                        LinkControlWidget.LJZL();
                    }
                }
                return C76800UCe.LIZ;
            case 1:
                lambda$onActivityCreated$15 = ((AbsAudienceInteractionFragment) aObjectS45S0101000_13.l0).lambda$onActivityCreated$15((C76800UCe) obj);
                return lambda$onActivityCreated$15;
            case 2:
                LivePlayFragment livePlayFragment = (LivePlayFragment) aObjectS45S0101000_13.l0;
                B3D Im = livePlayFragment.Im();
                if ((Im instanceof LiveRoomFragment) && Im.getCurrentFragment() == livePlayFragment) {
                    Im.y2();
                }
                return C76800UCe.LIZ;
            case 3:
                C44031HPv c44031HPv = (C44031HPv) aObjectS45S0101000_13.l0;
                Integer num = (Integer) obj;
                c44031HPv.getClass();
                if (num.intValue() == 2004 || num.intValue() == 2002) {
                    C5S1 c5s1 = new C5S1(c44031HPv.LJ.LIZIZ);
                    c5s1.LIZLLL(c44031HPv.LJ.LIZIZ.getResources().getString(R.string.ijy));
                    c5s1.LJ();
                } else if (num.intValue() == 2003) {
                    C5S1 c5s12 = new C5S1(c44031HPv.LJ.LIZIZ);
                    c5s12.LIZLLL(c44031HPv.LJ.LIZIZ.getResources().getString(R.string.ijx));
                    c5s12.LJ();
                } else if (num.intValue() == 2006) {
                    C5S1 c5s13 = new C5S1(c44031HPv.LJ.LIZIZ);
                    c5s13.LIZLLL(c44031HPv.LJ.LIZIZ.getResources().getString(R.string.g88));
                    c5s13.LJ();
                } else {
                    C5S1 c5s14 = new C5S1(c44031HPv.LJ.LIZIZ);
                    c5s14.LIZLLL(c44031HPv.LJ.LIZIZ.getResources().getString(R.string.ijw));
                    c5s14.LJ();
                }
                DialogC25756A8y dialogC25756A8y = c44031HPv.LJ.LIZ;
                if (dialogC25756A8y != null) {
                    V1B.LJLILLLLZI(dialogC25756A8y);
                }
                C62119OZn c62119OZn = c44031HPv.LJ.LJII;
                if (c62119OZn != null) {
                    c62119OZn.LIZ(num.intValue(), null);
                }
                return null;
            default:
                ((C188727au) aObjectS45S0101000_13.l0).LJI("is_ecommerce", (String) obj);
                return C76800UCe.LIZ;
        }
    }

    public static final Object invoke$2(AObjectS45S0101000_13 aObjectS45S0101000_13, Object obj) {
        switch (aObjectS45S0101000_13.i1) {
            case 0:
                BY9 by9 = (BY9) aObjectS45S0101000_13.l0;
                BYO.LIZ((LatestBanRecordInfo) obj, ((InterfaceC31336CRo) by9.mView).getContext(), (LifecycleOwner) by9.mView);
                return null;
            default:
                ((C82552Waa) aObjectS45S0101000_13.l0).LJFF();
                return null;
        }
    }

    public static final Object invoke$3(AObjectS45S0101000_13 aObjectS45S0101000_13, Object obj) {
        long LIZIZ;
        switch (aObjectS45S0101000_13.i1) {
            case 0:
                LiveWidget liveWidget = (LiveWidget) ((LifecycleOwner) aObjectS45S0101000_13.l0);
                Integer num = (Integer) obj;
                liveWidget.getClass();
                if (num.intValue() == 1) {
                    LIZIZ = C76265TwT.LIZIZ.LIZIZ();
                } else {
                    LIZIZ = C76265TwT.LIZ.LIZIZ();
                }
                DataChannel dataChannel = liveWidget.dataChannel;
                int intValue = num.intValue();
                LinkDialog linkDialog = new LinkDialog(liveWidget);
                EnumC76391TyV enumC76391TyV = EnumC76391TyV.TYPE_PK_BE_INVITED;
                C76091Ttf c76091Ttf = new C76091Ttf();
                c76091Ttf.LIZIZ = intValue;
                c76091Ttf.LIZJ = LIZIZ;
                linkDialog.Al(enumC76391TyV, c76091Ttf);
                C75842Tpe.LIZ(dataChannel, linkDialog, "LinkDialog");
                return C76800UCe.LIZ;
            case 1:
                CommentWidget commentWidget = (CommentWidget) ((LifecycleOwner) aObjectS45S0101000_13.l0);
                HashMap hashMap = (HashMap) obj;
                DataChannel dataChannel2 = commentWidget.dataChannel;
                if (dataChannel2 != null && hashMap.containsKey(dataChannel2.kv0(DrawGuessRoundIdChannel.class))) {
                    commentWidget.LLF = false;
                    commentWidget.LLILZLL();
                }
                return C76800UCe.LIZ;
            case 2:
                LiveRoomUserInfoWidget liveRoomUserInfoWidget = (LiveRoomUserInfoWidget) ((LifecycleOwner) aObjectS45S0101000_13.l0);
                liveRoomUserInfoWidget.LLILL(liveRoomUserInfoWidget.LLILZ + 1);
                return C76800UCe.LIZ;
            default:
                AnonymousClass634 anonymousClass634 = (AnonymousClass634) obj;
                VideoPublishEditModel videoPublishEditModel = ((VideoEditContainerScene) ((LifecycleOwner) aObjectS45S0101000_13.l0)).LJZL;
                if (videoPublishEditModel != null) {
                    anonymousClass634.LJII = C79004UzY.LJJIIJ(videoPublishEditModel.canvasVideoData);
                }
                return C76800UCe.LIZ;
        }
    }

    public static final Object invoke$4(AObjectS45S0101000_13 aObjectS45S0101000_13, Object obj) {
        String str;
        Room room;
        switch (aObjectS45S0101000_13.i1) {
            case 0:
                LinkControlWidget linkControlWidget = (LinkControlWidget) ((LiveWidget) aObjectS45S0101000_13.l0);
                boolean booleanValue = ((Boolean) linkControlWidget.dataChannel.kv0(C75504TkC.class)).booleanValue();
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("MultiGuestAnchorInProgressEvent, event = ");
                LIZ.append(obj);
                LIZ.append(" multiMode = ");
                LIZ.append(booleanValue);
                C0NB.LJIIIZ("LinkControlWidget", X1D.LIZIZ(LIZ));
                if (booleanValue) {
                    C8E.LIZLLL().LLIZLLLIL();
                } else {
                    boolean z = B5G.LIZIZ().LIZLLL;
                    boolean z2 = B5G.LIZIZ().LJIIL;
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("receive MultiGuestAnchorInProgressChanged, isStaring = ");
                    LIZ2.append(z);
                    LIZ2.append("  isStarter = ");
                    LIZ2.append(z2);
                    C0NB.LJIIIZ("LinkControlWidget", X1D.LIZIZ(LIZ2));
                    if (z) {
                        if (z2) {
                            C75492Tk0 c75492Tk0 = linkControlWidget.LJLJLJ;
                            c75492Tk0.getClass();
                            B5G.LIZIZ().LJJIJIL = -1;
                            DataChannel dataChannel = c75492Tk0.dataChannel;
                            if (dataChannel != null) {
                                dataChannel.rv0(CoHostInviteCountDownUpdateChannel.class, -1);
                            }
                            C75492Tk0 c75492Tk02 = linkControlWidget.LJLJLJ;
                            EnumC2321799h enumC2321799h = EnumC2321799h.INTERRUPT_BY_MULTI_GUEST;
                            c75492Tk02.getClass();
                            HashMap hashMap = new HashMap();
                            hashMap.put("cancel_reason", enumC2321799h);
                            LinkerManager linkerManager = c75492Tk02.linkerManager;
                            if (linkerManager != null) {
                                EnumC75465TjZ scene = EnumC75465TjZ.COHOST;
                                o.LJIIIZ(scene, "scene");
                                AbstractC75469Tjd abstractC75469Tjd = linkerManager.LIZLLL.get(scene);
                                if (abstractC75469Tjd != null && (abstractC75469Tjd instanceof C75550Tkw)) {
                                    abstractC75469Tjd.LIZ(hashMap);
                                    ((C75550Tkw) abstractC75469Tjd).LIZLLL();
                                }
                            }
                            B5G.LIZIZ().LJJIJIL = -1;
                            DataChannel dataChannel2 = c75492Tk02.dataChannel;
                            if (dataChannel2 != null) {
                                dataChannel2.rv0(CoHostInviteCountDownUpdateChannel.class, -1);
                            }
                        } else {
                            C75492Tk0 c75492Tk03 = linkControlWidget.LJLJLJ;
                            c75492Tk03.getClass();
                            HashMap LIZ3 = C45243HpH.LIZ("event", "LinkCross_Reply_RtcJoinChannelFailed", "extra", "");
                            LinkCrossRoomDataHolder LIZIZ = B5G.LIZIZ();
                            if (LIZIZ.LJIIL) {
                                str = "inviter";
                            } else {
                                str = "invitee";
                            }
                            LIZ3.put("role", str);
                            LIZ3.put("inviteType", Integer.valueOf(LIZIZ.LJIIJ.getType()));
                            LIZ3.put("channelId", Long.valueOf(LIZIZ.LJFF));
                            LIZ3.put("fromRoomId", Long.valueOf(LIZIZ.LJII));
                            LIZ3.put("currentRoomId", Long.valueOf(LIZIZ.LIZ));
                            LIZ3.put("linkMicId", LIZIZ.LJJIJIIJI);
                            LIZ3.put("guestLinkMicId", LIZIZ.LJJIJIIJIL);
                            LIZ3.put("guestUserId", Long.valueOf(LIZIZ.LJI));
                            Config.Vendor fromValue = Config.Vendor.fromValue(LIZIZ.LJIILJJIL);
                            o.LJIIIIZZ(fromValue, "fromValue(linkMicVendor)");
                            LIZ3.put("linkMicVendor", Integer.valueOf(fromValue.getValue()));
                            LIZ3.put("rtcExtInfo", LIZIZ.LJJI);
                            LIZ3.put("duration", 0);
                            TYQ.LJ(LIZ3);
                            HashMap LJIILJJIL = C75192TfA.LJIILJJIL();
                            LJIILJJIL.put("reply_status", 11);
                            LinkerManager linkerManager2 = c75492Tk03.linkerManager;
                            if (linkerManager2 != null) {
                                EnumC75465TjZ scene2 = EnumC75465TjZ.COHOST;
                                o.LJIIIZ(scene2, "scene");
                                AbstractC75469Tjd abstractC75469Tjd2 = linkerManager2.LIZLLL.get(scene2);
                                if (abstractC75469Tjd2 instanceof C75550Tkw) {
                                    AbstractC73638SvC<C75513TkL> LIZIZ2 = abstractC75469Tjd2.LIZIZ(LJIILJJIL);
                                    if (LIZIZ2 != null) {
                                        ((InterfaceC29205BdB) LIZIZ2.LIZLLL(c75492Tk03.autoDisposeWithTransformer())).LIZJ(new AfS40S0000000_13(2), new AfS36S0101000_5(0, c75492Tk03, 39));
                                    }
                                    ((C75550Tkw) abstractC75469Tjd2).LIZLLL();
                                }
                            }
                        }
                    }
                }
                LinkControlWidget.LJZL();
                return C76800UCe.LIZ;
            default:
                LiveRoomUserInfoWidget liveRoomUserInfoWidget = (LiveRoomUserInfoWidget) ((LiveWidget) aObjectS45S0101000_13.l0);
                Boolean bool = (Boolean) obj;
                if ((Boolean.TRUE.equals(liveRoomUserInfoWidget.dataChannel.kv0(UserIsAnchorChannel.class)) || !((IMicRoomService) CN1.LIZ(IMicRoomService.class)).rk()) && (room = liveRoomUserInfoWidget.LLILIL) != null && room.getStreamType() != LiveMode.LIVE_VOICE && liveRoomUserInfoWidget.LJLJJL.getMuteIconVisible() != bool) {
                    liveRoomUserInfoWidget.LJLJJL.setMuteIconVisibility(bool.booleanValue());
                }
                return C76800UCe.LIZ;
        }
    }

    public static final Object invoke$5(AObjectS45S0101000_13 aObjectS45S0101000_13, Object obj) {
        switch (aObjectS45S0101000_13.i1) {
            case 0:
                LinkControlWidget linkControlWidget = (LinkControlWidget) aObjectS45S0101000_13.l0;
                EnumC75636TmK enumC75636TmK = (EnumC75636TmK) obj;
                linkControlWidget.getClass();
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("co-host state: ");
                LIZ.append(enumC75636TmK.name());
                C0NB.LJIIIZ("LinkControlWidget", X1D.LIZIZ(LIZ));
                if (linkControlWidget.LLF != null && enumC75636TmK.getState() == linkControlWidget.LLF.getState()) {
                    return C76800UCe.LIZ;
                }
                linkControlWidget.LLF = enumC75636TmK;
                switch (C75632TmG.LIZIZ[enumC75636TmK.ordinal()]) {
                    case 1:
                    case 2:
                        linkControlWidget.dataChannel.qv0(LinkStateForH5Event.class, new C30898CAs("normal"));
                        C31611Cat.LIZ = "normal";
                        break;
                    case 3:
                    case 4:
                        linkControlWidget.dataChannel.qv0(LinkStateForH5Event.class, new C30898CAs("co_host_inviting"));
                        C31611Cat.LIZ = "co_host_inviting";
                        break;
                    case 5:
                    case 6:
                        linkControlWidget.dataChannel.qv0(LinkStateForH5Event.class, new C30898CAs("co_host"));
                        C31611Cat.LIZ = "co_host";
                        break;
                }
                return C76800UCe.LIZ;
            case 1:
                return AbsAudienceInteractionFragment.lambda$loadWidgetWithFirstFrameP2$53((InterfaceC29879Bo3) aObjectS45S0101000_13.l0, (C28954BXy) obj);
            case 2:
                LandscapeAudienceInteractionFragment landscapeAudienceInteractionFragment = (LandscapeAudienceInteractionFragment) aObjectS45S0101000_13.l0;
                boolean z = !landscapeAudienceInteractionFragment.LJLJJLL;
                landscapeAudienceInteractionFragment.LJLJJLL = z;
                InterfaceC30442Bx8.LLLI.LIZ(Boolean.valueOf(z));
                landscapeAudienceInteractionFragment.sn();
                if (landscapeAudienceInteractionFragment.LJLJJLL) {
                    landscapeAudienceInteractionFragment.LJLJJL = true;
                    landscapeAudienceInteractionFragment.tn();
                }
                landscapeAudienceInteractionFragment.qn(1);
                return C76800UCe.LIZ;
            case 3:
                C176996x5 c176996x5 = (C176996x5) aObjectS45S0101000_13.l0;
                C177336xd c177336xd = (C177336xd) obj;
                c177336xd.LJLLI = c176996x5.LJIIZILJ();
                c177336xd.LJLIL = c176996x5.LJLLJ;
                c177336xd.LJLJJL = c176996x5.LJLJJI.getEnterMethod();
                c177336xd.LJLILLLLZI = c176996x5.LJIL();
                c177336xd.LJLJJLL = c176996x5.LJIJJLI();
                c177336xd.LJLL = c176996x5.LJLJJI.getCommentInputViewType();
                c176996x5.LJLJJI.hasUpvoteOption();
                c176996x5.LJJIII();
                c177336xd.LIZ(c176996x5.LJIJ());
                return null;
            case 4:
                ((C59273NOb) aObjectS45S0101000_13.l0).LJJLIIIJLLLLLLLZ = ((Boolean) obj).booleanValue();
                return null;
            default:
                Fragment fragment = (Fragment) aObjectS45S0101000_13.l0;
                fragment.getClass();
                KR8.LJI(((Integer) obj).intValue(), fragment);
                return null;
        }
    }

    public static final Object invoke$6(AObjectS45S0101000_13 aObjectS45S0101000_13, Object obj) {
        View view;
        C76800UCe lambda$showLogoutDialogInternal$10;
        switch (aObjectS45S0101000_13.i1) {
            case 0:
                InterfaceC75476Tjk onBubbleCallBack = (InterfaceC75476Tjk) obj;
                C75154TeY c75154TeY = ((LinkControlWidget) ((LifecycleOwner) aObjectS45S0101000_13.l0)).LJLLLL;
                c75154TeY.getClass();
                o.LJIIIZ(onBubbleCallBack, "onBubbleCallBack");
                C0NB.LIZIZ("ToolbarInteractDelegate", "showMultiGuestReservationBubble");
                C75150TeU c75150TeU = c75154TeY.LIZIZ;
                c75150TeU.getClass();
                InterfaceC30237Btp interfaceC30237Btp = c75150TeU.LJLJLLL;
                if (interfaceC30237Btp != null) {
                    view = interfaceC30237Btp.LJFF();
                } else {
                    view = null;
                }
                C75466Tja c75466Tja = new C75466Tja(view);
                c75466Tja.LJIL = new ACListenerS47S0200000_13(onBubbleCallBack, c75150TeU, 30);
                c75466Tja.LJI = 5000L;
                c75466Tja.LJII = true;
                List<ImageModel> image = onBubbleCallBack.LIZIZ();
                o.LJIIIZ(image, "image");
                c75466Tja.LJIJJLI = image;
                c75466Tja.LJJIFFI = 2;
                c75466Tja.LJIILLIIL = onBubbleCallBack.LIZJ();
                c75466Tja.LJIIIIZZ = C15380j0.LIZ(288.0f);
                c75466Tja.LJIIIZ = true;
                c75150TeU.LLFF.LIZIZ(C75150TeU.LLIIIILZ[0], c75150TeU, Long.valueOf(C30770C5u.LJIIIIZZ(new C75467Tjb(c75466Tja, c75466Tja))));
                return C76800UCe.LIZ;
            case 1:
                MultiGuestPreviewFragment multiGuestPreviewFragment = (MultiGuestPreviewFragment) ((LifecycleOwner) aObjectS45S0101000_13.l0);
                multiGuestPreviewFragment.LLIL = false;
                multiGuestPreviewFragment.om("business_unknown");
                return C76800UCe.LIZ;
            case 2:
                ((LivePlayFragment) ((LifecycleOwner) aObjectS45S0101000_13.l0)).zm((C2308394d) obj);
                return C76800UCe.LIZ;
            case 3:
                lambda$showLogoutDialogInternal$10 = ((I18nSettingNewVersionFragment) ((LifecycleOwner) aObjectS45S0101000_13.l0)).lambda$showLogoutDialogInternal$10((ARN) obj);
                return lambda$showLogoutDialogInternal$10;
            default:
                return C83591WrL.b3((C83591WrL) ((LifecycleOwner) aObjectS45S0101000_13.l0), (VECameraSettings.Builder) obj);
        }
    }

    public static final Object invoke$7(AObjectS45S0101000_13 aObjectS45S0101000_13, Object obj) {
        Object kv0;
        C75492Tk0 c75492Tk0;
        switch (aObjectS45S0101000_13.i1) {
            case 0:
                LinkControlWidget linkControlWidget = (LinkControlWidget) ((LifecycleOwner) aObjectS45S0101000_13.l0);
                IRX irx = (IRX) obj;
                linkControlWidget.getClass();
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("CoHostInProgressChanged, event = ");
                LIZ.append(irx);
                C0NB.LJIIIZ("LinkControlWidget", X1D.LIZIZ(LIZ));
                if (irx != null && !irx.LIZ && (kv0 = linkControlWidget.dataChannel.kv0(C74967TbX.class)) != null && kv0 != TZJ.USER_CLICK && (c75492Tk0 = linkControlWidget.LJLJLJ) != null) {
                    c75492Tk0.LJJJJJ(EnumC74990Tbu.RESTART_AFTER_CO_HOST);
                }
                return C76800UCe.LIZ;
            case 1:
                LiveRoomUserInfoWidget liveRoomUserInfoWidget = (LiveRoomUserInfoWidget) ((LifecycleOwner) aObjectS45S0101000_13.l0);
                Boolean bool = (Boolean) obj;
                if (liveRoomUserInfoWidget.LJLJJL.getMuteIconVisible() != bool) {
                    liveRoomUserInfoWidget.LJLJJL.setMuteIconVisibility(bool.booleanValue());
                }
                return C76800UCe.LIZ;
            default:
                Fragment fragment = (Fragment) ((LifecycleOwner) aObjectS45S0101000_13.l0);
                fragment.getClass();
                KR8.LJI(((Integer) obj).intValue(), fragment);
                return null;
        }
    }

    public static final Object invoke$8(AObjectS45S0101000_13 aObjectS45S0101000_13, Object obj) {
        EnumC76178Tv4 LJ;
        switch (aObjectS45S0101000_13.i1) {
            case 0:
                LinkControlWidget linkControlWidget = (LinkControlWidget) aObjectS45S0101000_13.l0;
                EnumC76178Tv4 enumC76178Tv4 = (EnumC76178Tv4) obj;
                linkControlWidget.getClass();
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Rematch state: ");
                LIZ.append(enumC76178Tv4.name());
                C0NB.LJIIIZ("LinkControlWidget", X1D.LIZIZ(LIZ));
                EnumC76178Tv4 enumC76178Tv42 = linkControlWidget.LLFFF;
                if (enumC76178Tv42 != null && enumC76178Tv42.equals(enumC76178Tv4)) {
                    return C76800UCe.LIZ;
                }
                linkControlWidget.LLFFF = enumC76178Tv4;
                int i = C75632TmG.LIZ[enumC76178Tv4.ordinal()];
                if (i != 1) {
                    if (i == 2 && (LJ = C76265TwT.LIZ.LJ()) != null && LJ.equals(EnumC76178Tv4.PUNISH)) {
                        linkControlWidget.dataChannel.qv0(LinkStateForH5Event.class, new C30898CAs("punishing"));
                        C31611Cat.LIZ = "punishing";
                    }
                } else {
                    linkControlWidget.dataChannel.qv0(LinkStateForH5Event.class, new C30898CAs("rematch_inviting"));
                    C31611Cat.LIZ = "rematch_inviting";
                }
                return C76800UCe.LIZ;
            case 1:
                LandscapeAudienceInteractionFragment landscapeAudienceInteractionFragment = (LandscapeAudienceInteractionFragment) aObjectS45S0101000_13.l0;
                landscapeAudienceInteractionFragment.getClass();
                landscapeAudienceInteractionFragment.LJLILLLLZI = ((Boolean) ((OSZ) obj).getFirst()).booleanValue();
                return C76800UCe.LIZ;
            case 2:
                C176996x5 c176996x5 = (C176996x5) aObjectS45S0101000_13.l0;
                C177336xd c177336xd = (C177336xd) obj;
                c177336xd.LJLLI = c176996x5.LJIIZILJ();
                c177336xd.LJLIL = c176996x5.LJLLJ;
                c177336xd.LJLJJL = c176996x5.LJLJJI.getEnterMethod();
                c177336xd.LJLILLLLZI = c176996x5.LJIL();
                c177336xd.LJLJJLL = c176996x5.LJIJJLI();
                c177336xd.LJLL = c176996x5.LJLJJI.getCommentInputViewType();
                c176996x5.LJLJJI.hasUpvoteOption();
                c176996x5.LJJIII();
                c177336xd.LIZ(c176996x5.LJIJ());
                return null;
            default:
                ((BusinessService.Business) aObjectS45S0101000_13.l0).LIZIZ.LIZIZ.LJJLIIIJ = ((Integer) obj).intValue();
                return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$9(AObjectS45S0101000_13 aObjectS45S0101000_13, Object obj) {
        C31089CIb c31089CIb;
        T t;
        SubscribeBadge subscribeBadge = null;
        switch (aObjectS45S0101000_13.i1) {
            case 0:
                if (((LinkControlWidget) ((LifecycleOwner) aObjectS45S0101000_13.l0)).LJLLI) {
                    return C76800UCe.LIZ;
                }
                String connectionType = ((IInteractService) CN1.LIZ(IInteractService.class)).getConnectionType();
                B4U.LIZ().LJLLILLLL = connectionType;
                BJN.LIZJ(connectionType);
                return C76800UCe.LIZ;
            case 1:
                CommentWidget commentWidget = (CommentWidget) ((LifecycleOwner) aObjectS45S0101000_13.l0);
                Boolean bool = (Boolean) obj;
                if (commentWidget.LLILLIZIL != null) {
                    if (bool.booleanValue()) {
                        LiveEmojiInputDialogFragment liveEmojiInputDialogFragment = commentWidget.LLILLIZIL;
                        if (liveEmojiInputDialogFragment.LJLJI && (c31089CIb = liveEmojiInputDialogFragment.LLI) != null) {
                            c31089CIb.requestFocus();
                            C79057V0z.LJJJJZ(liveEmojiInputDialogFragment.getContext(), liveEmojiInputDialogFragment.LLI);
                        }
                    } else {
                        commentWidget.LLILLIZIL.Hl();
                    }
                }
                return C76800UCe.LIZ;
            case 2:
                LiveRoomUserInfoWidget liveRoomUserInfoWidget = (LiveRoomUserInfoWidget) ((LifecycleOwner) aObjectS45S0101000_13.l0);
                C29742Blq c29742Blq = (C29742Blq) obj;
                Room room = liveRoomUserInfoWidget.LLILIL;
                if (room != null && room.getOwner() != null && liveRoomUserInfoWidget.LLILIL.getOwner().getSubscribeInfo() != null) {
                    SubscribeInfo subscribeInfo = liveRoomUserInfoWidget.LLILIL.getOwner().getSubscribeInfo();
                    if (c29742Blq != null) {
                        subscribeBadge = c29742Blq.LIZ;
                    }
                    subscribeInfo.setSubscribeBadge(subscribeBadge);
                    liveRoomUserInfoWidget.LLILIL.getOwner().setSubscribeStatus(true);
                    ((ISubscribeService) CN1.LIZ(ISubscribeService.class)).Dr0();
                    C29727Blb c29727Blb = liveRoomUserInfoWidget.LLJILJILJ;
                    if (c29727Blb.LJIIL != EnumC29732Blg.UNFOLLOW) {
                        if (liveRoomUserInfoWidget.LLJJI) {
                            c29727Blb.LIZ(EnumC29732Blg.SUBSCRIBE_ANIM);
                        } else {
                            c29727Blb.LIZ(EnumC29732Blg.SUBSCRIBED);
                        }
                    }
                }
                return C76800UCe.LIZ;
            default:
                AwemeListFragmentImpl awemeListFragmentImpl = (AwemeListFragmentImpl) ((LifecycleOwner) aObjectS45S0101000_13.l0);
                C43I c43i = (C43I) obj;
                awemeListFragmentImpl.getClass();
                if (c43i != null && (t = c43i.LIZ) != 0) {
                    String str = (String) ((OSZ) t).getFirst();
                    Music music = (Music) ((OSZ) c43i.LIZ).getSecond();
                    Iterator it = awemeListFragmentImpl.LJZ.mmItems.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            Aweme aweme = (Aweme) it.next();
                            if (TextUtils.equals(str, aweme.getAid())) {
                                aweme.setAddedSoundMusicInfo(music);
                                aweme.setMusic(music);
                                if (aweme.getVideo() != null) {
                                    Video video = aweme.getVideo();
                                    if (video.getPlayAddr() != null && music.getPlayUrl() != null) {
                                        video.getPlayAddr().setUri(music.getPlayUrl().getUri());
                                        video.getPlayAddr().setUrlList(music.getPlayUrl().getUrlList());
                                        video.getPlayAddr().setWidth(music.getPlayUrl().getWidth());
                                        video.getPlayAddr().setHeight(music.getPlayUrl().getHeight());
                                        video.getPlayAddr().setUrlKey(String.valueOf(music.getId()));
                                    }
                                    aweme.setVideo(video);
                                }
                                aweme.getStatus().getVideoMuteInfo().setAudioChangeStatus(0);
                                aweme.getStatus().getVideoMuteInfo().setIsMute(Boolean.FALSE);
                                aweme.getStatus().getVideoMuteInfo().setCopyrightViolation(false);
                                aweme.getStatus().getVideoMuteInfo().setMuteDesc("");
                                AwemeService.LIZ().R1(aweme);
                                awemeListFragmentImpl.LJZ.notifyDataSetChanged();
                            }
                        }
                    }
                }
                return null;
        }
    }

    public AObjectS45S0101000_13(int i, Object obj, int i2) {
        this.$t = i2;
        this.i1 = i;
        this.l0 = obj;
    }
}
