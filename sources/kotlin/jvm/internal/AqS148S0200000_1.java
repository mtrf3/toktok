package kotlin.jvm.internal;

import X.ALX;
import X.ASQ;
import X.ASX;
import X.AbstractC029409q;
import X.AbstractC57781Mm1;
import X.AbstractC65781Prl;
import X.ActivityC45651qj;
import X.AnonymousClass357;
import X.AnonymousClass476;
import X.AnonymousClass488;
import X.C04270Et;
import X.C06460Ne;
import X.C101713yx;
import X.C107204Iq;
import X.C109214Qj;
import X.C109354Qx;
import X.C109544Rq;
import X.C110614Vt;
import X.C112874br;
import X.C113024c6;
import X.C113554cx;
import X.C115464g2;
import X.C117814jp;
import X.C117874jv;
import X.C132805Jc;
import X.C16230kN;
import X.C16880lQ;
import X.C19N;
import X.C212428Vi;
import X.C25600zU;
import X.C26045AKb;
import X.C26220AQu;
import X.C26224AQy;
import X.C26231ARf;
import X.C28871Bj;
import X.C29701Eo;
import X.C2K0;
import X.C2KO;
import X.C2KQ;
import X.C2LH;
import X.C2NU;
import X.C33A;
import X.C34B;
import X.C36576EXc;
import X.C38350F3i;
import X.C3C5;
import X.C3FW;
import X.C3GN;
import X.C3GT;
import X.C3GV;
import X.C3Q9;
import X.C3R2;
import X.C3R9;
import X.C3U1;
import X.C45382HrW;
import X.C46V;
import X.C48841JEv;
import X.C49D;
import X.C49G;
import X.C4AO;
import X.C4BU;
import X.C4EF;
import X.C4HF;
import X.C4R2;
import X.C4WC;
import X.C4YJ;
import X.C53330KwQ;
import X.C55096Ljo;
import X.C57285Me1;
import X.C57430MgM;
import X.C60542Ze;
import X.C61447O9r;
import X.C61878OQg;
import X.C63120Opw;
import X.C67452kn;
import X.C67462ko;
import X.C68322mC;
import X.C69422ny;
import X.C70922qO;
import X.C70972qT;
import X.C71052qb;
import X.C71082qe;
import X.C71893SJl;
import X.C72242sW;
import X.C73305Spp;
import X.C73340SqO;
import X.C75732y9;
import X.C75762yC;
import X.C75782yE;
import X.C76262z0;
import X.C76732zl;
import X.C76800UCe;
import X.C772831o;
import X.C776532z;
import X.C776833c;
import X.C776933d;
import X.C785636m;
import X.C785736n;
import X.C785836o;
import X.C78613UtF;
import X.C7MY;
import X.C7ZH;
import X.C81273Gx;
import X.C81573Ib;
import X.C83593Pv;
import X.C83613Px;
import X.C84683Ua;
import X.C85323Wm;
import X.C87881YeL;
import X.C87882YeM;
import X.C87885YeP;
import X.C87886YeQ;
import X.C88213dB;
import X.C90643h6;
import X.C90653h7;
import X.C90663h8;
import X.C93973mT;
import X.C94083me;
import X.C94723ng;
import X.C95393ol;
import X.C96823r4;
import X.C96963rI;
import X.C97063rS;
import X.C97123rY;
import X.C97293rp;
import X.C97343ru;
import X.C97353rv;
import X.C98523to;
import X.C98593tv;
import X.C99033ud;
import X.C99W;
import X.EnumC101493yb;
import X.EnumC101633yp;
import X.EnumC112374b3;
import X.EnumC112404b6;
import X.EnumC112754bf;
import X.EnumC40672Fxk;
import X.EnumC57365MfJ;
import X.HG3;
import X.InterfaceC105124Aq;
import X.InterfaceC41771GaN;
import X.InterfaceC55235Lm3;
import X.InterfaceC65784Pro;
import X.InterfaceC70982qU;
import X.InterfaceC71012qX;
import X.InterfaceC88472Yns;
import X.InterfaceC89073eZ;
import X.InterfaceC98813uH;
import X.ORZ;
import X.OSZ;
import X.PU6;
import X.RBX;
import X.S3N;
import X.ViewOnClickListenerC112504bG;
import X.ViewOnClickListenerC13880ga;
import X.ViewOnClickListenerC85343Wo;
import X.ViewOnTouchListenerC93253lJ;
import X.X1D;
import X.XJL;
import X.XKS;
import X.XKX;
import Y.ACListenerS21S0100000_1;
import Y.AObserverS65S0200000_1;
import Y.ARunnableS20S0200000_1;
import Y.ARunnableS37S0100000_1;
import Y.IDCListenerS242S0100000_1;
import Y.IDcS364S0100000_1;
import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import android.text.Spanned;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelKt;
import com.byted.cast.common.bean.SinkDeviceInfo;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastTaskResourceIdSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3MaskAvatarSizeTestSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.assem.arch.core.UIAssem;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.google.android.play.core.assetpacks.w0;
import com.google.gson.j;
import com.google.gson.m;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.common.EventLiveData;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.widget.PdpHeadNavBarWidget;
import com.ss.android.ugc.aweme.feed.assem.generalmask.GeneralVideoMaskAssem;
import com.ss.android.ugc.aweme.feed.assem.generalmask.GeneralVideoMaskVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.MaskExtraModule;
import com.ss.android.ugc.aweme.feed.model.MaskPopText;
import com.ss.android.ugc.aweme.feed.model.MaskPopWindow;
import com.ss.android.ugc.aweme.feed.model.TextWithInlineLink;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.FakeMessageContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.UserRecommendationContent;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.InputViewDelegate;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.read.viewmodel.SessionListReadStatusViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.reply.feature.feed.DetailFeedKeyboardDialogFragment;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.socialpublish.viewmodel.InboxSocPubStatusViewModelImpl;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.stickercreation.fragment.VideoCreationTailFragment;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.stickercreation.viewmodel.VideoStickerCreationViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.tikbot.view.TakoInputView;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.tikbot.voice2text.vm.TakoSpeechViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.BaseChatPanel;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnotice.single.SingleChatNoticeAssem;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnotice.single.SingleChatNoticeViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.FakeMessageViewModel;
import com.ss.android.ugc.aweme.im.sdk.chatlist.feature.focused.ui.FocusedSessionListWidget;
import com.ss.android.ugc.aweme.im.sdk.chatlist.feature.sessionrefactor.InboxSessionDataProvider;
import com.ss.android.ugc.aweme.im.sdk.chatlist.feature.stranger.assems.MessageRequestStatusAssem;
import com.ss.android.ugc.aweme.im.sdk.chatlist.feature.stranger.ui.MessageRequestViewModel;
import com.ss.android.ugc.aweme.im.sdk.chatlist.ui.fragment.SessionListFragmentV2;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.sdk.search.data.SingleRecentContactData;
import com.ss.android.ugc.aweme.im.sdk.search.data.api.SearchDoc;
import com.ss.android.ugc.aweme.im.service.IIMService;
import com.ss.android.ugc.aweme.im.service.model.ActivityStatus;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.inbox.InboxFragment;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.mutual.MutualRelationEmptyCell;
import com.ss.android.ugc.aweme.relation.mutual.MutualRelationViewModel;
import com.ss.android.ugc.aweme.shortvideo.dm.DMEncryptedImageContent;
import com.ss.android.ugc.feed.platform.panel.downloadbar.DownloadBarComponent;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.o;
import org.json.JSONObject;
import yq4.a;

