package X;

import defpackage.b0;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.3M9, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3M9 extends C3MB {
    public volatile int LIZ;
    public volatile boolean LIZIZ;

    public final void LIZJ() {
        super.LIZ(null, null);
    }

    @Override // X.C3MB
    public final int LIZIZ() {
        return this.LIZ;
    }

    @Override // X.C3MB, X.InterfaceC83073Nv
    public final void LIZ(java.util.Map<String, Long> map, java.util.Map<String, Boolean> map2) {
        String str;
        C63088OpQ coreInfo;
        this.LIZIZ = true;
        if (map == null) {
            return;
        }
        this.LIZ = 0;
        for (Map.Entry entry : ((ConcurrentHashMap) map).entrySet()) {
            String str2 = (String) entry.getKey();
            long longValue = ((Number) entry.getValue()).longValue();
            C3Q9.LIZ.getClass();
            C75782yE.LIZ();
            C63120Opw LIZ = C4WC.LIZIZ.LIZ(str2);
            StringBuilder LIZ2 = X1D.LIZ();
            if (LIZ != null && (coreInfo = LIZ.getCoreInfo()) != null) {
                str = coreInfo.getName();
            } else {
                str = null;
            }
            b0.LJ(LIZ2, str, ": ", longValue);
            C34B.LJI("IConversationUnreadCountUploadObserver", X1D.LIZIZ(LIZ2));
            this.LIZ += (int) longValue;
        }
        super.LIZ(map, map2);
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("PrimaryUnreadCountObserver onUpdate: ");
        LIZ3.append(this.LIZ);
        C34B.LJI("SessionListManagerV2", X1D.LIZIZ(LIZ3));
    }
}
