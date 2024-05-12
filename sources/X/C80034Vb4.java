package X;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Vb4, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80034Vb4 {
    public static final EnumC79963VZv LJ;
    public static final InterfaceC80039Vb9 LJFF;
    public InterfaceC79968Va0 LIZ;
    public EnumC79963VZv LIZIZ;
    public InterfaceC80039Vb9 LIZJ;
    public final InterfaceC80038Vb8 LIZLLL;

    static {
        EnumC79963VZv enumC79963VZv = EnumC79963VZv.SEQUENCE;
        LJ = enumC79963VZv;
        LJFF = C80035Vb5.LIZ(enumC79963VZv);
    }

    public C80034Vb4(C80046VbG mListener) {
        o.LJIIJ(mListener, "mListener");
        this.LIZLLL = mListener;
        this.LIZIZ = LJ;
        this.LIZJ = LJFF;
    }

    public final void LIZ(V1L v1l) {
        String str;
        InterfaceC79968Va0 interfaceC79968Va0 = this.LIZ;
        if (interfaceC79968Va0 != null) {
            int i = -1;
            List<V1L> LIZIZ = interfaceC79968Va0.LIZIZ();
            if (LIZIZ != null) {
                Iterator<V1L> it = LIZIZ.iterator();
                int i2 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    String id = it.next().getId();
                    if (v1l != null) {
                        str = v1l.getId();
                    } else {
                        str = null;
                    }
                    if (o.LJ(id, str)) {
                        i = i2;
                        break;
                    }
                    i2++;
                }
            }
            interfaceC79968Va0.LIZ(i);
        }
        this.LIZLLL.LJIILIIL(v1l);
    }
}
