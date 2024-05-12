package X;

import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class QKL {
    public final Object LIZ;
    public final Object LIZIZ;

    public /* synthetic */ QKL(String monitorId) {
        o.LJIIJ(monitorId, "monitorId");
        this.LIZ = OFI.LIZIZ(monitorId);
        this.LIZIZ = OFI.LIZJ(monitorId);
    }

    public final String LIZ(String str) {
        Object obj = ((java.util.Map) this.LIZIZ).get(str);
        if (!(obj instanceof String)) {
            obj = null;
        }
        return (String) obj;
    }
}
