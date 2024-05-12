package X;

import Y.IDo0S413S0100000_13;
import android.content.Context;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ApplyData;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ApplyResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CancelApplyData;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CancelApplyResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CancelInviteData;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CancelInviteResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ChangeMaxPositionData;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ChangeMaxPositionResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CreateChannelData;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CreateChannelResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.DestroyChannelData;
import com.bytedance.android.livesdk.comp.api.linkcore.model.DestroyChannelResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.DirectJoinData;
import com.bytedance.android.livesdk.comp.api.linkcore.model.DirectJoinResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.DslLayout;
import com.bytedance.android.livesdk.comp.api.linkcore.model.InviteData;
import com.bytedance.android.livesdk.comp.api.linkcore.model.InviteResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.JoinChannelData;
import com.bytedance.android.livesdk.comp.api.linkcore.model.KickOutAllData;
import com.bytedance.android.livesdk.comp.api.linkcore.model.KickOutData;
import com.bytedance.android.livesdk.comp.api.linkcore.model.KickOutResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.Layout;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LayoutDSLConfig;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LeaveChannelData;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LeaveChannelResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LeaveGroupResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LiveRoomUser;
import com.bytedance.android.livesdk.comp.api.linkcore.model.MicPositionInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.OnLineMicInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.PermitApplyData;
import com.bytedance.android.livesdk.comp.api.linkcore.model.PermitApplyGroupResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.PermitResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.RechargeResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ReplyInviteData;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ReplyInviteGroupResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ReplyResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.RtcUserInfo;
import com.bytedance.android.livesdk.livesetting.linkmic.MtCoHostCrossRoomPushSDKSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MtCoHostLiveStudioAudienceSlideChangeBugFixSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestUseLinkmicAloggerSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LiveAbLabelSetting;
import com.bytedance.android.livesdk.model.message.linkcore.DSLConfig;
import com.bytedance.android.livesdk.sei.SeiAppData;
import com.bytedance.android.livesdk.sei.SeiDsl;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.o;
import webcast.data.multilive_biz.BizResumeParams;

/* loaded from: classes14.dex */
public final class U65 implements InterfaceC75441TjB {
    public final Context LJLIL;
    public final int LJLILLLLZI;
    public int LJLJI;
    public final Room LJLJJI;
    public final U66 LJLJJL;
    public final CopyOnWriteArraySet<U62> LJLJJLL;
    public volatile C75745To5 LJLJL;
    public final CopyOnWriteArrayList<U6Y> LJLJLJ;
    public C73546Sti LJLJLLL;
    public boolean LJLL;
    public final C62822Ol8 LJLLI;
    public final C62822Ol8 LJLLILLLL;
    public final C62822Ol8 LJLLJ;
    public final C62822Ol8 LJLLL;
    public final C62822Ol8 LJLLLL;
    public final C62822Ol8 LJLLLLLL;

    public final InterfaceC75011TcF LIZ() {
        return (InterfaceC75011TcF) this.LJLLI.getValue();
    }

    @Override // X.InterfaceC75441TjB
    public final int LIZIZ() {
        return this.LJLJJL.LIZIZ();
    }

    @Override // X.InterfaceC75441TjB
    public final TQU LIZLLL() {
        return (U7D) this.LJLLLL.getValue();
    }

    public final U8H LJFF() {
        return (U8H) this.LJLLJ.getValue();
    }

    public final U6R LJII() {
        return (U6R) this.LJLLL.getValue();
    }

    public final void LJIIJJI() {
        String str;
        String str2;
        String idStr = this.LJLJJI.getIdStr();
        o.LJIIIIZZ(idStr, "room.idStr");
        String linkMicId = this.LJLJJL.LLZL().getLinkMicId();
        String valueOf = String.valueOf(this.LJLJJL.LJJLI());
        if (LJFF().LJJIJL()) {
            str = "audience";
        } else if (this.LJLJJL.LLZL().isOwner()) {
            str = "anchor";
        } else {
            str = "guest";
        }
        int i = this.LJLILLLLZI;
        if (i != 2) {
            if (i != 4) {
                str2 = "";
            } else {
                str2 = "MULTI_LIVE";
            }
        } else {
            str2 = "MULTI_HOST";
        }
        C32014ChO.LJIIIIZZ(new C32016ChQ(idStr, linkMicId, valueOf, str, str2));
    }

    @Override // X.InterfaceC75441TjB
    public final InterfaceC76652U6m LJZL() {
        return this.LJLJJL.c();
    }

    @Override // X.InterfaceC75441TjB
    public final InterfaceC75973Trl LLIIJI() {
        return this.LJLJJL.LLZZ();
    }

    @Override // X.InterfaceC75441TjB
    public final boolean LLLLJI() {
        return this.LJLJJL.LLLLJI();
    }

    @Override // X.InterfaceC75441TjB
    public final boolean LLLLLILLIL() {
        return this.LJLJJL.LLLLLILLIL();
    }

