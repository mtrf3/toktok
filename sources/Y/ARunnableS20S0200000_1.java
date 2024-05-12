package Y;

import X.AV1;
import X.AbstractC029409q;
import X.ActivityC45651qj;
import X.C0A2;
import X.C1034344d;
import X.C1034744h;
import X.C105074Al;
import X.C107114Ih;
import X.C108044Lw;
import X.C109544Rq;
import X.C109734Sj;
import X.C10K;
import X.C111154Xv;
import X.C111164Xw;
import X.C117684jc;
import X.C119514mZ;
import X.C120184ne;
import X.C139825eE;
import X.C141335gf;
import X.C162476Zf;
import X.C17N;
import X.C1DH;
import X.C1FJ;
import X.C26045AKb;
import X.C26227ARb;
import X.C29701Eo;
import X.C2MA;
import X.C2MY;
import X.C31F;
import X.C31G;
import X.C32151Nz;
import X.C34B;
import X.C38333F2r;
import X.C3C4;
import X.C3C5;
import X.C3KH;
import X.C3KV;
import X.C3KX;
import X.C3L2;
import X.C3L3;
import X.C3L4;
import X.C3UO;
import X.C43I;
import X.C45804HyK;
import X.C46008I3w;
import X.C46318IFu;
import X.C47261Igj;
import X.C4BT;
import X.C4BU;
import X.C4CB;
import X.C4CC;
import X.C4MW;
import X.C4NG;
import X.C4T3;
import X.C4WC;
import X.C4XM;
import X.C4Y6;
import X.C55953Lxd;
import X.C56308M8a;
import X.C57082Lw;
import X.C57092Lx;
import X.C57432MgO;
import X.C58042Po;
import X.C61295O3v;
import X.C61447O9r;
import X.C61878OQg;
import X.C63164Oqe;
import X.C66792jj;
import X.C70922qO;
import X.C71082qe;
import X.C75792yF;
import X.C76732zl;
import X.C76800UCe;
import X.C777333h;
import X.C77869UhF;
import X.C779434c;
import X.C779734f;
import X.C781334v;
import X.C78555UsJ;
import X.C78565UsT;
import X.C786336t;
import X.C78856UxA;
import X.C78897Uxp;
import X.C79045V0n;
import X.C7MY;
import X.C81524Vz6;
import X.C82253Kr;
import X.C82682Wcg;
import X.C88853eD;
import X.C88903eI;
import X.C90113gF;
import X.C93793mB;
import X.C96223q6;
import X.C96233q7;
import X.C96243q8;
import X.C96283qC;
import X.C96823r4;
import X.C96963rI;
import X.C97033rP;
import X.C97343ru;
import X.C97353rv;
import X.C98593tv;
import X.C99033ud;
import X.C99603vY;
import X.C99813vt;
import X.C99873vz;
import X.EnumC1035144l;
import X.EnumC109754Sl;
import X.EnumC96103pu;
import X.FKM;
import X.IDP;
import X.InterfaceC108034Lv;
import X.InterfaceC58172Qb;
import X.InterfaceC65784Pro;
import X.InterfaceC67352kd;
import X.InterfaceC81953Jn;
import X.InterfaceC83893Qz;
import X.InterfaceC86963bA;
import X.InterfaceC88472Yns;
import X.InterfaceC98813uH;
import X.LNH;
import X.LYB;
import X.O6R;
import X.ORZ;
import X.OSZ;
import X.PVC;
import X.QCU;
import X.SYL;
import X.UC0;
import X.V1B;
import X.VL7;
import X.ViewOnTouchListenerC93253lJ;
import X.WHL;
import X.X1D;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.byted.cast.common.source.ServiceInfo;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastTaskResourceIdSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3MaskAvatarSizeTestSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.ies.sdk.widgets.NextLiveData;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.arch.widgets.base.ChangeLiveData;
import com.ss.android.ugc.aweme.casting.ui.playback.feed.InteractInfoTVCastAssem;
import com.ss.android.ugc.aweme.ecomsearch.videoinnerflow.ui.EcomSearchSwipeGuideUiComponent;
import com.ss.android.ugc.aweme.emoji.stickerstore.favsticker.PopularStickerListManager;
import com.ss.android.ugc.aweme.emoji.stickerstore.model.StickerSetInfo;
import com.ss.android.ugc.aweme.feed.bottom.BottomToastVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.TextContent;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.read.viewmodel.SessionListReadStatusViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.panel.setdetail.assem.StickerSetDetailFooterAssem;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.panel.ChatRoomPanelAssem;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.view.ChatLinearLayoutManager;
import com.ss.android.ugc.aweme.im.sdk.chatlist.feature.stranger.ui.MessageRequestsActivity;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.sdk.search.ui.assem.IMSearchAssem;
import com.ss.android.ugc.aweme.im.sdk.share.panel.ui.widget.SharePanelWidget;
import com.ss.android.ugc.aweme.im.sdk.share.panel.viewmodel.SharePanelViewModel;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.profile.widgets.BaseMyProfileGuideWidget;
import com.ss.android.ugc.aweme.relation.follow.ui.RelationButton;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.cs.core.model.ClickSearchViewModel;
import com.ss.android.ugc.aweme.ug.guide.SwipeUpGuideStrengthenLayout;
import com.ss.android.ugc.feed.platform.panel.playbutton.PlayButtonComponent;
import com.ss.android.ugc.feed.platform.panel.playbutton.PlayButtonComponentTemp;
import com.ss.android.ugc.feed.platform.panel.viewpager.ViewPagerComponentTemp;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AqS132S0200000_1;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public class ARunnableS20S0200000_1 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;

    public final void LIZ$2() {
        final FrameLayout container_layout = (FrameLayout) ((View) this.l0).findViewById(R.id.bsj);
        o.LJIIIIZZ(container_layout, "container_layout");
        final View realSearchBar = ((C96283qC) ((View) this.l0).findViewById(R.id.jeb)).getSearchBar$im_base_release();
        final View cancelBtn = ((C96283qC) ((View) this.l0).findViewById(R.id.jeb)).getCancelBtn$im_base_release();
        final View bg_view = ((View) this.l0).findViewById(R.id.ajr);
        o.LJIIIIZZ(bg_view, "bg_view");
        final View content_container = ((View) this.l0).findViewById(R.id.btg);
        o.LJIIIIZZ(content_container, "content_container");
        final C96223q6 animationData = (C96223q6) ((IMSearchAssem) this.l1).LJLJI.getValue();
        final AqS151S0100000_1 aqS151S0100000_1 = new AqS151S0100000_1((View) this.l0, 659);
        final C96233q7 animationEndBlock = C96233q7.LJLIL;
        o.LJIIIZ(realSearchBar, "realSearchBar");
        o.LJIIIZ(cancelBtn, "cancelBtn");
        o.LJIIIZ(animationData, "animationData");
        o.LJIIIZ(animationEndBlock, "animationEndBlock");
        Context context = container_layout.getContext();
        if (context == null) {
            return;
        }
        final C96243q8 c96243q8 = new C96243q8(context, null);
        c96243q8.setVisibility(4);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, C78897Uxp.LJIJ(R.dimen.v8, container_layout));
        Rect rect = new Rect();
        container_layout.getGlobalVisibleRect(rect);
        int LJIJ = C78897Uxp.LJIJ(R.dimen.v_, container_layout);
        layoutParams.gravity = 8388611;
        layoutParams.topMargin = animationData.LJLILLLLZI - rect.top;
        layoutParams.setMarginStart(LJIJ);
        layoutParams.setMarginEnd(LJIJ);
        container_layout.addView(c96243q8, layoutParams);
        c96243q8.post(new Runnable() { // from class: X.3q9
            public final void LIZ() {
                if (C96243q8.this.getParent() != null) {
                    C17N.LJJLIIIJJI(C96243q8.this);
                    C2U8.LIZ(new C96273qB(false));
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(C96293qD.LJFF(container_layout, C96243q8.this, realSearchBar, animationData, false, new AqS151S0100000_1(animationEndBlock, 855)), C96293qD.LIZIZ(cancelBtn, false), C96293qD.LIZ(bg_view, false), C96293qD.LIZLLL(content_container, false), C96293qD.LJ(new AqS151S0100000_1(aqS151S0100000_1, 856), false));
                    animatorSet.start();
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean LIZ;
                try {
                    LIZ();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            case 2:
                run$2(this);
                return;
            case 3:
                run$3(this);
                return;
            case 4:
                run$4(this);
                return;
            case 5:
                run$5(this);
                return;
            case 6:
                run$6(this);
                return;
            case 7:
                run$7(this);
                return;
            case 8:
                run$8(this);
                return;
            case 9:
                run$9(this);
                return;
            case 10:
                run$10(this);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                run$11(this);
                return;
            case 12:
                run$12(this);
                return;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                run$13(this);
                return;
            case 14:
                run$14(this);
                return;
            case 15:
                run$15(this);
                return;
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                run$16(this);
                return;
            case 17:
                run$17(this);
                return;
            case 18:
                run$18(this);
                return;
            case 19:
                run$19(this);
                return;
            case 20:
                run$20(this);
                return;
            case 21:
                run$21(this);
                return;
            case 22:
                run$22(this);
                return;
            case 23:
                run$23(this);
                return;
            case 24:
                run$24(this);
                return;
            case 25:
                run$25(this);
                return;
            case 26:
                run$26(this);
                return;
            case 27:
                run$27(this);
                return;
            case 28:
                run$28(this);
                return;
            case 29:
                run$29(this);
                return;
            case 30:
                run$30(this);
                return;
            case 31:
                run$31(this);
                return;
            case 32:
                run$32(this);
                return;
            case 33:
                run$33(this);
                return;
            case 34:
                run$34(this);
                return;
            case 35:
                run$35(this);
                return;
            case 36:
                run$36(this);
                return;
            case 37:
                run$37(this);
                return;
            case 38:
                run$38(this);
                return;
            case 39:
                run$39(this);
                return;
            case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_40 /* 40 */:
                run$40(this);
                return;
            case 41:
                run$41(this);
                return;
            case 42:
                run$42(this);
                return;
            case LiveBroadcastTaskResourceIdSetting.DEFAULT /* 43 */:
                run$43(this);
                return;
            case 44:
                run$44(this);
                return;
            case 45:
                run$45(this);
                return;
            case 46:
                run$46(this);
                return;
            case 47:
                run$47(this);
                return;
            case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_48 /* 48 */:
                run$48(this);
                return;
            case C61447O9r.LJIIJ:
                run$49(this);
                return;
            case 50:
                run$50(this);
                return;
            case 51:
                run$51(this);
                return;
            case 52:
                run$52(this);
                return;
            case 53:
                run$53(this);
                return;
            case 54:
                run$54(this);
                return;
            case 55:
                run$55(this);
                return;
            case 56:
                run$56(this);
                return;
            case 57:
                run$57(this);
                return;
            case 58:
                run$58(this);
                return;
            case 59:
                run$59(this);
                return;
            case 60:
                run$60(this);
                return;
            case 61:
                run$61(this);
                return;
            case BaseNotice.CREATOR /* 62 */:
                run$62(this);
                return;
            case 63:
                run$63(this);
                return;
            case 64:
                run$64(this);
                return;
            case 65:
                run$65(this);
                return;
            case 66:
                run$66(this);
                return;
            case 67:
                run$67(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        String str;
        ((InteractInfoTVCastAssem) this.l0).getContainerView().setVisibility(0);
        C781334v c781334v = ((InteractInfoTVCastAssem) this.l0).LLFII;
        if (c781334v != null) {
            ServiceInfo value = ((C71082qe) this.l1).LIZIZ.LJIIIIZZ.getValue();
            if (value != null) {
                str = value.name;
            } else {
                str = null;
            }
            c781334v.setConnectedDeviceName(str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZ$1() {
        StickerSetInfo stickerSetInfo;
        C4BU c4bu = ((ChatRoomPanelAssem) this.l0).LJLILLLLZI;
        if (c4bu != null) {
            c4bu.LJIILL(true);
        }
        C4BT c4bt = ((ChatRoomPanelAssem) this.l0).LJLIL;
        if (c4bt != null) {
            c4bt.LJI(1, false);
        }
        Object obj = ((C105074Al) ((C43I) this.l1).LIZ).LIZIZ;
        if (obj instanceof StickerSetInfo) {
            stickerSetInfo = (StickerSetInfo) obj;
        } else {
            stickerSetInfo = null;
        }
        C4BU c4bu2 = ((ChatRoomPanelAssem) this.l0).LJLILLLLZI;
        if (c4bu2 != null) {
            c4bu2.kI(stickerSetInfo);
        }
    }

    public final void LIZ$10() {
        ObjectAnimator duration;
        BaseMyProfileGuideWidget baseMyProfileGuideWidget = (BaseMyProfileGuideWidget) this.l0;
        View view = (View) this.l1;
        C57092Lx.LIZ.getClass();
        baseMyProfileGuideWidget.LJLLL = ObjectAnimator.ofFloat(view, "translationY", 0.0f, -C61447O9r.LIZ());
        ObjectAnimator objectAnimator = ((BaseMyProfileGuideWidget) this.l0).LJLLL;
        if (objectAnimator != null && (duration = objectAnimator.setDuration(200L)) != null) {
            duration.start();
        }
    }

    public final void LIZ$11() {
        Integer valueOf;
        RelationButton view = ((C57432MgO) this.l0).LJLLILLLL;
        C38333F2r c38333F2r = (C38333F2r) this.l1;
        o.LJIIIZ(view, "view");
        if (c38333F2r != null && (valueOf = Integer.valueOf(c38333F2r.getErrorCode())) != null) {
            if (valueOf.intValue() == 5) {
                C26045AKb c26045AKb = new C26045AKb(view);
                c26045AKb.LJIIIIZZ(R.string.gj6);
                c26045AKb.LJIIJ();
                return;
            }
            if (valueOf.intValue() == 2059) {
                C26045AKb c26045AKb2 = new C26045AKb(view);
                c26045AKb2.LJIIIIZZ(R.string.gj4);
                c26045AKb2.LJIIJ();
                return;
            }
            if (valueOf.intValue() == 2065) {
                C26045AKb c26045AKb3 = new C26045AKb(view);
                c26045AKb3.LJIIIIZZ(R.string.gj7);
                c26045AKb3.LJIIJ();
                return;
            }
            if (valueOf.intValue() == 2149) {
                C26045AKb c26045AKb4 = new C26045AKb(view);
                c26045AKb4.LJIIIIZZ(R.string.gj_);
                c26045AKb4.LJIIJ();
                return;
            }
            if (valueOf.intValue() == 4) {
                C26045AKb c26045AKb5 = new C26045AKb(view);
                c26045AKb5.LJIIIIZZ(R.string.gj9);
                c26045AKb5.LJIIJ();
                return;
            }
            if (valueOf.intValue() == 24) {
                C1FJ.LJI(c38333F2r, new C26045AKb(view));
                return;
            }
            if (valueOf != null) {
                if (valueOf.intValue() == 3231) {
                    C26045AKb c26045AKb6 = new C26045AKb(view);
                    c26045AKb6.LJIIIIZZ(R.string.gj8);
                    c26045AKb6.LJIIJ();
                    return;
                } else if (valueOf.intValue() == 3058) {
                    C26045AKb c26045AKb7 = new C26045AKb(view);
                    c26045AKb7.LJIIIIZZ(R.string.gj8);
                    c26045AKb7.LJIIJ();
                    return;
                } else if (valueOf.intValue() == 3059) {
                    C26045AKb c26045AKb8 = new C26045AKb(view);
                    c26045AKb8.LJIIIIZZ(R.string.gj8);
                    c26045AKb8.LJIIJ();
                    return;
                } else if (valueOf.intValue() == 2067) {
                    C1FJ.LJI(c38333F2r, new C26045AKb(view));
                    return;
                }
            }
        }
        C26045AKb c26045AKb9 = new C26045AKb(view);
        c26045AKb9.LJIIIIZZ(R.string.gjc);
        c26045AKb9.LJIIJ();
    }

    public final void LIZ$12() {
        C26227ARb c26227ARb = new C26227ARb((Context) this.l0);
        c26227ARb.LJFF(((Context) this.l0).getResources().getString(R.string.tql));
        c26227ARb.LIZIZ(((Context) this.l0).getResources().getString(R.string.tqk));
        UC0.LIZJ(c26227ARb, new AqS132S0200000_1((Context) this.l0, (Context) this.l1, (InterfaceC65784Pro<C76800UCe>) 80));
        c26227ARb.LJII = false;
        c26227ARb.LJI().LIZLLL();
    }

    public final void LIZ$13() {
        C26227ARb c26227ARb = new C26227ARb((Context) this.l0);
        c26227ARb.LJFF(((Context) this.l0).getResources().getString(R.string.tqi));
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(((Context) this.l0).getResources().getString(R.string.tqg));
        LIZ.append("\n ");
        LIZ.append(((Context) this.l0).getResources().getString(R.string.tqh));
        c26227ARb.LIZIZ(X1D.LIZIZ(LIZ));
        UC0.LIZJ(c26227ARb, new AqS132S0200000_1((Context) this.l0, (Context) this.l1, (InterfaceC65784Pro<C76800UCe>) 81));
        c26227ARb.LJII = false;
        c26227ARb.LJI().LIZLLL();
    }

    public final void LIZ$14() {
        ((EcomSearchSwipeGuideUiComponent) this.l0).LJLJL = (C77869UhF) ((SwipeUpGuideStrengthenLayout) this.l1).findViewById(R.id.f41);
        C77869UhF c77869UhF = ((EcomSearchSwipeGuideUiComponent) this.l0).LJLJL;
        if (c77869UhF != null) {
            c77869UhF.setRepeatCount(-1);
            c77869UhF.setAnimation("search_swipe_up_lottie.json");
            c77869UhF.playAnimation();
        }
        C78565UsT.LJJIJLIJ((SwipeUpGuideStrengthenLayout) this.l1, new C66792jj((EcomSearchSwipeGuideUiComponent) this.l0, null));
    }

    public final void LIZ$15() {
        int i;
        AbstractC029409q adapter;
        EnumC1035144l type = EnumC1035144l.POSITION_MSG_WHEN_ENTER;
        C1034344d c1034344d = ((C1034744h) this.l0).LIZ;
        if (c1034344d.LJLILLLLZI.LJFF) {
            C1034344d.LIZLLL(c1034344d, type, 3);
            ((C1034744h) this.l0).getClass();
            return;
        }
        RecyclerView recyclerView = c1034344d.LJLJLLL;
        int i2 = 0;
        if (recyclerView != null && (adapter = recyclerView.getAdapter()) != null) {
            i = adapter.getItemCount();
        } else {
            i = 0;
        }
        try {
            C1034744h c1034744h = (C1034744h) this.l0;
            List LLILLL = ORZ.LLILLL((List) this.l1, i);
            Long l = ((C1034744h) this.l0).LIZ.LJLILLLLZI.LIZLLL;
            c1034744h.getClass();
            if (LLILLL != null) {
                int i3 = 0;
                for (Object obj : LLILLL) {
                    int i4 = i3 + 1;
                    if (i3 >= 0) {
                        long orderIndex = ((C109544Rq) obj).getOrderIndex();
                        if (l != null && orderIndex == l.longValue()) {
                            i2 = i3;
                            break;
                        }
                        i3 = i4;
                    } else {
                        C47261Igj.LJJJJJ();
                        throw null;
                    }
                }
            }
            i2 = -1;
        } catch (Exception unused) {
            QCU.LJFF("findPositionByLocatedOrderIndex exception!", null, 6);
        }
        V1B.LJIIZILJ("positionMsg: " + i2);
        if (i2 > 0) {
            C1034344d c1034344d2 = ((C1034744h) this.l0).LIZ;
            int LIZJ = c1034344d2.LIZJ();
            o.LJIIIZ(type, "type");
            c1034344d2.LJLJJI.LIZ(i2 + 1, LIZJ, type);
        } else {
            C1034344d.LIZLLL(((C1034744h) this.l0).LIZ, type, 3);
        }
        C57082Lw.LIZ.LIZJ("#LocateFinishWhenEnterEvent").setValue(Integer.valueOf(i2));
        ((C1034744h) this.l0).getClass();
    }

    public final void LIZ$16() {
        IMUser iMUser;
        String uid;
        Collection values = ((ConcurrentHashMap) ((C3KH) this.l0).LJLJJL).values();
        C3KH c3kh = (C3KH) this.l0;
        Iterator it = values.iterator();
        while (it.hasNext()) {
            ((LiveData) it.next()).removeObserver(c3kh.LJLJL);
        }
        ((ConcurrentHashMap) ((C3KH) this.l0).LJLJJL).clear();
        for (C3L4 c3l4 : (List) this.l1) {
            if ((c3l4 instanceof C3L3) && !(c3l4 instanceof C3L2) && (iMUser = ((C3L3) c3l4).LLIIIZ) != null && (uid = iMUser.getUid()) != null && !AV1.LJIJI(uid)) {
                C3KH c3kh2 = (C3KH) this.l0;
                ((ConcurrentHashMap) c3kh2.LJLJJL).put(uid, c3kh2.LJIIIZ(uid));
            }
        }
    }

    public final void LIZ$17() {
        String LJFF;
        C17N.LJJIIJZLJL((View) ((MessageRequestsActivity) this.l0).LJLJJL.getValue());
        C26045AKb c26045AKb = new C26045AKb((MessageRequestsActivity) this.l0);
        MessageRequestsActivity messageRequestsActivity = (MessageRequestsActivity) this.l0;
        EnumC109754Sl enumC109754Sl = (EnumC109754Sl) this.l1;
        messageRequestsActivity.getClass();
        int i = C109734Sj.LIZIZ[enumC109754Sl.ordinal()];
        if (i != 1) {
            if (i != 2) {
                LJFF = "";
            } else {
                LJFF = C97343ru.LJFF(R.string.oq);
            }
        } else {
            LJFF = C97343ru.LJFF(R.string.ok);
        }
        c26045AKb.LJIIIZ(LJFF);
        c26045AKb.LJFF(R.raw.icon_tick_fill_small_green);
        c26045AKb.LIZLLL(1000L);
        c26045AKb.LJIIJ();
    }

    public final void LIZ$18() {
        ViewGroup viewGroup;
        int i;
        View childAt;
        int height = ((View) this.l0).getHeight();
        ViewParent parent = ((View) this.l0).getParent();
        if (parent instanceof RecyclerView) {
            viewGroup = (ViewGroup) parent;
        } else {
            viewGroup = null;
        }
        int adapterPosition = ((C88853eD) this.l1).getAdapterPosition();
        int i2 = 0;
        for (int i3 = 0; i3 < adapterPosition; i3++) {
            if (viewGroup != null && (childAt = viewGroup.getChildAt(i3)) != null) {
                i = childAt.getHeight();
            } else {
                i = 0;
            }
            i2 += i;
        }
        ((View) this.l0).getLayoutParams().height = height - i2;
        View view = (View) this.l0;
        view.setLayoutParams(view.getLayoutParams());
    }

    public final void LIZ$19() {
        C109544Rq c109544Rq;
        List<C109544Rq> LJ;
        if (!((LifecycleOwner) this.l0).getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.RESUMED)) {
            return;
        }
        C99873vz c99873vz = C96963rI.LJI().LIZ;
        if (c99873vz != null && (LJ = c99873vz.LJ()) != null) {
            c109544Rq = (C109544Rq) ORZ.LJLLLL(LJ);
        } else {
            c109544Rq = null;
        }
        if (!C93793mB.LJIILLIIL(c109544Rq) && !C93793mB.LJIIIZ(c109544Rq)) {
            C99813vt c99813vt = (C99813vt) this.l1;
            c99813vt.LIZJ = false;
            c99813vt.LIZIZ();
            return;
        }
        ((C99813vt) this.l1).LIZJ = true;
    }

    public final void LIZ$20() {
        ((C99603vY) this.l0).LIZJ.getViewTreeObserver().addOnGlobalLayoutListener(((C99603vY) this.l0).LJFF);
        if (!((C99603vY) this.l0).isShowing() && ((View) this.l1).getWindowToken() != null) {
            C99603vY c99603vY = (C99603vY) this.l0;
            View view = (View) this.l1;
            if (C4XM.LIZ()) {
                C56308M8a.LIZ();
            }
            C46318IFu.LIZ.getClass();
            if (C46318IFu.LIZ()) {
                try {
                    C56308M8a.LIZIZ();
                    Window window = (Window) C56308M8a.LIZJ.get((WindowManager) C56308M8a.LIZIZ.get(c99603vY));
                    WindowManager.LayoutParams attributes = window.getAttributes();
                    int i = attributes.flags;
                    boolean booleanValue = ((Boolean) C56308M8a.LIZLLL.get(window)).booleanValue();
                    C56308M8a.LIZLLL.set(window, Boolean.FALSE);
                    attributes.flags &= -16777217;
                    c99603vY.showAtLocation(view, 0, 0, 0);
                    C56308M8a.LIZLLL.set(window, Boolean.valueOf(booleanValue));
                    attributes.flags = i;
                    return;
                } catch (Throwable unused) {
                    c99603vY.showAtLocation(view, 0, 0, 0);
                    return;
                }
            }
            c99603vY.showAtLocation(view, 0, 0, 0);
        }
    }

    public final void LIZ$21() {
        int i;
        for (float measuredWidth = ((LinearLayout) this.l0).getMeasuredWidth() / C32151Nz.LJIIZILJ(88); measuredWidth > 0.0f; measuredWidth -= 1.0f) {
            Context context = ((LinearLayout) this.l0).getContext();
            o.LJIIIIZZ(context, "parent.context");
            C119514mZ c119514mZ = new C119514mZ(context, null, 0);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(C7MY.LIZIZ(72), C7MY.LIZIZ(72));
            Integer LJI = C79045V0n.LJI(R.attr.d1, ((LYB) this.l1).LIZ);
            if (LJI != null) {
                i = LJI.intValue();
            } else {
                i = -7829368;
            }
            c119514mZ.LJLIL.add(new OSZ<>(Integer.valueOf(i), 0));
            layoutParams.setMarginStart(O6R.LJJIIZ(C32151Nz.LJIIZILJ(16)));
            layoutParams.topMargin = O6R.LJJIIZ(C32151Nz.LJIIZILJ(10));
            ((LinearLayout) this.l0).addView(c119514mZ, layoutParams);
        }
    }

    public final void LIZ$3() {
        ((C107114Ih) this.l0).setVisibility(0);
        ((C107114Ih) this.l0).measure(View.MeasureSpec.makeMeasureSpec(((View) this.l1).getWidth(), LiveLayoutPreloadThreadPriority.DEFAULT), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredHeight = ((C107114Ih) this.l0).getMeasuredHeight();
        ((C107114Ih) this.l0).getLayoutParams().height = 0;
        AnimatorSet animatorSet = new AnimatorSet();
        C107114Ih c107114Ih = (C107114Ih) this.l0;
        ValueAnimator ofInt = ValueAnimator.ofInt(0, measuredHeight);
        ofInt.setDuration(150L);
        ofInt.setStartDelay(150L);
        ofInt.addUpdateListener(c107114Ih.LJLILLLLZI);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(c107114Ih, "alpha", 0.0f, 1.0f);
        ofFloat.setDuration(150L);
        ofFloat.setStartDelay(150L);
        animatorSet.playTogether(ofInt, ofFloat);
        animatorSet.start();
    }

    public final void LIZ$4() {
        TextContent textContent;
        try {
            textContent = (TextContent) C75792yF.LIZ(((C109544Rq) this.l0).getContent(), TextContent.class);
        } catch (Exception e) {
            QCU.LJFF("handleFailMsgResend exception", e, 4);
            textContent = null;
        }
        C4MW c4mw = (C4MW) C88903eI.LIZ();
        c4mw.LIZ.LIZIZ = ((C109544Rq) this.l0).getConversationId();
        c4mw.LIZLLL(textContent);
        C97033rP c97033rP = C97033rP.LIZ;
        C109544Rq c109544Rq = (C109544Rq) this.l0;
        C99033ud c99033ud = (C99033ud) this.l1;
        c97033rP.getClass();
        c4mw.LIZ.LJFF = C97033rP.LIZ(c109544Rq, c99033ud);
        Map<String, String> localExt = ((C109544Rq) this.l0).getLocalExt();
        localExt.put("resend_deleted_msg_uuid", ((C109544Rq) this.l0).getUuid());
        localExt.put("key_resend", "1");
        c4mw.LIZ.LJII = localExt;
        c4mw.LJI();
    }

    public final void LIZ$6() {
        C139825eE c139825eE = new C139825eE((Context) this.l0);
        c139825eE.LIZIZ((View) this.l1);
        c139825eE.LJI(WHL.BOTTOM);
        String string = FKM.LIZJ().getString(R.string.qq9);
        o.LJIIIIZZ(string, "resources.getString(R.st…ge_megaphoneIcon_tooltip)");
        c139825eE.LIZJ = string;
        C82682Wcg c82682Wcg = c139825eE.LIZ;
        c82682Wcg.LJIIIZ = true;
        c82682Wcg.LJII = 5000L;
        c139825eE.LIZJ().show();
    }

    public final void LIZ$7() {
        Activity activity = ((C46008I3w) this.l0).mActivity;
        if (activity != null) {
            C139825eE c139825eE = new C139825eE(activity);
            c139825eE.LIZIZ((View) this.l1);
            c139825eE.LJI(WHL.TOP);
            c139825eE.LJIIJJI(R.string.e7n);
            c139825eE.LIZ.LJII = 3000L;
            c139825eE.LIZJ().show();
            return;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public final void LIZ$8() {
        if (((RecyclerView) ((C4NG) this.l0).findViewById(R.id.bs7)).getLayoutManager() instanceof LinearLayoutManager) {
            C0A2 layoutManager = ((RecyclerView) ((C4NG) this.l0).findViewById(R.id.bs7)).getLayoutManager();
            o.LJII(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            ((LinearLayoutManager) layoutManager).LJFF(((C76732zl) this.l1).element, 0);
            return;
        }
        ((RecyclerView) ((C4NG) this.l0).findViewById(R.id.bs7)).LJLI(((C76732zl) this.l1).element);
    }

    public final void LIZ$9() {
        C111164Xw c111164Xw = (C111164Xw) this.l0;
        ValueAnimator ofInt = ValueAnimator.ofInt(((C111154Xv) this.l1).LIZ.getWidth(), ((C111154Xv) this.l1).LJFF.getWidth());
        C111154Xv c111154Xv = (C111154Xv) this.l1;
        final C111164Xw c111164Xw2 = (C111164Xw) this.l0;
        ofInt.setDuration(300L);
        ofInt.setInterpolator(C55953Lxd.LIZLLL());
        ofInt.addUpdateListener(new AUListenerS90S0100000_1(c111154Xv, 44));
        ofInt.addListener(new C4Y6() { // from class: X.4Xy
            @Override // X.C4Y6, android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animation) {
                o.LJIIIZ(animation, "animation");
                C111164Xw.this.LIZJ(C4EQ.DEFAULT_INPUT);
            }

            @Override // X.C4Y6, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animation) {
                o.LJIIIZ(animation, "animation");
                C111164Xw.this.LIZJ(C4EQ.DEFAULT_INPUT);
            }
        });
        ofInt.start();
        c111164Xw.LIZJ = ofInt;
    }

    public final void LIZ$5() {
        String str;
        List<C109544Rq> LJ;
        C109544Rq c109544Rq;
        C99873vz c99873vz = C96963rI.LJI().LIZ;
        if (c99873vz != null && (LJ = c99873vz.LJ()) != null && (c109544Rq = (C109544Rq) ORZ.LJLLLL(LJ)) != null) {
            str = c109544Rq.getUuid();
        } else {
            str = null;
        }
        if (o.LJ(str, ((C109544Rq) this.l0).getUuid())) {
            Map<String, String> localExt = ((C109544Rq) this.l0).getLocalExt();
            if (localExt != null) {
                localExt.remove("resend_deleted_msg_uuid");
            }
            C117684jc.LIZ((C109544Rq) this.l0);
            return;
        }
        C31F.LIZ.getClass();
        C31G.LIZ();
        C63164Oqe.LJII((C109544Rq) this.l0, false, null);
        C1DH.LJJIJIIJIL(100L, new ARunnableS20S0200000_1((C109544Rq) this.l0, (C99033ud) this.l1, 27));
    }

    public static final void run$0(ARunnableS20S0200000_1 aRunnableS20S0200000_1) {
        boolean LIZ;
        try {
            SharePanelViewModel sharePanelViewModel = (SharePanelViewModel) aRunnableS20S0200000_1.l0;
            InterfaceC83893Qz interfaceC83893Qz = sharePanelViewModel.LJLILLLLZI;
            if (interfaceC83893Qz != null) {
                interfaceC83893Qz.xN((Throwable) aRunnableS20S0200000_1.l1, sharePanelViewModel.LJ());
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS20S0200000_1 aRunnableS20S0200000_1) {
        boolean LIZ;
        try {
            if (((IDP) aRunnableS20S0200000_1.l1).LJII()) {
                ((C2MA) aRunnableS20S0200000_1.l0).LLLJ().n();
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$10(ARunnableS20S0200000_1 aRunnableS20S0200000_1) {
        boolean LIZ;
        try {
            LNH.LIZLLL((ActivityC45651qj) aRunnableS20S0200000_1.l0, (Aweme) aRunnableS20S0200000_1.l1);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$11(ARunnableS20S0200000_1 aRunnableS20S0200000_1) {
        boolean LIZ;
        try {
            C2MY.LIZ().LIZIZ();
            C777333h LIZ2 = C2MY.LIZ();
            Aweme aweme = (Aweme) aRunnableS20S0200000_1.l0;
            IDP idp = ((C58042Po) aRunnableS20S0200000_1.l1).LJLJL.mPlayerController;
            LIZ2.LIZLLL = aweme;
            LIZ2.LJ = idp;
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$12(ARunnableS20S0200000_1 aRunnableS20S0200000_1) {
        boolean LIZ;
        try {
            C10K.LIZJ(new ACallableS79S0200000_1((List) aRunnableS20S0200000_1.l0, (SessionListReadStatusViewModel) aRunnableS20S0200000_1.l1, 2));
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$13(ARunnableS20S0200000_1 aRunnableS20S0200000_1) {
        boolean LIZ;
        try {
            View view = (View) aRunnableS20S0200000_1.l0;
            if (view != null) {
                float top = view.getTop();
                StickerSetDetailFooterAssem stickerSetDetailFooterAssem = (StickerSetDetailFooterAssem) aRunnableS20S0200000_1.l1;
                if (top < stickerSetDetailFooterAssem.LJLILLLLZI * 0.26999998f) {
                    stickerSetDetailFooterAssem.getContainerView().setTranslationY(0.0f);
                }
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$14(ARunnableS20S0200000_1 aRunnableS20S0200000_1) {
        boolean LIZ;
        try {
            aRunnableS20S0200000_1.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$15(ARunnableS20S0200000_1 aRunnableS20S0200000_1) {
        boolean LIZ;
        try {
            if (((RecyclerView) aRunnableS20S0200000_1.l0).getParent() != null) {
                ((ChatLinearLayoutManager) aRunnableS20S0200000_1.l1).LLIIII((RecyclerView) aRunnableS20S0200000_1.l0, null, 0);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$16(ARunnableS20S0200000_1 aRunnableS20S0200000_1) {
        boolean LIZ;
        int i;
        int i2;
        try {
            EnumC96103pu enumC96103pu = (EnumC96103pu) aRunnableS20S0200000_1.l0;
            if (enumC96103pu != null && (i = C786336t.LIZ[enumC96103pu.ordinal()]) != -1) {
                if (i != 1) {
                    if (i == 2) {
                        i2 = R.string.e_g;
                    } else {
                        throw new C162476Zf();
                    }
                } else {
                    i2 = R.string.e_f;
                }
                C26045AKb c26045AKb = new C26045AKb((Activity) aRunnableS20S0200000_1.l1);
                c26045AKb.LJIIIIZZ(i2);
                c26045AKb.LJIIJ();
            }
            i2 = R.string.i3y;
            C26045AKb c26045AKb2 = new C26045AKb((Activity) aRunnableS20S0200000_1.l1);
            c26045AKb2.LJIIIIZZ(i2);
            c26045AKb2.LJIIJ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$17(ARunnableS20S0200000_1 aRunnableS20S0200000_1) {
        boolean LIZ;
        try {
            C78856UxA c78856UxA = (C78856UxA) aRunnableS20S0200000_1.l0;
            if (c78856UxA != null) {
                ((MessageRequestsActivity) aRunnableS20S0200000_1.l1).LLIIJI(C4T3.LIZ, c78856UxA.LJ);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$18(ARunnableS20S0200000_1 aRunnableS20S0200000_1) {
        boolean LIZ;
        try {
            aRunnableS20S0200000_1.LIZ$2();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$19(ARunnableS20S0200000_1 aRunnableS20S0200000_1) {
        boolean LIZ;
        try {
            aRunnableS20S0200000_1.LIZ$3();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS20S0200000_1 aRunnableS20S0200000_1) {
        boolean LIZ;
        try {
            InterfaceC67352kd LJJII = C78555UsJ.LJJII((InterfaceC67352kd) aRunnableS20S0200000_1.l0);
            C3C4 LIZ2 = C141335gf.LIZ((Exception) aRunnableS20S0200000_1.l1);
            C3C5.m7constructorimpl(LIZ2);
            LJJII.resumeWith(LIZ2);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$20(ARunnableS20S0200000_1 aRunnableS20S0200000_1) {
        boolean LIZ;
        try {
            SharePanelViewModel sharePanelViewModel = (SharePanelViewModel) aRunnableS20S0200000_1.l0;
            InterfaceC83893Qz interfaceC83893Qz = sharePanelViewModel.LJLILLLLZI;
            if (interfaceC83893Qz != null) {
                interfaceC83893Qz.xN((Throwable) aRunnableS20S0200000_1.l1, sharePanelViewModel.LJ());
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$21(ARunnableS20S0200000_1 aRunnableS20S0200000_1) {
        boolean LIZ;
        try {
            ((NextLiveData) ((ClickSearchViewModel) aRunnableS20S0200000_1.l0).LJLJJI.getValue()).setValue((Integer) aRunnableS20S0200000_1.l1);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$22(ARunnableS20S0200000_1 aRunnableS20S0200000_1) {
        boolean LIZ;
        try {
            C0A2 layoutManager = ((SYL) aRunnableS20S0200000_1.l0).getLayoutManager();
            if (layoutManager != null) {
                layoutManager.LJZL(((Integer) aRunnableS20S0200000_1.l1).intValue());
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$23(ARunnableS20S0200000_1 aRunnableS20S0200000_1) {
        boolean LIZ;
        try {
            View view = (View) aRunnableS20S0200000_1.l0;
            if (view != null) {
                view.setVisibility(8);
            }
            ((PlayButtonComponent) aRunnableS20S0200000_1.l1).op0();
            ((PlayButtonComponent) aRunnableS20S0200000_1.l1).fi0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$24(ARunnableS20S0200000_1 aRunnableS20S0200000_1) {
        boolean LIZ;
        try {
            View view = (View) aRunnableS20S0200000_1.l0;
            if (view != null) {
                view.setVisibility(8);
            }
            ((PlayButtonComponentTemp) aRunnableS20S0200000_1.l1).op0();
            ((PlayButtonComponentTemp) aRunnableS20S0200000_1.l1).fi0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$25(ARunnableS20S0200000_1 aRunnableS20S0200000_1) {
        boolean LIZ;
        Integer LJI;
        try {
            if (((View) aRunnableS20S0200000_1.l0).getParent() != null && (LJI = C79045V0n.LJI(R.attr.cl, (Activity) aRunnableS20S0200000_1.l1)) != null) {
                Activity activity = (Activity) aRunnableS20S0200000_1.l1;
                int intValue = LJI.intValue();
                Window window = activity.getWindow();
                if (window != null) {
                    window.setNavigationBarColor(intValue);
                }
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$26(ARunnableS20S0200000_1 aRunnableS20S0200000_1) {
        boolean LIZ;
        FragmentManager supportFragmentManager;
        try {
            ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI((Activity) aRunnableS20S0200000_1.l0);
            if (LJJIFFI != null && (supportFragmentManager = LJJIFFI.getSupportFragmentManager()) != null) {
                ((TuxSheet) aRunnableS20S0200000_1.l1).show(supportFragmentManager, "TakoDisclaimerHalfScreenView");
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$27(ARunnableS20S0200000_1 aRunnableS20S0200000_1) {
        boolean LIZ;
        try {
            aRunnableS20S0200000_1.LIZ$4();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$28(ARunnableS20S0200000_1 aRunnableS20S0200000_1) {
        boolean LIZ;
        try {
            aRunnableS20S0200000_1.LIZ$5();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$29(ARunnableS20S0200000_1 aRunnableS20S0200000_1) {
        boolean LIZ;
        String str;
        try {
            C3L4 c3l4 = ((C96823r4) aRunnableS20S0200000_1.l0).LIZJ;
            if (c3l4 != null) {
                str = c3l4.LJFF();
            } else {
                str = null;
            }
            C96963rI.LJII().getClass();
            if (o.LJ(str, C97353rv.LIZLLL()) && !((C29701Eo) aRunnableS20S0200000_1.l1).isAnimating()) {
                ((C29701Eo) aRunnableS20S0200000_1.l1).playAnimation();
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$3(ARunnableS20S0200000_1 aRunnableS20S0200000_1) {
        boolean LIZ;
        try {
            ((ChangeLiveData) aRunnableS20S0200000_1.l0).setValue(aRunnableS20S0200000_1.l1);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$30(ARunnableS20S0200000_1 aRunnableS20S0200000_1) {
        boolean LIZ;
        try {
            aRunnableS20S0200000_1.LIZ$6();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$31(ARunnableS20S0200000_1 aRunnableS20S0200000_1) {
        boolean LIZ;
        try {
            aRunnableS20S0200000_1.LIZ$7();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$32(ARunnableS20S0200000_1 aRunnableS20S0200000_1) {
        boolean LIZ;
        try {
            aRunnableS20S0200000_1.LIZ$8();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$33(ARunnableS20S0200000_1 aRunnableS20S0200000_1) {
        boolean LIZ;
        try {
            ((InterfaceC58172Qb) aRunnableS20S0200000_1.l0).LJIIIIZZ((Aweme) aRunnableS20S0200000_1.l1);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$34(ARunnableS20S0200000_1 aRunnableS20S0200000_1) {
        boolean LIZ;
        try {
            aRunnableS20S0200000_1.LIZ$9();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$35(ARunnableS20S0200000_1 aRunnableS20S0200000_1) {
        boolean LIZ;
        try {
            aRunnableS20S0200000_1.LIZ$10();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$36(ARunnableS20S0200000_1 aRunnableS20S0200000_1) {
        boolean LIZ;
        try {
            ((C81524Vz6) aRunnableS20S0200000_1.l0).LIZIZ.set(true);
            Iterator it = ((List) aRunnableS20S0200000_1.l1).iterator();
            while (it.hasNext()) {
                ((InterfaceC88472Yns) it.next()).invoke(Boolean.TRUE);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$37(ARunnableS20S0200000_1 aRunnableS20S0200000_1) {
        boolean LIZ;
        try {
            ((View) aRunnableS20S0200000_1.l0).setVisibility(8);
            Iterator it = ((List) aRunnableS20S0200000_1.l1).iterator();
            while (it.hasNext()) {
                ((View) it.next()).animate().translationX(0.0f).setDuration(0L);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$38(ARunnableS20S0200000_1 aRunnableS20S0200000_1) {
        boolean LIZ;
        try {
            aRunnableS20S0200000_1.LIZ$11();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$39(ARunnableS20S0200000_1 aRunnableS20S0200000_1) {
        boolean LIZ;
        try {
            aRunnableS20S0200000_1.LIZ$12();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$4(ARunnableS20S0200000_1 aRunnableS20S0200000_1) {
        boolean LIZ;
        try {
            ((com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData) aRunnableS20S0200000_1.l1).setValue(aRunnableS20S0200000_1.l0);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$40(ARunnableS20S0200000_1 aRunnableS20S0200000_1) {
        boolean LIZ;
        try {
            aRunnableS20S0200000_1.LIZ$13();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$41(ARunnableS20S0200000_1 aRunnableS20S0200000_1) {
        boolean LIZ;
        try {
            ((InterfaceC88472Yns) aRunnableS20S0200000_1.l0).invoke((View) aRunnableS20S0200000_1.l1);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$42(ARunnableS20S0200000_1 aRunnableS20S0200000_1) {
        boolean LIZ;
        try {
            aRunnableS20S0200000_1.LIZ$14();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$43(ARunnableS20S0200000_1 aRunnableS20S0200000_1) {
        boolean LIZ;
        try {
            ((C82253Kr) aRunnableS20S0200000_1.l0).LJJIFFI((InterfaceC81953Jn) aRunnableS20S0200000_1.l1);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$44(ARunnableS20S0200000_1 aRunnableS20S0200000_1) {
        boolean LIZ;
        try {
            ((C3UO) aRunnableS20S0200000_1.l0).LIZ.getLifecycle().addObserver((PopularStickerListManager) aRunnableS20S0200000_1.l1);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$45(ARunnableS20S0200000_1 aRunnableS20S0200000_1) {
        boolean LIZ;
        try {
            C4CB c4cb = (C4CB) aRunnableS20S0200000_1.l0;
            float f = c4cb.LJIIJ;
            float f2 = c4cb.LJIIJJI;
            RecyclerView recyclerView = (RecyclerView) aRunnableS20S0200000_1.l1;
            c4cb.LJFF(f, f2, recyclerView, c4cb.LJIJI, c4cb.LJIL, recyclerView, c4cb.LJIJJLI, c4cb.LJJ, "down");
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$46(ARunnableS20S0200000_1 aRunnableS20S0200000_1) {
        boolean LIZ;
        try {
            ((C4CC) aRunnableS20S0200000_1.l0).LL((RecyclerView) aRunnableS20S0200000_1.l1);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$47(ARunnableS20S0200000_1 aRunnableS20S0200000_1) {
        boolean LIZ;
        try {
            ((Runnable) aRunnableS20S0200000_1.l0).run();
            ((C779734f) aRunnableS20S0200000_1.l1).LIZ = null;
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$48(ARunnableS20S0200000_1 aRunnableS20S0200000_1) {
        boolean LIZ;
        try {
            ((C779434c) aRunnableS20S0200000_1.l0).LJIIJJI((Aweme) aRunnableS20S0200000_1.l1);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$49(ARunnableS20S0200000_1 aRunnableS20S0200000_1) {
        boolean LIZ;
        try {
            C70922qO.LIZ("CastingServiceManager", "countdown");
            C779434c c779434c = (C779434c) aRunnableS20S0200000_1.l0;
            List<ServiceInfo> value = c779434c.LJFF.getValue();
            if (value == null) {
                value = C61878OQg.INSTANCE;
            }
            c779434c.LIZJ(4, (Aweme) aRunnableS20S0200000_1.l1, value);
            ((C779434c) aRunnableS20S0200000_1.l0).LJIILIIL();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$5(ARunnableS20S0200000_1 aRunnableS20S0200000_1) {
        boolean LIZ;
        ViewGroup viewGroup;
        try {
            View containerView = ((InteractInfoTVCastAssem) aRunnableS20S0200000_1.l0).getContainerView();
            if ((containerView instanceof ViewGroup) && (viewGroup = (ViewGroup) containerView) != null) {
                viewGroup.addView(((InteractInfoTVCastAssem) aRunnableS20S0200000_1.l0).LLFII);
            }
            C71082qe c71082qe = (C71082qe) aRunnableS20S0200000_1.l1;
            MutableLiveData<ServiceInfo> mutableLiveData = c71082qe.LIZIZ.LJIIIIZZ;
            InteractInfoTVCastAssem interactInfoTVCastAssem = (InteractInfoTVCastAssem) aRunnableS20S0200000_1.l0;
            mutableLiveData.observe(interactInfoTVCastAssem, new AObserverS65S0200000_1(interactInfoTVCastAssem, c71082qe, 4));
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$50(ARunnableS20S0200000_1 aRunnableS20S0200000_1) {
        boolean LIZ;
        try {
            C1034344d c1034344d = ((C1034744h) aRunnableS20S0200000_1.l0).LIZ;
            c1034344d.LJLJI.LJFF((C109544Rq) aRunnableS20S0200000_1.l1);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$51(ARunnableS20S0200000_1 aRunnableS20S0200000_1) {
        boolean LIZ;
        try {
            aRunnableS20S0200000_1.LIZ$15();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$52(ARunnableS20S0200000_1 aRunnableS20S0200000_1) {
        boolean LIZ;
        try {
            VL7.LIZIZ(new ARunnableS37S0100000_1((ViewPagerComponentTemp) aRunnableS20S0200000_1.l1, 111), ((BaseListFragmentPanel) aRunnableS20S0200000_1.l0).isFypForSecondFeedExperiment());
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$53(ARunnableS20S0200000_1 aRunnableS20S0200000_1) {
        boolean LIZ;
        try {
            InterfaceC86963bA interfaceC86963bA = (InterfaceC86963bA) aRunnableS20S0200000_1.l0;
            if (interfaceC86963bA != null) {
                interfaceC86963bA.onSuccess(C4WC.LIZIZ.LIZ(((C120184ne) aRunnableS20S0200000_1.l1).LIZIZ));
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$54(ARunnableS20S0200000_1 aRunnableS20S0200000_1) {
        boolean LIZ;
        try {
            ((View) aRunnableS20S0200000_1.l0).setVisibility(8);
            ((Runnable) aRunnableS20S0200000_1.l1).run();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$55(ARunnableS20S0200000_1 aRunnableS20S0200000_1) {
        boolean LIZ;
        try {
            aRunnableS20S0200000_1.LIZ$16();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$56(ARunnableS20S0200000_1 aRunnableS20S0200000_1) {
        boolean LIZ;
        try {
            aRunnableS20S0200000_1.LIZ$17();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$57(ARunnableS20S0200000_1 aRunnableS20S0200000_1) {
        boolean LIZ;
        try {
            aRunnableS20S0200000_1.LIZ$18();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$58(ARunnableS20S0200000_1 aRunnableS20S0200000_1) {
        boolean LIZ;
        try {
            InterfaceC98813uH imChatService = IMService.createIIMServicebyMonsterPlugin(false).getImChatService();
            C98593tv c98593tv = new C98593tv((Context) ((ViewOnTouchListenerC93253lJ) aRunnableS20S0200000_1.l0).LJLIL, (IMUser) aRunnableS20S0200000_1.l1);
            c98593tv.setEnterFrom(4);
            c98593tv.setEnterMethodForMob("cell");
            c98593tv.setEnterFromForMob("contact_list");
            imChatService.LJFF(c98593tv);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$59(ARunnableS20S0200000_1 aRunnableS20S0200000_1) {
        boolean LIZ;
        try {
            aRunnableS20S0200000_1.LIZ$19();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$6(ARunnableS20S0200000_1 aRunnableS20S0200000_1) {
        boolean LIZ;
        try {
            aRunnableS20S0200000_1.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$60(ARunnableS20S0200000_1 aRunnableS20S0200000_1) {
        boolean LIZ;
        try {
            aRunnableS20S0200000_1.LIZ$20();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$61(ARunnableS20S0200000_1 aRunnableS20S0200000_1) {
        boolean LIZ;
        try {
            ((ArrayList) ((C90113gF) aRunnableS20S0200000_1.l0).LJLIL).addAll((List) aRunnableS20S0200000_1.l1);
            ((C90113gF) aRunnableS20S0200000_1.l0).notifyDataSetChanged();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$62(ARunnableS20S0200000_1 aRunnableS20S0200000_1) {
        boolean LIZ;
        try {
            aRunnableS20S0200000_1.LIZ$21();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$63(ARunnableS20S0200000_1 aRunnableS20S0200000_1) {
        boolean LIZ;
        try {
            List<InterfaceC108034Lv> list = C108044Lw.LIZ;
            C61295O3v c61295O3v = (C61295O3v) aRunnableS20S0200000_1.l1;
            Iterator it = ((ArrayList) list).iterator();
            while (it.hasNext()) {
                ((InterfaceC108034Lv) it.next()).LIZ(C61295O3v.T(c61295O3v));
            }
            InterfaceC65784Pro interfaceC65784Pro = (InterfaceC65784Pro) aRunnableS20S0200000_1.l0;
            if (interfaceC65784Pro != null) {
                interfaceC65784Pro.invoke();
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$64(ARunnableS20S0200000_1 aRunnableS20S0200000_1) {
        boolean LIZ;
        try {
            if (!((C3KV) aRunnableS20S0200000_1.l0).LIZIZ) {
                C3KV.LIZIZ((C3KV) aRunnableS20S0200000_1.l0, (C3KX) aRunnableS20S0200000_1.l1, false, true, 2);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$65(ARunnableS20S0200000_1 aRunnableS20S0200000_1) {
        boolean LIZ;
        try {
            C34B.LJI("SharePanelWidget", "onLoadError");
            ((SharePanelWidget) aRunnableS20S0200000_1.l0).LJIIJ((List) aRunnableS20S0200000_1.l1);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$66(ARunnableS20S0200000_1 aRunnableS20S0200000_1) {
        boolean LIZ;
        try {
            Handler handler = (Handler) aRunnableS20S0200000_1.l0;
            if (handler != null) {
                handler.removeMessages(1002);
            }
            ((C2MA) aRunnableS20S0200000_1.l1).J7(false, true);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$67(ARunnableS20S0200000_1 aRunnableS20S0200000_1) {
        boolean LIZ;
        try {
            Handler handler = (Handler) aRunnableS20S0200000_1.l0;
            if (handler != null) {
                handler.removeMessages(1001);
            }
            ((C2MA) aRunnableS20S0200000_1.l1).J7(true, true);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$7(ARunnableS20S0200000_1 aRunnableS20S0200000_1) {
        boolean LIZ;
        try {
            C26227ARb c26227ARb = new C26227ARb((Activity) aRunnableS20S0200000_1.l0);
            c26227ARb.LIZIZ(new String((byte[]) aRunnableS20S0200000_1.l1, PVC.LIZ));
            c26227ARb.LJI().LIZLLL();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$8(ARunnableS20S0200000_1 aRunnableS20S0200000_1) {
        boolean LIZ;
        try {
            EcomSearchSwipeGuideUiComponent ecomSearchSwipeGuideUiComponent = (EcomSearchSwipeGuideUiComponent) aRunnableS20S0200000_1.l0;
            C77869UhF c77869UhF = ecomSearchSwipeGuideUiComponent.LJLJL;
            if (c77869UhF != null) {
                c77869UhF.cancelAnimation();
            }
            ecomSearchSwipeGuideUiComponent.LJLJL = null;
            C45804HyK.LJJIJIIJIL((SwipeUpGuideStrengthenLayout) aRunnableS20S0200000_1.l1);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$9(ARunnableS20S0200000_1 aRunnableS20S0200000_1) {
        boolean LIZ;
        try {
            ((BottomToastVM) aRunnableS20S0200000_1.l0).iv0((Fragment) aRunnableS20S0200000_1.l1);
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS20S0200000_1(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
