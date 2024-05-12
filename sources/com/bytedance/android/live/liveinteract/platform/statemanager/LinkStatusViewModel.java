package com.bytedance.android.live.liveinteract.platform.statemanager;

import X.C214188as;
import X.C2K0;
import X.C2L4;
import X.C30725C4b;
import X.C30922CBq;
import X.C33Q;
import X.C56412MCa;
import X.C75812TpA;
import X.C75813TpB;
import X.C75814TpC;
import X.C75815TpD;
import X.C75816TpE;
import X.C75819TpH;
import X.C76800UCe;
import X.C76965UIn;
import X.C77117UOj;
import X.C78404Ups;
import X.InterfaceC55102Lju;
import X.InterfaceC55235Lm3;
import X.InterfaceC75817TpF;
import X.InterfaceC75826TpO;
import X.InterfaceC88472Yns;
import X.TBT;
import X.UC0;
import X.X1D;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.assem.scope.LinkMicScope;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.sharedbg.common.ISharedBgAbility;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.sharedbg.guest.MultiGuestSharedBgGuestViewModel;
import com.bytedance.android.live.liveinteract.platform.core.message.LinkMessageCenter;
import com.bytedance.android.live.liveinteract.platform.statemanager.iablility.DebugStateAbility;
import com.bytedance.android.live.liveinteract.platform.statemanager.iablility.ILinkStateAbility;
import com.bytedance.android.live.liveinteract.platform.statemanager.iablility.ISessionAbility;
import com.bytedance.android.live.liveinteract.platform.statemanager.iablility.UserState;
import com.bytedance.android.livesdk.comp.api.linkcore.model.RtcUserInfo;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicStateSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestV3GuestMonitoringTipsSetting;
import com.bytedance.android.livesdk.livesetting.wallet.LiveWalletRechargeExchangeStrengthen;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.AqS144S0200000_13;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.AqS2S0011000_13;
import kotlin.jvm.internal.AqS37S0001000_13;
import kotlin.jvm.internal.AqS54S1200000_13;
import kotlin.jvm.internal.AqS9S0111000_13;
import kotlin.jvm.internal.o;
import tikcast.linkmic.common.LayoutState;
import tikcast.linkmic.controller.ChangeStateReq;

/* loaded from: classes14.dex */
public final class LinkStatusViewModel extends AssemViewModel implements ILinkStateAbility, DebugStateAbility, InterfaceC75817TpF, InterfaceC55102Lju, C2L4 {
    public final String LJLIL;
    public final C214188as LJLILLLLZI;
    public final C75813TpB LJLJI;
    public final C75812TpA LJLJJI;
    public ISessionAbility LJLJJL;
    public final AtomicLong LJLJJLL;

    public static String nv0(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 6 ? "unknown" : "network" : "video" : "audio" : LiveWalletRechargeExchangeStrengthen.DEFAULT : "layout";
    }