    @Override // X.InterfaceC75441TjB
    public final RtcUserInfo LLLLLJIL() {
        return this.LJLJJL.LLZL();
    }

    @Override // X.InterfaceC75441TjB
    public final java.util.Set<Long> LLLLLJLJLL() {
        return this.LJLJJL.LLLLLJLJLL();
    }

    @Override // X.InterfaceC75441TjB
    public final java.util.Set<Long> LLLLLL() {
        return this.LJLJJL.LLLLLL();
    }

    @Override // X.InterfaceC75441TjB
    public final String LLLLLLIL() {
        return String.valueOf(this.LJLJJL.LJJLI());
    }

    @Override // X.InterfaceC75441TjB
    public final boolean LLLLZLLIL() {
        return this.LJLJJL.LLLLZLLIL();
    }

    @Override // X.InterfaceC75441TjB
    public final boolean isNeedPublishFrame() {
        return this.LJLJJL.LLLLZLL().LJJIII();
    }

    @Override // X.InterfaceC75441TjB
    public final U8H LJJZZI() {
        return LJFF();
    }

    @Override // X.InterfaceC75441TjB
    public final InterfaceC75011TcF LJZI() {
        return LIZ();
    }

    @Override // X.InterfaceC75441TjB
    public final java.util.Map<String, String> LLFZ() {
        java.util.Map<String, String> sceneMap;
        DslLayout dslLayout = LJFF().LJIILIIL;
        if (dslLayout == null || (sceneMap = dslLayout.getSceneMap()) == null) {
            return C113554cx.LJJJLIIL();
        }
        return sceneMap;
    }

    @Override // X.InterfaceC75441TjB
    public final InterfaceC74695TTf LLIIJLIL() {
        return LJII();
    }

    @Override // X.InterfaceC75441TjB
    public final EnumC31946CgI LJJJJ() {
        return EnumC31946CgI.CROSS_ROOM_ARCH;
    }

    @Override // X.InterfaceC75441TjB
    public final int LJLJJLL() {
        return this.LJLJI;
    }

    @Override // X.InterfaceC75441TjB
    public final EnumC75780Toe LJLJLLL() {
        return EnumC75780Toe.LiveLinkMicSession;
    }

    @Override // X.InterfaceC75441TjB
    public final int scene() {
        return this.LJLILLLLZI;
    }

    public static final String LJIIIIZZ(int i) {
        if (MultiGuestUseLinkmicAloggerSetting.INSTANCE.isEnable()) {
            StackTraceElement LJ = C32014ChO.LJ();
            StringBuilder LIZ = X1D.LIZ();
            return C77800Ug8.LIZLLL(U44.LINKER, LIZ, "_LiveLinkMicSession_", LJ, LIZ);
        }
        StringBuilder LIZ2 = X1D.LIZ();
        return C17M.LIZ(U44.LINKER, LIZ2, "_LiveLinkMicSession_", i, LIZ2);
    }

