package com.bytedance.ies.bullet.kit.web;

import X.AbstractC60426Nna;
import X.AbstractC60536NpM;
import X.C0XW;
import X.C59614NaU;
import X.C60218NkE;
import X.C60238NkY;
import X.C60251Nkl;
import X.C60258Nks;
import X.C60299NlX;
import X.C60320Nls;
import X.C60321Nlt;
import X.C60327Nlz;
import X.C60335Nm7;
import X.C60349NmL;
import X.C60357NmT;
import X.C60425NnZ;
import X.C60627Nqp;
import X.C60632Nqu;
import X.F21;
import X.F3T;
import X.InterfaceC40516FvE;
import X.InterfaceC60224NkK;
import X.InterfaceC60227NkN;
import X.InterfaceC60253Nkn;
import X.InterfaceC60269Nl3;
import X.InterfaceC60270Nl4;
import X.InterfaceC60283NlH;
import X.InterfaceC60359NmV;
import X.InterfaceC60369Nmf;
import X.InterfaceC60409NnJ;
import android.app.Application;
import android.content.Context;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class WebKitApi extends IWebKitApi<C60238NkY> {
    public boolean LJLJJI;
    public F3T LJLJJL;
    public InterfaceC60369Nmf LJLJJLL;

    @Override // X.AbstractC60290NlO, X.InterfaceC60250Nkk
    public final boolean LLLLIILL() {
        return true;
    }

    @Override // X.InterfaceC60250Nkk
    public final void LLLLIIIILLL() {
        Context context;
        if (!this.LJLJJI) {
            F3T f3t = this.LJLJJL;
            if (f3t != null) {
                f3t.LIZJ(C60218NkE.class);
            }
            F3T f3t2 = this.LJLJJL;
            if (f3t2 != null && (context = (Context) f3t2.LIZJ(Application.class)) != null) {
                InterfaceC60270Nl4 interfaceC60270Nl4 = (InterfaceC60270Nl4) C60299NlX.LIZ(this, InterfaceC60270Nl4.class);
                if (interfaceC60270Nl4 != null) {
                    C0XW c0xw = new C0XW(1);
                    C60357NmT c60357NmT = new C60357NmT();
                    c60357NmT.LIZ = new C60349NmL(this);
                    c0xw.LIZ = c60357NmT;
                    interfaceC60270Nl4.LJJIJ(context, c0xw);
                }
                this.LJLJJI = true;
            }
        }
    }

    @Override // X.InterfaceC60250Nkk
    public final F3T getProviderFactory() {
        return this.LJLJJL;
    }

    public static C59614NaU LIZ(Context context) {
        InterfaceC60409NnJ LIZJ;
        try {
            C60425NnZ c60425NnZ = (C60425NnZ) C60632Nqu.LIZ(C60425NnZ.class, "webx_webkit");
            AbstractC60536NpM LIZIZ = C60627Nqp.LIZIZ(c60425NnZ.getExtendableContext(), "createContainer");
            if (LIZIZ instanceof AbstractC60426Nna) {
                C60335Nm7 c60335Nm7 = C60327Nlz.LIZIZ;
                c60335Nm7.get().LIZIZ();
                LIZJ = ((AbstractC60426Nna) LIZIZ).LIZJ(context, C59614NaU.class);
                c60335Nm7.get().LIZ();
            } else {
                LIZJ = c60425NnZ.LIZJ(context, C59614NaU.class);
            }
            o.LJFF(LIZJ, "WebExtension.getContaine…t, SSWebView::class.java)");
            return (C59614NaU) LIZJ;
        } catch (Throwable unused) {
            return new C59614NaU(context, null, 6, 0);
        }
    }

    @Override // X.InterfaceC60250Nkk
    public final InterfaceC60224NkK LLLJ(C60320Nls c60320Nls) {
        if (c60320Nls instanceof InterfaceC60359NmV) {
            return new C60321Nlt(c60320Nls);
        }
        return null;
    }

    @Override // X.InterfaceC60250Nkk
    public final InterfaceC60253Nkn LLLLIIL(InterfaceC60283NlH interfaceC60283NlH) {
        if (interfaceC60283NlH instanceof InterfaceC60269Nl3) {
            return new C60258Nks(interfaceC60283NlH);
        }
        return null;
    }

    @Override // X.InterfaceC60250Nkk
    public final void LLLLII(InterfaceC40516FvE interfaceC40516FvE) {
    }

    @Override // X.InterfaceC60250Nkk
    public final void LLLL(InterfaceC60227NkN interfaceC60227NkN, F3T contextProviderFactory) {
        o.LJIIJ(contextProviderFactory, "contextProviderFactory");
        this.LJLJJLL = (InterfaceC60369Nmf) interfaceC60227NkN;
        this.LJLJJL = contextProviderFactory;
    }

    @Override // X.InterfaceC60250Nkk
    public final InterfaceC40516FvE LLLJL(F21 sessionInfo, List packageNames, C60251Nkl c60251Nkl, F3T providerFactory) {
        o.LJIIJ(sessionInfo, "sessionInfo");
        o.LJIIJ(packageNames, "packageNames");
        o.LJIIJ(providerFactory, "providerFactory");
        LLLLIIIILLL();
        return new C60238NkY(this, sessionInfo, packageNames, c60251Nkl, providerFactory);
    }
}
