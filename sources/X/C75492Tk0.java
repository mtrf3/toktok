package X;

import Y.AObjectS140S0100000_5;
import Y.AObjectS143S0100000_13;
import Y.AObjectS89S0101000_13;
import Y.AfS17S0001000_5;
import Y.AfS31S0201000_5;
import Y.AfS33S0201000_13;
import Y.AfS36S0101000_5;
import Y.AfS39S0101000_13;
import Y.AfS5S0000100_13;
import Y.AfS8S0100100_13;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.android.live.liveinteract.api.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.live.liveinteract.cohost.remote.api.CoHostApi;
import com.bytedance.android.live.liveinteract.match.remote.api.LinkBattleApi;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.tool.log.MultiGuestLogger;
import com.bytedance.android.live.liveinteract.multihost.biz.event.CoHostAudienceAreaExpandChannel;
import com.bytedance.android.live.liveinteract.multihost.biz.quickpairing.RandomLinkMicManager;
import com.bytedance.android.live.liveinteract.platform.core.LinkerManager;
import com.bytedance.android.live.liveinteract.platform.core.message.LinkMessageCenter;
import com.bytedance.android.livesdk.chatroom.api.LinkApi;
import com.bytedance.android.livesdk.chatroom.model.interact.CheckPermissionResponse;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import com.bytedance.android.livesdk.comp.api.game.linkmic.IGameLinkMicService;
import com.bytedance.android.livesdk.comp.api.linkcore.model.Layout;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveCohostEnableMatchResumeSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveCohostPermissionPeriodSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveCohostPermissionRetryTimesSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveLinkmicDslLoadOptimizeSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestAnchorPanelTypeSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestUseLinkmicAloggerSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.CohostServerOptVersionSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.MultiCohostAreaExpandSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.MultiCohostExpandLayoutIdsSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveCohostSeiIdentifyRequestDelayMsSetting;
import com.bytedance.android.livesdk.model.Creator;
import com.bytedance.android.livesdk.sei.SeiAppData;
import com.bytedance.android.livesdk.sei.SeiDsl;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* renamed from: X.Tk0, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75492Tk0 extends AbstractC31497CXt<InterfaceC75495Tk3> implements InterfaceC75508TkG {
    public static final Long LJLLL = -1L;
    public static boolean LJLLLL;
    public final String LJLIL;
    public final LinkCrossRoomDataHolder LJLILLLLZI;
    public InterfaceC92693kP LJLJI;
    public final Room LJLJJI;
    public final boolean LJLJJL;
    public final LiveMode LJLJJLL;
    public boolean LJLJL;
    public final TX3 LJLJLJ;
    public final TYS LJLJLLL;
    public final C74758TVq LJLL;
    public final C75493Tk1 LJLLI;
    public final C75496Tk4 LJLLILLLL;
    public volatile boolean LJLLJ;

    @InterfaceC75558Tl4(name = "LINK_MESSAGE_CENTER")
    public LinkMessageCenter linkMessageCenter;

    @InterfaceC75558Tl4(name = "LINKER_MANAGER")
    public LinkerManager linkerManager;

    @Override // X.AbstractC31497CXt, X.BY9
    public final void detachView() {
        LJLLLL = false;
        MultiGuestAnchorPanelTypeSetting.INSTANCE.setMicRoom(null);
        this.LJLILLLLZI.LJII("LinkControlPresenter_OnDestroy");
        this.linkMessageCenter.LJ(this.LJLLI);
        InterfaceC92693kP interfaceC92693kP = this.LJLJI;
        if (interfaceC92693kP != null) {
            interfaceC92693kP.dispose();
            this.LJLJI = null;
        }
        C75622Tm6.LJIILL();
        Object obj = C75559Tl5.LIZIZ.LIZJ().get("MULTI_GUEST_DATA_HOLDER");
        if (obj instanceof MultiGuestDataHolder) {
            C75017TcL.LJIIL(((MultiGuestDataHolder) obj).LJJIIZ);
        } else {
            C75017TcL.LJIIL(null);
        }
        if (RandomLinkMicManager.LJIIIZ()) {
            RandomLinkMicManager.LJIILIIL();
        }
        C8E.LJ().X3(this.LJLJLLL);
        C8E.LJ().zF(this.LJLL);
        InterfaceC74805TXl C4 = C8E.LJ().C4();
        if (C4 != null) {
            C4.LJIIIIZZ(this.LJLJLJ);
        }
        if (((IGameLinkMicService) CN1.LIZ(IGameLinkMicService.class)).Sw(this.LJLJJI)) {
            C8E.LJ().LJJIIJZLJL();
            C8E.LIZLLL().LJJIIJZLJL();
        }
        MultiCohostAreaExpandSetting.INSTANCE.setLastCohostLayoutId("");
        super.detachView();
    }

    public static final String LJJJJL() {
        if (!MultiGuestUseLinkmicAloggerSetting.INSTANCE.isEnable()) {
            return "LinkControlPresenter";
        }
        StackTraceElement LJ = C32014ChO.LJ();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(U44.BIZ.getValue());
        LIZ.append("_");
        LIZ.append("LinkControlPresenter");
        LIZ.append("_");
        LIZ.append(LJ.getLineNumber());
        return X1D.LIZIZ(LIZ);
    }

    public final void LJJJJLL() {
        InterfaceC92693kP interfaceC92693kP = this.LJLJI;
        if (interfaceC92693kP != null && !interfaceC92693kP.isDisposed()) {
            this.LJLJI.dispose();
        }
        LiveCohostPermissionPeriodSetting liveCohostPermissionPeriodSetting = LiveCohostPermissionPeriodSetting.INSTANCE;
        this.LJLJI = ((InterfaceC29856Bng) TMC.LJIL(liveCohostPermissionPeriodSetting.getValue(), liveCohostPermissionPeriodSetting.getValue(), TimeUnit.SECONDS).LJJJ(C73969T1h.LIZIZ()).LIZJ(autoDispose())).LIZJ(new AfS36S0101000_5(0, this, 46), new AfS36S0101000_5(0, this, 47));
    }

    public final void LJJJJZ() {
        ((InterfaceC29856Bng) ((CoHostApi) Q7L.LIZIZ(CoHostApi.class)).triggerReserveNotice(this.LJLJJI.getId()).LIZJ(autoDisposeWithTransformer())).LIZJ(new AfS17S0001000_5(0, 15), new AfS39S0101000_13(0, this, 2));
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0845  */
    @Override // X.AbstractC31497CXt
    /* renamed from: LJJJJ, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void attachView(X.InterfaceC75495Tk3 r29) {
        /*
            Method dump skipped, instructions count: 2223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C75492Tk0.attachView(X.Tk3):void");
    }

    public final void LJJJJI(boolean z) {
        long j;
        C58414MwE.LIZLLL.LJIIIZ("check_permission", null);
        HashMap hashMap = new HashMap();
        hashMap.put("cohost-arch-version", String.valueOf(CohostServerOptVersionSetting.INSTANCE.getValue()));
        C75878TqE c75878TqE = new C75878TqE();
        AbstractC73672Svk<C28467BFf<CheckPermissionResponse>> checkPermissionV3 = ((LinkApi) Q7L.LIZIZ(LinkApi.class)).checkPermissionV3(this.LJLJJI.getId(), true, hashMap);
        if (z) {
            j = LiveCohostPermissionRetryTimesSetting.INSTANCE.getValue();
        } else {
            j = 0;
        }
        ((InterfaceC29856Bng) checkPermissionV3.LJJJJJL(j, new C61845OOz()).LIZJ(autoDisposeWithTransformer())).LIZJ(new AfS31S0201000_5(0, this, c75878TqE, 4), new AfS33S0201000_13(0, this, c75878TqE, 0));
    }

    public final void LJJJJIZL(C28272B7s c28272B7s) {
        boolean z;
        if (this.LJLJJL || this.LJLLILLLL == null || c28272B7s == null || TextUtils.isEmpty(c28272B7s.LIZIZ)) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("needIDeify");
            LIZ.append(this.LJLLJ);
            LIZ.append("mSeihelper ");
            if (this.LJLLILLLL == null) {
                z = true;
            } else {
                z = false;
            }
            C19U.LIZJ(LIZ, z, LIZ, "Identify");
            return;
        }
        if (B5G.LIZIZ().LIZJ) {
            C75621Tm5.LJIIJ(B5G.LIZIZ().LJFF);
            if (TextUtils.isEmpty(MultiCohostAreaExpandSetting.INSTANCE.getLastCohostLayoutId())) {
                this.LJLLILLLL.LIZ(c28272B7s);
                return;
            }
            return;
        }
        this.LJLLILLLL.LIZ(c28272B7s);
    }

    /* JADX WARN: Type inference failed for: r0v17, types: [T, X.TjB] */
    /* JADX WARN: Type inference failed for: r0v41, types: [T, X.TjB] */
    public final void LJJJJJ(EnumC74990Tbu source) {
        String str;
        String businessType;
        String businessType2;
        InterfaceC75441TjB R6;
        U8H LJJZZI;
        Layout v1;
        InterfaceC75011TcF LJZI;
        StringBuilder LJI = JBR.LJI("initAndTurnOnMultiGuest, mTurningOnAudienceInteract = ", false, "  mIsMicRoom = ");
        LJI.append(LJLLLL);
        LJI.append(" source = ");
        String str2 = "";
        if (source == null) {
            str = "";
        } else {
            str = source.value;
        }
        JBR.LJIIJ(LJI, str, LJI, "LinkControlPresenter");
        if (LJLLLL && !CL8.LJ(this.dataChannel)) {
            return;
        }
        String str3 = null;
        C75559Tl5.LIZIZ.LJI(new MultiGuestLogger(), null);
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            ((C32537Cpp) dataChannel.gv0(C74967TbX.class)).LIZ = null;
        }
        InterfaceC30442Bx8.LLJJIJIIJIL.LIZ(Boolean.TRUE);
        if (!this.LJLJJL) {
            return;
        }
        C8E.LJ().e3(this.LJLJLLL);
        C8E.LJ().Aq(this.LJLL);
        C74983Tbn LIZ = C29556Biq.LIZ();
        Context context = ((InterfaceC31336CRo) this.mView).getContext();
        Room room = this.LJLJJI;
        C75020TcO c75020TcO = new C75020TcO(this, source);
        DataChannel dataChannel2 = this.dataChannel;
        LIZ.getClass();
        o.LJIIIZ(source, "source");
        o.LJIIIZ(context, "context");
        o.LJIIIZ(room, "room");
        o.LJIIIZ(dataChannel2, "dataChannel");
        LIZ.LJIILL();
        C68322mC c68322mC = new C68322mC();
        ?? R62 = C8E.LJ().R6();
        c68322mC.element = R62;
        if (R62 == 0) {
            C8E.LJ().tr0(context, room, dataChannel2, null);
            c68322mC.element = C8E.LJ().R6();
        }
        MultiLiveAnchorPanelSettings cachedMultiLiveAnchorPanelSetting = InterfaceC30442Bx8.d0.LIZJ();
        o.LJIIIIZZ(cachedMultiLiveAnchorPanelSetting, "cachedMultiLiveAnchorPanelSetting");
        EnumC74991Tbv LJJ = C86793Y4n.LJJ(cachedMultiLiveAnchorPanelSetting);
        if (LiveLinkmicDslLoadOptimizeSetting.INSTANCE.getValue()) {
            InterfaceC75441TjB interfaceC75441TjB = (InterfaceC75441TjB) c68322mC.element;
            if (interfaceC75441TjB != null) {
                int LJLJJLL = interfaceC75441TjB.LJLJJLL();
                InterfaceC75441TjB interfaceC75441TjB2 = (InterfaceC75441TjB) c68322mC.element;
                if (interfaceC75441TjB2 != null) {
                    int scene = interfaceC75441TjB2.scene();
                    InterfaceC75441TjB interfaceC75441TjB3 = (InterfaceC75441TjB) c68322mC.element;
                    if (interfaceC75441TjB3 == null || (LJZI = interfaceC75441TjB3.LJZI()) == null) {
                        return;
                    }
                    LJZI.LJJI(scene, LJLJJLL, new C75494Tk2(LJJ, LIZ, c68322mC, c75020TcO, source));
                    return;
                }
                C32014ChO.LIZJ(C74983Tbn.LJIILJJIL(110), "session?.scene() return null, so return", null);
                return;
            }
            C32014ChO.LIZJ(C74983Tbn.LJIILJJIL(106), "session?.getSessionVersion() return null, so return", null);
            return;
        }
        if (LJJ != null && (businessType2 = LJJ.getBusinessType()) != null && (R6 = C8E.LJ().R6()) != null && (LJJZZI = R6.LJJZZI()) != null && (v1 = LJJZZI.v1(businessType2)) != null) {
            str3 = v1.getLayoutId();
        }
        EnumC74991Tbv LJJ2 = C86793Y4n.LJJ(cachedMultiLiveAnchorPanelSetting);
        if (LJJ2 != null && (businessType = LJJ2.getBusinessType()) != null) {
            str2 = businessType;
        }
        LIZ.LIZIZ(C74983Tbn.LJIIIZ(str2), str3, (InterfaceC75441TjB) c68322mC.element, c75020TcO, source);
    }

    public final boolean LJJJJJL(String str) {
        T t = this.mView;
        if (t == 0) {
            String LJJJJL = LJJJJL();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("getViewInterface() return null, ");
            LIZ.append(str);
            LIZ.append(" failed");
            C32014ChO.LJIIIZ(LJJJJL, X1D.LIZIZ(LIZ));
            return false;
        }
        if (((InterfaceC31336CRo) t).getContext() == null) {
            String LJJJJL2 = LJJJJL();
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("getViewInterface().getContext() return null, ");
            LIZ2.append(str);
            LIZ2.append(" failed");
            C32014ChO.LJIIIZ(LJJJJL2, X1D.LIZIZ(LIZ2));
            return false;
        }
        if (this.LJLJJI == null) {
            String LJJJJL3 = LJJJJL();
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("mRoom is null,");
            LIZ3.append(str);
            LIZ3.append("  initOneVnForGuestForBase failed");
            C32014ChO.LJIIIZ(LJJJJL3, X1D.LIZIZ(LIZ3));
            return false;
        }
        return true;
    }

    public final void LJJJJLI(SeiAppData seiAppData) {
        Room room;
        String str;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onSeiUpdated ");
        LIZ.append(this.LJLLJ);
        C0NB.LIZIZ("Identify", X1D.LIZIZ(LIZ));
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("seiAppData version ");
        C1DD.LJFF(LIZ2, seiAppData.version, LIZ2, "Identify");
        if (seiAppData.version != 2 || TextUtils.isEmpty(seiAppData.channelId) || (room = this.LJLJJI) == null || room.getId() == 0 || this.LJLJJI.getOwner() == null) {
            return;
        }
        long parseLong = CastLongProtector.parseLong(seiAppData.channelId);
        long id = this.LJLJJI.getId();
        if (parseLong == 0) {
            return;
        }
        SeiDsl seiDsl = seiAppData.dsl;
        if (seiDsl != null && !TextUtils.isEmpty(seiDsl.layoutId)) {
            String str2 = seiAppData.dsl.layoutId;
            C279017q.LJ("Sei layoutId = ", str2, "AreaExpand");
            MultiCohostAreaExpandSetting multiCohostAreaExpandSetting = MultiCohostAreaExpandSetting.INSTANCE;
            if (!str2.equals(multiCohostAreaExpandSetting.getLastCohostLayoutId())) {
                multiCohostAreaExpandSetting.setLastCohostLayoutId(str2);
                DataChannel dataChannel = this.dataChannel;
                if (dataChannel != null) {
                    dataChannel.rv0(CoHostAudienceAreaExpandChannel.class, Boolean.valueOf(MultiCohostExpandLayoutIdsSetting.INSTANCE.isLayoutIdExpanded(str2)));
                }
            }
        }
        int i = seiAppData.linkerArchType;
        if (i == EnumC31946CgI.CROSS_ROOM_ARCH.getType()) {
            this.LJLLJ = false;
        }
        if (C75622Tm6.LJIIJ && C75622Tm6.LJIIIZ >= 0 && C75622Tm6.LJIIJJI != 0 && (str = seiAppData.channelId) != null && str.length() != 0 && Long.valueOf(seiAppData.battleId) != null) {
            long j = seiAppData.battleId;
            if (j != 0) {
                long j2 = C75622Tm6.LJIIIIZZ;
                if (j2 == 0 || j != j2) {
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("disappear battleId = ");
                    LIZ3.append(C75622Tm6.LJIIIIZZ);
                    LIZ3.append(" and seiBattleId = ");
                    LIZ3.append(seiAppData.battleId);
                    C0NB.LIZIZ("disappear", X1D.LIZIZ(LIZ3));
                } else {
                    C75622Tm6.LJIIJ = false;
                    Room room2 = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
                    long j3 = B5G.LIZIZ().LJFF;
                    if (room2 != null && Long.valueOf(room2.getId()) != null) {
                        ((LinkBattleApi) Q7L.LIZIZ(LinkBattleApi.class)).getInfo(room2.getId(), j3, 0L, room2.getOwnerUserId(), 15).LJJL(T16.LIZ()).LJJJ(T16.LIZ()).LJJJLIIL(C75562Tl8.LJLIL, C28193B4r.LJLIL);
                    }
                }
            }
        }
        if (i == EnumC31946CgI.MULTI_ARCH.getType()) {
            new C75600Tlk().LJIJI(i, parseLong, B5G.LIZIZ().LJI(), this.LJLLJ);
        }
        long j4 = seiAppData.battleId;
        if (j4 > 0) {
            C76272Twa.LIZ.LJJ(j4, C76265TwT.LIZ.LIZIZ(), parseLong);
        }
        C75621Tm5.LJIIJ(parseLong);
        if (!this.LJLLJ || B5G.LIZIZ().LIZJ) {
            return;
        }
        this.LJLLJ = false;
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append("begin to request seiChannelId = ");
        LIZ4.append(parseLong);
        C0NB.LIZIZ("Identify", X1D.LIZIZ(LIZ4));
        C65814PsI.LIZ().getClass();
        T28.LIZLLL(((CoHostApi) C65814PsI.LIZJ(CoHostApi.class)).updateUserList(id, parseLong)).LJII(LiveCohostSeiIdentifyRequestDelayMsSetting.INSTANCE.getValue(), TimeUnit.MILLISECONDS).LJJII(new AfS8S0100100_13(parseLong, this, 9), new AfS5S0000100_13(parseLong, 4));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJJJJZI(EnumC75674Tmw enumC75674Tmw) {
        Room room;
        Creator creator;
        Integer num;
        ((C32537Cpp) this.dataChannel.gv0(C29616Bjo.class)).LIZ = enumC75674Tmw;
        EnumC75674Tmw enumC75674Tmw2 = (EnumC75674Tmw) this.dataChannel.kv0(C29616Bjo.class);
        if (enumC75674Tmw2 == null || !enumC75674Tmw2.isMultiCoHost()) {
            C0NB.LJIIIZ("LinkControlPresenter", "tryInitMultiCoHost, return by no permission");
            return;
        }
        if (C8E.LIZLLL().LIZLLL()) {
            C0NB.LJIIIZ("LinkControlPresenter", "tryInitMultiCoHost, return by isAttached");
            return;
        }
        C0NB.LJIIIZ("LinkControlPresenter", "tryInitMultiCoHost, attach");
        C8E.LIZLLL().LLIIL(C8E.LIZ().getTopActivity(), this.LJLJJI, this.dataChannel);
        if (this.LJLJJL && LiveCohostEnableMatchResumeSetting.INSTANCE.isEnableCoHostResume() && (room = this.LJLJJI) != null && (creator = room.creator) != null && (num = creator.roomContinue) != null && num.intValue() != 0) {
            C76271TwZ.LIZ.LJLILLLLZI();
            C65814PsI.LIZ().getClass();
            ((InterfaceC29205BdB) ((CoHostApi) C65814PsI.LIZJ(CoHostApi.class)).resume(this.LJLJJI.getId(), this.LJLJJI.getOwnerUserId()).LIZLLL(autoDisposeWithTransformer())).LIZJ(new C76143TuV(0), new AfS17S0001000_5(0, 13));
        }
        C8E.LIZLLL().LJJJZ(C75501Tk9.class, new AObjectS143S0100000_13(this, 7));
        C8E.LIZLLL().LJJJZ(C75683Tn5.class, new AObjectS140S0100000_5(this, 1));
        C8E.LIZLLL().LJJJZ(C75939TrD.class, new AObjectS140S0100000_5(this, 2));
        C8E.LIZLLL().LJJJZ(C75678Tn0.class, new AObjectS143S0100000_13(this, 8));
        C8E.LIZLLL().LJJJZ(C75681Tn3.class, new AObjectS89S0101000_13(0, this, 1));
        C8E.LIZLLL().LJJJZ(C75677Tmz.class, new AObjectS143S0100000_13(this, 9));
    }

    public void onEvent(C75514TkM c75514TkM) {
        T t = this.mView;
        if (t == 0) {
            return;
        }
        int i = c75514TkM.LIZ;
        if (i != 1) {
            if (i != 2) {
                return;
            }
            ((InterfaceC75495Tk3) t).wi();
            return;
        }
        ((InterfaceC75495Tk3) t).zf(LJLLL.longValue());
    }

    public void onEvent(C29423Bgh c29423Bgh) {
        T t = this.mView;
        if (t == 0) {
            return;
        }
        ((InterfaceC75495Tk3) t).Wm();
    }

    public C75492Tk0(Room room, boolean z, LiveMode liveMode) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("oneVn_");
        LIZ.append(C16880lQ.LJLLJ(C75492Tk0.class));
        this.LJLIL = X1D.LIZIZ(LIZ);
        this.LJLJLJ = new TX3(this);
        this.LJLJLLL = new TYS(this);
        this.LJLL = new C74758TVq(this);
        this.LJLLI = new C75493Tk1(this);
        this.LJLLILLLL = new C75496Tk4(this);
        this.LJLLJ = false;
        this.LJLJJI = room;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("roomId = ");
        LIZ2.append(room.getId());
        LIZ2.append("   OwnerUserId = ");
        LIZ2.append(room.getOwnerUserId());
        C0NB.LJIIIZ("LinkControlPresenter", X1D.LIZIZ(LIZ2));
        this.LJLJJL = z;
        this.LJLJJLL = liveMode;
        this.LJLILLLLZI = B5G.LIZIZ();
        C75559Tl5.LIZIZ.LIZLLL(this);
    }
}
