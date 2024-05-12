package X;

import java.util.Iterator;
import java.util.Map;

/* renamed from: X.PtH, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65875PtH implements InterfaceC87176YJg {
    @Override // X.InterfaceC87176YJg
    public final void LIZIZ() {
        throw new NoSuchMethodError();
    }

    @Override // X.InterfaceC87176YJg
    public final void LIZ(Object obj) {
        C65874PtG c65874PtG = (C65874PtG) obj;
        if (c65874PtG.isEmpty()) {
            return;
        }
        Iterator it = c65874PtG.entrySet().iterator();
        if (!it.hasNext()) {
            return;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw new NoSuchMethodError();
    }

    @Override // X.InterfaceC87176YJg
    public final Object LIZLLL(Object obj) {
        ((C65874PtG) obj).zzara();
        return obj;
    }

    @Override // X.InterfaceC87176YJg
    public final C65874PtG LJ(Object obj) {
        return (C65874PtG) obj;
    }

    @Override // X.InterfaceC87176YJg
    public final C65874PtG LIZJ(Object obj, Object obj2) {
        C65874PtG c65874PtG = (C65874PtG) obj;
        C65874PtG c65874PtG2 = (C65874PtG) obj2;
        if (!c65874PtG2.isEmpty()) {
            if (!c65874PtG.isMutable()) {
                c65874PtG = c65874PtG.zzaul();
            }
            c65874PtG.zza(c65874PtG2);
        }
        return c65874PtG;
    }
}
