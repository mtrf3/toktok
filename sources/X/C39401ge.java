package X;

import X.InterfaceC276916v;
import java.util.Iterator;

/* renamed from: X.1ge, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C39401ge<T extends InterfaceC276916v> extends OJM<T> implements InterfaceC276916v {
    @Override // X.InterfaceC276916v
    public final void LJIILLIIL(int i) {
        Iterator<T> it = iterator();
        while (it.hasNext()) {
            InterfaceC276916v interfaceC276916v = (InterfaceC276916v) it.next();
            if (interfaceC276916v != null) {
                interfaceC276916v.LJIILLIIL(i);
            }
        }
    }

    @Override // X.InterfaceC276916v
    public final void LIZJ(int i, String str) {
        Iterator<T> it = iterator();
        while (it.hasNext()) {
            InterfaceC276916v interfaceC276916v = (InterfaceC276916v) it.next();
            if (interfaceC276916v != null) {
                interfaceC276916v.LIZJ(i, str);
            }
        }
    }

    @Override // X.InterfaceC276916v
    public final void LJFF(int i, String str) {
        Iterator<T> it = iterator();
        while (it.hasNext()) {
            InterfaceC276916v interfaceC276916v = (InterfaceC276916v) it.next();
            if (interfaceC276916v != null) {
                interfaceC276916v.LJFF(i, str);
            }
        }
    }

    @Override // X.InterfaceC276916v
    public final void LJIIJ(int i, String str) {
        Iterator<T> it = iterator();
        while (it.hasNext()) {
            InterfaceC276916v interfaceC276916v = (InterfaceC276916v) it.next();
            if (interfaceC276916v != null) {
                interfaceC276916v.LJIIJ(i, str);
            }
        }
    }
}
