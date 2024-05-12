package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* renamed from: X.a4H, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92037a4H {
    public static final int LIZIZ(List<? extends AbstractC39201gK> list) {
        ArrayList arrayList = (ArrayList) list;
        if (arrayList.isEmpty()) {
            return 0;
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            int i = ((AbstractC39201gK) it.next()).LJLILLLLZI;
            while (it.hasNext()) {
                int i2 = ((AbstractC39201gK) it.next()).LJLILLLLZI;
                if (i < i2) {
                    i = i2;
                }
            }
            return i;
        }
        throw new NoSuchElementException();
    }

    public static final int LIZJ(List<? extends AbstractC39201gK> list) {
        ArrayList arrayList = (ArrayList) list;
        if (arrayList.isEmpty()) {
            return 0;
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            int i = ((AbstractC39201gK) it.next()).LJLIL;
            while (it.hasNext()) {
                int i2 = ((AbstractC39201gK) it.next()).LJLIL;
                if (i < i2) {
                    i = i2;
                }
            }
            return i;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0063, code lost:
    
        if (r4 == X.C24500xi.LIZIZ) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ(X.InterfaceC07790Sh r9, X.InterfaceC88471Ynr<? super X.InterfaceC24520xk, ? super java.lang.Integer, X.C76800UCe> r10, X.InterfaceC88471Ynr<? super X.InterfaceC24520xk, ? super java.lang.Integer, X.C76800UCe> r11, X.InterfaceC88471Ynr<? super X.InterfaceC24520xk, ? super java.lang.Integer, X.C76800UCe> r12, X.InterfaceC24520xk r13, int r14, int r15) {
        /*
            Method dump skipped, instructions count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C92037a4H.LIZ(X.0Sh, X.Ynr, X.Ynr, X.Ynr, X.0xk, int, int):void");
    }
}
