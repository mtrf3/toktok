package X;

import android.content.Context;
import android.os.Build;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1Rp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C33091Rp implements InterfaceC15110iZ {
    public final InterfaceC13820gU LIZ;
    public final C1UC<?>[] LIZIZ;
    public final Object LIZJ;

    static {
        C0VW.LIZIZ("WorkConstraintsTracker");
    }

    public final void LIZLLL() {
        synchronized (this.LIZJ) {
            for (C1UC<?> c1uc : this.LIZIZ) {
                if (!((ArrayList) c1uc.LIZ).isEmpty()) {
                    ((ArrayList) c1uc.LIZ).clear();
                    c1uc.LIZJ.LIZIZ(c1uc);
                }
            }
        }
    }

    public final boolean LIZ(String str) {
        synchronized (this.LIZJ) {
            for (C1UC<?> c1uc : this.LIZIZ) {
                Object obj = c1uc.LIZIZ;
                if (obj != null && c1uc.LIZJ(obj) && ((ArrayList) c1uc.LIZ).contains(str)) {
                    C0VW LIZ = C0VW.LIZ();
                    C16880lQ.LLLZ("Work %s constrained by %s", new Object[]{str, C16880lQ.LJLLJ(c1uc.getClass())});
                    LIZ.getClass();
                    return false;
                }
            }
            return true;
        }
    }

    public final void LIZIZ(List<String> list) {
        synchronized (this.LIZJ) {
            ArrayList arrayList = new ArrayList();
            Iterator it = ((ArrayList) list).iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (LIZ(str)) {
                    C0VW LIZ = C0VW.LIZ();
                    C16880lQ.LLLZ("Constraints met for %s", new Object[]{str});
                    LIZ.getClass();
                    arrayList.add(str);
                }
            }
            InterfaceC13820gU interfaceC13820gU = this.LIZ;
            if (interfaceC13820gU != null) {
                interfaceC13820gU.LJFF(arrayList);
            }
        }
    }

    public final void LIZJ(Iterable<C19380pS> iterable) {
        synchronized (this.LIZJ) {
            for (C1UC<?> c1uc : this.LIZIZ) {
                if (c1uc.LIZLLL != null) {
                    c1uc.LIZLLL = null;
                    c1uc.LJ(null, c1uc.LIZIZ);
                }
            }
            for (C1UC<?> c1uc2 : this.LIZIZ) {
                c1uc2.LIZLLL(iterable);
            }
            for (C1UC<?> c1uc3 : this.LIZIZ) {
                if (c1uc3.LIZLLL != this) {
                    c1uc3.LIZLLL = this;
                    c1uc3.LJ(this, c1uc3.LIZIZ);
                }
            }
        }
    }

    public C33091Rp(Context context, final InterfaceC23750wV interfaceC23750wV, InterfaceC13820gU interfaceC13820gU) {
        final Context LLLLL = C16880lQ.LLLLL(context);
        this.LIZ = interfaceC13820gU;
        this.LIZIZ = new C1UC[]{new C1UC<Boolean>(LLLLL, interfaceC23750wV) { // from class: X.1mY
            @Override // X.C1UC
            public final boolean LIZIZ(C19380pS c19380pS) {
                return c19380pS.LJIIIZ.LIZIZ;
            }

            @Override // X.C1UC
            public final boolean LIZJ(Boolean bool) {
                return !bool.booleanValue();
            }

            {
                super((AbstractC16850lN) C1V8.LIZ(LLLLL, interfaceC23750wV).LJLIL);
            }
        }, new C1UC<Boolean>(LLLLL, interfaceC23750wV) { // from class: X.1mZ
            @Override // X.C1UC
            public final boolean LIZIZ(C19380pS c19380pS) {
                return c19380pS.LJIIIZ.LIZLLL;
            }

            @Override // X.C1UC
            public final boolean LIZJ(Boolean bool) {
                return !bool.booleanValue();
            }

            {
                super((AbstractC16850lN) C1V8.LIZ(LLLLL, interfaceC23750wV).LJLILLLLZI);
            }
        }, new C1UC<Boolean>(LLLLL, interfaceC23750wV) { // from class: X.1me
            @Override // X.C1UC
            public final boolean LIZIZ(C19380pS c19380pS) {
                return c19380pS.LJIIIZ.LJ;
            }

            @Override // X.C1UC
            public final boolean LIZJ(Boolean bool) {
                return !bool.booleanValue();
            }

            {
                super((AbstractC16850lN) C1V8.LIZ(LLLLL, interfaceC23750wV).LJLJJI);
            }
        }, new C1UC<C13810gT>(LLLLL, interfaceC23750wV) { // from class: X.1ma
            @Override // X.C1UC
            public final boolean LIZIZ(C19380pS c19380pS) {
                if (c19380pS.LJIIIZ.LIZ == C0VX.CONNECTED) {
                    return true;
                }
                return false;
            }

            @Override // X.C1UC
            public final boolean LIZJ(C13810gT c13810gT) {
                C13810gT c13810gT2 = c13810gT;
                if (Build.VERSION.SDK_INT >= 26) {
                    if (!c13810gT2.LIZ || !c13810gT2.LIZIZ) {
                        return true;
                    }
                    return false;
                }
                return true ^ c13810gT2.LIZ;
            }

            {
                super((AbstractC16850lN) C1V8.LIZ(LLLLL, interfaceC23750wV).LJLJI);
            }
        }, new C1UC<C13810gT>(LLLLL, interfaceC23750wV) { // from class: X.1md
            @Override // X.C1UC
            public final boolean LIZIZ(C19380pS c19380pS) {
                C0VX c0vx = c19380pS.LJIIIZ.LIZ;
                if (c0vx == C0VX.UNMETERED || (Build.VERSION.SDK_INT >= 30 && c0vx == C0VX.TEMPORARILY_UNMETERED)) {
                    return true;
                }
                return false;
            }

            @Override // X.C1UC
            public final boolean LIZJ(C13810gT c13810gT) {
                C13810gT c13810gT2 = c13810gT;
                if (!c13810gT2.LIZ || c13810gT2.LIZJ) {
                    return true;
                }
                return false;
            }

            {
                super((AbstractC16850lN) C1V8.LIZ(LLLLL, interfaceC23750wV).LJLJI);
            }
        }, new C1UC<C13810gT>(LLLLL, interfaceC23750wV) { // from class: X.1mc
            static {
                C0VW.LIZIZ("NetworkNotRoamingCtrlr");
            }

            @Override // X.C1UC
            public final boolean LIZIZ(C19380pS c19380pS) {
                if (c19380pS.LJIIIZ.LIZ == C0VX.NOT_ROAMING) {
                    return true;
                }
                return false;
            }

            @Override // X.C1UC
            public final boolean LIZJ(C13810gT c13810gT) {
                C13810gT c13810gT2 = c13810gT;
                if (Build.VERSION.SDK_INT < 24) {
                    C0VW.LIZ().getClass();
                    return !c13810gT2.LIZ;
                }
                if (!c13810gT2.LIZ || !c13810gT2.LIZLLL) {
                    return true;
                }
                return false;
            }

            {
                super((AbstractC16850lN) C1V8.LIZ(LLLLL, interfaceC23750wV).LJLJI);
            }
        }, new C1UC<C13810gT>(LLLLL, interfaceC23750wV) { // from class: X.1mb
            static {
                C0VW.LIZIZ("NetworkMeteredCtrlr");
            }

            @Override // X.C1UC
            public final boolean LIZIZ(C19380pS c19380pS) {
                if (c19380pS.LJIIIZ.LIZ == C0VX.METERED) {
                    return true;
                }
                return false;
            }

            @Override // X.C1UC
            public final boolean LIZJ(C13810gT c13810gT) {
                C13810gT c13810gT2 = c13810gT;
                if (Build.VERSION.SDK_INT < 26) {
                    C0VW.LIZ().getClass();
                    return !c13810gT2.LIZ;
                }
                if (!c13810gT2.LIZ || !c13810gT2.LIZJ) {
                    return true;
                }
                return false;
            }

            {
                super((AbstractC16850lN) C1V8.LIZ(LLLLL, interfaceC23750wV).LJLJI);
            }
        }};
        this.LIZJ = new Object();
    }
}