/* loaded from: classes2.dex */
public class AqS148S0200000_1 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public Object l0;
    public Object l1;

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
            case 27:
                return invoke$27(this);
            case 28:
                return invoke$28(this);
            case 29:
                return invoke$29(this);
            case 30:
                return invoke$30(this);
            case 31:
                return invoke$31(this);
            case 32:
                return invoke$32(this);
            case 33:
                return invoke$33(this);
            case 34:
                return invoke$34(this);
            case 35:
                return invoke$35(this);
            case 36:
                return invoke$36(this);
            case 37:
                return invoke$37(this);
            case 38:
                return invoke$38(this);
            case 39:
                return invoke$39(this);
            case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_40 /* 40 */:
                return invoke$40(this);
            case 41:
                return invoke$41(this);
            case 42:
                return invoke$42(this);
            case LiveBroadcastTaskResourceIdSetting.DEFAULT /* 43 */:
                return invoke$43(this);
            case 44:
                return invoke$44(this);
            case 45:
                return invoke$45(this);
            case 46:
                return invoke$46(this);
            case 47:
                return invoke$47(this);
            case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_48 /* 48 */:
                return invoke$48(this);
            case C61447O9r.LJIIJ:
                return invoke$49(this);
            case 50:
                return invoke$50(this);
            case 51:
                return invoke$51(this);
            case 52:
                return invoke$52(this);
            case 53:
                return invoke$53(this);
            case 54:
                return invoke$54(this);
            case 55:
                return invoke$55(this);
            case 56:
                return invoke$56(this);
            case 57:
                return invoke$57(this);
            case 58:
                return invoke$58(this);
            case 59:
                return invoke$59(this);
            case 60:
                return invoke$60(this);
            case 61:
                return invoke$61(this);
            case BaseNotice.CREATOR /* 62 */:
                return invoke$62(this);
            case 63:
                return invoke$63(this);
            case 64:
                return invoke$64(this);
            default:
                return null;
        }
    }

    public final void invoke$1() {
        C4YJ c4yj = (C4YJ) this.l0;
        if (!c4yj.LJLILLLLZI) {
            c4yj.LJLILLLLZI = true;
            C16880lQ.LLLLIILL(C16880lQ.LLZIL((Context) this.l1), R.layout.b96, (C4YJ) this.l0, true);
            C4YJ c4yj2 = (C4YJ) this.l0;
            c4yj2.setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS21S0100000_1(c4yj2, 44)));
            C4YJ c4yj3 = (C4YJ) this.l0;
            c4yj3.addOnAttachStateChangeListener(new IDCListenerS242S0100000_1(c4yj3, 0));
        }
    }

    public final void invoke$0() {
        InterfaceC70982qU interfaceC70982qU;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setSinkDeviceInfoListener onSuccess ");
        SinkDeviceInfo sinkDeviceInfo = (SinkDeviceInfo) this.l0;
        String str = null;
        if (sinkDeviceInfo != null) {
            str = sinkDeviceInfo.name;
        }
        LIZ.append(str);
        C70922qO.LIZ("CastingManager", X1D.LIZIZ(LIZ));
        SinkDeviceInfo sinkDeviceInfo2 = (SinkDeviceInfo) this.l0;
        if (sinkDeviceInfo2 != null && (interfaceC70982qU = ((C71052qb) this.l1).LJI) != null) {
            interfaceC70982qU.LJFF(sinkDeviceInfo2);
            if (C76800UCe.LIZ != null) {
                return;
            }
        }
        InterfaceC70982qU interfaceC70982qU2 = ((C71052qb) this.l1).LJI;
        if (interfaceC70982qU2 != null) {
            interfaceC70982qU2.LIZIZ();
        }
    }

    public static final Object invoke$0(AqS148S0200000_1 aqS148S0200000_1) {
        Context context = (Context) aqS148S0200000_1.l0;
        if (context != null) {
            final AnonymousClass488 anonymousClass488 = (AnonymousClass488) aqS148S0200000_1.l1;
            return new C16230kN(context, new GestureDetector.SimpleOnGestureListener() { // from class: X.48C
                @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
                public final boolean onDoubleTap(MotionEvent e) {
                    o.LJIIIZ(e, "e");
                    InterfaceC1039746f interfaceC1039746f = AnonymousClass488.this.LJZ;
                    if (interfaceC1039746f != null) {
                        interfaceC1039746f.LIZ("double_click", true);
                    }
                    return true;
                }

                @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
                public final boolean onSingleTapConfirmed(MotionEvent e) {
                    o.LJIIIZ(e, "e");
                    AnonymousClass488 anonymousClass4882 = AnonymousClass488.this;
                    View.OnClickListener onClickListener = anonymousClass4882.LJLZ;
                    if (onClickListener != null) {
                        onClickListener.onClick(anonymousClass4882);
                        return true;
                    }
                    return true;
                }
            });
        }
        return null;
    }

    public static final Object invoke$1(AqS148S0200000_1 aqS148S0200000_1) {
        ((InterfaceC88472Yns) aqS148S0200000_1.l1).invoke(Integer.valueOf(((C33A) aqS148S0200000_1.l0).LIZIZ.LIZIZ().LJLILLLLZI.size()));
        C776933d c776933d = ((C33A) aqS148S0200000_1.l0).LIZIZ;
        c776933d.LIZLLL.LJFF("delete all recent contacts");
        c776933d.LJ = false;
        Keva.getRepo(c776933d.LIZLLL()).storeString("recent_contact_data", null);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$10(AqS148S0200000_1 aqS148S0200000_1) {
        ((PdpHeadNavBarWidget) aqS148S0200000_1.l0).replaceIconRes((View) aqS148S0200000_1.l1, R.raw.icon_ellipsis_horizontal);
        return C76800UCe.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$11(AqS148S0200000_1 aqS148S0200000_1) {
        aqS148S0200000_1.invoke$1();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$12(AqS148S0200000_1 aqS148S0200000_1) {
        DetailFeedKeyboardDialogFragment.Hl((DetailFeedKeyboardDialogFragment) aqS148S0200000_1.l0, (View) aqS148S0200000_1.l1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$13(AqS148S0200000_1 aqS148S0200000_1) {
        Fragment fragment;
        LifecycleOwner lifecycleOwner = (LifecycleOwner) aqS148S0200000_1.l0;
        if (!(lifecycleOwner instanceof Fragment) || (fragment = (Fragment) lifecycleOwner) == null) {
            return null;
        }
        return C97123rY.LIZ(fragment, (C98523to) aqS148S0200000_1.l1);
    }

    public static final Object invoke$14(AqS148S0200000_1 aqS148S0200000_1) {
        ((MessageRequestViewModel) ((MessageRequestStatusAssem) aqS148S0200000_1.l0).LJLIL.getValue()).iv0(((UIAssem) aqS148S0200000_1.l1).getContainerView());
        return C76800UCe.LIZ;
    }

    public static final Object invoke$15(AqS148S0200000_1 aqS148S0200000_1) {
        Lifecycle lifecycle;
        ActivityC45651qj mo49getActivity = ((SessionListFragmentV2) aqS148S0200000_1.l0).mo49getActivity();
        if (mo49getActivity != null && (lifecycle = mo49getActivity.getLifecycle()) != null) {
            lifecycle.addObserver((SessionListReadStatusViewModel) aqS148S0200000_1.l1);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$16(AqS148S0200000_1 aqS148S0200000_1) {
        ((LifecycleRegistry) aqS148S0200000_1.l0).addObserver((LifecycleObserver) aqS148S0200000_1.l1);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$17(AqS148S0200000_1 aqS148S0200000_1) {
        String value = EnumC112404b6.LIKE_NOTIFICATION_SUBPAGE.getValue();
        EnumC112374b3 enumC112374b3 = EnumC112374b3.LIKE_NOTIFICATION_SUBPAGE;
        String value2 = enumC112374b3.getValue();
        String value3 = enumC112374b3.getValue();
        Map LJJL = C113554cx.LJJL(new OSZ("event_type", EnumC112754bf.CLICK.getValue()), new OSZ("active_status", IMService.createIIMServicebyMonsterPlugin(false).getImNudgeAnalytics().LIZIZ((ActivityStatus) aqS148S0200000_1.l0)));
        return new C57430MgM(value, (User) aqS148S0200000_1.l1, value2, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, "like_list", 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, value3, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, LJJL, 0 == true ? 1 : 0, -8712, 383);
    }

    public static final Object invoke$18(AqS148S0200000_1 aqS148S0200000_1) {
        return ORZ.LLIIIZ((List) aqS148S0200000_1.l1, (Collection) ((InterfaceC65784Pro) aqS148S0200000_1.l0).invoke());
    }

    public static final Object invoke$19(AqS148S0200000_1 aqS148S0200000_1) {
        ((View) aqS148S0200000_1.l0).postDelayed(new ARunnableS37S0100000_1((InterfaceC65784Pro) aqS148S0200000_1.l1, (InterfaceC65784Pro<C76800UCe>) 58), 16L);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.OQg] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.ArrayList] */
    public static final Object invoke$2(AqS148S0200000_1 aqS148S0200000_1) {
        Object obj;
        EnumC40672Fxk enumC40672Fxk;
        C785736n c785736n;
        int i;
        String nickName;
        List<SingleRecentContactData> list = (List) aqS148S0200000_1.l0;
        C776933d c776933d = (C776933d) aqS148S0200000_1.l1;
        Set<String> mobShowFilterSet = c776933d.LJFF;
        w0 w0Var = c776933d.LIZJ;
        C88213dB launchPerformanceHandler = c776933d.LIZ;
        AqS167S0100000_1 aqS167S0100000_1 = new AqS167S0100000_1(c776933d, 12);
        o.LJIIIZ(mobShowFilterSet, "mobShowFilterSet");
        o.LJIIIZ(launchPerformanceHandler, "launchPerformanceHandler");
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            obj = new ArrayList();
            int i2 = 0;
            for (SingleRecentContactData singleRecentContactData : list) {
                int i3 = singleRecentContactData.type;
                String str = singleRecentContactData.businessId;
                C53330KwQ.LIZ.getClass();
                if (C53330KwQ.LIZ() < 3) {
                    enumC40672Fxk = EnumC40672Fxk.RECENT_HORIZONTAL;
                } else {
                    enumC40672Fxk = EnumC40672Fxk.RECENT_VERTICAL;
                }
                if (i3 != 0) {
                    if (i3 != 1) {
                        arrayList.add(singleRecentContactData);
                    } else {
                        C3Q9.LIZ.getClass();
                        C75782yE.LIZ();
                        C63120Opw LIZ = C4WC.LIZIZ.LIZ(str);
                        if (LIZ != null) {
                            if (LIZ.getCoreInfo() == null) {
                                arrayList.add(singleRecentContactData);
                            } else {
                                String name = LIZ.getCoreInfo().getName();
                                o.LJIIIIZZ(name, "it.coreInfo.name");
                                i = i2 + 1;
                                c785736n = new C785736n(new C87885YeP(new C87882YeM(LIZ, name, i2, enumC40672Fxk, mobShowFilterSet, w0Var), launchPerformanceHandler), null);
                                i2 = i;
                                obj.add(c785736n);
                            }
                        }
                    }
                } else {
                    String LIZJ = C81273Gx.LIZJ(str);
                    C3Q9.LIZ.getClass();
                    C75782yE.LIZ();
                    C63120Opw LJII = C4WC.LIZIZ.LJII(LIZJ);
                    IMUser LIZLLL = C3GN.LIZIZ.LIZLLL(str);
                    if (LIZLLL == null || (nickName = LIZLLL.getNickName()) == null || nickName.length() == 0) {
                        arrayList.add(singleRecentContactData);
                    } else {
                        C785836o.LIZ().getClass();
                        boolean LIZJ2 = C3FW.LIZJ(str);
                        i = i2 + 1;
                        c785736n = new C785736n(new C87886YeQ(new C87881YeL(LIZLLL, LJII, LIZJ2, i2, enumC40672Fxk, mobShowFilterSet, w0Var), launchPerformanceHandler), null);
                        i2 = i;
                        obj.add(c785736n);
                    }
                }
            }
        } else {
            obj = C61878OQg.INSTANCE;
        }
        aqS167S0100000_1.invoke(arrayList);
        return obj;
    }

    public static final Object invoke$20(AqS148S0200000_1 aqS148S0200000_1) {
        ((InterfaceC88472Yns) aqS148S0200000_1.l0).invoke("click_close");
        ASQ.LIZLLL((C97293rp) aqS148S0200000_1.l1, ASX.LIZ);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$21(AqS148S0200000_1 aqS148S0200000_1) {
        Map<String, String> map = (Map) aqS148S0200000_1.l0;
        if (map != null) {
            C85323Wm onEventV3 = C772831o.LIZ();
            o.LJIIIZ(onEventV3, "onEventV3");
            onEventV3.LIZIZ("loading_toast_show", map);
        }
        C96963rI.LJII().getClass();
        String LJI = C97343ru.LJI(R.string.cnq, C97353rv.LIZJ());
        C26045AKb c26045AKb = new C26045AKb((Activity) aqS148S0200000_1.l1);
        c26045AKb.LJIIIZ(LJI);
        c26045AKb.LJIIJ();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$22(AqS148S0200000_1 aqS148S0200000_1) {
        C71893SJl.LIZ(new ARunnableS20S0200000_1((C96823r4) aqS148S0200000_1.l0, (C29701Eo) aqS148S0200000_1.l1, 29));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$23(AqS148S0200000_1 aqS148S0200000_1) {
        ((EventLiveData) aqS148S0200000_1.l0).removeObserver((Observer) aqS148S0200000_1.l1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$24(AqS148S0200000_1 aqS148S0200000_1) {
        ((C83593Pv) aqS148S0200000_1.l0).LJFF.LJIIIZ((C83613Px) aqS148S0200000_1.l1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$25(AqS148S0200000_1 aqS148S0200000_1) {
        Fragment fragment = ((TakoInputView) aqS148S0200000_1.l0).LLIZLLLIL.get();
        if (fragment != null) {
            return C97123rY.LIZ(fragment, (C99033ud) aqS148S0200000_1.l1);
        }
        return null;
    }

    public static final Object invoke$26(AqS148S0200000_1 aqS148S0200000_1) {
        C4EF c4ef = (C4EF) aqS148S0200000_1.l0;
        if (c4ef.LLD) {
            TakoSpeechViewModel.gv0((TakoSpeechViewModel) aqS148S0200000_1.l1, true, 2);
        } else {
            c4ef.getContext();
            if (C2NU.LIZ.LIZIZ()) {
                TakoSpeechViewModel.gv0((TakoSpeechViewModel) aqS148S0200000_1.l1, false, 3);
            } else {
                TakoSpeechViewModel.gv0((TakoSpeechViewModel) aqS148S0200000_1.l1, true, 2);
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$27(AqS148S0200000_1 aqS148S0200000_1) {
        ((IIMService) aqS148S0200000_1.l0).getImChatService().LJFF((C98593tv) aqS148S0200000_1.l1);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [org.json.JSONObject, T] */
    public static final Object invoke$28(AqS148S0200000_1 aqS148S0200000_1) {
        String jVar;
        try {
            j LJJIJ = ((m) aqS148S0200000_1.l0).LJJIJ("data");
            if (LJJIJ != null && (jVar = LJJIJ.toString()) != null) {
                ((C68322mC) aqS148S0200000_1.l1).element = new JSONObject(jVar);
            }
        } catch (Exception unused) {
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$29(AqS148S0200000_1 aqS148S0200000_1) {
        View view = (View) aqS148S0200000_1.l0;
        AnonymousClass476 anonymousClass476 = (AnonymousClass476) aqS148S0200000_1.l1;
        return new C46V(view, anonymousClass476.LLFFF, anonymousClass476.LJLL);
    }

    public static final Object invoke$3(AqS148S0200000_1 aqS148S0200000_1) {
        List list = (List) aqS148S0200000_1.l0;
        C776532z c776532z = (C776532z) aqS148S0200000_1.l1;
        return C785636m.LIZ(list, c776532z.LJ, c776532z.LIZLLL, c776532z.LIZ, new AqS167S0100000_1(c776532z, 13));
    }

    public static final Object invoke$30(AqS148S0200000_1 aqS148S0200000_1) {
        ((C4AO) aqS148S0200000_1.l0).s0((UrlModel) aqS148S0200000_1.l1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$31(AqS148S0200000_1 aqS148S0200000_1) {
        if (((Boolean) ((C107204Iq) aqS148S0200000_1.l0).LLIIZ.getValue()).booleanValue()) {
            View view = (View) aqS148S0200000_1.l1;
            C110614Vt c110614Vt = new C110614Vt();
            c110614Vt.LIZ = C19N.LIZIZ(view, "itemView.context", R.attr.cj);
            return C06460Ne.LIZ((View) aqS148S0200000_1.l1, "itemView.context", c110614Vt);
        }
        return C04270Et.LIZIZ(((View) aqS148S0200000_1.l1).getContext(), R.drawable.bju);
    }

    public static final Object invoke$32(AqS148S0200000_1 aqS148S0200000_1) {
        long currentTimeMillis = System.currentTimeMillis();
        C72242sW c72242sW = (C72242sW) aqS148S0200000_1.l0;
        if (currentTimeMillis >= c72242sW.element + 700) {
            c72242sW.element = currentTimeMillis;
            ((C95393ol) aqS148S0200000_1.l1).LJIIJ().jv0();
            C84683Ua.LJFF.LIZIZ(new C90653h7(), true);
            C90663h8.LIZ(((C95393ol) aqS148S0200000_1.l1).LJIIJ().kv0(), null, "chat_detail");
            C90643h6.LIZJ = "group_setting";
            C90643h6.LJ();
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$33(AqS148S0200000_1 aqS148S0200000_1) {
        ((C73305Spp) ((MutualRelationEmptyCell) aqS148S0200000_1.l0).itemView.findViewById(R.id.kf_)).LJFF();
        MutualRelationViewModel mutualRelationViewModel = ((C93973mT) aqS148S0200000_1.l1).LJLIL;
        XKX.LIZLLL(mutualRelationViewModel.getAssemVMScope(), C78613UtF.LIZJ, null, new C3GT(mutualRelationViewModel, mutualRelationViewModel.getState().LJLJJL, mutualRelationViewModel.getState().LJLJJLL, null), 2);
        ((C93973mT) aqS148S0200000_1.l1).LJLIL.setState(C94083me.LJLIL);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$34(AqS148S0200000_1 aqS148S0200000_1) {
        if (((IMUser) aqS148S0200000_1.l0).getFollowStatus() == 1 || ((IMUser) aqS148S0200000_1.l0).getFollowStatus() == 2) {
            SingleChatNoticeViewModel N3 = ((SingleChatNoticeAssem) aqS148S0200000_1.l1).N3();
            String uid = ((IMUser) aqS148S0200000_1.l0).getUid();
            o.LJIIIIZZ(uid, "fromUser.uid");
            Context context = ((SingleChatNoticeAssem) aqS148S0200000_1.l1).getContainerView().getContext();
            o.LJIIIIZZ(context, "containerView.context");
            N3.gv0(context, uid);
        } else {
            C3U1 c3u1 = (C3U1) ((SingleChatNoticeAssem) aqS148S0200000_1.l1).LLF.getValue();
            if (c3u1 != null) {
                ALX alx = new ALX();
                alx.LIZJ(((IMUser) aqS148S0200000_1.l0).getUid());
                alx.LIZIZ(((IMUser) aqS148S0200000_1.l0).getSecUid());
                boolean isSecret = ((IMUser) aqS148S0200000_1.l0).isSecret();
                C57285Me1 c57285Me1 = alx.LIZ;
                c57285Me1.LJIIL = isSecret;
                c57285Me1.LIZJ = 1;
                alx.LIZ.LJIIJ = ((IMUser) aqS148S0200000_1.l0).getFollowerStatus();
                alx.LIZ.LJIILL = ((IMUser) aqS148S0200000_1.l0).getRecType();
                c3u1.yQ(alx.LIZ(), "chat", new AqS164S0200000_1((SingleChatNoticeAssem) aqS148S0200000_1.l1, (IMUser) aqS148S0200000_1.l0, 17));
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$35(AqS148S0200000_1 aqS148S0200000_1) {
        FragmentManager fragmentManager;
        GeneralVideoMaskVM p4 = ((GeneralVideoMaskAssem) aqS148S0200000_1.l0).p4();
        XKX.LIZLLL(p4.getAssemVMScope(), null, null, new C67452kn(p4, null), 3);
        GeneralVideoMaskAssem generalVideoMaskAssem = (GeneralVideoMaskAssem) aqS148S0200000_1.l0;
        MaskPopWindow popWindow = ((MaskExtraModule) aqS148S0200000_1.l1).getPopWindow();
        if (popWindow != null) {
            Context context = generalVideoMaskAssem.getContext();
            if (context != null) {
                ArrayList arrayList = new ArrayList();
                List<MaskPopText> content = popWindow.getContent();
                if (content != null) {
                    for (MaskPopText maskPopText : content) {
                        TextWithInlineLink linkText = maskPopText.getLinkText();
                        if (linkText != null) {
                            boolean isListItem = maskPopText.isListItem();
                            Spanned LJJJ = a.LJFF().LJJJ(context, linkText);
                            o.LJI(LJJJ);
                            arrayList.add(new C26220AQu(LJJJ, isListItem));
                        }
                    }
                }
                Fragment LIZLLL = C212428Vi.LIZLLL(generalVideoMaskAssem);
                if (LIZLLL != null && (fragmentManager = LIZLLL.getFragmentManager()) != null) {
                    C26224AQy c26224AQy = new C26224AQy();
                    String title = popWindow.getTitle();
                    if (title == null) {
                        title = "";
                    }
                    c26224AQy.LJ = title;
                    c26224AQy.LJIILIIL = true;
                    String string = context.getString(R.string.p2);
                    C49D c49d = C49D.LJLIL;
                    c26224AQy.LJII = string;
                    c26224AQy.LJIIIZ = c49d;
                    c26224AQy.LIZJ(arrayList);
                    TuxSheet tuxSheet = c26224AQy.LIZ().LIZ;
                    GeneralVideoMaskVM p42 = generalVideoMaskAssem.p4();
                    XKX.LIZLLL(p42.getAssemVMScope(), null, null, new C67462ko(p42, null), 3);
                    tuxSheet.show(fragmentManager, "dialog");
                }
            }
        } else {
            generalVideoMaskAssem.getClass();
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$36(AqS148S0200000_1 aqS148S0200000_1) {
        String str;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("try new scope, preload: ");
        LIZ.append((InterfaceC55235Lm3) aqS148S0200000_1.l0);
        LIZ.append(", preloadKey: ");
        InterfaceC55235Lm3 interfaceC55235Lm3 = (InterfaceC55235Lm3) aqS148S0200000_1.l0;
        if (interfaceC55235Lm3 != null) {
            str = interfaceC55235Lm3.getKey();
        } else {
            str = null;
        }
        LIZ.append(str);
        LIZ.append(", result: ");
        LIZ.append((InterfaceC55235Lm3) aqS148S0200000_1.l1);
        LIZ.append(", resultKey: ");
        LIZ.append(((InterfaceC55235Lm3) aqS148S0200000_1.l1).getKey());
        return X1D.LIZIZ(LIZ);
    }

    public static final Object invoke$37(AqS148S0200000_1 aqS148S0200000_1) {
        UserRecommendationContent.RecUserInfo recUserInfo;
        String userId;
        FakeMessageContent fakeMessageContent;
        UserRecommendationContent userRecommendationContent;
        UserRecommendationContent.RecUserInfo recUserInfo2;
        String str;
        FakeMessageViewModel fakeMessageViewModel = ((ViewOnClickListenerC85343Wo) aqS148S0200000_1.l0).LLIIIILZ;
        if (fakeMessageViewModel != null && (recUserInfo = ((AnonymousClass357) aqS148S0200000_1.l1).LJIIIZ) != null && (userId = recUserInfo.getUserId()) != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("closeUserCard: userId=");
            LIZ.append(userId);
            C34B.LJI("UserRecCardViewModel", X1D.LIZIZ(LIZ));
            String convId = fakeMessageViewModel.LJLIL.getConversationId();
            Long LJJIZ = C38350F3i.LJJIZ(userId);
            if (LJJIZ != null) {
                long longValue = LJJIZ.longValue();
                C75762yC c75762yC = C75762yC.LIZ;
                o.LJIIIZ(convId, "convId");
                Map LIZ2 = C75762yC.LIZ(c75762yC, convId);
                if (LIZ2 != null) {
                    fakeMessageContent = (FakeMessageContent) LIZ2.get(1);
                } else {
                    fakeMessageContent = null;
                }
                if ((fakeMessageContent instanceof UserRecommendationContent) && (userRecommendationContent = (UserRecommendationContent) fakeMessageContent) != null) {
                    C76262z0 c76262z0 = C76262z0.LJLIL;
                    String conversationId = fakeMessageViewModel.LJLIL.getConversationId();
                    List<UserRecommendationContent.RecUserInfo> userList = userRecommendationContent.getUserList();
                    if (userList != null) {
                        Iterator<UserRecommendationContent.RecUserInfo> it = userList.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                recUserInfo2 = it.next();
                                UserRecommendationContent.RecUserInfo recUserInfo3 = recUserInfo2;
                                if (recUserInfo3 != null) {
                                    str = recUserInfo3.getUserId();
                                } else {
                                    str = null;
                                }
                                if (o.LJ(str, userId)) {
                                    break;
                                }
                            } else {
                                recUserInfo2 = null;
                                break;
                            }
                        }
                        UserRecommendationContent.RecUserInfo recUserInfo4 = recUserInfo2;
                        if (recUserInfo4 != null) {
                            recUserInfo4.setClosedTimestamp(System.currentTimeMillis());
                        }
                    }
                    C75732y9.LIZIZ(conversationId, userRecommendationContent.getUserList(), new IDcS364S0100000_1(c76262z0, 30));
                    XKX.LIZLLL(fakeMessageViewModel.LJLJI, null, null, new C69422ny(longValue, fakeMessageViewModel, null), 3);
                }
                C7ZH.LIZIZ(EnumC57365MfJ.DISLIKE, recUserInfo.getUser(), recUserInfo.getMatchedFriends());
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$38(AqS148S0200000_1 aqS148S0200000_1) {
        InboxSocPubStatusViewModelImpl LIZ = C94723ng.LIZ(((Fragment) aqS148S0200000_1.l0).mo49getActivity());
        if (LIZ != null) {
            ((InboxSessionDataProvider) aqS148S0200000_1.l1).getLifecycle().addObserver(LIZ);
            return LIZ;
        }
        return null;
    }

    public static final Object invoke$39(AqS148S0200000_1 aqS148S0200000_1) {
        if (((C3R9) aqS148S0200000_1.l0).LJIIIZ) {
            return ((C3R2) aqS148S0200000_1.l1).LJZ;
        }
        return new ArrayList();
    }

    public static final Object invoke$4(AqS148S0200000_1 aqS148S0200000_1) {
        ((C28871Bj) ((SessionListFragmentV2) aqS148S0200000_1.l0).LJLLLLLL.getValue()).LJLLLLLL((AbstractC029409q) aqS148S0200000_1.l1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$40(AqS148S0200000_1 aqS148S0200000_1) {
        ((IIMService) aqS148S0200000_1.l0).getImChatService().LJFF((C98593tv) aqS148S0200000_1.l1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$41(AqS148S0200000_1 aqS148S0200000_1) {
        InterfaceC105124Aq interfaceC105124Aq = ((C4BU) aqS148S0200000_1.l0).LJLJI;
        ((ViewGroup) aqS148S0200000_1.l1).getContext();
        return new InputViewDelegate(interfaceC105124Aq);
    }

    public static final Object invoke$42(AqS148S0200000_1 aqS148S0200000_1) {
        View view = (View) aqS148S0200000_1.l0;
        C49G c49g = (C49G) aqS148S0200000_1.l1;
        return new C46V(view, c49g.LLFFF, c49g.LJLL);
    }

    public static final Object invoke$43(AqS148S0200000_1 aqS148S0200000_1) {
        if (!((XJL) aqS148S0200000_1.l0).isCompleted()) {
            ((C73305Spp) aqS148S0200000_1.l1).setVisibility(8);
            XJL xjl = (XJL) aqS148S0200000_1.l0;
            C76800UCe c76800UCe = C76800UCe.LIZ;
            C3C5.m7constructorimpl(c76800UCe);
            xjl.resumeWith(c76800UCe);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$44(AqS148S0200000_1 aqS148S0200000_1) {
        try {
            return ((InterfaceC65784Pro) aqS148S0200000_1.l0).invoke();
        } catch (Throwable unused) {
            return aqS148S0200000_1.l1;
        }
    }

    public static final Object invoke$45(AqS148S0200000_1 aqS148S0200000_1) {
        C99033ud c99033ud;
        Fragment LJJIFFI = C73340SqO.LJJIFFI(((View) aqS148S0200000_1.l0).getContext());
        if (LJJIFFI != null && (c99033ud = ((C97063rS) aqS148S0200000_1.l1).LJLLL) != null) {
            return C97123rY.LIZ(LJJIFFI, c99033ud);
        }
        return null;
    }

    public static final Object invoke$46(AqS148S0200000_1 aqS148S0200000_1) {
        Lifecycle lifecycle = ((LifecycleOwner) aqS148S0200000_1.l0).getLifecycle();
        final Class[] clsArr = (Class[]) aqS148S0200000_1.l1;
        final LifecycleOwner lifecycleOwner = (LifecycleOwner) aqS148S0200000_1.l0;
        lifecycle.addObserver(new LifecycleEventObserver() { // from class: com.bytedance.assem.provider.LogicAssemExtKt$loadAbility$runnable$1$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
                o.LJIIIZ(source, "source");
                o.LJIIIZ(event, "event");
                if (event == Lifecycle.Event.ON_DESTROY) {
                    Class<? extends C2K0>[] clsArr2 = clsArr;
                    LifecycleOwner lifecycleOwner2 = lifecycleOwner;
                    for (Class<? extends C2K0> cls : clsArr2) {
                        InterfaceC55235Lm3 LJI = C55096Ljo.LJI(lifecycleOwner2, C55096Ljo.LJFF(cls));
                        if (LJI != null) {
                            C55096Ljo.LJIILL(LJI, cls, null);
                        }
                    }
                }
            }
        });
        return C76800UCe.LIZ;
    }

    public static final Object invoke$47(AqS148S0200000_1 aqS148S0200000_1) {
        ((C71082qe) aqS148S0200000_1.l0).LIZIZ.LJIIL((Aweme) aqS148S0200000_1.l1, false);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [X.3eU] */
    public static final Object invoke$48(AqS148S0200000_1 aqS148S0200000_1) {
        boolean z;
        final boolean z2;
        Integer num;
        Integer num2;
        String str;
        final VideoCreationTailFragment videoCreationTailFragment = (VideoCreationTailFragment) aqS148S0200000_1.l0;
        final ActivityC45651qj activityC45651qj = (ActivityC45651qj) aqS148S0200000_1.l1;
        final ?? r5 = new InterfaceC89073eZ() { // from class: X.3eU
            /* JADX WARN: Code restructure failed: missing block: B:54:0x0194, code lost:
            
                if (r27 != null) goto L40;
             */
            /* JADX WARN: Removed duplicated region for block: B:44:0x0175  */
            /* JADX WARN: Removed duplicated region for block: B:47:0x0188  */
            /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:51:0x0190  */
            /* JADX WARN: Type inference failed for: r1v11 */
            /* JADX WARN: Type inference failed for: r1v8 */
            /* JADX WARN: Type inference failed for: r1v9, types: [com.ss.android.ugc.aweme.emoji.stickerstore.model.SetSticker, java.lang.Integer] */
            @Override // X.InterfaceC89073eZ
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZ(com.ss.android.ugc.aweme.emoji.stickerstore.model.VideoSticker r27) {
                /*
                    Method dump skipped, instructions count: 420
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C89023eU.LIZ(com.ss.android.ugc.aweme.emoji.stickerstore.model.VideoSticker):void");
            }

            /* JADX WARN: Code restructure failed: missing block: B:19:0x0064, code lost:
            
                if (r2 == true) goto L21;
             */
            @Override // X.InterfaceC89073eZ
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZIZ(java.lang.Integer r18, java.lang.Throwable r19) {
                /*
                    Method dump skipped, instructions count: 284
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C89023eU.LIZIZ(java.lang.Integer, java.lang.Throwable):void");
            }
        };
        if (videoCreationTailFragment.LJLJJI != null && videoCreationTailFragment.LJLILLLLZI != null && videoCreationTailFragment.LJLJI != null && videoCreationTailFragment.LJLJLJ != null && videoCreationTailFragment.LJLL != null && videoCreationTailFragment.LJLJLLL != null) {
            z = true;
        } else {
            z = false;
        }
        String str2 = null;
        if (!z) {
            r5.LIZIZ(null, new Throwable("Invalid params"));
        } else {
            final VideoStickerCreationViewModel vl = videoCreationTailFragment.vl();
            CompoundButton compoundButton = (CompoundButton) videoCreationTailFragment._$_findCachedViewById(R.id.w7);
            if (compoundButton != null && compoundButton.isChecked()) {
                z2 = true;
            } else {
                z2 = false;
            }
            String str3 = videoCreationTailFragment.LJLJLJ;
            if (str3 != null) {
                final long parseLong = CastLongProtector.parseLong(str3);
                final String str4 = videoCreationTailFragment.LJLJLLL;
                if (str4 != null && (num = videoCreationTailFragment.LJLL) != null) {
                    final int intValue = num.intValue();
                    String str5 = videoCreationTailFragment.LJLJJI;
                    if (str5 != null && (num2 = videoCreationTailFragment.LJLILLLLZI) != null) {
                        int intValue2 = num2.intValue();
                        Integer num3 = videoCreationTailFragment.LJLJI;
                        if (num3 != null) {
                            int intValue3 = num3.intValue();
                            try {
                                str = PU6.LIZIZ(str5);
                            } catch (Exception e) {
                                r5.LIZIZ(null, e);
                            }
                            if (str == null) {
                                str = "";
                            }
                            C117814jp c117814jp = new C117814jp(str5, str, intValue2, intValue3, 112);
                            vl.LJLJI = SystemClock.elapsedRealtime();
                            StringBuilder LIZ = X1D.LIZ();
                            User curUser = ((RBX) HG3.LJIILL()).getCurUser();
                            if (curUser != null) {
                                str2 = curUser.getUid();
                            }
                            final String LIZLLL = C132805Jc.LIZLLL(LIZ, str2, parseLong, LIZ);
                            C117874jv.LJFF(LIZLLL, c117814jp, C4HF.VIDEO_STICKER.getScene(), false, true, true);
                            C117874jv.LIZ(new InterfaceC41771GaN() { // from class: X.4HB
                                @Override // X.InterfaceC41771GaN
                                public final void LIZIZ(String str6) {
                                }

                                @Override // X.InterfaceC41771GaN
                                public final void LIZJ(C117914jz c117914jz) {
                                }

                                @Override // X.InterfaceC41771GaN
                                public final void onProgress(int i) {
                                }

                                @Override // X.InterfaceC41771GaN
                                public final void LIZ(C118004k8 result) {
                                    DMEncryptedImageContent dMEncryptedImageContent;
                                    String str6;
                                    String str7;
                                    Long l;
                                    Long l2;
                                    o.LJIIIZ(result, "result");
                                    C117874jv.LJIIIIZZ(this, LIZLLL);
                                    vl.LJLJI = SystemClock.elapsedRealtime() - vl.LJLJI;
                                    H4F h4f = result.LIZIZ;
                                    if (h4f == null || (dMEncryptedImageContent = (DMEncryptedImageContent) h4f.LIZIZ) == null) {
                                        InterfaceC89073eZ interfaceC89073eZ = r5;
                                        if (interfaceC89073eZ != null) {
                                            interfaceC89073eZ.LIZIZ(Integer.valueOf(EnumC89013eT.UPLOAD_IMAGE_FAIL.getStatus()), new Throwable("Empty Image data"));
                                            return;
                                        }
                                        return;
                                    }
                                    int i = intValue;
                                    if (i == 3) {
                                        str6 = dMEncryptedImageContent.getUri();
                                        str7 = null;
                                    } else if (i == 4) {
                                        str7 = dMEncryptedImageContent.getUri();
                                        str6 = null;
                                    } else {
                                        str6 = null;
                                        str7 = null;
                                    }
                                    VideoStickerCreationViewModel videoStickerCreationViewModel = vl;
                                    boolean z3 = z2;
                                    long j = parseLong;
                                    String str8 = str4;
                                    int i2 = intValue;
                                    if (dMEncryptedImageContent.getExtra() != null) {
                                        l = Long.valueOf(r0.getWidth());
                                    } else {
                                        l = null;
                                    }
                                    if (dMEncryptedImageContent.getExtra() != null) {
                                        l2 = Long.valueOf(r0.getHeight());
                                    } else {
                                        l2 = null;
                                    }
                                    InterfaceC89073eZ interfaceC89073eZ2 = r5;
                                    videoStickerCreationViewModel.getClass();
                                    if (l == null || l2 == null) {
                                        if (interfaceC89073eZ2 != null) {
                                            interfaceC89073eZ2.LIZIZ(Integer.valueOf(EnumC89013eT.UPLOAD_IMAGE_FAIL.getStatus()), new Throwable("Image width or height should not be null"));
                                        }
                                    } else {
                                        videoStickerCreationViewModel.LJLJJI = SystemClock.elapsedRealtime();
                                        XKX.LIZLLL(ViewModelKt.getViewModelScope(videoStickerCreationViewModel), C78613UtF.LIZJ, null, new C89043eW(z3, videoStickerCreationViewModel, j, str8, i2, str6, str7, l, l2, interfaceC89073eZ2, null), 2);
                                    }
                                }

                                @Override // X.InterfaceC41771GaN
                                public final void onFailed(String errMsg) {
                                    o.LJIIIZ(errMsg, "errMsg");
                                    C117874jv.LJIIIIZZ(this, LIZLLL);
                                    vl.LJLJI = SystemClock.elapsedRealtime() - vl.LJLJI;
                                    InterfaceC89073eZ interfaceC89073eZ = r5;
                                    if (interfaceC89073eZ != null) {
                                        interfaceC89073eZ.LIZIZ(Integer.valueOf(EnumC89013eT.UPLOAD_IMAGE_FAIL.getStatus()), new Throwable(errMsg));
                                    }
                                }
                            }, LIZLLL);
                        }
                    }
                }
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$49(AqS148S0200000_1 aqS148S0200000_1) {
        ((C112874br) aqS148S0200000_1.l0).LJIIIZ(C113024c6.LIZ);
        C109544Rq c109544Rq = (C109544Rq) aqS148S0200000_1.l1;
        if (c109544Rq != null) {
            ((C112874br) aqS148S0200000_1.l0).LIZJ.invoke(c109544Rq);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$5(AqS148S0200000_1 aqS148S0200000_1) {
        ((DownloadBarComponent) aqS148S0200000_1.l0).F3((C45382HrW) aqS148S0200000_1.l1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$50(AqS148S0200000_1 aqS148S0200000_1) {
        IMUser LIZ = C81573Ib.LIZ((IMContact) aqS148S0200000_1.l0);
        if (LIZ != null) {
            InterfaceC98813uH imChatService = IMService.createIIMServicebyMonsterPlugin(false).getImChatService();
            C98593tv c98593tv = new C98593tv((Context) ((ViewOnTouchListenerC93253lJ) aqS148S0200000_1.l1).LJLIL, LIZ);
            c98593tv.setEnterFrom(4);
            c98593tv.setEnterMethodForMob("cell");
            c98593tv.setFollowStatus(LIZ.getFollowStatus());
            c98593tv.setEnterFromForMob("contact_list");
            c98593tv.setChatType(0);
            imChatService.LJFF(c98593tv);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$51(AqS148S0200000_1 aqS148S0200000_1) {
        IMUser LIZ = C81573Ib.LIZ((IMContact) aqS148S0200000_1.l0);
        if (LIZ != null && C73340SqO.LJJIJ(((ViewOnTouchListenerC93253lJ) aqS148S0200000_1.l1).LJLIL)) {
            new ARunnableS20S0200000_1((ViewOnTouchListenerC93253lJ) aqS148S0200000_1.l1, LIZ, 58).run();
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$52(AqS148S0200000_1 aqS148S0200000_1) {
        ((C2KO) aqS148S0200000_1.l0).LIZIZ.remove((C2KQ) aqS148S0200000_1.l1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$53(AqS148S0200000_1 aqS148S0200000_1) {
        C101713yx c101713yx = (C101713yx) aqS148S0200000_1.l0;
        c101713yx.LIZIZ.LIZJ(c101713yx.LIZ, (EnumC101493yb) aqS148S0200000_1.l1);
        C26231ARf c26231ARf = ((C101713yx) aqS148S0200000_1.l0).LIZJ;
        if (c26231ARf != null) {
            c26231ARf.LIZIZ(EnumC101633yp.CLICK_RED_BUTTON);
            return C76800UCe.LIZ;
        }
        o.LJIJI("dialog");
        throw null;
    }

    public static final Object invoke$54(AqS148S0200000_1 aqS148S0200000_1) {
        ((C109214Qj) aqS148S0200000_1.l0).LJLIL.LJIILJJIL((IMContact) aqS148S0200000_1.l1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$55(AqS148S0200000_1 aqS148S0200000_1) {
        ((C4R2) aqS148S0200000_1.l0).LJLIL.LJIILL((IMContact) aqS148S0200000_1.l1, true);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$56(AqS148S0200000_1 aqS148S0200000_1) {
        ((C4R2) aqS148S0200000_1.l0).LJLIL.LJIILL((IMContact) aqS148S0200000_1.l1, true);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$57(AqS148S0200000_1 aqS148S0200000_1) {
        if (!((C109354Qx) aqS148S0200000_1.l0).LJLILLLLZI && C115464g2.LIZ()) {
            return ((View) aqS148S0200000_1.l1).findViewById(R.id.mt9);
        }
        return null;
    }

    public static final Object invoke$58(AqS148S0200000_1 aqS148S0200000_1) {
        ((C109354Qx) aqS148S0200000_1.l0).LJLIL.LJIILL((IMContact) aqS148S0200000_1.l1, true);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$59(AqS148S0200000_1 aqS148S0200000_1) {
        IMUser iMUser = (IMUser) aqS148S0200000_1.l0;
        BaseChatPanel baseChatPanel = (BaseChatPanel) aqS148S0200000_1.l1;
        if (baseChatPanel.LLJJJJLIIL) {
            String uid = iMUser.getUid();
            o.LJIIIIZZ(uid, "uid");
            baseChatPanel.LJIILJJIL(uid);
        } else {
            C3U1 c3u1 = (C3U1) baseChatPanel.LLJJL.getValue();
            if (c3u1 != null) {
                ALX alx = new ALX();
                alx.LIZJ(iMUser.getUid());
                alx.LIZIZ(iMUser.getSecUid());
                boolean isSecret = iMUser.isSecret();
                C57285Me1 c57285Me1 = alx.LIZ;
                c57285Me1.LJIIL = isSecret;
                c57285Me1.LIZJ = 1;
                alx.LIZ.LJIIJ = iMUser.getFollowerStatus();
                alx.LIZ.LJIILL = iMUser.getRecType();
                c3u1.yQ(alx.LIZ(), "chat", new AqS164S0200000_1(baseChatPanel, iMUser, 22));
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$6(AqS148S0200000_1 aqS148S0200000_1) {
        ((C2LH) aqS148S0200000_1.l0).LJ((C45382HrW) aqS148S0200000_1.l1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$60(AqS148S0200000_1 aqS148S0200000_1) {
        ((Fragment) aqS148S0200000_1.l0).getLifecycle().addObserver((SessionListReadStatusViewModel) aqS148S0200000_1.l1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$61(AqS148S0200000_1 aqS148S0200000_1) {
        InboxSocPubStatusViewModelImpl LIZ = C94723ng.LIZ(((Fragment) aqS148S0200000_1.l0).mo49getActivity());
        if (LIZ != null) {
            ((FocusedSessionListWidget) aqS148S0200000_1.l1).getLifecycle().addObserver(LIZ);
            return LIZ;
        }
        return null;
    }

    public static final Object invoke$62(AqS148S0200000_1 aqS148S0200000_1) {
        ((FrameLayout) aqS148S0200000_1.l0).setVisibility(0);
        XKX.LIZLLL(C48841JEv.LIZ(C36576EXc.LIZJ), null, null, new C3GV((S3N) aqS148S0200000_1.l1, null), 3);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$63(AqS148S0200000_1 aqS148S0200000_1) {
        ((ViewOnClickListenerC112504bG) aqS148S0200000_1.l0).LJLL.setVisibility(8);
        ((ViewOnClickListenerC112504bG) aqS148S0200000_1.l0).LJLJJLL.setVisibility(8);
        ((C76732zl) aqS148S0200000_1.l1).element = C7MY.LIZIZ(16);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$64(AqS148S0200000_1 aqS148S0200000_1) {
        View inflate = View.inflate((Context) aqS148S0200000_1.l0, R.layout.b_m, (ViewOnClickListenerC112504bG) aqS148S0200000_1.l1);
        Context context = (Context) aqS148S0200000_1.l0;
        if (C99W.LIZ) {
            inflate.setBackground(C04270Et.LIZIZ(context, R.drawable.bgo));
        }
        return inflate;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$7(AqS148S0200000_1 aqS148S0200000_1) {
        aqS148S0200000_1.invoke$0();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$8(AqS148S0200000_1 aqS148S0200000_1) {
        InterfaceC71012qX interfaceC71012qX = ((C71052qb) aqS148S0200000_1.l0).LJ;
        if (interfaceC71012qX != null) {
            interfaceC71012qX.LIZJ(3, (Aweme) aqS148S0200000_1.l1, new ArrayList());
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$9(AqS148S0200000_1 aqS148S0200000_1) {
        ((PdpHeadNavBarWidget) aqS148S0200000_1.l0).replaceIconRes((View) aqS148S0200000_1.l1, R.raw.icon_ellipsis_horizontal);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS148S0200000_1(C60542Ze c60542Ze, int i) {
        super(0);
        this.$t = i;
        this.l0 = c60542Ze;
        this.l1 = null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS148S0200000_1(C25600zU c25600zU, ViewOnClickListenerC112504bG viewOnClickListenerC112504bG, int i) {
        super(0);
        this.$t = i;
        this.l0 = c25600zU;
        this.l1 = viewOnClickListenerC112504bG;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS148S0200000_1(C2KO c2ko, C2KQ c2kq, int i) {
        super(0);
        this.$t = i;
        this.l0 = c2ko;
        this.l1 = c2kq;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS148S0200000_1(C2LH c2lh, C45382HrW c45382HrW, int i) {
        super(0);
        this.$t = i;
        this.l0 = c2lh;
        this.l1 = c45382HrW;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS148S0200000_1(C71052qb c71052qb, Aweme aweme, int i) {
        super(0);
        this.$t = i;
        this.l0 = c71052qb;
        this.l1 = aweme;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS148S0200000_1(C71082qe c71082qe, Aweme aweme, int i) {
        super(0);
        this.$t = i;
        this.l0 = c71082qe;
        this.l1 = aweme;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS148S0200000_1(C33A c33a, C776833c c776833c, int i) {
        super(0);
        this.$t = i;
        this.l0 = c33a;
        this.l1 = c776833c;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS148S0200000_1(C83593Pv c83593Pv, C83613Px c83613Px, int i) {
        super(0);
        this.$t = i;
        this.l0 = c83593Pv;
        this.l1 = c83613Px;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS148S0200000_1(C3R9 c3r9, C3R2 c3r2, int i) {
        super(0);
        this.$t = i;
        this.l0 = c3r9;
        this.l1 = c3r2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS148S0200000_1(ViewOnClickListenerC85343Wo viewOnClickListenerC85343Wo, AnonymousClass357 anonymousClass357, int i) {
        super(0);
        this.$t = i;
        this.l0 = viewOnClickListenerC85343Wo;
        this.l1 = anonymousClass357;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS148S0200000_1(C95393ol c95393ol, C72242sW c72242sW, int i) {
        super(0);
        this.$t = i;
        this.l0 = c72242sW;
        this.l1 = c95393ol;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS148S0200000_1(C96823r4 c96823r4, C29701Eo c29701Eo, int i) {
        super(0);
        this.$t = i;
        this.l0 = c96823r4;
        this.l1 = c29701Eo;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS148S0200000_1(C97293rp c97293rp, AqS132S0200000_1 aqS132S0200000_1, int i) {
        super(0);
        this.$t = i;
        this.l0 = aqS132S0200000_1;
        this.l1 = c97293rp;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS148S0200000_1(C101713yx c101713yx, EnumC101493yb enumC101493yb, int i) {
        super(0);
        this.$t = i;
        this.l0 = c101713yx;
        this.l1 = enumC101493yb;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS148S0200000_1(C4AO c4ao, UrlModel urlModel, int i) {
        super(0);
        this.$t = i;
        this.l0 = c4ao;
        this.l1 = urlModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS148S0200000_1(C4BU c4bu, ViewGroup viewGroup, int i) {
        super(0);
        this.$t = i;
        this.l0 = c4bu;
        this.l1 = viewGroup;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS148S0200000_1(C4EF c4ef, TakoSpeechViewModel takoSpeechViewModel, int i) {
        super(0);
        this.$t = i;
        this.l0 = c4ef;
        this.l1 = takoSpeechViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS148S0200000_1(C107204Iq c107204Iq, View view, int i) {
        super(0);
        this.$t = i;
        this.l0 = c107204Iq;
        this.l1 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS148S0200000_1(C109214Qj c109214Qj, IMContact iMContact, int i) {
        super(0);
        this.$t = i;
        this.l0 = c109214Qj;
        this.l1 = iMContact;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS148S0200000_1(C109354Qx c109354Qx, View view, int i) {
        super(0);
        this.$t = i;
        this.l0 = c109354Qx;
        this.l1 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS148S0200000_1(C109354Qx c109354Qx, IMContact iMContact, int i) {
        super(0);
        this.$t = i;
        this.l0 = c109354Qx;
        this.l1 = iMContact;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS148S0200000_1(C4R2 c4r2, IMContact iMContact, int i) {
        super(0);
        this.$t = i;
        this.l0 = c4r2;
        this.l1 = iMContact;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS148S0200000_1(C4YJ c4yj, Context context, int i) {
        super(0);
        this.$t = i;
        this.l0 = c4yj;
        this.l1 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS148S0200000_1(ViewOnClickListenerC112504bG viewOnClickListenerC112504bG, C76732zl c76732zl, int i) {
        super(0);
        this.$t = i;
        this.l0 = viewOnClickListenerC112504bG;
        this.l1 = c76732zl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS148S0200000_1(C112874br c112874br, C109544Rq c109544Rq, int i) {
        super(0);
        this.$t = i;
        this.l0 = c112874br;
        this.l1 = c109544Rq;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS148S0200000_1(InterfaceC55235Lm3 interfaceC55235Lm3, InterfaceC55235Lm3 interfaceC55235Lm32, int i) {
        super(0);
        this.$t = i;
        this.l0 = interfaceC55235Lm3;
        this.l1 = interfaceC55235Lm32;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS148S0200000_1(XKS xks, C73305Spp c73305Spp, int i) {
        super(0);
        this.$t = i;
        this.l0 = xks;
        this.l1 = c73305Spp;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS148S0200000_1(Activity activity, Map map, int i) {
        super(0);
        this.$t = i;
        this.l0 = map;
        this.l1 = activity;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS148S0200000_1(Context context, AnonymousClass488 anonymousClass488, int i) {
        super(0);
        this.$t = i;
        this.l0 = context;
        this.l1 = anonymousClass488;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS148S0200000_1(View view, C97063rS c97063rS, int i) {
        super(0);
        this.$t = i;
        this.l0 = view;
        this.l1 = c97063rS;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS148S0200000_1(View view, AnonymousClass476 anonymousClass476, int i) {
        super(0);
        this.$t = i;
        this.l0 = view;
        this.l1 = anonymousClass476;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS148S0200000_1(View view, C49G c49g, int i) {
        super(0);
        this.$t = i;
        this.l0 = view;
        this.l1 = c49g;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS148S0200000_1(View view, View view2, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        super(0);
        this.$t = interfaceC65784Pro;
        this.l0 = view;
        this.l1 = view2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS148S0200000_1(FrameLayout frameLayout, S3N s3n, int i) {
        super(0);
        this.$t = i;
        this.l0 = frameLayout;
        this.l1 = s3n;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS148S0200000_1(LifecycleOwner lifecycleOwner, C98523to c98523to, int i) {
        super(0);
        this.$t = i;
        this.l0 = lifecycleOwner;
        this.l1 = c98523to;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS148S0200000_1(LifecycleOwner lifecycleOwner, LifecycleOwner lifecycleOwner2, Class<? extends C2K0>[] clsArr) {
        super(0);
        this.$t = clsArr;
        this.l0 = lifecycleOwner;
        this.l1 = lifecycleOwner2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS148S0200000_1(LifecycleRegistry lifecycleRegistry, LifecycleObserver lifecycleObserver, int i) {
        super(0);
        this.$t = i;
        this.l0 = lifecycleRegistry;
        this.l1 = lifecycleObserver;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS148S0200000_1(m mVar, m mVar2, C68322mC<JSONObject> c68322mC) {
        super(0);
        this.$t = c68322mC;
        this.l0 = mVar;
        this.l1 = mVar2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS148S0200000_1(EventLiveData eventLiveData, AObserverS65S0200000_1 aObserverS65S0200000_1, int i) {
        super(0);
        this.$t = i;
        this.l0 = eventLiveData;
        this.l1 = aObserverS65S0200000_1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS148S0200000_1(PdpHeadNavBarWidget pdpHeadNavBarWidget, View view, int i) {
        super(0);
        this.$t = i;
        this.l0 = pdpHeadNavBarWidget;
        this.l1 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS148S0200000_1(GeneralVideoMaskAssem generalVideoMaskAssem, MaskExtraModule maskExtraModule, int i) {
        super(0);
        this.$t = i;
        this.l0 = generalVideoMaskAssem;
        this.l1 = maskExtraModule;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS148S0200000_1(DetailFeedKeyboardDialogFragment detailFeedKeyboardDialogFragment, View view, int i) {
        super(0);
        this.$t = i;
        this.l0 = detailFeedKeyboardDialogFragment;
        this.l1 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS148S0200000_1(VideoCreationTailFragment videoCreationTailFragment, ActivityC45651qj activityC45651qj, int i) {
        super(0);
        this.$t = i;
        this.l0 = videoCreationTailFragment;
        this.l1 = activityC45651qj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS148S0200000_1(TakoInputView takoInputView, C99033ud c99033ud, int i) {
        super(0);
        this.$t = i;
        this.l0 = takoInputView;
        this.l1 = c99033ud;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS148S0200000_1(BaseChatPanel baseChatPanel, IMUser iMUser, int i) {
        super(0);
        this.$t = i;
        this.l0 = iMUser;
        this.l1 = baseChatPanel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS148S0200000_1(SingleChatNoticeAssem singleChatNoticeAssem, IMUser iMUser, int i) {
        super(0);
        this.$t = i;
        this.l0 = iMUser;
        this.l1 = singleChatNoticeAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS148S0200000_1(MessageRequestStatusAssem messageRequestStatusAssem, UIAssem uIAssem, int i) {
        super(0);
        this.$t = i;
        this.l0 = messageRequestStatusAssem;
        this.l1 = uIAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS148S0200000_1(SessionListFragmentV2 sessionListFragmentV2, AbstractC57781Mm1 abstractC57781Mm1, int i) {
        super(0);
        this.$t = i;
        this.l0 = sessionListFragmentV2;
        this.l1 = abstractC57781Mm1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS148S0200000_1(SessionListFragmentV2 sessionListFragmentV2, SessionListReadStatusViewModel sessionListReadStatusViewModel, int i) {
        super(0);
        this.$t = i;
        this.l0 = sessionListFragmentV2;
        this.l1 = sessionListReadStatusViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS148S0200000_1(IIMService iIMService, C98593tv c98593tv, int i) {
        super(0);
        this.$t = i;
        this.l0 = iIMService;
        this.l1 = c98593tv;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS148S0200000_1(ActivityStatus activityStatus, User user, int i) {
        super(0);
        this.$t = i;
        this.l0 = activityStatus;
        this.l1 = user;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS148S0200000_1(IMContact iMContact, ViewOnTouchListenerC93253lJ viewOnTouchListenerC93253lJ, int i) {
        super(0);
        this.$t = i;
        this.l0 = iMContact;
        this.l1 = viewOnTouchListenerC93253lJ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS148S0200000_1(InboxFragment inboxFragment, SessionListReadStatusViewModel sessionListReadStatusViewModel, int i) {
        super(0);
        this.$t = i;
        this.l0 = inboxFragment;
        this.l1 = sessionListReadStatusViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS148S0200000_1(InboxFragment inboxFragment, FocusedSessionListWidget focusedSessionListWidget, int i) {
        super(0);
        this.$t = i;
        this.l0 = inboxFragment;
        this.l1 = focusedSessionListWidget;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS148S0200000_1(InboxFragment inboxFragment, InboxSessionDataProvider inboxSessionDataProvider, int i) {
        super(0);
        this.$t = i;
        this.l0 = inboxFragment;
        this.l1 = inboxSessionDataProvider;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS148S0200000_1(MutualRelationEmptyCell mutualRelationEmptyCell, C93973mT c93973mT, int i) {
        super(0);
        this.$t = i;
        this.l0 = mutualRelationEmptyCell;
        this.l1 = c93973mT;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS148S0200000_1(DownloadBarComponent downloadBarComponent, C45382HrW c45382HrW, int i) {
        super(0);
        this.$t = i;
        this.l0 = downloadBarComponent;
        this.l1 = c45382HrW;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS148S0200000_1(List list, List<SearchDoc> list2, C776532z c776532z) {
        super(0);
        this.$t = c776532z;
        this.l0 = list;
        this.l1 = list2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS148S0200000_1(List list, List<SingleRecentContactData> list2, C776933d c776933d) {
        super(0);
        this.$t = c776933d;
        this.l0 = list;
        this.l1 = list2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS148S0200000_1(List list, InterfaceC65784Pro interfaceC65784Pro, int i) {
        super(0);
        this.$t = i;
        this.l0 = interfaceC65784Pro;
        this.l1 = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS148S0200000_1(SinkDeviceInfo sinkDeviceInfo, C70972qT c70972qT, C71052qb c71052qb, int i) {
        super(0);
        this.$t = i;
        this.l0 = sinkDeviceInfo;
        this.l1 = c71052qb;
    }
}
