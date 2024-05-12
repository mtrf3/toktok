package X;

import X.AbstractC20690rZ;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.IDqS15S1100000;
import kotlin.jvm.internal.IDqS172S0200000;
import kotlin.jvm.internal.IDqS416S0100000;
import kotlin.jvm.internal.o;

/* renamed from: X.0rb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C20710rb<T extends AbstractC20690rZ> {
    public final ThreadLocal<C20700ra<T>> LIZ = new ThreadLocal<>();

    /* JADX WARN: Multi-variable type inference failed */
    public final String LIZIZ(IDqS416S0100000 iDqS416S0100000) {
        C20700ra<T> c20700ra = this.LIZ.get();
        if (c20700ra != null) {
            C68322mC c68322mC = new C68322mC();
            c20700ra.LIZ(new IDqS172S0200000(new C76732zl(), c68322mC, 73));
            AbstractC20690rZ abstractC20690rZ = (AbstractC20690rZ) c68322mC.element;
            if (abstractC20690rZ == null) {
                abstractC20690rZ = (AbstractC20690rZ) iDqS416S0100000.invoke(null);
                if (abstractC20690rZ == null) {
                    return "error";
                }
                LIZLLL(abstractC20690rZ);
            } else {
                iDqS416S0100000.invoke(abstractC20690rZ);
            }
            String LIZIZ = abstractC20690rZ.LIZIZ();
            if (LIZIZ == null) {
                return "error";
            }
            return LIZIZ;
        }
        AbstractC20690rZ abstractC20690rZ2 = (AbstractC20690rZ) iDqS416S0100000.invoke(null);
        if (abstractC20690rZ2 == null) {
            return "error";
        }
        LIZLLL(abstractC20690rZ2);
        String LIZIZ2 = abstractC20690rZ2.LIZIZ();
        if (LIZIZ2 == null) {
            return "error";
        }
        return LIZIZ2;
    }

    public final void LIZJ(ArrayList<T> arrayList) {
        if (this.LIZ.get() == null) {
            Iterator<T> it = arrayList.iterator();
            while (it.hasNext()) {
                T session = it.next();
                o.LJIIIIZZ(session, "session");
                LIZLLL(session);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0026, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L8;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(X.AbstractC20690rZ r6) {
        /*
            r5 = this;
            java.lang.ThreadLocal<X.0ra<T extends X.0rZ>> r0 = r5.LIZ
            java.lang.Object r4 = r0.get()
            X.0ra r4 = (X.C20700ra) r4
            if (r4 == 0) goto L28
            X.2mC r3 = new X.2mC
            r3.<init>()
            X.2zl r2 = new X.2zl
            r2.<init>()
            kotlin.jvm.internal.IDqS172S0200000 r1 = new kotlin.jvm.internal.IDqS172S0200000
            r0 = 72
            r1.<init>(r2, r3, r0)
            r4.LIZ(r1)
            T r1 = r3.element
            X.0ra r1 = (X.C20700ra) r1
            if (r1 != 0) goto L36
        L24:
            X.UCe r0 = X.C76800UCe.LIZ
            if (r0 != 0) goto L32
        L28:
            java.lang.ThreadLocal<X.0ra<T extends X.0rZ>> r1 = r5.LIZ
            X.0ra r0 = new X.0ra
            r0.<init>(r6)
            r1.set(r0)
        L32:
            r6.LIZIZ()
            return
        L36:
            X.0ra r0 = new X.0ra
            r0.<init>(r6)
            r1.LIZIZ = r0
            goto L24
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20710rb.LIZLLL(X.0rZ):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZ(String key, IDqS416S0100000 iDqS416S0100000) {
        o.LJIIIZ(key, "key");
        C20700ra<T> c20700ra = this.LIZ.get();
        if (c20700ra != null) {
            C68322mC c68322mC = new C68322mC();
            c20700ra.LIZ(new IDqS15S1100000(key, (String) c68322mC, (C68322mC<C20700ra<AbstractC20690rZ>>) 3));
            C20700ra c20700ra2 = (C20700ra) c68322mC.element;
            if (c20700ra2 == null) {
                return;
            }
            T t = c20700ra2.LIZ;
            iDqS416S0100000.invoke(t);
            t.LIZ();
        }
    }
}