    public final LayoutDSLConfig LJ(LayoutDSLConfig layoutDSLConfig) {
        String str;
        String str2;
        Integer num;
        InterfaceC65784Pro<String> interfaceC65784Pro;
        int i = LJFF().LJIIL.LJLIL;
        U8H LJFF = LJFF();
        N39 LLZZZZ = this.LJLJJL.LLZZZZ();
        if (LLZZZZ == null || (interfaceC65784Pro = LLZZZZ.LIZIZ) == null || (str = interfaceC65784Pro.invoke()) == null) {
            str = "";
        }
        Layout v1 = LJFF.v1(str);
        String str3 = null;
        if (v1 != null) {
            str2 = v1.getLayoutId();
        } else {
            str2 = null;
        }
        if (str2 != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("getLayoutDSLConfigWhenHandleModeratorMessage use anchorLocal, version=");
            LIZ.append(i);
            LIZ.append(", layoutId=");
            LIZ.append(str2);
            U4R.LIZLLL("LiveLinkMicSession", X1D.LIZIZ(LIZ));
            return new LayoutDSLConfig(i, str2);
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("getLayoutDSLConfigWhenHandleModeratorMessage use message, version=");
        if (layoutDSLConfig != null) {
            num = Integer.valueOf(layoutDSLConfig.getSceneVersion());
        } else {
            num = null;
        }
        LIZ2.append(num);
        LIZ2.append(", layoutId=");
        if (layoutDSLConfig != null) {
            str3 = layoutDSLConfig.getLayoutId();
        }
        LIZ2.append(str3);
        U4R.LIZLLL("LiveLinkMicSession", X1D.LIZIZ(LIZ2));
        return layoutDSLConfig;
    }

    @Override // X.InterfaceC75441TjB
    public final void LJI(String str) {
        C73546Sti c73546Sti = this.LJLJLLL;
        if (c73546Sti != null) {
            c73546Sti.dispose();
        }
        this.LJLJLLL = null;
        if (MtCoHostLiveStudioAudienceSlideChangeBugFixSetting.isEnable()) {
            if (this.LJLJJI.getOwnerUserId() == ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()) {
                LJFF().A9(true);
            } else {
                if (((HashSet) C74838TYs.LJ().LJJJ).contains(Long.valueOf(this.LJLJJI.getId()))) {
                    LJFF().A9(false);
                } else {
                    LJFF().A9(true);
                }
            }
            ((HashSet) C74838TYs.LJ().LJJJ).remove(Long.valueOf(this.LJLJJI.getId()));
        } else {
            LJFF().A9(true);
        }
        this.LJLJJL.reset();
    }

    @Override // X.InterfaceC75441TjB, X.U9F
    public final HashSet<String> LJIILLIIL(String str) {
        return ((U9F) this.LJLLLLLL.getValue()).LJIILLIIL(str);
    }

    @Override // X.InterfaceC75441TjB
    public final void LJJJI(InterfaceC75414Tik<RechargeResult> interfaceC75414Tik) {
        if (MtCoHostCrossRoomPushSDKSetting.isEnable() && this.LJLILLLLZI == 2) {
            this.LJLJJL.LLLZLL("recharge_positive", new U6N(interfaceC75414Tik));
        }
    }

    @Override // X.InterfaceC75441TjB
    public final void LJJJIL(U62 listener) {
        o.LJIIIZ(listener, "listener");
        if (this.LJLJJLL.contains(listener)) {
            return;
        }
        this.LJLJJLL.add(listener);
    }

    @Override // X.InterfaceC75441TjB
    public final void LJJJJL(String layoutId) {
        o.LJIIIZ(layoutId, "layoutId");
        if (layoutId.length() == 0) {
            return;
        }
        String LJIIIIZZ = LJIIIIZZ(1940);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("updateDslLayoutById layoutId:");
        LIZ.append(layoutId);
        C32014ChO.LJFF(LJIIIIZZ, X1D.LIZIZ(LIZ));
        U8H LJFF = LJFF();
        LJFF.getClass();
        C76732zl c76732zl = new C76732zl();
        int i = LJFF.LJIIL.LJLIL;
        c76732zl.element = i;
        LJFF.LIZ.LJFF.LJIIZILJ(i, layoutId, new U6F(LJFF, c76732zl));
        this.LJLJI = c76732zl.element;
        LIZ().LJJI(this.LJLILLLLZI, this.LJLJI, new U6T(this));
    }

    @Override // X.InterfaceC75441TjB
    public final void LJJLI(String source) {
        C73514StC c73514StC;
        o.LJIIIZ(source, "source");
        if (MtCoHostCrossRoomPushSDKSetting.isEnable()) {
            C73546Sti c73546Sti = this.LJLJLLL;
            if (c73546Sti != null) {
                c73546Sti.dispose();
            }
            this.LJLJLLL = null;
        }
        this.LJLJJL.LJIIJJI(source, true);
        if (this.LJLILLLLZI == 4 && this.LJLJJI.getOwnerUserId() == ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId() && LiveAbLabelSetting.INSTANCE.getBooleanValue("is_enable_linkmic_enter_and_leave_room_opt") && (c73514StC = ((C76651U6l) this.LJLLILLLL.getValue()).LJ) != null) {
            c73514StC.dispose();
        }
    }

    @Override // X.InterfaceC75441TjB
    public final void LJJZ(U6Y listener) {
        o.LJIIIZ(listener, "listener");
        if (MtCoHostCrossRoomPushSDKSetting.isEnable() && this.LJLILLLLZI == 2) {
            this.LJLJLJ.add(listener);
        }
    }

    @Override // X.InterfaceC75441TjB
    public final void LJL(int i) {
        if (i < 0) {
            return;
        }
        String LJIIIIZZ = LJIIIIZZ(1940);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("updateDslLayoutByVersion version:");
        LIZ.append(i);
        C32014ChO.LJFF(LJIIIIZZ, X1D.LIZIZ(LIZ));
        this.LJLJI = i;
        LIZ().LJJI(this.LJLILLLLZI, i, new U6U(this));
    }

    @Override // X.InterfaceC75441TjB
    public final void LJLL(TTS tts) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("joinChannel start param=");
        LIZ.append(tts);
        U4R.LIZLLL("LiveLinkMicSession", X1D.LIZIZ(LIZ));
        U66 u66 = this.LJLJJL;
        JoinChannelData.Builder builder = new JoinChannelData.Builder();
        builder.setBizJoinChannelParams(tts.LIZ);
        u66.a(builder.build(), new U6B(this));
    }

    @Override // X.InterfaceC75441TjB
    public final void LJLZ(String str) {
        int i;
        UC7.LJ("updateLayoutParam start layoutName=", str, "LiveLinkMicSession");
        if (str != null) {
            C74637TQz c74637TQz = LJFF().LJIIL;
            if (c74637TQz != null) {
                i = c74637TQz.LJLIL;
            } else {
                i = 0;
            }
            LJFF().LJJI().LJ.invoke(new LayoutDSLConfig(i, str));
        }
    }

