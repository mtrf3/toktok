package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.64Y, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C64Y implements InterfaceC1544264g {
    public final List<C64N> LIZ = new ArrayList();
    public final C1544464i LIZIZ;
    public InterfaceC1544764l LIZJ;
    public InterfaceC1545164p LIZLLL;
    public InterfaceC1544864m LJ;
    public final C1544164f LJFF;

    public C64Y() {
        C1543664a c1543664a;
        C1544464i c1544464i = new C1544464i();
        this.LIZIZ = c1544464i;
        this.LJFF = new C1544164f();
        C1543664a c1543664a2 = new C1543664a() { // from class: X.64Z
            @Override // X.C1543664a
            public final int LIZ(C64N c64n, List<? extends C64N> list) {
                int LIZ = super.LIZ(c64n, list);
                if (LIZ == -2) {
                    return LIZ;
                }
                ArrayList arrayList = (ArrayList) list;
                Iterator it = arrayList.iterator();
                int i = 0;
                while (it.hasNext()) {
                    Object next = it.next();
                    int i2 = i + 1;
                    if (i >= 0) {
                        next.getClass();
                        i = i2;
                    } else {
                        C47261Igj.LJJJJJ();
                        throw null;
                    }
                }
                return arrayList.size();
            }
        };
        C1543664a c1543664a3 = c1544464i.LIZIZ;
        if (c1543664a3 == null) {
            c1543664a = null;
        } else {
            c1543664a3.LIZ = c1543664a2;
            c1543664a = c1543664a3.LIZ;
        }
        c1544464i.LIZIZ = c1543664a;
    }

    @Override // X.InterfaceC1544264g
    public final List<C64N> LIZ() {
        return this.LIZ;
    }

    @Override // X.InterfaceC1544264g
    public final void LIZIZ(C64N c64n) {
        C1544164f c1544164f = this.LJFF;
        c1544164f.getClass();
        Iterator it = ((ArrayList) c1544164f.LIZ).iterator();
        while (it.hasNext()) {
            ((InterfaceC1545064o) it.next()).LIZ(c64n);
        }
    }

    public final void LIZJ(C64N c64n) {
        C1544464i c1544464i = this.LIZIZ;
        List<C64N> stickers = this.LIZ;
        c1544464i.getClass();
        o.LJIIIZ(stickers, "stickers");
        if (c1544464i.LIZ.LIZ(c64n, stickers) == -2) {
            InterfaceC1544764l interfaceC1544764l = this.LIZJ;
            if (interfaceC1544764l != null) {
                interfaceC1544764l.LIZ(c64n);
                return;
            }
            return;
        }
        ListProtector.add(this.LIZ, 0, c64n);
        this.LJFF.getClass();
        InterfaceC1544764l interfaceC1544764l2 = this.LIZJ;
        if (interfaceC1544764l2 == null) {
            return;
        }
        interfaceC1544764l2.LIZIZ(c64n);
    }

    public final void LIZLLL(C64K c64k) {
        this.LIZJ = c64k;
        C1544164f c1544164f = this.LJFF;
        InterfaceC1545064o interfaceC1545064o = new InterfaceC1545064o() { // from class: X.64X
            @Override // X.InterfaceC1545064o
            public final void LIZ(C64N c64n) {
                C64Y c64y = C64Y.this;
                ((ArrayList) c64y.LIZ).remove(c64n);
                InterfaceC1545164p interfaceC1545164p = c64y.LIZLLL;
                if (interfaceC1545164p != null) {
                    interfaceC1545164p.LIZ(c64n);
                }
                C64Y.this.LIZJ(c64n);
            }
        };
        c1544164f.getClass();
        ((ArrayList) c1544164f.LIZ).add(interfaceC1545064o);
    }
}
