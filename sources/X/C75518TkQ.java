package X;

import Y.ARunnableS49S0100000_13;
import android.os.Handler;
import android.os.SystemClock;
import com.bytedance.android.live.liveinteract.multihost.biz.link.view.MultiCoHostWindowManager;
import com.bytedance.android.live.liveinteract.platform.statemanager.iablility.UserState;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiHostLinkStateLoopIntervalSetting;
import com.bytedance.android.livesdk.model.message.linkcore.Player;
import java.util.Iterator;
import kotlin.jvm.internal.AqS179S0100000_13;

/* renamed from: X.TkQ, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75518TkQ {
    public boolean LIZIZ;
    public boolean LIZJ;
    public InterfaceC75478Tjm LJFF;
    public C75406Tic LJI;
    public final C73318Sq2 LIZ = new C73318Sq2();
    public final Handler LIZLLL = new Handler(C16880lQ.LLJJJJ());
    public long LJ = SystemClock.elapsedRealtime();
    public final C75519TkR LJII = new C75519TkR(this);
    public final ARunnableS49S0100000_13 LJIIIIZZ = new ARunnableS49S0100000_13(this, 146);
    public final ARunnableS49S0100000_13 LJIIIZ = new ARunnableS49S0100000_13(this, 147);

    public final boolean LIZJ() {
        InterfaceC75478Tjm interfaceC75478Tjm = this.LJFF;
        if (interfaceC75478Tjm == null || !interfaceC75478Tjm.LIZIZ()) {
            return false;
        }
        return true;
    }

    public final void LIZ(boolean z) {
        String str;
        InterfaceC74695TTf LLIIJLIL;
        InterfaceC75478Tjm interfaceC75478Tjm = this.LJFF;
        if (interfaceC75478Tjm != null && interfaceC75478Tjm.LIZIZ()) {
            C75883TqJ LJI = C8E.LIZLLL().LJI(C44432HcC.LJFF());
            if (LJI != null) {
                str = LJI.LJII;
            } else {
                str = null;
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("changeSelfWindowPauseUI: userId=");
            LIZ.append(C44432HcC.LJFF());
            LIZ.append(",linkMicId=");
            LIZ.append(str);
            LIZ.append(", isBackground=");
            FT5.LJ(LIZ, z, LIZ, "MultiHostAnchorStateManager");
            C75406Tic c75406Tic = this.LJI;
            if (c75406Tic != null) {
                c75406Tic.LIZ(new AqS179S0100000_13(this, 411), !z);
            }
            InterfaceC75441TjB LJJIJL = C8E.LIZLLL().LJJIJL();
            if (LJJIJL != null && (LLIIJLIL = LJJIJL.LLIIJLIL()) != null) {
                LLIIJLIL.LJJIIZ("MultiHostAnchorStateManager_onForeForegroundChange");
            }
            LIZIZ("changeSelfPauseUIState", false);
        }
    }

    public final void LIZLLL(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 4) {
                    return;
                }
                C75642TmQ.LJJLI((int) ((SystemClock.elapsedRealtime() - this.LJ) / 1000), "end_live");
                return;
            }
            C75642TmQ.LJJLI(0, "left");
            return;
        }
        C75642TmQ.LJJLI((int) ((SystemClock.elapsedRealtime() - this.LJ) / 1000), "go_on_live");
    }

    public final void LIZIZ(String str, boolean z) {
        boolean z2;
        UserState LIZIZ;
        boolean z3;
        boolean z4;
        MultiCoHostWindowManager LIZJ;
        ViewOnClickListenerC76430Tz8 LIZIZ2;
        MultiCoHostWindowManager LIZJ2;
        ViewOnClickListenerC76430Tz8 LIZIZ3;
        MultiCoHostWindowManager LIZJ3;
        Iterator<C75883TqJ> it = C8E.LIZLLL().LJIILJJIL().iterator();
        while (true) {
            ViewOnClickListenerC76430Tz8 viewOnClickListenerC76430Tz8 = null;
            if (it.hasNext()) {
                C75883TqJ next = it.next();
                InterfaceC75478Tjm interfaceC75478Tjm = this.LJFF;
                if (interfaceC75478Tjm != null && (LIZJ3 = interfaceC75478Tjm.LIZJ()) != null) {
                    viewOnClickListenerC76430Tz8 = LIZJ3.LIZIZ(next.LJII);
                }
                if (viewOnClickListenerC76430Tz8 == null) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("isAllUserUIOnline: false, userId = ");
                    LIZ.append(next.LIZ);
                    LIZ.append(", return by cohostWindow == null");
                    C0NB.LJIIIZ("MultiHostAnchorStateManager", X1D.LIZIZ(LIZ));
                    break;
                }
                InterfaceC75478Tjm interfaceC75478Tjm2 = this.LJFF;
                if (interfaceC75478Tjm2 != null && (LIZJ2 = interfaceC75478Tjm2.LIZJ()) != null && (LIZIZ3 = LIZJ2.LIZIZ(next.LJII)) != null && LIZIZ3.getIsPauseUIShowing()) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("isAllUserUIOnline: false, userId = ");
                    LIZ2.append(next.LIZ);
                    LIZ2.append(", return by getIsPauseUIShowing == true");
                    C0NB.LJIIIZ("MultiHostAnchorStateManager", X1D.LIZIZ(LIZ2));
                    break;
                }
            } else {
                C0NB.LJIIIZ("MultiHostAnchorStateManager", "isAllUserUIOnline: true");
                z2 = true;
                break;
            }
        }
        z2 = false;
        if (z2) {
            for (C75883TqJ c75883TqJ : C8E.LIZLLL().LJIILJJIL()) {
                C75406Tic c75406Tic = this.LJI;
                if (c75406Tic == null || (LIZIZ = c75406Tic.LIZIZ(c75883TqJ.LJII)) == null) {
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("isAllUserLocalStateMatchRemoteState: false, return by userState = null, userId = ");
                    C0RN.LJ(LIZ3, c75883TqJ.LIZ, LIZ3, "MultiHostAnchorStateManager");
                } else {
                    if (LIZIZ.onlineUserState == 2) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    Player player = LIZIZ.user;
                    if (player != null && player.uid == C44432HcC.LJFF()) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    InterfaceC75478Tjm interfaceC75478Tjm3 = this.LJFF;
                    if (interfaceC75478Tjm3 != null && (LIZJ = interfaceC75478Tjm3.LIZJ()) != null && (LIZIZ2 = LIZJ.LIZIZ(c75883TqJ.LJII)) != null) {
                        boolean isPauseUIShowing = LIZIZ2.getIsPauseUIShowing();
                        if (isPauseUIShowing != z3) {
                            StringBuilder LJI = JBR.LJI("isAllUserLocalStateMatchRemoteState: false, isCurrentRoom=", z4, ", userId = ");
                            V1I.LIZJ(LJI, c75883TqJ.LIZ, ", pauseStateRemote=", z3);
                            LJI.append(", pauseStateLocal=");
                            LJI.append(isPauseUIShowing);
                            C0NB.LJIIIZ("MultiHostAnchorStateManager", X1D.LIZIZ(LJI));
                        }
                    } else {
                        C0NB.LJIIIZ("MultiHostAnchorStateManager", "isAllUserLocalStateMatchRemoteState: false, cohostWindow = null");
                    }
                }
            }
            C0NB.LJIIIZ("MultiHostAnchorStateManager", "isAllUserLocalStateMatchRemoteState: true");
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("checkUserLinkState: stopSyncRemoteState, source=");
            LIZ4.append(str);
            LIZ4.append(", syncImmediately=");
            LIZ4.append(z);
            C0NB.LJIIIZ("MultiHostAnchorStateManager", X1D.LIZIZ(LIZ4));
            this.LIZLLL.removeCallbacks(this.LJIIIZ);
            return;
        }
        StringBuilder LIZ5 = X1D.LIZ();
        LIZ5.append("checkUserLinkState: startSyncRemoteState, source=");
        LIZ5.append(str);
        LIZ5.append(", syncImmediately=");
        LIZ5.append(z);
        C0NB.LJIIIZ("MultiHostAnchorStateManager", X1D.LIZIZ(LIZ5));
        C0NB.LJIIIZ("MultiHostAnchorStateManager", "startSyncRemoteState");
        this.LIZLLL.removeCallbacks(this.LJIIIZ);
        if (z) {
            this.LJIIIZ.run();
        } else {
            this.LIZLLL.postDelayed(this.LJIIIZ, MultiHostLinkStateLoopIntervalSetting.INSTANCE.getValue() * 1000);
        }
    }
}
