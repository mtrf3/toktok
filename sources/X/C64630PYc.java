package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import okhttp3.Request;

/* renamed from: X.PYc, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64630PYc extends C64632PYe<C64598PWw> {
    public final /* synthetic */ C64631PYd LIZIZ;

    @Override // X.InterfaceC64633PYf
    public final Object LIZ() {
        this.LIZIZ.LJ.request().url().getClass();
        PXZ pxz = this.LIZIZ.LJ;
        Request request = pxz.request();
        String valueOf = String.valueOf(System.currentTimeMillis());
        C64626PXy url = request.url();
        C64618PXq newBuilder = request.newBuilder();
        newBuilder.LJIIIIZZ(url);
        C64550PVa c64550PVa = (C64550PVa) request.body();
        if (c64550PVa != null && c64550PVa.LIZ.size() > 0) {
            C64629PYb c64629PYb = new C64629PYb();
            for (int i = 0; i < c64550PVa.LIZ.size(); i++) {
                if (TextUtils.equals(c64550PVa.LJFF(i), "_rticket")) {
                    c64629PYb.LIZIZ(c64550PVa.LJFF(i), valueOf);
                } else {
                    c64629PYb.LIZIZ(c64550PVa.LJFF(i), (String) ListProtector.get(c64550PVa.LIZIZ, i));
                }
            }
            newBuilder.LJ(request.method(), new C64550PVa(c64629PYb.LIZ, c64629PYb.LIZIZ));
        }
        return pxz.LIZ(newBuilder.LIZIZ());
    }

    @Override // X.InterfaceC64633PYf
    public final Object LIZIZ() {
        return this.LIZIZ.LJFF;
    }

    public C64630PYc(C64631PYd c64631PYd) {
        this.LIZIZ = c64631PYd;
    }
}