    @Override // X.InterfaceC75441TjB
    public final void LLIILII(U62 listener) {
        o.LJIIIZ(listener, "listener");
        this.LJLJJLL.remove(listener);
    }

    @Override // X.InterfaceC75441TjB
    public final void LLLLL(U6Y listener) {
        o.LJIIIZ(listener, "listener");
        if (MtCoHostCrossRoomPushSDKSetting.isEnable() && this.LJLILLLLZI == 2) {
            this.LJLJLJ.remove(listener);
        }
    }

    @Override // X.InterfaceC75441TjB
    public final void LLLLLIL(N39 sessionBusinessConfig) {
        o.LJIIIZ(sessionBusinessConfig, "sessionBusinessConfig");
        this.LJLJJL.LLLLLIL(sessionBusinessConfig);
    }

    @Override // X.InterfaceC75441TjB
    public final void LLLLLLJ(long j) {
        this.LJLJJL.LLLLLLJ(j);
    }

    @Override // X.InterfaceC75441TjB
    public final void LLLLLLL(InterfaceC65784Pro<Boolean> autoJoin) {
        o.LJIIIZ(autoJoin, "autoJoin");
        this.LJLJJL.LLLLLLL(autoJoin);
    }

    @Override // X.InterfaceC75441TjB
    public final void LLLLLLLLLL(AqS163S0100000_13 aqS163S0100000_13) {
        this.LJLJJL.LLLLLLLLLL(aqS163S0100000_13);
    }

    @Override // X.InterfaceC75441TjB
    public final void LIZJ(C75952TrQ c75952TrQ, InterfaceC75414Tik<ReplyInviteGroupResult> interfaceC75414Tik) {
        this.LJLJJL.LLLZL(c75952TrQ, new U4V(c75952TrQ, this, interfaceC75414Tik));
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0113, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIZ(X.C28272B7s r8, com.bytedance.android.livesdk.sei.SeiAppData r9) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.U65.LJIIIZ(X.B7s, com.bytedance.android.livesdk.sei.SeiAppData):void");
    }

    @Override // X.InterfaceC75441TjB
    public final void LJIIJ(C75951TrP c75951TrP, InterfaceC75414Tik<PermitApplyGroupResult> interfaceC75414Tik) {
        this.LJLJJL.LLZIL(c75951TrP, new U4U(c75951TrP, this, interfaceC75414Tik));
    }

    @Override // X.InterfaceC75441TjB
    public final void LJJIIJZLJL(C76606U4s c76606U4s, InterfaceC75414Tik<ChangeMaxPositionResult> interfaceC75414Tik) {
        U66 u66 = this.LJLJJL;
        ChangeMaxPositionData.Builder builder = new ChangeMaxPositionData.Builder();
        builder.setMaxPosition(c76606U4s.LIZ);
        builder.setCustomData(c76606U4s.LIZLLL);
        builder.setLayoutId(c76606U4s.LIZIZ);
        builder.setSceneVersion(LJFF().LJIIL.LJLIL);
        builder.setBizChangeLayoutParams(c76606U4s.LIZJ);
        u66.LLZZLLIL(builder.build(), new C76601U4n(interfaceC75414Tik, this));
    }

    @Override // X.InterfaceC75441TjB
    public final void LJJIJ(C62819Ol5 c62819Ol5, IDo0S413S0100000_13 iDo0S413S0100000_13) {
        this.LJLJJL.LLZ(new KickOutAllData(null, 0, 3, null), new C76596U4i(iDo0S413S0100000_13, this));
    }

    @Override // X.InterfaceC75441TjB
    public final void LJJIJLIJ(C28272B7s c28272B7s, InterfaceC75804Tp2 interfaceC75804Tp2) {
        SeiAppData seiAppData = null;
        if (MtCoHostCrossRoomPushSDKSetting.isEnable() && this.LJLILLLLZI == 2) {
            if (interfaceC75804Tp2 instanceof SeiAppData) {
                seiAppData = (SeiAppData) interfaceC75804Tp2;
            }
            LJIIIZ(c28272B7s, seiAppData);
            return;
        }
        if (interfaceC75804Tp2 != null && (interfaceC75804Tp2 instanceof SeiAppData)) {
            LJIIIZ(c28272B7s, (SeiAppData) interfaceC75804Tp2);
            return;
        }
        if (c28272B7s == null || interfaceC75804Tp2 == null) {
            return;
        }
        this.LJLJJL.LLZZ().LJIIJ(interfaceC75804Tp2);
        this.LJLJJL.c().LJ(interfaceC75804Tp2);
        LJFF().LJJJJIZL.LIZIZ(c28272B7s, interfaceC75804Tp2, false);
        Iterator<U62> it = this.LJLJJLL.iterator();
        while (it.hasNext()) {
            it.next().LLIILII(c28272B7s);
        }
        SeiDsl LJI = interfaceC75804Tp2.LJI();
        if (LJI == null) {
            return;
        }
        U66 u66 = this.LJLJJL;
        DSLConfig dSLConfig = new DSLConfig(0, null, 3, null);
        dSLConfig.sceneVersion = LJI.version;
        dSLConfig.layoutId = LJI.layoutId;
        u66.LLLZ(dSLConfig);
    }

