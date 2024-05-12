package X;

import android.content.Context;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Nn3, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60393Nn3 extends C60398Nn8 {
    public final ConcurrentHashMap<Class<?>, C60396Nn6<?>> LIZ;
    public Context LIZIZ;
    public C60400NnA LIZJ;
    public C60400NnA LIZLLL;

    @Override // X.InterfaceC60397Nn7
    public final void release() {
        Collection<C60396Nn6<?>> values = this.LIZ.values();
        o.LJFF(values, "sessionContextMap.values");
        Iterator<C60396Nn6<?>> it = values.iterator();
        while (it.hasNext()) {
            it.next().getClass();
        }
        this.LIZ.clear();
    }

    public C60393Nn3(String sessionId) {
        o.LJIIJ(sessionId, "sessionId");
        this.LIZ = new ConcurrentHashMap<>();
    }
}
