package X;

import android.app.Activity;
import android.content.Context;
import android.os.CancellationSignal;
import kotlin.jvm.internal.IDqS416S0100000;
import kotlin.jvm.internal.o;

/* renamed from: X.0uE, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22340uE {
    public static final /* synthetic */ int LIZIZ = 0;
    public final Context LIZ;

    public C22340uE(Context context) {
        this.LIZ = context;
    }

    public final Object LIZ(C1ZW request, Activity activity, InterfaceC67352kd interfaceC67352kd) {
        final XKS xks = new XKS(1, C78555UsJ.LJJII(interfaceC67352kd));
        xks.LJIIL();
        CancellationSignal cancellationSignal = new CancellationSignal();
        xks.LJIILIIL(new IDqS416S0100000(cancellationSignal, 286));
        InterfaceC22350uF<AbstractC22250u5, AbstractC23600wG> interfaceC22350uF = new InterfaceC22350uF<AbstractC22250u5, AbstractC23600wG>() { // from class: X.1ZZ
            @Override // X.InterfaceC22350uF
            public final void LIZ(AbstractC23600wG abstractC23600wG) {
                AbstractC23600wG e = abstractC23600wG;
                o.LJIIIZ(e, "e");
                XJL<AbstractC22250u5> xjl = xks;
                C3C4 LIZ = C141335gf.LIZ(e);
                C3C5.m7constructorimpl(LIZ);
                xjl.resumeWith(LIZ);
            }

            @Override // X.InterfaceC22350uF
            public final void onResult(AbstractC22250u5 result) {
                o.LJIIIZ(result, "result");
                XJL<AbstractC22250u5> xjl = xks;
                C3C5.m7constructorimpl(result);
                xjl.resumeWith(result);
            }
        };
        ExecutorC22320uC executorC22320uC = new ExecutorC22320uC();
        o.LJIIIZ(request, "request");
        o.LJIIIZ(activity, "activity");
        InterfaceC22380uI LIZ = C22390uJ.LIZ(this.LIZ);
        if (LIZ == null) {
            interfaceC22350uF.LIZ(new C35481aK("createCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added"));
        } else {
            LIZ.onCreateCredential(request, activity, cancellationSignal, executorC22320uC, interfaceC22350uF);
        }
        return xks.LJIIJJI();
    }

    public final Object LIZIZ(C22410uL c22410uL, Activity activity, InterfaceC67352kd<? super C22420uM> interfaceC67352kd) {
        final XKS xks = new XKS(1, C78555UsJ.LJJII(interfaceC67352kd));
        xks.LJIIL();
        CancellationSignal cancellationSignal = new CancellationSignal();
        xks.LJIILIIL(new IDqS416S0100000(cancellationSignal, 285));
        InterfaceC22350uF<C22420uM, AbstractC23670wN> interfaceC22350uF = new InterfaceC22350uF<C22420uM, AbstractC23670wN>() { // from class: X.1ZY
            @Override // X.InterfaceC22350uF
            public final void LIZ(AbstractC23670wN abstractC23670wN) {
                AbstractC23670wN e = abstractC23670wN;
                o.LJIIIZ(e, "e");
                XJL<C22420uM> xjl = xks;
                C3C4 LIZ = C141335gf.LIZ(e);
                C3C5.m7constructorimpl(LIZ);
                xjl.resumeWith(LIZ);
            }

            @Override // X.InterfaceC22350uF
            public final void onResult(C22420uM result) {
                o.LJIIIZ(result, "result");
                XJL<C22420uM> xjl = xks;
                C3C5.m7constructorimpl(result);
                xjl.resumeWith(result);
            }
        };
        ExecutorC22320uC executorC22320uC = new ExecutorC22320uC();
        o.LJIIIZ(activity, "activity");
        InterfaceC22380uI LIZ = C22390uJ.LIZ(this.LIZ);
        if (LIZ == null) {
            interfaceC22350uF.LIZ(new C35541aQ("getCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added"));
        } else {
            LIZ.onGetCredential(c22410uL, activity, cancellationSignal, executorC22320uC, interfaceC22350uF);
        }
        return xks.LJIIJJI();
    }
}
