package X;

import java.util.Iterator;

/* renamed from: X.1CF, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C1CF<T> extends C0BI {
    public abstract void LIZLLL(InterfaceC37591dj interfaceC37591dj, T t);

    public C1CF(AbstractC03300Ba abstractC03300Ba) {
        super(abstractC03300Ba);
    }

    public final int LJ(T t) {
        InterfaceC37591dj LIZ = LIZ();
        try {
            LIZLLL(LIZ, t);
            return LIZ.LJIJJLI();
        } finally {
            LIZJ(LIZ);
        }
    }

    public final int LJFF(Iterable<? extends T> iterable) {
        InterfaceC37591dj LIZ = LIZ();
        try {
            Iterator<? extends T> it = iterable.iterator();
            int i = 0;
            while (it.hasNext()) {
                LIZLLL(LIZ, it.next());
                i += LIZ.LJIJJLI();
            }
            return i;
        } finally {
            LIZJ(LIZ);
        }
    }
}
