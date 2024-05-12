package X;

import Y.IDcS135S0200000_1;
import com.ss.android.ugc.aweme.im.sdk.iescore.api.PlatformApi;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;

/* renamed from: X.2zM, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C76482zM implements InterfaceC76502zO {
    public static final C76482zM LIZ;
    public static final C62822Ol8 LIZIZ;
    public static final AtomicBoolean LIZJ;

    static {
        C76482zM c76482zM = new C76482zM();
        LIZ = c76482zM;
        LIZIZ = C221108m2.LIZIZ(C75452xh.LJLIL);
        LIZJ = new AtomicBoolean(false);
        if (C3YZ.LIZ()) {
            LJII(C76462zK.LJLIL);
        } else {
            EventBus.LIZJ().LJIILJJIL(c76482zM);
        }
    }

    public static void LJ() {
        C34B.LIZIZ("NetworkDependImpl", "Network Available");
        Iterator it = ((CopyOnWriteArraySet) LIZIZ.getValue()).iterator();
        while (it.hasNext()) {
            InterfaceC76442zI interfaceC76442zI = (InterfaceC76442zI) it.next();
            EnumC115234ff enumC115234ff = EnumC115234ff.CONNECTED;
            LIZ.getClass();
            interfaceC76442zI.LIZ(new C76512zP(enumC115234ff, LIZJ()));
        }
    }

    public static EnumC76492zN LIZJ() {
        if (C48203Ivv.LIZLLL(EF7.LIZIZ())) {
            return EnumC76492zN.MOBILE;
        }
        if (C48203Ivv.LJFF(EF7.LIZIZ())) {
            return EnumC76492zN.WIFI;
        }
        return EnumC76492zN.UNKNOWN;
    }

    public static final boolean LIZLLL() {
        if (C3YZ.LIZ()) {
            return LIZJ.get();
        }
        return C48203Ivv.LJ(EF7.LIZIZ());
    }

    public static final void LIZ(InterfaceC76442zI callback) {
        o.LJIIIZ(callback, "callback");
        ((CopyOnWriteArraySet) LIZIZ.getValue()).add(callback);
    }

    public static void LJII(InterfaceC65784Pro interfaceC65784Pro) {
        if (C73098SmU.LJFF(C16880lQ.LLLLIIIILLL())) {
            interfaceC65784Pro.invoke();
        } else {
            XKX.LIZLLL(C48841JEv.LIZ(EXV.LIZ), null, null, new C72882tY(interfaceC65784Pro, null), 3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x006b -> B:10:0x0022). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.InterfaceC67352kd<? super X.C76800UCe> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof X.C72902ta
            if (r0 == 0) goto L73
            r4 = r8
            X.2ta r4 = (X.C72902ta) r4
            int r2 = r4.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L73
            int r2 = r2 - r1
            r4.LJLJJI = r2
        L12:
            java.lang.Object r1 = r4.LJLILLLLZI
            X.NAu r5 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r4.LJLJJI
            r3 = 1
            if (r0 == 0) goto L6e
            if (r0 != r3) goto L7c
            X.2zM r2 = r4.LJLIL
            X.C141335gf.LIZJ(r1)
        L22:
            X.MBA r0 = r4.getContext()
            X.C79146V4k.LJJIIJ(r0)
            android.content.Context r0 = X.EF7.LIZIZ()
            boolean r6 = X.C48203Ivv.LJ(r0)
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "Poll network condition, is network available "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r1 = X.X1D.LIZIZ(r1)
            java.lang.String r0 = "NetworkDependImpl"
            X.C34B.LIZIZ(r0, r1)
            if (r6 == 0) goto L59
            java.util.concurrent.atomic.AtomicBoolean r1 = X.C76482zM.LIZJ
            r0 = 0
            boolean r0 = r1.compareAndSet(r0, r3)
            if (r0 == 0) goto L59
            X.2zL r0 = X.C76472zL.LJLIL
            r2.getClass()
            LJII(r0)
        L59:
            java.util.concurrent.atomic.AtomicBoolean r0 = X.C76482zM.LIZJ
            boolean r0 = r0.get()
            if (r0 != 0) goto L79
            r4.LJLIL = r2
            r4.LJLJJI = r3
            r0 = 5000(0x1388, double:2.4703E-320)
            java.lang.Object r0 = X.C1JD.LIZJ(r0, r4)
            if (r0 != r5) goto L22
            return r5
        L6e:
            X.C141335gf.LIZJ(r1)
            r2 = r7
            goto L59
        L73:
            X.2ta r4 = new X.2ta
            r4.<init>(r7, r8)
            goto L12
        L79:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L7c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C76482zM.LIZIZ(X.2kd):java.lang.Object");
    }

    @QD3
    public final void onNetworkEvent(C76522zQ event) {
        EnumC115234ff enumC115234ff;
        EnumC76492zN enumC76492zN;
        o.LJIIIZ(event, "event");
        if (C48203Ivv.LJ(EF7.LIZIZ())) {
            enumC115234ff = EnumC115234ff.CONNECTED;
        } else {
            enumC115234ff = EnumC115234ff.DISCONNECTED;
        }
        int i = event.LJLIL;
        if (i != 1) {
            if (i != 2) {
                enumC76492zN = EnumC76492zN.UNKNOWN;
            } else {
                enumC76492zN = EnumC76492zN.WIFI;
            }
        } else {
            enumC76492zN = EnumC76492zN.MOBILE;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("NetworkChangeEvent received: ");
        LIZ2.append(enumC115234ff);
        C34B.LIZIZ("NetworkDependImpl", X1D.LIZIZ(LIZ2));
        Iterator it = ((CopyOnWriteArraySet) LIZIZ.getValue()).iterator();
        while (it.hasNext()) {
            ((InterfaceC76442zI) it.next()).LIZ(new C76512zP(enumC115234ff, enumC76492zN));
        }
    }

    public final void LJFF(C114724eq request, IDcS135S0200000_1 iDcS135S0200000_1) {
        o.LJIIIZ(request, "request");
        PlatformApi.LIZ.LIZLLL(request, iDcS135S0200000_1);
    }

    public final void LJI(C114724eq request, IDcS135S0200000_1 iDcS135S0200000_1) {
        o.LJIIIZ(request, "request");
        PlatformApi.LIZ.LJ(request, iDcS135S0200000_1);
    }
}
