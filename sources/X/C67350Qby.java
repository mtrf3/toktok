package X;

import Y.ARunnableS15S0101000_11;
import android.content.Context;
import java.util.Collections;

/* renamed from: X.Qby, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67350Qby implements InterfaceC67293Qb3 {
    public static volatile C67439QdP LJ;
    public final InterfaceC67370QcI LIZ;
    public final InterfaceC67370QcI LIZIZ;
    public final InterfaceC67367QcF LIZJ;
    public final C67380QcS LIZLLL;

    public static C67350Qby LIZ() {
        C67439QdP c67439QdP = LJ;
        if (c67439QdP != null) {
            return c67439QdP.LJLJJL.get();
        }
        throw new IllegalStateException("Not initialized!");
    }

    public static void LIZIZ(Context context) {
        if (LJ == null) {
            synchronized (C67350Qby.class) {
                if (LJ == null) {
                    context.getClass();
                    LJ = new C67439QdP(context);
                }
            }
        }
    }

    public final C67292Qb2 LIZJ(C67220QZs c67220QZs) {
        java.util.Set singleton;
        if (c67220QZs instanceof InterfaceC67221QZt) {
            c67220QZs.getClass();
            singleton = Collections.unmodifiableSet(C67220QZs.LIZLLL);
        } else {
            singleton = Collections.singleton(new C67365QcD("proto"));
        }
        C67352Qc0 LIZ = AbstractC67354Qc2.LIZ();
        c67220QZs.getClass();
        LIZ.LIZIZ("cct");
        LIZ.LIZIZ = c67220QZs.LIZIZ();
        return new C67292Qb2(singleton, LIZ.LIZ(), this);
    }

    public C67350Qby(InterfaceC67370QcI interfaceC67370QcI, InterfaceC67370QcI interfaceC67370QcI2, InterfaceC67367QcF interfaceC67367QcF, C67380QcS c67380QcS, LFG lfg) {
        this.LIZ = interfaceC67370QcI;
        this.LIZIZ = interfaceC67370QcI2;
        this.LIZJ = interfaceC67367QcF;
        this.LIZLLL = c67380QcS;
        lfg.LIZ.execute(new ARunnableS15S0101000_11(2, lfg, 1));
    }
}
