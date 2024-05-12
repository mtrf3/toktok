package X;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.AqS183S0100000_1;

/* renamed from: X.4bA, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C112444bA {
    public static final /* synthetic */ int LJIIJ = 0;
    public volatile boolean LIZ;
    public volatile boolean LIZIZ;
    public C112424b8 LIZJ;
    public boolean LIZLLL;
    public boolean LJFF;
    public boolean LJI;
    public volatile boolean LJII;
    public volatile boolean LJIIIIZZ;
    public final List<InterfaceC76042ye> LJ = new ArrayList();
    public final XJO LJIIIZ = XJR.LIZ();

    public C112444bA() {
        if (C34235Dc7.LIZ()) {
            C112414b7 c112414b7 = C112414b7.LIZ;
            c112414b7.getClass();
            C86550Xxy c86550Xxy = C86550Xxy.LIZIZ;
            c86550Xxy.LIZ.LJIIJJI(c112414b7);
            c86550Xxy.LJIIIIZZ(c112414b7, C112414b7.LJ);
            C112414b7.LIZIZ = new AqS167S0100000_1(this, 492);
            C112414b7.LIZJ = new AqS183S0100000_1(this, 108);
            return;
        }
        if (!((Boolean) C52748Kn2.LIZ.getValue()).booleanValue()) {
            return;
        }
        ILiveOuterService LJJJLL = LiveOuterService.LJJJLL();
        if (LJJJLL.LJJIJIIJI()) {
            C34B.LJI("IMNotificationPlayer", "[init], live sdk has initialized, directly register live listener");
            C34B.LJI("IMNotificationPlayer", "[registerLiveBroadcastStatusChangeListener], add pure mode listener");
            LiveOuterService.LJJJLL().LJJIJIL().LJJJI(new C112524bI(this));
        } else {
            C34B.LJI("IMNotificationPlayer", "[init], waiting live sdk initialized...");
            LJJJLL.LJFF(new InterfaceC39796Fjc() { // from class: X.4bF
                @Override // X.InterfaceC39796Fjc
                public final void LIZ() {
                    C112444bA c112444bA = C112444bA.this;
                    c112444bA.getClass();
                    C34B.LJI("IMNotificationPlayer", "[registerLiveBroadcastStatusChangeListener], add pure mode listener");
                    LiveOuterService.LJJJLL().LJJIJIL().LJJJI(new C112524bI(c112444bA));
                }
            });
        }
    }

    public final synchronized void LIZ(InterfaceC76042ye interfaceC76042ye) {
        ((ArrayList) this.LJ).add(interfaceC76042ye);
    }

    public final void LIZJ(long j) {
        boolean z;
        Aweme LIZIZ;
        if (!C3GW.LJIIIIZZ() && C31Q.LJIILLIIL.LJ().LIZJ == 0) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("showNotification, delayTime = ");
            LIZ.append(j);
            C34B.LJI("IMNotificationPlayer", X1D.LIZIZ(LIZ));
            if (this.LIZLLL) {
                C34B.LJI("IMNotificationPlayer", "pure mode is on, stop recursion");
                return;
            }
            if (j > 0) {
                XKX.LIZLLL(C48841JEv.LIZ(C78613UtF.LIZ), null, null, new C75872yN(j, this, null), 3);
                return;
            }
            if (this.LIZ) {
                return;
            }
            ComponentCallbacks2 LJIIIIZZ = C84763XOl.LJIIIIZZ();
            if (LJIIIIZZ != null && (LJIIIIZZ instanceof InterfaceC55058LjC) && (((InterfaceC55058LjC) LJIIIIZZ).getCurFragment() instanceof InterfaceC54054LJi) && (LIZIZ = LNH.LIZIZ((ActivityC45651qj) LJIIIIZZ)) != null && LIZIZ.isAd()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                LIZJ(1000L);
                return;
            }
            if (C86550Xxy.LIZIZ.LIZLLL(true)) {
                LIZJ(1000L);
                return;
            }
            Activity LJIIIIZZ2 = C84763XOl.LJIIIIZZ();
            if (LJIIIIZZ2 != null && C79004UzY.LJJIJIIJI(LJIIIIZZ2)) {
                C34B.LJI("IMNotificationPlayer", "show: ban in-app push in landscape");
                return;
            }
            boolean LJIILIIL = C53765L8f.LJIILIIL("NOTIFICATION");
            boolean isShowing = LRP.LIZIZ.isShowing();
            if (LJIILIIL && isShowing) {
                LIZJ(1000L);
                return;
            } else {
                this.LJFF = true;
                XKX.LIZLLL(C48841JEv.LIZ(C78613UtF.LIZ), null, null, new C75892yP(this, null), 3);
                return;
            }
        }
        this.LIZIZ = false;
        this.LIZ = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x010f, code lost:
    
        if (r10 != 12) goto L38;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x002e  */
    /* JADX WARN: Type inference failed for: r2v13, types: [T, java.lang.Boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object LIZLLL(X.C112444bA r82, X.InterfaceC67352kd<? super X.C76800UCe> r83) {
        /*
            Method dump skipped, instructions count: 1106
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C112444bA.LIZLLL(X.4bA, X.2kd):java.lang.Object");
    }

    public final void LIZIZ(C112454bB c112454bB, boolean z) {
        List LLJI;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[invokeIMNotificationShowListeners], failToShow = ");
        LIZ.append(z);
        C34B.LJI("IMNotificationPlayer", X1D.LIZIZ(LIZ));
        synchronized (this) {
            LLJI = ORZ.LLJI(this.LJ);
        }
        if (!LLJI.isEmpty()) {
            for (int size = LLJI.size() - 1; -1 < size; size--) {
                ((InterfaceC76042ye) ListProtector.get(LLJI, size)).LIZ(c112454bB, z);
            }
        }
    }
}
