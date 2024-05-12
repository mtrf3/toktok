package X;

import java.util.HashMap;
import kotlin.jvm.internal.IDqS416S0100000;
import kotlin.jvm.internal.o;

/* renamed from: X.0Co, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC03700Co {
    public final InterfaceC40441iK LIZ;
    public boolean LIZJ;
    public boolean LIZLLL;
    public boolean LJ;
    public boolean LJFF;
    public boolean LJI;
    public InterfaceC40441iK LJII;
    public boolean LIZIZ = true;
    public final java.util.Map<AbstractC272415c, Integer> LJIIIIZZ = new HashMap();

    public abstract long LIZIZ(AbstractC538029g abstractC538029g, long j);

    public abstract java.util.Map<AbstractC272415c, Integer> LIZJ(AbstractC538029g abstractC538029g);

    public abstract int LIZLLL(AbstractC538029g abstractC538029g, AbstractC272415c abstractC272415c);

    public final void LJI() {
        this.LIZIZ = true;
        InterfaceC40441iK LJJLIIIJJIZ = this.LIZ.LJJLIIIJJIZ();
        if (LJJLIIIJJIZ == null) {
            return;
        }
        if (this.LIZJ) {
            LJJLIIIJJIZ.LJJLIIIJ();
        } else if (this.LJ || this.LIZLLL) {
            LJJLIIIJJIZ.requestLayout();
        }
        if (this.LJFF) {
            this.LIZ.LJJLIIIJ();
        }
        if (this.LJI) {
            LJJLIIIJJIZ.requestLayout();
        }
        LJJLIIIJJIZ.LJI().LJI();
    }

    public final boolean LJ() {
        if (this.LIZJ || this.LJ || this.LJFF || this.LJI) {
            return true;
        }
        return false;
    }

    public final void LJII() {
        ((HashMap) this.LJIIIIZZ).clear();
        this.LIZ.LJJIIZ(new IDqS416S0100000(this, 10));
        ((HashMap) this.LJIIIIZZ).putAll(LIZJ(this.LIZ.LJJIZ()));
        this.LIZIZ = false;
    }

    public final boolean LJFF() {
        LJIIIIZZ();
        if (this.LJII != null) {
            return true;
        }
        return false;
    }

    public final void LJIIIIZZ() {
        InterfaceC40441iK interfaceC40441iK;
        AbstractC03700Co LJI;
        AbstractC03700Co LJI2;
        if (LJ()) {
            interfaceC40441iK = this.LIZ;
        } else {
            InterfaceC40441iK LJJLIIIJJIZ = this.LIZ.LJJLIIIJJIZ();
            if (LJJLIIIJJIZ == null) {
                return;
            }
            interfaceC40441iK = LJJLIIIJJIZ.LJI().LJII;
            if (interfaceC40441iK == null || !interfaceC40441iK.LJI().LJ()) {
                InterfaceC40441iK interfaceC40441iK2 = this.LJII;
                if (interfaceC40441iK2 == null || interfaceC40441iK2.LJI().LJ()) {
                    return;
                }
                InterfaceC40441iK LJJLIIIJJIZ2 = interfaceC40441iK2.LJJLIIIJJIZ();
                if (LJJLIIIJJIZ2 != null && (LJI2 = LJJLIIIJJIZ2.LJI()) != null) {
                    LJI2.LJIIIIZZ();
                }
                InterfaceC40441iK LJJLIIIJJIZ3 = interfaceC40441iK2.LJJLIIIJJIZ();
                if (LJJLIIIJJIZ3 != null && (LJI = LJJLIIIJJIZ3.LJI()) != null) {
                    interfaceC40441iK = LJI.LJII;
                } else {
                    interfaceC40441iK = null;
                }
            }
        }
        this.LJII = interfaceC40441iK;
    }

    public AbstractC03700Co(InterfaceC40441iK interfaceC40441iK) {
        this.LIZ = interfaceC40441iK;
    }

    public static final void LIZ(AbstractC03700Co abstractC03700Co, AbstractC272415c abstractC272415c, int i, AbstractC538029g abstractC538029g) {
        int LJJIIZ;
        abstractC03700Co.getClass();
        float f = i;
        long LIZ = C78923UyF.LIZ(f, f);
        while (true) {
            LIZ = abstractC03700Co.LIZIZ(abstractC538029g, LIZ);
            abstractC538029g = abstractC538029g.LJLJLLL;
            o.LJI(abstractC538029g);
            if (o.LJ(abstractC538029g, abstractC03700Co.LIZ.LJJIZ())) {
                break;
            } else if (abstractC03700Co.LIZJ(abstractC538029g).containsKey(abstractC272415c)) {
                float LIZLLL = abstractC03700Co.LIZLLL(abstractC538029g, abstractC272415c);
                LIZ = C78923UyF.LIZ(LIZLLL, LIZLLL);
            }
        }
        if (abstractC272415c instanceof C39161gG) {
            LJJIIZ = O6R.LJJIIZ(C10370av.LJ(LIZ));
        } else {
            LJJIIZ = O6R.LJJIIZ(C10370av.LIZLLL(LIZ));
        }
        HashMap hashMap = (HashMap) abstractC03700Co.LJIIIIZZ;
        if (hashMap.containsKey(abstractC272415c)) {
            int intValue = ((Number) C113554cx.LJJJLL(abstractC272415c, abstractC03700Co.LJIIIIZZ)).intValue();
            o.LJIIIZ(abstractC272415c, "<this>");
            LJJIIZ = abstractC272415c.LIZ.invoke(Integer.valueOf(intValue), Integer.valueOf(LJJIIZ)).intValue();
        }
        hashMap.put(abstractC272415c, Integer.valueOf(LJJIIZ));
    }
}
