package Y;

import X.C40741Fyr;
import X.G16;
import X.InterfaceC36488ETs;
import X.InterfaceC37146Ehy;
import X.R47;
import X.X1D;
import com.ss.android.ugc.aweme.IMandatoryLoginService;
import com.ss.android.ugc.aweme.bullet.bridge.common.LoginMethod;
import com.ss.android.ugc.aweme.services.SmartLockService;

/* loaded from: classes7.dex */
public class IDeS96S0200000_6 implements R47 {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.R47
    public final void onResult(int i, int i2, Object obj) {
        switch (this.$t) {
            case 0:
                onResult$0(this, i, i2, obj);
                return;
            case 1:
                onResult$1(this, i, i2, obj);
                return;
            case 2:
                onResult$2(this, i, i2, obj);
                return;
            case 3:
                onResult$3(this, i, i2, obj);
                return;
            case 4:
                onResult$4(this, i, i2, obj);
                return;
            case 5:
                onResult$5(this, i, i2, obj);
                return;
            default:
                return;
        }
    }

    public IDeS96S0200000_6(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    public static final void onResult$0(IDeS96S0200000_6 iDeS96S0200000_6, int i, int i2, Object obj) {
        if (i == 1) {
            if (i2 == 1) {
                ((LoginMethod) iDeS96S0200000_6.l0).LIZLLL((InterfaceC37146Ehy) iDeS96S0200000_6.l1);
            } else {
                ((LoginMethod) iDeS96S0200000_6.l0).LIZJ((InterfaceC37146Ehy) iDeS96S0200000_6.l1);
            }
        }
    }

    public static final void onResult$1(IDeS96S0200000_6 iDeS96S0200000_6, int i, int i2, Object obj) {
        if (i == 1) {
            if (i2 == 1) {
                ((LoginMethod) iDeS96S0200000_6.l0).LIZLLL((InterfaceC37146Ehy) iDeS96S0200000_6.l1);
            } else {
                ((LoginMethod) iDeS96S0200000_6.l0).LIZJ((InterfaceC37146Ehy) iDeS96S0200000_6.l1);
            }
        }
    }

    public static final void onResult$2(IDeS96S0200000_6 iDeS96S0200000_6, int i, int i2, Object obj) {
        if (i == 1) {
            if (i2 == 1) {
                com.ss.android.ugc.aweme.fe.method.LoginMethod loginMethod = (com.ss.android.ugc.aweme.fe.method.LoginMethod) iDeS96S0200000_6.l0;
                InterfaceC36488ETs interfaceC36488ETs = (InterfaceC36488ETs) iDeS96S0200000_6.l1;
                loginMethod.getClass();
                com.ss.android.ugc.aweme.fe.method.LoginMethod.LIZJ(interfaceC36488ETs);
                return;
            }
            ((com.ss.android.ugc.aweme.fe.method.LoginMethod) iDeS96S0200000_6.l0).LIZIZ((InterfaceC36488ETs) iDeS96S0200000_6.l1);
        }
    }

    public static final void onResult$3(IDeS96S0200000_6 iDeS96S0200000_6, int i, int i2, Object obj) {
        if (i == 1) {
            if (i2 == 1) {
                com.ss.android.ugc.aweme.fe.method.LoginMethod loginMethod = (com.ss.android.ugc.aweme.fe.method.LoginMethod) iDeS96S0200000_6.l0;
                InterfaceC36488ETs interfaceC36488ETs = (InterfaceC36488ETs) iDeS96S0200000_6.l1;
                loginMethod.getClass();
                com.ss.android.ugc.aweme.fe.method.LoginMethod.LIZJ(interfaceC36488ETs);
                return;
            }
            ((com.ss.android.ugc.aweme.fe.method.LoginMethod) iDeS96S0200000_6.l0).LIZIZ((InterfaceC36488ETs) iDeS96S0200000_6.l1);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0026, code lost:
    
        if (r5 == 1) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onResult$4(Y.IDeS96S0200000_6 r4, int r5, int r6, java.lang.Object r7) {
        /*
            r3 = 1
            if (r5 != r3) goto L26
            if (r6 != r3) goto L28
        L6:
            X.FcR r0 = X.C38986FRu.LIZ()
            boolean r0 = r0.LIZ()
            if (r0 == 0) goto L1e
            X.FRt r2 = X.C38985FRt.LIZIZ
            java.lang.Object r0 = r4.l0
            com.ss.android.ugc.aweme.account.main.LoginAndConsentAssem r0 = (com.ss.android.ugc.aweme.account.main.LoginAndConsentAssem) r0
            X.1qj r1 = r0.LJLIL
            if (r1 == 0) goto L33
            r0 = 0
            r2.LIZJ(r1, r3, r0)
        L1e:
            X.IGg r0 = X.IWF.LJJLIIIIJ()
            r0.LIZIZ()
            return
        L26:
            if (r5 != r3) goto L1e
        L28:
            r0 = 2
            if (r6 != r0) goto L1e
            java.lang.Object r0 = r4.l1
            com.ss.android.ugc.aweme.IMandatoryLoginService r0 = (com.ss.android.ugc.aweme.IMandatoryLoginService) r0
            r0.skipLoginForTest()
            goto L1e
        L33:
            java.lang.String r0 = "activity"
            kotlin.jvm.internal.o.LJIJI(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.IDeS96S0200000_6.onResult$4(Y.IDeS96S0200000_6, int, int, java.lang.Object):void");
    }

    public static final void onResult$5(IDeS96S0200000_6 iDeS96S0200000_6, int i, int i2, Object obj) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("showMandatoryLoginPage result action:");
        LIZ.append(i);
        C40741Fyr.LIZIZ(X1D.LIZIZ(LIZ));
        if (i != 1) {
            return;
        }
        if (i2 == 2) {
            ((IMandatoryLoginService) iDeS96S0200000_6.l0).skipLoginForTest();
        } else if (i2 == 1) {
            if (SmartLockService.createISmartLockServicebyMonsterPlugin(false).isLoginSuccessBySmartLock()) {
                ((G16) iDeS96S0200000_6.l1).LIZLLL();
                return;
            }
        } else if (i2 != 1 && i2 != 2) {
            return;
        }
        ((G16) iDeS96S0200000_6.l1).LIZLLL();
    }
}
