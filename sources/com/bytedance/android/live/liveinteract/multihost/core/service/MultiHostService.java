package com.bytedance.android.live.liveinteract.multihost.core.service;

import X.C0NB;
import X.C28272B7s;
import X.C29306Beo;
import X.C30868C9o;
import X.C32537Cpp;
import X.C44432HcC;
import X.C74616TQe;
import X.C75234Tfq;
import X.C75504TkC;
import X.C75545Tkr;
import X.C75721Tnh;
import X.C75732Tns;
import X.C75745To5;
import X.C75759ToJ;
import X.C75878TqE;
import X.C75883TqJ;
import X.C75892TqS;
import X.C75904Tqe;
import X.C75911Tql;
import X.C75993Ts5;
import X.C76012TsO;
import X.C76113Tu1;
import X.C76615U5b;
import X.C76800UCe;
import X.C76965UIn;
import X.C78688UuS;
import X.C8E;
import X.CN1;
import X.EnumC75620Tm4;
import X.EnumC75780Toe;
import X.FP1;
import X.FT5;
import X.InterfaceC06390Mx;
import X.InterfaceC28213B5l;
import X.InterfaceC74805TXl;
import X.InterfaceC75414Tik;
import X.InterfaceC75441TjB;
import X.InterfaceC75706TnS;
import X.InterfaceC88471Ynr;
import X.JBR;
import X.N2J;
import X.N3W;
import X.N3X;
import X.OLS;
import X.OLT;
import X.OLU;
import X.OLV;
import X.OLX;
import X.TS3;
import X.X1D;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.liveinteract.multihost.core.adapter.IMultiHostCrossAdapter;
import com.bytedance.android.live.liveinteract.multihost.core.adapter.IMultiHostMultiAdapter;
import com.bytedance.android.livesdk.comp.api.linkcore.api.ILinkMicService;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LeaveChannelResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.MixInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.PermitResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ReplyResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ResumeResult;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.livesetting.linkmic.MtCoHostCrossBizNewArcSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MtCoHostCrossRoomPushMinVersionSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveCoHostCrossActiveFixSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveCoHostCrossApplyFixSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import defpackage.b1;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public class MultiHostService implements IMultiHostService, InterfaceC28213B5l {
    public static final C75721Tnh LJLL = new C75721Tnh();
    public static boolean LJLLI;
    public boolean LJLIL;
    public boolean LJLILLLLZI;
    public DataChannel LJLJI;
    public Room LJLJJI;
    public ILinkMicService LJLJJL;
    public InterfaceC74805TXl LJLJJLL;
    public C75745To5 LJLJL;
    public IMultiHostMultiAdapter LJLJLJ;
    public IMultiHostCrossAdapter LJLJLLL;

    @Override // X.InterfaceC06390Mx
    public final /* synthetic */ void onInit() {
    }

    /* JADX WARN: Removed duplicated region for block: B:7:? A[RETURN, SYNTHETIC] */
    @Override // X.InterfaceC75594Tle
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<X.C75883TqJ> LJIILJJIL() {
        /*
            r1 = this;
            java.lang.String r0 = "getCoHostLinkedUserList"
            boolean r0 = r1.eU(r0)
            if (r0 == 0) goto L15
            com.bytedance.android.live.liveinteract.multihost.core.adapter.IMultiHostCrossAdapter r0 = r1.LJLJLLL
            if (r0 == 0) goto L12
            java.util.List r0 = r0.LJIILJJIL()
        L10:
            if (r0 != 0) goto L14
        L12:
            X.OQg r0 = X.C61878OQg.INSTANCE
        L14:
            return r0
        L15:
            com.bytedance.android.live.liveinteract.multihost.core.adapter.IMultiHostMultiAdapter r0 = r1.LJLJLJ
            if (r0 == 0) goto L12
            java.util.List r0 = r0.LJIILJJIL()
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multihost.core.service.MultiHostService.LJIILJJIL():java.util.List");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:? A[RETURN, SYNTHETIC] */
    @Override // X.InterfaceC75594Tle
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<X.C75883TqJ> LJIL() {
        /*
            r1 = this;
            java.lang.String r0 = "getCoHostUserList"
            boolean r0 = r1.eU(r0)
            if (r0 == 0) goto L15
            com.bytedance.android.live.liveinteract.multihost.core.adapter.IMultiHostCrossAdapter r0 = r1.LJLJLLL
            if (r0 == 0) goto L12
            java.util.List r0 = r0.LJIL()
        L10:
            if (r0 != 0) goto L14
        L12:
            X.OQg r0 = X.C61878OQg.INSTANCE
        L14:
            return r0
        L15:
            com.bytedance.android.live.liveinteract.multihost.core.adapter.IMultiHostMultiAdapter r0 = r1.LJLJLJ
            if (r0 == 0) goto L12
            java.util.List r0 = r0.LJIL()
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multihost.core.service.MultiHostService.LJIL():java.util.List");
    }

    @Override // X.InterfaceC75594Tle
    public final boolean LJJIIJ() {
        if (eU("isCoHostReconnected")) {
            IMultiHostCrossAdapter iMultiHostCrossAdapter = this.LJLJLLL;
            if (iMultiHostCrossAdapter != null) {
                return iMultiHostCrossAdapter.LJJIIJ();
            }
        } else {
            IMultiHostMultiAdapter iMultiHostMultiAdapter = this.LJLJLJ;
            if (iMultiHostMultiAdapter != null) {
                return iMultiHostMultiAdapter.LJJIIJ();
            }
        }
        return false;
    }

    @Override // X.InterfaceC75594Tle
    public final void LJJIIJZLJL() {
        StringBuilder LIZJ = b1.LIZJ("detach_base", ", isAttached = ");
        FT5.LJ(LIZJ, this.LJLIL, LIZJ, "MultiHostService");
        if (!this.LJLIL) {
            return;
        }
        IMultiHostMultiAdapter iMultiHostMultiAdapter = this.LJLJLJ;
        if (iMultiHostMultiAdapter != null) {
            iMultiHostMultiAdapter.LJJIIJZLJL();
        }
        IMultiHostCrossAdapter iMultiHostCrossAdapter = this.LJLJLLL;
        if (iMultiHostCrossAdapter != null) {
            iMultiHostCrossAdapter.LJJIIJZLJL();
        }
        this.LJLJJLL = null;
        this.LJLJL = null;
        this.LJLJI = null;
        this.LJLJJI = null;
        this.LJLIL = false;
        LJLLI = false;
    }

    @Override // X.InterfaceC75594Tle
    public final boolean LJJIJ() {
        if (eU("isMatchReconnectedByResume")) {
            IMultiHostCrossAdapter iMultiHostCrossAdapter = this.LJLJLLL;
            if (iMultiHostCrossAdapter != null) {
                return iMultiHostCrossAdapter.LJJIJ();
            }
        } else {
            IMultiHostMultiAdapter iMultiHostMultiAdapter = this.LJLJLJ;
            if (iMultiHostMultiAdapter != null) {
                return iMultiHostMultiAdapter.LJJIJ();
            }
        }
        return false;
    }

    @Override // X.InterfaceC75594Tle
    public final InterfaceC75441TjB LJJIJL() {
        if (eU("getLinkSession")) {
            IMultiHostCrossAdapter iMultiHostCrossAdapter = this.LJLJLLL;
            if (iMultiHostCrossAdapter != null) {
                return iMultiHostCrossAdapter.LJJIJL();
            }
        } else {
            IMultiHostMultiAdapter iMultiHostMultiAdapter = this.LJLJLJ;
            if (iMultiHostMultiAdapter != null) {
                return iMultiHostMultiAdapter.LJJIJL();
            }
        }
        return null;
    }

    @Override // X.InterfaceC75594Tle
    public final boolean LJJJJLI() {
        IMultiHostCrossAdapter iMultiHostCrossAdapter = this.LJLJLLL;
        if (iMultiHostCrossAdapter != null) {
            return iMultiHostCrossAdapter.LJJJJLI();
        }
        return false;
    }

    @Override // X.InterfaceC75594Tle
    public final void LJJJJLL() {
        IMultiHostCrossAdapter iMultiHostCrossAdapter;
        if (eU("onRoomClose") && O70("onRoomClose") && (iMultiHostCrossAdapter = this.LJLJLLL) != null) {
            iMultiHostCrossAdapter.LJJJJLL();
        }
    }

    @Override // X.InterfaceC75594Tle
    public final long LJJLI() {
        if (eU("getChannelId")) {
            IMultiHostCrossAdapter iMultiHostCrossAdapter = this.LJLJLLL;
            if (iMultiHostCrossAdapter != null) {
                return iMultiHostCrossAdapter.LJJLI();
            }
        } else {
            IMultiHostMultiAdapter iMultiHostMultiAdapter = this.LJLJLJ;
            if (iMultiHostMultiAdapter != null) {
                return iMultiHostMultiAdapter.LJJLI();
            }
        }
        return 0L;
    }

    @Override // X.InterfaceC75594Tle
    public final void LJLLLLLL() {
        if (eU("refreshUserList")) {
            IMultiHostCrossAdapter iMultiHostCrossAdapter = this.LJLJLLL;
            if (iMultiHostCrossAdapter != null) {
                iMultiHostCrossAdapter.LJLLLLLL();
                return;
            }
            return;
        }
        IMultiHostMultiAdapter iMultiHostMultiAdapter = this.LJLJLJ;
        if (iMultiHostMultiAdapter == null) {
            return;
        }
        iMultiHostMultiAdapter.LJLLLLLL();
    }

    @Override // X.InterfaceC75594Tle
    public final void LLF() {
        if (eU("recoverMultiGuest")) {
            IMultiHostCrossAdapter iMultiHostCrossAdapter = this.LJLJLLL;
            if (iMultiHostCrossAdapter != null) {
                iMultiHostCrossAdapter.LLF();
                return;
            }
            return;
        }
        IMultiHostMultiAdapter iMultiHostMultiAdapter = this.LJLJLJ;
        if (iMultiHostMultiAdapter == null) {
            return;
        }
        iMultiHostMultiAdapter.LLF();
    }

    @Override // X.InterfaceC75594Tle
    public final boolean LLIFFJFJJ() {
        boolean z;
        if (this.LJLIL) {
            z = this.LJLILLLLZI;
        } else {
            z = false;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("isEnableSDK_base, isAttached = ");
        LIZ.append(this.LJLIL);
        LIZ.append(", enabled = ");
        LIZ.append(z);
        C0NB.LJIIIZ("MultiHostService", X1D.LIZIZ(LIZ));
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:? A[RETURN, SYNTHETIC] */
    @Override // X.InterfaceC75594Tle
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.EnumC75620Tm4 LLII() {
        /*
            r1 = this;
            java.lang.String r0 = "getCoHostState"
            boolean r0 = r1.eU(r0)
            if (r0 == 0) goto L15
            com.bytedance.android.live.liveinteract.multihost.core.adapter.IMultiHostCrossAdapter r0 = r1.LJLJLLL
            if (r0 == 0) goto L12
            X.Tm4 r0 = r0.LLII()
        L10:
            if (r0 != 0) goto L14
        L12:
            X.Tm4 r0 = X.EnumC75620Tm4.None
        L14:
            return r0
        L15:
            com.bytedance.android.live.liveinteract.multihost.core.adapter.IMultiHostMultiAdapter r0 = r1.LJLJLJ
            if (r0 == 0) goto L12
            X.Tm4 r0 = r0.LLII()
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multihost.core.service.MultiHostService.LLII():X.Tm4");
    }

    @Override // X.InterfaceC75594Tle
    public final long LLIILZL() {
        IMultiHostCrossAdapter iMultiHostCrossAdapter = this.LJLJLLL;
        if (iMultiHostCrossAdapter != null) {
            return iMultiHostCrossAdapter.LLIILZL();
        }
        return 0L;
    }

    @Override // X.InterfaceC75594Tle
    public final void LLIZLLLIL() {
        if (eU("closeWithModeSwitch")) {
            IMultiHostCrossAdapter iMultiHostCrossAdapter = this.LJLJLLL;
            if (iMultiHostCrossAdapter != null) {
                iMultiHostCrossAdapter.LLIZLLLIL();
                return;
            }
            return;
        }
        IMultiHostMultiAdapter iMultiHostMultiAdapter = this.LJLJLJ;
        if (iMultiHostMultiAdapter == null) {
            return;
        }
        iMultiHostMultiAdapter.LLIZLLLIL();
    }

    @Override // X.InterfaceC75594Tle
    public final long S6() {
        IMultiHostCrossAdapter iMultiHostCrossAdapter;
        if (eU("getOldChannelId") && (iMultiHostCrossAdapter = this.LJLJLLL) != null) {
            return iMultiHostCrossAdapter.S6();
        }
        return 0L;
    }

    @Override // X.InterfaceC75594Tle
    public final void e1() {
        if (eU("unregisterBusinessExtraInfoListener")) {
            IMultiHostCrossAdapter iMultiHostCrossAdapter = this.LJLJLLL;
            if (iMultiHostCrossAdapter != null) {
                iMultiHostCrossAdapter.e1();
                return;
            }
            return;
        }
        IMultiHostMultiAdapter iMultiHostMultiAdapter = this.LJLJLJ;
        if (iMultiHostMultiAdapter == null) {
            return;
        }
        iMultiHostMultiAdapter.e1();
    }

    @Override // X.InterfaceC75594Tle
    public final boolean q3() {
        IMultiHostCrossAdapter iMultiHostCrossAdapter;
        if (eU("isTwoApplyTwo") && (iMultiHostCrossAdapter = this.LJLJLLL) != null) {
            return iMultiHostCrossAdapter.q3();
        }
        return false;
    }

    @Override // X.InterfaceC75594Tle
    public final InterfaceC74805TXl C4() {
        return this.LJLJJLL;
    }

    @Override // X.InterfaceC75594Tle
    public final boolean LIZLLL() {
        return this.LJLIL;
    }

    @Override // X.InterfaceC28213B5l
    public final void J2(C75234Tfq c75234Tfq) {
        InterfaceC06390Mx interfaceC06390Mx;
        if (eU("getCoHostUserList")) {
            interfaceC06390Mx = this.LJLJLLL;
        } else {
            interfaceC06390Mx = this.LJLJLJ;
        }
        if (interfaceC06390Mx instanceof InterfaceC28213B5l) {
            ((InterfaceC28213B5l) interfaceC06390Mx).J2(c75234Tfq);
        }
    }

    @Override // X.InterfaceC75594Tle
    public final C75883TqJ LJI(long j) {
        if (eU("getCoHostUser")) {
            IMultiHostCrossAdapter iMultiHostCrossAdapter = this.LJLJLLL;
            if (iMultiHostCrossAdapter != null) {
                return iMultiHostCrossAdapter.LJI(j);
            }
        } else {
            IMultiHostMultiAdapter iMultiHostMultiAdapter = this.LJLJLJ;
            if (iMultiHostMultiAdapter != null) {
                return iMultiHostMultiAdapter.LJI(j);
            }
        }
        return null;
    }

    @Override // X.InterfaceC75719Tnf
    public final void LJJZZIII(boolean z) {
        if (eU("cancelAll")) {
            IMultiHostCrossAdapter iMultiHostCrossAdapter = this.LJLJLLL;
            if (iMultiHostCrossAdapter != null) {
                iMultiHostCrossAdapter.LJJZZIII(z);
                return;
            }
            return;
        }
        IMultiHostMultiAdapter iMultiHostMultiAdapter = this.LJLJLJ;
        if (iMultiHostMultiAdapter == null) {
            return;
        }
        iMultiHostMultiAdapter.LJJZZIII(z);
    }

    @Override // X.InterfaceC75594Tle
    public final C75883TqJ LJLL(String linkMicId) {
        o.LJIIIZ(linkMicId, "linkMicId");
        if (eU("getCoHostUserWithLinkMicId")) {
            IMultiHostCrossAdapter iMultiHostCrossAdapter = this.LJLJLLL;
            if (iMultiHostCrossAdapter != null) {
                return iMultiHostCrossAdapter.LJLL(linkMicId);
            }
        } else {
            IMultiHostMultiAdapter iMultiHostMultiAdapter = this.LJLJLJ;
            if (iMultiHostMultiAdapter != null) {
                return iMultiHostMultiAdapter.LJLL(linkMicId);
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    @Override // X.InterfaceC75594Tle
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long LLI(long r3) {
        /*
            r2 = this;
            java.lang.String r0 = "getCoHostUserCountDown"
            boolean r0 = r2.eU(r0)
            if (r0 == 0) goto L1b
            com.bytedance.android.live.liveinteract.multihost.core.adapter.IMultiHostCrossAdapter r0 = r2.LJLJLLL
            if (r0 == 0) goto L28
            long r0 = r0.LLI(r3)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
        L14:
            if (r0 == 0) goto L28
            long r0 = r0.longValue()
        L1a:
            return r0
        L1b:
            com.bytedance.android.live.liveinteract.multihost.core.adapter.IMultiHostMultiAdapter r0 = r2.LJLJLJ
            if (r0 == 0) goto L28
            long r0 = r0.LLI(r3)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            goto L14
        L28:
            r0 = 0
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multihost.core.service.MultiHostService.LLI(long):long");
    }

    @Override // com.bytedance.android.live.liveinteract.multihost.core.service.IMultiHostService
    public final boolean O70(String str) {
        boolean z;
        if (eU("is_cross_arc_joining_or_linked") && LLII().isJoiningOrLinked()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            FP1.LJFF("is_cross_arc_joining_or_linked", ", true", "MultiHostService");
            return true;
        }
        FP1.LJFF("is_cross_arc_joining_or_linked", ", false", "MultiHostService");
        return false;
    }

    @Override // com.bytedance.android.live.liveinteract.multihost.core.service.IMultiHostService
    public final boolean eU(String source) {
        InterfaceC75441TjB interfaceC75441TjB;
        InterfaceC75441TjB interfaceC75441TjB2;
        EnumC75780Toe enumC75780Toe;
        EnumC75780Toe enumC75780Toe2;
        boolean z;
        boolean z2;
        o.LJIIIZ(source, "source");
        IMultiHostMultiAdapter iMultiHostMultiAdapter = this.LJLJLJ;
        String str = null;
        if (iMultiHostMultiAdapter != null) {
            interfaceC75441TjB = iMultiHostMultiAdapter.LJJIJL();
        } else {
            interfaceC75441TjB = null;
        }
        IMultiHostCrossAdapter iMultiHostCrossAdapter = this.LJLJLLL;
        if (iMultiHostCrossAdapter != null) {
            interfaceC75441TjB2 = iMultiHostCrossAdapter.LJJIJL();
        } else {
            interfaceC75441TjB2 = null;
        }
        if (interfaceC75441TjB != null) {
            enumC75780Toe = interfaceC75441TjB.LJLJLLL();
        } else {
            enumC75780Toe = null;
        }
        if (interfaceC75441TjB2 != null) {
            enumC75780Toe2 = interfaceC75441TjB2.LJLJLLL();
        } else {
            enumC75780Toe2 = null;
        }
        boolean z3 = true;
        if (interfaceC75441TjB != null && enumC75780Toe == EnumC75780Toe.CoLinkMicSession) {
            z = true;
        } else {
            z = false;
        }
        if (interfaceC75441TjB2 != null && enumC75780Toe2 == EnumC75780Toe.LiveLinkMicSession) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean LJJJJLI = LJJJJLI();
        if (!z && z2 && LJJJJLI) {
            if (!LiveCoHostCrossActiveFixSetting.INSTANCE.isEnable()) {
                return true;
            }
            if (interfaceC75441TjB2 != null) {
                str = interfaceC75441TjB2.LLLLLLIL();
            }
            if (!C29306Beo.LJIJJLI(str)) {
                z3 = false;
            }
            return z3;
        }
        return false;
    }

    @Override // X.InterfaceC75594Tle
    public final void onSei(C28272B7s c28272B7s) {
        if (eU("onSei")) {
            IMultiHostCrossAdapter iMultiHostCrossAdapter = this.LJLJLLL;
            if (iMultiHostCrossAdapter != null) {
                iMultiHostCrossAdapter.onSei(c28272B7s);
                return;
            }
            return;
        }
        IMultiHostMultiAdapter iMultiHostMultiAdapter = this.LJLJLJ;
        if (iMultiHostMultiAdapter == null) {
            return;
        }
        iMultiHostMultiAdapter.onSei(c28272B7s);
    }

    @Override // com.bytedance.android.live.liveinteract.multihost.core.service.IMultiHostService
    public final boolean zS(String str) {
        boolean z;
        if (eU("is_cross_arc_linked") && LLII() == EnumC75620Tm4.Linked) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            FP1.LJFF("is_cross_arc_linked", ", true", "MultiHostService");
            return true;
        }
        FP1.LJFF("is_cross_arc_linked", ", false", "MultiHostService");
        return false;
    }

    @Override // X.InterfaceC75719Tnf
    public final void LJFF(C76113Tu1 c76113Tu1, InterfaceC75414Tik<ResumeResult> interfaceC75414Tik) {
        C0NB.LJIIIZ("MultiHostService", "resume cohost");
        new C75878TqE().LJIILLIIL("resume_multi_host_service");
        IMultiHostMultiAdapter iMultiHostMultiAdapter = this.LJLJLJ;
        if (iMultiHostMultiAdapter != null) {
            iMultiHostMultiAdapter.LJFF(c76113Tu1, null);
        }
    }

    @Override // X.InterfaceC75720Tng
    public final void LJJ(C75892TqS c75892TqS, InterfaceC75706TnS<OLU> interfaceC75706TnS) {
        if (eU("inviteReply")) {
            IMultiHostCrossAdapter iMultiHostCrossAdapter = this.LJLJLLL;
            if (iMultiHostCrossAdapter != null) {
                iMultiHostCrossAdapter.LJJ(c75892TqS, interfaceC75706TnS);
                return;
            }
            return;
        }
        IMultiHostMultiAdapter iMultiHostMultiAdapter = this.LJLJLJ;
        if (iMultiHostMultiAdapter == null) {
            return;
        }
        iMultiHostMultiAdapter.LJJ(c75892TqS, interfaceC75706TnS);
    }

    @Override // X.InterfaceC75720Tng
    public final void LJJIJLIJ(C75892TqS c75892TqS, InterfaceC75706TnS<OLU> interfaceC75706TnS) {
        if (eU("applyPermit")) {
            IMultiHostCrossAdapter iMultiHostCrossAdapter = this.LJLJLLL;
            if (iMultiHostCrossAdapter != null) {
                iMultiHostCrossAdapter.LJJIJLIJ(c75892TqS, interfaceC75706TnS);
                return;
            }
            return;
        }
        IMultiHostMultiAdapter iMultiHostMultiAdapter = this.LJLJLJ;
        if (iMultiHostMultiAdapter == null) {
            return;
        }
        iMultiHostMultiAdapter.LJJIJLIJ(c75892TqS, interfaceC75706TnS);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Boolean, O] */
    @Override // X.InterfaceC75594Tle
    public final void LJJJJJ(String str, boolean z) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setEnableSDK_base, isAttached = ");
        C76965UIn.LIZJ(LIZ, this.LJLIL, ", enable = ", true, ", linkMicManager = ");
        LIZ.append(this.LJLJJLL);
        LIZ.append(", source = ");
        LIZ.append(str);
        C0NB.LJIIIZ("MultiHostService", X1D.LIZIZ(LIZ));
        IMultiHostMultiAdapter iMultiHostMultiAdapter = this.LJLJLJ;
        if (iMultiHostMultiAdapter != null) {
            iMultiHostMultiAdapter.LJJJJJ(str, true);
        }
        IMultiHostCrossAdapter iMultiHostCrossAdapter = this.LJLJLLL;
        if (iMultiHostCrossAdapter != null) {
            iMultiHostCrossAdapter.LJJJJJ(str, true);
        }
        if (!this.LJLIL) {
            return;
        }
        DataChannel dataChannel = this.LJLJI;
        if (dataChannel != null) {
            ((C32537Cpp) dataChannel.gv0(C75504TkC.class)).LIZ = Boolean.TRUE;
        }
        InterfaceC74805TXl interfaceC74805TXl = this.LJLJJLL;
        if (interfaceC74805TXl != null) {
            interfaceC74805TXl.X6(false);
        }
        this.LJLILLLLZI = true;
    }

    @Override // X.InterfaceC75594Tle
    public final <T> void LJJJZ(Class<T> cls, InterfaceC88471Ynr<? super InterfaceC75441TjB, ? super C75732Tns<T>, C76800UCe> handler) {
        o.LJIIIZ(handler, "handler");
        IMultiHostMultiAdapter iMultiHostMultiAdapter = this.LJLJLJ;
        if (iMultiHostMultiAdapter != null) {
            iMultiHostMultiAdapter.LJJJZ(cls, handler);
        }
        IMultiHostCrossAdapter iMultiHostCrossAdapter = this.LJLJLLL;
        if (iMultiHostCrossAdapter != null) {
            iMultiHostCrossAdapter.LJJJZ(cls, handler);
        }
    }

    @Override // X.InterfaceC75594Tle
    public final C75883TqJ LJJZ(long j, boolean z) {
        if (eU("getCoHostUserWithPlayType")) {
            IMultiHostCrossAdapter iMultiHostCrossAdapter = this.LJLJLLL;
            if (iMultiHostCrossAdapter != null) {
                return iMultiHostCrossAdapter.LJJZ(j, z);
            }
        } else {
            IMultiHostMultiAdapter iMultiHostMultiAdapter = this.LJLJLJ;
            if (iMultiHostMultiAdapter != null) {
                return iMultiHostMultiAdapter.LJJZ(j, z);
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    @Override // X.InterfaceC75594Tle
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJL(long r2, java.lang.String r4) {
        /*
            r1 = this;
            java.lang.String r0 = "isWaitingByMe"
            boolean r0 = r1.eU(r0)
            if (r0 == 0) goto L1b
            com.bytedance.android.live.liveinteract.multihost.core.adapter.IMultiHostCrossAdapter r0 = r1.LJLJLLL
            if (r0 == 0) goto L28
            boolean r0 = r0.LJL(r2, r4)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L14:
            if (r0 == 0) goto L28
            boolean r0 = r0.booleanValue()
        L1a:
            return r0
        L1b:
            com.bytedance.android.live.liveinteract.multihost.core.adapter.IMultiHostMultiAdapter r0 = r1.LJLJLJ
            if (r0 == 0) goto L28
            boolean r0 = r0.LJL(r2, r4)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            goto L14
        L28:
            r0 = 0
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multihost.core.service.MultiHostService.LJL(long, java.lang.String):boolean");
    }

    @Override // X.InterfaceC75720Tng
    public final void LJLIIL(C75904Tqe c75904Tqe, InterfaceC75706TnS<OLT> interfaceC75706TnS) {
        if (eU("applyCancel")) {
            IMultiHostCrossAdapter iMultiHostCrossAdapter = this.LJLJLLL;
            if (iMultiHostCrossAdapter != null) {
                iMultiHostCrossAdapter.LJLIIL(c75904Tqe, interfaceC75706TnS);
                return;
            }
            return;
        }
        IMultiHostMultiAdapter iMultiHostMultiAdapter = this.LJLJLJ;
        if (iMultiHostMultiAdapter == null) {
            return;
        }
        iMultiHostMultiAdapter.LJLIIL(c75904Tqe, interfaceC75706TnS);
    }

    @Override // X.InterfaceC75720Tng
    public final void LJLJLJ(C75904Tqe c75904Tqe, InterfaceC75706TnS<OLT> interfaceC75706TnS) {
        if (eU("inviteCancel")) {
            IMultiHostCrossAdapter iMultiHostCrossAdapter = this.LJLJLLL;
            if (iMultiHostCrossAdapter != null) {
                iMultiHostCrossAdapter.LJLJLJ(c75904Tqe, interfaceC75706TnS);
                return;
            }
            return;
        }
        IMultiHostMultiAdapter iMultiHostMultiAdapter = this.LJLJLJ;
        if (iMultiHostMultiAdapter == null) {
            return;
        }
        iMultiHostMultiAdapter.LJLJLJ(c75904Tqe, interfaceC75706TnS);
    }

    @Override // X.InterfaceC75720Tng
    public final void LJLLJ(OLX olx, InterfaceC75706TnS<OLS> interfaceC75706TnS) {
        if (eU("leave")) {
            IMultiHostCrossAdapter iMultiHostCrossAdapter = this.LJLJLLL;
            if (iMultiHostCrossAdapter != null) {
                iMultiHostCrossAdapter.LJLLJ(olx, interfaceC75706TnS);
                return;
            }
            return;
        }
        IMultiHostMultiAdapter iMultiHostMultiAdapter = this.LJLJLJ;
        if (iMultiHostMultiAdapter == null) {
            return;
        }
        iMultiHostMultiAdapter.LJLLJ(olx, interfaceC75706TnS);
    }

    @Override // X.InterfaceC75594Tle
    public final <T> void LJZI(Class<T> cls, InterfaceC88471Ynr<? super InterfaceC75441TjB, ? super C75732Tns<T>, C76800UCe> handler) {
        o.LJIIIZ(handler, "handler");
        IMultiHostMultiAdapter iMultiHostMultiAdapter = this.LJLJLJ;
        if (iMultiHostMultiAdapter != null) {
            iMultiHostMultiAdapter.LJZI(cls, handler);
        }
        IMultiHostCrossAdapter iMultiHostCrossAdapter = this.LJLJLLL;
        if (iMultiHostCrossAdapter != null) {
            iMultiHostCrossAdapter.LJZI(cls, handler);
        }
    }

    @Override // X.InterfaceC75594Tle
    public final void LLIIIL(String str, N2J n2j) {
        if (eU("registerBusinessExtraInfoListener")) {
            IMultiHostCrossAdapter iMultiHostCrossAdapter = this.LJLJLLL;
            if (iMultiHostCrossAdapter != null) {
                iMultiHostCrossAdapter.LLIIIL(str, n2j);
                return;
            }
            return;
        }
        IMultiHostMultiAdapter iMultiHostMultiAdapter = this.LJLJLJ;
        if (iMultiHostMultiAdapter == null) {
            return;
        }
        iMultiHostMultiAdapter.LLIIIL(str, n2j);
    }

    @Override // X.InterfaceC75720Tng
    public final void LLILL(C75759ToJ param, InterfaceC75706TnS<OLV> interfaceC75706TnS) {
        o.LJIIIZ(param, "param");
        if (LiveCoHostCrossApplyFixSetting.INSTANCE.isEnable()) {
            if (zS("apply")) {
                IMultiHostCrossAdapter iMultiHostCrossAdapter = this.LJLJLLL;
                if (iMultiHostCrossAdapter != null) {
                    iMultiHostCrossAdapter.LLILL(param, interfaceC75706TnS);
                    return;
                }
                return;
            }
            if (eU("apply") && param.LJLJJI > 0 && param.LJLJJL > 0) {
                IMultiHostCrossAdapter iMultiHostCrossAdapter2 = this.LJLJLLL;
                if (iMultiHostCrossAdapter2 == null) {
                    return;
                }
                iMultiHostCrossAdapter2.LLILL(param, interfaceC75706TnS);
                return;
            }
            IMultiHostMultiAdapter iMultiHostMultiAdapter = this.LJLJLJ;
            if (iMultiHostMultiAdapter == null) {
                return;
            }
            iMultiHostMultiAdapter.LLILL(param, interfaceC75706TnS);
            return;
        }
        if (eU("apply") && param.LJLJJI > 0) {
            IMultiHostCrossAdapter iMultiHostCrossAdapter3 = this.LJLJLLL;
            if (iMultiHostCrossAdapter3 == null) {
                return;
            }
            iMultiHostCrossAdapter3.LLILL(param, interfaceC75706TnS);
            return;
        }
        IMultiHostMultiAdapter iMultiHostMultiAdapter2 = this.LJLJLJ;
        if (iMultiHostMultiAdapter2 == null) {
            return;
        }
        iMultiHostMultiAdapter2.LLILL(param, interfaceC75706TnS);
    }

    @Override // X.InterfaceC75719Tnf
    public final void LLILLIZIL(C76012TsO c76012TsO, InterfaceC75414Tik<LeaveChannelResult> interfaceC75414Tik) {
        IMultiHostMultiAdapter iMultiHostMultiAdapter = this.LJLJLJ;
        if (iMultiHostMultiAdapter != null) {
            iMultiHostMultiAdapter.LLILLIZIL(c76012TsO, interfaceC75414Tik);
        }
    }

    @Override // X.InterfaceC75720Tng
    public final void LLJI(C75759ToJ param, InterfaceC75706TnS<OLV> interfaceC75706TnS) {
        Object obj;
        Long l;
        boolean z;
        o.LJIIIZ(param, "param");
        if (O70("invite")) {
            Map<String, Object> map = param.LJLJLJ;
            if (map != null) {
                obj = map.get("webcast_sdk_version");
            } else {
                obj = null;
            }
            if ((obj instanceof Long) && (l = (Long) obj) != null) {
                long longValue = l.longValue();
                if (longValue > 0 && longValue < MtCoHostCrossRoomPushMinVersionSetting.INSTANCE.getValue()) {
                    C30868C9o.LIZJ(R.string.kj1);
                    long j = param.LJLJI;
                    long j2 = param.LJLJJI;
                    if (C8E.LIZLLL().eU("MultiCoHostMonitorHelper") && j2 > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    new C75878TqE().LJJJJZ(j, C75545Tkr.LIZIZ(null), "multi_arch", z);
                    return;
                }
            }
            if (param.LJLJJI <= 0) {
                C30868C9o.LIZJ(R.string.kim);
                return;
            }
        }
        if (eU("invite") && param.LJLJJI > 0) {
            IMultiHostCrossAdapter iMultiHostCrossAdapter = this.LJLJLLL;
            if (iMultiHostCrossAdapter != null) {
                iMultiHostCrossAdapter.LLJI(param, interfaceC75706TnS);
                return;
            }
            return;
        }
        IMultiHostMultiAdapter iMultiHostMultiAdapter = this.LJLJLJ;
        if (iMultiHostMultiAdapter == null) {
            return;
        }
        iMultiHostMultiAdapter.LLJI(param, interfaceC75706TnS);
    }

    @Override // X.InterfaceC75719Tnf
    public final void LJJLJLI(C75993Ts5 c75993Ts5, InterfaceC75414Tik<PermitResult> interfaceC75414Tik, Map<String, ? extends Object> map) {
        IMultiHostMultiAdapter iMultiHostMultiAdapter = this.LJLJLJ;
        if (iMultiHostMultiAdapter != null) {
            iMultiHostMultiAdapter.LJJLJLI(c75993Ts5, interfaceC75414Tik, map);
        }
    }

    @Override // X.InterfaceC75719Tnf
    public final void LLFZ(C75911Tql c75911Tql, InterfaceC75414Tik<ReplyResult> interfaceC75414Tik, Map<String, ? extends Object> map) {
        IMultiHostMultiAdapter iMultiHostMultiAdapter = this.LJLJLJ;
        if (iMultiHostMultiAdapter != null) {
            iMultiHostMultiAdapter.LLFZ(c75911Tql, interfaceC75414Tik, map);
        }
    }

    @Override // X.InterfaceC75594Tle
    public final void LLIIL(Context context, Room room, DataChannel dataChannel) {
        C76615U5b c76615U5b;
        IMultiHostCrossAdapter iMultiHostCrossAdapter;
        Boolean bool;
        if (room == null || context == null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("attach_base");
            LIZ.append(", roomId=");
            LIZ.append(room);
            LIZ.append(", context=");
            LIZ.append(context);
            JBR.LJIIJ(LIZ, ", return", LIZ, "MultiHostService");
            return;
        }
        StringBuilder LIZJ = b1.LIZJ("attach_base", ", roomId = ");
        LIZJ.append(Long.valueOf(room.getId()));
        C0NB.LJIIIZ("MultiHostService", X1D.LIZIZ(LIZJ));
        LJLLI = MtCoHostCrossBizNewArcSetting.isEnable();
        this.LJLIL = true;
        this.LJLJI = dataChannel;
        this.LJLJJI = room;
        if (dataChannel != null && (bool = (Boolean) dataChannel.kv0(UserIsAnchorChannel.class)) != null) {
            bool.booleanValue();
        }
        this.LJLJJL = (ILinkMicService) CN1.LIZ(ILinkMicService.class);
        MixInfo.Builder builder = new MixInfo.Builder();
        builder.setStreamUrl(room.getStreamUrl().LIZ());
        this.LJLJL = new C75745To5(true, builder.build(), new C78688UuS(), false, false, null, new N3X(N3W.LIZ), false, new TS3(), C74616TQe.LJLIL, 1208);
        ILinkMicService iLinkMicService = this.LJLJJL;
        if (iLinkMicService != null) {
            c76615U5b = iLinkMicService.builder();
            if (c76615U5b != null) {
                c76615U5b.LIZ = room;
                this.LJLJJLL = c76615U5b.LIZ(context);
                this.LJLJLJ = (IMultiHostMultiAdapter) CN1.LIZ(IMultiHostMultiAdapter.class);
                this.LJLJLLL = (IMultiHostCrossAdapter) CN1.LIZ(IMultiHostCrossAdapter.class);
                if (LJJJJLI() && (iMultiHostCrossAdapter = this.LJLJLLL) != null) {
                    iMultiHostCrossAdapter.i9(room, dataChannel, context, this.LJLJL, this.LJLJJLL);
                }
                IMultiHostMultiAdapter iMultiHostMultiAdapter = this.LJLJLJ;
                if (iMultiHostMultiAdapter != null) {
                    iMultiHostMultiAdapter.i9(room, dataChannel, context, this.LJLJL, this.LJLJJLL);
                }
                LJJJJJ("attach_base", true);
                return;
            }
        } else {
            c76615U5b = null;
        }
        StringBuilder LIZJ2 = b1.LIZJ("attach_base", ", roomId = ");
        LIZJ2.append(Long.valueOf(room.getId()));
        LIZJ2.append(", builder=");
        LIZJ2.append(c76615U5b);
        LIZJ2.append(", return");
        C0NB.LJIIIZ("MultiHostService", X1D.LIZIZ(LIZJ2));
    }

    @Override // X.InterfaceC75594Tle
    public final void LJJZZI(ViewGroup viewGroup, FrameLayout frameLayout, LifecycleOwner lifecycleOwner, boolean z) {
        if (z) {
            if (C44432HcC.LJIIJJI(this.LJLJJI) > 0) {
                IMultiHostCrossAdapter iMultiHostCrossAdapter = this.LJLJLLL;
                if (iMultiHostCrossAdapter != null) {
                    iMultiHostCrossAdapter.LJJZZI(viewGroup, frameLayout, lifecycleOwner, z);
                    return;
                }
                return;
            }
            IMultiHostMultiAdapter iMultiHostMultiAdapter = this.LJLJLJ;
            if (iMultiHostMultiAdapter == null) {
                return;
            }
            iMultiHostMultiAdapter.LJJZZI(viewGroup, frameLayout, lifecycleOwner, z);
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("startCoHostUI");
        LIZ.append(", isEnterRoom=");
        LIZ.append(z);
        if (eU(X1D.LIZIZ(LIZ))) {
            IMultiHostCrossAdapter iMultiHostCrossAdapter2 = this.LJLJLLL;
            if (iMultiHostCrossAdapter2 == null) {
                return;
            }
            iMultiHostCrossAdapter2.LJJZZI(viewGroup, frameLayout, lifecycleOwner, z);
            return;
        }
        IMultiHostMultiAdapter iMultiHostMultiAdapter2 = this.LJLJLJ;
        if (iMultiHostMultiAdapter2 == null) {
            return;
        }
        iMultiHostMultiAdapter2.LJJZZI(viewGroup, frameLayout, lifecycleOwner, z);
    }
}