    @Override // X.InterfaceC75441TjB
    public final void LJJJJIZL(C76002TsE c76002TsE, InterfaceC75414Tik<CancelApplyResult> interfaceC75414Tik) {
        U66 u66 = this.LJLJJL;
        CancelApplyData.Builder builder = new CancelApplyData.Builder();
        builder.setBizCancelApplyParams(c76002TsE.LIZLLL);
        u66.h(builder.build(), new C76603U4p(interfaceC75414Tik, this));
    }

    @Override // X.InterfaceC75441TjB
    public final void LJJJJZI(C76689U7x c76689U7x, C75891TqR c75891TqR) {
        this.LJLJJL.f(c76689U7x, new U4Z(c75891TqR));
    }

    @Override // X.InterfaceC75441TjB
    public final void LJJJLL(C75186Tf4 c75186Tf4, InterfaceC75414Tik<KickOutResult> interfaceC75414Tik) {
        U66 u66 = this.LJLJJL;
        LiveRoomUser.Builder builder = new LiveRoomUser.Builder();
        builder.setRoomId(c75186Tf4.LJLIL);
        builder.setUserId(c75186Tf4.LJLILLLLZI);
        builder.setLinkMicId(c75186Tf4.LJLJI);
        KickOutData.Builder builder2 = new KickOutData.Builder(builder.build());
        builder2.setKickOutReason(c75186Tf4.LJLJJI);
        u66.LLLLZIL(builder2.build(), new C76602U4o(interfaceC75414Tik, this));
    }

    @Override // X.InterfaceC75441TjB
    public final void LJJLIIIJ(C76012TsO c76012TsO, InterfaceC75414Tik<LeaveChannelResult> interfaceC75414Tik) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("leaveChannel start param=");
        LIZ.append(c76012TsO);
        U4R.LIZLLL("LiveLinkMicSession", X1D.LIZIZ(LIZ));
        U66 u66 = this.LJLJJL;
        LeaveChannelData.Builder builder = new LeaveChannelData.Builder();
        builder.setBizLeaveParams(c76012TsO.LIZJ);
        builder.setLeaveSource(c76012TsO.LIZ);
        builder.setLeaveReason(c76012TsO.LIZLLL);
        u66.LLLZZ(builder.build(), new C76598U4k(interfaceC75414Tik, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [T, com.bytedance.android.livesdk.comp.api.linkcore.model.LayoutDSLConfig] */
    @Override // X.InterfaceC75441TjB
    public final void LJJLIIIJJIZ(C76180Tv6 c76180Tv6, InterfaceC75414Tik<InviteResult> interfaceC75414Tik) {
        int i;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("invite start param=");
        LIZ.append(c76180Tv6);
        U4R.LIZLLL("LiveLinkMicSession", X1D.LIZIZ(LIZ));
        C68322mC c68322mC = new C68322mC();
        String str = c76180Tv6.LIZJ;
        if (str != null) {
            C74637TQz c74637TQz = LJFF().LJIIL;
            if (c74637TQz != null) {
                i = c74637TQz.LJLIL;
            } else {
                i = 0;
            }
            c68322mC.element = new LayoutDSLConfig(i, str);
        }
        U66 u66 = this.LJLJJL;
        LiveRoomUser.Builder builder = new LiveRoomUser.Builder();
        builder.setRoomId(c76180Tv6.LIZ);
        builder.setUserId(c76180Tv6.LIZIZ);
        InviteData.Builder builder2 = new InviteData.Builder(builder.build());
        builder2.setChannelId(this.LJLJJL.LJJLI());
        T t = c68322mC.element;
        if (t != 0) {
            builder2.setLayoutDSLConfig((LayoutDSLConfig) t);
        }
        builder2.setExpireTimeInSeconds(c76180Tv6.LJFF);
        builder2.setOnLineMicInfo(new OnLineMicInfo(1, new MicPositionInfo(c76180Tv6.LIZLLL, c76180Tv6.LJ, 0, 0L, 12, null)));
        builder2.setSource(c76180Tv6.LJI);
        u66.LLLLLLLZIL(builder2.build(), new C76638U5y(c68322mC, interfaceC75414Tik, this), C34423Df9.LJLIL);
    }

    @Override // X.InterfaceC75441TjB
    public final void LJJLIIIJL(C75911Tql c75911Tql, InterfaceC75414Tik<ReplyResult> interfaceC75414Tik) {
        U66 u66 = this.LJLJJL;
        LiveRoomUser.Builder builder = new LiveRoomUser.Builder();
        builder.setRoomId(c75911Tql.LIZ);
        builder.setUserId(c75911Tql.LIZIZ);
        ReplyInviteData.Builder builder2 = new ReplyInviteData.Builder(builder.build());
        builder2.setReplyStatus(c75911Tql.LIZJ);
        builder2.setBizReplyParams(c75911Tql.LIZLLL);
        builder2.setInviteOperatorUid(c75911Tql.LJ);
        u66.LLLLZI(builder2.build(), new C76639U5z(c75911Tql, this, interfaceC75414Tik));
    }

    @Override // X.InterfaceC75441TjB
    public final void LJJLIIIJLLLLLLLZ(TZS tzs, InterfaceC75414Tik<DestroyChannelResult> interfaceC75414Tik) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("destroyChannel start param=");
        LIZ.append(tzs);
        U4R.LIZLLL("LiveLinkMicSession", X1D.LIZIZ(LIZ));
        U66 u66 = this.LJLJJL;
        DestroyChannelData.Builder builder = new DestroyChannelData.Builder();
        builder.setFinishReason(tzs.LJLIL);
        u66.LLLLLLZZ(builder.build(), new C76605U4r(interfaceC75414Tik, this));
    }

    @Override // X.InterfaceC75441TjB
    public final void LJJLIIJ(C75918Tqs c75918Tqs, C75900Tqa c75900Tqa) {
        this.LJLJJL.m(c75918Tqs, new U4W(c75900Tqa));
    }

    @Override // X.InterfaceC75441TjB
    public final void LJJLIL(C76690U7y c76690U7y, C75890TqQ c75890TqQ) {
        this.LJLJJL.LLZLI(c76690U7y, new C76588U4a(c75890TqQ));
    }

    @Override // X.InterfaceC75441TjB
    public final void LJLI(C76180Tv6 c76180Tv6, C74847TZb c74847TZb) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("moderatorInvite start param=");
        LIZ.append(c76180Tv6);
        U4R.LIZLLL("LiveLinkMicSession", X1D.LIZIZ(LIZ));
        U66 u66 = this.LJLJJL;
        LiveRoomUser.Builder builder = new LiveRoomUser.Builder();
        builder.setRoomId(c76180Tv6.LIZ);
        builder.setUserId(c76180Tv6.LIZIZ);
        InviteData.Builder builder2 = new InviteData.Builder(builder.build());
        Layout x1 = LJFF().x1();
        if (x1 != null) {
            builder2.setLayoutDSLConfig(new LayoutDSLConfig(x1.getVersion(), x1.getLayoutId()));
        }
        builder2.setChannelId(this.LJLJJL.LJJLI());
        builder2.setExpireTimeInSeconds(c76180Tv6.LJFF);
        builder2.setOnLineMicInfo(new OnLineMicInfo(1, new MicPositionInfo(c76180Tv6.LIZLLL, c76180Tv6.LJ, 0, 0L, 12, null)));
        builder2.setSource(c76180Tv6.LJI);
        u66.LLLLZLLLI(builder2.build(), new C76595U4h(c74847TZb, this), C34424DfA.LJLIL);
    }

