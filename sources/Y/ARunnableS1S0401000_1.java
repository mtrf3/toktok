package Y;

import X.AbstractC03120Ai;
import X.C03150Al;
import X.C03200Aq;
import X.C116814iD;
import X.C76800UCe;
import X.InterfaceC65784Pro;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* loaded from: classes2.dex */
public class ARunnableS1S0401000_1 implements Runnable {
    public final int $t;
    public int i4;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        final List list = (List) this.l1;
        final List list2 = (List) this.l2;
        final C116814iD c116814iD = (C116814iD) this.l0;
        C03150Al LIZ = C03200Aq.LIZ(new AbstractC03120Ai() { // from class: X.4iG
            @Override // X.AbstractC03120Ai
            public final int LIZLLL() {
                return list2.size();
            }

            @Override // X.AbstractC03120Ai
            public final int LJ() {
                return list.size();
            }

            @Override // X.AbstractC03120Ai
            public final boolean LIZ(int i, int i2) {
                Object obj = ListProtector.get(list, i);
                Object obj2 = ListProtector.get(list2, i2);
                if (obj != null) {
                    if (obj2 != null) {
                        return c116814iD.LIZIZ.LIZ.LIZ(obj, obj2);
                    }
                } else if (obj2 == null) {
                    return true;
                }
                throw new AssertionError();
            }

            @Override // X.AbstractC03120Ai
            public final boolean LIZIZ(int i, int i2) {
                Object obj = ListProtector.get(list, i);
                Object obj2 = ListProtector.get(list2, i2);
                if (obj != null) {
                    if (obj2 != null) {
                        return c116814iD.LIZIZ.LIZ.LIZIZ(obj, obj2);
                    }
                } else if (obj2 == null) {
                    return true;
                }
                return false;
            }

            @Override // X.AbstractC03120Ai
            public final Object LIZJ(int i, int i2) {
                Object obj = ListProtector.get(list, i);
                Object obj2 = ListProtector.get(list2, i2);
                if (obj != null && obj2 != null) {
                    return c116814iD.LIZIZ.LIZ.LIZJ(obj, obj2);
                }
                throw new AssertionError();
            }
        }, true);
        C116814iD c116814iD2 = (C116814iD) this.l0;
        c116814iD2.LIZJ.execute(new ARunnableS1S0401000_1(c116814iD2, this.i4, (List) this.l2, LIZ, (InterfaceC65784Pro) this.l3, 0));
    }

    public static final void run$0(ARunnableS1S0401000_1 aRunnableS1S0401000_1) {
        boolean LIZ;
        try {
            C116814iD c116814iD = (C116814iD) aRunnableS1S0401000_1.l0;
            if (c116814iD.LIZLLL == aRunnableS1S0401000_1.i4) {
                List<? extends T> list = (List) aRunnableS1S0401000_1.l1;
                C03150Al c03150Al = (C03150Al) aRunnableS1S0401000_1.l2;
                c116814iD.LJ = list;
                c03150Al.LIZIZ(c116814iD.LIZ);
            }
            InterfaceC65784Pro interfaceC65784Pro = (InterfaceC65784Pro) aRunnableS1S0401000_1.l3;
            if (interfaceC65784Pro != null) {
                interfaceC65784Pro.invoke();
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS1S0401000_1 aRunnableS1S0401000_1) {
        boolean LIZ;
        try {
            aRunnableS1S0401000_1.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ARunnableS1S0401000_1(Object obj, C116814iD<Object> c116814iD, int i, List<Object> list, C03150Al c03150Al, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        this.$t = interfaceC65784Pro;
        this.l0 = obj;
        this.i4 = c116814iD;
        this.l1 = i;
        this.l2 = list;
        this.l3 = c03150Al;
    }
}