    @Override // X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        if (str.hashCode() != 293667815) {
            return null;
        }
        return this;
    }

    @Override // X.InterfaceC75817TpF
    public final RtcUserInfo LLLLLJIL() {
        ISessionAbility iSessionAbility = this.LJLJJL;
        if (iSessionAbility != null) {
            return iSessionAbility.LLLLLJIL();
        }
        return null;
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C33Q defaultState() {
        return new C75814TpC(0L, (LayoutState) null, (List) null, (String) null, 31);
    }

    @Override // X.C2L4
    public final List<Class<Object>> getScopeDefine() {
        return C76965UIn.LIZ(LinkMicScope.class);
    }

    @Override // X.InterfaceC75817TpF
    public final void hT() {
        setStateImmediate(C75819TpH.LJLIL);
    }

    @Override // X.InterfaceC75817TpF
    public final InterfaceC75826TpO mW() {
        return (InterfaceC75826TpO) this.LJLILLLLZI.getValue().getOperator();
    }

    public LinkStatusViewModel() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LinkStatusViewModel_");
        LIZ.append(hashCode());
        this.LJLIL = X1D.LIZIZ(LIZ);
        this.LJLILLLLZI = C78404Ups.LIZJ(this, new AqS163S0100000_13(this, 156));
        this.LJLJI = new C75813TpB(this);
        this.LJLJJI = new C75812TpA(this);
        this.LJLJJLL = new AtomicLong(0L);
    }

    @Override // X.InterfaceC75817TpF
    public final ISessionAbility il() {
        return this.LJLJJL;
    }

    @Override // com.bytedance.android.live.liveinteract.platform.statemanager.iablility.ILinkStateAbility
    public final void Ga(int i) {
        C75814TpC c75814TpC = (C75814TpC) getState();
        gv0(new AqS37S0001000_13(i, 2));
        ChangeStateReq changeStateReq = new ChangeStateReq();
        changeStateReq.stateType = 3;
        changeStateReq.audioMuted = i;
        hv0(changeStateReq, c75814TpC, null);
    }

    @Override // com.bytedance.android.live.liveinteract.platform.statemanager.iablility.ILinkStateAbility
    public final UserState fx(String linkMicId) {
        UserState userState;
        o.LJIIIZ(linkMicId, "linkMicId");
        Iterator<UserState> it = ((C75814TpC) getState()).LJLJI.iterator();
        while (true) {
            if (it.hasNext()) {
                userState = it.next();
                if (o.LJ(userState.linkMicId, linkMicId)) {
                    break;
                }
            } else {
                userState = null;
                break;
            }
        }
        return userState;
    }

    public final void gv0(InterfaceC88472Yns<? super UserState, UserState> interfaceC88472Yns) {
        RtcUserInfo LLLLLJIL;
        String linkMicId;
        ISessionAbility iSessionAbility = this.LJLJJL;
        if (iSessionAbility == null || (LLLLLJIL = iSessionAbility.LLLLLJIL()) == null || (linkMicId = LLLLLJIL.getLinkMicId()) == null) {
            return;
        }
        setStateImmediate(new AqS54S1200000_13(linkMicId, (String) interfaceC88472Yns, (InterfaceC88472Yns<? super UserState, UserState>) this, (LinkStatusViewModel) 1));
    }

    public final void jv0(String str) {
        UC0.LJJIZ(str, "ViewModel");
    }

    public final void kv0(InterfaceC55235Lm3 interfaceC55235Lm3) {
        MultiGuestSharedBgGuestViewModel n90;
        this.LJLJJL = (ISessionAbility) UC0.LJIIL(interfaceC55235Lm3, ISessionAbility.class, null);
        UC0.LJII(interfaceC55235Lm3, this, ILinkStateAbility.class);
        if (C30922CBq.LIZIZ) {
            UC0.LJII(interfaceC55235Lm3, this, DebugStateAbility.class);
        }
        C75813TpB c75813TpB = this.LJLJI;
        c75813TpB.getClass();
        LinkMessageCenter linkMessageCenter = (LinkMessageCenter) c75813TpB.LJLJI.getValue();
        if (linkMessageCenter != null) {
            linkMessageCenter.LIZ(c75813TpB);
        }
        C75812TpA c75812TpA = this.LJLJJI;
        c75812TpA.getClass();
        ISessionAbility il = c75812TpA.LIZ.il();
        if (il == null) {
            il = (ISessionAbility) UC0.LJIIL(interfaceC55235Lm3, ISessionAbility.class, null);
        }
        c75812TpA.LIZIZ = il;
        if (il != null) {
            il.Ro0(c75812TpA);
        }
        ISharedBgAbility iSharedBgAbility = (ISharedBgAbility) UC0.LJIIL(interfaceC55235Lm3, ISharedBgAbility.class, null);
        if (iSharedBgAbility != null && (n90 = iSharedBgAbility.n90()) != null) {
            CQ(new TBT() { // from class: X.TpR
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((C75814TpC) obj).LJLJJL;
                }
            }, null, new AqS179S0100000_13(n90, 373));
        }
        setStateImmediate(C75816TpE.LJLIL);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("on StateAbility[");
        LIZ.append(this);
        LIZ.append("] created..");
        UC0.LJJIZ(X1D.LIZIZ(LIZ), "ViewModel");
    }

    public final void lv0(InterfaceC55235Lm3 interfaceC55235Lm3) {
        UC0.LJJLIIIJ(interfaceC55235Lm3, ILinkStateAbility.class, null);
        C75813TpB c75813TpB = this.LJLJI;
        c75813TpB.getClass();
        LinkMessageCenter linkMessageCenter = (LinkMessageCenter) c75813TpB.LJLJI.getValue();
        if (linkMessageCenter != null) {
            linkMessageCenter.LJ(c75813TpB);
        }
        C75812TpA c75812TpA = this.LJLJJI;
        c75812TpA.getClass();
        ISessionAbility iSessionAbility = c75812TpA.LIZIZ;
        if (iSessionAbility != null) {
            iSessionAbility.Rs0(c75812TpA);
        }
        onCleared();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("on StateAbility[");
        LIZ.append(this);
        LIZ.append("] destroy..");
        UC0.LJJIZ(X1D.LIZIZ(LIZ), "ViewModel");
    }

    public final UserState mv0(C75814TpC c75814TpC) {
        Object obj;
        Iterator<UserState> it = c75814TpC.LJLJI.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            UserState next = it.next();
            String str = next.linkMicId;
            RtcUserInfo LLLLLJIL = LLLLLJIL();
            if (LLLLLJIL != null) {
                obj = LLLLLJIL.getLinkMicId();
            }
            if (o.LJ(str, obj)) {
                obj = next;
                break;
            }
        }
        return (UserState) obj;
    }

    @Override // com.bytedance.android.live.liveinteract.platform.statemanager.iablility.ILinkStateAbility
    public final void tI(int i) {
        C75814TpC c75814TpC = (C75814TpC) getState();
        gv0(new AqS37S0001000_13(i, 5));
        ChangeStateReq changeStateReq = new ChangeStateReq();
        changeStateReq.stateType = 4;
        changeStateReq.videoMuted = i;
        hv0(changeStateReq, c75814TpC, null);
    }

    @Override // com.bytedance.android.live.liveinteract.platform.statemanager.iablility.ILinkStateAbility
    public final void vj0(int i) {
        RtcUserInfo LLLLLJIL;
        String linkMicId;
        if (!MultiGuestV3GuestMonitoringTipsSetting.INSTANCE.getSyncNetworkState()) {
            UC0.LJJIZ("changeNetworkState newNetworkState return as getSyncNetworkState is false", "ViewModel");
            return;
        }
        ISessionAbility iSessionAbility = this.LJLJJL;
        if (iSessionAbility == null || (LLLLLJIL = iSessionAbility.LLLLLJIL()) == null || (linkMicId = LLLLLJIL.getLinkMicId()) == null) {
            return;
        }
        C75814TpC c75814TpC = (C75814TpC) getState();
        UserState fx = fx(linkMicId);
        if (fx == null || C77117UOj.LJJIII(fx.networkState) == C77117UOj.LJJIII(i)) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(this.LJLIL);
            LIZ.append("_changeNetworkState userState = ");
            LIZ.append(fx);
            LIZ.append(' ');
            LIZ.append(i);
            jv0(X1D.LIZIZ(LIZ));
            return;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(this.LJLIL);
        LIZ2.append("_changeNetworkState newNetworkState ");
        LIZ2.append(i);
        jv0(X1D.LIZIZ(LIZ2));
        gv0(new AqS37S0001000_13(i, 3));
        ChangeStateReq changeStateReq = new ChangeStateReq();
        changeStateReq.stateType = 6;
        changeStateReq.networkState = i;
        hv0(changeStateReq, c75814TpC, null);
    }

    @Override // com.bytedance.android.live.liveinteract.platform.statemanager.iablility.ILinkStateAbility
    public final void Jv(int i, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns) {
        C75814TpC c75814TpC = (C75814TpC) getState();
        gv0(new AqS37S0001000_13(i, 4));
        ChangeStateReq changeStateReq = new ChangeStateReq();
        changeStateReq.stateType = 2;
        changeStateReq.onlineUserState = i;
        hv0(changeStateReq, c75814TpC, interfaceC88472Yns);
    }

    @Override // com.bytedance.android.live.liveinteract.platform.statemanager.iablility.ILinkStateAbility
    public final void OJ(String linkMicId, InterfaceC88472Yns<? super UserState, C76800UCe> block) {
        List<UserState> list;
        o.LJIIIZ(linkMicId, "linkMicId");
        o.LJIIIZ(block, "block");
        C75814TpC c75814TpC = (C75814TpC) getVmDispatcher().getState();
        if (c75814TpC != null && (list = c75814TpC.LJLJI) != null) {
            for (UserState userState : list) {
                if (o.LJ(userState.linkMicId, linkMicId)) {
                    if (userState != null) {
                        block.invoke(userState);
                        return;
                    }
                    return;
                }
            }
        }
    }

    @Override // X.InterfaceC75817TpF
    public final void ZI(int i, Object obj) {
        if (i != 0) {
            if (i != 2 || !(obj instanceof ChangeStateReq) || LinkMicStateSetting.INSTANCE.syncWithRTC()) {
                return;
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("[onStateChange] by UserOption <");
            ChangeStateReq changeStateReq = (ChangeStateReq) obj;
            LIZ.append(nv0(changeStateReq.stateType));
            LIZ.append(">, send RTC message to RoomUsers");
            jv0(X1D.LIZIZ(LIZ));
            this.LJLJJI.LJ(changeStateReq);
            return;
        }
        if (!(obj instanceof UserState) || !LinkMicStateSetting.INSTANCE.stateDoubleCheck()) {
            return;
        }
        withState(new AqS144S0200000_13(this, obj, 8));
    }

    @Override // X.InterfaceC75817TpF
    public final void hn(int i, InterfaceC88472Yns<? super C75814TpC, C75814TpC> interfaceC88472Yns) {
        if (i != 0) {
            if (i != 1) {
                if (i == 3) {
                    UC0.LJJIZ("[updateState] by UserOption <stateReset> because of ApiError", "ViewModel");
                }
            } else {
                UC0.LJJIZ("[updateState] by RTCMessage, diff and emmit to guests", "ViewModel");
            }
        } else {
            UC0.LJJIZ("[updateState] by IMServer, diff and emmit to guests", "ViewModel");
        }
        setState(interfaceC88472Yns);
    }

    public final void iv0(UserState userState, UserState userState2) {
        if (userState2 == null || o.LJ(userState, userState2)) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onState different with server: ");
        LIZ.append(userState);
        LIZ.append(" \n ");
        LIZ.append(userState2);
        jv0(X1D.LIZIZ(LIZ));
        long LIZ2 = C30725C4b.LIZ();
        if (LIZ2 - this.LJLJJLL.get() > Math.max(LinkMicStateSetting.INSTANCE.checkDuration() * 1000, 60000)) {
            int i = userState.audioMuted;
            if (i != userState2.audioMuted && i != 0) {
                this.LJLJJLL.set(LIZ2);
                Ga(userState.audioMuted);
                return;
            }
            int i2 = userState.videoMuted;
            if (i2 == userState2.videoMuted || i2 == 0) {
                return;
            }
            this.LJLJJLL.set(LIZ2);
            tI(userState.videoMuted);
        }
    }

    @Override // X.InterfaceC75817TpF
    public final void kl(int i, boolean z) {
        setStateImmediate(new AqS2S0011000_13(i, z, 1));
    }

    @Override // com.bytedance.android.live.liveinteract.platform.statemanager.iablility.ILinkStateAbility
    public final void CQ(TBT prop1, C56412MCa c56412MCa, InterfaceC88472Yns interfaceC88472Yns) {
        C56412MCa c56412MCa2 = c56412MCa;
        o.LJIIIZ(prop1, "prop1");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("select state Subscribe [");
        LIZ.append(prop1);
        LIZ.append("] ");
        UC0.LJJIZ(X1D.LIZIZ(LIZ), "StateSubscriber");
        if (c56412MCa2 == null) {
            c56412MCa2 = new C56412MCa();
            c56412MCa2.LIZIZ(true);
        }
        AssemViewModel.selectSubscribe$default(this, prop1, c56412MCa2, null, null, interfaceC88472Yns, 12, null);
    }

    @Override // com.bytedance.android.live.liveinteract.platform.statemanager.iablility.ILinkStateAbility
    public final void Zq(int i, String linkMicId, boolean z) {
        String str;
        o.LJIIIZ(linkMicId, "linkMicId");
        if (LinkMicStateSetting.INSTANCE.rtcDoubleCheck()) {
            RtcUserInfo LLLLLJIL = LLLLLJIL();
            if (LLLLLJIL != null) {
                str = LLLLLJIL.getLinkMicId();
            } else {
                str = null;
            }
            if (!o.LJ(linkMicId, str)) {
                return;
            }
            withState(new AqS9S0111000_13(this, i, z, 1));
        }
    }

    @Override // com.bytedance.android.live.liveinteract.platform.statemanager.iablility.ILinkStateAbility
    public final void aq0(int i, boolean z, boolean z2) {
        gv0(new C75815TpD(i, z, z2, this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x005b, code lost:
    
        if (X.C74650TRm.LIZ() != false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006d, code lost:
    
        if ((r0 & 2) == 2) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x000a, code lost:
    
        if (r1 != 4) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x000c, code lost:
    
        r4 = r9.LJLJI;
        r4.getClass();
        kotlin.jvm.internal.o.LJIIIZ(r11, "lastState");
        X.XKX.LIZLLL(r4, null, null, new X.C75823TpL(r4, r10, r12, r11, null), 3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0027, code lost:
    
        if (com.bytedance.android.livesdk.livesetting.linkmic.LinkMicStateSetting.INSTANCE.syncWithRTC() == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0029, code lost:
    
        r9.LJLJJI.LJ(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002e, code lost:
    
        r2 = "StateManager";
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void hv0(tikcast.linkmic.controller.ChangeStateReq r10, X.C75814TpC r11, X.InterfaceC88472Yns<? super java.lang.Boolean, X.C76800UCe> r12) {
        /*
            r9 = this;
            r5 = r10
            int r1 = r5.stateType
            r2 = 3
            r0 = 1
            if (r1 == r0) goto L5e
            if (r1 == r2) goto L57
            r0 = 4
            if (r1 == r0) goto L57
        Lc:
            X.TpB r4 = r9.LJLJI
            r4.getClass()
            java.lang.String r0 = "lastState"
            r7 = r11
            kotlin.jvm.internal.o.LJIIIZ(r7, r0)
            X.TpL r3 = new X.TpL
            r8 = 0
            r6 = r12
            r3.<init>(r4, r5, r6, r7, r8)
            X.XKX.LIZLLL(r4, r8, r8, r3, r2)
            com.bytedance.android.livesdk.livesetting.linkmic.LinkMicStateSetting r0 = com.bytedance.android.livesdk.livesetting.linkmic.LinkMicStateSetting.INSTANCE
            boolean r0 = r0.syncWithRTC()
            if (r0 == 0) goto L2e
            X.TpA r0 = r9.LJLJJI
            r0.LJ(r5)
        L2e:
            java.lang.String r2 = "StateManager"
        L30:
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            r0 = 91
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = ".StateAbility] try to change state of ["
            r1.append(r0)
            int r0 = r5.stateType
            java.lang.String r0 = nv0(r0)
            r1.append(r0)
            r0 = 93
            r1.append(r0)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            r9.jv0(r0)
            return
        L57:
            boolean r0 = X.C74650TRm.LIZ()
            if (r0 == 0) goto L7b
            goto Lc
        L5e:
            boolean r0 = X.C74650TRm.LIZ
            java.lang.String r1 = "live_linkmic_enable_state_consistency"
            if (r0 == 0) goto L70
            com.bytedance.android.livesdk.livesetting.linkmic.multilive.LiveAbLabelSetting r0 = com.bytedance.android.livesdk.livesetting.linkmic.multilive.LiveAbLabelSetting.INSTANCE
            int r0 = r0.getIntValue(r1)
        L6a:
            r1 = 2
            r0 = r0 & 2
            if (r0 != r1) goto L7b
            goto Lc
        L70:
            java.lang.Integer r0 = X.U4C.LIZIZ(r1)
            if (r0 == 0) goto L7b
            int r0 = r0.intValue()
            goto L6a
        L7b:
            X.TpA r0 = r9.LJLJJI
            r0.LJ(r5)
            java.lang.String r2 = "RTCManager"
            goto L30
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.platform.statemanager.LinkStatusViewModel.hv0(tikcast.linkmic.controller.ChangeStateReq, X.TpC, X.Yns):void");
    }
}
