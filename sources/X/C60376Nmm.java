package X;

import android.app.Application;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS16S0200100_10;
import kotlin.jvm.internal.o;

/* renamed from: X.Nmm, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60376Nmm extends C60379Nmp implements InterfaceC38945FQf {
    public C60376Nmm(Application application) {
        o.LJIIJ(application, "application");
    }

    @Override // X.InterfaceC38945FQf
    public final boolean LJIIJ(String containerId, C1JD config) {
        List<InterfaceC60381Nmr> LJIIIZ;
        o.LJIIJ(containerId, "containerId");
        o.LJIIJ(config, "config");
        long currentTimeMillis = System.currentTimeMillis();
        C34K c34k = new C34K();
        c34k.element = false;
        if (containerId.length() == 0) {
            C60237NkX.LIZIZ(this.LJLIL, null, "unknown", "fail", "container id is empty", System.currentTimeMillis() - currentTimeMillis, 134);
            return false;
        }
        AqS16S0200100_10 aqS16S0200100_10 = new AqS16S0200100_10(this, currentTimeMillis, c34k, 0);
        Iterator it = ORZ.LLIILII(((C60380Nmq) C60380Nmq.LIZJ.getValue()).LIZ).iterator();
        while (true) {
            if (it.hasNext()) {
                InterfaceC60381Nmr interfaceC60381Nmr = (InterfaceC60381Nmr) it.next();
                if (o.LJ(interfaceC60381Nmr.zk(), containerId)) {
                    aqS16S0200100_10.invoke(interfaceC60381Nmr);
                    interfaceC60381Nmr.close();
                    break;
                }
            } else {
                aqS16S0200100_10.invoke(null);
                break;
            }
        }
        AqS16S0200100_10 aqS16S0200100_102 = new AqS16S0200100_10(this, currentTimeMillis, c34k, 1);
        InterfaceC60385Nmv interfaceC60385Nmv = (InterfaceC60385Nmv) getService(InterfaceC60385Nmv.class);
        if (interfaceC60385Nmv != null && (LJIIIZ = interfaceC60385Nmv.LJIIIZ()) != null) {
            for (InterfaceC60381Nmr interfaceC60381Nmr2 : LJIIIZ) {
                if (o.LJ(interfaceC60381Nmr2.zk(), containerId)) {
                    aqS16S0200100_102.invoke(interfaceC60381Nmr2);
                    interfaceC60381Nmr2.close();
                    break;
                }
            }
        }
        aqS16S0200100_102.invoke(null);
        if (!c34k.element) {
            C60237NkX.LIZIZ(this.LJLIL, null, "unknown", "fail", "container not found", System.currentTimeMillis() - currentTimeMillis, 134);
        }
        return c34k.element;
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b6 A[ADDED_TO_REGION] */
    @Override // X.InterfaceC38945FQf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJIJJ(android.content.Context r26, android.net.Uri r27, X.C124254uD r28) {
        /*
            Method dump skipped, instructions count: 658
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60376Nmm.LJIJJ(android.content.Context, android.net.Uri, X.4uD):boolean");
    }
}
