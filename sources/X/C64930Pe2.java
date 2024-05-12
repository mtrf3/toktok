package X;

import com.bytedance.retrofit2.RequestBuilder;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Pe2, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64930Pe2<T> extends AbstractC64937Pe9<List<T>> {
    public final InterfaceC65016PfQ<T, EJ6> LIZ;

    public C64930Pe2(InterfaceC65016PfQ<T, EJ6> interfaceC65016PfQ) {
        this.LIZ = interfaceC65016PfQ;
    }

    @Override // X.AbstractC64937Pe9
    public final void LIZ(RequestBuilder requestBuilder, Object obj) {
        List list = (List) obj;
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            EJ6 ej6 = (EJ6) this.LIZ.LIZ(it.next());
            requestBuilder.LIZ(ej6.LIZ, ej6.LIZIZ);
        }
    }
}
