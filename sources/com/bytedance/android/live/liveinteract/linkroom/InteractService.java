package com.bytedance.android.live.liveinteract.linkroom;

import X.AbstractC32579CqV;
import X.AbstractC74727TUl;
import X.B3G;
import X.B5G;
import X.B5Y;
import X.B83;
import X.BAP;
import X.BCX;
import X.BZ2;
import X.C05170If;
import X.C05630Jz;
import X.C0NB;
import X.C19N;
import X.C1A8;
import X.C20780ri;
import X.C20890rt;
import X.C20910rv;
import X.C212428Vi;
import X.C28845BTt;
import X.C29044Baa;
import X.C29137Bc5;
import X.C29306Beo;
import X.C29374Bfu;
import X.C29557Bir;
import X.C29558Bis;
import X.C29559Bit;
import X.C29560Biu;
import X.C29570Bj4;
import X.C29832BnI;
import X.C29842BnS;
import X.C30868C9o;
import X.C31611Cat;
import X.C32537Cpp;
import X.C32I;
import X.C35581Dxp;
import X.C40658FxW;
import X.C44432HcC;
import X.C4W;
import X.C59994Ngc;
import X.C65777Prh;
import X.C66851QLn;
import X.C73098SmU;
import X.C73893SzJ;
import X.C74631TQt;
import X.C74738TUw;
import X.C74740TUy;
import X.C74751TVj;
import X.C74776TWi;
import X.C74789TWv;
import X.C74824TYe;
import X.C74838TYs;
import X.C74865TZt;
import X.C74934Tb0;
import X.C74947TbD;
import X.C75103Tdj;
import X.C75105Tdl;
import X.C75497Tk5;
import X.C75500Tk8;
import X.C75502TkA;
import X.C75511TkJ;
import X.C75517TkP;
import X.C75545Tkr;
import X.C75559Tl5;
import X.C75577TlN;
import X.C75633TmH;
import X.C75642TmQ;
import X.C75832TpU;
import X.C75883TqJ;
import X.C76120Tu8;
import X.C76265TwT;
import X.C76272Twa;
import X.C76280Twi;
import X.C76607U4t;
import X.C76696U8e;
import X.C76800UCe;
import X.C76917UGr;
import X.C77125UOr;
import X.C78886Uxe;
import X.C79234V7u;
import X.C8E;
import X.C8W0;
import X.CN1;
import X.CZB;
import X.EnumC20860rq;
import X.EnumC30204BtI;
import X.EnumC31122CJi;
import X.EnumC74778TWk;
import X.EnumC74929Tav;
import X.EnumC75620Tm4;
import X.EnumC75636TmK;
import X.EnumC75909Tqj;
import X.EnumC76178Tv4;
import X.InterfaceC06390Mx;
import X.InterfaceC28235B6h;
import X.InterfaceC30069Br7;
import X.InterfaceC31781Cdd;
import X.InterfaceC31805Ce1;
import X.InterfaceC32187CkB;
import X.InterfaceC58334Muw;
import X.InterfaceC65784Pro;
import X.InterfaceC74695TTf;
import X.InterfaceC74853TZh;
import X.InterfaceC74935Tb1;
import X.InterfaceC75179Tex;
import X.InterfaceC75238Tfu;
import X.InterfaceC75441TjB;
import X.InterfaceC75512TkK;
import X.InterfaceC75973Trl;
import X.InterfaceC76652U6m;
import X.N2I;
import X.N2J;
import X.OQY;
import X.TQ4;
import X.TQ8;
import X.TQS;
import X.TS8;
import X.TV3;
import X.TX0;
import X.TZX;
import X.U26;
import X.U8H;
import X.ViewOnClickListenerC75104Tdk;
import X.X1D;
import Y.ARunnableS41S0100000_5;
import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.util.LruCache;
import android.view.SurfaceView;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.linkmic.StopFlyMicGiftAnimationEvent;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.linkroom.widget.AudienceBottomLeftLinkWidget;
import com.bytedance.android.live.liveinteract.linkroom.widget.InteractCutShortWidget;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.feedback.MultiGuestFeedbackController;
import com.bytedance.android.live.liveinteract.multiguestv3.model.AudioPunishEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.service.IMultiGuestV3InternalServiceV2;
import com.bytedance.android.live.liveinteract.multihost.biz.autotest.AutoTestCohostService;
import com.bytedance.android.live.liveinteract.multihost.biz.quickpairing.RandomLinkMicManager;
import com.bytedance.android.live.liveinteract.multihost.event.MultiCoHostStateChannel;
import com.bytedance.android.live.liveinteract.multimatch.matchitem.MatchItemAssem;
import com.bytedance.android.live.liveinteract.multimatch.matchitem.model.BattleItem4FEModel;
import com.bytedance.android.live.liveinteract.multimatch.matchitem.model.ItemInfo4FE;
import com.bytedance.android.live.microom.IMicRoomService;
import com.bytedance.android.live.publicscreen.api.IPublicScreenService;
import com.bytedance.android.live.usercard.IUserCardService;
import com.bytedance.android.livesdk.chatroom.model.interact.CohostTopic;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.comp.api.linkcore.model.MicPositionInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.OnLineMicInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.Resolution;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3AndroidModeratorTechSwitchSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkVoiceChatMonitorCombineSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestAddStopFlyMicAniSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestApplyingSlideAndBarIconSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveCohostCrossApplyFullFixSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchQualityOptimizeSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestV3PunishSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveDeleteUselessPreloadSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveGiftNewGifterBadgeSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveServiceManagerOptSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveUltimateInflateSwitchSetting;
import com.bytedance.android.livesdk.model.linksetting.CoHost;
import com.bytedance.android.livesdk.model.linksetting.LinkmicUser;
import com.bytedance.android.livesdk.model.linksetting.MultiLiveUserSettings;
import com.bytedance.android.livesdk.model.message.TeamUsersInfo;
import com.bytedance.android.livesdk.model.message.linker.listchangemessage.LinkListUser;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.RoomLinkInfo;
import com.bytedance.android.livesdkapi.depend.model.live.StreamUrl;
import com.bytedance.android.livesdkapi.host.IHostFrescoHelper;
import com.bytedance.assem.arch.core.AssemSupervisor;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;
import org.json.JSONObject;
import tikcast.linkmic.controller.LinkedUserInfo;

/* loaded from: classes14.dex */
public class InteractService implements IInteractService {
    public volatile boolean LJLILLLLZI;
    public boolean LJLJI;
    public AutoTestCohostService LJLJJLL;
    public final LruCache<String, InterfaceC65784Pro<Boolean>> LJLIL = new LruCache<>(3);
    public final List<InterfaceC75512TkK> LJLJJI = new ArrayList();
    public final C75497Tk5 LJLJJL = new C75497Tk5(this);

