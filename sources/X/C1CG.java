package X;

import java.util.Iterator;

/* renamed from: X.1CG, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C1CG<T> extends C0BI {
    public abstract void LIZLLL(InterfaceC37591dj interfaceC37591dj, T t);

    public C1CG(AbstractC03300Ba abstractC03300Ba) {
        super(abstractC03300Ba);
    }

    public final void LJ(Iterable<? extends T> iterable) {
        InterfaceC37591dj LIZ = LIZ();
        try {
            Iterator<? extends T> it = iterable.iterator();
            while (it.hasNext()) {
                LIZLLL(LIZ, it.next());
                LIZ.LJIILJJIL();
            }
        } finally {
            LIZJ(LIZ);
        }
    }

    public final void LJFF(T t) {
        InterfaceC37591dj LIZ = LIZ();
        try {
            LIZLLL(LIZ, t);
            LIZ.LJIILJJIL();
        } finally {
            LIZJ(LIZ);
        }
    }

    public final long LJI(T t) {
        InterfaceC37591dj LIZ = LIZ();
        try {
            LIZLLL(LIZ, t);
            return LIZ.LJIILJJIL();
        } finally {
            LIZJ(LIZ);
        }
    }
}
