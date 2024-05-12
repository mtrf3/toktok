package X;

import android.os.Bundle;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.QZq, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67218QZq implements InterfaceC67188QYm {
    public static volatile C67218QZq LIZIZ;
    public final V8Q LIZ;

    public C67218QZq(V8Q v8q) {
        QH7.LJIIIIZZ(v8q);
        this.LIZ = v8q;
        new ConcurrentHashMap();
    }

    @Override // X.InterfaceC67188QYm
    public final void LIZ(Object obj) {
        if (!(!C68106QoA.LIZIZ.contains("fcm"))) {
            return;
        }
        C68074Qne c68074Qne = (C68074Qne) this.LIZ.LJLIL;
        c68074Qne.getClass();
        c68074Qne.LIZIZ(new C68159Qp1(c68074Qne, "fcm", "_ln", obj, true));
    }

    @Override // X.InterfaceC67188QYm
    public final void LIZIZ(String str, Bundle bundle) {
        if (!(!C68106QoA.LIZIZ.contains("fcm")) || C68106QoA.LIZ.contains(str)) {
            return;
        }
        Iterator it = C68106QoA.LIZJ.iterator();
        while (it.hasNext()) {
            if (bundle.containsKey((String) it.next())) {
                return;
            }
        }
        if ("_cmp".equals(str)) {
            if (!(!C68106QoA.LIZIZ.contains("fcm"))) {
                return;
            }
            Iterator it2 = C68106QoA.LIZJ.iterator();
            while (it2.hasNext()) {
                if (bundle.containsKey((String) it2.next())) {
                    return;
                }
            }
            bundle.putString("_cis", "fcm_integration");
        }
        C68074Qne c68074Qne = (C68074Qne) this.LIZ.LJLIL;
        c68074Qne.getClass();
        c68074Qne.LIZIZ(new C68158Qp0(c68074Qne, "fcm", str, bundle, true));
    }
}