    @Override // X.InterfaceC75441TjB
    public final void LJLIIIL(C75993Ts5 c75993Ts5, TZZ tzz) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("moderatorPermitApply start param=");
        LIZ.append(c75993Ts5);
        U4R.LIZLLL("LiveLinkMicSession", X1D.LIZIZ(LIZ));
        U66 u66 = this.LJLJJL;
        LiveRoomUser.Builder builder = new LiveRoomUser.Builder();
        builder.setRoomId(c75993Ts5.LIZ);
        builder.setUserId(c75993Ts5.LIZIZ);
        builder.setLinkMicId(c75993Ts5.LIZLLL);
        PermitApplyData.Builder builder2 = new PermitApplyData.Builder(builder.build());
        Layout x1 = LJFF().x1();
        if (x1 != null) {
            builder2.setLayoutDSLConfig(new LayoutDSLConfig(x1.getVersion(), x1.getLayoutId()));
        }
        builder2.setPermitStatus(c75993Ts5.LJ);
        builder2.setBizPermitParams(c75993Ts5.LJFF);
        u66.LLLLLZIL(builder2.build(), new C76600U4m(tzz, this));
    }

    @Override // X.InterfaceC75441TjB
    public final void LJLJJI(C76684U7s c76684U7s, InterfaceC75414Tik<LeaveGroupResult> interfaceC75414Tik) {
        this.LJLJJL.LLZZJLIL(c76684U7s, null, 0L, false, new U4Y((C75912Tqm) interfaceC75414Tik));
    }

    @Override // X.InterfaceC75441TjB
    public final void LJLJLJ(C76179Tv5 c76179Tv5, InterfaceC75414Tik<ApplyResult> interfaceC75414Tik) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("apply start param=");
        LIZ.append(c76179Tv5);
        U4R.LIZLLL("LiveLinkMicSession", X1D.LIZIZ(LIZ));
        U66 u66 = this.LJLJJL;
        ApplyData.Builder builder = new ApplyData.Builder();
        builder.setChannelId(this.LJLJJL.LJJLI());
        builder.setOnLineMicInfo(new OnLineMicInfo(1, new MicPositionInfo(c76179Tv5.LIZJ, c76179Tv5.LIZLLL, 0, 0L, 12, null)));
        builder.setBizApplyParams(c76179Tv5.LJFF);
        u66.LLLZLZ(builder.build(), new C76597U4j(interfaceC75414Tik, this), C34422Df8.LJLIL);
    }

    @Override // X.InterfaceC75441TjB
    public final void LJZ(C75186Tf4 c75186Tf4, C74848TZc c74848TZc) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("moderatorKickOut start param=");
        LIZ.append(c75186Tf4);
        U4R.LIZLLL("LiveLinkMicSession", X1D.LIZIZ(LIZ));
        U66 u66 = this.LJLJJL;
        LiveRoomUser.Builder builder = new LiveRoomUser.Builder();
        builder.setRoomId(c75186Tf4.LJLIL);
        builder.setUserId(c75186Tf4.LJLILLLLZI);
        builder.setLinkMicId(c75186Tf4.LJLJI);
        KickOutData.Builder builder2 = new KickOutData.Builder(builder.build());
        builder2.setKickOutReason(c75186Tf4.LJLJJI);
        u66.l(builder2.build(), new C76599U4l(c74848TZc, this));
    }

    @Override // X.InterfaceC75441TjB
    public final void LLIIIJ(C76001TsD c76001TsD, InterfaceC75414Tik<CancelInviteResult> interfaceC75414Tik) {
        U66 u66 = this.LJLJJL;
        LiveRoomUser.Builder builder = new LiveRoomUser.Builder();
        builder.setRoomId(c76001TsD.LIZ);
        builder.setUserId(c76001TsD.LIZIZ);
        builder.setLinkMicId(c76001TsD.LIZJ);
        u66.LLLLZ(new CancelInviteData.Builder(builder.build(), c76001TsD.LJFF).build(), new C76604U4q(interfaceC75414Tik, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [T, com.bytedance.android.livesdk.comp.api.linkcore.model.LayoutDSLConfig] */
    @Override // X.InterfaceC75441TjB
    public final void LLIIIZ(C75993Ts5 c75993Ts5, InterfaceC75414Tik<PermitResult> interfaceC75414Tik) {
        int i;
        C68322mC c68322mC = new C68322mC();
        String str = c75993Ts5.LIZJ;
        if (str != null) {
            C74637TQz c74637TQz = LJFF().LJIIL;
            if (c74637TQz != null) {
                i = c74637TQz.LJLIL;
            } else {
                i = 0;
            }
            c68322mC.element = new LayoutDSLConfig(i, str);
        }
        U66 u66 = this.LJLJJL;
        LiveRoomUser.Builder builder = new LiveRoomUser.Builder();
        builder.setRoomId(c75993Ts5.LIZ);
        builder.setUserId(c75993Ts5.LIZIZ);
        builder.setLinkMicId(c75993Ts5.LIZLLL);
        PermitApplyData.Builder builder2 = new PermitApplyData.Builder(builder.build());
        T t = c68322mC.element;
        if (t != 0) {
            builder2.setLayoutDSLConfig((LayoutDSLConfig) t);
        }
        builder2.setPermitStatus(c75993Ts5.LJ);
        builder2.setBizPermitParams(c75993Ts5.LJFF);
        u66.LLLZIL(builder2.build(), new U68(this, c68322mC, c75993Ts5, interfaceC75414Tik));
    }

    @Override // X.InterfaceC75441TjB
    public final void LLILZ(C35749E1h c35749E1h, InterfaceC75414Tik<DirectJoinResult> interfaceC75414Tik) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("joinDirect start param=");
        LIZ.append(c35749E1h);
        U4R.LIZLLL("LiveLinkMicSession", X1D.LIZIZ(LIZ));
        U66 u66 = this.LJLJJL;
        LiveRoomUser.Builder builder = new LiveRoomUser.Builder();
        builder.setRoomId(this.LJLJJI.getId());
        builder.setUserId(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId());
        DirectJoinData.Builder builder2 = new DirectJoinData.Builder(builder.build());
        builder2.setChannelId(this.LJLJJL.LJJLI());
        builder2.setBizJoinDirectParams(c35749E1h.LIZ);
        u66.LLLLLZL(builder2.build(), new C76637U5x(c35749E1h, this, interfaceC75414Tik));
    }

    @Override // X.InterfaceC75441TjB
    public final void LLJI(C75919Tqt c75919Tqt, C75901Tqb c75901Tqb) {
        this.LJLJJL.e(c75919Tqt, new U4X(c75901Tqb));
    }

    @Override // X.InterfaceC75441TjB
    public final void LLILL(C76611U4x c76611U4x, InterfaceC75414Tik<CreateChannelResult> interfaceC75414Tik, BizResumeParams bizResumeParams) {
        U4R.LIZLLL("LiveLinkMicSession", "createChannel start");
        U66 u66 = this.LJLJJL;
        CreateChannelData.Builder builder = new CreateChannelData.Builder();
        builder.setMaxPosition(c76611U4x.LIZ);
        builder.setLayoutId(c76611U4x.LIZIZ);
        builder.setBizCreateChannelParams(c76611U4x.LIZJ);
        builder.setLiveRoomMode(c76611U4x.LIZLLL);
        u66.j(builder.build(), new U69(interfaceC75414Tik, this), bizResumeParams);
    }

    public U65(Context context, int i, int i2, Room room, U66 linker) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(room, "room");
        o.LJIIIZ(linker, "linker");
        this.LJLIL = context;
        this.LJLILLLLZI = i;
        this.LJLJI = i2;
        this.LJLJJI = room;
        this.LJLJJL = linker;
        this.LJLJJLL = new CopyOnWriteArraySet<>();
        this.LJLJLJ = new CopyOnWriteArrayList<>();
        this.LJLLI = C221108m2.LIZIZ(U6W.LJLIL);
        this.LJLLILLLL = C221108m2.LIZIZ(new AqS163S0100000_13(this, 449));
        this.LJLLJ = C221108m2.LIZIZ(new AqS163S0100000_13(this, 447));
        this.LJLLL = C221108m2.LIZIZ(new AqS163S0100000_13(this, 451));
        this.LJLLLL = C221108m2.LIZIZ(new AqS163S0100000_13(this, 450));
        C62822Ol8 LIZIZ = C221108m2.LIZIZ(new AqS163S0100000_13(this, 445));
        C62822Ol8 LIZIZ2 = C221108m2.LIZIZ(new AqS163S0100000_13(this, 446));
        this.LJLLLLLL = LIZIZ2;
        C62822Ol8 LIZIZ3 = C221108m2.LIZIZ(new AqS163S0100000_13(this, 448));
        U6X u6x = new U6X(this);
        linker.LLLLLZ((InterfaceC76622U5i) LIZIZ.getValue());
        linker.LLZZ().LJJIJL((U87) LIZIZ3.getValue());
        linker.LLLLZLL().LJFF = (U9F) LIZIZ2.getValue();
        linker.LLLLZLL().LJIJJ("LiveLinkMicSession init");
        linker.n(new AqS163S0100000_13(this, 444));
        if (MtCoHostCrossRoomPushSDKSetting.isEnable() && i == 2) {
            linker.LLLZZIL(u6x);
        }
        LJFF().LJJLIIIJLJLI(linker.LJJLI());
        U8K.LJ = room.getIdStr();
        U8K.LJI = 4;
        LiveMode streamType = room.getStreamType();
        o.LJIIIIZZ(streamType, "room.streamType");
        U8K.LJFF = C28509BGv.LIZ(streamType);
        if (MtCoHostCrossRoomPushSDKSetting.isEnable()) {
            U8K.LJI = i;
        } else {
            U8K.LJI = 4;
        }
        LJIIJJI();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003e, code lost:
    
        if (r9 == null) goto L13;
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public U65(android.content.Context r11, int r12, int r13, com.bytedance.android.livesdkapi.depend.model.live.Room r14, java.lang.String r15, com.bytedance.android.livesdk.comp.api.linkcore.ILinkCoreService r16) {
        /*
            r10 = this;
            java.lang.String r0 = "context"
            r5 = r11
            kotlin.jvm.internal.o.LJIIIZ(r5, r0)
            java.lang.String r0 = "room"
            r8 = r14
            kotlin.jvm.internal.o.LJIIIZ(r8, r0)
            java.lang.String r0 = "linkCoreService"
            r4 = r16
            kotlin.jvm.internal.o.LJIIIZ(r4, r0)
            r6 = r12
            if (r15 == 0) goto L51
            java.util.List r0 = r4.vd()
            r3 = 0
            if (r0 == 0) goto L40
            java.util.Iterator r2 = r0.iterator()
        L21:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L4f
            java.lang.Object r9 = r2.next()
            r0 = r9
            X.U66 r0 = (X.U66) r0
            long r0 = r0.LJJLI()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            boolean r0 = kotlin.jvm.internal.o.LJ(r0, r15)
            if (r0 == 0) goto L21
        L3c:
            X.U66 r9 = (X.U66) r9
            if (r9 != 0) goto L49
        L40:
            X.U6D r9 = r4.ZH(r6)
            if (r9 == 0) goto L51
            r9.g(r15)
        L49:
            r4 = r10
            r7 = r13
            r4.<init>(r5, r6, r7, r8, r9)
            return
        L4f:
            r9 = r3
            goto L3c
        L51:
            X.U6D r9 = r4.ZH(r6)
            kotlin.jvm.internal.o.LJI(r9)
            goto L49
        */
        throw new UnsupportedOperationException("Method not decompiled: X.U65.<init>(android.content.Context, int, int, com.bytedance.android.livesdkapi.depend.model.live.Room, java.lang.String, com.bytedance.android.livesdk.comp.api.linkcore.ILinkCoreService):void");
    }
}
