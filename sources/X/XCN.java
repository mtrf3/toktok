package X;

import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class XCN {
    public final C40601ia<String, XDR<?>> LIZ = new C40601ia<>(true);

    public final <T> XDR<T> LIZ(String taskId) {
        o.LJIIJ(taskId, "taskId");
        Object obj = this.LIZ.get(taskId);
        if (!(obj instanceof XDR)) {
            obj = null;
        }
        XDR<T> xdr = (XDR) obj;
        if (xdr == null) {
            return null;
        }
        return xdr;
    }

    public final void LIZJ(String taskId) {
        o.LJIIJ(taskId, "taskId");
        this.LIZ.remove(taskId);
    }

    public final <T> void LIZIZ(String taskId, XDR<T> listener) {
        o.LJIIJ(taskId, "taskId");
        o.LJIIJ(listener, "listener");
        this.LIZ.put(taskId, listener);
    }
}
