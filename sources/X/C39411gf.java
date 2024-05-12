package X;

import X.InterfaceC277016w;
import java.util.Iterator;

/* renamed from: X.1gf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C39411gf<T extends InterfaceC277016w> extends OJM<T> implements InterfaceC277016w {
    @Override // X.InterfaceC277016w
    public final void LJII(String str) {
        Iterator<T> it = iterator();
        while (it.hasNext()) {
            InterfaceC277016w interfaceC277016w = (InterfaceC277016w) it.next();
            if (interfaceC277016w != null) {
                interfaceC277016w.LJII(str);
            }
        }
    }

    @Override // X.InterfaceC277016w
    public final void LJIIIIZZ(int i, String str) {
        Iterator<T> it = iterator();
        while (it.hasNext()) {
            InterfaceC277016w interfaceC277016w = (InterfaceC277016w) it.next();
            if (interfaceC277016w != null) {
                interfaceC277016w.LJIIIIZZ(i, str);
            }
        }
    }

    @Override // X.InterfaceC277016w
    public final void LJIILJJIL(String str, String str2) {
        Iterator<T> it = iterator();
        while (it.hasNext()) {
            InterfaceC277016w interfaceC277016w = (InterfaceC277016w) it.next();
            if (interfaceC277016w != null) {
                interfaceC277016w.LJIILJJIL(str, str2);
            }
        }
    }

    @Override // X.InterfaceC277016w
    public final void LJIIIZ(int i, int i2, String str) {
        Iterator<T> it = iterator();
        while (it.hasNext()) {
            InterfaceC277016w interfaceC277016w = (InterfaceC277016w) it.next();
            if (interfaceC277016w != null) {
                interfaceC277016w.LJIIIZ(i, i2, str);
            }
        }
    }
}