    /* JADX WARN: Removed duplicated region for block: B:16:0x0042 A[LOOP:0: B:14:0x003c->B:16:0x0042, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Set<java.lang.Long> DD() {
        /*
            r4 = this;
            boolean r0 = X.C19N.LIZLLL()
            if (r0 == 0) goto L79
            boolean r0 = r4.n8()
            if (r0 == 0) goto L56
            X.Tl5 r0 = X.C75559Tl5.LIZIZ
            java.util.HashMap r1 = r0.LIZJ()
            java.lang.String r0 = "MULTI_GUEST_V3_MODERATOR_USER_MANAGER"
            java.lang.Object r1 = r1.get(r0)
            boolean r0 = r1 instanceof X.InterfaceC74853TZh
            if (r0 == 0) goto L6f
            X.TZh r1 = (X.InterfaceC74853TZh) r1
            if (r1 == 0) goto L6f
            X.TUl r0 = r1.LIZ()
        L25:
            if (r0 == 0) goto L6f
            java.util.List r1 = r0.LJIJJLI()
            if (r1 == 0) goto L6f
            java.util.ArrayList r3 = new java.util.ArrayList
            r0 = 10
            int r0 = X.C32I.LJJL(r1, r0)
            r3.<init>(r0)
            java.util.Iterator r2 = r1.iterator()
        L3c:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L72
            java.lang.Object r0 = r2.next()
            com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo r0 = (com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo) r0
            com.bytedance.android.live.base.model.user.User r0 = r0.mUser
            long r0 = r0.getId()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r3.add(r0)
            goto L3c
        L56:
            X.Tl5 r0 = X.C75559Tl5.LIZIZ
            java.util.HashMap r1 = r0.LIZJ()
            java.lang.String r0 = "MULTI_GUEST_V3_ANCHOR_USER_MANAGER"
            java.lang.Object r1 = r1.get(r0)
            boolean r0 = r1 instanceof X.InterfaceC31805Ce1
            if (r0 == 0) goto L6f
            X.Ce1 r1 = (X.InterfaceC31805Ce1) r1
            if (r1 == 0) goto L6f
            X.TUl r0 = r1.LIZ()
            goto L25
        L6f:
            X.OQY r0 = X.OQY.INSTANCE
            goto L78
        L72:
            java.util.Set r0 = X.ORZ.LLJJ(r3)
            if (r0 == 0) goto L6f
        L78:
            return r0
        L79:
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.linkroom.InteractService.DD():java.util.Set");
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final void Jj() {
        C75642TmQ.LJJJZ("connection_invite", null, 6);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final Class<AudienceBottomLeftLinkWidget> Pm() {
        return AudienceBottomLeftLinkWidget.class;
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final boolean Y40() {
        return C19N.LIZLLL();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final LiveWidget EF() {
        return new InteractCutShortWidget();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final int Ef() {
        if (!C76265TwT.LIZ.LJJJJIZL) {
            return -1;
        }
        if (r5.LJJJJ > 0.5d || r5.LJJJJI <= 0.5d) {
            return 0;
        }
        return 1;
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final String FZ() {
        C76280Twi c76280Twi = C76265TwT.LIZ;
        if (c76280Twi.LJ() == EnumC76178Tv4.START) {
            return "in_pk";
        }
        if (c76280Twi.LJ() == EnumC76178Tv4.PUNISH) {
            return "pk_punish";
        }
        return "";
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final boolean GQ() {
        return C76265TwT.LIZ.LJIILIIL;
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final int GR() {
        if (C76265TwT.LIZ.LJ() != EnumC76178Tv4.START) {
            return -1;
        }
        if (r2.LJJJJ > 0.5d) {
            return 1;
        }
        return 0;
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final boolean Hu0() {
        InterfaceC74935Tb1 interfaceC74935Tb1;
        Object LIZ = C75559Tl5.LIZIZ.LIZ("ZOOM_SERVICE");
        if ((LIZ instanceof InterfaceC74935Tb1) && (interfaceC74935Tb1 = (InterfaceC74935Tb1) LIZ) != null) {
            return interfaceC74935Tb1.LIZJ();
        }
        return false;
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final Map<String, String> L00() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (mT()) {
            C75832TpU.LJI(linkedHashMap, false);
        }
        return linkedHashMap;
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final List<TeamUsersInfo> Nh0() {
        return C76265TwT.LIZ.LJIL;
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final CohostTopic P20() {
        return (CohostTopic) ((LinkedHashMap) C75633TmH.LIZ).get(U26.LIZ());
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final Rect Q00() {
        RandomLinkMicManager.LJLIL.getClass();
        if (RandomLinkMicManager.LJLLLLLL) {
            return new Rect(0, RandomLinkMicManager.LJLZ, RandomLinkMicManager.LJZI, RandomLinkMicManager.LJZ + RandomLinkMicManager.LJLZ);
        }
        return new Rect(0, B5G.LIZIZ().LJIL, B5G.LIZIZ().LJIJJ, B5G.LIZIZ().LJIJJLI + B5G.LIZIZ().LJIL);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final boolean Qe0() {
        if (EnumC76178Tv4.START == C76265TwT.LIZ.LJ() && OB()) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final boolean VY() {
        EnumC74778TWk enumC74778TWk;
        Object LIZ = C75559Tl5.LIZIZ.LIZ("MULTI_GUEST_DATA_HOLDER");
        if ((LIZ instanceof MultiGuestDataHolder) && ((enumC74778TWk = ((MultiGuestDataHolder) LIZ).LJJIIZ) == EnumC74778TWk.GRID_FIX || enumC74778TWk == EnumC74778TWk.FLOATING_FIX)) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final boolean Vc() {
        Object LIZ = C75559Tl5.LIZIZ.LIZ("MULTI_GUEST_DATA_HOLDER");
        if ((LIZ instanceof MultiGuestDataHolder) && ((MultiGuestDataHolder) LIZ).LJJIIZ != EnumC74778TWk.NORMAL) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final void Wb0() {
        if (!MultiGuestV3PunishSetting.INSTANCE.isEnable()) {
            return;
        }
        C0NB.LIZIZ("InteractService", "closeMuteAudioPunish");
        DataChannelGlobal.LJLJJI.sv0(AudioPunishEvent.class, new C74631TQt(true, "business_mute_source_audio_mute_punish"));
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0099 A[RETURN, SYNTHETIC] */
    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean Wy() {
        /*
            r11 = this;
            com.bytedance.ies.sdk.widgets.LiveWidget r1 = X.C75511TkJ.LIZ
            r5 = 0
            if (r1 != 0) goto L6
        L5:
            return r5
        L6:
            X.Cdd r0 = r1.widgetCallback
            if (r0 == 0) goto L10
            androidx.fragment.app.Fragment r0 = r0.getFragment()
            if (r0 != 0) goto L18
        L10:
            android.view.View r0 = r1.getView()
            androidx.fragment.app.Fragment r0 = X.C79234V7u.LJIIIZ(r0)
        L18:
            if (r0 == 0) goto L5
            com.bytedance.assem.arch.core.AssemSupervisor r0 = X.C212428Vi.LIZIZ(r0)
            if (r0 == 0) goto L5
            java.util.concurrent.CopyOnWriteArrayList<X.8W0> r1 = r0.LJLLI
            if (r1 == 0) goto L5
            java.lang.Class<com.bytedance.android.live.liveinteract.multimatch.matchitem.MatchItemAssem> r0 = com.bytedance.android.live.liveinteract.multimatch.matchitem.MatchItemAssem.class
            java.util.List r1 = X.C40658FxW.LJJZZIII(r1, r0)
            if (r1 == 0) goto L5
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L33
            goto L5
        L33:
            java.lang.Object r8 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r1, r5)
            com.bytedance.android.live.liveinteract.multimatch.matchitem.MatchItemAssem r8 = (com.bytedance.android.live.liveinteract.multimatch.matchitem.MatchItemAssem) r8
            com.bytedance.android.live.liveinteract.multimatch.matchitem.model.BattleItem4FEModel r0 = r8.LJLZ
            if (r0 == 0) goto L47
            java.util.List<com.bytedance.android.live.liveinteract.multimatch.matchitem.model.ItemInfo4FE> r0 = r0.itemList
            if (r0 == 0) goto L47
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L56
        L47:
            com.bytedance.android.live.liveinteract.multimatch.matchitem.model.BattleItem4FEModel r0 = r8.LJZ
            if (r0 == 0) goto L5
            java.util.List<com.bytedance.android.live.liveinteract.multimatch.matchitem.model.ItemInfo4FE> r0 = r0.itemList
            if (r0 == 0) goto L5
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L56
            goto L5
        L56:
            long r9 = java.lang.System.currentTimeMillis()
            r0 = 1000(0x3e8, double:4.94E-321)
            long r9 = r9 / r0
            long r6 = X.C025908h.LIZ()
            com.bytedance.android.live.liveinteract.multimatch.matchitem.model.BattleItem4FEModel r0 = r8.LJLZ
            if (r0 == 0) goto L9c
            java.util.List<com.bytedance.android.live.liveinteract.multimatch.matchitem.model.ItemInfo4FE> r0 = r0.itemList
            if (r0 == 0) goto L9c
            java.util.Iterator r4 = r0.iterator()
        L6d:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L9c
            java.lang.Object r3 = r4.next()
            com.bytedance.android.live.liveinteract.multimatch.matchitem.model.ItemInfo4FE r3 = (com.bytedance.android.live.liveinteract.multimatch.matchitem.model.ItemInfo4FE) r3
            long r1 = r3.effectStartTimeSec
            int r0 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r0 > 0) goto L6d
            long r1 = r3.endAt
            int r0 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r0 <= 0) goto L6d
            java.lang.String r0 = r3.senderUid
            boolean r0 = X.C29306Beo.LJIJJLI(r0)
            if (r0 == 0) goto L5
            java.lang.String r1 = r3.senderUid
            java.lang.String r0 = java.lang.String.valueOf(r6)
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto L5
        L99:
            r5 = 1
            goto L5
        L9c:
            com.bytedance.android.live.liveinteract.multimatch.matchitem.model.BattleItem4FEModel r0 = r8.LJZ
            if (r0 == 0) goto L5
            java.util.List<com.bytedance.android.live.liveinteract.multimatch.matchitem.model.ItemInfo4FE> r0 = r0.itemList
            if (r0 == 0) goto L5
            java.util.Iterator r4 = r0.iterator()
        La8:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L5
            java.lang.Object r3 = r4.next()
            com.bytedance.android.live.liveinteract.multimatch.matchitem.model.ItemInfo4FE r3 = (com.bytedance.android.live.liveinteract.multimatch.matchitem.model.ItemInfo4FE) r3
            long r1 = r3.effectStartTimeSec
            int r0 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r0 > 0) goto La8
            long r1 = r3.endAt
            int r0 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r0 <= 0) goto La8
            java.lang.String r0 = r3.senderUid
            boolean r0 = X.C29306Beo.LJIJJLI(r0)
            if (r0 == 0) goto L5
            java.lang.String r1 = r3.senderUid
            java.lang.String r0 = java.lang.String.valueOf(r6)
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto L5
            goto L99
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.linkroom.InteractService.Wy():boolean");
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final boolean Xu0() {
        EnumC74778TWk enumC74778TWk;
        Object LIZ = C75559Tl5.LIZIZ.LIZ("MULTI_GUEST_DATA_HOLDER");
        if ((LIZ instanceof MultiGuestDataHolder) && ((enumC74778TWk = ((MultiGuestDataHolder) LIZ).LJJIIZ) == EnumC74778TWk.FLOATING || enumC74778TWk == EnumC74778TWk.GRID)) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final User Yt() {
        Long l;
        Object obj;
        AbstractC74727TUl LIZ;
        List LJJI;
        Object obj2;
        Long l2;
        AbstractC74727TUl LIZ2;
        List LJJI2;
        Object obj3;
        Long l3;
        AbstractC74727TUl LIZ3;
        List LJJI3;
        Object obj4;
        Long l4;
        Map<Long, Long> map;
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room != null) {
            l = Long.valueOf(room.getId());
        } else {
            l = null;
        }
        C75559Tl5 c75559Tl5 = C75559Tl5.LIZIZ;
        MultiGuestDataHolder multiGuestDataHolder = (MultiGuestDataHolder) c75559Tl5.LIZIZ("MULTI_GUEST_DATA_HOLDER");
        if (multiGuestDataHolder != null && (map = multiGuestDataHolder.LJIIZILJ) != null) {
            obj = ((ArrayMap) map).get(l);
        } else {
            obj = null;
        }
        if (TV3.LIZJ()) {
            InterfaceC31805Ce1 interfaceC31805Ce1 = (InterfaceC31805Ce1) c75559Tl5.LIZIZ("MULTI_GUEST_V3_ANCHOR_USER_MANAGER");
            if (interfaceC31805Ce1 == null || (LIZ3 = interfaceC31805Ce1.LIZ()) == null || (LJJI3 = LIZ3.LJJI()) == null) {
                return null;
            }
            Iterator it = LJJI3.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj4 = it.next();
                    User user = ((LinkPlayerInfo) obj4).mUser;
                    if (user != null) {
                        l4 = Long.valueOf(user.getId());
                    } else {
                        l4 = null;
                    }
                    if (o.LJ(l4, obj)) {
                        break;
                    }
                } else {
                    obj4 = null;
                    break;
                }
            }
            LinkPlayerInfo linkPlayerInfo = (LinkPlayerInfo) obj4;
            if (linkPlayerInfo == null) {
                return null;
            }
            return linkPlayerInfo.mUser;
        }
        if (n8()) {
            InterfaceC74853TZh interfaceC74853TZh = (InterfaceC74853TZh) c75559Tl5.LIZIZ("MULTI_GUEST_V3_MODERATOR_USER_MANAGER");
            if (interfaceC74853TZh == null || (LIZ2 = interfaceC74853TZh.LIZ()) == null || (LJJI2 = LIZ2.LJJI()) == null) {
                return null;
            }
            Iterator it2 = LJJI2.iterator();
            while (true) {
                if (it2.hasNext()) {
                    obj3 = it2.next();
                    User user2 = ((LinkPlayerInfo) obj3).mUser;
                    if (user2 != null) {
                        l3 = Long.valueOf(user2.getId());
                    } else {
                        l3 = null;
                    }
                    if (o.LJ(l3, obj)) {
                        break;
                    }
                } else {
                    obj3 = null;
                    break;
                }
            }
            LinkPlayerInfo linkPlayerInfo2 = (LinkPlayerInfo) obj3;
            if (linkPlayerInfo2 == null) {
                return null;
            }
            return linkPlayerInfo2.mUser;
        }
        TQ8 tq8 = (TQ8) c75559Tl5.LIZIZ("MULTI_GUEST_V3_GUEST_USER_MANAGER");
        if (tq8 == null || (LIZ = tq8.LIZ()) == null || (LJJI = LIZ.LJJI()) == null) {
            return null;
        }
        Iterator it3 = LJJI.iterator();
        while (true) {
            if (it3.hasNext()) {
                obj2 = it3.next();
                User user3 = ((LinkListUser) obj2).user;
                if (user3 != null) {
                    l2 = Long.valueOf(user3.getId());
                } else {
                    l2 = null;
                }
                if (o.LJ(l2, obj)) {
                    break;
                }
            } else {
                obj2 = null;
                break;
            }
        }
        LinkListUser linkListUser = (LinkListUser) obj2;
        if (linkListUser == null) {
            return null;
        }
        return linkListUser.user;
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final int Yu0() {
        AbstractC74727TUl LIZ;
        AbstractC74727TUl LIZ2;
        if (LinkMicMultiGuestV3AndroidModeratorTechSwitchSetting.INSTANCE.getValue()) {
            TZX LJJ = C76917UGr.LJJ();
            if (LJJ != null) {
                return C76917UGr.LJJIII(LJJ);
            }
        } else if (TV3.LIZJ()) {
            InterfaceC31805Ce1 interfaceC31805Ce1 = (InterfaceC31805Ce1) C75559Tl5.LIZIZ.LIZIZ("MULTI_GUEST_V3_ANCHOR_USER_MANAGER");
            if (interfaceC31805Ce1 != null && (LIZ2 = interfaceC31805Ce1.LIZ()) != null) {
                return C76917UGr.LJJIII(LIZ2);
            }
        } else {
            TQ8 tq8 = (TQ8) C75559Tl5.LIZIZ.LIZIZ("MULTI_GUEST_V3_GUEST_USER_MANAGER");
            if (tq8 != null && (LIZ = tq8.LIZ()) != null) {
                return C76917UGr.LJJIII(LIZ);
            }
        }
        return 0;
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final boolean Zf() {
        return C76265TwT.LIZ.LJIIZILJ;
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final boolean Zs0() {
        EnumC74778TWk enumC74778TWk;
        Object LIZ = C75559Tl5.LIZIZ.LIZ("MULTI_GUEST_DATA_HOLDER");
        if ((LIZ instanceof MultiGuestDataHolder) && ((enumC74778TWk = ((MultiGuestDataHolder) LIZ).LJJIIZ) == EnumC74778TWk.GRID_FIX || enumC74778TWk == EnumC74778TWk.GRID)) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final long eq() {
        return C76265TwT.LIZ.LIZIZ();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final InterfaceC32187CkB fh() {
        return new C76120Tu8();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final Object gI() {
        if (this.LJLJJLL == null) {
            this.LJLJJLL = new AutoTestCohostService();
        }
        return this.LJLJJLL;
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final String getDebugInfo() {
        String str;
        Long l;
        String str2;
        Long l2;
        Long l3;
        AbstractC74727TUl LIZ;
        List<LinkListUser> LJJI;
        ArrayList arrayList;
        long j;
        boolean z;
        boolean z2;
        Resolution resolution;
        Long l4;
        String str3;
        StreamUrl streamUrl;
        U8H LJJZZI;
        AbstractC74727TUl LIZ2;
        List<LinkPlayerInfo> LJJI2;
        boolean z3;
        boolean z4;
        RoomLinkInfo linkMicInfo;
        List<Long> list;
        RoomLinkInfo linkMicInfo2;
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        StringBuilder sb = new StringBuilder();
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("LinkMic State：");
        boolean mT = mT();
        Object obj = LiveGiftNewGifterBadgeSetting.DEFAULT;
        if (mT) {
            str = "co-host pk";
        } else if (OB()) {
            str = "co-host";
        } else if (ta0()) {
            str = "multi-guest";
        } else if (Vc()) {
            str = "multi-guest audience";
        } else {
            str = LiveGiftNewGifterBadgeSetting.DEFAULT;
        }
        LIZ3.append(str);
        LIZ3.append('\n');
        sb.append(X1D.LIZIZ(LIZ3));
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append("MultiLiveType：");
        if (room != null && (linkMicInfo2 = room.getLinkMicInfo()) != null) {
            l = Long.valueOf(linkMicInfo2.MultiLiveType);
        } else {
            l = null;
        }
        LIZ4.append(l);
        LIZ4.append(" (0:none or multi_guest_v1 / 1:multi_live or 1vn)\n");
        sb.append(X1D.LIZIZ(LIZ4));
        StringBuilder LIZ5 = X1D.LIZ();
        LIZ5.append("AudienceIdList：");
        if (room != null && (linkMicInfo = room.getLinkMicInfo()) != null && (list = linkMicInfo.audienceIdList) != null) {
            str2 = list.toString();
        } else {
            str2 = null;
        }
        LIZ5.append(str2);
        LIZ5.append('\n');
        sb.append(X1D.LIZIZ(LIZ5));
        StringBuilder LIZ6 = X1D.LIZ();
        LIZ6.append("RoomId：");
        if (room != null) {
            l2 = Long.valueOf(room.getId());
        } else {
            l2 = null;
        }
        LIZ6.append(l2);
        LIZ6.append('\n');
        sb.append(X1D.LIZIZ(LIZ6));
        StringBuilder LIZ7 = X1D.LIZ();
        LIZ7.append("AnchorId：");
        User LJ = TV3.LJ();
        if (LJ != null) {
            l3 = Long.valueOf(LJ.getId());
        } else {
            l3 = null;
        }
        LIZ7.append(l3);
        LIZ7.append('\n');
        sb.append(X1D.LIZIZ(LIZ7));
        StringBuilder LIZ8 = X1D.LIZ();
        LIZ8.append("CurrentSelfRole：");
        User LJ2 = ((C29374Bfu) B83.LIZ().LIZIZ()).LJ();
        o.LJIIIIZZ(LJ2, "getInstance().user().currentUserOpt");
        LIZ8.append(Ng(LJ2));
        LIZ8.append('\n');
        sb.append(X1D.LIZIZ(LIZ8));
        StringBuilder LIZ9 = X1D.LIZ();
        LIZ9.append("LinkedList：");
        if (TV3.LIZJ()) {
            InterfaceC31805Ce1 interfaceC31805Ce1 = (InterfaceC31805Ce1) C75559Tl5.LIZIZ.LIZIZ("MULTI_GUEST_V3_ANCHOR_USER_MANAGER");
            if (interfaceC31805Ce1 != null && (LIZ2 = interfaceC31805Ce1.LIZ()) != null && (LJJI2 = LIZ2.LJJI()) != null) {
                arrayList = new ArrayList(C32I.LJJL(LJJI2, 10));
                for (LinkPlayerInfo linkPlayerInfo : LJJI2) {
                    String LIZ10 = C05170If.LIZ(linkPlayerInfo.mUser);
                    o.LJIIIIZZ(LIZ10, "getDisplayName(it.user)");
                    long id = linkPlayerInfo.mUser.getId();
                    String str4 = linkPlayerInfo.mInteractIdStr;
                    o.LJIIIIZZ(str4, "it.interactId");
                    C75559Tl5 c75559Tl5 = C75559Tl5.LIZIZ;
                    MultiGuestDataHolder multiGuestDataHolder = (MultiGuestDataHolder) c75559Tl5.LIZIZ("MULTI_GUEST_DATA_HOLDER");
                    if (multiGuestDataHolder != null) {
                        z3 = o.LJ(multiGuestDataHolder.LJIIJ(linkPlayerInfo.mInteractIdStr), Boolean.TRUE);
                    } else {
                        z3 = false;
                    }
                    MultiGuestDataHolder multiGuestDataHolder2 = (MultiGuestDataHolder) c75559Tl5.LIZIZ("MULTI_GUEST_DATA_HOLDER");
                    if (multiGuestDataHolder2 != null) {
                        z4 = o.LJ(multiGuestDataHolder2.LIZJ(linkPlayerInfo.mInteractIdStr), Boolean.TRUE);
                    } else {
                        z4 = false;
                    }
                    arrayList.add(new C35581Dxp(LIZ10, id, str4, z3, z4));
                }
            }
            arrayList = null;
        } else {
            TQ8 tq8 = (TQ8) C75559Tl5.LIZIZ.LIZIZ("MULTI_GUEST_V3_GUEST_USER_MANAGER");
            if (tq8 != null && (LIZ = tq8.LIZ()) != null && (LJJI = LIZ.LJJI()) != null) {
                arrayList = new ArrayList(C32I.LJJL(LJJI, 10));
                for (LinkListUser linkListUser : LJJI) {
                    String LIZ11 = C05170If.LIZ(linkListUser.user);
                    o.LJIIIIZZ(LIZ11, "getDisplayName(it.user)");
                    User user = linkListUser.user;
                    if (user != null) {
                        j = user.getId();
                    } else {
                        j = -1;
                    }
                    String str5 = linkListUser.linkMicId;
                    C75559Tl5 c75559Tl52 = C75559Tl5.LIZIZ;
                    MultiGuestDataHolder multiGuestDataHolder3 = (MultiGuestDataHolder) c75559Tl52.LIZIZ("MULTI_GUEST_DATA_HOLDER");
                    if (multiGuestDataHolder3 != null) {
                        z = o.LJ(multiGuestDataHolder3.LJIIJ(linkListUser.linkMicId), Boolean.TRUE);
                    } else {
                        z = false;
                    }
                    MultiGuestDataHolder multiGuestDataHolder4 = (MultiGuestDataHolder) c75559Tl52.LIZIZ("MULTI_GUEST_DATA_HOLDER");
                    if (multiGuestDataHolder4 != null) {
                        z2 = o.LJ(multiGuestDataHolder4.LIZJ(linkListUser.linkMicId), Boolean.TRUE);
                    } else {
                        z2 = false;
                    }
                    arrayList.add(new C35581Dxp(LIZ11, j, str5, z, z2));
                }
            }
            arrayList = null;
        }
        LIZ9.append(arrayList);
        LIZ9.append('\n');
        sb.append(X1D.LIZIZ(LIZ9));
        StringBuilder LIZ12 = X1D.LIZ();
        LIZ12.append("CurrentUserRes：");
        InterfaceC75441TjB R6 = C8E.LJ().R6();
        if (R6 != null && (LJJZZI = R6.LJJZZI()) != null) {
            resolution = LJJZZI.LJIJI();
        } else {
            resolution = null;
        }
        LIZ12.append(resolution);
        LIZ12.append('\n');
        sb.append(X1D.LIZIZ(LIZ12));
        StringBuilder LIZ13 = X1D.LIZ();
        LIZ13.append("Stream ID：");
        if (room != null) {
            l4 = Long.valueOf(room.getStreamId());
        } else {
            l4 = null;
        }
        LIZ13.append(l4);
        LIZ13.append('\n');
        sb.append(X1D.LIZIZ(LIZ13));
        StringBuilder LIZ14 = X1D.LIZ();
        LIZ14.append("Stream Url：");
        if (room != null && (streamUrl = room.getStreamUrl()) != null) {
            str3 = streamUrl.rtmpPullUrl;
        } else {
            str3 = null;
        }
        LIZ14.append(str3);
        LIZ14.append('\n');
        sb.append(X1D.LIZIZ(LIZ14));
        StringBuilder LIZ15 = X1D.LIZ();
        LIZ15.append("Recent SEI：");
        if (OB()) {
            obj = B5G.LIZIZ().LJIILL;
        } else if (Vc()) {
            obj = C74838TYs.LJ().LJIIJ;
        }
        LIZ15.append(obj);
        LIZ15.append('\n');
        sb.append(X1D.LIZIZ(LIZ15));
        String sb2 = sb.toString();
        o.LJIIIIZZ(sb2, "debugInfo.toString()");
        return sb2;
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final boolean gr0() {
        EnumC74778TWk enumC74778TWk;
        Object LIZ = C75559Tl5.LIZIZ.LIZ("MULTI_GUEST_DATA_HOLDER");
        if ((LIZ instanceof MultiGuestDataHolder) && ((enumC74778TWk = ((MultiGuestDataHolder) LIZ).LJJIIZ) == EnumC74778TWk.FLOATING_FIX || enumC74778TWk == EnumC74778TWk.FLOATING)) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final String h00() {
        EnumC31122CJi enumC31122CJi;
        if (((IMicRoomService) CN1.LIZ(IMicRoomService.class)).rk()) {
            enumC31122CJi = EnumC31122CJi.LINE_UP;
        } else {
            InterfaceC06390Mx LIZ = CN1.LIZ(IInteractService.class);
            o.LJII(LIZ, "null cannot be cast to non-null type com.bytedance.android.live.liveinteract.api.IInteractService");
            IInteractService iInteractService = (IInteractService) LIZ;
            if (iInteractService.Qe0()) {
                enumC31122CJi = EnumC31122CJi.LINK_MIC_PK;
            } else if (iInteractService.Yu0() > 0) {
                enumC31122CJi = EnumC31122CJi.LINK_MIC_GUEST;
            } else if (iInteractService.OB()) {
                enumC31122CJi = EnumC31122CJi.LINK_MIC_ANCHOR;
            } else {
                enumC31122CJi = EnumC31122CJi.NORMAL_VIDEO;
            }
        }
        return enumC31122CJi.getDesc();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final void initPublicScreenConfiguration() {
        if (this.LJLILLLLZI) {
            return;
        }
        this.LJLILLLLZI = true;
        IPublicScreenService iPublicScreenService = (IPublicScreenService) CN1.LIZ(IPublicScreenService.class);
        iPublicScreenService.Yj0(new C29570Bj4());
        iPublicScreenService.Dv(4, new C29842BnS());
        iPublicScreenService.Dv(3, new C29832BnI());
        IUserCardService iUserCardService = (IUserCardService) CN1.LIZ(IUserCardService.class);
        iUserCardService.nw(new C29557Bir(), 65537);
        iUserCardService.nw(new C29559Bit(), 65538);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final InterfaceC30069Br7 lS() {
        return new C1A8();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final long lt0() {
        return C76265TwT.LIZ.LJJJZ;
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final boolean mT() {
        EnumC76178Tv4 LJ = C76265TwT.LIZ.LJ();
        if (LJ.compareTo(EnumC76178Tv4.START) >= 0 && LJ.compareTo(EnumC76178Tv4.END) < 0) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final boolean on() {
        Object LIZ = C75559Tl5.LIZIZ.LIZ("MULTI_GUEST_DATA_HOLDER");
        if (LIZ == null) {
            return true;
        }
        if ((LIZ instanceof MultiGuestDataHolder) && ((MultiGuestDataHolder) LIZ).LJ) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final void sL() {
        InterfaceC65784Pro<C76800UCe> LIZ;
        MultiGuestFeedbackController.LJIIJ.getClass();
        TQ4 LIZ2 = TQS.LIZ();
        if (LIZ2 != null && (LIZ = LIZ2.LIZ()) != null) {
            LIZ.invoke();
        }
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final long xX() {
        return C76265TwT.LIZ.LJJIIZI;
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final void xt() {
        C76265TwT.LIZ.LJIIZILJ = true;
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final boolean yA() {
        Fragment LJIIIZ;
        AssemSupervisor LIZIZ;
        CopyOnWriteArrayList<C8W0> copyOnWriteArrayList;
        List LJJZZIII;
        BattleItem4FEModel battleItem4FEModel;
        List<ItemInfo4FE> list;
        List<ItemInfo4FE> list2;
        List<ItemInfo4FE> list3;
        List<ItemInfo4FE> list4;
        LiveWidget liveWidget = C75511TkJ.LIZ;
        if (liveWidget == null) {
            return false;
        }
        InterfaceC31781Cdd interfaceC31781Cdd = liveWidget.widgetCallback;
        if (interfaceC31781Cdd == null || (LJIIIZ = interfaceC31781Cdd.getFragment()) == null) {
            LJIIIZ = C79234V7u.LJIIIZ(liveWidget.getView());
        }
        if (LJIIIZ == null || (LIZIZ = C212428Vi.LIZIZ(LJIIIZ)) == null || (copyOnWriteArrayList = LIZIZ.LJLLI) == null || (LJJZZIII = C40658FxW.LJJZZIII(copyOnWriteArrayList, MatchItemAssem.class)) == null || LJJZZIII.isEmpty()) {
            return false;
        }
        MatchItemAssem matchItemAssem = (MatchItemAssem) ListProtector.get(LJJZZIII, 0);
        BattleItem4FEModel battleItem4FEModel2 = matchItemAssem.LJLZ;
        if ((battleItem4FEModel2 == null || (list4 = battleItem4FEModel2.itemList) == null || list4.isEmpty()) && ((battleItem4FEModel = matchItemAssem.LJZ) == null || (list = battleItem4FEModel.itemList) == null || list.isEmpty())) {
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        BattleItem4FEModel battleItem4FEModel3 = matchItemAssem.LJLZ;
        if (battleItem4FEModel3 != null && (list3 = battleItem4FEModel3.itemList) != null) {
            for (ItemInfo4FE itemInfo4FE : list3) {
                if (itemInfo4FE.effectStartTimeSec <= currentTimeMillis && itemInfo4FE.endAt > currentTimeMillis) {
                    break;
                }
            }
        }
        BattleItem4FEModel battleItem4FEModel4 = matchItemAssem.LJZ;
        if (battleItem4FEModel4 == null || (list2 = battleItem4FEModel4.itemList) == null) {
            return false;
        }
        for (ItemInfo4FE itemInfo4FE2 : list2) {
            if (itemInfo4FE2.effectStartTimeSec <= currentTimeMillis && itemInfo4FE2.endAt > currentTimeMillis) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final void yp0() {
        if (!MultiGuestV3PunishSetting.INSTANCE.isEnable()) {
            return;
        }
        C0NB.LIZIZ("InteractService", "openMuteAudioPunish");
        DataChannelGlobal.LJLJJI.sv0(AudioPunishEvent.class, new C74631TQt(false, "business_mute_source_audio_mute_punish"));
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final int yr() {
        return C76265TwT.LJIILJJIL.getType();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final boolean Ao() {
        return C74838TYs.LJ().LJIIIZ;
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final SurfaceView Bo() {
        InterfaceC75441TjB R6;
        U8H LJJZZI;
        C76696U8e LJJIII;
        InterfaceC75179Tex LJI;
        String str = C74838TYs.LJ().LJIILIIL;
        if (str != null && (R6 = C8E.LJ().R6()) != null && (LJJZZI = R6.LJJZZI()) != null && (LJJIII = LJJZZI.LJJIII()) != null && (LJI = LJJIII.LJI(str)) != null) {
            return LJI.LJLJJLL();
        }
        return null;
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final int Em() {
        return C74838TYs.LJ().LJJ;
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final int Fy() {
        return B5G.LIZIZ().LJ();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final boolean I80() {
        MultiGuestDataHolder multiGuestDataHolder;
        if (C74740TUy.LIZLLL().LJ()) {
            return true;
        }
        Object LIZ = C75559Tl5.LIZIZ.LIZ("MULTI_GUEST_DATA_HOLDER");
        if (LIZ instanceof MultiGuestDataHolder) {
            multiGuestDataHolder = (MultiGuestDataHolder) LIZ;
        } else {
            multiGuestDataHolder = null;
        }
        if (multiGuestDataHolder == null) {
            return false;
        }
        if (multiGuestDataHolder.LJJIJIIJI || multiGuestDataHolder.LJJIJIIJIL) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final String K9() {
        if (!OB()) {
            return "";
        }
        return C75545Tkr.LIZIZ(B5G.LIZIZ().LJIIJ);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final long LJJLI() {
        InterfaceC75441TjB R6;
        String LLLLLLIL;
        if (C77125UOr.LJIIJJI(Fy(), 4)) {
            return B5G.LIZIZ().LJFF;
        }
        if (C77125UOr.LJIIJJI(Fy(), 2) && (R6 = ((IMultiGuestV3InternalServiceV2) CN1.LIZ(IMultiGuestV3InternalServiceV2.class)).R6()) != null && (LLLLLLIL = R6.LLLLLLIL()) != null) {
            return CastLongProtector.parseLong(LLLLLLIL);
        }
        return 0L;
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final boolean LLLLZLLIL() {
        InterfaceC75441TjB R6 = C8E.LJ().R6();
        if (R6 != null) {
            return R6.LLLLZLLIL();
        }
        return false;
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final Set<Long> M10() {
        Set<Long> set = C74838TYs.LJ().LJIL;
        o.LJIIIIZZ(set, "inst().uninvitedUidSet");
        return set;
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final boolean OB() {
        return B5G.LIZIZ().LIZJ;
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final boolean QA() {
        return RandomLinkMicManager.LJIIIZ();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final List<Long> QD() {
        List<C75883TqJ> LJIILJJIL = C8E.LIZLLL().LJIILJJIL();
        ArrayList arrayList = new ArrayList();
        for (C75883TqJ c75883TqJ : LJIILJJIL) {
            if (c75883TqJ != null) {
                arrayList.add(Long.valueOf(c75883TqJ.LIZ));
            }
        }
        return arrayList;
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final Set<Long> Rt0() {
        Set<Long> LLLLLJLJLL;
        InterfaceC75441TjB R6 = C8E.LJ().R6();
        if (R6 == null || (LLLLLJLJLL = R6.LLLLLJLJLL()) == null) {
            return OQY.INSTANCE;
        }
        return LLLLLJLJLL;
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final long S6() {
        if (C77125UOr.LJIIJJI(Fy(), 4)) {
            return C8E.LIZLLL().S6();
        }
        return 0L;
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final boolean UX() {
        if (!ZQ()) {
            if (h80() || RandomLinkMicManager.LJIIIZ() || ZQ() || B5G.LIZIZ().LIZJ() != EnumC75636TmK.DISABLED) {
                return false;
            }
        } else {
            if (!ZQ()) {
                return false;
            }
            List<C75883TqJ> LJIL = C8E.LIZLLL().LJIL();
            ArrayList arrayList = new ArrayList();
            for (C75883TqJ c75883TqJ : LJIL) {
                C75883TqJ c75883TqJ2 = c75883TqJ;
                EnumC75909Tqj enumC75909Tqj = c75883TqJ2.LJJI;
                if (enumC75909Tqj == EnumC75909Tqj.INVITING || (enumC75909Tqj == EnumC75909Tqj.INVITED && c75883TqJ2.LJFF())) {
                    arrayList.add(c75883TqJ);
                }
            }
            int size = arrayList.size();
            int size2 = C8E.LIZLLL().LJIL().size();
            EnumC75620Tm4 LLII = C8E.LIZLLL().LLII();
            if (size >= 3) {
                return false;
            }
            if (size2 >= 4 && (!LiveCohostCrossApplyFullFixSetting.INSTANCE.isEnable() || !LLII.isApplying())) {
                return false;
            }
        }
        return true;
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final void Wj() {
        C8E.LIZLLL().LJJIIJZLJL();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final long X90() {
        return B5G.LIZIZ().LJI;
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final boolean ZQ() {
        return C44432HcC.LJIIJ().isMultiCoHost();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final boolean ZR() {
        return !C8E.LIZLLL().LLII().isIdle();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final boolean cx() {
        return C74934Tb0.LIZ();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final boolean dX() {
        InterfaceC75441TjB R6;
        InterfaceC75973Trl LLIIJI;
        List<LinkUser> LJJIIZI;
        if (C74838TYs.LJ().LJIIIZ) {
            return true;
        }
        InterfaceC75441TjB R62 = C8E.LJ().R6();
        if (R62 != null && R62.scene() == 4 && (R6 = C8E.LJ().R6()) != null && (LLIIJI = R6.LLIIJI()) != null && (LJJIIZI = LLIIJI.LJJIIZI()) != null && LJJIIZI.size() > 1) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final void e1() {
        U8H LJJZZI;
        InterfaceC75441TjB R6 = C8E.LJ().R6();
        if (R6 != null && (LJJZZI = R6.LJJZZI()) != null) {
            LJJZZI.LJJLIIIJL();
        }
        C8E.LIZLLL().e1();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final String gB() {
        U8H LJJZZI;
        C76696U8e LJJIII;
        String layoutId;
        if (C77125UOr.LJIIJJI(Fy(), 4)) {
            InterfaceC75441TjB LJJIJL = C8E.LIZLLL().LJJIJL();
            if (LJJIJL == null || (LJJZZI = LJJIJL.LJJZZI()) == null || (LJJIII = LJJZZI.LJJIII()) == null || (layoutId = LJJIII.getLayoutId()) == null) {
                return "";
            }
            return layoutId;
        }
        if (!C77125UOr.LJIIJJI(Fy(), 2)) {
            return "";
        }
        return C78886Uxe.LJJJJLI(C8E.LJ());
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final String getConnectionType() {
        if (mT()) {
            return "manual_pk";
        }
        if (OB()) {
            return "anchor";
        }
        if (C74838TYs.LJ().LJIIL && C74838TYs.LJ().LJJ > 0) {
            return "audience";
        }
        return "normal";
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final boolean h80() {
        if (C74838TYs.LJ().LJIIIZ || B5G.LIZIZ().LIZJ) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final long hV() {
        if (Qe0()) {
            return C76265TwT.LIZ.LJIILL;
        }
        return 0L;
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final Set<Long> iP() {
        Set<Long> LLLLLL;
        InterfaceC75441TjB R6 = C8E.LJ().R6();
        if (R6 == null || (LLLLLL = R6.LLLLLL()) == null) {
            return OQY.INSTANCE;
        }
        return LLLLLL;
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final boolean isNeedPublishFrame() {
        Boolean bool;
        InterfaceC75441TjB R6 = C8E.LJ().R6();
        if (R6 != null) {
            bool = Boolean.valueOf(R6.isNeedPublishFrame());
        } else {
            bool = null;
        }
        return C29306Beo.LJJIFFI(bool);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final boolean mr0() {
        return C74776TWi.LJIIL();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final boolean n8() {
        return C74789TWv.LIZIZ();
    }

    @Override // X.InterfaceC06390Mx
    public final void onInit() {
        if (LiveServiceManagerOptSetting.enable()) {
            return;
        }
        this.LJLILLLLZI = true;
        ((IPublicScreenService) CN1.LIZ(IPublicScreenService.class)).Yj0(new C29570Bj4());
        ((IPublicScreenService) CN1.LIZ(IPublicScreenService.class)).Dv(4, new C29842BnS());
        ((IPublicScreenService) CN1.LIZ(IPublicScreenService.class)).Dv(3, new C29832BnI());
        ((IUserCardService) CN1.LIZ(IUserCardService.class)).nw(new C29558Bis(), 65537);
        ((IUserCardService) CN1.LIZ(IUserCardService.class)).nw(new C29560Biu(), 65538);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final boolean q3() {
        if (C77125UOr.LJIIJJI(Fy(), 4)) {
            return C8E.LIZLLL().q3();
        }
        return false;
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final boolean ta0() {
        return C74838TYs.LJ().LJIIIZ;
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final void yo0() {
        if (C74838TYs.LJ().LJJ > 0) {
            C74751TVj.LIZLLL("live_over", null, null, 6);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final String co0() {
        return C31611Cat.LIZ;
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final void eS() {
        try {
            C66851QLn.LJIIIIZZ();
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final void Fe(InterfaceC75512TkK interfaceC75512TkK) {
        C65777Prh.LIZ(this.LJLJJI).remove(interfaceC75512TkK);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final void Js0(InterfaceC75512TkK interfaceC75512TkK) {
        if (!this.LJLJI) {
            C74740TUy.LIZLLL().LIZ(this.LJLJJL);
            this.LJLJI = true;
        }
        if (interfaceC75512TkK != null && !((ArrayList) this.LJLJJI).contains(interfaceC75512TkK)) {
            ((ArrayList) this.LJLJJI).add(interfaceC75512TkK);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final String KU(long j) {
        User user = new User();
        user.setId(j);
        if (TV3.LJFF(user) || TV3.LJII(user)) {
            return "anchor";
        }
        if (TV3.LJIIIIZZ(user)) {
            return "guest";
        }
        if (TV3.LJI(user)) {
            return "audience";
        }
        return "";
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final int MS(String str) {
        InterfaceC75441TjB R6;
        MicPositionInfo micPositionData;
        MicPositionInfo micPositionData2;
        InterfaceC76652U6m interfaceC76652U6m = null;
        if (OB()) {
            InterfaceC75441TjB LJJIJL = C8E.LIZLLL().LJJIJL();
            if (LJJIJL != null) {
                interfaceC76652U6m = LJJIJL.LJZL();
            }
        } else if (ta0() && (R6 = C8E.LJ().R6()) != null) {
            interfaceC76652U6m = R6.LJZL();
        }
        if (interfaceC76652U6m == null) {
            return -1;
        }
        Integer num = -1;
        if (interfaceC76652U6m.LJII(str) != null) {
            OnLineMicInfo LJII = interfaceC76652U6m.LJII(str);
            if (LJII == null || (micPositionData2 = LJII.getMicPositionData()) == null) {
                return -1;
            }
            num = Integer.valueOf(micPositionData2.getPosition());
        } else if (interfaceC76652U6m.LIZIZ(str) != null) {
            OnLineMicInfo LIZIZ = interfaceC76652U6m.LIZIZ(str);
            if (LIZIZ == null || (micPositionData = LIZIZ.getMicPositionData()) == null) {
                return -1;
            }
            num = Integer.valueOf(micPositionData.getPosition());
        }
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final String Ng(User user) {
        o.LJIIIZ(user, "user");
        if (TV3.LJFF(user) || TV3.LJII(user)) {
            return "anchor";
        }
        if (TV3.LJIIIIZZ(user)) {
            return "guest";
        }
        if (TV3.LJI(user)) {
            return "user";
        }
        return "";
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final void PO(TX0 tx0) {
        if (tx0 != null) {
            C74789TWv.LIZJ.add(tx0);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final void Pb(Context context) {
        int i = 0;
        if (!LiveUltimateInflateSwitchSetting.INSTANCE.getValue()) {
            CZB.LIZ.getClass();
            CZB.LIZLLL(R.layout.dfo, 5, 0);
            return;
        }
        do {
            C20780ri.LIZLLL(R.layout.dfo, context);
            i++;
        } while (i < 5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final boolean Qh(boolean z) {
        if (MultiGuestApplyingSlideAndBarIconSetting.INSTANCE.enableSlideAfterApply(z)) {
            Integer num = (Integer) C74740TUy.LIZLLL().LIZIZ;
            if (num == null || num.intValue() != 2) {
                return false;
            }
        } else {
            T t = C74740TUy.LIZLLL().LIZIZ;
            o.LJIIIIZZ(t, "inst().data");
            int intValue = ((Number) t).intValue();
            if (intValue != 2 && intValue != 1) {
                return false;
            }
        }
        return true;
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final void Uf(long j) {
        if (MultiGuestAddStopFlyMicAniSetting.INSTANCE.isEnable()) {
            DataChannelGlobal.LJLJJI.sv0(StopFlyMicGiftAnimationEvent.class, Long.valueOf(j));
        }
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final User Vp(Long l) {
        AbstractC74727TUl LIZ;
        List LJJI;
        Object obj;
        Long l2;
        AbstractC74727TUl LIZ2;
        List LJJI2;
        Object obj2;
        Long l3;
        AbstractC74727TUl LIZ3;
        List LJJI3;
        Object obj3;
        Long l4;
        if (TV3.LIZJ()) {
            InterfaceC31805Ce1 interfaceC31805Ce1 = (InterfaceC31805Ce1) C75559Tl5.LIZIZ.LIZIZ("MULTI_GUEST_V3_ANCHOR_USER_MANAGER");
            if (interfaceC31805Ce1 == null || (LIZ3 = interfaceC31805Ce1.LIZ()) == null || (LJJI3 = LIZ3.LJJI()) == null) {
                return null;
            }
            Iterator it = LJJI3.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj3 = it.next();
                    User user = ((LinkPlayerInfo) obj3).mUser;
                    if (user != null) {
                        l4 = Long.valueOf(user.getId());
                    } else {
                        l4 = null;
                    }
                    if (o.LJ(l4, l)) {
                        break;
                    }
                } else {
                    obj3 = null;
                    break;
                }
            }
            LinkPlayerInfo linkPlayerInfo = (LinkPlayerInfo) obj3;
            if (linkPlayerInfo == null) {
                return null;
            }
            return linkPlayerInfo.mUser;
        }
        if (n8()) {
            InterfaceC74853TZh interfaceC74853TZh = (InterfaceC74853TZh) C75559Tl5.LIZIZ.LIZIZ("MULTI_GUEST_V3_MODERATOR_USER_MANAGER");
            if (interfaceC74853TZh == null || (LIZ2 = interfaceC74853TZh.LIZ()) == null || (LJJI2 = LIZ2.LJJI()) == null) {
                return null;
            }
            Iterator it2 = LJJI2.iterator();
            while (true) {
                if (it2.hasNext()) {
                    obj2 = it2.next();
                    User user2 = ((LinkPlayerInfo) obj2).mUser;
                    if (user2 != null) {
                        l3 = Long.valueOf(user2.getId());
                    } else {
                        l3 = null;
                    }
                    if (o.LJ(l3, l)) {
                        break;
                    }
                } else {
                    obj2 = null;
                    break;
                }
            }
            LinkPlayerInfo linkPlayerInfo2 = (LinkPlayerInfo) obj2;
            if (linkPlayerInfo2 == null) {
                return null;
            }
            return linkPlayerInfo2.mUser;
        }
        TQ8 tq8 = (TQ8) C75559Tl5.LIZIZ.LIZIZ("MULTI_GUEST_V3_GUEST_USER_MANAGER");
        if (tq8 == null || (LIZ = tq8.LIZ()) == null || (LJJI = LIZ.LJJI()) == null) {
            return null;
        }
        Iterator it3 = LJJI.iterator();
        while (true) {
            if (it3.hasNext()) {
                obj = it3.next();
                User user3 = ((LinkListUser) obj).user;
                if (user3 != null) {
                    l2 = Long.valueOf(user3.getId());
                } else {
                    l2 = null;
                }
                if (o.LJ(l2, l)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        LinkListUser linkListUser = (LinkListUser) obj;
        if (linkListUser == null) {
            return null;
        }
        return linkListUser.user;
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final void WA(Map<String, String> map) {
        C75545Tkr.LIZJ(map, B5G.LIZIZ().LJIIJ, true);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final int Wd(User user) {
        TQ8 tq8;
        if (LinkMicMultiGuestV3AndroidModeratorTechSwitchSetting.INSTANCE.getValue()) {
            TZX LJJ = C76917UGr.LJJ();
            if (LJJ == null) {
                return 0;
            }
            return LJJ.LIZJ(user.getId());
        }
        C75559Tl5 c75559Tl5 = C75559Tl5.LIZIZ;
        Object obj = c75559Tl5.LIZJ().get("MULTI_GUEST_V3_GUEST_USER_MANAGER");
        InterfaceC31805Ce1 interfaceC31805Ce1 = null;
        if (obj instanceof TQ8) {
            tq8 = (TQ8) obj;
        } else {
            tq8 = null;
        }
        Object obj2 = c75559Tl5.LIZJ().get("MULTI_GUEST_V3_ANCHOR_USER_MANAGER");
        if (obj2 instanceof InterfaceC31805Ce1) {
            interfaceC31805Ce1 = (InterfaceC31805Ce1) obj2;
        }
        if (tq8 != null) {
            AbstractC74727TUl LIZ = tq8.LIZ();
            long id = user.getId();
            o.LJIIIZ(LIZ, "<this>");
            LinkListUser LJJIIJ = C76917UGr.LJJIIJ(LIZ, id);
            if (LJJIIJ == null) {
                return 0;
            }
            return LJJIIJ.LIZ;
        }
        if (interfaceC31805Ce1 == null) {
            return 0;
        }
        AbstractC74727TUl LIZ2 = interfaceC31805Ce1.LIZ();
        long id2 = user.getId();
        o.LJIIIZ(LIZ2, "<this>");
        LinkPlayerInfo LJJIJL = C76917UGr.LJJIJL(LIZ2, id2);
        if (LJJIJL == null) {
            return 0;
        }
        return LJJIJL.LIZ;
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final void Wx(DataChannel dataChannel) {
        EnumC30204BtI.TRY_MODE_MULTIGUEST.load(dataChannel, new C28845BTt());
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final void Yl0(BAP bap) {
        InterfaceC74935Tb1 interfaceC74935Tb1;
        String LJFF;
        Object obj = C75559Tl5.LIZIZ.LIZJ().get("ZOOM_SERVICE");
        if ((obj instanceof InterfaceC74935Tb1) && (interfaceC74935Tb1 = (InterfaceC74935Tb1) obj) != null && (LJFF = interfaceC74935Tb1.LJFF()) != null) {
            C74865TZt.LIZ(interfaceC74935Tb1, LJFF, new C75502TkA(bap), false, EnumC74929Tav.FROM_DRAW_AND_GUESS, 12);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final void ad0(TX0 tx0) {
        if (tx0 != null) {
            C74789TWv.LIZJ.remove(tx0);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final void fR(Room room) {
        MultiLiveUserSettings multiLiveUserSettings;
        CoHost coHost;
        List<LinkmicUser> list;
        MultiLiveUserSettings multiLiveUserSettings2;
        CoHost coHost2;
        List<LinkmicUser> list2;
        if (room == null || !LiveMatchQualityOptimizeSetting.INSTANCE.enableOptimize() || (multiLiveUserSettings = room.multiLiveUserSettings) == null || (coHost = multiLiveUserSettings.coHost) == null || (list = coHost.linkedUsers) == null || list.isEmpty() || (multiLiveUserSettings2 = room.multiLiveUserSettings) == null || (coHost2 = multiLiveUserSettings2.coHost) == null || (list2 = coHost2.linkedUsers) == null) {
            return;
        }
        for (LinkmicUser linkmicUser : list2) {
            if (linkmicUser != null && linkmicUser.avatar != null) {
                ((IHostFrescoHelper) CN1.LIZ(IHostFrescoHelper.class)).EM(linkmicUser.avatar, new C75500Tk8());
                ((C32537Cpp) DataChannelGlobal.LJLJJI.gv0(C4W.class)).LIZ = "room_enter";
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final boolean gt(String str) {
        InterfaceC65784Pro<Boolean> interfaceC65784Pro;
        Boolean invoke;
        if (!MultiGuestV3PunishSetting.INSTANCE.isEnable() || str == null || (interfaceC65784Pro = this.LJLIL.get(str)) == null || (invoke = interfaceC65784Pro.invoke()) == null) {
            return false;
        }
        return invoke.booleanValue();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final boolean hw(User user) {
        EnumC74778TWk LIZJ;
        if (user == null || TV3.LJI(user)) {
            return false;
        }
        MultiGuestDataHolder multiGuestDataHolder = (MultiGuestDataHolder) C75559Tl5.LIZIZ.LIZIZ("MULTI_GUEST_DATA_HOLDER");
        if ((multiGuestDataHolder == null || multiGuestDataHolder.LJIILIIL < 1) && (LIZJ = C59994Ngc.LIZJ()) != EnumC74778TWk.FLOATING_FIX && LIZJ != EnumC74778TWk.GRID_FIX) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final InterfaceC28235B6h n60(LiveMode mode) {
        o.LJIIIZ(mode, "mode");
        if (LivesdkVoiceChatMonitorCombineSetting.INSTANCE.getValue()) {
            return new C75517TkP(mode);
        }
        return null;
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final void ns0(List<LinkedUserInfo> list) {
        HashMap LIZLLL = C73098SmU.LIZLLL();
        int i = 0;
        if (list != null && list.size() > 1) {
            if (list != null) {
                i = list.size();
            }
            i--;
        }
        LIZLLL.put("guest_cnt", String.valueOf(i));
        C74824TYe.LJLL("livesdk_anchor_guest_connection_rtc_recover", LIZLLL);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final void od0(DataChannel dataChannel) {
        EnumC30204BtI.TRY_MODE_COHOST.load(dataChannel, new BZ2());
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final boolean p00(User user) {
        return TextUtils.equals(Ng(user), "guest");
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final Rect po0(long j) {
        InterfaceC75441TjB R6;
        U8H LJJZZI;
        InterfaceC75179Tex LJI;
        String LJJIFFI = C74947TbD.LJJIFFI(Long.valueOf(j));
        if (LJJIFFI != null && (R6 = C8E.LJ().R6()) != null && (LJJZZI = R6.LJJZZI()) != null && (LJI = LJJZZI.LJJIII().LJI(LJJIFFI)) != null) {
            return LJI.LLLILZLLLI();
        }
        return null;
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final void uX(String str) {
        InterfaceC75441TjB LJJIJL;
        U8H LJJZZI;
        InterfaceC74695TTf LLIIJLIL;
        U8H LJJZZI2;
        InterfaceC75441TjB R6 = C8E.LJ().R6();
        if (R6 != null && (LLIIJLIL = R6.LLIIJLIL()) != null && LLIIJLIL.LJIILIIL()) {
            InterfaceC75441TjB R62 = C8E.LJ().R6();
            if (R62 != null && (LJJZZI2 = R62.LJJZZI()) != null) {
                LJJZZI2.LJJJJZI(str);
                return;
            }
            return;
        }
        if (C8E.LIZLLL().LLII() != EnumC75620Tm4.Linked || (LJJIJL = C8E.LIZLLL().LJJIJL()) == null || (LJJZZI = LJJIJL.LJJZZI()) == null) {
            return;
        }
        LJJZZI.LJJJJZI(str);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final B5Y xz(long j) {
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room == null) {
            return B5Y.NORMAL_AUDIENCE;
        }
        if (j == room.getOwnerUserId()) {
            return B5Y.CURRENT_ANCHOR;
        }
        if (j == B5G.LIZIZ().LJI) {
            return B5Y.GUEST_ANCHOR;
        }
        if (((HashMap) TS8.LIZ.LIZ).containsKey(Long.valueOf(j))) {
            return B5Y.GUEST_AUDIENCE;
        }
        return B5Y.NORMAL_AUDIENCE;
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final void yW(Room room) {
        Long l;
        if (!MultiGuestV3PunishSetting.INSTANCE.isEnable()) {
            return;
        }
        if (room != null) {
            l = Long.valueOf(room.getId());
        } else {
            l = null;
        }
        this.LJLIL.remove(String.valueOf(l));
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final String BF(boolean z, Room room) {
        o.LJIIIZ(room, "room");
        return C74824TYe.LJII(z, room);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final void BL(LifecycleOwner lifecycleOwner, DataChannel dataChannel) {
        if (C74738TUw.LIZLLL()) {
            C74738TUw.LJII("live_end", 0, dataChannel, true, lifecycleOwner);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final InterfaceC75238Tfu Mb(ViewGroup viewGroup, DataChannel dataChannel) {
        return new C76607U4t(viewGroup, dataChannel, null);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final void Ty(String str, WeakReference<InterfaceC58334Muw> weakReference) {
        U8H LJJZZI;
        InterfaceC75441TjB R6 = C8E.LJ().R6();
        if (R6 != null && (LJJZZI = R6.LJJZZI()) != null) {
            LJJZZI.LJIILL().put(str, new N2I(weakReference));
        }
        C8E.LIZLLL().LLIIIL(str, new N2J(weakReference));
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final boolean kg(DataChannel dataChannel, boolean z) {
        Object obj;
        if (dataChannel != null) {
            obj = dataChannel.kv0(MultiCoHostStateChannel.class);
        } else {
            obj = null;
        }
        if (z) {
            if (obj != EnumC75620Tm4.Applied) {
                return true;
            }
            C30868C9o.LIZJ(R.string.kmh);
            return false;
        }
        if (obj == EnumC75620Tm4.Applied) {
            return true;
        }
        List<C75883TqJ> LJIL = C8E.LIZLLL().LJIL();
        ArrayList arrayList = new ArrayList();
        for (C75883TqJ c75883TqJ : LJIL) {
            C75883TqJ c75883TqJ2 = c75883TqJ;
            EnumC75909Tqj enumC75909Tqj = c75883TqJ2.LJJI;
            if (enumC75909Tqj == EnumC75909Tqj.INVITING || enumC75909Tqj == EnumC75909Tqj.INVITED) {
                if (c75883TqJ2.LJFF()) {
                    arrayList.add(c75883TqJ);
                }
            }
        }
        int size = arrayList.size();
        int size2 = C8E.LIZLLL().LJIL().size();
        if (size >= 3) {
            C30868C9o.LIZJ(R.string.kmi);
        } else {
            if (size2 < 4) {
                return true;
            }
            if (size > 0) {
                C30868C9o.LIZJ(R.string.kmg);
            } else {
                C30868C9o.LIZJ(R.string.kmf);
            }
        }
        return false;
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final void rd(String str, Map<String, String> data) {
        InterfaceC75441TjB LJJIJL;
        U8H LJJZZI;
        InterfaceC74695TTf LLIIJLIL;
        U8H LJJZZI2;
        o.LJIIIZ(data, "data");
        InterfaceC75441TjB R6 = C8E.LJ().R6();
        if (R6 != null && (LLIIJLIL = R6.LLIIJLIL()) != null && LLIIJLIL.LJIILIIL()) {
            InterfaceC75441TjB R62 = C8E.LJ().R6();
            if (R62 != null && (LJJZZI2 = R62.LJJZZI()) != null) {
                LJJZZI2.LJJJJJL(str, data);
                return;
            }
            return;
        }
        if (C8E.LIZLLL().LLII() != EnumC75620Tm4.Linked || (LJJIJL = C8E.LIZLLL().LJJIJL()) == null || (LJJZZI = LJJIJL.LJJZZI()) == null) {
            return;
        }
        LJJZZI.LJJJJJL(str, data);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final void vs(Room room, InterfaceC65784Pro<Boolean> interfaceC65784Pro) {
        Long l;
        if (!MultiGuestV3PunishSetting.INSTANCE.isEnable()) {
            return;
        }
        if (room != null) {
            l = Long.valueOf(room.getId());
        } else {
            l = null;
        }
        String valueOf = String.valueOf(l);
        if (interfaceC65784Pro != null) {
            this.LJLIL.put(valueOf, interfaceC65784Pro);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final void wN(Context context, boolean z) {
        if (!z || LiveDeleteUselessPreloadSetting.preloadAble()) {
            C20910rv.LJIILIIL(C20910rv.LIZ, R.layout.dl4, new C20890rt("ttlive_view_live_interact_radio", EnumC20860rq.INTERACTION), null, false, 24);
        }
        if (LiveUltimateInflateSwitchSetting.INSTANCE.getValue()) {
            C20780ri.LIZLLL(R.layout.dl3, context);
        } else {
            C20910rv.LJIILIIL(C20910rv.LIZ, R.layout.dl3, new C20890rt("ttlive_view_live_interact_guest", EnumC20860rq.INTERACTION), null, false, 24);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final void PW(Boolean bool, String str, JSONObject jSONObject) {
        long j;
        User owner;
        boolean booleanValue = bool.booleanValue();
        if (C76265TwT.LJ()) {
            C76280Twi c76280Twi = C76265TwT.LIZ;
            C05630Jz.LJFF(jSONObject, "award_battle_id", c76280Twi.LIZIZ());
            C05630Jz.LJFF(jSONObject, "award_channel_id", c76280Twi.LIZJ());
        }
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (Room.isValid(room) && room != null && (owner = room.getOwner()) != null) {
            j = owner.getId();
        } else {
            j = 0;
        }
        C05630Jz.LJFF(jSONObject, "award_anchor_id", j);
        C76272Twa c76272Twa = C76272Twa.LIZ;
        if (!booleanValue) {
            c76272Twa.LJJJLL(0, str, jSONObject);
        } else {
            C76272Twa.LJJJLIIL(c76272Twa, str, jSONObject, false, null, 60);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final B3G nE(ViewGroup viewGroup, DataChannel dataChannel, LifecycleOwner lifecycleOwner) {
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        return new C75577TlN(viewGroup, dataChannel, lifecycleOwner);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final AbstractC32579CqV e60(int i, Context context, DataChannel dataChannel, C73893SzJ c73893SzJ, ARunnableS41S0100000_5 aRunnableS41S0100000_5, boolean z) {
        if (C74934Tb0.LIZ() && z) {
            return new ViewOnClickListenerC75104Tdk(context, c73893SzJ, i, dataChannel, aRunnableS41S0100000_5);
        }
        if (C29137Bc5.LIZ((LiveMode) dataChannel.kv0(BCX.class))) {
            return new C75105Tdl(context, c73893SzJ, i, dataChannel, aRunnableS41S0100000_5);
        }
        return new C75103Tdj(context, c73893SzJ, i, dataChannel, aRunnableS41S0100000_5);
    }
}
