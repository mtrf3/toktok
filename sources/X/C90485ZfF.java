package X;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.ZfF, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public class C90485ZfF {
    public final C90469Zez LIZ;
    public final String LIZIZ;
    public InterfaceC90480ZfA LIZJ;
    public final List<C90483ZfD> LIZLLL;

    public final long LIZIZ() {
        InterfaceC90480ZfA interfaceC90480ZfA = this.LIZJ;
        if (interfaceC90480ZfA == null) {
            this.LIZ.getClass();
            return 0L;
        }
        return ((C90647Zhr) interfaceC90480ZfA).LIZIZ.getAndIncrement();
    }

    public C90485ZfF(String str) {
        C90468Zey.LIZLLL(str);
        this.LIZIZ = str;
        this.LIZ = new C90469Zez("MediaControlChannel");
        if (!TextUtils.isEmpty(null) && !TextUtils.isEmpty(null)) {
            C16880lQ.LLLZ("[%s] ", new Object[]{null});
        }
        this.LIZLLL = Collections.synchronizedList(new ArrayList());
    }

    public final void LIZ(C90483ZfD c90483ZfD) {
        this.LIZLLL.add(c90483ZfD);
    }

    public final void LIZJ(final long j, String str) {
        InterfaceC90480ZfA interfaceC90480ZfA = this.LIZJ;
        if (interfaceC90480ZfA == null) {
            this.LIZ.getClass();
            return;
        }
        String str2 = this.LIZIZ;
        final C90647Zhr c90647Zhr = (C90647Zhr) interfaceC90480ZfA;
        InterfaceC90656Zi0 interfaceC90656Zi0 = c90647Zhr.LIZ;
        if (interfaceC90656Zi0 != null) {
            ((C90880Zlc) interfaceC90656Zi0).LJIIJJI(str2, str).LJIILLIIL(new InterfaceC67679QhH() { // from class: X.Zhp
                @Override // X.InterfaceC67679QhH
                public final void onFailure(Exception exc) {
                    int i;
                    C90647Zhr c90647Zhr2 = C90647Zhr.this;
                    long j2 = j;
                    if (exc instanceof ETK) {
                        i = ((ETK) exc).getStatusCode();
                    } else {
                        i = 13;
                    }
                    Iterator<C90483ZfD> it = c90647Zhr2.LIZJ.LIZJ.LIZLLL.iterator();
                    while (it.hasNext()) {
                        it.next().LIZIZ(j2, i, null);
                    }
                }
            });
            return;
        }
        throw new IllegalStateException("Device is not connected");
    }
}
