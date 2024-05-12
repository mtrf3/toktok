package com.bytedance.ies.bullet.kit.lynx;

import X.C39973FmT;
import X.C60251Nkl;
import X.C60291NlP;
import X.C60292NlQ;
import X.C60299NlX;
import X.C60305Nld;
import X.C60310Nli;
import X.C60315Nln;
import X.C60317Nlp;
import X.C60320Nls;
import X.C62822Ol8;
import X.F21;
import X.F3T;
import X.InterfaceC40491Fup;
import X.InterfaceC40516FvE;
import X.InterfaceC60224NkK;
import X.InterfaceC60227NkN;
import X.InterfaceC60253Nkn;
import X.InterfaceC60283NlH;
import X.InterfaceC60284NlI;
import X.InterfaceC60316Nlo;
import X.InterfaceC60344NmG;
import com.lynx.tasm.LynxEnv;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class LynxKitApi extends ILynxKitApi<C60292NlQ> {
    public static volatile boolean LJLJL;
    public Throwable LJLJJI;
    public F3T LJLJJL;
    public InterfaceC60344NmG LJLJJLL;

    @Override // X.InterfaceC60250Nkk
    public final void LLLLIIIILLL() {
        boolean z;
        C60315Nln c60315Nln;
        InterfaceC60344NmG interfaceC60344NmG;
        InterfaceC60284NlI interfaceC60284NlI = (InterfaceC60284NlI) C60299NlX.LIZ(this, InterfaceC60284NlI.class);
        if (interfaceC60284NlI != null) {
            interfaceC60284NlI.LJIIL();
        }
        if (!LJLJL) {
            C39973FmT.LIZIZ(this, "start to init lynx lib", null, null, 6);
            C62822Ol8 c62822Ol8 = C60317Nlp.LIZIZ;
            if (!((C60317Nlp) c62822Ol8.getValue()).LIZ) {
                F3T f3t = this.LJLJJL;
                if (f3t == null || (interfaceC60344NmG = this.LJLJJLL) == null || (c60315Nln = interfaceC60344NmG.LIZ(f3t)) == null) {
                    c60315Nln = new C60315Nln();
                }
                C60317Nlp c60317Nlp = (C60317Nlp) c62822Ol8.getValue();
                int i = c60315Nln.LJLIL;
                c60317Nlp.getClass();
                new C60310Nli(i);
                c60317Nlp.LIZ = true;
            }
            try {
                InterfaceC60316Nlo interfaceC60316Nlo = (InterfaceC60316Nlo) C60299NlX.LIZ(this, InterfaceC60316Nlo.class);
                if (interfaceC60316Nlo != null) {
                    interfaceC60316Nlo.LJJIJIIJI(this);
                }
                InterfaceC60316Nlo interfaceC60316Nlo2 = (InterfaceC60316Nlo) C60299NlX.LIZ(this, InterfaceC60316Nlo.class);
                if (interfaceC60316Nlo2 != null) {
                    z = interfaceC60316Nlo2.LJIIZILJ();
                } else {
                    z = false;
                }
                LJLJL = z;
            } catch (Exception e) {
                C39973FmT.LIZJ(this, e, "init lynx failed");
                LJLJL = false;
                this.LJLJJI = e;
            }
        }
    }

    @Override // X.AbstractC60290NlO, X.InterfaceC60250Nkk
    public final String LLLJIL() {
        o.LJFF(LynxEnv.LJIIIZ(), "LynxEnv.inst()");
        return "2.10.16-rc.10";
    }

    @Override // com.bytedance.ies.bullet.kit.lynx.ILynxKitApi
    public final boolean LIZ() {
        return LJLJL;
    }

    @Override // com.bytedance.ies.bullet.kit.lynx.ILynxKitApi
    public final Throwable LIZIZ() {
        return this.LJLJJI;
    }

    @Override // X.InterfaceC60250Nkk
    public final F3T getProviderFactory() {
        return this.LJLJJL;
    }

    @Override // X.InterfaceC60250Nkk
    public final InterfaceC60224NkK LLLJ(C60320Nls c60320Nls) {
        return new C60305Nld(c60320Nls);
    }

    @Override // X.InterfaceC60250Nkk
    public final InterfaceC60253Nkn LLLLIIL(InterfaceC60283NlH interfaceC60283NlH) {
        if (interfaceC60283NlH instanceof InterfaceC40491Fup) {
            return new C60291NlP(interfaceC60283NlH);
        }
        return null;
    }

    @Override // X.InterfaceC60250Nkk
    public final void LLLLII(InterfaceC40516FvE interfaceC40516FvE) {
    }

    @Override // X.InterfaceC60250Nkk
    public final void LLLL(InterfaceC60227NkN interfaceC60227NkN, F3T contextProviderFactory) {
        o.LJIIJ(contextProviderFactory, "contextProviderFactory");
        this.LJLJJLL = (InterfaceC60344NmG) interfaceC60227NkN;
        this.LJLJJL = contextProviderFactory;
    }

    @Override // X.InterfaceC60250Nkk
    public final InterfaceC40516FvE LLLJL(F21 sessionInfo, List packageNames, C60251Nkl c60251Nkl, F3T providerFactory) {
        o.LJIIJ(sessionInfo, "sessionInfo");
        o.LJIIJ(packageNames, "packageNames");
        o.LJIIJ(providerFactory, "providerFactory");
        LLLLIIIILLL();
        return new C60292NlQ(this, sessionInfo, packageNames, c60251Nkl, providerFactory);
    }
}
