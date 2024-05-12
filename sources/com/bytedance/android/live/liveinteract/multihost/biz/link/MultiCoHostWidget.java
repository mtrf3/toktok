package com.bytedance.android.live.liveinteract.multihost.biz.link;

import X.B5G;
import X.BDN;
import X.BZI;
import X.C05170If;
import X.C05630Jz;
import X.C0NB;
import X.C15380j0;
import X.C15490jB;
import X.C15510jD;
import X.C16880lQ;
import X.C1FL;
import X.C20780ri;
import X.C212418Vh;
import X.C213178Yf;
import X.C213198Yh;
import X.C221108m2;
import X.C28329B9x;
import X.C28787BRn;
import X.C29044Baa;
import X.C29306Beo;
import X.C29628Bk0;
import X.C29629Bk1;
import X.C2L4;
import X.C30725C4b;
import X.C30868C9o;
import X.C32208CkW;
import X.C32537Cpp;
import X.C33Q;
import X.C3C8;
import X.C48459J0d;
import X.C51029K0z;
import X.C55096Ljo;
import X.C55230Lly;
import X.C56412MCa;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C74735TUt;
import X.C75185Tf3;
import X.C75406Tic;
import X.C75417Tin;
import X.C75470Tje;
import X.C75475Tjj;
import X.C75505TkD;
import X.C75516TkO;
import X.C75518TkQ;
import X.C75536Tki;
import X.C75583TlT;
import X.C75584TlU;
import X.C75585TlV;
import X.C75588TlY;
import X.C75589TlZ;
import X.C75590Tla;
import X.C75591Tlb;
import X.C75592Tlc;
import X.C75593Tld;
import X.C75596Tlg;
import X.C75621Tm5;
import X.C75626TmA;
import X.C75633TmH;
import X.C75642TmQ;
import X.C75648TmW;
import X.C75728Tno;
import X.C75737Tnx;
import X.C75768ToS;
import X.C75842Tpe;
import X.C75883TqJ;
import X.C76128TuG;
import X.C76271TwZ;
import X.C76414Tys;
import X.C76457TzZ;
import X.C76800UCe;
import X.C76965UIn;
import X.C78999UzT;
import X.C79234V7u;
import X.C81705W4v;
import X.C86881Y7x;
import X.C8E;
import X.C8VV;
import X.C8YZ;
import X.CL6;
import X.CN1;
import X.EnumC31946CgI;
import X.EnumC46483IMd;
import X.EnumC75587TlX;
import X.EnumC75620Tm4;
import X.EnumC76391TyV;
import X.FT5;
import X.InterfaceC212848Wy;
import X.InterfaceC222288nw;
import X.InterfaceC30442Bx8;
import X.InterfaceC31781Cdd;
import X.InterfaceC74695TTf;
import X.InterfaceC75441TjB;
import X.InterfaceC75478Tjm;
import X.InterfaceC75599Tlj;
import X.InterfaceC78493UrJ;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.InterfaceC88473Ynt;
import X.InterfaceC88474Ynu;
import X.InterfaceC88475Ynv;
import X.InterfaceC88476Ynw;
import X.InterfaceC92693kP;
import X.JBR;
import X.KPL;
import X.OLX;
import X.OSK;
import X.OSL;
import X.OSM;
import X.TBW;
import X.U26;
import X.U8H;
import X.U8O;
import X.UC0;
import X.UFE;
import X.ViewOnClickListenerC76430Tz8;
import X.W5I;
import X.X1D;
import android.animation.AnimatorSet;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.liveinteract.api.CoHostAndMultiGuestSceneGiftPanelChangeChannel;
import com.bytedance.android.live.liveinteract.api.CoHostLiveWidget;
import com.bytedance.android.live.liveinteract.api.LinkCrossRoomStateChangeEvent;
import com.bytedance.android.live.liveinteract.multihost.biz.dialog.LinkDialog;
import com.bytedance.android.live.liveinteract.multihost.biz.helper.MultiHostScope;
import com.bytedance.android.live.liveinteract.multihost.biz.link.view.MultiCoHostWindowManager;
import com.bytedance.android.live.liveinteract.multihost.biz.statemanager.MultiHostSessionAbility;
import com.bytedance.android.live.liveinteract.multihost.biz.view.ICoHostTopicAbility;
import com.bytedance.android.live.liveinteract.multihost.biz.view.InteractionTitleLayout;
import com.bytedance.android.live.liveinteract.multihost.core.service.IMultiHostService;
import com.bytedance.android.live.liveinteract.multimatch.widget.MatchBaseWidget;
import com.bytedance.android.live.liveinteract.multimatch.widget.MultiMatchAnchorWidget;
import com.bytedance.android.live.liveinteract.multimatch.widget.MultiMatchAudienceWidget;
import com.bytedance.android.live.liveinteract.platform.statemanager.LinkStatusViewModel;
import com.bytedance.android.live.liveinteract.platform.statemanager.iablility.ISessionAbility;
import com.bytedance.android.live.liveinteract.platform.statemanager.iablility.UserState;
import com.bytedance.android.live.microom.IMicRoomService;
import com.bytedance.android.livesdk.chatroom.model.interact.CohostTopic;
import com.bytedance.android.livesdk.chatroom.model.interact.TopicSessionStatus;
import com.bytedance.android.livesdk.comp.api.linkcore.model.RtcUserInfo;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicSeiSubSceneTechSwitchSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiHostPauseLiveAnchorEnableSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiMatchFixLayerSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.MultiHostNotUpdateListSetting;
import com.bytedance.android.livesdk.livesetting.performance.GoLiveMemoryLeakOptSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveUltimateInflateSwitchSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveMultiHostGiftTrayOptSetting;
import com.bytedance.android.livesdk.model.message.CohostTopicMessage;
import com.bytedance.android.livesdk.model.message.HeatUpdateContent;
import com.bytedance.android.livesdk.model.message.linkcore.Player;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.RoomLinkInfo;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.RecyclableWidgetManager;
import com.zhiliaoapp.musically.R;
import defpackage.b1;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AqS143S0200000_12;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.AqS195S0100000_13;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public final class MultiCoHostWidget extends CoHostLiveWidget implements InterfaceC75599Tlj, KPL, InterfaceC78493UrJ, C2L4 {
    public final boolean LJLIL;
    public boolean LJLILLLLZI;
    public boolean LJLJI;
    public C76414Tys LJLJL;
    public MatchBaseWidget LJLLI;
    public boolean LJLLILLLL;
    public InterfaceC92693kP LJLLJ;
    public long LJLZ;
    public int LJZ;
    public final AqS195S0100000_13 LJZI;
    public final C62822Ol8 LJLJJI = C221108m2.LIZIZ(new AqS163S0100000_13(this, 119));
    public final C62822Ol8 LJLJJL = C221108m2.LIZIZ(new AqS163S0100000_13(this, LiveTryModeCountDownThresholdSetting.DEFAULT));
    public final C62822Ol8 LJLJJLL = C221108m2.LIZIZ(new AqS163S0100000_13(this, 121));
    public final C62822Ol8 LJLJLJ = C221108m2.LIZIZ(new AqS163S0100000_13(this, 122));
    public final C62822Ol8 LJLJLLL = C221108m2.LIZIZ(C75592Tlc.LJLIL);
    public final C62822Ol8 LJLL = C221108m2.LIZIZ(C75591Tlb.LJLIL);
    public final C75518TkQ LJLLL = new C75518TkQ();
    public final C75470Tje LJLLLL = new C75470Tje();
    public final C75584TlU LJLLLLLL = new C75584TlU(this);

    @Override // X.InterfaceC78493UrJ
    public final void LJJIL() {
    }

    @Override // X.InterfaceC32182Ck6
    public final void LJLILLLLZI() {
        int i;
        this.LJLJI = true;
        C75596Tlg LJZ = LJZ();
        LJZ.getClass();
        C0NB.LJIIIZ("MultiCoHostPresenter", "onMicRoomStart");
        if (LJZ.LJLIL) {
            C30868C9o.LJI(C15380j0.LJIILJJIL(R.string.kv9));
            DataChannel dataChannel = LJZ.dataChannel;
            o.LJIIIIZZ(dataChannel, "dataChannel");
            Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
            if (room != null) {
                BZI LIZ = C28787BRn.LIZ("livesdk_lineup_cohost_disconnect_toast");
                LIZ.LJIJJ(Long.valueOf(room.getOwnerUserId()), "anchor_id");
                C29629Bk1 c29629Bk1 = (C29629Bk1) dataChannel.kv0(C29628Bk0.class);
                if (c29629Bk1 != null) {
                    i = c29629Bk1.LIZ;
                } else {
                    i = room.officialChannelInfo.roleType;
                }
                UFE.LIZIZ(i, LIZ, "lineup_anchor_type");
            }
            C8E.LIZLLL().LJLLJ(new OLX("leave_with_microom_start", 0L, 62), null);
        }
    }

    @Override // X.KPL, X.C8YZ
    public final LifecycleOwner getActualLifecycleOwner() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public final C8YZ getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.KPL, X.InterfaceC212848Wy
    public final C3C8 getActualReceiver() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public final InterfaceC212848Wy<C3C8> getActualReceiverHolder() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public final LifecycleOwner getHostLifecycleOwner() {
        return null;
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.dph;
    }

    @Override // X.KPL, X.C8YM
    public final LifecycleOwner getOwnLifecycleOwner() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public final C3C8 getReceiverForHostVM() {
        return null;
    }

    @Override // X.C8YM
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    @Override // com.bytedance.android.live.liveinteract.api.CoHostLiveWidget, com.bytedance.android.live.liveinteract.api.BaseLinkWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // X.InterfaceC75599Tlj
    public final void LJLJJI() {
        C76414Tys c76414Tys;
        C0NB.LJIIIZ("MultiCoHostWidget", "onBattleEnd, show cohost topic guide animation");
        C75633TmH.LJIIJJI = false;
        if (!this.LJLILLLLZI) {
            CohostTopic cohostTopic = (CohostTopic) ((LinkedHashMap) C75633TmH.LIZ).get(U26.LIZ());
            if (cohostTopic != null && (c76414Tys = this.LJLJL) != null) {
                c76414Tys.LIZIZ(cohostTopic, 0L);
            }
        }
    }

    public final C75596Tlg LJZ() {
        return (C75596Tlg) this.LJLJLLL.getValue();
    }

    public final FrameLayout LJZI() {
        Object value = this.LJLJLJ.getValue();
        o.LJIIIIZZ(value, "<get-topicGuideBubbleContainer>(...)");
        return (FrameLayout) value;
    }

    public final MultiCoHostWindowManager LJZL() {
        return (MultiCoHostWindowManager) this.LJLL.getValue();
    }

    public final void LL() {
        Fragment LJIIIZ;
        AnimatorSet animatorSet;
        AnimatorSet animatorSet2;
        ICoHostTopicAbility iCoHostTopicAbility;
        InterfaceC31781Cdd interfaceC31781Cdd = this.widgetCallback;
        if (interfaceC31781Cdd == null || (LJIIIZ = interfaceC31781Cdd.getFragment()) == null) {
            LJIIIZ = C79234V7u.LJIIIZ(getView());
        }
        if (LJIIIZ != null && (iCoHostTopicAbility = (ICoHostTopicAbility) C55096Ljo.LIZ(C55230Lly.LIZJ(LJIIIZ, null), ICoHostTopicAbility.class, null)) != null) {
            iCoHostTopicAbility.Ya();
        }
        C76414Tys c76414Tys = this.LJLJL;
        if (c76414Tys != null) {
            AnimatorSet animatorSet3 = c76414Tys.LJLJJI;
            if (animatorSet3 != null && animatorSet3.isRunning() && (animatorSet2 = c76414Tys.LJLJJI) != null) {
                animatorSet2.cancel();
            }
            AnimatorSet animatorSet4 = c76414Tys.LJLJJL;
            if (animatorSet4 != null && animatorSet4.isRunning() && (animatorSet = c76414Tys.LJLJJL) != null) {
                animatorSet.cancel();
            }
            c76414Tys.LIZ(R.id.fna).setVisibility(8);
            c76414Tys.LIZ(R.id.fn8).setVisibility(8);
            ConstraintLayout layout_linkmic_set = (ConstraintLayout) c76414Tys.LIZ(R.id.fjd);
            o.LJIIIIZZ(layout_linkmic_set, "layout_linkmic_set");
            C76414Tys.LJIILIIL(-2, layout_linkmic_set);
            c76414Tys.LIZ(R.id.f5b).setAlpha(1.0f);
            ((ImageView) c76414Tys.LIZ(R.id.f5b)).setVisibility(0);
            c76414Tys.LJIIJ();
        }
        if (!this.LJLILLLLZI) {
            C75642TmQ.LJJJJI(System.currentTimeMillis() - C75633TmH.LIZLLL, null);
        }
    }

    @Override // X.InterfaceC78493UrJ
    public final void LLIIIZ() {
        InterfaceC75441TjB LJJIJL;
        InterfaceC74695TTf LLIIJLIL;
        if (MultiHostNotUpdateListSetting.INSTANCE.getValue() && (LJJIJL = C8E.LIZLLL().LJJIJL()) != null && (LLIIJLIL = LJJIJL.LLIIJLIL()) != null) {
            LLIIJLIL.resume();
        }
    }

    @Override // X.InterfaceC75599Tlj
    public final void PC() {
        boolean z;
        MatchBaseWidget multiMatchAudienceWidget;
        String str;
        EnumC31946CgI LJJJJ;
        InterfaceC75441TjB LJJIJL;
        U8H LJJZZI;
        if (this.LJLILLLLZI) {
            InterfaceC75441TjB LJJIJL2 = C8E.LIZLLL().LJJIJL();
            if (LJJIJL2 != null && (LJJJJ = LJJIJL2.LJJJJ()) != null && (LJJIJL = C8E.LIZLLL().LJJIJL()) != null && (LJJZZI = LJJIJL.LJJZZI()) != null) {
                LJJZZI.LJJLJLI(LJJJJ.getType());
            }
            C75518TkQ c75518TkQ = this.LJLLL;
            if (c75518TkQ.LIZJ()) {
                c75518TkQ.LIZ(c75518TkQ.LIZJ);
                if (c75518TkQ.LIZJ) {
                    c75518TkQ.LIZLLL(2);
                }
            }
        }
        C0NB.LJIIIZ("MultiCoHostWidget", "onCoHostLinked, will load match widget as a sub widget");
        C0NB.LJIIIZ("MultiCoHostWidget", "loadMatchWidget ");
        CL6.LIZ = this.LJLILLLLZI;
        if (this.LJLLI == null) {
            enableSubWidgetManager(C28329B9x.LIZJ(getContext()));
            DataChannel dataChannel = this.dataChannel;
            if (dataChannel != null) {
                z = o.LJ(dataChannel.kv0(UserIsAnchorChannel.class), Boolean.TRUE);
            } else {
                z = false;
            }
            if (z) {
                View view = getView();
                o.LJI(view);
                MultiCoHostWindowManager windowManager = LJZL();
                o.LJIIIZ(windowManager, "windowManager");
                C76271TwZ.LIZ.LJJJJIZL(true);
                multiMatchAudienceWidget = new MultiMatchAnchorWidget(view);
                multiMatchAudienceWidget.LJLIL = windowManager;
            } else {
                C76271TwZ c76271TwZ = C76271TwZ.LIZ;
                long j = B5G.LIZIZ().LJFF;
                C76271TwZ.LJJIJIIJIL = C30725C4b.LIZ();
                JSONObject jSONObject = new JSONObject();
                C05630Jz.LJFF(jSONObject, "channel_id", j);
                C05630Jz.LIZ(1, "is_sdk", jSONObject);
                C76271TwZ.LJJ(jSONObject, false);
                JSONObject jSONObject2 = new JSONObject();
                C05630Jz.LJFF(jSONObject2, "cost", C30725C4b.LIZ() - C76271TwZ.LJJIJIIJIL);
                C76271TwZ.LJLJJLL(c76271TwZ, "coHost_identified", jSONObject, null, jSONObject2, false, 20);
                View view2 = getView();
                o.LJI(view2);
                MultiCoHostWindowManager windowManager2 = LJZL();
                o.LJIIIZ(windowManager2, "windowManager");
                c76271TwZ.LJJJJIZL(false);
                multiMatchAudienceWidget = new MultiMatchAudienceWidget(view2);
                multiMatchAudienceWidget.LJLIL = windowManager2;
            }
            this.LJLLI = multiMatchAudienceWidget;
            this.subWidgetManager.load(multiMatchAudienceWidget);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("loadMatchWidget , sub widget ");
            MatchBaseWidget matchBaseWidget = this.LJLLI;
            if (matchBaseWidget == null || (str = C16880lQ.LJLLILLLL(matchBaseWidget.getClass())) == null) {
                str = "baseWidget";
            }
            LIZ.append(str);
            LIZ.append(" loaded");
            C0NB.LJIIIZ("MultiCoHostWidget", X1D.LIZIZ(LIZ));
        } else {
            C0NB.LJIIIZ("MultiCoHostWidget", "loadMatchWidget , sub widget already loaded");
        }
        if (B5G.LIZIZ().LJFF != 0) {
            this.LJLZ = B5G.LIZIZ().LJFF;
        }
    }

    @Override // X.InterfaceC75599Tlj
    public final void XA() {
        if (this.LJLILLLLZI) {
            C75518TkQ c75518TkQ = this.LJLLL;
            if (!c75518TkQ.LIZJ() || !c75518TkQ.LIZJ) {
                return;
            }
            c75518TkQ.LIZLLL(3);
        }
    }

    @Override // X.InterfaceC31336CRo
    public final String getLogTag() {
        return MultiCoHostWidget.class.getName();
    }

    @Override // X.C2L4
    public final List<Class<Object>> getScopeDefine() {
        return C76965UIn.LIZ(MultiHostScope.class);
    }

    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Boolean, O] */
    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        InterfaceC75441TjB LJJIJL;
        U8H LJJZZI;
        U8O LJJIIZI;
        DataChannel dataChannel;
        InterfaceC31781Cdd interfaceC31781Cdd;
        Fragment LJIIIZ;
        C0NB.LJIIIZ("MultiCoHostWidget", "onDestroy");
        C75518TkQ c75518TkQ = this.LJLLL;
        Fragment fragment = this.widgetCallback.getFragment();
        o.LJIIIIZZ(fragment, "widgetCallback.fragment");
        c75518TkQ.getClass();
        C74735TUt c74735TUt = null;
        if (c75518TkQ.LIZJ()) {
            if (!LinkMicSeiSubSceneTechSwitchSetting.INSTANCE.enable() && (LJJIJL = C8E.LIZLLL().LJJIJL()) != null && (LJJZZI = LJJIJL.LJJZZI()) != null && (LJJIIZI = LJJZZI.LJJIIZI()) != null) {
                LJJIIZI.setPlayerInfoProvider(C75185Tf3.LIZ);
            }
            c75518TkQ.LIZIZ = false;
            C75406Tic c75406Tic = c75518TkQ.LJI;
            if (c75406Tic != null) {
                c75406Tic.LIZIZ = null;
                UC0.LJJLIIIJ(C55230Lly.LIZJ(fragment, "linkMicScope"), ISessionAbility.class, null);
                LinkStatusViewModel linkStatusViewModel = c75406Tic.LIZ;
                if (linkStatusViewModel != null) {
                    linkStatusViewModel.lv0(C55230Lly.LIZJ(fragment, "linkMicScope"));
                }
            }
            c75518TkQ.LIZLLL.removeCallbacksAndMessages(null);
            c75518TkQ.LIZ.LIZLLL();
        }
        C75470Tje c75470Tje = this.LJLLLL;
        o.LJIIIIZZ(this.widgetCallback.getFragment(), "widgetCallback.fragment");
        c75470Tje.getClass();
        ((ConcurrentHashMap) c75470Tje.LIZLLL).clear();
        InterfaceC92693kP interfaceC92693kP = this.LJLLJ;
        if (interfaceC92693kP != null) {
            interfaceC92693kP.dispose();
        }
        if (C76128TuG.LIZIZ(this.dataChannel, false, 6) && (((interfaceC31781Cdd = this.widgetCallback) != null && (LJIIIZ = interfaceC31781Cdd.getFragment()) != null) || (LJIIIZ = C79234V7u.LJIIIZ(getView())) != null)) {
            C8VV.LJIIIIZZ(LJIIIZ, C65352Pkq.LIZ(InteractionTitleLayout.class));
        }
        GoLiveMemoryLeakOptSetting.INSTANCE.enable();
        if (MultiMatchFixLayerSetting.INSTANCE.enable2()) {
            LJZL().LIZ();
        }
        LJZI().setVisibility(8);
        LJZI().removeAllViews();
        C76414Tys c76414Tys = this.LJLJL;
        if (c76414Tys != null) {
            c76414Tys.setVisibility(8);
        }
        C0NB.LJIIIZ("MultiCoHostWidget", "unloadMatchWidget , sub widget unload");
        this.LJLLILLLL = false;
        MatchBaseWidget matchBaseWidget = this.LJLLI;
        if (matchBaseWidget != null) {
            try {
                RecyclableWidgetManager recyclableWidgetManager = this.subWidgetManager;
                if (recyclableWidgetManager != null) {
                    recyclableWidgetManager.unload(matchBaseWidget);
                }
            } catch (Exception e) {
                C0NB.LJFF("MultiCoHostWidget", "unloadMatchWidget error", e);
            }
        }
        this.LJLLI = null;
        this.LJZ = 0;
        if (MultiMatchFixLayerSetting.INSTANCE.enable1()) {
            try {
                super.onDestroy();
            } catch (Throwable th) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("link_mic_match_exception_crash, ");
                LIZ.append(th.getMessage());
                C0NB.LJIIIZ("MultiCoHostWidget", X1D.LIZIZ(LIZ));
                C75516TkO.LIZ.LIZIZ(60000, "link_mic_match_exception_crash", th, null);
            }
        } else {
            super.onDestroy();
        }
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null) {
            ((C32537Cpp) dataChannel2.gv0(BDN.class)).LIZ = Boolean.FALSE;
        }
        DataChannel dataChannel3 = this.dataChannel;
        if (dataChannel3 != null) {
            dataChannel3.rv0(LinkCrossRoomStateChangeEvent.class, new C32208CkW(1));
        }
        DataChannel dataChannel4 = this.dataChannel;
        if (dataChannel4 != null) {
            c74735TUt = (C74735TUt) dataChannel4.kv0(CoHostAndMultiGuestSceneGiftPanelChangeChannel.class);
        }
        if (LiveMultiHostGiftTrayOptSetting.INSTANCE.isOptimizeMultiHost() && c74735TUt != null && c74735TUt.LJLILLLLZI == 2 && C29306Beo.LJJIFFI(Boolean.valueOf(c74735TUt.LJLIL)) && (dataChannel = this.dataChannel) != null) {
            dataChannel.rv0(CoHostAndMultiGuestSceneGiftPanelChangeChannel.class, new C74735TUt(false, 2));
        }
        C8E.LIZLLL().LJZI(C75593Tld.class, this.LJZI);
        LJZ().detachView();
        if (!MultiMatchFixLayerSetting.INSTANCE.enable2()) {
            LJZL().LIZ();
        }
    }

    @Override // X.InterfaceC75599Tlj
    public final void a30() {
        LL();
        LJZI().setVisibility(8);
        LJZI().removeAllViews();
        CohostTopic cohostTopic = (CohostTopic) ((LinkedHashMap) C75633TmH.LIZ).get(U26.LIZ());
        if (cohostTopic != null) {
            if (this.LJLILLLLZI) {
                C75642TmQ.LJJIJIL(EnumC75587TlX.MATCH_START.getValue(), cohostTopic.totalHeat, cohostTopic.totalRivals);
            }
            C75633TmH.LJIIJJI = true;
        }
        C0NB.LJIIIZ("MultiCoHostWidget", "onBattleStarted, stop cohost topic guide animation");
    }

    @Override // X.InterfaceC75599Tlj
    public final void od() {
        LL();
        C75633TmH.LIZ();
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Boolean, O] */
    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        boolean z;
        boolean z2;
        InterfaceC75478Tjm interfaceC75478Tjm;
        boolean z3;
        Boolean bool;
        InterfaceC75441TjB LJJIJL;
        U8H LJJZZI;
        U8O LJJIIZI;
        InterfaceC92693kP registerAppEnterForeBackgroundCallback;
        Long l;
        Fragment LJIIIZ;
        ICoHostTopicAbility iCoHostTopicAbility;
        Fragment LJIIIZ2;
        RoomLinkInfo linkMicInfo;
        CohostTopic cohostTopic;
        long j;
        TopicSessionStatus topicSessionStatus;
        Boolean bool2;
        super.onCreate();
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && (bool2 = (Boolean) dataChannel.kv0(UserIsAnchorChannel.class)) != null) {
            z = bool2.booleanValue();
        } else {
            z = false;
        }
        this.LJLILLLLZI = z;
        Object value = C8E.LJFF.getValue();
        o.LJIIIIZZ(value, "<get-micRoomService>(...)");
        this.LJLJI = ((IMicRoomService) value).oT();
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        ((C32537Cpp) this.dataChannel.gv0(BDN.class)).LIZ = Boolean.TRUE;
        LJZ().attachView(this);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onCreate, layoutContainer = ");
        Object value2 = this.LJLJJI.getValue();
        o.LJIIIIZZ(value2, "<get-layoutContainer>(...)");
        LIZ.append(value2);
        LIZ.append("  layoutLinkMicContainer = ");
        Object value3 = this.LJLJJL.getValue();
        o.LJIIIIZZ(value3, "<get-layoutLinkMicContainer>(...)");
        LIZ.append(value3);
        C0NB.LJIIIZ("MultiCoHostWidget", X1D.LIZIZ(LIZ));
        MultiCoHostWindowManager LJZL = LJZL();
        DataChannel dataChannel2 = this.dataChannel;
        o.LJIIIIZZ(dataChannel2, "dataChannel");
        Object value4 = this.LJLJJL.getValue();
        o.LJIIIIZZ(value4, "<get-layoutLinkMicContainer>(...)");
        Object value5 = this.LJLJJLL.getValue();
        o.LJIIIIZZ(value5, "<get-layoutLinkMicEffectContainer>(...)");
        LJZL.getClass();
        LJZL.LIZJ = dataChannel2;
        LJZL.LIZLLL = (FrameLayout) value4;
        LJZL.LJFF = (FrameLayout) value5;
        LJZL.LJII = this;
        Lifecycle lifecycle = getLifecycle();
        if (lifecycle != null) {
            lifecycle.addObserver(LJZL.LJIILJJIL);
        }
        Boolean bool3 = (Boolean) dataChannel2.kv0(UserIsAnchorChannel.class);
        if (bool3 != null) {
            z2 = bool3.booleanValue();
        } else {
            z2 = false;
        }
        LJZL.LIZIZ = z2;
        C8E.LIZLLL().LJJJZ(C75728Tno.class, LJZL.LJIIJ);
        C8E.LIZLLL().LJJJZ(C75593Tld.class, LJZL.LJIILIIL);
        C8E.LIZLLL().LJJJZ(C75588TlY.class, LJZL.LJIIL);
        C8E.LIZLLL().LJJJZ(C75737Tnx.class, LJZL.LJIIJJI);
        C75596Tlg LJZ = LJZ();
        Object value6 = this.LJLJJI.getValue();
        o.LJIIIIZZ(value6, "<get-layoutContainer>(...)");
        ViewGroup viewGroup = (ViewGroup) value6;
        Object value7 = this.LJLJJL.getValue();
        o.LJIIIIZZ(value7, "<get-layoutLinkMicContainer>(...)");
        FrameLayout frameLayout = (FrameLayout) value7;
        boolean z4 = this.LJLIL;
        LJZ.getClass();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("startCoHostUI, container=");
        LIZ2.append(viewGroup.hashCode());
        LIZ2.append(", linkMicContainer=");
        LIZ2.append(frameLayout.hashCode());
        C0NB.LJIIIZ("MultiCoHostPresenter", X1D.LIZIZ(LIZ2));
        IMultiHostService LIZLLL = C8E.LIZLLL();
        T viewInterface = LJZ.mView;
        o.LJIIIIZZ(viewInterface, "viewInterface");
        LIZLLL.LJJZZI(viewGroup, frameLayout, (LifecycleOwner) viewInterface, z4);
        C8E.LIZLLL().LJJJZ(C75593Tld.class, this.LJZI);
        if (B5G.LIZIZ().LJFF != 0) {
            this.LJLZ = B5G.LIZIZ().LJFF;
        }
        if (!this.LJLILLLLZI) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("onCreate, logAudienceWatchStart, linkedSize=");
            LIZ3.append(C8E.LIZLLL().LJIILJJIL().size());
            C0NB.LJIIIZ("MultiCoHostWidget", X1D.LIZIZ(LIZ3));
            int size = C8E.LIZLLL().LJIILJJIL().size();
            boolean z5 = this.LJLILLLLZI;
            long j2 = this.LJLZ;
            if (size != 0 && C75585TlV.LIZLLL != size) {
                C75585TlV.LIZLLL = size;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                C75585TlV.LIZ = elapsedRealtime;
                C75585TlV.LIZIZ(size, elapsedRealtime);
                C75642TmQ.LJJJJIZL(j2, z5);
            }
            if (room != null && (linkMicInfo = room.getLinkMicInfo()) != null && (cohostTopic = linkMicInfo.topicInfo) != null) {
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("update audience topic info onCreate(), topicInfo = ");
                LIZ4.append(C75633TmH.LIZ);
                C0NB.LJIIIZ("MultiCoHostWidget", X1D.LIZIZ(LIZ4));
                C75633TmH.LIZ.put(Long.valueOf(this.LJLZ), cohostTopic);
                RoomLinkInfo linkMicInfo2 = room.getLinkMicInfo();
                if (linkMicInfo2 != null && (topicSessionStatus = linkMicInfo2.topicStatus) != null) {
                    j = topicSessionStatus.sessionHeat;
                } else {
                    j = 0;
                }
                C75633TmH.LJFF = j;
            }
            C8E.LIZJ().Ty("component_type", new WeakReference<>(C76457TzZ.LIZJ));
        }
        this.LJLJL = (C76414Tys) findViewById(R.id.fjb);
        if (C76128TuG.LIZIZ(this.dataChannel, false, 6)) {
            findViewById(R.id.fjc).setVisibility(0);
            C76414Tys c76414Tys = this.LJLJL;
            if (c76414Tys != null) {
                c76414Tys.setVisibility(8);
            }
            InterfaceC31781Cdd interfaceC31781Cdd = this.widgetCallback;
            if ((interfaceC31781Cdd != null && (LJIIIZ2 = interfaceC31781Cdd.getFragment()) != null) || (LJIIIZ2 = C79234V7u.LJIIIZ(getView())) != null) {
                C8VV.LIZ(LJIIIZ2, false, new AqS143S0200000_12(LJIIIZ2, this, 13));
            }
        } else {
            C76414Tys c76414Tys2 = this.LJLJL;
            if (c76414Tys2 != null) {
                c76414Tys2.setVisibility(0);
            }
            C76414Tys c76414Tys3 = this.LJLJL;
            if (c76414Tys3 != null) {
                C15490jB.LJFF(c76414Tys3.LJLILLLLZI, "tiktok_live_interaction_normal_1", "ttlive_icon_in_multi_co_host.webp", ImageView.ScaleType.CENTER_CROP, new C75626TmA());
                C81705W4v LIZJ = W5I.LIZJ();
                LIZJ.LJII(C15510jD.LJIIIZ("tiktok_live_match_resource", "ttlive_match_calculating_clock.webp"));
                c76414Tys3.LJLJL = LIZJ;
            }
        }
        long LIZ5 = C30725C4b.LIZ();
        StringBuilder LIZ6 = X1D.LIZ();
        LIZ6.append("componentLoadStartTime = ");
        LIZ6.append(C75621Tm5.LJ);
        LIZ6.append(" --------22222----loadSuccess = ");
        LIZ6.append(LIZ5);
        C0NB.LIZIZ("loadTimeCohost", X1D.LIZIZ(LIZ6));
        if (C75621Tm5.LJ == 0) {
            C75621Tm5.LJ = LIZ5;
        }
        C75518TkQ c75518TkQ = this.LJLLL;
        Fragment fragment = this.widgetCallback.getFragment();
        o.LJIIIIZZ(fragment, "widgetCallback.fragment");
        C75584TlU c75584TlU = this.LJLLLLLL;
        c75518TkQ.getClass();
        c75518TkQ.LJFF = c75584TlU;
        StringBuilder LIZ7 = X1D.LIZ();
        LIZ7.append("setupStateManager, AnchorEnableSetting: ");
        MultiHostPauseLiveAnchorEnableSetting multiHostPauseLiveAnchorEnableSetting = MultiHostPauseLiveAnchorEnableSetting.INSTANCE;
        LIZ7.append(multiHostPauseLiveAnchorEnableSetting.isEnable());
        C0NB.LJIIIZ("MultiHostAnchorStateManager", X1D.LIZIZ(LIZ7));
        if (multiHostPauseLiveAnchorEnableSetting.isEnable() && c75518TkQ.LIZJ() && (interfaceC75478Tjm = c75518TkQ.LJFF) != null && !interfaceC75478Tjm.LIZLLL()) {
            if (!C8E.LIZLLL().eU("MultiCoHostWidget_setupStateManager")) {
                C0NB.LJIIIZ("MultiHostAnchorStateManager", "setupStateManager, return by isCrossArcActive = false");
            } else {
                c75518TkQ.LIZIZ = true;
                IHostAppContext iHostAppContext = (IHostAppContext) CN1.LIZ(IHostAppContext.class);
                if (iHostAppContext != null && (registerAppEnterForeBackgroundCallback = iHostAppContext.registerAppEnterForeBackgroundCallback(c75518TkQ.LJII)) != null) {
                    C78999UzT.LJFF(registerAppEnterForeBackgroundCallback, c75518TkQ.LIZ);
                }
                IHostAppContext iHostAppContext2 = (IHostAppContext) CN1.LIZ(IHostAppContext.class);
                if (iHostAppContext2 != null) {
                    z3 = iHostAppContext2.isAppBackground();
                } else {
                    z3 = false;
                }
                c75518TkQ.LIZJ = z3;
                if (!LinkMicSeiSubSceneTechSwitchSetting.INSTANCE.enable() && (LJJIJL = C8E.LIZLLL().LJJIJL()) != null && (LJJZZI = LJJIJL.LJJZZI()) != null && (LJJIIZI = LJJZZI.LJJIIZI()) != null) {
                    LJJIIZI.setPlayerInfoProvider(new C75417Tin(c75518TkQ));
                }
                C75406Tic c75406Tic = new C75406Tic();
                c75518TkQ.LJI = c75406Tic;
                c75406Tic.LIZJ(fragment, new MultiHostSessionAbility());
                C75406Tic c75406Tic2 = c75518TkQ.LJI;
                if (c75406Tic2 != null) {
                    c75406Tic2.LIZIZ = new AqS179S0100000_13(c75518TkQ, 412);
                }
                StringBuilder LIZ8 = X1D.LIZ();
                LIZ8.append("setupStateManager, getIsCoHostLinked = ");
                if (c75584TlU != null) {
                    bool = Boolean.valueOf(c75584TlU.LIZ());
                } else {
                    bool = null;
                }
                LIZ8.append(bool);
                LIZ8.append(", isBackground=");
                FT5.LJ(LIZ8, c75518TkQ.LIZJ, LIZ8, "MultiHostAnchorStateManager");
                if (c75584TlU != null && c75584TlU.LIZ()) {
                    c75518TkQ.LIZ(c75518TkQ.LIZJ);
                    if (c75518TkQ.LIZJ) {
                        c75518TkQ.LIZLLL(2);
                    }
                } else if (c75518TkQ.LIZJ) {
                    c75518TkQ.LIZLLL.postDelayed(c75518TkQ.LJIIIIZZ, 2000L);
                }
            }
        }
        C75470Tje c75470Tje = this.LJLLLL;
        o.LJIIIIZZ(this.widgetCallback.getFragment(), "widgetCallback.fragment");
        C75584TlU c75584TlU2 = this.LJLLLLLL;
        c75470Tje.getClass();
        c75470Tje.LJ = c75584TlU2;
        if (c75584TlU2 == null || !c75584TlU2.LIZIZ()) {
            c75470Tje.LIZIZ();
        }
        if (!this.LJLILLLLZI) {
            C48459J0d<List<String>> c48459J0d = InterfaceC30442Bx8.LLJIJIL;
            if (c48459J0d.LIZJ().size() < 3) {
                if (room != null) {
                    l = Long.valueOf(room.getId());
                } else {
                    l = null;
                }
                String valueOf = String.valueOf(l);
                List<String> topicGuideRoomList = c48459J0d.LIZJ();
                o.LJIIIIZZ(topicGuideRoomList, "topicGuideRoomList");
                Iterator<String> it = topicGuideRoomList.iterator();
                boolean z6 = false;
                while (it.hasNext()) {
                    if (it.next().equals(valueOf)) {
                        z6 = true;
                    }
                }
                if (!z6) {
                    C75583TlT c75583TlT = new C75583TlT(this, room);
                    InterfaceC31781Cdd interfaceC31781Cdd2 = this.widgetCallback;
                    if (((interfaceC31781Cdd2 != null && (LJIIIZ = interfaceC31781Cdd2.getFragment()) != null) || (LJIIIZ = C79234V7u.LJIIIZ(getView())) != null) && (iCoHostTopicAbility = (ICoHostTopicAbility) C55096Ljo.LIZ(C55230Lly.LIZJ(LJIIIZ, null), ICoHostTopicAbility.class, null)) != null) {
                        iCoHostTopicAbility.X70(c75583TlT);
                    }
                    C76414Tys c76414Tys4 = this.LJLJL;
                    if (c76414Tys4 != null) {
                        c76414Tys4.setTopicSetAnimationEndListener(c75583TlT);
                    }
                }
            }
        }
        this.LJLLILLLL = false;
        this.LJLLJ = ((IHostAppContext) CN1.LIZ(IHostAppContext.class)).registerAppEnterForeBackgroundCallback(this);
    }

    @Override // com.bytedance.android.widget.Widget
    public final void onPause() {
        InterfaceC74695TTf LLIIJLIL;
        super.onPause();
        InterfaceC75441TjB LJJIJL = C8E.LIZLLL().LJJIJL();
        if (LJJIJL != null && (LLIIJLIL = LJJIJL.LLIIJLIL()) != null) {
            LLIIJLIL.pause();
        }
    }

    @Override // com.bytedance.android.widget.Widget
    public final void onResume() {
        InterfaceC75441TjB LJJIJL;
        InterfaceC74695TTf LLIIJLIL;
        super.onResume();
        if (!MultiHostNotUpdateListSetting.INSTANCE.getValue() && (LJJIJL = C8E.LIZLLL().LJJIJL()) != null && (LLIIJLIL = LJJIJL.LLIIJLIL()) != null) {
            LLIIJLIL.resume();
        }
    }

    @Override // com.bytedance.android.widget.Widget
    public final void onStart() {
        super.onStart();
    }

    @Override // com.bytedance.android.widget.Widget
    public final void onStop() {
        super.onStop();
    }

    public MultiCoHostWidget(boolean z) {
        this.LJLIL = z;
        if (LiveUltimateInflateSwitchSetting.INSTANCE.getValue()) {
            C20780ri.LIZLLL(R.layout.dph, this.context);
        }
        this.LJZI = new AqS195S0100000_13(this, 7);
    }

    public static String LJLZ(long j) {
        for (C75883TqJ c75883TqJ : C8E.LIZLLL().LJIILJJIL()) {
            if (c75883TqJ.LIZ == j) {
                C75768ToS c75768ToS = c75883TqJ.LJIIZILJ;
                if (c75768ToS == null) {
                    return "";
                }
                String LIZIZ = C05170If.LIZIZ(c75768ToS.LIZ, c75768ToS.LIZIZ);
                o.LJIIIIZZ(LIZIZ, "getDisplayName(this.displayId, this.nickName)");
                return LIZIZ;
            }
        }
        return "";
    }

    @Override // X.InterfaceC75599Tlj
    public final int Z4(String interactId) {
        String str;
        UserState userState;
        int i;
        Player player;
        UserState userState2;
        Integer num;
        Player player2;
        RtcUserInfo LLLLLJIL;
        o.LJIIIZ(interactId, "interactId");
        C75518TkQ c75518TkQ = this.LJLLL;
        c75518TkQ.getClass();
        boolean z = true;
        if (!c75518TkQ.LIZIZ) {
            return 1;
        }
        InterfaceC75441TjB LJJIJL = C8E.LIZLLL().LJJIJL();
        Long l = null;
        if (LJJIJL != null && (LLLLLJIL = LJJIJL.LLLLLJIL()) != null) {
            str = LLLLLJIL.getLinkMicId();
        } else {
            str = null;
        }
        if (o.LJ(interactId, str)) {
            if (C29306Beo.LJJIFFI(Boolean.valueOf(c75518TkQ.LIZJ))) {
                i = 2;
            } else {
                i = 1;
            }
            C75406Tic c75406Tic = c75518TkQ.LJI;
            if (c75406Tic != null) {
                userState2 = c75406Tic.LIZIZ(interactId);
                if (userState2 != null) {
                    num = Integer.valueOf(userState2.onlineUserState);
                    StringBuilder LJI = JBR.LJI("getOnlineUserState: isFindSelf=", z, ", self: userId=");
                    if (userState2 != null && (player2 = userState2.user) != null) {
                        l = Long.valueOf(player2.uid);
                    }
                    LJI.append(l);
                    LJI.append(", interactId=");
                    LJI.append(interactId);
                    LJI.append(", isBackground=");
                    C1FL.LJFF(LJI, c75518TkQ.LIZJ, ", selfStateLocal=", i, ", selfStateRemote=");
                    LJI.append(num);
                    C0NB.LJIIIZ("MultiHostAnchorStateManager", X1D.LIZIZ(LJI));
                }
            } else {
                userState2 = null;
            }
            z = false;
            num = null;
            StringBuilder LJI2 = JBR.LJI("getOnlineUserState: isFindSelf=", z, ", self: userId=");
            if (userState2 != null) {
                l = Long.valueOf(player2.uid);
            }
            LJI2.append(l);
            LJI2.append(", interactId=");
            LJI2.append(interactId);
            LJI2.append(", isBackground=");
            C1FL.LJFF(LJI2, c75518TkQ.LIZJ, ", selfStateLocal=", i, ", selfStateRemote=");
            LJI2.append(num);
            C0NB.LJIIIZ("MultiHostAnchorStateManager", X1D.LIZIZ(LJI2));
        } else {
            C75406Tic c75406Tic2 = c75518TkQ.LJI;
            if (c75406Tic2 != null) {
                userState = c75406Tic2.LIZIZ(interactId);
                if (userState != null) {
                    i = userState.onlineUserState;
                    StringBuilder LJI3 = JBR.LJI("getOnlineUserState: isFindOther=", z, ", other: userId=");
                    if (userState != null && (player = userState.user) != null) {
                        l = Long.valueOf(player.uid);
                    }
                    LJI3.append(l);
                    LJI3.append(", interactId=");
                    LJI3.append(interactId);
                    LJI3.append(", otherStateRemote=");
                    b1.LJ(LJI3, i, LJI3, "MultiHostAnchorStateManager");
                }
            } else {
                userState = null;
            }
            i = 1;
            z = false;
            StringBuilder LJI32 = JBR.LJI("getOnlineUserState: isFindOther=", z, ", other: userId=");
            if (userState != null) {
                l = Long.valueOf(player.uid);
            }
            LJI32.append(l);
            LJI32.append(", interactId=");
            LJI32.append(interactId);
            LJI32.append(", otherStateRemote=");
            b1.LJ(LJI32, i, LJI32, "MultiHostAnchorStateManager");
        }
        return i;
    }

    @Override // X.InterfaceC75599Tlj
    public final void ZA(C75589TlZ streamStatics) {
        o.LJIIIZ(streamStatics, "streamStatics");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onStreamStatsChanged, linkmicId = ");
        LIZ.append(streamStatics.LJLILLLLZI);
        LIZ.append(", streamstatus = {");
        LIZ.append(streamStatics.LJLIL);
        LIZ.append('}');
        C0NB.LJIIIZ("MultiCoHostWidget", X1D.LIZIZ(LIZ));
        ViewOnClickListenerC76430Tz8 LIZIZ = LJZL().LIZIZ(streamStatics.LJLILLLLZI);
        if (LIZIZ != null) {
            LIZIZ.LJZI(streamStatics);
        }
    }

    @Override // X.InterfaceC75599Tlj
    public final void ek(EnumC75620Tm4 state) {
        C75596Tlg LJZ;
        o.LJIIIZ(state, "state");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onMultiCoHostStateChanged, state = ");
        LIZ.append(state);
        C0NB.LJIIIZ("MultiCoHostWidget", X1D.LIZIZ(LIZ));
        if (C75590Tla.LIZ[state.ordinal()] == 1) {
            C76414Tys c76414Tys = this.LJLJL;
            if (c76414Tys != null) {
                c76414Tys.LJIILJJIL();
            }
            if (!this.LJLLILLLL && (LJZ = LJZ()) != null) {
                LJZ.LJJJJI(false);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0088  */
    @Override // X.InterfaceC75599Tlj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onFirstRemoteVideoFrameRender(java.lang.String r6) {
        /*
            r5 = this;
            java.lang.String r0 = "linkMicId"
            kotlin.jvm.internal.o.LJIIIZ(r6, r0)
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "onFirstRemoteVideoFrameRender, linkmicId = "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r1 = X.X1D.LIZIZ(r1)
            java.lang.String r0 = "MultiCoHostWidget"
            X.C0NB.LJIIIZ(r0, r1)
            boolean r0 = r5.LJLILLLLZI
            if (r0 == 0) goto L6d
            com.bytedance.android.live.liveinteract.api.dataholder.LinkCrossRoomDataHolder r2 = X.B5G.LIZIZ()
            boolean r0 = r2.LJJJJLL
            if (r0 != 0) goto L3a
            X.Tmu r1 = r2.LJJJLIIL
            X.Tmu r0 = X.EnumC75672Tmu.INVITER
            if (r1 == r0) goto L30
            X.Tmu r0 = X.EnumC75672Tmu.APPLY
            if (r1 != r0) goto Lae
        L30:
            long r0 = X.C44432HcC.LJI()
            r2.LJJLIIIJL = r0
            long r0 = r2.LJJLIIJ
            r2.LJJLIIIJLJLI = r0
        L3a:
            boolean r0 = r5.LJLJI
            r2.LJJLL = r0
            r2.LJJZ = r0
            X.Twi r0 = X.C76265TwT.LIZ
            r0.getClass()
            boolean r0 = r5.LJLJI
            if (r0 == 0) goto L6d
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r5.dataChannel
            java.lang.Class<X.Bk0> r0 = X.C29628Bk0.class
            java.lang.Object r0 = r1.kv0(r0)
            if (r0 == 0) goto L95
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r5.dataChannel
            java.lang.Class<X.Bk0> r0 = X.C29628Bk0.class
            java.lang.Object r0 = r1.kv0(r0)
            X.Bk1 r0 = (X.C29629Bk1) r0
            if (r0 == 0) goto Lac
            int r0 = r0.LIZ
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
        L65:
            X.Dvp r0 = X.EnumC35457Dvp.WHITE_LIST_MIC_ROOM
            int r1 = r0.getType()
            if (r2 != 0) goto L88
        L6d:
            boolean r0 = r5.LJLILLLLZI
            if (r0 == 0) goto L87
            com.bytedance.android.live.liveinteract.api.dataholder.LinkCrossRoomDataHolder r0 = X.B5G.LIZIZ()
            long r3 = r0.LJJIIZI
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L87
            com.bytedance.android.live.liveinteract.api.dataholder.LinkCrossRoomDataHolder r2 = X.B5G.LIZIZ()
            long r0 = android.os.SystemClock.elapsedRealtime()
            r2.LJJIIZI = r0
        L87:
            return
        L88:
            int r0 = r2.intValue()
            if (r0 != r1) goto L6d
            r0 = 2131838418(0x7f1145d2, float:1.9310059E38)
            X.C30868C9o.LIZJ(r0)
            goto L6d
        L95:
            com.bytedance.ies.sdk.datachannel.DataChannelGlobal r1 = com.bytedance.ies.sdk.datachannel.DataChannelGlobal.LJLJJI
            java.lang.Class<X.Baa> r0 = X.C29044Baa.class
            java.lang.Object r0 = r1.mv0(r0)
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = (com.bytedance.android.livesdkapi.depend.model.live.Room) r0
            if (r0 == 0) goto Lac
            com.bytedance.android.livesdk.model.OfficialChannelInfo r0 = r0.officialChannelInfo
            if (r0 == 0) goto Lac
            int r0 = r0.roleType
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            goto L65
        Lac:
            r2 = 0
            goto L65
        Lae:
            X.Tmu r0 = X.EnumC75672Tmu.INVITEE
            if (r1 != r0) goto L3a
            long r0 = r2.LJJLIIIJLLLLLLLZ
            r2.LJJLIIIJL = r0
            long r0 = X.C44432HcC.LJI()
            r2.LJJLIIIJLJLI = r0
            goto L3a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multihost.biz.link.MultiCoHostWidget.onFirstRemoteVideoFrameRender(java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x01f1, code lost:
    
        if (r6.equals(r0) == true) goto L42;
     */
    @Override // X.InterfaceC75599Tlj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void r8(com.bytedance.android.livesdk.model.message.CohostTopicMessage r19) {
        /*
            Method dump skipped, instructions count: 784
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multihost.biz.link.MultiCoHostWidget.r8(com.bytedance.android.livesdk.model.message.CohostTopicMessage):void");
    }

    @Override // X.InterfaceC75599Tlj
    public final void u2(CohostTopicMessage message) {
        long j;
        Fragment LJIIIZ;
        Integer num;
        String str;
        ICoHostTopicAbility iCoHostTopicAbility;
        String str2;
        Fragment LJIIIZ2;
        ICoHostTopicAbility iCoHostTopicAbility2;
        String str3;
        o.LJIIIZ(message, "message");
        long LJJLI = C8E.LIZLLL().LJJLI();
        CohostTopic cohostTopic = message.topic;
        long j2 = 0;
        if (cohostTopic != null) {
            j = cohostTopic.id;
        } else {
            j = 0;
        }
        HeatUpdateContent heatUpdateContent = message.heatUpdateContent;
        if (heatUpdateContent != null) {
            j2 = heatUpdateContent.updatedHeat;
        }
        CohostTopic cohostTopic2 = (CohostTopic) ((LinkedHashMap) C75633TmH.LIZ).get(Long.valueOf(LJJLI));
        Long l = null;
        String str4 = null;
        Long l2 = null;
        if (cohostTopic2 != null && Long.valueOf(cohostTopic2.id) != null) {
            CohostTopic cohostTopic3 = (CohostTopic) ((LinkedHashMap) C75633TmH.LIZ).get(Long.valueOf(LJJLI));
            if (cohostTopic3 == null || j != cohostTopic3.id) {
                C75633TmH.LIZ.put(Long.valueOf(LJJLI), message.topic);
                InterfaceC31781Cdd interfaceC31781Cdd = this.widgetCallback;
                if (((interfaceC31781Cdd != null && (LJIIIZ2 = interfaceC31781Cdd.getFragment()) != null) || (LJIIIZ2 = C79234V7u.LJIIIZ(getView())) != null) && (iCoHostTopicAbility2 = (ICoHostTopicAbility) C55096Ljo.LIZ(C55230Lly.LIZJ(LJIIIZ2, null), ICoHostTopicAbility.class, null)) != null) {
                    C86881Y7x LIZIZ = C86881Y7x.LIZIZ();
                    CohostTopic cohostTopic4 = message.topic;
                    if (cohostTopic4 != null) {
                        str3 = cohostTopic4.titleKey;
                    } else {
                        str3 = null;
                    }
                    iCoHostTopicAbility2.Og0(j2, LIZIZ.LIZ(str3));
                }
                C76414Tys c76414Tys = this.LJLJL;
                if (c76414Tys != null) {
                    C86881Y7x LIZIZ2 = C86881Y7x.LIZIZ();
                    CohostTopic cohostTopic5 = message.topic;
                    if (cohostTopic5 != null) {
                        str4 = cohostTopic5.titleKey;
                    }
                    c76414Tys.LJIIJJI(j2, LIZIZ2.LIZ(str4));
                    return;
                }
                return;
            }
        }
        if (C75633TmH.LJFF > j2 || C75633TmH.LIZ.isEmpty()) {
            return;
        }
        InterfaceC31781Cdd interfaceC31781Cdd2 = this.widgetCallback;
        if (((interfaceC31781Cdd2 != null && (LJIIIZ = interfaceC31781Cdd2.getFragment()) != null) || (LJIIIZ = C79234V7u.LJIIIZ(getView())) != null) && (iCoHostTopicAbility = (ICoHostTopicAbility) C55096Ljo.LIZ(C55230Lly.LIZJ(LJIIIZ, null), ICoHostTopicAbility.class, null)) != null) {
            C86881Y7x LIZIZ3 = C86881Y7x.LIZIZ();
            CohostTopic cohostTopic6 = message.topic;
            if (cohostTopic6 != null) {
                str2 = cohostTopic6.titleKey;
            } else {
                str2 = null;
            }
            iCoHostTopicAbility.Og0(j2, LIZIZ3.LIZ(str2));
        }
        C76414Tys c76414Tys2 = this.LJLJL;
        if (c76414Tys2 != null) {
            C86881Y7x LIZIZ4 = C86881Y7x.LIZIZ();
            CohostTopic cohostTopic7 = message.topic;
            if (cohostTopic7 != null) {
                str = cohostTopic7.titleKey;
            } else {
                str = null;
            }
            c76414Tys2.LJIIJJI(j2, LIZIZ4.LIZ(str));
        }
        C75633TmH.LJFF = j2;
        HeatUpdateContent heatUpdateContent2 = message.heatUpdateContent;
        if (heatUpdateContent2 != null) {
            num = Integer.valueOf(heatUpdateContent2.updateSource);
        } else {
            num = null;
        }
        if (!this.LJLILLLLZI) {
            EnumC46483IMd enumC46483IMd = EnumC46483IMd.UPDATE_SOURCE_DIFF;
            int value = enumC46483IMd.getValue();
            if (num != null && num.intValue() == value) {
                CohostTopic cohostTopic8 = message.topic;
                if (cohostTopic8 != null) {
                    l2 = Long.valueOf(cohostTopic8.id);
                }
                C75642TmQ.LJJLIIIJLJLI(enumC46483IMd, String.valueOf(l2), j2);
                return;
            }
        }
        if (!this.LJLILLLLZI) {
            EnumC46483IMd enumC46483IMd2 = EnumC46483IMd.UPDATE_SOURCE_GIFT;
            int value2 = enumC46483IMd2.getValue();
            if (num == null || num.intValue() != value2) {
                return;
            }
            CohostTopic cohostTopic9 = message.topic;
            if (cohostTopic9 != null) {
                l = Long.valueOf(cohostTopic9.id);
            }
            C75642TmQ.LJJLIIIJLJLI(enumC46483IMd2, String.valueOf(l), j2);
        }
    }

    @Override // X.InterfaceC32182Ck6
    public final void LJIL(String str, String str2) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onInteractIconClick, state = ");
        LIZ.append(C8E.LIZLLL().LLII());
        C0NB.LJIIIZ("MultiCoHostWidget", X1D.LIZIZ(LIZ));
        B5G.LIZIZ().LJJLJ = "connection_icon";
        B5G.LIZIZ().LJJJ = new C75648TmW("connection_icon");
        C75642TmQ.LJJJZ("during_connection", new C75648TmW("connection_icon"), 4);
        C75536Tki c75536Tki = (C75536Tki) this.dataChannel.kv0(C75505TkD.class);
        IMultiHostService LIZLLL = C8E.LIZLLL();
        if (c75536Tki != null && LIZLLL.LJIILJJIL().size() == LIZLLL.LJIL().size() && c75536Tki.LJLJI && c75536Tki.LJLIL != 0) {
            DataChannel dataChannel = this.dataChannel;
            LinkDialog linkDialog = new LinkDialog(this);
            EnumC76391TyV enumC76391TyV = EnumC76391TyV.INVITE_MULTI_CO_HOST_USER_LIST_FRAGMENT;
            C75475Tjj c75475Tjj = new C75475Tjj();
            c75475Tjj.LIZIZ = false;
            c75475Tjj.LIZJ = null;
            linkDialog.Al(enumC76391TyV, c75475Tjj);
            C75842Tpe.LIZ(dataChannel, linkDialog, "LinkDialog");
            return;
        }
        C75842Tpe.LIZ(this.dataChannel, C51029K0z.LJJIIJ(this, null, false), "LinkDialog");
    }

    @Override // X.C8YM
    public final <S extends C33Q> InterfaceC222288nw subscribe(AssemViewModel<S> assemViewModel, C56412MCa<S> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super C3C8, ? super S, C76800UCe> interfaceC88471Ynr) {
        return C212418Vh.LJIIIIZZ(this, assemViewModel, c56412MCa, interfaceC88472Yns, interfaceC88471Ynr);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, C56412MCa<C213178Yf<A>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super C3C8, ? super A, C76800UCe> interfaceC88471Ynr) {
        return C212418Vh.LIZJ(this, assemViewModel, tbw, c56412MCa, interfaceC88472Yns, interfaceC88471Ynr);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A> InterfaceC222288nw selectSubscribeOnAsync(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, C56412MCa<C213178Yf<A>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super C3C8, ? super A, C76800UCe> interfaceC88471Ynr) {
        return C212418Vh.LJII(this, assemViewModel, tbw, c56412MCa, interfaceC88472Yns, interfaceC88471Ynr);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, C56412MCa<C213198Yh<A, B>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88473Ynt<? super C3C8, ? super A, ? super B, C76800UCe> interfaceC88473Ynt) {
        return C212418Vh.LIZIZ(assemViewModel, this, c56412MCa, interfaceC88472Yns, interfaceC88473Ynt, tbw, tbw2);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B, C> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, C56412MCa<OSK<A, B, C>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88474Ynu<? super C3C8, ? super A, ? super B, ? super C, C76800UCe> interfaceC88474Ynu) {
        return C212418Vh.LIZLLL(this, assemViewModel, tbw, tbw2, tbw3, c56412MCa, interfaceC88472Yns, interfaceC88474Ynu);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B, C, D> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, TBW<S, ? extends D> tbw4, C56412MCa<OSL<A, B, C, D>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88475Ynv<? super C3C8, ? super A, ? super B, ? super C, ? super D, C76800UCe> interfaceC88475Ynv) {
        return C212418Vh.LJ(this, assemViewModel, tbw, tbw2, tbw3, tbw4, c56412MCa, interfaceC88472Yns, interfaceC88475Ynv);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B, C, D, E> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, TBW<S, ? extends D> tbw4, TBW<S, ? extends E> tbw5, C56412MCa<OSM<A, B, C, D, E>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88476Ynw<? super C3C8, ? super A, ? super B, ? super C, ? super D, ? super E, C76800UCe> interfaceC88476Ynw) {
        return C212418Vh.LJFF(this, assemViewModel, tbw, tbw2, tbw3, tbw4, tbw5, c56412MCa, interfaceC88472Yns, interfaceC88476Ynw);
    }
}
